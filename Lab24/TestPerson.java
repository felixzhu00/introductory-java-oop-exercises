public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person("Bob", "913 60th Street", "719-333-2222", "bob123@gmail.com");
		System.out.println(p.toString() + "\n");
		
		Student s = new Student("Joes", "8939 Main Street", "917-356-2342", "joes6452@gmail.com", 3);
		System.out.println(s.toString() + "\n");
		
		Employee e = new Employee("Marry" , "1511 Winter Ave", "441-334-3212", "marryford345@gmail.com", 44, 4303.10, 2);
		System.out.println(e.toString() + "\n");
		
		Faculty f = new Faculty("Dan" , "458 Bington Ave", "341-155-3326", "danme45@gmail.com", 44, 430300.11, 2, "10:00-1:00", "Rookie");
		System.out.println(f.toString() + "\n");
		
		Staff st =  new Staff("Jon", "3124 Down Street", "768-342-1021", "jondoe13@gmail.com", 2, 1425032.35, 4, "CEO");
		System.out.println(st.toString());
		
		
		
	}
}
