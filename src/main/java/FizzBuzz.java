class FizzBuzz {
    FizzBuzz() {

    }

    boolean isFizz(int checkValueFizz) {
        boolean isFizz = false;
        if (checkValueFizz % 3 == 0) {
            isFizz = true;
        }
        return isFizz;
    }

    boolean isBuzz(int checkValueBuzz) {
        return true;
    }

    boolean isNotFizzBuzz(int checkValueFizzBuzz) {
        return true;
    }
}
