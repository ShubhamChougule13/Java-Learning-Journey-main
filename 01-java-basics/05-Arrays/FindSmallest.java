public class FindSmallest {

    public static void main (String [] args){

        int numbers[] = {20, 45, 12, 67, 34, 48, 8, 23, 89};
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
                
            }
        }
        System.out.println("The smallest no among above array is: " + smallest);
    }
    
}
