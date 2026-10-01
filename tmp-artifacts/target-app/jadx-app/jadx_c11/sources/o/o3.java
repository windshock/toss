package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o3 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final n7 onExtraCallback;
    private final n7 onNavigationEvent;

    public static /* synthetic */ o3 onNavigationEvent(o3 o3Var, n7 n7Var, n7 n7Var2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallback + 57;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                n7Var = o3Var.onNavigationEvent;
                int i4 = 41 / 0;
            } else {
                n7Var = o3Var.onNavigationEvent;
            }
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            n7Var2 = o3Var.onExtraCallback;
        }
        return o3Var.IAuthTabCallback(n7Var, n7Var2);
    }

    public final o3 IAuthTabCallback(@NotNull n7 n7Var, @NotNull n7 n7Var2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(n7Var, "");
        Intrinsics.checkNotNullParameter(n7Var2, "");
        o3 o3Var = new o3(n7Var, n7Var2);
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return o3Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 101;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(obj instanceof o3))) {
            o3 o3Var = (o3) obj;
            return !(Intrinsics.areEqual(this.onNavigationEvent, o3Var.onNavigationEvent) ^ true) && Intrinsics.areEqual(this.onExtraCallback, o3Var.onExtraCallback);
        }
        int i7 = i3 + 105;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        return i3 == 0 ? (iHashCode + 5) % this.onExtraCallback.hashCode() : (iHashCode * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnBundlePairLoadRequest(service=" + this.onNavigationEvent + ", shared=" + this.onExtraCallback + ")";
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public o3(@NotNull n7 n7Var, @NotNull n7 n7Var2) {
        Intrinsics.checkNotNullParameter(n7Var, "");
        Intrinsics.checkNotNullParameter(n7Var2, "");
        this.onNavigationEvent = n7Var;
        this.onExtraCallback = n7Var2;
        if (StringsKt.isBlank(n7Var.IAuthTabCallback())) {
            throw new IllegalArgumentException("service bundleName must not be blank");
        }
        if (!StringsKt.isBlank(n7Var2.IAuthTabCallback())) {
            int i = IAuthTabCallback + 29;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        throw new IllegalArgumentException("shared bundleName must not be blank");
    }

    public final n7 IAuthTabCallback() {
        n7 n7Var;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            n7Var = this.onExtraCallback;
            int i4 = 68 / 0;
        } else {
            n7Var = this.onExtraCallback;
        }
        int i5 = i3 + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return n7Var;
    }

    public final n7 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        n7 n7Var = this.onNavigationEvent;
        int i4 = i3 + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return n7Var;
    }
}
