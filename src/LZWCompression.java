import java.util.*;
import java.io.*;
public class LZWCompression {
	
	static BufferedReader in;
	static PrintWriter out;
	static String input = "";
	static Scanner s;
	static LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
	
	public static void main(String[] args) throws IOException{
		in = new BufferedReader(new FileReader(new File("lzw-file2.txt")));
		out = new PrintWriter(new File("output.txt"));
		s = new Scanner(new File("input.txt"));
		in.close();
		out.close();
	}
	

}
