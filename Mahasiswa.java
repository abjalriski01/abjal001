
/**
 * class Mahasiswa 
 *
 * @author (abjal riski)
 * @version  0.02
 */
public class Mahasiswa
{
  private int nim;
    private String nama;
    
    public Mahasiswa(int nim, String nama)
    {
        this.nim = nim;
        this.nama = nama;
    }
   
    public String getnamaMhs()
    {
         return this.nama;
    }
    
   public int getnimMhs()
    {
         return this.nim;
    }
    public void setnamaMhs(String nama)
    {
        this.nama = nama;
    }
    
  
    
    
}
