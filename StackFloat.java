import java.util.ArrayList;


public class StackFloat {
	ArrayList<Float> kotak =new ArrayList<Float>();
	public int nurmila = -1;
	
	public void push(float value){
		nurmila++;
		kotak.add(nurmila,value);
	}
	public float pop(){
		float value = nurmila;
		if (nurmila>-1){
			value = kotak.get(nurmila);
			kotak.remove(nurmila);
			nurmila--;
		}
		return value;}
		public void cetak(){
	System.out.println(kotak.toString());
		}
}
