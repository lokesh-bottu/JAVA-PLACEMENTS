import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Arraylist {
    static void passArray(ArrayList<Integer> b)
    {
        System.out.println("Pass Array");
        // System.out.println(b.remove(0));
        Collections.sort(b);
        System.out.print("After sorting the array: ");
        System.out.println(b);
        System.out.print("After Reversing the array : ");
        Collections.reverse(b);
    }
    static void convertArray(int a[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>(a.length);
        for(int i =0; i<a.length;i++)
        {
            list.add(i,a[i]);
        }
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<Integer>(a.length);
        list1.add(50);
        list1.add(150);
        list.addAll(list1);
        System.out.println(list);
        passArray(list);
        System.out.println(list);
    }
    public static void main(String args[]) {
        int arr[] ={100,20,3,44,5,16,71,18,91,10};
        convertArray(arr);
    }
}