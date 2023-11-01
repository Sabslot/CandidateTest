import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.Arrays;

public class Test3 {
    private static final Pattern pattern = Pattern.compile("[:;][-~]?[)D]");
  public static void main(String[] args)
  {

    List<String> st = Arrays.asList(":) ;( ;} :-D");

    System.out.println("found: " + countSmileys(st));

  }

    public static int countSmileys(List<String> st) {

      int count = 0;
      for (String x : st) {
          Matcher matcher = pattern.matcher(x);

          while(matcher.find()) {
              count++;
          }            
      }

      return count;
    }
}
