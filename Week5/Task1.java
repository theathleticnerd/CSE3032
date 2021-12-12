import java.util.*;
class Task1 {
    static void sortBinaryArray(int a[], int n){
        int j=-1;
        for(int i=0; i<n; i++){
            if(a[i]<1){
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }
    public static void main(String[] args){
        int a[] = {1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0};
        int n = a.length;
        sortBinaryArray(a,n);
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }
}
