package iuh.fit;

public class MilkDecorator extends DecoratorCoffe{
    public MilkDecorator(Coffe coffe) {
        super(coffe);
    }
    @Override
    public String description() {
        return coffe.description() + " sữa";
    }
}
