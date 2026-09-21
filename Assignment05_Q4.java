
enum TrafficLight{
	RED(70),
	YELLOW(10),
	GREEN(45);

	private int duration;
 	TrafficLight(int duration ) {
 		this.duration = duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
 	
}
public class Assignment05_Q4 {
	public static void main(String[] args) {
		
		for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " light duration: " + light.getDuration() + " seconds");
        }
		
	}
}
