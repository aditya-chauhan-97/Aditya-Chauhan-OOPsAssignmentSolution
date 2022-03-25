package oopsPackage;

public class Main {

	public static void main(String[] args) {
		HrDepartment hrdObj = new HrDepartment();
		AdminDepartment adminObj = new AdminDepartment();
		TechDepartment techObj = new TechDepartment();
		
		System.out.println("Welcome to " + adminObj.departmentName() + "\n" + adminObj.getTodaysWork() + "\n" + adminObj.getWorkDeadline() + "\n" + adminObj.isTodayAHoliday() + "\n");
		System.out.println("Welcome to " + hrdObj.departmentName() + "\n" + hrdObj.doActivity() + "\n" + hrdObj.getTodaysWork() + "\n" + hrdObj.getWorkDeadline() + "\n" + hrdObj.isTodayAHoliday() + "\n");
		System.out.println("Welcome to " + techObj.departmentName() + "\n" + techObj.getTodaysWork() + "\n" + techObj.getWorkDeadline() + "\n" + techObj.TechStackInformation() + "\n" + techObj.isTodayAHoliday());

	}

}
