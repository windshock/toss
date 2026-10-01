package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class getOptionsContentViewGroup implements MaxNativeAdViewExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public getOptionsContentViewGroup(@NotNull setBodyTextViewId setbodytextviewid) {
        Intrinsics.checkNotNullParameter(setbodytextviewid, "");
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setbodytextviewid, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.MaxNativeAdViewExternalSyntheticLambda0
    public boolean onExtraCallback() {
        boolean zAsInterface;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            zAsInterface = asInterface();
            int i3 = 8 / 0;
        } else {
            zAsInterface = asInterface();
        }
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zAsInterface;
    }

    @Override // o.MaxNativeAdViewExternalSyntheticLambda0
    public setBodyTextViewId onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent();
            throw null;
        }
        setBodyTextViewId setbodytextviewidOnNavigationEvent = onNavigationEvent();
        int i3 = IAuthTabCallback + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return setbodytextviewidOnNavigationEvent;
    }

    @Override // o.MaxNativeAdViewExternalSyntheticLambda0
    public void onWarmupCompleted(@NotNull setBodyTextViewId setbodytextviewid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setbodytextviewid, "");
            onExtraCallback(setbodytextviewid);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setbodytextviewid, "");
        onExtraCallback(setbodytextviewid);
        int i3 = IAuthTabCallback + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.MaxNativeAdViewExternalSyntheticLambda0
    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        onNavigationEvent(i2 % 2 == 0);
    }

    @Override // o.MaxNativeAdViewExternalSyntheticLambda0
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        onNavigationEvent(i2 % 2 == 0);
        int i3 = onExtraCallback + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private final boolean asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return zBooleanValue;
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final setBodyTextViewId onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setBodyTextViewId setbodytextviewid = (setBodyTextViewId) this.onNavigationEvent.onExtraCallbackWithResult();
            int i3 = IAuthTabCallback + 65;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return setbodytextviewid;
            }
            throw null;
        }
        throw null;
    }

    private final void onExtraCallback(setBodyTextViewId setbodytextviewid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback(setbodytextviewid);
            int i3 = 35 / 0;
        } else {
            this.onNavigationEvent.IAuthTabCallback(setbodytextviewid);
        }
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
