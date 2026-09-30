package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class t6 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final float IAuthTabCallback;
    private final float onNavigationEvent;
    private final float onWarmupCompleted;

    public t6() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            int i2 = onExtraCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        t6 t6Var = (t6) obj;
        if (Float.compare(this.onNavigationEvent, t6Var.onNavigationEvent) != 0 || Float.compare(this.IAuthTabCallback, t6Var.IAuthTabCallback) != 0) {
            return false;
        }
        if (Float.compare(this.onWarmupCompleted, t6Var.onWarmupCompleted) != 0) {
            int i3 = onExtraCallback + 67;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onExtraCallbackWithResult + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        float f;
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = ((Float.hashCode(this.onNavigationEvent) - 8) + Float.hashCode(this.IAuthTabCallback)) / 25;
            f = this.onWarmupCompleted;
        } else {
            iHashCode = ((Float.hashCode(this.onNavigationEvent) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31;
            f = this.onWarmupCompleted;
        }
        int iHashCode2 = iHashCode + Float.hashCode(f);
        int i3 = onExtraCallback + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsBottomCtaV1AnimateValue(position=" + this.onNavigationEvent + ", alpha=" + this.IAuthTabCallback + ", scale=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public t6(float f, float f2, float f3) {
        this.onNavigationEvent = f;
        this.IAuthTabCallback = f2;
        this.onWarmupCompleted = f3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t6(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 65;
            onExtraCallbackWithResult = i6 % 128;
            f3 = i6 % 2 == 0 ? 2.0f : 1.0f;
        }
        this(f, f2, f3);
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onNavigationEvent;
        int i5 = i2 + 95;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.IAuthTabCallback;
        int i4 = i2 + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onWarmupCompleted;
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return f;
    }
}
