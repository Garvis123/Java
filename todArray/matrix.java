package todArray;

import java.util.Scanner;

public class matrix {
    public static void search(int matrix[][],int key)
    {
       for(int i=0;i<matrix.length;i++)
       {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==key)
            {
                System.out.print("found at " + i+ "," + j );
            }
        }
        System.out.println();
       }
    }
    public static void main(String args[])
    {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
         int m=matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
     for(int j=0;j<m;j++)
     {
         matrix[i][j]=sc.nextInt();
     }

        }
        //output 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int key=5;
        search(matrix,key);
    }
}
