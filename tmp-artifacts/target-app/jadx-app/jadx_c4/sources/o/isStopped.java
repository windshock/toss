package o;

import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.underlay.ShimmerSweepLayout;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release;
import o.getPackageType;
import o.isStopped;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isStopped {
    private static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int access100;
    private final Function1<String, Unit> IAuthTabCallback;
    private final Function0<Integer> IAuthTabCallbackDefault;
    private getPackageType IAuthTabCallbackStub;
    private final findResAndMsg asBinder;
    private final Function0<Window> asInterface;
    private final Function0<setDurationInForeground> onExtraCallback;
    private final Function0<AppWithState> onExtraCallbackWithResult;
    private AppWithState onNavigationEvent;
    private final Function0<View> onTransact;
    private final Function0<Boolean> onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            isStopped isstopped = isStopped.this;
            if (i3 == 0) {
                isStopped.onNavigationEvent(isstopped, (access13800) this);
                obj2.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = isStopped.onNavigationEvent(isstopped, (access13800) this);
            int i4 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            isStopped isstopped = isStopped.this;
            if (i3 == 0) {
                return isStopped.onExtraCallback(isstopped, (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) null, (access13800) this);
            }
            isStopped.onExtraCallback(isstopped, (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) null, (access13800) this);
            obj2.hashCode();
            throw null;
        }
    }

    static final class asBinder extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = isStopped.IAuthTabCallback(isStopped.this, null, this);
            if (i3 != 0) {
                int i4 = 75 / 0;
            }
            int i5 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objIAuthTabCallback;
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onNavigationEvent.values().length];
            try {
                iArr[findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onNavigationEvent.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onNavigationEvent.SCANNING.ordinal()] = 2;
                int i = onExtraCallback + 35;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onNavigationEvent.RESULT.ordinal()] = 3;
                int i3 = IAuthTabCallback + 87;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    static {
        int i = IAuthTabCallbackStubProxy + 5;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(isStopped isstopped, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, View view) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(isstopped, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, view);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(isstopped, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, view);
        int i3 = access000 + 59;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        isStopped isstopped = (isStopped) objArr[0];
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 39;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(isstopped, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(isstopped, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release);
        int i3 = access000 + 87;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(isStopped isstopped, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, View view) {
        int i = 2 % 2;
        int i2 = access100 + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(isstopped, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, view);
        int i4 = access100 + 45;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i3 | i)) | (~(i5 | i));
        int i10 = ~i5;
        int i11 = (~(i10 | i)) | i3;
        int i12 = (~(i | i3 | i5)) | (~(i8 | i10));
        int i13 = i3 + i5 + i6 + ((-373584967) * i4) + ((-1711780345) * i2);
        int i14 = i13 * i13;
        int i15 = (i3 * 1075882953) + 1902575616 + (1075882953 * i5) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i6) + ((-375259136) * i4) + ((-1109524480) * i2) + (585564160 * i14);
        int i16 = ((i3 * 235012993) - 778813113) + (i5 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i6 * 235013625) + (i4 * 915899377) + (i2 * (-1709701169)) + (i14 * 1974403072);
        int i17 = i15 + (i16 * i16 * (-848756736));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public isStopped(@NotNull findResAndMsg findresandmsg, @NotNull Function0<AppWithState> function0, @NotNull Function0<? extends Window> function02, @NotNull Function0<? extends View> function03, @NotNull Function0<Boolean> function04, @NotNull Function0<Integer> function05, @NotNull Function0<? extends setDurationInForeground> function06, @NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        Intrinsics.checkNotNullParameter(function06, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.asBinder = findresandmsg;
        this.onExtraCallbackWithResult = function0;
        this.asInterface = function02;
        this.onTransact = function03;
        this.onWarmupCompleted = function04;
        this.IAuthTabCallbackDefault = function05;
        this.onExtraCallback = function06;
        this.IAuthTabCallback = function1;
    }

    public static final /* synthetic */ Object IAuthTabCallback(isStopped isstopped, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            isstopped.onExtraCallback(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = isstopped.onExtraCallback(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, access13800Var);
        int i3 = access100 + 39;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return objOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        isStopped isstopped = (isStopped) objArr[0];
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access000 + 77;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            isstopped.onNavigationEvent(view, iIntValue);
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = isstopped.onNavigationEvent(view, iIntValue);
        int i3 = access000 + 115;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zOnNavigationEvent);
        }
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallback(isStopped isstopped, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access000 + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = isstopped.IAuthTabCallback(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, access13800Var);
        int i4 = access000 + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onNavigationEvent(isStopped isstopped, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access000 + 77;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return isstopped.onWarmupCompleted((access13800<? super Boolean>) access13800Var);
        }
        isstopped.onWarmupCompleted((access13800<? super Boolean>) access13800Var);
        throw null;
    }

    public static final /* synthetic */ boolean onNavigationEvent(isStopped isstopped, WindowInsetsCompat windowInsetsCompat, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 65;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnWarmupCompleted = isstopped.onWarmupCompleted(windowInsetsCompat, i);
        int i5 = access100 + 15;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return zOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        isStopped isstopped = (isStopped) objArr[0];
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, "");
        getPackageType getpackagetype = isstopped.IAuthTabCallbackStub;
        if (getpackagetype != null) {
            int i2 = access100 + 49;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            int i4 = access100 + 123;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        isstopped.IAuthTabCallbackStub = maybeUpdateAnimatable.onNavigationEvent(isstopped.asBinder, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, isstopped, null), 3, (Object) null);
        return null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release $request;
        int label;
        final /* synthetic */ isStopped this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, isStopped isstopped, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$request = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release;
            this.this$0 = isstopped;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$request, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        
            if (o.isStopped.onExtraCallback(r10, r0, (o.access13800) r9) == r1) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                long jIAuthTabCallback = setCommandLine.IAuthTabCallback(RangesKt.coerceAtLeast(this.$request.onExtraCallbackWithResult(), 0L), setRevision.MILLISECONDS);
                this.label = 1;
                if (formatMsgs.IAuthTabCallback(jIAuthTabCallback, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i4 != 1) {
                int i5 = onNavigationEvent + 39;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 2 : i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                if (((Boolean) obj).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    int i6 = IAuthTabCallback + 17;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
                isStopped isstopped = this.this$0;
                findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = this.$request;
                this.label = 3;
            } else {
                ResultKt.onNavigationEvent(obj);
            }
            isStopped isstopped2 = this.this$0;
            findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2 = this.$request;
            this.label = 2;
            obj = isStopped.IAuthTabCallback(isstopped2, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2, this);
            if (obj != objOnWarmupCompleted) {
                if (((Boolean) obj).booleanValue()) {
                }
            }
            return objOnWarmupCompleted;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = this.IAuthTabCallbackStub;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.IAuthTabCallbackStub = null;
        AppWithState appWithState = this.onNavigationEvent;
        if (appWithState != null) {
            AppWithState.onExtraCallback(496110628, -496110618, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState, null}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            int i4 = access000 + 9;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, access13800<? super Unit> access13800Var) {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2;
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release3;
        int i = 2 % 2;
        int i2 = access000 + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallbackStub) {
            iAuthTabCallbackStub = (IAuthTabCallbackStub) access13800Var;
            int i4 = iAuthTabCallbackStub.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = access000 + 7;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                iAuthTabCallbackStub.label = i4 - 2147483648;
            } else {
                iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var);
            }
        }
        Object obj = iAuthTabCallbackStub.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iAuthTabCallbackStub.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (((findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onNavigationEvent) findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 654638806, -654638804)) != findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onNavigationEvent.SCANNING) {
                int i8 = access000 + 93;
                access100 = i8 % 128;
                if (i8 % 2 == 0) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_releaseAsBinder = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asBinder();
            if (findexitinfobysessionidbugsnag_plugin_android_exitinfo_releaseAsBinder == null) {
                return Unit.INSTANCE;
            }
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            long jIAuthTabCallback = setCommandLine.IAuthTabCallback(RangesKt.coerceAtLeast(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.access100(), 0L), setRevision.MILLISECONDS);
            iAuthTabCallbackStub.L$0 = access15400.onNavigationEvent(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release);
            iAuthTabCallbackStub.L$1 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_releaseAsBinder;
            iAuthTabCallbackStub.label = 1;
            if (formatMsgs.IAuthTabCallback(jIAuthTabCallback, iAuthTabCallbackStub) == objOnWarmupCompleted) {
                int i9 = access000 + 89;
                access100 = i9 % 128;
                int i10 = i9 % 2;
                return objOnWarmupCompleted;
            }
            int i11 = access100 + 77;
            access000 = i11 % 128;
            int i12 = i11 % 2;
            findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_releaseAsBinder;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = access100 + 99;
            access000 = i13 % 128;
            if (i13 % 2 == 0) {
                findexitinfobysessionidbugsnag_plugin_android_exitinfo_release3 = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) iAuthTabCallbackStub.L$1;
                ResultKt.onNavigationEvent(obj);
                int i14 = 53 / 0;
            } else {
                findexitinfobysessionidbugsnag_plugin_android_exitinfo_release3 = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) iAuthTabCallbackStub.L$1;
                ResultKt.onNavigationEvent(obj);
            }
            findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release3;
        }
        onNavigationEvent(this, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2, false, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, access13800<? super Boolean> access13800Var) {
        asBinder asbinder;
        AppWithState appWithState;
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        if (access13800Var instanceof asBinder) {
            asbinder = (asBinder) access13800Var;
            int i2 = asbinder.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asbinder.label = i2 - 2147483648;
            } else {
                asbinder = new asBinder(access13800Var);
            }
        }
        Object obj = asbinder.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i3 = asbinder.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (!((Boolean) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, 1077137453, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1077137451, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue()) {
                int i4 = access000 + 65;
                access100 = i4 % 128;
                return i4 % 2 != 0 ? access14000.onNavigationEvent(true) : access14000.onNavigationEvent(false);
            }
            appWithState = (AppWithState) this.onExtraCallbackWithResult.invoke();
            if (appWithState != null && appWithState.onExtraCallbackWithResult()) {
                asbinder.L$0 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release;
                asbinder.L$1 = appWithState;
                asbinder.label = 1;
                objOnWarmupCompleted = onWarmupCompleted((access13800<? super Boolean>) asbinder);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    int i5 = access000 + 117;
                    access100 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 97 / 0;
                    }
                    return objOnWarmupCompleted2;
                }
            }
            return access14000.onNavigationEvent(false);
        }
        int i7 = access000 + 57;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AppWithState appWithState2 = (AppWithState) asbinder.L$1;
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2 = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) asbinder.L$0;
        ResultKt.onNavigationEvent(obj);
        objOnWarmupCompleted = obj;
        appWithState = appWithState2;
        findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2;
        if (!((Boolean) objOnWarmupCompleted).booleanValue()) {
            return access14000.onNavigationEvent(false);
        }
        getFullPackage.IAuthTabCallback(asbinder.getContext());
        if (((Boolean) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, 1077137453, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1077137451, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue() && appWithState.onExtraCallbackWithResult()) {
            return access14000.onNavigationEvent(onExtraCallback(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, true, appWithState));
        }
        return access14000.onNavigationEvent(false);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ int $imeType;
        final /* synthetic */ View $rootView;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ isStopped this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(View view, isStopped isstopped, int i, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$rootView = view;
            this.this$0 = isstopped;
            this.$imeType = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$rootView, this.this$0, this.$imeType, access13800Var);
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 34 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Boolean> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Path cross not found for [B:41:0x00fc, B:23:0x006a], limit reached: 52 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0115 -> B:8:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                i = 0;
                i2 = 1;
                if (getFullPackage.onExtraCallbackWithResult(getContext())) {
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = this.I$1;
                int i7 = this.I$0;
                ResultKt.onNavigationEvent(obj);
                int i8 = i7;
                i = i6;
                i2 = i8;
                int i9 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                if (getFullPackage.onExtraCallbackWithResult(getContext())) {
                    int i11 = onExtraCallbackWithResult + 19;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        this.$rootView.isAttachedToWindow();
                        throw null;
                    }
                    if (this.$rootView.isAttachedToWindow()) {
                        if (i2 != 0) {
                            ViewCompat.extraCommand(this.$rootView);
                            i2 = 0;
                        }
                        WindowInsetsCompat windowInsetsCompatICustomTabsCallback = ViewCompat.ICustomTabsCallback(this.$rootView);
                        if (windowInsetsCompatICustomTabsCallback != null) {
                            if (isStopped.onNavigationEvent(this.this$0, windowInsetsCompatICustomTabsCallback, this.$imeType)) {
                                int i12 = IAuthTabCallback + 47;
                                onExtraCallbackWithResult = i12 % 128;
                                return i12 % 2 == 0 ? access14000.onNavigationEvent(true) : access14000.onNavigationEvent(true);
                            }
                            if (i == 0) {
                                int i13 = IAuthTabCallback + 121;
                                onExtraCallbackWithResult = i13 % 128;
                                if (i13 % 2 == 0) {
                                    ((Boolean) isStopped.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this.this$0, this.$rootView, Integer.valueOf(this.$imeType)}, 1777274653, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1777274653, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue();
                                    throw null;
                                }
                                if (!((Boolean) isStopped.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this.this$0, this.$rootView, Integer.valueOf(this.$imeType)}, 1777274653, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1777274653, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue()) {
                                    return access14000.onNavigationEvent(false);
                                }
                                i7 = i2;
                                i6 = 1;
                            }
                        }
                        int i14 = i;
                        i7 = i2;
                        i6 = i14;
                    } else {
                        i6 = i;
                        i7 = 1;
                    }
                    setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                    long jIAuthTabCallback = setCommandLine.IAuthTabCallback(16L, setRevision.MILLISECONDS);
                    this.I$0 = i7;
                    this.I$1 = i6;
                    this.label = 1;
                    if (formatMsgs.IAuthTabCallback(jIAuthTabCallback, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    int i82 = i7;
                    i = i6;
                    i2 = i82;
                    int i92 = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i92 % 128;
                    int i102 = i92 % 2;
                    if (getFullPackage.onExtraCallbackWithResult(getContext())) {
                        getFullPackage.IAuthTabCallback(getContext());
                        return access14000.onNavigationEvent(false);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(access13800<? super Boolean> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = access000 + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (!(access13800Var instanceof IAuthTabCallback)) {
            iAuthTabCallback = new IAuthTabCallback(access13800Var);
        } else {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            }
        }
        Object objIAuthTabCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 != 0) {
            int i6 = access100 + 105;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        } else {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            View view = (View) this.onTransact.invoke();
            if (view == null) {
                return access14000.onNavigationEvent(false);
            }
            int iIAuthTabCallback = WindowInsetsCompat.onTransact.IAuthTabCallback();
            setLogBuffers.IAuthTabCallback iAuthTabCallback2 = setLogBuffers.Companion;
            long jIAuthTabCallback = setCommandLine.IAuthTabCallback(1000L, setRevision.MILLISECONDS);
            onExtraCallback onextracallback = new onExtraCallback(view, this, iIAuthTabCallback, null);
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(view);
            iAuthTabCallback.I$0 = iIAuthTabCallback;
            iAuthTabCallback.label = 1;
            objIAuthTabCallback = doGet.IAuthTabCallback(jIAuthTabCallback, onextracallback, iAuthTabCallback);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        Boolean bool = (Boolean) objIAuthTabCallback;
        return access14000.onNavigationEvent(bool != null ? bool.booleanValue() : false);
    }

    private final boolean onNavigationEvent(View view, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 5;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        try {
            RepeatableSpec.onExtraCallback((Window) this.asInterface.invoke(), view).onExtraCallback(i);
            int i5 = access000 + 107;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
            }
            return true;
        } catch (CancellationException e) {
            throw e;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    private final boolean onWarmupCompleted(WindowInsetsCompat windowInsetsCompat, int i) {
        int i2 = 2 % 2;
        if (windowInsetsCompat.IAuthTabCallback(i)) {
            return false;
        }
        int i3 = access100 + 107;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if (windowInsetsCompat.onWarmupCompleted(i).onExtraCallback != 0) {
            return false;
        }
        int i5 = access000 + 107;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        isStopped isstopped = (isStopped) objArr[0];
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (StringsKt.isBlank(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asInterface()) || !((Boolean) isstopped.onWarmupCompleted.invoke()).booleanValue()) {
            return false;
        }
        int i4 = access000 + 63;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    static /* synthetic */ boolean onNavigationEvent(isStopped isstopped, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, boolean z, AppWithState appWithState, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access000 + 103;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 3;
            access000 = i6 % 128;
            appWithState = null;
            if (i6 % 2 == 0) {
                appWithState.hashCode();
                throw null;
            }
        }
        return isstopped.onExtraCallback(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, z, appWithState);
    }

    private static final Unit onWarmupCompleted(isStopped isstopped, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release) {
        int i = 2 % 2;
        int i2 = access000 + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        if (((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{isstopped, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, 1077137453, iOnExtraCallbackWithResult3, -1077137451, iOnExtraCallbackWithResult2)).booleanValue()) {
            int i4 = access000 + 11;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            ((setDurationInForeground) isstopped.onExtraCallback.invoke()).IAuthTabCallback(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean onExtraCallback(final findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, boolean z, AppWithState appWithState) throws NoWhenBranchMatchedException {
        AppWithState appWithState2;
        int iIntValue;
        int i = 2 % 2;
        int i2 = access100 + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (!((Boolean) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, 1077137453, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1077137451, TossSecMainViewModel.asInterface.onExtraCallbackWithResult())).booleanValue()) {
            return false;
        }
        if (appWithState == null) {
            int i4 = access100 + 101;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            appWithState2 = (AppWithState) this.onExtraCallbackWithResult.invoke();
            if (appWithState2 == null) {
                return false;
            }
        } else {
            appWithState2 = appWithState;
        }
        if (!appWithState2.onExtraCallbackWithResult()) {
            int i6 = access100 + 115;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        this.onNavigationEvent = appWithState2;
        appWithState2.onExtraCallback();
        appWithState2.onExtraCallback(onExtraCallback(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release));
        AppWithState.onExtraCallback(496110628, -496110618, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState2, new Function0() { // from class: im.toss.base.underlay.UnderlayStageController$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 7;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    Object[] objArr = {this.f$0, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release};
                    int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    throw null;
                }
                Object[] objArr2 = {this.f$0, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release};
                int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                Unit unit = (Unit) isStopped.onWarmupCompleted(iOnExtraCallbackWithResult3, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr2, -1763890671, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1763890674, iOnExtraCallbackWithResult4);
                int i10 = onNavigationEvent + 59;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return unit;
            }
        }}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i8 = onNavigationEvent.onWarmupCompleted[((findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onNavigationEvent) findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 654638806, -654638804)).ordinal()];
        if (i8 != 1) {
            int i9 = access100 + 21;
            access000 = i9 % 128;
            if (i9 % 2 != 0 ? i8 == 2 : i8 == 3) {
                String strAsInterface = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asInterface();
                String str = (String) findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1935623066, 1935623066);
                Integer numIAuthTabCallbackDefault = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackDefault();
                if (numIAuthTabCallbackDefault != null) {
                    int i10 = access100 + 77;
                    access000 = i10 % 128;
                    int i11 = i10 % 2;
                    iIntValue = numIAuthTabCallbackDefault.intValue();
                } else {
                    iIntValue = ((Number) this.IAuthTabCallbackDefault.invoke()).intValue();
                }
                AppWithState.onExtraCallback(-1500151596, 1500151616, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState2, strAsInterface, str, Integer.valueOf(iIntValue)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
                ShimmerSweepLayout shimmerSweepLayoutOnWarmupCompleted = appWithState2.onWarmupCompleted();
                if (shimmerSweepLayoutOnWarmupCompleted != null) {
                    shimmerSweepLayoutOnWarmupCompleted.IAuthTabCallbackStub();
                }
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ShimmerSweepLayout shimmerSweepLayoutOnWarmupCompleted2 = appWithState2.onWarmupCompleted();
                if (shimmerSweepLayoutOnWarmupCompleted2 != null) {
                    int i12 = access100 + 81;
                    access000 = i12 % 128;
                    int i13 = i12 % 2;
                    shimmerSweepLayoutOnWarmupCompleted2.IAuthTabCallbackDefault();
                    int i14 = access000 + 35;
                    access100 = i14 % 128;
                    int i15 = i14 % 2;
                }
                String strAsInterface2 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asInterface();
                String str2 = (String) findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1935623066, 1935623066);
                Integer numIAuthTabCallbackDefault2 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackDefault();
                AppWithState.onExtraCallback(-1500151596, 1500151616, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState2, strAsInterface2, str2, Integer.valueOf(numIAuthTabCallbackDefault2 != null ? numIAuthTabCallbackDefault2.intValue() : ((Number) this.IAuthTabCallbackDefault.invoke()).intValue())}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
            }
        } else {
            ShimmerSweepLayout shimmerSweepLayoutOnWarmupCompleted3 = appWithState2.onWarmupCompleted();
            if (shimmerSweepLayoutOnWarmupCompleted3 != null) {
                int i16 = access100 + 83;
                access000 = i16 % 128;
                if (i16 % 2 == 0) {
                    shimmerSweepLayoutOnWarmupCompleted3.IAuthTabCallbackDefault();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                shimmerSweepLayoutOnWarmupCompleted3.IAuthTabCallbackDefault();
            }
            String strAsInterface3 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asInterface();
            String str3 = (String) findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1935623066, 1935623066);
            Integer numIAuthTabCallbackDefault3 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackDefault();
            AppWithState.onExtraCallback(-1500151596, 1500151616, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{appWithState2, strAsInterface3, str3, Integer.valueOf(numIAuthTabCallbackDefault3 != null ? numIAuthTabCallbackDefault3.intValue() : ((Number) this.IAuthTabCallbackDefault.invoke()).intValue())}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted());
        }
        if (z) {
            appWithState2.IAuthTabCallbackDefault();
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        if (r1 == 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (r1 == 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if (r1 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        return new im.toss.base.underlay.UnderlayStageController$$ExternalSyntheticLambda1(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        return new im.toss.base.underlay.UnderlayStageController$$ExternalSyntheticLambda0(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0062, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        r2 = o.isStopped.access100 + 39;
        o.isStopped.access000 = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Function1<View, Unit> onExtraCallback(final findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = access000 + 69;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            i = onNavigationEvent.onWarmupCompleted[((findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onNavigationEvent) findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 654638806, -654638804)).ordinal()];
        } else {
            int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            i = onNavigationEvent.onWarmupCompleted[((findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onNavigationEvent) findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 654638806, -654638804)).ordinal()];
        }
    }

    private static final Unit onExtraCallback(isStopped isstopped, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, View view) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            ((setDurationInForeground) isstopped.onExtraCallback.invoke()).onExtraCallbackWithResult(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release);
            findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        ((setDurationInForeground) isstopped.onExtraCallback.invoke()).onExtraCallbackWithResult(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release);
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_releaseAsBinder = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asBinder();
        if (findexitinfobysessionidbugsnag_plugin_android_exitinfo_releaseAsBinder != null) {
            isstopped.onWarmupCompleted(findexitinfobysessionidbugsnag_plugin_android_exitinfo_releaseAsBinder);
            int i3 = access000 + 123;
            access100 = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = access000 + 63;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r4
      0x003d: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(isStopped isstopped, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, View view) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = access000 + 27;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            ((setDurationInForeground) isstopped.onExtraCallback.invoke()).onExtraCallbackWithResult(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release);
            strIAuthTabCallback = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallback();
            int i3 = 21 / 0;
            if (strIAuthTabCallback != null) {
                if (StringsKt.isBlank(strIAuthTabCallback)) {
                    int i4 = access100 + 91;
                    access000 = i4 % 128;
                    Object obj = null;
                    if (i4 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    strIAuthTabCallback = null;
                }
                if (strIAuthTabCallback != null) {
                    isstopped.IAuthTabCallback.invoke(strIAuthTabCallback);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            ((setDurationInForeground) isstopped.onExtraCallback.invoke()).onExtraCallbackWithResult(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release);
            strIAuthTabCallback = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallback();
            if (strIAuthTabCallback != null) {
            }
        }
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 55;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = this.IAuthTabCallbackStub;
        if (getpackagetype != null) {
            int i5 = i2 + 117;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
            } else {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        this.IAuthTabCallbackStub = maybeUpdateAnimatable.onNavigationEvent(this.asBinder, (CoroutineContext) null, (setRandomHost) null, new onTransact(findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, null), 3, (Object) null);
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$request = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = isStopped.this.new onTransact(this.$request, access13800Var);
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return ontransactCreate.invokeSuspend(unit);
            }
            ontransactCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                isStopped.onNavigationEvent(isStopped.this, this.$request, false, null, 4, null);
                isStopped isstopped = isStopped.this;
                findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = this.$request;
                this.label = 1;
                if (isStopped.onExtraCallback(isstopped, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, (access13800) this) == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 81;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onWarmupCompleted + 55;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(isStopped isstopped, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{isstopped, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, -1763890671, iOnExtraCallbackWithResult3, 1763890674, iOnExtraCallbackWithResult2);
    }

    public static final /* synthetic */ boolean onNavigationEvent(isStopped isstopped, View view, int i) {
        Object[] objArr = {isstopped, view, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, 1777274653, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1777274653, iOnExtraCallbackWithResult2)).booleanValue();
    }

    private final boolean IAuthTabCallback(findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, 1077137453, iOnExtraCallbackWithResult3, -1077137451, iOnExtraCallbackWithResult2)).booleanValue();
    }

    public final void onNavigationEvent(@NotNull findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release}, -134909464, iOnExtraCallbackWithResult3, 134909465, iOnExtraCallbackWithResult2);
    }
}
