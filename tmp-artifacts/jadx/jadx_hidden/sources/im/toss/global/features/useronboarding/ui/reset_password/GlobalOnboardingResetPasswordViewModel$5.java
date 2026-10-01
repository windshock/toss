package im.toss.global.features.useronboarding.ui.reset_password;

import android.view.ViewConfiguration;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AppNode5;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.GeckoHubImp1;
import o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.formatMsgs;
import o.getBooleanFromAdObject;
import o.maybeUpdateAnimatable;
import o.s3c;
import o.setRandomHost;
import o.tryTriggerOnStart;

/* loaded from: classes.dex */
final class GlobalOnboardingResetPasswordViewModel$5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = -1538795438;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = -2139909119;
    private static int onExtraCallbackWithResult = -1111743714;
    private static short[] onNavigationEvent;
    private static byte[] onWarmupCompleted = {-35, -86, -72, -88, -94, -71, -96, -90, -65, -26, 107, -105, -66, -107, 10, -84, 101, -83, -81, -84, -69, -72, -27, -70, 110, -106, -90, -68, -92, -90, -27, -84, 101, -85, -85, -91, -79, -106, -2, -70, 84, -82, -9, 87, -93, -66, -95, -60, -58, -64, -76, -31, -107, -47, -53, -46, -79, -79, -62, -73, -61, -49, -47, -48, -85, -34, -79, -35, -46, -70, -56, -60, -60, -79, -48, -79, -36, -77, -18, -94, -38, -50, -78, -62, -28, -50, 65, 82, 71, 83, 95, 97, 64, -81, 11, 110, 65, 109, 66, -95, 26, 66, 96, 64, 106, 66, 81, -81, 0, 90, -93, 27, 94, 88, 82, 87, 122};
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GlobalOnboardingResetPasswordViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalOnboardingResetPasswordViewModel$5(GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, access13800<? super GlobalOnboardingResetPasswordViewModel$5> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalOnboardingResetPasswordViewModel;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        GlobalOnboardingResetPasswordViewModel$5 globalOnboardingResetPasswordViewModel$5 = new GlobalOnboardingResetPasswordViewModel$5(this.this$0, access13800Var);
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return globalOnboardingResetPasswordViewModel$5;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = asInterface + 83;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = asBinder + 73;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return objInvokeSuspend;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends String>>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onNavigationEvent = 5176305587957069056L;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ GlobalOnboardingResetPasswordViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.this$0 = globalOnboardingResetPasswordViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super List<String>> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$5$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        static final class C0000onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends String>>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static char IAuthTabCallback = 42762;
            private static char onExtraCallback = 38278;
            private static char onExtraCallbackWithResult = 49966;
            private static char onNavigationEvent = 29098;
            private static int onTransact = 1;
            private static int onWarmupCompleted;
            int label;
            final /* synthetic */ GlobalOnboardingResetPasswordViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0000onNavigationEvent(GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, access13800<? super C0000onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.this$0 = globalOnboardingResetPasswordViewModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0000onNavigationEvent c0000onNavigationEvent = new C0000onNavigationEvent(this.this$0, access13800Var);
                int i2 = onWarmupCompleted + 29;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return c0000onNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                onTransact = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super List<String>> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onNavigationEvent(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = onTransact + 107;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super List<String>> access13800Var) {
                int i = 2 % 2;
                int i2 = onTransact + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                C0000onNavigationEvent c0000onNavigationEventCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return c0000onNavigationEventCreate.invokeSuspend(Unit.INSTANCE);
                }
                c0000onNavigationEventCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
            
                if (r7 == r1) goto L21;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    java.lang.Object r1 = o.access14300.onWarmupCompleted()
                    int r2 = r6.label
                    r3 = 1
                    if (r2 == 0) goto L50
                    int r4 = im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$5.onNavigationEvent.C0000onNavigationEvent.onWarmupCompleted
                    int r4 = r4 + 63
                    int r5 = r4 % 128
                    im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$5.onNavigationEvent.C0000onNavigationEvent.onTransact = r5
                    int r4 = r4 % r0
                    if (r2 == r3) goto L46
                    if (r2 != r0) goto L23
                    kotlin.ResultKt.onNavigationEvent(r7)
                    kotlin.Result r7 = (kotlin.Result) r7
                    java.lang.Object r7 = r7.onNavigationEvent()
                    goto L8b
                L23:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    r0 = 48
                    char[] r0 = new char[r0]
                    r0 = {x00a0: FILL_ARRAY_DATA , data: [-7641, 17739, 5957, -4314, -10827, 10284, 17313, 2722, -19682, -25639, -20982, 16406, -24463, -1823, 9096, -21419, -30611, -24259, -30070, -15978, -31919, -10886, 5275, -15447, 1633, -12557, 11214, -21132, 18611, 25748, 9096, -21419, 15310, -6317, -19360, -30899, -16185, -3514, 14481, -9931, -31679, 17985, 21850, -13900, -23849, 32102, 26430, 18494} // fill-array
                    java.lang.String r1 = ""
                    r2 = 0
                    int r1 = android.text.TextUtils.indexOf(r1, r1, r2, r2)
                    int r1 = 47 - r1
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    a(r0, r1, r3)
                    r0 = r3[r2]
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r0 = r0.intern()
                    r7.<init>(r0)
                    throw r7
                L46:
                    kotlin.ResultKt.onNavigationEvent(r7)
                    kotlin.Result r7 = (kotlin.Result) r7
                    java.lang.Object r7 = r7.onNavigationEvent()
                    goto L6d
                L50:
                    kotlin.ResultKt.onNavigationEvent(r7)
                    im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel r7 = r6.this$0
                    o.ACScannerOption r7 = im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel.onNavigationEvent(r7)
                    im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel r2 = r6.this$0
                    java.lang.Object r2 = r2.onWarmupCompleted$3a5882b4()
                    o.createAlternativeBillingOnlyReportingDetailsAsync r2 = (o.createAlternativeBillingOnlyReportingDetailsAsync) r2
                    long r4 = r2.onExtraCallback()
                    r6.label = r3
                    java.lang.Object r7 = r7.onExtraCallback(r4, r6)
                    if (r7 == r1) goto L9f
                L6d:
                    kotlin.ResultKt.onNavigationEvent(r7)
                    im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel r7 = r6.this$0
                    o.ACScannerOption r7 = im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel.onNavigationEvent(r7)
                    im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel r2 = r6.this$0
                    java.lang.Object r2 = r2.onWarmupCompleted$3a5882b4()
                    o.createAlternativeBillingOnlyReportingDetailsAsync r2 = (o.createAlternativeBillingOnlyReportingDetailsAsync) r2
                    long r2 = r2.onExtraCallback()
                    r6.label = r0
                    java.lang.Object r7 = r7.onWarmupCompleted(r2, r6)
                    if (r7 != r1) goto L8b
                    goto L9f
                L8b:
                    kotlin.ResultKt.onNavigationEvent(r7)
                    int r1 = im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$5.onNavigationEvent.C0000onNavigationEvent.onTransact
                    int r1 = r1 + 89
                    int r2 = r1 % 128
                    im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$5.onNavigationEvent.C0000onNavigationEvent.onWarmupCompleted = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L9a
                    return r7
                L9a:
                    r7 = 0
                    r7.hashCode()
                    throw r7
                L9f:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$5.onNavigationEvent.C0000onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            private static void a(char[] cArr, int i, Object[] objArr) {
                int i2;
                int i3 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
                char[] cArr2 = new char[cArr.length];
                defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
                char[] cArr3 = new char[2];
                while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                    int i4 = $10 + 119;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                        cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                        i2 = 1;
                    } else {
                        cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                        cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                        i2 = 0;
                    }
                    int i5 = 58224;
                    while (i2 < 16) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        char C = AppNode5.C(c, (c2 + i5) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L))), c2 >>> 5, onExtraCallback);
                        cArr3[1] = C;
                        cArr3[0] = AppNode5.C(cArr3[0], (C + i5) ^ ((C << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L))), C >>> 5, onNavigationEvent);
                        i5 -= 40503;
                        i2++;
                        int i6 = $10 + 61;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                    cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                    s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
                }
                objArr[0] = new String(cArr2, 0, i);
            }
        }

        public final Object invokeSuspend(Object obj) {
            GeckoHubImp1 geckoHubImp1OnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new C0000onNavigationEvent(this.this$0, null), 3, (Object) null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = geckoHubImp1OnExtraCallback;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(2000L, this) != objOnWarmupCompleted) {
                }
            }
            int i5 = onExtraCallback + 113;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                if (i4 != 2) {
                    Object[] objArr = new Object[1];
                    a(new char[]{23285, 40405, 23190, 5048, 54401, 34809, 51445, 11697, 25317, 23453, 32934, 25997, 10930, 25547, 22684, 40206, 61968, 43812, 4172, 54634, 47637, 62331, 10300, 3451, 17002, 15195, 57836, 17613, 3058, 17040, 47575, 31947, 54218, 35554, 29068, 46250, 39765, 53806, 2416, 60457, 41773, 6729, 49450, 9282, 27495, 8790, 39180, 23433, 12428, 26023, 21196}, ViewConfiguration.getEdgeSlop() >> 16, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onExtraCallbackWithResult + 1;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return obj;
            }
            geckoHubImp1OnExtraCallback = (GeckoHubImp1) this.L$1;
            ResultKt.onNavigationEvent(obj);
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback);
            this.label = 2;
            Object objIAuthTabCallback = geckoHubImp1OnExtraCallback.IAuthTabCallback(this);
            return objIAuthTabCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objIAuthTabCallback;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $10 + 75;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onNavigationEvent);
                tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
                int i5 = $11 + 9;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        if (r0 != r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d3, code lost:
    
        if (r4.onExtraCallback(r5, r24) == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d5, code lost:
    
        r0 = im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$5.asBinder + 107;
        im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$5.asInterface = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01de, code lost:
    
        if ((r0 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e0, code lost:
    
        r0 = 42 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordViewModel$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, IAuthTabCallback);
        boolean z = iO == -1;
        if (z) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            byte[] bArr = onWarmupCompleted;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr[i7]);
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                iO = (byte) (((byte) (onWarmupCompleted[getBooleanFromAdObject.onWarmupCompleted.o(i, onExtraCallback)] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                int i8 = $10 + 75;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } else {
                iO = (short) (((short) (onNavigationEvent[((int) (onExtraCallback ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
            }
        }
        if (iO > 0) {
            int i10 = ((i + iO) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
            if (z) {
                i4 = 1;
            } else {
                int i11 = $10 + 81;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i4 = 0;
            }
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i10 + i4;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, onExtraCallbackWithResult, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr3 = onWarmupCompleted;
            if (bArr3 != null) {
                int i13 = $10 + 119;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i15 = 0; i15 < length2; i15++) {
                    bArr4[i15] = (byte) (bArr3[i15] ^ (-4629411779493505016L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                if (z2) {
                    byte[] bArr5 = onWarmupCompleted;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr5[r5] ^ (-4629411779493505016L))) + s)) ^ b));
                } else {
                    short[] sArr = onNavigationEvent;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r5] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        objArr[0] = sb.toString();
    }
}
