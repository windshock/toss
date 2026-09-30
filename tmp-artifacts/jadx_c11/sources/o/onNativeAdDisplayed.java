package o;

import com.facebook.react.ReactHost;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import java.util.Date;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAdViewTracker;
import o.setAdReviewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onNativeAdDisplayed implements hbExternalSyntheticLambda6 {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final n6c onExtraCallbackWithResult;
    private final logApiCall onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = onNativeAdDisplayed.this.IAuthTabCallback(null, null, null, this);
            int i4 = IAuthTabCallback + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objIAuthTabCallback = onNativeAdDisplayed.this.IAuthTabCallback((hcExternalSyntheticLambda0) null, (ReactHost) null, (access13800<? super getAdViewTracker>) this);
            int i4 = onNavigationEvent + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 107;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public onNativeAdDisplayed(@NotNull logApiCall logapicall, @NotNull n6c n6cVar) {
        Intrinsics.checkNotNullParameter(logapicall, "");
        Intrinsics.checkNotNullParameter(n6cVar, "");
        this.onWarmupCompleted = logapicall;
        this.onExtraCallbackWithResult = n6cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0232 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @Override // o.hbExternalSyntheticLambda8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(@NotNull hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, @Nullable ReactHost reactHost, @NotNull access13800<? super getAdViewTracker> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        ReactContext reactContextOnExtraCallbackWithResult;
        n7 n7VarOnExtraCallback;
        Object obj;
        ReactContext reactContext;
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda02;
        int i;
        setAdReviewListener setadreviewlistener;
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda03 = hcexternalsyntheticlambda0;
        ReactHost reactHost2 = reactHost;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i5 = onwarmupcompleted.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i5 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        int i6 = onExtraCallback + 75;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        Object obj2 = onwarmupcompleted2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = onwarmupcompleted2.label;
        try {
            try {
                if (i8 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    if (reactHost2 == null || (reactContextOnExtraCallbackWithResult = reactHost.onExtraCallbackWithResult()) == null) {
                        return IAuthTabCallback(hcexternalsyntheticlambda03, reactHost2, "on_demand");
                    }
                    n7VarOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(hcexternalsyntheticlambda0.IAuthTabCallback());
                    logApiCall logapicall = this.onWarmupCompleted;
                    String strIAuthTabCallback = n7VarOnExtraCallback.IAuthTabCallback();
                    String str = (String) n7.IAuthTabCallback(new Object[]{n7VarOnExtraCallback}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 706361440, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -706361440);
                    String str2 = (String) n7.IAuthTabCallback(new Object[]{n7VarOnExtraCallback}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2122339782, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2122339783);
                    String strOnNavigationEvent = n7VarOnExtraCallback.onNavigationEvent();
                    boolean zIAuthTabCallbackDefault = n7VarOnExtraCallback.IAuthTabCallbackDefault();
                    boolean zOnTransact = n7VarOnExtraCallback.onTransact();
                    Long lOnExtraCallbackWithResult = n7VarOnExtraCallback.onExtraCallbackWithResult();
                    Date dateAsBinder = n7VarOnExtraCallback.asBinder();
                    onwarmupcompleted2.L$0 = hcexternalsyntheticlambda03;
                    onwarmupcompleted2.L$1 = access15400.onNavigationEvent(reactHost);
                    onwarmupcompleted2.L$2 = reactContextOnExtraCallbackWithResult;
                    onwarmupcompleted2.L$3 = n7VarOnExtraCallback;
                    onwarmupcompleted2.label = 1;
                    Object objOnExtraCallback = logApiCall.onExtraCallback(logapicall, strIAuthTabCallback, str, str2, strOnNavigationEvent, zIAuthTabCallbackDefault, false, false, zOnTransact, lOnExtraCallbackWithResult, dateAsBinder, false, null, false, onwarmupcompleted2, 7232, null);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        obj = objOnWarmupCompleted;
                        Object obj3 = null;
                        i = asInterface + 43;
                        onExtraCallback = i % 128;
                        if (i % 2 != 0) {
                            return obj;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                    reactContext = reactContextOnExtraCallbackWithResult;
                    obj2 = objOnExtraCallback;
                    hcexternalsyntheticlambda02 = hcexternalsyntheticlambda03;
                } else {
                    if (i8 != 1) {
                        int i9 = onExtraCallback + 17;
                        asInterface = i9 % 128;
                        int i10 = i9 % 2;
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        setadreviewlistener = (setAdReviewListener) onwarmupcompleted2.L$4;
                        hcexternalsyntheticlambda03 = (hcExternalSyntheticLambda0) onwarmupcompleted2.L$0;
                        ResultKt.onNavigationEvent(obj2);
                        return new getAdViewTracker.IAuthTabCallback(hcexternalsyntheticlambda03, ((setAdReviewListener.IAuthTabCallback) setadreviewlistener).IAuthTabCallback().onExtraCallback());
                    }
                    n7 n7Var = (n7) onwarmupcompleted2.L$3;
                    ReactContext reactContext2 = (ReactContext) onwarmupcompleted2.L$2;
                    ReactHost reactHost3 = (ReactHost) onwarmupcompleted2.L$1;
                    hcexternalsyntheticlambda02 = (hcExternalSyntheticLambda0) onwarmupcompleted2.L$0;
                    try {
                        ResultKt.onNavigationEvent(obj2);
                        reactContext = reactContext2;
                        n7VarOnExtraCallback = n7Var;
                        reactHost2 = reactHost3;
                    } catch (Throwable th) {
                        th = th;
                        hcexternalsyntheticlambda03 = hcexternalsyntheticlambda02;
                        return onExtraCallbackWithResult(hcexternalsyntheticlambda03, th);
                    }
                }
                setAdReviewListener setadreviewlistener2 = (setAdReviewListener) obj2;
                if (!(setadreviewlistener2 instanceof setAdReviewListener.IAuthTabCallback)) {
                    if (setadreviewlistener2 instanceof setAdReviewListener.onExtraCallback) {
                        return new getAdViewTracker.IAuthTabCallback(hcexternalsyntheticlambda02, (String) null);
                    }
                    Object obj4 = null;
                    if (setadreviewlistener2 instanceof setAdReviewListener.onNavigationEvent) {
                        int i11 = asInterface + 5;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        return onExtraCallbackWithResult(hcexternalsyntheticlambda02, ((setAdReviewListener.onNavigationEvent) setadreviewlistener2).onExtraCallbackWithResult());
                    }
                    if (!(setadreviewlistener2 instanceof setAdReviewListener.onWarmupCompleted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    getAdViewTracker.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(hcexternalsyntheticlambda02, new IllegalStateException("Service bundle version mismatch: " + ((setAdReviewListener.onWarmupCompleted) setadreviewlistener2).onNavigationEvent()));
                    int i13 = asInterface + 1;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        return onnavigationeventOnExtraCallbackWithResult;
                    }
                    obj4.hashCode();
                    throw null;
                }
                String strOnWarmupCompleted = ((setAdReviewListener.IAuthTabCallback) setadreviewlistener2).IAuthTabCallback().onWarmupCompleted();
                if (strOnWarmupCompleted == null) {
                    throw new IllegalArgumentException(("Service bundle filePath is null: " + ((setAdReviewListener.IAuthTabCallback) setadreviewlistener2).IAuthTabCallback().IAuthTabCallback()).toString());
                }
                String str3 = (String) n7.IAuthTabCallback(new Object[]{n7VarOnExtraCallback}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 706361440, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -706361440);
                String strIAuthTabCallback2 = n7VarOnExtraCallback.IAuthTabCallback();
                onwarmupcompleted2.L$0 = hcexternalsyntheticlambda02;
                onwarmupcompleted2.L$1 = access15400.onNavigationEvent(reactHost2);
                onwarmupcompleted2.L$2 = access15400.onNavigationEvent(reactContext);
                onwarmupcompleted2.L$3 = access15400.onNavigationEvent(n7VarOnExtraCallback);
                onwarmupcompleted2.L$4 = setadreviewlistener2;
                onwarmupcompleted2.label = 2;
                obj = objOnWarmupCompleted;
                if (onExtraCallback(reactContext, strOnWarmupCompleted, str3, strIAuthTabCallback2, onwarmupcompleted2) != obj) {
                    hcexternalsyntheticlambda03 = hcexternalsyntheticlambda02;
                    setadreviewlistener = setadreviewlistener2;
                    return new getAdViewTracker.IAuthTabCallback(hcexternalsyntheticlambda03, ((setAdReviewListener.IAuthTabCallback) setadreviewlistener).IAuthTabCallback().onExtraCallback());
                }
                Object obj32 = null;
                i = asInterface + 43;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // o.hbExternalSyntheticLambda6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(@NotNull hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, @Nullable ReactHost reactHost, @NotNull o4 o4Var, @NotNull access13800<? super getAdViewTracker> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        o4 o4Var2;
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda02;
        hcExternalSyntheticLambda0 hcexternalsyntheticlambda03 = hcexternalsyntheticlambda0;
        int i = 2 % 2;
        if (!(access13800Var instanceof onExtraCallbackWithResult)) {
            onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
        } else {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallback + 51;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                onextracallbackwithresult.label = i2 - 2147483648;
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        Object obj = onextracallbackwithresult2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult2.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (reactHost != null) {
                    int i6 = onExtraCallback + 1;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    ReactContext reactContextOnExtraCallbackWithResult = reactHost.onExtraCallbackWithResult();
                    if (reactContextOnExtraCallbackWithResult != null) {
                        if (!Intrinsics.areEqual(o4Var.IAuthTabCallbackDefault().IAuthTabCallback(), hcexternalsyntheticlambda0.IAuthTabCallback())) {
                            return onExtraCallbackWithResult(hcexternalsyntheticlambda03, new IllegalStateException("Preloaded service bundle mismatch: expected=" + hcexternalsyntheticlambda0.IAuthTabCallback() + ", actual=" + o4Var.IAuthTabCallbackDefault().IAuthTabCallback()));
                        }
                        try {
                            int i8 = onExtraCallback.onWarmupCompleted[o4Var.asBinder().ordinal()];
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                getAdViewTracker.IAuthTabCallback iAuthTabCallback = new getAdViewTracker.IAuthTabCallback(hcexternalsyntheticlambda03, (String) null);
                                int i9 = asInterface + 19;
                                onExtraCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return iAuthTabCallback;
                            }
                            String strIAuthTabCallback = o4Var.IAuthTabCallback();
                            if (strIAuthTabCallback == null) {
                                throw new IllegalArgumentException(("Preloaded service bundle filePath is null: " + o4Var.IAuthTabCallbackDefault().IAuthTabCallback()).toString());
                            }
                            String str = (String) n7.IAuthTabCallback(new Object[]{o4Var.IAuthTabCallbackDefault()}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 706361440, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -706361440);
                            String strIAuthTabCallback2 = o4Var.IAuthTabCallbackDefault().IAuthTabCallback();
                            onextracallbackwithresult2.L$0 = hcexternalsyntheticlambda03;
                            onextracallbackwithresult2.L$1 = access15400.onNavigationEvent(reactHost);
                            o4Var2 = o4Var;
                            onextracallbackwithresult2.L$2 = o4Var2;
                            onextracallbackwithresult2.L$3 = access15400.onNavigationEvent(reactContextOnExtraCallbackWithResult);
                            onextracallbackwithresult2.label = 1;
                            if (onExtraCallback(reactContextOnExtraCallbackWithResult, strIAuthTabCallback, str, strIAuthTabCallback2, onextracallbackwithresult2) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                            hcexternalsyntheticlambda02 = hcexternalsyntheticlambda03;
                        } catch (Throwable th) {
                            th = th;
                            getAdViewTracker.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(hcexternalsyntheticlambda03, th);
                            int i11 = onExtraCallback + 95;
                            asInterface = i11 % 128;
                            int i12 = i11 % 2;
                            return onnavigationeventOnExtraCallbackWithResult;
                        }
                    }
                }
                return IAuthTabCallback(hcexternalsyntheticlambda03, reactHost, "preloaded");
            }
            int i13 = asInterface + 83;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4Var2 = (o4) onextracallbackwithresult2.L$2;
            hcexternalsyntheticlambda02 = (hcExternalSyntheticLambda0) onextracallbackwithresult2.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (Throwable th2) {
                th = th2;
                hcexternalsyntheticlambda03 = hcexternalsyntheticlambda02;
                getAdViewTracker.onNavigationEvent onnavigationeventOnExtraCallbackWithResult2 = onExtraCallbackWithResult(hcexternalsyntheticlambda03, th);
                int i112 = onExtraCallback + 95;
                asInterface = i112 % 128;
                int i122 = i112 % 2;
                return onnavigationeventOnExtraCallbackWithResult2;
            }
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            getAdViewTracker.IAuthTabCallback iAuthTabCallback2 = new getAdViewTracker.IAuthTabCallback(hcexternalsyntheticlambda02, (String) o4.onWarmupCompleted(-1806201270, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1806201271, new Object[]{o4Var2}, iIAuthTabCallback, iIAuthTabCallback2));
            int i15 = onExtraCallback + 75;
            asInterface = i15 % 128;
            int i16 = i15 % 2;
            return iAuthTabCallback2;
        } catch (CancellationException e) {
            throw e;
        }
    }

    private final Object onExtraCallback(ReactContext reactContext, String str, String str2, String str3, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = MaxFullscreenAdImplExternalSyntheticLambda3.onWarmupCompleted.IAuthTabCallback(reactContext, str, str2, "ShoppingTabRnServiceBundleImportLazyExecutor", access8100.onNavigationEvent(getWrite.IAuthTabCallback("serviceBundleName", str3)), access13800Var);
        if (objIAuthTabCallback == access14300.onWarmupCompleted()) {
            int i4 = onExtraCallback + 119;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 75;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final getAdViewTracker.onNavigationEvent IAuthTabCallback(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, ReactHost reactHost, String str) {
        String strValueOf;
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("serviceBundleName", hcexternalsyntheticlambda0.IAuthTabCallback());
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("variant", str);
        if (reactHost != null) {
            int i2 = onExtraCallback + 111;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                String.valueOf(reactHost.hashCode());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            strValueOf = String.valueOf(reactHost.hashCode());
            if (strValueOf == null) {
                int i3 = onExtraCallback + 25;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 % 4;
                }
                strValueOf = "null";
            }
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "TossRnImportLazy", "import_lazy_react_context_unavailable", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("reactHostHash", strValueOf)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        return onExtraCallbackWithResult(hcexternalsyntheticlambda0, new IllegalStateException("ReactContext is not available for shopping tab RN service bundle importLazy"));
    }

    private final getAdViewTracker.onNavigationEvent onExtraCallbackWithResult(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, Throwable th) {
        int i = 2 % 2;
        getAdViewTracker.onNavigationEvent onnavigationevent = new getAdViewTracker.onNavigationEvent(hcexternalsyntheticlambda0, th);
        int i2 = onExtraCallback + 69;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
