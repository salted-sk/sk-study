package com.sk.algorithm;

import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2021/9/17 21:39
 */
public class Mutou {

    static Mu[] mudui = new Mu[10];
    static int[] index = new int[10];
    static {
        for (int i = 0; i < mudui.length; i++) {
            mudui[i] = new Mu(i);
            index[i] = i;
        }
    }
    public static void main(String[] args) {

        Boolean aa = null;
        boolean b = false;
        boolean c = aa==null? b :  aa||b;
        System.out.println(c);

        matb(9,1);
        maob(8,1);
        maob(7,1);
        maob(6,1);
        paob(8,6);
        paob(8,5);
        maob(2,1);
        maob(4,9);
        System.out.println(1);
    }

    public static void matb(int a, int b) {
       reduction(a);
       reduction(b);
       atob(a,b);
    }
    public static void maob(int a, int b) {
        reduction(a);
        atob(a,b);
    }
    public static void paob(int a, int b) {
        atob(a,b);
    }

    public static void atob(int a, int b) {
        Mu ap = null, ma = null,mb = null;
        //所在数组
        int indexa = 0,indexb = 0;
        boolean as = false;
        for (int i = 0; i < mudui.length; i++) {
            Mu mu = mudui[i];
            if (mu != null) {
                if (mu.id == a) {
                    ma = mudui[i];
                    indexa = i;
                    ap = null;
                    as = true;
                }
                if (mu.id == b) {
                    mb = mudui[i];
                    indexb = i;
                }
                while (mu.next != null) {
                    if (!as) {
                        ap = mu;
                    }
                    mu = mu.next;
                    if (!as && mu.id == a) {
                        ma = mu;
                        indexa = i;
                        as = true;
                    }
                    if (mu.id == b) {
                        mb = mu;
                        indexb = i;
                    }
                }
            }
        }
        if (indexa == indexb ){
            return;
        }

        //移动
        while (mb.next !=null) {
            mb = mb.next;
        }
        mb.next = ma;
        if (ap == null) {
            mudui[indexa] = null;
        } else {
            ap.next= null;
        }


    }



    //获取木块位置
    public static Mu mu(int a) {
        for (Mu mu : mudui) {
            if (mu != null) {
                if (mu.id != a) {
                    while (mu.next != null) {
                        System.out.println(1);
                        mu = mu.next;
                        if (mu.id == a) {
                            return mu;
                        }
                    }
                } else {
                    return mu;
                }
            }
        }
        return null;
    }

    //还原
    public static void reduction (int a) {
        //获取木块a的位置
        Mu ema = mu(a);
        while (ema.id != a) {
            ema = ema.next;
        }
        //a上方木块
        Mu emaUp = ema.next;
        //a上方木块清空
        ema.next = null;
        //开始移动
        Mu mmu;
        while (emaUp != null) {
            mmu = emaUp;
            emaUp = emaUp.next;
            mmu.next = null;
            if (mudui[mmu.id] == null) {
                mudui[mmu.id] = mmu;
            } else {
                mmu.next = mudui[mmu.id];
                mudui[mmu.id] = mmu;
            }
        }
    }



//    public static void matb(int a, int b){
//        Mu ma = mudui[a];
//        while (ma != null) {
//            mudui[ma.id] = new Mu(ma.id);
//            ma = ma.next;
//        }
//
//        Mu mb = mudui[b];
//        while (mb != null) {
//            mudui[mb.id] = new Mu(mb.id);
//            mb = mb.next;
//        }
//
//        if (mudui[a] != null) {
//            if (mudui[b] != null) {
//                mudui[b].next = mudui[a];
//            }
//        } else {
//            mudui[b] = mudui[a];
//        }
//        mudui[a] =null;
//    }
//
//    public static void maob(int a, int b){
//        Mu ma = mudui[a];
//        while (ma != null) {
//            mudui[ma.id] = new Mu(ma.id);
//            ma = ma.next;
//        }
//
//        if (mudui[a] != null) {
//            Mu mb = mudui[b];
//            if (mb != null) {
//                while (mb.next != null) {
//                    mb = mb.next;
//                }
//                mb.next = mudui[a];
//            } else {
//                mudui[b] = mudui[a];
//            }
//            mudui[a] = null;
//        }
//
//    }
//
//    public static void paob(int a, int b){
//        if (mudui[b] != null) {
//            Mu mb = mudui[b];
//            while (mb.next !=null) {
//                mb = mb.next;
//            }
//            mb.next = mudui[a];
//        } else {
//            mudui[b] = mudui[a];
//        }
//        mudui[a] = null;
//    }







    static class Mu{

        int id;
        Mu next;
        Mu(int id){
            this.id = id;
        }
    }
}
