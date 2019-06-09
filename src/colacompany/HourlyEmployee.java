package colacompany;

import extend_interface.salar;

/*
 * ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����
 * ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5 �����ʷ��š�
 * ���ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ�� 
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
