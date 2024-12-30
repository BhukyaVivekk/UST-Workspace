package Arrays;

public class ArrayPractice {
    public static void main (String[] args){

    int [] marks = {98,97,75,75,99};
    int largest = marks[0];
    for (int number : marks) {
        if (number > largest) {
            largest = number;
        }
    }
        System.out.println("The largest element in the array is: " + largest);
    }
}


