package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class createWifiConfiguration$IAuthTabCallbackDefault extends createWifiConfiguration<Boolean> {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final createWifiConfiguration$IAuthTabCallbackDefault IAuthTabCallback = new createWifiConfiguration$IAuthTabCallbackDefault();
    public static final int onNavigationEvent = 8;

    static {
        int i = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 101;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (obj instanceof createWifiConfiguration$IAuthTabCallbackDefault) {
            return true;
        }
        int i3 = IAuthTabCallbackStub + 79;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 54 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 127361258;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return "LivingStabilizationPreApplicationEnabled";
    }

    private createWifiConfiguration$IAuthTabCallbackDefault() {
        super("credit.livingStabilization.preApplicationEnabled", Boolean.FALSE, (DefaultConstructorMarker) null);
    }
}
