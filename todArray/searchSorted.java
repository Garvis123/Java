package todArray;

public class searchSorted {
    public static void findke(int matrix[][],int key)
    {
int row=0;
int col=matrix[0].length-1;
while(row < matrix.length && col >=0)
{
    if(matrix[row][col] ==key)
    {
        System.out.print(" "+ row +" "+col);
        return;
    }
    else if(key<matrix[row][col])
    {
        col--;
    }
    else{
        row++;
    }
}

    }

    public static void main(String args[]) {
        int matrix[][] = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
        int key=4;
        findke(matrix,key);
    }
}
