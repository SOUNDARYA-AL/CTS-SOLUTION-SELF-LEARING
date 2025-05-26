Lambda Expressions:

import java.util.*; public class LambdaSort { public static void main(String[] args) { List<String> list = Arrays.asList("Zebra", "Apple", "Lime"); list.sort((a, b) -> a.compareTo(b)); list.forEach(System.out::println); } }
