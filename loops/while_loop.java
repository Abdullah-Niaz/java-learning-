package loops;

import java.util.*;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        while(i<=n){
            System.out.println("Hello World " + i);
            i++;
        }
    }
}