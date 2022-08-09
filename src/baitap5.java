import java.util.Scanner;
public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" nhap gia tri mang 1");
        int arr1=scanner.nextInt();
        System.out.println("nhap gia tri mang 2");
        int arr2=scanner.nextInt();
        int arr[][]=new int[arr1][arr2];
        System.out.println("nhap gia tri cac phan tu cua mang");
        for(int i=0;i<arr1;i++){
            for(int j=0;j<arr2;j++){
                System.out.println("arr["+i+"]["+j+"]");
                arr[i][j]=scanner.nextInt();
            }
        }
        int min= arr[0][0];
        for(int i=0;i<arr1;i++){
            for(int j=0;j<arr2;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println( "phan tu nho nhat trong mang ="+min);
    }
}
