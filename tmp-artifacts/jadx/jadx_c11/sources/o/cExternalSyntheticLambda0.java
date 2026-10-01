package o;

import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.rn.spec.log.ReactLogKt;
import im.toss.rn.toss.core.bundle.model.BundleMetadata;
import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class cExternalSyntheticLambda0 implements r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final dc IAuthTabCallback;
    private final r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 onExtraCallbackWithResult;
    private final zzad onWarmupCompleted;

    static {
        int i = onNavigationEvent + 97;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public cExternalSyntheticLambda0(@NotNull r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4, @NotNull dc dcVar, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(r8lambda2dedie2xf7declmcf5taijldvi4, "");
        Intrinsics.checkNotNullParameter(dcVar, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.onExtraCallbackWithResult = r8lambda2dedie2xf7declmcf5taijldvi4;
        this.IAuthTabCallback = dcVar;
        this.onWarmupCompleted = zzadVar;
    }

    public static final /* synthetic */ zzad IAuthTabCallback(cExternalSyntheticLambda0 cexternalsyntheticlambda0) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = cexternalsyntheticlambda0.onWarmupCompleted;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 101;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return zzadVar;
    }

    public static final /* synthetic */ r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 onExtraCallbackWithResult(cExternalSyntheticLambda0 cexternalsyntheticlambda0) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4 r8lambda2dedie2xf7declmcf5taijldvi4 = cexternalsyntheticlambda0.onExtraCallbackWithResult;
        int i5 = i3 + 45;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return r8lambda2dedie2xf7declmcf5taijldvi4;
    }

    public static final /* synthetic */ dc onWarmupCompleted(cExternalSyntheticLambda0 cexternalsyntheticlambda0) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        dc dcVar = cexternalsyntheticlambda0.IAuthTabCallback;
        int i5 = i3 + 59;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return dcVar;
    }

    @Override // o.r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY
    public Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Long l, @Nullable Date date, @Nullable String str4, @NotNull access13800<? super setRequestListener> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallback(str, str2, str3, str4, l, date, null), access13800Var);
        int i2 = asBinder + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super setRequestListener>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $bundleName;
        final /* synthetic */ String $cacheNamespace;
        final /* synthetic */ String $company;
        final /* synthetic */ Long $maxAge;
        final /* synthetic */ Date $minDeployedAt;
        final /* synthetic */ String $region;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, String str2, String str3, String str4, Long l, Date date, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$bundleName = str;
            this.$region = str2;
            this.$company = str3;
            this.$cacheNamespace = str4;
            this.$maxAge = l;
            this.$minDeployedAt = date;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = cExternalSyntheticLambda0.this.new onExtraCallback(this.$bundleName, this.$region, this.$company, this.$cacheNamespace, this.$maxAge, this.$minDeployedAt, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onWarmupCompleted + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super setRequestListener> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = 62 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super setRequestListener> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 37 / 0;
            }
            int i5 = onWarmupCompleted + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ File $bundleFile;
            final /* synthetic */ String $company;
            final /* synthetic */ BundleMetadata $metadata;
            final /* synthetic */ String $region;
            int label;
            final /* synthetic */ cExternalSyntheticLambda0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(File file, BundleMetadata bundleMetadata, cExternalSyntheticLambda0 cexternalsyntheticlambda0, String str, String str2, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.$bundleFile = file;
                this.$metadata = bundleMetadata;
                this.this$0 = cexternalsyntheticlambda0;
                this.$region = str;
                this.$company = str2;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$bundleFile, this.$metadata, this.this$0, this.$region, this.$company, access13800Var);
                int i2 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                ResultKt.onNavigationEvent(obj);
                TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(this.$bundleFile));
                BundleMetadata bundleMetadata = this.$metadata;
                cExternalSyntheticLambda0 cexternalsyntheticlambda0 = this.this$0;
                try {
                    Boolean boolOnNavigationEvent = access14000.onNavigationEvent(dbExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(tTAppOpenAdTransActivityOnExtraCallback, bundleMetadata.IAuthTabCallbackStub(), cExternalSyntheticLambda0.onWarmupCompleted(cexternalsyntheticlambda0).IAuthTabCallback(this.$region, this.$company)));
                    CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                    int i4 = onExtraCallbackWithResult + 39;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return boolOnNavigationEvent;
                    }
                    throw null;
                } finally {
                }
            }
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:90:0x03bd  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0405  */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10, types: [java.io.File, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            onExtraCallback onextracallback;
            Object obj3;
            Object obj4;
            Object obj5;
            Throwable th;
            cExternalSyntheticLambda0 cexternalsyntheticlambda0;
            String str;
            String str2;
            String str3;
            String str4;
            Long l;
            Date date;
            Object obj6;
            Object obj7;
            BundleMetadata bundleMetadataOnExtraCallback;
            findResAndMsg findresandmsg;
            Object obj8;
            onExtraCallbackWithResult onextracallbackwithresult;
            Object obj9;
            Object objOnExtraCallback;
            File file;
            BundleMetadata bundleMetadata;
            File file2;
            ?? OnExtraCallbackWithResult = "bundleDeployedAt";
            int i = 2 % 2;
            findResAndMsg findresandmsg2 = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                try {
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        cexternalsyntheticlambda0 = cExternalSyntheticLambda0.this;
                        str = this.$bundleName;
                        str2 = this.$region;
                        str3 = this.$company;
                        str4 = this.$cacheNamespace;
                        l = this.$maxAge;
                        date = this.$minDeployedAt;
                        Result.Companion companion = Result.Companion;
                        obj6 = "bundleDeployedAt";
                        if (!cExternalSyntheticLambda0.onExtraCallbackWithResult(cexternalsyntheticlambda0).onNavigationEvent(str, str2, str3, str4)) {
                            return null;
                        }
                        OnExtraCallbackWithResult = cExternalSyntheticLambda0.onExtraCallbackWithResult(cexternalsyntheticlambda0).onExtraCallbackWithResult(str, str2, str3, str4);
                        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted((File) OnExtraCallbackWithResult));
                        obj7 = "minDeployedAt";
                        try {
                            bundleMetadataOnExtraCallback = BundleMetadata.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                            try {
                                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                                String strRequestPostMessageChannelWithExtras = cExternalSyntheticLambda0.IAuthTabCallback(cexternalsyntheticlambda0).requestPostMessageChannelWithExtras();
                                if (bundleMetadataOnExtraCallback.onExtraCallbackWithResult() == null) {
                                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "rn_version_missing_invalidate", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "LocalCacheBundleSourceImpl"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("currentVersion", strRequestPostMessageChannelWithExtras)}), (String) null, false, (String) null, 56, (Object) null);
                                    cExternalSyntheticLambda0.onExtraCallbackWithResult(cexternalsyntheticlambda0).IAuthTabCallback(str, str2, str3, str4);
                                    return null;
                                }
                                if (!Intrinsics.areEqual(bundleMetadataOnExtraCallback.onExtraCallbackWithResult(), strRequestPostMessageChannelWithExtras)) {
                                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "rn_version_mismatch_invalidate", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "LocalCacheBundleSourceImpl"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("cachedVersion", bundleMetadataOnExtraCallback.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("currentVersion", strRequestPostMessageChannelWithExtras)}), (String) null, false, (String) null, 56, (Object) null);
                                    cExternalSyntheticLambda0.onExtraCallbackWithResult(cexternalsyntheticlambda0).IAuthTabCallback(str, str2, str3, str4);
                                    return null;
                                }
                                File file3 = (File) r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4.onWarmupCompleted(new Object[]{cExternalSyntheticLambda0.onExtraCallbackWithResult(cexternalsyntheticlambda0), str, str2, str3, str4}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1891120195);
                                GeckoHubImp geckoHubImpOnWarmupCompleted = putChannelInfo.onWarmupCompleted();
                                findresandmsg = "bundleName";
                                try {
                                    onextracallbackwithresult = new onExtraCallbackWithResult(file3, bundleMetadataOnExtraCallback, cexternalsyntheticlambda0, str2, str3, null);
                                    obj9 = "LocalCacheBundleSourceImpl";
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj8 = "LocalCacheBundleSourceImpl";
                                    findresandmsg2 = findresandmsg;
                                    obj2 = obj8;
                                    obj4 = null;
                                    Result.Companion companion2 = Result.Companion;
                                    obj5 = Result.constructor-impl(ResultKt.createFailure(th));
                                    onextracallback = this;
                                    obj3 = obj2;
                                    String str5 = onextracallback.$bundleName;
                                    th = Result.exceptionOrNull-impl(obj5);
                                    if (th == null) {
                                    }
                                }
                                try {
                                    this.L$0 = access15400.onNavigationEvent(findresandmsg2);
                                    this.L$1 = cexternalsyntheticlambda0;
                                    this.L$2 = str;
                                    this.L$3 = str2;
                                    this.L$4 = str3;
                                    this.L$5 = str4;
                                    this.L$6 = l;
                                    this.L$7 = date;
                                    this.L$8 = access15400.onNavigationEvent(findresandmsg2);
                                    this.L$9 = access15400.onNavigationEvent((Object) OnExtraCallbackWithResult);
                                    this.L$10 = access15400.onNavigationEvent(strRequestPostMessageChannelWithExtras);
                                    this.L$11 = file3;
                                    this.L$12 = bundleMetadataOnExtraCallback;
                                    this.I$0 = 0;
                                    this.label = 1;
                                    objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpOnWarmupCompleted, onextracallbackwithresult, this);
                                    if (objOnExtraCallback == objOnWarmupCompleted) {
                                        return objOnWarmupCompleted;
                                    }
                                    file = file3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj8 = obj9;
                                    findresandmsg2 = findresandmsg;
                                    obj2 = obj8;
                                    obj4 = null;
                                    Result.Companion companion22 = Result.Companion;
                                    obj5 = Result.constructor-impl(ResultKt.createFailure(th));
                                    onextracallback = this;
                                    obj3 = obj2;
                                    String str52 = onextracallback.$bundleName;
                                    th = Result.exceptionOrNull-impl(obj5);
                                    if (th == null) {
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = "LocalCacheBundleSourceImpl";
                                findresandmsg2 = "bundleName";
                                obj4 = null;
                                Result.Companion companion222 = Result.Companion;
                                obj5 = Result.constructor-impl(ResultKt.createFailure(th));
                                onextracallback = this;
                                obj3 = obj2;
                                String str522 = onextracallback.$bundleName;
                                th = Result.exceptionOrNull-impl(obj5);
                                if (th == null) {
                                }
                            }
                        } catch (Throwable th5) {
                            OnExtraCallbackWithResult = "LocalCacheBundleSourceImpl";
                            findresandmsg2 = "bundleName";
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, th5);
                                throw th6;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        BundleMetadata bundleMetadata2 = (BundleMetadata) this.L$12;
                        file = (File) this.L$11;
                        date = (Date) this.L$7;
                        l = (Long) this.L$6;
                        str4 = (String) this.L$5;
                        str3 = (String) this.L$4;
                        str2 = (String) this.L$3;
                        str = (String) this.L$2;
                        cexternalsyntheticlambda0 = (cExternalSyntheticLambda0) this.L$1;
                        ResultKt.onNavigationEvent(obj);
                        obj7 = "minDeployedAt";
                        obj6 = "bundleDeployedAt";
                        bundleMetadataOnExtraCallback = bundleMetadata2;
                        obj9 = "LocalCacheBundleSourceImpl";
                        findresandmsg = "bundleName";
                        objOnExtraCallback = obj;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                obj2 = OnExtraCallbackWithResult;
            }
            if (((Boolean) objOnExtraCallback).booleanValue()) {
                Object obj10 = obj9;
                findresandmsg2 = findresandmsg;
                if (l != null) {
                    int i3 = onWarmupCompleted + 39;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    long jCurrentTimeMillis = System.currentTimeMillis() - bundleMetadataOnExtraCallback.IAuthTabCallbackDefault();
                    if (jCurrentTimeMillis > TimeUnit.SECONDS.toMillis(l.longValue())) {
                        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "max_age_expired", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", obj10), getWrite.IAuthTabCallback(findresandmsg2, str), getWrite.IAuthTabCallback("maxAge", String.valueOf(l.longValue())), getWrite.IAuthTabCallback("age", String.valueOf(jCurrentTimeMillis))}), (String) null, false, (String) null, 56, (Object) null);
                        return null;
                    }
                }
                if (date != null) {
                    Date dateOnExtraCallback = bundleMetadataOnExtraCallback.onExtraCallback();
                    boolean zBefore = dateOnExtraCallback.before(date);
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object obj11 = obj6;
                    Object obj12 = obj7;
                    file2 = file;
                    bundleMetadata = bundleMetadataOnExtraCallback;
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "min_deployed_at_verification", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", obj10), getWrite.IAuthTabCallback(findresandmsg2, str), getWrite.IAuthTabCallback(obj11, dateOnExtraCallback.toString()), getWrite.IAuthTabCallback(obj12, date.toString()), getWrite.IAuthTabCallback("willReject", access14000.onNavigationEvent(zBefore))}), (String) null, false, (String) null, 56, (Object) null);
                    if (zBefore) {
                        int i5 = onExtraCallback + 3;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "min_deployed_at_rejected_cache", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", obj10), getWrite.IAuthTabCallback(findresandmsg2, str), getWrite.IAuthTabCallback(obj11, dateOnExtraCallback.toString()), getWrite.IAuthTabCallback(obj12, date.toString())}), (String) null, false, (String) null, 56, (Object) null);
                        return null;
                    }
                } else {
                    bundleMetadata = bundleMetadataOnExtraCallback;
                    file2 = file;
                    int i7 = onWarmupCompleted + 77;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
                String strValueOf = String.valueOf(bundleMetadata.asBinder());
                if (strValueOf == null) {
                    strValueOf = "";
                }
                ReactLogKt.IAuthTabCallback(str, strValueOf, bundleMetadata.onNavigationEvent());
                String str6 = str;
                obj5 = Result.constructor-impl(new setRequestListener(str6, file2.getPath(), bundleMetadata.IAuthTabCallbackStub(), bundleMetadata.onNavigationEvent(), (String) BundleMetadata.onExtraCallback(2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{bundleMetadata}), bundleMetadata.onTransact(), access14000.onExtraCallback(bundleMetadata.asBinder()), access14000.onExtraCallback(bundleMetadata.IAuthTabCallbackDefault()), true));
                onextracallback = this;
                obj4 = null;
                obj3 = obj10;
                String str5222 = onextracallback.$bundleName;
                th = Result.exceptionOrNull-impl(obj5);
                if (th == null) {
                    return obj5;
                }
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "cache_read_error", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", obj3), getWrite.IAuthTabCallback(findresandmsg2, str5222), getWrite.IAuthTabCallback("errorType", th.getClass().getSimpleName()), getWrite.IAuthTabCallback("error", th.getMessage())}), (String) null, false, (String) null, 56, (Object) null);
                return obj4;
            }
            obj8 = obj9;
            try {
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "cache_signature_verification_failed", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", obj8), getWrite.IAuthTabCallback(findresandmsg, str)}), (String) null, false, (String) null, 56, (Object) null);
                cExternalSyntheticLambda0.onExtraCallbackWithResult(cexternalsyntheticlambda0).IAuthTabCallback(str, str2, str3, str4);
                return null;
            } catch (Throwable th9) {
                th = th9;
                findresandmsg2 = findresandmsg;
                obj2 = obj8;
                obj4 = null;
                Result.Companion companion2222 = Result.Companion;
                obj5 = Result.constructor-impl(ResultKt.createFailure(th));
                onextracallback = this;
                obj3 = obj2;
                String str52222 = onextracallback.$bundleName;
                th = Result.exceptionOrNull-impl(obj5);
                if (th == null) {
                }
            }
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
