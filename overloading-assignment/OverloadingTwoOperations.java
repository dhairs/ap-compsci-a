// Literally just another file bceause we have to use classes in every assignment now

public class OverloadingTwoOperations {
    // define the method -- returns true if both numbers are equal, false otherwise
    public boolean isEqual(int num1, int num2) {
        if (num1 == num2)
            return true;
        return false;
    }

    // overloaded method -- returns true if all three are equal, false otherwise
    public boolean isEqual(int num1, int num2, int num3) {
        if (num1 == num2 && num1 == num3)
            return true;
        return false;
    }

}