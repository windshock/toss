package o;

import io.fincube.creditcard.DetectionInfo;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PageJsBridgeReadyListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final String IAuthTabCallback(@NotNull DetectionInfo detectionInfo, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(detectionInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(detectionInfo.expiry_month)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        int i2 = detectionInfo.expiry_year;
        if (i2 > 2000) {
            int i3 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i2 -= 2000;
        }
        String str3 = str2 + str + i2;
        int i5 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return str3;
    }

    public static final CharSequence onWarmupCompleted(@NotNull DetectionInfo detectionInfo) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(detectionInfo, "");
        StringBuffer cardNumber = detectionInfo.getCardNumber();
        Intrinsics.checkNotNullExpressionValue(cardNumber, "");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < cardNumber.length()) {
            int i3 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                CharsKt.IAuthTabCallback(cardNumber.charAt(i2));
                throw null;
            }
            char cCharAt = cardNumber.charAt(i2);
            if (!CharsKt.IAuthTabCallback(cCharAt)) {
                sb.append(cCharAt);
                int i4 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            i2++;
            int i6 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        return sb;
    }
}
