import java.util.Scanner;
public class thuchanh6 {
    public static void main(String[] args) {
        int arr[];
        int size;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("nhap vao gia tri size");
            size=scanner.nextInt();
            if(size>30){
                System.out.println("k duoc vuot qua size");
            }
        }while (size>30);
        arr=new int[size];
        int i=0;
        while(i<arr.length){
            System.out.println("phan tu thu"+(i+1)+":");
            arr[i]=scanner.nextInt();
            i++;
        }
        int count =0;
        System.out.println("danh sach diem:");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
            if(arr[j]>=5&&arr[j]<=10)
                count++;

        }
        System.out.println(" so hoc sinh tren trung binh :"+count);
    }
}
