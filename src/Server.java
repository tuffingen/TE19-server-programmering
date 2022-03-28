import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        int port = 1234;
        ServerSocket serverSocket;
        Socket clientSocket = null;
        System.out.println("Server started");
        Scanner sc = new Scanner(System.in);
        BufferedReader in;
        PrintWriter out;

        try{
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.out);
            Thread sender = new Thread(new Runnable() {


                String msg;
                @Override
                public void run() {
                    while (true){
                        msg = sc.nextLine();
                        out.println();
                    }

                }
            });

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Client failed to connect");
            System.exit(0);
        }
    }
    }

