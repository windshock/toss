package com.naver.maps.map.overlay;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.geometry.LatLngBounds;
import com.naver.maps.map.NaverMap;
import java.util.Collections;
import java.util.List;
import o.getContentPaddingLeft;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PathOverlay extends Overlay {
    private List<LatLng> IAuthTabCallback = Collections.EMPTY_LIST;
    private OverlayImage onWarmupCompleted;

    private native void nativeCreate();

    private native void nativeDestroy();

    private native LatLngBounds nativeGetBounds();

    private native int nativeGetColor();

    private native int nativeGetOutlineColor();

    private native int nativeGetOutlineWidth();

    private native int nativeGetPassedColor();

    private native int nativeGetPassedOutlineColor();

    private native int nativeGetPatternInterval();

    private native double nativeGetProgress();

    private native int nativeGetWidth();

    private native boolean nativeIsHideCollidedCaptions();

    private native boolean nativeIsHideCollidedMarkers();

    private native boolean nativeIsHideCollidedSymbols();

    private native void nativeSetColor(int i);

    private native void nativeSetCoords(double[] dArr);

    private native void nativeSetHideCollidedCaptions(boolean z);

    private native void nativeSetHideCollidedMarkers(boolean z);

    private native void nativeSetHideCollidedSymbols(boolean z);

    private native void nativeSetOutlineColor(int i);

    private native void nativeSetOutlineWidth(int i);

    private native void nativeSetPassedColor(int i);

    private native void nativeSetPassedOutlineColor(int i);

    private native void nativeSetPatternImage(OverlayImage overlayImage);

    private native void nativeSetPatternInterval(int i);

    private native void nativeSetProgress(double d);

    private native void nativeSetWidth(int i);

    public PathOverlay() {
    }

    public PathOverlay(@NonNull List<LatLng> list) {
        setCoords(list);
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

    public List<LatLng> getCoords() {
        onNavigationEvent();
        return this.IAuthTabCallback;
    }

    public void setCoords(@NonNull List<LatLng> list) {
        onNavigationEvent();
        nativeSetCoords(Overlay.onNavigationEvent("coords", list, 2));
        this.IAuthTabCallback = list;
    }

    public double getProgress() {
        onNavigationEvent();
        return nativeGetProgress();
    }

    public void setProgress(double d) {
        onNavigationEvent();
        nativeSetProgress(d);
    }

    public int getWidth() {
        onNavigationEvent();
        return nativeGetWidth();
    }

    public void setWidth(int i) {
        onNavigationEvent();
        nativeSetWidth(i);
    }

    public int getOutlineWidth() {
        onNavigationEvent();
        return nativeGetOutlineWidth();
    }

    public void setOutlineWidth(int i) {
        onNavigationEvent();
        nativeSetOutlineWidth(i);
    }

    public int getColor() {
        onNavigationEvent();
        return nativeGetColor();
    }

    public void setColor(int i) {
        onNavigationEvent();
        nativeSetColor(i);
    }

    public int getOutlineColor() {
        onNavigationEvent();
        return nativeGetOutlineColor();
    }

    public void setOutlineColor(int i) {
        onNavigationEvent();
        nativeSetOutlineColor(i);
    }

    public int getPassedColor() {
        onNavigationEvent();
        return nativeGetPassedColor();
    }

    public void setPassedColor(int i) {
        onNavigationEvent();
        nativeSetPassedColor(i);
    }

    public int getPassedOutlineColor() {
        onNavigationEvent();
        return nativeGetPassedOutlineColor();
    }

    public void setPassedOutlineColor(int i) {
        onNavigationEvent();
        nativeSetPassedOutlineColor(i);
    }

    public OverlayImage getPatternImage() {
        onNavigationEvent();
        return this.onWarmupCompleted;
    }

    public void setPatternImage(@Nullable OverlayImage overlayImage) {
        onNavigationEvent();
        if (getContentPaddingLeft.IAuthTabCallback(this.onWarmupCompleted, overlayImage)) {
            return;
        }
        this.onWarmupCompleted = overlayImage;
        if (IAuthTabCallbackDefault()) {
            nativeSetPatternImage(overlayImage);
        }
    }

    public int getPatternInterval() {
        onNavigationEvent();
        return nativeGetPatternInterval();
    }

    public void setPatternInterval(int i) {
        onNavigationEvent();
        nativeSetPatternInterval(i);
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

    @Override // com.naver.maps.map.overlay.Overlay
    protected void onExtraCallbackWithResult(@NonNull NaverMap naverMap) {
        if (getCoords().size() < 2) {
            throw new IllegalStateException("coords.size() < 2");
        }
        super.onExtraCallbackWithResult(naverMap);
        nativeSetPatternImage(this.onWarmupCompleted);
    }

    @Override // com.naver.maps.map.overlay.Overlay
    protected void onExtraCallback(@NonNull NaverMap naverMap) {
        nativeSetPatternImage(null);
        super.onExtraCallback(naverMap);
    }
}
