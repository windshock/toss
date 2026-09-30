package o;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.navigation.ui.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.TypographyKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AppBarKtExternalSyntheticLambda24 implements TypographyKtExternalSyntheticLambda0.onExtraCallback {
    private write IAuthTabCallback;
    private ValueAnimator onExtraCallback;
    private final WeakReference<ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2> onExtraCallbackWithResult;
    private final AppBarKtExternalSyntheticLambda26 onNavigationEvent;
    private final Context onWarmupCompleted;

    protected abstract void onExtraCallback(@Nullable Drawable drawable, int i2);

    protected abstract void onExtraCallback(@Nullable CharSequence charSequence);

    public AppBarKtExternalSyntheticLambda24(@NotNull Context context, @NotNull AppBarKtExternalSyntheticLambda26 appBarKtExternalSyntheticLambda26) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appBarKtExternalSyntheticLambda26, "");
        this.onWarmupCompleted = context;
        this.onNavigationEvent = appBarKtExternalSyntheticLambda26;
        ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2OnExtraCallback = appBarKtExternalSyntheticLambda26.onExtraCallback();
        this.onExtraCallbackWithResult = receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2OnExtraCallback != null ? new WeakReference<>(receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2OnExtraCallback) : null;
    }

    public void onDestinationChanged(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, "");
        if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 instanceof TextFieldMeasurePolicyExternalSyntheticLambda4) {
            return;
        }
        WeakReference<ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2> weakReference = this.onExtraCallbackWithResult;
        ReceiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 = weakReference != null ? weakReference.get() : null;
        if (this.onExtraCallbackWithResult != null && receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 == null) {
            typographyKtExternalSyntheticLambda0.onNavigationEvent(this);
            return;
        }
        String strOnExtraCallbackWithResult = exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.onExtraCallbackWithResult(this.onWarmupCompleted, bundle);
        if (strOnExtraCallbackWithResult != null) {
            onExtraCallback(strOnExtraCallbackWithResult);
        }
        boolean zIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2);
        boolean z = false;
        if (receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 == null && zIAuthTabCallback) {
            onExtraCallback(null, 0);
            return;
        }
        if (receiveContentDragAndDropNode_androidKtReceiveContentDragAndDropNode2 != null && zIAuthTabCallback) {
            z = true;
        }
        onNavigationEvent(z);
    }

    private final void onNavigationEvent(boolean z) {
        Pair pairIAuthTabCallback;
        int i2;
        write writeVar = this.IAuthTabCallback;
        if (writeVar == null || (pairIAuthTabCallback = getWrite.IAuthTabCallback(writeVar, Boolean.TRUE)) == null) {
            write writeVar2 = new write(this.onWarmupCompleted);
            this.IAuthTabCallback = writeVar2;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(writeVar2, Boolean.FALSE);
        }
        write writeVar3 = (write) pairIAuthTabCallback.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) pairIAuthTabCallback.IAuthTabCallback()).booleanValue();
        if (z) {
            i2 = R.string.nav_app_bar_open_drawer_description;
        } else {
            i2 = R.string.nav_app_bar_navigate_up_description;
        }
        onExtraCallback(writeVar3, i2);
        float f = z ? 0.0f : 1.0f;
        if (zBooleanValue) {
            float fOnNavigationEvent = writeVar3.onNavigationEvent();
            ValueAnimator valueAnimator = this.onExtraCallback;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(writeVar3, "progress", fOnNavigationEvent, f);
            this.onExtraCallback = objectAnimatorOfFloat;
            Intrinsics.checkNotNull(objectAnimatorOfFloat, "");
            objectAnimatorOfFloat.start();
            return;
        }
        writeVar3.setProgress(f);
    }
}
