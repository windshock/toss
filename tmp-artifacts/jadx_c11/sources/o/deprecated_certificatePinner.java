package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_certificatePinner {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    public static final deprecated_certificatePinner onExtraCallbackWithResult = new deprecated_certificatePinner();
    private static final deprecated_dns onWarmupCompleted = new deprecated_dns(200.0d, 30.0d);
    private static final deprecated_dns onExtraCallback = new deprecated_dns(100.0d, 15.0d);
    private static final deprecated_dns IAuthTabCallback = new deprecated_dns(270.0d, 25.0d);
    private static final deprecated_dns asBinder = new deprecated_dns(480.0d, 50.0d);
    private static final deprecated_dns asInterface = new deprecated_dns(70.0d, 20.0d);
    private static final deprecated_dns IAuthTabCallbackStub = new deprecated_dns(800.0d, 55.0d);
    private static final deprecated_dns onTransact = new deprecated_dns(1000.0d, 55.0d);
    private static final deprecated_dns onNavigationEvent = new deprecated_dns(300.0d, 15.0d);

    private deprecated_certificatePinner() {
    }

    static {
        int i = IAuthTabCallbackDefault + 115;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public final deprecated_dns onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVar = onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return deprecated_dnsVar;
    }

    public final deprecated_dns onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 19;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        deprecated_dns deprecated_dnsVar = onExtraCallback;
        int i5 = i2 + 107;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_dnsVar;
    }

    public final deprecated_dns IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        deprecated_dns deprecated_dnsVar = IAuthTabCallback;
        int i5 = i2 + 117;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_dnsVar;
    }

    public final deprecated_dns asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 25;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        deprecated_dns deprecated_dnsVar = asBinder;
        int i4 = i3 + 33;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVar;
    }

    public final deprecated_dns IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 113;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        deprecated_dns deprecated_dnsVar = asInterface;
        int i4 = i2 + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVar;
    }

    public final deprecated_dns onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        deprecated_dns deprecated_dnsVar = IAuthTabCallbackStub;
        int i5 = i3 + 41;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return deprecated_dnsVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final deprecated_dns asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        deprecated_dns deprecated_dnsVar = onTransact;
        int i5 = i3 + 3;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return deprecated_dnsVar;
    }

    public final deprecated_dns onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 91;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        deprecated_dns deprecated_dnsVar = onNavigationEvent;
        int i5 = i2 + 19;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return deprecated_dnsVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
