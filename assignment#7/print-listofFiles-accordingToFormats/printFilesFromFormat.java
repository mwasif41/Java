import java.io.*;
public class printFilesFromFormat {
	///////////// static function to get the format//////////////
	public static String getExtension(String path){
		//String file = path.substring(l)
		String file =path.substring(path.lastIndexOf("\\"));
		String format = file.substring(file.indexOf('.'));
		return format;
	}
	
	public static void main(String[] args) {
		File file = new File("C:\\users\\mwasif\\Downloads"); // path to check
		File[] path = file.listFiles(); // get all the files path
		String format = ".txt";  // format to be shown
		System.out.println("The list of files of format :" + format);
		for(File p:path){
			if(p.isFile()){ // if the path is of file?
				if(format.equals(printFilesFromFormat.getExtension(p.toString()))){
					System.out.println(p.getName());
				}
				// only print those files whose format is matched to given format
			}
		}
		
	}

}
