package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.detachH5Plugin;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListLogManager$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 == 0) {
            return detachH5Plugin.onExtraCallbackWithResult(str, setDetectableSize);
        }
        detachH5Plugin.onExtraCallbackWithResult(str, setDetectableSize);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
