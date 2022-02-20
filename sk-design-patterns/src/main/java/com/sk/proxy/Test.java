package com.sk.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/19 7:41
 */
public class Test {

    public static void main(String[] args) {

        Set<Long> set = new HashSet<>();
        set.add(1L);
        set.add(2L);
        set.add(3L);
        set.add(null);
        set.forEach(s -> {
            System.out.println(1);
        });
        System.out.println(set.size());








        try {
            InetAddress inte=InetAddress.getLocalHost();
            System.out.println(1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


        Process p = null;
        try {
            p = Runtime.getRuntime().exec("ipconfig /all");
            BufferedReader br = new BufferedReader(new InputStreamReader(p
                    .getInputStream()));
            String inline;
            while ((inline = br.readLine()) != null) {
                System.out.println(inline);

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd+hh:mm:ss");
        String[] datetime = dateFormat.format(new Date()).split("\\+");
        System.out.println(datetime[0]);

    }

}
