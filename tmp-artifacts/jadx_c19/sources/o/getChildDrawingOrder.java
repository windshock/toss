package o;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getChildDrawingOrder implements offsetPositionRecordsForRemove<MeteringRectangle> {
    protected static final addFocusables onExtraCallbackWithResult = addFocusables.onExtraCallback(getChildDrawingOrder.class.getSimpleName());
    private final boolean IAuthTabCallback;
    private final removeOnChildAttachStateChangeListener IAuthTabCallbackDefault;
    private final removeOnChildAttachStateChangeListener asBinder;
    private final CaptureRequest.Builder onExtraCallback;
    private final CameraCharacteristics onNavigationEvent;
    private final getChildPosition onWarmupCompleted;

    public getChildDrawingOrder(@NonNull getChildPosition getchildposition, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener2, boolean z, @NonNull CameraCharacteristics cameraCharacteristics, @NonNull CaptureRequest.Builder builder) {
        this.onWarmupCompleted = getchildposition;
        this.asBinder = removeonchildattachstatechangelistener;
        this.IAuthTabCallbackDefault = removeonchildattachstatechangelistener2;
        this.IAuthTabCallback = z;
        this.onNavigationEvent = cameraCharacteristics;
        this.onExtraCallback = builder;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public MeteringRectangle IAuthTabCallback(@NonNull RectF rectF, int i2) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new MeteringRectangle(rect, i2);
    }

    public PointF onExtraCallback(@NonNull PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerIAuthTabCallback = IAuthTabCallback(onExtraCallbackWithResult(onExtraCallback(onWarmupCompleted(onNavigationEvent(this.asBinder, pointF2), pointF2), pointF2), pointF2), pointF2);
        addFocusables addfocusables = onExtraCallbackWithResult;
        addfocusables.onExtraCallbackWithResult(new Object[]{"input:", pointF, "output (before clipping):", pointF2});
        if (pointF2.x < 0.0f) {
            pointF2.x = 0.0f;
        }
        if (pointF2.y < 0.0f) {
            pointF2.y = 0.0f;
        }
        if (pointF2.x > removeonchildattachstatechangelistenerIAuthTabCallback.onExtraCallback()) {
            pointF2.x = removeonchildattachstatechangelistenerIAuthTabCallback.onExtraCallback();
        }
        if (pointF2.y > removeonchildattachstatechangelistenerIAuthTabCallback.onExtraCallbackWithResult()) {
            pointF2.y = removeonchildattachstatechangelistenerIAuthTabCallback.onExtraCallbackWithResult();
        }
        addfocusables.onExtraCallbackWithResult(new Object[]{"input:", pointF, "output (after clipping):", pointF2});
        return pointF2;
    }

    private removeOnChildAttachStateChangeListener onNavigationEvent(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, @NonNull PointF pointF) {
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener2 = this.IAuthTabCallbackDefault;
        int iOnExtraCallback = removeonchildattachstatechangelistener.onExtraCallback();
        int iOnExtraCallbackWithResult = removeonchildattachstatechangelistener.onExtraCallbackWithResult();
        removeItemDecoration removeitemdecorationOnNavigationEvent = removeItemDecoration.onNavigationEvent(removeonchildattachstatechangelistener2);
        removeItemDecoration removeitemdecorationOnNavigationEvent2 = removeItemDecoration.onNavigationEvent(removeonchildattachstatechangelistener);
        if (this.IAuthTabCallback) {
            if (removeitemdecorationOnNavigationEvent.onWarmupCompleted() > removeitemdecorationOnNavigationEvent2.onWarmupCompleted()) {
                float fOnWarmupCompleted = removeitemdecorationOnNavigationEvent.onWarmupCompleted() / removeitemdecorationOnNavigationEvent2.onWarmupCompleted();
                pointF.x += (removeonchildattachstatechangelistener.onExtraCallback() * (fOnWarmupCompleted - 1.0f)) / 2.0f;
                iOnExtraCallback = Math.round(removeonchildattachstatechangelistener.onExtraCallback() * fOnWarmupCompleted);
            } else {
                float fOnWarmupCompleted2 = removeitemdecorationOnNavigationEvent2.onWarmupCompleted() / removeitemdecorationOnNavigationEvent.onWarmupCompleted();
                pointF.y += (removeonchildattachstatechangelistener.onExtraCallbackWithResult() * (fOnWarmupCompleted2 - 1.0f)) / 2.0f;
                iOnExtraCallbackWithResult = Math.round(removeonchildattachstatechangelistener.onExtraCallbackWithResult() * fOnWarmupCompleted2);
            }
        }
        return new removeOnChildAttachStateChangeListener(iOnExtraCallback, iOnExtraCallbackWithResult);
    }

    private removeOnChildAttachStateChangeListener onWarmupCompleted(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, @NonNull PointF pointF) {
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener2 = this.IAuthTabCallbackDefault;
        pointF.x *= removeonchildattachstatechangelistener2.onExtraCallback() / removeonchildattachstatechangelistener.onExtraCallback();
        pointF.y *= removeonchildattachstatechangelistener2.onExtraCallbackWithResult() / removeonchildattachstatechangelistener.onExtraCallbackWithResult();
        return removeonchildattachstatechangelistener2;
    }

    private removeOnChildAttachStateChangeListener onExtraCallback(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, @NonNull PointF pointF) {
        int iOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(com.otaliastudios.cameraview.engine.offset.Reference.SENSOR, com.otaliastudios.cameraview.engine.offset.Reference.VIEW, getChildViewHolder.ABSOLUTE);
        boolean z = iOnWarmupCompleted % 180 != 0;
        float f = pointF.x;
        float f2 = pointF.y;
        if (iOnWarmupCompleted == 0) {
            pointF.x = f;
            pointF.y = f2;
        } else if (iOnWarmupCompleted == 90) {
            pointF.x = f2;
            pointF.y = removeonchildattachstatechangelistener.onExtraCallback() - f;
        } else if (iOnWarmupCompleted == 180) {
            pointF.x = removeonchildattachstatechangelistener.onExtraCallback() - f;
            pointF.y = removeonchildattachstatechangelistener.onExtraCallbackWithResult() - f2;
        } else if (iOnWarmupCompleted == 270) {
            pointF.x = removeonchildattachstatechangelistener.onExtraCallbackWithResult() - f2;
            pointF.y = f;
        } else {
            throw new IllegalStateException("Unexpected angle " + iOnWarmupCompleted);
        }
        return z ? removeonchildattachstatechangelistener.onNavigationEvent() : removeonchildattachstatechangelistener;
    }

    private removeOnChildAttachStateChangeListener onExtraCallbackWithResult(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, @NonNull PointF pointF) {
        Rect rect = (Rect) this.onExtraCallback.get(CaptureRequest.SCALER_CROP_REGION);
        int iOnExtraCallback = rect == null ? removeonchildattachstatechangelistener.onExtraCallback() : rect.width();
        int iOnExtraCallbackWithResult = rect == null ? removeonchildattachstatechangelistener.onExtraCallbackWithResult() : rect.height();
        pointF.x += (iOnExtraCallback - removeonchildattachstatechangelistener.onExtraCallback()) / 2.0f;
        pointF.y += (iOnExtraCallbackWithResult - removeonchildattachstatechangelistener.onExtraCallbackWithResult()) / 2.0f;
        return new removeOnChildAttachStateChangeListener(iOnExtraCallback, iOnExtraCallbackWithResult);
    }

    private removeOnChildAttachStateChangeListener IAuthTabCallback(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, @NonNull PointF pointF) {
        Rect rect = (Rect) this.onExtraCallback.get(CaptureRequest.SCALER_CROP_REGION);
        pointF.x += rect == null ? 0.0f : rect.left;
        pointF.y += rect != null ? rect.top : 0.0f;
        Rect rect2 = (Rect) this.onNavigationEvent.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect2 == null) {
            rect2 = new Rect(0, 0, removeonchildattachstatechangelistener.onExtraCallback(), removeonchildattachstatechangelistener.onExtraCallbackWithResult());
        }
        return new removeOnChildAttachStateChangeListener(rect2.width(), rect2.height());
    }
}
