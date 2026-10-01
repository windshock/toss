package im.toss.components.tuba.trigger.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;
import o.getSupportedHighSpeedResolutionsFor;
import o.setUseCaseAttached;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$DialogFrame$4$1$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;

    public /* synthetic */ BottomSheetV2TriggerExecutorKt$DialogFrame$4$1$$ExternalSyntheticLambda0(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        this.f$0 = function0;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = getsupportedhighspeedresolutionsfor2;
        this.f$3 = getsupportedhighspeedresolutionsfor3;
    }

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            unitOnExtraCallbackWithResult = OkHttpNetworkFetcherExternalSyntheticLambda6.onExtraCallbackWithResult.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (setUseCaseAttached) obj);
            int i4 = 23 / 0;
        } else {
            unitOnExtraCallbackWithResult = OkHttpNetworkFetcherExternalSyntheticLambda6.onExtraCallbackWithResult.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (setUseCaseAttached) obj);
        }
        int i5 = IAuthTabCallback + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
