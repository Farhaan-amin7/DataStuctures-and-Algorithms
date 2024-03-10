package SuperPackage.DSA_Questions;


import static java.lang.String.valueOf;

public class GoalInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";

        String result = InterpretationQuestion(command);
        System.out.println(result);
    }

    private static String InterpretationQuestion(String command) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
         while(i < command.length()){

             if(command.charAt(i) == 'G'){
                 sb.append('G');
                 i++;
             }
             else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                 sb.append('o');
                 i = i + 2;
             }
             else{
                 sb.append("al");
                 i += 4;
             }

         }
         return sb.toString();
    }


}