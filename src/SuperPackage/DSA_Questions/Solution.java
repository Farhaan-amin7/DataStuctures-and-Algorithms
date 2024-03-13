package SuperPackage.DSA_Questions;

class Solution
{
    public static void main(String[] args) {
        printNos(10);
    }
    public static void printNos(int N)
    {
        //Your code here
        if(N > 9){
            System.out.println();
        }
        else System.out.println(N);
        if(N <= 1){

            return;
        }
        printNos(N - 1);
    }
}