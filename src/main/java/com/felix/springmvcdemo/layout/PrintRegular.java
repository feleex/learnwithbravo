package com.felix.springmvcdemo.layout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/**
 * @author felix
 * @date 2020-11-16 23:19
 */
public class PrintRegular {
    public static List<Integer> nums =new ArrayList<>();
    public static List<String> strings=new ArrayList<>();
    static {
        for (int i = 1; i <=26; i++) {
            nums.add(i);
            strings.add(String.valueOf((char)(i+64)));
        }
    }
    public static void main(String[] args) {
        Mythread mythread1=new Mythread("t1",nums);
        Mythread mythread2=new Mythread("t2",strings);
        mythread1.setThread(mythread2);
        mythread2.setThread(mythread1);
        mythread1.setFlag(true);
        mythread2.setFlag(false);
        mythread1.start();
        mythread2.start();

    }

}
class Mythread extends Thread{
    private  String name;
    List<Object> list;
    int order=0;
    Thread thread;
    boolean flag;
    public Mythread(String name,List list){
        this.name=name;
        this.list=list;
    }
    public void setThread( Thread thread){
        this.thread=thread;
    }
    public void setFlag(boolean flag){
        this.flag=flag;
    }
    @Override
    public void run(){
        if (this.thread==null){
            System.out.println("没有兄弟线程");
            return;
        }
        if (this.flag==false){
            flag=true;
            LockSupport.park();

        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
            LockSupport.unpark(thread);
            LockSupport.park();
        }

    }

}
