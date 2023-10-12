package tester;
import com.app.vehicles.Vehicle;

public class TestVehicle {
	
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.acceptData();
		System.out.println(vehicle);
		
		Vehicle vehicle1=new Vehicle();
		vehicle1.acceptData();
		System.out.println(vehicle1);
		
		if(vehicle.equals(vehicle1))
			System.out.println("SAME");
		else
			System.out.println("DIFFERENT");
	}
	
}
