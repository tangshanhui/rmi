import java.rmi.Naming;
import java.rmi.Remote;

import javax.swing.JFrame;

public class Client {
	public static void main(String[] args) {
		try {
			Remote object=Naming.lookup("rmi://127.0.0.1/window");
			RemoteWindow remoteObject=(RemoteWindow) object;
			System.out.println("******************");
			System.out.println(remoteObject);
			remoteObject.setName("D://hello.txt");
			JFrame frame=remoteObject.getWindow();
			System.out.println(frame);
			frame.setVisible(true);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
