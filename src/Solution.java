import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        Man man = new Man("Sergey");
        System.out.println(man.getName());
        String s = null;
        try {
            s = reader.readLine();
            if (s.equals("Sergey")){
                s = "Admin";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        man.setName(s);
        System.out.println(s);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
