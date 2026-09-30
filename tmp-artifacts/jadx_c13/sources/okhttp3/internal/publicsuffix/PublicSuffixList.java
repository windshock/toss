package okhttp3.internal.publicsuffix;

import o.TTBaseLandingPageActivity;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface PublicSuffixList {
    public static final Companion Companion = Companion.$$INSTANCE;

    void ensureLoaded();

    TTBaseLandingPageActivity getBytes();

    TTBaseLandingPageActivity getExceptionBytes();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
