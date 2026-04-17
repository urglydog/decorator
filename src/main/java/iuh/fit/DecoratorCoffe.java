package iuh.fit;

public abstract class DecoratorCoffe implements Coffe{
    protected Coffe coffe;
    public DecoratorCoffe(Coffe coffe) {
        this.coffe = coffe;
    }
    @Override
    public String description() {
        return coffe.description();
    }
}
