package im.toss.features.foreigner.home.ui.test;

import kotlin.jvm.functions.Function1;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda29 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (i3 != 0) {
            return setCallUrl.onExtraCallback(zBooleanValue);
        }
        setCallUrl.onExtraCallback(zBooleanValue);
        throw null;
    }
}
