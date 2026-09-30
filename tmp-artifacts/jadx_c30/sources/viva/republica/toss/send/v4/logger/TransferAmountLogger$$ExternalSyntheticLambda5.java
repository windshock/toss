package viva.republica.toss.send.v4.logger;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getMarkerTime;
import o.runOnUiQueueThread;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TransferAmountLogger$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ List f$3;
    public final /* synthetic */ runOnUiQueueThread f$4;
    public final /* synthetic */ String f$5;

    public /* synthetic */ TransferAmountLogger$$ExternalSyntheticLambda5(String str, String str2, long j, List list, runOnUiQueueThread runonuiqueuethread, String str3) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = j;
        this.f$3 = list;
        this.f$4 = runonuiqueuethread;
        this.f$5 = str3;
    }

    public final Object invoke(Object obj) {
        return getMarkerTime.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (SetDetectableSize) obj);
    }
}
