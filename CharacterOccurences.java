import java.util.Scanner;

public class CharacterOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = input.nextLine();

        str = str.toLowerCase();
        char[] ch = str.toCharArray();

        boolean[] b = new boolean[ch.length];

        for(int i = 0; i < ch.length; i++){
            if(b[i]) continue;
            int c = 1;
            for(int j = i + 1; j <ch.length; j++){
                if(ch[i] == ch[j]){
                    c++;
                    b[j] = true;
                }
            }
            System.out.println(ch[i] + " : "+ c);
        }


        input.close();
    }
}