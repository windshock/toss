package im.toss.feature.credit.ui.main.test;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda65 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditTestActivity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$5;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$6;

    public /* synthetic */ CreditTestActivity$$ExternalSyntheticLambda65(CreditTestActivity creditTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6) {
        this.f$0 = creditTestActivity;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = getsupportedhighspeedresolutionsfor2;
        this.f$3 = getsupportedhighspeedresolutionsfor3;
        this.f$4 = getsupportedhighspeedresolutionsfor4;
        this.f$5 = getsupportedhighspeedresolutionsfor5;
        this.f$6 = getsupportedhighspeedresolutionsfor6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) CreditTestActivity.onWarmupCompleted(-1137884976, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1137884987, objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
