package ForLoopPractice;
/*
1 3 5 7 9
3 5 7 9 11
5 7 9 11 13
7 9 11 13 15
9 11 13 15 17
 */
public class PracticeSixteen {
    public static void main(String[] args) {
        int n = 5;
        int k;
        for(int i=1; i<=n;i++)
        {
           k=2*i-1;
            for(int j=1; j<=n;j++){
                System.out.printf("%2d ",k);
                k+=2;
            }
            System.out.println();
        }

    }
}
