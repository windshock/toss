package viva.republica.toss.mvno.log;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getAdTypeString;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CardInfoScanLogTracker$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ getAdTypeString f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CardInfoScanLogTracker$$ExternalSyntheticLambda1(getAdTypeString getadtypestring, String str) {
        this.f$0 = getadtypestring;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        return getAdTypeString.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
    }
}
