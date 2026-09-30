package o;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getChildItemId implements offsetPositionRecordsForRemove<Camera.Area> {
    protected static final addFocusables onExtraCallbackWithResult = addFocusables.onExtraCallback(getChildItemId.class.getSimpleName());
    private final int IAuthTabCallback;
    private final removeOnChildAttachStateChangeListener onExtraCallback;

    public getChildItemId(@NonNull getChildPosition getchildposition, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
        this.IAuthTabCallback = -getchildposition.onWarmupCompleted(com.otaliastudios.cameraview.engine.offset.Reference.SENSOR, com.otaliastudios.cameraview.engine.offset.Reference.VIEW, getChildViewHolder.ABSOLUTE);
        this.onExtraCallback = removeonchildattachstatechangelistener;
    }

    public PointF onExtraCallback(@NonNull PointF pointF) {
        PointF pointF2 = new PointF();
        pointF2.x = ((pointF.x / this.onExtraCallback.onExtraCallback()) * 2000.0f) - 1000.0f;
        pointF2.y = ((pointF.y / this.onExtraCallback.onExtraCallbackWithResult()) * 2000.0f) - 1000.0f;
        PointF pointF3 = new PointF();
        double d = (this.IAuthTabCallback * 3.141592653589793d) / 180.0d;
        pointF3.x = (float) ((pointF2.x * Math.cos(d)) - (pointF2.y * Math.sin(d)));
        pointF3.y = (float) ((pointF2.x * Math.sin(d)) + (pointF2.y * Math.cos(d)));
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"scaled:", pointF2, "rotated:", pointF3});
        return pointF3;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Camera.Area IAuthTabCallback(@NonNull RectF rectF, int i2) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new Camera.Area(rect, i2);
    }
}
