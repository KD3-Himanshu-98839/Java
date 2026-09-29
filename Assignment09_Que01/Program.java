package Assignment09_Que01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static Scanner scanner = new Scanner(System.in);
	public static List<Student> list = new ArrayList<>();

	public static void AddStudent() {
		System.out.println("Enter the number of student:");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			Student student = new Student();
			student.acceptRecord();
			list.add(student);
		}
	}

	public static void acceptStudentRollNo(int[] rollNo) {
		System.out.println("Enter rollNo:");
		rollNo[0] = scanner.nextInt();

	}
	public static Student findStudent(int rollNo) {
		Student key = new Student();
		key.setRollNo(rollNo);
		int index = list.indexOf(key);
		if (index != -1) {
			return list.get(index);
		} 
		return null;
	}
	public static void printStudent(Student st) {
		if (st != null) {
			System.out.println(st.toString());
		}
		else {
			System.out.println("Student not found");
		}
	}
	public static void printStudents() {
		list.forEach(e -> System.out.println(e));
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add the student");
		System.out.println("2.Display all the students.");
		System.out.println("3.Find the Student");
		System.out.println("4.Sort By Roll No");
		System.out.println("5.Sort By Name");
		System.out.println("6.Sort By Marks");
		System.out.println("Enter your choice:");
		int choice = scanner.nextInt() ;
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		int[] rollNo = new int[1];
		Comparator<Student> comparator = null;

		while ((choice = menuList())!=0) {
			switch (choice) {
			case 1:
				Program.AddStudent();
				break;
			case 2:
				Program.printStudents();
				break;
			case 3:
				Program.acceptStudentRollNo(rollNo);
				Student st1 = Program.findStudent(rollNo[0]);
				Program.printStudent(st1);
				break;
			case 4:
				comparator = new SortByRollNo();
				list.sort(comparator);
				printStudents();
				break;
			case 5:
				comparator = new SortByName();
				list.sort(comparator);
				printStudents();
				break;
			case 6:
				comparator = new SortByMarks();
				list.sort(comparator);
				printStudents();
				break;

			default:
				System.out.println("Invalid Input.");
				break;
			}
		}

	}

}
