package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTVideoLandingPageActivity8 extends InputStream {
    private TTVideoLandingPageActivity5 IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private TTVideoLandingPageActivity5 IAuthTabCallbackStub;
    private TTVideoLandingPageActivity5 asBinder;
    private long asInterface;
    private long getInterfaceDescriptor;
    private TTVideoLandingPageActivity21 onExtraCallback;
    private final InputStream onExtraCallbackWithResult;
    private final TTVideoLandingPageActivity7 onNavigationEvent = new TTVideoLandingPageActivity7(32768);
    private final int onTransact;
    private final int onWarmupCompleted;

    public TTVideoLandingPageActivity8(int i, int i2, InputStream inputStream) {
        if (i != 4096 && i != 8192) {
            throw new IllegalArgumentException("The dictionary size must be 4096 or 8192");
        }
        if (i2 != 2 && i2 != 3) {
            throw new IllegalArgumentException("The number of trees must be 2 or 3");
        }
        this.onWarmupCompleted = i;
        this.onTransact = i2;
        this.IAuthTabCallbackDefault = i2;
        this.onExtraCallbackWithResult = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.onExtraCallbackWithResult.close();
    }

    private void onNavigationEvent() throws IOException {
        int iOnNavigationEvent;
        onExtraCallback();
        int iIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
        if (iIAuthTabCallback != -1) {
            if (iIAuthTabCallback == 1) {
                TTVideoLandingPageActivity5 tTVideoLandingPageActivity5 = this.IAuthTabCallbackStub;
                if (tTVideoLandingPageActivity5 != null) {
                    iOnNavigationEvent = tTVideoLandingPageActivity5.onNavigationEvent(this.onExtraCallback);
                } else {
                    iOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
                }
                if (iOnNavigationEvent != -1) {
                    this.onNavigationEvent.onWarmupCompleted(iOnNavigationEvent);
                    return;
                }
                return;
            }
            int i = this.onWarmupCompleted == 4096 ? 6 : 7;
            int iIAuthTabCallback2 = (int) this.onExtraCallback.IAuthTabCallback(i);
            int iOnNavigationEvent2 = this.IAuthTabCallback.onNavigationEvent(this.onExtraCallback);
            if (iOnNavigationEvent2 != -1 || iIAuthTabCallback2 > 0) {
                int iOnNavigationEvent3 = this.asBinder.onNavigationEvent(this.onExtraCallback);
                if (iOnNavigationEvent3 == 63) {
                    long jIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(8);
                    if (jIAuthTabCallback == -1) {
                        return;
                    } else {
                        iOnNavigationEvent3 = PAGNativeAdData.IAuthTabCallback(iOnNavigationEvent3, jIAuthTabCallback);
                    }
                }
                this.onNavigationEvent.onExtraCallback(((iOnNavigationEvent2 << i) | iIAuthTabCallback2) + 1, iOnNavigationEvent3 + this.IAuthTabCallbackDefault);
            }
        }
    }

    private void onExtraCallback() throws IOException {
        if (this.onExtraCallback == null) {
            PAGNativeAd1 pAGNativeAd1 = new PAGNativeAd1(new getAdLogoView(this.onExtraCallbackWithResult));
            try {
                if (this.onTransact == 3) {
                    this.IAuthTabCallbackStub = TTVideoLandingPageActivity5.onExtraCallbackWithResult(pAGNativeAd1, 256);
                }
                this.asBinder = TTVideoLandingPageActivity5.onExtraCallbackWithResult(pAGNativeAd1, 64);
                this.IAuthTabCallback = TTVideoLandingPageActivity5.onExtraCallbackWithResult(pAGNativeAd1, 64);
                this.asInterface += pAGNativeAd1.onExtraCallbackWithResult();
                pAGNativeAd1.close();
                this.onExtraCallback = new TTVideoLandingPageActivity21(this.onExtraCallbackWithResult);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        pAGNativeAd1.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.onNavigationEvent.onWarmupCompleted()) {
            try {
                onNavigationEvent();
            } catch (IllegalArgumentException e) {
                throw new IOException("bad IMPLODE stream", e);
            }
        }
        int iOnExtraCallback = this.onNavigationEvent.onExtraCallback();
        if (iOnExtraCallback >= 0) {
            this.getInterfaceDescriptor++;
        }
        return iOnExtraCallback;
    }
}
