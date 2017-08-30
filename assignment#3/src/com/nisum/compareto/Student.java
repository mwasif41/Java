package com.nisum.compareto;

/**this student class implements Comparable interface to use override the compareTo()
 * method
 * 
 * @author mwasif
 *
 */
public class Student implements Comparable<Object> {
	public String name;
	public int id;
	
    /**This method override the compareto method of comparable interface
     * @param object it is an object to be compared (it would be typecast to Student object)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Object object) {
        Student student = (Student) object; // object ko typecast kia hy takay vo abstract method k hisab se hojae
        if( this.id == student.id){
        	return this.name.compareTo(student.name);
        }
        else if(this.id > student.id){
        	return 1;
        }
        else if(this.id<student.id){
        	return -1;
        }
        else
        	return 0;
        	
    }
	
    /**
     * This is the main entry point to test the compareto() method
     * two objects are created and then they are being compared using compareto()
     */
    public static void main(String[] args) {
		Student s1 = new Student();
		s1.id =1;
		s1.name = "wasif";
		Student s2 = new Student();
		s2.id =2;
		s2.name = "wasif";
		
		String name1 = "wasif";
		String name2 = "waleed";
		String name4 = new String("wasif");
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareTo(name4));
		System.out.println(s1.compareTo(s2));
	}

}
