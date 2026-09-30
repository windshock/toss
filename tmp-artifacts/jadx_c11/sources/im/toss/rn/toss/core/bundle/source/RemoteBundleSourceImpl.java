package im.toss.rn.toss.core.bundle.source;

import android.content.Context;
import im.toss.rn.toss.core.bundle.model.RemoteBundleResult;
import im.toss.rn.toss.core.common.cache.RnHttpCacheDirectory;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.MaxFullscreenAdImplExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.dc;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4;
import o.zzad;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RemoteBundleSourceImpl implements RemoteBundleSource {
    public static final Companion Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asInterface;
    private final Context IAuthTabCallback;
    private final RnPhaseObserver asBinder;
    private final zzad onExtraCallback;
    private final dc onExtraCallbackWithResult;
    private final r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 onNavigationEvent;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 onTransact;
    private final OkHttpClient onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Inject
    public RemoteBundleSourceImpl(@NotNull r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4, @NotNull dc dcVar, @NotNull zzad zzadVar, @NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0, @NotNull RnPhaseObserver rnPhaseObserver, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(r8lambda2dedie2xf7declmcf5taijldvi4, "");
        Intrinsics.checkNotNullParameter(dcVar, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(rnPhaseObserver, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = r8lambda2dedie2xf7declmcf5taijldvi4;
        this.onExtraCallbackWithResult = dcVar;
        this.onExtraCallback = zzadVar;
        this.onTransact = constraintsSizeResolverExternalSyntheticLambda0;
        this.asBinder = rnPhaseObserver;
        this.IAuthTabCallback = context;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        RnHttpCacheDirectory rnHttpCacheDirectory = RnHttpCacheDirectory.onWarmupCompleted;
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "");
        OkHttpClient.Builder builderCache = builder.cache(new Cache(rnHttpCacheDirectory.onNavigationEvent(cacheDir, "rn_bundle_http_cache"), 52428800L));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.onWarmupCompleted = builderCache.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).build();
    }

    public static final /* synthetic */ dc IAuthTabCallback(RemoteBundleSourceImpl remoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Object obj = null;
        dc dcVar = remoteBundleSourceImpl.onExtraCallbackWithResult;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 29;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return dcVar;
        }
        throw null;
    }

    public static final /* synthetic */ RnPhaseObserver IAuthTabCallbackDefault(RemoteBundleSourceImpl remoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        RnPhaseObserver rnPhaseObserver = remoteBundleSourceImpl.asBinder;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 101;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return rnPhaseObserver;
    }

    public static final /* synthetic */ ConstraintsSizeResolverExternalSyntheticLambda0 asBinder(RemoteBundleSourceImpl remoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = remoteBundleSourceImpl.onTransact;
        if (i3 == 0) {
            return constraintsSizeResolverExternalSyntheticLambda0;
        }
        throw null;
    }

    public static final /* synthetic */ r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 onExtraCallback(RemoteBundleSourceImpl remoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 23;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4 = remoteBundleSourceImpl.onNavigationEvent;
        int i5 = i2 + 23;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return r8lambda2dedie2xf7declmcf5taijldvi4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Context onExtraCallbackWithResult(RemoteBundleSourceImpl remoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Context context = remoteBundleSourceImpl.IAuthTabCallback;
        if (i4 != 0) {
            int i5 = 87 / 0;
        }
        int i6 = i3 + 17;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ OkHttpClient onNavigationEvent(RemoteBundleSourceImpl remoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClient = remoteBundleSourceImpl.onWarmupCompleted;
        if (i3 != 0) {
            return okHttpClient;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ zzad onWarmupCompleted(RemoteBundleSourceImpl remoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 9;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = remoteBundleSourceImpl.onExtraCallback;
        int i5 = i2 + 17;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    @Override // im.toss.rn.toss.core.bundle.source.RemoteBundleSource
    public Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @Nullable Date date, @Nullable String str5, @NotNull access13800<? super RemoteBundleResult> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new RemoteBundleSourceImpl$fetchBundle$2(this, str2, str, str3, str4, date, str5, null), access13800Var);
        int i2 = asInterface + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    @Override // im.toss.rn.toss.core.bundle.source.RemoteBundleSource
    public Object onWarmupCompleted(@NotNull String str, int i, @NotNull access13800<? super Boolean> access13800Var) {
        int i2 = 2 % 2;
        if (!MaxFullscreenAdImplExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback)) {
            int i3 = IAuthTabCallbackStubProxy + 83;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return access14000.onNavigationEvent(false);
        }
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new RemoteBundleSourceImpl$isMetroServerConnected$2(str, i, this, null), access13800Var);
        int i5 = asInterface + 99;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallback;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
