package o;

import java.util.StringJoiner;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class awaitResult {
    public abstract modifyCallback IAuthTabCallback();

    abstract withJavaConverters onExtraCallback();

    @Nullable
    public abstract String onExtraCallbackWithResult();

    public abstract int onNavigationEvent();

    @Nullable
    public abstract String onWarmupCompleted();

    public static isComplete IAuthTabCallbackDefault() {
        return new isComplete();
    }

    static awaitResult onWarmupCompleted(@Nullable String str, @Nullable String str2, modifyCallback modifycallback, withJavaConverters withjavaconverters, int i) {
        return new JsonHelperExternalSyntheticLambda0(str, str2, modifycallback, withjavaconverters, i);
    }

    awaitResult() {
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        if (onWarmupCompleted() != null) {
            stringJoiner.add("name=" + onWarmupCompleted());
        }
        if (onExtraCallbackWithResult() != null) {
            stringJoiner.add("description=" + onExtraCallbackWithResult());
        }
        stringJoiner.add("aggregation=" + IAuthTabCallback());
        stringJoiner.add("attributesProcessor=" + onExtraCallback());
        stringJoiner.add("cardinalityLimit=" + onNavigationEvent());
        return stringJoiner.toString();
    }
}
