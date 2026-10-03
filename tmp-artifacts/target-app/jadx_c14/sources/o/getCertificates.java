package o;

import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCertificates implements getOther {
    private final Function1<TdsListRowV1View, Unit> onWarmupCompleted;

    public final Function1<TdsListRowV1View, Unit> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.LIST_ROW;
    }
}
