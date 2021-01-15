package domain;
/** 
 * Class that interprise manager
 * class that extends
 * @see Employee
 */
public class Manager extends Employee {
/**
 * Main information about manager
 * @param employees
 * @param name
 * @param jobTitle
 * @param level
 * @param dept 
 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
/**
 * Method that return information about manager
 * @return 
 */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
