package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class shouldAbsorb$4 implements Runnable {
    final /* synthetic */ int IAuthTabCallback;
    final /* synthetic */ byte[] IAuthTabCallbackDefault;
    final /* synthetic */ BitmapFactory.Options onExtraCallback;
    final /* synthetic */ setDebugAssertionsEnabled onExtraCallbackWithResult;
    final /* synthetic */ int onNavigationEvent;
    final /* synthetic */ Handler onTransact;
    final /* synthetic */ int onWarmupCompleted;

    shouldAbsorb$4(byte[] bArr, int i2, int i3, BitmapFactory.Options options, int i4, Handler handler, setDebugAssertionsEnabled setdebugassertionsenabled) {
        this.IAuthTabCallbackDefault = bArr;
        this.IAuthTabCallback = i2;
        this.onWarmupCompleted = i3;
        this.onExtraCallback = options;
        this.onNavigationEvent = i4;
        this.onTransact = handler;
        this.onExtraCallbackWithResult = setdebugassertionsenabled;
    }

    @Override // java.lang.Runnable
    public void run() {
        final Bitmap bitmapOnWarmupCompleted = shouldAbsorb.onWarmupCompleted(this.IAuthTabCallbackDefault, this.IAuthTabCallback, this.onWarmupCompleted, this.onExtraCallback, this.onNavigationEvent);
        this.onTransact.post(new Runnable() { // from class: o.shouldAbsorb$4.1
            @Override // java.lang.Runnable
            public void run() {
                shouldAbsorb$4.this.onExtraCallbackWithResult.onBitmapReady(bitmapOnWarmupCompleted);
            }
        });
    }
}
