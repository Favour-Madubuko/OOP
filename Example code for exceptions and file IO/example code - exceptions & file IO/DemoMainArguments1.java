
public class DemoMainArguments1 {
  
  public static void main(String[] args) {
    
    System.out.println(args.length + " command-line arguments were passed to this program.");
    if (args.length > 0)
      System.out.println("They are: " );
    
    for (int i=0; i<args.length; i++) {
      System.out.println(args[i]);
    }
  }
}