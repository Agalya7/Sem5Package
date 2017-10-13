import java.io.*;
import java.net.*;

public class User {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            String qs = (String)dis.readUTF();
            System.out.print(qs);
            dout.writeUTF("Agalya");
            dout.flush();
            s.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
