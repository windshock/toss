package im.toss.rn.toss.core.observability;

import android.net.Uri;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import o.mergeParams;
import o.nSetPosition;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnTrackableScreenNameKt {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onNavigationEvent(@Nullable String str) {
        String path;
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), -846257502, iOnExtraCallbackWithResult2, 846257509, new Object[]{str});
        if (uri != null) {
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                uri.getPath();
                throw null;
            }
            path = uri.getPath();
            if (path == null) {
                path = "unknown_path";
                int i3 = onExtraCallback + 35;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        String str2 = String.format("RN(%s)", Arrays.copyOf(new Object[]{path}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}
