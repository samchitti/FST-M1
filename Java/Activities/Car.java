package activity1;

public class Car {
	//Adding Variables
		String color;
		String transmission;
		int make;
		int tyres;
		int doors;

	//Contructor
	public Car(String color,String transmission,int make)
		{
			this.color=color;
			this.transmission=transmission;
			this.make=make;
			this.tyres=4;
			this.doors=4;
		}

	//methods to display characters
	public void displayCharacteristics()
	{
	 System.out.println ("Car color is "+ color);
	 System.out.println ("Car transmission is " + transmission);
	 System.out.println ("Car made of "+ make);
	 System.out.println ("Car tyre type "+ tyres);
	 System.out.println ("Car doors "+ doors);
	}

	public void accelarate()
	{
		System.out.println("Car is moving");
	}

	public void brake()
	{
		System.out.println("Car has stopped");
	}
	}