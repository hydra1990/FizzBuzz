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
        boolean isBuzz = false;
        if (checkValueBuzz % 5 == 0) {
            isBuzz = true;
        }
        return isBuzz;
    }

    boolean isNotFizzBuzz(int checkValueFizzBuzz) {
        return true;
    }
}
