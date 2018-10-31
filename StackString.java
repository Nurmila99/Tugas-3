import java.util.ArrayList;


public class StackString {
	ArrayList<String> k = new ArrayList<String>();
	int nurmila = -1;
	
	public void push(String value){
		nurmila++;
		k.add(nurmila,value);
	}
	public String pop(){
		String value = "KOSONG";
		if (nurmila>-1){
		value = k.get(nurmila);
		k.remove(nurmila);
		nurmila--;}
		return value;
		}
	
	public void cetak (){
		System.out.println("Input : " +nurmila+  k.toString());
	}
}



