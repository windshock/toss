package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class isIncluded implements Savers_androidKtExternalSyntheticLambda5 {
    private static final Bitmap.Config onWarmupCompleted = Bitmap.Config.ARGB_8888;
    private int IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final onNavigationEvent IAuthTabCallback_Parcel;
    private final isSegmentInside asBinder;
    private int asInterface;
    private int onExtraCallback;
    private long onExtraCallbackWithResult;
    private final Set<Bitmap.Config> onNavigationEvent;
    private long onTransact;

    interface onNavigationEvent {
    }

    isIncluded(long j, isSegmentInside issegmentinside, Set<Bitmap.Config> set) {
        this.IAuthTabCallbackStub = j;
        this.onTransact = j;
        this.asBinder = issegmentinside;
        this.onNavigationEvent = set;
        this.IAuthTabCallback_Parcel = new onExtraCallbackWithResult();
    }

    public isIncluded(long j) {
        this(j, IAuthTabCallback(), onExtraCallbackWithResult());
    }

    public long onWarmupCompleted() {
        return this.onTransact;
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public void onWarmupCompleted(Bitmap bitmap) {
        synchronized (this) {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.asBinder.IAuthTabCallback(bitmap) <= this.onTransact && this.onNavigationEvent.contains(bitmap.getConfig())) {
                int iIAuthTabCallback = this.asBinder.IAuthTabCallback(bitmap);
                this.asBinder.onExtraCallbackWithResult(bitmap);
                this.IAuthTabCallbackDefault++;
                this.onExtraCallbackWithResult += iIAuthTabCallback;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.asBinder.onNavigationEvent(bitmap);
                }
                onNavigationEvent();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.asBinder.onNavigationEvent(bitmap);
                bitmap.isMutable();
                this.onNavigationEvent.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        }
    }

    private void onNavigationEvent() {
        onExtraCallback(this.onTransact);
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public Bitmap onNavigationEvent(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapOnExtraCallback = onExtraCallback(i2, i3, config);
        if (bitmapOnExtraCallback != null) {
            bitmapOnExtraCallback.eraseColor(0);
            return bitmapOnExtraCallback;
        }
        return onWarmupCompleted(i2, i3, config);
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public Bitmap onExtraCallbackWithResult(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapOnExtraCallback = onExtraCallback(i2, i3, config);
        return bitmapOnExtraCallback == null ? onWarmupCompleted(i2, i3, config) : bitmapOnExtraCallback;
    }

    private static Bitmap onWarmupCompleted(int i2, int i3, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = onWarmupCompleted;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    private static void onWarmupCompleted(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 26 || config != EncoderProfilesProxyCompatBaseImpl.onExtraCallback()) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private Bitmap onExtraCallback(int i2, int i3, @Nullable Bitmap.Config config) {
        Bitmap bitmapOnWarmupCompleted;
        synchronized (this) {
            onWarmupCompleted(config);
            bitmapOnWarmupCompleted = this.asBinder.onWarmupCompleted(i2, i3, config != null ? config : onWarmupCompleted);
            if (bitmapOnWarmupCompleted == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.asBinder.onNavigationEvent(i2, i3, config);
                }
                this.asInterface++;
            } else {
                this.onExtraCallback++;
                this.onExtraCallbackWithResult -= this.asBinder.IAuthTabCallback(bitmapOnWarmupCompleted);
                onExtraCallback(bitmapOnWarmupCompleted);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.asBinder.onNavigationEvent(i2, i3, config);
            }
        }
        return bitmapOnWarmupCompleted;
    }

    private static void onExtraCallback(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        onNavigationEvent(bitmap);
    }

    private static void onNavigationEvent(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public void onExtraCallback() {
        onExtraCallback(0L);
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda5
    public void onNavigationEvent(int i2) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i2 >= 40 || i2 >= 20) {
            onExtraCallback();
        } else if (i2 >= 20 || i2 == 15) {
            onExtraCallback(onWarmupCompleted() / 2);
        }
    }

    private void onExtraCallback(long j) {
        synchronized (this) {
            while (this.onExtraCallbackWithResult > j) {
                Bitmap bitmapIAuthTabCallback = this.asBinder.IAuthTabCallback();
                if (bitmapIAuthTabCallback == null) {
                    Log.isLoggable("LruBitmapPool", 5);
                    this.onExtraCallbackWithResult = 0L;
                    return;
                } else {
                    this.onExtraCallbackWithResult -= this.asBinder.IAuthTabCallback(bitmapIAuthTabCallback);
                    this.IAuthTabCallback++;
                    if (Log.isLoggable("LruBitmapPool", 3)) {
                        this.asBinder.onNavigationEvent(bitmapIAuthTabCallback);
                    }
                    bitmapIAuthTabCallback.recycle();
                }
            }
        }
    }

    private static isSegmentInside IAuthTabCallback() {
        return new TextInclusionStrategyCompanionExternalSyntheticLambda2();
    }

    private static Set<Bitmap.Config> onExtraCallbackWithResult() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i2 >= 26) {
            hashSet.remove(EncoderProfilesProxyCompatBaseImpl.onExtraCallback());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    static final class onExtraCallbackWithResult implements onNavigationEvent {
        onExtraCallbackWithResult() {
        }
    }
}
