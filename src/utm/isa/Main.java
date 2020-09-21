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
		System.out.println(u.name + " : " + u.foundationYear);
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

		System.out.println("================================================================");
		System.out.println();

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

		System.out.println("================================================================");
		System.out.println();

		// region University and student - Part 2

		University u1 = new University("U1", 1900);
		University u2 = new University("U2", 1800);
		University u3 = new University("U3", 1950);

		u1.addStudent("Vasea", 20, 7.77f);
		u1.addStudent("Lena", 25, 5.55f);

		u2.addStudent("Oleg", 20, 10.00f);
		u2.addStudent("Maxim", 21, 5.00f);

		u3.addStudent("George", 23, 8.25f);
		u3.addStudent("Igor", 19, 9.00f);

		printStudents(u1);
		System.out.println("Average " + u1.name + " : " + u1.calcAverageMark());
		System.out.println();

		printStudents(u2);
		System.out.println("Average " + u2.name + " : " + u2.calcAverageMark());
		System.out.println();

		printStudents(u3);
		System.out.println("Average " + u3.name + " : " + u3.calcAverageMark());
		System.out.println();

		// endregion

    }
}
