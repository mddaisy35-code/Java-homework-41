crtl > shift = selected image group 
ctl G 
ctrl D
sift A 
crtl Z





public class orderr {
    public static void main(String[] args) {

 int[] arr = {5, 2, 8, 1, 7, 4, 3, 6};

    // Odd numbers 
     for (int i = 0; i < arr.length; i++) {
    if (arr[i] % 2 != 0) {

    // Odd numbers ascending order
   for (int j = i + 1; j < arr.length; j++) {
    if (arr[j] % 2 != 0 && arr[i] > arr[j]) {
   int temp = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
     }
     }
    }
   }

   // Even numbers des order
   for (int i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0) {

    for (int j = i + 1; j < arr.length; j++) {
     if (arr[j] % 2 == 0 && arr[i] < arr[j]) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
 }
  }
 }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
 }
}
}

