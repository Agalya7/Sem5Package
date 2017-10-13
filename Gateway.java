/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
            dout.writeUTF("Enter name: ");
            String name = (String)dis.readUTF();
            System.out.println("Name is " + name);
            ss.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
