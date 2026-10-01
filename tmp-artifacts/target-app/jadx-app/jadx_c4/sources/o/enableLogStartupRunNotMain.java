package o;

import com.google.android.gms.internal.ads.zzgc;
import im.toss.feature.credit.overview.network.response.CreditOverview;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableLogStartupRunNotMain implements enableLitePreloadOpt {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final enableOrientationOpt IAuthTabCallback;
    private final enablePreloadSwitchOpt onExtraCallback;
    private final enableOrientationOptNew onExtraCallbackWithResult;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = enableLogStartupRunNotMain.this.onWarmupCompleted(null, this);
            if (objOnWarmupCompleted == access14300.onWarmupCompleted()) {
                int i2 = onWarmupCompleted + 101;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 71 / 0;
                }
                return objOnWarmupCompleted;
            }
            kotlin.Result resultIAuthTabCallback = kotlin.Result.IAuthTabCallback(objOnWarmupCompleted);
            int i4 = onNavigationEvent + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return resultIAuthTabCallback;
            }
            throw null;
        }
    }

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallback = enableLogStartupRunNotMain.this.onExtraCallback(false, null, this);
            if (objOnExtraCallback != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objOnExtraCallback);
            }
            int i2 = IAuthTabCallback;
            int i3 = i2 + 113;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i4 = i2 + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = enableLogStartupRunNotMain.this.IAuthTabCallback((access13800<? super kotlin.Result<CreditOverview>>) this);
            if (objIAuthTabCallback != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objIAuthTabCallback);
            }
            int i4 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = enableLogStartupRunNotMain.this.onExtraCallback(this);
            if (objOnExtraCallback != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objOnExtraCallback);
            }
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            enableLogStartupRunNotMain enablelogstartuprunnotmain = enableLogStartupRunNotMain.this;
            if (i3 != 0) {
                enablelogstartuprunnotmain.onWarmupCompleted(this);
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = enablelogstartuprunnotmain.onWarmupCompleted(this);
            if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
                return kotlin.Result.IAuthTabCallback(objOnWarmupCompleted);
            }
            int i4 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    @Inject
    public enableLogStartupRunNotMain(@NotNull enableOrientationOpt enableorientationopt, @NotNull enablePreloadSwitchOpt enablepreloadswitchopt, @NotNull enableOrientationOptNew enableorientationoptnew) {
        Intrinsics.checkNotNullParameter(enableorientationopt, "");
        Intrinsics.checkNotNullParameter(enablepreloadswitchopt, "");
        Intrinsics.checkNotNullParameter(enableorientationoptnew, "");
        this.IAuthTabCallback = enableorientationopt;
        this.onExtraCallback = enablepreloadswitchopt;
        this.onExtraCallbackWithResult = enableorientationoptnew;
    }

    public static final /* synthetic */ enablePreloadSwitchOpt IAuthTabCallback(enableLogStartupRunNotMain enablelogstartuprunnotmain) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        enablePreloadSwitchOpt enablepreloadswitchopt = enablelogstartuprunnotmain.onExtraCallback;
        int i5 = i3 + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enablepreloadswitchopt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // o.enableLitePreloadOpt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(boolean z, @NotNull String str, @NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var) {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        Object obj;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallbackStub) {
            iAuthTabCallbackStub = (IAuthTabCallbackStub) access13800Var;
            int i2 = iAuthTabCallbackStub.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStub.label = i2 - 2147483648;
                int i3 = onNavigationEvent + 35;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallbackStub.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallbackStub.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = kotlin.Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(null, this, z, str);
                iAuthTabCallbackStub.L$0 = access15400.onNavigationEvent(str);
                iAuthTabCallbackStub.L$1 = access15400.onNavigationEvent(iAuthTabCallbackStub);
                iAuthTabCallbackStub.Z$0 = z;
                iAuthTabCallbackStub.I$0 = 0;
                iAuthTabCallbackStub.I$1 = 0;
                iAuthTabCallbackStub.I$2 = 0;
                iAuthTabCallbackStub.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallbackDefault, iAuthTabCallbackStub);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i6 = onNavigationEvent + 61;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
            obj = kotlin.Result.constructor-impl(objOnExtraCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
        }
        if (kotlin.Result.onNavigationEvent(obj)) {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult((CreditOverview) obj);
            int i8 = onNavigationEvent + 43;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // o.enableLitePreloadOpt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(@NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i3 = onNavigationEvent + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onextracallback = (onExtraCallback) access13800Var;
            int i5 = onextracallback.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i5 - 2147483648;
                i = onWarmupCompleted + 7;
                onNavigationEvent = i % 128;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
                i = onNavigationEvent + 63;
                onWarmupCompleted = i % 128;
            }
        }
        int i6 = i % 2;
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallback.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return ((kotlin.Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        CreditOverview creditOverviewOnNavigationEvent = onNavigationEvent();
        if (creditOverviewOnNavigationEvent == null) {
            onextracallback.L$0 = access15400.onNavigationEvent(creditOverviewOnNavigationEvent);
            onextracallback.label = 1;
            Object objOnExtraCallback = onExtraCallback(onextracallback);
            return objOnExtraCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallback;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CreditOverviewCacheLog", "Local cache hit in getLocalOrRemoteCache / " + creditOverviewOnNavigationEvent.IAuthTabCallbackDefault(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        Result.Companion companion = kotlin.Result.Companion;
        return kotlin.Result.constructor-impl(creditOverviewOnNavigationEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    @Override // o.enableLitePreloadOpt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, @NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = access13800Var instanceof IAuthTabCallback;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallback) {
            int i4 = i2 + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i6 = iAuthTabCallback.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                int i7 = onNavigationEvent + 17;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                iAuthTabCallback.label = i6 - 2147483648;
                int i9 = onWarmupCompleted + 3;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj2 = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i11 = iAuthTabCallback.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj2);
            return ((kotlin.Result) obj2).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj2);
        CreditOverview creditOverviewOnNavigationEvent = onNavigationEvent();
        if (creditOverviewOnNavigationEvent == null) {
            String param = enableshowreminderonapppauseopt.getParam();
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(enableshowreminderonapppauseopt);
            iAuthTabCallback.L$1 = access15400.onNavigationEvent(creditOverviewOnNavigationEvent);
            iAuthTabCallback.label = 1;
            Object objOnExtraCallback = onExtraCallback(true, param, iAuthTabCallback);
            return objOnExtraCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallback;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CreditOverviewCacheLog", "Local cache hit in getLocalOrRefresh / " + creditOverviewOnNavigationEvent.IAuthTabCallbackDefault(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        Result.Companion companion = kotlin.Result.Companion;
        Object obj3 = kotlin.Result.constructor-impl(creditOverviewOnNavigationEvent);
        int i12 = onNavigationEvent + 89;
        onWarmupCompleted = i12 % 128;
        if (i12 % 2 != 0) {
            return obj3;
        }
        obj.hashCode();
        throw null;
    }

    public CreditOverview onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditOverview creditOverviewOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent();
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return creditOverviewOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.enableLitePreloadOpt
    public void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // o.enableLitePreloadOpt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var) {
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i4 = onnavigationevent.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i4 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object objOnExtraCallback = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onnavigationevent.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = kotlin.Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, this);
                onnavigationevent.L$0 = access15400.onNavigationEvent(onnavigationevent);
                onnavigationevent.I$0 = 0;
                onnavigationevent.I$1 = 0;
                onnavigationevent.I$2 = 0;
                onnavigationevent.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, onnavigationevent);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
            Object obj = kotlin.Result.constructor-impl(objOnExtraCallback);
            int i6 = onNavigationEvent + 81;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return obj;
            }
            throw null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r4
      0x002b: PHI (r1v10 o.enableLogStartupRunNotMain$onWarmupCompleted) = (r1v9 o.enableLogStartupRunNotMain$onWarmupCompleted), (r1v12 o.enableLogStartupRunNotMain$onWarmupCompleted) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // o.enableLitePreloadOpt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull access13800<? super kotlin.Result<String>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i3 = onWarmupCompleted + 113;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                i = onwarmupcompleted.label;
                int i4 = 38 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i - 2147483648;
                } else {
                    onwarmupcompleted = new onWarmupCompleted(access13800Var);
                    int i5 = onNavigationEvent + 103;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                i = onwarmupcompleted.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object objOnExtraCallback = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onwarmupcompleted.label;
        try {
            if (i7 != 0) {
                int i8 = onWarmupCompleted + 29;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
            } else {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = kotlin.Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onTransact ontransact = new onTransact(null, this);
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(onwarmupcompleted);
                onwarmupcompleted.I$0 = 0;
                onwarmupcompleted.I$1 = 0;
                onwarmupcompleted.I$2 = 0;
                onwarmupcompleted.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, ontransact, onwarmupcompleted);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i10 = onNavigationEvent + 115;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            return kotlin.Result.constructor-impl(objOnExtraCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
        }
    }

    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditOverview>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean $refresh$inlined;
        final /* synthetic */ String $view$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ enableLogStartupRunNotMain this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(access13800 access13800Var, enableLogStartupRunNotMain enablelogstartuprunnotmain, boolean z, String str) {
            super(2, access13800Var);
            this.this$0 = enablelogstartuprunnotmain;
            this.$refresh$inlined = z;
            this.$view$inlined = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var, this.this$0, this.$refresh$inlined, this.$view$inlined);
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super CreditOverview> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 111;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                enablePreloadSwitchOpt enablepreloadswitchoptIAuthTabCallback = enableLogStartupRunNotMain.IAuthTabCallback(this.this$0);
                boolean z = this.$refresh$inlined;
                String str = this.$view$inlined;
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = enablepreloadswitchoptIAuthTabCallback.onWarmupCompleted(z, str, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            int i5 = IAuthTabCallback + 113;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact == null) {
                    throw new NullPointerException("null cannot be cast to non-null type im.toss.feature.credit.overview.network.response.CreditOverview");
                }
                int i7 = IAuthTabCallback + 33;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return (CreditOverview) objOnTransact;
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(CreditOverview.class, Object.class)) {
                    int i9 = IAuthTabCallback + 77;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        Intrinsics.areEqual(CreditOverview.class, Unit.class);
                        throw null;
                    }
                    if (!Intrinsics.areEqual(CreditOverview.class, Unit.class)) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CreditOverview>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ enableLogStartupRunNotMain this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, enableLogStartupRunNotMain enablelogstartuprunnotmain) {
            super(2, access13800Var);
            this.this$0 = enablelogstartuprunnotmain;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.this$0);
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super CreditOverview> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                enablePreloadSwitchOpt enablepreloadswitchoptIAuthTabCallback = enableLogStartupRunNotMain.IAuthTabCallback(this.this$0);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = enablepreloadswitchoptIAuthTabCallback.onExtraCallback(this);
                if (obj == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 73;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            try {
                Object objOnTransact = baseApiResponse.onTransact();
                if (objOnTransact == null) {
                    throw new NullPointerException("null cannot be cast to non-null type im.toss.feature.credit.overview.network.response.CreditOverview");
                }
                int i5 = onExtraCallback + 111;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return (CreditOverview) objOnTransact;
                }
                int i6 = 99 / 0;
                return (CreditOverview) objOnTransact;
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(CreditOverview.class, Object.class) || Intrinsics.areEqual(CreditOverview.class, Unit.class)) {
                    return Unit.INSTANCE;
                }
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                throw apiErrorOnExtraCallbackWithResult;
            }
        }
    }

    public static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ enableLogStartupRunNotMain this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(access13800 access13800Var, enableLogStartupRunNotMain enablelogstartuprunnotmain) {
            super(2, access13800Var);
            this.this$0 = enablelogstartuprunnotmain;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(access13800Var, this.this$0);
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 53 / 0;
            }
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super String> access13800Var) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                ontransactCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = ontransactCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                enablePreloadSwitchOpt enablepreloadswitchoptIAuthTabCallback = enableLogStartupRunNotMain.IAuthTabCallback(this.this$0);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = enablepreloadswitchoptIAuthTabCallback.onWarmupCompleted(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            int i4 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    return (String) baseApiResponse.onTransact();
                }
                String str = (String) baseApiResponse.onTransact();
                int i5 = 4 / 0;
                return str;
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(String.class, Object.class) || Intrinsics.areEqual(String.class, Unit.class)) {
                    return Unit.INSTANCE;
                }
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                throw apiErrorOnExtraCallbackWithResult;
            }
        }
    }
}
