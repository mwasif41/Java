
public class testAbstraaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setAge(12);
		e.setName("Wasif");
		e.setSalary(55000);
		e.life();
		System.out.print("The employee info is: " + "Name:" + e.getName() + " Age :" + e.getAge() + " Salary: ");
		System.out.print(e.getSalary());
	}

}
abstract class person{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	abstract void life();
}
class Employee extends person{
	private double salary;
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public void life(){
		System.out.println("this is the life of emplyoee");
	}
}
