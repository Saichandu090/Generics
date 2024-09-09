public class GenericForArray
{
    public static void main(String[] args) {

        Integer[] ar={98,34,12,65,87,34,1,37};
        Double[] dr={1.0,2.8,8.6,5.3,8.9,3.5};
        String[] sr={"Sai","Chandu","Jenny","Rahil","Bibek"};

        System.out.println("Biggest in int[] is : ");
        isBig(ar);
        System.out.println("Biggest in double[] is : ");
        isBig(dr);
        System.out.println("Biggest in String[] is : ");
        isBig(sr);
    }

    public static <T extends Comparable<T>> void isBig(T[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            int count=0;
            for(int j=0;j<ar.length;j++)
            {
                if(ar[i].compareTo(ar[j])<0)
                    count++;
            }
            if(count==0)
                System.out.println("Biggest is : "+ar[i]);
        }
    }
}
