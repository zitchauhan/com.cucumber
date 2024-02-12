
public class Encaptulation {
	private int oldage;
	

	public static void main(String[] args) {

		Encaptulation encp = new Encaptulation();

		encp.setAgeValue(20);

		int age = encp.getAgeValue();

		System.out.println(age);
	}



	public int getAgeValue() {

		return oldage;

	}

	public void setAgeValue(int newAge)

	{

		oldage = newAge;

	}

}

