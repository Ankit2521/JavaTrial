import java.util.*;
public class Main {

    public static int linearsearch(int number[], int key) {
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    {
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int number[]={1,2,3,4,5,6,7,8,9,10};
       System.out.print("Enter the no : ");
       int key =sc.nextInt();
       int index= linearsearch(number,key);
       System.out.println(index);
       System.out.println(Math.max(12,1));
    }
}