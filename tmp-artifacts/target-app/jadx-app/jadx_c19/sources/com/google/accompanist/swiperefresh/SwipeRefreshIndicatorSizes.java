package com.google.accompanist.swiperefresh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.VirtualCameraControlExternalSyntheticLambda1;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SwipeRefreshIndicatorSizes {
    private final float arcRadius;
    private final float arrowHeight;
    private final float arrowWidth;
    private final float size;
    private final float strokeWidth;

    public /* synthetic */ SwipeRefreshIndicatorSizes(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    /* renamed from: copy-RyVG9vg$default, reason: not valid java name */
    public static /* synthetic */ SwipeRefreshIndicatorSizes m30copyRyVG9vg$default(SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes, float f, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = swipeRefreshIndicatorSizes.size;
        }
        if ((i2 & 2) != 0) {
            f2 = swipeRefreshIndicatorSizes.arcRadius;
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = swipeRefreshIndicatorSizes.strokeWidth;
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = swipeRefreshIndicatorSizes.arrowWidth;
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            f5 = swipeRefreshIndicatorSizes.arrowHeight;
        }
        return swipeRefreshIndicatorSizes.m36copyRyVG9vg(f, f6, f7, f8, f5);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m31component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m32component2D9Ej5fM() {
        return this.arcRadius;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m33component3D9Ej5fM() {
        return this.strokeWidth;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m34component4D9Ej5fM() {
        return this.arrowWidth;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name */
    public final float m35component5D9Ej5fM() {
        return this.arrowHeight;
    }

    /* renamed from: copy-RyVG9vg, reason: not valid java name */
    public final SwipeRefreshIndicatorSizes m36copyRyVG9vg(float f, float f2, float f3, float f4, float f5) {
        return new SwipeRefreshIndicatorSizes(f, f2, f3, f4, f5, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeRefreshIndicatorSizes)) {
            return false;
        }
        SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes = (SwipeRefreshIndicatorSizes) obj;
        return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.size, swipeRefreshIndicatorSizes.size) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.arcRadius, swipeRefreshIndicatorSizes.arcRadius) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.strokeWidth, swipeRefreshIndicatorSizes.strokeWidth) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.arrowWidth, swipeRefreshIndicatorSizes.arrowWidth) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.arrowHeight, swipeRefreshIndicatorSizes.arrowHeight);
    }

    public int hashCode() {
        return (((((((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.size) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.arcRadius)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.strokeWidth)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.arrowWidth)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.arrowHeight);
    }

    public String toString() {
        return "SwipeRefreshIndicatorSizes(size=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.size)) + ", arcRadius=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.arcRadius)) + ", strokeWidth=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.strokeWidth)) + ", arrowWidth=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.arrowWidth)) + ", arrowHeight=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.arrowHeight)) + ')';
    }

    private SwipeRefreshIndicatorSizes(float f, float f2, float f3, float f4, float f5) {
        this.size = f;
        this.arcRadius = f2;
        this.strokeWidth = f3;
        this.arrowWidth = f4;
        this.arrowHeight = f5;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m40getSizeD9Ej5fM() {
        return this.size;
    }

    /* renamed from: getArcRadius-D9Ej5fM, reason: not valid java name */
    public final float m37getArcRadiusD9Ej5fM() {
        return this.arcRadius;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m41getStrokeWidthD9Ej5fM() {
        return this.strokeWidth;
    }

    /* renamed from: getArrowWidth-D9Ej5fM, reason: not valid java name */
    public final float m39getArrowWidthD9Ej5fM() {
        return this.arrowWidth;
    }

    /* renamed from: getArrowHeight-D9Ej5fM, reason: not valid java name */
    public final float m38getArrowHeightD9Ej5fM() {
        return this.arrowHeight;
    }
}
