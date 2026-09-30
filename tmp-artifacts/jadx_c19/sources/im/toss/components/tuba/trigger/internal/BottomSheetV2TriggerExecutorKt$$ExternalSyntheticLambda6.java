package im.toss.components.tuba.trigger.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda6 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Integer f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ String f$5;
    public final /* synthetic */ Function0 f$6;
    public final /* synthetic */ Function0 f$7;
    public final /* synthetic */ Function0 f$8;
    public final /* synthetic */ Function0 f$9;

    public /* synthetic */ BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda6(String str, String str2, String str3, Integer num, String str4, String str5, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = num;
        this.f$4 = str4;
        this.f$5 = str5;
        this.f$6 = function0;
        this.f$7 = function02;
        this.f$8 = function03;
        this.f$9 = function04;
        this.f$10 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = OkHttpNetworkFetcherExternalSyntheticLambda6.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i5 = onWarmupCompleted + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
