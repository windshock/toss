package im.toss.features.edoc.wallet;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocShareBaseActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getTypedExportedConstants f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getTypedExportedConstants gettypedexportedconstants = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 == 0) {
            return EDocShareBaseActivity.onExtraCallbackWithResult(gettypedexportedconstants, setDetectableSize);
        }
        EDocShareBaseActivity.onExtraCallbackWithResult(gettypedexportedconstants, setDetectableSize);
        throw null;
    }
}
