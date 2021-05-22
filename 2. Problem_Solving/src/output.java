import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class output {

	public static void main(String[] args)

	{
		Scanner in = new Scanner(System.in);
		int Cases = Integer.parseInt(in.nextLine());

		List<student> student_list = new ArrayList<student>();

		while (Cases > 0) {
			int ID = in.nextInt();
			String First_Name = in.next();
			float Cgpa = in.nextFloat();

			student student = new student(ID, First_Name, Cgpa);
			student_list.add(student);
			Cases--;
		}

		Collections.sort(student_list, Comparator.comparing(student::getCgpa).reversed()
				.thenComparing(student::getFirst_Name).thenComparing(student::getID));

		for (student student : student_list) {
			System.out.println(student.getFirst_Name());
		}
	}
}