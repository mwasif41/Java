import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class newFrequencyCounter {
	
	public static void main(String[] args) {
		Map<String, Integer> frequencies = new HashMap<String,Integer>();
		try{
			FileReader fr = new FileReader("C:\\users\\mwasif\\Desktop\\abc.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null){
				for(String temp: line.split(" ")){
					Integer frequency = frequencies.get(temp.toLowerCase());
					if(frequency == null)
						frequency = 0;
					frequency++;
					frequencies.put(temp.toLowerCase(), frequency);
				}
			}
			fr.close();
			br.close();
		}catch(Exception e){e.printStackTrace();}
		System.out.println(" The values of each word in a file ");
		for(Map.Entry<String, Integer> f: frequencies.entrySet()){
			System.out.println(f.getKey() + " is "+ f.getValue());
		}
	}

}
