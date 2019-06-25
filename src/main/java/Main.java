public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            if (fizzBuzz.isFizz(i) && fizzBuzz.isBuzz(i)) {
                System.out.println("FizzBuzz");
            } else if (fizzBuzz.isBuzz(i)) {
                System.out.println("Buzz");
            } else if (fizzBuzz.isFizz(i)) {
                System.out.println("Fizz");
            } else if (fizzBuzz.isNotFizzBuzz(i)) {
                System.out.println(i);
            }
        }
    }
}
