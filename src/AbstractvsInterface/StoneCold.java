package AbstractvsInterface;

public class StoneCold implements WrestlerInterface , FoodInterface {
    @Override
    public void paymentForWork(int hours) {
        System.out.println("Stone cold will make $" + hours*300.00);
    }
    @Override
    public void themeMusic() {       
        System.out.println("Stone cold's music playing...");
    }

    @Override
    public void finisher() {        
        System.out.println("Stone cold's finishing stunner...");
    }
}