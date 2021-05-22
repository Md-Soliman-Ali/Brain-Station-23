
class student {
	private int ID;
	private String First_Name;
	private float Cgpa;

	public student(int ID, String First_Name, float Cgpa)

	{
		this.ID = ID;
		this.First_Name = First_Name;
		this.Cgpa = Cgpa;
	}

	public int getID() {
		return ID;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public float getCgpa() {
		return Cgpa;
	}

}
