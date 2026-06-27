import java.util.Scanner;

class Vow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int vowel = 0, consonant = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowel++;
            }
            else
            {
                consonant++;
            }
        }

        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonant);
    }
}