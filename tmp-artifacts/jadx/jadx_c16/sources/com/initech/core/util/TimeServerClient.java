package com.initech.core.util;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class TimeServerClient {
    private int a;
    private DatagramSocket b;
    private DatagramPacket c;

    public TimeServerClient(String str, int i) throws SocketException {
        this(str, i, 8192, 30000);
    }

    public TimeServerClient(String str, int i, int i2) throws SocketException {
        this(str, i, i2, 30000);
    }

    public TimeServerClient(String str, int i, int i2, int i3) throws SocketException, UnknownHostException {
        InetAddress byName;
        try {
            byName = InetAddress.getByName(str);
        } catch (UnknownHostException unused) {
            byName = null;
        }
        this.c = new DatagramPacket(new byte[1], 1, byName, i);
        this.a = i2;
        DatagramSocket datagramSocket = new DatagramSocket(0);
        this.b = datagramSocket;
        datagramSocket.connect(byName, i);
        this.b.setSoTimeout(i3);
    }

    public static void main(String str) {
        try {
            Date date = new Date(new TimeServerClient("203.248.240.140", 37).getTimefromTimeServer());
            System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm ss").format(date));
        } catch (SocketException unused) {
        }
    }

    public long getTimefromTimeServer() throws IOException {
        try {
            this.b.send(this.c);
            int i = this.a;
            DatagramPacket datagramPacket = new DatagramPacket(new byte[i], i);
            this.b.receive(datagramPacket);
            int length = datagramPacket.getLength();
            System.arraycopy(datagramPacket.getData(), 0, new byte[length], 0, length);
            if (length != 4) {
                throw new IOException("정의되지 않은 Response 포맷입니다.");
            }
            long j = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                j = (j << 8) | (r4[i2] & 255);
            }
            return (j - 2208988800L) * 1000;
        } catch (IOException unused) {
            return 0L;
        }
    }

    public byte[] poke() throws IOException {
        try {
            this.b.send(this.c);
            int i = this.a;
            DatagramPacket datagramPacket = new DatagramPacket(new byte[i], i);
            this.b.receive(datagramPacket);
            int length = datagramPacket.getLength();
            byte[] bArr = new byte[length];
            try {
                System.arraycopy(datagramPacket.getData(), 0, bArr, 0, length);
                return bArr;
            } catch (IOException unused) {
                return bArr;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
