package Controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import Model.SinhVien;
import Model.ClassGroup;
import Model.AdressGroup;
import Model.MajorGroup;
public class ManagerSV {
private static ArrayList<SinhVien> aList;
private final static String FILE_PATH="F:\\testout.txt";

public static ArrayList<SinhVien> getSinhVienData(){
	
	File f = new File(FILE_PATH);
	if (f.exists() && !f.isDirectory()) { 
	//	System.out.println("AGAIN");
		aList= Unity.readFromFile(FILE_PATH);
		return aList;
	} 
	else {
		try {
			f.createNewFile();
	aList=new ArrayList<>(); 
	
	aList.add(new SinhVien("Nguyễn Văn Anh", AdressGroup.Adress18, false, "dtanh@fpt.edu.vn", "098827899", MajorGroup.Major2, 8, ClassGroup.GCH1009,"2/5/1999"));
	aList.add(new SinhVien("Đặng Thị Ngọc Anh", AdressGroup.Adress19, true, "bdsz@fpt.edu.vn", "098827899", MajorGroup.Major4, 7, ClassGroup.GCH1004,"3/6/2001"));
	aList.add(new SinhVien("Phạm Khánh Linh", AdressGroup.Adress20, false, "pkl@fpt.edu.vn", "098827899", MajorGroup.Major5, 6,ClassGroup.GCH1004,"4/2/2002"));
	aList.add(new SinhVien("Nguyễn Đức Minh", AdressGroup.Adress21, true, "ndm@fpt.edu.vn", "098827899", MajorGroup.Major8, 6, ClassGroup.GCH1005,"5/8/2000"));
	aList.add(new SinhVien("Nguyễn Minh Đại", AdressGroup.Adress50, false, "nmd@fpt.edu.vn", "098827899", MajorGroup.Major1, 8, ClassGroup.GCH1006,"6/6/2002"));
	aList.add(new SinhVien("Lê Thị Thu Ngân", AdressGroup.Adress30, false, "lttn@fpt.edu.vn", "098827899", MajorGroup.Major3, 6, ClassGroup.GCH1008,"8/12/2002"));
	aList.add(new SinhVien("Vũ Tiến Đạt", AdressGroup.Adress31, false, "vtd@fpt.edu.vn", "098827899", MajorGroup.Major4, 5, ClassGroup.GCH1009,"9/11/2001"));
	aList.add(new SinhVien("Nguyễn Văn Đức", AdressGroup.Adress32, true, "nvd@fpt.edu.vn", "098827899", MajorGroup.Major5, 4, ClassGroup.GCH1010,"10/10/2003"));
	aList.add(new SinhVien("Nguyễn Minh Tâm", AdressGroup.Adress33, false, "nmt@fpt.edu.vn", "098827899",MajorGroup.Major6, 3, ClassGroup.GCH1011,"11/15/2004"));
	aList.add(new SinhVien("Trần Minh Thật", AdressGroup.Adress34, false, "tmt@fpt.edu.vn", "098827899",MajorGroup.Major7, 1, ClassGroup.GCH1012,"15/12/2002"));
	aList.add(new SinhVien("Trần Minh Khang", AdressGroup.Adress35, true, "tmk@fpt.edu.vn", "098827899", MajorGroup.Major8, 2, ClassGroup.GCH1011,"20/8/2001"));
	aList.add(new SinhVien("Lê Hải Yến", AdressGroup.Adress36, false, "lhy@fpt.edu.vn", "098827899", MajorGroup.Major9, 6.5, ClassGroup.GCH1006,"22/5/2002"));
	aList.add(new SinhVien("Trần Quang Thanh", AdressGroup.Adress37, true, "tqt@fpt.edu.vn", "098827899", MajorGroup.Major9, 5.5, ClassGroup.GCH1008,"21/9/2000"));
	aList.add(new SinhVien("Đàm Minh Hiếu", AdressGroup.Adress38, false, "dmh@fpt.edu.vn", "098827899", MajorGroup.Major1, 7, ClassGroup.GCH1007,"28/8/2001"));
	aList.add(new SinhVien("Ngô Đức Trung", AdressGroup.Adress39, false, "ndt@fpt.edu.vn", "098827899", MajorGroup.Major1, 8, ClassGroup.GCH1009,"5/7/1998"));
	aList.add(new SinhVien("Nguyễn Hoàng Tiến", AdressGroup.Adress40, true, "nht@fpt.edu.vn", "098827899", MajorGroup.Major8, 8.5, ClassGroup.GCH1005,"8/6/1997"));
	aList.add(new SinhVien("Nguyễn Thị Lan", AdressGroup.Adress1, false, "ntl@fpt.edu.vn", "098827899", MajorGroup.Major5, 9, ClassGroup.GCH1006,"9/4/2000"));
	aList.add(new SinhVien("Nguyễn Thị Ngọc", AdressGroup.Adress2, true, "ntn@fpt.edu.vn", "098827899", MajorGroup.Major3, 5.5, ClassGroup.GCH1010,"18/3/2001"));
	aList.add(new SinhVien("Trần Văn Thành", AdressGroup.Adress3, false, "tvt@fpt.edu.vn", "098827899", MajorGroup.Major4, 6.5, ClassGroup.GCH1012,"6/2/2002"));
	aList.add(new SinhVien("Đinh Văn Ngô", AdressGroup.Adress4, false, "dvn@fpt.edu.vn", "098827899", MajorGroup.Major2, 7.5, ClassGroup.GCH1007,"14/1/2002"));
	aList.add(new SinhVien("Vũ Hoàng Tiến", AdressGroup.Adress1, true, "vht@fpt.edu.vn", "098827899", MajorGroup.Major6, 8.5, ClassGroup.GCH1006,"12/10/2002"));
	aList.add(new SinhVien("Trần Văn Mạnh", AdressGroup.Adress17, false, "tvm@fpt.edu.vn", "098827899", MajorGroup.Major5, 6.5, ClassGroup.GCH1004,"5/10/2001"));
	aList.add(new SinhVien("Nguyễn Quanh Hải", AdressGroup.Adress11, true, "nqh@fpt.edu.vn", "098827899", MajorGroup.Major4, 8, ClassGroup.GCH1003,"7/9/2003"));
	aList.add(new SinhVien("Nguyễn Xuân Trường", AdressGroup.Adress18, false, "nxt@fpt.edu.vn", "098827899", MajorGroup.Major7, 9, ClassGroup.GCH1002,"9/8/2001"));
	aList.add(new SinhVien("Nguyễn Văn Toàn", AdressGroup.Adress19, true, "nvtoan@fpt.edu.vn", "098827899", MajorGroup.Major8, 7, ClassGroup.GCH1001,"12/6/2002"));
	
	   Unity.saveToFile(FILE_PATH, aList);
	   return aList;
       } catch (IOException e) {
	 System.err.println("Error in creating file");
	 return null;
     }
  }

 }
public static void updateList(SinhVien sv, int selectedRow) {
	aList.get(selectedRow).setName(sv.getName());
	aList.get(selectedRow).setDate(sv.getDate());
	aList.get(selectedRow).setLop(sv.getClassGroup());
	aList.get(selectedRow).setSex(sv.isSex());
	aList.get(selectedRow).setAdress(sv.getAdress());
	aList.get(selectedRow).setEmail(sv.getEmail());
	aList.get(selectedRow).setPhone(sv.getPhone());
	aList.get(selectedRow).setmajorGroup(sv.getMajorGroup());
	aList.get(selectedRow).setTotalgrade(sv.getTotalgrade());
	
    Unity.saveToFile(FILE_PATH, aList);

		}



public static void Delete(SinhVien sv, int selectedRow) {
	Unity.saveToFile(FILE_PATH, aList);
 }

public static void addList(SinhVien sv) {
	Unity.saveToFile(FILE_PATH, sv);
	
}

public static void deleteTofile(ArrayList<SinhVien> aList2) {
	Unity.saveToFile(FILE_PATH, aList);
}

}
	
  

