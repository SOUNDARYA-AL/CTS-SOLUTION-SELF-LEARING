File Reading:

import java.nio.file.*; public class ReadFile { public static void main(String[] args) throws Exception { Files.lines(Path.of("output.txt")).forEach(System.out::println); } }
