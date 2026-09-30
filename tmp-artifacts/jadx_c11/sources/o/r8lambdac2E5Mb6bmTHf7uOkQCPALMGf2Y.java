package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.containsJSONObjectContainingInt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdac2E5Mb6bmTHf7uOkQCPALMGf2Y {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs r8lambda_fmcbyjvtkeoil0cgabhhmgovfs, boolean z, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = r8lambda_fmcbyjvtkeoil0cgabhhmgovfs;
            this.$checked = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$checked, access13800Var);
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$state.IAuthTabCallback(this.$checked);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 31;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs $state;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs r8lambda_fmcbyjvtkeoil0cgabhhmgovfs, boolean z, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = r8lambda_fmcbyjvtkeoil0cgabhhmgovfs;
            this.$visible = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, this.$visible, access13800Var);
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 50 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onExtraCallbackWithResult(this.$visible);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs r8lambda_fmcbyjvtkeoil0cgabhhmgovfs, boolean z, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = r8lambda_fmcbyjvtkeoil0cgabhhmgovfs;
            this.$expanded = z;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
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
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$expanded, access13800Var);
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 103;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$state.onNavigationEvent(this.$expanded);
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ int $depth;
        final /* synthetic */ r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs r8lambda_fmcbyjvtkeoil0cgabhhmgovfs, int i, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = r8lambda_fmcbyjvtkeoil0cgabhhmgovfs;
            this.$depth = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$depth, access13800Var);
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$state.IAuthTabCallback(this.$depth);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ float $maxFontScale;
        final /* synthetic */ r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs r8lambda_fmcbyjvtkeoil0cgabhhmgovfs, float f, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = r8lambda_fmcbyjvtkeoil0cgabhhmgovfs;
            this.$maxFontScale = f;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
            int i5 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$state, this.$maxFontScale, access13800Var);
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 17 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r4);
            r3.$state.IAuthTabCallback(r3.$maxFontScale);
            r4 = kotlin.Unit.INSTANCE;
            r1 = o.r8lambdac2E5Mb6bmTHf7uOkQCPALMGf2Y.onExtraCallbackWithResult.IAuthTabCallback + 111;
            o.r8lambdac2E5Mb6bmTHf7uOkQCPALMGf2Y.onExtraCallbackWithResult.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 90 / 0;
            }
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ boolean $showArrow;
        final /* synthetic */ r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs r8lambda_fmcbyjvtkeoil0cgabhhmgovfs, boolean z, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$state = r8lambda_fmcbyjvtkeoil0cgabhhmgovfs;
            this.$showArrow = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$state, this.$showArrow, access13800Var);
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 34 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = asbinderCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 20 / 0;
            } else {
                objInvokeSuspend = asbinderCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallback + 81;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            if (r3.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r4);
            r3.$state.onWarmupCompleted(r3.$showArrow);
            r4 = kotlin.Unit.INSTANCE;
            r1 = o.r8lambdac2E5Mb6bmTHf7uOkQCPALMGf2Y.asBinder.IAuthTabCallback + 113;
            o.r8lambdac2E5Mb6bmTHf7uOkQCPALMGf2Y.asBinder.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 7 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a6 A[PHI: r5
      0x01a6: PHI (r5v21 boolean) = (r5v10 boolean), (r5v22 boolean) binds: [B:103:0x01a4, B:99:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01eb A[PHI: r7
      0x01eb: PHI (r7v25 boolean) = (r7v9 boolean), (r7v26 boolean) binds: [B:118:0x01e9, B:114:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022b A[PHI: r6
      0x022b: PHI (r6v22 int) = (r6v13 int), (r6v23 int) binds: [B:133:0x0229, B:129:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0271 A[PHI: r4
      0x0271: PHI (r4v22 float) = (r4v11 float), (r4v23 float) binds: [B:148:0x026f, B:144:0x0268] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0154 A[PHI: r3
      0x0154: PHI (r3v38 boolean) = (r3v5 boolean), (r3v39 boolean) binds: [B:86:0x0152, B:82:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final setAndDownscaleImageUri onExtraCallbackWithResult(@Nullable Object obj, boolean z, @Nullable getBacktraceNote<? super removeObjectsForKeys, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, boolean z2, @Nullable getBacktraceNote<? super toIntegerList, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super shallowCopy, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getBacktraceNote<? super removeTrimmedEmptyStrings, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4, @Nullable getBacktraceNote<? super r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5, @Nullable containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult, boolean z3, boolean z4, int i, int i2, boolean z5, float f, @Nullable String str, @Nullable getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri> getmemorymappingsorbuilder, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4, int i5) throws Throwable {
        boolean z6;
        int i6;
        int i7;
        float f2;
        boolean z7;
        String str2;
        int i8;
        boolean z8;
        boolean z9;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z10;
        boolean z11;
        Throwable th;
        boolean zOnNavigationEvent;
        boolean z12;
        boolean z13;
        Object objOnMinimized;
        boolean zOnNavigationEvent2;
        int i9;
        boolean z14;
        boolean z15;
        Object objOnMinimized2;
        boolean zOnNavigationEvent3;
        int i10;
        boolean z16;
        Object objOnMinimized3;
        boolean zOnNavigationEvent4;
        float f3;
        boolean z17;
        boolean zOnNavigationEvent5;
        boolean z18;
        int i11 = 2 % 2;
        getBacktraceNote<? super removeObjectsForKeys, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6 = (i5 & 4) != 0 ? null : getbacktracenote;
        boolean z19 = true;
        if ((i5 & 8) != 0) {
            int i12 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            z6 = true;
        } else {
            z6 = z2;
        }
        getBacktraceNote<? super toIntegerList, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7 = (i5 & 16) != 0 ? null : getbacktracenote2;
        getBacktraceNote<? super shallowCopy, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = (i5 & 32) != 0 ? null : getbacktracenote3;
        getBacktraceNote<? super removeTrimmedEmptyStrings, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = (i5 & 64) != 0 ? null : getbacktracenote4;
        getBacktraceNote<? super r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10 = (i5 & 128) != 0 ? null : getbacktracenote5;
        containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult2 = (i5 & 256) != 0 ? containsJSONObjectContainingInt.onExtraCallbackWithResult.onNavigationEvent.onExtraCallback : onextracallbackwithresult;
        boolean z20 = (i5 & 512) != 0 ? true : z3;
        boolean z21 = (i5 & 1024) != 0 ? true : z4;
        int i14 = (i5 & 2048) != 0 ? 0 : i;
        if ((i5 & 4096) != 0) {
            int i15 = IAuthTabCallback + 83;
            i6 = i14;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            i7 = 0;
        } else {
            i6 = i14;
            i7 = i2;
        }
        boolean z22 = (i5 & 8192) != 0 ? false : z5;
        float f4 = (i5 & 16384) != 0 ? 2.0f : f;
        if ((i5 & 32768) != 0) {
            f2 = f4;
            int i17 = onExtraCallbackWithResult + 89;
            z7 = z21;
            IAuthTabCallback = i17 % 128;
            if (i17 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = null;
        } else {
            f2 = f4;
            z7 = z21;
            str2 = str;
        }
        getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri> getmemorymappingsorbuilderOnExtraCallbackWithResult = (i5 & 65536) != 0 ? getOpenFdsCount.onExtraCallbackWithResult() : getmemorymappingsorbuilder;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1087561331, i3, i4, "im.toss.tds.compose.component.compound.agreement.v4.group.rememberTdsAgreementV4GroupItemState (TdsAgreementV4GroupItemState.kt:146)");
        }
        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj);
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent6 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            i8 = i6;
            z8 = z6;
            z9 = z20;
            r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs r8lambda_fmcbyjvtkeoil0cgabhhmgovfs = new r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs(obj, getbacktracenote6, getbacktracenote7, getbacktracenote8, getbacktracenote9, getbacktracenote10, onextracallbackwithresult2, i7, z22, getmemorymappingsorbuilderOnExtraCallbackWithResult, z, z8, z7, i8, f2, str2, z9);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs);
            objOnMinimized4 = r8lambda_fmcbyjvtkeoil0cgabhhmgovfs;
        } else {
            int i18 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            i8 = i6;
            z9 = z20;
            z8 = z6;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        }
        r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2 = (r8lambda_fmcbYJvtKEOiL0CgABhHMgovfs) objOnMinimized4;
        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
        if (((i3 & 112) ^ 48) > 32) {
            z10 = z;
            if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z10)) {
                z11 = true;
            }
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent7 | z11) {
                int i19 = onExtraCallbackWithResult + 115;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    th = null;
                    objOnMinimized5 = new onWarmupCompleted(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2, z10, null);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                } else {
                    th = null;
                }
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 3) & 14);
            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
            if (((i3 & 7168) ^ 3072) <= 2048) {
                z12 = z8;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z12)) {
                    z13 = true;
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | z13) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallback(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2, z12, th);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z12), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 9) & 14);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                i9 = i4 & 14;
                if ((i9 ^ 6) > 4) {
                    z14 = z7;
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z14)) {
                        z15 = true;
                    }
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent2 | z15) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2, z14, th);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z14), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, i9);
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                    if (((i4 & 112) ^ 48) <= 32) {
                        i10 = i8;
                        if (!(!cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i10))) {
                            z16 = true;
                        }
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnNavigationEvent3 | z16) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized3 = new onExtraCallback(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2, i10, th);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Integer.valueOf(i10), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 3) & 14);
                        zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                        if (((57344 & i4) ^ 24576) > 16384) {
                            f3 = f2;
                            if (cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f3)) {
                                z17 = true;
                            }
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (zOnNavigationEvent4 | z17) {
                                int i21 = onExtraCallbackWithResult + 29;
                                IAuthTabCallback = i21 % 128;
                                if (i21 % 2 == 0) {
                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                    th.hashCode();
                                    throw th;
                                }
                                if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized6 = new onExtraCallbackWithResult(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2, f3, th);
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized6);
                                }
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f3), (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 12) & 14);
                            zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                            if (((1879048192 & i3) ^ 805306368) <= 536870912) {
                                z18 = z9;
                                if (!cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z18)) {
                                }
                                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(zOnNavigationEvent5 | z19)) {
                                    int i22 = IAuthTabCallback + 55;
                                    onExtraCallbackWithResult = i22 % 128;
                                    int i23 = i22 % 2;
                                    if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized7 = new asBinder(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2, z18, th);
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                                    }
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z18), (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 27) & 14);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                return r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2;
                            }
                            z18 = z9;
                            if ((805306368 & i3) != 536870912) {
                                z19 = false;
                            }
                            Object objOnMinimized72 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(zOnNavigationEvent5 | z19)) {
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z18), (Function2) objOnMinimized72, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 27) & 14);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            return r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2;
                        }
                        f3 = f2;
                        if ((i4 & 24576) != 16384) {
                            z17 = false;
                        }
                        Object objOnMinimized62 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent4 | z17) {
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f3), (Function2) objOnMinimized62, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 12) & 14);
                        zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                        if (((1879048192 & i3) ^ 805306368) <= 536870912) {
                        }
                        if ((805306368 & i3) != 536870912) {
                        }
                        Object objOnMinimized722 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnNavigationEvent5 | z19)) {
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z18), (Function2) objOnMinimized722, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 27) & 14);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        return r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2;
                    }
                    i10 = i8;
                    if ((i4 & 48) == 32) {
                        z16 = false;
                    }
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent3 | z16) {
                        objOnMinimized3 = new onExtraCallback(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2, i10, th);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Integer.valueOf(i10), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 3) & 14);
                    zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                    if (((57344 & i4) ^ 24576) > 16384) {
                    }
                    if ((i4 & 24576) != 16384) {
                    }
                    Object objOnMinimized622 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent4 | z17) {
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f3), (Function2) objOnMinimized622, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 12) & 14);
                    zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                    if (((1879048192 & i3) ^ 805306368) <= 536870912) {
                    }
                    if ((805306368 & i3) != 536870912) {
                    }
                    Object objOnMinimized7222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent5 | z19)) {
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z18), (Function2) objOnMinimized7222, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 27) & 14);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    return r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2;
                }
                z14 = z7;
                if ((i4 & 6) != 4) {
                    z15 = false;
                }
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent2 | z15)) {
                    objOnMinimized2 = new onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2, z14, th);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z14), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, i9);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                if (((i4 & 112) ^ 48) <= 32) {
                }
                if ((i4 & 48) == 32) {
                }
                objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent3 | z16) {
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Integer.valueOf(i10), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 3) & 14);
                zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                if (((57344 & i4) ^ 24576) > 16384) {
                }
                if ((i4 & 24576) != 16384) {
                }
                Object objOnMinimized6222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent4 | z17) {
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f3), (Function2) objOnMinimized6222, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 12) & 14);
                zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
                if (((1879048192 & i3) ^ 805306368) <= 536870912) {
                }
                if ((805306368 & i3) != 536870912) {
                }
                Object objOnMinimized72222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent5 | z19)) {
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z18), (Function2) objOnMinimized72222, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 27) & 14);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                return r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2;
            }
            z12 = z8;
            if ((i3 & 3072) == 2048) {
                z13 = false;
            }
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent | z13) {
                objOnMinimized = new IAuthTabCallback(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2, z12, th);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z12), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 9) & 14);
            zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
            i9 = i4 & 14;
            if ((i9 ^ 6) > 4) {
            }
            if ((i4 & 6) != 4) {
            }
            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent2 | z15)) {
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z14), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, i9);
            zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
            if (((i4 & 112) ^ 48) <= 32) {
            }
            if ((i4 & 48) == 32) {
            }
            objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent3 | z16) {
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Integer.valueOf(i10), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 3) & 14);
            zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
            if (((57344 & i4) ^ 24576) > 16384) {
            }
            if ((i4 & 24576) != 16384) {
            }
            Object objOnMinimized62222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent4 | z17) {
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f3), (Function2) objOnMinimized62222, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 12) & 14);
            zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
            if (((1879048192 & i3) ^ 805306368) <= 536870912) {
            }
            if ((805306368 & i3) != 536870912) {
            }
            Object objOnMinimized722222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent5 | z19)) {
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z18), (Function2) objOnMinimized722222, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 27) & 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            return r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2;
        }
        z10 = z;
        if ((i3 & 48) != 32) {
            z11 = false;
        }
        Object objOnMinimized52 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent7 | z11) {
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized52, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 3) & 14);
        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
        if (((i3 & 7168) ^ 3072) <= 2048) {
        }
        if ((i3 & 3072) == 2048) {
        }
        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent | z13) {
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z12), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 9) & 14);
        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
        i9 = i4 & 14;
        if ((i9 ^ 6) > 4) {
        }
        if ((i4 & 6) != 4) {
        }
        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent2 | z15)) {
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z14), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, i9);
        zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
        if (((i4 & 112) ^ 48) <= 32) {
        }
        if ((i4 & 48) == 32) {
        }
        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent3 | z16) {
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Integer.valueOf(i10), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 3) & 14);
        zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
        if (((57344 & i4) ^ 24576) > 16384) {
        }
        if ((i4 & 24576) != 16384) {
        }
        Object objOnMinimized622222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent4 | z17) {
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f3), (Function2) objOnMinimized622222, cameraCaptureResultEmptyCameraCaptureResult2, (i4 >> 12) & 14);
        zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2);
        if (((1879048192 & i3) ^ 805306368) <= 536870912) {
        }
        if ((805306368 & i3) != 536870912) {
        }
        Object objOnMinimized7222222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent5 | z19)) {
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z18), (Function2) objOnMinimized7222222, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 27) & 14);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        return r8lambda_fmcbyjvtkeoil0cgabhhmgovfs2;
    }
}
