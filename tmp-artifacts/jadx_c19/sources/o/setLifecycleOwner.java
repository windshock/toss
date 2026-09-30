package o;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setLifecycleOwner implements ImageDecoder.OnHeaderDecodedListener {
    private final int IAuthTabCallback;
    private final AbstractResolvableFuture IAuthTabCallbackDefault;
    private final SaversKtExternalSyntheticLambda2 onExtraCallback;
    private final releaseWaiters onExtraCallbackWithResult = releaseWaiters.onNavigationEvent();
    private final boolean onNavigationEvent;
    private final int onTransact;
    private final SaversKtExternalSyntheticLambda28 onWarmupCompleted;

    public setLifecycleOwner(int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        this.onTransact = i2;
        this.IAuthTabCallback = i3;
        this.onExtraCallback = (SaversKtExternalSyntheticLambda2) saversKtExternalSyntheticLambda30.IAuthTabCallback(Api33ImplExternalSyntheticLambda0.onExtraCallback);
        this.IAuthTabCallbackDefault = (AbstractResolvableFuture) saversKtExternalSyntheticLambda30.IAuthTabCallback(AbstractResolvableFuture.asBinder);
        SaversKtExternalSyntheticLambda3<Boolean> saversKtExternalSyntheticLambda3 = Api33ImplExternalSyntheticLambda0.onWarmupCompleted;
        this.onNavigationEvent = saversKtExternalSyntheticLambda30.IAuthTabCallback(saversKtExternalSyntheticLambda3) != null && ((Boolean) saversKtExternalSyntheticLambda30.IAuthTabCallback(saversKtExternalSyntheticLambda3)).booleanValue();
        this.onWarmupCompleted = (SaversKtExternalSyntheticLambda28) saversKtExternalSyntheticLambda30.IAuthTabCallback(Api33ImplExternalSyntheticLambda0.IAuthTabCallback);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        if (this.onExtraCallbackWithResult.IAuthTabCallback(this.onTransact, this.IAuthTabCallback, this.onNavigationEvent, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.onExtraCallback == SaversKtExternalSyntheticLambda2.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: o.setLifecycleOwner.2
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
                return false;
            }
        });
        Size size = imageInfo.getSize();
        int width = this.onTransact;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.IAuthTabCallback;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fOnExtraCallback = this.IAuthTabCallbackDefault.onExtraCallback(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fOnExtraCallback);
        int iRound2 = Math.round(size.getHeight() * fOnExtraCallback);
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        SaversKtExternalSyntheticLambda28 saversKtExternalSyntheticLambda28 = this.onWarmupCompleted;
        if (saversKtExternalSyntheticLambda28 != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((saversKtExternalSyntheticLambda28 == SaversKtExternalSyntheticLambda28.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? createDeviceContext.hY_() : writeUnsignedInt.hG_()));
            } else if (i2 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(writeUnsignedInt.hG_()));
            }
        }
    }
}
