package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.observability.instrumentation.rn.RnBundleInfo;
import im.toss.observability.instrumentation.rn.RnCause;
import im.toss.rn.toss.core.bundle.model.BundleMetadata;
import im.toss.rn.toss.core.bundle.model.RemoteBundleResult;
import im.toss.rn.toss.core.bundle.source.RemoteBundleSource;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.auth;
import o.r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg;
import o.setAdReviewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg implements logApiCall {
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback_Parcel;
    private static int access100;
    private static final Regex onExtraCallbackWithResult;
    private final r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 IAuthTabCallback;
    private final RemoteBundleSource IAuthTabCallbackDefault;
    private final r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY IAuthTabCallbackStub;
    private final RnPhaseObserver IAuthTabCallbackStubProxy;
    private final MaxRewardedAdImplb asBinder;
    private final r8lambdaHDAe14RP_YfkbgNStt68qt10Iow asInterface;
    private final ebExternalSyntheticLambda0 getInterfaceDescriptor;
    private final findResAndMsg onExtraCallback;
    private final r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 onNavigationEvent;
    private final zzad onTransact;
    private final r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs onWarmupCompleted;
    private static final byte[] $$a = {119, -40, 16, 123};
    private static final int $$b = 20;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 0;
    private static int ICustomTabsCallback = 1;
    private static int access000 = 1;

    static final class asInterface extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.this.onExtraCallbackWithResult((String) null, (access13800<? super Unit>) this);
            int i4 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onNavigationEvent(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.this, null, this);
            int i4 = IAuthTabCallback + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.this.onNavigationEvent(null, this);
            int i4 = IAuthTabCallback + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = i + 4;
        int i4 = s * 2;
        byte[] bArr = $$a;
        int i5 = (s2 * 3) + 105;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i5 += -i7;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i2++;
            i5 += -i7;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        Throwable thOnExtraCallbackWithResult;
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~(i7 | i5);
        int i10 = i8 | i9;
        int i11 = ~i;
        int i12 = (~((~i5) | i7 | i)) | (~(i7 | i11 | i5));
        int i13 = i9 | (~(i11 | i4));
        int i14 = i4 + i + i6 + ((-1696018712) * i3) + (2108813197 * i2);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i4) - 2121662464) + (1221732374 * i) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i6) + (39845888 * i3) + (227278848 * i2) + ((-1705377792) * i15);
        int i17 = ((i4 * 362004572) - 1408384217) + (i * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i6 * 362004373) + (i3 * (-1290304248)) + (i2 * 155295761) + (i15 * (-60686336));
        int i18 = i16 + (i17 * i17 * (-1680474112));
        if (i18 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 4) {
            return onExtraCallback(objArr);
        }
        setAdReviewListener setadreviewlistener = (setAdReviewListener) objArr[1];
        int i19 = 2 % 2;
        int i20 = extraCallback + 95;
        ICustomTabsCallback = i20 % 128;
        int i21 = i20 % 2;
        setAdReviewListener.onNavigationEvent onnavigationevent = setadreviewlistener instanceof setAdReviewListener.onNavigationEvent ? (setAdReviewListener.onNavigationEvent) setadreviewlistener : null;
        if (onnavigationevent == null || (thOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult()) == null) {
            return null;
        }
        int i22 = extraCallback + 61;
        ICustomTabsCallback = i22 % 128;
        int i23 = i22 % 2;
        return thOnExtraCallbackWithResult.getClass().getSimpleName();
    }

    @Inject
    public r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg(@NotNull RemoteBundleSource remoteBundleSource, @NotNull r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY r8lambdavrqx_av3s_wv9pas1mgjxvtpcky, @NotNull r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0, @NotNull r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs r8lambda2mywpkacv8n5ptcbfsxgde7xkjs, @NotNull r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4, @NotNull MaxRewardedAdImplb maxRewardedAdImplb, @NotNull zzad zzadVar, @NotNull ebExternalSyntheticLambda0 ebexternalsyntheticlambda0, @NotNull r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow, @NotNull RnPhaseObserver rnPhaseObserver) {
        Intrinsics.checkNotNullParameter(remoteBundleSource, "");
        Intrinsics.checkNotNullParameter(r8lambdavrqx_av3s_wv9pas1mgjxvtpcky, "");
        Intrinsics.checkNotNullParameter(r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0, "");
        Intrinsics.checkNotNullParameter(r8lambda2mywpkacv8n5ptcbfsxgde7xkjs, "");
        Intrinsics.checkNotNullParameter(r8lambda2dedie2xf7declmcf5taijldvi4, "");
        Intrinsics.checkNotNullParameter(maxRewardedAdImplb, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(ebexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(r8lambdahdae14rp_yfkbgnstt68qt10iow, "");
        Intrinsics.checkNotNullParameter(rnPhaseObserver, "");
        this.IAuthTabCallbackDefault = remoteBundleSource;
        this.IAuthTabCallbackStub = r8lambdavrqx_av3s_wv9pas1mgjxvtpcky;
        this.IAuthTabCallback = r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0;
        this.onWarmupCompleted = r8lambda2mywpkacv8n5ptcbfsxgde7xkjs;
        this.onNavigationEvent = r8lambda2dedie2xf7declmcf5taijldvi4;
        this.asBinder = maxRewardedAdImplb;
        this.onTransact = zzadVar;
        this.getInterfaceDescriptor = ebexternalsyntheticlambda0;
        this.asInterface = r8lambdahdae14rp_yfkbgnstt68qt10iow;
        this.IAuthTabCallbackStubProxy = rnPhaseObserver;
        this.onExtraCallback = findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
    }

    public static final /* synthetic */ Regex IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 105;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Regex regex = onExtraCallbackWithResult;
        int i5 = i2 + 99;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return regex;
    }

    public static final /* synthetic */ r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 IAuthTabCallback(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg) {
        int i = 2 % 2;
        int i2 = extraCallback + 109;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0 = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.IAuthTabCallback;
        int i5 = i3 + 95;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0;
        }
        throw null;
    }

    public static final /* synthetic */ RemoteBundleSource IAuthTabCallbackStub(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        RemoteBundleSource remoteBundleSource = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.IAuthTabCallbackDefault;
        int i5 = i3 + 1;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return remoteBundleSource;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = (r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg) objArr[0];
        setAdReviewListener setadreviewlistener = (setAdReviewListener) objArr[1];
        String str = (String) objArr[2];
        RnBundleInfo.Source source = (RnBundleInfo.Source) objArr[3];
        int i = 2 % 2;
        int i2 = extraCallback + 27;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        RnBundleInfo rnBundleInfoOnWarmupCompleted = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onWarmupCompleted(setadreviewlistener, str, source);
        int i4 = extraCallback + 61;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return rnBundleInfoOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ MaxRewardedAdImplb onExtraCallback(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 35;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        MaxRewardedAdImplb maxRewardedAdImplb = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.asBinder;
        int i5 = i2 + 57;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return maxRewardedAdImplb;
    }

    public static final /* synthetic */ setAdReviewListener onExtraCallback(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, RemoteBundleResult remoteBundleResult, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        setAdReviewListener setadreviewlistener = (setAdReviewListener) onExtraCallbackWithResult(911606457, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, remoteBundleResult, str, str2, str3}, -911606456, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = extraCallback + 17;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return setadreviewlistener;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = (r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 93;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        RnPhaseObserver rnPhaseObserver = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.IAuthTabCallbackStubProxy;
        int i5 = i3 + 59;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return rnPhaseObserver;
        }
        throw null;
    }

    public static final /* synthetic */ r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY onExtraCallbackWithResult(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY r8lambdavrqx_av3s_wv9pas1mgjxvtpcky = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.IAuthTabCallbackStub;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return r8lambdavrqx_av3s_wv9pas1mgjxvtpcky;
    }

    public static final /* synthetic */ Object onNavigationEvent(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onExtraCallbackWithResult(maxAdViewImplExternalSyntheticLambda4, (access13800<? super Unit>) access13800Var);
        int i4 = extraCallback + 111;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 onNavigationEvent(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4 = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onNavigationEvent;
        if (i3 == 0) {
            return r8lambda2dedie2xf7declmcf5taijldvi4;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, String str, String str2, String str3, Long l, Date date, String str4, Map map) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 93;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onExtraCallback(str, str2, str3, l, date, str4, map);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, String str, String str2, String str3, String str4, Date date, String str5) {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onWarmupCompleted(str, str2, str3, str4, date, str5);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    public static final /* synthetic */ BundleMetadata onWarmupCompleted(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = extraCallback + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        BundleMetadata bundleMetadataIAuthTabCallback = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.IAuthTabCallback(str, str2, str3, str4);
        int i4 = ICustomTabsCallback + 85;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bundleMetadataIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, String str, String str2, String str3, String str4, boolean z, Date date, String str5, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onExtraCallback(str, str2, str3, str4, z, date, str5, access13800Var);
        int i4 = extraCallback + 59;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onWarmupCompleted(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, setAdReviewListener setadreviewlistener) {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            return (String) onExtraCallbackWithResult(-1919941836, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, setadreviewlistener}, 1919941836, iOnWarmupCompleted, iOnWarmupCompleted2);
        }
        int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted5 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted6 = zzgsa.onWarmupCompleted();
        String str = (String) onExtraCallbackWithResult(-1919941836, zzgsa.onWarmupCompleted(), iOnWarmupCompleted6, new Object[]{r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, setadreviewlistener}, 1919941836, iOnWarmupCompleted4, iOnWarmupCompleted5);
        int i3 = 37 / 0;
        return str;
    }

    public static final /* synthetic */ zzad onWarmupCompleted(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg) {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        zzad zzadVar = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onTransact;
        int i5 = i3 + 117;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final boolean onWarmupCompleted(@NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (!r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.IAuthTabCallback().onExtraCallbackWithResult(str)) {
                return false;
            }
            if (!(!r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.IAuthTabCallback().onExtraCallbackWithResult(str2))) {
                return Long.parseLong(str) > Long.parseLong(str2);
            }
            int i4 = onExtraCallback;
            int i5 = i4 + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 55;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
    }

    static {
        IAuthTabCallback_Parcel = 0;
        onExtraCallbackWithResult();
        Companion = new IAuthTabCallback(null);
        onExtraCallbackWithResult = new Regex("\\d{14}");
        int i = access000 + 109;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    @Override // o.logApiCall
    public Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Long l, @Nullable Date date, boolean z5, @Nullable String str5, boolean z6, @NotNull access13800<? super setAdReviewListener> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onWarmupCompleted(str, str3, str4, str2, date, l, z, z2, z3, z4, z5, z6, str5, null), access13800Var);
        int i2 = extraCallback + 33;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super setAdReviewListener>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean $allowBackgroundUpdate;
        final /* synthetic */ String $bundleName;
        final /* synthetic */ String $bundleURL;
        final /* synthetic */ String $cacheNamespace;
        final /* synthetic */ String $company;
        final /* synthetic */ boolean $isForceLoadAssets;
        final /* synthetic */ boolean $isForceLoadRemote;
        final /* synthetic */ boolean $isNebula;
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ Long $maxAge;
        final /* synthetic */ Date $minDeployedAt;
        final /* synthetic */ String $region;
        final /* synthetic */ boolean $skipBuiltInAssets;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(String str, String str2, String str3, String str4, Date date, Long l, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$bundleName = str;
            this.$region = str2;
            this.$company = str3;
            this.$bundleURL = str4;
            this.$minDeployedAt = date;
            this.$maxAge = l;
            this.$isForceLoadRemote = z;
            this.$isForceLoadAssets = z2;
            this.$isNebula = z3;
            this.$isRetry = z4;
            this.$allowBackgroundUpdate = z5;
            this.$skipBuiltInAssets = z6;
            this.$cacheNamespace = str5;
        }

        public static /* synthetic */ r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 onNavigationEvent(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, String str, Ref.ObjectRef objectRef, setAdReviewListener setadreviewlistener) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 r8lambda4jipudh4a44aigrlvbwbk0rztp4OnWarmupCompleted = onWarmupCompleted(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, str, objectRef, setadreviewlistener);
            if (i3 != 0) {
                int i4 = 44 / 0;
            }
            int i5 = IAuthTabCallback + 95;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return r8lambda4jipudh4a44aigrlvbwbk0rztp4OnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.this.new onWarmupCompleted(this.$bundleName, this.$region, this.$company, this.$bundleURL, this.$minDeployedAt, this.$maxAge, this.$isForceLoadRemote, this.$isForceLoadAssets, this.$isNebula, this.$isRetry, this.$allowBackgroundUpdate, this.$skipBuiltInAssets, this.$cacheNamespace, access13800Var);
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super setAdReviewListener> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 99;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super setAdReviewListener> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 67;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object[] objArr = {r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.this};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onExtraCallbackWithResult(-1364152509, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, 1364152511, iOnWarmupCompleted, iOnWarmupCompleted2);
            String str = this.$bundleName;
            String str2 = this.$region;
            String str3 = this.$company;
            RnCause rnCause = RnCause.USER_ENTRY;
            final r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.this;
            final String str4 = this.$bundleURL;
            Function1 function1 = new Function1() { // from class: im.toss.rn.toss.core.bundle.repository.BundleRepositoryImpl$loadBundle$2$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 95;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2 = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg;
                    if (i7 == 0) {
                        return r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onWarmupCompleted.onNavigationEvent(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2, str4, objectRef, (setAdReviewListener) obj2);
                    }
                    r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onWarmupCompleted.onNavigationEvent(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2, str4, objectRef, (setAdReviewListener) obj2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$bundleName, this.$minDeployedAt, this.$maxAge, this.$region, this.$company, this.$isForceLoadRemote, this.$isForceLoadAssets, this.$isNebula, this.$isRetry, this.$allowBackgroundUpdate, this.$skipBuiltInAssets, r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.this, this.$cacheNamespace, this.$bundleURL, objectRef, null);
            this.L$0 = access15400.onNavigationEvent(objectRef);
            this.label = 1;
            Object objIAuthTabCallback = rnPhaseObserver.IAuthTabCallback(str, str2, str3, rnCause, function1, (Function1) anonymousClass4, (access13800) this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                return objIAuthTabCallback;
            }
            int i5 = IAuthTabCallback;
            int i6 = i5 + 31;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 13;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return objOnWarmupCompleted;
        }

        private static final r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 onWarmupCompleted(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, String str, Ref.ObjectRef objectRef, setAdReviewListener setadreviewlistener) {
            int i = 2 % 2;
            r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 r8lambda4jipudh4a44aigrlvbwbk0rztp4 = new r8lambda4jipudH4a44aIGrlvbWbk0rzTp4(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onExtraCallback(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, setadreviewlistener, str, (RnBundleInfo.Source) objectRef.element), r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onWarmupCompleted(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, setadreviewlistener));
            int i2 = onWarmupCompleted + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return r8lambda4jipudh4a44aigrlvbwbk0rztp4;
        }

        /* renamed from: o.r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg$onWarmupCompleted$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function1<access13800<? super setAdReviewListener>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ boolean $allowBackgroundUpdate;
            final /* synthetic */ String $bundleName;
            final /* synthetic */ String $bundleURL;
            final /* synthetic */ String $cacheNamespace;
            final /* synthetic */ String $company;
            final /* synthetic */ boolean $isForceLoadAssets;
            final /* synthetic */ boolean $isForceLoadRemote;
            final /* synthetic */ boolean $isNebula;
            final /* synthetic */ boolean $isRetry;
            final /* synthetic */ Long $maxAge;
            final /* synthetic */ Date $minDeployedAt;
            final /* synthetic */ String $region;
            final /* synthetic */ boolean $skipBuiltInAssets;
            final /* synthetic */ Ref.ObjectRef<RnBundleInfo.Source> $source;
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            Object L$0;
            Object L$1;
            Object L$10;
            Object L$11;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            Object L$6;
            Object L$7;
            Object L$8;
            Object L$9;
            boolean Z$0;
            boolean Z$1;
            boolean Z$2;
            boolean Z$3;
            boolean Z$4;
            boolean Z$5;
            int label;
            final /* synthetic */ r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg this$0;
            private static char[] onWarmupCompleted = {64898, 64989, 64900, 64903, 64901, 64964, 64988, 64966, 64984};
            private static char onExtraCallback = 51242;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(String str, Date date, Long l, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, String str4, String str5, Ref.ObjectRef<RnBundleInfo.Source> objectRef, access13800<? super AnonymousClass4> access13800Var) {
                super(1, access13800Var);
                this.$bundleName = str;
                this.$minDeployedAt = date;
                this.$maxAge = l;
                this.$region = str2;
                this.$company = str3;
                this.$isForceLoadRemote = z;
                this.$isForceLoadAssets = z2;
                this.$isNebula = z3;
                this.$isRetry = z4;
                this.$allowBackgroundUpdate = z5;
                this.$skipBuiltInAssets = z6;
                this.this$0 = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg;
                this.$cacheNamespace = str4;
                this.$bundleURL = str5;
                this.$source = objectRef;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$bundleName, this.$minDeployedAt, this.$maxAge, this.$region, this.$company, this.$isForceLoadRemote, this.$isForceLoadAssets, this.$isNebula, this.$isRetry, this.$allowBackgroundUpdate, this.$skipBuiltInAssets, this.this$0, this.$cacheNamespace, this.$bundleURL, this.$source, access13800Var);
                int i2 = IAuthTabCallback + 11;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            public /* synthetic */ Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
                int i4 = onNavigationEvent + 81;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final Object onExtraCallbackWithResult(access13800<? super setAdReviewListener> access13800Var) throws Throwable {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(access13800Var);
                if (i3 == 0) {
                    objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                    int i4 = 35 / 0;
                } else {
                    objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = onNavigationEvent + 41;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                boolean z;
                int i3 = 2;
                int i4 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
                char[] cArr2 = onWarmupCompleted;
                char c = '0';
                boolean z2 = false;
                Object obj2 = null;
                if (cArr2 != null) {
                    int i5 = $10 + 71;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 29;
                        $11 = i8 % 128;
                        int i9 = i8 % i3;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 27 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 23138 - TextUtils.lastIndexOf("", c), -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i7++;
                            i3 = 2;
                            c = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 23139 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i10 = $11 + 107;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        i2 = i + 111;
                        cArr4[i2] = (char) (cArr[i2] + b);
                    } else {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b);
                    }
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i11 = $10 + 19;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            z = z2;
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 74 - ((Process.getThreadPriority(0) + 20) >> 6), Drawable.resolveOpacity(0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    z = false;
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29, TextUtils.getOffsetAfter("", 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    z = false;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            } else {
                                obj = null;
                                z = false;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i14 = $10 + 91;
                                    $11 = i14 % 128;
                                    int i15 = i14 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                                } else {
                                    int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                                    int i20 = $10 + 111;
                                    $11 = i20 % 128;
                                    int i21 = i20 % 2;
                                }
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                        z2 = z;
                    }
                }
                int i22 = $11 + 99;
                $10 = i22 % 128;
                int i23 = i22 % 2;
                for (int i24 = 0; i24 < i; i24++) {
                    cArr4[i24] = (char) (cArr4[i24] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                */
            public final java.lang.Object invokeSuspend(java.lang.Object r72) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 5711
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onWarmupCompleted.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        private static char onExtraCallback = 54755;
        private static char onExtraCallbackWithResult = 1796;
        private static char onNavigationEvent = 19089;
        private static char onWarmupCompleted = 43152;
        final /* synthetic */ String $bundleName;
        final /* synthetic */ String $bundleURL;
        final /* synthetic */ String $cacheNamespace;
        final /* synthetic */ String $company;
        final /* synthetic */ Date $minDeployedAt;
        final /* synthetic */ String $region;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, String str2, String str3, String str4, Date date, String str5, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$bundleName = str;
            this.$region = str2;
            this.$company = str3;
            this.$bundleURL = str4;
            this.$minDeployedAt = date;
            this.$cacheNamespace = str5;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.this.new onExtraCallbackWithResult(this.$bundleName, this.$region, this.$company, this.$bundleURL, this.$minDeployedAt, this.$cacheNamespace, access13800Var);
            int i2 = IAuthTabCallback + 87;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = asInterface + 83;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 77;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 113;
                $10 = i4 % 128;
                int i5 = 58224;
                if (i4 % 2 != 0) {
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >> 1];
                } else {
                    cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                }
                int i6 = i3;
                while (i6 < 16) {
                    int i7 = $11 + 59;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                    int i10 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onWarmupCompleted);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[1] = Integer.valueOf(i9);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cRed = (char) Color.red(i3);
                            int i11 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9;
                            int i12 = 12434 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1));
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, i11, i12, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), ImageFormat.getBitsPerPixel(0) + 11, 12434 - (ViewConfiguration.getFadingEdgeLength() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 16014), (ViewConfiguration.getWindowTouchSlop() >> 8) + 14, (ViewConfiguration.getFadingEdgeLength() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i13 = $10 + 69;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            objArr[0] = str;
        }

        static final class onNavigationEvent implements Function1<RemoteBundleResult, r8lambda4jipudH4a44aIGrlvbWbk0rzTp4> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ String onWarmupCompleted;

            onNavigationEvent(String str) {
                this.onWarmupCompleted = str;
            }

            public /* synthetic */ Object invoke(Object obj) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 63;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 r8lambda4jipudh4a44aigrlvbwbk0rztp4OnExtraCallback = onExtraCallback((RemoteBundleResult) obj);
                int i4 = IAuthTabCallback + 111;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return r8lambda4jipudh4a44aigrlvbwbk0rztp4OnExtraCallback;
                }
                throw null;
            }

            public final r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 onExtraCallback(RemoteBundleResult remoteBundleResult) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 63;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(remoteBundleResult, "");
                r8lambda4jipudH4a44aIGrlvbWbk0rzTp4 r8lambda4jipudh4a44aigrlvbwbk0rztp4OnNavigationEvent = MaxNativeAdLoaderImplc.onNavigationEvent(remoteBundleResult, this.onWarmupCompleted);
                int i4 = IAuthTabCallback + 69;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return r8lambda4jipudh4a44aigrlvbwbk0rztp4OnNavigationEvent;
            }
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function1<access13800<? super RemoteBundleResult>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ String $bundleName;
            final /* synthetic */ String $bundleURL;
            final /* synthetic */ String $cacheNamespace;
            final /* synthetic */ String $company;
            final /* synthetic */ Date $minDeployedAt;
            final /* synthetic */ String $region;
            int label;
            final /* synthetic */ r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, String str, String str2, String str3, String str4, Date date, String str5, access13800<? super onWarmupCompleted> access13800Var) {
                super(1, access13800Var);
                this.this$0 = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg;
                this.$bundleName = str;
                this.$bundleURL = str2;
                this.$region = str3;
                this.$company = str4;
                this.$minDeployedAt = date;
                this.$cacheNamespace = str5;
            }

            public final Object IAuthTabCallback(access13800<? super RemoteBundleResult> access13800Var) {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 9;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedCreate = create(access13800Var);
                if (i3 != 0) {
                    objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                    int i4 = 91 / 0;
                } else {
                    objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = IAuthTabCallback + 119;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, this.$bundleName, this.$bundleURL, this.$region, this.$company, this.$minDeployedAt, this.$cacheNamespace, access13800Var);
                int i2 = IAuthTabCallback + 109;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onwarmupcompleted;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
                int i4 = onWarmupCompleted + 79;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onWarmupCompleted + 11;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = this.this$0;
                String str = this.$bundleName;
                String str2 = this.$bundleURL;
                String str3 = this.$region;
                String str4 = this.$company;
                Date date = this.$minDeployedAt;
                String str5 = this.$cacheNamespace;
                this.label = 1;
                Object objOnWarmupCompleted2 = r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onWarmupCompleted(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, str, str2, str3, str4, false, date, str5, this);
                if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                    return objOnWarmupCompleted2;
                }
                int i5 = onWarmupCompleted + 23;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[PHI: r0
          0x006c: PHI (r0v51 java.lang.Object) = (r0v18 java.lang.Object), (r0v57 java.lang.Object) binds: [B:8:0x0034, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[PHI: r1
          0x0036: PHI (r1v5 int) = (r1v4 int), (r1v32 int) binds: [B:8:0x0034, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            RnCause rnCause;
            Object obj2;
            SuspendLambda suspendLambda;
            Object obj3;
            Object obj4;
            Object obj5;
            Throwable th;
            Object objOnWarmupCompleted;
            int i;
            String str;
            Object obj6;
            Object obj7;
            r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg;
            String str2;
            Object objIAuthTabCallback;
            RemoteBundleResult remoteBundleResult;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 19;
            asInterface = i3 % 128;
            Object obj8 = "region";
            SuspendLambda suspendLambda2 = "bundleName";
            Object onnavigationevent = "BundleRepositoryImpl";
            RnCause rnCause2 = "from";
            try {
                try {
                    if (i3 % 2 == 0) {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        int i4 = 36 / 0;
                        if (i == 0) {
                            ResultKt.onNavigationEvent(obj);
                            r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2 = r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.this;
                            String str3 = this.$bundleName;
                            String str4 = this.$region;
                            String str5 = this.$company;
                            String str6 = this.$bundleURL;
                            Date date = this.$minDeployedAt;
                            String str7 = this.$cacheNamespace;
                            Result.Companion companion = Result.Companion;
                            RnPhaseObserver rnPhaseObserver = (RnPhaseObserver) r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onExtraCallbackWithResult(-1364152509, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2}, 1364152511, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted());
                            RnCause rnCause3 = RnCause.BACKGROUND_UPDATE;
                            try {
                                onnavigationevent = new onNavigationEvent(str6);
                                SuspendLambda onwarmupcompleted = new onWarmupCompleted(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2, str3, str6, str4, str5, date, str7, null);
                                this.L$0 = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2;
                                this.L$1 = str3;
                                this.L$2 = str4;
                                this.L$3 = str5;
                                this.L$4 = access15400.onNavigationEvent(this);
                                this.I$0 = 0;
                                this.I$1 = 0;
                                this.label = 1;
                                obj3 = str3;
                                obj4 = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2;
                                rnCause = "from";
                                rnCause2 = rnCause3;
                                obj2 = "BundleRepositoryImpl";
                                suspendLambda = "bundleName";
                                suspendLambda2 = onwarmupcompleted;
                                obj7 = "region";
                                obj8 = this;
                            } catch (WebResourceResponseModel e) {
                                e = e;
                                rnCause = "from";
                                suspendLambda = "bundleName";
                                obj3 = "region";
                                obj4 = "company";
                                obj2 = "BundleRepositoryImpl";
                                Result.Companion companion2 = Result.Companion;
                                obj5 = Result.constructor-impl(ResultKt.createFailure(e));
                                Object obj9 = obj3;
                                String str8 = this.$bundleName;
                                String str9 = this.$region;
                                String str10 = this.$company;
                                th = Result.exceptionOrNull-impl(obj5);
                                if (th != null) {
                                }
                                return Unit.INSTANCE;
                            } catch (Exception e2) {
                                e = e2;
                                rnCause = "from";
                                suspendLambda = "bundleName";
                                obj3 = "region";
                                obj4 = "company";
                                obj2 = "BundleRepositoryImpl";
                                Result.Companion companion3 = Result.Companion;
                                obj5 = Result.constructor-impl(ResultKt.createFailure(e));
                                Object obj92 = obj3;
                                String str82 = this.$bundleName;
                                String str92 = this.$region;
                                String str102 = this.$company;
                                th = Result.exceptionOrNull-impl(obj5);
                                if (th != null) {
                                }
                                return Unit.INSTANCE;
                            }
                            try {
                                objIAuthTabCallback = rnPhaseObserver.IAuthTabCallback(str3, str4, str5, rnCause2, (Function1) onnavigationevent, (Function1) suspendLambda2, (access13800) obj8);
                                if (objIAuthTabCallback == objOnWarmupCompleted) {
                                    int i5 = IAuthTabCallback + 85;
                                    asInterface = i5 % 128;
                                    int i6 = i5 % 2;
                                    return objOnWarmupCompleted;
                                }
                                str2 = str4;
                                obj6 = obj3;
                                r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = obj4;
                                str = str5;
                            } catch (Exception e3) {
                                e = e3;
                                obj3 = obj7;
                                obj4 = "company";
                                Result.Companion companion32 = Result.Companion;
                                obj5 = Result.constructor-impl(ResultKt.createFailure(e));
                                Object obj922 = obj3;
                                String str822 = this.$bundleName;
                                String str922 = this.$region;
                                String str1022 = this.$company;
                                th = Result.exceptionOrNull-impl(obj5);
                                if (th != null) {
                                }
                                return Unit.INSTANCE;
                            } catch (WebResourceResponseModel e4) {
                                e = e4;
                                obj3 = obj7;
                                obj4 = "company";
                                Result.Companion companion22 = Result.Companion;
                                obj5 = Result.constructor-impl(ResultKt.createFailure(e));
                                Object obj9222 = obj3;
                                String str8222 = this.$bundleName;
                                String str9222 = this.$region;
                                String str10222 = this.$company;
                                th = Result.exceptionOrNull-impl(obj5);
                                if (th != null) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i7 = asInterface + 3;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            str = (String) this.L$3;
                            String str11 = (String) this.L$2;
                            String str12 = (String) this.L$1;
                            r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg3 = (r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg) this.L$0;
                            ResultKt.onNavigationEvent(obj);
                            obj6 = str12;
                            obj2 = "BundleRepositoryImpl";
                            suspendLambda = "bundleName";
                            obj7 = "region";
                            r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg3;
                            str2 = str11;
                            rnCause = "from";
                            objIAuthTabCallback = obj;
                        }
                        remoteBundleResult = (RemoteBundleResult) objIAuthTabCallback;
                        try {
                            if (!(remoteBundleResult instanceof RemoteBundleResult.Success)) {
                                int i9 = IAuthTabCallback + 21;
                                asInterface = i9 % 128;
                                int i10 = i9 % 2;
                                try {
                                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(rnCause, obj2);
                                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(suspendLambda, obj6);
                                    Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(obj7, str2);
                                    Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("company", str);
                                    Pair[] pairArr = new Pair[4];
                                    pairArr[0] = pairIAuthTabCallback;
                                    pairArr[1] = pairIAuthTabCallback2;
                                    pairArr[2] = pairIAuthTabCallback3;
                                    pairArr[3] = pairIAuthTabCallback4;
                                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "background_update_completed", access8100.onWarmupCompleted(pairArr), (String) null, false, (String) null, 56, (Object) null);
                                    r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onNavigationEvent(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, obj6, "backgroundUpdate", "success", null, null, "Background update completed", null, 88, null);
                                    obj3 = obj7;
                                    obj4 = "company";
                                } catch (WebResourceResponseModel e5) {
                                    e = e5;
                                    obj3 = obj7;
                                    obj4 = "company";
                                    Result.Companion companion222 = Result.Companion;
                                    obj5 = Result.constructor-impl(ResultKt.createFailure(e));
                                    Object obj92222 = obj3;
                                    String str82222 = this.$bundleName;
                                    String str92222 = this.$region;
                                    String str102222 = this.$company;
                                    th = Result.exceptionOrNull-impl(obj5);
                                    if (th != null) {
                                    }
                                    return Unit.INSTANCE;
                                } catch (Exception e6) {
                                    e = e6;
                                    obj3 = obj7;
                                    obj4 = "company";
                                    Result.Companion companion322 = Result.Companion;
                                    obj5 = Result.constructor-impl(ResultKt.createFailure(e));
                                    Object obj922222 = obj3;
                                    String str822222 = this.$bundleName;
                                    String str922222 = this.$region;
                                    String str1022222 = this.$company;
                                    th = Result.exceptionOrNull-impl(obj5);
                                    if (th != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                if (!(remoteBundleResult instanceof RemoteBundleResult.Error)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                obj3 = obj7;
                                obj4 = "company";
                                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "background_update_failed", ((RemoteBundleResult.Error) remoteBundleResult).onWarmupCompleted(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(rnCause, obj2), getWrite.IAuthTabCallback(suspendLambda, obj6), getWrite.IAuthTabCallback(obj7, str2), getWrite.IAuthTabCallback("company", str), getWrite.IAuthTabCallback("error", ((RemoteBundleResult.Error) remoteBundleResult).onWarmupCompleted().getMessage())}));
                                String message = ((RemoteBundleResult.Error) remoteBundleResult).onWarmupCompleted().getMessage();
                                if (message == null) {
                                    Object[] objArr = new Object[1];
                                    a(new char[]{13618, 46898, 33760, 30439, 20548, 51625, 60680, 13132}, TextUtils.lastIndexOf("", '0', 0) + 8, objArr);
                                    message = ((String) objArr[0]).intern();
                                    int i11 = asInterface + 3;
                                    IAuthTabCallback = i11 % 128;
                                    int i12 = i11 % 2;
                                }
                                r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onNavigationEvent(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, obj6, "backgroundUpdate", "error", null, null, "Background update failed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("error", message), getWrite.IAuthTabCallback("errorType", ((RemoteBundleResult.Error) remoteBundleResult).onWarmupCompleted().getClass().getSimpleName())}), 24, null);
                            }
                            obj5 = Result.constructor-impl(Unit.INSTANCE);
                            int i13 = IAuthTabCallback + 47;
                            asInterface = i13 % 128;
                            int i14 = i13 % 2;
                        } catch (Exception e7) {
                            e = e7;
                            Result.Companion companion3222 = Result.Companion;
                            obj5 = Result.constructor-impl(ResultKt.createFailure(e));
                            Object obj9222222 = obj3;
                            String str8222222 = this.$bundleName;
                            String str9222222 = this.$region;
                            String str10222222 = this.$company;
                            th = Result.exceptionOrNull-impl(obj5);
                            if (th != null) {
                            }
                            return Unit.INSTANCE;
                        } catch (WebResourceResponseModel e8) {
                            e = e8;
                            Result.Companion companion2222 = Result.Companion;
                            obj5 = Result.constructor-impl(ResultKt.createFailure(e));
                            Object obj92222222 = obj3;
                            String str82222222 = this.$bundleName;
                            String str92222222 = this.$region;
                            String str102222222 = this.$company;
                            th = Result.exceptionOrNull-impl(obj5);
                            if (th != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        if (i != 0) {
                        }
                        remoteBundleResult = (RemoteBundleResult) objIAuthTabCallback;
                        if (!(remoteBundleResult instanceof RemoteBundleResult.Success)) {
                        }
                        obj5 = Result.constructor-impl(Unit.INSTANCE);
                        int i132 = IAuthTabCallback + 47;
                        asInterface = i132 % 128;
                        int i142 = i132 % 2;
                    }
                } catch (CancellationException e9) {
                    throw e9;
                }
            } catch (WebResourceResponseModel e10) {
                e = e10;
                rnCause = rnCause2;
                obj2 = onnavigationevent;
                suspendLambda = suspendLambda2;
                obj3 = obj8;
            } catch (Exception e11) {
                e = e11;
                rnCause = rnCause2;
                obj2 = onnavigationevent;
                suspendLambda = suspendLambda2;
                obj3 = obj8;
            }
            Object obj922222222 = obj3;
            String str822222222 = this.$bundleName;
            String str922222222 = this.$region;
            String str1022222222 = this.$company;
            th = Result.exceptionOrNull-impl(obj5);
            if (th != null) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "background_update_unexpected_error", th, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(rnCause, obj2), getWrite.IAuthTabCallback(suspendLambda, str822222222), getWrite.IAuthTabCallback(obj922222222, str922222222), getWrite.IAuthTabCallback(obj4, str1022222222), getWrite.IAuthTabCallback("error", th.getMessage())}));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(access100)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') - 25, 10278 - View.resolveSizeAndState(0, 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 54 - ExpandableListView.getPackedPositionChild(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 2168, 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 33;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $10 + 37;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0') + 56, View.resolveSizeAndState(0, 0, 0) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i11 = $10 + 125;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RnBundleInfo onWarmupCompleted(setAdReviewListener setadreviewlistener, String str, RnBundleInfo.Source source) {
        setAdReviewListener.IAuthTabCallback iAuthTabCallback;
        String str2;
        Object obj;
        Long l;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Object obj2 = null;
        if (setadreviewlistener instanceof setAdReviewListener.IAuthTabCallback) {
            int i5 = i3 + 103;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            iAuthTabCallback = (setAdReviewListener.IAuthTabCallback) setadreviewlistener;
        } else {
            iAuthTabCallback = null;
        }
        if (iAuthTabCallback != null) {
            int i6 = ICustomTabsCallback + 49;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            setRequestListener setrequestlistenerIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
            if (setrequestlistenerIAuthTabCallback != null) {
                String strOnExtraCallback = setrequestlistenerIAuthTabCallback.onExtraCallback();
                if (strOnExtraCallback.length() <= 0) {
                    int i8 = ICustomTabsCallback + 79;
                    extraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    str2 = null;
                } else {
                    str2 = strOnExtraCallback;
                }
                String strOnWarmupCompleted = setrequestlistenerIAuthTabCallback.onWarmupCompleted();
                if (strOnWarmupCompleted != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        obj = Result.constructor-impl(Long.valueOf(new File(strOnWarmupCompleted).length()));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (Result.onExtraCallback(obj)) {
                        obj = null;
                    }
                    Long l2 = (Long) obj;
                    if (l2 != null) {
                        int i10 = extraCallback + 101;
                        ICustomTabsCallback = i10 % 128;
                        int i11 = i10 % 2;
                        l = l2.longValue() <= 0 ? null : l2;
                    }
                }
                return new RnBundleInfo(source, (String) null, (String) null, (String) null, str, str2, (Integer) null, l, (Long) null, (RnCause) null, (RnBundleInfo.Role) null, (List) null, (Double) null, 8014, (DefaultConstructorMarker) null);
            }
        }
        return new RnBundleInfo(source, (String) null, (String) null, (String) null, str, (String) null, (Integer) null, (Long) null, (Long) null, (RnCause) null, (RnBundleInfo.Role) null, (List) null, (Double) null, 8174, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = (r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg) objArr[0];
        RemoteBundleResult remoteBundleResult = (RemoteBundleResult) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!(remoteBundleResult instanceof RemoteBundleResult.Success)) {
            if (!(remoteBundleResult instanceof RemoteBundleResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            RemoteBundleResult.Error error = (RemoteBundleResult.Error) remoteBundleResult;
            String message = error.onWarmupCompleted().getMessage();
            if (message == null) {
                Object[] objArr2 = new Object[1];
                a(8 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, new char[]{65535, 65534, 65531, 65534, 5, 65534, 7}, true, ExpandableListView.getPackedPositionType(0L) + 119, objArr2);
                message = ((String) objArr2[0]).intern();
            }
            onNavigationEvent(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, str, "remote", "error", null, null, "Remote fetch failed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("error", message), getWrite.IAuthTabCallback("errorType", error.onWarmupCompleted().getClass().getSimpleName())}), 24, null);
            return new setAdReviewListener.onNavigationEvent(error.onWarmupCompleted(), "Failed to load bundle " + str + ": " + error.onWarmupCompleted().getMessage());
        }
        RemoteBundleResult.Success success = (RemoteBundleResult.Success) remoteBundleResult;
        setRequestListener setrequestlistenerIAuthTabCallback = success.IAuthTabCallback();
        if (success.onExtraCallbackWithResult() != 304) {
            int i4 = extraCallback + 41;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                setrequestlistenerIAuthTabCallback.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strOnExtraCallback = setrequestlistenerIAuthTabCallback.onExtraCallback();
            if (strOnExtraCallback == null) {
                strOnExtraCallback = "";
            }
            r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.asBinder.onExtraCallback(str, str2, str3, strOnExtraCallback);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "crash_history_cleared", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "BundleRepositoryImpl"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("region", str2), getWrite.IAuthTabCallback("company", str3), getWrite.IAuthTabCallback("deploymentId", strOnExtraCallback)}), (String) null, false, (String) null, 56, (Object) null);
        }
        String strOnExtraCallback2 = setrequestlistenerIAuthTabCallback.onExtraCallback();
        if (strOnExtraCallback2 == null) {
            int i5 = ICustomTabsCallback + 97;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            strOnExtraCallback2 = "";
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("deploymentId", strOnExtraCallback2);
        String strRequestPostMessageChannelWithExtras = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onTransact.requestPostMessageChannelWithExtras();
        onNavigationEvent(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, str, "remote", "success", null, null, "Downloaded from remote CDN", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("reactNativeVersion", strRequestPostMessageChannelWithExtras != null ? strRequestPostMessageChannelWithExtras : "")}), 24, null);
        return new setAdReviewListener.IAuthTabCallback(setrequestlistenerIAuthTabCallback);
    }

    private final Object onExtraCallback(String str, String str2, String str3, String str4, boolean z, Date date, String str5, access13800<? super RemoteBundleResult> access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = this.IAuthTabCallbackDefault.onNavigationEvent(str, str2, str3, str4, z, date, str5, access13800Var);
        int i4 = extraCallback + 39;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r12 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r12 = 78 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (o.MaxRewardedAdImplb.onExtraCallback(r11.asBinder, r12, r13, r14, r15.onNavigationEvent(), 0, 16, null) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r12 = o.r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.ICustomTabsCallback + 107;
        o.r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.extraCallback = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if ((r12 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r15 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r15 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r12 = o.r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.ICustomTabsCallback + 39;
        o.r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.extraCallback = r12 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final BundleMetadata IAuthTabCallback(String str, String str2, String str3, String str4) {
        BundleMetadata bundleMetadataOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            bundleMetadataOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(str, str2, str3, str4);
            int i3 = 41 / 0;
        } else {
            bundleMetadataOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(str, str2, str3, str4);
        }
    }

    private final void onWarmupCompleted(String str, String str2, String str3, String str4, Date date, String str5) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(this.onExtraCallback, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(str, str3, str4, str2, date, str5, null), 3, (Object) null);
        int i2 = ICustomTabsCallback + 105;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void onNavigationEvent(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, String str, String str2, String str3, Long l, Date date, String str4, Map map, int i, Object obj) throws Throwable {
        Date date2;
        String str5;
        Map mapOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 83;
        int i4 = i3 % 128;
        extraCallback = i4;
        Long l2 = (i3 % 2 == 0 ? (i & 8) == 0 : (i & 95) == 0) ? l : null;
        if ((i & 16) != 0) {
            int i5 = i4 + 1;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            date2 = null;
        } else {
            date2 = date;
        }
        if ((i & 32) != 0) {
            int i7 = i4 + 1;
            ICustomTabsCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 66 / 0;
            }
            str5 = null;
        } else {
            str5 = str4;
        }
        if ((i & 64) != 0) {
            int i9 = i4 + 91;
            ICustomTabsCallback = i9 % 128;
            int i10 = i9 % 2;
            mapOnNavigationEvent = access8100.onNavigationEvent();
        } else {
            mapOnNavigationEvent = map;
        }
        r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onExtraCallback(str, str2, str3, l2, date2, str5, mapOnNavigationEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(String str, String str2, String str3, Long l, Date date, String str4, Map<String, ? extends Object> map) throws Throwable {
        String str5;
        Object obj;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (str4 != null) {
            str5 = " - " + str4;
            if (str5 == null) {
                int i3 = ICustomTabsCallback + 9;
                extraCallback = i3 % 128;
                int i4 = i3 % 2;
                str5 = "";
            }
        }
        String str6 = "BundleFetchInfo: " + str2 + " result=" + str3 + str5;
        auth authVar = auth.onNavigationEvent;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.put("bundleName", str);
        mapOnExtraCallback.put("source", str2);
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0) + 6, 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{6, 65533, 5, 3, 65526, 4}, false, 118 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), str3);
        if (l == null) {
            int i5 = ICustomTabsCallback + 123;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            obj = "null";
        } else {
            obj = l;
        }
        mapOnExtraCallback.put("maxAge", obj.toString());
        mapOnExtraCallback.put("minDeployedAt", (date != null ? date : "null").toString());
        if (str4 != null) {
            mapOnExtraCallback.put("detail", str4);
        }
        mapOnExtraCallback.putAll(map);
        Unit unit = Unit.INSTANCE;
        auth.IAuthTabCallback(authVar, str6, access8100.onExtraCallbackWithResult(mapOnExtraCallback), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
    }

    public Object onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.IAuthTabCallback(str, str2, str3, str4);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 77;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.logApiCall
    public Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onWarmupCompleted();
        this.asBinder.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 43;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r9.onExtraCallback((java.util.List) r3, r1) == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // o.logApiCall
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        asInterface asinterface;
        Object obj;
        r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg;
        int i = 2 % 2;
        if (access13800Var instanceof asInterface) {
            int i2 = ICustomTabsCallback + 101;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            asinterface = (asInterface) access13800Var;
            int i4 = asinterface.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = ICustomTabsCallback + 15;
                extraCallback = i5 % 128;
                int i6 = i5 % 2;
                asinterface.label = i4 - 2147483648;
                int i7 = extraCallback + 15;
                ICustomTabsCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 / 2;
                }
            } else {
                asinterface = new asInterface(access13800Var);
            }
        }
        Object obj2 = asinterface.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = asinterface.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(obj2);
            r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs r8lambda2mywpkacv8n5ptcbfsxgde7xkjs = this.onWarmupCompleted;
            asinterface.L$0 = access15400.onNavigationEvent(str);
            asinterface.L$1 = this;
            asinterface.label = 1;
            Object objIAuthTabCallback = r8lambda2mywpkacv8n5ptcbfsxgde7xkjs.IAuthTabCallback(str, asinterface);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                int i10 = extraCallback + 33;
                ICustomTabsCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                obj = objIAuthTabCallback;
                r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = this;
            }
            return objOnWarmupCompleted;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj2);
            int i11 = extraCallback + 17;
            ICustomTabsCallback = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 4 / 5;
            }
            return Unit.INSTANCE;
        }
        r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2 = (r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg) asinterface.L$1;
        String str2 = (String) asinterface.L$0;
        ResultKt.onNavigationEvent(obj2);
        r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg2;
        str = str2;
        obj = obj2;
        asinterface.L$0 = access15400.onNavigationEvent(str);
        asinterface.L$1 = null;
        asinterface.label = 2;
    }

    private final Object onExtraCallback(List<MaxAdViewImplExternalSyntheticLambda4> list, access13800<? super List<Unit>> access13800Var) {
        int i = 2 % 2;
        Object objOnWarmupCompleted = isNeedUnzip.onWarmupCompleted(new asBinder(list, this, null), access13800Var);
        int i2 = ICustomTabsCallback + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return objOnWarmupCompleted;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends Unit>>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ List<MaxAdViewImplExternalSyntheticLambda4> $candidates;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(List<MaxAdViewImplExternalSyntheticLambda4> list, r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$candidates = list;
            this.this$0 = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super List<Unit>> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$candidates, this.this$0, access13800Var);
            asbinder.L$0 = obj;
            int i2 = IAuthTabCallback + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            final /* synthetic */ MaxAdViewImplExternalSyntheticLambda4 $candidate;
            int label;
            final /* synthetic */ r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg;
                this.$candidate = maxAdViewImplExternalSyntheticLambda4;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$candidate, access13800Var);
                int i2 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                Object objOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                    int i3 = 55 / 0;
                } else {
                    objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                }
                int i4 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = this.this$0;
                    MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4 = this.$candidate;
                    this.label = 1;
                    if (r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg.onNavigationEvent(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, maxAdViewImplExternalSyntheticLambda4, this) == objOnWarmupCompleted) {
                        int i3 = onNavigationEvent + 103;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                Unit unit = Unit.INSTANCE;
                int i5 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 61;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            List<MaxAdViewImplExternalSyntheticLambda4> list = this.$candidates;
            r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, (MaxAdViewImplExternalSyntheticLambda4) it.next(), null), 3, (Object) null));
            }
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.label = 1;
            Object objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList, this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                return objIAuthTabCallback;
            }
            int i5 = onNavigationEvent + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnWarmupCompleted;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
        onExtraCallback onextracallback;
        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda42;
        RemoteBundleSource remoteBundleSourceIAuthTabCallbackStub;
        String strOnExtraCallbackWithResult;
        String strAsBinder;
        String strOnNavigationEvent;
        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda43;
        Object error;
        Throwable th;
        RemoteBundleResult remoteBundleResult;
        int i = 2 % 2;
        int i2 = extraCallback + 115;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (access13800Var instanceof onExtraCallback) {
            int i5 = i3 + 7;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = ((onExtraCallback) access13800Var).label;
                obj.hashCode();
                throw null;
            }
            onextracallback = (onExtraCallback) access13800Var;
            int i7 = onextracallback.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i7 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        onExtraCallback onextracallback2 = onextracallback;
        Object objIAuthTabCallback = onextracallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = onextracallback2.label;
        try {
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                maxAdViewImplExternalSyntheticLambda43 = (MaxAdViewImplExternalSyntheticLambda4) onextracallback2.L$0;
                try {
                    ResultKt.onNavigationEvent(objIAuthTabCallback);
                    try {
                        error = Result.constructor-impl(objIAuthTabCallback);
                    } catch (WebResourceResponseModel e) {
                        e = e;
                        maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda43;
                        Result.Companion companion = Result.Companion;
                        error = Result.constructor-impl(ResultKt.createFailure(e));
                        maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
                        th = Result.exceptionOrNull-impl(error);
                        if (th != null) {
                        }
                        remoteBundleResult = (RemoteBundleResult) error;
                        if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        e = e2;
                        maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda43;
                        Result.Companion companion2 = Result.Companion;
                        error = Result.constructor-impl(ResultKt.createFailure(e));
                        maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
                        th = Result.exceptionOrNull-impl(error);
                        if (th != null) {
                        }
                        remoteBundleResult = (RemoteBundleResult) error;
                        if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Exception e3) {
                    e = e3;
                    maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda43;
                    Result.Companion companion22 = Result.Companion;
                    error = Result.constructor-impl(ResultKt.createFailure(e));
                    maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
                    th = Result.exceptionOrNull-impl(error);
                    if (th != null) {
                    }
                    remoteBundleResult = (RemoteBundleResult) error;
                    if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                    }
                    return Unit.INSTANCE;
                } catch (WebResourceResponseModel e4) {
                    e = e4;
                    maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda43;
                    Result.Companion companion3 = Result.Companion;
                    error = Result.constructor-impl(ResultKt.createFailure(e));
                    maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
                    th = Result.exceptionOrNull-impl(error);
                    if (th != null) {
                    }
                    remoteBundleResult = (RemoteBundleResult) error;
                    if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                    }
                    return Unit.INSTANCE;
                }
                th = Result.exceptionOrNull-impl(error);
                if (th != null) {
                    error = new RemoteBundleResult.Error(th, null, 2, null);
                }
                remoteBundleResult = (RemoteBundleResult) error;
                if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "updateBuiltInBundles: 내장 번들 fetch 성공", onWarmupCompleted(maxAdViewImplExternalSyntheticLambda43), (String) null, false, (String) null, 56, (Object) null);
                } else {
                    if (!(remoteBundleResult instanceof RemoteBundleResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i9 = ICustomTabsCallback + 89;
                    extraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "updateBuiltInBundles: 내장 번들 fetch에 실패했습니다.", ((RemoteBundleResult.Error) remoteBundleResult).onWarmupCompleted(), onWarmupCompleted(maxAdViewImplExternalSyntheticLambda43));
                        int i10 = 74 / 0;
                    } else {
                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "updateBuiltInBundles: 내장 번들 fetch에 실패했습니다.", ((RemoteBundleResult.Error) remoteBundleResult).onWarmupCompleted(), onWarmupCompleted(maxAdViewImplExternalSyntheticLambda43));
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            String str = (String) onExtraCallbackWithResult(-2120248607, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{this, maxAdViewImplExternalSyntheticLambda4}, 2120248610, iOnWarmupCompleted, iOnWarmupCompleted2);
            if (str == null) {
                int i11 = extraCallback + 69;
                ICustomTabsCallback = i11 % 128;
                int i12 = i11 % 2;
                return Unit.INSTANCE;
            }
            try {
                Result.Companion companion4 = Result.Companion;
                remoteBundleSourceIAuthTabCallbackStub = IAuthTabCallbackStub(this);
                strOnExtraCallbackWithResult = maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult();
                strAsBinder = maxAdViewImplExternalSyntheticLambda4.asBinder();
                strOnNavigationEvent = maxAdViewImplExternalSyntheticLambda4.onNavigationEvent();
                maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda4;
            } catch (Exception e5) {
                e = e5;
                maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda4;
            } catch (WebResourceResponseModel e6) {
                e = e6;
                maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda4;
            }
            try {
                onextracallback2.L$0 = maxAdViewImplExternalSyntheticLambda42;
                onextracallback2.L$1 = access15400.onNavigationEvent(str);
                onextracallback2.L$2 = access15400.onNavigationEvent(onextracallback2);
                onextracallback2.I$0 = 0;
                onextracallback2.I$1 = 0;
                onextracallback2.label = 1;
                try {
                    objIAuthTabCallback = RemoteBundleSource.IAuthTabCallback(remoteBundleSourceIAuthTabCallbackStub, strOnExtraCallbackWithResult, str, strAsBinder, strOnNavigationEvent, false, null, null, onextracallback2, 112, null);
                } catch (Exception e7) {
                    e = e7;
                    Result.Companion companion222 = Result.Companion;
                    error = Result.constructor-impl(ResultKt.createFailure(e));
                    maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
                    th = Result.exceptionOrNull-impl(error);
                    if (th != null) {
                    }
                    remoteBundleResult = (RemoteBundleResult) error;
                    if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                    }
                    return Unit.INSTANCE;
                } catch (WebResourceResponseModel e8) {
                    e = e8;
                    Result.Companion companion32 = Result.Companion;
                    error = Result.constructor-impl(ResultKt.createFailure(e));
                    maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
                    th = Result.exceptionOrNull-impl(error);
                    if (th != null) {
                    }
                    remoteBundleResult = (RemoteBundleResult) error;
                    if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (WebResourceResponseModel e9) {
                e = e9;
                Result.Companion companion322 = Result.Companion;
                error = Result.constructor-impl(ResultKt.createFailure(e));
                maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
                th = Result.exceptionOrNull-impl(error);
                if (th != null) {
                }
                remoteBundleResult = (RemoteBundleResult) error;
                if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                }
                return Unit.INSTANCE;
            } catch (Exception e10) {
                e = e10;
                Result.Companion companion2222 = Result.Companion;
                error = Result.constructor-impl(ResultKt.createFailure(e));
                maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
                th = Result.exceptionOrNull-impl(error);
                if (th != null) {
                }
                remoteBundleResult = (RemoteBundleResult) error;
                if (remoteBundleResult instanceof RemoteBundleResult.Success) {
                }
                return Unit.INSTANCE;
            }
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
            error = Result.constructor-impl(objIAuthTabCallback);
            th = Result.exceptionOrNull-impl(error);
            if (th != null) {
            }
            remoteBundleResult = (RemoteBundleResult) error;
            if (remoteBundleResult instanceof RemoteBundleResult.Success) {
            }
            return Unit.INSTANCE;
            maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda42;
            th = Result.exceptionOrNull-impl(error);
            if (th != null) {
            }
            remoteBundleResult = (RemoteBundleResult) error;
            if (remoteBundleResult instanceof RemoteBundleResult.Success) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Object obj;
        String strIAuthTabCallback;
        r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg = (r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg) objArr[0];
        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4 = (MaxAdViewImplExternalSyntheticLambda4) objArr[1];
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            strIAuthTabCallback = r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.IAuthTabCallback(maxAdViewImplExternalSyntheticLambda4);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
            int i2 = extraCallback + 33;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (strIAuthTabCallback != null) {
            int i4 = ICustomTabsCallback + 69;
            extraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                StringsKt.isBlank(strIAuthTabCallback);
                throw null;
            }
            if (!StringsKt.isBlank(strIAuthTabCallback)) {
                obj = Result.constructor-impl(strIAuthTabCallback + maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult() + TossSecRoute.Main.PATH + r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.asInterface.onWarmupCompleted() + "/rn84");
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    int i5 = ICustomTabsCallback + 15;
                    extraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "updateBuiltInBundles: bundle base url을 찾을 수 없습니다.", th2, r8lambdaqgn1zd5jkubz_mi_zblgk1awifg.onWarmupCompleted(maxAdViewImplExternalSyntheticLambda4));
                }
                return (String) (Result.onExtraCallback(obj) ? null : obj);
            }
        }
        throw new IllegalArgumentException(("Cannot find bundle base url region=" + maxAdViewImplExternalSyntheticLambda4.asBinder() + " company=" + maxAdViewImplExternalSyntheticLambda4.onNavigationEvent()).toString());
    }

    private final String IAuthTabCallback(MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4) throws Throwable {
        int i = 2 % 2;
        String strAsBinder = maxAdViewImplExternalSyntheticLambda4.asBinder();
        int iHashCode = strAsBinder.hashCode();
        if (iHashCode != 3124) {
            int i2 = extraCallback + 115;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0 ? iHashCode == 3248 : iHashCode == 7050) {
                if (strAsBinder.equals("eu")) {
                    int i3 = extraCallback + 65;
                    ICustomTabsCallback = i3 % 128;
                    int i4 = i3 % 2;
                    String strOnNavigationEvent = maxAdViewImplExternalSyntheticLambda4.onNavigationEvent();
                    Object[] objArr = new Object[1];
                    a((ViewConfiguration.getLongPressTimeout() >> 16) + 4, TextUtils.lastIndexOf("", '0', 0) + 3, new char[]{5, 65529, 65531, '\b'}, true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 113, objArr);
                    if (Intrinsics.areEqual(strOnNavigationEvent, ((String) objArr[0]).intern())) {
                        return this.onTransact.ICustomTabsService_Parcel();
                    }
                    return null;
                }
            } else if (iHashCode == 3431 && strAsBinder.equals("kr")) {
                String strOnNavigationEvent2 = maxAdViewImplExternalSyntheticLambda4.onNavigationEvent();
                Object[] objArr2 = new Object[1];
                a((Process.myTid() >> 22) + 4, TextUtils.indexOf("", "", 0, 0) + 2, new char[]{5, 65529, 65531, '\b'}, true, Color.alpha(0) + 113, objArr2);
                if (Intrinsics.areEqual(strOnNavigationEvent2, ((String) objArr2[0]).intern())) {
                    return this.onTransact.warmup();
                }
                if (Intrinsics.areEqual(strOnNavigationEvent2, "bank")) {
                    return this.onTransact.ICustomTabsServiceDefault();
                }
                int i5 = extraCallback + 19;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }
        } else if (strAsBinder.equals("au")) {
            String strOnNavigationEvent3 = maxAdViewImplExternalSyntheticLambda4.onNavigationEvent();
            a(Color.alpha(0) + 4, 2 - View.MeasureSpec.getSize(0), new char[]{5, 65529, 65531, '\b'}, true, 114 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new Object[1]);
            if (!Intrinsics.areEqual(strOnNavigationEvent3, ((String) r3[0]).intern())) {
                return null;
            }
            String strRequestPostMessageChannel = this.onTransact.requestPostMessageChannel();
            int i7 = ICustomTabsCallback + 35;
            extraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 10 / 0;
            }
            return strRequestPostMessageChannel;
        }
        return null;
    }

    private final Map<String, String> onWarmupCompleted(MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "BundleRepositoryImpl"), getWrite.IAuthTabCallback("assetName", maxAdViewImplExternalSyntheticLambda4.onWarmupCompleted()), getWrite.IAuthTabCallback("region", maxAdViewImplExternalSyntheticLambda4.asBinder()), getWrite.IAuthTabCallback("company", maxAdViewImplExternalSyntheticLambda4.onNavigationEvent()), getWrite.IAuthTabCallback("bundleName", maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult())});
        int i4 = extraCallback + 61;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return mapOnWarmupCompleted;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:23|24|25|(1:78)|40|41|69|42|(10:45|74|46|(1:50)|51|83|(9:34|72|35|36|76|37|82|(7:39|78|40|41|69|42|(0))|32)|81|66|67)|68) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r0 != r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0164, code lost:
    
        r7 = r5;
        r9 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r21v0, types: [o.r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg] */
    /* JADX WARN: Type inference failed for: r7v1, types: [o.MaxAdViewImplExternalSyntheticLambda4] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17, types: [int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e0 -> B:78:0x00f5). Please report as a decompilation issue!!! */
    @Override // o.logApiCall
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        String str2;
        String str3;
        Iterator it;
        Exception e;
        Iterator it2;
        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4;
        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda42;
        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda43;
        setRequestListener setrequestlistener;
        setRequestListener setrequestlistener2;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i2 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object objIAuthTabCallback = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onnavigationevent.label;
        if (i3 != 0) {
            int i4 = ICustomTabsCallback;
            int i5 = i4 + 51;
            extraCallback = i5 % 128;
            ?? r9 = i5 % 2;
            if (i3 != 1) {
                int i6 = i4 + 105;
                ?? r7 = i6 % 128;
                extraCallback = r7;
                ?? r8 = i6 % 2;
                try {
                } catch (Exception e2) {
                    e = e2;
                    it = r8;
                    str3 = r9;
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "invalidateCachedOldBundle: 내장 번들 캐시 비교에 실패했습니다.", e, onWarmupCompleted(r7));
                    int i7 = ICustomTabsCallback + 87;
                    extraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                if (r8 == 0 ? i3 != 2 : i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    setrequestlistener = (setRequestListener) onnavigationevent.L$3;
                    MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda44 = (MaxAdViewImplExternalSyntheticLambda4) onnavigationevent.L$2;
                    Iterator it3 = (Iterator) onnavigationevent.L$1;
                    String str4 = (String) onnavigationevent.L$0;
                    ResultKt.onNavigationEvent(objIAuthTabCallback);
                    it2 = it3;
                    str3 = str4;
                    maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda44;
                    setrequestlistener2 = (setRequestListener) objIAuthTabCallback;
                    if (setrequestlistener2 != null) {
                        r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4.onNavigationEvent(this.onNavigationEvent, maxAdViewImplExternalSyntheticLambda43.onExtraCallbackWithResult(), maxAdViewImplExternalSyntheticLambda43.asBinder(), maxAdViewImplExternalSyntheticLambda43.onNavigationEvent(), null, 8, null);
                    }
                    it = it2;
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda45 = (MaxAdViewImplExternalSyntheticLambda4) onnavigationevent.L$2;
                Iterator it4 = (Iterator) onnavigationevent.L$1;
                String str5 = (String) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda46 = maxAdViewImplExternalSyntheticLambda45;
                Iterator it5 = it4;
                String str6 = str5;
                try {
                } catch (Exception e3) {
                    e = e3;
                    it2 = it5;
                }
                setRequestListener setrequestlistener3 = (setRequestListener) objIAuthTabCallback;
                r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY r8lambdavrqx_av3s_wv9pas1mgjxvtpcky = this.IAuthTabCallbackStub;
                String strOnExtraCallbackWithResult = maxAdViewImplExternalSyntheticLambda46.onExtraCallbackWithResult();
                String strAsBinder = maxAdViewImplExternalSyntheticLambda46.asBinder();
                String strOnNavigationEvent = maxAdViewImplExternalSyntheticLambda46.onNavigationEvent();
                onnavigationevent.L$0 = access15400.onNavigationEvent(str6);
                onnavigationevent.L$1 = it5;
                onnavigationevent.L$2 = maxAdViewImplExternalSyntheticLambda46;
                onnavigationevent.L$3 = setrequestlistener3;
                onnavigationevent.label = 3;
                it2 = it5;
                Object objOnExtraCallbackWithResult = r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY.onExtraCallbackWithResult(r8lambdavrqx_av3s_wv9pas1mgjxvtpcky, strOnExtraCallbackWithResult, strAsBinder, strOnNavigationEvent, null, null, null, onnavigationevent, 56, null);
                if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                    str3 = str6;
                    MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda47 = maxAdViewImplExternalSyntheticLambda46;
                    setrequestlistener = setrequestlistener3;
                    objIAuthTabCallback = objOnExtraCallbackWithResult;
                    maxAdViewImplExternalSyntheticLambda43 = maxAdViewImplExternalSyntheticLambda47;
                    try {
                    } catch (Exception e4) {
                        e = e4;
                        r9 = str3;
                        r7 = maxAdViewImplExternalSyntheticLambda43;
                        r8 = it2;
                        it = r8;
                        str3 = r9;
                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "invalidateCachedOldBundle: 내장 번들 캐시 비교에 실패했습니다.", e, onWarmupCompleted(r7));
                        int i72 = ICustomTabsCallback + 87;
                        extraCallback = i72 % 128;
                        int i82 = i72 % 2;
                        while (it.hasNext()) {
                        }
                        return Unit.INSTANCE;
                    }
                    setrequestlistener2 = (setRequestListener) objIAuthTabCallback;
                    if (setrequestlistener2 != null && setrequestlistener2.onExtraCallbackWithResult().compareTo(setrequestlistener.onExtraCallbackWithResult()) < 0) {
                        r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4.onNavigationEvent(this.onNavigationEvent, maxAdViewImplExternalSyntheticLambda43.onExtraCallbackWithResult(), maxAdViewImplExternalSyntheticLambda43.asBinder(), maxAdViewImplExternalSyntheticLambda43.onNavigationEvent(), null, 8, null);
                    }
                    it = it2;
                    while (it.hasNext()) {
                        try {
                            maxAdViewImplExternalSyntheticLambda4 = (MaxAdViewImplExternalSyntheticLambda4) it.next();
                            try {
                                r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0 = this.IAuthTabCallback;
                                String strOnExtraCallbackWithResult2 = maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult();
                                String strAsBinder2 = maxAdViewImplExternalSyntheticLambda4.asBinder();
                                String strOnNavigationEvent2 = maxAdViewImplExternalSyntheticLambda4.onNavigationEvent();
                                onnavigationevent.L$0 = access15400.onNavigationEvent(str3);
                                onnavigationevent.L$1 = it;
                                onnavigationevent.L$2 = maxAdViewImplExternalSyntheticLambda4;
                                onnavigationevent.L$3 = null;
                                onnavigationevent.label = 2;
                                objIAuthTabCallback = r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0.onExtraCallback(r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0, strOnExtraCallbackWithResult2, strAsBinder2, strOnNavigationEvent2, null, onnavigationevent, 8, null);
                                if (objIAuthTabCallback != objOnWarmupCompleted) {
                                    int i9 = extraCallback;
                                    int i10 = i9 + 43;
                                    ICustomTabsCallback = i10 % 128;
                                    int i11 = i10 % 2;
                                    int i12 = i9 + 101;
                                    ICustomTabsCallback = i12 % 128;
                                    int i13 = i12 % 2;
                                    str6 = str3;
                                    it5 = it;
                                    maxAdViewImplExternalSyntheticLambda46 = maxAdViewImplExternalSyntheticLambda42;
                                    setRequestListener setrequestlistener32 = (setRequestListener) objIAuthTabCallback;
                                    r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY r8lambdavrqx_av3s_wv9pas1mgjxvtpcky2 = this.IAuthTabCallbackStub;
                                    String strOnExtraCallbackWithResult3 = maxAdViewImplExternalSyntheticLambda46.onExtraCallbackWithResult();
                                    String strAsBinder3 = maxAdViewImplExternalSyntheticLambda46.asBinder();
                                    String strOnNavigationEvent3 = maxAdViewImplExternalSyntheticLambda46.onNavigationEvent();
                                    onnavigationevent.L$0 = access15400.onNavigationEvent(str6);
                                    onnavigationevent.L$1 = it5;
                                    onnavigationevent.L$2 = maxAdViewImplExternalSyntheticLambda46;
                                    onnavigationevent.L$3 = setrequestlistener32;
                                    onnavigationevent.label = 3;
                                    it2 = it5;
                                    Object objOnExtraCallbackWithResult2 = r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY.onExtraCallbackWithResult(r8lambdavrqx_av3s_wv9pas1mgjxvtpcky2, strOnExtraCallbackWithResult3, strAsBinder3, strOnNavigationEvent3, null, null, null, onnavigationevent, 56, null);
                                    if (objOnExtraCallbackWithResult2 != objOnWarmupCompleted) {
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda4;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "invalidateCachedOldBundle: 내장 번들 캐시 비교에 실패했습니다.", e, onWarmupCompleted(maxAdViewImplExternalSyntheticLambda42));
                            int i14 = ICustomTabsCallback + 87;
                            extraCallback = i14 % 128;
                            int i15 = i14 % 2;
                        }
                        maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda4;
                    }
                    return Unit.INSTANCE;
                }
                return objOnWarmupCompleted;
            }
            str2 = (String) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        } else {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs r8lambda2mywpkacv8n5ptcbfsxgde7xkjs = this.onWarmupCompleted;
            onnavigationevent.L$0 = access15400.onNavigationEvent(str);
            onnavigationevent.label = 1;
            str2 = str;
            objIAuthTabCallback = r8lambda2mywpkacv8n5ptcbfsxgde7xkjs.IAuthTabCallback(str2, onnavigationevent);
        }
        str3 = str2;
        it = ((List) objIAuthTabCallback).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ RnPhaseObserver onTransact(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (RnPhaseObserver) onExtraCallbackWithResult(-1364152509, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{r8lambdaqgn1zd5jkubz_mi_zblgk1awifg}, 1364152511, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    public static final /* synthetic */ RnBundleInfo onExtraCallback(r8lambdaQgn1Zd5jKuBZ_MI_zBlgk1aWifg r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, setAdReviewListener setadreviewlistener, String str, RnBundleInfo.Source source) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (RnBundleInfo) onExtraCallbackWithResult(182300574, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{r8lambdaqgn1zd5jkubz_mi_zblgk1awifg, setadreviewlistener, str, source}, -182300570, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private final setAdReviewListener IAuthTabCallback(RemoteBundleResult remoteBundleResult, String str, String str2, String str3) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (setAdReviewListener) onExtraCallbackWithResult(911606457, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this, remoteBundleResult, str, str2, str3}, -911606456, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private final String onNavigationEvent(MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(-2120248607, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this, maxAdViewImplExternalSyntheticLambda4}, 2120248610, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    private final String onNavigationEvent(setAdReviewListener setadreviewlistener) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(-1919941836, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this, setadreviewlistener}, 1919941836, iOnWarmupCompleted, iOnWarmupCompleted2);
    }

    static void onExtraCallbackWithResult() {
        access100 = 478308910;
    }
}
