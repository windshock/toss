package o;

import im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageRequestsKtExternalSyntheticLambda0 implements OkHttpNetworkFetcherExternalSyntheticLambda5 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final UtilsKtExternalSyntheticLambda9 onNavigationEvent;
    private final OkHttpNetworkFetcherExternalSyntheticLambda3 onWarmupCompleted;

    public ImageRequestsKtExternalSyntheticLambda0(@NotNull OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3, @NotNull UtilsKtExternalSyntheticLambda9 utilsKtExternalSyntheticLambda9) {
        Intrinsics.checkNotNullParameter(okHttpNetworkFetcherExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda9, "");
        this.onWarmupCompleted = okHttpNetworkFetcherExternalSyntheticLambda3;
        this.onNavigationEvent = utilsKtExternalSyntheticLambda9;
    }

    @Override // o.OkHttpNetworkFetcherExternalSyntheticLambda5
    public ALCFaceSDKExternalSyntheticLambda1 IAuthTabCallback(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(str, "");
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("TubaTrigger-" + str);
        ImageRequests_androidKtExternalSyntheticLambda0 imageRequests_androidKtExternalSyntheticLambda0 = new ImageRequests_androidKtExternalSyntheticLambda0(textRoundCornerProgressBarSavedState1);
        ALCFaceSDK1 aLCFaceSDK1 = new ALCFaceSDK1();
        Intrinsics.checkNotNull(appSetIdAndScope1OnExtraCallbackWithResult);
        ALCFaceSDKExternalSyntheticLambda3 aLCFaceSDKExternalSyntheticLambda3 = new ALCFaceSDKExternalSyntheticLambda3(aLCFaceSDK1, imageRequests_androidKtExternalSyntheticLambda0, appSetIdAndScope1OnExtraCallbackWithResult, null, 8, null);
        checkValidRoll checkvalidroll = new checkValidRoll(new ImageRequestBuilderExternalSyntheticLambda1(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("DIALOG", new ImageRequestBuilderExternalSyntheticLambda0(this.onWarmupCompleted, this.onNavigationEvent)), getWrite.IAuthTabCallback("URL", new RequestService(this.onWarmupCompleted, this.onNavigationEvent)), getWrite.IAuthTabCallback("BOTTOMSHEET", new BottomSheetTriggerExecutor(this.onWarmupCompleted, this.onNavigationEvent)), getWrite.IAuthTabCallback("BOTTOMSHEET_V2", new getReadEnabled(this.onWarmupCompleted, this.onNavigationEvent, aLCFaceSDKExternalSyntheticLambda3))})), aLCFaceSDKExternalSyntheticLambda3, aLCFaceSDK1, appSetIdAndScope1OnExtraCallbackWithResult, str);
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkvalidroll;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
