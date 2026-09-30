package com.google.accompanist.swiperefresh;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.ExifOutputStream;
import o.UseCaseAttachStateExternalSyntheticLambda2;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.createByte;
import o.fromKilometersPerHour;
import o.getMappingAreaSize;
import o.getSupportedHighSpeedResolutionsFor;
import o.hasMoreElements;
import o.initialValue;
import o.isUseCaseAttached;
import o.removeTimestamp;
import o.seek;
import o.setByteOrder;
import o.setFlashState;
import o.setOrientationDegrees;
import o.setUseCaseAttached;
import o.setUseCaseDetached;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CircularProgressPainter extends Painter {
    private final getSupportedHighSpeedResolutionsFor alpha$delegate;
    private final getSupportedHighSpeedResolutionsFor arcRadius$delegate;
    private final Lazy arrow$delegate;
    private final getSupportedHighSpeedResolutionsFor arrowEnabled$delegate;
    private final getSupportedHighSpeedResolutionsFor arrowHeight$delegate;
    private final getSupportedHighSpeedResolutionsFor arrowScale$delegate;
    private final getSupportedHighSpeedResolutionsFor arrowWidth$delegate;
    private final getSupportedHighSpeedResolutionsFor color$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(setByteOrder.Companion.onTransact()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    private final getSupportedHighSpeedResolutionsFor endTrim$delegate;
    private final getSupportedHighSpeedResolutionsFor rotation$delegate;
    private final getSupportedHighSpeedResolutionsFor startTrim$delegate;
    private final getSupportedHighSpeedResolutionsFor strokeWidth$delegate;

    public CircularProgressPainter() {
        Float fValueOf = Float.valueOf(1.0f);
        this.alpha$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.arcRadius$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.strokeWidth$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.arrowEnabled$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.arrowWidth$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.arrowHeight$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.arrowScale$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.arrow$delegate = LazyKt.onExtraCallbackWithResult(new Function0<removeTimestamp>() { // from class: com.google.accompanist.swiperefresh.CircularProgressPainter$arrow$2
            public final removeTimestamp invoke() {
                removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
                removetimestampOnWarmupCompleted.onWarmupCompleted(initialValue.Companion.onWarmupCompleted());
                return removetimestampOnWarmupCompleted;
            }
        });
        Float fValueOf2 = Float.valueOf(0.0f);
        this.startTrim$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.endTrim$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.rotation$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m14getColor0d7_KjU() {
        return ((setByteOrder) this.color$delegate.onExtraCallbackWithResult()).access100();
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m20setColor8_81llA(long j) {
        this.color$delegate.IAuthTabCallback(setByteOrder.onNavigationEvent(j));
    }

    public final float getAlpha() {
        return ((Number) this.alpha$delegate.onExtraCallbackWithResult()).floatValue();
    }

    public final void setAlpha(float f) {
        this.alpha$delegate.IAuthTabCallback(Float.valueOf(f));
    }

    /* renamed from: getArcRadius-D9Ej5fM, reason: not valid java name */
    public final float m11getArcRadiusD9Ej5fM() {
        return ((VirtualCameraControlExternalSyntheticLambda1) this.arcRadius$delegate.onExtraCallbackWithResult()).IAuthTabCallback();
    }

    /* renamed from: setArcRadius-0680j_4, reason: not valid java name */
    public final void m17setArcRadius0680j_4(float f) {
        this.arcRadius$delegate.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m16getStrokeWidthD9Ej5fM() {
        return ((VirtualCameraControlExternalSyntheticLambda1) this.strokeWidth$delegate.onExtraCallbackWithResult()).IAuthTabCallback();
    }

    /* renamed from: setStrokeWidth-0680j_4, reason: not valid java name */
    public final void m21setStrokeWidth0680j_4(float f) {
        this.strokeWidth$delegate.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
    }

    public final boolean getArrowEnabled() {
        return ((Boolean) this.arrowEnabled$delegate.onExtraCallbackWithResult()).booleanValue();
    }

    public final void setArrowEnabled(boolean z) {
        this.arrowEnabled$delegate.IAuthTabCallback(Boolean.valueOf(z));
    }

    /* renamed from: getArrowWidth-D9Ej5fM, reason: not valid java name */
    public final float m13getArrowWidthD9Ej5fM() {
        return ((VirtualCameraControlExternalSyntheticLambda1) this.arrowWidth$delegate.onExtraCallbackWithResult()).IAuthTabCallback();
    }

    /* renamed from: setArrowWidth-0680j_4, reason: not valid java name */
    public final void m19setArrowWidth0680j_4(float f) {
        this.arrowWidth$delegate.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
    }

    /* renamed from: getArrowHeight-D9Ej5fM, reason: not valid java name */
    public final float m12getArrowHeightD9Ej5fM() {
        return ((VirtualCameraControlExternalSyntheticLambda1) this.arrowHeight$delegate.onExtraCallbackWithResult()).IAuthTabCallback();
    }

    /* renamed from: setArrowHeight-0680j_4, reason: not valid java name */
    public final void m18setArrowHeight0680j_4(float f) {
        this.arrowHeight$delegate.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
    }

    public final float getArrowScale() {
        return ((Number) this.arrowScale$delegate.onExtraCallbackWithResult()).floatValue();
    }

    public final void setArrowScale(float f) {
        this.arrowScale$delegate.IAuthTabCallback(Float.valueOf(f));
    }

    private final removeTimestamp getArrow() {
        return (removeTimestamp) this.arrow$delegate.getValue();
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

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long m15getIntrinsicSizeNHjbRc() {
        return setUseCaseDetached.Companion.IAuthTabCallback();
    }

    public boolean applyAlpha(float f) {
        setAlpha(f);
        return true;
    }

    public void onDraw(@NotNull setOrientationDegrees setorientationdegrees) {
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float rotation = getRotation();
        long jAsBinder = setorientationdegrees.asBinder();
        setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
        long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
        setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
        setflashstateOnExtraCallback.onTransact().onExtraCallbackWithResult(rotation, jAsBinder);
        float fOnExtraCallback = setorientationdegrees.onExtraCallback(m11getArcRadiusD9Ej5fM()) + (setorientationdegrees.onExtraCallback(m16getStrokeWidthD9Ej5fM()) / 2.0f);
        Rect rect = new Rect(setUseCaseAttached.onExtraCallbackWithResult(UseCaseAttachStateExternalSyntheticLambda2.onExtraCallbackWithResult(setorientationdegrees.onTransact())) - fOnExtraCallback, setUseCaseAttached.onTransact(UseCaseAttachStateExternalSyntheticLambda2.onExtraCallbackWithResult(setorientationdegrees.onTransact())) - fOnExtraCallback, setUseCaseAttached.onExtraCallbackWithResult(UseCaseAttachStateExternalSyntheticLambda2.onExtraCallbackWithResult(setorientationdegrees.onTransact())) + fOnExtraCallback, setUseCaseAttached.onTransact(UseCaseAttachStateExternalSyntheticLambda2.onExtraCallbackWithResult(setorientationdegrees.onTransact())) + fOnExtraCallback);
        float startTrim = (getStartTrim() + getRotation()) * 360.0f;
        float endTrim = ((getEndTrim() + getRotation()) * 360.0f) - startTrim;
        setOrientationDegrees.onExtraCallbackWithResult(setorientationdegrees, m14getColor0d7_KjU(), startTrim, endTrim, false, rect.ICustomTabsCallback(), rect.access100(), getAlpha(), new ExifOutputStream(setorientationdegrees.onExtraCallback(m16getStrokeWidthD9Ej5fM()), 0.0f, createByte.Companion.IAuthTabCallback(), 0, (fromKilometersPerHour) null, 26, (DefaultConstructorMarker) null), (seek) null, 0, 768, (Object) null);
        if (getArrowEnabled()) {
            drawArrow(setorientationdegrees, startTrim, endTrim, rect);
        }
        setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
        setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
    }

    private final void drawArrow(setOrientationDegrees setorientationdegrees, float f, float f2, Rect rect) {
        getArrow().asBinder();
        getArrow().onWarmupCompleted(0.0f, 0.0f);
        getArrow().onNavigationEvent(setorientationdegrees.onExtraCallback(m13getArrowWidthD9Ej5fM()) * getArrowScale(), 0.0f);
        getArrow().onNavigationEvent((setorientationdegrees.onExtraCallback(m13getArrowWidthD9Ej5fM()) * getArrowScale()) / 2.0f, setorientationdegrees.onExtraCallback(m12getArrowHeightD9Ej5fM()) * getArrowScale());
        float fMin = Math.min(rect.writeTypedObject(), rect.access000()) / 2.0f;
        float fOnExtraCallback = (setorientationdegrees.onExtraCallback(m13getArrowWidthD9Ej5fM()) * getArrowScale()) / 2.0f;
        getArrow().onWarmupCompleted(isUseCaseAttached.onNavigationEvent((fMin + setUseCaseAttached.onExtraCallbackWithResult(rect.IAuthTabCallbackStub())) - fOnExtraCallback, setUseCaseAttached.onTransact(rect.IAuthTabCallbackStub()) + (setorientationdegrees.onExtraCallback(m16getStrokeWidthD9Ej5fM()) / 2.0f)));
        getArrow().onExtraCallback();
        long jAsBinder = setorientationdegrees.asBinder();
        setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
        long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
        setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
        setflashstateOnExtraCallback.onTransact().onExtraCallbackWithResult(f + f2, jAsBinder);
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, getArrow(), m14getColor0d7_KjU(), getAlpha(), (hasMoreElements) null, (seek) null, 0, 56, (Object) null);
        setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
        setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
    }
}
