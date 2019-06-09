package demo03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sfj {
	private List<Integer> arr = new ArrayList<Integer>();
	private Scanner sc = new Scanner(System.in);
	private Job_Scheduling[] job_Schedulings = null;
	private int TimeCount = 0;

	public static void main(String[] args) {
		Sfj app = new Sfj();
		app.Initlizer();
		app.Print();
		app.Run();
		app.Print();
		app.TextPrint();
	}

	public Sfj() {
		System.out.print("Please Input The THe Homeworks You REally Want :>>>>>>>>>>\t");
		int temp_count = sc.nextInt();
		job_Schedulings = new Job_Scheduling[temp_count];
	}

	public void Initlizer() {
		System.out.println("-------------------------------Initlizer----------------------------------");
		System.out.println("��������ҵ��ţ���ҵ�뾮ʱ�䣬��Ҫ����ʱ��>>>>>>>>>>>>\t");
		System.out.println("��ҵ��" + "  ��ҵ�뾮ʱ��" + "  ��Ҫ����ʱ��");
		for (int i = 0; i < job_Schedulings.length; i++) {
			Job_Scheduling temp = new Job_Scheduling();
			temp.setName(sc.next());
			temp.setQueueTime(sc.nextInt());
			temp.setRunTime(sc.nextInt());
			job_Schedulings[i] = temp;
		}
	}

	/**
	 * ������ط���***********************************************************************
	 */
	public void Run() {

		while (!IsDone()) {
			CanRun();
			int key = ShouldRun();
			if (key == -1) {
				TimeCount++;
			} else {
				Excute(key);
			}
		}
	}

	public boolean IsDone() {
		for (Job_Scheduling temp : job_Schedulings) {
			if (temp.flag != 1) {
				return false;
			}
		}
		return true;
	}

	public void CanRun() {
		for (Job_Scheduling temp : job_Schedulings) {
			if (temp.queueTime <= TimeCount && temp.flag != 1) {
				temp.flag = 0;
			}
		}
	}

	public int ShouldRun() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < job_Schedulings.length; i++) {
			if (job_Schedulings[i].flag == 0) {
				list.add(i);
			}
		}
		int key = Confirm(list);
		return key;
	}

	public int Confirm(List<Integer> list) {
		if (list.isEmpty()) {
			return -1;
		}
		double MaxTemp = -1;
		int key = 0;
		for (int i = 0; i < list.size(); i++) {
			double temp = (TimeCount - job_Schedulings[list.get(i)].queueTime) / job_Schedulings[list.get(i)].runTime;
			if (temp > MaxTemp) {
				MaxTemp = temp;
				key = i;
			}
		}
		return list.get(key);
	}

	public void Excute(int key) {
		job_Schedulings[key].startTime = TimeCount;
		job_Schedulings[key].endTime = TimeCount + job_Schedulings[key].runTime;
		job_Schedulings[key].avg_Time = (job_Schedulings[key].endTime - job_Schedulings[key].queueTime)
				/ job_Schedulings[key].runTime;
		job_Schedulings[key].flag = 1;
		TimeCount = job_Schedulings[key].endTime;
		arr.add(key);
	}

	/**
	 * ������ط���***********************************************************************
	 */

	/**
	 * ��ӡ��ط���**************************************************************
	 */
	public void Print() {
		System.out.println("-------------------------------Print----------------------------------");
		for (Job_Scheduling temp : job_Schedulings) {
			System.out.println(temp);
		}
	}

	public void TextPrint() {
		if (arr.isEmpty())
			return;
		int sum = 0;
		System.out.println("--------------------ִ��˳��--------------------->");
		for (int i = 0; i < arr.size(); i++) {
			sum += job_Schedulings[i].avg_Time;
			System.out.print(job_Schedulings[arr.get(i)].getName() + "-->");
		}
		System.out.println();
		System.out.println("---------------------ƽ����תʱ��------------------->");
		System.out.println("--->" + sum / arr.size());
	}
	/**
	 * ��ӡ��ط���**************************************************************
	 */

}

class Job_Scheduling {
	/**
	 * queueTime:��ҵ�뾮ʱ��
	 */

	private String name;
	public int queueTime;
	public int runTime;
	public int startTime;
	public int endTime;
	public double avg_Time;

	/**
	 * -1��ʾû������� 0��ʾ�Ѿ������˾��ж��� 1��ʾ���н���
	 */
	public int flag = -1;

	@Override
	public String toString() {
		return "Job_Scheduling [name=" + name + ", queueTime=" + queueTime + ", runTime=" + runTime + ", startTime="
				+ startTime + ", endTime=" + endTime + ", avg_Time=" + avg_Time + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQueueTime(int queueTime) {
		this.queueTime = queueTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public String getName() {
		return name;
	}

}
