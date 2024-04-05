package SuperPackage.DSA_Questions;

public class GreatestLeeter {
    public static void main(String[] args) {
    char [] letters = {'c' , 'f' , 'j'};
    Letter(letters, 'c');
    }
  static void Letter(char [] letters, char target){
        int start = 0;
        int end = letters.length - 1;
      while(start<=end){
          int mid = start + (end - start)/2;
          if(letters[mid]>target){
              end = mid - 1;
          }
          else{
              start = mid + 1;
          }
      }
      System.out.println(letters[start % letters.length]);
    }
}