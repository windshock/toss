package o;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import o.resolveExternalConverterClassNames;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class resolveExternalConverterClassNames {
    public static final Predicate<String> onWarmupCompleted = new Predicate() { // from class: io.opentelemetry.sdk.metrics.internal.view.StringPredicates$$ExternalSyntheticLambda1
        @Override // java.util.function.Predicate
        public final boolean test(Object obj) {
            return resolveExternalConverterClassNames.onExtraCallbackWithResult((String) obj);
        }
    };

    public static /* synthetic */ boolean onExtraCallbackWithResult(String str) {
        return true;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Pattern pattern, String str) {
        return str != null && pattern.matcher(str).matches();
    }
}
