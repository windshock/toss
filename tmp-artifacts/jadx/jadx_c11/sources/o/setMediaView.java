package o;

import im.toss.tds.compose.foundation.anim.rally.RallyKeyframesSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setMediaView extends setMainImage<VirtualCameraControlExternalSyntheticLambda1> {
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private final VirtualCameraControlExternalSyntheticLambda1 IAuthTabCallback;
    private final setOnQueryTextListener onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final RallyKeyframesSpec<VirtualCameraControlExternalSyntheticLambda1> onWarmupCompleted;

    public /* synthetic */ setMediaView(Integer num, setOnQueryTextListener setonquerytextlistener, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, RallyKeyframesSpec rallyKeyframesSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, setonquerytextlistener, virtualCameraControlExternalSyntheticLambda1, rallyKeyframesSpec);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMediaView)) {
            return false;
        }
        setMediaView setmediaview = (setMediaView) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, setmediaview.onExtraCallbackWithResult)) {
            int i2 = asInterface + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 21 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, setmediaview.onExtraCallback)) {
            int i4 = onNavigationEvent + 33;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, setmediaview.IAuthTabCallback)) {
            return Intrinsics.areEqual(this.onWarmupCompleted, setmediaview.onWarmupCompleted);
        }
        int i6 = asInterface + 1;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 52 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asInterface + 93;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallbackWithResult;
        int iOnWarmupCompleted = 0;
        if (num == null) {
            int i5 = i3 + 99;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 65;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        setOnQueryTextListener setonquerytextlistener = this.onExtraCallback;
        int iHashCode2 = setonquerytextlistener == null ? 0 : setonquerytextlistener.hashCode();
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = this.IAuthTabCallback;
        if (virtualCameraControlExternalSyntheticLambda1 != null) {
            int i9 = onNavigationEvent + 61;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback());
        }
        int iHashCode3 = (((((iHashCode * 31) + iHashCode2) * 31) + iOnWarmupCompleted) * 31) + this.onWarmupCompleted.hashCode();
        int i11 = asInterface + 89;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 == 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "KeyframesVariantTargetDp(delayMillis=" + this.onExtraCallbackWithResult + ", easing=" + this.onExtraCallback + ", fromValue=" + this.IAuthTabCallback + ", keyframes=" + this.onWarmupCompleted + ")";
        int i2 = onNavigationEvent + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private setMediaView(Integer num, setOnQueryTextListener setonquerytextlistener, VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, RallyKeyframesSpec<VirtualCameraControlExternalSyntheticLambda1> rallyKeyframesSpec) {
        super(null);
        Intrinsics.checkNotNullParameter(rallyKeyframesSpec, "");
        this.onExtraCallbackWithResult = num;
        this.onExtraCallback = setonquerytextlistener;
        this.IAuthTabCallback = virtualCameraControlExternalSyntheticLambda1;
        this.onWarmupCompleted = rallyKeyframesSpec;
    }

    @Override // o.setMainImage, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.onExtraCallbackWithResult;
        int i4 = i2 + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.setMainImage, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public setOnQueryTextListener onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setMainImage
    public RallyKeyframesSpec<VirtualCameraControlExternalSyntheticLambda1> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        RallyKeyframesSpec<VirtualCameraControlExternalSyntheticLambda1> rallyKeyframesSpec = this.onWarmupCompleted;
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return rallyKeyframesSpec;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
