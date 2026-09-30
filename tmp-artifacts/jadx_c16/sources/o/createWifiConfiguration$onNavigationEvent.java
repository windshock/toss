package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class createWifiConfiguration$onNavigationEvent extends createWifiConfiguration<String> {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final createWifiConfiguration$onNavigationEvent onNavigationEvent = new createWifiConfiguration$onNavigationEvent();
    public static final int onExtraCallback = 8;

    static {
        int i = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof createWifiConfiguration$onNavigationEvent) {
                return true;
            }
            int i2 = IAuthTabCallbackStub + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IAuthTabCallback;
        int i5 = i4 + 53;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 7;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return -139019812;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return "CardLoanOpenedLandingType";
    }

    private createWifiConfiguration$onNavigationEvent() {
        super("credit.history.cardLoanOpenedLanding.type", "Control", (DefaultConstructorMarker) null);
    }

    public final boolean onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(str, "A");
        int i4 = IAuthTabCallbackStub + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public final boolean onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.areEqual(str, "B");
            throw null;
        }
        boolean zAreEqual = Intrinsics.areEqual(str, "B");
        int i3 = IAuthTabCallbackStub + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zAreEqual;
    }
}
