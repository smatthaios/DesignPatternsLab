package gr.regenerationcodingschool.patterns.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Client
public class CommandDemo {

    public static void main(String args[]) {
        //Initialize lights
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Light livingroomLight = new Light();
        Switch lightSwitch = new Switch();

        // Toggle lights
        sampleToggleLights(bedroomLight, kitchenLight, lightSwitch);
        //sampleToggleLights(Arrays.asList(bedroomLight, kitchenLight), lightSwitch);

        // Switch off all open lights
        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);
        lights.add(livingroomLight);

        Command allLightsCommand = new AllLightsOffCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);
    }

    private static void sampleToggleLights(Light bedroomLight, Light kitchenLight, Switch lightSwitch) {
        //bedroomLight.toggle();
        //kitchenLight.toggle();

        Command toggleCommand = new ToggleCommand(bedroomLight);
        Command toggleCommand2 = new ToggleCommand(kitchenLight);

        // With Java 8 Functional Interfaces
        //Command toggleCommand = () -> bedroomLight.toggle();
        //Command toggleCommand2 = kitchenLight::toggle;

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand2);

        //Bedroom and kitchen light on. Living room light off
    }

    private static void sampleToggleLights(List<Light> lights, Switch lightSwitch) {
        lights.forEach(light -> lightSwitch.storeAndExecute(light::toggle));
    }
}
