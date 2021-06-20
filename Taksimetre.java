import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double mesafe, taksiMetre;
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi giriniz(km):");
        mesafe= input.nextDouble();
        taksiMetre= 10 + (2.20 * mesafe);
        if(taksiMetre<=20)
            System.out.println("Taksimetre tutarınız: 20");
        else System.out.println("Taksimetre tutarınız:"+ taksiMetre);




    }
}
