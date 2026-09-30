package o;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import o.dw;
import o.fiz;
import o.hz;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class fh implements dw {
    private static final Object IAuthTabCallbackStub = new Object();
    public static int onExtraCallback = 16384;
    public static boolean onNavigationEvent = false;
    public final BlockingQueue<ByteBuffer> IAuthTabCallback;
    public final BlockingQueue<ByteBuffer> IAuthTabCallbackDefault;
    private fiz access000;
    private List<fiz> access100;
    private jvd extraCallbackWithResult;
    private final eu onActivityResized;
    public SelectionKey onExtraCallbackWithResult;
    public ByteChannel onWarmupCompleted;
    private dw.onExtraCallback writeTypedObject;
    private volatile boolean getInterfaceDescriptor = false;
    private dw.onWarmupCompleted readTypedObject = dw.onWarmupCompleted.NOT_YET_CONNECTED;
    private ByteBuffer ICustomTabsCallback = ByteBuffer.allocate(0);
    private kdr IAuthTabCallbackStubProxy = null;
    private String onTransact = null;
    private Integer asInterface = null;
    private Boolean asBinder = null;
    private String extraCallback = null;
    private long IAuthTabCallback_Parcel = System.currentTimeMillis();

    public fh(eu euVar, fiz fizVar) {
        this.access000 = null;
        if (euVar == null || (fizVar == null && this.writeTypedObject == dw.onExtraCallback.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.IAuthTabCallbackDefault = new LinkedBlockingQueue();
        this.IAuthTabCallback = new LinkedBlockingQueue();
        this.onActivityResized = euVar;
        this.writeTypedObject = dw.onExtraCallback.CLIENT;
        if (fizVar != null) {
            this.access000 = fizVar.onExtraCallbackWithResult();
        }
    }

    public void onNavigationEvent(ByteBuffer byteBuffer) {
        if (onNavigationEvent) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("process(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        if (onExtraCallbackWithResult() != dw.onWarmupCompleted.NOT_YET_CONNECTED) {
            if (onExtraCallbackWithResult() == dw.onWarmupCompleted.OPEN) {
                onExtraCallback(byteBuffer);
            }
        } else if (onWarmupCompleted(byteBuffer)) {
            if (byteBuffer.hasRemaining()) {
                onExtraCallback(byteBuffer);
            } else if (this.ICustomTabsCallback.hasRemaining()) {
                onExtraCallback(this.ICustomTabsCallback);
            }
        }
    }

    private boolean onWarmupCompleted(ByteBuffer byteBuffer) throws Throwable {
        ByteBuffer byteBuffer2;
        dw.onExtraCallback onextracallback;
        kfb kfbVarOnNavigationEvent;
        if (this.ICustomTabsCallback.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.ICustomTabsCallback.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.ICustomTabsCallback.capacity() + byteBuffer.remaining());
                this.ICustomTabsCallback.flip();
                byteBufferAllocate.put(this.ICustomTabsCallback);
                this.ICustomTabsCallback = byteBufferAllocate;
            }
            this.ICustomTabsCallback.put(byteBuffer);
            this.ICustomTabsCallback.flip();
            byteBuffer2 = this.ICustomTabsCallback;
        }
        byteBuffer2.mark();
        try {
            try {
                onextracallback = this.writeTypedObject;
            } catch (ghr e) {
                onWarmupCompleted(e);
            }
        } catch (gjd e2) {
            if (this.ICustomTabsCallback.capacity() == 0) {
                byteBuffer2.reset();
                int iOnExtraCallback = e2.onExtraCallback();
                if (iOnExtraCallback == 0) {
                    iOnExtraCallback = byteBuffer2.capacity() + 16;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iOnExtraCallback);
                this.ICustomTabsCallback = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.ICustomTabsCallback;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.ICustomTabsCallback;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
        if (onextracallback == dw.onExtraCallback.SERVER) {
            fiz fizVar = this.access000;
            if (fizVar == null) {
                Iterator<fiz> it = this.access100.iterator();
                while (it.hasNext()) {
                    fiz fizVarOnExtraCallbackWithResult = it.next().onExtraCallbackWithResult();
                    try {
                        fizVarOnExtraCallbackWithResult.onWarmupCompleted(this.writeTypedObject);
                        byteBuffer2.reset();
                        kfbVarOnNavigationEvent = fizVarOnExtraCallbackWithResult.onNavigationEvent(byteBuffer2);
                    } catch (ghr unused) {
                    }
                    if (!(kfbVarOnNavigationEvent instanceof kdr)) {
                        IAuthTabCallback(new gjv(1002, "wrong http function"));
                        return false;
                    }
                    kdr kdrVar = (kdr) kfbVarOnNavigationEvent;
                    if (fizVarOnExtraCallbackWithResult.onExtraCallbackWithResult(kdrVar) == fiz.onExtraCallbackWithResult.MATCHED) {
                        this.extraCallback = kdrVar.onNavigationEvent();
                        try {
                            IAuthTabCallback(fizVarOnExtraCallbackWithResult.onWarmupCompleted(fizVarOnExtraCallbackWithResult.onNavigationEvent(kdrVar, this.onActivityResized.onWebsocketHandshakeReceivedAsServer(this, fizVarOnExtraCallbackWithResult, kdrVar)), this.writeTypedObject));
                            this.access000 = fizVarOnExtraCallbackWithResult;
                            onNavigationEvent(kdrVar);
                            return true;
                        } catch (RuntimeException e3) {
                            this.onActivityResized.onWebsocketError(this, e3);
                            onExtraCallbackWithResult(e3);
                            return false;
                        } catch (gjv e4) {
                            IAuthTabCallback(e4);
                            return false;
                        }
                    }
                }
                if (this.access000 == null) {
                    IAuthTabCallback(new gjv(1002, "no draft matches"));
                }
                return false;
            }
            kfb kfbVarOnNavigationEvent2 = fizVar.onNavigationEvent(byteBuffer2);
            if (!(kfbVarOnNavigationEvent2 instanceof kdr)) {
                onExtraCallback(1002, "wrong http function", false);
                return false;
            }
            kdr kdrVar2 = (kdr) kfbVarOnNavigationEvent2;
            if (this.access000.onExtraCallbackWithResult(kdrVar2) == fiz.onExtraCallbackWithResult.MATCHED) {
                onNavigationEvent(kdrVar2);
                return true;
            }
            onWarmupCompleted(1002, "the handshake did finaly not match");
            return false;
        }
        if (onextracallback == dw.onExtraCallback.CLIENT) {
            this.access000.onWarmupCompleted(onextracallback);
            kfb kfbVarOnNavigationEvent3 = this.access000.onNavigationEvent(byteBuffer2);
            if (!(kfbVarOnNavigationEvent3 instanceof ln)) {
                onExtraCallback(1002, "wrong http function", false);
                return false;
            }
            ln lnVar = (ln) kfbVarOnNavigationEvent3;
            if (this.access000.onWarmupCompleted(this.IAuthTabCallbackStubProxy, lnVar) == fiz.onExtraCallbackWithResult.MATCHED) {
                try {
                    this.onActivityResized.onWebsocketHandshakeReceivedAsClient(this, this.IAuthTabCallbackStubProxy, lnVar);
                    onNavigationEvent(lnVar);
                    return true;
                } catch (RuntimeException e5) {
                    this.onActivityResized.onWebsocketError(this, e5);
                    onExtraCallback(-1, e5.getMessage(), false);
                    return false;
                } catch (gjv e6) {
                    onExtraCallback(e6.onExtraCallback(), e6.getMessage(), false);
                    return false;
                }
            }
            onWarmupCompleted(1002, "draft " + this.access000 + " refuses handshake");
        }
        return false;
    }

    private void onExtraCallback(ByteBuffer byteBuffer) {
        try {
            for (hz hzVar : this.access000.onWarmupCompleted(byteBuffer)) {
                if (onNavigationEvent) {
                    System.out.println("matched frame: " + hzVar);
                }
                this.access000.onNavigationEvent(this, hzVar);
            }
        } catch (gjv e) {
            this.onActivityResized.onWebsocketError(this, e);
            onWarmupCompleted(e);
        }
    }

    private void IAuthTabCallback(gjv gjvVar) {
        IAuthTabCallback(onExtraCallbackWithResult(404));
        onExtraCallback(gjvVar.onExtraCallback(), gjvVar.getMessage(), false);
    }

    private void onExtraCallbackWithResult(RuntimeException runtimeException) {
        IAuthTabCallback(onExtraCallbackWithResult(500));
        onExtraCallback(-1, runtimeException.getMessage(), false);
    }

    private ByteBuffer onExtraCallbackWithResult(int i) {
        String str;
        if (i == 404) {
            str = "404 WebSocket Upgrade Failure";
        } else {
            str = "500 Internal Server Error";
        }
        return ByteBuffer.wrap(mtm.onExtraCallback("HTTP/1.1 " + str + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    public void IAuthTabCallback(int i, String str, boolean z) {
        dw.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
        dw.onWarmupCompleted onwarmupcompleted = dw.onWarmupCompleted.CLOSING;
        if (onwarmupcompletedOnExtraCallbackWithResult == onwarmupcompleted || this.readTypedObject == dw.onWarmupCompleted.CLOSED) {
            return;
        }
        if (onExtraCallbackWithResult() == dw.onWarmupCompleted.OPEN) {
            if (i == 1006) {
                IAuthTabCallback(onwarmupcompleted);
                onExtraCallback(i, str, false);
                return;
            }
            if (this.access000.onNavigationEvent() != fiz.onWarmupCompleted.NONE) {
                try {
                    if (!z) {
                        try {
                            this.onActivityResized.onWebsocketCloseInitiated(this, i, str);
                        } catch (RuntimeException e) {
                            this.onActivityResized.onWebsocketError(this, e);
                        }
                    }
                    if (getInterfaceDescriptor()) {
                        ixr ixrVar = new ixr();
                        ixrVar.onExtraCallback(str);
                        ixrVar.onExtraCallbackWithResult(i);
                        ixrVar.onExtraCallback();
                        sendFrame(ixrVar);
                    }
                } catch (gjv e2) {
                    this.onActivityResized.onWebsocketError(this, e2);
                    onExtraCallback(1006, "generated frame is invalid", false);
                }
            }
            onExtraCallback(i, str, z);
        } else if (i == -3) {
            onExtraCallback(-3, str, true);
        } else if (i == 1002) {
            onExtraCallback(i, str, z);
        } else {
            onExtraCallback(-1, str, false);
        }
        IAuthTabCallback(dw.onWarmupCompleted.CLOSING);
        this.ICustomTabsCallback = null;
    }

    public void onWarmupCompleted(int i, String str) {
        IAuthTabCallback(i, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[Catch: all -> 0x0055, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x000b, B:9:0x000f, B:10:0x0012, B:12:0x0016, B:21:0x0038, B:25:0x0044, B:27:0x0048, B:28:0x004b, B:24:0x003f, B:15:0x001b, B:17:0x0027, B:19:0x002b, B:20:0x0033), top: B:36:0x0001, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(int i, String str, boolean z) {
        fiz fizVar;
        synchronized (this) {
            if (onExtraCallbackWithResult() == dw.onWarmupCompleted.CLOSED) {
                return;
            }
            SelectionKey selectionKey = this.onExtraCallbackWithResult;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.onWarmupCompleted;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e) {
                    if (e.getMessage().equals("Broken pipe")) {
                        if (onNavigationEvent) {
                            System.out.println("Caught IOException: Broken pipe during closeConnection()");
                        }
                    } else {
                        this.onActivityResized.onWebsocketError(this, e);
                    }
                }
                try {
                    this.onActivityResized.onWebsocketClose(this, i, str, z);
                } catch (RuntimeException e2) {
                    this.onActivityResized.onWebsocketError(this, e2);
                }
                fizVar = this.access000;
                if (fizVar != null) {
                    fizVar.onWarmupCompleted();
                }
                this.IAuthTabCallbackStubProxy = null;
                IAuthTabCallback(dw.onWarmupCompleted.CLOSED);
                return;
            }
            this.onActivityResized.onWebsocketClose(this, i, str, z);
            fizVar = this.access000;
            if (fizVar != null) {
            }
            this.IAuthTabCallbackStubProxy = null;
            IAuthTabCallback(dw.onWarmupCompleted.CLOSED);
            return;
        }
    }

    public void onExtraCallbackWithResult(int i, boolean z) {
        onExtraCallbackWithResult(i, _UrlKt.FRAGMENT_ENCODE_SET, z);
    }

    public void onExtraCallbackWithResult(int i, String str) {
        onExtraCallbackWithResult(i, str, false);
    }

    public void onExtraCallback(int i, String str, boolean z) {
        synchronized (this) {
            if (this.getInterfaceDescriptor) {
                return;
            }
            this.asInterface = Integer.valueOf(i);
            this.onTransact = str;
            this.asBinder = Boolean.valueOf(z);
            this.getInterfaceDescriptor = true;
            this.onActivityResized.onWriteDemand(this);
            try {
                this.onActivityResized.onWebsocketClosing(this, i, str, z);
            } catch (RuntimeException e) {
                this.onActivityResized.onWebsocketError(this, e);
            }
            fiz fizVar = this.access000;
            if (fizVar != null) {
                fizVar.onWarmupCompleted();
            }
            this.IAuthTabCallbackStubProxy = null;
        }
    }

    public void onExtraCallback() {
        if (onExtraCallbackWithResult() == dw.onWarmupCompleted.NOT_YET_CONNECTED) {
            onExtraCallbackWithResult(-1, true);
            return;
        }
        if (this.getInterfaceDescriptor) {
            onExtraCallbackWithResult(this.asInterface.intValue(), this.onTransact, this.asBinder.booleanValue());
            return;
        }
        if (this.access000.onNavigationEvent() == fiz.onWarmupCompleted.NONE) {
            onExtraCallbackWithResult(1000, true);
            return;
        }
        if (this.access000.onNavigationEvent() == fiz.onWarmupCompleted.ONEWAY) {
            if (this.writeTypedObject == dw.onExtraCallback.SERVER) {
                onExtraCallbackWithResult(1006, true);
                return;
            } else {
                onExtraCallbackWithResult(1000, true);
                return;
            }
        }
        onExtraCallbackWithResult(1006, true);
    }

    public void onNavigationEvent(int i) {
        IAuthTabCallback(i, _UrlKt.FRAGMENT_ENCODE_SET, false);
    }

    public void onWarmupCompleted(gjv gjvVar) {
        IAuthTabCallback(gjvVar.onExtraCallback(), gjvVar.getMessage(), false);
    }

    public void IAuthTabCallback(String str) throws gxx {
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        onExtraCallback(this.access000.IAuthTabCallback(str, this.writeTypedObject == dw.onExtraCallback.CLIENT));
    }

    public void onExtraCallbackWithResult(ByteBuffer byteBuffer) throws gxx, IllegalArgumentException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        onExtraCallback(this.access000.onExtraCallback(byteBuffer, this.writeTypedObject == dw.onExtraCallback.CLIENT));
    }

    public void IAuthTabCallback(byte[] bArr) throws gxx, IllegalArgumentException {
        onExtraCallbackWithResult(ByteBuffer.wrap(bArr));
    }

    private void onExtraCallback(Collection<hz> collection) {
        if (!getInterfaceDescriptor()) {
            throw new gxx();
        }
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (hz hzVar : collection) {
            if (onNavigationEvent) {
                System.out.println("send frame: " + hzVar);
            }
            arrayList.add(this.access000.onWarmupCompleted(hzVar));
        }
        IAuthTabCallback(arrayList);
    }

    public void onWarmupCompleted(hz.onWarmupCompleted onwarmupcompleted, ByteBuffer byteBuffer, boolean z) {
        onExtraCallback(this.access000.onExtraCallbackWithResult(onwarmupcompleted, byteBuffer, z));
    }

    public void onNavigationEvent(Collection<hz> collection) {
        onExtraCallback(collection);
    }

    @Override // o.dw
    public void sendFrame(hz hzVar) {
        onExtraCallback(Collections.singletonList(hzVar));
    }

    public void IAuthTabCallbackStubProxy() throws NotYetConnectedException {
        if (this.extraCallbackWithResult == null) {
            this.extraCallbackWithResult = new jvd();
        }
        sendFrame(this.extraCallbackWithResult);
    }

    public boolean onTransact() {
        return !this.IAuthTabCallbackDefault.isEmpty();
    }

    public void onExtraCallback(ksy ksyVar) throws ghr {
        this.IAuthTabCallbackStubProxy = this.access000.onNavigationEvent(ksyVar);
        this.extraCallback = ksyVar.onNavigationEvent();
        try {
            this.onActivityResized.onWebsocketHandshakeSentAsClient(this, this.IAuthTabCallbackStubProxy);
            IAuthTabCallback(this.access000.onWarmupCompleted(this.IAuthTabCallbackStubProxy, this.writeTypedObject));
        } catch (RuntimeException e) {
            this.onActivityResized.onWebsocketError(this, e);
            throw new ghr("rejected because of" + e);
        } catch (gjv unused) {
            throw new ghr("Handshake data rejected by client.");
        }
    }

    private void IAuthTabCallback(ByteBuffer byteBuffer) {
        if (onNavigationEvent) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        this.IAuthTabCallbackDefault.add(byteBuffer);
        this.onActivityResized.onWriteDemand(this);
    }

    private void IAuthTabCallback(List<ByteBuffer> list) {
        synchronized (IAuthTabCallbackStub) {
            Iterator<ByteBuffer> it = list.iterator();
            while (it.hasNext()) {
                IAuthTabCallback(it.next());
            }
        }
    }

    private void onNavigationEvent(kfb kfbVar) {
        if (onNavigationEvent) {
            System.out.println("open using draft: " + this.access000);
        }
        IAuthTabCallback(dw.onWarmupCompleted.OPEN);
        try {
            this.onActivityResized.onWebsocketOpen(this, kfbVar);
        } catch (RuntimeException e) {
            this.onActivityResized.onWebsocketError(this, e);
        }
    }

    public boolean access100() {
        return onExtraCallbackWithResult() == dw.onWarmupCompleted.CONNECTING;
    }

    public boolean getInterfaceDescriptor() {
        return onExtraCallbackWithResult() == dw.onWarmupCompleted.OPEN;
    }

    public boolean asInterface() {
        return onExtraCallbackWithResult() == dw.onWarmupCompleted.CLOSING;
    }

    public boolean access000() {
        return this.getInterfaceDescriptor;
    }

    public boolean IAuthTabCallbackDefault() {
        return onExtraCallbackWithResult() == dw.onWarmupCompleted.CLOSED;
    }

    public dw.onWarmupCompleted onExtraCallbackWithResult() {
        return this.readTypedObject;
    }

    private void IAuthTabCallback(dw.onWarmupCompleted onwarmupcompleted) {
        this.readTypedObject = onwarmupcompleted;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public InetSocketAddress IAuthTabCallbackStub() {
        return this.onActivityResized.getRemoteSocketAddress(this);
    }

    public InetSocketAddress IAuthTabCallback() {
        return this.onActivityResized.getLocalSocketAddress(this);
    }

    public void onNavigationEvent() {
        onNavigationEvent(1000);
    }

    public long onWarmupCompleted() {
        return this.IAuthTabCallback_Parcel;
    }

    public void IAuthTabCallback_Parcel() {
        this.IAuthTabCallback_Parcel = System.currentTimeMillis();
    }

    public eu asBinder() {
        return this.onActivityResized;
    }
}
