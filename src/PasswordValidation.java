/**
 * Created by Frank Hall on 5/15/2016.
 */
import java.util.*;

public class PasswordValidation
{
    public static void main(String[] args)
    {
        String aString;
        int strLength;
        int upper = 0;
        int lower = 0;
        int special = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Password: ");
        aString = input.nextLine();
        strLength = aString.length();

        for(int i = 0; i < strLength; i++)
        {
            char ch = aString.charAt(i);

            if(Character.isUpperCase(ch))
            {
                upper++;
            }
            else if(Character.isLowerCase(ch))
            {
                lower++;
            }
            else if(ch >= 33 && ch <= 44)
            {
                special++;
            }
        }

        if(upper >= 2 && lower >= 2 && special >= 1)
        {
            System.out.println("Password is good");
        }

        else
        {
            System.out.println("Password has failed validation");
        }
    }
}