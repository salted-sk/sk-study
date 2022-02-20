package com.sk.tree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2021/9/16 16:59
 */
public class Rbt {

    public static  int getAge(Date birthDay) throws Exception {
        // 当前时间
        Calendar curr = Calendar.getInstance();
        // 生日
        Calendar born = Calendar.getInstance();
        born.setTime(birthDay);
        // 年龄 = 当前年 - 出生年
        int age = curr.get(Calendar.YEAR) - born.get(Calendar.YEAR);
        if (age <= 0) {
            return 0;
        }
        // 如果当前月份小于出生月份: age-1
        // 如果当前月份等于出生月份, 且当前日小于出生日: age-1
        int currMonth = curr.get(Calendar.MONTH);
        int currDay = curr.get(Calendar.DAY_OF_MONTH);
        int bornMonth = born.get(Calendar.MONTH);
        int bornDay = born.get(Calendar.DAY_OF_MONTH);
        if ((currMonth < bornMonth) || (currMonth == bornMonth && currDay <= bornDay)) {
            age--;
        }
        return age < 0 ? 0 : age;
    }

    public static  Date parse(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(strDate);
    }

    public static void main(String[] args) {


        try {
            int  age = getAge(parse("1994-06-15"));           //由出生日期获得年龄***
            System.out.println("age:"+age);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Node root;

    private Node emptyNode = new Node();

    enum Color{
        RED, BLACK;
    }

    class Node {
        Color color;
        Node PNode;
        Node LNode;
        Node RNODE;
        String name;
    }

    public void insert(String name) {
        if (name != null && !name.equals("")) {
            Node node = new Node();
            node.name = name;
        }
    }


    public void insert(Node node){
        if (root == null) {
            node.color = Color.BLACK;
            root =node;
            return;
        }
    }



}
