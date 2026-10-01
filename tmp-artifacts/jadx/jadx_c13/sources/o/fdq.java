package o;

import j$.util.DesugarTimeZone;
import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;
import o.dw;
import o.fiz;
import o.hz;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fdq extends fiz {
    private List<ByteBuffer> IAuthTabCallback;
    private ByteBuffer IAuthTabCallbackDefault;
    private List<goq> IAuthTabCallbackStub;
    private goq onExtraCallbackWithResult;
    private hz onNavigationEvent;
    private final Random onTransact;

    public fdq() {
        this(Collections.EMPTY_LIST);
    }

    public fdq(List<goq> list) {
        this.onExtraCallbackWithResult = new hti();
        this.onTransact = new Random();
        this.IAuthTabCallbackStub = new ArrayList();
        this.IAuthTabCallback = new ArrayList();
        Iterator<goq> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getClass().equals(hti.class)) {
                z = true;
            }
        }
        this.IAuthTabCallbackStub.addAll(list);
        if (z) {
            return;
        }
        List<goq> list2 = this.IAuthTabCallbackStub;
        list2.add(list2.size(), this.onExtraCallbackWithResult);
    }

    @Override // o.fiz
    public fiz.onExtraCallbackWithResult onExtraCallbackWithResult(kdr kdrVar) throws ghr {
        if (onExtraCallbackWithResult((kfb) kdrVar) != 13) {
            return fiz.onExtraCallbackWithResult.NOT_MATCHED;
        }
        String strOnExtraCallback = kdrVar.onExtraCallback("Sec-WebSocket-Extensions");
        for (goq goqVar : this.IAuthTabCallbackStub) {
            if (goqVar.onWarmupCompleted(strOnExtraCallback)) {
                this.onExtraCallbackWithResult = goqVar;
                return fiz.onExtraCallbackWithResult.MATCHED;
            }
        }
        return fiz.onExtraCallbackWithResult.NOT_MATCHED;
    }

    @Override // o.fiz
    public fiz.onExtraCallbackWithResult onWarmupCompleted(kdr kdrVar, ln lnVar) throws ghr {
        if (!onNavigationEvent(lnVar)) {
            return fiz.onExtraCallbackWithResult.NOT_MATCHED;
        }
        if (!kdrVar.onWarmupCompleted("Sec-WebSocket-Key") || !lnVar.onWarmupCompleted("Sec-WebSocket-Accept")) {
            return fiz.onExtraCallbackWithResult.NOT_MATCHED;
        }
        if (!onWarmupCompleted(kdrVar.onExtraCallback("Sec-WebSocket-Key")).equals(lnVar.onExtraCallback("Sec-WebSocket-Accept"))) {
            return fiz.onExtraCallbackWithResult.NOT_MATCHED;
        }
        String strOnExtraCallback = lnVar.onExtraCallback("Sec-WebSocket-Extensions");
        for (goq goqVar : this.IAuthTabCallbackStub) {
            if (goqVar.IAuthTabCallback(strOnExtraCallback)) {
                this.onExtraCallbackWithResult = goqVar;
                return fiz.onExtraCallbackWithResult.MATCHED;
            }
        }
        return fiz.onExtraCallbackWithResult.NOT_MATCHED;
    }

    public goq onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public List<goq> IAuthTabCallback() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.fiz
    public ksy onNavigationEvent(ksy ksyVar) {
        ksyVar.onExtraCallback("Upgrade", "websocket");
        ksyVar.onExtraCallback("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.onTransact.nextBytes(bArr);
        ksyVar.onExtraCallback("Sec-WebSocket-Key", mm.onExtraCallback(bArr));
        ksyVar.onExtraCallback("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        for (goq goqVar : this.IAuthTabCallbackStub) {
            if (goqVar.onExtraCallback() != null && goqVar.onExtraCallback().length() != 0) {
                sb.append(goqVar.onExtraCallback());
                sb.append("; ");
            }
        }
        if (sb.length() != 0) {
            ksyVar.onExtraCallback("Sec-WebSocket-Extensions", sb.toString());
        }
        return ksyVar;
    }

    @Override // o.fiz
    public lbb onNavigationEvent(kdr kdrVar, lw lwVar) throws ghr {
        lwVar.onExtraCallback("Upgrade", "websocket");
        lwVar.onExtraCallback("Connection", kdrVar.onExtraCallback("Connection"));
        String strOnExtraCallback = kdrVar.onExtraCallback("Sec-WebSocket-Key");
        if (strOnExtraCallback == null) {
            throw new ghr("missing Sec-WebSocket-Key");
        }
        lwVar.onExtraCallback("Sec-WebSocket-Accept", onWarmupCompleted(strOnExtraCallback));
        if (onExtraCallback().onWarmupCompleted().length() != 0) {
            lwVar.onExtraCallback("Sec-WebSocket-Extensions", onExtraCallback().onWarmupCompleted());
        }
        lwVar.IAuthTabCallback("Web Socket Protocol Handshake");
        lwVar.onExtraCallback("Server", "TooTallNate Java-WebSocket");
        lwVar.onExtraCallback("Date", IAuthTabCallbackDefault());
        return lwVar;
    }

    @Override // o.fiz
    public fiz onExtraCallbackWithResult() {
        ArrayList arrayList = new ArrayList();
        Iterator<goq> it = IAuthTabCallback().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().onNavigationEvent());
        }
        return new fdq(arrayList);
    }

    @Override // o.fiz
    public ByteBuffer onWarmupCompleted(hz hzVar) {
        onExtraCallback();
        if (fh.onNavigationEvent) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("afterEnconding(");
            sb.append(hzVar.IAuthTabCallback().remaining());
            sb.append("): {");
            sb.append(hzVar.IAuthTabCallback().remaining() > 1000 ? "too big to display" : new String(hzVar.IAuthTabCallback().array()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        return onNavigationEvent(hzVar);
    }

    private ByteBuffer onNavigationEvent(hz hzVar) {
        ByteBuffer byteBufferIAuthTabCallback = hzVar.IAuthTabCallback();
        int i = 0;
        boolean z = this.onExtraCallback == dw.onExtraCallback.CLIENT;
        int i2 = byteBufferIAuthTabCallback.remaining() <= 125 ? 1 : byteBufferIAuthTabCallback.remaining() <= 65535 ? 2 : 8;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i2 > 1 ? i2 + 1 : i2) + 1 + (z ? 4 : 0) + byteBufferIAuthTabCallback.remaining());
        byte bOnNavigationEvent = onNavigationEvent(hzVar.onNavigationEvent());
        boolean zIAuthTabCallbackStub = hzVar.IAuthTabCallbackStub();
        byte b = ByteCompanionObject.MIN_VALUE;
        byteBufferAllocate.put((byte) (((byte) (zIAuthTabCallbackStub ? -128 : 0)) | bOnNavigationEvent));
        byte[] bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(byteBufferIAuthTabCallback.remaining(), i2);
        if (i2 == 1) {
            byte b2 = bArrOnExtraCallbackWithResult[0];
            if (!z) {
                b = 0;
            }
            byteBufferAllocate.put((byte) (b2 | b));
        } else if (i2 == 2) {
            if (!z) {
                b = 0;
            }
            byteBufferAllocate.put((byte) (b | 126));
            byteBufferAllocate.put(bArrOnExtraCallbackWithResult);
        } else if (i2 == 8) {
            if (!z) {
                b = 0;
            }
            byteBufferAllocate.put((byte) (b | ByteCompanionObject.MAX_VALUE));
            byteBufferAllocate.put(bArrOnExtraCallbackWithResult);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.putInt(this.onTransact.nextInt());
            byteBufferAllocate.put(byteBufferAllocate2.array());
            while (byteBufferIAuthTabCallback.hasRemaining()) {
                byteBufferAllocate.put((byte) (byteBufferIAuthTabCallback.get() ^ byteBufferAllocate2.get(i % 4)));
                i++;
            }
        } else {
            byteBufferAllocate.put(byteBufferIAuthTabCallback);
            byteBufferIAuthTabCallback.flip();
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public hz IAuthTabCallback(ByteBuffer byteBuffer) throws gjv, fo {
        boolean z;
        int iIntValue;
        int iRemaining = byteBuffer.remaining();
        int i = 2;
        if (iRemaining < 2) {
            throw new fo(2);
        }
        byte b = byteBuffer.get();
        boolean z2 = (b >> 8) != 0;
        boolean z3 = (b & 64) != 0;
        boolean z4 = (b & 32) != 0;
        boolean z5 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z6 = (b2 & ByteCompanionObject.MIN_VALUE) != 0;
        byte b3 = (byte) (b2 & ByteCompanionObject.MAX_VALUE);
        hz.onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback((byte) (b & 15));
        if (b3 >= 0 && b3 <= 125) {
            z = z3;
            iIntValue = b3;
        } else {
            if (onwarmupcompletedIAuthTabCallback == hz.onWarmupCompleted.PING || onwarmupcompletedIAuthTabCallback == hz.onWarmupCompleted.PONG || onwarmupcompletedIAuthTabCallback == hz.onWarmupCompleted.CLOSING) {
                throw new gmd("more than 125 octets");
            }
            if (b3 == 126) {
                if (iRemaining < 4) {
                    throw new fo(4);
                }
                z = z3;
                iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i = 4;
            } else {
                i = 10;
                if (iRemaining < 10) {
                    throw new fo(10);
                }
                byte[] bArr = new byte[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr[i2] = byteBuffer.get();
                }
                z = z3;
                long jLongValue = new BigInteger(bArr).longValue();
                if (jLongValue > 2147483647L) {
                    throw new gi("Payloadsize is to big...");
                }
                iIntValue = (int) jLongValue;
            }
        }
        int i3 = i + (z6 ? 4 : 0) + iIntValue;
        if (iRemaining < i3) {
            throw new fo(i3);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(IAuthTabCallback(iIntValue));
        if (z6) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i4 = 0; i4 < iIntValue; i4++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr2[i4 % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBuffer.position() + byteBufferAllocate.limit());
        }
        jxj jxjVarOnWarmupCompleted = jxj.onWarmupCompleted(onwarmupcompletedIAuthTabCallback);
        jxjVarOnWarmupCompleted.IAuthTabCallback(z2);
        jxjVarOnWarmupCompleted.onExtraCallback(z);
        jxjVarOnWarmupCompleted.onWarmupCompleted(z4);
        jxjVarOnWarmupCompleted.onNavigationEvent(z5);
        byteBufferAllocate.flip();
        jxjVarOnWarmupCompleted.onWarmupCompleted(byteBufferAllocate);
        onExtraCallback().onExtraCallbackWithResult(jxjVarOnWarmupCompleted);
        onExtraCallback();
        if (fh.onNavigationEvent) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("afterDecoding(");
            sb.append(jxjVarOnWarmupCompleted.IAuthTabCallback().remaining());
            sb.append("): {");
            sb.append(jxjVarOnWarmupCompleted.IAuthTabCallback().remaining() > 1000 ? "too big to display" : new String(jxjVarOnWarmupCompleted.IAuthTabCallback().array()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        jxjVarOnWarmupCompleted.onExtraCallback();
        return jxjVarOnWarmupCompleted;
    }

    @Override // o.fiz
    public List<hz> onWarmupCompleted(ByteBuffer byteBuffer) throws gjv {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.IAuthTabCallbackDefault == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.IAuthTabCallbackDefault.remaining();
                if (iRemaining2 > iRemaining) {
                    this.IAuthTabCallbackDefault.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                    byteBuffer.position(byteBuffer.position() + iRemaining);
                    return Collections.EMPTY_LIST;
                }
                this.IAuthTabCallbackDefault.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                byteBuffer.position(byteBuffer.position() + iRemaining2);
                linkedList.add(IAuthTabCallback((ByteBuffer) this.IAuthTabCallbackDefault.duplicate().position(0)));
                this.IAuthTabCallbackDefault = null;
            } catch (fo e) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(IAuthTabCallback(e.onExtraCallback()));
                this.IAuthTabCallbackDefault.rewind();
                byteBufferAllocate.put(this.IAuthTabCallbackDefault);
                this.IAuthTabCallbackDefault = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(IAuthTabCallback(byteBuffer));
            } catch (fo e2) {
                byteBuffer.reset();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(IAuthTabCallback(e2.onExtraCallback()));
                this.IAuthTabCallbackDefault = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    @Override // o.fiz
    public List<hz> onExtraCallback(ByteBuffer byteBuffer, boolean z) {
        hh hhVar = new hh();
        hhVar.onWarmupCompleted(byteBuffer);
        hhVar.onExtraCallbackWithResult(z);
        try {
            hhVar.onExtraCallback();
            return Collections.singletonList(hhVar);
        } catch (gjv e) {
            throw new gug(e);
        }
    }

    @Override // o.fiz
    public List<hz> IAuthTabCallback(String str, boolean z) {
        jl jlVar = new jl();
        jlVar.onWarmupCompleted(ByteBuffer.wrap(mtm.onWarmupCompleted(str)));
        jlVar.onExtraCallbackWithResult(z);
        try {
            jlVar.onExtraCallback();
            return Collections.singletonList(jlVar);
        } catch (gjv e) {
            throw new gug(e);
        }
    }

    @Override // o.fiz
    public void onWarmupCompleted() {
        this.IAuthTabCallbackDefault = null;
        this.onExtraCallbackWithResult = new hti();
    }

    private String IAuthTabCallbackDefault() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    private String onWarmupCompleted(String str) throws NoSuchAlgorithmException {
        try {
            return mm.onExtraCallback(MessageDigest.getInstance("SHA1").digest((str.trim() + WebSocketProtocol.ACCEPT_MAGIC).getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    private byte[] onExtraCallbackWithResult(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (j >>> (((i << 3) - 8) - (i2 << 3)));
        }
        return bArr;
    }

    private byte onNavigationEvent(hz.onWarmupCompleted onwarmupcompleted) {
        if (onwarmupcompleted == hz.onWarmupCompleted.CONTINUOUS) {
            return (byte) 0;
        }
        if (onwarmupcompleted == hz.onWarmupCompleted.TEXT) {
            return (byte) 1;
        }
        if (onwarmupcompleted == hz.onWarmupCompleted.BINARY) {
            return (byte) 2;
        }
        if (onwarmupcompleted == hz.onWarmupCompleted.CLOSING) {
            return (byte) 8;
        }
        if (onwarmupcompleted == hz.onWarmupCompleted.PING) {
            return (byte) 9;
        }
        if (onwarmupcompleted == hz.onWarmupCompleted.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + onwarmupcompleted.toString());
    }

    private hz.onWarmupCompleted IAuthTabCallback(byte b) throws gmd {
        if (b == 0) {
            return hz.onWarmupCompleted.CONTINUOUS;
        }
        if (b == 1) {
            return hz.onWarmupCompleted.TEXT;
        }
        if (b == 2) {
            return hz.onWarmupCompleted.BINARY;
        }
        switch (b) {
            case 8:
                return hz.onWarmupCompleted.CLOSING;
            case 9:
                return hz.onWarmupCompleted.PING;
            case 10:
                return hz.onWarmupCompleted.PONG;
            default:
                throw new gmd("Unknown opcode " + ((int) b));
        }
    }

    @Override // o.fiz
    public void onNavigationEvent(fh fhVar, hz hzVar) throws gjv {
        int iOnWarmupCompleted;
        String strOnExtraCallbackWithResult;
        hz.onWarmupCompleted onwarmupcompletedOnNavigationEvent = hzVar.onNavigationEvent();
        if (onwarmupcompletedOnNavigationEvent == hz.onWarmupCompleted.CLOSING) {
            if (!(hzVar instanceof ixr)) {
                iOnWarmupCompleted = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
                strOnExtraCallbackWithResult = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                ixr ixrVar = (ixr) hzVar;
                iOnWarmupCompleted = ixrVar.onWarmupCompleted();
                strOnExtraCallbackWithResult = ixrVar.onExtraCallbackWithResult();
            }
            if (fhVar.onExtraCallbackWithResult() == dw.onWarmupCompleted.CLOSING) {
                fhVar.onExtraCallbackWithResult(iOnWarmupCompleted, strOnExtraCallbackWithResult, true);
                return;
            } else if (onNavigationEvent() == fiz.onWarmupCompleted.TWOWAY) {
                fhVar.IAuthTabCallback(iOnWarmupCompleted, strOnExtraCallbackWithResult, true);
                return;
            } else {
                fhVar.onExtraCallback(iOnWarmupCompleted, strOnExtraCallbackWithResult, false);
                return;
            }
        }
        if (onwarmupcompletedOnNavigationEvent == hz.onWarmupCompleted.PING) {
            fhVar.asBinder().onWebsocketPing(fhVar, hzVar);
            return;
        }
        if (onwarmupcompletedOnNavigationEvent == hz.onWarmupCompleted.PONG) {
            fhVar.IAuthTabCallback_Parcel();
            fhVar.asBinder().onWebsocketPong(fhVar, hzVar);
            return;
        }
        if (!hzVar.IAuthTabCallbackStub() || onwarmupcompletedOnNavigationEvent == hz.onWarmupCompleted.CONTINUOUS) {
            if (onwarmupcompletedOnNavigationEvent != hz.onWarmupCompleted.CONTINUOUS) {
                if (this.onNavigationEvent != null) {
                    throw new gjv(1002, "Previous continuous frame sequence not completed.");
                }
                this.onNavigationEvent = hzVar;
                this.IAuthTabCallback.add(hzVar.IAuthTabCallback());
            } else if (hzVar.IAuthTabCallbackStub()) {
                if (this.onNavigationEvent == null) {
                    throw new gjv(1002, "Continuous frame sequence was not started.");
                }
                this.IAuthTabCallback.add(hzVar.IAuthTabCallback());
                if (this.onNavigationEvent.onNavigationEvent() == hz.onWarmupCompleted.TEXT) {
                    ((jxj) this.onNavigationEvent).onWarmupCompleted(IAuthTabCallbackStub());
                    ((jxj) this.onNavigationEvent).onExtraCallback();
                    try {
                        fhVar.asBinder().onWebsocketMessage(fhVar, mtm.IAuthTabCallback(this.onNavigationEvent.IAuthTabCallback()));
                    } catch (RuntimeException e) {
                        fhVar.asBinder().onWebsocketError(fhVar, e);
                    }
                } else if (this.onNavigationEvent.onNavigationEvent() == hz.onWarmupCompleted.BINARY) {
                    ((jxj) this.onNavigationEvent).onWarmupCompleted(IAuthTabCallbackStub());
                    ((jxj) this.onNavigationEvent).onExtraCallback();
                    try {
                        fhVar.asBinder().onWebsocketMessage(fhVar, this.onNavigationEvent.IAuthTabCallback());
                    } catch (RuntimeException e2) {
                        fhVar.asBinder().onWebsocketError(fhVar, e2);
                    }
                }
                this.onNavigationEvent = null;
                this.IAuthTabCallback.clear();
            } else if (this.onNavigationEvent == null) {
                throw new gjv(1002, "Continuous frame sequence was not started.");
            }
            if (onwarmupcompletedOnNavigationEvent == hz.onWarmupCompleted.TEXT && !mtm.onExtraCallbackWithResult(hzVar.IAuthTabCallback())) {
                throw new gjv(1007);
            }
            if (onwarmupcompletedOnNavigationEvent != hz.onWarmupCompleted.CONTINUOUS || this.onNavigationEvent == null) {
                return;
            }
            this.IAuthTabCallback.add(hzVar.IAuthTabCallback());
            return;
        }
        if (this.onNavigationEvent != null) {
            throw new gjv(1002, "Continuous frame sequence not completed.");
        }
        if (onwarmupcompletedOnNavigationEvent == hz.onWarmupCompleted.TEXT) {
            try {
                fhVar.asBinder().onWebsocketMessage(fhVar, mtm.IAuthTabCallback(hzVar.IAuthTabCallback()));
                return;
            } catch (RuntimeException e3) {
                fhVar.asBinder().onWebsocketError(fhVar, e3);
                return;
            }
        }
        if (onwarmupcompletedOnNavigationEvent == hz.onWarmupCompleted.BINARY) {
            try {
                fhVar.asBinder().onWebsocketMessage(fhVar, hzVar.IAuthTabCallback());
                return;
            } catch (RuntimeException e4) {
                fhVar.asBinder().onWebsocketError(fhVar, e4);
                return;
            }
        }
        throw new gjv(1002, "non control or continious frame expected");
    }

    @Override // o.fiz
    public fiz.onWarmupCompleted onNavigationEvent() {
        return fiz.onWarmupCompleted.TWOWAY;
    }

    @Override // o.fiz
    public String toString() {
        String string = super.toString();
        if (onExtraCallback() == null) {
            return string;
        }
        return string + " extension: " + onExtraCallback().toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        goq goqVar = this.onExtraCallbackWithResult;
        goq goqVar2 = ((fdq) obj).onExtraCallbackWithResult;
        return goqVar != null ? goqVar.equals(goqVar2) : goqVar2 == null;
    }

    public int hashCode() {
        goq goqVar = this.onExtraCallbackWithResult;
        if (goqVar != null) {
            return goqVar.hashCode();
        }
        return 0;
    }

    private ByteBuffer IAuthTabCallbackStub() throws gi {
        long jLimit = 0;
        while (this.IAuthTabCallback.iterator().hasNext()) {
            jLimit += r0.next().limit();
        }
        if (jLimit > 2147483647L) {
            throw new gi("Payloadsize is to big...");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
        Iterator<ByteBuffer> it = this.IAuthTabCallback.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(it.next());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}
