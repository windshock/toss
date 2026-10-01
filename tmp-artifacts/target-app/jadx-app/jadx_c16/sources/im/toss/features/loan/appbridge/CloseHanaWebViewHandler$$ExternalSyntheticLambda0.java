package im.toss.features.loan.appbridge;

import kotlin.jvm.functions.Function2;
import o.PackageParseUtils;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CloseHanaWebViewHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(PackageParseUtils.IAuthTabCallback((String) obj, (String) obj2));
        int i4 = onExtraCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }
}
