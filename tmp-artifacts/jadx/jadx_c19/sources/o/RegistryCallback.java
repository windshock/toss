package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import o.SaversKtExternalSyntheticLambda15;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RegistryCallback implements ResourceDecoder<ByteBuffer, TransitionExternalSyntheticLambda6> {
    private static final onExtraCallback IAuthTabCallback = new onExtraCallback();
    private static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
    private final List<ImageHeaderParser> asInterface;
    private final onWarmupCompleted onExtraCallback;
    private final Context onNavigationEvent;
    private final Registry onTransact;
    private final onExtraCallback onWarmupCompleted;

    public RegistryCallback(Context context, List<ImageHeaderParser> list, Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this(context, list, savers_androidKtExternalSyntheticLambda5, savers_androidKtExternalSyntheticLambda6, onExtraCallbackWithResult, IAuthTabCallback);
    }

    RegistryCallback(Context context, List<ImageHeaderParser> list, Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6, onWarmupCompleted onwarmupcompleted, onExtraCallback onextracallback) {
        this.onNavigationEvent = context.getApplicationContext();
        this.asInterface = list;
        this.onWarmupCompleted = onextracallback;
        this.onTransact = new Registry(savers_androidKtExternalSyntheticLambda5, savers_androidKtExternalSyntheticLambda6);
        this.onExtraCallback = onwarmupcompleted;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull ByteBuffer byteBuffer, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return !((Boolean) saversKtExternalSyntheticLambda30.IAuthTabCallback(Flow.onWarmupCompleted)).booleanValue() && SaversKtExternalSyntheticLambda22.IAuthTabCallback(this.asInterface, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Rectangle onNavigationEvent(@NonNull ByteBuffer byteBuffer, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        SaversKtExternalSyntheticLambda18 saversKtExternalSyntheticLambda18OnExtraCallback = this.onExtraCallback.onExtraCallback(byteBuffer);
        try {
            return onWarmupCompleted(byteBuffer, i2, i3, saversKtExternalSyntheticLambda18OnExtraCallback, saversKtExternalSyntheticLambda30);
        } finally {
            this.onExtraCallback.onWarmupCompleted(saversKtExternalSyntheticLambda18OnExtraCallback);
        }
    }

    private Rectangle onWarmupCompleted(ByteBuffer byteBuffer, int i2, int i3, SaversKtExternalSyntheticLambda18 saversKtExternalSyntheticLambda18, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        StringBuilder sb;
        long jIAuthTabCallback = getSharedValues.IAuthTabCallback();
        try {
            SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20OnNavigationEvent = saversKtExternalSyntheticLambda18.onNavigationEvent();
            if (saversKtExternalSyntheticLambda20OnNavigationEvent.onExtraCallbackWithResult() > 0 && saversKtExternalSyntheticLambda20OnNavigationEvent.onNavigationEvent() == 0) {
                Bitmap.Config config = saversKtExternalSyntheticLambda30.IAuthTabCallback(Flow.onExtraCallback) == SaversKtExternalSyntheticLambda2.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                SaversKtExternalSyntheticLambda15 saversKtExternalSyntheticLambda15OnExtraCallback = this.onWarmupCompleted.onExtraCallback(this.onTransact, saversKtExternalSyntheticLambda20OnNavigationEvent, byteBuffer, onExtraCallback(saversKtExternalSyntheticLambda20OnNavigationEvent, i2, i3));
                saversKtExternalSyntheticLambda15OnExtraCallback.onExtraCallbackWithResult(config);
                saversKtExternalSyntheticLambda15OnExtraCallback.onExtraCallback();
                Bitmap bitmapAsBinder = saversKtExternalSyntheticLambda15OnExtraCallback.asBinder();
                if (bitmapAsBinder != null) {
                    return new Rectangle(new TransitionExternalSyntheticLambda6(this.onNavigationEvent, saversKtExternalSyntheticLambda15OnExtraCallback, AndroidViewHolder.onWarmupCompleted(), i2, i3, bitmapAsBinder));
                }
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    sb = new StringBuilder();
                    sb.append("Decoded GIF from stream in ");
                    sb.append(getSharedValues.onWarmupCompleted(jIAuthTabCallback));
                }
            } else if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder();
                sb.append("Decoded GIF from stream in ");
                sb.append(getSharedValues.onWarmupCompleted(jIAuthTabCallback));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                getSharedValues.onWarmupCompleted(jIAuthTabCallback);
            }
        }
    }

    private static int onExtraCallback(SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20, int i2, int i3) {
        int iMin = Math.min(saversKtExternalSyntheticLambda20.IAuthTabCallback() / i3, saversKtExternalSyntheticLambda20.onWarmupCompleted() / i2);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            saversKtExternalSyntheticLambda20.onWarmupCompleted();
            saversKtExternalSyntheticLambda20.IAuthTabCallback();
        }
        return iMax;
    }

    static class onExtraCallback {
        onExtraCallback() {
        }

        SaversKtExternalSyntheticLambda15 onExtraCallback(SaversKtExternalSyntheticLambda15.onNavigationEvent onnavigationevent, SaversKtExternalSyntheticLambda20 saversKtExternalSyntheticLambda20, ByteBuffer byteBuffer, int i2) {
            return new SaversKtExternalSyntheticLambda19(onnavigationevent, saversKtExternalSyntheticLambda20, byteBuffer, i2);
        }
    }

    static class onWarmupCompleted {
        private final Queue<SaversKtExternalSyntheticLambda18> onNavigationEvent = applyConstraintsFromLayoutParams.onWarmupCompleted(0);

        onWarmupCompleted() {
        }

        SaversKtExternalSyntheticLambda18 onExtraCallback(ByteBuffer byteBuffer) {
            SaversKtExternalSyntheticLambda18 saversKtExternalSyntheticLambda18OnExtraCallbackWithResult;
            synchronized (this) {
                SaversKtExternalSyntheticLambda18 saversKtExternalSyntheticLambda18Poll = this.onNavigationEvent.poll();
                if (saversKtExternalSyntheticLambda18Poll == null) {
                    saversKtExternalSyntheticLambda18Poll = new SaversKtExternalSyntheticLambda18();
                }
                saversKtExternalSyntheticLambda18OnExtraCallbackWithResult = saversKtExternalSyntheticLambda18Poll.onExtraCallbackWithResult(byteBuffer);
            }
            return saversKtExternalSyntheticLambda18OnExtraCallbackWithResult;
        }

        void onWarmupCompleted(SaversKtExternalSyntheticLambda18 saversKtExternalSyntheticLambda18) {
            synchronized (this) {
                saversKtExternalSyntheticLambda18.onExtraCallbackWithResult();
                this.onNavigationEvent.offer(saversKtExternalSyntheticLambda18);
            }
        }
    }
}
