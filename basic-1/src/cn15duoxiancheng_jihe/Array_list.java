package cn15duoxiancheng_jihe;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Array_list {

    public static void main(String[] args) throws Exception{
        ArrayList<Integer> arrayList=new ArrayList<>();
        new Thread(()->{
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
