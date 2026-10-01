package o;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.function.Consumer;
import o.fby71;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class fby71 {
    private static volatile Selector IAuthTabCallbackDefault;
    private static Thread IAuthTabCallbackStub;
    private static Consumer<Selector> IAuthTabCallbackStubProxy;
    private static Consumer<Selector> access000;
    private static volatile boolean asBinder;
    private static volatile boolean onExtraCallback;
    private static Thread onNavigationEvent;
    private static final AppSetIdAndScope1 asInterface = ea10.onWarmupCompleted((Class<?>) fby71.class);
    private static final Object onWarmupCompleted = new Object();
    private static lt16 onTransact = null;
    private static final Runnable[] IAuthTabCallback = new Runnable[2];
    private static final Runnable[] onExtraCallbackWithResult = new Runnable[2];

    interface onNavigationEvent {
        void onExtraCallback(SelectionKey selectionKey);
    }

    static Selector IAuthTabCallback() throws IOException {
        if (IAuthTabCallbackDefault == null) {
            synchronized (onWarmupCompleted) {
                if (IAuthTabCallbackDefault == null) {
                    IAuthTabCallbackDefault = Selector.open();
                    asBinder = true;
                    Thread thread = new Thread(new Runnable() { // from class: org.xbill.DNS.NioClient$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() throws InterruptedException, IOException {
                            fby71.onNavigationEvent();
                        }
                    });
                    IAuthTabCallbackStub = thread;
                    thread.setDaemon(true);
                    IAuthTabCallbackStub.setName("dnsjava NIO selector");
                    IAuthTabCallbackStub.start();
                    Thread thread2 = new Thread(new Runnable() { // from class: org.xbill.DNS.NioClient$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            fby71.onWarmupCompleted(true);
                        }
                    });
                    onNavigationEvent = thread2;
                    thread2.setName("dnsjava NIO shutdown hook");
                    if (Boolean.parseBoolean(System.getProperty("dnsjava.nio.register_shutdown_hook", "true"))) {
                        Runtime.getRuntime().addShutdownHook(onNavigationEvent);
                    }
                }
            }
        }
        return IAuthTabCallbackDefault;
    }

    public static void onExtraCallbackWithResult() {
        onWarmupCompleted(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onWarmupCompleted(boolean z) {
        asBinder = false;
        Selector selector = IAuthTabCallbackDefault;
        if (selector != null) {
            IAuthTabCallbackDefault.wakeup();
        }
        if (!z) {
            synchronized (onWarmupCompleted) {
                if (onNavigationEvent != null) {
                    try {
                        Runtime.getRuntime().removeShutdownHook(onNavigationEvent);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (selector != null) {
            synchronized (onWarmupCompleted) {
                while (!onExtraCallback) {
                    try {
                        try {
                            onWarmupCompleted.wait();
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                        }
                    } finally {
                        onExtraCallback = false;
                    }
                }
            }
        }
    }

    public static void onNavigationEvent() throws InterruptedException, IOException {
        int iSelect;
        int iIntValue = Integer.getInteger("dnsjava.nio.selector_timeout", 1000).intValue();
        if (iIntValue <= 0 || iIntValue > 1000) {
            throw new IllegalArgumentException("Invalid selector_timeout, must be between 1 and 1000");
        }
        while (asBinder) {
            try {
                iSelect = IAuthTabCallbackDefault.select(iIntValue);
            } catch (IOException | ClosedSelectorException unused) {
            }
            if (Thread.currentThread().isInterrupted()) {
                onExtraCallbackWithResult();
                break;
            }
            if (iSelect == 0) {
                onNavigationEvent(IAuthTabCallback);
            }
            if (asBinder) {
                asInterface();
                onWarmupCompleted();
            }
        }
        IAuthTabCallbackStub();
    }

    private static void IAuthTabCallbackStub() throws InterruptedException, IOException {
        try {
            onNavigationEvent(onExtraCallbackWithResult);
        } catch (Exception unused) {
        }
        Selector selector = IAuthTabCallbackDefault;
        Thread thread = IAuthTabCallbackStub;
        Object obj = onWarmupCompleted;
        synchronized (obj) {
            IAuthTabCallbackDefault = null;
            IAuthTabCallbackStub = null;
            onNavigationEvent = null;
            onExtraCallback = true;
            obj.notifyAll();
        }
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException unused2) {
            }
        }
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException unused3) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static void IAuthTabCallback(Runnable runnable, boolean z) {
        onExtraCallback(IAuthTabCallback, runnable, z);
    }

    static void onNavigationEvent(Consumer<Selector> consumer, boolean z) {
        if (z) {
            access000 = consumer;
        } else {
            IAuthTabCallbackStubProxy = consumer;
        }
    }

    static void onNavigationEvent(Runnable runnable, boolean z) {
        onExtraCallback(onExtraCallbackWithResult, runnable, z);
    }

    private static void onExtraCallback(Runnable[] runnableArr, Runnable runnable, boolean z) {
        if (z) {
            runnableArr[0] = runnable;
        } else {
            runnableArr[1] = runnable;
        }
    }

    private static void onNavigationEvent(Runnable[] runnableArr) {
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = runnableArr[1];
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    private static void asInterface() {
        Consumer<Selector> consumer = access000;
        if (consumer != null) {
            consumer.accept(IAuthTabCallbackDefault);
        }
        Consumer<Selector> consumer2 = IAuthTabCallbackStubProxy;
        if (consumer2 != null) {
            consumer2.accept(IAuthTabCallbackDefault);
        }
    }

    private static void onWarmupCompleted() {
        Iterator<SelectionKey> it = IAuthTabCallbackDefault.selectedKeys().iterator();
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            ((onNavigationEvent) next.attachment()).onExtraCallback(next);
        }
    }

    static void onNavigationEvent(String str, SocketAddress socketAddress, SocketAddress socketAddress2, ByteBuffer byteBuffer) {
        if (asInterface.onNavigationEvent() || onTransact != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            int iPosition = byteBuffer.position();
            byteBuffer.get(bArr, 0, byteBuffer.remaining());
            byteBuffer.position(iPosition);
            onExtraCallback(str, socketAddress, socketAddress2, bArr);
        }
    }

    static void onExtraCallback(String str, SocketAddress socketAddress, SocketAddress socketAddress2, byte[] bArr) {
        if (asInterface.onNavigationEvent()) {
            UST_TRANS_GenerateCertNum.onNavigationEvent(str, bArr);
        }
    }
}
