public class SecondLargest {

    public static void main(String[] args) {

        int[] numbers = {20, 45, 12, 67, 34, 48, 8, 23, 89};

        int largest;
        int secondLargest;

        // Compare the first two numbers
        if (numbers[0] > numbers[1]) {
            largest = numbers[0];
            secondLargest = numbers[1];
        } else {
            largest = numbers[1];
            secondLargest = numbers[0];
        }

        // Check remaining numbers
        for (int i = 2; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } 
            else if (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("The largest num among above array is: " + largest);
        System.out.println("The second largest num among above array is: " + secondLargest);
    }
}