import java.util.Scanner;

public class daire {
    
       public static void main(String[] args) {

        int radius;
        double pi , alan , cevre;

        pi = 3.14;
        
        System.out.print("Lütfen dairenizin yarıçapını giriniz : ");
        
        Scanner yaricap = new Scanner(System.in);

        radius = yaricap.nextInt();

        alan = pi * (radius * radius);
        cevre = 2 * pi * radius;

        System.out.print("Dairenizin alanı : "+ alan);
        System.out.print("\nDairenizin Çevresi : "+ cevre);

                
       } 
    
    
}
