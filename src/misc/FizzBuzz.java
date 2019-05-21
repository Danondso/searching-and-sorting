package misc;

//Runs in O(n) time with O(1) complexity; such wow
public class FizzBuzz {
    public static void fizzBuzz(int value1, int value2, int size) {
        for(int i = 1; i <= size; i++) {
            if(i % value1 == 0 && i % value2 == 0){
                System.out.println("FizzBuzz");
                //continue isn't needed in an if else, it breaks out when it falls into a block.
            } else if(i % value1 == 0)
                System.out.printf("Fizz %d\n", i);
            else if(i % value2 == 0)
                System.out.printf("Buzz %d\n", i);
            else {
                System.out.println(i);
            }
        }
    }
}
