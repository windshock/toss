package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.uikit.R;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getTypedExportedConstants;
import o.initMiniApp;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getTypedExportedConstants extends BrickModuleImplExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    public static final int IAuthTabCallbackStub = 8;
    private static int onTransact = 1;
    private Function0<Unit> onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private Function0<Unit> onNavigationEvent;
    private final boolean onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted);
        int i4 = IAuthTabCallback + 25;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onTransact = i2 % 128;
        return i2 % 2 == 0 ? 64 : 32;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getTypedExportedConstants(Context context, int i, boolean z, boolean z2, long j, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        boolean z3;
        boolean z4;
        if ((i2 & 2) != 0) {
            i3 = R.style.BottomSheetDialog;
            int i4 = onTransact + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            int i7 = IAuthTabCallback + 113;
            int i8 = i7 % 128;
            onTransact = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 31;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i2 & 8) != 0) {
            int i12 = onTransact + 91;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        this(context, i3, z3, z4, (i2 & 16) != 0 ? -1L : j, (i2 & 32) != 0 ? new Function1() { // from class: im.toss.uikit.widget.dialog.TdsBottomSheetV2$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i15 = 2 % 2;
                int i16 = onWarmupCompleted + 21;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                Unit unitIAuthTabCallback = getTypedExportedConstants.IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
                int i18 = onExtraCallback + 23;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                return unitIAuthTabCallback;
            }
        } : function1);
    }

    private static final Unit onWarmupCompleted(initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final int extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int state = getBehavior().getState();
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return state;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            Result.Companion companion = Result.Companion;
            getBehavior().setState(i);
            Result.m31constructorimpl(Unit.INSTANCE);
            int i5 = IAuthTabCallback + 65;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        this.onExtraCallbackWithResult = z;
        if (!z) {
            onWarmupCompleted(1.0f);
            return;
        }
        int i2 = IAuthTabCallback + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BrickModuleImplExternalSyntheticLambda0.onWarmupCompleted(new Object[]{this, Float.valueOf(0.0f), Integer.valueOf(1), null}, 771915676, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -771915661, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
        int i4 = onTransact + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final ViewGroup access000() {
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            viewGroup = (ViewGroup) findViewById(com.google.android.material.R.id.design_bottom_sheet);
            int i3 = 25 / 0;
        } else {
            viewGroup = (ViewGroup) findViewById(com.google.android.material.R.id.design_bottom_sheet);
        }
        int i4 = onTransact + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return viewGroup;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public getTypedExportedConstants(@NotNull Context context, int i, boolean z, boolean z2, long j, @NotNull Function1<? super initMiniApp.onWarmupCompleted, Unit> function1) {
        int i2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (z2) {
            int i3 = IAuthTabCallback + 75;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            i2 = 1;
        } else {
            int i6 = IAuthTabCallback + 95;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 4;
            } else {
                int i8 = 2 % 2;
            }
            i2 = -1;
        }
        super(context, false, !z, i2, i, j, function1, 2, null);
        this.onWarmupCompleted = z;
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(ICustomTabsCallback());
        }
    }

    @Override // o.BrickModuleImplExternalSyntheticLambda0
    public void onContentChanged() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.onContentChanged();
            getBehavior().setSkipCollapsed(this.onWarmupCompleted);
            int i3 = onTransact + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onContentChanged();
        getBehavior().setSkipCollapsed(this.onWarmupCompleted);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.BrickModuleImplExternalSyntheticLambda0
    public void dismiss() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0 ? extraCallback() == 5 : extraCallback() == 3) {
            onExtraCallbackWithResult();
            int i3 = onTransact + 109;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (getBehavior().isHideable()) {
            int i5 = onTransact + 43;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                onWarmupCompleted(3);
            } else {
                onWarmupCompleted(5);
            }
        }
        onExtraCallbackWithResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult() {
        View decorView;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Window window = getWindow();
        if (window != null) {
            int i4 = onTransact + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        if (decorView == null || (!ViewCompat.ICustomTabsCallbackStubProxy(decorView))) {
            return;
        }
        int i6 = IAuthTabCallback + 61;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        super.dismiss();
    }

    @Override // o.BrickModuleImplExternalSyntheticLambda0
    public void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = this.onNavigationEvent;
        if (function0 == null) {
            super.getInterfaceDescriptor();
            return;
        }
        int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        function0.invoke();
        if (i6 != 0) {
            int i7 = 83 / 0;
        }
    }

    @Override // o.BrickModuleImplExternalSyntheticLambda0
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            super.onBackPressed();
            Function0<Unit> function0 = this.onExtraCallback;
            if (function0 != null) {
                function0.invoke();
            }
            int i3 = IAuthTabCallback + 99;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        super.onBackPressed();
        throw null;
    }

    public final void onExtraCallback(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.onNavigationEvent = function0;
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
            this.onNavigationEvent = function0;
            throw null;
        }
    }

    public final void IAuthTabCallback(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback = function0;
        int i4 = IAuthTabCallback + 77;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }
}
