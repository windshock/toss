package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAdvertiserTextView extends MaxNativeAdListener<VirtualCameraControlExternalSyntheticLambda1> {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback;
    private final float IAuthTabCallback;
    private final setOnQueryTextListener onExtraCallbackWithResult;
    private final Integer onNavigationEvent;
    private final Integer onWarmupCompleted;

    public /* synthetic */ getAdvertiserTextView(Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, setonquerytextlistener, f);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getAdvertiserTextView)) {
            return false;
        }
        getAdvertiserTextView getadvertisertextview = (getAdvertiserTextView) obj;
        if ((!Intrinsics.areEqual(this.onNavigationEvent, getadvertisertextview.onNavigationEvent)) || !Intrinsics.areEqual(this.onWarmupCompleted, getadvertisertextview.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, getadvertisertextview.onExtraCallbackWithResult)) {
            int i4 = IAuthTabCallbackStub + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, getadvertisertextview.IAuthTabCallback)) {
            return true;
        }
        int i6 = onExtraCallback + 43;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Integer num = this.onNavigationEvent;
        if (num == null) {
            int i2 = onExtraCallback + 107;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.onWarmupCompleted;
        if (num2 == null) {
            int i4 = onExtraCallback + 81;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num2.hashCode();
        }
        setOnQueryTextListener setonquerytextlistener = this.onExtraCallbackWithResult;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (setonquerytextlistener != null ? setonquerytextlistener.hashCode() : 0)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VariantTargetDp(durationMillis=" + this.onNavigationEvent + ", delayMillis=" + this.onWarmupCompleted + ", easing=" + this.onExtraCallbackWithResult + ", value=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback) + ")";
        int i2 = onExtraCallback + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private getAdvertiserTextView(Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, float f) {
        super(null, null, null, 7, null);
        this.onNavigationEvent = num;
        this.onWarmupCompleted = num2;
        this.onExtraCallbackWithResult = setonquerytextlistener;
        this.IAuthTabCallback = f;
    }

    @Override // o.MaxNativeAdListener
    public /* synthetic */ VirtualCameraControlExternalSyntheticLambda1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackStub + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return virtualCameraControlExternalSyntheticLambda1OnNavigationEvent;
        }
        throw null;
    }

    @Override // o.MaxNativeAdListener, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public Integer onExtraCallback() {
        Integer num;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            num = this.onNavigationEvent;
            int i4 = 16 / 0;
        } else {
            num = this.onNavigationEvent;
        }
        int i5 = i3 + 103;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    @Override // o.MaxNativeAdListener, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public Integer IAuthTabCallback() {
        Integer num;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.onWarmupCompleted;
            int i4 = 1 / 0;
        } else {
            num = this.onWarmupCompleted;
        }
        int i5 = i2 + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    @Override // o.MaxNativeAdListener, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public setOnQueryTextListener onNavigationEvent() {
        setOnQueryTextListener setonquerytextlistener;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            setonquerytextlistener = this.onExtraCallbackWithResult;
            int i4 = 32 / 0;
        } else {
            setonquerytextlistener = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return setonquerytextlistener;
    }

    public float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallback;
        int i5 = i2 + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }
}
