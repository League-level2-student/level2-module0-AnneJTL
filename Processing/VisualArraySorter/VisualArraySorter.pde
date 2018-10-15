/* Paste the code into a new Processing sketch and complete the steps. */

//1. create an array of ints. don't initialize it yet.
int[] arrayOfInt;

void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
    println("size: " + width); 

  size(800, 800);

  //3. initialize your array with the built in width variable
  arrayOfInt = new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  randomizeArray(arrayOfInt);

  //5. call the noStroke() method
  noStroke();

}

void draw() {
  //6. set the background color with background(r, g, b);
  background(203, 255, 242);

  //7. set the color for your graph
  fill(245,142,114);

  //8. draw a rectangle for each int in your array.
  int height = 800;
    for (int i=0; i<arrayOfInt.length; i++){ 
  //   the x value will be the current index in the array
  //   the y value will the height variable
  //   the width is 1 (one)
  //   the height is negative the value of the element at the current index of the array
  rect(i, height, 1, arrayOfInt[i] * (-1));

    }
  //9. call the stepSort method
  stepSort(arrayOfInt);

  //10. extract the code that randomizes the array into a method.

  //11. call the method you made in step 10 when the mouse is pressed

}

void mousePressed(){
    randomizeArray(arrayOfInt);
}

void randomizeArray(int[] arrayOfInt){
  for (int i=0; i<arrayOfInt.length; i++){
    arrayOfInt[i] = (int) random(width);  
  }
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
