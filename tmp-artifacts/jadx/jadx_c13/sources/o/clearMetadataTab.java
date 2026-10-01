package o;

import io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector$;
import java.util.Objects;
import java.util.StringJoiner;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface clearMetadataTab {
    modifyCallback getDefaultAggregation(getDataTrimmed getdatatrimmed);

    static clearMetadataTab IAuthTabCallbackStub() {
        return new DefaultAggregationSelector$.ExternalSyntheticLambda1();
    }

    default clearMetadataTab IAuthTabCallback(getDataTrimmed getdatatrimmed, modifyCallback modifycallback) {
        Objects.requireNonNull(getdatatrimmed, "instrumentType");
        Objects.requireNonNull(modifycallback, "aggregation");
        return new DefaultAggregationSelector$.ExternalSyntheticLambda0(this, getdatatrimmed, modifycallback);
    }

    static /* synthetic */ modifyCallback IAuthTabCallback(clearMetadataTab clearmetadatatab, getDataTrimmed getdatatrimmed, modifyCallback modifycallback, getDataTrimmed getdatatrimmed2) {
        return getdatatrimmed2 == getdatatrimmed ? modifycallback : clearmetadatatab.getDefaultAggregation(getdatatrimmed2);
    }

    static String onNavigationEvent(clearMetadataTab clearmetadatatab) {
        StringJoiner stringJoiner = new StringJoiner(", ", "DefaultAggregationSelector{", "}");
        for (getDataTrimmed getdatatrimmed : getDataTrimmed.values()) {
            stringJoiner.add(getdatatrimmed.name() + "=" + NativeBridgeWhenMappings.onExtraCallbackWithResult(clearmetadatatab.getDefaultAggregation(getdatatrimmed)));
        }
        return stringJoiner.toString();
    }
}
