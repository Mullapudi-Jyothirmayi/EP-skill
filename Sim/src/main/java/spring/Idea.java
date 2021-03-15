package spring;

public class Idea implements Sim {
	String typeofthesim="";
	public String getTypeofthesim() {
		return typeofthesim;
	}

	public void setTypeofthesim(String typeofthesim) {
		this.typeofthesim = typeofthesim;
	}

	@Override
	public String toString() {
		return "Idea [typeofthesim=" + typeofthesim + "]";
	}

	
	public void signal()
	{
		System.out.println("This is Idea signal");
	}
	
	public void data()
	{
		System.out.println("Idea uses 4G data");
	}

}
