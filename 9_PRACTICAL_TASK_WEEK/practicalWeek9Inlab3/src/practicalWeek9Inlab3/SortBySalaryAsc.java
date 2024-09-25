package practicalWeek9Inlab3;

import java.util.Comparator;

public class SortBySalaryAsc implements Comparator<Employee>{
	 @Override
	    public int compare(Employee e1, Employee e2) {
	        return Double.compare(e1.getSalary(), e2.getSalary());
	    }
}
