package core;

import java.util.List;

public class ConjunctionEngine {

    public String performConjunction(List<String> firstOperand, List<String> secondOperand) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < secondOperand.size(); i++) {
            if (firstOperand.get(i).equals(secondOperand.get(i)))
                result.append("1");
            else result.append("0");
        }

        appendFinishZeroes(result, firstOperand.size() - secondOperand.size());

        return result.toString();
    }

    private void appendFinishZeroes(StringBuffer result, int resultFinishZeroCount) {
        if (resultFinishZeroCount > 0) {
            for (int i = 0; i < resultFinishZeroCount; i++) {
                result.append("0");
            }
        }
    }

}
