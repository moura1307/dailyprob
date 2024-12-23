public class Main {

    public static void main(String[] args) {

        //This array was given by today's problem
        int buidH[] = {3, 7, 8, 3, 6, 1};
        int numOfItem = buidH.length;

        //Start the counter at 1, cause the last building will ALWAYS be able to see the sun.
        int counter = 1;

        //Start with i and loop through the array until you complete the length of it
        for (int i = 0; i < numOfItem - 1; i++) {
            int firBuild = buidH[i];
            int sectBuild = buidH[i + 1];

            //If the building is higher increment to the counter
            if (firBuild > sectBuild) {
                counter++;
            }
        }

        // Print the result after the loop
        System.out.println("Number of buildings taller than the next: " + counter);
    }
}

//In the problem it says it has to "do this using just one forward pass through the array", I didn't have any idea what that was I put it on gpt and, it said it was like, going through the array once???????
//Well it confirmed that this was is fact foward passing only once, ill look further into it in the future.