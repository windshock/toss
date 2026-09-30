package o;

import android.os.Build;
import j$.time.Duration;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.drawTextProgressPosition;
import org.jetbrains.annotations.NotNull;
import org.xbill.DNS.Resolver;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawTextProgressPosition {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    public static final drawTextProgressPosition onExtraCallbackWithResult = new drawTextProgressPosition();
    private static final String[] onNavigationEvent = {"8.8.8.8", "1.1.1.1"};
    private static int onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = drawTextProgressPosition.this.onNavigationEvent((String) null, i3 == 0 ? 1L : 0L, (access13800<? super List<? extends InetAddress>>) this);
            int i4 = onWarmupCompleted + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = drawTextProgressPosition.onNavigationEvent(drawTextProgressPosition.this, (GeckoHubImp1) null, (access13800) this);
            int i4 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    public static /* synthetic */ List IAuthTabCallback(String str, int i, moveToFirst movetofirst) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List listOnNavigationEvent = onNavigationEvent(str, i, movetofirst);
        int i5 = onExtraCallback + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return listOnNavigationEvent;
    }

    private drawTextProgressPosition() {
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(drawTextProgressPosition drawtextprogressposition, String str, int i, moveToFirst movetofirst, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = drawtextprogressposition.onWarmupCompleted(str, i, movetofirst, access13800Var);
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
        int i6 = onWarmupCompleted + 83;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ Object onNavigationEvent(drawTextProgressPosition drawtextprogressposition, GeckoHubImp1 geckoHubImp1, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return drawtextprogressposition.onNavigationEvent(geckoHubImp1, access13800Var);
        }
        drawtextprogressposition.onNavigationEvent(geckoHubImp1, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = IAuthTabCallback + 47;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends InetAddress>>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $host;
        final /* synthetic */ moveToFirst $resolver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, moveToFirst movetofirst, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$host = str;
            this.$resolver = movetofirst;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$host, this.$resolver, access13800Var);
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super List<? extends InetAddress>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.drawTextProgressPosition$onExtraCallbackWithResult$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends InetAddress>>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ String $host;
            final /* synthetic */ moveToFirst $resolver;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, moveToFirst movetofirst, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$host = str;
                this.$resolver = movetofirst;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$host, this.$resolver, access13800Var);
                anonymousClass1.L$0 = obj;
                int i2 = IAuthTabCallback + 121;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 58 / 0;
                }
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super List<? extends InetAddress>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 74 / 0;
                }
                return objInvokeSuspend;
            }

            /* renamed from: o.drawTextProgressPosition$onExtraCallbackWithResult$1$IAuthTabCallback */
            static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends InetAddress>>, Object> {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;
                final /* synthetic */ String $host;
                final /* synthetic */ moveToFirst $resolver;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                IAuthTabCallback(String str, moveToFirst movetofirst, access13800<? super IAuthTabCallback> access13800Var) {
                    super(2, access13800Var);
                    this.$host = str;
                    this.$resolver = movetofirst;
                }

                public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super List<? extends InetAddress>> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 51;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    if (i3 == 0) {
                        int i4 = 63 / 0;
                    }
                    return objInvokeSuspend;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$host, this.$resolver, access13800Var);
                    int i2 = onExtraCallbackWithResult + 61;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return iAuthTabCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 59;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                    int i4 = IAuthTabCallback + 99;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objIAuthTabCallback;
                    }
                    throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
                
                    if ((r4 % 2) != 0) goto L13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
                
                    if (r3 != 1) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
                
                    if (r3 != 1) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
                
                    r1 = r1 + 67;
                    o.drawTextProgressPosition.onExtraCallbackWithResult.AnonymousClass1.IAuthTabCallback.IAuthTabCallback = r1 % 128;
                    r1 = r1 % 2;
                    kotlin.ResultKt.onNavigationEvent(r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
                
                    return r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
                
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
                
                    kotlin.ResultKt.onNavigationEvent(r7);
                    r7 = o.drawTextProgressPosition.onExtraCallbackWithResult;
                    r0 = r6.$host;
                    r3 = r6.$resolver;
                    r6.label = 1;
                    r7 = o.drawTextProgressPosition.onExtraCallbackWithResult(r7, r0, 1, r3, r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
                
                    if (r7 != r1) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
                
                    return r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
                
                    if (r3 != 0) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
                
                    if (r3 != 0) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
                
                    r1 = o.drawTextProgressPosition.onExtraCallbackWithResult.AnonymousClass1.IAuthTabCallback.onExtraCallbackWithResult;
                    r4 = r1 + 35;
                    o.drawTextProgressPosition.onExtraCallbackWithResult.AnonymousClass1.IAuthTabCallback.IAuthTabCallback = r4 % 128;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objOnWarmupCompleted;
                    int i;
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 1;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                        int i4 = 49 / 0;
                    } else {
                        objOnWarmupCompleted = access14300.onWarmupCompleted();
                        i = this.label;
                    }
                }
            }

            /* renamed from: o.drawTextProgressPosition$onExtraCallbackWithResult$1$onExtraCallbackWithResult, reason: collision with other inner class name */
            static final class C0022onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends InetAddress>>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                final /* synthetic */ String $host;
                final /* synthetic */ moveToFirst $resolver;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0022onExtraCallbackWithResult(String str, moveToFirst movetofirst, access13800<? super C0022onExtraCallbackWithResult> access13800Var) {
                    super(2, access13800Var);
                    this.$host = str;
                    this.$resolver = movetofirst;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    C0022onExtraCallbackWithResult c0022onExtraCallbackWithResult = new C0022onExtraCallbackWithResult(this.$host, this.$resolver, access13800Var);
                    int i2 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return c0022onExtraCallbackWithResult;
                    }
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 35;
                    onExtraCallbackWithResult = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super List<? extends InetAddress>> access13800Var = (access13800) obj2;
                    if (i2 % 2 != 0) {
                        return onExtraCallbackWithResult(findresandmsg, access13800Var);
                    }
                    onExtraCallbackWithResult(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super List<? extends InetAddress>> access13800Var) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 115;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                    int i4 = onExtraCallbackWithResult + 109;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 41 / 0;
                    }
                    return objInvokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = onExtraCallbackWithResult + 87;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        ResultKt.onNavigationEvent(obj);
                        int i5 = onExtraCallbackWithResult + 109;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return obj;
                    }
                    ResultKt.onNavigationEvent(obj);
                    drawTextProgressPosition drawtextprogressposition = drawTextProgressPosition.onExtraCallbackWithResult;
                    String str = this.$host;
                    moveToFirst movetofirst = this.$resolver;
                    this.label = 1;
                    Object objOnExtraCallbackWithResult = drawTextProgressPosition.onExtraCallbackWithResult(drawtextprogressposition, str, 28, movetofirst, this);
                    if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                        return objOnExtraCallbackWithResult;
                    }
                    int i7 = IAuthTabCallback + 83;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }

            public final Object invokeSuspend(Object obj) {
                GeckoHubImp1 geckoHubImp1OnExtraCallback;
                GeckoHubImp1 geckoHubImp1;
                Collection collection;
                int i = 2 % 2;
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    GeckoHubImp1 geckoHubImp1OnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this.$host, this.$resolver, null), 3, (Object) null);
                    geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new C0022onExtraCallbackWithResult(this.$host, this.$resolver, null), 3, (Object) null);
                    drawTextProgressPosition drawtextprogressposition = drawTextProgressPosition.onExtraCallbackWithResult;
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback2);
                    this.L$2 = geckoHubImp1OnExtraCallback;
                    this.label = 1;
                    Object objOnNavigationEvent = drawTextProgressPosition.onNavigationEvent(drawtextprogressposition, geckoHubImp1OnExtraCallback2, (access13800) this);
                    if (objOnNavigationEvent != objOnWarmupCompleted) {
                        geckoHubImp1 = geckoHubImp1OnExtraCallback2;
                        obj = objOnNavigationEvent;
                    }
                    return objOnWarmupCompleted;
                }
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    int i6 = i3 + 111;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) this.L$3;
                    ResultKt.onNavigationEvent(obj);
                    int i8 = IAuthTabCallback + 87;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 4 / 4;
                    }
                    List listPlus = CollectionsKt.plus(collection, (Iterable) obj);
                    int i10 = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return listPlus;
                }
                geckoHubImp1OnExtraCallback = (GeckoHubImp1) this.L$2;
                geckoHubImp1 = (GeckoHubImp1) this.L$1;
                ResultKt.onNavigationEvent(obj);
                Collection collection2 = (Collection) obj;
                drawTextProgressPosition drawtextprogressposition2 = drawTextProgressPosition.onExtraCallbackWithResult;
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback);
                this.L$3 = collection2;
                this.label = 2;
                Object objOnNavigationEvent2 = drawTextProgressPosition.onNavigationEvent(drawtextprogressposition2, geckoHubImp1OnExtraCallback, (access13800) this);
                if (objOnNavigationEvent2 != objOnWarmupCompleted) {
                    collection = collection2;
                    obj = objOnNavigationEvent2;
                    List listPlus2 = CollectionsKt.plus(collection, (Iterable) obj);
                    int i102 = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i102 % 128;
                    int i112 = i102 % 2;
                    return listPlus2;
                }
                return objOnWarmupCompleted;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$host, this.$resolver, null);
                this.label = 1;
                Object objOnWarmupCompleted2 = isNeedUnzip.onWarmupCompleted(anonymousClass1, this);
                return objOnWarmupCompleted2 == objOnWarmupCompleted ? objOnWarmupCompleted : objOnWarmupCompleted2;
            }
            int i5 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull String str, long j, @NotNull access13800<? super List<? extends InetAddress>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
            if (access13800Var instanceof IAuthTabCallback) {
                int i5 = i2 + 63;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                int i7 = iAuthTabCallback.label;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    iAuthTabCallback.label = i7 - 2147483648;
                } else {
                    iAuthTabCallback = new IAuthTabCallback(access13800Var);
                }
            }
        } else if (access13800Var instanceof IAuthTabCallback) {
        }
        Object objIAuthTabCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = iAuthTabCallback.label;
        try {
            if (i8 == 0) {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                int i9 = Build.VERSION.SDK_INT;
                if (i9 < 26) {
                    int i10 = onExtraCallback + 51;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    return CollectionsKt.emptyList();
                }
                moveToFirst movetofirst = new moveToFirst(onWarmupCompleted(j));
                if (i9 >= 26) {
                    Duration durationOfSeconds = Duration.ofSeconds(setLogBuffers.IAuthTabCallbackStubProxy(j), setLogBuffers.IAuthTabCallback_Parcel(j));
                    Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "");
                    movetofirst.IAuthTabCallback(durationOfSeconds);
                }
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(str, movetofirst, null);
                iAuthTabCallback.L$0 = access15400.onNavigationEvent(str);
                iAuthTabCallback.L$1 = access15400.onNavigationEvent(movetofirst);
                iAuthTabCallback.J$0 = j;
                iAuthTabCallback.label = 1;
                objIAuthTabCallback = doGet.IAuthTabCallback(j, onextracallbackwithresult, iAuthTabCallback);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objIAuthTabCallback);
            }
            List list = (List) objIAuthTabCallback;
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    private final Object onWarmupCompleted(final String str, final int i, final moveToFirst movetofirst, access13800<? super List<? extends InetAddress>> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallbackWithResult = getChannelIndex.onExtraCallbackWithResult(putChannelInfo.IAuthTabCallback(), new Function0() { // from class: im.toss.core.network.PublicDnsResolver$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 29;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                List listIAuthTabCallback = drawTextProgressPosition.IAuthTabCallback(str, i, movetofirst);
                int i6 = onExtraCallback + 69;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return listIAuthTabCallback;
            }
        }, access13800Var);
        int i3 = onExtraCallback + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(GeckoHubImp1<? extends List<? extends InetAddress>> geckoHubImp1, access13800<? super List<? extends InetAddress>> access13800Var) {
        onExtraCallback onextracallback;
        Object obj;
        int i = 2 % 2;
        if (!(access13800Var instanceof onExtraCallback)) {
            onextracallback = new onExtraCallback(access13800Var);
        } else {
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i4 - 2147483648;
                int i5 = onWarmupCompleted + 117;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Object objIAuthTabCallback = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallback.label;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                Result.Companion companion = kotlin.Result.Companion;
                onextracallback.L$0 = access15400.onNavigationEvent(geckoHubImp1);
                onextracallback.L$1 = access15400.onNavigationEvent(onextracallback);
                onextracallback.I$0 = 0;
                onextracallback.I$1 = 0;
                onextracallback.label = 1;
                objIAuthTabCallback = geckoHubImp1.IAuthTabCallback(onextracallback);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = onExtraCallback + 81;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    ResultKt.onNavigationEvent(objIAuthTabCallback);
                    int i9 = 59 / 0;
                } else {
                    ResultKt.onNavigationEvent(objIAuthTabCallback);
                }
            }
            obj = kotlin.Result.constructor-impl(objIAuthTabCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (Exception e3) {
            Result.Companion companion3 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (!kotlin.Result.onExtraCallback(obj)) {
            return obj;
        }
        int i10 = onWarmupCompleted + 35;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 50 / 0;
        }
        return listEmptyList;
    }

    private final List<Resolver> onWarmupCompleted(long j) {
        int i = 2 % 2;
        String[] strArr = onNavigationEvent;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        for (String str : strArr) {
            lt37 lt37Var = new lt37(str);
            if (Build.VERSION.SDK_INT >= 26) {
                int i4 = onExtraCallback + 73;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    Duration durationOfSeconds = Duration.ofSeconds(setLogBuffers.IAuthTabCallbackStubProxy(j), setLogBuffers.IAuthTabCallback_Parcel(j));
                    Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "");
                    lt37Var.IAuthTabCallback(durationOfSeconds);
                    throw null;
                }
                Duration durationOfSeconds2 = Duration.ofSeconds(setLogBuffers.IAuthTabCallbackStubProxy(j), setLogBuffers.IAuthTabCallback_Parcel(j));
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "");
                lt37Var.IAuthTabCallback(durationOfSeconds2);
            }
            arrayList.add(lt37Var);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[PHI: r3
      0x003b: PHI (r3v4 o.dy2) = (r3v3 o.dy2), (r3v13 o.dy2) binds: [B:14:0x0039, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[PHI: r3
      0x0042: PHI (r3v8 o.dy2) = (r3v3 o.dy2), (r3v13 o.dy2) binds: [B:14:0x0039, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List onNavigationEvent(String str, int i, moveToFirst movetofirst) {
        dy2 dy2Var;
        InetAddress inetAddressOnExtraCallback;
        int i2 = 2 % 2;
        dc3 dc3Var = new dc3(str, i);
        dc3Var.onExtraCallback(movetofirst);
        dy2[] dy2VarArrOnExtraCallback = dc3Var.onExtraCallback();
        if (dy2VarArrOnExtraCallback == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = dy2VarArrOnExtraCallback.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = onWarmupCompleted + 105;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            if (i4 % 2 == 0) {
                dy2Var = dy2VarArrOnExtraCallback[i3];
                int i6 = 94 / 0;
                if (dy2Var instanceof dy4) {
                    inetAddressOnExtraCallback = ((dy4) dy2Var).onExtraCallback();
                } else if (!(!(dy2Var instanceof dy2))) {
                    inetAddressOnExtraCallback = dy2Var.onNavigationEvent();
                } else {
                    int i7 = i5 + 45;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    inetAddressOnExtraCallback = null;
                }
            } else {
                dy2Var = dy2VarArrOnExtraCallback[i3];
                if (dy2Var instanceof dy4) {
                }
            }
            if (inetAddressOnExtraCallback != null) {
                int i9 = onExtraCallback + 67;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                arrayList.add(inetAddressOnExtraCallback);
            }
        }
        return arrayList;
    }
}
