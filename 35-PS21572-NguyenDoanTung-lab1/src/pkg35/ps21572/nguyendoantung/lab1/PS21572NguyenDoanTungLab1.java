package pkg35.ps21572.nguyendoantung.lab1;
import java.util.Scanner;
public class PS21572NguyenDoanTungLab1 {
        static void bai1() {
        Scanner scanner =new Scanner(System.in) ;
        System.out.println("Bài 1");
        System.out.printf("nhâp họ tên:");
        String hoten=scanner.nextLine();
        System.out.printf("nhập điểm TB:");
        Double diemTB=scanner.nextDouble();
        System.out.println("Họ tên: "+hoten);
        System.out.println("Điểm TB: "+diemTB);
    }
    static void bai2(){
        Scanner scanner =new Scanner(System.in) ;
        System.out.println();
        System.out.println("Bài 2");
        System.out.printf("nhap chieu dai :");
        Float cd=scanner.nextFloat();
        System.out.printf("nhap chieu rong:");
        Float cr=scanner.nextFloat();
        System.out.printf("chu vi:%.2f\n",(cd+cr)*2);
        System.out.printf("diện tích:%.2f\n",cd*cr);
        System.out.printf("cạnh nhỏ nhất:%.2f\n",Math.min(cd,cr));
    }
    static void bai3(){
        Scanner scanner =new Scanner(System.in) ;
        System.out.println();
        System.out.println("Bài 3");
        System.out.printf("moi nhap canh:");
        Float a=scanner.nextFloat();
        System.out.printf("the tich:%.1f \n",a*a*a);
    }
    static void bai4(){
        Scanner scanner =new Scanner(System.in);
        System.out.println();
        System.out.println("Bài 4");
        float a,b,c,delta;
        System.out.printf("moi nhap a:");
        a=scanner.nextFloat();
        System.out.printf("moi nhap b:");
        b=scanner.nextFloat();
        System.out.printf("moi nhap c:");
        c=scanner.nextFloat();
        delta =(float) Math.pow(b,2) - 4 * a * c;
        Float d=(float) (Math.sqrt(delta));
        System.out.println("can delta= "+d);
    }
    static void bai5(){
        Scanner scanner =new Scanner(System.in);
        int so;
        System.out.println();
        System.out.println("Bài 5");
        System.out.println("Mời nhạp số cần kiểm tra: ");
        so=scanner.nextInt();
        if(so>0){
            System.out.printf("%d là số dương \n",so);
        }else{
            System.out.printf("%d là số âm \n",so);
        }
        if(so%2==0){
            System.out.printf("%d là số chẵn \n",so);
        }else{
            System.out.printf("%d là số lẻ \n",so);
        }
        if(so>=5){
            System.out.printf("%d là số lơn hơn 5 \n",so);
        }else{
            System.out.printf("%d là số nhỏ hơn 5 \n",so);
        }
    }
    public static void main(String[] args){
        bai1();
        bai2();
        bai3();
        bai4();
        bai5();
    }
}
