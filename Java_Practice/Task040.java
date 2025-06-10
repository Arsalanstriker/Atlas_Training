abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}
// Concrete class implementing the abstract methods
class TVRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
class ACRemote extends Gadgets {
    //@Override
    void turnOn() {
        System.out.println("AC is turned ON.");
    }

    //@Override
    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

// Main class to demonstrate abstraction
class Main {
    Main() {
    }

    public static void main(String[] args) {
        Gadgets remote = new TVRemote();
        remote = new ACRemote();
        remote.turnOn();
        remote.turnOff();

        remote = new FanRemote() {
            //@Override
            void turnOn() {

            }

            //@Override
            void turnOff() {

            }
        };
        remote = new CoolerRemote() {
            //@Override
            void turnOn() {

            }

            //@Override
            void turnOff() {

            }
        };
        remote.turnOn();
        remote.turnOff();
    }

    public static Main createMain() {
        return new Main();
    }

    private static abstract class FanRemote extends Gadgets {
    }

    private static abstract class CoolerRemote extends Gadgets {
    }
}
