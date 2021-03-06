package wsb.devices;

import wsb.creatures.Human;
import static java.lang.System.out;

public class Phone extends Device {
    final Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
        super(producer,model);
        this.screenSize = screenSize;
    }
    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {

    }

    @Override
    public void turnOn() {
        out.println("phone is turned on");
    }

    public void sell(){
        out.println("phone is on");
    }

    public void installAnApp(String name){
        installAnApp(name, 0.0);
    }
    public void installAnApp(String name, Double version){
        out.println(" " + name + " was installed. Now you have the version: " + version);
    }

    public void installAnApp(String[] apps) {
        for (String app : apps) {
            installAnApp(app);
        }
    }

}
