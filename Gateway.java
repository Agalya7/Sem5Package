/**
 *
 * @author 15pt03
 */

import java.io.*;
import java.net.*;

public class Gateway {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Enter your option:\n1. Log In\n2. Sign Up\n\n");
            String option = (String)dis.readUTF();
            switch(option) {
                case "1": {
                    
                }
                case "2": {
                    dout.writeUTF("Signing up...\n\nUser Name: ");
                    System.out.println("User Name: " + dis.readUTF());
                }
            }
            //System.out.println("Name is " + name);
            ss.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
