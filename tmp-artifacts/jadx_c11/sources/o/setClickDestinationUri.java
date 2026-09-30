package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setClickDestinationUri {
    private static int IAuthTabCallbackStub = 1;
    private static int access000 = 1;
    private static int asBinder;
    private static final setClickDestinationUri onExtraCallback;
    private static int onTransact;
    private static final setClickDestinationUri onWarmupCompleted;
    private final boolean IAuthTabCallbackDefault;
    private final boolean asInterface;
    private final boolean onExtraCallbackWithResult;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final setClickDestinationUri onNavigationEvent = new setClickDestinationUri(true, false, true, 2, null);
    private static final setClickDestinationUri IAuthTabCallback = new setClickDestinationUri(false, false, true, 2, null);

    public setClickDestinationUri() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ setClickDestinationUri onExtraCallback(setClickDestinationUri setclickdestinationuri, boolean z, boolean z2, boolean z3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            z = setclickdestinationuri.onExtraCallbackWithResult;
        }
        if ((i & 2) != 0) {
            z2 = setclickdestinationuri.IAuthTabCallbackDefault;
        }
        if ((i & 4) != 0) {
            int i3 = access000 + 31;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z3 = setclickdestinationuri.asInterface;
        }
        setClickDestinationUri setclickdestinationuriOnWarmupCompleted = setclickdestinationuri.onWarmupCompleted(z, z2, z3);
        int i5 = asBinder + 81;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return setclickdestinationuriOnWarmupCompleted;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setClickDestinationUri)) {
            int i2 = asBinder + 77;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        setClickDestinationUri setclickdestinationuri = (setClickDestinationUri) obj;
        if (this.onExtraCallbackWithResult != setclickdestinationuri.onExtraCallbackWithResult) {
            int i4 = asBinder + 1;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.IAuthTabCallbackDefault != setclickdestinationuri.IAuthTabCallbackDefault) {
            int i5 = access000 + 23;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.asInterface == setclickdestinationuri.asInterface) {
            return true;
        }
        int i7 = access000 + 51;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = access000 + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Boolean.hashCode(this.onExtraCallbackWithResult) * 31) + Boolean.hashCode(this.IAuthTabCallbackDefault)) * 31) + Boolean.hashCode(this.asInterface);
        int i4 = asBinder + 77;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return iHashCode;
    }

    public final setClickDestinationUri onWarmupCompleted(boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        setClickDestinationUri setclickdestinationuri = new setClickDestinationUri(z, z2, z3);
        int i2 = access000 + 45;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return setclickdestinationuri;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckBoxState(checked=" + this.onExtraCallbackWithResult + ", enabled=" + this.IAuthTabCallbackDefault + ", pressed=" + this.asInterface + ")";
        int i2 = asBinder + 21;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public setClickDestinationUri(boolean z, boolean z2, boolean z3) {
        this.onExtraCallbackWithResult = z;
        this.IAuthTabCallbackDefault = z2;
        this.asInterface = z3;
    }

    public static final /* synthetic */ setClickDestinationUri IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ setClickDestinationUri onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 91;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ setClickDestinationUri onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        setClickDestinationUri setclickdestinationuri = onExtraCallback;
        int i5 = i3 + 63;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return setclickdestinationuri;
    }

    public static final /* synthetic */ setClickDestinationUri onWarmupCompleted() {
        setClickDestinationUri setclickdestinationuri;
        int i = 2 % 2;
        int i2 = asBinder + 65;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 == 0) {
            setclickdestinationuri = IAuthTabCallback;
            int i4 = 60 / 0;
        } else {
            setclickdestinationuri = IAuthTabCallback;
        }
        int i5 = i3 + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return setclickdestinationuri;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setClickDestinationUri(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = access000 + 91;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i5 = access000 + 19;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z2 = true;
        }
        if ((i & 4) != 0) {
            int i8 = asBinder + 27;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            z3 = false;
        }
        this(z, z2, z3);
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return z;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 13;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = access000 + 59;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.asInterface;
        int i4 = i3 + 93;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final setClickDestinationUri onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setClickDestinationUri setclickdestinationuriOnExtraCallback = setClickDestinationUri.onExtraCallback();
            int i4 = onNavigationEvent + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return setclickdestinationuriOnExtraCallback;
        }

        public final setClickDestinationUri onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setClickDestinationUri setclickdestinationuriIAuthTabCallback = setClickDestinationUri.IAuthTabCallback();
            int i4 = onExtraCallback + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return setclickdestinationuriIAuthTabCallback;
        }

        public final setClickDestinationUri IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setClickDestinationUri setclickdestinationuriOnNavigationEvent = setClickDestinationUri.onNavigationEvent();
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
            return setclickdestinationuriOnNavigationEvent;
        }

        public final setClickDestinationUri onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setClickDestinationUri setclickdestinationuriOnWarmupCompleted = setClickDestinationUri.onWarmupCompleted();
            int i4 = onExtraCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return setclickdestinationuriOnWarmupCompleted;
        }
    }

    static {
        boolean z = false;
        onWarmupCompleted = new setClickDestinationUri(true, z, false, 2, null);
        onExtraCallback = new setClickDestinationUri(false, false, z, 2, null);
        int i = IAuthTabCallbackStub + 73;
        onTransact = i % 128;
        int i2 = i % 2;
    }
}
