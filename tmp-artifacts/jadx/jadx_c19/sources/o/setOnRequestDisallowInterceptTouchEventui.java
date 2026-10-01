package o;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setOnRequestDisallowInterceptTouchEventui implements ResourceEncoder<Bitmap> {
    public static final SaversKtExternalSyntheticLambda3<Integer> onExtraCallbackWithResult = SaversKtExternalSyntheticLambda3.onWarmupCompleted("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final SaversKtExternalSyntheticLambda3<Bitmap.CompressFormat> onNavigationEvent = SaversKtExternalSyntheticLambda3.IAuthTabCallback("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final Savers_androidKtExternalSyntheticLambda6 onExtraCallback;

    public setOnRequestDisallowInterceptTouchEventui(@NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this.onExtraCallback = savers_androidKtExternalSyntheticLambda6;
    }

    @Deprecated
    public setOnRequestDisallowInterceptTouchEventui() {
        this.onExtraCallback = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    @Override // o.SaversKtExternalSyntheticLambda24
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallback(@NonNull Resource<Bitmap> resource, @NonNull File file, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws Throwable {
        OutputStream fileOutputStream;
        boolean z;
        Bitmap bitmapIAuthTabCallback = resource.IAuthTabCallback();
        Bitmap.CompressFormat compressFormatOnWarmupCompleted = onWarmupCompleted(bitmapIAuthTabCallback, saversKtExternalSyntheticLambda30);
        bitmapIAuthTabCallback.getWidth();
        bitmapIAuthTabCallback.getHeight();
        long jIAuthTabCallback = getSharedValues.IAuthTabCallback();
        int iIntValue = ((Integer) saversKtExternalSyntheticLambda30.IAuthTabCallback(onExtraCallbackWithResult)).intValue();
        OutputStream saversKtExternalSyntheticLambda34 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
            fileOutputStream = saversKtExternalSyntheticLambda34;
        } catch (Throwable th) {
            th = th;
            fileOutputStream = saversKtExternalSyntheticLambda34;
        }
        try {
            saversKtExternalSyntheticLambda34 = this.onExtraCallback != null ? new SaversKtExternalSyntheticLambda34(fileOutputStream, this.onExtraCallback) : fileOutputStream;
            bitmapIAuthTabCallback.compress(compressFormatOnWarmupCompleted, iIntValue, saversKtExternalSyntheticLambda34);
            saversKtExternalSyntheticLambda34.close();
            try {
                saversKtExternalSyntheticLambda34.close();
            } catch (IOException unused2) {
            }
            z = true;
        } catch (IOException unused3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            z = false;
            if (Log.isLoggable("BitmapEncoder", 2)) {
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormatOnWarmupCompleted);
            applyConstraintsFromLayoutParams.onWarmupCompleted(bitmapIAuthTabCallback);
            getSharedValues.onWarmupCompleted(jIAuthTabCallback);
            Objects.toString(saversKtExternalSyntheticLambda30.IAuthTabCallback(onNavigationEvent));
            bitmapIAuthTabCallback.hasAlpha();
        }
        return z;
    }

    private Bitmap.CompressFormat onWarmupCompleted(Bitmap bitmap, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) saversKtExternalSyntheticLambda30.IAuthTabCallback(onNavigationEvent);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public SaversKtExternalSyntheticLambda23 IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return SaversKtExternalSyntheticLambda23.TRANSFORMED;
    }
}
