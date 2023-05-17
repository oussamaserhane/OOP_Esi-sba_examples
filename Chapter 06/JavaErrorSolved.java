class JavaErrorSolved {
  public static void main(String[] args) {
    int[] arr = new int[5];

    try {
      arr[8] = 89;
    } catch (Exception e) {
      System.out.println("Something went wrong!");
    }
  }
}



