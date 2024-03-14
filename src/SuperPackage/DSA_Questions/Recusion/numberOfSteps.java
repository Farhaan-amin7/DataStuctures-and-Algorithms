package SuperPackage.DSA_Questions.Recusion;

public class numberOfSteps {
    public static void main(String[] args) { //Question not updated yet. It's the wrong approach.
        int num = 14;
       int count = AnswerNumberofSetps(num);
        System.out.println(count);
    }
    static int AnswerNumberofSetps(int num){
        int count = 0;
        if(num == 0) {return count;}
        if(num % 2 == 0)
        {
           int temp = count++;
            return AnswerNumberofSetps(num / 2);

        }
        count++;
        return AnswerNumberofSetps(num - 1);
    }
}