package people;

abstract public class Persona {

	//DECLARAMOS PARAMETROS
	private String name;
	private int age;
	private String address;

	/**
	 * DECLARAMOS CONSTRUCTORES
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
	 * @param name
	 * @param age
	 */
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
	}


	/**
	 * DECLARAMOS GET Y SET
	 * @param name
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age
	 */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param address
	 */
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//DECLARAMOS LOS METODOS
	public String presentarse(){//metodo no abstracto dentro de una clase abstracta
		return "Hola! soy" + name;
	}//end presentarse
	public abstract int pagaImpuestos();//metodo abstracto dentro de una clase abstracta
}//end Persona