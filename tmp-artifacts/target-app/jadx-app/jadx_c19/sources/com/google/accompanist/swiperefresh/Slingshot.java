package com.google.accompanist.swiperefresh;

import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Slingshot {
    private final getSupportedHighSpeedResolutionsFor arrowScale$delegate;
    private final getSupportedHighSpeedResolutionsFor endTrim$delegate;
    private final getSupportedHighSpeedResolutionsFor offset$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(0, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    private final getSupportedHighSpeedResolutionsFor rotation$delegate;
    private final getSupportedHighSpeedResolutionsFor startTrim$delegate;

    public Slingshot() {
        Float fValueOf = Float.valueOf(0.0f);
        this.startTrim$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.endTrim$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.rotation$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.arrowScale$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public final int getOffset() {
        return ((Number) this.offset$delegate.onExtraCallbackWithResult()).intValue();
    }

    public final void setOffset(int i2) {
        this.offset$delegate.IAuthTabCallback(Integer.valueOf(i2));
    }

    public final float getStartTrim() {
        return ((Number) this.startTrim$delegate.onExtraCallbackWithResult()).floatValue();
    }

    public final void setStartTrim(float f) {
        this.startTrim$delegate.IAuthTabCallback(Float.valueOf(f));
    }

    public final float getEndTrim() {
        return ((Number) this.endTrim$delegate.onExtraCallbackWithResult()).floatValue();
    }

    public final void setEndTrim(float f) {
        this.endTrim$delegate.IAuthTabCallback(Float.valueOf(f));
    }

    public final float getRotation() {
        return ((Number) this.rotation$delegate.onExtraCallbackWithResult()).floatValue();
    }

    public final void setRotation(float f) {
        this.rotation$delegate.IAuthTabCallback(Float.valueOf(f));
    }

    public final float getArrowScale() {
        return ((Number) this.arrowScale$delegate.onExtraCallbackWithResult()).floatValue();
    }

    public final void setArrowScale(float f) {
        this.arrowScale$delegate.IAuthTabCallback(Float.valueOf(f));
    }
}
