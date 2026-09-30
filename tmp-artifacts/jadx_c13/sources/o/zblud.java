package o;

import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class zblud {
    private long IAuthTabCallbackStub;
    private String onExtraCallback;
    private String onWarmupCompleted;
    private int onExtraCallbackWithResult = -1;
    private int onTransact = 255;
    private int IAuthTabCallback = Imgcodecs.IMWRITE_AVIF_QUALITY;
    private int onNavigationEvent = 0;

    public void onExtraCallback(String str) {
        this.onWarmupCompleted = str;
    }

    public void onExtraCallback(int i) {
        if (i < -1 || i > 9) {
            throw new IllegalArgumentException("Invalid gzip compression level: " + i);
        }
        this.onExtraCallbackWithResult = i;
    }

    public void onNavigationEvent(String str) {
        this.onExtraCallback = str;
    }

    public void onNavigationEvent(long j) {
        this.IAuthTabCallbackStub = j;
    }

    public void onNavigationEvent(int i) {
        this.onTransact = i;
    }
}
