package com.tnkfactory.ad.rwd;

import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SSLFactory extends SSLSocketFactory {
    public final SSLSocketFactory a;

    public SSLFactory() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.a = sSLContext.getSocketFactory();
    }

    public static Socket a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            for (String str : sSLSocket.getEnabledProtocols()) {
                if (str.toUpperCase().contains("TLS")) {
                    arrayList.add(str);
                }
            }
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return a(this.a.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i2, boolean z) {
        return a(this.a.createSocket(socket, str, i2, z));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2) {
        return a(this.a.createSocket(str, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return a(this.a.createSocket(str, i2, inetAddress, i3));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2) {
        return a(this.a.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return a(this.a.createSocket(inetAddress, i2, inetAddress2, i3));
    }
}
