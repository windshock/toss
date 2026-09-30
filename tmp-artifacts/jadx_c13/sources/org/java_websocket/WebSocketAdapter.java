package org.java_websocket;

import o.dw;
import o.eu;
import o.fiz;
import o.gjv;
import o.hz;
import o.jf;
import o.jvd;
import o.kdr;
import o.kyd;
import o.ln;
import o.lw;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class WebSocketAdapter implements eu {
    @Override // o.eu
    public void onWebsocketHandshakeReceivedAsClient(dw dwVar, kdr kdrVar, ln lnVar) throws gjv {
    }

    @Override // o.eu
    public void onWebsocketHandshakeSentAsClient(dw dwVar, kdr kdrVar) throws gjv {
    }

    @Deprecated
    public void onWebsocketMessageFragment(dw dwVar, hz hzVar) {
    }

    @Override // o.eu
    public void onWebsocketPong(dw dwVar, hz hzVar) {
    }

    @Override // o.eu
    public lw onWebsocketHandshakeReceivedAsServer(dw dwVar, fiz fizVar, kdr kdrVar) throws gjv {
        return new kyd();
    }

    @Override // o.eu
    public void onWebsocketPing(dw dwVar, hz hzVar) {
        dwVar.sendFrame(new jf((jvd) hzVar));
    }
}
