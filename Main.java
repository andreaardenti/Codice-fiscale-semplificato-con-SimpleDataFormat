//import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        User u = new User("andrea", "ardenti", "1972");

        SimpleDateFormat a = new SimpleDateFormat("1992");

        System.out.println(u);
        System.out.println("Anno di nascita: " + a.getNascita());

        System.out.println(u.getName() + u.getSurname() + u.getDateOfBirth());

    }
}
