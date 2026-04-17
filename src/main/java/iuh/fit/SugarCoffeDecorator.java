package iuh.fit;

public class SugarCoffeDecorator extends DecoratorCoffe{
    public SugarCoffeDecorator(Coffe coffe) {
        super(coffe);
    }
    @Override
    public String description() {
        return coffe.description() + " đường";
    }
}
