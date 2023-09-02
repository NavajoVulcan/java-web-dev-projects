import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        String textString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> letters = new HashMap<>();
        for(char letter: textString.toCharArray()){
            if(letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) +1);
            }else{
                letters.put(letter, 1);
            }
        }
        for(Map.Entry<Character, Integer> item: letters.entrySet()){
            System.out.println(item.getKey() + ": " + item.getValue());

        }
    }

}

//test commit
