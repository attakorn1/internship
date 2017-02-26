public class EightQueens {
    
/* x[i] = x coordinate of queen in row i. */
 static int[] x = new int[8];

/* prints field */
public static void printQueens()
{
  int col,row;
  System.out.println ("+-----------------------+");
  for (col=0; col<8; col++) {
    System.out.print("|");
    for (row=0; row<8; row++)
      if (row==x[col]) System.out.print("Q.|");
      else System.out.print(" |");
    System.out.println("");
    System.out.println("+-----------------------+");
  }
  System.out.println ("");
}
/* tests, whether (ix, iy) is beaten by queens 0...(iy-1) */
public static boolean canPlaceQueen (int ix, int iy)
{
  int i;
  for (i=0; i<iy; i++)
    if ((x[i]==ix) || (Math.abs(x[i]-ix) == Math.abs(i-iy)))
      return false;
  return true;
}
/* tries to place queen n on row n */
public static void placeQueen (int n)
{
  int i;
  if (n==8)
        printQueens();
  else
    for (i=0; i<8; i++)
      if (canPlaceQueen(i,n)) {
        x[n] = i;
        placeQueen (n+1);
      }
}
public static void main(String[] args) {
        placeQueen (0);
    }

}
