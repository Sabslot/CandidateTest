
public class Test2 {

    static int findOdd(int ar[], int ar_size)
    {
        int i;
        for (i = 0; i < ar_size; i++) {
            int count = 0;
            for (int j = 0; j < ar_size; j++) {
                if (ar[i] == ar[j])
                    count++;
            }
            if (count % 2 != 0)
                return ar[i];
        }
        return -1;
    }
     
    // driver code 
    public static void main(String[] args)
    {
        int ar[] = new int[]{ 1,2,2,3,3,3,4,3,3,3,2,2,1 };
        int n = ar.length;
        System.out.println(findOdd(ar, n));
    }
}
