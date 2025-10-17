package people;
public class Docente extends Persona {

	private String area;
	private double sueldo;

	/**
	 * 
	 * @param name
	 * @param age
	 * @param adddress
	 * @param area
	 * @param sueldo
	 * @return 
	 */
	public Docente(String name, int age, String adddress, String area, double sueldo) {
		super(name, age,adddress);
		this.area = area;
		this.sueldo = sueldo;
	}

	@Override()
	public String presentarse() {
		return super.presentarse() + ", tengo " + getAge() + " años, trabajo en " + getAddress() + " mi area de enseñanza es " + area + " y mi sueldo es " + sueldo + " pesos.";
	}

}