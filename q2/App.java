import java.util.Scanner;
//64050030 Kitipum Nornua
public class App {
    public static void main(String[] args){
        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();

        publisher.add(subscriber1);
        publisher.add(subscriber2);

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score(Enter to exit): ");
            String result = sc.nextLine();

            if(result.trim().isEmpty()){
                break;
            }

            publisher.setResult(result);
        }
        sc.close();
    }
}
