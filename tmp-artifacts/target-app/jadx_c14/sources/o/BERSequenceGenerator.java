package o;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BERSequenceGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.account.WithdrawalAccount;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BERSequenceGenerator extends ViewModel {
    private final Rmipmap<onExtraCallbackWithResult> IAuthTabCallback;
    private final LiveData<Boolean> IAuthTabCallbackStub;
    private final MutableLiveData<Set<onExtraCallback>> onExtraCallback;
    private final MutableLiveData<List<IAuthTabCallback>> onExtraCallbackWithResult = new MutableLiveData<>();
    private final Rmipmap<onNavigationEvent> onNavigationEvent;
    private final MutableLiveData<Set<onExtraCallback>> onWarmupCompleted;

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        int I$0;
        long J$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BERSequenceGenerator.this.onWarmupCompleted(0, 0L, this);
        }
    }

    static final class asInterface extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BERSequenceGenerator.this.IAuthTabCallback((access13800<? super Unit>) this);
        }
    }

    public BERSequenceGenerator() {
        MutableLiveData<Set<onExtraCallback>> mutableLiveData = new MutableLiveData<>();
        this.onWarmupCompleted = mutableLiveData;
        this.onExtraCallback = new MutableLiveData<>();
        this.onNavigationEvent = new Rmipmap<>();
        this.IAuthTabCallback = new Rmipmap<>();
        this.IAuthTabCallbackStub = ProcessTextApi23ImplExternalSyntheticLambda1.IAuthTabCallback(ProcessTextApi23ImplExternalSyntheticLambda1.IAuthTabCallback(mutableLiveData, new Function1() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsViewModel$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BERSequenceGenerator.onExtraCallbackWithResult((Set) obj));
            }
        }));
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(null), 3, (Object) null);
    }

    public final LiveData<List<IAuthTabCallback>> onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final LiveData<Set<onExtraCallback>> onExtraCallback() {
        return this.onExtraCallback;
    }

    public final LiveData<onNavigationEvent> onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final LiveData<onExtraCallbackWithResult> IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final LiveData<Boolean> onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(Set set) {
        Intrinsics.checkNotNull(set);
        return !set.isEmpty();
    }

    /* renamed from: o.BERSequenceGenerator$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        AnonymousClass5(access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return BERSequenceGenerator.this.new AnonymousClass5(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                BERSequenceGenerator bERSequenceGenerator = BERSequenceGenerator.this;
                this.label = 1;
                if (bERSequenceGenerator.IAuthTabCallback((access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends WithdrawalAccount>>, Object> {
        int I$0;
        Object L$0;
        int label;

        public asBinder(access13800 access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new asBinder(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<? extends WithdrawalAccount>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 22 - Color.blue(0), 24734 - (ViewConfiguration.getScrollBarSize() >> 8), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getLongPressTimeout() >> 16)), 23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 24734 - (ViewConfiguration.getTouchSlop() >> 8), -1154144738, false, "access000", new Class[0]);
                    }
                    getMediaViewVideoRendererApi getmediaviewvideorendererapi = (getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getmediaviewvideorendererapi.getInterfaceDescriptor(this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (List) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<viva.republica.toss.network.model.account.WithdrawalAccount>");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(List.class, Object.class) || Intrinsics.areEqual(List.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r10 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object IAuthTabCallback(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof o.BERSequenceGenerator.asInterface
            if (r0 == 0) goto L13
            r0 = r10
            o.BERSequenceGenerator$asInterface r0 = (o.BERSequenceGenerator.asInterface) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.BERSequenceGenerator$asInterface r0 = new o.BERSequenceGenerator$asInterface
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            kotlin.ResultKt.onNavigationEvent(r10)
            goto Lad
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            java.lang.Object r2 = r0.L$0
            o.access13800 r2 = (o.access13800) r2
            kotlin.ResultKt.onNavigationEvent(r10)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            goto L67
        L45:
            kotlin.ResultKt.onNavigationEvent(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            o.GeckoHubImp r10 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            o.BERSequenceGenerator$asBinder r2 = new o.BERSequenceGenerator$asBinder     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            r2.<init>(r3)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            java.lang.Object r7 = o.access15400.onNavigationEvent(r0)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            r0.L$0 = r7     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            r0.I$0 = r6     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            r0.I$1 = r6     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            r0.I$2 = r6     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            r0.label = r5     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            java.lang.Object r10 = o.maybeUpdateAnimatable.onExtraCallback(r10, r2, r0)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            if (r10 == r1) goto La9
        L67:
            java.lang.Object r10 = kotlin.Result.constructor-impl(r10)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L78 o.WebResourceResponseModel -> L7a
            goto L85
        L6c:
            r10 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.constructor-impl(r10)
            goto L85
        L78:
            r10 = move-exception
            throw r10
        L7a:
            r10 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.constructor-impl(r10)
        L85:
            boolean r2 = kotlin.Result.onNavigationEvent(r10)
            if (r2 == 0) goto Lb5
            r2 = r10
            java.util.List r2 = (java.util.List) r2
            o.GeckoHubImp r5 = o.putChannelInfo.IAuthTabCallback()
            o.BERSequenceGenerator$onTransact r7 = new o.BERSequenceGenerator$onTransact
            r7.<init>(r2, r3)
            r0.L$0 = r10
            java.lang.Object r2 = o.access15400.onNavigationEvent(r2)
            r0.L$1 = r2
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r0 = o.maybeUpdateAnimatable.onExtraCallback(r5, r7, r0)
            if (r0 != r1) goto Laa
        La9:
            return r1
        Laa:
            r8 = r0
            r0 = r10
            r10 = r8
        Lad:
            java.util.List r10 = (java.util.List) r10
            androidx.lifecycle.MutableLiveData<java.util.List<o.BERSequenceGenerator$IAuthTabCallback>> r1 = r9.onExtraCallbackWithResult
            r1.setValue(r10)
            r10 = r0
        Lb5:
            java.lang.Throwable r10 = kotlin.Result.exceptionOrNull-impl(r10)
            if (r10 == 0) goto Lc5
            o.Rmipmap<o.BERSequenceGenerator$onExtraCallbackWithResult> r0 = r9.IAuthTabCallback
            o.BERSequenceGenerator$onExtraCallbackWithResult$onExtraCallback r1 = new o.BERSequenceGenerator$onExtraCallbackWithResult$onExtraCallback
            r1.<init>(r10)
            r0.setValue(r1)
        Lc5:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BERSequenceGenerator.IAuthTabCallback(o.access13800):java.lang.Object");
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends IAuthTabCallback>>, Object> {
        final /* synthetic */ List<WithdrawalAccount> $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(List<WithdrawalAccount> list, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$it = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onTransact(this.$it, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<IAuthTabCallback>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                int r0 = r13.label
                if (r0 != 0) goto L87
                kotlin.ResultKt.onNavigationEvent(r14)
                java.util.List<viva.republica.toss.network.model.account.WithdrawalAccount> r14 = r13.$it
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r14, r1)
                r0.<init>(r1)
                java.util.Iterator r14 = r14.iterator()
            L1a:
                boolean r1 = r14.hasNext()
                if (r1 == 0) goto L86
                java.lang.Object r1 = r14.next()
                viva.republica.toss.network.model.account.WithdrawalAccount r1 = (viva.republica.toss.network.model.account.WithdrawalAccount) r1
                o.send$onWarmupCompleted r2 = o.send.Companion
                o.send r2 = r2.onWarmupCompleted()
                int r3 = r1.IAuthTabCallback()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                o.checkNavigationBarBySystemProperties r2 = r2.onExtraCallback(r3)
                long r3 = r1.onNavigationEvent()
                long r6 = o.BERSequenceGenerator.onExtraCallback.onExtraCallback(r3)
                int r8 = r1.IAuthTabCallback()
                if (r2 == 0) goto L4b
                java.lang.String r3 = r2.getInterfaceDescriptor()
                goto L4c
            L4b:
                r3 = 0
            L4c:
                r9 = r3
                java.lang.String r10 = r1.onExtraCallbackWithResult()
                if (r2 == 0) goto L76
                java.lang.String r2 = r2.IAuthTabCallbackStubProxy()
                if (r2 == 0) goto L76
                java.lang.String r3 = r1.onWarmupCompleted()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                if (r2 != 0) goto L74
                goto L76
            L74:
                r11 = r2
                goto L7b
            L76:
                java.lang.String r1 = r1.onWarmupCompleted()
                r11 = r1
            L7b:
                o.BERSequenceGenerator$IAuthTabCallback r1 = new o.BERSequenceGenerator$IAuthTabCallback
                r12 = 0
                r5 = r1
                r5.<init>(r6, r8, r9, r10, r11, r12)
                r0.add(r1)
                goto L1a
            L86:
                return r0
            L87:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BERSequenceGenerator.onTransact.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ long $accountId;
        final /* synthetic */ IAuthTabCallback $accountUiModel;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(long j, IAuthTabCallback iAuthTabCallback, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$accountId = j;
            this.$accountUiModel = iAuthTabCallback;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return BERSequenceGenerator.this.new onWarmupCompleted(this.$accountId, this.$accountUiModel, access13800Var);
        }

        public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Object>, Object> {
            final /* synthetic */ long $accountId$inlined;
            int I$0;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(access13800 access13800Var, long j) {
                super(2, access13800Var);
                this.$accountId$inlined = j;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onNavigationEvent(access13800Var, this.$accountId$inlined);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Object> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, View.combineMeasuredStates(0, 0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Object obj2 = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 29426), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, ExpandableListView.getPackedPositionChild(0L) + 24735, -1154144738, false, "access000", new Class[0]);
                        }
                        getMediaViewVideoRendererApi getmediaviewvideorendererapi = (getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj2, null);
                        long j = this.$accountId$inlined;
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = getmediaviewvideorendererapi.onExtraCallback(j, (access13800<? super BaseApiResponse<Object>>) this);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(Object.class, Object.class) || Intrinsics.areEqual(Object.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    BERSequenceGenerator bERSequenceGenerator = BERSequenceGenerator.this;
                    bERSequenceGenerator.IAuthTabCallback(bERSequenceGenerator.onWarmupCompleted, this.$accountId);
                    long j = this.$accountId;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onNavigationEvent onnavigationevent = new onNavigationEvent(null, j);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (Exception e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            BERSequenceGenerator bERSequenceGenerator2 = BERSequenceGenerator.this;
            IAuthTabCallback iAuthTabCallback = this.$accountUiModel;
            if (Result.onNavigationEvent(obj2)) {
                bERSequenceGenerator2.onNavigationEvent.setValue(new onNavigationEvent.onExtraCallback(iAuthTabCallback));
            }
            BERSequenceGenerator bERSequenceGenerator3 = BERSequenceGenerator.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                bERSequenceGenerator3.IAuthTabCallback.setValue(new onExtraCallbackWithResult.onWarmupCompleted(th));
            }
            BERSequenceGenerator bERSequenceGenerator4 = BERSequenceGenerator.this;
            bERSequenceGenerator4.onNavigationEvent(bERSequenceGenerator4.onWarmupCompleted, this.$accountId);
            return Unit.INSTANCE;
        }
    }

    public final void IAuthTabCallback(@NotNull IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(iAuthTabCallback.onNavigationEvent(), iAuthTabCallback, null), 3, (Object) null);
    }

    public final void onWarmupCompleted(@NotNull IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(this, iAuthTabCallback.onNavigationEvent(), iAuthTabCallback, (access13800) null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (IAuthTabCallback((o.access13800<? super kotlin.Unit>) r0) == r9) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(int r12, long r13, o.access13800<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof o.BERSequenceGenerator.IAuthTabCallbackDefault
            if (r0 == 0) goto L13
            r0 = r15
            o.BERSequenceGenerator$IAuthTabCallbackDefault r0 = (o.BERSequenceGenerator.IAuthTabCallbackDefault) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.BERSequenceGenerator$IAuthTabCallbackDefault r0 = new o.BERSequenceGenerator$IAuthTabCallbackDefault
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r9 = o.access14300.onWarmupCompleted()
            int r1 = r0.label
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 == r2) goto L34
            if (r1 != r10) goto L2c
            kotlin.ResultKt.onNavigationEvent(r15)
            goto L6d
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            long r13 = r0.J$0
            int r12 = r0.I$0
            kotlin.ResultKt.onNavigationEvent(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            r15.onNavigationEvent()
            goto L60
        L41:
            kotlin.ResultKt.onNavigationEvent(r15)
            o.disableOldAndroidAttachmentMetricsWorkarounds r1 = o.disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback
            r0.I$0 = r12
            r0.J$0 = r13
            r0.label = r2
            java.lang.String r2 = java.lang.String.valueOf(r12)
            java.lang.String r3 = java.lang.String.valueOf(r13)
            r4 = 0
            r5 = 0
            r7 = 8
            r8 = 0
            r6 = r0
            java.lang.Object r15 = o.disableOldAndroidAttachmentMetricsWorkarounds.onNavigationEvent(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r15 == r9) goto L70
        L60:
            r0.I$0 = r12
            r0.J$0 = r13
            r0.label = r10
            java.lang.Object r12 = r11.IAuthTabCallback(r0)
            if (r12 != r9) goto L6d
            goto L70
        L6d:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L70:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BERSequenceGenerator.onWarmupCompleted(int, long, o.access13800):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IAuthTabCallback(MutableLiveData<Set<onExtraCallback>> mutableLiveData, long j) {
        Iterable linkedHashSet = (Set) mutableLiveData.getValue();
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
        }
        Set mutableSet = CollectionsKt.toMutableSet(linkedHashSet);
        mutableSet.add(onExtraCallback.onNavigationEvent(j));
        mutableLiveData.setValue(mutableSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigationEvent(MutableLiveData<Set<onExtraCallback>> mutableLiveData, long j) {
        Iterable linkedHashSet = (Set) mutableLiveData.getValue();
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
        }
        Set mutableSet = CollectionsKt.toMutableSet(linkedHashSet);
        mutableSet.remove(onExtraCallback.onNavigationEvent(j));
        mutableLiveData.setValue(mutableSet);
    }

    public static final class IAuthTabCallback {
        private final long IAuthTabCallback;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final String onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(long j, int i, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, i, str, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return onExtraCallback.onExtraCallback(this.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback) && this.onNavigationEvent == iAuthTabCallback.onNavigationEvent && Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallback.onExtraCallback);
        }

        public int hashCode() {
            int iOnExtraCallbackWithResult = onExtraCallback.onExtraCallbackWithResult(this.IAuthTabCallback);
            int iHashCode = Integer.hashCode(this.onNavigationEvent);
            String str = this.onWarmupCompleted;
            return (((((((iOnExtraCallbackWithResult * 31) + iHashCode) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() {
            return "AccountUiModel(accountId=" + onExtraCallback.onWarmupCompleted(this.IAuthTabCallback) + ", bankCode=" + this.onNavigationEvent + ", iconUrl=" + this.onWarmupCompleted + ", title=" + this.onExtraCallbackWithResult + ", description=" + this.onExtraCallback + ")";
        }

        private IAuthTabCallback(long j, int i, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.IAuthTabCallback = j;
            this.onNavigationEvent = i;
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = str2;
            this.onExtraCallback = str3;
        }

        public final long onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        public final int onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }

        public final String IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        public final String onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        public final String onExtraCallback() {
            return this.onExtraCallback;
        }
    }

    @JvmInline
    public static final class onExtraCallback {
        private final long onExtraCallbackWithResult;

        public static boolean IAuthTabCallback(long j, Object obj) {
            return (obj instanceof onExtraCallback) && j == ((onExtraCallback) obj).onNavigationEvent();
        }

        public static long onExtraCallback(long j) {
            return j;
        }

        public static final boolean onExtraCallback(long j, long j2) {
            return j == j2;
        }

        public static int onExtraCallbackWithResult(long j) {
            return Long.hashCode(j);
        }

        public static final /* synthetic */ onExtraCallback onNavigationEvent(long j) {
            return new onExtraCallback(j);
        }

        public static String onWarmupCompleted(long j) {
            return "AccountId(value=" + j + ")";
        }

        public boolean equals(Object obj) {
            return IAuthTabCallback(this.onExtraCallbackWithResult, obj);
        }

        public int hashCode() {
            return onExtraCallbackWithResult(this.onExtraCallbackWithResult);
        }

        public final /* synthetic */ long onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        public String toString() {
            return onWarmupCompleted(this.onExtraCallbackWithResult);
        }

        private /* synthetic */ onExtraCallback(long j) {
            this.onExtraCallbackWithResult = j;
        }
    }

    public static abstract class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static final class onExtraCallback extends onNavigationEvent {
            private final IAuthTabCallback onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, ((onExtraCallback) obj).onWarmupCompleted);
            }

            public int hashCode() {
                return this.onWarmupCompleted.hashCode();
            }

            public String toString() {
                return "Show(accountUiModel=" + this.onWarmupCompleted + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(@NotNull IAuthTabCallback iAuthTabCallback) {
                super(null);
                Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
                this.onWarmupCompleted = iAuthTabCallback;
            }

            public IAuthTabCallback onExtraCallback() {
                return this.onWarmupCompleted;
            }
        }
    }

    public static abstract class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Throwable onExtraCallback();

        private onExtraCallbackWithResult() {
        }

        public static final class onWarmupCompleted extends onExtraCallbackWithResult {
            private final Throwable IAuthTabCallback;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, ((onWarmupCompleted) obj).IAuthTabCallback);
            }

            public int hashCode() {
                return this.IAuthTabCallback.hashCode();
            }

            public String toString() {
                return "PrepareConvertingError(throwable=" + this.IAuthTabCallback + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.IAuthTabCallback = th;
            }

            @Override // o.BERSequenceGenerator.onExtraCallbackWithResult
            public Throwable onExtraCallback() {
                return this.IAuthTabCallback;
            }
        }

        public static final class onExtraCallback extends onExtraCallbackWithResult {
            private final Throwable onExtraCallback;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof onExtraCallback) && Intrinsics.areEqual(this.onExtraCallback, ((onExtraCallback) obj).onExtraCallback);
            }

            public int hashCode() {
                return this.onExtraCallback.hashCode();
            }

            public String toString() {
                return "RefreshError(throwable=" + this.onExtraCallback + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.onExtraCallback = th;
            }

            @Override // o.BERSequenceGenerator.onExtraCallbackWithResult
            public Throwable onExtraCallback() {
                return this.onExtraCallback;
            }
        }
    }
}
