class Decipherer {

    public static String reverse (String word)  {

        int len = word.length();
        String strReverse = "";
        for(int a = len - 1; a >= 0; a--) {

            strReverse = strReverse + word.charAt(a);
        }
        return strReverse;
    }

    public static String décoder (String message) {
        //je calcule la longueur du message
        int length = message.length();
        //je le divise par 2
        int keyNumber = (int) length/2;
        //je recupere la sous-chaine et je commence à partir du 6ieme caractère
        int endIndex = (int) keyNumber + 5;
        String subChain = message.substring(5, endIndex );
        //je remplace les caractères "@#?" que j'ai ciblé et les remplaces par " "
        String corrected = subChain.replace("@#?"," ");
        // j'inverse la chaine de caractère
        String reversed = reverse(corrected);
        System.out.println(reversed);
        return reversed;
    }

    public static void main (String[] args) {
        //je stock mes messages à décoder
        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
        //je traduis les messages secret
        String secret1 = décoder(message1);
        String secret2 = décoder(message2);
        String secret3 = décoder(message3);
    }
}