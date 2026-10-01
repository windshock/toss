package im.toss.features.loan.home;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.loan.home.LoanRefinancingListFragment$;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.ForwardingCameraControl;
import o.PageRenderReadyListener;
import o.SessionTrackerb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UTIL_HPPTDownloadFile;
import o.ZslRingBuffer;
import o.access8100;
import o.addAllCommandLine;
import o.deleteOldPkgByFullInstall;
import o.getWrite;
import o.installSubPackage;
import o.preFillDefault;
import o.setAdVideoPlaybackListener;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingListFragment extends Hilt_LoanRefinancingListFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    public static final int onExtraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static int onTransact;
    private final PageRenderReadyListener onExtraCallback;
    private final Lazy onWarmupCompleted;

    @Inject
    public SessionTrackerb tossRouter;

    static {
        onWarmupCompleted();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanRefinancingListFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentComposeBinding;", 0)};
        Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
        onExtraCallbackWithResult = 8;
        int i = IAuthTabCallbackStub + 105;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingListFragment loanRefinancingListFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingListFragment);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = onTransact + 69;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingListFragment loanRefinancingListFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 19;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(loanRefinancingListFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingListFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 87;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return 1325525L;
    }

    public LoanRefinancingListFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(new onWarmupCompleted(this)));
        this.onWarmupCompleted = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(LoanHomeViewModel.class), new onNavigationEvent(lazyOnNavigationEvent), new asBinder(null, lazyOnNavigationEvent), new onTransact(this, lazyOnNavigationEvent));
        this.onExtraCallback = preFillDefault.IAuthTabCallback(this, onExtraCallbackWithResult.onExtraCallback);
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 53;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i4 = i2 + 81;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = asInterface + 113;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private final LoanHomeViewModel asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        LoanHomeViewModel loanHomeViewModel = (LoanHomeViewModel) this.onWarmupCompleted.getValue();
        int i3 = onTransact + 21;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return loanHomeViewModel;
        }
        throw null;
    }

    private final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        int i4 = onTransact + 1;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return arguments.getString("service_referrer");
        }
        arguments.getString("service_referrer");
        throw null;
    }

    private final String asBinder() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            Object[] objArr = new Object[1];
            a(new int[]{1849539602, -302912544, 1572344953, 1452135828}, Color.argb(0, 0, 0, 0) + 8, objArr);
            return arguments.getString(((String) objArr[0]).intern());
        }
        int i4 = onTransact + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, UTIL_HPPTDownloadFile> {
        private static int IAuthTabCallback = 0;
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        onExtraCallbackWithResult() {
            super(1, UTIL_HPPTDownloadFile.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentComposeBinding;", 0);
        }

        public final UTIL_HPPTDownloadFile IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            UTIL_HPPTDownloadFile uTIL_HPPTDownloadFileOnExtraCallback = UTIL_HPPTDownloadFile.onExtraCallback(view);
            int i4 = onNavigationEvent + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return uTIL_HPPTDownloadFileOnExtraCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            UTIL_HPPTDownloadFile uTIL_HPPTDownloadFileIAuthTabCallback = IAuthTabCallback((View) obj);
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return uTIL_HPPTDownloadFileIAuthTabCallback;
            }
            throw null;
        }
    }

    private final UTIL_HPPTDownloadFile onTransact() {
        PageRenderReadyListener pageRenderReadyListener;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            pageRenderReadyListener = this.onExtraCallback;
            addallcommandline = onNavigationEvent[1];
        } else {
            pageRenderReadyListener = this.onExtraCallback;
            addallcommandline = onNavigationEvent[0];
        }
        UTIL_HPPTDownloadFile uTIL_HPPTDownloadFileOnNavigationEvent = pageRenderReadyListener.onNavigationEvent(this, addallcommandline);
        int i3 = onTransact + 115;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return uTIL_HPPTDownloadFileOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_compose, viewGroup, false);
        int i4 = onTransact + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return viewInflate;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ComposeView composeView;
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        UTIL_HPPTDownloadFile uTIL_HPPTDownloadFileOnTransact = onTransact();
        if (uTIL_HPPTDownloadFileOnTransact != null && (composeView = uTIL_HPPTDownloadFileOnTransact.onWarmupCompleted) != null) {
            composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        }
        UTIL_HPPTDownloadFile uTIL_HPPTDownloadFileOnTransact2 = onTransact();
        if (uTIL_HPPTDownloadFileOnTransact2 != null) {
            int i4 = asInterface + 13;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            ComposeView composeView2 = uTIL_HPPTDownloadFileOnTransact2.onWarmupCompleted;
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (composeView2 != null) {
                composeView2.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1328981870, true, new LoanRefinancingListFragment$.ExternalSyntheticLambda1(this))));
            }
        }
        int i6 = asInterface + 3;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingListFragment loanRefinancingListFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingListFragment.asInterface().onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        int i5 = asInterface + 125;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(LoanRefinancingListFragment loanRefinancingListFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean zOnExtraCallback;
        Object objOnMinimized;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = asInterface + 37;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 95 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1328981870, i, -1, "im.toss.features.loan.home.LoanRefinancingListFragment.onViewCreated.<anonymous> (LoanRefinancingListFragment.kt:41)");
                }
                setRubIn setrubinIAuthTabCallback = loanRefinancingListFragment.asInterface().IAuthTabCallback();
                setRubIn setrubinOnWarmupCompleted = loanRefinancingListFragment.asInterface().onWarmupCompleted();
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanRefinancingListFragment);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new LoanRefinancingListFragment$.ExternalSyntheticLambda0(loanRefinancingListFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                installSubPackage.onWarmupCompleted((setRubIn<deleteOldPkgByFullInstall>) setrubinIAuthTabCallback, (setRubIn<Boolean>) setrubinOnWarmupCompleted, (Function0<Unit>) objOnMinimized, loanRefinancingListFragment.onNavigationEvent(), loanRefinancingListFragment.asBinder(), loanRefinancingListFragment.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onTransact + 19;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                setRubIn setrubinIAuthTabCallback2 = loanRefinancingListFragment.asInterface().IAuthTabCallback();
                setRubIn setrubinOnWarmupCompleted2 = loanRefinancingListFragment.asInterface().onWarmupCompleted();
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanRefinancingListFragment);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    objOnMinimized = new LoanRefinancingListFragment$.ExternalSyntheticLambda0(loanRefinancingListFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    installSubPackage.onWarmupCompleted((setRubIn<deleteOldPkgByFullInstall>) setrubinIAuthTabCallback2, (setRubIn<Boolean>) setrubinOnWarmupCompleted2, (Function0<Unit>) objOnMinimized, loanRefinancingListFragment.onNavigationEvent(), loanRefinancingListFragment.asBinder(), loanRefinancingListFragment.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStart();
            asInterface().onNavigationEvent();
            int i3 = 42 / 0;
        } else {
            super.onStart();
            asInterface().onNavigationEvent();
        }
        int i4 = asInterface + 15;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{1849539602, -302912544, 1572344953, 1452135828}, 8 - TextUtils.getOffsetAfter("", 0), objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), asBinder()), getWrite.IAuthTabCallback("service_referrer", IAuthTabCallbackDefault())});
        int i4 = asInterface + 91;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        throw null;
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<Fragment> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Fragment onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i3 + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i3 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }
    }

    public static final class asBinder extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i3 = IAuthTabCallback + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            Object obj = null;
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                int i2 = onNavigationEvent + 13;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 % 5;
                }
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 == null) {
                return AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            }
            int i4 = onNavigationEvent + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            }
            textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras();
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class onTransact extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent();
            int i4 = onWarmupCompleted + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnNavigationEvent;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            Object obj = null;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent : null;
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i2 = onExtraCallback + 71;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                if (defaultViewModelProviderFactory != null) {
                    int i3 = onExtraCallback + 93;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return defaultViewModelProviderFactory;
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            int i5 = onExtraCallback + 3;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return defaultViewModelProviderFactory2;
            }
            throw null;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i5 = -1469660336;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $11 + 99;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 81;
                $11 = i11 % 128;
                if (i11 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 72, 8848 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i10 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i10])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 72 - TextUtils.getCapsMode("", 0, 0), TextUtils.getTrimmedLength("") + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i10++;
                }
                i3 = 2;
                i5 = -1469660336;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        int i12 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 5;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    Object[] objArr4 = new Object[i6];
                    objArr4[i7] = Integer.valueOf(iArr5[i13]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> i12);
                        int iGreen = 72 - Color.green(i7);
                        int iGreen2 = Color.green(i7) + 8848;
                        Class[] clsArr = new Class[i6];
                        clsArr[0] = Integer.TYPE;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, iGreen, iGreen2, -1725547072, false, "h", clsArr);
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i12 = 16;
                } else {
                    Object[] objArr5 = new Object[i6];
                    objArr5[0] = Integer.valueOf(iArr5[i13]);
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 71 - ((byte) KeyEvent.getModifierMetaStateMask()), 8847 - TextUtils.lastIndexOf("", '0', 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i13++;
                    i12 = 16;
                    i6 = 1;
                }
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i15 = $11 + 11;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 22252), ExpandableListView.getPackedPositionType(0L) + 39, 10301 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i17++;
            }
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4032), ExpandableListView.getPackedPositionChild(0L) + 79, Color.green(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i22 = $11 + 31;
            $10 = i22 % 128;
            int i23 = i22 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new int[]{-589148496, 1865603087, -851774546, 1048694736, 1382822315, 814027845, -1498569576, -499434979, -443133195, -1535923472, 1784981964, 1852424732, 2129804346, -55060965, 1470108623, 1071552740, 667547589, -740289293};
    }
}
