package com.naver.maps.map.overlay;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.geometry.LatLngBounds;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.internal.NaverMapAccessor;
import java.util.List;
import o.calculateTimeForScrolling;
import o.onAnchorReady;
import o.validateChildOrder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Overlay implements onAnchorReady {
    private static NaverMapAccessor naverMapAccessor;
    private long handle;
    private NaverMap onExtraCallback;
    private Object onExtraCallbackWithResult;
    private onNavigationEvent onWarmupCompleted;

    public interface onNavigationEvent {
        boolean onClick(@NonNull Overlay overlay);
    }

    protected abstract void IAuthTabCallback();

    protected native int nativeGetGlobalZIndex();

    protected native double nativeGetMaxZoom();

    protected native double nativeGetMinZoom();

    protected native int nativeGetZIndex();

    protected native boolean nativeIsMaxZoomInclusive();

    protected native boolean nativeIsMinZoomInclusive();

    protected native boolean nativeIsPickable();

    protected native boolean nativeIsVisible();

    protected native void nativeSetGlobalZIndex(int i);

    protected native void nativeSetMaxZoom(double d);

    protected native void nativeSetMaxZoomInclusive(boolean z);

    protected native void nativeSetMinZoom(double d);

    protected native void nativeSetMinZoomInclusive(boolean z);

    protected native void nativeSetPickable(boolean z);

    protected native void nativeSetVisible(boolean z);

    protected native void nativeSetZIndex(int i);

    protected abstract void onExtraCallbackWithResult();

    static {
        validateChildOrder.IAuthTabCallback();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.naver.maps.map.overlay.Overlay$IAuthTabCallback */
    protected static void onWarmupCompleted(@NonNull String str, @Nullable LatLng latLng) throws IAuthTabCallback {
        if (latLng == null || !latLng.onExtraCallback()) {
            throw new IAuthTabCallback(str, latLng);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.naver.maps.map.overlay.Overlay$onWarmupCompleted */
    protected static void onExtraCallback(@NonNull String str, @Nullable LatLngBounds latLngBounds) throws onWarmupCompleted {
        if (latLngBounds == null || latLngBounds.getInterfaceDescriptor()) {
            throw new onWarmupCompleted(str, latLngBounds);
        }
    }

    protected static double[] onNavigationEvent(@NonNull String str, @Nullable List<LatLng> list, int i) {
        return IAuthTabCallback(str, list, i, false);
    }

    protected static double[] IAuthTabCallback(@NonNull String str, @Nullable List<LatLng> list, int i, boolean z) throws IAuthTabCallback {
        if (list == null) {
            throw new IllegalArgumentException(str + " is null");
        }
        int size = list.size();
        if (size < i) {
            throw new IllegalArgumentException(str + ".size() < " + i);
        }
        if (z && !list.get(0).equals(list.get(size - 1))) {
            size++;
        }
        int i2 = size << 1;
        double[] dArr = new double[i2];
        int i3 = 0;
        for (LatLng latLng : list) {
            onWarmupCompleted(str + "[" + i3 + "]", latLng);
            dArr[i3] = latLng.latitude;
            dArr[i3 + 1] = latLng.longitude;
            i3 += 2;
        }
        if (i3 == i2 - 2) {
            dArr[i3] = dArr[0];
            dArr[i3 + 1] = dArr[1];
        }
        return dArr;
    }

    Overlay() {
        onExtraCallbackWithResult();
    }

    protected void finalize() throws Throwable {
        try {
            IAuthTabCallback();
        } finally {
            super.finalize();
        }
    }

    protected void onNavigationEvent() {
        NaverMap naverMap = this.onExtraCallback;
        if (naverMap != null) {
            calculateTimeForScrolling.IAuthTabCallback(naverMapAccessor.getThread(naverMap));
        }
    }

    public boolean IAuthTabCallbackDefault() {
        return this.onExtraCallback != null;
    }

    public NaverMap onTransact() {
        return this.onExtraCallback;
    }

    public void IAuthTabCallback(@Nullable NaverMap naverMap) {
        NaverMap naverMap2 = this.onExtraCallback;
        if (naverMap2 != naverMap) {
            NaverMapAccessor naverMapAccessor2 = naverMapAccessor;
            if (naverMap != null) {
                naverMap2 = naverMap;
            }
            calculateTimeForScrolling.IAuthTabCallback(naverMapAccessor2.getThread(naverMap2));
            NaverMap naverMap3 = this.onExtraCallback;
            if (naverMap3 != null) {
                onExtraCallback(naverMap3);
            }
            this.onExtraCallback = naverMap;
            if (naverMap != null) {
                onExtraCallbackWithResult(naverMap);
            }
        }
    }

    protected void onExtraCallbackWithResult(@NonNull NaverMap naverMap) {
        naverMapAccessor.addOverlay(naverMap, this, this.handle);
    }

    protected void onExtraCallback(@NonNull NaverMap naverMap) {
        naverMapAccessor.removeOverlay(naverMap, this, this.handle);
    }

    public boolean asInterface() {
        onNavigationEvent();
        onNavigationEvent onnavigationevent = this.onWarmupCompleted;
        if (onnavigationevent == null) {
            return false;
        }
        return onnavigationevent.onClick(this);
    }

    public void onExtraCallbackWithResult(@Nullable onNavigationEvent onnavigationevent) {
        onNavigationEvent();
        onNavigationEvent onnavigationevent2 = this.onWarmupCompleted;
        if (onnavigationevent2 == null && onnavigationevent != null) {
            nativeSetPickable(true);
        } else if (onnavigationevent2 != null && onnavigationevent == null) {
            nativeSetPickable(false);
        }
        this.onWarmupCompleted = onnavigationevent;
    }

    public Object getTag() {
        return this.onExtraCallbackWithResult;
    }

    public void setTag(@Nullable Object obj) {
        this.onExtraCallbackWithResult = obj;
    }

    public boolean isVisible() {
        onNavigationEvent();
        return nativeIsVisible();
    }

    public void setVisible(boolean z) {
        onNavigationEvent();
        nativeSetVisible(z);
    }

    public double getMinZoom() {
        onNavigationEvent();
        return nativeGetMinZoom();
    }

    public void setMinZoom(double d) {
        onNavigationEvent();
        nativeSetMinZoom(d);
    }

    public double getMaxZoom() {
        onNavigationEvent();
        return nativeGetMaxZoom();
    }

    public void setMaxZoom(double d) {
        onNavigationEvent();
        nativeSetMaxZoom(d);
    }

    public boolean isMinZoomInclusive() {
        onNavigationEvent();
        return nativeIsMinZoomInclusive();
    }

    public void setMinZoomInclusive(boolean z) {
        onNavigationEvent();
        nativeSetMinZoomInclusive(z);
    }

    public boolean isMaxZoomInclusive() {
        onNavigationEvent();
        return nativeIsMaxZoomInclusive();
    }

    public void setMaxZoomInclusive(boolean z) {
        onNavigationEvent();
        nativeSetMaxZoomInclusive(z);
    }

    public int getZIndex() {
        onNavigationEvent();
        return nativeGetZIndex();
    }

    public void setZIndex(int i) {
        onNavigationEvent();
        nativeSetZIndex(i);
    }

    public int getGlobalZIndex() {
        onNavigationEvent();
        return nativeGetGlobalZIndex();
    }

    public void setGlobalZIndex(int i) {
        onNavigationEvent();
        nativeSetGlobalZIndex(i);
    }
}
