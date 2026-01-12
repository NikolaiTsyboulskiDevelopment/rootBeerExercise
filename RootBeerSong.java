public class RootBeerSong {
   public static void main(String[] args) {
   int i = 100;
   String a;
   String b;
   String c;
   while (i > 0) {
      a = " " + i+ " " +"bottles of root beer on the wall";
      b = " " + i + " "+"bottles of root beer";
      c = " " + (i-1)+ " " + "bottles of root beer on the wall";
      System.out.println(a);
      System.out.println(b);
      System.out.println(" Take one down, pass it around");
      System.out.println(c);
      System.out.println(" ");
      i--;
      }
      
   
   }
}