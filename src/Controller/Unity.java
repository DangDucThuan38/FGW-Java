package Controller;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import Model.SinhVien;

public class Unity {
 public static  void saveToFile(String path, ArrayList<SinhVien> aList) {
	 try( BufferedWriter buffer = new BufferedWriter(new FileWriter(path))) {
         for (SinhVien sv : aList) {
        		buffer.write(sv.getId()+"#"+sv.getName()+"#"+sv.getClassGroup()+"#"+sv.getAdress()+"#"+sv.isSex()+"#"+sv.getDate()+"#"+sv.getTotalgrade()+"#"+
   			         sv.getEmail()+"#"+sv.getMajorGroup()+"#"+sv.getPhone()+"\n");
		} 
	 }catch(Exception ex) {
		 System.err.println("Error in saving file");
	 }
	}
 
 public static void saveToFile(String path, SinhVien sv) {
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(path, true))) {
			buffer.write(sv.getId()+"#"+sv.getName()+"#"+sv.getClassGroup()+"#"+sv.getAdress()+"#"+sv.isSex()+"#"+sv.getDate()+"#"+sv.getTotalgrade()+"#"+
  			         sv.getEmail()+"#"+sv.getMajorGroup()+"#"+sv.getPhone()+"\n");
		} catch (Exception ex) {
			System.err.println("Error in saving file");
		}
	}

	public static ArrayList<SinhVien> readFromFile(String path) {
		try(BufferedReader buffer =  new BufferedReader(new FileReader(path))) {
		ArrayList<SinhVien> aList = new ArrayList<SinhVien>();
		String stringInFile = null;
		while ((stringInFile = buffer.readLine()) != null) {
			String[] words = stringInFile.split("#");
			String name = words[1];
            String classGroup = words[2];
            String address = words[3];
            boolean sex = Boolean.parseBoolean(words[4]);
			String date = words[5];
			double toatlgrade=Double.parseDouble(words[6]);
			String email = words[7];
			String majorGroup = words[8];
			String phone= words[9];
			aList.add(new SinhVien( name, address, sex, email, phone, majorGroup, toatlgrade, classGroup, date));
			}
		return aList;
		}catch(Exception ex) { 
		System.err.println("Error in reading file");
			return null;
		}
 
  }
}
