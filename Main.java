class Main {
  public static void main(String[] args) {
    int[] array = {7, 10, 1, 3, 2};
    mergeSort(array, 0, array.length - 1);
    printArray(array);
  }

  public static void printArray(int[] A) {
      System.out.print("[");
      for (int i = 0; i < A.length; i++) {
        if (i != A.length - 1) {
          System.out.print(A[i] + ", ");
        } else {
          System.out.print(A[i] + "]\n");
        }
      }
  }

  public static void mergeSort(int[] array, int left, int right) {
    if (left == right) {
      return;
    }
    int mid = (left + right) / 2;
    mergeSort(array, left, mid);
    mergeSort(array, mid + 1, right);
    int[] temp = new int[right - left + 1];
    int a = left;
    int b = mid + 1;
    int c = 0;
    while(a <= mid && b <= right) {
      if (array[a] <= array[b]) {
        temp[c++] = array[b++];
      } else {
        temp[c++] = array[a++];
      }
    }
    while (a <= mid) {
      temp[c++] = array[a++];
    }
    while (b <= right) {
      temp[c++] = array[b++];
    }
    for (int lcv = 0; lcv < right - left + 1; lcv++) {
      array[lcv + left] = temp[lcv];
    }
  }
}
