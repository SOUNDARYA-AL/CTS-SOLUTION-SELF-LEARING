Stream API:

import java.util.*; import java.util.stream.*; public class StreamEven { public static void main(String[] args) { List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6); nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println); } }
