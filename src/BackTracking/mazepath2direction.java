package BackTracking;

public class mazepath2direction {
    public static void main(String[] args) {
        int rows=4;
        int column=5;
        int count=maze(0,0,rows-1,column-1);
        System.out.print("the no of ways to reach at end position is ");
        System.out.println(count);
    }

    private static int maze(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec)return 1;
        int downWays=maze(sr+1,sc,er,ec);
        int rightWays=maze(sr,sc+1,er,ec);
        int totalWays=downWays+rightWays;
        return totalWays;
    }
}
