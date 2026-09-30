package im.toss.tosssecurities.uikit.compound.topsheet.internal;

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
import o.AFg1hSDK;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ModalBottomSheetDialogLayout extends AbstractComposeView implements r8lambdaZTwkiBI2wKyqWQyt0ntTpaYDX0s {
    private static int IAuthTabCallbackStub = 0;
    private static int access000 = 1;
    private final Function0<Unit> IAuthTabCallback;
    private final Window IAuthTabCallbackDefault;
    private boolean asBinder;
    private final findResAndMsg asInterface;
    private Object onExtraCallbackWithResult;
    private final isQueryRefinementEnabled<Float, onSuggestionsKey> onNavigationEvent;
    private final boolean onTransact;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(ModalBottomSheetDialogLayout modalBottomSheetDialogLayout, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 37;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(modalBottomSheetDialogLayout, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(modalBottomSheetDialogLayout, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(ModalBottomSheetDialogLayout modalBottomSheetDialogLayout, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 97;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        modalBottomSheetDialogLayout.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = access000 + 17;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetDialogLayout(@NotNull Context context, @NotNull Window window, boolean z, @NotNull Function0<Unit> function0, @NotNull isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, @NotNull findResAndMsg findresandmsg) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(window, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(isqueryrefinementenabled, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.IAuthTabCallbackDefault = window;
        this.onTransact = z;
        this.IAuthTabCallback = function0;
        this.onNavigationEvent = isqueryrefinementenabled;
        this.asInterface = findresandmsg;
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AFg1hSDK.onWarmupCompleted.onExtraCallbackWithResult(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public Window onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Window window = this.IAuthTabCallbackDefault;
        int i4 = i3 + 115;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return window;
    }

    public boolean ap_() {
        int i = 2 % 2;
        int i2 = access000 + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.asBinder;
        int i4 = i3 + 3;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void setContent(@NotNull CameraConfigBuilder cameraConfigBuilder, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        int i2 = access000 + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cameraConfigBuilder, "");
        Intrinsics.checkNotNullParameter(function2, "");
        onExtraCallbackWithResult(cameraConfigBuilder);
        onNavigationEvent(function2);
        this.asBinder = true;
        IAuthTabCallbackDefault();
        int i4 = access000 + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = access000 + 97;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-953369253);
        if ((i & 6) == 0) {
            int i7 = IAuthTabCallbackStub + 61;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 53 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i9 = access000 + 79;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-953369253, i2, -1, "im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.kt:204)");
            }
            onNavigationEvent().invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetDialogLayout$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = IAuthTabCallback + 115;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitIAuthTabCallback = ModalBottomSheetDialogLayout.IAuthTabCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i14 = onExtraCallbackWithResult + 55;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            int i11 = IAuthTabCallbackStub + 37;
            access000 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = access000 + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        onExtraCallbackWithResult();
        int i4 = access000 + 43;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        IAuthTabCallback();
        int i4 = IAuthTabCallbackStub + 71;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult() {
        int i;
        Object objRy_;
        int i2 = 2 % 2;
        if (!this.onTransact || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 25;
        access000 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            if (this.onExtraCallbackWithResult == null) {
                if (i >= 34) {
                    int i5 = i3 + 29;
                    access000 = i5 % 128;
                    if (i5 % 2 == 0) {
                        onWarmupCompleted.rz_(this.IAuthTabCallback, this.onNavigationEvent, this.asInterface);
                        throw null;
                    }
                    objRy_ = onWarmupCompleted.rz_(this.IAuthTabCallback, this.onNavigationEvent, this.asInterface);
                } else {
                    objRy_ = IAuthTabCallback.ry_(this.IAuthTabCallback);
                }
                this.onExtraCallbackWithResult = objRy_;
            }
            IAuthTabCallback.onNavigationEvent(this, this.onExtraCallbackWithResult);
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            IAuthTabCallback.onExtraCallback(this, this.onExtraCallbackWithResult);
        }
        Object obj = null;
        this.onExtraCallbackWithResult = null;
        int i4 = access000 + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = (Function2) this.onWarmupCompleted.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 39;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    private final void onNavigationEvent(Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.IAuthTabCallback(function2);
        int i4 = IAuthTabCallbackStub + 25;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
