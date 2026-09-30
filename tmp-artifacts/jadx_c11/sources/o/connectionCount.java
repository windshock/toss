package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class connectionCount {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final float IAuthTabCallback;
    private final float onNavigationEvent;

    public connectionCount(float f, float f2) {
        this.IAuthTabCallback = f;
        if (Float.isNaN(f2)) {
            f2 = CipherSuiteCompanionORDER_BY_NAME1.onExtraCallback().onExtraCallback(f).intValue();
            int i = onWarmupCompleted + 49;
            onExtraCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.onNavigationEvent = f2;
        int i4 = onWarmupCompleted + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ connectionCount(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            f2 = CipherSuiteCompanionORDER_BY_NAME1.onExtraCallback().onExtraCallback(f).intValue();
            int i4 = onExtraCallback + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(f, f2);
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float f = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return f;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        float f = this.onNavigationEvent;
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? (Float.hashCode(this.IAuthTabCallback) + 52) << Float.hashCode(this.onNavigationEvent) : (Float.hashCode(this.IAuthTabCallback) * 31) + Float.hashCode(this.onNavigationEvent);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof connectionCount)) {
            return false;
        }
        connectionCount connectioncount = (connectionCount) obj;
        if (this.IAuthTabCallback == connectioncount.IAuthTabCallback && this.onNavigationEvent == connectioncount.onNavigationEvent) {
            return true;
        }
        int i5 = i3 + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static /* synthetic */ float onExtraCallback(connectionCount connectioncount, float f, float f2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                float f3 = connectioncount.onNavigationEvent;
                throw null;
            }
            f2 = connectioncount.onNavigationEvent;
        }
        float fOnExtraCallbackWithResult = connectioncount.onExtraCallbackWithResult(f, f2);
        int i4 = onWarmupCompleted + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fOnExtraCallbackWithResult;
    }

    public final float onExtraCallbackWithResult(float f, float f2) {
        int i = 2 % 2;
        if (Float.isNaN(f2)) {
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                f2 = CipherSuiteCompanionORDER_BY_NAME1.onExtraCallback().onExtraCallback(this.IAuthTabCallback).intValue();
                int i3 = 43 / 0;
            } else {
                f2 = CipherSuiteCompanionORDER_BY_NAME1.onExtraCallback().onExtraCallback(this.IAuthTabCallback).intValue();
            }
            int i4 = onWarmupCompleted + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        float fCoerceAtMost = RangesKt.coerceAtMost(getTcfVendorConsentStatus.Companion.asBinder().onNavigationEvent(f).onNavigationEvent(this.IAuthTabCallback), f2);
        int i6 = onExtraCallback + 91;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return fCoerceAtMost;
    }
}
