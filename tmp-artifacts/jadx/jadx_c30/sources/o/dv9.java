package o;

import java.io.Closeable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface dv9 extends Closeable {
    int IAuthTabCallback();

    void IAuthTabCallback(double d);

    void onExtraCallback(int i, int i2);

    void onExtraCallback(byte[] bArr);

    int onExtraCallbackWithResult();

    void onExtraCallbackWithResult(int i);

    void onExtraCallbackWithResult(String str);

    void onNavigationEvent(int i);

    void onNavigationEvent(long j);

    void onNavigationEvent(String str);

    void onNavigationEvent(byte[] bArr, int i, int i2);

    void onWarmupCompleted(int i);
}
