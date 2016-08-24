
package algdat;

public class AlgDat
{
  public static int maks(int[] a)  // a er en heltallstabell
  {
    if (a.length < 1)
      throw new java.util.NoSuchElementException("Tabellen a er tom!");

    int m = 0;  // indeks til største verdi

    for (int i = 1; i < a.length; i++) // obs: starter med i = 1
    {
      if (a[i] > a[m]) m = i;  // indeksen oppdateres
    }

    return m;  // returnerer indeksen/posisjonen til største verdi

  } // maks

    public static void main(String[] args)
    {
       int[] a = {7,2,9,3,6,4,10,1,8,5};
       System.out.println(maks(a));
    }
    
}
