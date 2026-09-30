package o;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda44 {
    public static boolean onExtraCallback(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }

    public static boolean onExtraCallback(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    private static boolean onExtraCallbackWithResult(Uri uri) {
        return uri.getPathSegments().contains(MediaDescription.MEDIA_TYPE_VIDEO);
    }

    public static boolean onWarmupCompleted(Uri uri) {
        return onExtraCallback(uri) && onExtraCallbackWithResult(uri);
    }

    public static boolean onNavigationEvent(Uri uri) {
        return onExtraCallback(uri) && !onExtraCallbackWithResult(uri);
    }
}
