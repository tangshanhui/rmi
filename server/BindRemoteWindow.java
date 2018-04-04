import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class BindRemoteWindow {

	public static void main(String[] args) {
		try {
			RemoteConcreteWindow remotewindow=new RemoteConcreteWindow();
			Naming.rebind("rmi://127.0.0.1/window",remotewindow);
			System.out.println("be ready for client server......");
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp);
		} 
	}
}
