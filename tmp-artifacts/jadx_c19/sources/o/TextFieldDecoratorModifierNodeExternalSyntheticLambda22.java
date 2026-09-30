package o;

import android.media.MediaFormat;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;
import o.TextToolbarHelperApi28ExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda22 {
    private static boolean IAuthTabCallback(int i2) {
        return i2 == 1 || i2 == 3 || i2 == 6 || i2 == 7 || i2 == -1;
    }

    private static boolean onExtraCallback(int i2) {
        return i2 == 2 || i2 == 1 || i2 == 6 || i2 == -1;
    }

    private static boolean onNavigationEvent(int i2) {
        return i2 == 2 || i2 == 1 || i2 == -1;
    }

    public static void onNavigationEvent(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer("csd-" + i2, ByteBuffer.wrap(list.get(i2)));
        }
    }

    public static void onWarmupCompleted(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static void onExtraCallback(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void onExtraCallback(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void onNavigationEvent(MediaFormat mediaFormat, @Nullable TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1) {
        if (textToolbarHelperApi28ExternalSyntheticLambda1 != null) {
            onWarmupCompleted(mediaFormat, "color-transfer", textToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallbackStub);
            onWarmupCompleted(mediaFormat, "color-standard", textToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback);
            onWarmupCompleted(mediaFormat, "color-range", textToolbarHelperApi28ExternalSyntheticLambda1.onWarmupCompleted);
            onExtraCallback(mediaFormat, "hdr-static-info", textToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallbackDefault);
        }
    }

    public static TextToolbarHelperApi28ExternalSyntheticLambda1 IAuthTabCallback(MediaFormat mediaFormat) {
        int iOnExtraCallback = onExtraCallback(mediaFormat, "color-standard", -1);
        int iOnExtraCallback2 = onExtraCallback(mediaFormat, "color-range", -1);
        int iOnExtraCallback3 = onExtraCallback(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] bArrOnWarmupCompleted = byteBuffer != null ? onWarmupCompleted(byteBuffer) : null;
        if (!onExtraCallback(iOnExtraCallback)) {
            iOnExtraCallback = -1;
        }
        if (!onNavigationEvent(iOnExtraCallback2)) {
            iOnExtraCallback2 = -1;
        }
        if (!IAuthTabCallback(iOnExtraCallback3)) {
            iOnExtraCallback3 = -1;
        }
        if (iOnExtraCallback == -1 && iOnExtraCallback2 == -1 && iOnExtraCallback3 == -1 && bArrOnWarmupCompleted == null) {
            return null;
        }
        return new TextToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult().onExtraCallback(iOnExtraCallback).onNavigationEvent(iOnExtraCallback2).onExtraCallbackWithResult(iOnExtraCallback3).onWarmupCompleted(bArrOnWarmupCompleted).IAuthTabCallback();
    }

    public static int onExtraCallback(MediaFormat mediaFormat, String str, int i2) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i2;
    }

    public static byte[] onWarmupCompleted(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }
}
