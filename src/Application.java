import core.ConjunctionEngine;
import core.ListInitializer;

public class Application {

    public static void main(String[] args) {
        ListInitializer initializer = new ListInitializer();
        ConjunctionEngine conjunctionEngine = new ConjunctionEngine();

        String result = conjunctionEngine.performConjunction(initializer.initializeFirstList(),
                initializer.initializeSecondList());

        System.out.println(String.format("\n\nConjunction result: %s", result));
    }

}
