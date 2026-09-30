package im.toss.components.tuba.trigger.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda13 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;

    public /* synthetic */ BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda13(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        this.f$0 = function0;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = getsupportedhighspeedresolutionsfor2;
        this.f$3 = getsupportedhighspeedresolutionsfor3;
    }

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = OkHttpNetworkFetcherExternalSyntheticLambda6.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3);
        int i5 = onWarmupCompleted + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return unitOnNavigationEvent;
    }
}
