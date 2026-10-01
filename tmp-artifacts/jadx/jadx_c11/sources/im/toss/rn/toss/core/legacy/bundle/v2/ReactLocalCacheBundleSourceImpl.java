package im.toss.rn.toss.core.legacy.bundle.v2;

import im.toss.rn.spec.ReactAuBundleVerificationKey;
import im.toss.rn.spec.ReactBankBundleVerificationKey;
import im.toss.rn.spec.ReactBundleVerificationKey;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.GeckoHubImp;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity5;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setWrite;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactLocalCacheBundleSourceImpl implements ReactLocalCacheBundleSource {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final ReactBundleFileManager IAuthTabCallback;
    private final PublicKey onExtraCallback;
    private final PublicKey onExtraCallbackWithResult;
    private final PublicKey onNavigationEvent;
    private final zzad onWarmupCompleted;

    @Inject
    public ReactLocalCacheBundleSourceImpl(@ReactBundleVerificationKey @NotNull PublicKey publicKey, @ReactBankBundleVerificationKey @NotNull PublicKey publicKey2, @ReactAuBundleVerificationKey @NotNull PublicKey publicKey3, @NotNull ReactBundleFileManager reactBundleFileManager, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(publicKey, "");
        Intrinsics.checkNotNullParameter(publicKey2, "");
        Intrinsics.checkNotNullParameter(publicKey3, "");
        Intrinsics.checkNotNullParameter(reactBundleFileManager, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.onNavigationEvent = publicKey;
        this.onExtraCallback = publicKey2;
        this.onExtraCallbackWithResult = publicKey3;
        this.IAuthTabCallback = reactBundleFileManager;
        this.onWarmupCompleted = zzadVar;
    }

    public static final /* synthetic */ Object onWarmupCompleted(ReactLocalCacheBundleSourceImpl reactLocalCacheBundleSourceImpl, String str, Long l, Date date, String str2, String str3, access13800 access13800Var) throws IOException, setWrite {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = reactLocalCacheBundleSourceImpl.onWarmupCompleted(str, l, date, str2, str3, access13800Var);
        int i4 = onTransact + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(String str, Long l, Date date, String str2, String str3, access13800<? super Pair<? extends File, TossReactBundleMeta>> access13800Var) throws IOException, setWrite {
        ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1 reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1;
        File file;
        boolean z;
        Object obj;
        Date date2;
        String str4;
        TossReactBundleMeta tossReactBundleMeta;
        String str5;
        Long l2;
        String str6;
        Object obj2;
        Object obj3;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 69;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (access13800Var instanceof ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1) {
            int i5 = i2 + 51;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1 = (ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1) access13800Var;
            int i7 = reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1.label = i7 - 2147483648;
            } else {
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1 = new ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1(this, access13800Var);
            }
        }
        ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1 reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12 = reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1;
        Object obj4 = reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.label;
        if (i8 == 0) {
            ResultKt.onNavigationEvent(obj4);
            File fileOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(str, str2, str3);
            File fileOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(str, str2, str3);
            if ((!fileOnNavigationEvent.exists()) || !fileOnWarmupCompleted.exists()) {
                return null;
            }
            TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(fileOnWarmupCompleted));
            try {
                TossReactBundleMeta tossReactBundleMetaOnExtraCallback = TossReactBundleMeta.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                String strRequestPostMessageChannelWithExtras = this.onWarmupCompleted.requestPostMessageChannelWithExtras();
                if (tossReactBundleMetaOnExtraCallback.IAuthTabCallbackStub() == null) {
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "RN version missing in cached meta, invalidating cache", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactLocalCacheBundleSourceImpl"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("currentVersion", strRequestPostMessageChannelWithExtras)}), (String) null, false, (String) null, 56, (Object) null);
                    this.IAuthTabCallback.onExtraCallback(str, str2, str3);
                    return null;
                }
                if (!Intrinsics.areEqual(tossReactBundleMetaOnExtraCallback.IAuthTabCallbackStub(), strRequestPostMessageChannelWithExtras)) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "ReactLocalCacheBundleSourceImpl");
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("bundleName", str);
                    String strIAuthTabCallbackStub = tossReactBundleMetaOnExtraCallback.IAuthTabCallbackStub();
                    if (strIAuthTabCallbackStub == null) {
                        strIAuthTabCallbackStub = "null";
                    }
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "RN version mismatch, invalidating cache", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("cachedVersion", strIAuthTabCallbackStub), getWrite.IAuthTabCallback("currentVersion", strRequestPostMessageChannelWithExtras)}), (String) null, false, (String) null, 56, (Object) null);
                    this.IAuthTabCallback.onExtraCallback(str, str2, str3);
                    return null;
                }
                GeckoHubImp geckoHubImpOnWarmupCompleted = putChannelInfo.onWarmupCompleted();
                file = fileOnNavigationEvent;
                z = true;
                obj = null;
                ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1 reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1 = new ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1(fileOnNavigationEvent, tossReactBundleMetaOnExtraCallback, str2, str3, null);
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$0 = str;
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$1 = l;
                date2 = date;
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$2 = date2;
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$3 = str2;
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$4 = str3;
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$5 = file;
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$6 = access15400.onNavigationEvent(fileOnWarmupCompleted);
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$7 = tossReactBundleMetaOnExtraCallback;
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$8 = access15400.onNavigationEvent(strRequestPostMessageChannelWithExtras);
                reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.label = 1;
                Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpOnWarmupCompleted, reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1, reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                str4 = str;
                tossReactBundleMeta = tossReactBundleMetaOnExtraCallback;
                str5 = str3;
                l2 = l;
                obj4 = objOnExtraCallback;
                str6 = str2;
            } finally {
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tossReactBundleMeta = (TossReactBundleMeta) reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$7;
            File file2 = (File) reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$5;
            str5 = (String) reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$4;
            str6 = (String) reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$3;
            Date date3 = (Date) reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$2;
            l2 = (Long) reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$1;
            str4 = (String) reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$12.L$0;
            ResultKt.onNavigationEvent(obj4);
            file = file2;
            z = true;
            obj = null;
            date2 = date3;
        }
        if (!((Boolean) obj4).booleanValue()) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "Signature not verified", access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", "ReactLocalCacheBundleSourceImpl")), (String) null, false, (String) null, 56, (Object) null);
            this.IAuthTabCallback.onExtraCallback(str4, str6, str5);
            return obj;
        }
        if (l2 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Map mapOnExtraCallback = access8100.onExtraCallback();
            mapOnExtraCallback.put("from", "ReactLocalCacheBundleSourceImpl");
            mapOnExtraCallback.put("now", access14000.onExtraCallback(jCurrentTimeMillis));
            mapOnExtraCallback.put("updatedAt", access14000.onExtraCallback(tossReactBundleMeta.IAuthTabCallbackStubProxy()));
            mapOnExtraCallback.put("maxAge", l2);
            long jIAuthTabCallbackStubProxy = tossReactBundleMeta.IAuthTabCallbackStubProxy();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            obj2 = "ReactLocalCacheBundleSourceImpl";
            obj3 = "from";
            mapOnExtraCallback.put("isExpired", access14000.onNavigationEvent(jCurrentTimeMillis - jIAuthTabCallbackStubProxy > timeUnit.toMillis(l2.longValue())));
            mapOnExtraCallback.put("region", str6);
            Unit unit = Unit.INSTANCE;
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "react_native_debug", "MaxAge Verification", access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, (String) null, 56, (Object) null);
            if (jCurrentTimeMillis - tossReactBundleMeta.IAuthTabCallbackStubProxy() > timeUnit.toMillis(l2.longValue())) {
                return obj;
            }
        } else {
            obj2 = "ReactLocalCacheBundleSourceImpl";
            obj3 = "from";
        }
        if (date2 != null) {
            int i9 = IAuthTabCallbackStub + 95;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Map mapOnExtraCallback2 = access8100.onExtraCallback();
            mapOnExtraCallback2.put(obj3, obj2);
            mapOnExtraCallback2.put("deployedAt", tossReactBundleMeta.onWarmupCompleted());
            mapOnExtraCallback2.put("minDeployedAt", date2);
            mapOnExtraCallback2.put("isExpired", access14000.onNavigationEvent(tossReactBundleMeta.onWarmupCompleted().before(date2)));
            mapOnExtraCallback2.put("region", str6);
            Unit unit2 = Unit.INSTANCE;
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray3, "react_native_debug", "MinDeployedAt Verification", access8100.onExtraCallbackWithResult(mapOnExtraCallback2), (String) null, false, (String) null, 56, (Object) null);
            if (tossReactBundleMeta.onWarmupCompleted().before(date2)) {
                return obj;
            }
        }
        return getWrite.IAuthTabCallback(file, tossReactBundleMeta);
    }

    @Override // im.toss.rn.toss.core.legacy.bundle.v2.ReactLocalCacheBundleSource
    public Object onExtraCallbackWithResult(@NotNull String str, @Nullable Long l, @Nullable Date date, @NotNull String str2, @NotNull String str3, @NotNull access13800<? super ReactBundle> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new ReactLocalCacheBundleSourceImpl$getBundle$2(this, str, l, date, str2, str3, null), access13800Var);
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    @Override // im.toss.rn.toss.core.legacy.bundle.v2.ReactLocalCacheBundleSource
    public void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) throws IOException, setWrite {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.IAuthTabCallback.onExtraCallback(str, str2, str3);
        int i4 = IAuthTabCallbackStub + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.rn.toss.core.legacy.bundle.v2.ReactLocalCacheBundleSource
    public Object onWarmupCompleted(@NotNull access13800<? super Unit> access13800Var) throws IOException, setWrite {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallback.onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i3 = onTransact + 61;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 37 / 0;
            }
            return unit;
        }
        this.IAuthTabCallback.onExtraCallbackWithResult();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }
}
