package o;

import android.text.TextUtils;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class NetworkTypeObserverListenerHolderExternalSyntheticLambda0 {
    private static NetworkTypeObserverListenerHolderExternalSyntheticLambda0 IAuthTabCallback;
    private static byte[] onExtraCallback = {6, 11, 8, -126};
    private long onNavigationEvent = -3569067770775878036L;
    private byte onExtraCallbackWithResult = -58;

    public static InputStream onNavigationEvent(InputStream inputStream) {
        if (IAuthTabCallback == null) {
            IAuthTabCallback = new NetworkTypeObserverListenerHolderExternalSyntheticLambda0();
        }
        return IAuthTabCallback.onExtraCallbackWithResult(inputStream);
    }

    private NetworkTypeObserverListenerHolderExternalSyntheticLambda0() {
    }

    private InputStream onExtraCallbackWithResult(InputStream inputStream) throws IOException {
        inputStream.mark(onExtraCallback.length + 1);
        byte[] bArr = onExtraCallback;
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (((byte) inputStream.read()) != bArr[i]) {
                inputStream.reset();
                inputStream.mark(onExtraCallback.length + 1);
                if (inputStream.skip(264L) != 264) {
                    inputStream.reset();
                    return inputStream;
                }
                for (byte b : onExtraCallback) {
                    if (inputStream.read() != (b & 255)) {
                        inputStream.reset();
                        return inputStream;
                    }
                }
            } else {
                i++;
            }
        }
        return onNavigationEvent(inputStream, inputStream.read());
    }

    private InputStream IAuthTabCallback(InputStream inputStream, int i, byte[] bArr, int i2) throws IOException {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        TracksExternalSyntheticLambda0.onExtraCallbackWithResult(bArr2, this.onExtraCallbackWithResult, this.onNavigationEvent);
        return new SimpleBasePlayerExternalSyntheticLambda64(inputStream, i, bArr2, SimpleBasePlayerExternalSyntheticLambda9.IAuthTabCallback(i2));
    }

    private InputStream onNavigationEvent(InputStream inputStream, int i) {
        return IAuthTabCallback(inputStream, 3 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new byte[]{-12, 4, 63, -85, -53, 79, -111, 84, -125, -77, -116, -77, 115, -71, 31, 1}, (-1813754311) - TextUtils.getOffsetBefore("", 0));
    }
}
