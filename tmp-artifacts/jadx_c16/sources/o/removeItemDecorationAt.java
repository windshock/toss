package o;

import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.R$styleable;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class removeItemDecorationAt {
    private removeOnItemTouchListener onNavigationEvent;
    private removeOnItemTouchListener onWarmupCompleted;

    public removeItemDecorationAt(@NonNull TypedArray typedArray) {
        removeOnItemTouchListener removeonitemtouchlistenerIAuthTabCallback;
        removeOnItemTouchListener removeonitemtouchlistenerIAuthTabCallback2;
        ArrayList arrayList = new ArrayList(3);
        int i = R$styleable.CameraView_cameraPictureSizeMinWidth;
        if (typedArray.hasValue(i)) {
            arrayList.add(removeRecyclerListener.onTransact(typedArray.getInteger(i, 0)));
        }
        int i2 = R$styleable.CameraView_cameraPictureSizeMaxWidth;
        if (typedArray.hasValue(i2)) {
            arrayList.add(removeRecyclerListener.onWarmupCompleted(typedArray.getInteger(i2, 0)));
        }
        int i3 = R$styleable.CameraView_cameraPictureSizeMinHeight;
        if (typedArray.hasValue(i3)) {
            arrayList.add(removeRecyclerListener.onExtraCallback(typedArray.getInteger(i3, 0)));
        }
        int i4 = R$styleable.CameraView_cameraPictureSizeMaxHeight;
        if (typedArray.hasValue(i4)) {
            arrayList.add(removeRecyclerListener.onNavigationEvent(typedArray.getInteger(i4, 0)));
        }
        int i5 = R$styleable.CameraView_cameraPictureSizeMinArea;
        if (typedArray.hasValue(i5)) {
            arrayList.add(removeRecyclerListener.onExtraCallbackWithResult(typedArray.getInteger(i5, 0)));
        }
        int i6 = R$styleable.CameraView_cameraPictureSizeMaxArea;
        if (typedArray.hasValue(i6)) {
            arrayList.add(removeRecyclerListener.IAuthTabCallback(typedArray.getInteger(i6, 0)));
        }
        int i7 = R$styleable.CameraView_cameraPictureSizeAspectRatio;
        if (typedArray.hasValue(i7)) {
            arrayList.add(removeRecyclerListener.onWarmupCompleted(removeItemDecoration.onExtraCallbackWithResult(typedArray.getString(i7)), 0.0f));
        }
        if (typedArray.getBoolean(R$styleable.CameraView_cameraPictureSizeSmallest, false)) {
            arrayList.add(removeRecyclerListener.onExtraCallbackWithResult());
        }
        if (typedArray.getBoolean(R$styleable.CameraView_cameraPictureSizeBiggest, false)) {
            arrayList.add(removeRecyclerListener.IAuthTabCallback());
        }
        if (!arrayList.isEmpty()) {
            removeonitemtouchlistenerIAuthTabCallback = removeRecyclerListener.IAuthTabCallback((removeOnItemTouchListener[]) arrayList.toArray(new removeOnItemTouchListener[0]));
        } else {
            removeonitemtouchlistenerIAuthTabCallback = removeRecyclerListener.IAuthTabCallback();
        }
        this.onWarmupCompleted = removeonitemtouchlistenerIAuthTabCallback;
        ArrayList arrayList2 = new ArrayList(3);
        int i8 = R$styleable.CameraView_cameraVideoSizeMinWidth;
        if (typedArray.hasValue(i8)) {
            arrayList2.add(removeRecyclerListener.onTransact(typedArray.getInteger(i8, 0)));
        }
        int i9 = R$styleable.CameraView_cameraVideoSizeMaxWidth;
        if (typedArray.hasValue(i9)) {
            arrayList2.add(removeRecyclerListener.onWarmupCompleted(typedArray.getInteger(i9, 0)));
        }
        int i10 = R$styleable.CameraView_cameraVideoSizeMinHeight;
        if (typedArray.hasValue(i10)) {
            arrayList2.add(removeRecyclerListener.onExtraCallback(typedArray.getInteger(i10, 0)));
        }
        int i11 = R$styleable.CameraView_cameraVideoSizeMaxHeight;
        if (typedArray.hasValue(i11)) {
            arrayList2.add(removeRecyclerListener.onNavigationEvent(typedArray.getInteger(i11, 0)));
        }
        int i12 = R$styleable.CameraView_cameraVideoSizeMinArea;
        if (typedArray.hasValue(i12)) {
            arrayList2.add(removeRecyclerListener.onExtraCallbackWithResult(typedArray.getInteger(i12, 0)));
        }
        int i13 = R$styleable.CameraView_cameraVideoSizeMaxArea;
        if (typedArray.hasValue(i13)) {
            arrayList2.add(removeRecyclerListener.IAuthTabCallback(typedArray.getInteger(i13, 0)));
        }
        int i14 = R$styleable.CameraView_cameraVideoSizeAspectRatio;
        if (typedArray.hasValue(i14)) {
            arrayList2.add(removeRecyclerListener.onWarmupCompleted(removeItemDecoration.onExtraCallbackWithResult(typedArray.getString(i14)), 0.0f));
        }
        if (typedArray.getBoolean(R$styleable.CameraView_cameraVideoSizeSmallest, false)) {
            arrayList2.add(removeRecyclerListener.onExtraCallbackWithResult());
        }
        if (typedArray.getBoolean(R$styleable.CameraView_cameraVideoSizeBiggest, false)) {
            arrayList2.add(removeRecyclerListener.IAuthTabCallback());
        }
        if (!arrayList2.isEmpty()) {
            removeonitemtouchlistenerIAuthTabCallback2 = removeRecyclerListener.IAuthTabCallback((removeOnItemTouchListener[]) arrayList2.toArray(new removeOnItemTouchListener[0]));
        } else {
            removeonitemtouchlistenerIAuthTabCallback2 = removeRecyclerListener.IAuthTabCallback();
        }
        this.onNavigationEvent = removeonitemtouchlistenerIAuthTabCallback2;
    }

    public removeOnItemTouchListener onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public removeOnItemTouchListener onExtraCallback() {
        return this.onNavigationEvent;
    }
}
