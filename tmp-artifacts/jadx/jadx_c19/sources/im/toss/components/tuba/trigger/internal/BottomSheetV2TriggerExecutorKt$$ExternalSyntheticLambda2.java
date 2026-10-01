package im.toss.components.tuba.trigger.internal;

import kotlin.jvm.functions.Function0;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;

    public /* synthetic */ BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda2(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        this.f$0 = function0;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = getsupportedhighspeedresolutionsfor2;
        this.f$3 = getsupportedhighspeedresolutionsfor3;
    }

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Function0 function0 = this.f$0;
        if (i4 == 0) {
            return OkHttpNetworkFetcherExternalSyntheticLambda6.IAuthTabCallback(function0, this.f$1, this.f$2, this.f$3);
        }
        OkHttpNetworkFetcherExternalSyntheticLambda6.IAuthTabCallback(function0, this.f$1, this.f$2, this.f$3);
        throw null;
    }
}
