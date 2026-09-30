package o;

import java.text.DateFormat;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setCampaign {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Date onWarmupCompleted(@Nullable DateFormat dateFormat, @Nullable String str) {
        Date dateM31constructorimpl;
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            int i4 = 66 / 0;
            if (str != null) {
                int i5 = i3 + 107;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Result.Companion companion = Result.Companion;
                    dateM31constructorimpl = Result.m31constructorimpl(dateFormat != null ? dateFormat.parse(str) : null);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    dateM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
                }
                date = Result.onExtraCallback(dateM31constructorimpl) ? null : dateM31constructorimpl;
                int i7 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 3;
                }
            }
        } else if (str != null) {
        }
        return date;
    }
}
