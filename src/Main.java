import com.fahimhossain.bongomultimedia.core.actions.ForwardAction;
import com.fahimhossain.bongomultimedia.core.actions.PlayAction;
import com.fahimhossain.bongomultimedia.core.commands.Command;
import com.fahimhossain.bongomultimedia.core.commands.ForwardCommand;
import com.fahimhossain.bongomultimedia.core.commands.PlayCommand;
import test.one.anagram.AnagramChecker;
import test.three.player.actions.ForwardActionImpl;
import test.three.player.actions.PlayActionImpl;
import test.two.Vehicle.*;

public class Main {

    public static void main(String[] args) {


        //Test 1
        AnagramChecker anagramChecker = new AnagramChecker();
        System.out.println("Is  a m on and m don     anagram? ans: " + anagramChecker.isAnagram(" a m on", "m don     "));


        //Test 2
        VehicleBuilder builder = new CarBuilder();
        Vehicle car = configureBuild(builder).build();

        builder = new PlaneBuilder();
        Vehicle plane = configureBuild(builder).build();
        plane.has_gas();

        VehicleFactory vehicleFactory= new CarFactory(4,4,true);
        car= vehicleFactory.create();
        car.set_num_of_passengers();

        vehicleFactory= new PlaneFactory(4,400,true);
        plane= vehicleFactory.create();
        plane.set_num_of_passengers();


        //Test 3
        PlayAction playAction= new PlayActionImpl();
        Command command= new PlayCommand(playAction);
        command.execute();

        ForwardAction forwardAction= new ForwardActionImpl();
        command= new ForwardCommand(forwardAction);
        command.execute();







    }

    public static VehicleBuilder configureBuild(VehicleBuilder builder) {
        return builder.setHasGas(true).setNumOfPassengers(2).setNumOfWheels(3);
    }
}
