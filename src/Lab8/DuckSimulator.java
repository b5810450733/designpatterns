package Lab8;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory echoingDuckFactory = new EchoingDuckFactory();

        simulator.simulate(duckFactory);
        System.out.println();
        simulator.simulate(countingDuckFactory);
        System.out.println();
        simulator.simulate(echoingDuckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        Flock flockOfDucks1 = new Flock();
        flockOfDucks1.add(gooseDuck);
        flockOfDucks1.add(mallardDuck);
        flockOfDucks1.add(redheadDuck);
        flockOfDucks1.add(rubberDuck);
        flockOfDucks1.add(pigeonDuck);

        Flock flockOfDucks2 = new Flock();
        flockOfDucks2.add(pigeonDuck);
        flockOfDucks2.add(rubberDuck);
        flockOfDucks2.add(redheadDuck);
        flockOfDucks2.add(mallardDuck);
        flockOfDucks2.add(gooseDuck);

        flockOfDucks2.add(flockOfDucks1);

        System.out.println("**Lab8.Flock 1**");
        simulate(flockOfDucks1);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
        System.out.println();

        System.out.println("**Lab8.Flock 2**");
        simulate(flockOfDucks2);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
        System.out.println();

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }


}
