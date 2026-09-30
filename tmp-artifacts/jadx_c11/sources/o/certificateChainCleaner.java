package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class certificateChainCleaner {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onNavigationEvent;

    static {
        int i = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 81;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof certificateChainCleaner)) {
            int i7 = i3 + 25;
            asInterface = i7 % 128;
            return i7 % 2 == 0;
        }
        certificateChainCleaner certificatechaincleaner = (certificateChainCleaner) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, certificatechaincleaner.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, certificatechaincleaner.onExtraCallback)) {
            return Intrinsics.areEqual(this.onNavigationEvent, certificatechaincleaner.onNavigationEvent);
        }
        int i8 = asBinder + 45;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.IAuthTabCallback;
        if (str == null) {
            int i2 = asBinder + 113;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.onExtraCallback;
        if (str2 == null) {
            int i4 = asBinder + 121;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.onNavigationEvent;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShareReferrers(referrer=" + this.IAuthTabCallback + ", serviceReferrer=" + this.onExtraCallback + ", referrerButton=" + this.onNavigationEvent + ")";
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public certificateChainCleaner(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
        this.onNavigationEvent = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ certificateChainCleaner(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = asInterface;
            int i3 = i2 + 11;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str3 = null;
        }
        this(str, str2, str3);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 99;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 71;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 53;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 25;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return str;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
