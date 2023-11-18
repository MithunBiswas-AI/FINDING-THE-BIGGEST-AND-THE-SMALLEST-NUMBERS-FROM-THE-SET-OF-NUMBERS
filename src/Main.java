import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        int count = 0;


        Random random = new Random();

        // Use a while loop to generate 10 random integers and find the largest and smallest
        while (count < 10) {
            // Generate a random integer between 1 and 100
            int randomNumber = random.nextInt(100) + 1;

            // Check if the current number is larger than the current largest
            if (randomNumber > largest) {
                largest = randomNumber;
            }

            // Check if the current number is smaller than the current smallest
            if (randomNumber < smallest) {
                smallest = randomNumber;
            }


            count++;
        }

        // Display the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

    }
    }
