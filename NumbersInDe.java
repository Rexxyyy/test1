
 /* version 1 */

public class NumbersInDe {
    public static void main(String[] args) {

        int count = 4;
        //---Pre Increment/Decrement

        System.out.println(10+ ++count); // 10+ (1+4)= Print 15 but count stays 5 because ++count saves into count
        System.out.println(1+ --count); // 1+ (1-5)= Print 5 but count stays 4 because --count saves into count
        System.out.println(count); // hence 4

        //-----Post Increment/Decrement

        System.out.println(10 + count++); // 10+4= Print 14 but count increases by 1(4+1=5) because count++ saves into count
        System.out.println(1 + count--); // 1+5= Prints 6 but count decreases by 1 (5-1=4) because count-- saved into count
        System.out.println(count);// 4

      // Operators
        int num = 20;

        num += 1;
        System.out.println("Addition" + " "+  num);

        num -= 1;
        System.out.println("Subtract" + " " + num);

        num *= 10;
        System.out.println("Multiplied" + " " + num);

        num /= 10;
        System.out.println("Division" + " "+ num);

    //OTP- One Time Password generator

        double randomNumber = Math.random();
        System.out.println("Generated Random Number is :" +  " "+ randomNumber);

        randomNumber *= 100000; // 6 digit "Multiplier"
        System.out.println(randomNumber);

        int otp = (int) randomNumber;
        System.out.println("The Opt is :" +  " "+ otp);













    }
}
