package people;

abstract public class Persona {

	private String name;
	private int age;
	private String address;

	/**
	 * 
	 * @param name
	 * @param age
	 * @param address
	 */
	public Persona(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * 
	 * @param name
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param age
	 */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 
	 * @param address
	 */
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String presentarse() {
		return "Hola! Soy " + name;
	}

}