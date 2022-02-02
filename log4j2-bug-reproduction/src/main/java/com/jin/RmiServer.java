package com.jin;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author hujin
 * @version 2022/2/2
 */
public class RmiServer {
    public static void main(String[] args)
            throws RemoteException, NamingException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(8088);
        Reference reference = new Reference(null,"com.jin.Look",null);
        registry.bind("look", new ReferenceWrapper(reference));
    }
}
