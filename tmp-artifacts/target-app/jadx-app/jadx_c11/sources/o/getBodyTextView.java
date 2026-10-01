package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getBodyTextView extends MaxNativeAdListener<Float> {
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent;
    private final Integer IAuthTabCallback;
    private final Integer onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final setOnQueryTextListener onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getBodyTextView)) {
            int i4 = IAuthTabCallbackStub + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        getBodyTextView getbodytextview = (getBodyTextView) obj;
        if ((!Intrinsics.areEqual(this.onExtraCallback, getbodytextview.onExtraCallback)) || !Intrinsics.areEqual(this.IAuthTabCallback, getbodytextview.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, getbodytextview.onWarmupCompleted)) {
            return false;
        }
        if (Float.compare(this.onExtraCallbackWithResult, getbodytextview.onExtraCallbackWithResult) == 0) {
            return true;
        }
        int i6 = onNavigationEvent + 51;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Integer num = this.onExtraCallback;
        int iHashCode3 = 0;
        if (num == null) {
            int i2 = onNavigationEvent + 55;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.IAuthTabCallback;
        if (num2 == null) {
            int i4 = onNavigationEvent + 65;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num2.hashCode();
        }
        setOnQueryTextListener setonquerytextlistener = this.onWarmupCompleted;
        if (setonquerytextlistener != null) {
            int i6 = onNavigationEvent + 19;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = setonquerytextlistener.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VariantTargetFloat(durationMillis=" + this.onExtraCallback + ", delayMillis=" + this.IAuthTabCallback + ", easing=" + this.onWarmupCompleted + ", value=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getBodyTextView(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        super(null, null, null, 7, null);
        this.onExtraCallback = num;
        this.IAuthTabCallback = num2;
        this.onWarmupCompleted = setonquerytextlistener;
        this.onExtraCallbackWithResult = f;
    }

    @Override // o.MaxNativeAdListener
    public /* synthetic */ Float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            throw null;
        }
        Float fOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onNavigationEvent + 41;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return fOnExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // o.MaxNativeAdListener, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallback;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    @Override // o.MaxNativeAdListener, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Integer num = this.IAuthTabCallback;
        int i5 = i3 + 87;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.MaxNativeAdListener, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public setOnQueryTextListener onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        setOnQueryTextListener setonquerytextlistener = this.onWarmupCompleted;
        int i5 = i2 + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return setonquerytextlistener;
    }

    public Float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(this.onExtraCallbackWithResult);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return fValueOf;
    }
}
