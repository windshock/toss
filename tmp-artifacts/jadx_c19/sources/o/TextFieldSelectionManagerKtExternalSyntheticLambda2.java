package o;

import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession;
import com.google.android.exoplayer2.drm.WidevineUtil;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionManagerKtExternalSyntheticLambda2 {
    public static Pair<Long, Long> onExtraCallback(DrmSession drmSession) {
        Map<String, String> mapIAuthTabCallbackStub = drmSession.IAuthTabCallbackStub();
        if (mapIAuthTabCallbackStub == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(onWarmupCompleted(mapIAuthTabCallbackStub, WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING)), Long.valueOf(onWarmupCompleted(mapIAuthTabCallbackStub, WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING)));
    }

    private static long onWarmupCompleted(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }
}
