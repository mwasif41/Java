
public class testingCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		s1.id =1;
		s1.name = "wasif";
		student s2 = new student();
		s2.id =2;
		s2.name = "wasif";
		
		String name1 = "wasif";
		String name2 = "waleed";
		String name3 = "junaid";
		String name4 = new String("wasif");
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareTo(name4));
		System.out.println(s1.compareTo(s2));
		


	}

}
