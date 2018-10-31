import java.util.ArrayList;


public class QueueDouble {
	ArrayList<Double> aku = new ArrayList<Double>();
	int nurmila = -1;

	public void insert(Double value) {
		nurmila++;
		aku.add(nurmila,value);
	}
	public Double get() {
		Double value = (double) 0.1f;
		if(nurmila>-1) {
			value = aku.get(0);
			aku.remove(0);
			nurmila--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("Step : "+nurmila+" > VARIABLE: "+aku.toString());
	}
}

	
