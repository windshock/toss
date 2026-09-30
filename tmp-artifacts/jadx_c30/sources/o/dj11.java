package o;

import java.util.zip.ZipException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface dj11 {
    dj4 IAuthTabCallback();

    dj4 onExtraCallback();

    void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException;

    byte[] onExtraCallbackWithResult();

    dj4 onTransact();

    void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException;

    byte[] onWarmupCompleted();
}
