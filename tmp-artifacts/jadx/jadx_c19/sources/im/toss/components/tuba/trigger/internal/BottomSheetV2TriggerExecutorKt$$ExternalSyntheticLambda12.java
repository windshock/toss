package im.toss.components.tuba.trigger.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda12 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;

    public /* synthetic */ BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda12(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        this.f$0 = function0;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = getsupportedhighspeedresolutionsfor2;
        this.f$3 = getsupportedhighspeedresolutionsfor3;
    }

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            OkHttpNetworkFetcherExternalSyntheticLambda6.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = OkHttpNetworkFetcherExternalSyntheticLambda6.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3);
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }
}
