package o;

import o.InterfaceC0083handshake;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ConnectionPool {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback;
    public static final ConnectionPool onWarmupCompleted = new ConnectionPool();
    private static final InterfaceC0083handshake.onNavigationEvent onNavigationEvent = new InterfaceC0083handshake.onNavigationEvent(1.252f);
    private static final InterfaceC0083handshake.onNavigationEvent IAuthTabCallback = new InterfaceC0083handshake.onNavigationEvent(1.35f);
    private static final InterfaceC0083handshake.onNavigationEvent onExtraCallbackWithResult = new InterfaceC0083handshake.onNavigationEvent(1.5f);

    private ConnectionPool() {
    }

    static {
        int i = onExtraCallback + 81;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final InterfaceC0083handshake.onNavigationEvent onWarmupCompleted() {
        InterfaceC0083handshake.onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = asInterface + 41;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            onnavigationevent = onNavigationEvent;
            int i4 = 52 / 0;
        } else {
            onnavigationevent = onNavigationEvent;
        }
        int i5 = i3 + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    public final InterfaceC0083handshake.onNavigationEvent onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC0083handshake.onNavigationEvent onnavigationevent = IAuthTabCallback;
        int i5 = i2 + 101;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final InterfaceC0083handshake.onNavigationEvent IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC0083handshake.onNavigationEvent onnavigationevent = onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return onnavigationevent;
    }
}
