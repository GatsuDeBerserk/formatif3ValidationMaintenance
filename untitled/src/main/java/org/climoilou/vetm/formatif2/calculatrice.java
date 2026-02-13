package org.climoilou.vetm.formatif2;
//Ludovick et éthienne
public class calculatrice {

    public int add(String nombres) {
        if (nombres.isEmpty()) return 0;
        verifierSiStringCorrect(nombres);

        int total;
        if (nombres.charAt(0) == '/' && nombres.charAt(1) == '/') {
            total = algoDelimiteurNombre(nombres);
        } else {
            total = algoCalcul(nombres);
        }

        return total;
    }

    private int algoCalcul(String nombres) {
        String vigulesRemplacer = "";
        String separator = ",";

        for (int i = 0; i < nombres.length(); i++) {
            if (nombres.charAt(i) == '\n') {
                vigulesRemplacer += separator;
            } else {
                vigulesRemplacer += nombres.charAt(i);
            }
        }

        return split(vigulesRemplacer, separator);
    }

    private int split(String str, String separator) {
        int total = 0;
        String[] nbs = str.split(separator);

        for (String nb : nbs) {
            total += Integer.parseInt(nb);
        }

        return total;
    }

    private int algoDelimiteurNombre(String nombres) {
        String strModifier = "";
        String separator = String.valueOf(nombres.charAt(2));

        int index = nombres.indexOf('\n');
        if (index != -1) {
            strModifier = nombres.substring(index + 1);
        }

        return split(strModifier, separator);
    }

    private void verifierSiStringCorrect(String nombres) {
        if (!Character.isDigit(nombres.charAt(nombres.length() - 1))) {
            throw new SeparatorAtTheEndException();
        }
        if (nombres.contains("-")) {
//            char[] tab=nombres.toCharArray();
//            for (char lettre :tab){
//
//            }
            throw new NegativeNumberException();
        }
    }
}
