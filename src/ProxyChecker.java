import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProxyChecker {
    public static void main(String[] args) {
        // Хотим получить ip: 139.5.64.108 port: 80
        try {
            FileInputStream fis = new FileInputStream("D://java/ip.txt");
            int i;
            String socket = "";
            while ((i = fis.read()) != -1){
                if(i==13) continue;
                else if (i==10) {
                    String ip = socket.split(":")[0];
                    String port = socket.split(":")[1];
                    System.out.println("IP: " +ip+ " port: " +port);
                    socket = "";
                }else {
                    socket += (char) i;
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
