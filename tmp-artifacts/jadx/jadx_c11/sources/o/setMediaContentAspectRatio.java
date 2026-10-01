package o;

import im.toss.tds.compose.foundation.anim.rally.RallyKeyframesSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setMediaContentAspectRatio extends setMainImage<Float> {
    private static int asInterface = 1;
    private static int onExtraCallback;
    private final RallyKeyframesSpec<Float> IAuthTabCallback;
    private final Integer onExtraCallbackWithResult;
    private final setOnQueryTextListener onNavigationEvent;
    private final Float onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 95;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setMediaContentAspectRatio)) {
            int i4 = onExtraCallback + 95;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        setMediaContentAspectRatio setmediacontentaspectratio = (setMediaContentAspectRatio) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, setmediacontentaspectratio.onExtraCallbackWithResult)) {
            int i6 = asInterface + 117;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, setmediacontentaspectratio.onNavigationEvent) || !Intrinsics.areEqual(this.onWarmupCompleted, setmediacontentaspectratio.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, setmediacontentaspectratio.IAuthTabCallback)) {
            return true;
        }
        int i8 = onExtraCallback + 63;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Integer num = this.onExtraCallbackWithResult;
        int iHashCode2 = 0;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        setOnQueryTextListener setonquerytextlistener = this.onNavigationEvent;
        if (setonquerytextlistener == null) {
            int i2 = asInterface + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = setonquerytextlistener.hashCode();
        }
        Float f = this.onWarmupCompleted;
        if (f != null) {
            int i4 = asInterface + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = f.hashCode();
        }
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "KeyframesVariantTargetFloat(delayMillis=" + this.onExtraCallbackWithResult + ", easing=" + this.onNavigationEvent + ", fromValue=" + this.onWarmupCompleted + ", keyframes=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallback + 49;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setMediaContentAspectRatio(@Nullable Integer num, @Nullable setOnQueryTextListener setonquerytextlistener, @Nullable Float f, @NotNull RallyKeyframesSpec<Float> rallyKeyframesSpec) {
        super(null);
        Intrinsics.checkNotNullParameter(rallyKeyframesSpec, "");
        this.onExtraCallbackWithResult = num;
        this.onNavigationEvent = setonquerytextlistener;
        this.onWarmupCompleted = f;
        this.IAuthTabCallback = rallyKeyframesSpec;
    }

    @Override // o.setMainImage, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // o.setMainImage, o.r8lambdawISNmAGv0vJBBl_rQ3C6417OY
    public setOnQueryTextListener onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        setOnQueryTextListener setonquerytextlistener = this.onNavigationEvent;
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return setonquerytextlistener;
    }

    @Override // o.setMainImage
    public RallyKeyframesSpec<Float> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        RallyKeyframesSpec<Float> rallyKeyframesSpec = this.IAuthTabCallback;
        int i5 = i2 + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return rallyKeyframesSpec;
    }
}
