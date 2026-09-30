package com.naver.maps.map.overlay;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.geometry.LatLngBounds;
import com.naver.maps.map.NaverMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PolygonOverlay extends Overlay {
    private List<List<LatLng>> onExtraCallback;
    private List<LatLng> onExtraCallbackWithResult;

    private native void nativeCreate();

    private native void nativeDestroy();

    private native LatLngBounds nativeGetBounds();

    private native int nativeGetColor();

    private native int nativeGetOutlineColor();

    private native int[] nativeGetOutlinePattern();

    private native int nativeGetOutlineWidth();

    private native void nativeSetColor(int i);

    private native void nativeSetCoords(double[] dArr);

    private native void nativeSetHoles(Object[] objArr);

    private native void nativeSetOutlineColor(int i);

    private native void nativeSetOutlinePattern(int[] iArr);

    private native void nativeSetOutlineWidth(int i);

    public PolygonOverlay() {
        List list = Collections.EMPTY_LIST;
        this.onExtraCallbackWithResult = list;
        this.onExtraCallback = list;
    }

    public PolygonOverlay(@NonNull List<LatLng> list) {
        List list2 = Collections.EMPTY_LIST;
        this.onExtraCallbackWithResult = list2;
        this.onExtraCallback = list2;
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
        return this.onExtraCallbackWithResult;
    }

    public void setCoords(@NonNull List<LatLng> list) {
        onNavigationEvent();
        nativeSetCoords(Overlay.IAuthTabCallback("coords", list, 3, true));
        this.onExtraCallbackWithResult = list;
    }

    public List<List<LatLng>> getHoles() {
        onNavigationEvent();
        return this.onExtraCallback;
    }

    public void setHoles(@NonNull List<List<LatLng>> list) {
        onNavigationEvent();
        double[][] dArr = new double[list.size()][];
        Iterator<List<LatLng>> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr[i] = Overlay.IAuthTabCallback("holes[" + i + "]", it.next(), 3, true);
            i++;
        }
        nativeSetHoles(dArr);
        this.onExtraCallback = list;
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

    public int[] getOutlinePattern() {
        onNavigationEvent();
        return nativeGetOutlinePattern();
    }

    public void setOutlinePattern(int... iArr) {
        onNavigationEvent();
        nativeSetOutlinePattern(iArr);
    }

    @Override // com.naver.maps.map.overlay.Overlay
    protected void onExtraCallbackWithResult(@NonNull NaverMap naverMap) {
        if (getCoords().size() < 3) {
            throw new IllegalStateException("coords.size() < 3");
        }
        super.onExtraCallbackWithResult(naverMap);
    }
}
