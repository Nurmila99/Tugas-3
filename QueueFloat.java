import java.util.ArrayList;


public class QueueFloat {
	ArrayList<Float> nurmila = new ArrayList<Float>();
	int Panda = -1;

	public void insert(Float value) {
		Panda++;
		nurmila.add(Panda,value);
	}
	public Float get() {
		Float value = 0.6f;
		if(Panda>-1) {
			value = nurmila.get(0);
			nurmila.remove(0);
			Panda--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("Step : "+Panda+" > VARIABLE: "+nurmila.toString());
	}
}


