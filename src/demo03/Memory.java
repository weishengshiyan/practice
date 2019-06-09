package demo03;



import java.util.LinkedList;
import java.util.Scanner;

/**
 * �ڴ���
 */
public class Memory{
    /**
     * �ڴ��С
     */
    private int size;
    /**
     * ��Сʣ�������С
     */
    private static final int MIN_SIZE = 10;
    /**
     * �ڴ����
     */
    private LinkedList<Zone> zones;
    /**
     * �ϴη���Ŀ�����λ��
     */
    private int pointer;

    /**
     * �����ڵ���
     */
    class Zone{
        /**
         * ������С
         */
        private int size;
        /**
         * ����ʼַ
         */
        private int head;
        /**
         * ����״̬
         */
        private boolean isFree;

        public Zone(int head, int size) {
            this.head = head;
            this.size = size;
            this.isFree = true;
        }
    }

    /**
     * Ĭ���ڴ��СΪ 100 KB
     */
    public Memory(){
        this.size = 100;
        this.pointer = 0;
        this.zones = new LinkedList<>();
        zones.add(new Zone(0, size));
    }
    public Memory(int size) {
        this.size = size;
        this.pointer = 0;
        this.zones = new LinkedList<>();
        zones.add(new Zone(0, size));
    }

    /**
     * �ڴ����
 ָ����Ҫ����Ĵ�С
     */
    public void allocation(int size){
        System.out.println("1.FirstFit 2.NextFit 3.BestFit 4.WorstFit");
        System.out.print("��ѡ������㷨:");
        Scanner in = new Scanner(System.in);
        int algorithm = in.nextInt();
        switch (algorithm){
            case 1:
                fristFit(size);break;
            case 2:
                nextFit(size);break;
            case 3:
                bestFit(size);break;
            case 4:
                worstFit(size);break;
            default:
                System.out.println("������ѡ��!");
        }
    }

    /**
     * �״���Ӧ�㷨
 ָ����Ҫ����Ĵ�С
     */
    private void fristFit(int size){
        //������������
        for (pointer = 0; pointer < zones.size(); pointer++){
            Zone tmp = zones.get(pointer);
            //�ҵ����÷����������Ҵ�С�㹻��
            if (tmp.isFree && (tmp.size > size)){
                doAllocation(size, pointer, tmp);
                return;
            }
        }
        //����������δ�ҵ����÷���, ���ڴ����ʧ��
        System.out.println("�޿����ڴ�ռ�!");
    }

    /**
     * ѭ���״���Ӧ�㷨
  	ָ����Ҫ����Ĵ�С
     */
    private void nextFit(int size){
        //���ϴη��������λ�ÿ�ʼ������������
        Zone tmp = zones.get(pointer);
        if (tmp.isFree && (tmp.size > size)){
            doAllocation(size, pointer, tmp);
            return;
        }
        int len = zones.size();
        int i = (pointer + 1) % len;
        for (; i != pointer; i = (i+1) % len){
            tmp = zones.get(i);
            //�ҵ����÷����������Ҵ�С�㹻��
            if (tmp.isFree && (tmp.size > size)){
                doAllocation(size, i, tmp);
                return;
            }
        }
        //����������δ�ҵ����÷���, ���ڴ����ʧ��
        System.out.println("�޿����ڴ�ռ�!");
    }

    /**
     * �����Ӧ�㷨
     *  ָ����Ҫ����Ĵ�С
     */
    private void bestFit(int size){
        int flag = -1;
        int min = this.size;
        for (pointer = 0; pointer < zones.size(); pointer++){
            Zone tmp = zones.get(pointer);
            if (tmp.isFree && (tmp.size > size)){
                if (min > tmp.size - size){
                    min = tmp.size - size;
                    flag = pointer;
                }
            }
        }
        if (flag == -1){
            System.out.println("�޿����ڴ�ռ�!");
        }else {
            doAllocation(size, flag, zones.get(flag));
        }
    }

    /**
     * ���Ӧ�㷨
     *  ָ����Ҫ����Ĵ�С
     */
    private void worstFit(int size){
        int flag = -1;
        int max = 0;
        for (pointer = 0; pointer < zones.size(); pointer++){
            Zone tmp = zones.get(pointer);
            if (tmp.isFree && (tmp.size > size)){
                if (max < tmp.size - size){
                    max = tmp.size - size;
                    flag = pointer;
                }
            }
        }
        if (flag == -1){
            System.out.println("�޿����ڴ�ռ�!");
        }else {
            doAllocation(size, flag, zones.get(flag));
        }
    }

    /**
     * ִ�з���
     *  size �����С
     *  location ��ǰ���÷���λ��
     *  tmp ���ÿ�����
     */
    private void doAllocation(int size, int location, Zone tmp) {
        //����ָ�����ʣ���С��С��MIN_SIZE���򽫷���ȫ�����䣬����ָ�Ϊ��������
        if (tmp.size - size <= MIN_SIZE){
            tmp.isFree = false;
        } else {
            Zone split = new Zone(tmp.head + size, tmp.size - size);
            zones.add(location + 1, split);
            tmp.size = size;
            tmp.isFree = false;
        }
        System.out.println("�ɹ����� " + size + "KB �ڴ�!");
    }

    /**
     * �ڴ����
     * id ָ��Ҫ���յķ����ú�
     */
    public void collection(int id){
        if (id >= zones.size()){
            System.out.println("�޴˷������!");
            return;
        }
        Zone tmp = zones.get(id);
        int size = tmp.size;
        if (tmp.isFree) {
            System.out.println("ָ������δ������, �������");
            return;
        }
        //������շ�������β�����Һ�һ������Ϊ����, �����һ�������ϲ�
        if (id < zones.size() - 1 && zones.get(id + 1).isFree){
            Zone next = zones.get(id + 1);
            tmp.size += next.size;
            zones.remove(next);
        }
        //������շ��������׷�����ǰһ������Ϊ����, ����ǰһ�������ϲ�
        if (id > 0 && zones.get(id - 1).isFree){
            Zone previous = zones.get(id - 1);
            previous.size += tmp.size;
            zones.remove(id);
            id--;
        }
        zones.get(id).isFree = true;
        System.out.println("�ڴ���ճɹ�!, ���λ����� " + size + "KB �ռ�!");
    }

    /**
     * չʾ�ڴ����״��
     */
    public void showZones(){
        System.out.println("------------------------------------");
        System.out.println("�������\t����ʼַ\t������С\t����״̬\t");
        System.out.println("------------------------------------");
        for (int i = 0; i < zones.size(); i++){
            Zone tmp = zones.get(i);
            System.out.println(i + "\t" + tmp.head + "\t" +
                                tmp.size + "\t" + tmp.isFree);
        }
        System.out.println("------------------------------------");
    }
}
