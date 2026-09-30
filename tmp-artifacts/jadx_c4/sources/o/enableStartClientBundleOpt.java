package o;

import androidx.fragment.app.FragmentActivity;
import im.toss.feature.credit.overview.network.response.CreditOverview;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.addRuntimeMonitorLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableStartClientBundleOpt {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final getThresholdValueFromConfig onExtraCallbackWithResult;
    private final getSortedAppVersionsThresholdValue onWarmupCompleted;

    @Inject
    public enableStartClientBundleOpt(@NotNull getThresholdValueFromConfig getthresholdvaluefromconfig, @NotNull getSortedAppVersionsThresholdValue getsortedappversionsthresholdvalue) {
        Intrinsics.checkNotNullParameter(getthresholdvaluefromconfig, "");
        Intrinsics.checkNotNullParameter(getsortedappversionsthresholdvalue, "");
        this.onExtraCallbackWithResult = getthresholdvaluefromconfig;
        this.onWarmupCompleted = getsortedappversionsthresholdvalue;
    }

    public static final /* synthetic */ getThresholdValueFromConfig onExtraCallback(enableStartClientBundleOpt enablestartclientbundleopt) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        getThresholdValueFromConfig getthresholdvaluefromconfig = enablestartclientbundleopt.onExtraCallbackWithResult;
        int i5 = i3 + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return getthresholdvaluefromconfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getSortedAppVersionsThresholdValue onExtraCallbackWithResult(enableStartClientBundleOpt enablestartclientbundleopt) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getSortedAppVersionsThresholdValue getsortedappversionsthresholdvalue = enablestartclientbundleopt.onWarmupCompleted;
        if (i3 == 0) {
            return getsortedappversionsthresholdvalue;
        }
        throw null;
    }

    public final void IAuthTabCallback(@NotNull FragmentActivity fragmentActivity, @NotNull enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, @NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull UTF8Decoder uTF8Decoder, @NotNull enableNebulaDestroyOpt enablenebuladestroyopt, @Nullable TypeUtils1 typeUtils1, @NotNull Function1<? super CreditOverview, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(enableshowreminderonapppauseopt, "");
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Intrinsics.checkNotNullParameter(uTF8Decoder, "");
        Intrinsics.checkNotNullParameter(enablenebuladestroyopt, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        onExtraCallback(fragmentActivity, enableshowreminderonapppauseopt, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, enablenebuladestroyopt.onNavigationEvent(), typeUtils1, function1, function12);
        int i4 = onNavigationEvent + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(enableStartClientBundleOpt enablestartclientbundleopt, FragmentActivity fragmentActivity, enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, Function1 function1, Function1 function12, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
            enableshowreminderonapppauseopt = enableShowReminderOnAppPauseOpt.CREDIT_MAIN;
            int i4 = onNavigationEvent + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        enablestartclientbundleopt.onExtraCallback(fragmentActivity, enableshowreminderonapppauseopt, function1, function12);
    }

    public final void onExtraCallback(@NotNull FragmentActivity fragmentActivity, @NotNull enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, @NotNull Function1<? super CreditOverview, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(enableshowreminderonapppauseopt, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        onExtraCallback(this, fragmentActivity, enableshowreminderonapppauseopt, null, UTF8Decoder.CREDIT, enablePreTaskOpt.REFRESH, null, function1, function12, 32, null);
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void onExtraCallback(enableStartClientBundleOpt enablestartclientbundleopt, FragmentActivity fragmentActivity, enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, enablePreTaskOpt enablepretaskopt, TypeUtils1 typeUtils1, Function1 function1, Function1 function12, int i, Object obj) {
        TypeUtils1 typeUtils12;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        UTF8Decoder uTF8Decoder2 = (i & 8) != 0 ? UTF8Decoder.CREDIT : uTF8Decoder;
        if ((i & 32) != 0) {
            int i5 = onExtraCallback + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            typeUtils12 = null;
        } else {
            typeUtils12 = typeUtils1;
        }
        enablestartclientbundleopt.onExtraCallback(fragmentActivity, enableshowreminderonapppauseopt, rememberLottieCompositionKtlottieComposition1, uTF8Decoder2, enablepretaskopt, typeUtils12, function1, function12);
    }

    private final void onExtraCallback(FragmentActivity fragmentActivity, enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, enablePreTaskOpt enablepretaskopt, TypeUtils1 typeUtils1, Function1<? super CreditOverview, Unit> function1, Function1<? super Throwable, Unit> function12) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragmentActivity), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(function1, function12, rememberLottieCompositionKtlottieComposition1, uTF8Decoder, enablepretaskopt, enableshowreminderonapppauseopt, this, typeUtils1, null), 3, (Object) null);
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ RememberLottieCompositionKtlottieComposition1 $authView;
        final /* synthetic */ TypeUtils1 $faceAuthServiceType;
        final /* synthetic */ enableShowReminderOnAppPauseOpt $inquiryType;
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ Function1<CreditOverview, Unit> $onSuccess;
        final /* synthetic */ enablePreTaskOpt $overviewLoadStrategy;
        final /* synthetic */ UTF8Decoder $passwordType;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ enableStartClientBundleOpt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(Function1<? super CreditOverview, Unit> function1, Function1<? super Throwable, Unit> function12, RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, enablePreTaskOpt enablepretaskopt, enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, enableStartClientBundleOpt enablestartclientbundleopt, TypeUtils1 typeUtils1, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$onSuccess = function1;
            this.$onError = function12;
            this.$authView = rememberLottieCompositionKtlottieComposition1;
            this.$passwordType = uTF8Decoder;
            this.$overviewLoadStrategy = enablepretaskopt;
            this.$inquiryType = enableshowreminderonapppauseopt;
            this.this$0 = enablestartclientbundleopt;
            this.$faceAuthServiceType = typeUtils1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$onSuccess, this.$onError, this.$authView, this.$passwordType, this.$overviewLoadStrategy, this.$inquiryType, this.this$0, this.$faceAuthServiceType, access13800Var);
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static final class onExtraCallback extends SuspendLambda implements getBacktraceNote<RememberLottieCompositionKtlottieComposition1, UTF8Decoder, access13800<? super kotlin.Result<? extends Unit>>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ TypeUtils1 $faceAuthServiceType;
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ enableStartClientBundleOpt this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(enableStartClientBundleOpt enablestartclientbundleopt, TypeUtils1 typeUtils1, access13800<? super onExtraCallback> access13800Var) {
                super(3, access13800Var);
                this.this$0 = enablestartclientbundleopt;
                this.$faceAuthServiceType = typeUtils1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 77;
                onExtraCallback = i2 % 128;
                RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) obj;
                UTF8Decoder uTF8Decoder = (UTF8Decoder) obj2;
                access13800<? super kotlin.Result<Unit>> access13800Var = (access13800) obj3;
                if (i2 % 2 == 0) {
                    return onExtraCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, access13800Var);
                }
                onExtraCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, access13800Var);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }

            public final Object onExtraCallback(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, UTF8Decoder uTF8Decoder, access13800<? super kotlin.Result<Unit>> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.this$0, this.$faceAuthServiceType, access13800Var);
                onextracallback.L$0 = rememberLottieCompositionKtlottieComposition1;
                onextracallback.L$1 = uTF8Decoder;
                Object objInvokeSuspend = onextracallback.invokeSuspend(Unit.INSTANCE);
                int i2 = onExtraCallback + 105;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                Object objIAuthTabCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) this.L$0;
                UTF8Decoder uTF8Decoder = (UTF8Decoder) this.L$1;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onExtraCallback + 99;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objIAuthTabCallback = ((kotlin.Result) obj).onNavigationEvent();
                } else {
                    ResultKt.onNavigationEvent(obj);
                    getThresholdValueFromConfig getthresholdvaluefromconfigOnExtraCallback = enableStartClientBundleOpt.onExtraCallback(this.this$0);
                    TypeUtils1 typeUtils1 = this.$faceAuthServiceType;
                    this.L$0 = access15400.onNavigationEvent(rememberLottieCompositionKtlottieComposition1);
                    this.L$1 = access15400.onNavigationEvent(uTF8Decoder);
                    this.label = 1;
                    objIAuthTabCallback = getthresholdvaluefromconfigOnExtraCallback.IAuthTabCallback(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, typeUtils1, this);
                    if (objIAuthTabCallback == objOnWarmupCompleted) {
                        int i6 = IAuthTabCallback + 69;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return kotlin.Result.IAuthTabCallback(objIAuthTabCallback);
            }
        }

        /* renamed from: o.enableStartClientBundleOpt$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        static final class C0024onNavigationEvent extends SuspendLambda implements getBacktraceNote<enablePreTaskOpt, enableShowReminderOnAppPauseOpt, access13800<? super kotlin.Result<? extends CreditOverview>>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ enableStartClientBundleOpt this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0024onNavigationEvent(enableStartClientBundleOpt enablestartclientbundleopt, access13800<? super C0024onNavigationEvent> access13800Var) {
                super(3, access13800Var);
                this.this$0 = enablestartclientbundleopt;
            }

            public final Object IAuthTabCallback(enablePreTaskOpt enablepretaskopt, enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, access13800<? super kotlin.Result<CreditOverview>> access13800Var) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                C0024onNavigationEvent c0024onNavigationEvent = new C0024onNavigationEvent(this.this$0, access13800Var);
                c0024onNavigationEvent.L$0 = enablepretaskopt;
                c0024onNavigationEvent.L$1 = enableshowreminderonapppauseopt;
                Object objInvokeSuspend = c0024onNavigationEvent.invokeSuspend(Unit.INSTANCE);
                int i2 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 33 / 0;
                }
                return objInvokeSuspend;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i2 % 128;
                enablePreTaskOpt enablepretaskopt = (enablePreTaskOpt) obj;
                enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt = (enableShowReminderOnAppPauseOpt) obj2;
                access13800<? super kotlin.Result<CreditOverview>> access13800Var = (access13800) obj3;
                if (i2 % 2 != 0) {
                    IAuthTabCallback(enablepretaskopt, enableshowreminderonapppauseopt, access13800Var);
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(enablepretaskopt, enableshowreminderonapppauseopt, access13800Var);
                int i3 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                enablePreTaskOpt enablepretaskopt = (enablePreTaskOpt) this.L$0;
                enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt = (enableShowReminderOnAppPauseOpt) this.L$1;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getSortedAppVersionsThresholdValue getsortedappversionsthresholdvalueOnExtraCallbackWithResult = enableStartClientBundleOpt.onExtraCallbackWithResult(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(enablepretaskopt);
                    this.L$1 = access15400.onNavigationEvent(enableshowreminderonapppauseopt);
                    this.label = 1;
                    objOnExtraCallbackWithResult = getsortedappversionsthresholdvalueOnExtraCallbackWithResult.onExtraCallbackWithResult(enableshowreminderonapppauseopt, enablepretaskopt, this);
                    if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 13;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallbackWithResult = ((kotlin.Result) obj).onNavigationEvent();
                }
                return kotlin.Result.IAuthTabCallback(objOnExtraCallbackWithResult);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00d4 A[Catch: Exception -> 0x0108, CancellationException -> 0x0114, WebResourceResponseModel -> 0x0116, TryCatch #2 {CancellationException -> 0x0114, Exception -> 0x0108, WebResourceResponseModel -> 0x0116, blocks: (B:8:0x0027, B:28:0x00ce, B:30:0x00d4, B:32:0x00dc, B:33:0x00de, B:40:0x00fe, B:35:0x00f0, B:39:0x00fa, B:13:0x004e, B:19:0x0093, B:21:0x0099, B:23:0x00a1, B:24:0x00a3, B:25:0x00ac, B:16:0x0067), top: B:60:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f0 A[Catch: Exception -> 0x0108, CancellationException -> 0x0114, WebResourceResponseModel -> 0x0116, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0114, Exception -> 0x0108, WebResourceResponseModel -> 0x0116, blocks: (B:8:0x0027, B:28:0x00ce, B:30:0x00d4, B:32:0x00dc, B:33:0x00de, B:40:0x00fe, B:35:0x00f0, B:39:0x00fa, B:13:0x004e, B:19:0x0093, B:21:0x0099, B:23:0x00a1, B:24:0x00a3, B:25:0x00ac, B:16:0x0067), top: B:60:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objIAuthTabCallback;
            Throwable th;
            Object objOnNavigationEvent;
            Throwable th2;
            enablePreTaskOpt enablepretaskopt;
            enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt;
            enableStartClientBundleOpt enablestartclientbundleopt;
            Object objOnWarmupCompleted;
            int i;
            int i2;
            onNavigationEvent onnavigationevent;
            Object objOnExtraCallbackWithResult;
            Object obj2;
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i6 = this.label;
            Object obj3 = null;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = kotlin.Result.Companion;
                objIAuthTabCallback = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = kotlin.Result.Companion;
                objIAuthTabCallback = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i6 == 0) {
                ResultKt.onNavigationEvent(obj);
                RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = this.$authView;
                UTF8Decoder uTF8Decoder = this.$passwordType;
                enablepretaskopt = this.$overviewLoadStrategy;
                enableshowreminderonapppauseopt = this.$inquiryType;
                enablestartclientbundleopt = this.this$0;
                TypeUtils1 typeUtils1 = this.$faceAuthServiceType;
                Result.Companion companion3 = kotlin.Result.Companion;
                onExtraCallback onextracallback = new onExtraCallback(enablestartclientbundleopt, typeUtils1, null);
                this.L$0 = enablepretaskopt;
                this.L$1 = enableshowreminderonapppauseopt;
                this.L$2 = enablestartclientbundleopt;
                this.L$3 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objOnWarmupCompleted = enableTransferTinyOpt.onWarmupCompleted(rememberLottieCompositionKtlottieComposition1, uTF8Decoder, onextracallback, this);
                if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                    int i7 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    i = 0;
                    i2 = 0;
                    onnavigationevent = this;
                }
                return objOnWarmupCompleted2;
            }
            int i9 = onExtraCallbackWithResult + 125;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = ((kotlin.Result) obj).onNavigationEvent();
                if (kotlin.Result.onExtraCallback(objOnExtraCallbackWithResult)) {
                    Result.Companion companion4 = kotlin.Result.Companion;
                    if (!kotlin.Result.onExtraCallback(objOnExtraCallbackWithResult)) {
                        obj3 = objOnExtraCallbackWithResult;
                    }
                    obj2 = kotlin.Result.constructor-impl(obj3);
                } else {
                    Result.Companion companion5 = kotlin.Result.Companion;
                    Throwable th3 = kotlin.Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                    if (th3 == null) {
                        th3 = addRuntimeMonitorLog.onExtraCallback.IAuthTabCallback;
                    }
                    obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th3));
                    int i11 = onExtraCallback + 25;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                }
                objIAuthTabCallback = kotlin.Result.constructor-impl(kotlin.Result.IAuthTabCallback(obj2));
                th = kotlin.Result.exceptionOrNull-impl(objIAuthTabCallback);
                if (th != null) {
                    Result.Companion companion6 = kotlin.Result.Companion;
                    objIAuthTabCallback = kotlin.Result.IAuthTabCallback(kotlin.Result.constructor-impl(ResultKt.createFailure(th)));
                }
                objOnNavigationEvent = ((kotlin.Result) objIAuthTabCallback).onNavigationEvent();
                Function1<CreditOverview, Unit> function1 = this.$onSuccess;
                if (kotlin.Result.onNavigationEvent(objOnNavigationEvent)) {
                    function1.invoke(objOnNavigationEvent);
                }
                Function1<Throwable, Unit> function12 = this.$onError;
                th2 = kotlin.Result.exceptionOrNull-impl(objOnNavigationEvent);
                if (th2 != null) {
                    function12.invoke(th2);
                }
                return Unit.INSTANCE;
            }
            i = this.I$1;
            i2 = this.I$0;
            onnavigationevent = (access13800) this.L$3;
            enablestartclientbundleopt = (enableStartClientBundleOpt) this.L$2;
            enableshowreminderonapppauseopt = (enableShowReminderOnAppPauseOpt) this.L$1;
            enablepretaskopt = (enablePreTaskOpt) this.L$0;
            ResultKt.onNavigationEvent(obj);
            objOnWarmupCompleted = ((kotlin.Result) obj).onNavigationEvent();
            if (kotlin.Result.onExtraCallback(objOnWarmupCompleted)) {
                Result.Companion companion7 = kotlin.Result.Companion;
                Throwable th4 = kotlin.Result.exceptionOrNull-impl(objOnWarmupCompleted);
                if (th4 == null) {
                    th4 = addRuntimeMonitorLog.onNavigationEvent.onNavigationEvent;
                }
                obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th4));
                objIAuthTabCallback = kotlin.Result.constructor-impl(kotlin.Result.IAuthTabCallback(obj2));
                th = kotlin.Result.exceptionOrNull-impl(objIAuthTabCallback);
                if (th != null) {
                }
                objOnNavigationEvent = ((kotlin.Result) objIAuthTabCallback).onNavigationEvent();
                Function1<CreditOverview, Unit> function13 = this.$onSuccess;
                if (kotlin.Result.onNavigationEvent(objOnNavigationEvent)) {
                }
                Function1<Throwable, Unit> function122 = this.$onError;
                th2 = kotlin.Result.exceptionOrNull-impl(objOnNavigationEvent);
                if (th2 != null) {
                }
                return Unit.INSTANCE;
            }
            C0024onNavigationEvent c0024onNavigationEvent = new C0024onNavigationEvent(enablestartclientbundleopt, null);
            this.L$0 = access15400.onNavigationEvent(onnavigationevent);
            this.L$1 = access15400.onNavigationEvent(objOnWarmupCompleted);
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 2;
            objOnExtraCallbackWithResult = enableTransferTinyOpt.onExtraCallbackWithResult(enablepretaskopt, enableshowreminderonapppauseopt, (getBacktraceNote) c0024onNavigationEvent, (access13800) this);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted2) {
                return objOnWarmupCompleted2;
            }
            if (kotlin.Result.onExtraCallback(objOnExtraCallbackWithResult)) {
            }
            objIAuthTabCallback = kotlin.Result.constructor-impl(kotlin.Result.IAuthTabCallback(obj2));
            th = kotlin.Result.exceptionOrNull-impl(objIAuthTabCallback);
            if (th != null) {
            }
            objOnNavigationEvent = ((kotlin.Result) objIAuthTabCallback).onNavigationEvent();
            Function1<CreditOverview, Unit> function132 = this.$onSuccess;
            if (kotlin.Result.onNavigationEvent(objOnNavigationEvent)) {
            }
            Function1<Throwable, Unit> function1222 = this.$onError;
            th2 = kotlin.Result.exceptionOrNull-impl(objOnNavigationEvent);
            if (th2 != null) {
            }
            return Unit.INSTANCE;
        }
    }
}
