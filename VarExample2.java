import java.util.List;

public class VarExample2 {
      public static void main(String[] args) {

            // List<String> list = List.of("One", "Two", "Three");

            // for(String str : list){
            //       System.out.println(str);
            // }

            var list = List.of("Unit", "Tens", "Hundred", "Thousands", "Lakhs", "Crores", "Million", "Billion", "Trillion", "Gillion");
            for (String str : list) {
                  System.out.println(str);
            }

            System.out.println("**********************************************");
            sayHello("Sri");
      }

      static void sayHello(String name){  // parameters cannot be be declared using var
            System.out.println("Hello "+ name);
      }
}
