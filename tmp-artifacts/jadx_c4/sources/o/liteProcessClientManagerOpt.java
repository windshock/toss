package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class liteProcessClientManagerOpt {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final String IAuthTabCallback;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liteProcessClientManagerOpt)) {
            int i4 = i3 + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        liteProcessClientManagerOpt liteprocessclientmanageropt = (liteProcessClientManagerOpt) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, liteprocessclientmanageropt.onNavigationEvent)) {
            int i6 = onExtraCallback + 73;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, liteprocessclientmanageropt.onWarmupCompleted)) {
            return Intrinsics.areEqual(this.IAuthTabCallback, liteprocessclientmanageropt.IAuthTabCallback);
        }
        int i8 = onExtraCallbackWithResult + 69;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.onNavigationEvent.hashCode() << 30) << this.onWarmupCompleted.hashCode()) << 37) * this.IAuthTabCallback.hashCode() : (((this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i3 = onExtraCallback + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditChangeTopBanner(title=" + this.onNavigationEvent + ", linkUrl=" + this.onWarmupCompleted + ", iconUrl=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return str;
    }

    public liteProcessClientManagerOpt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = str2;
        this.IAuthTabCallback = str3;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.onWarmupCompleted;
            int i4 = 13 / 0;
        } else {
            str = this.onWarmupCompleted;
        }
        int i5 = i3 + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 57;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
