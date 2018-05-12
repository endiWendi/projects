import java.util.ArrayList;

public class WetterDaten implements Subjekt {
	private ArrayList beobachter;
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	
	public WetterDaten(){
		beobachter = new ArrayList();
	}

	@Override
	public void registriereBeobachter(Beobachter b) {
		// TODO Auto-generated method stub
		beobachter.add(b);
		
	}

	@Override
	public void entferneBeobachter(Beobachter b) {
		// TODO Auto-generated method stub
		beobachter.remove(b);
		
	}

	@Override
	public void benachrichtigeBeobachter() {
		// TODO Auto-generated method stub
		for (int i  = 0; i < beobachter.size(); i++){
			Beobachter b = (Beobachter) beobachter.get(i);
			b.aktualisieren(temperatur, feuchtigkeit, luftdruck);
		}
	}
	
	public void setMesswerte(float temp, float feucht, float druck) {
		this.temperatur = temp; 
		this.feuchtigkeit = feucht;
		this.luftdruck = druck;
	}
	

}
