package com.naver.maps.map.overlay;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.geometry.LatLngBounds;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.overlay.Overlay;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CircleOverlay extends Overlay {
    private native void nativeCreate();

    private native void nativeDestroy();

    private native LatLngBounds nativeGetBounds();

    private native LatLng nativeGetCenter();

    private native int nativeGetColor();

    private native int nativeGetOutlineColor();

    private native int nativeGetOutlineWidth();

    private native double nativeGetRadius();

    private native void nativeSetCenter(double d, double d2);

    private native void nativeSetColor(int i);

    private native void nativeSetOutlineColor(int i);

    private native void nativeSetOutlineWidth(int i);

    private native void nativeSetRadius(double d);

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

    public LatLng getCenter() {
        onNavigationEvent();
        return nativeGetCenter();
    }

    public void setCenter(@NonNull LatLng latLng) throws Overlay.IAuthTabCallback {
        onNavigationEvent();
        Overlay.onWarmupCompleted("center", latLng);
        nativeSetCenter(latLng.latitude, latLng.longitude);
    }

    public double getRadius() {
        onNavigationEvent();
        return nativeGetRadius();
    }

    public void setRadius(double d) {
        onNavigationEvent();
        nativeSetRadius(d);
    }

    public int getColor() {
        onNavigationEvent();
        return nativeGetColor();
    }

    public void setColor(int i) {
        onNavigationEvent();
        nativeSetColor(i);
    }

    public int getOutlineWidth() {
        onNavigationEvent();
        return nativeGetOutlineWidth();
    }

    public void setOutlineWidth(int i) {
        onNavigationEvent();
        nativeSetOutlineWidth(i);
    }

    public int getOutlineColor() {
        onNavigationEvent();
        return nativeGetOutlineColor();
    }

    public void setOutlineColor(int i) {
        onNavigationEvent();
        nativeSetOutlineColor(i);
    }

    @Override // com.naver.maps.map.overlay.Overlay
    protected void onExtraCallbackWithResult(@NonNull NaverMap naverMap) throws Overlay.IAuthTabCallback {
        Overlay.onWarmupCompleted("center", getCenter());
        super.onExtraCallbackWithResult(naverMap);
    }
}
