package colacompany;

import extend_interface.salar;

/*
 * ColaEmployee 的子类，按小时拿工资的员工，
 * 每月工作超出160 小时的部分按照1.5 倍工资发放。
 * 属性：每小时的工资、每月工作的小时数 
 * 
 */
public class HourlyEmployee extends ColaEmployee{
	double hoursalar;
	int hour;
	public HourlyEmployee(String name, int month,int hour,int hoursalar) {
		super(name, month);
		// TODO Auto-generated constructor stub
		this.hoursalar=hoursalar;
		this.hour=hour;
	}
	@Override
	public double getSalary(int mouth) {
		// TODO Auto-generated method stub
		if (this.month==mouth) {
			if (hour>160) {
				return (hoursalar-160)*1.5+hoursalar*160+100;
				
			}else {
				return hoursalar*160+100;
		}
		}
		else {
			if (hour>160) {
				return (hoursalar-160)*1.5+hoursalar*160;
				
			}else {
				return hoursalar*160;
			}
		}	
		}
}
