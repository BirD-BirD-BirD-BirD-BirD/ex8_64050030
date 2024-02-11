import java.util.ArrayList;
import java.util.List;
//64050030 Kitipum Nornua

public class RemoteControl {
    private List<Airconditioner> airconditionerList = new ArrayList<>();
    private List<Light> lightList = new ArrayList<>();

    public void addAirconditioner(Airconditioner airconditioner){
        airconditionerList.add(airconditioner);
    }

    public void addLight(Light light){
        lightList.add(light);
    }

    public void removeAirconditionerOrder(Airconditioner airconditioner){
        if (airconditionerList.size() != 0) {
            airconditionerList.remove(airconditionerList.indexOf(airconditioner));    
        }
    }

    public void removeLightOrder(Light light){
        if (lightList.size() != 0) {
            lightList.remove(lightList.indexOf(light));    
        }
    }

    public void airconditionerOn(Airconditioner airconditioner, int temp){        
        if(airconditionerList.contains(airconditioner)){
            int index = airconditionerList.indexOf(airconditioner);
            airconditionerList.get(index).on();
            airconditionerList.get(index).setTemp(temp);
        }
        
    }

    public void airconditionerOff(Airconditioner airconditioner){        
        if(airconditionerList.contains(airconditioner)){
            int index = airconditionerList.indexOf(airconditioner);
            airconditionerList.get(index).off();
        }        
    }

    public void lightOn(Light light){
        
        if(lightList.contains(light)){
            int index = lightList.indexOf(light);
            lightList.get(index).on();
        }
        
    }

    public void lightOff(Light light){
        if(lightList.contains(light)){
            int index = lightList.indexOf(light);
            lightList.get(index).off();
        }    
    }

    
}
