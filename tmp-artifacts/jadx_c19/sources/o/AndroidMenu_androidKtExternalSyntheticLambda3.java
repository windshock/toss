package o;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.google.common.base.Supplier;
import java.io.IOException;
import o.AndroidMenu_androidKtExternalSyntheticLambda2;
import o.AndroidMenu_androidKtExternalSyntheticLambda4;
import o.BackdropScaffoldKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidMenu_androidKtExternalSyntheticLambda3 implements AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback {
    private final Context IAuthTabCallback;
    private final Supplier<HandlerThread> IAuthTabCallbackDefault;
    private boolean onExtraCallback;
    private final Supplier<HandlerThread> onExtraCallbackWithResult;
    private int onWarmupCompleted;

    @Deprecated
    public AndroidMenu_androidKtExternalSyntheticLambda3() {
        this.onWarmupCompleted = 0;
        this.onExtraCallback = false;
        this.IAuthTabCallback = null;
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallbackDefault = null;
    }

    public AndroidMenu_androidKtExternalSyntheticLambda3(Context context) {
        this(context, null, null);
    }

    public AndroidMenu_androidKtExternalSyntheticLambda3(Context context, @Nullable Supplier<HandlerThread> supplier, @Nullable Supplier<HandlerThread> supplier2) {
        this.IAuthTabCallback = context;
        this.onWarmupCompleted = 0;
        this.onExtraCallback = false;
        this.onExtraCallbackWithResult = supplier;
        this.IAuthTabCallbackDefault = supplier2;
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback
    public AndroidMenu_androidKtExternalSyntheticLambda4 onExtraCallback(AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted) throws IOException {
        AndroidMenu_androidKtExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback;
        Supplier<HandlerThread> supplier;
        int i2 = this.onWarmupCompleted;
        if (i2 == 1 || (i2 == 0 && onExtraCallback())) {
            int iOnExtraCallback = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(onwarmupcompleted.onExtraCallbackWithResult.isEngagementSignalsApiAvailable);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onTransact(iOnExtraCallback));
            Supplier<HandlerThread> supplier2 = this.onExtraCallbackWithResult;
            if (supplier2 != null && (supplier = this.IAuthTabCallbackDefault) != null) {
                iAuthTabCallback = new AndroidMenu_androidKtExternalSyntheticLambda2.IAuthTabCallback(supplier2, supplier);
            } else {
                iAuthTabCallback = new AndroidMenu_androidKtExternalSyntheticLambda2.IAuthTabCallback(iOnExtraCallback);
            }
            iAuthTabCallback.onNavigationEvent(this.onExtraCallback);
            return iAuthTabCallback.onExtraCallback(onwarmupcompleted);
        }
        return new BackdropScaffoldKtExternalSyntheticLambda0.onNavigationEvent().onExtraCallback(onwarmupcompleted);
    }

    private boolean onExtraCallback() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return true;
        }
        Context context = this.IAuthTabCallback;
        return context != null && i2 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}
