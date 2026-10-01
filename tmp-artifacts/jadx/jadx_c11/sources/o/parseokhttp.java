package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface parseokhttp {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onWarmupCompleted;

    int IAuthTabCallback();

    void asBinder();

    getTlsVersionsokhttp onExtraCallback();

    void onExtraCallbackWithResult();

    CookieJar onNavigationEvent();

    void onNavigationEvent(@NotNull parseDomain parsedomain, boolean z);

    static /* synthetic */ void onWarmupCompleted(parseokhttp parseokhttpVar, parseDomain parsedomain, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i & 1) != 0) {
            parsedomain = parseDomain.BOTH;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        parseokhttpVar.onNavigationEvent(parsedomain, z);
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        static final /* synthetic */ onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        static {
            int i = onExtraCallback + 77;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 76 / 0;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public final parseokhttp onExtraCallbackWithResult(@NotNull CookieJar cookieJar) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(cookieJar, "");
            deprecated_domain deprecated_domainVar = new deprecated_domain(cookieJar);
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return deprecated_domainVar;
            }
            throw null;
        }
    }
}
