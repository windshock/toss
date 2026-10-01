package o;

import im.toss.securities.widget.data.model.calendar.WidgetCalendar;
import im.toss.securities.widget.data.model.overview.FolderOverviewAccounts;
import im.toss.securities.widget.data.model.overview.OverviewAccounts;
import im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import im.toss.tosssecurities.network.data.SecuritiesApiErrorResponse;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import im.toss.tosssecurities.network.domain.SecuritiesApiError;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final r2ExternalSyntheticLambda0 IAuthTabCallback;
    private final r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        
            r0 = 94 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = kotlin.Result.IAuthTabCallback(r5);
            r1 = o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.IAuthTabCallback.onExtraCallback + 17;
            o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.IAuthTabCallback.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
        
            if (r5 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (r5 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        
            r1 = o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.IAuthTabCallback.onExtraCallback + 103;
            o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.IAuthTabCallback.onWarmupCompleted = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.this.IAuthTabCallback(null, this);
            if (i3 != 0) {
                int i4 = 90 / 0;
            }
        }
    }

    static final class access100 extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.this.onExtraCallback(this);
            if (objOnExtraCallback != access14300.onWarmupCompleted()) {
                return Result.IAuthTabCallback(objOnExtraCallback);
            }
            int i4 = IAuthTabCallback + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static final class asInterface extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.this.onExtraCallback(null, this);
            if (objOnExtraCallback != access14300.onWarmupCompleted()) {
                return Result.IAuthTabCallback(objOnExtraCallback);
            }
            int i4 = onWarmupCompleted + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallback = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.this.onExtraCallback(null, null, this);
            if (objOnExtraCallback != access14300.onWarmupCompleted()) {
                Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnExtraCallback);
                int i2 = IAuthTabCallback + 29;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return resultIAuthTabCallback;
            }
            int i4 = IAuthTabCallback + 125;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 51;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.this.onExtraCallbackWithResult(null, this);
            if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
                return Result.IAuthTabCallback(objOnExtraCallbackWithResult);
            }
            int i2 = onNavigationEvent + 15;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        
            r3.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            return kotlin.Result.IAuthTabCallback(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
        
            if (r5 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (r5 == o.access14300.onWarmupCompleted()) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        
            r1 = o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.onWarmupCompleted.onExtraCallbackWithResult + 29;
            o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.onWarmupCompleted.onWarmupCompleted = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.this.onWarmupCompleted(null, this);
            if (i3 == 0) {
                int i4 = 53 / 0;
            }
        }
    }

    @Inject
    public r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU(@NotNull r2ExternalSyntheticLambda0 r2externalsyntheticlambda0, @NotNull r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY r8lambdaxutxmdqmdglek_rwldybxibdyiy) {
        Intrinsics.checkNotNullParameter(r2externalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(r8lambdaxutxmdqmdglek_rwldybxibdyiy, "");
        this.IAuthTabCallback = r2externalsyntheticlambda0;
        this.onWarmupCompleted = r8lambdaxutxmdqmdglek_rwldybxibdyiy;
    }

    public static final /* synthetic */ r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY IAuthTabCallback(r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY r8lambdaxutxmdqmdglek_rwldybxibdyiy = r8lambdakeemxoi4two_xjjc4c2vgm4dau.onWarmupCompleted;
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdaxutxmdqmdglek_rwldybxibdyiy;
    }

    public static final /* synthetic */ r2ExternalSyntheticLambda0 onWarmupCompleted(r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        r2ExternalSyntheticLambda0 r2externalsyntheticlambda0 = r8lambdakeemxoi4two_xjjc4c2vgm4dau.IAuthTabCallback;
        int i5 = i3 + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return r2externalsyntheticlambda0;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, String str, String str2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str2 = null;
        }
        return r8lambdakeemxoi4two_xjjc4c2vgm4dau.onExtraCallback(str, str2, access13800Var);
    }

    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends OverviewAccounts>>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ List $accountKeyList$inlined;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(access13800 access13800Var, r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, List list) {
            super(2, access13800Var);
            this.this$0 = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
            this.$accountKeyList$inlined = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var, this.this$0, this.$accountKeyList$inlined);
            int i2 = onExtraCallbackWithResult + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Result<? extends OverviewAccounts>> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Result<? extends OverviewAccounts>> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object obj2;
            SecuritiesApiError securitiesApiErrorOnWarmupCompleted;
            Object objOnNavigationEvent;
            OverviewAccounts overviewAccounts;
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            Object obj3 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    r2ExternalSyntheticLambda0 r2externalsyntheticlambda0OnWarmupCompleted = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.onWarmupCompleted(this.this$0);
                    String strJoinToString$default = CollectionsKt.joinToString$default(this.$accountKeyList$inlined, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    objOnNavigationEvent = r2ExternalSyntheticLambda0.onNavigationEvent(r2externalsyntheticlambda0OnWarmupCompleted, strJoinToString$default, false, this, 2, null);
                    if (objOnNavigationEvent == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = onExtraCallbackWithResult + 73;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        obj3.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = obj;
                }
                try {
                    objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) objOnNavigationEvent).onExtraCallbackWithResult();
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(OverviewAccounts.class, Object.class)) {
                        int i5 = onExtraCallback + 29;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        if (!Intrinsics.areEqual(OverviewAccounts.class, Unit.class)) {
                            throw e;
                        }
                    }
                    overviewAccounts = Unit.INSTANCE;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception e4) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e4));
            } catch (WebResourceResponseModel e5) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e5));
            }
            if (objOnExtraCallbackWithResult == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.securities.widget.data.model.overview.OverviewAccounts");
            }
            overviewAccounts = (OverviewAccounts) objOnExtraCallbackWithResult;
            int i7 = onExtraCallbackWithResult + 55;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            obj2 = Result.constructor-impl(overviewAccounts);
            HttpException httpException = Result.exceptionOrNull-impl(obj2);
            if (httpException != null) {
                int i9 = onExtraCallback + 103;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Result.Companion companion4 = Result.Companion;
                    if (!(httpException instanceof HttpException) || (securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted(httpException)) == null) {
                        throw httpException;
                    }
                    throw securitiesApiErrorOnWarmupCompleted;
                } catch (Throwable th) {
                    Result.Companion companion5 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            return Result.IAuthTabCallback(obj2);
        }
    }

    public static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends OverviewAccounts>>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ String $accountSeqs$inlined;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(access13800 access13800Var, r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, String str) {
            super(2, access13800Var);
            this.this$0 = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
            this.$accountSeqs$inlined = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var, this.this$0, this.$accountSeqs$inlined);
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Result<? extends OverviewAccounts>> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object obj2;
            SecuritiesApiError securitiesApiErrorOnWarmupCompleted;
            OverviewAccounts overviewAccounts;
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj3 = null;
            try {
                if (i2 != 0) {
                    int i3 = onExtraCallback + 75;
                    int i4 = i3 % 128;
                    onNavigationEvent = i4;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i4 + 27;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        obj3.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    r2ExternalSyntheticLambda0 r2externalsyntheticlambda0OnWarmupCompleted = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.onWarmupCompleted(this.this$0);
                    String str = this.$accountSeqs$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = r2ExternalSyntheticLambda0.onNavigationEvent(r2externalsyntheticlambda0OnWarmupCompleted, str, false, this, 2, null);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                try {
                    objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(OverviewAccounts.class, Object.class)) {
                        int i6 = onExtraCallback + 91;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        if (!Intrinsics.areEqual(OverviewAccounts.class, Unit.class)) {
                            throw e;
                        }
                    }
                    overviewAccounts = Unit.INSTANCE;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception e4) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e4));
            } catch (WebResourceResponseModel e5) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e5));
            }
            if (objOnExtraCallbackWithResult == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.securities.widget.data.model.overview.OverviewAccounts");
            }
            overviewAccounts = (OverviewAccounts) objOnExtraCallbackWithResult;
            obj2 = Result.constructor-impl(overviewAccounts);
            HttpException httpException = Result.exceptionOrNull-impl(obj2);
            if (httpException != null) {
                int i8 = onExtraCallback + 43;
                onNavigationEvent = i8 % 128;
                try {
                    if (i8 % 2 == 0) {
                        Result.Companion companion4 = Result.Companion;
                        boolean z = httpException instanceof HttpException;
                        obj3.hashCode();
                        throw null;
                    }
                    Result.Companion companion5 = Result.Companion;
                    if (!(httpException instanceof HttpException) || (securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted(httpException)) == null) {
                        throw httpException;
                    }
                    throw securitiesApiErrorOnWarmupCompleted;
                } catch (Throwable th) {
                    Result.Companion companion6 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            return Result.IAuthTabCallback(obj2);
        }
    }

    public static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends WidgetWatchlists>>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access000(access13800 access13800Var, r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau) {
            super(2, access13800Var);
            this.this$0 = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(access13800Var, this.this$0);
            int i2 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return access000Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Result<? extends WidgetWatchlists>> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Result<? extends WidgetWatchlists>> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object obj2;
            WidgetWatchlists widgetWatchlists;
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    r2ExternalSyntheticLambda0 r2externalsyntheticlambda0OnWarmupCompleted = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.onWarmupCompleted(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = r2externalsyntheticlambda0OnWarmupCompleted.onNavigationEvent(this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                try {
                    objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(WidgetWatchlists.class, Object.class) && !Intrinsics.areEqual(WidgetWatchlists.class, Unit.class)) {
                        throw e;
                    }
                    widgetWatchlists = Unit.INSTANCE;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception e4) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e4));
            } catch (WebResourceResponseModel e5) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e5));
            }
            if (objOnExtraCallbackWithResult == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.securities.widget.data.model.watchlists.WidgetWatchlists");
            }
            widgetWatchlists = (WidgetWatchlists) objOnExtraCallbackWithResult;
            obj2 = Result.constructor-impl(widgetWatchlists);
            HttpException httpException = Result.exceptionOrNull-impl(obj2);
            if (httpException != null) {
                int i4 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Result.Companion companion4 = Result.Companion;
                    if (!(httpException instanceof HttpException)) {
                        throw httpException;
                    }
                    int i6 = onExtraCallbackWithResult + 103;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    SecuritiesApiError securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted(httpException);
                    if (securitiesApiErrorOnWarmupCompleted != null) {
                        throw securitiesApiErrorOnWarmupCompleted;
                    }
                    throw httpException;
                } catch (Throwable th) {
                    Result.Companion companion5 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                    int i8 = onExtraCallbackWithResult + 19;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 4 / 4;
                    }
                }
            }
            return Result.IAuthTabCallback(obj2);
        }
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends WidgetMiniCharts>>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $indexCodes$inlined;
        final /* synthetic */ String $productCodes$inlined;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(access13800 access13800Var, r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, String str, String str2) {
            super(2, access13800Var);
            this.this$0 = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
            this.$productCodes$inlined = str;
            this.$indexCodes$inlined = str2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(access13800Var, this.this$0, this.$productCodes$inlined, this.$indexCodes$inlined);
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Result<? extends WidgetMiniCharts>> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Result<? extends WidgetMiniCharts>> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object obj2;
            SecuritiesApiError securitiesApiErrorOnWarmupCompleted;
            WidgetMiniCharts widgetMiniCharts;
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj3 = null;
            try {
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 81;
                    int i4 = i3 % 128;
                    onExtraCallbackWithResult = i4;
                    int i5 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 75;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i7 = 22 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY r8lambdaxutxmdqmdglek_rwldybxibdyiyIAuthTabCallback = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.IAuthTabCallback(this.this$0);
                    String str = this.$productCodes$inlined;
                    String str2 = this.$indexCodes$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = r8lambdaxutxmdqmdglek_rwldybxibdyiyIAuthTabCallback.IAuthTabCallback(str, str2, this);
                    if (obj == objOnWarmupCompleted) {
                        int i8 = onNavigationEvent + 37;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                }
                try {
                    objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(WidgetMiniCharts.class, Object.class)) {
                        int i9 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            Intrinsics.areEqual(WidgetMiniCharts.class, Unit.class);
                            obj3.hashCode();
                            throw null;
                        }
                        if (!Intrinsics.areEqual(WidgetMiniCharts.class, Unit.class)) {
                            throw e;
                        }
                    }
                    widgetMiniCharts = Unit.INSTANCE;
                    int i10 = onExtraCallbackWithResult + 31;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception e4) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e4));
            } catch (WebResourceResponseModel e5) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e5));
            }
            if (objOnExtraCallbackWithResult == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts");
            }
            int i12 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            widgetMiniCharts = (WidgetMiniCharts) objOnExtraCallbackWithResult;
            obj2 = Result.constructor-impl(widgetMiniCharts);
            HttpException httpException = Result.exceptionOrNull-impl(obj2);
            if (httpException != null) {
                int i14 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Result.Companion companion4 = Result.Companion;
                    if (!(httpException instanceof HttpException) || (securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted(httpException)) == null) {
                        throw httpException;
                    }
                    throw securitiesApiErrorOnWarmupCompleted;
                } catch (Throwable th) {
                    Result.Companion companion5 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            return Result.IAuthTabCallback(obj2);
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends FolderOverviewAccounts>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $accountSeqs$inlined;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, String str) {
            super(2, access13800Var);
            this.this$0 = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
            this.$accountSeqs$inlined = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.this$0, this.$accountSeqs$inlined);
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Result<? extends FolderOverviewAccounts>> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(im.toss.securities.widget.data.model.overview.FolderOverviewAccounts.class, kotlin.Unit.class) != false) goto L43;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object obj2;
            FolderOverviewAccounts folderOverviewAccounts;
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = IAuthTabCallback + 61;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    r2ExternalSyntheticLambda0 r2externalsyntheticlambda0OnWarmupCompleted = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.onWarmupCompleted(this.this$0);
                    String str = this.$accountSeqs$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = r2externalsyntheticlambda0OnWarmupCompleted.onWarmupCompleted(str, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                try {
                    objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(FolderOverviewAccounts.class, Object.class)) {
                        int i4 = IAuthTabCallback + 27;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            if (Intrinsics.areEqual(FolderOverviewAccounts.class, Unit.class)) {
                            }
                            throw e;
                        }
                        int i5 = 92 / 0;
                    }
                    folderOverviewAccounts = Unit.INSTANCE;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception e4) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e4));
            } catch (WebResourceResponseModel e5) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e5));
            }
            if (objOnExtraCallbackWithResult == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.securities.widget.data.model.overview.FolderOverviewAccounts");
            }
            folderOverviewAccounts = (FolderOverviewAccounts) objOnExtraCallbackWithResult;
            obj2 = Result.constructor-impl(folderOverviewAccounts);
            HttpException httpException = Result.exceptionOrNull-impl(obj2);
            if (httpException != null) {
                int i6 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i6 % 128;
                try {
                    if (i6 % 2 == 0) {
                        Result.Companion companion4 = Result.Companion;
                        int i7 = 8 / 0;
                        if (!(httpException instanceof HttpException)) {
                            throw httpException;
                        }
                    } else {
                        Result.Companion companion5 = Result.Companion;
                        if (!(httpException instanceof HttpException)) {
                            throw httpException;
                        }
                    }
                    SecuritiesApiError securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted(httpException);
                    if (securitiesApiErrorOnWarmupCompleted == null) {
                        throw httpException;
                    }
                    int i8 = IAuthTabCallback + 105;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 59 / 0;
                    }
                    throw securitiesApiErrorOnWarmupCompleted;
                } catch (Throwable th) {
                    Result.Companion companion6 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            return Result.IAuthTabCallback(obj2);
        }
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends WidgetCalendar>>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $date$inlined;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(access13800 access13800Var, r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, String str) {
            super(2, access13800Var);
            this.this$0 = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
            this.$date$inlined = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var, this.this$0, this.$date$inlined);
            int i2 = onExtraCallbackWithResult + 111;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 53;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Result<? extends WidgetCalendar>> access13800Var) throws Exception {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[PHI: r1
          0x0049: PHI (r1v22 java.lang.Object) = (r1v9 java.lang.Object), (r1v23 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r5
          0x0025: PHI (r5v1 int) = (r5v0 int), (r5v3 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            Object obj2;
            Object objOnWarmupCompleted;
            int i;
            WidgetCalendar widgetCalendar;
            Object objOnExtraCallbackWithResult;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 61;
            onExtraCallback = i3 % 128;
            Object obj3 = null;
            try {
                if (i3 % 2 != 0) {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i4 = 58 / 0;
                    if (i != 0) {
                        int i5 = onExtraCallbackWithResult + 73;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0 ? i != 1 : i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        Result.Companion companion = Result.Companion;
                        r2ExternalSyntheticLambda0 r2externalsyntheticlambda0OnWarmupCompleted = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.onWarmupCompleted(this.this$0);
                        String str = this.$date$inlined;
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.L$1 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.I$2 = 0;
                        this.label = 1;
                        obj = r2ExternalSyntheticLambda0.onExtraCallbackWithResult(r2externalsyntheticlambda0OnWarmupCompleted, str, 0, this, 2, null);
                        if (obj == objOnWarmupCompleted) {
                            int i6 = onExtraCallbackWithResult + 111;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 == 0) {
                                return objOnWarmupCompleted;
                            }
                            obj3.hashCode();
                            throw null;
                        }
                    }
                } else {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    if (i != 0) {
                    }
                }
                try {
                    objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(WidgetCalendar.class, Object.class) && !Intrinsics.areEqual(WidgetCalendar.class, Unit.class)) {
                        throw e;
                    }
                    widgetCalendar = Unit.INSTANCE;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception e4) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e4));
            } catch (WebResourceResponseModel e5) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e5));
            }
            if (objOnExtraCallbackWithResult == null) {
                throw new NullPointerException("null cannot be cast to non-null type im.toss.securities.widget.data.model.calendar.WidgetCalendar");
            }
            widgetCalendar = (WidgetCalendar) objOnExtraCallbackWithResult;
            obj2 = Result.constructor-impl(widgetCalendar);
            HttpException httpException = Result.exceptionOrNull-impl(obj2);
            if (httpException != null) {
                try {
                    Result.Companion companion4 = Result.Companion;
                    if (!(httpException instanceof HttpException)) {
                        throw httpException;
                    }
                    int i7 = onExtraCallback + 31;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        SecuritiesApiErrorResponse.Companion.onWarmupCompleted(httpException);
                        throw null;
                    }
                    SecuritiesApiError securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted(httpException);
                    if (securitiesApiErrorOnWarmupCompleted != null) {
                        throw securitiesApiErrorOnWarmupCompleted;
                    }
                    throw httpException;
                } catch (Throwable th) {
                    Result.Companion companion5 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            return Result.IAuthTabCallback(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[PHI: r1 r5
      0x002d: PHI (r1v11 o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU$onTransact) = (r1v10 o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU$onTransact), (r1v13 o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU$onTransact) binds: [B:10:0x002b, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r5v3 int) = (r5v2 int), (r5v5 int) binds: [B:10:0x002b, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(@NotNull List<String> list, @NotNull access13800<? super Result<OverviewAccounts>> access13800Var) {
        onTransact ontransact;
        int i;
        int i2 = 2 % 2;
        if (!(!(access13800Var instanceof onTransact))) {
            int i3 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                ontransact = (onTransact) access13800Var;
                i = ontransact.label;
                int i4 = 82 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    ontransact.label = i - 2147483648;
                } else {
                    ontransact = new onTransact(access13800Var);
                }
            } else {
                ontransact = (onTransact) access13800Var;
                i = ontransact.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object objOnExtraCallback = ontransact.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = ontransact.label;
        Object obj = null;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(null, this, list);
            ontransact.L$0 = access15400.onNavigationEvent(list);
            ontransact.I$0 = 0;
            ontransact.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallbackDefault, ontransact);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i6 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                obj.hashCode();
                throw null;
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        Object objOnNavigationEvent = ((Result) objOnExtraCallback).onNavigationEvent();
        int i9 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull String str, @NotNull access13800<? super Result<OverviewAccounts>> access13800Var) {
        asInterface asinterface;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof asInterface;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof asInterface) {
            asinterface = (asInterface) access13800Var;
            int i3 = asinterface.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                asinterface.label = i3 - 2147483648;
            } else {
                asinterface = new asInterface(access13800Var);
            }
        }
        Object objOnExtraCallback = asinterface.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = asinterface.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(null, this, str);
            asinterface.L$0 = access15400.onNavigationEvent(str);
            asinterface.I$0 = 0;
            asinterface.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallbackStub, asinterface);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i5 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        return ((Result) objOnExtraCallback).onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull String str, @NotNull access13800<? super Result<FolderOverviewAccounts>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i2 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = ((IAuthTabCallback) access13800Var).label;
                throw null;
            }
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
                int i5 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iAuthTabCallback.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, this, str);
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(str);
            iAuthTabCallback.I$0 = 0;
            iAuthTabCallback.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, iAuthTabCallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i8 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 44 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        return ((Result) objOnExtraCallback).onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull String str, @NotNull access13800<? super Result<WidgetCalendar>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objOnExtraCallback = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onwarmupcompleted.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onNavigationEvent onnavigationevent = new onNavigationEvent(null, this, str);
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(str);
            onwarmupcompleted.I$0 = 0;
            onwarmupcompleted.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, onwarmupcompleted);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i4 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                throw null;
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        return ((Result) objOnExtraCallback).onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull access13800<? super Result<WidgetWatchlists>> access13800Var) {
        access100 access100Var;
        int i = 2 % 2;
        if (access13800Var instanceof access100) {
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            access100Var = (access100) access13800Var;
            int i4 = access100Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                access100Var.label = i4 - 2147483648;
            } else {
                access100Var = new access100(access13800Var);
            }
        }
        Object objOnExtraCallback = access100Var.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = access100Var.label;
        if (i5 != 0) {
            int i6 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            access000 access000Var = new access000(null, this);
            access100Var.I$0 = 0;
            access100Var.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, access000Var, access100Var);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return ((Result) objOnExtraCallback).onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@Nullable String str, @Nullable String str2, @NotNull access13800<? super Result<WidgetMiniCharts>> access13800Var) {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i2 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i4 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallback.label;
        if (i5 != 0) {
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 101;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = i6 + 55;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                throw null;
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            asBinder asbinder = new asBinder(null, this, str, str2);
            onextracallback.L$0 = access15400.onNavigationEvent(str);
            onextracallback.L$1 = access15400.onNavigationEvent(str2);
            onextracallback.I$0 = 0;
            onextracallback.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, asbinder, onextracallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i10 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 61 / 0;
                }
                return objOnWarmupCompleted;
            }
        }
        Object objOnNavigationEvent = ((Result) objOnExtraCallback).onNavigationEvent();
        int i12 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return objOnNavigationEvent;
    }
}
