public class PaulInteger {
    // declare instance
    private int value;

    // creates constructor
    public PaulInteger(int val){
        value = val;
    }
    // create getValue method
    public int getValue(){
        return value;
    }
    // create all the booleans for isEven
    public boolean isEven(){
        return isEven(value);
    }
    // create all the booleans for isEven
    public static boolean isEven(PaulInteger theInt){
        return isEven(theInt.getValue());
    }
    // create all the booleans for isEven
    public static boolean isEven(int num){
        return(num % 2 == 0);
    }
    // create all the booleans for isOdd
    public boolean isOdd(){
        return isOdd(value);
    }
    // create all the booleans for isOdd
    public static boolean isOdd(PaulInteger theInt){
        return isOdd(theInt.getValue());
    }
    // create all the booleans for isOdd
    public static boolean isOdd(int num){
        return (num % 2 != 0);
    }
    // create all the booleans for isPrime
    public boolean isPrime(){
        return isPrime(value);
    }
    // create all the booleans for isPrime
    public static boolean isPrime(PaulInteger theInt){
        return isPrime(theInt.getValue());
    }
    // create all the booleans for isPrime
    public static boolean isPrime(int num){
        if((num == 1) || (num == 2)){
            return true;
        } // end of if

        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    // tests for equality between integers
    public boolean equals(int num){
        return(num == value);
    }
    // tests for equality between integers
    public boolean equals(PaulInteger theInt){
        return equals(theInt.getValue());
    }
}
