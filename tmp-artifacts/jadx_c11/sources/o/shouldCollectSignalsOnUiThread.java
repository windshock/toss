package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shouldCollectSignalsOnUiThread {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static final long asBinder;
    private static int asInterface = 0;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    public static final shouldCollectSignalsOnUiThread onNavigationEvent = new shouldCollectSignalsOnUiThread();
    private static int onTransact = 1;
    private static final long onWarmupCompleted;

    private shouldCollectSignalsOnUiThread() {
    }

    static {
        r8lambdajNwSUbAXfl7nto43yguQF2BZr0 r8lambdajnwsubaxfl7nto43yguqf2bzr0 = r8lambdajNwSUbAXfl7nto43yguQF2BZr0.onExtraCallback;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdajnwsubaxfl7nto43yguqf2bzr0.IAuthTabCallback());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdajnwsubaxfl7nto43yguqf2bzr0.onWarmupCompleted());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(r8lambdajnwsubaxfl7nto43yguqf2bzr0.onExtraCallbackWithResult());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(r8lambdajnwsubaxfl7nto43yguqf2bzr0.onExtraCallback());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(r8lambdajnwsubaxfl7nto43yguqf2bzr0.onNavigationEvent());
        int i = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 101;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = IAuthTabCallback;
        int i4 = i2 + 65;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 31;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = onExtraCallback;
        int i4 = i2 + 117;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        int i3 = 33 / 0;
        return onWarmupCompleted;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 77;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = asBinder;
        int i5 = i3 + 5;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return j;
    }
}
