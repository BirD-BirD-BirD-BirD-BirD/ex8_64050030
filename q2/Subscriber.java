//64050030 Kitipum Nornua

public class Subscriber implements Observer{

    @Override
    public void update(Source source) {
        //casting is a must
        System.out.println("live result: " + ((Publisher)source).getResult());
    }
    
}
