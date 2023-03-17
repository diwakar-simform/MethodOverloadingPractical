public class Addition {
    private long result;

    //First Function : sum() with two arguments of same type
    long sum(int num1, int num2){
        System.out.println("\nFunction : First Called");
        result = 0;
        result  = num1 + num2;
        return result;
    }

    // Second Function : sum() with 3 arguments of same type
    long sum(int num1, int num2, int num3){
        System.out.println("\nFunction : Second Called");
        result=0;
        result = num1 + num2 + num3;
        return result;
    }

    //Third Function : sum() with 2 arguments of different type
    String sum(String FirstName, String LastName){
        System.out.println("\nFunction : Third Called");
        String name = FirstName + LastName;
        return name;
    }
}
