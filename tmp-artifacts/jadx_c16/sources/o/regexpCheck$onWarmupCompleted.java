package o;

import im.toss.features.home.presentation.legacy_transaction_list.R;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class regexpCheck$onWarmupCompleted implements NativeKeyboardObserverSpec {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final regexpCheck$onWarmupCompleted onNavigationEvent = new regexpCheck$onWarmupCompleted();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj || (obj instanceof regexpCheck$onWarmupCompleted)) {
            return true;
        }
        int i5 = i3 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 935852039;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return "InstallmentTransactionHeader";
    }

    private regexpCheck$onWarmupCompleted() {
    }

    public /* bridge */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = super.IAuthTabCallback();
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jIAuthTabCallback;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.string.home_presentation_legacy_transaction_list_section_header_installment;
        int i5 = onExtraCallback + 23;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return "InstallmentHeader";
        }
        throw null;
    }
}
