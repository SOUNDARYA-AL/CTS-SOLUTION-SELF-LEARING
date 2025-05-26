ArrayList Example:

import java.util.*; public class NameList { public static void main(String[] args) { ArrayList<String> list = new ArrayList<>(); Scanner s = new Scanner(System.in); list.add(s.nextLine()); list.forEach(System.out::println); } }
