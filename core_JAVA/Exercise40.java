HTTP Client API:

HttpClient client = HttpClient.newHttpClient(); HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.github.com")).build(); HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString()); System.out.println(res.body());
