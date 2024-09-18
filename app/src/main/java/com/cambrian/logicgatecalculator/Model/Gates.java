package com.cambrian.logicgatecalculator.Model;

public class Gates {

    /**
     * And logic gate
     *
     * @return
     */
    public static int and(int a, int b) {
        return a & b;
    }

    /**
     * Or logic gate
     *
     * @return
     */
    public static int or(int a, int b) {
        return a | b;
    }

    /**
     * Xor logic gate
     *
     * @return
     */
    public static int xor(int a, int b) {
        return a ^ b;
    }

    /**
     * Not logic gate
     *
     * @return
     */
    public static int not(int a, int b) {
        return ~a;
    }

    /**
     * Nand logic gate
     *
     * @return
     */
    public static int nand(int a, int b) {
        return ~(a & b);
    }

    /**
     * Nor logic gate
     *
     * @return
     */
    public static int nor(int a, int b) {
        return ~(a | b);
    }


}
