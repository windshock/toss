package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.detachH5Plugin;
import o.setRegionDecoderFactory;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListLogManager$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ setRegionDecoderFactory f$2;

    public /* synthetic */ LegacyTransactionListLogManager$$ExternalSyntheticLambda0(String str, String str2, setRegionDecoderFactory setregiondecoderfactory) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = setregiondecoderfactory;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            detachH5Plugin.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = detachH5Plugin.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i3 = onExtraCallbackWithResult + 93;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
