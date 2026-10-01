package com.naver.maps.map;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.map.renderer.vulkan.VulkanSurfaceView;
import o.getReverseLayout;
import o.isAutoMeasureEnabled;
import o.scrollToPositionWithOffset;
import o.setInitialPrefetchItemCount;
import o.setSmoothScrollbarEnabled;
import o.shouldMeasureTwice;
import o.validateChildOrder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class MapView extends FrameLayout {
    private setInitialPrefetchItemCount IAuthTabCallback;
    private scrollToPositionWithOffset onExtraCallbackWithResult;
    private setSmoothScrollbarEnabled onNavigationEvent;
    private shouldMeasureTwice onWarmupCompleted;

    public MapView(@NonNull Context context) {
        super(context);
        onNavigationEvent(context, isAutoMeasureEnabled.onNavigationEvent(context, null));
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        onNavigationEvent(context, isAutoMeasureEnabled.onNavigationEvent(context, attributeSet));
    }

    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onNavigationEvent(context, isAutoMeasureEnabled.onNavigationEvent(context, attributeSet));
    }

    public MapView(@NonNull Context context, @Nullable isAutoMeasureEnabled isautomeasureenabled) {
        super(context);
        onNavigationEvent(context, isautomeasureenabled == null ? isAutoMeasureEnabled.onNavigationEvent(context, null) : isautomeasureenabled);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onNavigationEvent(@NonNull Context context, @NonNull isAutoMeasureEnabled isautomeasureenabled) {
        VulkanSurfaceView vulkanSurfaceView;
        2 r9;
        2 r3;
        if (isInEditMode()) {
            return;
        }
        validateChildOrder.onExtraCallback(context);
        View.inflate(context, R.layout.navermap_map_view, this);
        setContentDescription(context.getString(R.string.navermap_map));
        setWillNotDraw(false);
        if (isautomeasureenabled.onWarmupCompleted()) {
            vulkanSurfaceView = new VulkanSurfaceView(getContext());
            r9 = new 2(this, getContext(), vulkanSurfaceView, isautomeasureenabled.IAuthTabCallback(), isautomeasureenabled.IAuthTabCallbackStub(), isautomeasureenabled.IAuthTabCallbackDefault(), isautomeasureenabled.validateRelationship());
            if (!r9.asInterface()) {
                vulkanSurfaceView = null;
                r9 = null;
            }
        }
        if (r9 != null) {
            r3 = r9;
        } else if (isautomeasureenabled.warmup()) {
            VulkanSurfaceView textureView = new TextureView(getContext());
            vulkanSurfaceView = textureView;
            r3 = new 5(this, getContext(), textureView, isautomeasureenabled.IAuthTabCallback(), isautomeasureenabled.IAuthTabCallbackStub(), isautomeasureenabled.IAuthTabCallbackDefault(), isautomeasureenabled.postMessage(), isautomeasureenabled.ICustomTabsServiceStub());
        } else {
            VulkanSurfaceView vulkanSurfaceView2 = new 3(this, getContext(), isautomeasureenabled);
            vulkanSurfaceView = vulkanSurfaceView2;
            r3 = new 1(this, getContext(), vulkanSurfaceView2, isautomeasureenabled.IAuthTabCallback(), isautomeasureenabled.IAuthTabCallbackStub(), isautomeasureenabled.IAuthTabCallbackDefault(), isautomeasureenabled.postMessage(), isautomeasureenabled.validateRelationship(), isautomeasureenabled.requestPostMessageChannel(), vulkanSurfaceView2);
        }
        addView((View) vulkanSurfaceView, 0);
        final MapControlsView mapControlsViewFindViewById = findViewById(R.id.navermap_map_controls);
        this.onNavigationEvent = new setSmoothScrollbarEnabled(context, isautomeasureenabled, r3, mapControlsViewFindViewById, new getReverseLayout() { // from class: com.naver.maps.map.MapView.4
            @Override // o.getReverseLayout
            public void onMapReady(@NonNull NaverMap naverMap) {
                MapView.this.onWarmupCompleted = new shouldMeasureTwice(naverMap);
                MapView.this.onExtraCallbackWithResult = new scrollToPositionWithOffset(naverMap);
                MapView.this.IAuthTabCallback = new setInitialPrefetchItemCount(naverMap);
                mapControlsViewFindViewById.IAuthTabCallback(naverMap);
            }
        });
    }

    public void IAuthTabCallback(@Nullable Bundle bundle) {
        setBackgroundColor(0);
        this.onNavigationEvent.onNavigationEvent(bundle);
    }

    public void onNavigationEvent() {
        this.onNavigationEvent.onNavigationEvent();
    }

    public void onExtraCallbackWithResult() {
        this.onNavigationEvent.onExtraCallback();
    }

    public void onWarmupCompleted() {
        if (this.onNavigationEvent.IAuthTabCallback() != null) {
            setBackgroundColor(this.onNavigationEvent.IAuthTabCallback().asBinder());
        }
        this.onNavigationEvent.IAuthTabCallbackStub();
    }

    public void onExtraCallbackWithResult(@NonNull Bundle bundle) {
        this.onNavigationEvent.IAuthTabCallback(bundle);
    }

    public void IAuthTabCallback() {
        this.onNavigationEvent.asBinder();
    }

    public void onNavigationEvent(@Nullable getReverseLayout getreverselayout) {
        this.onNavigationEvent.onWarmupCompleted(getreverselayout);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (isInEditMode()) {
            return;
        }
        this.onNavigationEvent.onNavigationEvent(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        shouldMeasureTwice shouldmeasuretwice = this.onWarmupCompleted;
        return (shouldmeasuretwice != null && shouldmeasuretwice.onTransact(motionEvent)) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        setInitialPrefetchItemCount setinitialprefetchitemcount = this.IAuthTabCallback;
        return (setinitialprefetchitemcount != null && setinitialprefetchitemcount.onNavigationEvent(i, keyEvent)) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        setInitialPrefetchItemCount setinitialprefetchitemcount = this.IAuthTabCallback;
        return (setinitialprefetchitemcount != null && setinitialprefetchitemcount.onExtraCallback(i, keyEvent)) || super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        setInitialPrefetchItemCount setinitialprefetchitemcount = this.IAuthTabCallback;
        return (setinitialprefetchitemcount != null && setinitialprefetchitemcount.onExtraCallbackWithResult(i, keyEvent)) || super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        setInitialPrefetchItemCount setinitialprefetchitemcount = this.IAuthTabCallback;
        return (setinitialprefetchitemcount != null && setinitialprefetchitemcount.onExtraCallback(motionEvent)) || super.onTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        scrollToPositionWithOffset scrolltopositionwithoffset = this.onExtraCallbackWithResult;
        return (scrolltopositionwithoffset != null && scrolltopositionwithoffset.onExtraCallback(motionEvent)) || super.onGenericMotionEvent(motionEvent);
    }
}
