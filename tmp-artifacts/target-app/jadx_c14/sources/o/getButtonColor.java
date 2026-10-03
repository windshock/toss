package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getButtonColor {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final String restrictionReleasingAt;

    /* JADX WARN: Illegal instructions before constructor call */
    public getButtonColor() {
        String str = null;
        this(str, 1, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getButtonColor)) {
            int i4 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.restrictionReleasingAt, ((getButtonColor) obj).restrictionReleasingAt)) {
            return true;
        }
        int i6 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 26 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.restrictionReleasingAt;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i2 + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OpenBankingWithdrawRestrictionResponse(restrictionReleasingAt=" + this.restrictionReleasingAt + ")";
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return str;
    }

    public getButtonColor(@Nullable String str) {
        this.restrictionReleasingAt = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getButtonColor(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 5;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 55;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.restrictionReleasingAt;
            int i4 = 12 / 0;
        } else {
            str = this.restrictionReleasingAt;
        }
        int i5 = i3 + 1;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
