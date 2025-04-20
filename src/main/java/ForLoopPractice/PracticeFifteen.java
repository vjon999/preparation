package ForLoopPractice;

/*
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
 */
public class PracticeFifteen {
    public static void main(String[] args) {
        int n = 5;
        int k;
        for(int i=1;i<=n;i++)
        {
            k=i;
            for(int j=1;j<=n;j++)
            {
                System.out.printf("%2d ",k);
                k++;
            }
            System.out.println();
        }

    }
}
