package ForLoopPractice;
/*
1 10 11 20 21
2  9 12 19 22
3  8 13 18 23
4  7 14 17 24
5  6 15 16 25
 */
public class PracticeTwelve {
    public static void main(String[] args) {
        int n = 5;
        int x,y;

        for (int i = 1; i <= n; i++) {
            x=i;
            y=n-i+1;
            for (int j = 1; j <= n; j++) {

                if(j%2==1)
                {
                    System.out.printf("%2d ",x);
                }
                else
                {
                    System.out.printf("%2d ",y);
                }
                x=x+n;
                y=y+n;
            }
            System.out.println();
        }
    }
    }

