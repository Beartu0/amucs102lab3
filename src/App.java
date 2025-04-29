import java.util.Scanner;
public class App {
public static void bubblesort(int[] arr){
    for(int i=0;i<(arr.length-1);i++){
        for(int x=0; x<(arr.length-1-i);x++){
            int k=0;
            if (arr[x]>arr[x+1]) {
                k=arr[x];
                arr[x]=arr[x+1];
                arr[x+1]=k;
            }
        }
    }
}
public static int binarysearch (int[]arr, int hedef){
    int sol = 0, sag = arr.length - 1;
        
        while (sol <= sag) {
            int ort = (sol + sag) / 2;

            if (arr[ort] == hedef)
                return ort;  
            else if (arr[ort] < hedef)
                sol = ort + 1;  
            else
                sag = ort - 1; 
        }
        return -1; 
    }
public static void selectionSortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;  
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[k]) {  
                    k = j;  
                }
            } 
            int tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
        }
    }
public static void selectionSortasc(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            int l = i; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[l]) {
                    l = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;}
              
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("array?");
        int x= scanner.nextInt();
        int[] arr = new int[x];
        for(int k=0; k<=(x-1); k++){
            System.out.println((k+1)+". elemanı giriniz");
            int tmp= scanner.nextInt();
            arr[k]=tmp;
        }
        selectionSortasc(arr);
        for(int l=0; l<=(x-1); l++){
            System.out.println(arr[l]);
            
        }
    }
}
