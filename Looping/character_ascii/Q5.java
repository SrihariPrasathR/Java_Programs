package character_ascii;

public class Q5 {
    public static void main(String[] args) {
        char ch = 'a';

        System.out.println("Vowels:");
        while (ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.println(ch);
            ch++;
        }

        ch = 'a';
        System.out.println("Consonants:");
        while (ch <= 'z') {
            if (!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                System.out.println(ch);
            ch++;
        }
    }
}
