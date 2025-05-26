 ExecutorService and Callable:

ExecutorService ex = Executors.newFixedThreadPool(2); Future<Integer> f = ex.submit(() -> 5 + 5); System.out.println(f.get()); ex.shutdown();
