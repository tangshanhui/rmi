import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.swing.JFrame;

public interface RemoteWindow  extends Remote{
     public JFrame getWindow() throws RemoteException;
     public void setName(String name) throws RemoteException;
}
