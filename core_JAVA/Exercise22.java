File Writing:

import java.nio.file.*; public class WriteFile { public static void main(String[] args) throws Exception { String text = new java.util.Scanner(System.in).nextLine(); Files.writeString(Path.of("output.txt"), text); System.out.println("Written"); } }
