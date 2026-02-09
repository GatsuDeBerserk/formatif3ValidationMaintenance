package org.climoilou.vetm.formatif2;

public class calculatrice {


    public calculatrice() {

    }

    public int add(String nombres) {
//        nombres.toCharArray();
        if (nombres.length() == 1) {
            return Integer.parseInt(nombres);
        } else if (nombres.length() == 3) {
            return nombres.charAt(0) + nombres.charAt(2);
        }
        return 0;
    }
}