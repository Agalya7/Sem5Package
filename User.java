import java.io.*;
import java.net.*;
import java.util.*;

public class User {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner str = new Scanner(System.in);
            String qs = (String)dis.readUTF();
            System.out.print(qs);
            
            String option = str.next();
            dout.writeUTF(option);
            switch(option) {
                case "1": {
                    
                }
                case "2": {
                    String stat1 = (String)dis.readUTF();
                    System.out.print(stat1);
                    dout.writeUTF(str.next());
                    //dout.writeUTF()
                }
            }
            dout.flush();
            s.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
