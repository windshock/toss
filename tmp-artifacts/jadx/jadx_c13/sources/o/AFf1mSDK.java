package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1mSDK<T> implements AFf1jSDK {
    private static int asBinder = 1;
    private static int onTransact;
    private final double IAuthTabCallback;
    private final double onExtraCallback;
    private final T onExtraCallbackWithResult;
    private final Integer onNavigationEvent;
    private final double onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1mSDK)) {
            return false;
        }
        AFf1mSDK aFf1mSDK = (AFf1mSDK) obj;
        if (Double.compare(this.onWarmupCompleted, aFf1mSDK.onWarmupCompleted) != 0) {
            return false;
        }
        if (Double.compare(this.onExtraCallback, aFf1mSDK.onExtraCallback) != 0) {
            int i2 = asBinder + 97;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Double.compare(this.IAuthTabCallback, aFf1mSDK.IAuthTabCallback) != 0) {
            int i4 = onTransact + 77;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, aFf1mSDK.onNavigationEvent)) {
            int i6 = asBinder + 51;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, aFf1mSDK.onExtraCallbackWithResult)) {
            return true;
        }
        int i8 = asBinder + 51;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Double.hashCode(this.onWarmupCompleted);
        int iHashCode3 = Double.hashCode(this.onExtraCallback);
        int iHashCode4 = Double.hashCode(this.IAuthTabCallback);
        Integer num = this.onNavigationEvent;
        int iHashCode5 = 0;
        if (num == null) {
            int i4 = asBinder + 81;
            onTransact = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
            int i5 = asBinder + 101;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        T t = this.onExtraCallbackWithResult;
        if (t != null) {
            int i7 = asBinder + 9;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            iHashCode5 = t.hashCode();
        }
        int i9 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5;
        int i10 = asBinder + 61;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LineChartEntry(value=" + this.onWarmupCompleted + ", low=" + this.onExtraCallback + ", high=" + this.IAuthTabCallback + ", colorResId=" + this.onNavigationEvent + ", data=" + this.onExtraCallbackWithResult + ")";
        int i2 = asBinder + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public AFf1mSDK(double d, double d2, double d3, @Nullable Integer num, @Nullable T t) {
        this.onWarmupCompleted = d;
        this.onExtraCallback = d2;
        this.IAuthTabCallback = d3;
        this.onNavigationEvent = num;
        this.onExtraCallbackWithResult = t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AFf1mSDK(double d, double d2, double d3, Integer num, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        if ((i & 8) != 0) {
            int i2 = onTransact + 29;
            asBinder = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        this(d, d2, d3, num2, obj);
    }

    public final double onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 105;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        double d = this.onWarmupCompleted;
        int i5 = i2 + 35;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        double d = this.onExtraCallback;
        int i5 = i3 + 49;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final double onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final T onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 51;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        T t = this.onExtraCallbackWithResult;
        int i5 = i2 + 77;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        throw null;
    }
}
