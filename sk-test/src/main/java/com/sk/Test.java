package com.sk;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/12/11 9:22
 */
public class Test {

    private static TwoPlug twoPlug = new TwoPlug();

    static {
        twoPlug.setName("1");
        TwoPlug l2 = new TwoPlug();
        l2.setName("l2");

        twoPlug.setLeft(l2);
        TwoPlug r2 = new TwoPlug();
        r2.setName("r2");
        twoPlug.setRight(r2);
        TwoPlug l2l3 = new TwoPlug();
        l2l3.setName("l2l3");
        TwoPlug l2r3 = new TwoPlug();
        l2r3.setName("l2r3");
        l2.setLeft(l2l3);
        l2.setRight(l2r3);

        TwoPlug r2l3 = new TwoPlug();
        r2l3.setName("r2l3");
        TwoPlug r2r3 = new TwoPlug();
        r2r3.setName("r2r3");
        r2.setLeft(r2l3);
        r2.setRight(r2r3);

    }

    public static void main(String[] args) {
        read(twoPlug);



    }

    public static void read(TwoPlug twoPlug){
        if (twoPlug != null) {
            System.out.println(twoPlug.getName());
            if (twoPlug.getLeft() != null) {
                read(twoPlug.getLeft());
            }
            if (twoPlug.getRight() != null) {
                read(twoPlug.getRight());
            }
        }
    }

}
