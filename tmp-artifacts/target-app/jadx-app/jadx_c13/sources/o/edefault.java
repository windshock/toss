package o;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import im.toss.tds.compose.R;
import im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetDialogLayout;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.edefault;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class edefault extends ComponentDialog {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final float IAuthTabCallback;
    private final ModalBottomSheetDialogLayout onExtraCallback;
    private final View onExtraCallbackWithResult;
    private Function0<Unit> onNavigationEvent;
    private AFg1iSDK onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[ExtensionsManagerExtensionsAvailability.values().length];
            try {
                iArr[ExtensionsManagerExtensionsAvailability.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExtensionsManagerExtensionsAvailability.Rtl.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int i3 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(edefault edefaultVar, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(edefaultVar, onBackPressedCallback);
        }
        onWarmupCompleted(edefaultVar, onBackPressedCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void cancel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, android.view.ViewGroup, im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetDialogLayout] */
    public edefault(@NotNull Function0<Unit> function0, @NotNull AFg1iSDK aFg1iSDK, @NotNull View view, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull UUID uuid, @NotNull isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, @NotNull findResAndMsg findresandmsg, boolean z) {
        super(new ContextThemeWrapper(view.getContext(), R.style.Tds_EdgeToEdgeFloatingDialogWindowTheme), 0, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(aFg1iSDK, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(isqueryrefinementenabled, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.onNavigationEvent = function0;
        this.onWarmupCompleted = aFg1iSDK;
        this.onExtraCallbackWithResult = view;
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
        this.IAuthTabCallback = fIAuthTabCallback;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(im.toss.uikit.R.color.transparent);
        RepeatableSpec.onExtraCallbackWithResult(window, false);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ?? modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(context, window, this.onWarmupCompleted.onNavigationEvent(), this.onNavigationEvent, isqueryrefinementenabled, findresandmsg);
        modalBottomSheetDialogLayout.setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fIAuthTabCallback));
        modalBottomSheetDialogLayout.setOutlineProvider(new onExtraCallback());
        this.onExtraCallback = modalBottomSheetDialogLayout;
        setContentView((View) modalBottomSheetDialogLayout);
        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.IAuthTabCallback((View) modalBottomSheetDialogLayout, AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(view));
        RightClickGesturesKtawaitFirstRightClickDown1.onExtraCallback((View) modalBottomSheetDialogLayout, RightClickGesturesKtawaitFirstRightClickDown1.onNavigationEvent(view));
        NavigationDrawerKtExternalSyntheticLambda1.onExtraCallbackWithResult((View) modalBottomSheetDialogLayout, NavigationDrawerKtExternalSyntheticLambda1.onNavigationEvent(view));
        onExtraCallbackWithResult(this.onNavigationEvent, this.onWarmupCompleted, extensionsManagerExtensionsAvailability);
        SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0OnExtraCallback = RepeatableSpec.onExtraCallback(window, window.getDecorView());
        boolean z2 = !z;
        suspendAnimationKtExternalSyntheticLambda0OnExtraCallback.onNavigationEvent(z2);
        suspendAnimationKtExternalSyntheticLambda0OnExtraCallback.IAuthTabCallback(z2);
        extraCommand.IAuthTabCallback(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetDialogWrapper$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                edefault edefaultVar = this.f$0;
                OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) obj;
                if (i3 != 0) {
                    return edefault.onNavigationEvent(edefaultVar, onBackPressedCallback);
                }
                Unit unitOnNavigationEvent = edefault.onNavigationEvent(edefaultVar, onBackPressedCallback);
                int i4 = 16 / 0;
                return unitOnNavigationEvent;
            }
        }, 2, (Object) null);
        int i = IAuthTabCallbackDefault + 7;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 78 / 0;
        }
    }

    public static final class onExtraCallback extends ViewOutlineProvider {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onExtraCallback() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
            int i4 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onWarmupCompleted(edefault edefaultVar, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (edefaultVar.onWarmupCompleted.onNavigationEvent()) {
            int i4 = asBinder + 103;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                edefaultVar.onNavigationEvent.invoke();
                throw null;
            }
            edefaultVar.onNavigationEvent.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        r8lambdaZTwkiBI2wKyqWQyt0ntTpaYDX0s r8lambdaztwkibi2wkyqwqyt0nttpaydx0s;
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 17;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            r8lambdaztwkibi2wkyqwqyt0nttpaydx0s = this.onExtraCallback;
            i = onNavigationEvent.onNavigationEvent[extensionsManagerExtensionsAvailability.ordinal()];
            if (i != 1) {
                i4 = 1;
                if (i != 2) {
                }
            }
        } else {
            r8lambdaztwkibi2wkyqwqyt0nttpaydx0s = this.onExtraCallback;
            i = onNavigationEvent.onNavigationEvent[extensionsManagerExtensionsAvailability.ordinal()];
            if (i != 0) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        r8lambdaztwkibi2wkyqwqyt0nttpaydx0s.setLayoutDirection(i4);
        int i5 = asBinder + 95;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull CameraConfigBuilder cameraConfigBuilder, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cameraConfigBuilder, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.onExtraCallback.setContent(cameraConfigBuilder, function2);
        int i4 = IAuthTabCallbackDefault + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 65;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = ((Boolean) vdefault.onNavigationEvent(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -2132862052, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), new Object[]{sessionProcessorBaseExternalSyntheticLambda1, Boolean.valueOf(vdefault.onExtraCallbackWithResult(this.onExtraCallbackWithResult))}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 2132862052, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).booleanValue();
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        if (zBooleanValue) {
            int i5 = asBinder + 85;
            IAuthTabCallbackDefault = i5 % 128;
            i = i5 % 2 != 0 ? 675 : 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, TTHistoryActivity2.SIZE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallbackWithResult(@NotNull Function0<Unit> function0, @NotNull AFg1iSDK aFg1iSDK, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 37;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(aFg1iSDK, "");
        Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
        this.onNavigationEvent = function0;
        this.onWarmupCompleted = aFg1iSDK;
        onWarmupCompleted(aFg1iSDK.onWarmupCompleted());
        onWarmupCompleted(extensionsManagerExtensionsAvailability);
        Window window = getWindow();
        if (window != null) {
            int i5 = asBinder + 115;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                int i7 = asBinder + 13;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                i = 48;
            } else {
                i = 16;
            }
            window2.setSoftInputMode(i);
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.IAuthTabCallbackStub();
        int i4 = asBinder + 107;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r4
      0x0027: PHI (r4v2 boolean) = (r4v1 boolean), (r4v4 boolean) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean zOnTouchEvent;
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            zOnTouchEvent = super/*android.app.Dialog*/.onTouchEvent(motionEvent);
            int i3 = 27 / 0;
            if (zOnTouchEvent) {
                int i4 = IAuthTabCallbackDefault + 15;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                this.onNavigationEvent.invoke();
            }
        } else {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            zOnTouchEvent = super/*android.app.Dialog*/.onTouchEvent(motionEvent);
            if (zOnTouchEvent) {
            }
        }
        return zOnTouchEvent;
    }
}
