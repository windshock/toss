package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isDescendent$IAuthTabCallbackDefault extends isDescendent {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Function1<KeyBoardVisiblePoint, Unit> onExtraCallback;
    private final KeyBoardVisiblePoint onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 49;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 55;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 43 / 0;
            }
            return true;
        }
        if (!(obj instanceof isDescendent$IAuthTabCallbackDefault)) {
            int i7 = onNavigationEvent + 45;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        isDescendent$IAuthTabCallbackDefault isdescendent_iauthtabcallbackdefault = (isDescendent$IAuthTabCallbackDefault) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, isdescendent_iauthtabcallbackdefault.onWarmupCompleted)) {
            int i9 = onNavigationEvent + 59;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, isdescendent_iauthtabcallbackdefault.onExtraCallback)) {
            return true;
        }
        int i11 = onNavigationEvent + 87;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.onWarmupCompleted.hashCode() + 67) * this.onExtraCallback.hashCode() : (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallback.hashCode();
        int i3 = IAuthTabCallback + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanAccountForCopy(account=" + this.onWarmupCompleted + ", onClick=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isDescendent$IAuthTabCallbackDefault(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Function1<? super KeyBoardVisiblePoint, Unit> function1) {
        super(false, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = keyBoardVisiblePoint;
        this.onExtraCallback = function1;
    }

    public final KeyBoardVisiblePoint onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onWarmupCompleted;
        int i5 = i3 + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return keyBoardVisiblePoint;
    }

    public final Function1<KeyBoardVisiblePoint, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Function1<KeyBoardVisiblePoint, Unit> function1 = this.onExtraCallback;
        int i4 = i2 + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return function1;
        }
        throw null;
    }
}
