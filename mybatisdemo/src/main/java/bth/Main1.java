package bth;

//忽略这个文件
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double [][] arr = new double[V+1][n+1];
        for(int i=0; i<=V; i++){
            for(int j=0; j<=n; j++)
                arr[i][j] = 0;
        }

        int [] w = new int[n];
        double [] p = new double[n];
        for(int i=0; i<n; i++){
            String line = scanner.nextLine();
            String[] strArr = line.split(" ");
            w[i] = Integer.parseInt(strArr[0]);
            p[i] = Double.parseDouble(strArr[1]);
        }

        for(int i=1; i<=V; i++){
            for(int j=1; j<=n; j++){
                if(i>=w[j-1]){
                    //put
                    double x1 = arr[i-w[j-1]][j-1]+ w[j-1]*p[j-1];
                    //not put
                    double x2 = arr[i][j-1];
                    arr[i][j] = Math.max(x1,x2);
                }else{
                    double x = arr[i][j-1];
                    arr[i][j] = x;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(arr[V][n]));

    }
}
