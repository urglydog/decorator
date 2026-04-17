package iuh.fit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffe cf = new BasicCoffe();
        System.out.println(cf.description());
        cf = new MilkDecorator(cf);
        System.out.println(cf.description());

        cf = new SugarCoffeDecorator(cf);
        System.out.println(cf.description());
    }
}