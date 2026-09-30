package o;

import java.util.Map;
import java.util.function.Function;
import o.initProgressBar;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class initProgressBar<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallback {
        private static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        int onExtraCallback;

        private IAuthTabCallback() {
            this.onExtraCallback = 0;
        }
    }

    public class onExtraCallback {
        private final Map<T, IAuthTabCallback> onNavigationEvent;

        public static /* synthetic */ IAuthTabCallback onWarmupCompleted(Object obj) {
            return new IAuthTabCallback();
        }

        public void onExtraCallbackWithResult(T t) {
            this.onNavigationEvent.computeIfAbsent(t, new Function() { // from class: org.apache.commons.text.similarity.IntersectionSimilarity$TinyBag$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return initProgressBar.onExtraCallback.onWarmupCompleted(obj);
                }
            }).onExtraCallback++;
        }
    }
}
