package o;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface eu {
    InetSocketAddress getLocalSocketAddress(dw dwVar);

    InetSocketAddress getRemoteSocketAddress(dw dwVar);

    void onWebsocketClose(dw dwVar, int i, String str, boolean z);

    void onWebsocketCloseInitiated(dw dwVar, int i, String str);

    void onWebsocketClosing(dw dwVar, int i, String str, boolean z);

    void onWebsocketError(dw dwVar, Exception exc);

    void onWebsocketHandshakeReceivedAsClient(dw dwVar, kdr kdrVar, ln lnVar) throws gjv;

    lw onWebsocketHandshakeReceivedAsServer(dw dwVar, fiz fizVar, kdr kdrVar) throws gjv;

    void onWebsocketHandshakeSentAsClient(dw dwVar, kdr kdrVar) throws gjv;

    void onWebsocketMessage(dw dwVar, String str);

    void onWebsocketMessage(dw dwVar, ByteBuffer byteBuffer);

    void onWebsocketOpen(dw dwVar, kfb kfbVar);

    void onWebsocketPing(dw dwVar, hz hzVar);

    void onWebsocketPong(dw dwVar, hz hzVar);

    void onWriteDemand(dw dwVar);
}
