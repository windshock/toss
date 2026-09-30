package im.toss.tds.compose.component.compound.bottomsheet.internal;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Window;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.findResAndMsg;
import o.getSupportedHighSpeedResolutionsFor;
import o.isQueryRefinementEnabled;
import o.onSuggestionsKey;
import o.r8lambdaZTwkiBI2wKyqWQyt0ntTpaYDX0s;
import o.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ModalBottomSheetDialogLayout extends AbstractComposeView implements r8lambdaZTwkiBI2wKyqWQyt0ntTpaYDX0s {
    private static int IAuthTabCallbackStub = 0;
    private static int getInterfaceDescriptor = 1;
    private final isQueryRefinementEnabled<Float, onSuggestionsKey> IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final Window asBinder;
    private final boolean asInterface;
    private final Function0<Unit> onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final findResAndMsg onTransact;
    private Object onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(ModalBottomSheetDialogLayout modalBottomSheetDialogLayout, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 101;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(modalBottomSheetDialogLayout, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = getInterfaceDescriptor + 11;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(ModalBottomSheetDialogLayout modalBottomSheetDialogLayout, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 95;
        getInterfaceDescriptor = i4 % 128;
        modalBottomSheetDialogLayout.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetDialogLayout(@NotNull Context context, @NotNull Window window, boolean z, @NotNull Function0<Unit> function0, @NotNull isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, @NotNull findResAndMsg findresandmsg) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(window, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(isqueryrefinementenabled, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.asBinder = window;
        this.asInterface = z;
        this.onExtraCallbackWithResult = function0;
        this.IAuthTabCallback = isqueryrefinementenabled;
        this.onTransact = findresandmsg;
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(w1.onExtraCallback.onExtraCallbackWithResult(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public Window onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asBinder;
        }
        throw null;
    }

    public boolean ap_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 77;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.IAuthTabCallbackDefault;
        int i4 = i2 + 95;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final void setContent(@NotNull CameraConfigBuilder cameraConfigBuilder, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cameraConfigBuilder, "");
            Intrinsics.checkNotNullParameter(function2, "");
        } else {
            Intrinsics.checkNotNullParameter(cameraConfigBuilder, "");
            Intrinsics.checkNotNullParameter(function2, "");
        }
        onExtraCallbackWithResult(cameraConfigBuilder);
        onExtraCallback(function2);
        this.IAuthTabCallbackDefault = true;
        IAuthTabCallbackDefault();
    }

    public void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1952712008);
        boolean z = true;
        if ((i & 6) == 0) {
            int i6 = getInterfaceDescriptor + 1;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i8 = getInterfaceDescriptor + 75;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i10 = getInterfaceDescriptor + 9;
            IAuthTabCallbackStub = i10 % 128;
            if (i10 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = getInterfaceDescriptor + 45;
                IAuthTabCallbackStub = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1952712008, i2, -1, "im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.kt:211)");
                int i13 = IAuthTabCallbackStub + 21;
                getInterfaceDescriptor = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 4 % 5;
                }
            }
            IAuthTabCallback().invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = IAuthTabCallbackStub + 17;
                getInterfaceDescriptor = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetDialogLayout$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = onWarmupCompleted + 105;
                    onExtraCallbackWithResult = i18 % 128;
                    int i19 = i18 % 2;
                    Unit unitOnExtraCallback = ModalBottomSheetDialogLayout.onExtraCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i20 = onWarmupCompleted + 27;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 17;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        onNavigationEvent();
        int i4 = IAuthTabCallbackStub + 59;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult() {
        Object objRd_;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
            if (!this.asInterface) {
                return;
            }
        } else if (!this.asInterface) {
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            if (this.onWarmupCompleted == null) {
                if (i4 < 34) {
                    objRd_ = onExtraCallbackWithResult.rd_(this.onExtraCallbackWithResult);
                } else {
                    int i5 = IAuthTabCallbackStub + 67;
                    getInterfaceDescriptor = i5 % 128;
                    if (i5 % 2 == 0) {
                        onNavigationEvent.re_(this.onExtraCallbackWithResult, this.IAuthTabCallback, this.onTransact);
                        throw null;
                    }
                    objRd_ = onNavigationEvent.re_(this.onExtraCallbackWithResult, this.IAuthTabCallback, this.onTransact);
                }
                this.onWarmupCompleted = objRd_;
            }
            onExtraCallbackWithResult.IAuthTabCallback(this, this.onWarmupCompleted);
            int i6 = IAuthTabCallbackStub + 71;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 15) {
            onExtraCallbackWithResult.onWarmupCompleted(this, this.onWarmupCompleted);
        }
        this.onWarmupCompleted = null;
        int i3 = IAuthTabCallbackStub + 61;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = (Function2) this.onNavigationEvent.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 33;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return function2;
    }

    private final void onExtraCallback(Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.IAuthTabCallback(function2);
            return;
        }
        this.onNavigationEvent.IAuthTabCallback(function2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
