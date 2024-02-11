//64050030 Kitipum Nornua

public class Publisher extends Source{
    private String result;

    public void setResult(String data){        
        result = data;
        notifyObservers();
    }

    public String getResult() {
	    return result;
    }
}
