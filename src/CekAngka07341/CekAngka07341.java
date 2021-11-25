package CekAngka07341;
//mengkomplikasi kelas-kelas sesuai dengan packagenya masing-masing
import java.util.Scanner;
//mengimportkan atau mengelompokkan scanner ke program
public class CekAngka07341 {
    public static void main(String[] args){ //class utama program
        Scanner scan = new Scanner(System.in);  //membuat scanner baru
        int Angka07341; //variable yang digunakan dalam program
        
        System.out.println("Masukkan Angka");
        Angka07341 = scan.nextInt(); // masukkan Angka
        while (Angka07341 > 0){ //perulangan 
            Angka07341 = Angka07341-2;
        }
        System.out.println(Angka07341); //mencetak angka
        if (Angka07341 == 0){
            System.out.println("GENAP");
        }else{
            System.out.println("GANJIL");
        }
 
    }
}