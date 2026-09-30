package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class getResolvedLayoutParams$onExtraCallbackWithResult implements Callable<String> {
    private WeakReference<View> onWarmupCompleted;

    getResolvedLayoutParams$onExtraCallbackWithResult(View view) {
        this.onWarmupCompleted = new WeakReference<>(view);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public String call() {
        View view = this.onWarmupCompleted.get();
        if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
            return "";
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
        view.draw(new Canvas(bitmapCreateBitmap));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }
}
