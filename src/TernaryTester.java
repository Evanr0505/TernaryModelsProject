import java.io.File;
import java.util.Scanner;

public class TernaryTester {

    public static void printStringArray(String [] array){
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void printNumArray(int [] array){
        for (int n : array) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) throws Exception{

        File f = new File ("input.txt");
        Scanner scan = new Scanner(f);
        String numOfTrails = (scan.nextLine());
        System.out.println(numOfTrails);

        int logLength = ((Integer.parseInt(scan.nextLine()))+1);
        String [] redAntLocations = scan.nextLine().split(" ");

        int changesInSigns = 0;
        int stickCounter = changesInSigns;

        int[] log = new int[logLength];

        for(int i = 0; i < log.length-1; i++) {
            log[i] = 0;
         }

        int redAntIndex = 0;
        int valueCounter = 0;
        for(int i = 0; i < log.length-1; i++) {
           if(i == (Integer.parseInt(redAntLocations[redAntIndex]))){
               log[i] = Integer.parseInt(redAntLocations[redAntIndex]); //1 sets the log to a red ant
               redAntIndex = Integer.parseInt(redAntLocations[(valueCounter+1)]);
           }
        }
    printNumArray(log);




    }
    }
