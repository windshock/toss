package im.toss.rn.toss.core.legacy.bundle.v2;

import android.content.Context;
import im.toss.rn.spec.ReactAuBundleVerificationKey;
import im.toss.rn.spec.ReactBankBundleVerificationKey;
import im.toss.rn.spec.ReactBundleVerificationKey;
import im.toss.rn.spec.ReactOkHttpClient;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactRemoteBundleSource;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.security.PublicKey;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.access13800;
import o.hExternalSyntheticLambda4;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.r8lambdaHDAe14RP_YfkbgNStt68qt10Iow;
import o.zzad;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactRemoteBundleSourceImpl implements ReactRemoteBundleSource {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int onTransact;
    private final PublicKey IAuthTabCallback;
    private final zzad IAuthTabCallbackDefault;
    private final ReactBundleFileManager IAuthTabCallbackStub;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 asBinder;
    private final OkHttpClient asInterface;
    private final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow onExtraCallback;
    private final PublicKey onExtraCallbackWithResult;
    private final PublicKey onNavigationEvent;
    private final Context onWarmupCompleted;

    @Inject
    public ReactRemoteBundleSourceImpl(@ReactOkHttpClient @NotNull OkHttpClient okHttpClient, @ReactBundleVerificationKey @NotNull PublicKey publicKey, @ReactBankBundleVerificationKey @NotNull PublicKey publicKey2, @ReactAuBundleVerificationKey @NotNull PublicKey publicKey3, @NotNull r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow, @NotNull zzad zzadVar, @NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0, @NotNull ReactBundleFileManager reactBundleFileManager, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(publicKey, "");
        Intrinsics.checkNotNullParameter(publicKey2, "");
        Intrinsics.checkNotNullParameter(publicKey3, "");
        Intrinsics.checkNotNullParameter(r8lambdahdae14rp_yfkbgnstt68qt10iow, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(reactBundleFileManager, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = okHttpClient;
        this.onExtraCallbackWithResult = publicKey;
        this.onNavigationEvent = publicKey2;
        this.IAuthTabCallback = publicKey3;
        this.onExtraCallback = r8lambdahdae14rp_yfkbgnstt68qt10iow;
        this.IAuthTabCallbackDefault = zzadVar;
        this.asBinder = constraintsSizeResolverExternalSyntheticLambda0;
        this.IAuthTabCallbackStub = reactBundleFileManager;
        this.onWarmupCompleted = context;
    }

    public static final /* synthetic */ Context IAuthTabCallback(ReactRemoteBundleSourceImpl reactRemoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 75;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Context context = reactRemoteBundleSourceImpl.onWarmupCompleted;
        int i5 = i2 + 77;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ReactBundleFileManager onExtraCallback(ReactRemoteBundleSourceImpl reactRemoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        ReactBundleFileManager reactBundleFileManager = reactRemoteBundleSourceImpl.IAuthTabCallbackStub;
        int i5 = i3 + 5;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return reactBundleFileManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(ReactRemoteBundleSourceImpl reactRemoteBundleSourceImpl, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = reactRemoteBundleSourceImpl.onNavigationEvent(str, str2, str3);
        int i4 = IAuthTabCallbackStubProxy + 89;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ zzad onExtraCallbackWithResult(ReactRemoteBundleSourceImpl reactRemoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        zzad zzadVar = reactRemoteBundleSourceImpl.IAuthTabCallbackDefault;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 41;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    public static final /* synthetic */ ConstraintsSizeResolverExternalSyntheticLambda0 onNavigationEvent(ReactRemoteBundleSourceImpl reactRemoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = reactRemoteBundleSourceImpl.asBinder;
        int i5 = i3 + 99;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintsSizeResolverExternalSyntheticLambda0;
        }
        throw null;
    }

    public static final /* synthetic */ OkHttpClient onWarmupCompleted(ReactRemoteBundleSourceImpl reactRemoteBundleSourceImpl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClient = reactRemoteBundleSourceImpl.asInterface;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return okHttpClient;
    }

    @Override // im.toss.rn.toss.core.legacy.bundle.v2.ReactRemoteBundleSource
    public Object IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Date date, boolean z, @NotNull access13800<? super ReactRemoteBundleSource.Result> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new ReactRemoteBundleSourceImpl$fetchBundle$2(this, str, str2, str3, date, null), access13800Var);
        int i2 = IAuthTabCallbackStubProxy + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    private final String onNavigationEvent(String str, String str2, String str3) {
        int i = 2 % 2;
        String str4 = onWarmupCompleted(str2, str3) + str + TossSecRoute.Main.PATH + this.onExtraCallback.onWarmupCompleted() + "/rn84";
        int i2 = IAuthTabCallbackStubProxy + 57;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return str4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String bundleBaseUrl = hExternalSyntheticLambda4.Companion.IAuthTabCallback(lowerCase, str2).getBundleBaseUrl();
        int i4 = onTransact + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return bundleBaseUrl;
        }
        throw null;
    }
}
