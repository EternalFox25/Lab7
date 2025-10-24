package people;
public class Docente extends Persona {

	//DECLARAMOS PARAMETROS
	private String area;
	private double sueldo;

	/**
	 * DECLARAMOS CONSTRUCTORES
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

	/** 
	 * DECLARAMOS GET Y SET
	 * @param area
	 */
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	/** 
	 * @param sueldo
	 */

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	//DECLARAMOS LOS METODOS
	@Override()
	public String presentarse() {
		return super.presentarse()  + ", tengo " + getAge() + " años, trabajo en " + getAddress() + " mi area de enseñanza es " + area + " y mi sueldo es " + sueldo + " pesos.";
	}//end presentarse
	@Override()
	public int pagaImpuestos() {
		return 1000;
	}//end pagaImpuestos

}