package Model;

public class SinhVien  {
private int id;
private String name;
private String adress;
private boolean sex;
private String email;
private String phone;
private String majorGroup;
private double totalgrade;
private String date;
private String classGroup;
private static int COUNT=200;

public SinhVien( String name, String adress, boolean sex, String email, String phone, String majorGroup,
		double totalgrade, String classGroup,String date) {
    this.id=COUNT+1;
    COUNT++;
	this.name = name;
	this.adress = adress;
	this.sex = sex;
	this.email = email; 
	this.phone = phone;
	this.majorGroup = majorGroup;
	this.totalgrade = totalgrade;
	this.classGroup = classGroup;
	this.date=date;
}
public SinhVien(int id, String name, String adress, boolean sex, String email, String phone, String majorGroup,
		double totalgrade, String classGroup,String date) {
    this.id=id;
	this.name = name;
	this.adress = adress;
	this.sex = sex;
	this.email = email;
	this.phone = phone;
	this.majorGroup = majorGroup;
	this.totalgrade = totalgrade;
	this.classGroup = classGroup;
	this.date=date;
}



public int getId() {
	return id;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public boolean isSex() {
	return sex;
}

public void setSex(boolean sex) {
	this.sex = sex;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getMajorGroup() {
	return majorGroup;
}

public void setmajorGroup(String majorgroup) {
	this.majorGroup = majorgroup;
}



public double getTotalgrade() {
	return totalgrade;
}
public void setTotalgrade(double totalgrade) {
	this.totalgrade = totalgrade;
}
public String getClassGroup() {
	return classGroup;
}

public void setLop(String classGroup) {
	this.classGroup = classGroup;
}


public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}




}
