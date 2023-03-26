import java.net.Socket;

public class PortScanner {

    public static void main(String[] args) {
        String host = "localhost"; // Replace with the target host name or IP address
        int startPort = 1; // Starting port number
        int endPort = 65535; // Ending port number

        for (int port = startPort; port <= endPort; port++) {
            try {
                Socket socket = new Socket(host, port);
                System.out.println("Port " + port + " is open");
                socket.close();
            } catch (Exception ex) {
                // Port is closed or an error occurred
            }
        }
    }
}
