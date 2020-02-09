package gr.hua.dit.ds.sitisi.ext.entity;


public class Student {
	
	private String id;
	private String firstname;
	private String lastname;
	private String phone;
	private int semester;
	private boolean canSubmit;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String firstname, String lastname, String phone, int semester, boolean canSubmit) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.semester = semester;
		this.canSubmit = canSubmit;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public boolean isCanSubmit() {
		return canSubmit;
	}

	public void setCanSubmit(boolean canSubmit) {
		this.canSubmit = canSubmit;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone
				+ ", semester=" + semester + ", canSubmit=" + canSubmit + "]";
	}
	
	

}
