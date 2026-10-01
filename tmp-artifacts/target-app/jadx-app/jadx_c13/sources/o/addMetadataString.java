package o;

import io.opentelemetry.sdk.metrics.export.CardinalityLimitSelector$;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface addMetadataString {
    static /* synthetic */ int onExtraCallback(getDataTrimmed getdatatrimmed) {
        return 2000;
    }

    int getCardinalityLimit(getDataTrimmed getdatatrimmed);

    static addMetadataString onWarmupCompleted() {
        return new CardinalityLimitSelector$.ExternalSyntheticLambda0();
    }
}
