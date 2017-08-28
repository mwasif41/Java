
public class Student {
	private int id;
	private String name;
	private int rollno;
	private String email;
	private String dept;
	
//	Student(){
//		
//	}
	
	Student(String n,int r,String  e,String d){
		name=n;
		rollno=r;
		email=e;
		dept=d;
	}
	public void setId(int i){
		id=i;
	}
	public void setName(String n){
		name=n;
	}
	public void setRollNo(int r){
		rollno=r;
	}
	public void setEmail(String e){
		email=e;
	}
	public void setDept(String d){
		dept=d;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public String getDept(){
		return dept;
	}
	public int getRollNo(){
		return rollno;
	}
}
