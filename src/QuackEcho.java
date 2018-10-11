public class QuackEcho implements Quackable{
    protected Quackable quack;

    public QuackEcho(Quackable quack) {
        this.quack = quack;
    }

    @Override
    public void quack() {
        quack.quack();
        System.out.println("Echo :");
        quack.quack();
    }
}
