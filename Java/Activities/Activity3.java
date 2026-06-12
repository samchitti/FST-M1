package activity3;

public class Activity3 {
	public String adjustDevice(String device, int value)
	{
		String status =  switch (device)
	{
	case null -> "Error: Device cannot be Null";
	case String d when d.equals("THERMOSTAT") && value >40 -> "[Thermostat] Warning: Temperature high.";
	case "THERMOSTAT" -> "[Thermostat] Temperature is set to "+ value;
	case "LIGHT" ->"[Light] Adjusting brightness to "+value + "%.";
	default -> "Unknown device";
	};
	return status;
	}
	public static void main(String[] args) {
		Activity3 Obj3 = new Activity3();
		System.out.println(Obj3.adjustDevice("THERMOSTAT", 52));
		System.out.println(Obj3.adjustDevice("THERMOSTAT", 22));
		System.out.println(Obj3.adjustDevice("LIGHT", 75));
		System.out.println(Obj3.adjustDevice(null, 0));
	}
}
