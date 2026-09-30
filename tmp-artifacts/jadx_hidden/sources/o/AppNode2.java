package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode61;
import o.makePFX_WINS;
import o.s3c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AppNode2 implements destroy {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static char IAuthTabCallback = 0;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 1;
    private static char asInterface;
    public static final int onExtraCallback;
    private static final String onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    private final Context onExtraCallbackWithResult;

    static final class onExtraCallback extends ContinuationImpl {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallback.class);
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4906);
            int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 4) & 1;
            Object obj2 = null;
            this.result = obj;
            int i4 = this.label;
            if (i3 != 0) {
                int i5 = (Integer.MAX_VALUE & i4) | ((~i4) & Integer.MIN_VALUE);
                int i6 = i4 & Integer.MIN_VALUE;
                this.label = (i6 & i5) | (i5 ^ i6);
                obj2.hashCode();
                throw null;
            }
            this.label = (i4 & Integer.MIN_VALUE) | (i4 ^ Integer.MIN_VALUE);
            int i7 = onNavigationEvent;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4901);
            if ((((((~i7) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i7)) >> 28) & 1) != 0) {
                return AppNode2.onExtraCallback(AppNode2.this, null, null, this);
            }
            int i8 = 16 / 0;
            return AppNode2.onExtraCallback(AppNode2.this, null, null, this);
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            AppNode2 appNode2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
            int i3 = i2 & iOnWarmupCompleted;
            int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 27) & 1;
            this.result = obj;
            int i5 = this.label;
            if (i4 == 0) {
                int i6 = 78 / 0;
            }
            int i7 = onWarmupCompleted;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
            if (((((i7 | iOnWarmupCompleted2) & (~(i7 & iOnWarmupCompleted2))) >> 12) & 1) != 0) {
                this.label = (i5 & Integer.MIN_VALUE) | (i5 & Integer.MAX_VALUE) | ((~i5) & Integer.MIN_VALUE);
                appNode2 = AppNode2.this;
                int i8 = 51 / 0;
            } else {
                this.label = (i5 & Integer.MIN_VALUE) | (i5 & Integer.MAX_VALUE) | ((~i5) & Integer.MIN_VALUE);
                appNode2 = AppNode2.this;
            }
            Object objOnExtraCallback = appNode2.onExtraCallback(null, null, this);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
            return objOnExtraCallback;
        }
    }

    public AppNode2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = context;
    }

    public static final /* synthetic */ Object onExtraCallback(AppNode2 appNode2, getExtensionManager getextensionmanager, Map map, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return appNode2.onExtraCallbackWithResult(getextensionmanager, map, access13800Var);
        }
        appNode2.onExtraCallbackWithResult(getextensionmanager, map, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    @Override // o.destroy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull o.getExtensionManager r22, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r23, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AppNode2.onExtraCallback(o.getExtensionManager, java.util.Map, o.access13800):java.lang.Object");
    }

    public static final class onExtraCallbackWithResult implements getMsgHandler {
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallbackWithResult.class);
        private final Map<String, List<String>> onExtraCallback;
        private final Activity onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Activity activity, Map<String, ? extends List<String>> map) {
            this.onWarmupCompleted = activity;
            this.onExtraCallback = map;
        }

        @Override // o.getMsgHandler
        public /* bridge */ Context onExtraCallback() {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3656);
            Context contextOnExtraCallback = super.onExtraCallback();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2265);
            return contextOnExtraCallback;
        }

        @Override // o.getMsgHandler
        public Activity IAuthTabCallback() {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2665);
            Activity activity = this.onWarmupCompleted;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1235);
            if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 28) & 1) == 0) {
                return activity;
            }
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012a, code lost:
    
        if (((o.getAppType) r5).onNavigationEvent(r13, r1) != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a0, code lost:
    
        if (r6.invoke(r13, r7, r1) != r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(o.getExtensionManager r11, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r12, o.access13800<? super kotlin.Unit> r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AppNode2.onExtraCallbackWithResult(o.getExtensionManager, java.util.Map, o.access13800):java.lang.Object");
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = -1776194565;
        private static int onExtraCallbackWithResult = 1;
        private static char onNavigationEvent = 27643;
        private static long onWarmupCompleted = 2742337734462446489L;
        final /* synthetic */ getOriginalStartParams $action;
        final /* synthetic */ onExtraCallbackWithResult $host;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(getOriginalStartParams getoriginalstartparams, onExtraCallbackWithResult onextracallbackwithresult, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$action = getoriginalstartparams;
            this.$host = onextracallbackwithresult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$action, this.$host, access13800Var);
            int i2 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Boolean> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 27 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) - 1279019985, new char[]{46679, 49814, 11734, 14347, 1322, 52664, 7212, 2743, 34542, 41445, 59452, 62378, 54348, 64477, 'G', 29757, 18684, 28055, 39071, 20244, 47452, 53971, 44279, 30530, 55021, 56363, 1715, 17654, 19232, 11556, 60470, 14738, 58802, 39398, 5945, 8240, 38969, 42718, 1378, 15734, 22688, 45372, 8155, 11343, 48027, 1562, 62763}, new char[]{61538, 17129, 45461, 18996}, new char[]{12078, 50100, 31411, 5145}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i4 = i3 + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            Function1<Context, Boolean> function1OnWarmupCompleted = ((getPageByNodeId) this.$action).onWarmupCompleted();
            Context applicationContext = this.$host.onExtraCallback().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            if (i5 != 0) {
                return function1OnWarmupCompleted.invoke(applicationContext);
            }
            function1OnWarmupCompleted.invoke(applicationContext);
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $10 + 55;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
                int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
                makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
                cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
                cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $11 + 93;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            }
            String str = new String(cArr6);
            int i7 = $11 + 113;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    static {
        onExtraCallbackWithResult();
        Companion = new onWarmupCompleted(null);
        onExtraCallback = 8;
        onNavigationEvent = AppNode2.class.getSimpleName();
        int i = onTransact + 13;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i3 = $11 + 105;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 121;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            for (int i8 = 0; i8 < 16; i8++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char C = AppNode5.C(c, (c2 + i7) ^ ((c2 << 4) + ((char) (asInterface ^ 1094535280733222934L))), c2 >>> 5, IAuthTabCallbackDefault);
                cArr3[1] = C;
                cArr3[0] = AppNode5.C(cArr3[0], (C + i7) ^ ((C << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L))), C >>> 5, onWarmupCompleted);
                i7 -= 40503;
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = (char) 58965;
        onWarmupCompleted = (char) 45097;
        asInterface = (char) 21472;
        IAuthTabCallbackDefault = (char) 3527;
    }
}
