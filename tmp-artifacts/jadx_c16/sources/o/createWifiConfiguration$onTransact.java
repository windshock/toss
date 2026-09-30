package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class createWifiConfiguration$onTransact extends createWifiConfiguration<String> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    public static final createWifiConfiguration$onTransact onNavigationEvent = new createWifiConfiguration$onTransact();
    public static final int onWarmupCompleted = 8;

    static {
        int i = onExtraCallback + 113;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createWifiConfiguration$onTransact)) {
            int i2 = onExtraCallbackWithResult + 1;
            onTransact = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = onExtraCallbackWithResult + 101;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 532108722;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return "LivingStabilizationLandingScheme";
    }

    private createWifiConfiguration$onTransact() {
        super("credit.livingStabilization.landingScheme", "", (DefaultConstructorMarker) null);
    }
}
