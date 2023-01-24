public class Count {
    public static int recursive(int count)
    {
        if(count>0)
        {
            System.out.print(count);
            return recursive(count-1);
        }
        else
            return 0;
    }
    public static void main(String args[])
    {
        recursive(5);
    }
}






// public class Count {
//     public static int factorial(int num)
//     {
//         return num;
//     }
//     public static void main(String args[])
//     {
//         int fact = factorial(5);
//         System.out.println("Lokesh");
//     }
// }



// abstract class Shape{ int a =1; void show(){
//     System.out.println("Show1");}
//     } class Rectangle extends Shape{ int a =2; public void show(){
//     System.out.println("Show2");}
//     }
//     public class Test{
//     public static void main(String[] args) { Shape s = new Rectangle();
//     System.out.print(s.a);
//     s.show();
//     }}




