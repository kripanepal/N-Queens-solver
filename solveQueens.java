import java.util.Arrays;

public class solveQueens {
    
    public  boolean[][] board;
    public  boolean solved = false;
    
    
    public solveQueens(int num)
    {
	board = new boolean[num][num];
   solve(num,0);
   
  
   
	if(solved)
   {
      System.out.println("solved");
   }
   
   else
   {
      System.out.println("can't solve");
   }
	
	
    }
    
    public boolean solve(int n, int row){
    
    if (row == n) 
	{ 
      solved = true;
		showBoard();
      System.out.println("=================");
      return true; 
	} 
   
	boolean res = false; 
	for (int i = 0; i < n; i++) 
	{ 
		if ( check(row, i) ) 
		{ 
			board[row][i] = true; 
			res = solve(n, row+1) ; 
			 board[row][i] = false;
		}
      
   } 
      return res; 
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