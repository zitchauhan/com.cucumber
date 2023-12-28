public class Person{
	public static void main(String[] args) {
		// Creating a pojo object
        Pojo person = new Pojo();
        person.setName("Alice");
        person.setAge(30);
        person.setEmail("alice@example.com");

        // Accessing object properties
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());

        // Using toString() to represent the object
        System.out.println("pojo details: " + person);
	}
}
 class Pojo {
	private String name;
	private int age;
	private String email;

	// Constructors
	public Pojo() {
		// Default constructor
	}

	public Pojo(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// toString() method for object representation
	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + '}';
	}
}


