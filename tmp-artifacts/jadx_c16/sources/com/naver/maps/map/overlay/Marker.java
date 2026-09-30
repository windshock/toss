package com.naver.maps.map.overlay;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.overlay.Overlay;
import o.access500;
import o.getContentPaddingLeft;
import o.onTargetFound;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class Marker extends Overlay {
    private OverlayImage onExtraCallbackWithResult;
    private onTargetFound[] onNavigationEvent = IAuthTabCallback;
    private InfoWindow onTransact;
    public static final OverlayImage onWarmupCompleted = access500.IAuthTabCallbackDefault;
    public static final PointF onExtraCallback = new PointF(0.5f, 1.0f);
    public static final onTargetFound[] IAuthTabCallback = {onTargetFound.Bottom};

    private native void nativeCreate();

    private native void nativeDestroy();

    private native float nativeGetAlpha();

    private native PointF nativeGetAnchor();

    private native float nativeGetAngle();

    private native int nativeGetCaptionColor();

    private native String[] nativeGetCaptionFontFamily();

    private native int nativeGetCaptionHaloColor();

    private native int nativeGetCaptionOffset();

    private native int nativeGetCaptionRequestedWidth();

    private native String nativeGetCaptionText();

    private native float nativeGetCaptionTextSize();

    private native int nativeGetHeight();

    private native int nativeGetIconTintColor();

    private native LatLng nativeGetPosition();

    private native int nativeGetSubCaptionColor();

    private native String[] nativeGetSubCaptionFontFamily();

    private native int nativeGetSubCaptionHaloColor();

    private native int nativeGetSubCaptionRequestedWidth();

    private native String nativeGetSubCaptionText();

    private native float nativeGetSubCaptionTextSize();

    private native int nativeGetWidth();

    private native boolean nativeIsCaptionPerspectiveEnabled();

    private native boolean nativeIsFlat();

    private native boolean nativeIsForceShowCaption();

    private native boolean nativeIsForceShowIcon();

    private native boolean nativeIsHideCollidedCaptions();

    private native boolean nativeIsHideCollidedMarkers();

    private native boolean nativeIsHideCollidedSymbols();

    private native boolean nativeIsIconPerspectiveEnabled();

    private native boolean nativeIsOccupySpaceOnCollision();

    private native void nativeSetAlpha(float f);

    private native void nativeSetAnchor(float f, float f2);

    private native void nativeSetAngle(float f);

    private native void nativeSetCaptionAligns(int[] iArr);

    private native void nativeSetCaptionColor(int i);

    private native void nativeSetCaptionFontFamily(String[] strArr);

    private native void nativeSetCaptionHaloColor(int i);

    private native void nativeSetCaptionOffset(int i);

    private native void nativeSetCaptionPerspectiveEnabled(boolean z);

    private native void nativeSetCaptionRequestedWidth(int i);

    private native void nativeSetCaptionText(String str);

    private native void nativeSetCaptionTextSize(float f);

    private native void nativeSetFlat(boolean z);

    private native void nativeSetForceShowCaption(boolean z);

    private native void nativeSetForceShowIcon(boolean z);

    private native void nativeSetHeight(int i);

    private native void nativeSetHideCollidedCaptions(boolean z);

    private native void nativeSetHideCollidedMarkers(boolean z);

    private native void nativeSetHideCollidedSymbols(boolean z);

    private native void nativeSetIcon(OverlayImage overlayImage);

    private native void nativeSetIconPerspectiveEnabled(boolean z);

    private native void nativeSetIconTintColor(int i);

    private native void nativeSetOccupySpaceOnCollision(boolean z);

    private native void nativeSetPosition(double d, double d2);

    private native void nativeSetSubCaptionColor(int i);

    private native void nativeSetSubCaptionFontFamily(String[] strArr);

    private native void nativeSetSubCaptionHaloColor(int i);

    private native void nativeSetSubCaptionRequestedWidth(int i);

    private native void nativeSetSubCaptionText(String str);

    private native void nativeSetSubCaptionTextSize(float f);

    private native void nativeSetWidth(int i);

    protected native double nativeGetCaptionMaxZoom();

    protected native double nativeGetCaptionMinZoom();

    protected native double nativeGetSubCaptionMaxZoom();

    protected native double nativeGetSubCaptionMinZoom();

    protected native void nativeSetCaptionMaxZoom(double d);

    protected native void nativeSetCaptionMinZoom(double d);

    protected native void nativeSetSubCaptionMaxZoom(double d);

    protected native void nativeSetSubCaptionMinZoom(double d);

    public Marker() {
        setIcon(onWarmupCompleted);
    }

    public Marker(@NonNull LatLng latLng) throws Overlay.IAuthTabCallback {
        setPosition(latLng);
        setIcon(onWarmupCompleted);
    }

    public Marker(@NonNull OverlayImage overlayImage) {
        setIcon(overlayImage);
    }

    public Marker(@NonNull LatLng latLng, @NonNull OverlayImage overlayImage) throws Overlay.IAuthTabCallback {
        setPosition(latLng);
        setIcon(overlayImage);
    }

    @Override // com.naver.maps.map.overlay.Overlay
    protected void onExtraCallbackWithResult() {
        nativeCreate();
    }

    @Override // com.naver.maps.map.overlay.Overlay
    protected void IAuthTabCallback() {
        nativeDestroy();
    }

    @Override // com.naver.maps.map.overlay.Overlay
    public void IAuthTabCallback(@Nullable NaverMap naverMap) {
        super.IAuthTabCallback(naverMap);
    }

    @Override // com.naver.maps.map.overlay.Overlay
    public int getGlobalZIndex() {
        return super.getGlobalZIndex();
    }

    @Override // com.naver.maps.map.overlay.Overlay
    public void setGlobalZIndex(int i) {
        super.setGlobalZIndex(i);
    }

    public LatLng getPosition() {
        onNavigationEvent();
        return nativeGetPosition();
    }

    public void setPosition(@NonNull LatLng latLng) throws Overlay.IAuthTabCallback {
        onNavigationEvent();
        Overlay.onWarmupCompleted("position", latLng);
        nativeSetPosition(latLng.latitude, latLng.longitude);
    }

    public OverlayImage getIcon() {
        onNavigationEvent();
        return this.onExtraCallbackWithResult;
    }

    public void setIcon(@NonNull OverlayImage overlayImage) {
        onNavigationEvent();
        if (getContentPaddingLeft.IAuthTabCallback(this.onExtraCallbackWithResult, overlayImage)) {
            return;
        }
        this.onExtraCallbackWithResult = overlayImage;
        if (IAuthTabCallbackDefault()) {
            nativeSetIcon(overlayImage);
        }
    }

    public int getIconTintColor() {
        onNavigationEvent();
        return nativeGetIconTintColor();
    }

    public void setIconTintColor(int i) {
        onNavigationEvent();
        nativeSetIconTintColor(i);
    }

    public int getWidth() {
        onNavigationEvent();
        return nativeGetWidth();
    }

    public void setWidth(int i) {
        onNavigationEvent();
        nativeSetWidth(i);
    }

    public int getHeight() {
        onNavigationEvent();
        return nativeGetHeight();
    }

    public void setHeight(int i) {
        onNavigationEvent();
        nativeSetHeight(i);
    }

    public PointF getAnchor() {
        onNavigationEvent();
        return nativeGetAnchor();
    }

    public void setAnchor(@NonNull PointF pointF) {
        onNavigationEvent();
        nativeSetAnchor(pointF.x, pointF.y);
    }

    public String getCaptionText() {
        onNavigationEvent();
        return nativeGetCaptionText();
    }

    public void setCaptionText(@NonNull String str) {
        onNavigationEvent();
        if (str == null) {
            str = "";
        }
        nativeSetCaptionText(str);
    }

    public float getCaptionTextSize() {
        onNavigationEvent();
        return nativeGetCaptionTextSize();
    }

    public void setCaptionTextSize(float f) {
        onNavigationEvent();
        nativeSetCaptionTextSize(f);
    }

    public int getCaptionColor() {
        onNavigationEvent();
        return nativeGetCaptionColor();
    }

    public void setCaptionColor(int i) {
        onNavigationEvent();
        nativeSetCaptionColor(i);
    }

    public int getCaptionHaloColor() {
        onNavigationEvent();
        return nativeGetCaptionHaloColor();
    }

    public void setCaptionHaloColor(int i) {
        onNavigationEvent();
        nativeSetCaptionHaloColor(i);
    }

    public int getCaptionRequestedWidth() {
        onNavigationEvent();
        return nativeGetCaptionRequestedWidth();
    }

    public void setCaptionRequestedWidth(int i) {
        onNavigationEvent();
        nativeSetCaptionRequestedWidth(i);
    }

    public double getCaptionMinZoom() {
        onNavigationEvent();
        return nativeGetCaptionMinZoom();
    }

    public void setCaptionMinZoom(double d) {
        onNavigationEvent();
        nativeSetCaptionMinZoom(d);
    }

    public double getCaptionMaxZoom() {
        onNavigationEvent();
        return nativeGetCaptionMaxZoom();
    }

    public void setCaptionMaxZoom(double d) {
        onNavigationEvent();
        nativeSetCaptionMaxZoom(d);
    }

    public String getSubCaptionText() {
        onNavigationEvent();
        return nativeGetSubCaptionText();
    }

    public void setSubCaptionText(@NonNull String str) {
        onNavigationEvent();
        if (str == null) {
            str = "";
        }
        nativeSetSubCaptionText(str);
    }

    public float getSubCaptionTextSize() {
        onNavigationEvent();
        return nativeGetSubCaptionTextSize();
    }

    public void setSubCaptionTextSize(float f) {
        onNavigationEvent();
        nativeSetSubCaptionTextSize(f);
    }

    public int getSubCaptionColor() {
        onNavigationEvent();
        return nativeGetSubCaptionColor();
    }

    public void setSubCaptionColor(int i) {
        onNavigationEvent();
        nativeSetSubCaptionColor(i);
    }

    public int getSubCaptionHaloColor() {
        onNavigationEvent();
        return nativeGetSubCaptionHaloColor();
    }

    public void setSubCaptionHaloColor(int i) {
        onNavigationEvent();
        nativeSetSubCaptionHaloColor(i);
    }

    public String[] getSubCaptionFontFamily() {
        onNavigationEvent();
        return nativeGetSubCaptionFontFamily();
    }

    public void setSubCaptionFontFamily(@NonNull String... strArr) {
        onNavigationEvent();
        nativeSetSubCaptionFontFamily(strArr);
    }

    public int getSubCaptionRequestedWidth() {
        onNavigationEvent();
        return nativeGetSubCaptionRequestedWidth();
    }

    public void setSubCaptionRequestedWidth(int i) {
        onNavigationEvent();
        nativeSetSubCaptionRequestedWidth(i);
    }

    public double getSubCaptionMinZoom() {
        onNavigationEvent();
        return nativeGetSubCaptionMinZoom();
    }

    public void setSubCaptionMinZoom(double d) {
        onNavigationEvent();
        nativeSetSubCaptionMinZoom(d);
    }

    public double getSubCaptionMaxZoom() {
        onNavigationEvent();
        return nativeGetSubCaptionMaxZoom();
    }

    public void setSubCaptionMaxZoom(double d) {
        onNavigationEvent();
        nativeSetSubCaptionMaxZoom(d);
    }

    @Deprecated
    public onTargetFound getCaptionAlign() {
        return getCaptionAligns()[0];
    }

    @Deprecated
    public void setCaptionAlign(@NonNull onTargetFound ontargetfound) {
        setCaptionAligns(ontargetfound);
    }

    public onTargetFound[] getCaptionAligns() {
        onNavigationEvent();
        return this.onNavigationEvent;
    }

    public void setCaptionAligns(@NonNull onTargetFound... ontargetfoundArr) {
        if (ontargetfoundArr.length == 0) {
            throw new IllegalArgumentException();
        }
        onNavigationEvent();
        int[] iArr = new int[ontargetfoundArr.length];
        for (int i = 0; i < ontargetfoundArr.length; i++) {
            iArr[i] = ontargetfoundArr[i].ordinal();
        }
        this.onNavigationEvent = ontargetfoundArr;
        nativeSetCaptionAligns(iArr);
    }

    public int getCaptionOffset() {
        onNavigationEvent();
        return nativeGetCaptionOffset();
    }

    public void setCaptionOffset(int i) {
        onNavigationEvent();
        nativeSetCaptionOffset(i);
    }

    public float getAlpha() {
        onNavigationEvent();
        return nativeGetAlpha();
    }

    public void setAlpha(float f) {
        onNavigationEvent();
        nativeSetAlpha(f);
    }

    public float getAngle() {
        onNavigationEvent();
        return nativeGetAngle();
    }

    public void setAngle(float f) {
        onNavigationEvent();
        nativeSetAngle(f);
    }

    public boolean isFlat() {
        onNavigationEvent();
        return nativeIsFlat();
    }

    public void setFlat(boolean z) {
        onNavigationEvent();
        nativeSetFlat(z);
    }

    public boolean isHideCollidedSymbols() {
        onNavigationEvent();
        return nativeIsHideCollidedSymbols();
    }

    public void setHideCollidedSymbols(boolean z) {
        onNavigationEvent();
        nativeSetHideCollidedSymbols(z);
    }

    public boolean isHideCollidedMarkers() {
        onNavigationEvent();
        return nativeIsHideCollidedMarkers();
    }

    public void setHideCollidedMarkers(boolean z) {
        onNavigationEvent();
        nativeSetHideCollidedMarkers(z);
    }

    public boolean isHideCollidedCaptions() {
        onNavigationEvent();
        return nativeIsHideCollidedCaptions();
    }

    public void setHideCollidedCaptions(boolean z) {
        onNavigationEvent();
        nativeSetHideCollidedCaptions(z);
    }

    public boolean isForceShowIcon() {
        onNavigationEvent();
        return nativeIsForceShowIcon();
    }

    public void setForceShowIcon(boolean z) {
        onNavigationEvent();
        nativeSetForceShowIcon(z);
    }

    public boolean isForceShowCaption() {
        onNavigationEvent();
        return nativeIsForceShowCaption();
    }

    public void setForceShowCaption(boolean z) {
        onNavigationEvent();
        nativeSetForceShowCaption(z);
    }

    public boolean isOccupySpaceOnCollision() {
        onNavigationEvent();
        return nativeIsOccupySpaceOnCollision();
    }

    public void setOccupySpaceOnCollision(boolean z) {
        onNavigationEvent();
        nativeSetOccupySpaceOnCollision(z);
    }

    public boolean isIconPerspectiveEnabled() {
        onNavigationEvent();
        return nativeIsIconPerspectiveEnabled();
    }

    public void setIconPerspectiveEnabled(boolean z) {
        onNavigationEvent();
        nativeSetIconPerspectiveEnabled(z);
    }

    public boolean isCaptionPerspectiveEnabled() {
        onNavigationEvent();
        return nativeIsCaptionPerspectiveEnabled();
    }

    public void setCaptionPerspectiveEnabled(boolean z) {
        onNavigationEvent();
        nativeSetCaptionPerspectiveEnabled(z);
    }

    void onExtraCallbackWithResult(@Nullable InfoWindow infoWindow) {
        if (!IAuthTabCallbackDefault() || this.onTransact == infoWindow) {
            return;
        }
        this.onTransact = infoWindow;
    }

    @Override // com.naver.maps.map.overlay.Overlay
    protected void onExtraCallbackWithResult(@NonNull NaverMap naverMap) throws Overlay.IAuthTabCallback {
        Overlay.onWarmupCompleted("position", getPosition());
        super.onExtraCallbackWithResult(naverMap);
        nativeSetIcon(this.onExtraCallbackWithResult);
    }

    @Override // com.naver.maps.map.overlay.Overlay
    protected void onExtraCallback(@NonNull NaverMap naverMap) {
        InfoWindow infoWindow = this.onTransact;
        if (infoWindow != null) {
            infoWindow.onWarmupCompleted();
        }
        nativeSetIcon(null);
        super.onExtraCallback(naverMap);
    }
}
