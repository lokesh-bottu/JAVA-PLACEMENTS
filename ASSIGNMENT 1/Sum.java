public class Sum {
    public static int add(int value)
    {
        if(value==1)
            return 1;
        return value+add(value-1);
    }
    public static void main(String args[])
    {
        System.out.println(add(5));
    }
}


public class Sum {
    public static int add(int value)
    {
        int sum=0;
        for(int i=value;i>0;i--)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(add(5));
    }
}












