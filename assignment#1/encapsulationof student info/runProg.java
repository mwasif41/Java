public class runProg{

	public static void main(String args[]){
	studentInfo student = new studentInfo();
	student.setName("wasif");
	student.setAge(22);
	student.setRollNo(41);
	student.setEmail("mwasif@nisum.com");
	System.out.println("Name : " + student.getName() + "\nAge :" + student.getAge() + "\nRollno :" + student.getRollNo() + "\nEmail :" + student.getEmail());
	}

}