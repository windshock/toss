package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.Resource;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class executeListener {
    private static final Savers_androidKtExternalSyntheticLambda5 onWarmupCompleted = new Savers_androidKtExternalSyntheticLambda3() { // from class: o.executeListener.5
        @Override // o.Savers_androidKtExternalSyntheticLambda3, o.Savers_androidKtExternalSyntheticLambda5
        public void onWarmupCompleted(Bitmap bitmap) {
        }
    };

    public static Resource<Bitmap> onExtraCallbackWithResult(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, Drawable drawable, int i2, int i3) {
        Bitmap bitmapOnExtraCallback;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapOnExtraCallback = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapOnExtraCallback = null;
        } else {
            bitmapOnExtraCallback = onExtraCallback(savers_androidKtExternalSyntheticLambda5, current, i2, i3);
            z = true;
        }
        if (!z) {
            savers_androidKtExternalSyntheticLambda5 = onWarmupCompleted;
        }
        return setUpdateBlock.onWarmupCompleted(bitmapOnExtraCallback, savers_androidKtExternalSyntheticLambda5);
    }

    private static Bitmap onExtraCallback(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, Drawable drawable, int i2, int i3) {
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Objects.toString(drawable);
            }
            return null;
        }
        if (i3 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Objects.toString(drawable);
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        Lock lockOnWarmupCompleted = maybePropagateCancellationTo.onWarmupCompleted();
        lockOnWarmupCompleted.lock();
        Bitmap bitmapOnNavigationEvent = savers_androidKtExternalSyntheticLambda5.onNavigationEvent(i2, i3, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapOnNavigationEvent);
            drawable.setBounds(0, 0, i2, i3);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapOnNavigationEvent;
        } finally {
            lockOnWarmupCompleted.unlock();
        }
    }
}
