package o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import o.dy9;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TRNAS_Init_Check {
    Map<yzp2, lt42> IAuthTabCallback;
    Map<Integer, dy9> onExtraCallbackWithResult;
    Map<yzp2, ycx9> onWarmupCompleted;

    private static String onWarmupCompleted(InetAddress inetAddress, int i) {
        return inetAddress.getHostAddress() + "#" + i;
    }

    public dy9 onNavigationEvent(int i) {
        return this.onExtraCallbackWithResult.computeIfAbsent(Integer.valueOf(i), new Function() { // from class: org.xbill.DNS.tools.jnamed$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new dy9(((Integer) obj).intValue());
            }
        });
    }

    public ycx9 onExtraCallbackWithResult(yzp2 yzp2Var) {
        ycx9 ycx9Var = this.onWarmupCompleted.get(yzp2Var);
        if (ycx9Var != null) {
            return ycx9Var;
        }
        int iIAuthTabCallback = yzp2Var.IAuthTabCallback();
        for (int i = 1; i < iIAuthTabCallback; i++) {
            ycx9 ycx9Var2 = this.onWarmupCompleted.get(new yzp2(yzp2Var, i));
            if (ycx9Var2 != null) {
                return ycx9Var2;
            }
        }
        return null;
    }

    public RRset onNavigationEvent(yzp2 yzp2Var, int i, int i2, boolean z) {
        List listOnExtraCallback;
        ycx9 ycx9VarOnExtraCallbackWithResult = onExtraCallbackWithResult(yzp2Var);
        if (ycx9VarOnExtraCallbackWithResult != null) {
            return ycx9VarOnExtraCallbackWithResult.onExtraCallbackWithResult(yzp2Var, i);
        }
        dy9 dy9VarOnNavigationEvent = onNavigationEvent(i2);
        if (z) {
            listOnExtraCallback = dy9VarOnNavigationEvent.IAuthTabCallback(yzp2Var, i);
        } else {
            listOnExtraCallback = dy9VarOnNavigationEvent.onExtraCallback(yzp2Var, i);
        }
        if (listOnExtraCallback == null) {
            return null;
        }
        return (RRset) listOnExtraCallback.get(0);
    }

    void onWarmupCompleted(yzp2 yzp2Var, onChildViewAdded onchildviewadded, RRset rRset, int i, int i2) {
        for (int i3 = 1; i3 <= i; i3++) {
            if (onchildviewadded.onNavigationEvent(yzp2Var, rRset.onExtraCallback(), i3)) {
                return;
            }
        }
        if ((i2 & 2) == 0) {
            for (Record recordOnNavigationEvent : rRset.IAuthTabCallbackDefault()) {
                if (recordOnNavigationEvent.access000().onWarmupCompleted() && !yzp2Var.onWarmupCompleted()) {
                    recordOnNavigationEvent = recordOnNavigationEvent.onNavigationEvent(yzp2Var);
                }
                onchildviewadded.onNavigationEvent(recordOnNavigationEvent, i);
            }
        }
        if ((i2 & 3) != 0) {
            for (Record recordOnNavigationEvent2 : rRset.IAuthTabCallbackStubProxy()) {
                if (recordOnNavigationEvent2.access000().onWarmupCompleted() && !yzp2Var.onWarmupCompleted()) {
                    recordOnNavigationEvent2 = recordOnNavigationEvent2.onNavigationEvent(yzp2Var);
                }
                onchildviewadded.onNavigationEvent(recordOnNavigationEvent2, i);
            }
        }
    }

    private void onWarmupCompleted(onChildViewAdded onchildviewadded, ycx9 ycx9Var) {
        onchildviewadded.onNavigationEvent(ycx9Var.IAuthTabCallback(), 2);
    }

    private void IAuthTabCallback(onChildViewAdded onchildviewadded, ycx9 ycx9Var, int i) {
        RRset rRsetOnExtraCallbackWithResult = ycx9Var.onExtraCallbackWithResult();
        onWarmupCompleted(rRsetOnExtraCallbackWithResult.asInterface(), onchildviewadded, rRsetOnExtraCallbackWithResult, 2, i);
    }

    private void onWarmupCompleted(onChildViewAdded onchildviewadded, dy9 dy9Var, yzp2 yzp2Var) {
        lt38 lt38VarOnExtraCallbackWithResult = dy9Var.onExtraCallbackWithResult(yzp2Var, 2, 0);
        if (lt38VarOnExtraCallbackWithResult.IAuthTabCallbackStub()) {
            Iterator it = lt38VarOnExtraCallbackWithResult.onNavigationEvent().IAuthTabCallbackDefault().iterator();
            while (it.hasNext()) {
                onchildviewadded.onNavigationEvent((Record) it.next(), 2);
            }
        }
    }

    private void onNavigationEvent(onChildViewAdded onchildviewadded, yzp2 yzp2Var, int i) {
        RRset rRsetOnNavigationEvent = onNavigationEvent(yzp2Var, 1, 1, true);
        if (rRsetOnNavigationEvent == null) {
            return;
        }
        onWarmupCompleted(yzp2Var, onchildviewadded, rRsetOnNavigationEvent, 3, i);
    }

    private void IAuthTabCallback(onChildViewAdded onchildviewadded, int i, int i2) {
        Iterator it = onchildviewadded.onWarmupCompleted(i).iterator();
        while (it.hasNext()) {
            yzp2 yzp2VarCA_ = ((Record) it.next()).cA_();
            if (yzp2VarCA_ != null) {
                onNavigationEvent(onchildviewadded, yzp2VarCA_, i2);
            }
        }
    }

    private void onExtraCallback(onChildViewAdded onchildviewadded, int i) {
        IAuthTabCallback(onchildviewadded, 1, i);
        IAuthTabCallback(onchildviewadded, 2, i);
    }

    byte onWarmupCompleted(onChildViewAdded onchildviewadded, yzp2 yzp2Var, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        lt38 lt38VarOnExtraCallbackWithResult;
        if (i3 > 6) {
            return (byte) 0;
        }
        if (i == 24 || i == 46) {
            i5 = i4 | 2;
            i6 = 255;
        } else {
            i5 = i4;
            i6 = i;
        }
        ycx9 ycx9VarOnExtraCallbackWithResult = onExtraCallbackWithResult(yzp2Var);
        if (ycx9VarOnExtraCallbackWithResult != null) {
            lt38VarOnExtraCallbackWithResult = ycx9VarOnExtraCallbackWithResult.onNavigationEvent(yzp2Var, i6);
        } else {
            lt38VarOnExtraCallbackWithResult = onNavigationEvent(i2).onExtraCallbackWithResult(yzp2Var, i6, 3);
        }
        if (lt38VarOnExtraCallbackWithResult.IAuthTabCallback_Parcel()) {
            onWarmupCompleted(onchildviewadded, onNavigationEvent(i2), yzp2Var);
        }
        if (lt38VarOnExtraCallbackWithResult.asInterface()) {
            onchildviewadded.IAuthTabCallback().onTransact(3);
            if (ycx9VarOnExtraCallbackWithResult != null) {
                onWarmupCompleted(onchildviewadded, ycx9VarOnExtraCallbackWithResult);
                if (i3 == 0) {
                    onchildviewadded.IAuthTabCallback().IAuthTabCallback(5);
                }
            }
            return (byte) 3;
        }
        if (lt38VarOnExtraCallbackWithResult.onTransact()) {
            if (ycx9VarOnExtraCallbackWithResult != null) {
                onWarmupCompleted(onchildviewadded, ycx9VarOnExtraCallbackWithResult);
                if (i3 == 0) {
                    onchildviewadded.IAuthTabCallback().IAuthTabCallback(5);
                    return (byte) 0;
                }
            }
        } else {
            if (lt38VarOnExtraCallbackWithResult.IAuthTabCallbackStub()) {
                RRset rRsetOnNavigationEvent = lt38VarOnExtraCallbackWithResult.onNavigationEvent();
                onWarmupCompleted(rRsetOnNavigationEvent.asInterface(), onchildviewadded, rRsetOnNavigationEvent, 2, i5);
                return (byte) 0;
            }
            if (lt38VarOnExtraCallbackWithResult.onExtraCallbackWithResult()) {
                jcdj jcdjVarOnExtraCallback = lt38VarOnExtraCallbackWithResult.onExtraCallback();
                onWarmupCompleted(yzp2Var, onchildviewadded, new RRset(jcdjVarOnExtraCallback), 1, i5);
                if (ycx9VarOnExtraCallbackWithResult != null && i3 == 0) {
                    onchildviewadded.IAuthTabCallback().IAuthTabCallback(5);
                }
                return onWarmupCompleted(onchildviewadded, jcdjVarOnExtraCallback.onNavigationEvent(), i6, i2, i3 + 1, i5);
            }
            if (lt38VarOnExtraCallbackWithResult.asBinder()) {
                uhzb uhzbVarOnWarmupCompleted = lt38VarOnExtraCallbackWithResult.onWarmupCompleted();
                onWarmupCompleted(yzp2Var, onchildviewadded, new RRset(uhzbVarOnWarmupCompleted), 1, i5);
                try {
                    yzp2 yzp2VarOnExtraCallbackWithResult = yzp2Var.onExtraCallbackWithResult(uhzbVarOnWarmupCompleted);
                    onWarmupCompleted(yzp2Var, onchildviewadded, new RRset(new jcdj(yzp2Var, i2, 0L, yzp2VarOnExtraCallbackWithResult)), 1, i5);
                    if (ycx9VarOnExtraCallbackWithResult != null && i3 == 0) {
                        onchildviewadded.IAuthTabCallback().IAuthTabCallback(5);
                    }
                    return onWarmupCompleted(onchildviewadded, yzp2VarOnExtraCallbackWithResult, i6, i2, i3 + 1, i5);
                } catch (NameTooLongException unused) {
                    return (byte) 6;
                }
            }
            if (lt38VarOnExtraCallbackWithResult.IAuthTabCallbackDefault()) {
                Iterator it = lt38VarOnExtraCallbackWithResult.IAuthTabCallback().iterator();
                while (it.hasNext()) {
                    onWarmupCompleted(yzp2Var, onchildviewadded, (RRset) it.next(), 1, i5);
                }
                if (ycx9VarOnExtraCallbackWithResult != null) {
                    IAuthTabCallback(onchildviewadded, ycx9VarOnExtraCallbackWithResult, i5);
                    if (i3 == 0) {
                        onchildviewadded.IAuthTabCallback().IAuthTabCallback(5);
                        return (byte) 0;
                    }
                } else {
                    onWarmupCompleted(onchildviewadded, onNavigationEvent(i2), yzp2Var);
                }
            }
        }
        return (byte) 0;
    }

    byte[] IAuthTabCallback(yzp2 yzp2Var, onChildViewAdded onchildviewadded, lt42 lt42Var, lt46 lt46Var, Socket socket) throws IOException {
        ycx9 ycx9Var = this.onWarmupCompleted.get(yzp2Var);
        if (ycx9Var == null) {
            return onNavigationEvent(onchildviewadded, 5);
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            int iOnNavigationEvent = onchildviewadded.IAuthTabCallback().onNavigationEvent();
            Iterator<RRset> itOnWarmupCompleted = ycx9Var.onWarmupCompleted();
            lt46 lt46VarIAuthTabCallbackDefault = lt46Var;
            boolean z = true;
            while (itOnWarmupCompleted.hasNext()) {
                RRset next = itOnWarmupCompleted.next();
                onChildViewAdded onchildviewadded2 = new onChildViewAdded(iOnNavigationEvent);
                setNotificationUri setnotificationuriIAuthTabCallback = onchildviewadded2.IAuthTabCallback();
                setnotificationuriIAuthTabCallback.IAuthTabCallback(0);
                setnotificationuriIAuthTabCallback.IAuthTabCallback(5);
                onWarmupCompleted(next.asInterface(), onchildviewadded2, next, 1, 1);
                if (lt42Var != null) {
                    lt42Var.onWarmupCompleted(onchildviewadded2, lt46VarIAuthTabCallbackDefault, z);
                    lt46VarIAuthTabCallbackDefault = onchildviewadded2.IAuthTabCallbackDefault();
                }
                byte[] bArrAccess100 = onchildviewadded2.access100();
                dataOutputStream.writeShort(bArrAccess100.length);
                dataOutputStream.write(bArrAccess100);
                z = false;
            }
        } catch (IOException unused) {
            System.out.println("AXFR failed");
        }
        try {
            socket.close();
            return null;
        } catch (IOException unused2) {
            return null;
        }
    }

    byte[] onExtraCallbackWithResult(onChildViewAdded onchildviewadded, byte[] bArr, Socket socket) {
        lt42 lt42Var;
        int iMax;
        setNotificationUri setnotificationuriIAuthTabCallback = onchildviewadded.IAuthTabCallback();
        if (setnotificationuriIAuthTabCallback.onExtraCallback(0)) {
            return null;
        }
        if (setnotificationuriIAuthTabCallback.onExtraCallback() != 0) {
            return onNavigationEvent(onchildviewadded, 1);
        }
        if (setnotificationuriIAuthTabCallback.IAuthTabCallback() != 0) {
            return onNavigationEvent(onchildviewadded, 4);
        }
        Record recordOnNavigationEvent = onchildviewadded.onNavigationEvent();
        lt46 lt46VarIAuthTabCallbackDefault = onchildviewadded.IAuthTabCallbackDefault();
        if (lt46VarIAuthTabCallbackDefault != null) {
            lt42 lt42Var2 = this.IAuthTabCallback.get(lt46VarIAuthTabCallbackDefault.access000());
            if (lt42Var2 == null || lt42Var2.onExtraCallbackWithResult(onchildviewadded, bArr, (lt46) null) != 0) {
                return onExtraCallbackWithResult(bArr);
            }
            lt42Var = lt42Var2;
        } else {
            lt42Var = null;
        }
        fby10 fby10VarOnExtraCallback = onchildviewadded.onExtraCallback();
        if (socket != null) {
            iMax = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        } else {
            iMax = 512;
            if (fby10VarOnExtraCallback != null) {
                iMax = Math.max(fby10VarOnExtraCallback.IAuthTabCallbackStub(), 512);
            }
        }
        int i = iMax;
        int i2 = (fby10VarOnExtraCallback == null || (fby10VarOnExtraCallback.onNavigationEvent() & 32768) == 0) ? 0 : 1;
        onChildViewAdded onchildviewadded2 = new onChildViewAdded(onchildviewadded.IAuthTabCallback().onNavigationEvent());
        onchildviewadded2.IAuthTabCallback().IAuthTabCallback(0);
        if (onchildviewadded.IAuthTabCallback().onExtraCallback(7)) {
            onchildviewadded2.IAuthTabCallback().IAuthTabCallback(7);
        }
        onchildviewadded2.onNavigationEvent(recordOnNavigationEvent, 0);
        yzp2 yzp2VarAccess000 = recordOnNavigationEvent.access000();
        int iExtraCallback = recordOnNavigationEvent.extraCallback();
        int interfaceDescriptor = recordOnNavigationEvent.getInterfaceDescriptor();
        if (iExtraCallback == 252 && socket != null) {
            return IAuthTabCallback(yzp2VarAccess000, onchildviewadded, lt42Var, lt46VarIAuthTabCallbackDefault, socket);
        }
        if (!lt54.onWarmupCompleted(iExtraCallback) && iExtraCallback != 255) {
            return onNavigationEvent(onchildviewadded, 4);
        }
        int i3 = i2;
        byte bOnWarmupCompleted = onWarmupCompleted(onchildviewadded2, yzp2VarAccess000, iExtraCallback, interfaceDescriptor, 0, i3);
        if (bOnWarmupCompleted != 0 && bOnWarmupCompleted != 3) {
            return onNavigationEvent(onchildviewadded, bOnWarmupCompleted);
        }
        onExtraCallback(onchildviewadded2, i3);
        if (fby10VarOnExtraCallback != null) {
            onchildviewadded2.onNavigationEvent(new fby10(PKIFailureInfo.certConfirmed, bOnWarmupCompleted, 0, i3 == 1 ? 32768 : 0), 3);
        }
        onchildviewadded2.IAuthTabCallback(lt42Var, 0, lt46VarIAuthTabCallbackDefault);
        return onchildviewadded2.IAuthTabCallback(i);
    }

    byte[] onWarmupCompleted(setNotificationUri setnotificationuri, int i, Record record) {
        onChildViewAdded onchildviewadded = new onChildViewAdded();
        onchildviewadded.IAuthTabCallback(setnotificationuri);
        for (int i2 = 0; i2 < 4; i2++) {
            onchildviewadded.onExtraCallback(i2);
        }
        if (i == 2) {
            onchildviewadded.onNavigationEvent(record, 0);
        }
        setnotificationuri.onTransact(i);
        return onchildviewadded.access100();
    }

    public byte[] onExtraCallbackWithResult(byte[] bArr) {
        try {
            return onWarmupCompleted(new setNotificationUri(bArr), 1, (Record) null);
        } catch (IOException unused) {
            return null;
        }
    }

    public byte[] onNavigationEvent(onChildViewAdded onchildviewadded, int i) {
        return onWarmupCompleted(onchildviewadded.IAuthTabCallback(), i, onchildviewadded.onNavigationEvent());
    }

    public void onWarmupCompleted(Socket socket) throws IOException {
        byte[] bArrOnExtraCallbackWithResult;
        try {
            InputStream inputStream = socket.getInputStream();
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
                dataInputStream.readFully(bArr);
                try {
                    bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(new onChildViewAdded(bArr), bArr, socket);
                    if (bArrOnExtraCallbackWithResult == null) {
                        if (inputStream != null) {
                            inputStream.close();
                            return;
                        }
                        return;
                    }
                } catch (IOException unused) {
                    bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr);
                }
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeShort(bArrOnExtraCallbackWithResult.length);
                dataOutputStream.write(bArrOnExtraCallbackWithResult);
                if (inputStream != null) {
                    inputStream.close();
                }
            } finally {
            }
        } catch (IOException e) {
            System.out.println("TCPclient(" + onWarmupCompleted(socket.getLocalAddress(), socket.getLocalPort()) + "): " + e);
        }
    }

    public void onExtraCallback(InetAddress inetAddress, int i) {
        try {
            while (true) {
                try {
                    final Socket socketAccept = new ServerSocket(i, 128, inetAddress).accept();
                    new Thread(new Runnable() { // from class: org.xbill.DNS.tools.jnamed$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() throws IOException {
                            this.f$0.onWarmupCompleted(socketAccept);
                        }
                    }).start();
                } finally {
                }
            }
        } catch (IOException e) {
            System.out.println("serveTCP(" + onWarmupCompleted(inetAddress, i) + "): " + e);
        }
    }

    public void onExtraCallbackWithResult(InetAddress inetAddress, int i) {
        byte[] bArrOnExtraCallbackWithResult;
        try {
            DatagramSocket datagramSocket = new DatagramSocket(i, inetAddress);
            try {
                byte[] bArr = new byte[512];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 512);
                DatagramPacket datagramPacket2 = null;
                while (true) {
                    datagramPacket.setLength(512);
                    try {
                        datagramSocket.receive(datagramPacket);
                        try {
                            bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(new onChildViewAdded(bArr), bArr, null);
                        } catch (IOException unused) {
                            bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr);
                        }
                    } catch (InterruptedIOException unused2) {
                    }
                    if (bArrOnExtraCallbackWithResult != null) {
                        if (datagramPacket2 == null) {
                            datagramPacket2 = new DatagramPacket(bArrOnExtraCallbackWithResult, bArrOnExtraCallbackWithResult.length, datagramPacket.getAddress(), datagramPacket.getPort());
                        } else {
                            datagramPacket2.setData(bArrOnExtraCallbackWithResult);
                            datagramPacket2.setLength(bArrOnExtraCallbackWithResult.length);
                            datagramPacket2.setAddress(datagramPacket.getAddress());
                            datagramPacket2.setPort(datagramPacket.getPort());
                        }
                        datagramSocket.send(datagramPacket2);
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            System.out.println("serveUDP(" + onWarmupCompleted(inetAddress, i) + "): " + e);
        }
    }
}
