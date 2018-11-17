package Task1;
import java.io.*;
import java.io.IOException;


public class Student {
    private String [] names = new String[500];
    private int[] grades = new int[500];
    private int sz = 0;
    private int max =0, average = 0;
    private int min = Integer.MAX_VALUE;

  public   void getMarks() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("Scores.txt"));
        try{
            StringBuilder sb = new StringBuilder();
            String line ="";
            while(true){
                line = br.readLine();
                if(line == null)
                    break;
                    String [] arr = line.split(" ");
                    names[sz] = arr[0] + " " + arr[1];
                    grades [sz] = Integer.parseInt(arr[2]);
                    max = Math.max(max, grades[sz]);
                    min = Math.min(min, grades[sz]);
                    average += grades[sz];
                    ++sz;
            }
        } finally {
            br.close();
        }

    }
    String getMark(int x){
        if (max - 10 <= x)
            return "A";
        else if (max - 20 <= x)
            return "B";
        else if (max - 30 <= x)
            return "C";
        else if (max - 40 <=x )
            return "D";
        return "F";
    }
   public void putMark () throws IOException {
        PrintWriter out = new PrintWriter("Grades.txt");
        BufferedWriter bw = new BufferedWriter(out);
        for (int i = 0; i < sz; i++) {
            out.println(names[i] + " - " + "'" + getMark(grades[i]) + "'");
        }
        out.println();
        out.println("Average" + " "  + average / sz);
        out.println("Max" + " " +  max);
        out.println("Min" + " " +  min);
        out.close();
    }

    public void getMark() {
    }
}
