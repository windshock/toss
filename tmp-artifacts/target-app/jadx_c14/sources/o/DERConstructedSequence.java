package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERConstructedSequence {
    public static final DERConstructedSequence onNavigationEvent = new DERConstructedSequence();

    private DERConstructedSequence() {
    }

    public final List<KeyBoardVisiblePoint> IAuthTabCallback(@NotNull List<? extends KeyBoardVisiblePoint> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return CollectionsKt.sortedWith(list, new UST_TSA_VerifyTimeStampTokenWithHash());
    }
}
