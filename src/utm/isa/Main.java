package utm.isa;

import java.awt.*;

public class Main {

	public static void printMonitors(Monitor m1, Monitor m2) {
		System.out.println("M1 = " + m1.toString());
		System.out.println("M2 = " + m2.toString());
		System.out.println(("(M1 == M2) = " + m1.equals(m2)));
		System.out.println();
	}

	public static void printStudents(University u) {
		int size = u.getStudents().size();
		System.out.println("Students : " + (size > 0 ? size + " : " : size));
		for (Student student: u.getStudents()) {
			System.out.println(student);
		}

		System.out.println();
	}

    public static void main(String[] args) {
		// region Monitor

	    Monitor m1 = new Monitor();
	    Monitor m2 = new Monitor(Color.GRAY, new Vector2(4, 3), new Vector2(1920, 1080));

	    printMonitors(m1, m2);

	    m1.color = Color.WHITE;
	    m1.dimension = new Vector2(16, 9);
	    m1.resolution = new Vector2(1024, 768);

		printMonitors(m1, m2);

		m2.color = Color.WHITE;
		m2.dimension = new Vector2(16, 9);
		m2.resolution = new Vector2(1024, 768);

		printMonitors(m1, m2);

		// endregion

		// region University and student - Part 1

		University u = new University("University", 1999);
		u.name = u.name + " #1";
		u.foundationYear = 2999;

		u.addStudent("Vasea", 20, 7.77f);

		printStudents(u);

		Student s = new Student("Lena", 25, 8.88f);
		u.addStudent(s);

		printStudents(u);

		u.getStudents().clear();

		printStudents(u);

		// endregion

		// region University and student - Part 2



		// endregion

    }
}
