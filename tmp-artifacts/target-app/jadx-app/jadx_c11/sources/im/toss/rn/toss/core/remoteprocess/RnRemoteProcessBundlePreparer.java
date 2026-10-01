package im.toss.rn.toss.core.remoteprocess;

import android.content.Context;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MaxNativeAdLoaderImpla;
import o.access13800;
import o.ebExternalSyntheticLambda0;
import o.getBillingPeriod;
import o.isLoading;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.r8lambdaHDAe14RP_YfkbgNStt68qt10Iow;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnRemoteProcessBundlePreparer {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private final ebExternalSyntheticLambda0 IAuthTabCallback;
    private final zzad onExtraCallback;
    private final getBillingPeriod onExtraCallbackWithResult;
    private final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow onNavigationEvent;
    private final MaxNativeAdLoaderImpla onWarmupCompleted;

    public interface HiltEntryPoint {
        RnRemoteProcessBundlePreparer ComponentActivityExternalSyntheticLambda11();
    }

    static {
        int i = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 89 / 0;
        }
    }

    @Inject
    public RnRemoteProcessBundlePreparer(@NotNull zzad zzadVar, @NotNull r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow, @NotNull getBillingPeriod getbillingperiod, @NotNull ebExternalSyntheticLambda0 ebexternalsyntheticlambda0, @NotNull MaxNativeAdLoaderImpla maxNativeAdLoaderImpla) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(r8lambdahdae14rp_yfkbgnstt68qt10iow, "");
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        Intrinsics.checkNotNullParameter(ebexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(maxNativeAdLoaderImpla, "");
        this.onExtraCallback = zzadVar;
        this.onNavigationEvent = r8lambdahdae14rp_yfkbgnstt68qt10iow;
        this.onExtraCallbackWithResult = getbillingperiod;
        this.IAuthTabCallback = ebexternalsyntheticlambda0;
        this.onWarmupCompleted = maxNativeAdLoaderImpla;
    }

    public static final /* synthetic */ ebExternalSyntheticLambda0 IAuthTabCallback(RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparer) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 87;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        ebExternalSyntheticLambda0 ebexternalsyntheticlambda0 = rnRemoteProcessBundlePreparer.IAuthTabCallback;
        int i5 = i2 + 75;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return ebexternalsyntheticlambda0;
        }
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparer, String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = rnRemoteProcessBundlePreparer.onExtraCallback(str, str2, str3, str4);
        int i4 = asInterface + 29;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ r8lambdaHDAe14RP_YfkbgNStt68qt10Iow onExtraCallback(RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparer) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow = rnRemoteProcessBundlePreparer.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return r8lambdahdae14rp_yfkbgnstt68qt10iow;
    }

    public static final /* synthetic */ MaxNativeAdLoaderImpla onExtraCallbackWithResult(RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparer) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        MaxNativeAdLoaderImpla maxNativeAdLoaderImpla = rnRemoteProcessBundlePreparer.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return maxNativeAdLoaderImpla;
    }

    public static final /* synthetic */ getBillingPeriod onNavigationEvent(RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparer) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 123;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getBillingPeriod getbillingperiod = rnRemoteProcessBundlePreparer.onExtraCallbackWithResult;
        int i5 = i2 + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return getbillingperiod;
    }

    public final Object onExtraCallbackWithResult(@NotNull Context context, @NotNull RnRemoteProcessBundleRequest rnRemoteProcessBundleRequest, @NotNull access13800<? super RnRemoteProcessPrepareResult> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new RnRemoteProcessBundlePreparer$prepare$2(this, rnRemoteProcessBundleRequest, context, null), access13800Var);
        int i2 = asInterface + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    private final String onExtraCallback(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return isLoading.Companion.onExtraCallback().onExtraCallback(this.onExtraCallback.updateVisuals()).onNavigationEvent(str3).IAuthTabCallback(str).onWarmupCompleted(str2).onExtraCallbackWithResult("rn84").onWarmupCompleted().IAuthTabCallback(str4).onExtraCallbackWithResult();
        }
        isLoading.Companion.onExtraCallback().onExtraCallback(this.onExtraCallback.updateVisuals()).onNavigationEvent(str3).IAuthTabCallback(str).onWarmupCompleted(str2).onExtraCallbackWithResult("rn84").onWarmupCompleted().IAuthTabCallback(str4).onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
