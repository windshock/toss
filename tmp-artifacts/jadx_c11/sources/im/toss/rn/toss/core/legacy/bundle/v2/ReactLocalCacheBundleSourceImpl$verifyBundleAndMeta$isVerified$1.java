package im.toss.rn.toss.core.legacy.bundle.v2;

import im.toss.rn.spec.bundle.TossReactBundleMeta;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity5;
import o.access13800;
import o.access14000;
import o.findResAndMsg;
import o.hExternalSyntheticLambda7;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    final /* synthetic */ File $bundleFile;
    final /* synthetic */ String $company;
    final /* synthetic */ String $region;
    final /* synthetic */ TossReactBundleMeta $tossReactBundleMeta;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1(File file, TossReactBundleMeta tossReactBundleMeta, String str, String str2, access13800<? super ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1> access13800Var) {
        super(2, access13800Var);
        this.$bundleFile = file;
        this.$tossReactBundleMeta = tossReactBundleMeta;
        this.$region = str;
        this.$company = str2;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1 reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1 = new ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1(this.$bundleFile, this.$tossReactBundleMeta, this.$region, this.$company, access13800Var);
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return reactLocalCacheBundleSourceImpl$verifyBundleAndMeta$isVerified$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        Object obj3 = null;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Boolean> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
        int i3 = onExtraCallback + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i5 = i2 + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        ResultKt.onNavigationEvent(obj);
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(this.$bundleFile));
        try {
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(ReactBundleExtensionsKt.onExtraCallbackWithResult(tTAppOpenAdTransActivityOnExtraCallback, this.$tossReactBundleMeta.onTransact(), hExternalSyntheticLambda7.IAuthTabCallback.onExtraCallback(this.$region, this.$company)));
            CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
            int i7 = onExtraCallback + 67;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return boolOnNavigationEvent;
        } finally {
        }
    }
}
