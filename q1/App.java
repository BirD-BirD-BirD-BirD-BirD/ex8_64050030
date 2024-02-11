//64050030 Kitipum Nornua
public class App {
    //use strategy design pattern. The program violate SOLID at ImageManager 
    public static void main(String[] args) {
        ImageManager manager = new ImageManager();
		//manager.setRenderer(new SmartphoneRenderer());
        manager.setRenderer(new TVRenderer());
        //manager.setRenderer(new LaptopRenderer());
		manager.show();
    }
}
