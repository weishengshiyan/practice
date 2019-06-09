package colacompany;
/*
 * 在该类中写一个方法，调用该方法可以打印出某月某个员工的工资数额
 * 
 */

	public class Company {
	    public void getSalary(ColaEmployee c,int mouth){
	        System.out.println(c.name+"的在"+mouth+"月的月薪为"+c.getSalary(mouth));
	    }
	
}
