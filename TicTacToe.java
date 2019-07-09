import java.util.Scanner;
public class TicTacToe
{
  public static void main(String[] args)
  {
    Scanner k= new Scanner (System.in);
    System.out.println("TIC_TAC_TOE by Saqueeb");
    System.out.println();
    System.out.println("_1_|_2_|_3_");
    System.out.println("_4_|_5_|_6_");
    System.out.println("_7_|_8_|_9_");
    System.out.println();
    int[] arr=new int[9];
    for(int c=0; c<9; c++){
      int d=0;
      if (c%2==0)
      {
        d=1;
        System.out.println("Player 1's turn");
      }
      else
      {
        System.out.println("Player 2's turn");
        d=2;
      }
      String s=k.nextLine();
      int x= Integer.parseInt(s);
      if (x>=1 && x<=9)
        {
        arr[x-1]=d;
        System.out.print("_");
        if (arr[0]==0)
        {
          System.out.print(" ");
        }
        else if ( arr[0]==1)
        {
          System.out.print("*");
        }
        else if (arr[0]==2)
        {
          System.out.print("O");
        }
        System.out.print("_|_");
        if (arr[1]==0)
        {
          System.out.print(" ");
        }
        else if ( arr[1]==1)
        {
          System.out.print("*");
        }
        else if (arr[1]==2)
        {
          System.out.print("O");
        }
        System.out.print("_|_");
        if (arr[2]==0)
        {
          System.out.print(" ");
        }
        else if ( arr[2]==1)
        {
          System.out.print("*");
        }
        else if (arr[2]==2)
        {
          System.out.print("O");
        }
        System.out.print("_");
        System.out.println();
        System.out.print("_");
        if (arr[3]==0)
        {
          System.out.print(" ");
        }
        else if ( arr[3]==1)
        {
          System.out.print("*");
        }
        else if (arr[3]==2)
        {
          System.out.print("O");
        }
        System.out.print("_|_");
        if (arr[4]==0)
        {
          System.out.print(" ");
        }
        else if ( arr[4]==1)
        {
          System.out.print("*");
        }
        else if (arr[4]==2)
        {
          System.out.print("O");
        }
        System.out.print("_|_");
        if (arr[5]==0)
        {
          System.out.print(" ");
        }
        else if ( arr[5]==1)
        {
          System.out.print("*");
        }
        else if (arr[5]==2)
        {
          System.out.print("O");
        }
        System.out.print("_");
        System.out.println();      
        System.out.print("_");
        if (arr[6]==0)
        {
          System.out.print(" ");
        }
        else if ( arr[6]==1)
        {
          System.out.print("*");
        }
        else if (arr[6]==2)
        {
          System.out.print("O");
        }
        System.out.print("_|_");
        if (arr[7]==0)
        {
          System.out.print(" ");
        }
        else if ( arr[7]==1)
        {
          System.out.print("*");
        }
        else if (arr[7]==2)
        {
          System.out.print("O");
        }
        System.out.print("_|_");
        if (arr[8]==0)
        {
          System.out.print(" ");
        }
        else if ( arr[8]==1)
        {
          System.out.print("*");
        }
        else if (arr[8]==2)
        {
          System.out.print("O");
        }
        System.out.print("_");
        System.out.println();
        System.out.println();
        if (arr[0]==0) 
        {
        }
        else {
          if (arr[0]==arr[1])
            if(arr[0]==arr[2]) 
          {
            System.out.println("GAME OVER! Player "+d+" won the game! Congrats...");
            break; 
          }
        }
        if (arr[0]==0) 
        {
        }
        else {
          if(arr[0]==arr[4])
            if(arr[0]==arr[8]) 
          {
            System.out.println("GAME OVER! Player "+d+" won the game! Congrats...");
            break; 
          }
        }
        if (arr[0]==0) 
        {
        }
        else {
          if ( arr[0]==arr[3])
            if (arr[0]==arr[6]) 
          {
            System.out.println("GAME OVER! Player "+d+" won the game! Congrats...");
            break; 
          }
        }
        if (arr[1]==0) 
        {
        }
        else {
          if (arr[1]==arr[4])
            if (arr[1]==arr[7]) 
          {
            System.out.println("GAME OVER! Player "+d+" won the game! Congrats...");
            break; 
          }
        }
        if (arr[2]==0)
        {
        }
        else {
          if (arr[2]==arr[5])
            if(arr[2]==arr[8]) 
          {
            System.out.println("GAME OVER! Player "+d+" won the game! Congrats...");
            break; 
          }
        }
        if (arr[3]==0) 
        {
        }
        else {
          if ( arr[3]==arr[4])
            if (arr[3]==arr[5]) 
          {
            System.out.println("GAME OVER! Player "+d+" won the game! Congrats...");
            break;
          }
        }
        if (arr[6]==0) 
        {
        }
        else {
          if ( arr[6]==arr[7])
            if (arr[6]==arr[8]) 
          {
            System.out.println("GAME OVER! Player "+d+" won the game! Congrats...");
            break; 
          }
        }
        if (arr[4]==0) 
        {
        }
        else {
          if (arr[2]==arr[4])
            if (arr[2]==arr[6] ) 
          {
            System.out.println("GAME OVER! Player "+d+" won the game! Congrats...");
            break; 
          }
        }
        if (c==8)
        {
          System.out.println("Match Tie! Thanks for playing...");
        }
      }
        else 
        {
          System.out.println("Invalid input! Please enter numbers between 1 to 9");
          c--;
        } 
      }
    }
  }