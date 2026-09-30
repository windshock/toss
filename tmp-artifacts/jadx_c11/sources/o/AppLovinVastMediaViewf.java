package o;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinVastMediaViewf {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface;
    private final int onTransact;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final int onExtraCallbackWithResult = onNavigationEvent(-1);
    private static final int onWarmupCompleted = onNavigationEvent(1);
    private static final int onExtraCallback = onNavigationEvent(2);
    private static final int IAuthTabCallback = onNavigationEvent(3);
    private static final int onNavigationEvent = onNavigationEvent(4);

    public static final /* synthetic */ AppLovinVastMediaViewf IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        AppLovinVastMediaViewf appLovinVastMediaViewf = new AppLovinVastMediaViewf(i);
        int i3 = asBinder + 79;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return appLovinVastMediaViewf;
        }
        throw null;
    }

    public static int onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 97;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Integer.hashCode(i);
        int i5 = asBinder + 69;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public static final boolean onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 59;
        int i5 = i4 % 128;
        asBinder = i5;
        int i6 = i4 % 2;
        if (i != i2) {
            return false;
        }
        int i7 = i5 + 7;
        IAuthTabCallbackStub = i7 % 128;
        return i7 % 2 == 0;
    }

    public static boolean onExtraCallbackWithResult(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof AppLovinVastMediaViewf)) {
            return false;
        }
        if (i == ((AppLovinVastMediaViewf) obj).asBinder()) {
            return true;
        }
        int i5 = IAuthTabCallbackStub + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static int onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 113;
        int i4 = i3 % 128;
        asBinder = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = i4 + 79;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return i;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = (~(i7 | i8 | i9)) | (~(i3 | i6));
        int i11 = ~(i5 | i6);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i6);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i3 + i6 + i4 + (1349231875 * i) + (1735201104 * i2);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i3) + 1558183936 + (237349861 * i6) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i4) + ((-1337982976) * i) + (469762048 * i2) + (1272971264 * i16);
        int i18 = ((i3 * 236314795) - 374860141) + (i6 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i4 * 236313959) + (i * (-66979019)) + (i2 * (-1872492752)) + (i16 * (-417333248));
        return i17 + ((i18 * i18) * 639631360) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public final /* synthetic */ int asBinder() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onTransact;
        int i6 = i2 + 111;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onTransact, obj);
        int i4 = IAuthTabCallbackStub + 95;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onTransact;
        if (i3 != 0) {
            return onExtraCallback(i4);
        }
        onExtraCallback(i4);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent;
        int i5 = i3 + 95;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(i4);
    }

    public static final /* synthetic */ int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted;
        int i5 = i3 + 25;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = onExtraCallbackWithResult;
        int i6 = i3 + 93;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    public static final /* synthetic */ int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 89;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback;
        int i5 = i2 + 93;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return i4;
    }

    public static final /* synthetic */ int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = onExtraCallback;
        int i6 = i3 + 97;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 79 / 0;
        }
        return i5;
    }

    private /* synthetic */ AppLovinVastMediaViewf(int i) {
        this.onTransact = i;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(this.onTransact);
            throw null;
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onTransact);
        int i3 = IAuthTabCallbackStub + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallbackWithResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return "Unspecified";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (onExtraCallbackWithResult(r4, o.AppLovinVastMediaViewf.onWarmupCompleted) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return "Clip";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (onExtraCallbackWithResult(r4, o.AppLovinVastMediaViewf.onExtraCallback) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        return "Ellipsis";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (onExtraCallbackWithResult(r4, o.AppLovinVastMediaViewf.IAuthTabCallback) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r4 = o.AppLovinVastMediaViewf.asBinder + 105;
        o.AppLovinVastMediaViewf.IAuthTabCallbackStub = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if ((r4 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        return "Visible";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (onExtraCallbackWithResult(r4, o.AppLovinVastMediaViewf.onNavigationEvent) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r4 = o.AppLovinVastMediaViewf.asBinder + 57;
        o.AppLovinVastMediaViewf.IAuthTabCallbackStub = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if ((r4 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        return "FadingEdge";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        return "Invalid";
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if ((!onExtraCallbackWithResult(r4, o.AppLovinVastMediaViewf.onExtraCallbackWithResult)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (onExtraCallbackWithResult(r4, o.AppLovinVastMediaViewf.onExtraCallbackWithResult) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r4 = o.AppLovinVastMediaViewf.IAuthTabCallbackStub + 33;
        o.AppLovinVastMediaViewf.asBinder = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 79;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final int onWarmupCompleted() {
            int iIntValue;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnExtraCallback = getKekid.onExtraCallback();
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                iIntValue = ((Integer) AppLovinVastMediaViewf.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), -1724942966, iOnExtraCallback2, iOnExtraCallback, new Object[0], 1724942966)).intValue();
                int i3 = 87 / 0;
            } else {
                int iOnExtraCallback3 = getKekid.onExtraCallback();
                int iOnExtraCallback4 = getKekid.onExtraCallback();
                iIntValue = ((Integer) AppLovinVastMediaViewf.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), -1724942966, iOnExtraCallback4, iOnExtraCallback3, new Object[0], 1724942966)).intValue();
            }
            int i4 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            return iIntValue;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return AppLovinVastMediaViewf.onExtraCallback();
            }
            AppLovinVastMediaViewf.onExtraCallback();
            throw null;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return AppLovinVastMediaViewf.onWarmupCompleted();
            }
            AppLovinVastMediaViewf.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return AppLovinVastMediaViewf.onNavigationEvent();
            }
            AppLovinVastMediaViewf.onNavigationEvent();
            throw null;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            int iIntValue = ((Integer) AppLovinVastMediaViewf.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), 860833878, iOnExtraCallback2, iOnExtraCallback, new Object[0], -860833877)).intValue();
            int i4 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iIntValue;
        }
    }

    static {
        int i = IAuthTabCallbackDefault + 29;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 97 / 0;
        }
    }

    public static final /* synthetic */ int onExtraCallbackWithResult() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return ((Integer) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), 860833878, iOnExtraCallback2, iOnExtraCallback, new Object[0], -860833877)).intValue();
    }

    public static final /* synthetic */ int IAuthTabCallback() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        return ((Integer) onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), -1724942966, iOnExtraCallback2, iOnExtraCallback, new Object[0], 1724942966)).intValue();
    }
}
