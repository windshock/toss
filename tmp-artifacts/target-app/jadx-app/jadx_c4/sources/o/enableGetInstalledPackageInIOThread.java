package o;

import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableGetInstalledPackageInIOThread {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final enableJSApiPermissionOpt onNavigationEvent;
    private final getHeaders onWarmupCompleted;

    @Inject
    public enableGetInstalledPackageInIOThread(@NotNull getHeaders getheaders, @NotNull enableJSApiPermissionOpt enablejsapipermissionopt) {
        Intrinsics.checkNotNullParameter(getheaders, "");
        Intrinsics.checkNotNullParameter(enablejsapipermissionopt, "");
        this.onWarmupCompleted = getheaders;
        this.onNavigationEvent = enablejsapipermissionopt;
    }

    public static final /* synthetic */ getHeaders IAuthTabCallback(enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothread) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getHeaders getheaders = enablegetinstalledpackageiniothread.onWarmupCompleted;
        int i5 = i3 + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return getheaders;
    }

    public static final /* synthetic */ enableJSApiPermissionOpt onExtraCallbackWithResult(enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothread) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        enableJSApiPermissionOpt enablejsapipermissionopt = enablegetinstalledpackageiniothread.onNavigationEvent;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enablejsapipermissionopt;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super enableAudioDjangoExecutorOpt>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = enableGetInstalledPackageInIOThread.this.new onNavigationEvent(access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 83 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super enableAudioDjangoExecutorOpt> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super SendMtopResponse>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            int label;
            final /* synthetic */ enableGetInstalledPackageInIOThread this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothread, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = enablegetinstalledpackageiniothread;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, access13800Var);
                int i2 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                if (i3 == 0) {
                    int i4 = 13 / 0;
                }
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super SendMtopResponse> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getHeaders getheadersIAuthTabCallback = enableGetInstalledPackageInIOThread.IAuthTabCallback(this.this$0);
                    this.label = 1;
                    objOnExtraCallbackWithResult = getheadersIAuthTabCallback.onExtraCallbackWithResult(this);
                    if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallbackWithResult = ((kotlin.Result) obj).onNavigationEvent();
                    int i5 = onExtraCallbackWithResult + 89;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                if (!kotlin.Result.onExtraCallback(objOnExtraCallbackWithResult)) {
                    return objOnExtraCallbackWithResult;
                }
                int i7 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    return null;
                }
                throw null;
            }
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends enableCheckXriverHasInited>>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            int label;
            final /* synthetic */ enableGetInstalledPackageInIOThread this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothread, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = enablegetinstalledpackageiniothread;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, access13800Var);
                int i2 = onExtraCallback + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                onExtraCallbackWithResult = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super List<enableCheckXriverHasInited>> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(findresandmsg, access13800Var);
                }
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<enableCheckXriverHasInited>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 13;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getHeaders getheadersIAuthTabCallback = enableGetInstalledPackageInIOThread.IAuthTabCallback(this.this$0);
                    this.label = 1;
                    objOnExtraCallback = getheadersIAuthTabCallback.onExtraCallback(this);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = ((kotlin.Result) obj).onNavigationEvent();
                }
                if (!kotlin.Result.onExtraCallback(objOnExtraCallback)) {
                    return objOnExtraCallback;
                }
                int i3 = onExtraCallbackWithResult + 41;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 107;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return null;
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super enableActivityMonitorInitFloatOpt>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            int label;
            final /* synthetic */ enableGetInstalledPackageInIOThread this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(enableGetInstalledPackageInIOThread enablegetinstalledpackageiniothread, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = enablegetinstalledpackageiniothread;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.this$0, access13800Var);
                int i2 = onExtraCallbackWithResult + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onextracallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super enableActivityMonitorInitFloatOpt> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallbackWithResult + 9;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = ((kotlin.Result) obj).onNavigationEvent();
                } else {
                    ResultKt.onNavigationEvent(obj);
                    enableJSApiPermissionOpt enablejsapipermissionoptOnExtraCallbackWithResult = enableGetInstalledPackageInIOThread.onExtraCallbackWithResult(this.this$0);
                    this.label = 1;
                    objOnExtraCallback = enablejsapipermissionoptOnExtraCallbackWithResult.onExtraCallback(this);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        int i4 = onExtraCallbackWithResult + 41;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 51 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                }
                if (kotlin.Result.onExtraCallback(objOnExtraCallback)) {
                    return null;
                }
                return objOnExtraCallback;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0122 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
        /* JADX WARN: Type inference failed for: r8v22 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6, types: [int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GeckoHubImp1 geckoHubImp1OnExtraCallback;
            Object objIAuthTabCallback;
            GeckoHubImp1 geckoHubImp1;
            GeckoHubImp1 geckoHubImp12;
            Object objIAuthTabCallback2;
            GeckoHubImp1 geckoHubImp13;
            SendMtopResponse sendMtopResponse;
            List listEmptyList;
            List<enableContextFromLogger> listOnExtraCallback;
            List<enableContextFromLogger> list;
            List listEmptyList2;
            Object objIAuthTabCallback3;
            int i;
            long j;
            List list2;
            SendMtopResponse sendMtopResponse2;
            List<enableContextFromLogger> listOnExtraCallback2;
            boolean z;
            String strOnWarmupCompleted;
            int i2 = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp1 geckoHubImp1OnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(enableGetInstalledPackageInIOThread.this, null), 3, (Object) null);
                GeckoHubImp1 geckoHubImp1OnExtraCallback3 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(enableGetInstalledPackageInIOThread.this, null), 3, (Object) null);
                geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(enableGetInstalledPackageInIOThread.this, null), 3, (Object) null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback2);
                this.L$2 = geckoHubImp1OnExtraCallback3;
                this.L$3 = geckoHubImp1OnExtraCallback;
                this.label = 1;
                objIAuthTabCallback = geckoHubImp1OnExtraCallback2.IAuthTabCallback(this);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    geckoHubImp1 = geckoHubImp1OnExtraCallback2;
                    geckoHubImp12 = geckoHubImp1OnExtraCallback3;
                }
                return objOnWarmupCompleted;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    int i4 = onExtraCallback + 19;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0 ? i3 != 3 : i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j2 = this.J$0;
                    i = this.I$0;
                    List list3 = (List) this.L$7;
                    List list4 = (List) this.L$6;
                    sendMtopResponse2 = (SendMtopResponse) this.L$4;
                    ResultKt.onNavigationEvent(obj);
                    list2 = list3;
                    listEmptyList2 = list4;
                    j = j2;
                    objIAuthTabCallback3 = obj;
                    enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = (enableActivityMonitorInitFloatOpt) objIAuthTabCallback3;
                    int iOnWarmupCompleted = (sendMtopResponse2 != null || (strOnWarmupCompleted = sendMtopResponse2.onWarmupCompleted()) == null) ? -1 : zzcl.onWarmupCompleted(strOnWarmupCompleted, (String) null, 1, (Object) null);
                    if (i == 0) {
                        int i5 = onExtraCallback + 107;
                        onNavigationEvent = i5 % 128;
                        z = i5 % 2 == 0;
                    }
                    return new enableAudioDjangoExecutorOpt(z, j, listEmptyList2, list2, enableactivitymonitorinitfloatopt, iOnWarmupCompleted);
                }
                sendMtopResponse = (SendMtopResponse) this.L$4;
                geckoHubImp13 = (GeckoHubImp1) this.L$3;
                geckoHubImp12 = (GeckoHubImp1) this.L$2;
                geckoHubImp1 = (GeckoHubImp1) this.L$1;
                ResultKt.onNavigationEvent(obj);
                objIAuthTabCallback2 = obj;
                listEmptyList = (List) objIAuthTabCallback2;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (sendMtopResponse == null) {
                    int i6 = onExtraCallback + 109;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    listOnExtraCallback = sendMtopResponse.onExtraCallback();
                } else {
                    listOnExtraCallback = null;
                }
                list = listOnExtraCallback;
                if (list != null) {
                    int i8 = onExtraCallback + 9;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    if (list.isEmpty()) {
                    }
                    ?? OnNavigationEvent = sendMtopResponse != null ? sendMtopResponse.onNavigationEvent() : 0;
                    long jIAuthTabCallback = sendMtopResponse != null ? sendMtopResponse.IAuthTabCallback() : 0L;
                    if (sendMtopResponse != null || (listOnExtraCallback2 = sendMtopResponse.onExtraCallback()) == null || (listEmptyList2 = CollectionsKt.sortedWith(listOnExtraCallback2, new C0023onNavigationEvent())) == null) {
                        listEmptyList2 = CollectionsKt.emptyList();
                    }
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
                    this.L$2 = access15400.onNavigationEvent(geckoHubImp12);
                    this.L$3 = access15400.onNavigationEvent(geckoHubImp13);
                    this.L$4 = sendMtopResponse;
                    this.L$5 = access15400.onNavigationEvent(listEmptyList);
                    this.L$6 = listEmptyList2;
                    this.L$7 = listEmptyList;
                    this.I$0 = OnNavigationEvent;
                    this.J$0 = jIAuthTabCallback;
                    this.label = 3;
                    objIAuthTabCallback3 = geckoHubImp13.IAuthTabCallback(this);
                    if (objIAuthTabCallback3 != objOnWarmupCompleted) {
                        i = OnNavigationEvent;
                        j = jIAuthTabCallback;
                        list2 = listEmptyList;
                        sendMtopResponse2 = sendMtopResponse;
                        enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt2 = (enableActivityMonitorInitFloatOpt) objIAuthTabCallback3;
                        int iOnWarmupCompleted2 = (sendMtopResponse2 != null || (strOnWarmupCompleted = sendMtopResponse2.onWarmupCompleted()) == null) ? -1 : zzcl.onWarmupCompleted(strOnWarmupCompleted, (String) null, 1, (Object) null);
                        if (i == 0) {
                        }
                        return new enableAudioDjangoExecutorOpt(z, j, listEmptyList2, list2, enableactivitymonitorinitfloatopt2, iOnWarmupCompleted2);
                    }
                    return objOnWarmupCompleted;
                }
                if (listEmptyList.isEmpty()) {
                    return null;
                }
                if (sendMtopResponse != null) {
                }
                if (sendMtopResponse != null) {
                }
                if (sendMtopResponse != null) {
                }
                listEmptyList2 = CollectionsKt.emptyList();
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp12);
                this.L$3 = access15400.onNavigationEvent(geckoHubImp13);
                this.L$4 = sendMtopResponse;
                this.L$5 = access15400.onNavigationEvent(listEmptyList);
                this.L$6 = listEmptyList2;
                this.L$7 = listEmptyList;
                this.I$0 = OnNavigationEvent;
                this.J$0 = jIAuthTabCallback;
                this.label = 3;
                objIAuthTabCallback3 = geckoHubImp13.IAuthTabCallback(this);
                if (objIAuthTabCallback3 != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            geckoHubImp1OnExtraCallback = (GeckoHubImp1) this.L$3;
            GeckoHubImp1 geckoHubImp14 = (GeckoHubImp1) this.L$2;
            GeckoHubImp1 geckoHubImp15 = (GeckoHubImp1) this.L$1;
            ResultKt.onNavigationEvent(obj);
            geckoHubImp1 = geckoHubImp15;
            geckoHubImp12 = geckoHubImp14;
            objIAuthTabCallback = obj;
            SendMtopResponse sendMtopResponse3 = (SendMtopResponse) objIAuthTabCallback;
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
            this.L$2 = access15400.onNavigationEvent(geckoHubImp12);
            this.L$3 = geckoHubImp1OnExtraCallback;
            this.L$4 = sendMtopResponse3;
            this.label = 2;
            objIAuthTabCallback2 = geckoHubImp12.IAuthTabCallback(this);
            if (objIAuthTabCallback2 != objOnWarmupCompleted) {
                geckoHubImp13 = geckoHubImp1OnExtraCallback;
                sendMtopResponse = sendMtopResponse3;
                listEmptyList = (List) objIAuthTabCallback2;
                if (listEmptyList == null) {
                }
                if (sendMtopResponse == null) {
                }
                list = listOnExtraCallback;
                if (list != null) {
                }
                if (listEmptyList.isEmpty()) {
                }
                if (sendMtopResponse != null) {
                }
                if (sendMtopResponse != null) {
                }
                if (sendMtopResponse != null) {
                }
                listEmptyList2 = CollectionsKt.emptyList();
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp12);
                this.L$3 = access15400.onNavigationEvent(geckoHubImp13);
                this.L$4 = sendMtopResponse;
                this.L$5 = access15400.onNavigationEvent(listEmptyList);
                this.L$6 = listEmptyList2;
                this.L$7 = listEmptyList;
                this.I$0 = OnNavigationEvent;
                this.J$0 = jIAuthTabCallback;
                this.label = 3;
                objIAuthTabCallback3 = geckoHubImp13.IAuthTabCallback(this);
                if (objIAuthTabCallback3 != objOnWarmupCompleted) {
                }
            }
            return objOnWarmupCompleted;
        }

        /* renamed from: o.enableGetInstalledPackageInIOThread$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0023onNavigationEvent<T> implements Comparator {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i2 % 128;
                enableContextFromLogger enablecontextfromlogger = (enableContextFromLogger) t;
                if (i2 % 2 != 0) {
                    getCodeNameBytes.IAuthTabCallback(Long.valueOf(enablecontextfromlogger.onWarmupCompleted()), Long.valueOf(((enableContextFromLogger) t2).onWarmupCompleted()));
                    throw null;
                }
                int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Long.valueOf(enablecontextfromlogger.onWarmupCompleted()), Long.valueOf(((enableContextFromLogger) t2).onWarmupCompleted()));
                int i3 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return iIAuthTabCallback;
            }
        }
    }

    public final Object onWarmupCompleted(@NotNull access13800<? super enableAudioDjangoExecutorOpt> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onNavigationEvent(null), access13800Var);
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }
}
