package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class createWifiConfiguration$asInterface extends createWifiConfiguration<Boolean> {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final createWifiConfiguration$asInterface onExtraCallback = new createWifiConfiguration$asInterface();
    public static final int onNavigationEvent = 8;

    static {
        int i = IAuthTabCallback + 125;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            return obj instanceof createWifiConfiguration$asInterface;
        }
        int i5 = i2 + 85;
        onExtraCallbackWithResult = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return -232371693;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = i2 + 55;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return "ScoreChangeOverlayExpanded";
    }

    private createWifiConfiguration$asInterface() {
        super("credit.history.scoreChangeOverlay.expanded", Boolean.FALSE, (DefaultConstructorMarker) null);
    }
}
