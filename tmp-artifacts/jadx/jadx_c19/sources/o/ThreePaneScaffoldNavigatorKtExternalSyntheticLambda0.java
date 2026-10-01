package o;

import android.content.Intent;
import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.exceptions.ApduException;
import com.krc.pl_card.exceptions.EpTagException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0 extends CarouselKtExternalSyntheticLambda1 {
    public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted(null);

    public static final class onWarmupCompleted {
        private onWarmupCompleted() {
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0(@NotNull Intent intent) {
        super(intent);
        Intrinsics.checkNotNullParameter(intent, "");
    }

    public final List<setProgressViewEndTarget> IAuthTabCallback() throws IOException, ApduException {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (true) {
            try {
                setProgressViewEndTarget setprogressviewendtargetOnExtraCallback = onExtraCallback(i2);
                if (!Intrinsics.areEqual(setprogressviewendtargetOnExtraCallback.onWarmupCompleted(), "08")) {
                    arrayList.add(setprogressviewendtargetOnExtraCallback);
                }
                i2++;
            } catch (ApduException e) {
                if (Intrinsics.areEqual(e.getStatusWord(), "6A83")) {
                    return arrayList;
                }
                throw e;
            }
        }
    }

    public final getTargetIds IAuthTabCallback(int i2) throws IOException, ApduException {
        return getTargetIds.onExtraCallbackWithResult.onExtraCallbackWithResult(onExtraCallbackWithResult("9006000004" + IAuthTabCallbackDefault.IAuthTabCallback(i2) + "1F"));
    }

    public final getTransitionProperties IAuthTabCallback(@NotNull RememberUtilsKtExternalSyntheticLambda3<getPathMotion> rememberUtilsKtExternalSyntheticLambda3) {
        Intrinsics.checkNotNullParameter(rememberUtilsKtExternalSyntheticLambda3, "");
        getPathMotion getpathmotionOnNavigationEvent = rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent();
        return onWarmupCompleted(getpathmotionOnNavigationEvent.onWarmupCompleted() + getpathmotionOnNavigationEvent.onExtraCallbackWithResult() + getpathmotionOnNavigationEvent.onTransact() + getpathmotionOnNavigationEvent.IAuthTabCallbackDefault());
    }

    public final String onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strSubstring = IAuthTabCallbackDefault.IAuthTabCallback(str.length() / 2).substring(6, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return onExtraCallbackWithResult("00A40400" + strSubstring + str);
    }

    public final getTargetIds onExtraCallback() throws IOException, ApduException {
        return getTargetIds.onExtraCallbackWithResult.onExtraCallbackWithResult(onExtraCallbackWithResult("900610001F"));
    }

    public final setProgressViewEndTarget onExtraCallback(int i2) throws IOException, ApduException {
        String strSubstring = IAuthTabCallbackDefault.IAuthTabCallback(i2).substring(6, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return setProgressViewEndTarget.onNavigationEvent.onExtraCallback(onExtraCallbackWithResult("00B2" + strSubstring + "741B"));
    }

    public final ThreePaneScaffoldPredictiveBackHandler_androidKtExternalSyntheticLambda0 onExtraCallbackWithResult() throws EpTagException {
        try {
            return ThreePaneScaffoldPredictiveBackHandler_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult.onWarmupCompleted(onExtraCallback("D410000029000001"));
        } catch (ApduException unused) {
            throw new EpTagException(ResponseCode.ERROR_NOT_SUPPORT_CARD, "인식된 카드가 레일플러스 카드가 아닙니다.", null, 4, null);
        } catch (Exception unused2) {
            throw new EpTagException(ResponseCode.ERROR_TAG_LOST, "통신 중 카드가 분리되었습니다.", null, 4, null);
        }
    }

    public final getTransitionValues onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) throws IOException, ApduException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return getTransitionValues.IAuthTabCallback.onExtraCallbackWithResult(onExtraCallbackWithResult("9010000017" + str + str2 + "0002" + str3 + str4 + "23"));
    }

    public final int onNavigationEvent() {
        String strSubstring = onExtraCallbackWithResult("904C000004").substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return Integer.parseInt(strSubstring, CharsKt.IAuthTabCallback(16));
    }

    public final getMatchedTransitionValues onNavigationEvent(int i2) throws IOException, ApduException {
        return getMatchedTransitionValues.onWarmupCompleted.onNavigationEvent(onExtraCallbackWithResult("9002000004" + IAuthTabCallbackDefault.IAuthTabCallback(i2) + "17"));
    }

    public final getPropagation onNavigationEvent(@NotNull String str) throws IOException, ApduException {
        Intrinsics.checkNotNullParameter(str, "");
        return getPropagation.onExtraCallback.onNavigationEvent(onExtraCallbackWithResult("9008000015" + str + "08"));
    }

    public final int onWarmupCompleted() {
        String strSubstring = onExtraCallbackWithResult("904C010004").substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return Integer.parseInt(strSubstring, CharsKt.IAuthTabCallback(16));
    }

    public final getPropagation onWarmupCompleted(@NotNull RememberUtilsKtExternalSyntheticLambda3<getStartDelay> rememberUtilsKtExternalSyntheticLambda3) {
        Intrinsics.checkNotNullParameter(rememberUtilsKtExternalSyntheticLambda3, "");
        String strOnExtraCallbackWithResult = rememberUtilsKtExternalSyntheticLambda3.onExtraCallbackWithResult();
        getStartDelay getstartdelayOnNavigationEvent = rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent();
        return onNavigationEvent(getstartdelayOnNavigationEvent.onExtraCallbackWithResult() + getstartdelayOnNavigationEvent.onExtraCallback() + getstartdelayOnNavigationEvent.onNavigationEvent() + getstartdelayOnNavigationEvent.IAuthTabCallbackDefault() + strOnExtraCallbackWithResult);
    }

    public final getTransitionProperties onWarmupCompleted(@NotNull String str) throws IOException, ApduException {
        Intrinsics.checkNotNullParameter(str, "");
        return getTransitionProperties.onExtraCallbackWithResult.onExtraCallbackWithResult(onExtraCallbackWithResult("9004000012" + str + "04"));
    }
}
