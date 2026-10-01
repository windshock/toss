package o;

import java.util.StringJoiner;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TaskType {
    @Nullable
    public abstract getDataTrimmed IAuthTabCallback();

    @Nullable
    public abstract String asBinder();

    @Nullable
    public abstract String onExtraCallback();

    @Nullable
    public abstract String onExtraCallbackWithResult();

    @Nullable
    public abstract String onNavigationEvent();

    @Nullable
    public abstract String onWarmupCompleted();

    public static TrimMetrics IAuthTabCallbackDefault() {
        return new TrimMetrics();
    }

    static TaskType onExtraCallbackWithResult(@Nullable getDataTrimmed getdatatrimmed, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new allCallbacks(getdatatrimmed, str, str2, str3, str4, str5);
    }

    TaskType() {
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "InstrumentSelector{", "}");
        if (IAuthTabCallback() != null) {
            stringJoiner.add("instrumentType=" + IAuthTabCallback());
        }
        if (onExtraCallback() != null) {
            stringJoiner.add("instrumentName=" + onExtraCallback());
        }
        if (onExtraCallbackWithResult() != null) {
            stringJoiner.add("instrumentUnit=" + onExtraCallbackWithResult());
        }
        if (onWarmupCompleted() != null) {
            stringJoiner.add("meterName=" + onWarmupCompleted());
        }
        if (asBinder() != null) {
            stringJoiner.add("meterVersion=" + asBinder());
        }
        if (onNavigationEvent() != null) {
            stringJoiner.add("meterSchemaUrl=" + onNavigationEvent());
        }
        return stringJoiner.toString();
    }
}
