package im.toss.feature.credit.ui.main.home;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import im.toss.feature.credit.ui.main.home.RouteType;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DLog;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.Rmipmap;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.formatMsgs;
import o.getPreRenderJob;
import o.h5ScreenShotObserverOnChangeOpt;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditDualViewModel extends ViewModel {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static char[] asInterface = {27185, 27321, 27321, 27312, 27321, 27327, 27327, 27321};
    private boolean IAuthTabCallback;
    private final Rmipmap<onNavigationEvent> onExtraCallback;
    private final DLog onExtraCallbackWithResult;
    private final TextLinkScopeExternalSyntheticLambda7 onNavigationEvent;
    private final Rmipmap<onExtraCallbackWithResult> onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = (~(i7 | i8 | i5)) | (~(i6 | i | i5));
        int i10 = ~i5;
        int i11 = (~(i8 | i6)) | (~(i8 | i10));
        int i12 = (~(i5 | i)) | (~(i7 | i10));
        int i13 = i6 + i + i3 + ((-564018846) * i2) + (483938512 * i4);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i6) + 752877568 + ((-1516524009) * i) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i3) + (1390411776 * i2) + (452984832 * i4) + ((-1135738880) * i14);
        int i16 = ((i6 * 1456092922) - 824780772) + (i * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i3 * 1456093799) + (i2 * 578355822) + (i4 * 1098359728) + (i14 * 1868693504);
        int i17 = i15 + (i16 * i16 * 2110914560);
        return i17 != 1 ? i17 != 2 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    @Inject
    public CreditDualViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull DLog dLog) {
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(dLog, "");
        this.onNavigationEvent = textLinkScopeExternalSyntheticLambda7;
        this.onExtraCallbackWithResult = dLog;
        this.onWarmupCompleted = new Rmipmap<>();
        this.onExtraCallback = new Rmipmap<>();
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(null), 3, (Object) null);
    }

    public static final /* synthetic */ TextLinkScopeExternalSyntheticLambda7 IAuthTabCallback(CreditDualViewModel creditDualViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = creditDualViewModel.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return textLinkScopeExternalSyntheticLambda7;
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditDualViewModel creditDualViewModel, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 45;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        creditDualViewModel.IAuthTabCallback = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 23;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(CreditDualViewModel creditDualViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 25;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = creditDualViewModel.IAuthTabCallback;
        int i5 = i2 + 47;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(CreditDualViewModel creditDualViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            return IAuthTabCallback(72124850, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{creditDualViewModel, access13800Var}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -72124848);
        }
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        IAuthTabCallback(72124850, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback4, new Object[]{creditDualViewModel, access13800Var}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback3, -72124848);
        throw null;
    }

    public static final /* synthetic */ boolean onNavigationEvent(CreditDualViewModel creditDualViewModel, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = creditDualViewModel.onExtraCallbackWithResult(str);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditDualViewModel creditDualViewModel = (CreditDualViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Rmipmap<onExtraCallbackWithResult> rmipmap = creditDualViewModel.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return rmipmap;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.onWarmupCompleted.getValue(), onExtraCallbackWithResult.C0010onExtraCallbackWithResult.onWarmupCompleted);
        int i4 = IAuthTabCallbackStub + 67;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zAreEqual;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.onWarmupCompleted.getValue(), onExtraCallbackWithResult.onNavigationEvent.onWarmupCompleted);
        int i4 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public final Rmipmap<onNavigationEvent> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 107;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Rmipmap<onNavigationEvent> rmipmap = this.onExtraCallback;
        int i4 = i2 + 125;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return rmipmap;
        }
        throw null;
    }

    public final String onTransact() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = h5ScreenShotObserverOnChangeOpt.Companion.onExtraCallback(this.onNavigationEvent);
        int i4 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnExtraCallback;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull String str) throws Throwable {
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7;
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            textLinkScopeExternalSyntheticLambda7 = this.onNavigationEvent;
            Object[] objArr = new Object[1];
            a(new int[]{0, 8, 140, 0}, false, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            textLinkScopeExternalSyntheticLambda7 = this.onNavigationEvent;
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 8, 140, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr2);
            obj = objArr2[0];
        }
        textLinkScopeExternalSyntheticLambda7.onWarmupCompleted(((String) obj).intern(), str);
    }

    /* renamed from: im.toss.feature.credit.ui.main.home.CreditDualViewModel$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        int label;

        AnonymousClass4(access13800<? super AnonymousClass4> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 17;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass4 anonymousClass4 = CreditDualViewModel.this.new AnonymousClass4(access13800Var);
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return anonymousClass4;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            CreditDualViewModel creditDualViewModel;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                CreditDualViewModel creditDualViewModel2 = CreditDualViewModel.this;
                this.L$0 = creditDualViewModel2;
                this.label = 1;
                Object objOnNavigationEvent = CreditDualViewModel.onNavigationEvent(creditDualViewModel2, (access13800) this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    int i3 = onExtraCallbackWithResult + 47;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 25;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
                creditDualViewModel = creditDualViewModel2;
                obj = objOnNavigationEvent;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                creditDualViewModel = (CreditDualViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            CreditDualViewModel.IAuthTabCallback(creditDualViewModel, ((Boolean) obj).booleanValue());
            h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault iAuthTabCallbackDefault = h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback;
            Object[] objArr = {CreditDualViewModel.this, iAuthTabCallbackDefault.IAuthTabCallback(CreditDualViewModel.IAuthTabCallback(CreditDualViewModel.this)), RouteType.Init.onExtraCallback};
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            CreditDualViewModel.IAuthTabCallback(-564089911, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), objArr, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, 564089912);
            iAuthTabCallbackDefault.onExtraCallbackWithResult(CreditDualViewModel.IAuthTabCallback(CreditDualViewModel.this));
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditDualViewModel creditDualViewModel = (CreditDualViewModel) objArr[0];
        String str = (String) objArr[1];
        RouteType routeType = (RouteType) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(routeType, "");
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(creditDualViewModel), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(str, routeType, creditDualViewModel, null), 3, (Object) null);
        int i2 = IAuthTabCallbackDefault + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $redirectUrl;
        final /* synthetic */ RouteType $routeType;
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        final /* synthetic */ CreditDualViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, RouteType routeType, CreditDualViewModel creditDualViewModel, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$redirectUrl = str;
            this.$routeType = routeType;
            this.this$0 = creditDualViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$redirectUrl, this.$routeType, this.this$0, access13800Var);
            int i2 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 6 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = 70 / 0;
            } else {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            CreditDualViewModel creditDualViewModel;
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                boolean zOnExtraCallback = h5ScreenShotObserverOnChangeOpt.ICustomTabsCallbackDefault.IAuthTabCallback.onExtraCallback(this.$redirectUrl);
                String str2 = this.$redirectUrl;
                if (str2 != null) {
                    str = CreditDualViewModel.onNavigationEvent(this.this$0, str2) ? str2 : null;
                    if (str != null) {
                        creditDualViewModel = this.this$0;
                        this.L$0 = creditDualViewModel;
                        this.L$1 = str;
                        this.Z$0 = zOnExtraCallback;
                        this.I$0 = 0;
                        this.label = 1;
                        if (formatMsgs.onWarmupCompleted(500L, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                        str = str;
                    }
                }
                RouteType routeType = this.$routeType;
                if (Intrinsics.areEqual(routeType, RouteType.Init.onExtraCallback)) {
                    ((Rmipmap) CreditDualViewModel.IAuthTabCallback(846789094, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{this.this$0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -846789094)).setValue(onExtraCallbackWithResult.onExtraCallback.onNavigationEvent);
                } else {
                    if (!(routeType instanceof RouteType.OnNewIntent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (zOnExtraCallback) {
                        this.this$0.IAuthTabCallbackStub().setValue(new onNavigationEvent.IAuthTabCallback(((RouteType.OnNewIntent) this.$routeType).onExtraCallbackWithResult()));
                    }
                }
                return Unit.INSTANCE;
            }
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                str.hashCode();
                throw null;
            }
            str = (String) this.L$1;
            creditDualViewModel = (CreditDualViewModel) this.L$0;
            ResultKt.onNavigationEvent(obj);
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            ((Rmipmap) CreditDualViewModel.IAuthTabCallback(846789094, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), new Object[]{creditDualViewModel}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -846789094)).setValue(new onExtraCallbackWithResult.IAuthTabCallback(str));
            Unit unit = Unit.INSTANCE;
            int i6 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    private final boolean onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        boolean zOnExtraCallback = h5ScreenShotObserverOnChangeOpt.ICustomTabsCallbackDefault.IAuthTabCallback.onExtraCallback(str);
        if (StringsKt.isBlank(str)) {
            return false;
        }
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 55;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (zOnExtraCallback) {
            return false;
        }
        int i5 = i2 + 75;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditDualViewModel creditDualViewModel = (CreditDualViewModel) objArr[0];
        access13800<? super Boolean> access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        DLog dLog = creditDualViewModel.onExtraCallbackWithResult;
        if (i3 != 0) {
            return dLog.IAuthTabCallback(access13800Var);
        }
        dLog.IAuthTabCallback(access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
        int i2 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = CreditDualViewModel.this.new IAuthTabCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                CreditDualViewModel creditDualViewModel = CreditDualViewModel.this;
                this.label = 1;
                obj = CreditDualViewModel.onNavigationEvent(creditDualViewModel, (access13800) this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue != CreditDualViewModel.onExtraCallbackWithResult(CreditDualViewModel.this)) {
                CreditDualViewModel.this.IAuthTabCallbackStub().setValue(onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent);
                int i5 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            CreditDualViewModel.IAuthTabCallback(CreditDualViewModel.this, zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i2 = IAuthTabCallbackDefault + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = CreditDualViewModel.this.new onWarmupCompleted(access13800Var);
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            CreditDualViewModel creditDualViewModel;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 89;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 67;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                creditDualViewModel = (CreditDualViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                CreditDualViewModel creditDualViewModel2 = CreditDualViewModel.this;
                this.L$0 = creditDualViewModel2;
                this.label = 1;
                Object objOnNavigationEvent = CreditDualViewModel.onNavigationEvent(creditDualViewModel2, (access13800) this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                creditDualViewModel = creditDualViewModel2;
                obj = objOnNavigationEvent;
            }
            CreditDualViewModel.IAuthTabCallback(creditDualViewModel, ((Boolean) obj).booleanValue());
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 12 / 0;
            }
            return unit;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.setValue(onExtraCallbackWithResult.C0010onExtraCallbackWithResult.onWarmupCompleted);
        int i4 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.setValue(onExtraCallbackWithResult.onNavigationEvent.onWarmupCompleted);
        int i4 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }

    public static abstract class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onExtraCallback extends onExtraCallbackWithResult {
            private static int onExtraCallback = 0;
            public static final onExtraCallback onNavigationEvent = new onExtraCallback();
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 97;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 59 / 0;
                }
            }

            private onExtraCallback() {
                super(null);
            }
        }

        private onExtraCallbackWithResult() {
        }

        /* renamed from: im.toss.feature.credit.ui.main.home.CreditDualViewModel$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0010onExtraCallbackWithResult extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            public static final C0010onExtraCallbackWithResult onWarmupCompleted = new C0010onExtraCallbackWithResult();

            static {
                int i = onNavigationEvent + 19;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private C0010onExtraCallbackWithResult() {
                super(null);
            }
        }

        public static final class asInterface extends onExtraCallbackWithResult {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            private final Throwable onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 9;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(obj instanceof asInterface)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.onWarmupCompleted, ((asInterface) obj).onWarmupCompleted)) {
                    return true;
                }
                int i7 = onNavigationEvent;
                int i8 = i7 + 107;
                onExtraCallback = i8 % 128;
                boolean z = true ^ (i8 % 2 != 0);
                int i9 = i7 + 81;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return z;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 7;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    this.onWarmupCompleted.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iHashCode = this.onWarmupCompleted.hashCode();
                int i3 = onExtraCallback + 19;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "ShowAlertOrToast(e=" + this.onWarmupCompleted + ")";
                int i2 = onExtraCallback + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public final Throwable IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 63;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onWarmupCompleted extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

            static {
                int i = onExtraCallback + 19;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private onWarmupCompleted() {
                super(null);
            }
        }

        public static final class IAuthTabCallback extends onExtraCallbackWithResult {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private final String IAuthTabCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 91;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                if (this != obj) {
                    return (obj instanceof IAuthTabCallback) && Intrinsics.areEqual(this.IAuthTabCallback, ((IAuthTabCallback) obj).IAuthTabCallback);
                }
                int i5 = i3 + 109;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.IAuthTabCallback.hashCode();
                int i4 = onExtraCallback + 71;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 65 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "RedirectUrl(url=" + this.IAuthTabCallback + ")";
                int i2 = onNavigationEvent + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IAuthTabCallback(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.IAuthTabCallback = str;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.IAuthTabCallback;
                int i5 = i3 + 11;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }

        public static final class onNavigationEvent extends onExtraCallbackWithResult {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

            static {
                int i = onExtraCallback + 19;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            private onNavigationEvent() {
                super(null);
            }
        }
    }

    public static abstract class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static final class IAuthTabCallback extends onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private final String onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 47;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof IAuthTabCallback)) {
                    int i4 = onExtraCallbackWithResult + 81;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.onWarmupCompleted, ((IAuthTabCallback) obj).onWarmupCompleted)) {
                    return true;
                }
                int i6 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.onWarmupCompleted.hashCode();
                int i4 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "NavigateCreditScoreRaise(referrer=" + this.onWarmupCompleted + ")";
                int i2 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IAuthTabCallback(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.onWarmupCompleted = str;
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 61;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.onWarmupCompleted;
                int i5 = i2 + 55;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = asInterface;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1))), 35 - View.MeasureSpec.getSize(0), 14239 - (ViewConfiguration.getFadingEdgeLength() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $11 + 115;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i9 = $11 + 61;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 65 - Color.argb(0, 0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 29, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 49467), TextUtils.indexOf("", "", 0) + 70, 12486 - Color.argb(0, 0, 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i13 = $11 + 45;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            int i16 = $10 + 99;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i18 = $11 + 71;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i19 = $10 + 69;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private final Object onExtraCallback(access13800<? super Boolean> access13800Var) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return IAuthTabCallback(72124850, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this, access13800Var}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -72124848);
    }

    public final Rmipmap<onExtraCallbackWithResult> asInterface() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (Rmipmap) IAuthTabCallback(846789094, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -846789094);
    }

    public final void onNavigationEvent(@Nullable String str, @NotNull RouteType routeType) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        IAuthTabCallback(-564089911, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this, str, routeType}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, 564089912);
    }
}
