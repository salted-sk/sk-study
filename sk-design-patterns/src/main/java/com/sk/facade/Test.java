package com.sk.facade;

import java.util.concurrent.ThreadLocalRandom;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/12/4 15:36
 */
public class Test {

    public static void main(String[] args) {
        String phoneNo = "8613275829049";
            if (phoneNo.matches("^[0-9]+(.[0-9]+)?$")){
                if (phoneNo.startsWith("1")){
                    phoneNo = "86" + phoneNo;
                }
                phoneNo = phoneNo + "," + phoneNo;

                ThreadLocalRandom random =  ThreadLocalRandom.current();
                random.nextInt(1000000);
            }
    }

}
