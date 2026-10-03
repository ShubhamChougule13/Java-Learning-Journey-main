public class FindLargest {
    public static void main(String [] args){

        int[] numbers = {20, 45, 12, 67, 34};
        int largest = numbers[0];
         
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }

        System.out.println("The largest no among above array is: " + largest);

    }
    
}
