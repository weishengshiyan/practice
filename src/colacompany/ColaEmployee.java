package colacompany;

/*
 * ColaEmployee ：这是所有员工总的父类，属性：
 * 员工的姓名,员工的生日月份。
 * 方法：getSalary(int month) 
 * 根据参数月份来确定工资，
 * 如果该月员工过生日，
 * 则公司会额外奖励100 元。
 * 
 */
public class ColaEmployee {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	int month;
	
	public ColaEmployee(String name,int month) {
		this.name=name;
		this.month=month;
	}
	
public double getSalary(int mouth) {
	
	return 0;
		// TODO Auto-generated method stub
	}
	
	

	}
	

