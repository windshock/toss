package im.toss.components.tuba.trigger.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;
import o.setHorizontalGravity;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda5 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$10;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$11;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Integer f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ String f$5;
    public final /* synthetic */ Function0 f$6;
    public final /* synthetic */ Function0 f$7;
    public final /* synthetic */ long f$8;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$9;

    public /* synthetic */ BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda5(String str, String str2, String str3, Integer num, String str4, String str5, Function0 function0, Function0 function02, long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = num;
        this.f$4 = str4;
        this.f$5 = str5;
        this.f$6 = function0;
        this.f$7 = function02;
        this.f$8 = j;
        this.f$9 = getsupportedhighspeedresolutionsfor;
        this.f$10 = getsupportedhighspeedresolutionsfor2;
        this.f$11 = getsupportedhighspeedresolutionsfor3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = OkHttpNetworkFetcherExternalSyntheticLambda6.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i5 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
