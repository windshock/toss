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
import im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetDialogLayout;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.u7c;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u7c extends ComponentDialog {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private final ModalBottomSheetDialogLayout IAuthTabCallback;
    private va onExtraCallback;
    private Function0<Unit> onExtraCallbackWithResult;
    private final View onNavigationEvent;
    private final float onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[ExtensionsManagerExtensionsAvailability.values().length];
            try {
                iArr[ExtensionsManagerExtensionsAvailability.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExtensionsManagerExtensionsAvailability.Rtl.ordinal()] = 2;
                int i = onExtraCallback + 41;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int i4 = IAuthTabCallback + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(u7c u7cVar, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(u7cVar, onBackPressedCallback);
        int i4 = onTransact + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public void cancel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.View, android.view.ViewGroup, im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetDialogLayout] */
    public u7c(@NotNull Function0<Unit> function0, @NotNull va vaVar, @NotNull View view, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull UUID uuid, @NotNull isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, @NotNull findResAndMsg findresandmsg, boolean z) {
        super(new ContextThemeWrapper(view.getContext(), R.style.Tds_EdgeToEdgeFloatingDialogWindowTheme), 0, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(vaVar, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(isqueryrefinementenabled, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.onExtraCallbackWithResult = function0;
        this.onExtraCallback = vaVar;
        this.onNavigationEvent = view;
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
        this.onWarmupCompleted = fIAuthTabCallback;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        RepeatableSpec.onExtraCallbackWithResult(window, false);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ?? modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(context, window, this.onExtraCallback.onNavigationEvent(), this.onExtraCallbackWithResult, isqueryrefinementenabled, findresandmsg);
        modalBottomSheetDialogLayout.setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fIAuthTabCallback));
        modalBottomSheetDialogLayout.setOutlineProvider(new onExtraCallbackWithResult());
        this.IAuthTabCallback = modalBottomSheetDialogLayout;
        setContentView((View) modalBottomSheetDialogLayout);
        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.IAuthTabCallback((View) modalBottomSheetDialogLayout, AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(view));
        RightClickGesturesKtawaitFirstRightClickDown1.onExtraCallback((View) modalBottomSheetDialogLayout, RightClickGesturesKtawaitFirstRightClickDown1.onNavigationEvent(view));
        NavigationDrawerKtExternalSyntheticLambda1.onExtraCallbackWithResult((View) modalBottomSheetDialogLayout, NavigationDrawerKtExternalSyntheticLambda1.onNavigationEvent(view));
        onExtraCallback(this.onExtraCallbackWithResult, this.onExtraCallback, extensionsManagerExtensionsAvailability);
        SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0OnExtraCallback = RepeatableSpec.onExtraCallback(window, window.getDecorView());
        boolean z2 = !z;
        suspendAnimationKtExternalSyntheticLambda0OnExtraCallback.onNavigationEvent(z2);
        suspendAnimationKtExternalSyntheticLambda0OnExtraCallback.IAuthTabCallback(z2);
        extraCommand.IAuthTabCallback(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetDialogWrapper$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                Unit unitOnNavigationEvent;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    unitOnNavigationEvent = u7c.onNavigationEvent(this.f$0, (OnBackPressedCallback) obj);
                    int i3 = 49 / 0;
                } else {
                    unitOnNavigationEvent = u7c.onNavigationEvent(this.f$0, (OnBackPressedCallback) obj);
                }
                int i4 = onWarmupCompleted + 71;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        }, 2, (Object) null);
        int i = IAuthTabCallbackDefault + 35;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult extends ViewOutlineProvider {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        onExtraCallbackWithResult() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
            int i4 = IAuthTabCallback + 97;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
        }
    }

    private static final Unit onWarmupCompleted(u7c u7cVar, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (u7cVar.onExtraCallback.onNavigationEvent()) {
            int i4 = onTransact + 117;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            u7cVar.onExtraCallbackWithResult.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallback(ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaZTwkiBI2wKyqWQyt0ntTpaYDX0s r8lambdaztwkibi2wkyqwqyt0nttpaydx0s = this.IAuthTabCallback;
        int i4 = onExtraCallback.onNavigationEvent[extensionsManagerExtensionsAvailability.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            int i6 = IAuthTabCallbackDefault + 73;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i5 = 0;
        }
        r8lambdaztwkibi2wkyqwqyt0nttpaydx0s.setLayoutDirection(i5);
        int i8 = onTransact + 117;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 98 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull CameraConfigBuilder cameraConfigBuilder, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cameraConfigBuilder, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.IAuthTabCallback.setContent(cameraConfigBuilder, function2);
        int i4 = onTransact + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        boolean zOnExtraCallbackWithResult = u7d.onExtraCallbackWithResult(sessionProcessorBaseExternalSyntheticLambda1, u7d.onExtraCallbackWithResult(this.onNavigationEvent));
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        if (!zOnExtraCallbackWithResult) {
            int i3 = onTransact + 119;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            i = -8193;
        } else {
            int i5 = IAuthTabCallbackDefault + 121;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            i = 8192;
        }
        window.setFlags(i, 8192);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallback(@NotNull Function0<Unit> function0, @NotNull va vaVar, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 9;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(vaVar, "");
        Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
        this.onExtraCallbackWithResult = function0;
        this.onExtraCallback = vaVar;
        onNavigationEvent(vaVar.onExtraCallback());
        onExtraCallback(extensionsManagerExtensionsAvailability);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            int i5 = onTransact + 103;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0 ? Build.VERSION.SDK_INT < 30 : Build.VERSION.SDK_INT < 39) {
                int i6 = IAuthTabCallbackDefault + 47;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                i = 16;
            } else {
                i = 48;
            }
            window2.setSoftInputMode(i);
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.IAuthTabCallbackStub();
        int i4 = IAuthTabCallbackDefault + 59;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        boolean zOnTouchEvent = super/*android.app.Dialog*/.onTouchEvent(motionEvent);
        if (!(!zOnTouchEvent)) {
            int i4 = onTransact + 23;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallbackWithResult.invoke();
        }
        return zOnTouchEvent;
    }
}
