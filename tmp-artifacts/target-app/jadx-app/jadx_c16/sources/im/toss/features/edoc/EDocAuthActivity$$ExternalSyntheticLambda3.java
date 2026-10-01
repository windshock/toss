package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocAuthActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ EDocAuthActivity f$0;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ Function0 f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ EDocAuthActivity$$ExternalSyntheticLambda3(EDocAuthActivity eDocAuthActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, Function0 function0, int i, int i2) {
        this.f$0 = eDocAuthActivity;
        this.f$1 = quirksExternalSyntheticBackport0;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = str3;
        this.f$5 = function0;
        this.f$6 = i;
        this.f$7 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            EDocAuthActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnExtraCallback = EDocAuthActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
