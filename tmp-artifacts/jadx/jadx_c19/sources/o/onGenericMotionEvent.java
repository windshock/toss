package o;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.otaliastudios.cameraview.internal.RotationHelper;
import java.io.ByteArrayOutputStream;
import o.addRecyclerListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onGenericMotionEvent extends postAnimationRunner {
    private Camera IAuthTabCallback;
    private consumePendingUpdateOperations IAuthTabCallbackStub;
    private int asBinder;
    private removeItemDecoration asInterface;

    public onGenericMotionEvent(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, @NonNull consumePendingUpdateOperations consumependingupdateoperations, @NonNull Camera camera, @NonNull removeItemDecoration removeitemdecoration) {
        super(iAuthTabCallback, consumependingupdateoperations);
        this.IAuthTabCallbackStub = consumependingupdateoperations;
        this.IAuthTabCallback = camera;
        this.asInterface = removeitemdecoration;
        this.asBinder = camera.getParameters().getPreviewFormat();
    }

    public void onExtraCallbackWithResult() {
        this.IAuthTabCallback.setOneShotPreviewCallback(new Camera.PreviewCallback() { // from class: o.onGenericMotionEvent.5
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(@NonNull final byte[] bArr, Camera camera) {
                onGenericMotionEvent.this.onWarmupCompleted(false);
                onGenericMotionEvent ongenericmotionevent = onGenericMotionEvent.this;
                addRecyclerListener.IAuthTabCallback iAuthTabCallback = ((onSizeChanged) ongenericmotionevent).onNavigationEvent;
                final int i2 = iAuthTabCallback.asInterface;
                final removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = iAuthTabCallback.asBinder;
                final removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnWarmupCompleted = ongenericmotionevent.IAuthTabCallbackStub.onWarmupCompleted(com.otaliastudios.cameraview.engine.offset.Reference.SENSOR);
                if (removeonchildattachstatechangelistenerOnWarmupCompleted == null) {
                    throw new IllegalStateException("Preview stream size should never be null here.");
                }
                isNestedScrollingEnabled.onWarmupCompleted(new Runnable() { // from class: o.onGenericMotionEvent.5.4
                    @Override // java.lang.Runnable
                    public void run() {
                        YuvImage yuvImage = new YuvImage(RotationHelper.onExtraCallbackWithResult(bArr, removeonchildattachstatechangelistenerOnWarmupCompleted, i2), onGenericMotionEvent.this.asBinder, removeonchildattachstatechangelistener.onExtraCallback(), removeonchildattachstatechangelistener.onExtraCallbackWithResult(), null);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Rect rectOnWarmupCompleted = isAccessibilityEnabled.onWarmupCompleted(removeonchildattachstatechangelistener, onGenericMotionEvent.this.asInterface);
                        yuvImage.compressToJpeg(rectOnWarmupCompleted, 90, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        addRecyclerListener.IAuthTabCallback iAuthTabCallback2 = ((onSizeChanged) onGenericMotionEvent.this).onNavigationEvent;
                        iAuthTabCallback2.onNavigationEvent = byteArray;
                        iAuthTabCallback2.asBinder = new removeOnChildAttachStateChangeListener(rectOnWarmupCompleted.width(), rectOnWarmupCompleted.height());
                        onGenericMotionEvent ongenericmotionevent2 = onGenericMotionEvent.this;
                        ((onSizeChanged) ongenericmotionevent2).onNavigationEvent.asInterface = 0;
                        ongenericmotionevent2.onWarmupCompleted();
                    }
                });
                camera.setPreviewCallbackWithBuffer(null);
                camera.setPreviewCallbackWithBuffer(onGenericMotionEvent.this.IAuthTabCallbackStub);
                getMinFlingVelocity getminflingvelocityOnExtraCallback = onGenericMotionEvent.this.IAuthTabCallbackStub.onExtraCallback();
                int i3 = onGenericMotionEvent.this.asBinder;
                Object[] objArr = {onGenericMotionEvent.this.IAuthTabCallbackStub};
                getminflingvelocityOnExtraCallback.onExtraCallbackWithResult(i3, removeonchildattachstatechangelistenerOnWarmupCompleted, (getChildPosition) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, -532520477, lt.40.onExtraCallbackWithResult()));
            }
        });
    }

    protected void onWarmupCompleted() {
        this.IAuthTabCallbackStub = null;
        this.IAuthTabCallback = null;
        this.asInterface = null;
        this.asBinder = 0;
        super.onWarmupCompleted();
    }
}
