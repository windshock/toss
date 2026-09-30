package im.toss.features.credit.ui.plus.gift.send;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusSelectViewModel$onExtraCallbackWithResult {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final Long onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof CreditPlusSelectViewModel$onExtraCallbackWithResult)) {
            return false;
        }
        CreditPlusSelectViewModel$onExtraCallbackWithResult creditPlusSelectViewModel$onExtraCallbackWithResult = (CreditPlusSelectViewModel$onExtraCallbackWithResult) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, creditPlusSelectViewModel$onExtraCallbackWithResult.onWarmupCompleted) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, creditPlusSelectViewModel$onExtraCallbackWithResult.onExtraCallbackWithResult)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, creditPlusSelectViewModel$onExtraCallbackWithResult.onNavigationEvent)) {
            return true;
        }
        int i6 = IAuthTabCallback + 111;
        onExtraCallback = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            str = this.onWarmupCompleted;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
            int i4 = i3 + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = this.onWarmupCompleted;
            if (str == null) {
                iHashCode = 0;
                int i42 = i3 + 29;
                onExtraCallback = i42 % 128;
                int i52 = i42 % 2;
            }
            iHashCode = iHashCode2;
            iHashCode2 = str.hashCode();
        }
        Long l = this.onExtraCallbackWithResult;
        if (l != null) {
            iHashCode = l.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectedContactInfo(recipientPhoneNo=" + this.onWarmupCompleted + ", recipientUserNo=" + this.onExtraCallbackWithResult + ", realName=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CreditPlusSelectViewModel$onExtraCallbackWithResult(@Nullable String str, @Nullable Long l, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = l;
        this.onNavigationEvent = str2;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onWarmupCompleted;
            int i4 = 71 / 0;
        } else {
            str = this.onWarmupCompleted;
        }
        int i5 = i2 + 123;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Long l = this.onExtraCallbackWithResult;
        int i4 = i3 + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onNavigationEvent;
            int i4 = 22 / 0;
        } else {
            str = this.onNavigationEvent;
        }
        int i5 = i2 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
