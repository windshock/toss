package im.toss.features.home.core.ui.widget.sprint3;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class IncomeMainVar2View$onExtraCallback {
    private static int asBinder = 1;
    private static int asInterface;
    private final float IAuthTabCallback;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final float onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncomeMainVar2View$onExtraCallback)) {
            return false;
        }
        IncomeMainVar2View$onExtraCallback incomeMainVar2View$onExtraCallback = (IncomeMainVar2View$onExtraCallback) obj;
        if (this.onNavigationEvent != incomeMainVar2View$onExtraCallback.onNavigationEvent) {
            return false;
        }
        if (Float.compare(this.onWarmupCompleted, incomeMainVar2View$onExtraCallback.onWarmupCompleted) != 0) {
            int i3 = asInterface + 5;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 101;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Float.compare(this.IAuthTabCallback, incomeMainVar2View$onExtraCallback.IAuthTabCallback) != 0) {
            return false;
        }
        if (Float.compare(this.onExtraCallbackWithResult, incomeMainVar2View$onExtraCallback.onExtraCallbackWithResult) == 0) {
            return Float.compare(this.onExtraCallback, incomeMainVar2View$onExtraCallback.onExtraCallback) == 0;
        }
        int i8 = asBinder + 97;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Integer.hashCode(this.onNavigationEvent) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.onExtraCallback);
        int i4 = asInterface + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChildState(itemIndex=" + this.onNavigationEvent + ", alpha=" + this.onWarmupCompleted + ", translationY=" + this.IAuthTabCallback + ", scaleX=" + this.onExtraCallbackWithResult + ", scaleY=" + this.onExtraCallback + ")";
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public IncomeMainVar2View$onExtraCallback(int i, float f, float f2, float f3, float f4) {
        this.onNavigationEvent = i;
        this.onWarmupCompleted = f;
        this.IAuthTabCallback = f2;
        this.onExtraCallbackWithResult = f3;
        this.onExtraCallback = f4;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i2 + 37;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 5;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onWarmupCompleted;
        int i5 = i2 + 35;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        float f = this.IAuthTabCallback;
        int i4 = i3 + 115;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        float f = this.onExtraCallbackWithResult;
        int i5 = i3 + 109;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onWarmupCompleted() {
        float f;
        int i = 2 % 2;
        int i2 = asBinder + 19;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            f = this.onExtraCallback;
            int i4 = 14 / 0;
        } else {
            f = this.onExtraCallback;
        }
        int i5 = i3 + 33;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }
}
