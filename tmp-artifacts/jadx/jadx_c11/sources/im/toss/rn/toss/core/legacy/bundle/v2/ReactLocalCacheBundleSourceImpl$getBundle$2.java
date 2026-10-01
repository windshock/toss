package im.toss.rn.toss.core.legacy.bundle.v2;

import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.spec.log.ReactLogKt;
import java.io.File;
import java.util.Date;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ConvertFloatArrayToByteArray;
import o.WebSocketFactory;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access8100;
import o.findResAndMsg;
import o.getWrite;
import o.setWrite;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactLocalCacheBundleSourceImpl$getBundle$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super ReactBundle>, Object> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ String $bundleName;
    final /* synthetic */ String $company;
    final /* synthetic */ Long $maxAge;
    final /* synthetic */ Date $minDeployedAt;
    final /* synthetic */ String $region;
    int label;
    final /* synthetic */ ReactLocalCacheBundleSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactLocalCacheBundleSourceImpl$getBundle$2(ReactLocalCacheBundleSourceImpl reactLocalCacheBundleSourceImpl, String str, Long l, Date date, String str2, String str3, access13800<? super ReactLocalCacheBundleSourceImpl$getBundle$2> access13800Var) {
        super(2, access13800Var);
        this.this$0 = reactLocalCacheBundleSourceImpl;
        this.$bundleName = str;
        this.$maxAge = l;
        this.$minDeployedAt = date;
        this.$region = str2;
        this.$company = str3;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ReactLocalCacheBundleSourceImpl$getBundle$2 reactLocalCacheBundleSourceImpl$getBundle$2 = new ReactLocalCacheBundleSourceImpl$getBundle$2(this.this$0, this.$bundleName, this.$maxAge, this.$minDeployedAt, this.$region, this.$company, access13800Var);
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return reactLocalCacheBundleSourceImpl$getBundle$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws setWrite {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super ReactBundle> access13800Var) throws setWrite {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    public final Object invokeSuspend(Object obj) throws setWrite {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i4 = this.label;
        try {
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                ReactLocalCacheBundleSourceImpl reactLocalCacheBundleSourceImpl = this.this$0;
                String str = this.$bundleName;
                Long l = this.$maxAge;
                Date date = this.$minDeployedAt;
                String str2 = this.$region;
                String str3 = this.$company;
                this.label = 1;
                objOnWarmupCompleted = ReactLocalCacheBundleSourceImpl.onWarmupCompleted(reactLocalCacheBundleSourceImpl, str, l, date, str2, str3, this);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    int i5 = onWarmupCompleted + 45;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 48 / 0;
                    }
                    return objOnWarmupCompleted2;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = onNavigationEvent + 67;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = obj;
            }
            Pair pair = (Pair) objOnWarmupCompleted;
            if (pair == null) {
                return null;
            }
            File file = (File) pair.onExtraCallbackWithResult();
            TossReactBundleMeta tossReactBundleMeta = (TossReactBundleMeta) pair.IAuthTabCallback();
            ReactLogKt.IAuthTabCallback(this.$bundleName, tossReactBundleMeta.IAuthTabCallbackDefault(), tossReactBundleMeta.IAuthTabCallback());
            String str4 = this.$bundleName;
            String absolutePath = file.getAbsolutePath();
            String strOnTransact = tossReactBundleMeta.onTransact();
            String strIAuthTabCallback = tossReactBundleMeta.IAuthTabCallback();
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return new ReactBundle(str4, absolutePath, strOnTransact, strIAuthTabCallback, (String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMeta}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback()), tossReactBundleMeta.asInterface(), access14000.onExtraCallback(tossReactBundleMeta.asBinder()), access14000.onExtraCallback(tossReactBundleMeta.IAuthTabCallbackStubProxy()), true);
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", e.getMessage(), (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", "ReactLocalBundleSource")), 4, (Object) null);
            int i9 = onWarmupCompleted + 93;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }
}
