import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mcgirlj.softwareprog3.Course;
import com.mcgirlj.softwareprog3.Module;
import com.mcgirlj.softwareprog3.Student;

public class RegistrationSystem {

	public static void main(String[] args) {
		
		LocalDate jackDOB = LocalDate.of(2010, 9, 1);
		LocalDate JackDOB = LocalDate.of(2005, 9, 1);
		LocalDate JamesDOB = LocalDate.of(2001, 9, 1);
		LocalDate startDate = LocalDate.of(2020, 9, 1);
		LocalDate endDate = LocalDate.of(2021, 4, 1);
		Course bp4 = new Course("BP4", startDate, endDate);
		Course at2 = new Course("AT2", startDate, endDate);
		Module ct4 = new Module("ct4");
		Module ds3 = new Module("ds3");
		Module co8 = new Module("co8");
		
		Student mary = new Student("Mary Smith", 23 , jackDOB, 7);
		Student jack = new Student("Jack McGirl", 27 , JackDOB, 8);
		Student james = new Student("James Surname", 35 , JamesDOB, 9);
		
		List<Module> moduleList_bp4 = new ArrayList<Module>();
		List<Module> moduleList_at2 = new ArrayList<Module>();
		
		moduleList_bp4.add(ds3);
		moduleList_bp4.add(co8);
		moduleList_at2.add(ct4);
		moduleList_at2.add(ds3);
		
		bp4.setModules(moduleList_bp4);
		at2.setModules(moduleList_at2);
		
		List<Student> studentList_bp4 = new ArrayList<Student>();
		List<Student> studentList_at2 = new ArrayList<Student>();
		studentList_bp4.add(mary);
		studentList_bp4.add(jack);
		studentList_at2.add(james);
		
		bp4.setStudents(studentList_bp4);
		at2.setStudents(studentList_at2);
		
		mary.setCourse(bp4);
		jack.setCourse(bp4);
		james.setCourse(at2);
		mary.addModule(co8);
		mary.addModule(ds3);
		jack.addModule(co8);
		jack.addModule(ds3);
		james.addModule(ct4);
		james.addModule(ds3);
		
		System.out.println("Course 1:" + bp4.getCourseName());
		System.out.println("Course 1 Modules:" + bp4.getModulesString(bp4.getModules()));
		System.out.println("Course 2:" + at2.getCourseName());
		System.out.println("Course 2 Modules:" + at2.getModulesString(at2.getModules()));
		System.out.println("Registered Students:" + "\n" + "Name - " + mary.getName() + " Username - " + mary.getUsername() + " Modules - " + mary.getModulesString(mary.getModules()) + " Course - " + mary.getCourse() + "\n" +
													"\n" + "Name - " + jack.getName() + " Username - " + jack.getUsername() + " Modules - " + jack.getModulesString(jack.getModules()) + " Course - " + jack.getCourse() + "\n" +
													"\n" + "Name - " + james.getName() + " Username - " + james.getUsername() + " Modules - " + james.getModulesString(james.getModules()) + " Course - " + james.getCourse());
		
	}

}
