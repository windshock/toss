package im.toss.rn.toss.core.legacy.bundle.v2;

import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.spec.log.ReactLogKt;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.MaxAdViewImplExternalSyntheticLambda4;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity5;
import o.WebSocketFactory;
import o.access13800;
import o.access14000;
import o.access8100;
import o.findResAndMsg;
import o.getWrite;
import o.hExternalSyntheticLambda7;
import okhttp3.internal._UtilCommonKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactBuiltInBundleSourceImpl$getBundle$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super ReactBundle>, Object> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ String $bundleName;
    final /* synthetic */ String $company;
    final /* synthetic */ Date $minDeployedAt;
    final /* synthetic */ String $region;
    int label;
    final /* synthetic */ ReactBuiltInBundleSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactBuiltInBundleSourceImpl$getBundle$2(String str, String str2, String str3, ReactBuiltInBundleSourceImpl reactBuiltInBundleSourceImpl, Date date, access13800<? super ReactBuiltInBundleSourceImpl$getBundle$2> access13800Var) {
        super(2, access13800Var);
        this.$region = str;
        this.$company = str2;
        this.$bundleName = str3;
        this.this$0 = reactBuiltInBundleSourceImpl;
        this.$minDeployedAt = date;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ReactBuiltInBundleSourceImpl$getBundle$2 reactBuiltInBundleSourceImpl$getBundle$2 = new ReactBuiltInBundleSourceImpl$getBundle$2(this.$region, this.$company, this.$bundleName, this.this$0, this.$minDeployedAt, access13800Var);
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return reactBuiltInBundleSourceImpl$getBundle$2;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super ReactBundle> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ReactBuiltInBundleSourceImpl$getBundle$2 reactBuiltInBundleSourceImpl$getBundle$2Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            reactBuiltInBundleSourceImpl$getBundle$2Create.invokeSuspend(unit);
            throw null;
        }
        Object objInvokeSuspend = reactBuiltInBundleSourceImpl$getBundle$2Create.invokeSuspend(unit);
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r6;
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback;
        int i = 2 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        MaxAdViewImplExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted = MaxAdViewImplExternalSyntheticLambda4.Companion;
        String str = this.$region;
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback2 = this.$company;
        String str2 = this.$bundleName;
        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4OnNavigationEvent = onwarmupcompleted.onNavigationEvent(str, tTAppOpenAdTransActivityOnExtraCallback2, str2);
        TTAppOpenAdTransActivity tTAppOpenAdTransActivity = null;
        try {
            try {
                InputStream inputStreamOpen = ReactBuiltInBundleSourceImpl.IAuthTabCallback(this.this$0).getAssets().open(maxAdViewImplExternalSyntheticLambda4OnNavigationEvent.onWarmupCompleted());
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
                tTAppOpenAdTransActivityOnExtraCallback2 = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.IAuthTabCallback(inputStreamOpen));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            tTAppOpenAdTransActivityOnExtraCallback2 = null;
            tTAppOpenAdTransActivityOnExtraCallback = null;
        } catch (Throwable th2) {
            th = th2;
            r6 = 0;
            if (tTAppOpenAdTransActivity != null) {
                int i2 = IAuthTabCallback + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                _UtilCommonKt.closeQuietly(tTAppOpenAdTransActivity);
            }
            if (r6 != 0) {
                _UtilCommonKt.closeQuietly((Closeable) r6);
            }
            throw th;
        }
        try {
            InputStream inputStreamOpen2 = ReactBuiltInBundleSourceImpl.IAuthTabCallback(this.this$0).getAssets().open(maxAdViewImplExternalSyntheticLambda4OnNavigationEvent.IAuthTabCallback());
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen2, "");
            tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.IAuthTabCallback(inputStreamOpen2));
            try {
                TossReactBundleMeta tossReactBundleMetaOnExtraCallback = TossReactBundleMeta.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                if (this.$minDeployedAt != null && tossReactBundleMetaOnExtraCallback.onWarmupCompleted().before(this.$minDeployedAt)) {
                    if (tTAppOpenAdTransActivityOnExtraCallback2 != null) {
                        _UtilCommonKt.closeQuietly(tTAppOpenAdTransActivityOnExtraCallback2);
                    }
                    if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                        _UtilCommonKt.closeQuietly(tTAppOpenAdTransActivityOnExtraCallback);
                    }
                    return null;
                }
                if (ReactBundleExtensionsKt.onExtraCallbackWithResult(tTAppOpenAdTransActivityOnExtraCallback2, tossReactBundleMetaOnExtraCallback.onTransact(), hExternalSyntheticLambda7.IAuthTabCallback.onExtraCallback(this.$region, this.$company))) {
                    ReactLogKt.IAuthTabCallback(maxAdViewImplExternalSyntheticLambda4OnNavigationEvent.onWarmupCompleted(), tossReactBundleMetaOnExtraCallback.IAuthTabCallback());
                    ReactBundle reactBundle = new ReactBundle(this.$bundleName, maxAdViewImplExternalSyntheticLambda4OnNavigationEvent.onExtraCallback(), tossReactBundleMetaOnExtraCallback.onTransact(), tossReactBundleMetaOnExtraCallback.IAuthTabCallback(), (String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMetaOnExtraCallback}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback()), null, access14000.onExtraCallback(0L), access14000.onExtraCallback(0L), true);
                    if (tTAppOpenAdTransActivityOnExtraCallback2 != null) {
                        _UtilCommonKt.closeQuietly(tTAppOpenAdTransActivityOnExtraCallback2);
                    }
                    if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                        _UtilCommonKt.closeQuietly(tTAppOpenAdTransActivityOnExtraCallback);
                    }
                    return reactBundle;
                }
                int i4 = onWarmupCompleted + 119;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 61 / 0;
                    if (tTAppOpenAdTransActivityOnExtraCallback2 != null) {
                        _UtilCommonKt.closeQuietly(tTAppOpenAdTransActivityOnExtraCallback2);
                    }
                } else if (tTAppOpenAdTransActivityOnExtraCallback2 != null) {
                }
                if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                    _UtilCommonKt.closeQuietly(tTAppOpenAdTransActivityOnExtraCallback);
                }
                int i6 = IAuthTabCallback + 83;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return null;
            } catch (Exception e2) {
                e = e2;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", e.getMessage(), (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", "ReactBuiltInBundleSource")), 4, (Object) null);
                if (tTAppOpenAdTransActivityOnExtraCallback2 != null) {
                    int i8 = onWarmupCompleted + 109;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    _UtilCommonKt.closeQuietly(tTAppOpenAdTransActivityOnExtraCallback2);
                }
                if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                    _UtilCommonKt.closeQuietly(tTAppOpenAdTransActivityOnExtraCallback);
                }
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            tTAppOpenAdTransActivityOnExtraCallback = null;
        } catch (Throwable th3) {
            th = th3;
            str2 = null;
            tTAppOpenAdTransActivity = tTAppOpenAdTransActivityOnExtraCallback2;
            r6 = str2;
            if (tTAppOpenAdTransActivity != null) {
            }
            if (r6 != 0) {
            }
            throw th;
        }
    }
}
