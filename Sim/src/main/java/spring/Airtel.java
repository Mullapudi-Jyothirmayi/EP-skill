package spring;

public class Airtel implements Sim {
	String typeofthesim="";
	@Override
	public String toString() {
		return "Airtel [typeofthesim=" + typeofthesim + "]";
	}

	public Airtel(String typeofthesim) {
		super();
		this.typeofthesim = typeofthesim;
	}

	public void signal()
	{
		System.out.println("This is Airtel signal");
	}
	
	public void data()
	{
		System.out.println("Airtel uses 4G data");
	}
}
