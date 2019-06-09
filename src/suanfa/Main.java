package suanfa;
import java.util.Scanner;
import java.util.Arrays;
import java.math.*;

public class Main  {

    static class Process implements Comparable<Process>{
        String name;            //进程标示
        int arrivetime;         //到达时间
        int servicetime;        //服务时间
        int servicetime2;       //服务时间副本
        int finishtime;         //完成时间
        int turnovertime;       //周转时间
        int priority;           //优先级

        public Process(String name, int arrivetime, int servicetime, int priority){
            //构造方法
            //参数：进程名、到达时间、服务时间、优先级
            this.name = name;
            this.arrivetime = arrivetime;
            this.servicetime = servicetime;
            this.servicetime2 = servicetime;
            this.priority = priority;
        }

        public void diaoyong(){
            //每执行一次进程，调用一次，更新进程的  服务时间  和  优先级
            this.servicetime -= 1;
            this.priority -= 2;
            if( servicetime <= 0 ){
                priority = -1000;
            }
        }

        //排序函数的比较函数
        //按照优先级从高到底排序，优先级相同，按照到达时间从低到高排序
        public int compareTo(Process o) {  
            if(this.priority > o.priority){  
                return -1;  
            }else if(this.priority < o.priority){  
                return 1;  
            }
            else{
                if(this.arrivetime < o.arrivetime){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        } 
    }

    public static void main(String[] args) {
        Process[] p = new Process[10];
        System.out.println("||动态高优先权调度||");
        System.out.println("-----------------------");

        //进程参数
        p[0] = new Process("j1", 0, 5, 4);
        p[1] = new Process("j2", 1, 2, 3);
        p[2] = new Process("j3", 3, 3, 9);
        p[3] = new Process("j4", 4, 2, 2);
        p[4] = new Process("j5", 6 ,1, 6);

        //开始调度
        int t = 0;      //程序已运行的时间片数量
        int l1 = 0;     //当前处于运行和暂停状态的作业数量
        int l2 = 5;     //剩余未参加的进程数量
        int l3 = 0;     //已经执行完的进程数量
        int leng = 5;   //总进程数量
        for( ; l3!=leng; t++ ){
            //从数组中找出到达的作业
            for(int i=l1; i<leng; i++){
                if( p[i].arrivetime == t ){
                    l1++;
                    l2--;
                }
            }

            //找到到达作业中，优先级最高的进程
            //将优先级最高的进程，放到“执行/等待队列”的第一位
            Arrays.sort(p, l3, leng-l2);

            //执行该进程
            p[l3].diaoyong();

            //输出当前时间片进程执行信息
            System.out.print("当前执行时间片"+t+"当前执行进程：" + p[l3].name + "等待执行进程：");
            for( int i=l3+1; i<leng-l2; i++){
                System.out.print(p[i].name + " ");
            }
            System.out.println();

            //判读该进程是否执行完了
            if( p[l3].servicetime <=0  ){
                p[l3].finishtime = t;
                p[l3].turnovertime = p[l3].finishtime - p[l3].arrivetime;
                l3++;
                l1--;
            }

        }
        for( int i=0; i<leng; i++){
            System.out.println("作业名："+p[i].name+"   到达时间："+p[i].arrivetime+"    服务时间："+p[i].servicetime2+"  完成时间："+p[i].finishtime+"    周转时间："+p[i].turnovertime);
        }
        System.out.println("算法完成");

    }
}
