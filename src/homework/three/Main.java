package homework.three;

public class Main {

	public static void main(String[] args) {

		Group group = new Group("FEA");
		
		Test test = new Test(group);
		
		test.testAddStudentsInGroup();
		test.testFindAndDeleteStudents();
		test.testSortStudentsByLastName();
		test.testAddStudentFromConsole();
		test.testAddStudentsInGroup();
		test.testSortStudentsByRating();
		test.testSortStudentsByFirstName();
		test.testFindStudent("Avakov");
		test.testSaveGroup();
		test.testClearGroup();
		test.testPrintGroup();
		test.testLoadGroup();
		test.testLoadGroup();
		test.testSortStudentsByRating();
		//test.testClearGroup();
		test.testSortStudentsByLastName();
	}
}
