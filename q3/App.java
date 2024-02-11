//64050030 Kitipum Nornua

public class App {

    static int poolSize = 6;
    public static void main(String[] args){
        Airconditioner bedroomAirconditioner = new Airconditioner("Bedroom");
        Light bedroomLight = new Light("Bedroom");

        Airconditioner kitchenAirconditioner = new Airconditioner("Kitchen");
        Light kitchenLight = new Light("Kitchen");
    
        RemoteControl remoteControl = new RemoteControl();

        System.out.println("Slot 0, light Bedroom");
        remoteControl.addLight(bedroomLight);
        action_turnOnLight(remoteControl,bedroomLight);
        action_turnOffLight(remoteControl,bedroomLight);
        System.out.println("--------------------------------");

        System.out.println("Slot 1, light Kitchen");
        remoteControl.addLight(kitchenLight);
        action_turnOnLight(remoteControl,kitchenLight);
        action_turnOffLight(remoteControl,kitchenLight);
        System.out.println("--------------------------------");

        System.out.println("Slot 2, AC Bedroom");
        remoteControl.addAirconditioner(bedroomAirconditioner);
        action_turnOnAirconditioner(remoteControl,bedroomAirconditioner,25);
        action_turnOffAirconditioner(remoteControl, bedroomAirconditioner);
        System.out.println("--------------------------------");

        System.out.println("test one unavailable slot, Slot 3");
        remoteControl.addAirconditioner(kitchenAirconditioner);
        action_turnOnAirconditioner(remoteControl, kitchenAirconditioner, 25);
        action_turnOffAirconditioner(remoteControl, kitchenAirconditioner);
        System.out.println("--------------------------------");
    }

    private static void action_turnOnAirconditioner(RemoteControl remoteControl, Airconditioner airconditioner, int temp){
        if(poolSize > 0){
            remoteControl.airconditionerOn(airconditioner,temp);
            poolSize--;
        }else{
            System.out.println("On button No command is assigned to this slot");
        }        
    }

    private static void action_turnOffAirconditioner(RemoteControl remoteControl, Airconditioner airconditioner){
        if(poolSize > 0){
            remoteControl.airconditionerOff(airconditioner);
            poolSize--;
        }else{
            System.out.println("Off button No command is assigned to this slot");
        }
    }

    private static void action_turnOnLight(RemoteControl remoteControl, Light light){
        if(poolSize > 0){
            remoteControl.lightOn(light);
            poolSize--;
        }else{
            System.out.println("On button No command is assigned to this slot");
        }
    }

    private static void action_turnOffLight(RemoteControl remoteControl, Light light){
        if(poolSize > 0){
            remoteControl.lightOff(light);
            poolSize--;
        }else{
            System.out.println("Off button No command is assigned to this slot");
        }
    }

}
