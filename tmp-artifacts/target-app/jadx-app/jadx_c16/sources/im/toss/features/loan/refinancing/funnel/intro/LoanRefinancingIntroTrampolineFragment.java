package im.toss.features.loan.refinancing.funnel.intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.loan.refinancing.data.RefinancingInquiryResult;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.common.RefinancingLoanType;
import im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroTrampolineFragment$;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.ConvertFloatArrayToByteArray;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.GeckoHubImp;
import o.LifecyclesKtawaitStarted21;
import o.PageContext;
import o.RippleNode;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TraceDebugEngineExtension2;
import o.WebSocketFactory;
import o.access13800;
import o.access14000;
import o.access14300;
import o.addAllCommandLine;
import o.clearWrite;
import o.enableTabBarByAppId;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.preFillDefault;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus;
import viva.republica.toss.network.model.loan.LoanRefinancingStatus;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingIntroTrampolineFragment extends Hilt_LoanRefinancingIntroTrampolineFragment {
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int asBinder = 0;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback = {new PropertyReference1Impl<>(LoanRefinancingIntroTrampolineFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingSkeletonBinding;", 0)};
    public static final int onNavigationEvent = 8;
    private static int onTransact = 1;
    private final Lazy IAuthTabCallbackDefault;
    private boolean onWarmupCompleted;
    private int IAuthTabCallback = R.layout.fragment_loan_refinancing_skeleton;
    private final PageContext onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.IAuthTabCallback);

    static final /* synthetic */ class IAuthTabCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function1 IAuthTabCallback;

        IAuthTabCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 53;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object obj2 = null;
            if (obj instanceof TextLinkScopeExternalSyntheticLambda0) {
                int i5 = i2 + 79;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    boolean z = obj instanceof FunctionAdapter;
                    obj2.hashCode();
                    throw null;
                }
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i6 = i2 + 15;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i3 + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onWarmupCompleted + 67;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            int i4 = onWarmupCompleted + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
        }
    }

    static {
        int i = IAuthTabCallback_Parcel + 5;
        access000 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment = (LoanRefinancingIntroTrampolineFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 45;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            return (Unit) onWarmupCompleted(396350446, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{loanRefinancingIntroTrampolineFragment}, -396350445, iIAuthTabCallback);
        }
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback5 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback6 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingIntroTrampolineFragment, th);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = onTransact + 115;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(loanRefinancingIntroTrampolineFragment, th);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingIntroTrampolineFragment, th);
        int i3 = onTransact + 117;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment = (LoanRefinancingIntroTrampolineFragment) objArr[0];
        LoanRefinancingAvailableStatus loanRefinancingAvailableStatus = (LoanRefinancingAvailableStatus) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingIntroTrampolineFragment, loanRefinancingAvailableStatus);
        int i4 = onTransact + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, RefinancingInquiryResult refinancingInquiryResult) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingIntroTrampolineFragment, refinancingInquiryResult);
        int i4 = asBinder + 117;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, LoanRefinancingStatus loanRefinancingStatus) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingIntroTrampolineFragment, loanRefinancingStatus);
        int i4 = onTransact + 87;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = ~i6;
        int i10 = ~(i9 | i5);
        int i11 = i8 | i10;
        int i12 = ~i5;
        int i13 = ~(i12 | i);
        int i14 = (~(i6 | i7)) | i13 | i10;
        int i15 = (~(i9 | i)) | (~(i12 | i9)) | i13;
        int i16 = i5 + i + i3 + ((-954185507) * i4) + (2055044340 * i2);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i5) - 760807424) + ((-878567756) * i) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i3) + (1313472512 * i4) + (606601216 * i2) + ((-1232666624) * i17);
        int i19 = (i5 * 1290134917) + 267690129 + (i * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i3 * 1290136159) + (i4 * 826674179) + (i2 * 1594648204) + (i17 * 572063744);
        int i20 = i18 + (i19 * i19 * 607715328);
        return i20 != 1 ? i20 != 2 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public LoanRefinancingIntroTrampolineFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onTransact(new onExtraCallbackWithResult(this)));
        this.IAuthTabCallbackDefault = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(LoanRefinancingIntroViewModel.class), new asInterface(lazyOnNavigationEvent), new IAuthTabCallbackDefault(null, lazyOnNavigationEvent), new asBinder(this, lazyOnNavigationEvent));
    }

    public static final /* synthetic */ LoanRefinancingViewModel onExtraCallbackWithResult(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingViewModel loanRefinancingViewModelAccess100 = loanRefinancingIntroTrampolineFragment.access100();
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        int i5 = onTransact + 109;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return loanRefinancingViewModelAccess100;
        }
        throw null;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, TraceDebugEngineExtension2> {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onExtraCallback() {
            super(1, TraceDebugEngineExtension2.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingSkeletonBinding;", 0);
        }

        public final TraceDebugEngineExtension2 IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                return TraceDebugEngineExtension2.onExtraCallbackWithResult(view);
            }
            Intrinsics.checkNotNullParameter(view, "");
            int i3 = 79 / 0;
            return TraceDebugEngineExtension2.onExtraCallbackWithResult(view);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TraceDebugEngineExtension2 traceDebugEngineExtension2IAuthTabCallback = IAuthTabCallback((View) obj);
            int i4 = onNavigationEvent + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return traceDebugEngineExtension2IAuthTabCallback;
        }
    }

    private final TraceDebugEngineExtension2 onExtraCallback() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            pageContext = this.onExtraCallbackWithResult;
            addallcommandline = onExtraCallback[1];
        } else {
            pageContext = this.onExtraCallbackWithResult;
            addallcommandline = onExtraCallback[0];
        }
        TraceDebugEngineExtension2 traceDebugEngineExtension2OnExtraCallbackWithResult = pageContext.onExtraCallbackWithResult(this, addallcommandline);
        Intrinsics.checkNotNullExpressionValue(traceDebugEngineExtension2OnExtraCallbackWithResult, "");
        TraceDebugEngineExtension2 traceDebugEngineExtension2 = traceDebugEngineExtension2OnExtraCallbackWithResult;
        int i3 = onTransact + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return traceDebugEngineExtension2;
    }

    private final LoanRefinancingIntroViewModel asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        LoanRefinancingIntroViewModel loanRefinancingIntroViewModel = (LoanRefinancingIntroViewModel) this.IAuthTabCallbackDefault.getValue();
        int i3 = asBinder + 9;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return loanRefinancingIntroViewModel;
        }
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = LoanRefinancingIntroTrampolineFragment.this.new onNavigationEvent(access13800Var);
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
        
            if (r0 == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
        
            if (r0 == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00cd, code lost:
        
            r12 = r0;
            r0 = r14;
            r14 = r12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            LoanRefinancingViewModel loanRefinancingViewModelOnExtraCallbackWithResult;
            boolean zBooleanValue;
            Object objOnExtraCallback;
            LoanRefinancingViewModel loanRefinancingViewModel;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                loanRefinancingViewModelOnExtraCallbackWithResult = LoanRefinancingIntroTrampolineFragment.onExtraCallbackWithResult(LoanRefinancingIntroTrampolineFragment.this);
                Object[] objArr = {LoanRefinancingIntroTrampolineFragment.onExtraCallbackWithResult(LoanRefinancingIntroTrampolineFragment.this)};
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int i3 = onExtraCallback.onNavigationEvent[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, iOnNavigationEvent2, objArr)).ordinal()];
                zBooleanValue = false;
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i4 = onNavigationEvent + 49;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
                        this.L$0 = loanRefinancingViewModelOnExtraCallbackWithResult;
                        this.label = 0;
                        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                        objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "loanRefinancing.nativeIntroEnabled", boolOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                    } else {
                        LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted212 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                        Boolean boolOnNavigationEvent2 = access14000.onNavigationEvent(true);
                        this.L$0 = loanRefinancingViewModelOnExtraCallbackWithResult;
                        this.label = 1;
                        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                        objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted212, "loanRefinancing.nativeIntroEnabled", boolOnNavigationEvent2, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback2);
                    }
                }
                loanRefinancingViewModelOnExtraCallbackWithResult.onExtraCallbackWithResult(zBooleanValue);
                LoanRefinancingIntroTrampolineFragment.onExtraCallbackWithResult(LoanRefinancingIntroTrampolineFragment.this).IAuthTabCallbackDefault();
                return Unit.INSTANCE;
            }
            int i5 = onNavigationEvent + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loanRefinancingViewModel = (LoanRefinancingViewModel) this.L$0;
            ResultKt.onNavigationEvent(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            loanRefinancingViewModelOnExtraCallbackWithResult = loanRefinancingViewModel;
            loanRefinancingViewModelOnExtraCallbackWithResult.onExtraCallbackWithResult(zBooleanValue);
            LoanRefinancingIntroTrampolineFragment.onExtraCallbackWithResult(LoanRefinancingIntroTrampolineFragment.this).IAuthTabCallbackDefault();
            return Unit.INSTANCE;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        boolean z = this.onWarmupCompleted;
        Object[] objArr = {access100()};
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "LoanRefinancingAppScreen", "LoanRefinancingIntroTrampolineFragment launched :: " + z + " | retry ::" + ((Boolean) LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -449074682, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 449074691, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr)).booleanValue(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        if (this.onWarmupCompleted) {
            onExtraCallbackWithResult();
        }
        onTransact();
        Object[] objArr2 = {access100()};
        if (((Boolean) LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -449074682, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 449074691, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2)).booleanValue()) {
            int i2 = asBinder + 69;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr3 = {access100()};
            LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 519522663, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -519522660, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr3);
            int i4 = onTransact + 61;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
        }
        this.onWarmupCompleted = true;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            access100().onActivityResized();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!access100().onActivityResized())) {
            RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingIntroFragment);
            int i3 = onTransact + 9;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingIntroWebFragment);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment = (LoanRefinancingIntroTrampolineFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingIntroTrampolineFragment.IAuthTabCallbackStub();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, LoanRefinancingAvailableStatus loanRefinancingAvailableStatus) {
        int i = 2 % 2;
        Intrinsics.checkNotNull(loanRefinancingAvailableStatus);
        loanRefinancingIntroTrampolineFragment.IAuthTabCallback(loanRefinancingAvailableStatus, new LoanRefinancingIntroTrampolineFragment$.ExternalSyntheticLambda5(loanRefinancingIntroTrampolineFragment));
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, RefinancingInquiryResult refinancingInquiryResult) {
        int i = 2 % 2;
        if (!refinancingInquiryResult.onNavigationEvent().isEmpty()) {
            Intrinsics.checkNotNull(refinancingInquiryResult);
            loanRefinancingIntroTrampolineFragment.onNavigationEvent(refinancingInquiryResult);
            Unit unit = Unit.INSTANCE;
            int i2 = asBinder + 13;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = asBinder + 107;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return Unit.INSTANCE;
        }
        int i4 = 26 / 0;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5 A[PHI: r1
      0x00a5: PHI (r1v17 int) = (r1v16 int), (r1v25 int) binds: [B:10:0x00a3, B:7:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, LoanRefinancingStatus loanRefinancingStatus) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        loanRefinancingIntroTrampolineFragment.access100().onExtraCallbackWithResult(loanRefinancingStatus.onNavigationEvent());
        if (loanRefinancingStatus.onExtraCallback().isDone()) {
            int i5 = asBinder + 117;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                LottieAnimationView lottieAnimationView = loanRefinancingIntroTrampolineFragment.onExtraCallback().onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
                lottieAnimationView.setVisibility(0);
                Object[] objArr = {loanRefinancingIntroTrampolineFragment.access100()};
                i = onWarmupCompleted.IAuthTabCallback[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr)).ordinal()];
                if (i != 0) {
                    int i6 = asBinder + 45;
                    onTransact = i6 % 128;
                    if (i6 % 2 != 0 ? i != 2 : i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    loanRefinancingIntroTrampolineFragment.access100().onExtraCallback(String.valueOf(loanRefinancingStatus.onNavigationEvent()));
                    int i7 = asBinder + 7;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    LoanRefinancingViewModel.onExtraCallbackWithResult(loanRefinancingIntroTrampolineFragment.access100(), 0L, 1, (Object) null);
                }
            } else {
                LottieAnimationView lottieAnimationView2 = loanRefinancingIntroTrampolineFragment.onExtraCallback().onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
                lottieAnimationView2.setVisibility(0);
                Object[] objArr2 = {loanRefinancingIntroTrampolineFragment.access100()};
                i = onWarmupCompleted.IAuthTabCallback[((RefinancingLoanType) LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -173209907, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 173209922, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2)).ordinal()];
                if (i != 1) {
                }
            }
        } else if (loanRefinancingStatus.onExtraCallback().isLoading()) {
            LottieAnimationView lottieAnimationView3 = loanRefinancingIntroTrampolineFragment.onExtraCallback().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
            lottieAnimationView3.setVisibility(0);
            RippleNode.onNavigationEvent(loanRefinancingIntroTrampolineFragment).onNavigationEvent(R.id.loanRefinancingPollingFragment);
        } else if (loanRefinancingIntroTrampolineFragment.access100().validateRelationship() && (!loanRefinancingIntroTrampolineFragment.access100().newAuthTabSession())) {
            RippleNode.onNavigationEvent(loanRefinancingIntroTrampolineFragment).getInterfaceDescriptor();
        } else {
            loanRefinancingIntroTrampolineFragment.IAuthTabCallbackStub();
            int i9 = asBinder + 95;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 / 3;
            }
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<Fragment> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnNavigationEvent = onNavigationEvent();
            int i4 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return fragmentOnNavigationEvent;
            }
            throw null;
        }

        public final Fragment onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i3 + 105;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return fragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, Throwable th) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoanRefinancingAppError", "LoanRefinancingIntroTrampolineFragment check Failed :: " + th.getMessage(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        enableTabBarByAppId enabletabbarbyappid = enableTabBarByAppId.onWarmupCompleted;
        FragmentActivity fragmentActivityRequireActivity = loanRefinancingIntroTrampolineFragment.requireActivity();
        Object[] objArr = {loanRefinancingIntroTrampolineFragment.access100()};
        if (((Boolean) enableTabBarByAppId.onWarmupCompleted(1373238725, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1373238721, new Object[]{enabletabbarbyappid, th, fragmentActivityRequireActivity, false, (String) LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr), 4, null}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult())).booleanValue()) {
            return Unit.INSTANCE;
        }
        if (loanRefinancingIntroTrampolineFragment.access100().validateRelationship()) {
            int i2 = onTransact + 61;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (loanRefinancingIntroTrampolineFragment.access100().newAuthTabSession()) {
                loanRefinancingIntroTrampolineFragment.IAuthTabCallbackStub();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 121;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onTransact() {
        int i = 2 % 2;
        access100().ICustomTabsCallbackDefault().observe(getViewLifecycleOwner(), new IAuthTabCallback(new LoanRefinancingIntroTrampolineFragment$.ExternalSyntheticLambda0(this)));
        access100().extraCallback().observe(getViewLifecycleOwner(), new IAuthTabCallback(new LoanRefinancingIntroTrampolineFragment$.ExternalSyntheticLambda1(this)));
        access100().ICustomTabsService().observe(getViewLifecycleOwner(), new IAuthTabCallback(new LoanRefinancingIntroTrampolineFragment$.ExternalSyntheticLambda2(this)));
        access100().ICustomTabsCallback_Parcel().observe(getViewLifecycleOwner(), new IAuthTabCallback(new LoanRefinancingIntroTrampolineFragment$.ExternalSyntheticLambda3(this)));
        asBinder().onExtraCallback().observe(getViewLifecycleOwner(), new IAuthTabCallback(new LoanRefinancingIntroTrampolineFragment$.ExternalSyntheticLambda4(this)));
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onTransact extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 IAuthTabCallback() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
                int i3 = 92 / 0;
            } else {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            }
            int i4 = onExtraCallback + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0IAuthTabCallback;
        }
    }

    private static final Unit onWarmupCompleted(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            loanRefinancingIntroTrampolineFragment.onExtraCallbackWithResult();
            return Unit.INSTANCE;
        }
        loanRefinancingIntroTrampolineFragment.onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent = onNavigationEvent();
            int i3 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 22 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onNavigationEvent() {
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            Object obj = null;
            if (function0 != null) {
                int i2 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent : null;
            if (textFieldKeyInputExternalSyntheticLambda6 == null) {
                return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            }
            int i3 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            int i4 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelCreationExtras;
        }
    }

    public static final class asBinder extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            Object obj = null;
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                int i2 = IAuthTabCallback + 69;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i4 = IAuthTabCallback + 41;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                if (defaultViewModelProviderFactory != null) {
                    int i5 = IAuthTabCallback + 11;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        return defaultViewModelProviderFactory;
                    }
                    throw null;
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            return defaultViewModelProviderFactory2;
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i3 = onWarmupCompleted + 1;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
            }
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = onWarmupCompleted + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this, false, (Intent) null, 3, (Object) null);
        int i4 = onTransact + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment, LoanRefinancingAvailableStatus loanRefinancingAvailableStatus) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-2034350169, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{loanRefinancingIntroTrampolineFragment, loanRefinancingAvailableStatus}, 2034350171, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-2118789384, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{loanRefinancingIntroTrampolineFragment}, 2118789384, iIAuthTabCallback);
    }

    private static final Unit onNavigationEvent(LoanRefinancingIntroTrampolineFragment loanRefinancingIntroTrampolineFragment) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onWarmupCompleted(396350446, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{loanRefinancingIntroTrampolineFragment}, -396350445, iIAuthTabCallback);
    }
}
