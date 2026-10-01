package com.otaliastudios.cameraview;

import android.content.Context;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.otaliastudios.cameraview.engine.offset.Reference;
import java.util.Iterator;
import o.absorbGlows;
import o.addFocusables;
import o.addOnChildAttachStateChangeListener;
import o.addOnChildAttachStateChangeListener$onWarmupCompleted;
import o.addRecyclerListener;
import o.dispatchChildDetached$onExtraCallbackWithResult;
import o.getOnFlingListener;
import o.getRecycledViewPool;
import o.hasNestedScrollingParent;
import o.initFastScroller$onWarmupCompleted;
import o.jumpToPositionForSmoothScroller;
import o.removeOnChildAttachStateChangeListener;
import o.stopGlowAnimations;
import o.stopScrollersInternal;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class CameraView$IAuthTabCallback implements dispatchChildDetached$onExtraCallbackWithResult, jumpToPositionForSmoothScroller.onExtraCallbackWithResult, initFastScroller$onWarmupCompleted {
    final /* synthetic */ CameraView onExtraCallback;
    private final addFocusables onExtraCallbackWithResult;
    private final String onNavigationEvent;

    CameraView$IAuthTabCallback(CameraView cameraView) {
        this.onExtraCallback = cameraView;
        String simpleName = CameraView$IAuthTabCallback.class.getSimpleName();
        this.onNavigationEvent = simpleName;
        this.onExtraCallbackWithResult = addFocusables.onExtraCallback(simpleName);
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult, o.initFastScroller$onWarmupCompleted
    public Context onExtraCallback() {
        return this.onExtraCallback.getContext();
    }

    @Override // o.initFastScroller$onWarmupCompleted
    public int asInterface() {
        return this.onExtraCallback.getWidth();
    }

    @Override // o.initFastScroller$onWarmupCompleted
    public int onNavigationEvent() {
        return this.onExtraCallback.getHeight();
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void onExtraCallback(@NonNull final stopGlowAnimations stopglowanimations) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnCameraOpened", stopglowanimations});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.3
            @Override // java.lang.Runnable
            public void run() {
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void onWarmupCompleted() {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnCameraClosed"});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.6
            @Override // java.lang.Runnable
            public void run() {
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void IAuthTabCallbackStub() {
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnWarmupCompleted = CameraView.onExtraCallback(this.onExtraCallback).onWarmupCompleted(Reference.VIEW);
        if (removeonchildattachstatechangelistenerOnWarmupCompleted == null) {
            throw new RuntimeException("Preview stream size should not be null here.");
        }
        if (removeonchildattachstatechangelistenerOnWarmupCompleted.equals(CameraView.onWarmupCompleted(this.onExtraCallback))) {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"onCameraPreviewStreamSizeChanged:", "swallowing because the preview size has not changed.", removeonchildattachstatechangelistenerOnWarmupCompleted});
        } else {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"onCameraPreviewStreamSizeChanged: posting a requestLayout call.", "Preview stream size:", removeonchildattachstatechangelistenerOnWarmupCompleted});
            CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.9
                @Override // java.lang.Runnable
                public void run() {
                    CameraView$IAuthTabCallback.this.onExtraCallback.requestLayout();
                }
            });
        }
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void onNavigationEvent(boolean z) {
        if (z && CameraView.IAuthTabCallback(this.onExtraCallback)) {
            CameraView.IAuthTabCallback(this.onExtraCallback, 0);
        }
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.7
            @Override // java.lang.Runnable
            public void run() {
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void onNavigationEvent(@NonNull final addRecyclerListener.IAuthTabCallback iAuthTabCallback) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnPictureTaken", iAuthTabCallback});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.15
            @Override // java.lang.Runnable
            public void run() {
                addRecyclerListener addrecyclerlistener = new addRecyclerListener(iAuthTabCallback);
                Iterator it = CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback.iterator();
                while (it.hasNext()) {
                    ((absorbGlows) it.next()).onExtraCallback(addrecyclerlistener);
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void onExtraCallbackWithResult(@NonNull final addOnChildAttachStateChangeListener$onWarmupCompleted addonchildattachstatechangelistener_onwarmupcompleted) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnVideoTaken", addonchildattachstatechangelistener_onwarmupcompleted});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.13
            @Override // java.lang.Runnable
            public void run() {
                new addOnChildAttachStateChangeListener(addonchildattachstatechangelistener_onwarmupcompleted);
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void IAuthTabCallback(@Nullable final hasNestedScrollingParent hasnestedscrollingparent, @NonNull final PointF pointF) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnFocusStart", hasnestedscrollingparent, pointF});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.12
            @Override // java.lang.Runnable
            public void run() {
                CameraView$IAuthTabCallback.this.onExtraCallback.onNavigationEvent.IAuthTabCallback(1, new PointF[]{pointF});
                if (CameraView.onTransact(CameraView$IAuthTabCallback.this.onExtraCallback) != null) {
                    CameraView.onTransact(CameraView$IAuthTabCallback.this.onExtraCallback);
                }
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void IAuthTabCallback(@Nullable final hasNestedScrollingParent hasnestedscrollingparent, final boolean z, @NonNull final PointF pointF) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnFocusEnd", hasnestedscrollingparent, Boolean.valueOf(z), pointF});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.14
            @Override // java.lang.Runnable
            public void run() {
                if (z && CameraView.IAuthTabCallback(CameraView$IAuthTabCallback.this.onExtraCallback)) {
                    CameraView.IAuthTabCallback(CameraView$IAuthTabCallback.this.onExtraCallback, 1);
                }
                if (CameraView.onTransact(CameraView$IAuthTabCallback.this.onExtraCallback) != null) {
                    CameraView.onTransact(CameraView$IAuthTabCallback.this.onExtraCallback);
                }
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.jumpToPositionForSmoothScroller.onExtraCallbackWithResult
    public void onNavigationEvent(int i) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"onDeviceOrientationChanged", Integer.valueOf(i)});
        int iOnNavigationEvent = CameraView.IAuthTabCallbackStub(this.onExtraCallback).onNavigationEvent();
        if (!CameraView.asBinder(this.onExtraCallback)) {
            CameraView.onExtraCallback(this.onExtraCallback).ICustomTabsCallback().IAuthTabCallback((360 - iOnNavigationEvent) % 360);
        } else {
            CameraView.onExtraCallback(this.onExtraCallback).ICustomTabsCallback().IAuthTabCallback(i);
        }
        final int i2 = (i + iOnNavigationEvent) % 360;
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.11
            @Override // java.lang.Runnable
            public void run() {
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.jumpToPositionForSmoothScroller.onExtraCallbackWithResult
    public void onTransact() {
        if (this.onExtraCallback.IAuthTabCallbackStub()) {
            this.onExtraCallbackWithResult.onWarmupCompleted(new Object[]{"onDisplayOffsetChanged", "restarting the camera."});
            this.onExtraCallback.close();
            this.onExtraCallback.open();
        }
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void onNavigationEvent(final float f, @Nullable final PointF[] pointFArr) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnZoomChanged", Float.valueOf(f)});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.5
            @Override // java.lang.Runnable
            public void run() {
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void IAuthTabCallback(final float f, @NonNull final float[] fArr, @Nullable final PointF[] pointFArr) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnExposureCorrectionChanged", Float.valueOf(f)});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.1
            @Override // java.lang.Runnable
            public void run() {
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void IAuthTabCallback(@NonNull final getOnFlingListener getonflinglistener) {
        this.onExtraCallbackWithResult.onExtraCallback(new Object[]{"dispatchFrame:", Long.valueOf(getonflinglistener.onWarmupCompleted()), "processors:", Integer.valueOf(this.onExtraCallback.onExtraCallbackWithResult.size())});
        if (this.onExtraCallback.onExtraCallbackWithResult.isEmpty()) {
            getonflinglistener.onNavigationEvent();
        } else {
            CameraView.onExtraCallbackWithResult(this.onExtraCallback).execute(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.2
                @Override // java.lang.Runnable
                public void run() {
                    CameraView$IAuthTabCallback.this.onExtraCallbackWithResult.onExtraCallback(new Object[]{"dispatchFrame: executing. Passing", Long.valueOf(getonflinglistener.onWarmupCompleted()), "to processors."});
                    for (getRecycledViewPool getrecycledviewpool : CameraView$IAuthTabCallback.this.onExtraCallback.onExtraCallbackWithResult) {
                    }
                    getonflinglistener.onNavigationEvent();
                }
            });
        }
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void IAuthTabCallback(final stopScrollersInternal stopscrollersinternal) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchError", stopscrollersinternal});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback.iterator();
                while (it.hasNext()) {
                    ((absorbGlows) it.next()).IAuthTabCallback(stopscrollersinternal);
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void onExtraCallbackWithResult() {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnVideoRecordingStart"});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.8
            @Override // java.lang.Runnable
            public void run() {
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }

    @Override // o.dispatchChildDetached$onExtraCallbackWithResult
    public void IAuthTabCallback() {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"dispatchOnVideoRecordingEnd"});
        CameraView.onNavigationEvent(this.onExtraCallback).post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraView$IAuthTabCallback.10
            @Override // java.lang.Runnable
            public void run() {
                for (absorbGlows absorbglows : CameraView$IAuthTabCallback.this.onExtraCallback.IAuthTabCallback) {
                }
            }
        });
    }
}
