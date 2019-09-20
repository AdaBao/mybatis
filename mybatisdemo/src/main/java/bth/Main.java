package bth;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int groupNum = 0;
        groupNum = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<groupNum; i++){
            String nm = scanner.nextLine();
            String [] nmArr = nm.split(" ");
            int m = Integer.parseInt(nmArr[1]);

            Set<String> set1=new HashSet<>(),set2 = new HashSet<>();
            for(int j=0; j<m; j++){
                String line = scanner.nextLine();
                String point1 = line.split(" ")[0];
                String point2 = line.split(" ")[1];

                if(point1.equals("1")){
                    set1.add(point2);
                }else if(point1.equals(nmArr[0])){
                    set2.add(point1);
                }else if(point2.equals("1")){
                    set1.add(point1);
                }else if(point2.equals(nmArr[0])){
                    set2.add(point1);
                }

            }

            func(set1,set2,nmArr[0]);

        }

    }



    public static void func(Set<String> set1, Set<String> set2, String n){
        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            if(value.equals(n)){
                System.out.println("POSSIBLE");
                return;
            }
            if(set2.contains(value)){
                System.out.println("POSSIBLE");
                return;
            }
        }

        System.out.println("IMPOSSIBLE");
    }

}
