import java.net.InetAddress;
import java.net.UnknownHostException;

public class Get_IP_HostName {
    public static void main(String[] args) throws UnknownHostException {


        InetAddress localAddress = InetAddress.getLocalHost();
        String localHostName = localAddress.getHostName();
        String localHostAddress = localAddress.getHostAddress();

        System.out.println("localHostName : " + localHostName);
        System.out.println("localHostAddress : " + localHostAddress);
    }
}
