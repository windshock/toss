package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.lud.dy;
import com.bytedance.sdk.component.lud.ea;
import com.bytedance.sdk.openadsdk.oty.sya;
import java.lang.ref.WeakReference;
import o.CompositionLocalKtExternalSyntheticLambda0;
import o.CompositionLocalKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class av implements dy {
    private final WeakReference<ImageView> ycx;

    public av(ImageView imageView) {
        this.ycx = new WeakReference<>(imageView);
    }

    public void ycx(ea eaVar) {
        ImageView imageView = this.ycx.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objZb = eaVar.zb();
            if (objZb instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objZb);
                return;
            }
            if (objZb instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(objZb)) {
                    CompositionLocalKtExternalSyntheticLambda3.pG_(objZb).start();
                }
                imageView.setImageDrawable((Drawable) objZb);
                return;
            }
            imageView.setVisibility(8);
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "aO8rkCqxaMCFZthciDKhJFfsLJYI", "VOAegAC/bNST", 45);
            imageView.setVisibility(8);
        }
    }

    public void ycx(int i2, String str, @Nullable Throwable th) {
        ImageView imageView = this.ycx.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
