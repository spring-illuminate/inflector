import github.illuminate.Inflector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {

    private final Inflector inflector;

    public TestExample(Inflector inflector) {
        this.inflector = inflector;
    }

    public void test(){

        String str = this.inflector.plural("GoodOrder"); // GoodOrders

        str = this.inflector.snake(str,"_"); // good_orders

    }

}
