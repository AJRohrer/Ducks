import DuckTypes.Duck;
import DuckTypes.MallardDuck;
import DuckTypes.WoodenDuck;

public class DuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        Duck wooden = new WoodenDuck();

        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        System.out.println("-------- New Duck---------");

        wooden.display();
        wooden.performQuack();
        wooden.performFly();
        wooden.swim();

        System.out.println("------All ducks accounted for------");
    }
}
