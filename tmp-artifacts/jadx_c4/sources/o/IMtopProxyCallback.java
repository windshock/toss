package o;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IMtopProxyCallback {
    public static final onWarmupCompleted Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 43;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final TextRoundCornerProgressBarSavedState1 IAuthTabCallback(@NotNull Context context, @NotNull getProgressColor getprogresscolor, @NotNull getMax getmax) {
            String strIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(getprogresscolor, "");
                Intrinsics.checkNotNullParameter(getmax, "");
                strIAuthTabCallback = EstimateFaceQualityFromBGRImage.IAuthTabCallback(EstimateFaceQualityFromBGRImage.IAuthTabCallback, "banks", true, 4, (Object) null);
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(getprogresscolor, "");
                Intrinsics.checkNotNullParameter(getmax, "");
                strIAuthTabCallback = EstimateFaceQualityFromBGRImage.IAuthTabCallback(EstimateFaceQualityFromBGRImage.IAuthTabCallback, "banks", false, 2, (Object) null);
            }
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback(context, strIAuthTabCallback, getprogresscolor, getmax, null, null, null, 112, null);
            int i3 = onWarmupCompleted + 59;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return textRoundCornerProgressBarSavedState1OnExtraCallback;
            }
            throw null;
        }
    }
}
