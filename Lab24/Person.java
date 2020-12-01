class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String eMail;

	public Person(String name, String address, String phoneNumber, String eMail) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}

	public String toString() {
		return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nE-mail: " + eMail;
	}
}

class Student extends Person {
	private String year;
	private final String[] status = { "freshman", "sophmore", "junior", "senior" };

	public Student(String name, String address, String phoneNumber, String eMail, int year) {
		super(name, address, phoneNumber, eMail);
		this.year = status[year];
	}

	public String toString() {
		return super.toString() + "\nStatus: " + year;
	}
}

class Employee extends Person {
	private int office;
	private double salary;
	private int experience;

	public Employee(String name, String address, String phoneNumber, String eMail, int office, double salary,
			int experience) {
		super(name, address, phoneNumber, eMail);
		this.office = office;
		this.salary = salary;
		this.experience = experience;
	}

	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: " + salary + "\nExperience: " + experience;
	}
}

class Faculty extends Employee {
	private String officeHours;
	private String rank;

	public Faculty(String name, String address, String phoneNumber, String eMail, int office, double salary,
			int experience, String officeHours, String rank) {
		super(name, address, phoneNumber, eMail, office, salary, experience);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String toString() {
		return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
	}
}

class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phoneNumber, String eMail, int office, double salary,
			int experience, String title) {
		super(name, address, phoneNumber, eMail, office, salary, experience);
		this.title = title;
	}

	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}
