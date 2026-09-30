package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import o.setOrientationDegrees;
import o.setRepeatMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setRepeatMode extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements completePendingScreenFlashClear, sortSupportedOutputSizes, ImmutableZoomState {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private hostOnly IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final onNavigationEvent onWarmupCompleted;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallback = 8;

    static {
        int i2 = onTransact + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = (~(i8 | i7)) | i2;
        int i10 = ~i7;
        int i11 = ~i2;
        int i12 = (~(i10 | i11)) | i4;
        int i13 = (~(i2 | i10 | i4)) | (~(i8 | i10 | i11)) | (~(i11 | i7 | i4));
        int i14 = i7 + i4 + i6 + ((-104759182) * i3) + ((-453318476) * i5);
        int i15 = i14 * i14;
        int i16 = (i7 * 1504131295) + 1805123584 + (1504131295 * i4) + (179255518 * i9) + ((-358511036) * i12) + ((-179255518) * i13) + (1324875776 * i6) + (711983104 * i3) + (1180696576 * i5) + (1022754816 * i15);
        int i17 = ((i7 * (-1431886989)) - 1507491630) + (i4 * (-1431886989)) + (i9 * (-122)) + (i12 * 244) + (i13 * 122) + (i6 * (-1431886867)) + (i3 * 722567050) + (i5 * (-1618605404)) + (i15 * 297664512);
        return i16 + ((i17 * i17) * (-277217280)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setRepeatMode setrepeatmode) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(setrepeatmode);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(setrepeatmode);
        int i4 = IAuthTabCallbackStub + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(setIso setiso, setOrientationDegrees setorientationdegrees) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onWarmupCompleted(setiso, setorientationdegrees);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(setiso, setorientationdegrees);
        int i4 = IAuthTabCallbackStub + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public setRepeatMode(@NotNull hostOnly hostonly) {
        Intrinsics.checkNotNullParameter(hostonly, "");
        this.IAuthTabCallback = hostonly;
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback.IAuthTabCallbackDefault();
        this.onWarmupCompleted = new onNavigationEvent();
    }

    public /* bridge */ void H_() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        super.H_();
        int i5 = IAuthTabCallbackStub + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final hostOnly asBinder() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 121;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        hostOnly hostonly = this.IAuthTabCallback;
        int i6 = i3 + 111;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return hostonly;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull hostOnly hostonly) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(hostonly, "");
        this.IAuthTabCallback = hostonly;
        int i5 = IAuthTabCallbackStub + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
    }

    public static final class onNavigationEvent implements ViewTreeObserver.OnPreDrawListener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        onNavigationEvent() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            setRepeatMode.this.asBinder().IAuthTabCallbackDefault();
            int i5 = onNavigationEvent + 7;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
            }
            return true;
        }
    }

    public void O_() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        super.O_();
        applyokhttp.Companion.IAuthTabCallback("TdsGlNode", "onAttach");
        IAuthTabCallbackStub();
        int i5 = IAuthTabCallbackStub + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ViewTreeObserver viewTreeObserver;
        setRepeatMode setrepeatmode = (setRepeatMode) objArr[0];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        View viewIAuthTabCallbackDefault = setrepeatmode.IAuthTabCallbackDefault();
        if (viewIAuthTabCallbackDefault != null && (viewTreeObserver = viewIAuthTabCallbackDefault.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(setrepeatmode.onWarmupCompleted);
            int i5 = IAuthTabCallbackStub + 17;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = IAuthTabCallbackStub + 37;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ViewTreeObserver viewTreeObserver;
        setRepeatMode setrepeatmode = (setRepeatMode) objArr[0];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        View viewIAuthTabCallbackDefault = setrepeatmode.IAuthTabCallbackDefault();
        if (viewIAuthTabCallbackDefault == null || (viewTreeObserver = viewIAuthTabCallbackDefault.getViewTreeObserver()) == null) {
            return null;
        }
        viewTreeObserver.removeOnPreDrawListener(setrepeatmode.onWarmupCompleted);
        int i5 = onNavigationEvent + 79;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        int i6 = 4 / 5;
        return null;
    }

    public void IAuthTabCallbackStub() {
        int i2 = 2 % 2;
        getTargetName.onNavigationEvent(this, new Function0() { // from class: im.toss.compose.widget.gl.TdsGlSourceNode$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    setRepeatMode.onExtraCallbackWithResult(this.f$0);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = setRepeatMode.onExtraCallbackWithResult(this.f$0);
                int i5 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i3 = onNavigationEvent + 29;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit IAuthTabCallback(setRepeatMode setrepeatmode) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        setrepeatmode.onExtraCallbackWithResult((View) isVideoSurface.onExtraCallbackWithResult(setrepeatmode, AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault()));
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -430523987, new Object[]{setrepeatmode}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback2, 430523988);
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public void asInterface() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            super.asInterface();
            applyokhttp.Companion.IAuthTabCallback("TdsGlNode", "onDetach");
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            onExtraCallbackWithResult(iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1694429275, new Object[]{this}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback2, -1694429275);
            int i4 = onNavigationEvent + 17;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.asInterface();
        applyokhttp.Companion.IAuthTabCallback("TdsGlNode", "onDetach");
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback4 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback3, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1694429275, new Object[]{this}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback4, -1694429275);
        throw null;
    }

    private static final Unit onWarmupCompleted(setIso setiso, setOrientationDegrees setorientationdegrees) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setiso.onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public void onExtraCallbackWithResult(@NotNull final setIso setiso) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        if (ExecutedBy.onExtraCallback(setiso.onExtraCallback().onNavigationEvent()).isHardwareAccelerated()) {
            this.IAuthTabCallback.IAuthTabCallback(setiso, new Function1() { // from class: im.toss.compose.widget.gl.TdsGlSourceNode$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 103;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnNavigationEvent = setRepeatMode.onNavigationEvent(setiso, (setOrientationDegrees) obj);
                    int i8 = onNavigationEvent + 51;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
        }
        setiso.onWarmupCompleted();
        int i5 = IAuthTabCallbackStub + 121;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private final View IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        View view = (View) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        int i5 = onNavigationEvent + 5;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(view);
            int i4 = 95 / 0;
        } else {
            this.onExtraCallbackWithResult.IAuthTabCallback(view);
        }
    }

    private final void access100() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1694429275, new Object[]{this}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback2, -1694429275);
    }

    private final void access000() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -430523987, new Object[]{this}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback2, 430523988);
    }
}
