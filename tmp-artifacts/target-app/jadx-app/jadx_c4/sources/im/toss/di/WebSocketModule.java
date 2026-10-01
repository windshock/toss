package im.toss.di;

import dagger.Lazy;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.state.spec.SessionState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ca;
import o.clearFeatureFlags;
import o.convertThreadbugsnag_android_core_release;
import o.ea;
import o.g1;
import o.parseTraceId;
import o.zzad;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebSocketModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final WebSocketModule onWarmupCompleted = new WebSocketModule();

    static {
        int i = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 7 / 0;
        }
    }

    private WebSocketModule() {
    }

    public final clearFeatureFlags IAuthTabCallback(@NotNull OkHttpClient okHttpClient, @NotNull parseTraceId parsetraceid) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(parsetraceid, "");
        clearFeatureFlags clearfeatureflags = new clearFeatureFlags(okHttpClient, parsetraceid);
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return clearfeatureflags;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final parseTraceId onExtraCallbackWithResult(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, parseTraceId.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 117, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, parseTraceId.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (parseTraceId) objOnExtraCallback;
    }

    public final OkHttpClient onExtraCallbackWithResult(@NotNull ea eaVar, @NotNull Lazy<CertificatePinner> lazy, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(eaVar, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.dns(eaVar.onNavigationEvent(ca.COMMON));
        if (!zzadVar.ICustomTabsCallbackStubProxy()) {
            int i2 = onNavigationEvent + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                CertificatePinner certificatePinner = lazy.get();
                Intrinsics.checkNotNullExpressionValue(certificatePinner, "");
                builder.certificatePinner(certificatePinner);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CertificatePinner certificatePinner2 = lazy.get();
            Intrinsics.checkNotNullExpressionValue(certificatePinner2, "");
            builder.certificatePinner(certificatePinner2);
        }
        return builder.build();
    }

    public final convertThreadbugsnag_android_core_release onNavigationEvent(@NotNull SessionState sessionState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionState, "");
        convertThreadbugsnag_android_core_release convertthreadbugsnag_android_core_release = new convertThreadbugsnag_android_core_release(AppState.Companion.onExtraCallbackWithResult(), sessionState);
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return convertthreadbugsnag_android_core_release;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
