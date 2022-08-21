import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //inputFormula
        String formula_text = scan.nextLine();

        //formulaNumberArray -> formulaNumbers
        String[] formula_numAry = formula_text
                .replaceAll("\\s", "")
                .split("\\+|-|\\*|/");

        //formulaSymbolArray -> formulaSymbols
        String[] formula_symbolAry = formula_text
                .replaceAll("\\s", "")
                .replaceAll("[0-9]", "")
                .split("");


        int result = 0;
        for (int z = 0; z < formula_symbolAry.length; z++) {
            if (z > 0) {
                if (formula_symbolAry[z].equals("+")) result += Integer.parseInt(formula_numAry[z + 1]);

                else if (formula_symbolAry[z].equals("-")) result -= Integer.parseInt(formula_numAry[z + 1]);

                else if (formula_symbolAry[z].equals("*")) result *= Integer.parseInt(formula_numAry[z + 1]);

                else if (formula_symbolAry[z].equals("/")) result /= Integer.parseInt(formula_numAry[z + 1]);
            } else {
                if (formula_symbolAry[z].equals("+")) result = Integer.parseInt(formula_numAry[z]) + Integer.parseInt(formula_numAry[z + 1]);

                else if (formula_symbolAry[z].equals("-")) result = Integer.parseInt(formula_numAry[z]) - Integer.parseInt(formula_numAry[z + 1]);

                else if (formula_symbolAry[z].equals("*")) result = Integer.parseInt(formula_numAry[z]) * Integer.parseInt(formula_numAry[z + 1]);

                else if (formula_symbolAry[z].equals("/")) result = Integer.parseInt(formula_numAry[z]) / Integer.parseInt(formula_numAry[z + 1]);
            }
        }
        System.out.println("answer = "+result);
    }
}
