package o;

import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.parse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface applyTransparentTitle {

    public interface onNavigationEvent {
        applyTransparentTitle ICustomTabsCallbackStub();
    }

    Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var);

    Object onWarmupCompleted(@NotNull List<String> list, @NotNull List<String> list2, @NotNull access13800<? super Unit> access13800Var);

    setRubIn<Map<String, parse>> onWarmupCompleted();

    boolean onWarmupCompleted(@NotNull String str);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object onNavigationEvent(applyTransparentTitle applytransparenttitle, List list, List list2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestInstall");
        }
        if ((i & 2) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return applytransparenttitle.onWarmupCompleted(list, list2, access13800Var);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<setRipple<? super parse>, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $moduleName;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$moduleName = str;
        }

        public final Object IAuthTabCallback(setRipple<? super parse> setripple, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(setripple, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = applyTransparentTitle.this.new onWarmupCompleted(this.$moduleName, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            setRipple<? super parse> setripple = (setRipple) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(setripple, access13800Var);
            }
            IAuthTabCallback(setripple, access13800Var);
            throw null;
        }

        public static final class onExtraCallbackWithResult implements IAnimation<parse> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ String IAuthTabCallback;
            final /* synthetic */ IAnimation onExtraCallback;

            /* renamed from: o.applyTransparentTitle$onWarmupCompleted$onExtraCallbackWithResult$3, reason: invalid class name */
            public static final class AnonymousClass3<T> implements setRipple {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;
                final /* synthetic */ String onExtraCallbackWithResult;
                final /* synthetic */ setRipple onWarmupCompleted;

                /* renamed from: o.applyTransparentTitle$onWarmupCompleted$onExtraCallbackWithResult$3$2, reason: invalid class name */
                public static final class AnonymousClass2 extends ContinuationImpl {
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass2(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = onExtraCallbackWithResult + 19;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass3.this.emit(null, this);
                        int i4 = onWarmupCompleted + 89;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objEmit;
                        }
                        throw null;
                    }
                }

                public AnonymousClass3(setRipple setripple, String str) {
                    this.onWarmupCompleted = setripple;
                    this.onExtraCallbackWithResult = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    AnonymousClass2 anonymousClass2;
                    int i = 2 % 2;
                    if (access13800Var instanceof AnonymousClass2) {
                        anonymousClass2 = (AnonymousClass2) access13800Var;
                        int i2 = anonymousClass2.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass2.label = i2 - 2147483648;
                        } else {
                            anonymousClass2 = new AnonymousClass2(access13800Var);
                            int i3 = onExtraCallback + 19;
                            onNavigationEvent = i3 % 128;
                            int i4 = i3 % 2;
                        }
                    }
                    Object obj2 = anonymousClass2.result;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i5 = anonymousClass2.label;
                    if (i5 == 0) {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.onWarmupCompleted;
                        Object obj3 = ((Map) obj).get(this.onExtraCallbackWithResult);
                        if (obj3 != null) {
                            anonymousClass2.L$0 = access15400.onNavigationEvent(obj);
                            anonymousClass2.L$1 = access15400.onNavigationEvent(anonymousClass2);
                            anonymousClass2.L$2 = access15400.onNavigationEvent(obj);
                            anonymousClass2.L$3 = access15400.onNavigationEvent(setripple);
                            anonymousClass2.L$4 = access15400.onNavigationEvent(obj3);
                            anonymousClass2.I$0 = 0;
                            anonymousClass2.label = 1;
                            if (setripple.emit(obj3, anonymousClass2) == objOnWarmupCompleted) {
                                int i6 = onNavigationEvent;
                                int i7 = i6 + 41;
                                onExtraCallback = i7 % 128;
                                int i8 = i7 % 2;
                                int i9 = i6 + 9;
                                onExtraCallback = i9 % 128;
                                if (i9 % 2 != 0) {
                                    return objOnWarmupCompleted;
                                }
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public onExtraCallbackWithResult(IAnimation iAnimation, String str) {
                this.onExtraCallback = iAnimation;
                this.IAuthTabCallback = str;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallback.collect(new AnonymousClass3(setripple, this.IAuthTabCallback), access13800Var);
                if (objCollect == access14300.onWarmupCompleted()) {
                    int i2 = onNavigationEvent + 83;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return objCollect;
                }
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 65;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        }

        /* renamed from: o.applyTransparentTitle$onWarmupCompleted$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements getBacktraceNote<setRipple<? super parse>, parse, access13800<? super Boolean>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass3(access13800<? super AnonymousClass3> access13800Var) {
                super(3, access13800Var);
            }

            public final Object IAuthTabCallback(setRipple<? super parse> setripple, parse parseVar, access13800<? super Boolean> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(access13800Var);
                anonymousClass3.L$0 = setripple;
                anonymousClass3.L$1 = parseVar;
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(Unit.INSTANCE);
                int i2 = onExtraCallback + 41;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 119;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((setRipple) obj, (parse) obj2, (access13800) obj3);
                int i4 = onWarmupCompleted + 17;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 99;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    access14300.onWarmupCompleted();
                    throw null;
                }
                setRipple setripple = (setRipple) this.L$0;
                parse parseVar = (parse) this.L$1;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 != 0) {
                    int i4 = onWarmupCompleted + 89;
                    int i5 = i4 % 128;
                    onExtraCallback = i5;
                    int i6 = i4 % 2;
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = i5 + 91;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    this.L$0 = access15400.onNavigationEvent(setripple);
                    this.L$1 = parseVar;
                    this.label = 1;
                    if (setripple.emit(parseVar, this) == objOnWarmupCompleted) {
                        int i9 = onExtraCallback + 83;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                }
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(!parseVar.IAuthTabCallback());
                int i10 = onWarmupCompleted + 101;
                onExtraCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 58 / 0;
                }
                return boolOnNavigationEvent;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        
            if (r1.emit(r13, r12) != r2) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
        
            if (o.ycxycx.onNavigationEvent(r1, r13, r12) != r2) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            parse parseVar;
            int i = 2 % 2;
            setRipple setripple = (setRipple) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (applyTransparentTitle.this.onWarmupCompleted(this.$moduleName)) {
                    parse.asBinder asbinder = parse.asBinder.IAuthTabCallback;
                    this.L$0 = access15400.onNavigationEvent(setripple);
                    this.label = 1;
                } else {
                    parseVar = (parse) ((Map) applyTransparentTitle.this.onWarmupCompleted().IAuthTabCallback()).get(this.$moduleName);
                    if (parseVar == null || !parseVar.onExtraCallback()) {
                        applyTransparentTitle applytransparenttitle = applyTransparentTitle.this;
                        List listListOf = CollectionsKt.listOf(this.$moduleName);
                        this.L$0 = setripple;
                        this.L$1 = access15400.onNavigationEvent(parseVar);
                        this.label = 2;
                        if (applyTransparentTitle.onNavigationEvent(applytransparenttitle, listListOf, null, this, 2, null) != objOnWarmupCompleted) {
                        }
                    }
                    IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(new onExtraCallbackWithResult(applyTransparentTitle.this.onWarmupCompleted(), this.$moduleName), new AnonymousClass3(null));
                    this.L$0 = access15400.onNavigationEvent(setripple);
                    this.L$1 = access15400.onNavigationEvent(parseVar);
                    this.label = 3;
                }
                return objOnWarmupCompleted;
            }
            if (i2 == 1) {
                ResultKt.onNavigationEvent(obj);
                Unit unit = Unit.INSTANCE;
                int i3 = onNavigationEvent + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }
            int i5 = onNavigationEvent + 95;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                Unit unit2 = Unit.INSTANCE;
                int i7 = onNavigationEvent + 45;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return unit2;
                }
                throw null;
            }
            parseVar = (parse) this.L$1;
            ResultKt.onNavigationEvent(obj);
            int i8 = onExtraCallback + 39;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            IAnimation iAnimationOnExtraCallbackWithResult2 = ycxycx.onExtraCallbackWithResult(new onExtraCallbackWithResult(applyTransparentTitle.this.onWarmupCompleted(), this.$moduleName), new AnonymousClass3(null));
            this.L$0 = access15400.onNavigationEvent(setripple);
            this.L$1 = access15400.onNavigationEvent(parseVar);
            this.label = 3;
        }
    }

    default IAnimation<parse> onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        return ycxycx.onExtraCallbackWithResult(new onWarmupCompleted(str, null));
    }

    public static final class IAuthTabCallback extends Exception {
        public IAuthTabCallback() {
            super("DFM Install Canceled");
        }
    }

    public static final class onExtraCallback extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull List<String> list, int i, @Nullable String str) {
            super("DFM Failed. module:" + list + ", errorCode:" + i + ", message:" + str);
            Intrinsics.checkNotNullParameter(list, "");
        }
    }
}
