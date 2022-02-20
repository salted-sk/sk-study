package com.sk.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2021/9/16 21:35
 */
public class Base {

    public static void main(String[] args) {



        Map map = shaizi(3, new HashMap<>());
        map = shaizi(2, map);
        map = shaizi(3, map);


        System.out.println(1);
    }




    public static Map<Integer, Integer> shaizi(int x, Map<Integer, Integer> map) {
        Map<Integer, Integer> map1 = new HashMap<>();
        if (map.entrySet().size() == 0) {
            for (int i = 1; i < x+1; i++) {
                map1.put(i, 1);
            }
        } else {
            for (int i = 1; i < x+1; i++) {
                for (Map.Entry<Integer, Integer> next : map.entrySet()) {
                    Integer key = next.getKey();
                    Integer value = next.getValue();
                    Integer key2 = key + i;
                    if (map1.get(key2) != null) {
                        map1.put(key2, map1.get(key2)+ value);
                    } else {
                        map1.put(key2, value);
                    }
                }

            }

        }
        return map1;


































//        Map<Integer, Integer> map1 = new HashMap(map);
//        for (int i = 1; i < x + 1; i++) {
//            if (map1.entrySet().size() == 0) {
//                map.put(i,1);
//            } else {
//                Iterator<Map.Entry<Integer, Integer>> iterator = map1.entrySet().iterator();
//                if (iterator.hasNext()) {
//                    Map.Entry<Integer, Integer> integerIntegerEntry = iterator.next();
//                    Integer key = integerIntegerEntry.getKey();
//                    Integer key2 = key + i;
//                    if (integerIntegerEntry.getValue()> 2) {
//                        map.put(key, map.get(key) - 1);
//                    } else {
//                        map.remove(key);
//                    }
//                    if (map.get(key2) != null) {
//                        map.put(key2,map.get(key2) + 1);
//                    } else {
//                        map.put(key2,1);
//                    }
////                    map.merge(key2, 1, Integer::sum);
//                }
//
//            }
//
//        }
//        return map;
    }

    public static void shaizi(int x, int y, int z) {
        long start  = System.currentTimeMillis();
        Map<Integer, Integer> map = new HashMap();
        int count;
        for (int i = 1; i < x+1; i++) {
            for (int j = 1; j < y+1; j++) {
                for (int k = 1; k < 1+z; k++) {
                    count = i + j+ k;
                    Integer integer = map.get(count);
                    if (integer != null) {
                        map.put(count,integer+1);
                    } else {
                        map.put(count,1);
                    }
                }
            }
        }
        int max = 0;
        int size = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (max < integerIntegerEntry.getValue()) {
                max = integerIntegerEntry.getValue();
                size = integerIntegerEntry.getKey();
            }
        }
        System.out.println(size);
        long end  = System.currentTimeMillis();
        System.out.println("用时" + (end - start));
    }

    public static void shaizi2(int x, int y, int z) {
        long start  = System.currentTimeMillis();
        Map<Integer, Integer> map = new HashMap();
        int count;
        int max = 0;
        int size = 0;
        for (int i = 1; i < x+1; i++) {
            for (int j = 1; j < y+1; j++) {
                for (int k = 1; k < 1+z; k++) {
                    count = i + j+ k;
                    Integer integer = map.get(count);
                    if (integer != null) {
                        map.put(count,integer+1);
                        if (max < integer + 1) {
                            max = integer +1;
                            size = count;
                        }
                    } else {
                        map.put(count,1);
                    }
                }
            }
        }

        System.out.println(size);
        long end  = System.currentTimeMillis();
        System.out.println("用时" + (end - start));
    }





    public static class LIDI{


        public static DI[][] dipi= new DI[4][6];

        static {
            for (int i = 0; i < dipi.length; i++) {
                for (int i1 = 0; i1 < dipi[i].length; i1++) {
                    dipi[i][i1] = new DI(false);
                }
            }
        }

        public static void li(int x1, int y1, int x2, int y2){
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j<= y2; j++) {
                    dipi[i][j] = new DI(true);
                }
            }
        }


//        public static void


        static class DI{
            boolean status;

            DI(boolean status) {
                this.status = status;
            }
        }



    }
}
