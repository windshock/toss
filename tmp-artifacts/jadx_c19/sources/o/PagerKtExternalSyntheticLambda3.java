package o;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerKtExternalSyntheticLambda3 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public PagerKtExternalSyntheticLambda3(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    public InvalidProtocolBufferException onNavigationEvent() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
