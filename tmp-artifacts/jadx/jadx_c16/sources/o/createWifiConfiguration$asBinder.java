package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class createWifiConfiguration$asBinder extends createWifiConfiguration<Boolean> {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public static final createWifiConfiguration$asBinder onNavigationEvent = new createWifiConfiguration$asBinder();
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = IAuthTabCallback + 107;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 53;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 41;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof createWifiConfiguration$asBinder)) {
            return false;
        }
        int i8 = i2 + 123;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 95 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return 760887420;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return "CreditPlusPaymentConfirmation";
        }
        int i3 = 97 / 0;
        return "CreditPlusPaymentConfirmation";
    }

    private createWifiConfiguration$asBinder() {
        super("credit.plus.payments.use_confirmation", Boolean.TRUE, (DefaultConstructorMarker) null);
    }
}
