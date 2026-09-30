package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addAppOpenAdapter {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final toMetersPerSecond onExtraCallback;
    private final long onWarmupCompleted;

    public /* synthetic */ addAppOpenAdapter(long j, toMetersPerSecond tometerspersecond, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, tometerspersecond);
    }

    private addAppOpenAdapter(long j, toMetersPerSecond tometerspersecond) {
        Intrinsics.checkNotNullParameter(tometerspersecond, "");
        this.onWarmupCompleted = j;
        this.onExtraCallback = tometerspersecond;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ addAppOpenAdapter(long j, toMetersPerSecond tometerspersecond, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            j = setByteOrder.Companion.onTransact();
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            tometerspersecond = addRewardedAdapter.onExtraCallback();
        }
        this(j, tometerspersecond, null);
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final toMetersPerSecond onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
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
        if (obj instanceof addAppOpenAdapter) {
            addAppOpenAdapter addappopenadapter = (addAppOpenAdapter) obj;
            return setByteOrder.onExtraCallbackWithResult(this.onWarmupCompleted, addappopenadapter.onWarmupCompleted) && !(Intrinsics.areEqual(this.onExtraCallback, addappopenadapter.onExtraCallback) ^ true);
        }
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            setByteOrder.onTransact(this.onWarmupCompleted);
            throw null;
        }
        int iOnTransact = setByteOrder.onTransact(this.onWarmupCompleted);
        int i3 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iOnTransact;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsRippleConfiguration(color=" + setByteOrder.IAuthTabCallbackDefault(this.onWarmupCompleted) + ", shape=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
