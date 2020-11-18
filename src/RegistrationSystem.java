import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistrationSystem {

	public static void main(String[] args) {
		
		LocalDate MaryDOB = LocalDate.of(2010, 9, 1);
		LocalDate JackDOB = LocalDate.of(2005, 9, 1);
		LocalDate JamesDOB = LocalDate.of(2001, 9, 1);
		LocalDate startDate = LocalDate.of(2020, 9, 1);
		LocalDate endDate = LocalDate.of(2021, 4, 1);
		Course bp4 = new Course("BP4", startDate, endDate);
		Course at2 = new Course("AT2", startDate, endDate);
		Module ct4 = new Module("ct4");
		Module ds3 = new Module("ds3");
		Module co8 = new Module("co8");
		
		Student mary = new Student("Mary Smith", 23 , MaryDOB, 7);
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
	}

}
