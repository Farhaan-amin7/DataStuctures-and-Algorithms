package SuperPackage.DSA_Questions;

public class BirthAndDeathYear {
    public static void main(String[] args) {
        int [][] logs = {
                {1950,1961},
                {1960,1971},
                {1970,1981}
        };
        int Year = MaximumPopulationYear(logs);
        System.out.println(Year);
        
    }

     static int MaximumPopulationYear(int[][] logs) {
        int [] population = new int[101];
         for (int i = 0; i < logs.length; i++) {
             int start = logs[i][0];
             int end = logs[i][1];
             for (int j = start - 1950; j < end - 1950; j++) {
                 population[j]++;
             }
         }
             int result = -1;
             int year = -1;
             for (int j = 0; j < population.length; j++) {

                 if(population[j] > result){
                       result = population[j];
                       year = j;
                 }
             }
         return year + 1950;
    }
}