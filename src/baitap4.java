import java.util.Scanner;
public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào mảng 1");
        int arr1=scanner.nextInt();
        System.out.println("nhap giá trị cot");
        int arr2=scanner.nextInt();
        int arr[][]=new int [arr1][arr2];
        System.out.println("nhap cac phan tu cho mang");
        for(int i=0;i<arr1;i++){
            for(int j=0;j<arr2;j++){
                System.out.println("arr["+i+"]["+j+"]=");
                arr[i][j]=scanner.nextInt();
            }
        }
        int max =arr[0][0];
        for(int i=0;i<arr1;i++){
            for(int j=0;j<arr2;j++){
                if (max <arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat trong mang ="+max);
    }
}
