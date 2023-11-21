public class Swap {
      public static void main(String[] args) {
            
            var n1 = 10;
            var n2 = 20;

            System.out.println("Before Swap: ");
            System.out.println("n1: "+n1 +"  n2: "+ n2);

            // swapping logic
            var temp = n1;
            n1 = n2;
            n2 = temp;
            
            System.out.println("After Swap: ");
            System.out.println("n1: "+n1 +"  n2: "+ n2);
      }
}
