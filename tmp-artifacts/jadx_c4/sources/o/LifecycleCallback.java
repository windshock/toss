package o;

import com.google.android.play.core.ktx.SplitInstallManagerKtxKt;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.parse;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LifecycleCallback implements applyTransparentTitle {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private final IAnimation<SplitInstallSessionState> IAuthTabCallback;
    private final setRubIn<Map<String, parse>> IAuthTabCallbackDefault;
    private final findResAndMsg asBinder;
    private final Map<Integer, List<String>> asInterface;
    private final getCornerRadius<Map<String, parse>> onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final SplitInstallManager onNavigationEvent;
    private final boolean onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            LifecycleCallback lifecycleCallback = LifecycleCallback.this;
            if (i3 == 0) {
                lifecycleCallback.onNavigationEvent((access13800<? super Unit>) this);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = lifecycleCallback.onNavigationEvent((access13800<? super Unit>) this);
            int i4 = onNavigationEvent + 51;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = LifecycleCallback.onExtraCallback(LifecycleCallback.this, null, null, this);
            int i4 = onNavigationEvent + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i5) | i7 | i);
        int i9 = (~i) | i7;
        int i10 = i8 | (~(i9 | i5)) | (~(i6 | i5 | i));
        int i11 = ~i9;
        int i12 = (~(i | i6)) | i5 | i11;
        int i13 = (~(i7 | i5)) | i11;
        int i14 = i6 + i5 + i4 + (933655473 * i3) + ((-1037598838) * i2);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i6) - 925892608) + (470833381 * i5) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i4) + ((-1691877376) * i3) + ((-393216000) * i2) + ((-1633878016) * i15);
        int i17 = ((i6 * (-727610197)) - 1081761860) + (i5 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i4 * (-727609241)) + (i3 * 1532828727) + (i2 * (-747900794)) + (i15 * 556466176);
        if (i16 + (i17 * i17 * (-1911357440)) == 1) {
            return onNavigationEvent(objArr);
        }
        LifecycleCallback lifecycleCallback = (LifecycleCallback) objArr[0];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallbackStub;
        int i20 = i19 + 47;
        onTransact = i20 % 128;
        int i21 = i20 % 2;
        IAnimation<SplitInstallSessionState> iAnimation = lifecycleCallback.IAuthTabCallback;
        int i22 = i19 + 89;
        onTransact = i22 % 128;
        int i23 = i22 % 2;
        return iAnimation;
    }

    @Inject
    public LifecycleCallback(@NotNull SplitInstallManager splitInstallManager) {
        Intrinsics.checkNotNullParameter(splitInstallManager, "");
        this.onNavigationEvent = splitInstallManager;
        this.onExtraCallbackWithResult = "TossDynamicFeatureManagerImpl";
        findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback()));
        this.asBinder = findresandmsgOnWarmupCompleted;
        this.IAuthTabCallback = SplitInstallManagerKtxKt.requestProgressFlow(splitInstallManager);
        getCornerRadius<Map<String, parse>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(access8100.onNavigationEvent());
        this.onExtraCallback = getcornerradiusOnNavigationEvent;
        this.IAuthTabCallbackDefault = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        this.asInterface = new LinkedHashMap();
        maybeUpdateAnimatable.onNavigationEvent(findresandmsgOnWarmupCompleted, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(null), 3, (Object) null);
    }

    public static final /* synthetic */ Object onExtraCallback(LifecycleCallback lifecycleCallback, List list, List list2, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return lifecycleCallback.onExtraCallbackWithResult(list, list2, access13800Var);
        }
        lifecycleCallback.onExtraCallbackWithResult(list, list2, access13800Var);
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(LifecycleCallback lifecycleCallback, SplitInstallSessionState splitInstallSessionState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        lifecycleCallback.onNavigationEvent(splitInstallSessionState);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Map onNavigationEvent(LifecycleCallback lifecycleCallback) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Map<Integer, List<String>> map = lifecycleCallback.asInterface;
        int i5 = i3 + 71;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return map;
    }

    public static final /* synthetic */ void onNavigationEvent(LifecycleCallback lifecycleCallback, String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        lifecycleCallback.onExtraCallbackWithResult(str, th);
        int i4 = IAuthTabCallbackStub + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.applyTransparentTitle
    public /* bridge */ IAnimation<parse> onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAnimation<parse> iAnimationOnExtraCallback = super.onExtraCallback(str);
        int i4 = IAuthTabCallbackStub + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iAnimationOnExtraCallback;
    }

    @Override // o.applyTransparentTitle
    public setRubIn<Map<String, parse>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    /* renamed from: o.LifecycleCallback$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        AnonymousClass5(access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
            }
            anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass5 anonymousClass5 = LifecycleCallback.this.new AnonymousClass5(access13800Var);
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass5;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* renamed from: o.LifecycleCallback$5$onNavigationEvent */
        static final class onNavigationEvent extends SuspendLambda implements getBacktraceNote<setRipple<? super SplitInstallSessionState>, Throwable, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ LifecycleCallback this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(LifecycleCallback lifecycleCallback, access13800<? super onNavigationEvent> access13800Var) {
                super(3, access13800Var);
                this.this$0 = lifecycleCallback;
            }

            public final Object IAuthTabCallback(setRipple<? super SplitInstallSessionState> setripple, Throwable th, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, access13800Var);
                onnavigationevent.L$0 = th;
                Object objInvokeSuspend = onnavigationevent.invokeSuspend(Unit.INSTANCE);
                int i2 = onNavigationEvent + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return objInvokeSuspend;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((setRipple) obj, (Throwable) obj2, (access13800) obj3);
                int i4 = onNavigationEvent + 87;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 73 / 0;
                }
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Throwable th = (Throwable) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                LifecycleCallback.onNavigationEvent(this.this$0, "Error updating modules", th);
                Unit unit = Unit.INSTANCE;
                int i3 = onWarmupCompleted + 1;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }
        }

        /* renamed from: o.LifecycleCallback$5$onExtraCallback */
        static final class onExtraCallback<T> implements setRipple {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ LifecycleCallback onWarmupCompleted;

            onExtraCallback(LifecycleCallback lifecycleCallback) {
                this.onWarmupCompleted = lifecycleCallback;
            }

            public /* synthetic */ Object emit(Object obj, access13800 access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((SplitInstallSessionState) obj, access13800Var);
                int i4 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public final Object onExtraCallback(SplitInstallSessionState splitInstallSessionState, access13800<? super Unit> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                try {
                    LifecycleCallback.onExtraCallbackWithResult(this.onWarmupCompleted, splitInstallSessionState);
                } catch (Throwable th) {
                    LifecycleCallback.onNavigationEvent(this.onWarmupCompleted, "Error updating modules(" + splitInstallSessionState.moduleNames() + ") states(id:" + splitInstallSessionState.sessionId() + ")", th);
                    LifecycleCallback.onNavigationEvent(this.onWarmupCompleted).remove(access14000.onNavigationEvent(splitInstallSessionState.sessionId()));
                }
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallbackWithResult + 31;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    LifecycleCallback lifecycleCallback = LifecycleCallback.this;
                    Result.Companion companion = kotlin.Result.Companion;
                    int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
                    int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
                    IAnimation iAnimationOnWarmupCompleted = ycxycx.onWarmupCompleted((IAnimation) LifecycleCallback.onExtraCallbackWithResult(iOnWarmupCompleted, new Object[]{lifecycleCallback}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, -641404087, 641404087), new onNavigationEvent(lifecycleCallback, null));
                    onExtraCallback onextracallback = new onExtraCallback(lifecycleCallback);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (iAnimationOnWarmupCompleted.collect(onextracallback, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = onExtraCallbackWithResult + 33;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = kotlin.Result.constructor-impl(Unit.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = kotlin.Result.Companion;
                obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
            }
            LifecycleCallback lifecycleCallback2 = LifecycleCallback.this;
            Throwable th = kotlin.Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                int i5 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    LifecycleCallback.onNavigationEvent(lifecycleCallback2, "Fatal error in installState collection", th);
                    throw null;
                }
                LifecycleCallback.onNavigationEvent(lifecycleCallback2, "Fatal error in installState collection", th);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onNavigationEvent(SplitInstallSessionState splitInstallSessionState) {
        Object objIAuthTabCallback;
        Map mapOnWarmupCompleted;
        int i = 2 % 2;
        int iSessionId = splitInstallSessionState.sessionId();
        List<String> listModuleNames = splitInstallSessionState.moduleNames();
        Intrinsics.checkNotNullExpressionValue(listModuleNames, "");
        if (listModuleNames.isEmpty()) {
            listModuleNames = this.asInterface.get(Integer.valueOf(iSessionId));
            if (listModuleNames == null) {
                Object[] objArr = {this, "No modules found for sessionId=" + iSessionId + ", skipping update"};
                onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -186968547, 186968548);
                int i2 = IAuthTabCallbackStub + 57;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
        } else {
            int i4 = onTransact + 61;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                this.asInterface.put(Integer.valueOf(iSessionId), listModuleNames);
                int i5 = 4 / 0;
            } else {
                this.asInterface.put(Integer.valueOf(iSessionId), listModuleNames);
            }
        }
        parse parseVarIAuthTabCallback = IAuthTabCallback(splitInstallSessionState);
        getCornerRadius<Map<String, parse>> getcornerradius = this.onExtraCallback;
        do {
            objIAuthTabCallback = getcornerradius.IAuthTabCallback();
            mapOnWarmupCompleted = access8100.onWarmupCompleted((Map) objIAuthTabCallback);
            for (String str : listModuleNames) {
                int i6 = onTransact + 9;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.checkNotNull(str);
                mapOnWarmupCompleted.put(str, parseVarIAuthTabCallback);
            }
            if (!(!parseVarIAuthTabCallback.IAuthTabCallback())) {
                this.asInterface.remove(Integer.valueOf(iSessionId));
            }
        } while (!getcornerradius.onWarmupCompleted(objIAuthTabCallback, mapOnWarmupCompleted));
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(iOnWarmupCompleted, new Object[]{this, "State updated: sessionId=" + iSessionId + ", modules=" + listModuleNames + ", state=" + parseVarIAuthTabCallback}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -186968547, 186968548);
    }

    private final parse IAuthTabCallback(SplitInstallSessionState splitInstallSessionState) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            splitInstallSessionState.status();
            throw null;
        }
        switch (splitInstallSessionState.status()) {
            case 1:
                return new parse.IAuthTabCallbackStub(splitInstallSessionState.sessionId());
            case 2:
                return new parse.onExtraCallback(splitInstallSessionState.sessionId(), splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload());
            case 3:
                return new parse.onNavigationEvent(splitInstallSessionState.sessionId());
            case 4:
                return new parse.asInterface(splitInstallSessionState.sessionId());
            case 5:
                return parse.asBinder.IAuthTabCallback;
            case 6:
                return new parse.IAuthTabCallback(splitInstallSessionState.errorCode(), null);
            case 7:
                parse.onWarmupCompleted onwarmupcompleted = parse.onWarmupCompleted.onWarmupCompleted;
                int i3 = IAuthTabCallbackStub + 67;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 6 / 0;
                }
                return onwarmupcompleted;
            case 8:
                return new parse.IAuthTabCallbackDefault(splitInstallSessionState.sessionId(), splitInstallSessionState);
            default:
                parse.onTransact ontransact = parse.onTransact.onExtraCallbackWithResult;
                int i5 = IAuthTabCallbackStub + 57;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    return ontransact;
                }
                obj.hashCode();
                throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00eb -> B:24:0x00ac). Please report as a decompilation issue!!! */
    @Override // o.applyTransparentTitle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        List list;
        Iterable iterable;
        Iterator it;
        int i;
        int iIntValue;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 63;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
            if (access13800Var instanceof onExtraCallback) {
                onextracallback = (onExtraCallback) access13800Var;
                int i5 = onextracallback.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    onextracallback.label = i5 - 2147483648;
                } else {
                    onextracallback = new onExtraCallback(access13800Var);
                }
            }
        } else if (access13800Var instanceof onExtraCallback) {
        }
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onextracallback.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            List list2 = CollectionsKt.toList(this.asInterface.keySet());
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            onExtraCallbackWithResult(iOnWarmupCompleted, new Object[]{this, "cancel install: " + list2}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -186968547, 186968548);
            List list3 = list2;
            list = list2;
            iterable = list3;
            it = list3.iterator();
            i = 0;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = IAuthTabCallbackStub + 75;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            iIntValue = onextracallback.I$1;
            i = onextracallback.I$0;
            it = (Iterator) onextracallback.L$2;
            iterable = (Iterable) onextracallback.L$1;
            list = (List) onextracallback.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (Throwable th) {
                onExtraCallbackWithResult("Failed to cancel install for session " + iIntValue, th);
                int i9 = IAuthTabCallbackStub + 41;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        while (it.hasNext()) {
            Object next = it.next();
            iIntValue = ((Number) next).intValue();
            SplitInstallManager splitInstallManager = this.onNavigationEvent;
            onextracallback.L$0 = access15400.onNavigationEvent(list);
            onextracallback.L$1 = access15400.onNavigationEvent(iterable);
            onextracallback.L$2 = it;
            onextracallback.L$3 = access15400.onNavigationEvent(next);
            onextracallback.I$0 = i;
            onextracallback.I$1 = iIntValue;
            onextracallback.I$2 = 0;
            onextracallback.label = 1;
            if (SplitInstallManagerKtxKt.requestCancelInstall(splitInstallManager, iIntValue, onextracallback) == objOnWarmupCompleted) {
                int i11 = IAuthTabCallbackStub + 93;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.applyTransparentTitle
    public Object onWarmupCompleted(@NotNull List<String> list, @NotNull List<String> list2, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        Map mapOnWarmupCompleted;
        int i = 2 % 2;
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{this, "install request: modules=" + list + ", languages=" + list2}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -186968547, 186968548);
        List<String> list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            int i2 = onTransact + 7;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (!onWarmupCompleted((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{this, "All modules already installed: " + list}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -186968547, 186968548);
            getCornerRadius<Map<String, parse>> getcornerradius = this.onExtraCallback;
            do {
                mapOnWarmupCompleted = access8100.onWarmupCompleted((Map) getcornerradius.IAuthTabCallback());
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    mapOnWarmupCompleted.put((String) it.next(), parse.asBinder.IAuthTabCallback);
                }
            } while (!getcornerradius.onWarmupCompleted(r2, mapOnWarmupCompleted));
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 83;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Map map = (Map) this.onExtraCallback.IAuthTabCallback();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            int i5 = onTransact + 15;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            parse parseVar = (parse) map.get((String) obj3);
            if (parseVar != null && parseVar.onExtraCallback()) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (!arrayList2.contains((String) obj4)) {
                arrayList3.add(obj4);
            }
        }
        if (arrayList3.isEmpty() && !arrayList2.isEmpty()) {
            onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{this, "All requested modules already in progress: " + arrayList2}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -186968547, 186968548);
            return Unit.INSTANCE;
        }
        if (!arrayList2.isEmpty()) {
            int i7 = onTransact + 71;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            if (!arrayList3.isEmpty()) {
                onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{this, "Partial overlap - installing only new modules: " + arrayList3 + " (in progress: " + arrayList2 + ")"}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -186968547, 186968548);
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(arrayList3, list2, access13800Var);
                return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
            }
        }
        onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{this, "Installing new modules: " + arrayList3}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -186968547, 186968548);
        Object objOnExtraCallbackWithResult2 = onExtraCallbackWithResult(arrayList3, list2, access13800Var);
        return objOnExtraCallbackWithResult2 == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult2 : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(List<String> list, List<String> list2, access13800<? super Unit> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        Object objIAuthTabCallback;
        Map mapOnWarmupCompleted;
        Object objIAuthTabCallback2;
        Map mapOnWarmupCompleted2;
        Object objIAuthTabCallback3;
        Map mapOnWarmupCompleted3;
        Object objIAuthTabCallback4;
        Map mapOnWarmupCompleted4;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IAuthTabCallbackStub + 33;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    onwarmupcompleted.label = i2 * Integer.MIN_VALUE;
                } else {
                    onwarmupcompleted.label = i2 - 2147483648;
                }
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objRequestInstall = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onwarmupcompleted.label;
        try {
            if (i4 != 0) {
                int i5 = IAuthTabCallbackStub + 79;
                onTransact = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(objRequestInstall);
                int i6 = IAuthTabCallbackStub + 21;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            } else {
                ResultKt.onNavigationEvent(objRequestInstall);
                getCornerRadius<Map<String, parse>> getcornerradius = this.onExtraCallback;
                do {
                    objIAuthTabCallback2 = getcornerradius.IAuthTabCallback();
                    mapOnWarmupCompleted2 = access8100.onWarmupCompleted((Map) objIAuthTabCallback2);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        mapOnWarmupCompleted2.put((String) it.next(), new parse.IAuthTabCallbackStub(-1));
                    }
                } while (!getcornerradius.onWarmupCompleted(objIAuthTabCallback2, mapOnWarmupCompleted2));
                SplitInstallManager splitInstallManager = this.onNavigationEvent;
                onwarmupcompleted.L$0 = list;
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(list2);
                onwarmupcompleted.label = 1;
                objRequestInstall = SplitInstallManagerKtxKt.requestInstall(splitInstallManager, list, list2, onwarmupcompleted);
                if (objRequestInstall == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            int iIntValue = ((Number) objRequestInstall).intValue();
            if (iIntValue != 0) {
                this.asInterface.put(access14000.onNavigationEvent(iIntValue), list);
                getCornerRadius<Map<String, parse>> getcornerradius2 = this.onExtraCallback;
                do {
                    objIAuthTabCallback4 = getcornerradius2.IAuthTabCallback();
                    mapOnWarmupCompleted4 = access8100.onWarmupCompleted((Map) objIAuthTabCallback4);
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        mapOnWarmupCompleted4.put((String) it2.next(), new parse.IAuthTabCallbackStub(iIntValue));
                    }
                } while (!getcornerradius2.onWarmupCompleted(objIAuthTabCallback4, mapOnWarmupCompleted4));
            } else {
                getCornerRadius<Map<String, parse>> getcornerradius3 = this.onExtraCallback;
                do {
                    objIAuthTabCallback3 = getcornerradius3.IAuthTabCallback();
                    mapOnWarmupCompleted3 = access8100.onWarmupCompleted((Map) objIAuthTabCallback3);
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        mapOnWarmupCompleted3.put((String) it3.next(), parse.asBinder.IAuthTabCallback);
                    }
                } while (!getcornerradius3.onWarmupCompleted(objIAuthTabCallback3, mapOnWarmupCompleted3));
            }
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            onExtraCallbackWithResult(iOnWarmupCompleted, new Object[]{this, "Install requested: sessionId=" + iIntValue + ", modules=" + list}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -186968547, 186968548);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            onExtraCallbackWithResult("Install request failed", th);
            getCornerRadius<Map<String, parse>> getcornerradius4 = this.onExtraCallback;
            do {
                objIAuthTabCallback = getcornerradius4.IAuthTabCallback();
                mapOnWarmupCompleted = access8100.onWarmupCompleted((Map) objIAuthTabCallback);
                Iterator<T> it4 = list.iterator();
                int i8 = IAuthTabCallbackStub + 61;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                while (it4.hasNext()) {
                    mapOnWarmupCompleted.put((String) it4.next(), new parse.IAuthTabCallback(-1, th.getMessage()));
                }
            } while (!getcornerradius4.onWarmupCompleted(objIAuthTabCallback, mapOnWarmupCompleted));
            int i10 = onTransact + 63;
            IAuthTabCallbackStub = i10 % 128;
            if (i10 % 2 != 0) {
                throw th;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.applyTransparentTitle
    public boolean onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.onNavigationEvent.getInstalledModules().contains(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = 59 / 0;
        return this.onNavigationEvent.getInstalledModules().contains(str);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        LifecycleCallback lifecycleCallback = (LifecycleCallback) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 123;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (!lifecycleCallback.onWarmupCompleted) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "DFM", str, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return null;
        }
        String str2 = lifecycleCallback.onExtraCallbackWithResult;
        int i5 = i2 + 83;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        if (this.onWarmupCompleted) {
            int i2 = IAuthTabCallbackStub + 31;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        } else {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "DFM", str, th, (Map) null, 8, (Object) null);
            int i4 = onTransact + 21;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
        }
    }

    public static final /* synthetic */ IAnimation onExtraCallback(LifecycleCallback lifecycleCallback) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (IAnimation) onExtraCallbackWithResult(iOnWarmupCompleted, new Object[]{lifecycleCallback}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, -641404087, 641404087);
    }

    private final void onNavigationEvent(String str) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        onExtraCallbackWithResult(iOnWarmupCompleted, new Object[]{this, str}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, -186968547, 186968548);
    }
}
