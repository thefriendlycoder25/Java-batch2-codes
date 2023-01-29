package success;

import java.util.Scanner;

public class muldim {
    public static void main(String[] args) {
        int[][] mul = new int[3][4];
        Scanner sc = new Scanner(System.in);
        //filling the ARRAY
        System.out.println("Enter the array elements");
        for(int i  = 0 ; i<3 ; i++)
        {
            for(int j = 0 ; j<4 ; j++)
            {
                mul[i][j]= sc.nextInt();
            }
        }
    for(int i  = 0 ; i<3 ; i++)
        {
            for(int j = 0 ; j<4 ; j++)
            {
                System.out.print(" "+mul[i][j]);
            }
            System.out.println();
        }

    }
}
