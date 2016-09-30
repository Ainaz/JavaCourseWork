import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Ainaz on 28.09.2016.
 */
public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstArray[] = new int[10];
        int secondArray[] = new int[2];
        int count = 0;
        int next = 0;

        //Filling in first array
        for(int i = 0; i < firstArray.length; i++){
            firstArray[i] = Integer.parseInt(reader.readLine());
        }

        //The calculation of the number of even numbers
        for (int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] % 2 == 0){
                count++;
            }
        }

        //Array for storage of even numbers
        int tempArray[] = new int[count];

        //Filling an array of even numbers
        for (int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] % 2 == 0){
                tempArray[next] = firstArray[i];
                next++;
            }
        }

        //Filling an array of even numbers
        Arrays.sort(tempArray);

        //Filling an second array
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = tempArray[i];
            System.out.print(secondArray[i] + " ");
        }
    }
}
