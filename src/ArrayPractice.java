import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Create an array to hold the numbers 1-10.
        System.out.println("Create an array to hold the numbers 1-10.");
        int[] myNums = {1,2,3,4,5,6,7,8,9,10};

        /*
        Loop through that array and sum the numbers 1-10
        then print that total to the screen.
         */
        System.out.println("Loop through that array and sum the numbers 1-10, then print that total to the screen.");
        int total = 0;
        for(int i = 0; i < myNums.length; i++){
            System.out.println(myNums[i]);
            total += myNums[i];
        }
        System.out.println("The sum of this array is: " + total);

        /*
        Create an array to hold 10 number inputs from the user
        and print that total to the screen.
        */
        System.out.println("Create an array to hold 10 number inputs from the user and print that total to the screen");
        System.out.println("Enter 10 numbers: ");
        int[] nums = new int[10];
        int newTotal = 0;

        for(int i = 0; i < 10; i++){
            nums[i] = scanner.nextInt();
            newTotal += nums[i];
        }
        System.out.println("The sum of this array is: " + newTotal);

        /*
        Get 10 number inputs from the user,
        store them in an array and get the average of those 10 numbers.
         */
        System.out.println("Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.");
        System.out.println("Enter 10 numbers: ");
        int[] nums2 = new int[10];
        int total2 = 0;

        for(int i = 0; i < 10; i++){
            nums2[i] = scanner.nextInt();
            total2 += nums2[i];
        }
        System.out.println("The average of this array is: " + (total2 / 10));

        /*
        Create an array to store 3 names,
        loop through that array to print out the names.
        */
        System.out.println("Create an array to store 3 names, loop through that array to print out the names.");
        String[] string1 = {"Nick", "Jerry", "Dan"};
        for(int i = 0; i < string1.length; i++){
            System.out.println(string1[i]);
        }

        /*
        Create an array with the following values:
        [2,5,9,0,2,1,8,5,4] Loop through the array and
        print out the index each time the value equals 5.
         */
        System.out.println("Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the index each time the value equals 5.");
        int[] nums3 = {2,5,9,0,2,1,8,5,4};
        for(int i = 0; i < nums3.length; i++){
            if(nums3[i] == 5){
                System.out.println("5s in this array are located at index: " + i);
            }
        }
        /*
        Declare an array with the numbers 1-10.
        Print the numbers 1-10 backwards from the array.
        */
        System.out.println("Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.");
        int[] nums4 = {1,2,3,4,5,6,7,8,9,10};
        for(int i = nums4.length - 1; i >= 0; i--){
            System.out.println(nums4[i]);
        }
        /*
         Given the following array: ['w','t','y','h','k']
         Loop through the array
         and replace the the letter 't' with the word "hello" once it's found.
         */
        System.out.println(" Given the following array: ['w','t','y','h','k']\n" +
                "Loop through the array and replace the the letter 't' with the word \"hello\" once it's found.");
        String[] string2 = {"w","t","y","h","k"};

        for(int i = 0; i < string2.length; i++){
            if(string2[i] == "t"){
                string2[i] = "Hello";
            }
            System.out.println(string2[i]);
        }
        /*
         Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
         Write a program that will print out all matching pairs from arrays 1 and 2.
         Expected output:
         (7,7) and (6,6)
         */
        System.out.println(" Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4] \n" +
                "Write a program that will print out all matching pairs from arrays 1 and 2.\n" +
                "Expected output: (7,7) and (6,6)");
        int[] nums5 = {1,7,6,5,9};
        int[] nums6 = {2,7,6,3,4};


        for(int x = 0; x < nums5.length; x++){
            for(int y = 0; y < nums6.length; y++){
                if(nums5[x] == nums6[y]){
                    System.out.println("(" + nums5[x] + ","+  nums6[y] +")");
                }
            }
        }
    }

}
