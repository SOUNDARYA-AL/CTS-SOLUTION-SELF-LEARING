Reflection in Java:

Class<?> cls = Class.forName("java.lang.String"); for (var m : cls.getDeclaredMethods()) System.out.println(m.getName());
