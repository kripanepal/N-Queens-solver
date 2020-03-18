import java.util.Arrays;

public class solveQueens {
    
    public  boolean[][] board;
    public  boolean solved = false;
    
    
    public solveQueens(int num)
    {
	board = new boolean[num][num];
	solve(num,0);
	
	
    }
    
    public void solve(int n, int row){

	
   	if(row < n)
   	    {

   		for(int j = 0; j < n; j++)
   		    {
   			if(!solved)
   			    {

   				if(check(row, j))
   				    {
   					
   					board[row][j] = true;

   					if(row == board.length-1)
   					    {
   						solved = true;
   					    }else
   					    {
   						solve(n, row + 1);
   					    }

   				    }
   				
   				if(!solved)
   				    {

   					board[row][j] = false;
   				    }

   			    }

   		    }

   	    }

       }

       public  boolean check(int row, int col){

   	for(int i = 0; i < row; i++)
   	    {
   		for(int j = 0; j < board[0].length; j++)
   		    {
   			

   			if(board[i][j])
   			    {

   				if((i == row) || (j == col) || (i - j) == (row - col) || ((i + j) == (row + col)))
   				    {
   					return false;
   				    }
   			    }
   		    }
   	    }
   	return true;

       }

    public void showBoard(){
	
	
	
	for(int i =0; i< board[0].length;i++)
	{
	    
	    System.out.print("|");
	    for(int j =0; j< board[0].length;j++)
		{
		    
		    if(board[i][j])
		    {
			System.out.print("Q");
		    }
		    else
			{
			    System.out.print("-");
			}
		    System.out.print(" | ");
		    
		}
	    System.out.println();
	    
	    
	}
	
	
    }
}