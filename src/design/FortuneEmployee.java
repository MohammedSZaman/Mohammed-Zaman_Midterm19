package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args)  {
		 EmployeeInfo employee1= new EmployeeInfo(employeeID: "Moe", department: "HR", joiningDate: "1/21/11", salary: 12000);
		 System.out.println(employee1.calculateEmployeeBonus(numberOfYearsWithCompany:5,salary:12000));

		 EmployeeInfo employee2 = new EmployeeInfo(employeeName:"Shak", department:"CEO", joiningDate: "5/23/08", salary:22000);
		 System.out.println(employee1.calculateEmployeeBonus(numberOfYearsWithCompany:8,salary:22000));

		 EmployeeInfo employee3 = new EmployeeInfo(employeeID:2222, employeeName: "Jan", department: "Girlfriend", joiningDate: "2/21/10", salary:90000);
		 System.out.println(employee1.calculateEmployeeBonus(numberOfYearsWithCompany:6,salary:90000));

		 EmployeeInfo daysOff = new EmployeeInfo();
		 daysOff.setBonuspaidLeave(36);
		 daysOff.setHolidaysLeaves(40);
		 daysOff.setSickDays(120);
		 daysOff.setVacationDays(80);
		 System.out.println("\nNumber of hours of Bonus paid leave: " + daysOff.getBonusPaidLeave()+"hrs");
		 System.out.println("\nNumber of hours of Holiday Paid leave: " + daysOff.getHoildaysLeaves()+"hrs");
		 System.out.println("\nNumber of hours of Sick leave: " + daysOff.getSickDays()+"hrs");
		 System.out.println("\nNumber of hours of Vaction paid leave: " + daysOff.getVactionDays()+"hrs");






		


	}

}
