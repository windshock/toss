package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isDescendent$asInterface extends isDescendent {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Function1<KeyBoardVisiblePoint, Unit> IAuthTabCallback;
    private final KeyBoardVisiblePoint onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isDescendent$asInterface)) {
            return false;
        }
        isDescendent$asInterface isdescendent_asinterface = (isDescendent$asInterface) obj;
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, isdescendent_asinterface.onExtraCallbackWithResult)) {
            if (Intrinsics.areEqual(this.IAuthTabCallback, isdescendent_asinterface.IAuthTabCallback)) {
                return true;
            }
            int i4 = onWarmupCompleted + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onWarmupCompleted;
        int i7 = i6 + 9;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 109;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        return i3 != 0 ? (iHashCode - 13) >> this.IAuthTabCallback.hashCode() : (iHashCode * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanAccount(account=" + this.onExtraCallbackWithResult + ", onClick=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isDescendent$asInterface(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Function1<? super KeyBoardVisiblePoint, Unit> function1) {
        super(false, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallbackWithResult = keyBoardVisiblePoint;
        this.IAuthTabCallback = function1;
    }

    public final KeyBoardVisiblePoint onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onExtraCallbackWithResult;
        int i5 = i2 + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return keyBoardVisiblePoint;
        }
        throw null;
    }

    public final Function1<KeyBoardVisiblePoint, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Function1<KeyBoardVisiblePoint, Unit> function1 = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return function1;
    }
}
