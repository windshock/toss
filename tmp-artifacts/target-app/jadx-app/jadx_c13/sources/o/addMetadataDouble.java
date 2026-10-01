package o;

import io.opentelemetry.sdk.metrics.export.AggregationTemporalitySelector$;
import java.util.StringJoiner;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface addMetadataDouble {
    get_mainThreadbugsnag_android_core_release getAggregationTemporality(getDataTrimmed getdatatrimmed);

    static addMetadataDouble asInterface() {
        return new AggregationTemporalitySelector$.ExternalSyntheticLambda2();
    }

    static addMetadataDouble onTransact() {
        return new AggregationTemporalitySelector$.ExternalSyntheticLambda1();
    }

    static /* synthetic */ get_mainThreadbugsnag_android_core_release IAuthTabCallback(getDataTrimmed getdatatrimmed) {
        int i = AnonymousClass2.onWarmupCompleted[getdatatrimmed.ordinal()];
        if (i == 1 || i == 2) {
            return get_mainThreadbugsnag_android_core_release.CUMULATIVE;
        }
        return get_mainThreadbugsnag_android_core_release.DELTA;
    }

    /* renamed from: o.addMetadataDouble$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[getDataTrimmed.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[getDataTrimmed.UP_DOWN_COUNTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[getDataTrimmed.OBSERVABLE_UP_DOWN_COUNTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[getDataTrimmed.OBSERVABLE_COUNTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onWarmupCompleted[getDataTrimmed.COUNTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onWarmupCompleted[getDataTrimmed.HISTOGRAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static addMetadataDouble asBinder() {
        return new AggregationTemporalitySelector$.ExternalSyntheticLambda0();
    }

    static /* synthetic */ get_mainThreadbugsnag_android_core_release onExtraCallback(getDataTrimmed getdatatrimmed) {
        int i = AnonymousClass2.onWarmupCompleted[getdatatrimmed.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return get_mainThreadbugsnag_android_core_release.CUMULATIVE;
        }
        return get_mainThreadbugsnag_android_core_release.DELTA;
    }

    static String onExtraCallbackWithResult(addMetadataDouble addmetadatadouble) {
        StringJoiner stringJoiner = new StringJoiner(", ", "AggregationTemporalitySelector{", "}");
        for (getDataTrimmed getdatatrimmed : getDataTrimmed.values()) {
            stringJoiner.add(getdatatrimmed.name() + "=" + addmetadatadouble.getAggregationTemporality(getdatatrimmed).name());
        }
        return stringJoiner.toString();
    }
}
