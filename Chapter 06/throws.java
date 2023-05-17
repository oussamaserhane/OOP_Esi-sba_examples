public void myMethod() throws IOException, InterruptedException {
   // Method code here
}

public void callerMethod() {
   try {
      myMethod();
   } catch (IOException | InterruptedException e) {
      e.printStackTrace();
   }
}
