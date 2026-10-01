package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class requestAssetInfo$onExtraCallback implements IAnimation<onViewDraw> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ IAnimation onNavigationEvent;

    /* renamed from: o.requestAssetInfo$onExtraCallback$3, reason: invalid class name */
    public static final class AnonymousClass3<T> implements setRipple {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ setRipple onExtraCallback;

        /* renamed from: o.requestAssetInfo$onExtraCallback$3$3, reason: invalid class name and collision with other inner class name */
        public static final class C00463 extends ContinuationImpl {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public C00463(access13800 access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                Object objEmit = AnonymousClass3.this.emit(null, this);
                int i5 = onExtraCallback + 67;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return objEmit;
            }
        }

        public AnonymousClass3(setRipple setripple) {
            this.onExtraCallback = setripple;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[PHI: r1 r4
          0x003c: PHI (r1v6 o.requestAssetInfo$onExtraCallback$3$3) = (r1v5 o.requestAssetInfo$onExtraCallback$3$3), (r1v8 o.requestAssetInfo$onExtraCallback$3$3) binds: [B:15:0x003a, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x003c: PHI (r4v1 int) = (r4v0 int), (r4v3 int) binds: [B:15:0x003a, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, access13800 access13800Var) {
            C00463 c00463;
            int i2;
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback;
            int i5 = i4 + 69;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 48 / 0;
                if (access13800Var instanceof C00463) {
                    int i7 = i4 + 103;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        c00463 = (C00463) access13800Var;
                        i2 = c00463.label;
                        int i8 = 45 / 0;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c00463.label = i2 - 2147483648;
                        } else {
                            c00463 = new C00463(access13800Var);
                        }
                    } else {
                        c00463 = (C00463) access13800Var;
                        i2 = c00463.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                        }
                    }
                }
            } else if (access13800Var instanceof C00463) {
            }
            Object obj2 = c00463.result;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i9 = c00463.label;
            Object obj3 = null;
            if (i9 == 0) {
                ResultKt.onNavigationEvent(obj2);
                setRipple setripple = this.onExtraCallback;
                if (((onViewDraw) obj) == onViewDraw.Marketing) {
                    int i10 = IAuthTabCallback + 115;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    c00463.L$0 = access15400.onNavigationEvent(obj);
                    c00463.L$1 = access15400.onNavigationEvent(c00463);
                    c00463.L$2 = access15400.onNavigationEvent(obj);
                    c00463.L$3 = access15400.onNavigationEvent(setripple);
                    c00463.I$0 = 0;
                    c00463.label = 1;
                    if (setripple.emit(obj, c00463) == objOnWarmupCompleted) {
                        int i12 = IAuthTabCallback + 111;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = IAuthTabCallback + 71;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj2);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public requestAssetInfo$onExtraCallback(IAnimation iAnimation) {
        this.onNavigationEvent = iAnimation;
    }

    public Object collect(setRipple setripple, access13800 access13800Var) {
        int i2 = 2 % 2;
        Object objCollect = this.onNavigationEvent.collect(new AnonymousClass3(setripple), access13800Var);
        if (objCollect != access14300.onWarmupCompleted()) {
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 0;
            }
            return unit;
        }
        int i5 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return objCollect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
