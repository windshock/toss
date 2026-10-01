package im.toss.core.webkit.bridge.image;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import im.toss.core.R;
import im.toss.core.R$layout;
import im.toss.core.webkit.bridge.image.LoadImagesDialog$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.M_;
import o.r8lambdaYN2sJNglMasTWVNShwkasqH6K1o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoadImagesDialog extends r8lambdaYN2sJNglMasTWVNShwkasqH6K1o {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final IAuthTabCallback onNavigationEvent;

    public interface IAuthTabCallback {
        void onExtraCallbackWithResult(@NotNull onWarmupCompleted onwarmupcompleted);
    }

    public static /* synthetic */ void onExtraCallback(LoadImagesDialog loadImagesDialog, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(loadImagesDialog, view);
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(LoadImagesDialog loadImagesDialog, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(loadImagesDialog, view);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadImagesDialog(@NotNull Context context, @NotNull IAuthTabCallback iAuthTabCallback) {
        super(context, 0, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onNavigationEvent = iAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r12
      0x0033: PHI (r12v4 android.view.Window) = (r12v3 android.view.Window), (r12v10 android.view.Window) binds: [B:8:0x0031, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(@Nullable Bundle bundle) {
        Window window;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super/*android.app.Dialog*/.onCreate(bundle);
            requestWindowFeature(0);
            setContentView(R$layout.dialog_load_images);
            window = getWindow();
            if (window != null) {
                int i3 = onExtraCallbackWithResult + 95;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                M_ m_ = M_.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(window.getContext(), "");
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                window.setLayout((int) (((Integer) M_.onNavigationEvent(-2118175014, new Object[]{m_, r2}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2)).intValue() * 0.9d), -2);
                int i5 = onWarmupCompleted + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            super/*android.app.Dialog*/.onCreate(bundle);
            requestWindowFeature(1);
            setContentView(R$layout.dialog_load_images);
            window = getWindow();
            if (window != null) {
            }
        }
        onNavigationEvent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback(LoadImagesDialog loadImagesDialog, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            loadImagesDialog.onNavigationEvent.onExtraCallbackWithResult(onWarmupCompleted.GALLERY);
            loadImagesDialog.dismiss();
        } else {
            loadImagesDialog.onNavigationEvent.onExtraCallbackWithResult(onWarmupCompleted.GALLERY);
            loadImagesDialog.dismiss();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent() {
        int i = 2 % 2;
        findViewById(R.id.dialogProfilePhotoPickerGallery).setOnClickListener(new LoadImagesDialog$.ExternalSyntheticLambda0(this));
        findViewById(R.id.dialogProfilePhotoPickerCamera).setOnClickListener(new LoadImagesDialog$.ExternalSyntheticLambda1(this));
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(LoadImagesDialog loadImagesDialog, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loadImagesDialog.onNavigationEvent.onExtraCallbackWithResult(onWarmupCompleted.CAMERA);
        loadImagesDialog.dismiss();
        int i4 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
