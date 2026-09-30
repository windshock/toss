package com.naver.maps.map.overlay;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.geometry.LatLngBounds;
import com.naver.maps.map.NaverMap;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PolylineOverlay extends Overlay {
    private List<LatLng> onExtraCallback = Collections.EMPTY_LIST;

    public enum onExtraCallbackWithResult {
        Round,
        Butt,
        Square
    }

    public enum onWarmupCompleted {
        Miter,
        Bevel,
        Round
    }

    private native void nativeCreate();

    private native void nativeDestroy();

    private native LatLngBounds nativeGetBounds();

    private native int nativeGetCapType();

    private native int nativeGetColor();

    private native int nativeGetJoinType();

    private native int[] nativeGetPattern();

    private native int nativeGetWidth();

    private native void nativeSetCapType(int i);

    private native void nativeSetColor(int i);

    private native void nativeSetCoords(double[] dArr);

    private native void nativeSetJoinType(int i);

    private native void nativeSetPattern(int[] iArr);

    private native void nativeSetWidth(int i);

    public PolylineOverlay() {
    }

    public PolylineOverlay(@NonNull List<LatLng> list) {
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
        return this.onExtraCallback;
    }

    public void setCoords(@NonNull List<LatLng> list) {
        onNavigationEvent();
        nativeSetCoords(Overlay.onNavigationEvent("coords", list, 2));
        this.onExtraCallback = list;
    }

    public LatLngBounds getBounds() {
        onNavigationEvent();
        return nativeGetBounds();
    }

    public int getWidth() {
        onNavigationEvent();
        return nativeGetWidth();
    }

    public void setWidth(int i) {
        onNavigationEvent();
        nativeSetWidth(i);
    }

    public int getColor() {
        onNavigationEvent();
        return nativeGetColor();
    }

    public void setColor(int i) {
        onNavigationEvent();
        nativeSetColor(i);
    }

    public int[] getPattern() {
        onNavigationEvent();
        return nativeGetPattern();
    }

    public void setPattern(int... iArr) {
        onNavigationEvent();
        nativeSetPattern(iArr);
    }

    public onExtraCallbackWithResult getCapType() {
        onNavigationEvent();
        return onExtraCallbackWithResult.values()[nativeGetCapType()];
    }

    public void setCapType(onExtraCallbackWithResult onextracallbackwithresult) {
        onNavigationEvent();
        nativeSetCapType(onextracallbackwithresult.ordinal());
    }

    public onWarmupCompleted getJoinType() {
        onNavigationEvent();
        return onWarmupCompleted.values()[nativeGetJoinType()];
    }

    public void setJoinType(onWarmupCompleted onwarmupcompleted) {
        onNavigationEvent();
        nativeSetJoinType(onwarmupcompleted.ordinal());
    }
}
