package people;

public class Estudiante extends Persona {

	private String carrera;
	private int numberID;
	private String grade;

	/**
	 * 
	 * @param name
	 * @param age
	 * @param carrera
	 * @param numberID
	 * @param grade
	 */
	public Estudiante(String name, int age, String carrera, int numberID, String grade) {
		super(name, age);
		this.carrera = carrera;
		this.numberID = numberID;
		this.grade = grade;
	}

	/**
	 * 
	 * @param carrera
	 */
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override()
	public String presentarse() {
		return super.presentarse() + ", tengo " + getAge() + " años, estudio " + carrera + ", estoy en el " + grade + " grado y mi numero de identificacion es " + numberID + ".";
	}
	}

