package suanfa;
import java.util.Scanner;
import java.util.Arrays;
import java.math.*;

public class Main  {

    static class Process implements Comparable<Process>{
        String name;            //���̱�ʾ
        int arrivetime;         //����ʱ��
        int servicetime;        //����ʱ��
        int servicetime2;       //����ʱ�丱��
        int finishtime;         //���ʱ��
        int turnovertime;       //��תʱ��
        int priority;           //���ȼ�

        public Process(String name, int arrivetime, int servicetime, int priority){
            //���췽��
            //������������������ʱ�䡢����ʱ�䡢���ȼ�
            this.name = name;
            this.arrivetime = arrivetime;
            this.servicetime = servicetime;
            this.servicetime2 = servicetime;
            this.priority = priority;
        }

        public void diaoyong(){
            //ÿִ��һ�ν��̣�����һ�Σ����½��̵�  ����ʱ��  ��  ���ȼ�
            this.servicetime -= 1;
            this.priority -= 2;
            if( servicetime <= 0 ){
                priority = -1000;
            }
        }

        //�������ıȽϺ���
        //�������ȼ��Ӹߵ����������ȼ���ͬ�����յ���ʱ��ӵ͵�������
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
        System.out.println("||��̬������Ȩ����||");
        System.out.println("-----------------------");

        //���̲���
        p[0] = new Process("j1", 0, 5, 4);
        p[1] = new Process("j2", 1, 2, 3);
        p[2] = new Process("j3", 3, 3, 9);
        p[3] = new Process("j4", 4, 2, 2);
        p[4] = new Process("j5", 6 ,1, 6);

        //��ʼ����
        int t = 0;      //���������е�ʱ��Ƭ����
        int l1 = 0;     //��ǰ�������к���ͣ״̬����ҵ����
        int l2 = 5;     //ʣ��δ�μӵĽ�������
        int l3 = 0;     //�Ѿ�ִ����Ľ�������
        int leng = 5;   //�ܽ�������
        for( ; l3!=leng; t++ ){
            //���������ҳ��������ҵ
            for(int i=l1; i<leng; i++){
                if( p[i].arrivetime == t ){
                    l1++;
                    l2--;
                }
            }

            //�ҵ�������ҵ�У����ȼ���ߵĽ���
            //�����ȼ���ߵĽ��̣��ŵ���ִ��/�ȴ����С��ĵ�һλ
            Arrays.sort(p, l3, leng-l2);

            //ִ�иý���
            p[l3].diaoyong();

            //�����ǰʱ��Ƭ����ִ����Ϣ
            System.out.print("��ǰִ��ʱ��Ƭ"+t+"��ǰִ�н��̣�" + p[l3].name + "�ȴ�ִ�н��̣�");
            for( int i=l3+1; i<leng-l2; i++){
                System.out.print(p[i].name + " ");
            }
            System.out.println();

            //�ж��ý����Ƿ�ִ������
            if( p[l3].servicetime <=0  ){
                p[l3].finishtime = t;
                p[l3].turnovertime = p[l3].finishtime - p[l3].arrivetime;
                l3++;
                l1--;
            }

        }
        for( int i=0; i<leng; i++){
            System.out.println("��ҵ����"+p[i].name+"   ����ʱ�䣺"+p[i].arrivetime+"    ����ʱ�䣺"+p[i].servicetime2+"  ���ʱ�䣺"+p[i].finishtime+"    ��תʱ�䣺"+p[i].turnovertime);
        }
        System.out.println("�㷨���");

    }
}
