
public class student implements Comparable {
	public String name;
	public int id;
	
/*	public int compareTo(student o){
		
	}
	*/ 
    public int compareTo(Object o) {
        student s = (student) o; // object ko typecast kia hy takay vo abstract method k hisab se hojae
        if( this.id == s.id){
        	return this.name.compareTo(s.name);
        }
        else if(this.id > s.id){
        	return 1;
        }
        else if(this.id<s.id){
        	return -1;
        }
        else
        	return 0;
        	
    }


}
