package im.toss.compose.v3.textfield.split;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.android.material.button.MaterialButton;
import im.toss.compose.v3.textfield.split.SplitTextField;
import im.toss.compose.v3.textfield.split.SplitTextField$;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.compat.component.TdsComposeView;
import im.toss.uikit.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplc;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraState;
import o.CameraUnavailableException;
import o.DefaultSurfaceProcessorExternalSyntheticLambda10;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LiveDataObservableExternalSyntheticLambda1;
import o.PreviewProcessorOnCaptureResultCallback;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.ResourceManagerInternalResourceManagerHooks;
import o.SearchView;
import o.SurfaceProcessorNodeOut;
import o.TimelineExternalSyntheticLambda1;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.addCameraErrorListener;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.createCameraCaptureCallback;
import o.filterResolutionsByAspectRatio;
import o.getBacktraceNote;
import o.getCurrentMenuItems;
import o.getMergedResolutions;
import o.getNumberOfTargets;
import o.getParentSizesThatAreTooLarge;
import o.getSupportedHighSpeedResolutionsFor;
import o.immediateFailedFuture;
import o.needToAddSensorResolutions;
import o.r8lambda4iPehIguYa_OQeAKv3agz_bCFQA;
import o.removeDuplicates;
import o.selectParentResolutions;
import o.setCacheComposition;
import o.setClipTextToBoundingBox;
import o.setContentInsetsRelative;
import o.setFailureListener;
import o.setFallbackResource;
import o.setFontAssetDelegate;
import o.setFontMap;
import o.setFrame;
import o.setIgnoreDisabledSystemAnimations;
import o.setMaxFrame;
import o.toMetersPerSecond;
import o.w7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SplitTextField extends TdsComposeView {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private final getSupportedHighSpeedResolutionsFor<Boolean> IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor<setCacheComposition.onWarmupCompleted> IAuthTabCallbackDefault;
    private final LiveDataObservableExternalSyntheticLambda1<getSupportedHighSpeedResolutionsFor<String>> IAuthTabCallbackStub;
    private final getSupportedHighSpeedResolutionsFor<onExtraCallback> IAuthTabCallbackStubProxy;
    private final getSupportedHighSpeedResolutionsFor<String> asBinder;
    private final getSupportedHighSpeedResolutionsFor<setCacheComposition.IAuthTabCallbackStub> asInterface;
    private final getSupportedHighSpeedResolutionsFor<String> onExtraCallbackWithResult;
    private final LiveDataObservableExternalSyntheticLambda1<setFontAssetDelegate> onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor<Boolean> onTransact;
    private final getSupportedHighSpeedResolutionsFor<Boolean> onWarmupCompleted;

    static {
        int i2 = getInterfaceDescriptor + 51;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitTextField(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitTextField(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~((~i6) | i7 | i3);
        int i9 = ~((~i7) | i6);
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i6));
        int i12 = ~(i10 | i7);
        int i13 = i6 + i7 + i5 + ((-1568348280) * i2) + (1617068012 * i4);
        int i14 = i13 * i13;
        int i15 = (((-430874860) * i6) - 739508224) + (1544986862 * i7) + (i8 * 987930861) + ((-987930861) * i11) + (987930861 * i12) + (557056000 * i5) + ((-1885339648) * i2) + (1743781888 * i4) + (858456064 * i14);
        int i16 = (i6 * (-973781596)) + 539565670 + (i7 * (-973779706)) + (i8 * 945) + (i11 * (-945)) + (i12 * 945) + ((-973780651) * i5) + (424585256 * i2) + (537576796 * i4) + (i14 * 1078394880);
        boolean z = true;
        if (i15 + (i16 * i16 * 192741376) != 1) {
            return onExtraCallback(objArr);
        }
        String str = (String) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i17 = 2 % 2;
        int i18 = access000 + 39;
        IAuthTabCallback_Parcel = i18 % 128;
        if (i18 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 61) != 65) {
                int i19 = access000 + 1;
                IAuthTabCallback_Parcel = i19 % 128;
                int i20 = i19 % 2;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i21 = IAuthTabCallback_Parcel + 19;
            access000 = i21 % 128;
            int i22 = i21 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1326335766, iIntValue, -1, "im.toss.compose.v3.textfield.split.SplitTextField.setField.<anonymous>.<anonymous>.<anonymous> (SplitTextField.kt:238)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i23 = access000 + 83;
                IAuthTabCallback_Parcel = i23 % 128;
                int i24 = i23 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(SplitTextField splitTextField, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Resources.NotFoundException {
        int i4 = 2 % 2;
        int i5 = access000 + 47;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(splitTextField, quirksExternalSyntheticBackport0, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 38 / 0;
        }
        int i8 = access000 + 115;
        IAuthTabCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 35;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsInterface = asInterface(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access000 + 99;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 59 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 105;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, str);
        if (i4 != 0) {
            int i5 = 83 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 73;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        if (i5 == 0) {
            return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -2049839265, 2049839265, objArr);
        }
        throw null;
    }

    private static final CharSequence onNavigationEvent(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 21;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = access000 + 13;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 109;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        Unit unit = (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1365518771, 1365518772, objArr);
        int i6 = IAuthTabCallback_Parcel + 101;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 43;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent(str);
        int i5 = IAuthTabCallback_Parcel + 17;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return charSequenceOnNavigationEvent;
    }

    private static final Unit onWarmupCompleted(SplitTextField splitTextField, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Resources.NotFoundException {
        int i4 = 2 % 2;
        int i5 = access000 + 1;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        splitTextField.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitTextField(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallbackStubProxy = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onExtraCallback.IAuthTabCallback.onExtraCallback, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult();
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult();
        this.asInterface = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        Boolean bool = Boolean.FALSE;
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setCacheComposition.onWarmupCompleted.APPEAR, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SplitTextField(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            int i4 = access000 + 109;
            IAuthTabCallback_Parcel = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            int i6 = IAuthTabCallback_Parcel + 83;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            i2 = 0;
        }
        this(context, attributeSet, i2);
    }

    public static abstract class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final int onNavigationEvent;

        public /* synthetic */ onExtraCallback(int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2);
        }

        public static final class IAuthTabCallback extends onExtraCallback {
            private static int IAuthTabCallback = 1;
            public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
            private static int onExtraCallbackWithResult;

            static {
                int i2 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }

            private IAuthTabCallback() {
                super(2, null);
            }
        }

        private onExtraCallback(int i2) {
            this.onNavigationEvent = i2;
        }

        public final int onExtraCallback() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 13;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            int i6 = this.onNavigationEvent;
            int i7 = i4 + 1;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        /* renamed from: im.toss.compose.v3.textfield.split.SplitTextField$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0038onExtraCallback extends onExtraCallback {
            public static final C0038onExtraCallback IAuthTabCallback = new C0038onExtraCallback();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            static {
                int i2 = onExtraCallbackWithResult + 115;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
            }

            private C0038onExtraCallback() {
                super(2, null);
            }
        }

        public static final class onNavigationEvent extends onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

            static {
                int i2 = IAuthTabCallback + 77;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onNavigationEvent() {
                super(2, null);
            }
        }

        public static final class onWarmupCompleted extends onExtraCallback {
            public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i2 = onWarmupCompleted + 31;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }

            private onWarmupCompleted() {
                super(2, null);
            }
        }

        public static final class onExtraCallbackWithResult extends onExtraCallback {
            private static int IAuthTabCallback = 1;
            public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
            private static int onNavigationEvent;

            static {
                int i2 = IAuthTabCallback + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }

            private onExtraCallbackWithResult() {
                super(4, null);
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 109;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Unit IAuthTabCallback(Resources resources, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Resources.NotFoundException {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(resources, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
            int i6 = IAuthTabCallback + 113;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return unitIAuthTabCallbackStub;
        }

        private static final Unit IAuthTabCallback(IAuthTabCallback iAuthTabCallback, String str, String str2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str3, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str4, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 107;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback.onNavigationEvent(str, str2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str3, z, onwarmupcompleted, str4, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
            Unit unit = Unit.INSTANCE;
            int i9 = IAuthTabCallback + 113;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallback(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, List list2, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) throws Resources.NotFoundException {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 111;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(iAuthTabCallback, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, list2, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            int i9 = IAuthTabCallback + 3;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                return unitOnNavigationEvent;
            }
            throw null;
        }

        private static final Unit IAuthTabCallback(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 31;
            IAuthTabCallback = i7 % 128;
            iAuthTabCallback.onExtraCallback(selectparentresolutions, selectparentresolutions2, (Function1<? super selectParentResolutions, Unit>) function1, (Function1<? super selectParentResolutions, Unit>) function12, quirksExternalSyntheticBackport0, (List<setFontAssetDelegate>) list, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, i7 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i2) : RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
            Unit unit = Unit.INSTANCE;
            int i8 = IAuthTabCallback + 63;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }

        public static /* synthetic */ Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Unit unitAsInterface = asInterface(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
            int i6 = IAuthTabCallback + 25;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return unitAsInterface;
        }

        public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 57;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return onActivityResized(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            }
            onActivityResized(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, selectParentResolutions selectparentresolutions, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(function1, selectparentresolutions, str, getsupportedhighspeedresolutionsfor);
            int i5 = onWarmupCompleted + 65;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unitOnWarmupCompleted;
            }
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {function1, setfontassetdelegate, selectparentresolutions};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
            if (i4 != 0) {
                throw null;
            }
            Unit unit = (Unit) onWarmupCompleted(objArr, iOnWarmupCompleted4, -1077781087, iOnWarmupCompleted2, iOnWarmupCompleted3, 1077781088, iOnWarmupCompleted);
            int i5 = onWarmupCompleted + 123;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitAccess100 = access100(getsupportedhighspeedresolutionsfor);
            int i5 = onWarmupCompleted + 5;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unitAccess100;
            }
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            Unit unit = (Unit) onWarmupCompleted(new Object[]{function1, getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), -992898357, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 992898375, iOnWarmupCompleted);
            int i5 = onWarmupCompleted + 117;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallbackDefault(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitExtraCallbackWithResult = extraCallbackWithResult(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            int i5 = IAuthTabCallback + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unitExtraCallbackWithResult;
            }
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallbackDefault(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            Unit unit = (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -2137060677, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 2137060677, iOnWarmupCompleted);
            int i5 = IAuthTabCallback + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public static /* synthetic */ Unit IAuthTabCallbackStub(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit interfaceDescriptor = getInterfaceDescriptor(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            if (i4 != 0) {
                int i5 = 15 / 0;
            }
            int i6 = onWarmupCompleted + 47;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return interfaceDescriptor;
            }
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallbackStub(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitMayLaunchUrl = mayLaunchUrl(function1, setfontassetdelegate, selectparentresolutions);
            int i5 = IAuthTabCallback + 93;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 60 / 0;
            }
            return unitMayLaunchUrl;
        }

        private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(function1, setfontassetdelegate, selectparentresolutions);
            int i5 = onWarmupCompleted + 39;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unitICustomTabsCallback_Parcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit IAuthTabCallbackStubProxy(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            Unit unit = (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -1635908165, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1635908191, iOnWarmupCompleted);
            int i5 = IAuthTabCallback + 41;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
            int iOnExtraCallbackWithResult;
            int iOnExtraCallbackWithResult2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[1];
            selectParentResolutions selectparentresolutions2 = (selectParentResolutions) objArr[2];
            Function1<? super selectParentResolutions, Unit> function1 = (Function1) objArr[3];
            Function1<? super selectParentResolutions, Unit> function12 = (Function1) objArr[4];
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[5];
            List<setFontAssetDelegate> list = (List) objArr[6];
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub = (setCacheComposition.IAuthTabCallbackStub) objArr[7];
            String str = (String) objArr[8];
            boolean zBooleanValue = ((Boolean) objArr[9]).booleanValue();
            setCacheComposition.onWarmupCompleted onwarmupcompleted = (setCacheComposition.onWarmupCompleted) objArr[10];
            String str2 = (String) objArr[11];
            boolean zBooleanValue2 = ((Boolean) objArr[12]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[13]).booleanValue();
            int iIntValue = ((Number) objArr[14]).intValue();
            int iIntValue2 = ((Number) objArr[15]).intValue();
            int iIntValue3 = ((Number) objArr[16]).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
            ((Number) objArr[18]).intValue();
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 121;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue);
                iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2);
            } else {
                iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1);
                iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2);
            }
            iAuthTabCallback.onWarmupCompleted(selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, zBooleanValue, onwarmupcompleted, str2, zBooleanValue2, zBooleanValue3, cameraCaptureResultEmptyCameraCaptureResult, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iIntValue3);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit ICustomTabsCallback(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 65;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return onMessageChannelReady(function1, setfontassetdelegate, selectparentresolutions);
            }
            onMessageChannelReady(function1, setfontassetdelegate, selectparentresolutions);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit access000(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return onMinimized(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            }
            onMinimized(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit access000(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 99;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            Unit unit = (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -1644363592, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1644363619, iOnWarmupCompleted);
            int i5 = onWarmupCompleted + 41;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit access100(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) throws Resources.NotFoundException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 71;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                writeTypedObject(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
                throw null;
            }
            Unit unitWriteTypedObject = writeTypedObject(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            int i4 = onWarmupCompleted + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitWriteTypedObject;
        }

        public static /* synthetic */ Unit access100(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            Unit unit = (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), 2069701008, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -2069700989, iOnWarmupCompleted);
            int i5 = IAuthTabCallback + 89;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return unit;
        }

        private static final Unit asBinder(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 115;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback.onExtraCallbackWithResult(selectparentresolutions, selectparentresolutions2, (Function1<? super selectParentResolutions, Unit>) function1, (Function1<? super selectParentResolutions, Unit>) function12, quirksExternalSyntheticBackport0, (List<setFontAssetDelegate>) list, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
            Unit unit = Unit.INSTANCE;
            int i9 = onWarmupCompleted + 3;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public static /* synthetic */ Unit asBinder(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            Object[] objArr = {function1, setfontassetdelegate, selectparentresolutions};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            Unit unit = (Unit) onWarmupCompleted(objArr, iOnWarmupCompleted4, -455154617, iOnWarmupCompleted2, iOnWarmupCompleted3, 455154625, iOnWarmupCompleted);
            int i5 = onWarmupCompleted + 19;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public static /* synthetic */ Unit asInterface(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            Unit unit = (Unit) onWarmupCompleted(new Object[]{function1, getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), 2009504280, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -2009504274, iOnWarmupCompleted);
            int i5 = IAuthTabCallback + 119;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public static /* synthetic */ Unit asInterface(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(function1, setfontassetdelegate, selectparentresolutions);
            int i5 = IAuthTabCallback + 53;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unitICustomTabsCallbackStubProxy;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object extraCallback(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            Function1<? super String, Unit> function1 = (Function1) objArr[3];
            Function1<? super String, Unit> function12 = (Function1) objArr[4];
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[5];
            List<setFontAssetDelegate> list = (List) objArr[6];
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub = (setCacheComposition.IAuthTabCallbackStub) objArr[7];
            String str3 = (String) objArr[8];
            boolean zBooleanValue = ((Boolean) objArr[9]).booleanValue();
            setCacheComposition.onWarmupCompleted onwarmupcompleted = (setCacheComposition.onWarmupCompleted) objArr[10];
            String str4 = (String) objArr[11];
            boolean zBooleanValue2 = ((Boolean) objArr[12]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[13]).booleanValue();
            int iIntValue = ((Number) objArr[14]).intValue();
            int iIntValue2 = ((Number) objArr[15]).intValue();
            int iIntValue3 = ((Number) objArr[16]).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
            ((Number) objArr[18]).intValue();
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iAuthTabCallback.onExtraCallback(str, str2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str3, zBooleanValue, onwarmupcompleted, str4, zBooleanValue2, zBooleanValue3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2), iIntValue3);
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 105;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit extraCallback(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 105;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnUnminimized = onUnminimized(function1, setfontassetdelegate, selectparentresolutions);
            if (i4 != 0) {
                int i5 = 70 / 0;
            }
            return unitOnUnminimized;
        }

        public static /* synthetic */ Unit extraCallbackWithResult(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitNewAuthTabSession = newAuthTabSession(function1, setfontassetdelegate, selectparentresolutions);
            if (i4 == 0) {
                int i5 = 88 / 0;
            }
            int i6 = onWarmupCompleted + 119;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return unitNewAuthTabSession;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Resources.NotFoundException {
            Function1 function1 = (Function1) objArr[0];
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 57;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onActivityLayout(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
                throw null;
            }
            Unit unitOnActivityLayout = onActivityLayout(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            int i4 = IAuthTabCallback + 3;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnActivityLayout;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit getInterfaceDescriptor(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(function1, setfontassetdelegate, selectparentresolutions);
            int i5 = IAuthTabCallback + 19;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unitICustomTabsCallbackDefault;
        }

        private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
            String str = (String) objArr[0];
            RowScope rowScope = (RowScope) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 53;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            Unit unit = (Unit) onWarmupCompleted(new Object[]{str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, zzgsa.onWarmupCompleted(), -394433852, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 394433866, zzgsa.onWarmupCompleted());
            int i4 = IAuthTabCallback + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onExtraCallback(Resources resources, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Resources.NotFoundException {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Unit unitAsInterface = asInterface(resources, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
            int i6 = IAuthTabCallback + 1;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 79 / 0;
            }
            return unitAsInterface;
        }

        public static /* synthetic */ Unit onExtraCallback(IAuthTabCallback iAuthTabCallback, String str, String str2, String str3, String str4, Function1 function1, Function1 function12, Function1 function13, Function1 function14, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str5, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str6, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 23;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                onWarmupCompleted(iAuthTabCallback, str, str2, str3, str4, function1, function12, function13, function14, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str5, z, onwarmupcompleted, str6, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
                throw null;
            }
            Unit unitOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, str, str2, str3, str4, function1, function12, function13, function14, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str5, z, onwarmupcompleted, str6, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            int i8 = onWarmupCompleted + 97;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return unitOnWarmupCompleted;
        }

        private static final Unit onExtraCallback(IAuthTabCallback iAuthTabCallback, String str, String str2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, List list2, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str3, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str4, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) throws Resources.NotFoundException {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 79;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback.onWarmupCompleted(str, str2, function1, function12, quirksExternalSyntheticBackport0, list, list2, iAuthTabCallbackStub, str3, z, onwarmupcompleted, str4, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
            Unit unit = Unit.INSTANCE;
            int i9 = onWarmupCompleted + 5;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onExtraCallback(IAuthTabCallback iAuthTabCallback, String str, String str2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str3, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str4, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 23;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, str, str2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str3, z, onwarmupcompleted, str4, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            int i9 = IAuthTabCallback + 71;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 75;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return asBinder(iAuthTabCallback, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            }
            asBinder(iAuthTabCallback, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, selectParentResolutions selectparentresolutions3, Function1 function1, Function1 function12, Function1 function13, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 99;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback, selectparentresolutions, selectparentresolutions2, selectparentresolutions3, function1, function12, function13, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            int i9 = IAuthTabCallback + 45;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                return unitOnExtraCallbackWithResult;
            }
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
            int i6 = onWarmupCompleted + 13;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return unitIAuthTabCallbackStubProxy;
            }
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(List list, Function1 function1, selectParentResolutions selectparentresolutions, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, r8lambda4iPehIguYa_OQeAKv3agz_bCFQA r8lambda4ipehiguya_oqeakv3agz_bcfqa, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return onExtraCallbackWithResult(list, function1, selectparentresolutions, getsupportedhighspeedresolutionsfor, r8lambda4ipehiguya_oqeakv3agz_bcfqa, cameraCaptureResultEmptyCameraCaptureResult, i2);
            }
            onExtraCallbackWithResult(list, function1, selectparentresolutions, getsupportedhighspeedresolutionsfor, r8lambda4ipehiguya_oqeakv3agz_bcfqa, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            int i5 = onWarmupCompleted + 49;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unitIAuthTabCallbackStubProxy;
        }

        public static /* synthetic */ Unit onExtraCallback(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 57;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onRelationshipValidationResult(function1, setfontassetdelegate, selectparentresolutions);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(function1, setfontassetdelegate, selectparentresolutions);
            int i4 = onWarmupCompleted + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnRelationshipValidationResult;
        }

        public static /* synthetic */ Unit onExtraCallback(setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                onWarmupCompleted(iAuthTabCallbackStub, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnWarmupCompleted = onWarmupCompleted(iAuthTabCallbackStub, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
            int i5 = IAuthTabCallback + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 42 / 0;
            }
            return unitOnWarmupCompleted;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            Function1 function1 = (Function1) objArr[3];
            Function1 function12 = (Function1) objArr[4];
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[5];
            List list = (List) objArr[6];
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub = (setCacheComposition.IAuthTabCallbackStub) objArr[7];
            String str3 = (String) objArr[8];
            boolean zBooleanValue = ((Boolean) objArr[9]).booleanValue();
            setCacheComposition.onWarmupCompleted onwarmupcompleted = (setCacheComposition.onWarmupCompleted) objArr[10];
            String str4 = (String) objArr[11];
            boolean zBooleanValue2 = ((Boolean) objArr[12]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[13]).booleanValue();
            int iIntValue = ((Number) objArr[14]).intValue();
            int iIntValue2 = ((Number) objArr[15]).intValue();
            int iIntValue3 = ((Number) objArr[16]).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
            int iIntValue4 = ((Number) objArr[18]).intValue();
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 25;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = (Unit) onWarmupCompleted(new Object[]{iAuthTabCallback, str, str2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str3, Boolean.valueOf(zBooleanValue), onwarmupcompleted, str4, Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue4)}, zzgsa.onWarmupCompleted(), -1803727751, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1803727774, zzgsa.onWarmupCompleted());
            int i5 = IAuthTabCallback + 125;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, String str, String str2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str3, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str4, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 119;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            Unit unitOnTransact = onTransact(iAuthTabCallback, str, str2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str3, z, onwarmupcompleted, str4, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            if (i8 == 0) {
                int i9 = 17 / 0;
            }
            return unitOnTransact;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 91;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            int i9 = IAuthTabCallback + 117;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return unitIAuthTabCallback;
        }

        private static final Unit onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, selectParentResolutions selectparentresolutions3, Function1 function1, Function1 function12, Function1 function13, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 45;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback.onWarmupCompleted(selectparentresolutions, selectparentresolutions2, selectparentresolutions3, (Function1<? super selectParentResolutions, Unit>) function1, (Function1<? super selectParentResolutions, Unit>) function12, (Function1<? super selectParentResolutions, Unit>) function13, quirksExternalSyntheticBackport0, (List<setFontAssetDelegate>) list, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
            Unit unit = Unit.INSTANCE;
            int i9 = onWarmupCompleted + 5;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }

        private static final Unit onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, selectParentResolutions selectparentresolutions3, selectParentResolutions selectparentresolutions4, Function1 function1, Function1 function12, Function1 function13, Function1 function14, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 63;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback.IAuthTabCallback(selectparentresolutions, selectparentresolutions2, selectparentresolutions3, selectparentresolutions4, function1, function12, function13, function14, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
            Unit unit = Unit.INSTANCE;
            int i9 = IAuthTabCallback + 113;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Unit unitAsBinder = asBinder(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
            int i6 = IAuthTabCallback + 51;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return unitAsBinder;
            }
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(iAuthTabCallbackStub, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
            int i6 = onWarmupCompleted + 79;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        private static final Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, List list2, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) throws Resources.NotFoundException {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 39;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                Object[] objArr = {iAuthTabCallback, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, list2, iAuthTabCallbackStub, str, Boolean.valueOf(z), onwarmupcompleted, str2, Boolean.valueOf(z2), Boolean.valueOf(z3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i3)), Integer.valueOf(i4)};
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -773824889, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 773824891, iOnWarmupCompleted);
            } else {
                Object[] objArr2 = {iAuthTabCallback, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, list2, iAuthTabCallbackStub, str, Boolean.valueOf(z), onwarmupcompleted, str2, Boolean.valueOf(z2), Boolean.valueOf(z3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i3)), Integer.valueOf(i4)};
                int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
                onWarmupCompleted(objArr2, zzgsa.onWarmupCompleted(), -773824889, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 773824891, iOnWarmupCompleted2);
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onWarmupCompleted + 15;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 25;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr = {iAuthTabCallback, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, Boolean.valueOf(z), onwarmupcompleted, str2, Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            Unit unit = (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), 830615256, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -830615234, iOnWarmupCompleted);
            int i9 = IAuthTabCallback + 39;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, selectParentResolutions selectparentresolutions3, selectParentResolutions selectparentresolutions4, Function1 function1, Function1 function12, Function1 function13, Function1 function14, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 27;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback, selectparentresolutions, selectparentresolutions2, selectparentresolutions3, selectparentresolutions4, function1, function12, function13, function14, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, z, onwarmupcompleted, str2, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            int i9 = onWarmupCompleted + 95;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                return unitOnExtraCallbackWithResult;
            }
            throw null;
        }

        private static final Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, selectParentResolutions selectparentresolutions3, selectParentResolutions selectparentresolutions4, Function1 function1, Function1 function12, Function1 function13, Function1 function14, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 111;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback.IAuthTabCallback(selectparentresolutions, selectparentresolutions2, selectparentresolutions3, selectparentresolutions4, (Function1<? super selectParentResolutions, Unit>) function1, (Function1<? super selectParentResolutions, Unit>) function12, (Function1<? super selectParentResolutions, Unit>) function13, (Function1<? super selectParentResolutions, Unit>) function14, quirksExternalSyntheticBackport0, (List<setFontAssetDelegate>) list, iAuthTabCallbackStub, str, z, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
            Unit unit = Unit.INSTANCE;
            int i9 = onWarmupCompleted + 65;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onNavigationEvent(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 23;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                extraCallback(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
                obj.hashCode();
                throw null;
            }
            Unit unitExtraCallback = extraCallback(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unitExtraCallback;
            }
            throw null;
        }

        public static /* synthetic */ Unit onNavigationEvent(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return onActivityLayout(function1, setfontassetdelegate, selectparentresolutions);
            }
            onActivityLayout(function1, setfontassetdelegate, selectparentresolutions);
            throw null;
        }

        public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, zzgsa.onWarmupCompleted(), -1087555448, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1087555465, iOnWarmupCompleted);
            }
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            throw null;
        }

        private static final Unit onTransact(IAuthTabCallback iAuthTabCallback, String str, String str2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str3, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str4, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 29;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback.onExtraCallbackWithResult(str, str2, (Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12, quirksExternalSyntheticBackport0, (List<setFontAssetDelegate>) list, iAuthTabCallbackStub, str3, z, onwarmupcompleted, str4, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
            Unit unit = Unit.INSTANCE;
            int i9 = IAuthTabCallback + 123;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onTransact(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            Unit unit = (Unit) onWarmupCompleted(new Object[]{function1, getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), 150533055, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -150533043, iOnWarmupCompleted);
            int i5 = IAuthTabCallback + 7;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 41 / 0;
            }
            return unit;
        }

        public static /* synthetic */ Unit onTransact(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit typedObject = readTypedObject(function1, setfontassetdelegate, selectparentresolutions);
            if (i4 == 0) {
                int i5 = 62 / 0;
            }
            int i6 = IAuthTabCallback + 97;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return typedObject;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Resources.NotFoundException {
            Resources resources = (Resources) objArr[0];
            RowScope rowScope = (RowScope) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 31;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return asBinder(resources, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            asBinder(resources, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onWarmupCompleted(IAuthTabCallback iAuthTabCallback, String str, String str2, String str3, String str4, Function1 function1, Function1 function12, Function1 function13, Function1 function14, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str5, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str6, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 3;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            iAuthTabCallback.onWarmupCompleted(str, str2, str3, str4, (Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12, (Function1<? super String, Unit>) function13, (Function1<? super String, Unit>) function14, quirksExternalSyntheticBackport0, (List<setFontAssetDelegate>) list, iAuthTabCallbackStub, str5, z, onwarmupcompleted, str6, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
            Unit unit = Unit.INSTANCE;
            int i9 = IAuthTabCallback + 103;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 45 / 0;
            }
            return unit;
        }

        public static /* synthetic */ Unit onWarmupCompleted(IAuthTabCallback iAuthTabCallback, String str, String str2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, List list2, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str3, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str4, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) throws Resources.NotFoundException {
            int i6 = 2 % 2;
            int i7 = onWarmupCompleted + 27;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                onExtraCallback(iAuthTabCallback, str, str2, function1, function12, quirksExternalSyntheticBackport0, list, list2, iAuthTabCallbackStub, str3, z, onwarmupcompleted, str4, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
                throw null;
            }
            Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallback, str, str2, function1, function12, quirksExternalSyntheticBackport0, list, list2, iAuthTabCallbackStub, str3, z, onwarmupcompleted, str4, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            int i8 = IAuthTabCallback + 43;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return unitOnExtraCallback;
        }

        public static /* synthetic */ Unit onWarmupCompleted(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, selectParentResolutions selectparentresolutions3, selectParentResolutions selectparentresolutions4, Function1 function1, Function1 function12, Function1 function13, Function1 function14, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            int i6 = 2 % 2;
            int i7 = IAuthTabCallback + 63;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(iAuthTabCallback, selectparentresolutions, selectparentresolutions2, selectparentresolutions3, selectparentresolutions4, function1, function12, function13, function14, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, z, z2, z3, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            if (i8 == 0) {
                int i9 = 18 / 0;
            }
            return unitOnNavigationEvent;
        }

        public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnMessageChannelReady = onMessageChannelReady(function1, getsupportedhighspeedresolutionsfor, selectparentresolutions);
            int i5 = IAuthTabCallback + 55;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unitOnMessageChannelReady;
            }
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 35;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return ICustomTabsCallbackStub(function1, setfontassetdelegate, selectparentresolutions);
            }
            ICustomTabsCallbackStub(function1, setfontassetdelegate, selectparentresolutions);
            throw null;
        }

        private static /* synthetic */ Object readTypedObject(Object[] objArr) {
            String str = (String) objArr[0];
            RowScope rowScope = (RowScope) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 107;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            Unit unit = (Unit) onWarmupCompleted(new Object[]{str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, zzgsa.onWarmupCompleted(), -1511648598, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1511648623, zzgsa.onWarmupCompleted());
            int i4 = onWarmupCompleted + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit writeTypedObject(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnMinimized = onMinimized(function1, setfontassetdelegate, selectparentresolutions);
            int i5 = onWarmupCompleted + 25;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unitOnMinimized;
        }

        public static final class onNavigationEvent implements setCacheComposition.IAuthTabCallbackDefault {
            private static final byte[] $$a = {125, 44, 8, -98};
            private static final int $$b = 251;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onWarmupCompleted = 0;
            private static int onExtraCallbackWithResult = 1;
            private static char[] IAuthTabCallback = {60860, 10271, 26334, 48281, 64347, 12629, 20353, 34242, 49247, 7703, 21699, 37525, 43337, 59140, 15752, 31633, 46667, 52232, 2761, 16599, 40785, 54546, 5009, 10644, 25695, 41500, 63708, 13954, 19743, 35591, 49624, 8082, 23067, 36991, 44786, 58598, 9057, 31020, 47073, 52643, 2081, 17954, 40176, 55987, 4463, 12080, 26027, 41889, 65131, 13356, 29428, 35060, 51061, 7472, 23536, 37298, 44082, 59939, 8444, 32438};
            private static long onNavigationEvent = 4636264624488720491L;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(int i2, int i3, byte b) {
                int i4;
                int i5 = (b * 4) + 97;
                int i6 = i3 * 3;
                byte[] bArr = $$a;
                int i7 = (i2 * 2) + 4;
                byte[] bArr2 = new byte[1 - i6];
                int i8 = 0 - i6;
                if (bArr == null) {
                    int i9 = i8;
                    int i10 = 0;
                    i5 = (-i5) + i9;
                    i7++;
                    i4 = i10;
                    bArr2[i4] = (byte) i5;
                    if (i4 == i8) {
                        return new String(bArr2, 0);
                    }
                    int i11 = i4 + 1;
                    i9 = i5;
                    i5 = bArr[i7];
                    i10 = i11;
                    i5 = (-i5) + i9;
                    i7++;
                    i4 = i10;
                    bArr2[i4] = (byte) i5;
                    if (i4 == i8) {
                    }
                } else {
                    i4 = 0;
                    bArr2[i4] = (byte) i5;
                    if (i4 == i8) {
                    }
                }
            }

            private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
                long[] jArr = new long[i3];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
                    int i5 = $11 + 67;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                        try {
                            Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i2 * i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 59698), 17 - Color.red(0), Color.blue(0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getLongPressTimeout() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, 1494 - TextUtils.getOffsetAfter("", 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                        Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i2 + i7])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 59649), (Process.myTid() >> 22) + 17, 10973 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46134), 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback6 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 44, 1542 - AndroidCharacter.getMirror('0'), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback6).invoke(null, objArr7);
                    }
                }
                char[] cArr = new char[i3];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback7 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, 1494 - (Process.myTid() >> 22), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback7).invoke(null, objArr8);
                    int i8 = $10 + 27;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                }
                objArr[0] = new String(cArr);
            }

            onNavigationEvent() {
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void IAuthTabCallback(RowScope rowScope, String str, boolean z, boolean z2, boolean z3, ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, SearchView searchView, Function1<? super String, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(resourceManagerInternalResourceManagerHooks, "");
                    Intrinsics.checkNotNullParameter(searchView, "");
                    Intrinsics.checkNotNullParameter(function1, "");
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-913420098);
                    int i5 = 24 / 0;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i6 = onWarmupCompleted + 25;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-913420098, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Phone.<no name provided>.Content (SplitTextField.kt:699)");
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-913420098, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Phone.<no name provided>.Content (SplitTextField.kt:699)");
                    }
                } else {
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(resourceManagerInternalResourceManagerHooks, "");
                    Intrinsics.checkNotNullParameter(searchView, "");
                    Intrinsics.checkNotNullParameter(function1, "");
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-913420098);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                Object[] objArr = new Object[1];
                a(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 61 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 54, 508);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onWarmupCompleted + 125;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i9 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
            }
        }

        private IAuthTabCallback() {
        }

        private static final Unit onMinimized(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 29;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                IAuthTabCallbackStubProxy(getsupportedhighspeedresolutionsfor, selectparentresolutions);
                function1.invoke(selectparentresolutions.onNavigationEvent());
                unit = Unit.INSTANCE;
                int i4 = 63 / 0;
            } else {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                IAuthTabCallbackStubProxy(getsupportedhighspeedresolutionsfor, selectparentresolutions);
                function1.invoke(selectparentresolutions.onNavigationEvent());
                unit = Unit.INSTANCE;
            }
            int i5 = IAuthTabCallback + 83;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static final Unit onActivityResized(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 125;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            access000(getsupportedhighspeedresolutionsfor, selectparentresolutions);
            function1.invoke(selectparentresolutions.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 75;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:101:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0330  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x03a7  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x03c4  */
        /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0143  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallbackWithResult(@NotNull final String str, @NotNull final String str2, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super String, Unit> function12, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str3, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str4, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int iOrdinal;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            boolean z4;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final List<setFontAssetDelegate> list2;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            final String str5;
            final boolean z5;
            final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            final String str6;
            final boolean z6;
            final boolean z7;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            Object obj;
            int i18;
            int i19 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1698333495);
            Object obj2 = null;
            if ((i2 & 6) == 0) {
                int i20 = IAuthTabCallback + 57;
                onWarmupCompleted = i20 % 128;
                if (i20 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                    obj2.hashCode();
                    throw null;
                }
                i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
            }
            int i21 = 128;
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
            }
            int i22 = 1024;
            if ((i2 & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                    int i23 = IAuthTabCallback + 1;
                    onWarmupCompleted = i23 % 128;
                    int i24 = i23 % 2;
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i5 |= i18;
            }
            int i25 = i4 & 16;
            if (i25 != 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
                }
                i6 = i4 & 32;
                if (i6 == 0) {
                    int i26 = onWarmupCompleted + 125;
                    IAuthTabCallback = i26 % 128;
                    int i27 = i26 % 2;
                    i5 |= 196608;
                } else {
                    if ((i2 & 196608) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 131072 : 65536;
                    }
                    i7 = i4 & 64;
                    if (i7 != 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub))) {
                            int i28 = onWarmupCompleted + 81;
                            IAuthTabCallback = i28 % 128;
                            int i29 = i28 % 2;
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i5 |= i8;
                    }
                    i9 = i4 & 128;
                    if (i9 != 0) {
                        i5 |= 12582912;
                    } else {
                        if ((12582912 & i2) == 0) {
                            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 8388608 : 4194304;
                        }
                        i10 = i4 & 256;
                        if (i10 == 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 67108864 : 33554432;
                            }
                            i11 = i4 & 512;
                            if (i11 != 0) {
                                int i30 = onWarmupCompleted + 103;
                                IAuthTabCallback = i30 % 128;
                                int i31 = i30 % 2;
                                i12 = 805306368;
                            } else {
                                if ((805306368 & i2) == 0) {
                                    int i32 = IAuthTabCallback + 65;
                                    onWarmupCompleted = i32 % 128;
                                    if (i32 % 2 == 0) {
                                        int i33 = 1 / 0;
                                        iOrdinal = onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal();
                                    } else if (onwarmupcompleted == null) {
                                    }
                                    i12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 536870912 : 268435456;
                                }
                                i13 = i4 & 1024;
                                if (i13 == 0) {
                                    i14 = i3 | 6;
                                } else if ((i3 & 6) == 0) {
                                    i14 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 4 : 2);
                                } else {
                                    i14 = i3;
                                }
                                i15 = i4 & 2048;
                                if (i15 == 0) {
                                    i14 |= 48;
                                } else if ((i3 & 48) == 0) {
                                    i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
                                }
                                int i34 = i14;
                                i16 = i4 & 4096;
                                if (i16 != 0) {
                                    if ((i3 & 384) == 0) {
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3)) {
                                            int i35 = onWarmupCompleted + 63;
                                            IAuthTabCallback = i35 % 128;
                                            i21 = i35 % 2 != 0 ? 27675 : 256;
                                        }
                                        i17 = i34 | i21;
                                    }
                                    if ((i3 & 3072) == 0) {
                                        int i36 = IAuthTabCallback + 107;
                                        onWarmupCompleted = i36 % 128;
                                        if (i36 % 2 == 0) {
                                            i22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 2048 : 28646;
                                            i17 |= i22;
                                        } else {
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                                            }
                                            i17 |= i22;
                                        }
                                    }
                                    if ((306783379 & i5) == 306783378 && (i17 & 1171) == 1170) {
                                        int i37 = IAuthTabCallback + 5;
                                        onWarmupCompleted = i37 % 128;
                                        int i38 = i37 % 2;
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i25 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                        List<setFontAssetDelegate> listEmptyList = i6 != 0 ? CollectionsKt.emptyList() : list;
                                        setCacheComposition.IAuthTabCallbackStub onnavigationevent = i7 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                                        String str7 = i9 != 0 ? null : str3;
                                        boolean z8 = i10 != 0 ? false : z;
                                        setCacheComposition.onWarmupCompleted onwarmupcompleted3 = i11 != 0 ? setCacheComposition.onWarmupCompleted.APPEAR : onwarmupcompleted;
                                        String str8 = i13 != 0 ? null : str4;
                                        boolean z9 = i15 != 0 ? false : z2;
                                        boolean z10 = i16 != 0 ? true : z3;
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1698333495, i5, i17, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RrnFirst7 (SplitTextField.kt:274)");
                                        }
                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted4 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                        if (objOnMinimized == onwarmupcompleted4.onExtraCallback()) {
                                            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        }
                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                                        selectParentResolutions selectparentresolutionsOnExtraCallback = selectParentResolutions.onExtraCallback(readTypedObject((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor), str, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized2 == onwarmupcompleted4.onExtraCallback()) {
                                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str2, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                        }
                                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                                        selectParentResolutions selectparentresolutionsOnExtraCallback2 = selectParentResolutions.onExtraCallback(extraCallback((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor2), str2, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                        boolean z11 = (i5 & 896) == 256;
                                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!z11) {
                                            Object obj3 = objOnMinimized3;
                                            if (objOnMinimized3 == onwarmupcompleted4.onExtraCallback()) {
                                                Object obj4 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda12
                                                    private static int IAuthTabCallback = 0;
                                                    private static int onExtraCallbackWithResult = 1;

                                                    public final Object invoke(Object obj5) {
                                                        int i39 = 2 % 2;
                                                        int i40 = IAuthTabCallback + 21;
                                                        onExtraCallbackWithResult = i40 % 128;
                                                        int i41 = i40 % 2;
                                                        Unit unitAccess000 = SplitTextField.IAuthTabCallback.access000(function1, getsupportedhighspeedresolutionsfor, (selectParentResolutions) obj5);
                                                        int i42 = IAuthTabCallback + 13;
                                                        onExtraCallbackWithResult = i42 % 128;
                                                        int i43 = i42 % 2;
                                                        return unitAccess000;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj4);
                                                obj3 = obj4;
                                            }
                                            Function1<? super selectParentResolutions, Unit> function13 = (Function1) obj3;
                                            boolean z12 = (i5 & 7168) == 2048;
                                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (z12 || objOnMinimized4 == onwarmupcompleted4.onExtraCallback()) {
                                                Object obj5 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda13
                                                    private static int IAuthTabCallback = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj6) {
                                                        int i39 = 2 % 2;
                                                        int i40 = onWarmupCompleted + 19;
                                                        IAuthTabCallback = i40 % 128;
                                                        int i41 = i40 % 2;
                                                        Function1 function14 = function12;
                                                        if (i41 != 0) {
                                                            return SplitTextField.IAuthTabCallback.IAuthTabCallback(function14, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj6);
                                                        }
                                                        Unit unitIAuthTabCallback = SplitTextField.IAuthTabCallback.IAuthTabCallback(function14, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj6);
                                                        int i42 = 88 / 0;
                                                        return unitIAuthTabCallback;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj5);
                                                obj = obj5;
                                            } else {
                                                obj = objOnMinimized4;
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            onExtraCallbackWithResult(selectparentresolutionsOnExtraCallback, selectparentresolutionsOnExtraCallback2, function13, (Function1<? super selectParentResolutions, Unit>) obj, quirksExternalSyntheticBackport03, listEmptyList, onnavigationevent, str7, z8, onwarmupcompleted3, str8, z9, z10, cameraCaptureResultEmptyCameraCaptureResult2, i5 & 2147475456, i17 & 8190, 0);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                            list2 = listEmptyList;
                                            iAuthTabCallbackStub2 = onnavigationevent;
                                            str5 = str7;
                                            z5 = z8;
                                            onwarmupcompleted2 = onwarmupcompleted3;
                                            str6 = str8;
                                            z6 = z9;
                                            z7 = z10;
                                        }
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                        list2 = list;
                                        iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                        str5 = str3;
                                        z5 = z;
                                        onwarmupcompleted2 = onwarmupcompleted;
                                        str6 = str4;
                                        z6 = z2;
                                        z7 = z3;
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda14
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i39 = 2 % 2;
                                                int i40 = IAuthTabCallback + 37;
                                                onExtraCallbackWithResult = i40 % 128;
                                                int i41 = i40 % 2;
                                                Unit unitOnExtraCallbackWithResult = SplitTextField.IAuthTabCallback.onExtraCallbackWithResult(this.f$0, str, str2, function1, function12, quirksExternalSyntheticBackport02, list2, iAuthTabCallbackStub2, str5, z5, onwarmupcompleted2, str6, z6, z7, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                                int i42 = IAuthTabCallback + 119;
                                                onExtraCallbackWithResult = i42 % 128;
                                                if (i42 % 2 != 0) {
                                                    return unitOnExtraCallbackWithResult;
                                                }
                                                throw null;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                int i39 = onWarmupCompleted + 35;
                                IAuthTabCallback = i39 % 128;
                                int i40 = i39 % 2;
                                i34 |= 384;
                                i17 = i34;
                                if ((i3 & 3072) == 0) {
                                }
                                if ((306783379 & i5) == 306783378) {
                                    z4 = true;
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i5 |= i12;
                            i13 = i4 & 1024;
                            if (i13 == 0) {
                            }
                            i15 = i4 & 2048;
                            if (i15 == 0) {
                            }
                            int i342 = i14;
                            i16 = i4 & 4096;
                            if (i16 != 0) {
                            }
                            i17 = i342;
                            if ((i3 & 3072) == 0) {
                            }
                            if ((306783379 & i5) == 306783378) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i11 = i4 & 512;
                        if (i11 != 0) {
                        }
                        i5 |= i12;
                        i13 = i4 & 1024;
                        if (i13 == 0) {
                        }
                        i15 = i4 & 2048;
                        if (i15 == 0) {
                        }
                        int i3422 = i14;
                        i16 = i4 & 4096;
                        if (i16 != 0) {
                        }
                        i17 = i3422;
                        if ((i3 & 3072) == 0) {
                        }
                        if ((306783379 & i5) == 306783378) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i10 = i4 & 256;
                    if (i10 == 0) {
                    }
                    i11 = i4 & 512;
                    if (i11 != 0) {
                    }
                    i5 |= i12;
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                    }
                    i15 = i4 & 2048;
                    if (i15 == 0) {
                    }
                    int i34222 = i14;
                    i16 = i4 & 4096;
                    if (i16 != 0) {
                    }
                    i17 = i34222;
                    if ((i3 & 3072) == 0) {
                    }
                    if ((306783379 & i5) == 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i7 = i4 & 64;
                if (i7 != 0) {
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                }
                i10 = i4 & 256;
                if (i10 == 0) {
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                }
                i5 |= i12;
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                i15 = i4 & 2048;
                if (i15 == 0) {
                }
                int i342222 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                }
                i17 = i342222;
                if ((i3 & 3072) == 0) {
                }
                if ((306783379 & i5) == 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i4 & 32;
            if (i6 == 0) {
            }
            i7 = i4 & 64;
            if (i7 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 == 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i5 |= i12;
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            i15 = i4 & 2048;
            if (i15 == 0) {
            }
            int i3422222 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            i17 = i3422222;
            if ((i3 & 3072) == 0) {
            }
            if ((306783379 & i5) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }

        private static final Unit newAuthTabSession(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i5 = IAuthTabCallback + 105;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit IAuthTabCallback(setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            boolean z;
            int i3;
            int i4;
            int i5 = 2 % 2;
            int i6 = IAuthTabCallback + 57;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.checkNotNullParameter(rowScope, "");
                z = (i2 & 48) != 101;
            } else {
                Intrinsics.checkNotNullParameter(rowScope, "");
                if ((i2 & 17) != 16) {
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1982347128, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RrnFirst7.<anonymous> (SplitTextField.kt:332)");
                }
                if (iAuthTabCallbackStub instanceof setCacheComposition.IAuthTabCallbackStub.onNavigationEvent) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1929886796);
                    i3 = R.string.uikit_rrn_text_field_label_birthday;
                    i4 = onWarmupCompleted + 111;
                    IAuthTabCallback = i4 % 128;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1929884684);
                    i3 = R.string.uikit_rrn_text_field_label_jumin_no;
                    i4 = IAuthTabCallback + 73;
                    onWarmupCompleted = i4 % 128;
                }
                int i7 = i4 % 2;
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i3, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i8 = onWarmupCompleted + 21;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            Function1 function1IAuthTabCallbackDefault;
            Function1 function1 = (Function1) objArr[0];
            setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            Object obj = null;
            if (setfontassetdelegate != null && (function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault()) != null) {
                int i5 = IAuthTabCallback + 123;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    throw null;
                }
                function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = IAuthTabCallback + 123;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x0172 A[PHI: r4
          0x0172: PHI (r4v5 int) = (r4v4 int), (r4v27 int), (r4v28 int) binds: [B:95:0x0159, B:105:0x0170, B:104:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[PHI: r0
          0x005b: PHI (r0v71 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v72 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x004c, B:5:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:151:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x02a4  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x02c6  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x032e  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0504  */
        /* JADX WARN: Removed duplicated region for block: B:240:0x0520  */
        /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004e A[PHI: r0
          0x004e: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v72 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x004c, B:5:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallbackWithResult(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final selectParentResolutions selectparentresolutions2, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final Function1<? super selectParentResolutions, Unit> function12, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str2, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            int i5;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            boolean z4;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final List<setFontAssetDelegate> list2;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            final String str3;
            final boolean z5;
            final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            final String str4;
            final boolean z6;
            final boolean z7;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            Object obj;
            final setFontAssetDelegate setfontassetdelegate;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4;
            boolean z8;
            Object obj2;
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub3;
            setCacheComposition.onWarmupCompleted onwarmupcompleted3;
            int i20;
            int i21 = 2 % 2;
            int i22 = onWarmupCompleted + 29;
            IAuthTabCallback = i22 % 128;
            if (i22 % 2 != 0) {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                Intrinsics.checkNotNullParameter(selectparentresolutions2, "");
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(function12, "");
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(668056023);
                if ((i2 & 118) == 0) {
                    i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions) ? 4 : 2) | i2;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    i5 = i2;
                }
            } else {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                Intrinsics.checkNotNullParameter(selectparentresolutions2, "");
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(function12, "");
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(668056023);
                if ((i2 & 6) == 0) {
                }
            }
            if ((i2 & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(selectparentresolutions2)) {
                    int i23 = onWarmupCompleted + 101;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    i20 = 32;
                } else {
                    i20 = 16;
                }
                i5 |= i20;
            }
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function1) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function12) ? 2048 : 1024;
            }
            int i25 = i4 & 16;
            if (i25 != 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
                }
                i6 = i4 & 32;
                Object obj3 = null;
                if (i6 == 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(list)) {
                        int i26 = IAuthTabCallback + 9;
                        onWarmupCompleted = i26 % 128;
                        if (i26 % 2 == 0) {
                            obj3.hashCode();
                            throw null;
                        }
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                    i5 |= 1572864;
                } else {
                    if ((i2 & 1572864) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(iAuthTabCallbackStub) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 != 0) {
                        int i27 = onWarmupCompleted + 107;
                        IAuthTabCallback = i27 % 128;
                        int i28 = i27 % 2;
                        i5 |= 12582912;
                    } else {
                        if ((12582912 & i2) == 0) {
                            i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str) ? 8388608 : 4194304;
                        }
                        i10 = i4 & 256;
                        if (i10 != 0) {
                            if ((i2 & 100663296) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z)) {
                                    i11 = 67108864;
                                } else {
                                    int i29 = IAuthTabCallback + 3;
                                    onWarmupCompleted = i29 % 128;
                                    int i30 = i29 % 2;
                                    i11 = 33554432;
                                }
                                i5 |= i11;
                            }
                            i12 = i4 & 512;
                            int i31 = 805306368;
                            if (i12 != 0) {
                                i5 |= i31;
                            } else if ((805306368 & i2) == 0) {
                                i31 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 536870912 : 268435456;
                                i5 |= i31;
                            }
                            i13 = i5;
                            i14 = i4 & 1024;
                            if (i14 != 0) {
                                i15 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i15 = i3 | (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str2) ? 4 : 2);
                            } else {
                                i15 = i3;
                            }
                            i16 = i4 & 2048;
                            if (i16 != 0) {
                                i15 |= 48;
                            } else if ((i3 & 48) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z2)) {
                                    int i32 = onWarmupCompleted + 27;
                                    IAuthTabCallback = i32 % 128;
                                    int i33 = i32 % 2;
                                    i17 = 32;
                                } else {
                                    i17 = 16;
                                }
                                i15 |= i17;
                            }
                            int i34 = i15;
                            i18 = i4 & 4096;
                            if (i18 != 0) {
                                i34 |= 384;
                            } else if ((i3 & 384) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z3)) {
                                    int i35 = IAuthTabCallback + 31;
                                    onWarmupCompleted = i35 % 128;
                                    i19 = i35 % 2 == 0 ? 19048 : 256;
                                } else {
                                    i19 = 128;
                                }
                                i34 |= i19;
                            }
                            int i36 = i34;
                            if ((306783379 & i13) == 306783378 && (i36 & 147) == 146) {
                                int i37 = onWarmupCompleted + 119;
                                IAuthTabCallback = i37 % 128;
                                int i38 = i37 % 2;
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z4, i13 & 1)) {
                                if (i25 != 0) {
                                    int i39 = IAuthTabCallback + 87;
                                    onWarmupCompleted = i39 % 128;
                                    int i40 = i39 % 2;
                                    quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                                } else {
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                }
                                List<setFontAssetDelegate> listEmptyList = i6 != 0 ? CollectionsKt.emptyList() : list;
                                final setCacheComposition.IAuthTabCallbackStub onnavigationevent = i8 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                                String str5 = i9 != 0 ? null : str;
                                boolean z9 = i10 != 0 ? false : z;
                                setCacheComposition.onWarmupCompleted onwarmupcompleted4 = i12 != 0 ? null : onwarmupcompleted;
                                String str6 = i14 != 0 ? null : str2;
                                boolean z10 = i16 != 0 ? false : z2;
                                boolean z11 = i18 != 0 ? true : z3;
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(668056023, i13, i36, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RrnFirst7 (SplitTextField.kt:317)");
                                }
                                int i41 = 458752 & i13;
                                boolean z12 = i41 == 131072;
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (!z12) {
                                    int i42 = IAuthTabCallback + 111;
                                    onWarmupCompleted = i42 % 128;
                                    if (i42 % 2 == 0) {
                                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                        throw null;
                                    }
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        obj = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 0);
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(obj);
                                    } else {
                                        obj = objOnMinimized;
                                    }
                                    final setFontAssetDelegate setfontassetdelegate2 = (setFontAssetDelegate) obj;
                                    boolean z13 = i41 == 131072;
                                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (!z13) {
                                        Object obj4 = objOnMinimized2;
                                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            setFontAssetDelegate setfontassetdelegate3 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 1);
                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(setfontassetdelegate3);
                                            obj4 = setfontassetdelegate3;
                                        }
                                        setFontAssetDelegate setfontassetdelegate4 = (setFontAssetDelegate) obj4;
                                        setMaxFrame.IAuthTabCallback iAuthTabCallback = new setMaxFrame.IAuthTabCallback(1.0f);
                                        setMaxFrame.IAuthTabCallback iAuthTabCallback2 = new setMaxFrame.IAuthTabCallback(1.0f);
                                        getParentSizesThatAreTooLarge.onExtraCallback onextracallback = getParentSizesThatAreTooLarge.Companion;
                                        int iOnExtraCallback = onextracallback.onExtraCallback();
                                        filterResolutionsByAspectRatio.onNavigationEvent onnavigationevent2 = filterResolutionsByAspectRatio.Companion;
                                        CameraUnavailableException cameraUnavailableException = new CameraUnavailableException(0, (Boolean) null, iOnExtraCallback, onnavigationevent2.onExtraCallback(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                        boolean z14 = (i13 & 896) == 256;
                                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(setfontassetdelegate2);
                                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                        if (!(z14 | zOnNavigationEvent)) {
                                            Object obj5 = objOnMinimized3;
                                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                Function1 function13 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda0
                                                    private static int IAuthTabCallback = 0;
                                                    private static int onWarmupCompleted = 1;

                                                    public final Object invoke(Object obj6) {
                                                        int i43 = 2 % 2;
                                                        int i44 = IAuthTabCallback + 121;
                                                        onWarmupCompleted = i44 % 128;
                                                        if (i44 % 2 == 0) {
                                                            SplitTextField.IAuthTabCallback.extraCallbackWithResult(function1, setfontassetdelegate2, (selectParentResolutions) obj6);
                                                            throw null;
                                                        }
                                                        Unit unitExtraCallbackWithResult = SplitTextField.IAuthTabCallback.extraCallbackWithResult(function1, setfontassetdelegate2, (selectParentResolutions) obj6);
                                                        int i45 = onWarmupCompleted + 19;
                                                        IAuthTabCallback = i45 % 128;
                                                        int i46 = i45 % 2;
                                                        return unitExtraCallbackWithResult;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function13);
                                                obj5 = function13;
                                            }
                                            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub4 = onnavigationevent;
                                            List<setFontAssetDelegate> list3 = listEmptyList;
                                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult2;
                                            final String str7 = str6;
                                            setFailureListener setfailurelistenerOnExtraCallbackWithResult = new setFontAssetDelegate(selectparentresolutions, (Function1) obj5, iAuthTabCallback, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback2, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(1982347128, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda1
                                                private static int IAuthTabCallback = 0;
                                                private static int onExtraCallback = 1;

                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    int i43 = 2 % 2;
                                                    int i44 = IAuthTabCallback + 83;
                                                    onExtraCallback = i44 % 128;
                                                    int i45 = i44 % 2;
                                                    Unit unitOnExtraCallbackWithResult = SplitTextField.IAuthTabCallback.onExtraCallbackWithResult(onnavigationevent, (RowScope) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                    int i46 = IAuthTabCallback + 113;
                                                    onExtraCallback = i46 % 128;
                                                    int i47 = i46 % 2;
                                                    return unitOnExtraCallbackWithResult;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, 0, 6, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125697768, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate2);
                                            setFailureListener setframe = new setFrame("-");
                                            setMaxFrame.onNavigationEvent onnavigationevent3 = new setMaxFrame.onNavigationEvent((setMaxFrame.onExtraCallbackWithResult) null, 0.0f, 3, (DefaultConstructorMarker) null);
                                            CameraUnavailableException cameraUnavailableException2 = new CameraUnavailableException(0, (Boolean) null, onextracallback.onExtraCallback(), onnavigationevent2.onExtraCallbackWithResult(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                            if ((i13 & 7168) == 2048) {
                                                setfontassetdelegate = setfontassetdelegate4;
                                                cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult5;
                                                z8 = true;
                                            } else {
                                                setfontassetdelegate = setfontassetdelegate4;
                                                cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult5;
                                                z8 = false;
                                            }
                                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(setfontassetdelegate);
                                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                                            if ((z8 || zOnNavigationEvent2) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                Function1 function14 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda2
                                                    private static int IAuthTabCallback = 0;
                                                    private static int onWarmupCompleted = 1;

                                                    public final Object invoke(Object obj6) {
                                                        int i43 = 2 % 2;
                                                        int i44 = IAuthTabCallback + 9;
                                                        onWarmupCompleted = i44 % 128;
                                                        int i45 = i44 % 2;
                                                        Unit unitIAuthTabCallbackDefault = SplitTextField.IAuthTabCallback.IAuthTabCallbackDefault(function12, setfontassetdelegate, (selectParentResolutions) obj6);
                                                        int i46 = IAuthTabCallback + 43;
                                                        onWarmupCompleted = i46 % 128;
                                                        int i47 = i46 % 2;
                                                        return unitIAuthTabCallbackDefault;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(function14);
                                                obj2 = function14;
                                            } else {
                                                obj2 = objOnMinimized4;
                                            }
                                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult6 = cameraCaptureResultEmptyCameraCaptureResult4;
                                            List listListOf = CollectionsKt.listOf(new setFailureListener[]{setfailurelistenerOnExtraCallbackWithResult, setFontMap.onNavigationEvent, new setFallbackResource(CollectionsKt.listOf(new setFailureListener[]{setframe, new setFontAssetDelegate(selectparentresolutions2, (Function1) obj2, onnavigationevent3, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException2, (CameraState) null, false, false, false, 0, 1, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125698040, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate), new setFrame("******")}), new setMaxFrame.IAuthTabCallback(1.0f), (setMaxFrame) null, 4, (DefaultConstructorMarker) null)});
                                            if (onwarmupcompleted4 == null) {
                                                iAuthTabCallbackStub3 = iAuthTabCallbackStub4;
                                                onwarmupcompleted3 = iAuthTabCallbackStub3 instanceof setCacheComposition.IAuthTabCallbackStub.onNavigationEvent ? setCacheComposition.onWarmupCompleted.SUSTAIN : setCacheComposition.onWarmupCompleted.APPEAR;
                                            } else {
                                                iAuthTabCallbackStub3 = iAuthTabCallbackStub4;
                                                onwarmupcompleted3 = onwarmupcompleted4;
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult6;
                                            int i43 = i13 >> 12;
                                            int i44 = i36 << 18;
                                            setIgnoreDisabledSystemAnimations.onExtraCallbackWithResult(listListOf, quirksExternalSyntheticBackport02, iAuthTabCallbackStub3, str5, z9, onwarmupcompleted3, ForwardingCameraControl.onExtraCallback(-1383648667, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda3
                                                private static int onExtraCallback = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    Unit unit;
                                                    int i45 = 2 % 2;
                                                    int i46 = onWarmupCompleted + 93;
                                                    onExtraCallback = i46 % 128;
                                                    if (i46 % 2 != 0) {
                                                        Object[] objArr = {str7, (RowScope) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, Integer.valueOf(((Integer) obj8).intValue())};
                                                        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                                        unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -157951469, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 157951490, iOnWarmupCompleted);
                                                        int i47 = 29 / 0;
                                                    } else {
                                                        Object[] objArr2 = {str7, (RowScope) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, Integer.valueOf(((Integer) obj8).intValue())};
                                                        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
                                                        unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr2, zzgsa.onWarmupCompleted(), -157951469, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 157951490, iOnWarmupCompleted2);
                                                    }
                                                    int i48 = onWarmupCompleted + 67;
                                                    onExtraCallback = i48 % 128;
                                                    int i49 = i48 % 2;
                                                    return unit;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResult3, 54), z10, z11, cameraCaptureResultEmptyCameraCaptureResult3, (i43 & 57344) | ((i13 >> 9) & 112) | 1572864 | (i43 & 896) | (i43 & 7168) | (29360128 & i44) | (i44 & 234881024), 0);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            iAuthTabCallbackStub2 = iAuthTabCallbackStub3;
                                            str4 = str7;
                                            str3 = str5;
                                            z5 = z9;
                                            onwarmupcompleted2 = onwarmupcompleted4;
                                            z6 = z10;
                                            z7 = z11;
                                            list2 = list3;
                                        }
                                    }
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                                cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                list2 = list;
                                iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                str3 = str;
                                z5 = z;
                                onwarmupcompleted2 = onwarmupcompleted;
                                str4 = str2;
                                z6 = z2;
                                z7 = z3;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda4
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj6, Object obj7) {
                                        int i45 = 2 % 2;
                                        int i46 = onExtraCallback + 77;
                                        onExtraCallbackWithResult = i46 % 128;
                                        int i47 = i46 % 2;
                                        Unit unitOnExtraCallback = SplitTextField.IAuthTabCallback.onExtraCallback(this.f$0, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport03, list2, iAuthTabCallbackStub2, str3, z5, onwarmupcompleted2, str4, z6, z7, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                        int i48 = onExtraCallback + 65;
                                        onExtraCallbackWithResult = i48 % 128;
                                        int i49 = i48 % 2;
                                        return unitOnExtraCallback;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 100663296;
                        i12 = i4 & 512;
                        int i312 = 805306368;
                        if (i12 != 0) {
                        }
                        i13 = i5;
                        i14 = i4 & 1024;
                        if (i14 != 0) {
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                        }
                        int i342 = i15;
                        i18 = i4 & 4096;
                        if (i18 != 0) {
                        }
                        int i362 = i342;
                        if ((306783379 & i13) == 306783378) {
                            z4 = true;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z4, i13 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i10 = i4 & 256;
                    if (i10 != 0) {
                    }
                    i12 = i4 & 512;
                    int i3122 = 805306368;
                    if (i12 != 0) {
                    }
                    i13 = i5;
                    i14 = i4 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    int i3422 = i15;
                    i18 = i4 & 4096;
                    if (i18 != 0) {
                    }
                    int i3622 = i3422;
                    if ((306783379 & i13) == 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z4, i13 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                }
                i12 = i4 & 512;
                int i31222 = 805306368;
                if (i12 != 0) {
                }
                i13 = i5;
                i14 = i4 & 1024;
                if (i14 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                int i34222 = i15;
                i18 = i4 & 4096;
                if (i18 != 0) {
                }
                int i36222 = i34222;
                if ((306783379 & i13) == 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z4, i13 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i4 & 32;
            Object obj32 = null;
            if (i6 == 0) {
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i12 = i4 & 512;
            int i312222 = 805306368;
            if (i12 != 0) {
            }
            i13 = i5;
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            int i342222 = i15;
            i18 = i4 & 4096;
            if (i18 != 0) {
            }
            int i362222 = i342222;
            if ((306783379 & i13) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z4, i13 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }

        private static final Unit onMessageChannelReady(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                onTransact(getsupportedhighspeedresolutionsfor, selectparentresolutions);
                function1.invoke(selectparentresolutions.onNavigationEvent());
                unit = Unit.INSTANCE;
                int i4 = 20 / 0;
            } else {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                onTransact(getsupportedhighspeedresolutionsfor, selectparentresolutions);
                function1.invoke(selectparentresolutions.onNavigationEvent());
                unit = Unit.INSTANCE;
            }
            int i5 = IAuthTabCallback + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onActivityLayout(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) throws Resources.NotFoundException {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 57;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), -37108946, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 37108949, iOnWarmupCompleted);
            function1.invoke(selectparentresolutions.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x036d  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x0375  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x037b  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x03cb  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0133  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNavigationEvent(@NotNull final String str, @NotNull final String str2, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super String, Unit> function12, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str3, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str4, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            List<setFontAssetDelegate> listEmptyList;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            String str5;
            boolean z4;
            setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            String str6;
            final boolean z5;
            final boolean z6;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            String str7;
            String str8;
            boolean z7;
            setCacheComposition.onWarmupCompleted onwarmupcompleted3;
            Object obj;
            boolean z8;
            int i18;
            int i19 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1276896334);
            if ((i2 & 6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                    int i20 = onWarmupCompleted + 1;
                    IAuthTabCallback = i20 % 128;
                    i18 = i20 % 2 != 0 ? 3 : 4;
                } else {
                    i18 = 2;
                }
                i5 = i18 | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
            }
            int i21 = i4 & 16;
            if (i21 != 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                int i22 = IAuthTabCallback + 125;
                onWarmupCompleted = i22 % 128;
                if (i22 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                    throw null;
                }
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
            }
            int i23 = i4 & 32;
            if (i23 != 0) {
                i5 |= 196608;
            } else {
                if ((196608 & i2) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                        int i24 = onWarmupCompleted + 47;
                        IAuthTabCallback = i24 % 128;
                        int i25 = i24 % 2;
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i5 |= i6;
                }
                i7 = i4 & 64;
                if (i7 == 0) {
                    i5 |= 1572864;
                } else {
                    if ((1572864 & i2) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 1048576 : 524288;
                    }
                    i8 = i4 & 128;
                    if (i8 != 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 8388608 : 4194304;
                    }
                    i9 = i4 & 256;
                    if (i9 != 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 67108864 : 33554432;
                    }
                    i10 = i4 & 512;
                    if (i10 != 0) {
                        int i26 = IAuthTabCallback + 49;
                        onWarmupCompleted = i26 % 128;
                        int i27 = i26 % 2;
                        i5 |= 805306368;
                    } else {
                        if ((805306368 & i2) == 0) {
                            i11 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 536870912 : 268435456) | i5;
                        }
                        i12 = i4 & 1024;
                        if (i12 == 0) {
                            i13 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i13 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 4 : 2);
                        } else {
                            i13 = i3;
                        }
                        i14 = i4 & 2048;
                        if (i14 == 0) {
                            i13 |= 48;
                        } else if ((i3 & 48) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                                int i28 = onWarmupCompleted + 99;
                                IAuthTabCallback = i28 % 128;
                                int i29 = i28 % 2;
                                i15 = 32;
                            } else {
                                i15 = 16;
                            }
                            i13 |= i15;
                        }
                        i16 = i13;
                        i17 = i4 & 4096;
                        if (i17 != 0) {
                            if ((i3 & 384) == 0) {
                                i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 256 : 128;
                            }
                            if ((i3 & 3072) == 0) {
                                int i30 = IAuthTabCallback + 45;
                                onWarmupCompleted = i30 % 128;
                                int i31 = i30 % 2;
                                i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 2048 : 1024;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i11) == 306783378 && (i16 & 1171) == 1170) ? false : true, i11 & 1)) {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i21 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                listEmptyList = i23 != 0 ? CollectionsKt.emptyList() : list;
                                setCacheComposition.IAuthTabCallbackStub onnavigationevent = i7 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                                if (i8 != 0) {
                                    int i32 = IAuthTabCallback + 45;
                                    onWarmupCompleted = i32 % 128;
                                    if (i32 % 2 == 0) {
                                        int i33 = 28 / 0;
                                    }
                                    str7 = null;
                                } else {
                                    str7 = str3;
                                }
                                boolean z9 = i9 != 0 ? false : z;
                                setCacheComposition.onWarmupCompleted onwarmupcompleted4 = i10 != 0 ? setCacheComposition.onWarmupCompleted.APPEAR : onwarmupcompleted;
                                if (i12 != 0) {
                                    int i34 = onWarmupCompleted + 15;
                                    IAuthTabCallback = i34 % 128;
                                    if (i34 % 2 != 0) {
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    str8 = null;
                                } else {
                                    str8 = str4;
                                }
                                boolean z10 = i14 != 0 ? false : z2;
                                boolean z11 = i17 != 0 ? true : z3;
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1276896334, i11, i16, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Rrn13 (SplitTextField.kt:388)");
                                }
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted5 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                boolean z12 = z11;
                                if (objOnMinimized == onwarmupcompleted5.onExtraCallback()) {
                                    z7 = z10;
                                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                                    objOnMinimized = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                                } else {
                                    z7 = z10;
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                                selectParentResolutions selectparentresolutionsOnExtraCallback = selectParentResolutions.onExtraCallback((selectParentResolutions) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, zzgsa.onWarmupCompleted(), -1872766937, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1872766948, zzgsa.onWarmupCompleted()), str, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized2 == onwarmupcompleted5.onExtraCallback()) {
                                    str6 = str8;
                                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str2, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                } else {
                                    str6 = str8;
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                                selectParentResolutions selectparentresolutionsOnExtraCallback2 = selectParentResolutions.onExtraCallback(IAuthTabCallback_Parcel((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor2), str2, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                boolean z13 = (i11 & 896) == 256;
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z13) {
                                    onwarmupcompleted3 = onwarmupcompleted4;
                                } else {
                                    int i35 = onWarmupCompleted + 25;
                                    onwarmupcompleted3 = onwarmupcompleted4;
                                    IAuthTabCallback = i35 % 128;
                                    if (i35 % 2 != 0) {
                                        onwarmupcompleted5.onExtraCallback();
                                        throw null;
                                    }
                                    obj = objOnMinimized3;
                                    if (objOnMinimized3 == onwarmupcompleted5.onExtraCallback()) {
                                    }
                                    Function1<? super selectParentResolutions, Unit> function13 = (Function1) obj;
                                    z8 = (i11 & 7168) == 2048;
                                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z8) {
                                        Object obj3 = objOnMinimized4;
                                        if (objOnMinimized4 == onwarmupcompleted5.onExtraCallback()) {
                                            Object obj4 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda37
                                                private static int onExtraCallback = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke(Object obj5) {
                                                    int i36 = 2 % 2;
                                                    int i37 = onWarmupCompleted + 57;
                                                    onExtraCallback = i37 % 128;
                                                    int i38 = i37 % 2;
                                                    Object[] objArr = {function12, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj5};
                                                    int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                                    Unit unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -1843432682, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1843432697, iOnWarmupCompleted);
                                                    int i39 = onWarmupCompleted + 103;
                                                    onExtraCallback = i39 % 128;
                                                    int i40 = i39 % 2;
                                                    return unit;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj4);
                                            obj3 = obj4;
                                        }
                                        onWarmupCompleted(selectparentresolutionsOnExtraCallback, selectparentresolutionsOnExtraCallback2, function13, (Function1) obj3, quirksExternalSyntheticBackport03, listEmptyList, onnavigationevent, str7, z9, onwarmupcompleted3, str6, z7, z12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i11 & 2147475456, i16 & 8190, 0);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            int i36 = IAuthTabCallback + 113;
                                            onWarmupCompleted = i36 % 128;
                                            int i37 = i36 % 2;
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        onwarmupcompleted2 = onwarmupcompleted3;
                                        z6 = z12;
                                        z5 = z7;
                                        str5 = str7;
                                        iAuthTabCallbackStub2 = onnavigationevent;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                        z4 = z9;
                                    }
                                }
                                Object obj5 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda36
                                    private static int IAuthTabCallback = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj6) {
                                        int i38 = 2 % 2;
                                        int i39 = IAuthTabCallback + 15;
                                        onWarmupCompleted = i39 % 128;
                                        int i40 = i39 % 2;
                                        Unit unitOnWarmupCompleted = SplitTextField.IAuthTabCallback.onWarmupCompleted(function1, getsupportedhighspeedresolutionsfor, (selectParentResolutions) obj6);
                                        int i41 = onWarmupCompleted + 69;
                                        IAuthTabCallback = i41 % 128;
                                        if (i41 % 2 == 0) {
                                            return unitOnWarmupCompleted;
                                        }
                                        Object obj7 = null;
                                        obj7.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj5);
                                obj = obj5;
                                Function1<? super selectParentResolutions, Unit> function132 = (Function1) obj;
                                if ((i11 & 7168) == 2048) {
                                }
                                Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z8) {
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                listEmptyList = list;
                                iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                str5 = str3;
                                z4 = z;
                                onwarmupcompleted2 = onwarmupcompleted;
                                str6 = str4;
                                z5 = z2;
                                z6 = z3;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                final List<setFontAssetDelegate> list2 = listEmptyList;
                                final String str9 = str5;
                                final boolean z14 = z4;
                                final setCacheComposition.onWarmupCompleted onwarmupcompleted6 = onwarmupcompleted2;
                                final String str10 = str6;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda38
                                    private static int onExtraCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj6, Object obj7) {
                                        int i38 = 2 % 2;
                                        int i39 = onNavigationEvent + 69;
                                        onExtraCallback = i39 % 128;
                                        int i40 = i39 % 2;
                                        Unit unitOnExtraCallback = SplitTextField.IAuthTabCallback.onExtraCallback(this.f$0, str, str2, function1, function12, quirksExternalSyntheticBackport02, list2, iAuthTabCallbackStub2, str9, z14, onwarmupcompleted6, str10, z5, z6, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                        int i41 = onExtraCallback + 63;
                                        onNavigationEvent = i41 % 128;
                                        int i42 = i41 % 2;
                                        return unitOnExtraCallback;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i16 |= 384;
                        if ((i3 & 3072) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i11) == 306783378 && (i16 & 1171) == 1170) ? false : true, i11 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i11 = i5;
                    i12 = i4 & 1024;
                    if (i12 == 0) {
                    }
                    i14 = i4 & 2048;
                    if (i14 == 0) {
                    }
                    i16 = i13;
                    i17 = i4 & 4096;
                    if (i17 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i11) == 306783378 && (i16 & 1171) == 1170) ? false : true, i11 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                }
                i11 = i5;
                i12 = i4 & 1024;
                if (i12 == 0) {
                }
                i14 = i4 & 2048;
                if (i14 == 0) {
                }
                i16 = i13;
                i17 = i4 & 4096;
                if (i17 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i11) == 306783378 && (i16 & 1171) == 1170) ? false : true, i11 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i4 & 64;
            if (i7 == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            i9 = i4 & 256;
            if (i9 != 0) {
            }
            i10 = i4 & 512;
            if (i10 != 0) {
            }
            i11 = i5;
            i12 = i4 & 1024;
            if (i12 == 0) {
            }
            i14 = i4 & 2048;
            if (i14 == 0) {
            }
            i16 = i13;
            i17 = i4 & 4096;
            if (i17 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i11) == 306783378 && (i16 & 1171) == 1170) ? false : true, i11 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }

        private static final Unit ICustomTabsCallback_Parcel(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i5 = onWarmupCompleted + 93;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    int i7 = onWarmupCompleted + 121;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i9 = onWarmupCompleted + 11;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit onWarmupCompleted(setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            boolean z;
            int i3;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i2 & 17) != 16) {
                int i5 = IAuthTabCallback + 77;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                int i7 = onWarmupCompleted + 121;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 53 / 0;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-946245005, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Rrn13.<anonymous> (SplitTextField.kt:447)");
                    }
                    if (iAuthTabCallbackStub instanceof setCacheComposition.IAuthTabCallbackStub.onNavigationEvent) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1191621679);
                        i3 = R.string.uikit_rrn_text_field_label_jumin_no;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1191619567);
                        i3 = R.string.uikit_rrn_text_field_label_birthday;
                    }
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i3, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i9 = IAuthTabCallback + 13;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i10 = 34 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    if (iAuthTabCallbackStub instanceof setCacheComposition.IAuthTabCallbackStub.onNavigationEvent) {
                    }
                    String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i3, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback2, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static /* synthetic */ Object onActivityResized(Object[] objArr) {
            Function1 function1IAuthTabCallbackDefault;
            Function1 function1 = (Function1) objArr[0];
            setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 87;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                function1.invoke(selectparentresolutions);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null && (function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault()) != null) {
                int i4 = IAuthTabCallback + 87;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                int i6 = onWarmupCompleted + 11;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit IAuthTabCallbackStubProxy(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            boolean z;
            String str2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i2 & 17) != 16) {
                int i4 = onWarmupCompleted + 73;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-379786272, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Rrn13.<anonymous> (SplitTextField.kt:489)");
                    }
                    if (str == null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(97613436);
                        String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.uikit_rrn_text_field_label_jumin_no, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        str2 = strOnExtraCallback;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(97613157);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i5 = onWarmupCompleted + 57;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        str2 = str;
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            }
            int i7 = IAuthTabCallback + 99;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z = false;
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0289  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x02e9  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x04ed  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0509  */
        /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0106 A[PHI: r3
          0x0106: PHI (r3v23 int) = (r3v2 int), (r3v5 int), (r3v8 int) binds: [B:78:0x0104, B:85:0x0120, B:84:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x014a A[PHI: r5
          0x014a: PHI (r5v3 int) = (r5v2 int), (r5v21 int), (r5v22 int) binds: [B:87:0x0127, B:98:0x0148, B:97:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onWarmupCompleted(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final selectParentResolutions selectparentresolutions2, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final Function1<? super selectParentResolutions, Unit> function12, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str2, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final List<setFontAssetDelegate> list2;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            final String str3;
            final boolean z4;
            final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            final String str4;
            final boolean z5;
            boolean z6;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            boolean z7;
            final setFontAssetDelegate setfontassetdelegate;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
            Object obj;
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub3;
            setCacheComposition.onWarmupCompleted onwarmupcompleted3;
            int i18 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1578566574);
            if ((i2 & 6) == 0) {
                i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                int i19 = IAuthTabCallback + 105;
                onWarmupCompleted = i19 % 128;
                if (i19 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12);
                    throw null;
                }
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
            }
            int i20 = i4 & 16;
            if (i20 != 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                        int i21 = IAuthTabCallback + 109;
                        onWarmupCompleted = i21 % 128;
                        int i22 = i21 % 2;
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i5 |= i6;
                }
                i7 = i4 & 32;
                if (i7 == 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 131072 : 65536;
                    }
                    i8 = i4 & 64;
                    if (i8 != 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 != 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                            int i23 = IAuthTabCallback + 11;
                            onWarmupCompleted = i23 % 128;
                            int i24 = i23 % 2;
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i5 |= i10;
                    }
                    i11 = i4 & 256;
                    int i25 = 100663296;
                    if (i11 != 0) {
                        i5 |= i25;
                    } else if ((100663296 & i2) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                            int i26 = IAuthTabCallback + 93;
                            onWarmupCompleted = i26 % 128;
                            int i27 = i26 % 2;
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i5 |= i25;
                    }
                    i12 = i4 & 512;
                    int i28 = 805306368;
                    if (i12 != 0) {
                        i5 |= i28;
                    } else if ((805306368 & i2) == 0) {
                        int i29 = IAuthTabCallback + 87;
                        onWarmupCompleted = i29 % 128;
                        int i30 = i29 % 2;
                        i28 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 536870912 : 268435456;
                        i5 |= i28;
                    }
                    i13 = i5;
                    i14 = i4 & 1024;
                    if (i14 != 0) {
                        i15 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        int i31 = onWarmupCompleted + 123;
                        IAuthTabCallback = i31 % 128;
                        int i32 = i31 % 2;
                        i15 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 4 : 2) | i3;
                    } else {
                        i15 = i3;
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                        i15 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
                    }
                    i17 = i4 & 4096;
                    if (i17 == 0) {
                        if ((i3 & 384) == 0) {
                            i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 256 : 128;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (i15 & 147) != 146, i13 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            list2 = list;
                            iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                            str3 = str;
                            z4 = z;
                            onwarmupcompleted2 = onwarmupcompleted;
                            str4 = str2;
                            z5 = z2;
                            z6 = z3;
                        } else {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i20 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            List<setFontAssetDelegate> listEmptyList = i7 != 0 ? CollectionsKt.emptyList() : list;
                            final setCacheComposition.IAuthTabCallbackStub onnavigationevent = i8 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                            String str5 = i9 != 0 ? null : str;
                            boolean z8 = i11 != 0 ? false : z;
                            setCacheComposition.onWarmupCompleted onwarmupcompleted4 = i12 != 0 ? setCacheComposition.onWarmupCompleted.APPEAR : onwarmupcompleted;
                            String str6 = i14 != 0 ? null : str2;
                            boolean z9 = i16 != 0 ? false : z2;
                            z6 = i17 != 0 ? false : z3;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i33 = IAuthTabCallback + 59;
                                onWarmupCompleted = i33 % 128;
                                if (i33 % 2 == 0) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1578566574, i13, i15, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Rrn13 (SplitTextField.kt:431)");
                                    throw null;
                                }
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1578566574, i13, i15, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Rrn13 (SplitTextField.kt:431)");
                            }
                            int i34 = 458752 & i13;
                            boolean z10 = i34 == 131072;
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!z10) {
                                Object obj2 = objOnMinimized;
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    setFontAssetDelegate setfontassetdelegate2 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 0);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate2);
                                    obj2 = setfontassetdelegate2;
                                }
                                final setFontAssetDelegate setfontassetdelegate3 = (setFontAssetDelegate) obj2;
                                boolean z11 = i34 == 131072;
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!z11) {
                                    int i35 = onWarmupCompleted + 37;
                                    IAuthTabCallback = i35 % 128;
                                    int i36 = i35 % 2;
                                    Object obj3 = objOnMinimized2;
                                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        setFontAssetDelegate setfontassetdelegate4 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 1);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate4);
                                        obj3 = setfontassetdelegate4;
                                    }
                                    setFontAssetDelegate setfontassetdelegate5 = (setFontAssetDelegate) obj3;
                                    setMaxFrame.IAuthTabCallback iAuthTabCallback = new setMaxFrame.IAuthTabCallback(1.0f);
                                    setMaxFrame.IAuthTabCallback iAuthTabCallback2 = new setMaxFrame.IAuthTabCallback(1.0f);
                                    getParentSizesThatAreTooLarge.onExtraCallback onextracallback = getParentSizesThatAreTooLarge.Companion;
                                    int iOnExtraCallback = onextracallback.onExtraCallback();
                                    filterResolutionsByAspectRatio.onNavigationEvent onnavigationevent2 = filterResolutionsByAspectRatio.Companion;
                                    CameraUnavailableException cameraUnavailableException = new CameraUnavailableException(0, (Boolean) null, iOnExtraCallback, onnavigationevent2.onExtraCallback(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                    boolean z12 = (i13 & 896) == 256;
                                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setfontassetdelegate3);
                                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(z12 | zOnNavigationEvent)) {
                                        int i37 = IAuthTabCallback + 79;
                                        onWarmupCompleted = i37 % 128;
                                        int i38 = i37 % 2;
                                        Object obj4 = objOnMinimized3;
                                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            Function1 function13 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda28
                                                private static int onExtraCallback = 0;
                                                private static int onNavigationEvent = 1;

                                                public final Object invoke(Object obj5) {
                                                    int i39 = 2 % 2;
                                                    int i40 = onNavigationEvent + 117;
                                                    onExtraCallback = i40 % 128;
                                                    int i41 = i40 % 2;
                                                    Object[] objArr = {function1, setfontassetdelegate3, (selectParentResolutions) obj5};
                                                    int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                                    Unit unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), 1103093550, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1103093537, iOnWarmupCompleted);
                                                    int i42 = onNavigationEvent + 3;
                                                    onExtraCallback = i42 % 128;
                                                    int i43 = i42 % 2;
                                                    return unit;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function13);
                                            obj4 = function13;
                                        }
                                        int i39 = i15;
                                        setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub4 = onnavigationevent;
                                        List<setFontAssetDelegate> list3 = listEmptyList;
                                        final String str7 = str6;
                                        setFailureListener setfailurelistenerOnExtraCallbackWithResult = new setFontAssetDelegate(selectparentresolutions, (Function1) obj4, iAuthTabCallback, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback2, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(-946245005, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda29
                                            private static int onNavigationEvent = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                int i40 = 2 % 2;
                                                int i41 = onNavigationEvent + 47;
                                                onWarmupCompleted = i41 % 128;
                                                int i42 = i41 % 2;
                                                Unit unitOnExtraCallback = SplitTextField.IAuthTabCallback.onExtraCallback(onnavigationevent, (RowScope) obj5, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                                int i43 = onWarmupCompleted + 73;
                                                onNavigationEvent = i43 % 128;
                                                int i44 = i43 % 2;
                                                return unitOnExtraCallback;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, 0, 6, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125697768, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate3);
                                        setFailureListener setfallbackresource = new setFallbackResource(CollectionsKt.listOf(new setFrame("-")), new setMaxFrame.onNavigationEvent((setMaxFrame.onExtraCallbackWithResult) null, 0.0f, 3, (DefaultConstructorMarker) null), (setMaxFrame) null, 4, (DefaultConstructorMarker) null);
                                        setMaxFrame.IAuthTabCallback iAuthTabCallback3 = new setMaxFrame.IAuthTabCallback(1.0f);
                                        setMaxFrame.IAuthTabCallback iAuthTabCallback4 = new setMaxFrame.IAuthTabCallback(1.0f);
                                        CameraUnavailableException cameraUnavailableException2 = new CameraUnavailableException(0, (Boolean) null, onextracallback.onExtraCallbackWithResult(), onnavigationevent2.onExtraCallbackWithResult(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                        needToAddSensorResolutions needtoaddsensorresolutions = new needToAddSensorResolutions('*');
                                        if ((i13 & 7168) == 2048) {
                                            setfontassetdelegate = setfontassetdelegate5;
                                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                            setfontassetdelegate = setfontassetdelegate5;
                                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        }
                                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(setfontassetdelegate);
                                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                                        if ((z7 || zOnNavigationEvent2) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            Function1 function14 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda30
                                                private static int onExtraCallback = 0;
                                                private static int onNavigationEvent = 1;

                                                public final Object invoke(Object obj5) {
                                                    int i40 = 2 % 2;
                                                    int i41 = onExtraCallback + 7;
                                                    onNavigationEvent = i41 % 128;
                                                    int i42 = i41 % 2;
                                                    Unit unitAccess000 = SplitTextField.IAuthTabCallback.access000(function12, setfontassetdelegate, (selectParentResolutions) obj5);
                                                    int i43 = onNavigationEvent + 85;
                                                    onExtraCallback = i43 % 128;
                                                    if (i43 % 2 == 0) {
                                                        return unitAccess000;
                                                    }
                                                    Object obj6 = null;
                                                    obj6.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function14);
                                            obj = function14;
                                        } else {
                                            obj = objOnMinimized4;
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult3;
                                        List listListOf = CollectionsKt.listOf(new setFailureListener[]{setfailurelistenerOnExtraCallbackWithResult, setFontMap.onNavigationEvent, setfallbackresource, new setFallbackResource(CollectionsKt.listOf(new setFontAssetDelegate(selectparentresolutions2, (Function1) obj, iAuthTabCallback3, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback4, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, setClipTextToBoundingBox.onNavigationEvent.onNavigationEvent(), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, needtoaddsensorresolutions, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException2, (CameraState) null, false, false, false, 0, 7, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125681384, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate)), new setMaxFrame.IAuthTabCallback(1.0f), (setMaxFrame) null, 4, (DefaultConstructorMarker) null)});
                                        if (onwarmupcompleted4 == null) {
                                            int i40 = IAuthTabCallback + 37;
                                            onWarmupCompleted = i40 % 128;
                                            int i41 = i40 % 2;
                                            iAuthTabCallbackStub3 = iAuthTabCallbackStub4;
                                            onwarmupcompleted3 = (iAuthTabCallbackStub3 instanceof setCacheComposition.IAuthTabCallbackStub.onNavigationEvent) ^ true ? setCacheComposition.onWarmupCompleted.APPEAR : setCacheComposition.onWarmupCompleted.SUSTAIN;
                                        } else {
                                            iAuthTabCallbackStub3 = iAuthTabCallbackStub4;
                                            onwarmupcompleted3 = onwarmupcompleted4;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                                        int i42 = i13 >> 12;
                                        int i43 = i39 << 18;
                                        setIgnoreDisabledSystemAnimations.onExtraCallbackWithResult(listListOf, quirksExternalSyntheticBackport03, iAuthTabCallbackStub3, str5, z8, onwarmupcompleted3, ForwardingCameraControl.onExtraCallback(-379786272, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda31
                                            private static int onExtraCallback = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                int i44 = 2 % 2;
                                                int i45 = onNavigationEvent + 37;
                                                onExtraCallback = i45 % 128;
                                                int i46 = i45 % 2;
                                                Unit unitOnExtraCallback = SplitTextField.IAuthTabCallback.onExtraCallback(str7, (RowScope) obj5, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                                int i47 = onNavigationEvent + 93;
                                                onExtraCallback = i47 % 128;
                                                int i48 = i47 % 2;
                                                return unitOnExtraCallback;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54), z9, z6, cameraCaptureResultEmptyCameraCaptureResult2, (i42 & 57344) | ((i13 >> 9) & 112) | 1572864 | (i42 & 896) | (i42 & 7168) | (29360128 & i43) | (i43 & 234881024), 0);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        iAuthTabCallbackStub2 = iAuthTabCallbackStub3;
                                        str4 = str7;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                        str3 = str5;
                                        z4 = z8;
                                        onwarmupcompleted2 = onwarmupcompleted4;
                                        z5 = z9;
                                        list2 = list3;
                                    }
                                }
                            }
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            final boolean z13 = z6;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda32
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj5, Object obj6) {
                                    int i44 = 2 % 2;
                                    int i45 = onNavigationEvent + 33;
                                    IAuthTabCallback = i45 % 128;
                                    int i46 = i45 % 2;
                                    Unit unitOnNavigationEvent = SplitTextField.IAuthTabCallback.onNavigationEvent(this.f$0, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport02, list2, iAuthTabCallbackStub2, str3, z4, onwarmupcompleted2, str4, z5, z13, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                    int i47 = IAuthTabCallback + 89;
                                    onNavigationEvent = i47 % 128;
                                    int i48 = i47 % 2;
                                    return unitOnNavigationEvent;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i15 |= 384;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (i15 & 147) != 146, i13 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                }
                i11 = i4 & 256;
                int i252 = 100663296;
                if (i11 != 0) {
                }
                i12 = i4 & 512;
                int i282 = 805306368;
                if (i12 != 0) {
                }
                i13 = i5;
                i14 = i4 & 1024;
                if (i14 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                i17 = i4 & 4096;
                if (i17 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (i15 & 147) != 146, i13 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i4 & 32;
            if (i7 == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i11 = i4 & 256;
            int i2522 = 100663296;
            if (i11 != 0) {
            }
            i12 = i4 & 512;
            int i2822 = 805306368;
            if (i12 != 0) {
            }
            i13 = i5;
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            i17 = i4 & 4096;
            if (i17 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (i15 & 147) != 146, i13 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }

        private static final Unit extraCallbackWithResult(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            onExtraCallback(getsupportedhighspeedresolutionsfor, selectparentresolutions);
            function1.invoke(selectparentresolutions.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static final Unit extraCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 69;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                asInterface(getsupportedhighspeedresolutionsfor, selectparentresolutions);
                function1.invoke(selectparentresolutions.onNavigationEvent());
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            asInterface(getsupportedhighspeedresolutionsfor, selectparentresolutions);
            function1.invoke(selectparentresolutions.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x0332  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x033a  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x0340  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x038e  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x03a9  */
        /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallback(@NotNull final String str, @NotNull final String str2, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super String, Unit> function12, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str3, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str4, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int iOrdinal;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final List<setFontAssetDelegate> list2;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            final String str5;
            boolean z4;
            setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            String str6;
            final boolean z5;
            final boolean z6;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            setCacheComposition.onWarmupCompleted onwarmupcompleted3;
            String str7;
            boolean z7;
            setCacheComposition.onWarmupCompleted onwarmupcompleted4;
            Object obj;
            boolean z8;
            int i17;
            int i18 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(221659774);
            if ((i2 & 6) == 0) {
                int i19 = onWarmupCompleted + 23;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                i5 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 2 : 4) | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                    int i21 = onWarmupCompleted + 43;
                    IAuthTabCallback = i21 % 128;
                    i17 = i21 % 2 != 0 ? 20854 : 2048;
                } else {
                    i17 = 1024;
                }
                i5 |= i17;
            }
            int i22 = i4 & 16;
            if (i22 != 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
                }
                i6 = i4 & 32;
                if (i6 == 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 131072 : 65536;
                }
                i7 = i4 & 64;
                if (i7 == 0) {
                    int i23 = onWarmupCompleted + 37;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    i5 |= 1572864;
                } else {
                    if ((i2 & 1572864) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 1048576 : 524288;
                    }
                    i8 = i4 & 128;
                    if (i8 != 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                            int i25 = IAuthTabCallback + 75;
                            onWarmupCompleted = i25 % 128;
                            if (i25 % 2 == 0) {
                                throw null;
                            }
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 256;
                    if (i10 != 0) {
                        i5 |= 100663296;
                    } else {
                        if ((100663296 & i2) == 0) {
                            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 67108864 : 33554432;
                        }
                        i11 = i4 & 512;
                        if (i11 == 0) {
                            i5 |= 805306368;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                if (onwarmupcompleted == null) {
                                    int i26 = onWarmupCompleted + 1;
                                    IAuthTabCallback = i26 % 128;
                                    int i27 = i26 % 2;
                                    iOrdinal = -1;
                                } else {
                                    iOrdinal = onwarmupcompleted.ordinal();
                                }
                                i12 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 536870912 : 268435456) | i5;
                            }
                            i13 = i4 & 1024;
                            if (i13 != 0) {
                                i14 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i14 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ^ true) ? 4 : 2) | i3;
                            } else {
                                i14 = i3;
                            }
                            i15 = i4 & 2048;
                            if (i15 != 0) {
                                i14 |= 48;
                            } else if ((i3 & 48) == 0) {
                                i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
                            }
                            int i28 = onWarmupCompleted + 21;
                            IAuthTabCallback = i28 % 128;
                            int i29 = i28 % 2;
                            i16 = i4 & 4096;
                            if (i16 == 0) {
                                if ((i3 & 384) == 0) {
                                    i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 256 : 128;
                                }
                                if ((i3 & 3072) == 0) {
                                    i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 2048 : 1024;
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i12 & 306783379) == 306783378 || (i14 & 1171) != 1170, i12 & 1)) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                    list2 = list;
                                    iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                    str5 = str3;
                                    z4 = z;
                                    onwarmupcompleted2 = onwarmupcompleted;
                                    str6 = str4;
                                    z5 = z2;
                                    z6 = z3;
                                } else {
                                    quirksExternalSyntheticBackport02 = i22 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    List<setFontAssetDelegate> listEmptyList = i6 != 0 ? CollectionsKt.emptyList() : list;
                                    setCacheComposition.IAuthTabCallbackStub onnavigationevent = i7 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                                    String str8 = i8 != 0 ? null : str3;
                                    boolean z9 = i10 != 0 ? false : z;
                                    if (i11 != 0) {
                                        int i30 = IAuthTabCallback + 33;
                                        onWarmupCompleted = i30 % 128;
                                        int i31 = i30 % 2;
                                        onwarmupcompleted3 = setCacheComposition.onWarmupCompleted.APPEAR;
                                    } else {
                                        onwarmupcompleted3 = onwarmupcompleted;
                                    }
                                    if (i13 != 0) {
                                        int i32 = onWarmupCompleted + 73;
                                        IAuthTabCallback = i32 % 128;
                                        int i33 = i32 % 2;
                                        str7 = null;
                                    } else {
                                        str7 = str4;
                                    }
                                    boolean z10 = i15 != 0 ? false : z2;
                                    boolean z11 = i16 != 0 ? true : z3;
                                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(221659774, i12, i14, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Email (SplitTextField.kt:510)");
                                    }
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted5 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                    boolean z12 = z11;
                                    if (objOnMinimized == onwarmupcompleted5.onExtraCallback()) {
                                        z7 = z10;
                                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                                        objOnMinimized = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                                    } else {
                                        z7 = z10;
                                    }
                                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                                    selectParentResolutions selectparentresolutionsOnExtraCallback = selectParentResolutions.onExtraCallback(IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor), str, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized2 == onwarmupcompleted5.onExtraCallback()) {
                                        str6 = str7;
                                        objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str2, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                    } else {
                                        str6 = str7;
                                    }
                                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                                    selectParentResolutions selectparentresolutionsOnExtraCallback2 = selectParentResolutions.onExtraCallback(IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor2), str2, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                    boolean z13 = (i12 & 896) == 256;
                                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z13) {
                                        onwarmupcompleted4 = onwarmupcompleted3;
                                    } else {
                                        int i34 = onWarmupCompleted + 99;
                                        onwarmupcompleted4 = onwarmupcompleted3;
                                        IAuthTabCallback = i34 % 128;
                                        int i35 = i34 % 2;
                                        obj = objOnMinimized3;
                                        if (objOnMinimized3 == onwarmupcompleted5.onExtraCallback()) {
                                        }
                                        Function1<? super selectParentResolutions, Unit> function13 = (Function1) obj;
                                        z8 = (i12 & 7168) == 2048;
                                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (z8) {
                                            Object obj2 = objOnMinimized4;
                                            if (objOnMinimized4 == onwarmupcompleted5.onExtraCallback()) {
                                                Object obj3 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda40
                                                    private static int IAuthTabCallback = 0;
                                                    private static int onExtraCallback = 1;

                                                    public final Object invoke(Object obj4) {
                                                        int i36 = 2 % 2;
                                                        int i37 = onExtraCallback + 103;
                                                        IAuthTabCallback = i37 % 128;
                                                        int i38 = i37 % 2;
                                                        Unit unitOnNavigationEvent = SplitTextField.IAuthTabCallback.onNavigationEvent(function12, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj4);
                                                        int i39 = onExtraCallback + 117;
                                                        IAuthTabCallback = i39 % 128;
                                                        int i40 = i39 % 2;
                                                        return unitOnNavigationEvent;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj3);
                                                obj2 = obj3;
                                            }
                                            onExtraCallback(selectparentresolutionsOnExtraCallback, selectparentresolutionsOnExtraCallback2, function13, (Function1<? super selectParentResolutions, Unit>) obj2, quirksExternalSyntheticBackport02, listEmptyList, onnavigationevent, str8, z9, onwarmupcompleted4, str6, z7, z12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i12 & 2147475456, i14 & 8190, 0);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                int i36 = onWarmupCompleted + 5;
                                                IAuthTabCallback = i36 % 128;
                                                int i37 = i36 % 2;
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            z6 = z12;
                                            z4 = z9;
                                            str5 = str8;
                                            list2 = listEmptyList;
                                            iAuthTabCallbackStub2 = onnavigationevent;
                                            onwarmupcompleted2 = onwarmupcompleted4;
                                            z5 = z7;
                                        }
                                    }
                                    Object obj4 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda39
                                        private static int onExtraCallback = 1;
                                        private static int onExtraCallbackWithResult;

                                        public final Object invoke(Object obj5) {
                                            int i38 = 2 % 2;
                                            int i39 = onExtraCallbackWithResult + 119;
                                            onExtraCallback = i39 % 128;
                                            int i40 = i39 % 2;
                                            Unit unitIAuthTabCallbackDefault = SplitTextField.IAuthTabCallback.IAuthTabCallbackDefault(function1, getsupportedhighspeedresolutionsfor, (selectParentResolutions) obj5);
                                            int i41 = onExtraCallback + 45;
                                            onExtraCallbackWithResult = i41 % 128;
                                            int i42 = i41 % 2;
                                            return unitIAuthTabCallbackDefault;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj4);
                                    obj = obj4;
                                    Function1<? super selectParentResolutions, Unit> function132 = (Function1) obj;
                                    if ((i12 & 7168) == 2048) {
                                    }
                                    Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z8) {
                                    }
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                    final boolean z14 = z4;
                                    final setCacheComposition.onWarmupCompleted onwarmupcompleted6 = onwarmupcompleted2;
                                    final String str9 = str6;
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda41
                                        private static int IAuthTabCallback = 1;
                                        private static int onExtraCallback;

                                        public final Object invoke(Object obj5, Object obj6) {
                                            int i38 = 2 % 2;
                                            int i39 = IAuthTabCallback + 111;
                                            onExtraCallback = i39 % 128;
                                            int i40 = i39 % 2;
                                            SplitTextField.IAuthTabCallback iAuthTabCallback = this.f$0;
                                            String str10 = str;
                                            String str11 = str2;
                                            Function1 function14 = function1;
                                            Function1 function15 = function12;
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                            List list3 = list2;
                                            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub3 = iAuthTabCallbackStub2;
                                            String str12 = str5;
                                            boolean z15 = z14;
                                            setCacheComposition.onWarmupCompleted onwarmupcompleted7 = onwarmupcompleted6;
                                            String str13 = str9;
                                            boolean z16 = z5;
                                            boolean z17 = z6;
                                            int i41 = i2;
                                            int i42 = i3;
                                            int i43 = i4;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            Object[] objArr = {iAuthTabCallback, str10, str11, function14, function15, quirksExternalSyntheticBackport04, list3, iAuthTabCallbackStub3, str12, Boolean.valueOf(z15), onwarmupcompleted7, str13, Boolean.valueOf(z16), Boolean.valueOf(z17), Integer.valueOf(i41), Integer.valueOf(i42), Integer.valueOf(i43), (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(iIntValue)};
                                            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                            Unit unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), 1971773933, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1971773928, iOnWarmupCompleted);
                                            int i44 = onExtraCallback + 85;
                                            IAuthTabCallback = i44 % 128;
                                            if (i44 % 2 == 0) {
                                                int i45 = 2 / 0;
                                            }
                                            return unit;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 |= 384;
                            if ((i3 & 3072) == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i12 & 306783379) == 306783378 || (i14 & 1171) != 1170, i12 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i12 = i5;
                        i13 = i4 & 1024;
                        if (i13 != 0) {
                        }
                        i15 = i4 & 2048;
                        if (i15 != 0) {
                        }
                        int i282 = onWarmupCompleted + 21;
                        IAuthTabCallback = i282 % 128;
                        int i292 = i282 % 2;
                        i16 = i4 & 4096;
                        if (i16 == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i12 & 306783379) == 306783378 || (i14 & 1171) != 1170, i12 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i11 = i4 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i5;
                    i13 = i4 & 1024;
                    if (i13 != 0) {
                    }
                    i15 = i4 & 2048;
                    if (i15 != 0) {
                    }
                    int i2822 = onWarmupCompleted + 21;
                    IAuthTabCallback = i2822 % 128;
                    int i2922 = i2822 % 2;
                    i16 = i4 & 4096;
                    if (i16 == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i12 & 306783379) == 306783378 || (i14 & 1171) != 1170, i12 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                }
                i11 = i4 & 512;
                if (i11 == 0) {
                }
                i12 = i5;
                i13 = i4 & 1024;
                if (i13 != 0) {
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                }
                int i28222 = onWarmupCompleted + 21;
                IAuthTabCallback = i28222 % 128;
                int i29222 = i28222 % 2;
                i16 = i4 & 4096;
                if (i16 == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i12 & 306783379) == 306783378 || (i14 & 1171) != 1170, i12 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i4 & 32;
            if (i6 == 0) {
            }
            i7 = i4 & 64;
            if (i7 == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 == 0) {
            }
            i12 = i5;
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            int i282222 = onWarmupCompleted + 21;
            IAuthTabCallback = i282222 % 128;
            int i292222 = i282222 % 2;
            i16 = i4 & 4096;
            if (i16 == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i12 & 306783379) == 306783378 || (i14 & 1171) != 1170, i12 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }

        private static final Unit onMessageChannelReady(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i3 = onWarmupCompleted + 95;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    setfontassetdelegate.IAuthTabCallbackDefault();
                    throw null;
                }
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    int i4 = onWarmupCompleted + 73;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit onActivityLayout(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            Function1 function1IAuthTabCallbackDefault;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null && (function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault()) != null) {
                int i3 = onWarmupCompleted + 37;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0276  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x02de  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x04c3  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x04df  */
        /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0147  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallback(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final selectParentResolutions selectparentresolutions2, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final Function1<? super selectParentResolutions, Unit> function12, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str2, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final List<setFontAssetDelegate> list2;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            final String str3;
            final boolean z4;
            final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            final String str4;
            final boolean z5;
            final boolean z6;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            boolean z7;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
            boolean z8;
            final setFontAssetDelegate setfontassetdelegate;
            Object obj;
            getBacktraceNote getbacktracenoteOnExtraCallback;
            int i19;
            int i20 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1785984226);
            if ((i2 & 6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions)) {
                    int i21 = onWarmupCompleted + 31;
                    IAuthTabCallback = i21 % 128;
                    int i22 = i21 % 2;
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i5 = i19 | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions2) ? 32 : 16;
            }
            int i23 = 128;
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
            }
            int i24 = i4 & 16;
            if (i24 != 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
                }
                i6 = i4 & 32;
                if (i6 == 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 131072 : 65536;
                }
                i7 = i4 & 64;
                if (i7 == 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 1048576 : 524288;
                }
                i8 = i4 & 128;
                if (i8 == 0) {
                    i5 |= 12582912;
                } else {
                    if ((i2 & 12582912) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 8388608 : 4194304;
                    }
                    i9 = i4 & 256;
                    if (i9 != 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 67108864 : 33554432;
                    }
                    i10 = i4 & 512;
                    if (i10 != 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal())) {
                            int i25 = IAuthTabCallback + 97;
                            onWarmupCompleted = i25 % 128;
                            int i26 = i25 % 2;
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i5 |= i11;
                    }
                    i12 = i5;
                    i13 = i4 & 1024;
                    if (i13 != 0) {
                        int i27 = IAuthTabCallback + 105;
                        onWarmupCompleted = i27 % 128;
                        int i28 = i27 % 2;
                        i14 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                            int i29 = IAuthTabCallback + 75;
                            onWarmupCompleted = i29 % 128;
                            int i30 = i29 % 2;
                            i15 = 4;
                        } else {
                            int i31 = IAuthTabCallback + 97;
                            onWarmupCompleted = i31 % 128;
                            int i32 = i31 % 2;
                            i15 = 2;
                        }
                        i14 = i15 | i3;
                    } else {
                        i14 = i3;
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                        if ((i3 & 48) == 0) {
                            i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
                        }
                        i17 = i4 & 4096;
                        if (i17 == 0) {
                            i14 |= 384;
                        } else if ((i3 & 384) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3)) {
                                int i33 = IAuthTabCallback + 43;
                                onWarmupCompleted = i33 % 128;
                                int i34 = i33 % 2;
                                i23 = 256;
                            }
                            i14 |= i23;
                        }
                        i18 = i14;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i12) == 306783378 || (i18 & 147) != 146, i12 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            list2 = list;
                            iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                            str3 = str;
                            z4 = z;
                            onwarmupcompleted2 = onwarmupcompleted;
                            str4 = str2;
                            z5 = z2;
                            z6 = z3;
                        } else {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i24 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            List<setFontAssetDelegate> listEmptyList = i6 != 0 ? CollectionsKt.emptyList() : list;
                            setCacheComposition.IAuthTabCallbackStub onnavigationevent = i7 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                            String str5 = i8 != 0 ? null : str;
                            if (i9 != 0) {
                                int i35 = IAuthTabCallback + 23;
                                onWarmupCompleted = i35 % 128;
                                z7 = i35 % 2 == 0;
                            } else {
                                z7 = z;
                            }
                            setCacheComposition.onWarmupCompleted onwarmupcompleted3 = i10 != 0 ? setCacheComposition.onWarmupCompleted.APPEAR : onwarmupcompleted;
                            String str6 = i13 != 0 ? null : str2;
                            boolean z9 = i16 != 0 ? false : z2;
                            boolean z10 = i17 != 0 ? true : z3;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1785984226, i12, i18, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Email (SplitTextField.kt:553)");
                            }
                            int i36 = 458752 & i12;
                            boolean z11 = i36 == 131072;
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z11 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 0);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            final setFontAssetDelegate setfontassetdelegate2 = (setFontAssetDelegate) objOnMinimized;
                            boolean z12 = i36 == 131072;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!z12) {
                                Object obj2 = objOnMinimized2;
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    setFontAssetDelegate setfontassetdelegate3 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 1);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate3);
                                    obj2 = setfontassetdelegate3;
                                }
                                setFontAssetDelegate setfontassetdelegate4 = (setFontAssetDelegate) obj2;
                                setMaxFrame.IAuthTabCallback iAuthTabCallback = new setMaxFrame.IAuthTabCallback(1.0f);
                                setMaxFrame.IAuthTabCallback iAuthTabCallback2 = new setMaxFrame.IAuthTabCallback(1.0f);
                                getParentSizesThatAreTooLarge.onExtraCallback onextracallback = getParentSizesThatAreTooLarge.Companion;
                                int iOnNavigationEvent = onextracallback.onNavigationEvent();
                                filterResolutionsByAspectRatio.onNavigationEvent onnavigationevent2 = filterResolutionsByAspectRatio.Companion;
                                CameraUnavailableException cameraUnavailableException = new CameraUnavailableException(0, (Boolean) null, iOnNavigationEvent, onnavigationevent2.onExtraCallback(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                boolean z13 = (i12 & 896) == 256;
                                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setfontassetdelegate2);
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z13 | zOnNavigationEvent)) {
                                    Object obj3 = objOnMinimized3;
                                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function1 function13 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda43
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallback = 1;

                                            public final Object invoke(Object obj4) {
                                                Unit unitICustomTabsCallback;
                                                int i37 = 2 % 2;
                                                int i38 = onExtraCallback + 69;
                                                IAuthTabCallback = i38 % 128;
                                                if (i38 % 2 != 0) {
                                                    unitICustomTabsCallback = SplitTextField.IAuthTabCallback.ICustomTabsCallback(function1, setfontassetdelegate2, (selectParentResolutions) obj4);
                                                    int i39 = 85 / 0;
                                                } else {
                                                    unitICustomTabsCallback = SplitTextField.IAuthTabCallback.ICustomTabsCallback(function1, setfontassetdelegate2, (selectParentResolutions) obj4);
                                                }
                                                int i40 = IAuthTabCallback + 95;
                                                onExtraCallback = i40 % 128;
                                                int i41 = i40 % 2;
                                                return unitICustomTabsCallback;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function13);
                                        obj3 = function13;
                                    }
                                    final String str7 = str6;
                                    List<setFontAssetDelegate> list3 = listEmptyList;
                                    setFailureListener setfontassetdelegate5 = new setFontAssetDelegate(selectparentresolutions, (Function1) obj3, iAuthTabCallback, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback2, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, 0, 0, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 134086632, (DefaultConstructorMarker) null);
                                    setFailureListener setframe = new setFrame("@");
                                    setMaxFrame.IAuthTabCallback iAuthTabCallback3 = new setMaxFrame.IAuthTabCallback(1.0f);
                                    setMaxFrame.IAuthTabCallback iAuthTabCallback4 = new setMaxFrame.IAuthTabCallback(1.0f);
                                    CameraUnavailableException cameraUnavailableException2 = new CameraUnavailableException(0, (Boolean) null, onextracallback.onNavigationEvent(), onnavigationevent2.onExtraCallbackWithResult(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                    if ((i12 & 7168) == 2048) {
                                        int i37 = IAuthTabCallback + 107;
                                        onWarmupCompleted = i37 % 128;
                                        int i38 = i37 % 2;
                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        setfontassetdelegate = setfontassetdelegate4;
                                        z8 = true;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        z8 = false;
                                        setfontassetdelegate = setfontassetdelegate4;
                                    }
                                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(setfontassetdelegate);
                                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                                    if ((z8 || zOnNavigationEvent2) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function1 function14 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda44
                                            private static int onExtraCallbackWithResult = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke(Object obj4) {
                                                Unit unitOnNavigationEvent;
                                                int i39 = 2 % 2;
                                                int i40 = onNavigationEvent + 21;
                                                onExtraCallbackWithResult = i40 % 128;
                                                if (i40 % 2 != 0) {
                                                    unitOnNavigationEvent = SplitTextField.IAuthTabCallback.onNavigationEvent(function12, setfontassetdelegate, (selectParentResolutions) obj4);
                                                    int i41 = 43 / 0;
                                                } else {
                                                    unitOnNavigationEvent = SplitTextField.IAuthTabCallback.onNavigationEvent(function12, setfontassetdelegate, (selectParentResolutions) obj4);
                                                }
                                                int i42 = onNavigationEvent + 71;
                                                onExtraCallbackWithResult = i42 % 128;
                                                int i43 = i42 % 2;
                                                return unitOnNavigationEvent;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function14);
                                        obj = function14;
                                    } else {
                                        obj = objOnMinimized4;
                                    }
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult3;
                                    List listListOf = CollectionsKt.listOf(new setFailureListener[]{setfontassetdelegate5, setFontMap.onNavigationEvent, new setFallbackResource(CollectionsKt.listOf(new setFailureListener[]{setframe, new setFontAssetDelegate(selectparentresolutions2, (Function1) obj, iAuthTabCallback3, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback4, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException2, (CameraState) null, false, false, false, 0, 0, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 134086632, (DefaultConstructorMarker) null)}), new setMaxFrame.IAuthTabCallback(1.0f), (setMaxFrame) null, 4, (DefaultConstructorMarker) null)});
                                    if (str7 == null) {
                                        int i39 = onWarmupCompleted + 115;
                                        IAuthTabCallback = i39 % 128;
                                        if (i39 % 2 != 0) {
                                            cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(-198348308);
                                            throw null;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-198348308);
                                        getbacktracenoteOnExtraCallback = null;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-198348307);
                                        getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1269683136, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda45
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallback = 1;

                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                int i40 = 2 % 2;
                                                int i41 = IAuthTabCallback + 93;
                                                onExtraCallback = i41 % 128;
                                                int i42 = i41 % 2;
                                                Object[] objArr = {str7, (RowScope) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(((Integer) obj6).intValue())};
                                                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                                Unit unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -672075033, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 672075063, iOnWarmupCompleted);
                                                int i43 = IAuthTabCallback + 93;
                                                onExtraCallback = i43 % 128;
                                                int i44 = i43 % 2;
                                                return unit;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    int i40 = i12 >> 12;
                                    int i41 = i18 << 18;
                                    setIgnoreDisabledSystemAnimations.onExtraCallbackWithResult(listListOf, quirksExternalSyntheticBackport03, onnavigationevent, str5, z7, onwarmupcompleted3, getbacktracenoteOnExtraCallback, z9, z10, cameraCaptureResultEmptyCameraCaptureResult2, (i40 & 458752) | ((i12 >> 9) & 112) | (i40 & 896) | (i40 & 7168) | (57344 & i40) | (29360128 & i41) | (i41 & 234881024), 0);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                        int i42 = onWarmupCompleted + 37;
                                        IAuthTabCallback = i42 % 128;
                                        int i43 = i42 % 2;
                                    }
                                    str4 = str7;
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                    iAuthTabCallbackStub2 = onnavigationevent;
                                    str3 = str5;
                                    z4 = z7;
                                    onwarmupcompleted2 = onwarmupcompleted3;
                                    z5 = z9;
                                    z6 = z10;
                                    list2 = list3;
                                }
                            }
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda46
                                private static int IAuthTabCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj4, Object obj5) {
                                    int i44 = 2 % 2;
                                    int i45 = onWarmupCompleted + 75;
                                    IAuthTabCallback = i45 % 128;
                                    int i46 = i45 % 2;
                                    Unit unitOnExtraCallbackWithResult = SplitTextField.IAuthTabCallback.onExtraCallbackWithResult(this.f$0, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport02, list2, iAuthTabCallbackStub2, str3, z4, onwarmupcompleted2, str4, z5, z6, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                    int i47 = IAuthTabCallback + 117;
                                    onWarmupCompleted = i47 % 128;
                                    int i48 = i47 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i14 |= 48;
                    i17 = i4 & 4096;
                    if (i17 == 0) {
                    }
                    i18 = i14;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i12) == 306783378 || (i18 & 147) != 146, i12 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                }
                i12 = i5;
                i13 = i4 & 1024;
                if (i13 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 == 0) {
                }
                i17 = i4 & 4096;
                if (i17 == 0) {
                }
                i18 = i14;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i12) == 306783378 || (i18 & 147) != 146, i12 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i4 & 32;
            if (i6 == 0) {
            }
            i7 = i4 & 64;
            if (i7 == 0) {
            }
            i8 = i4 & 128;
            if (i8 == 0) {
            }
            i9 = i4 & 256;
            if (i9 != 0) {
            }
            i10 = i4 & 512;
            if (i10 != 0) {
            }
            i12 = i5;
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 == 0) {
            }
            i17 = i4 & 4096;
            if (i17 == 0) {
            }
            i18 = i14;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i12) == 306783378 || (i18 & 147) != 146, i12 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }

        private static /* synthetic */ Object asInterface(Object[] objArr) throws Resources.NotFoundException {
            Function1 function1 = (Function1) objArr[0];
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), -1609116054, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1609116083, iOnWarmupCompleted);
            function1.invoke(selectparentresolutions.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 95;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return unit;
        }

        private static final Unit writeTypedObject(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) throws Resources.NotFoundException {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 5;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), 881498920, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -881498896, iOnWarmupCompleted);
            function1.invoke(selectparentresolutions.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback + 17;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x01fe  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x036e  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0399  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0419  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x0436  */
        /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x014a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onWarmupCompleted(@NotNull final String str, @NotNull final String str2, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super String, Unit> function12, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<String> list, @Nullable List<setFontAssetDelegate> list2, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str3, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str4, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) throws Resources.NotFoundException {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final List<String> list3;
            List<setFontAssetDelegate> listEmptyList;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            final String str5;
            final boolean z4;
            final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            String str6;
            boolean z5;
            boolean z6;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            List<String> listListOf;
            String str7;
            String str8;
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub3;
            int i18;
            int i19 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1892769392);
            if ((i2 & 6) == 0) {
                i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                    int i20 = onWarmupCompleted + 31;
                    IAuthTabCallback = i20 % 128;
                    if (i20 % 2 != 0) {
                        int i21 = 5 % 3;
                    }
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i5 |= i18;
            }
            if ((i2 & 3072) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
            }
            int i22 = i4 & 16;
            if (i22 != 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    int i23 = onWarmupCompleted + 59;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
                }
                i6 = i4 & 32;
                if (i6 == 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 131072 : 65536;
                }
                i7 = i4 & 64;
                if (i7 == 0) {
                    int i25 = IAuthTabCallback + 57;
                    onWarmupCompleted = i25 % 128;
                    if (i25 % 2 == 0) {
                        i5 |= 1572864;
                        int i26 = 37 / 0;
                    } else {
                        i5 |= 1572864;
                    }
                } else {
                    if ((i2 & 1572864) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list2) ? 1048576 : 524288;
                    }
                    i8 = i4 & 128;
                    if (i8 != 0) {
                        int i27 = onWarmupCompleted + 61;
                        IAuthTabCallback = i27 % 128;
                        int i28 = i27 % 2;
                        i5 |= 12582912;
                    } else {
                        if ((12582912 & i2) == 0) {
                            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 8388608 : 4194304;
                        }
                        i9 = i4 & 256;
                        if (i9 == 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                                int i29 = onWarmupCompleted + 21;
                                IAuthTabCallback = i29 % 128;
                                if (i29 % 2 != 0) {
                                    throw null;
                                }
                                i10 = 67108864;
                            } else {
                                i10 = 33554432;
                            }
                            i5 |= i10;
                        }
                        i11 = i4 & 512;
                        if (i11 == 0) {
                            i5 |= 805306368;
                        } else {
                            if ((805306368 & i2) == 0) {
                                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 536870912 : 268435456;
                            }
                            i12 = i4 & 1024;
                            if (i12 != 0) {
                                i13 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i13 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 4 : 2);
                            } else {
                                i13 = i3;
                            }
                            i14 = i4 & 2048;
                            if (i14 != 0) {
                                int i30 = onWarmupCompleted + 39;
                                IAuthTabCallback = i30 % 128;
                                int i31 = i30 % 2;
                                i13 |= 48;
                            } else {
                                if ((i3 & 48) == 0) {
                                    i13 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 32 : 16;
                                }
                                i15 = i13;
                                i16 = i4 & 4096;
                                if (i16 == 0) {
                                    i15 |= 384;
                                } else {
                                    if ((i3 & 384) == 0) {
                                        i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 256 : 128;
                                    }
                                    i17 = i4 & 8192;
                                    if (i17 == 0) {
                                        if ((i3 & 3072) == 0) {
                                            i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 2048 : 1024;
                                        }
                                        if ((i3 & 24576) == 0) {
                                            i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 16384 : 8192;
                                        }
                                        boolean z7 = true;
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i15 & 9363) != 9362, i5 & 1)) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                            list3 = list;
                                            listEmptyList = list2;
                                            iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                            str5 = str3;
                                            z4 = z;
                                            onwarmupcompleted2 = onwarmupcompleted;
                                            str6 = str4;
                                            z5 = z2;
                                            z6 = z3;
                                        } else {
                                            quirksExternalSyntheticBackport02 = i22 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                            if (i6 != 0) {
                                                int i32 = IAuthTabCallback + 109;
                                                onWarmupCompleted = i32 % 128;
                                                int i33 = i32 % 2;
                                                listListOf = CollectionsKt.listOf(new String[]{"SKT", "KT", "LG", "SKT 알뜰폰", "KT 알뜰폰", "LG 알뜰폰"});
                                            } else {
                                                listListOf = list;
                                            }
                                            if (i7 != 0) {
                                                int i34 = IAuthTabCallback + 43;
                                                onWarmupCompleted = i34 % 128;
                                                int i35 = i34 % 2;
                                                listEmptyList = CollectionsKt.emptyList();
                                            } else {
                                                listEmptyList = list2;
                                            }
                                            setCacheComposition.IAuthTabCallbackStub onnavigationevent = i8 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                                            String str9 = i9 != 0 ? null : str3;
                                            boolean z8 = i11 != 0 ? false : z;
                                            setCacheComposition.onWarmupCompleted onwarmupcompleted3 = i12 != 0 ? setCacheComposition.onWarmupCompleted.APPEAR : onwarmupcompleted;
                                            String str10 = i14 != 0 ? null : str4;
                                            boolean z9 = i16 != 0 ? false : z2;
                                            boolean z10 = i17 != 0 ? true : z3;
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                int i36 = onWarmupCompleted + 27;
                                                str7 = str10;
                                                IAuthTabCallback = i36 % 128;
                                                if (i36 % 2 != 0) {
                                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1892769392, i5, i15, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Phone (SplitTextField.kt:623)");
                                                    Object obj = null;
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1892769392, i5, i15, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Phone (SplitTextField.kt:623)");
                                            } else {
                                                str7 = str10;
                                            }
                                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted4 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                            setCacheComposition.onWarmupCompleted onwarmupcompleted5 = onwarmupcompleted3;
                                            if (objOnMinimized == onwarmupcompleted4.onExtraCallback()) {
                                                str8 = str9;
                                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                                                objOnMinimized = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                                            } else {
                                                str8 = str9;
                                            }
                                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                                            selectParentResolutions selectparentresolutionsOnExtraCallback = selectParentResolutions.onExtraCallback(asInterface((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor), str, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (objOnMinimized2 == onwarmupcompleted4.onExtraCallback()) {
                                                iAuthTabCallbackStub3 = onnavigationevent;
                                                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str2, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                            } else {
                                                iAuthTabCallbackStub3 = onnavigationevent;
                                            }
                                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                                            selectParentResolutions selectparentresolutionsOnExtraCallback2 = selectParentResolutions.onExtraCallback(getInterfaceDescriptor((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor2), str2, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                            boolean z11 = (i5 & 896) == 256;
                                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!z11) {
                                                Object obj2 = objOnMinimized3;
                                                if (objOnMinimized3 == onwarmupcompleted4.onExtraCallback()) {
                                                    Function1 function13 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda33
                                                        private static int IAuthTabCallback = 1;
                                                        private static int onWarmupCompleted;

                                                        public final Object invoke(Object obj3) {
                                                            int i37 = 2 % 2;
                                                            int i38 = IAuthTabCallback + 45;
                                                            onWarmupCompleted = i38 % 128;
                                                            int i39 = i38 % 2;
                                                            Function1 function14 = function1;
                                                            if (i39 == 0) {
                                                                return SplitTextField.IAuthTabCallback.asInterface(function14, getsupportedhighspeedresolutionsfor, (selectParentResolutions) obj3);
                                                            }
                                                            Unit unitAsInterface = SplitTextField.IAuthTabCallback.asInterface(function14, getsupportedhighspeedresolutionsfor, (selectParentResolutions) obj3);
                                                            int i40 = 20 / 0;
                                                            return unitAsInterface;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function13);
                                                    obj2 = function13;
                                                }
                                                Function1 function14 = (Function1) obj2;
                                                if ((i5 & 7168) == 2048) {
                                                    int i37 = onWarmupCompleted + 87;
                                                    IAuthTabCallback = i37 % 128;
                                                    int i38 = i37 % 2;
                                                } else {
                                                    z7 = false;
                                                }
                                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!z7) {
                                                    Object obj3 = objOnMinimized4;
                                                    if (objOnMinimized4 == onwarmupcompleted4.onExtraCallback()) {
                                                        Function1 function15 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda34
                                                            private static int onExtraCallback = 1;
                                                            private static int onExtraCallbackWithResult;

                                                            public final Object invoke(Object obj4) throws Resources.NotFoundException {
                                                                Unit unitAccess100;
                                                                int i39 = 2 % 2;
                                                                int i40 = onExtraCallback + 57;
                                                                onExtraCallbackWithResult = i40 % 128;
                                                                if (i40 % 2 != 0) {
                                                                    unitAccess100 = SplitTextField.IAuthTabCallback.access100(function12, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj4);
                                                                    int i41 = 67 / 0;
                                                                } else {
                                                                    unitAccess100 = SplitTextField.IAuthTabCallback.access100(function12, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj4);
                                                                }
                                                                int i42 = onExtraCallbackWithResult + 37;
                                                                onExtraCallback = i42 % 128;
                                                                if (i42 % 2 != 0) {
                                                                    return unitAccess100;
                                                                }
                                                                throw null;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function15);
                                                        obj3 = function15;
                                                    }
                                                    onWarmupCompleted(new Object[]{this, selectparentresolutionsOnExtraCallback, selectparentresolutionsOnExtraCallback2, function14, (Function1) obj3, quirksExternalSyntheticBackport02, listListOf, listEmptyList, iAuthTabCallbackStub3, str8, Boolean.valueOf(z8), onwarmupcompleted5, str7, Boolean.valueOf(z9), Boolean.valueOf(z10), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(2147475456 & i5), Integer.valueOf(65534 & i15), 0}, zzgsa.onWarmupCompleted(), -773824889, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 773824891, zzgsa.onWarmupCompleted());
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                                    }
                                                    onwarmupcompleted2 = onwarmupcompleted5;
                                                    z5 = z9;
                                                    list3 = listListOf;
                                                    z6 = z10;
                                                    str5 = str8;
                                                    iAuthTabCallbackStub2 = iAuthTabCallbackStub3;
                                                    str6 = str7;
                                                    z4 = z8;
                                                }
                                            }
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                            final List<setFontAssetDelegate> list4 = listEmptyList;
                                            final String str11 = str6;
                                            final boolean z12 = z5;
                                            final boolean z13 = z6;
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda35
                                                private static int onExtraCallback = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj4, Object obj5) throws Resources.NotFoundException {
                                                    int i39 = 2 % 2;
                                                    int i40 = onExtraCallback + 63;
                                                    onWarmupCompleted = i40 % 128;
                                                    int i41 = i40 % 2;
                                                    Unit unitOnWarmupCompleted = SplitTextField.IAuthTabCallback.onWarmupCompleted(this.f$0, str, str2, function1, function12, quirksExternalSyntheticBackport03, list3, list4, iAuthTabCallbackStub2, str5, z4, onwarmupcompleted2, str11, z12, z13, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                    int i42 = onWarmupCompleted + 117;
                                                    onExtraCallback = i42 % 128;
                                                    int i43 = i42 % 2;
                                                    return unitOnWarmupCompleted;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i15 |= 3072;
                                    if ((i3 & 24576) == 0) {
                                    }
                                    boolean z72 = true;
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i15 & 9363) != 9362, i5 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                    }
                                }
                                i17 = i4 & 8192;
                                if (i17 == 0) {
                                }
                                if ((i3 & 24576) == 0) {
                                }
                                boolean z722 = true;
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i15 & 9363) != 9362, i5 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            i15 = i13;
                            i16 = i4 & 4096;
                            if (i16 == 0) {
                            }
                            i17 = i4 & 8192;
                            if (i17 == 0) {
                            }
                            if ((i3 & 24576) == 0) {
                            }
                            boolean z7222 = true;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i15 & 9363) != 9362, i5 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i12 = i4 & 1024;
                        if (i12 != 0) {
                        }
                        i14 = i4 & 2048;
                        if (i14 != 0) {
                        }
                        i15 = i13;
                        i16 = i4 & 4096;
                        if (i16 == 0) {
                        }
                        i17 = i4 & 8192;
                        if (i17 == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        boolean z72222 = true;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i15 & 9363) != 9362, i5 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i9 = i4 & 256;
                    if (i9 == 0) {
                    }
                    i11 = i4 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i4 & 1024;
                    if (i12 != 0) {
                    }
                    i14 = i4 & 2048;
                    if (i14 != 0) {
                    }
                    i15 = i13;
                    i16 = i4 & 4096;
                    if (i16 == 0) {
                    }
                    i17 = i4 & 8192;
                    if (i17 == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    boolean z722222 = true;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i15 & 9363) != 9362, i5 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                }
                i9 = i4 & 256;
                if (i9 == 0) {
                }
                i11 = i4 & 512;
                if (i11 == 0) {
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                }
                i15 = i13;
                i16 = i4 & 4096;
                if (i16 == 0) {
                }
                i17 = i4 & 8192;
                if (i17 == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                boolean z7222222 = true;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i15 & 9363) != 9362, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i4 & 32;
            if (i6 == 0) {
            }
            i7 = i4 & 64;
            if (i7 == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            i9 = i4 & 256;
            if (i9 == 0) {
            }
            i11 = i4 & 512;
            if (i11 == 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            i15 = i13;
            i16 = i4 & 4096;
            if (i16 == 0) {
            }
            i17 = i4 & 8192;
            if (i17 == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            boolean z72222222 = true;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i15 & 9363) != 9362, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }

        private static final Unit ICustomTabsCallbackDefault(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i5 = onWarmupCompleted + 121;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    int i7 = onWarmupCompleted + 117;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit mayLaunchUrl(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i3 = IAuthTabCallback + 57;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    setfontassetdelegate.IAuthTabCallbackDefault();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    int i4 = IAuthTabCallback + 113;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit asBinder(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
                int i4 = onWarmupCompleted + 27;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onWarmupCompleted + 91;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1432623858, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Phone.<anonymous>.<anonymous> (SplitTextField.kt:735)");
                    int i8 = IAuthTabCallback + 57;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit access100(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
            return Unit.INSTANCE;
        }

        private static final Unit onWarmupCompleted(Function1 function1, selectParentResolutions selectparentresolutions, String str, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 33;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            function1.invoke(selectParentResolutions.onExtraCallback(selectparentresolutions, str, 0L, (getNumberOfTargets) null, 6, (Object) null));
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 71;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 84 / 0;
            }
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1, types: [im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda42, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v2 */
        private static final Unit onExtraCallbackWithResult(List list, final Function1 function1, final selectParentResolutions selectparentresolutions, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, r8lambda4iPehIguYa_OQeAKv3agz_bCFQA r8lambda4ipehiguya_oqeakv3agz_bcfqa, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            int i4;
            int i5 = 2 % 2;
            Intrinsics.checkNotNullParameter(r8lambda4ipehiguya_oqeakv3agz_bcfqa, "");
            if ((i2 & 6) == 0) {
                int i6 = IAuthTabCallback + 27;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambda4ipehiguya_oqeakv3agz_bcfqa)) {
                    i4 = 2;
                } else {
                    int i8 = onWarmupCompleted + 11;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 4;
                }
                i3 = i2 | i4;
            } else {
                i3 = i2;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-329422233, i3, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Phone.<anonymous> (SplitTextField.kt:746)");
                }
                int i10 = 0;
                for (int size = list.size(); i10 < size; size = size) {
                    final String str = (String) list.get(i10);
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(selectparentresolutions);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                    Function0 function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3) || function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        function0OnMinimized = new Function0() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda42
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i11 = 2 % 2;
                                int i12 = onWarmupCompleted + 75;
                                onExtraCallbackWithResult = i12 % 128;
                                int i13 = i12 % 2;
                                Unit unitIAuthTabCallback = SplitTextField.IAuthTabCallback.IAuthTabCallback(function1, selectparentresolutions, str, getsupportedhighspeedresolutionsfor);
                                int i14 = onExtraCallbackWithResult + 73;
                                onWarmupCompleted = i14 % 128;
                                if (i14 % 2 != 0) {
                                    int i15 = 53 / 0;
                                }
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((Object) function0OnMinimized);
                    }
                    r8lambda4iPehIguYa_OQeAKv3agz_bCFQA.onWarmupCompleted(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1484211955, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1484211951, new Object[]{r8lambda4ipehiguya_oqeakv3agz_bcfqa, str, function0OnMinimized, null, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i3 << 15) & 458752), 28}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
                    i10++;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            Unit unit = Unit.INSTANCE;
            int i11 = onWarmupCompleted + 53;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x01e2 A[PHI: r12
          0x01e2: PHI (r12v6 int) = (r12v5 int), (r12v20 int), (r12v21 int) binds: [B:96:0x01d1, B:103:0x01e0, B:102:0x01dd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x021b  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0294  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x029c  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0360  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x03d6  */
        /* JADX WARN: Removed duplicated region for block: B:239:0x04a2  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x0517  */
        /* JADX WARN: Removed duplicated region for block: B:244:0x052d  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x058c  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x0597  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x05ce  */
        /* JADX WARN: Removed duplicated region for block: B:255:0x05e8  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x060e  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0186 A[PHI: r15
          0x0186: PHI (r15v22 int) = (r15v9 int), (r15v12 int), (r15v13 int) binds: [B:72:0x0184, B:79:0x0194, B:78:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i2;
            Function1 function1;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
            int i3;
            int i4;
            int i5;
            int i6;
            List list;
            setCacheComposition.IAuthTabCallbackStub.onNavigationEvent onnavigationevent;
            int i7;
            int i8;
            int i9;
            String str;
            int i10;
            int i11;
            int i12;
            boolean z;
            boolean z2;
            int i13;
            int i14;
            int i15;
            boolean z3;
            int i16;
            final Function1 function12;
            final Function1 function13;
            selectParentResolutions selectparentresolutions;
            int i17;
            final selectParentResolutions selectparentresolutions2;
            Object obj;
            final setCacheComposition.onWarmupCompleted onwarmupcompleted;
            final String str2;
            final boolean z4;
            final boolean z5;
            final boolean z6;
            final List list2;
            final setCacheComposition.IAuthTabCallbackStub.onNavigationEvent onnavigationevent2;
            final List list3;
            final String str3;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2;
            final setFontAssetDelegate setfontassetdelegate;
            boolean z7;
            Object obj2;
            getBacktraceNote getbacktracenote;
            Object objOnMinimized;
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
            int i18;
            final IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            selectParentResolutions selectparentresolutions3 = (selectParentResolutions) objArr[1];
            selectParentResolutions selectparentresolutions4 = (selectParentResolutions) objArr[2];
            final Function1 function14 = (Function1) objArr[3];
            Function1 function15 = (Function1) objArr[4];
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = (QuirksExternalSyntheticBackport0) objArr[5];
            List list4 = (List) objArr[6];
            List list5 = (List) objArr[7];
            setCacheComposition.IAuthTabCallbackStub.onNavigationEvent onnavigationevent3 = (setCacheComposition.IAuthTabCallbackStub) objArr[8];
            String str4 = (String) objArr[9];
            boolean zBooleanValue = ((Boolean) objArr[10]).booleanValue();
            setCacheComposition.onWarmupCompleted onwarmupcompleted2 = (setCacheComposition.onWarmupCompleted) objArr[11];
            String str5 = (String) objArr[12];
            boolean zBooleanValue2 = ((Boolean) objArr[13]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[14]).booleanValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[15];
            int iIntValue = ((Number) objArr[16]).intValue();
            int iIntValue2 = ((Number) objArr[17]).intValue();
            int iIntValue3 = ((Number) objArr[18]).intValue();
            int i19 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions3, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions4, "");
            Intrinsics.checkNotNullParameter(function14, "");
            Intrinsics.checkNotNullParameter(function15, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-206528272);
            if ((iIntValue & 6) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions3) ? 4 : 2) | iIntValue;
            } else {
                i2 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions4) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14) ? 256 : 128;
            }
            int i20 = 1024;
            if ((iIntValue & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function15)) {
                    int i21 = IAuthTabCallback + 111;
                    onWarmupCompleted = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 5 / 3;
                    }
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i2 |= i18;
            }
            int i23 = iIntValue3 & 16;
            if (i23 != 0) {
                int i24 = IAuthTabCallback + 125;
                function1 = function15;
                onWarmupCompleted = i24 % 128;
                int i25 = i24 % 2;
                i2 |= 24576;
            } else {
                function1 = function15;
                if ((iIntValue & 24576) == 0) {
                    i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3) ? 16384 : 8192;
                }
            }
            int i26 = iIntValue3 & 32;
            if (i26 == 0) {
                if ((196608 & iIntValue) == 0) {
                    onextracallback = onextracallback3;
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list4)) {
                        i3 = 65536;
                    } else {
                        int i27 = IAuthTabCallback + 63;
                        onWarmupCompleted = i27 % 128;
                        int i28 = i27 % 2;
                        i3 = 131072;
                    }
                    i2 |= i3;
                }
                i4 = iIntValue3 & 64;
                if (i4 == 0) {
                    i2 |= 1572864;
                } else if ((iIntValue & 1572864) == 0) {
                    int i29 = IAuthTabCallback + 37;
                    onWarmupCompleted = i29 % 128;
                    if (i29 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list5);
                        throw null;
                    }
                    i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list5) ? 1048576 : 524288;
                }
                i5 = iIntValue3 & 128;
                int i30 = 12582912;
                if (i5 != 0) {
                    i2 |= i30;
                } else if ((12582912 & iIntValue) == 0) {
                    i30 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent3) ? 8388608 : 4194304;
                    i2 |= i30;
                }
                i6 = iIntValue3 & 256;
                if (i6 != 0) {
                    if ((iIntValue & 100663296) == 0) {
                        list = list5;
                        int i31 = IAuthTabCallback + 53;
                        onnavigationevent = onnavigationevent3;
                        onWarmupCompleted = i31 % 128;
                        if (i31 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 67108864 : 33554432;
                    }
                    i7 = iIntValue3 & 512;
                    int i32 = 805306368;
                    if (i7 != 0) {
                        i2 |= i32;
                    } else if ((805306368 & iIntValue) == 0) {
                        i32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 536870912 : 268435456;
                        i2 |= i32;
                    }
                    i8 = iIntValue3 & 1024;
                    if (i8 != 0) {
                        i9 = iIntValue;
                        int i33 = onWarmupCompleted + 77;
                        str = str4;
                        IAuthTabCallback = i33 % 128;
                        int i34 = i33 % 2;
                        i10 = iIntValue2 | 6;
                    } else {
                        i9 = iIntValue;
                        str = str4;
                        if ((iIntValue2 & 6) == 0) {
                            i10 = iIntValue2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted2 == null ? -1 : onwarmupcompleted2.ordinal()) ? 4 : 2);
                        } else {
                            i10 = iIntValue2;
                        }
                    }
                    i11 = iIntValue3 & 2048;
                    if (i11 != 0) {
                        i10 |= 48;
                    } else if ((iIntValue2 & 48) == 0) {
                        i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ? 32 : 16;
                    }
                    i12 = iIntValue3 & 4096;
                    if (i12 == 0) {
                        z = zBooleanValue;
                        if ((iIntValue2 & 384) == 0) {
                            z2 = zBooleanValue2;
                            i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 256 : 128;
                        }
                        boolean z8 = z2;
                        i13 = iIntValue3 & 8192;
                        if (i13 == 0) {
                            i14 = iIntValue3;
                            i15 = iIntValue2;
                            i16 = i10 | 3072;
                            z3 = zBooleanValue3;
                        } else {
                            i14 = iIntValue3;
                            if ((iIntValue2 & 3072) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue3)) {
                                    z3 = zBooleanValue3;
                                    int i35 = onWarmupCompleted + 35;
                                    i15 = iIntValue2;
                                    IAuthTabCallback = i35 % 128;
                                    i20 = i35 % 2 != 0 ? 3550 : 2048;
                                } else {
                                    z3 = zBooleanValue3;
                                    i15 = iIntValue2;
                                }
                                i10 |= i20;
                            } else {
                                i15 = iIntValue2;
                                z3 = zBooleanValue3;
                            }
                            i16 = i10;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i2) == 306783378 || (i16 & 1171) != 1170, i2 & 1)) {
                            function12 = function14;
                            function13 = function1;
                            selectparentresolutions = selectparentresolutions4;
                            i17 = i9;
                            selectparentresolutions2 = selectparentresolutions3;
                            obj = null;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            onwarmupcompleted = onwarmupcompleted2;
                            str2 = str5;
                            z4 = z;
                            z5 = z8;
                            z6 = z3;
                            list2 = list4;
                            onnavigationevent2 = onnavigationevent;
                            list3 = list;
                            str3 = str;
                        } else {
                            if (i23 != 0) {
                                int i36 = onWarmupCompleted + 39;
                                IAuthTabCallback = i36 % 128;
                                int i37 = i36 % 2;
                                onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                            } else {
                                onextracallback2 = onextracallback;
                            }
                            final List listListOf = i26 != 0 ? CollectionsKt.listOf(new String[]{"SKT", "KT", "LG", "SKT 알뜰폰", "KT 알뜰폰", "LG 알뜰폰"}) : list4;
                            List listEmptyList = i4 != 0 ? CollectionsKt.emptyList() : list;
                            setCacheComposition.IAuthTabCallbackStub.onNavigationEvent onnavigationevent4 = i5 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : onnavigationevent;
                            String str6 = i6 != 0 ? null : str;
                            boolean z9 = i7 != 0 ? false : z;
                            if (i8 != 0) {
                                onwarmupcompleted2 = setCacheComposition.onWarmupCompleted.APPEAR;
                            }
                            setCacheComposition.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted2;
                            String str7 = i11 != 0 ? null : str5;
                            boolean z10 = i12 != 0 ? false : z8;
                            boolean z11 = i13 != 0 ? true : z3;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-206528272, i2, i16, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Phone (SplitTextField.kt:669)");
                            }
                            int i38 = 3670016 & i2;
                            boolean z12 = i38 == 1048576;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z12 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 0);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            final setFontAssetDelegate setfontassetdelegate2 = (setFontAssetDelegate) objOnMinimized2;
                            boolean z13 = i38 == 1048576;
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!z13) {
                                Object obj4 = objOnMinimized3;
                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    setFontAssetDelegate setfontassetdelegate3 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 1);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate3);
                                    obj4 = setfontassetdelegate3;
                                }
                                setFontAssetDelegate setfontassetdelegate4 = (setFontAssetDelegate) obj4;
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted4 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                if (objOnMinimized4 == onwarmupcompleted4.onExtraCallback()) {
                                    objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                                setMaxFrame.IAuthTabCallback iAuthTabCallback2 = new setMaxFrame.IAuthTabCallback(0.5f);
                                setMaxFrame.IAuthTabCallback iAuthTabCallback3 = new setMaxFrame.IAuthTabCallback(1.0f);
                                setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted;
                                onNavigationEvent onnavigationevent5 = new onNavigationEvent();
                                filterResolutionsByAspectRatio.onNavigationEvent onnavigationevent6 = filterResolutionsByAspectRatio.Companion;
                                CameraUnavailableException cameraUnavailableException = new CameraUnavailableException(0, (Boolean) null, 0, onnavigationevent6.onExtraCallback(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 119, (DefaultConstructorMarker) null);
                                boolean z14 = (i2 & 896) == 256;
                                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setfontassetdelegate2);
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z14 | zOnNavigationEvent)) {
                                    Object obj5 = objOnMinimized5;
                                    if (objOnMinimized5 == onwarmupcompleted4.onExtraCallback()) {
                                        Function1 function16 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda5
                                            private static int onExtraCallbackWithResult = 1;
                                            private static int onNavigationEvent;

                                            public final Object invoke(Object obj6) {
                                                int i39 = 2 % 2;
                                                int i40 = onNavigationEvent + 103;
                                                onExtraCallbackWithResult = i40 % 128;
                                                int i41 = i40 % 2;
                                                Unit interfaceDescriptor = SplitTextField.IAuthTabCallback.getInterfaceDescriptor(function14, setfontassetdelegate2, (selectParentResolutions) obj6);
                                                int i42 = onNavigationEvent + 23;
                                                onExtraCallbackWithResult = i42 % 128;
                                                if (i42 % 2 == 0) {
                                                    int i43 = 20 / 0;
                                                }
                                                return interfaceDescriptor;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function16);
                                        obj5 = function16;
                                    }
                                    Function1 function17 = (Function1) obj5;
                                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized6 == onwarmupcompleted4.onExtraCallback()) {
                                        objOnMinimized6 = new Function0() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda6
                                            private static int onExtraCallback = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke() {
                                                int i39 = 2 % 2;
                                                int i40 = onExtraCallback + 5;
                                                onNavigationEvent = i40 % 128;
                                                int i41 = i40 % 2;
                                                Unit unitOnNavigationEvent = SplitTextField.IAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                                                int i42 = onNavigationEvent + 85;
                                                onExtraCallback = i42 % 128;
                                                if (i42 % 2 == 0) {
                                                    return unitOnNavigationEvent;
                                                }
                                                Object obj6 = null;
                                                obj6.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                    }
                                    obj = null;
                                    Function1 function18 = function1;
                                    int i39 = i2;
                                    final String str8 = str7;
                                    selectparentresolutions = selectparentresolutions4;
                                    List list6 = listEmptyList;
                                    i17 = i9;
                                    setFailureListener setfontassetdelegate5 = new setFontAssetDelegate(selectparentresolutions3, function17, iAuthTabCallback2, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback3, (setCacheComposition.onExtraCallback) null, (Function0) objOnMinimized6, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, onnavigationevent5, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, 0, 0, onextracallbackwithresult, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 116776872, (DefaultConstructorMarker) null);
                                    setMaxFrame.IAuthTabCallback iAuthTabCallback4 = new setMaxFrame.IAuthTabCallback(1.0f);
                                    setMaxFrame.IAuthTabCallback iAuthTabCallback5 = new setMaxFrame.IAuthTabCallback(1.0f);
                                    CameraUnavailableException cameraUnavailableException2 = new CameraUnavailableException(0, (Boolean) null, getParentSizesThatAreTooLarge.Companion.IAuthTabCallbackDefault(), onnavigationevent6.onExtraCallbackWithResult(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                    if ((i39 & 7168) == 2048) {
                                        setfontassetdelegate = setfontassetdelegate4;
                                        z7 = true;
                                    } else {
                                        setfontassetdelegate = setfontassetdelegate4;
                                        z7 = false;
                                    }
                                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setfontassetdelegate);
                                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z7 || zOnNavigationEvent2) {
                                        function13 = function18;
                                        Function1 function19 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda7
                                            private static int onExtraCallbackWithResult = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke(Object obj6) {
                                                int i40 = 2 % 2;
                                                int i41 = onExtraCallbackWithResult + 71;
                                                onWarmupCompleted = i41 % 128;
                                                int i42 = i41 % 2;
                                                Unit unitIAuthTabCallbackStub = SplitTextField.IAuthTabCallback.IAuthTabCallbackStub(function13, setfontassetdelegate, (selectParentResolutions) obj6);
                                                int i43 = onWarmupCompleted + 15;
                                                onExtraCallbackWithResult = i43 % 128;
                                                if (i43 % 2 != 0) {
                                                    int i44 = 80 / 0;
                                                }
                                                return unitIAuthTabCallbackStub;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function19);
                                        obj2 = function19;
                                        List listListOf2 = CollectionsKt.listOf(new setFailureListener[]{setfontassetdelegate5, setFontMap.onNavigationEvent, new setFallbackResource(CollectionsKt.listOf(new setFontAssetDelegate(selectparentresolutions, (Function1) obj2, iAuthTabCallback4, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback5, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException2, (CameraState) null, false, false, false, 0, 0, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 134086632, (DefaultConstructorMarker) null)), new setMaxFrame.IAuthTabCallback(1.0f), (setMaxFrame) null, 4, (DefaultConstructorMarker) null)});
                                        if (str8 != null) {
                                            int i40 = onWarmupCompleted + 63;
                                            IAuthTabCallback = i40 % 128;
                                            int i41 = i40 % 2;
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2008346778);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            getbacktracenote = null;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2008346779);
                                            getBacktraceNote getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1432623858, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda8
                                                private static int IAuthTabCallback = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    int i42 = 2 % 2;
                                                    int i43 = onWarmupCompleted + 119;
                                                    IAuthTabCallback = i43 % 128;
                                                    int i44 = i43 % 2;
                                                    String str9 = str8;
                                                    RowScope rowScope = (RowScope) obj6;
                                                    if (i44 == 0) {
                                                        return SplitTextField.IAuthTabCallback.onExtraCallbackWithResult(str9, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                    }
                                                    SplitTextField.IAuthTabCallback.onExtraCallbackWithResult(str9, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                    throw null;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            getbacktracenote = getbacktracenoteOnExtraCallback;
                                        }
                                        int i42 = i39 >> 15;
                                        int i43 = i16 << 15;
                                        setIgnoreDisabledSystemAnimations.onExtraCallbackWithResult(listListOf2, onextracallback2, onnavigationevent4, str6, z9, onwarmupcompleted3, getbacktracenote, z10, z11, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i39 >> 9) & 112) | (i42 & 896) | (i42 & 7168) | (i42 & 57344) | (458752 & i43) | (29360128 & i43) | (i43 & 234881024), 0);
                                        boolean zOnTransact = onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
                                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized != onwarmupcompleted4.onExtraCallback()) {
                                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                                            objOnMinimized = new Function0() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda9
                                                private static int onExtraCallback = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke() {
                                                    int i44 = 2 % 2;
                                                    int i45 = onWarmupCompleted + 79;
                                                    onExtraCallback = i45 % 128;
                                                    int i46 = i45 % 2;
                                                    Unit unitIAuthTabCallback = SplitTextField.IAuthTabCallback.IAuthTabCallback(getsupportedhighspeedresolutionsfor);
                                                    int i47 = onExtraCallback + 49;
                                                    onWarmupCompleted = i47 % 128;
                                                    if (i47 % 2 != 0) {
                                                        return unitIAuthTabCallback;
                                                    }
                                                    Object obj6 = null;
                                                    obj6.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        } else {
                                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                                        }
                                        selectparentresolutions2 = selectparentresolutions3;
                                        function12 = function14;
                                        w7.onWarmupCompleted(zOnTransact, (Function0) objOnMinimized, (QuirksExternalSyntheticBackport0) null, 0L, (setContentInsetsRelative) null, (PreviewProcessorOnCaptureResultCallback) null, (toMetersPerSecond) null, 0L, (getCurrentMenuItems) null, ForwardingCameraControl.onExtraCallback(-329422233, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda10
                                            private static int onExtraCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i44 = 2 % 2;
                                                int i45 = onExtraCallbackWithResult + 83;
                                                onExtraCallback = i45 % 128;
                                                if (i45 % 2 == 0) {
                                                    return SplitTextField.IAuthTabCallback.onExtraCallback(listListOf, function12, selectparentresolutions2, getsupportedhighspeedresolutionsfor, (r8lambda4iPehIguYa_OQeAKv3agz_bCFQA) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                }
                                                SplitTextField.IAuthTabCallback.onExtraCallback(listListOf, function12, selectparentresolutions2, getsupportedhighspeedresolutionsfor, (r8lambda4iPehIguYa_OQeAKv3agz_bCFQA) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                Object obj9 = null;
                                                obj9.hashCode();
                                                throw null;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805306416, 508);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        onextracallback = onextracallback2;
                                        list2 = listListOf;
                                        str2 = str8;
                                        onnavigationevent2 = onnavigationevent4;
                                        str3 = str6;
                                        z4 = z9;
                                        onwarmupcompleted = onwarmupcompleted3;
                                        z5 = z10;
                                        z6 = z11;
                                        list3 = list6;
                                    } else {
                                        int i44 = onWarmupCompleted + 93;
                                        IAuthTabCallback = i44 % 128;
                                        if (i44 % 2 != 0) {
                                            onwarmupcompleted4.onExtraCallback();
                                            throw null;
                                        }
                                        if (objOnMinimized7 != onwarmupcompleted4.onExtraCallback()) {
                                            function13 = function18;
                                            obj2 = objOnMinimized7;
                                        }
                                        List listListOf22 = CollectionsKt.listOf(new setFailureListener[]{setfontassetdelegate5, setFontMap.onNavigationEvent, new setFallbackResource(CollectionsKt.listOf(new setFontAssetDelegate(selectparentresolutions, (Function1) obj2, iAuthTabCallback4, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback5, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException2, (CameraState) null, false, false, false, 0, 0, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 134086632, (DefaultConstructorMarker) null)), new setMaxFrame.IAuthTabCallback(1.0f), (setMaxFrame) null, 4, (DefaultConstructorMarker) null)});
                                        if (str8 != null) {
                                        }
                                        int i422 = i39 >> 15;
                                        int i432 = i16 << 15;
                                        setIgnoreDisabledSystemAnimations.onExtraCallbackWithResult(listListOf22, onextracallback2, onnavigationevent4, str6, z9, onwarmupcompleted3, getbacktracenote, z10, z11, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i39 >> 9) & 112) | (i422 & 896) | (i422 & 7168) | (i422 & 57344) | (458752 & i432) | (29360128 & i432) | (i432 & 234881024), 0);
                                        boolean zOnTransact2 = onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
                                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized != onwarmupcompleted4.onExtraCallback()) {
                                        }
                                        selectparentresolutions2 = selectparentresolutions3;
                                        function12 = function14;
                                        w7.onWarmupCompleted(zOnTransact2, (Function0) objOnMinimized, (QuirksExternalSyntheticBackport0) null, 0L, (setContentInsetsRelative) null, (PreviewProcessorOnCaptureResultCallback) null, (toMetersPerSecond) null, 0L, (getCurrentMenuItems) null, ForwardingCameraControl.onExtraCallback(-329422233, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda10
                                            private static int onExtraCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i442 = 2 % 2;
                                                int i45 = onExtraCallbackWithResult + 83;
                                                onExtraCallback = i45 % 128;
                                                if (i45 % 2 == 0) {
                                                    return SplitTextField.IAuthTabCallback.onExtraCallback(listListOf, function12, selectparentresolutions2, getsupportedhighspeedresolutionsfor, (r8lambda4iPehIguYa_OQeAKv3agz_bCFQA) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                }
                                                SplitTextField.IAuthTabCallback.onExtraCallback(listListOf, function12, selectparentresolutions2, getsupportedhighspeedresolutionsfor, (r8lambda4iPehIguYa_OQeAKv3agz_bCFQA) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                Object obj9 = null;
                                                obj9.hashCode();
                                                throw null;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805306416, 508);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                        onextracallback = onextracallback2;
                                        list2 = listListOf;
                                        str2 = str8;
                                        onnavigationevent2 = onnavigationevent4;
                                        str3 = str6;
                                        z4 = z9;
                                        onwarmupcompleted = onwarmupcompleted3;
                                        z5 = z10;
                                        z6 = z11;
                                        list3 = list6;
                                    }
                                }
                            }
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final selectParentResolutions selectparentresolutions5 = selectparentresolutions2;
                            final int i45 = i15;
                            final selectParentResolutions selectparentresolutions6 = selectparentresolutions;
                            final Function1 function110 = function12;
                            final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = onextracallback;
                            final int i46 = i17;
                            final int i47 = i14;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda11
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj6, Object obj7) throws Resources.NotFoundException {
                                    int i48 = 2 % 2;
                                    int i49 = IAuthTabCallback + 93;
                                    onNavigationEvent = i49 % 128;
                                    int i50 = i49 % 2;
                                    Unit unitIAuthTabCallback = SplitTextField.IAuthTabCallback.IAuthTabCallback(this.f$0, selectparentresolutions5, selectparentresolutions6, function110, function13, onextracallback4, list2, list3, onnavigationevent2, str3, z4, onwarmupcompleted, str2, z5, z6, i46, i45, i47, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                    int i51 = IAuthTabCallback + 21;
                                    onNavigationEvent = i51 % 128;
                                    if (i51 % 2 != 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    Object obj8 = null;
                                    obj8.hashCode();
                                    throw null;
                                }
                            });
                        }
                        return obj;
                    }
                    i10 |= 384;
                    z = zBooleanValue;
                    z2 = zBooleanValue2;
                    boolean z82 = z2;
                    i13 = iIntValue3 & 8192;
                    if (i13 == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i2) == 306783378 || (i16 & 1171) != 1170, i2 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                    return obj;
                }
                i2 |= 100663296;
                list = list5;
                onnavigationevent = onnavigationevent3;
                i7 = iIntValue3 & 512;
                int i322 = 805306368;
                if (i7 != 0) {
                }
                i8 = iIntValue3 & 1024;
                if (i8 != 0) {
                }
                i11 = iIntValue3 & 2048;
                if (i11 != 0) {
                }
                i12 = iIntValue3 & 4096;
                if (i12 == 0) {
                }
                z2 = zBooleanValue2;
                boolean z822 = z2;
                i13 = iIntValue3 & 8192;
                if (i13 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i2) == 306783378 || (i16 & 1171) != 1170, i2 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                return obj;
            }
            i2 |= 196608;
            onextracallback = onextracallback3;
            i4 = iIntValue3 & 64;
            if (i4 == 0) {
            }
            i5 = iIntValue3 & 128;
            int i302 = 12582912;
            if (i5 != 0) {
            }
            i6 = iIntValue3 & 256;
            if (i6 != 0) {
            }
            list = list5;
            onnavigationevent = onnavigationevent3;
            i7 = iIntValue3 & 512;
            int i3222 = 805306368;
            if (i7 != 0) {
            }
            i8 = iIntValue3 & 1024;
            if (i8 != 0) {
            }
            i11 = iIntValue3 & 2048;
            if (i11 != 0) {
            }
            i12 = iIntValue3 & 4096;
            if (i12 == 0) {
            }
            z2 = zBooleanValue2;
            boolean z8222 = z2;
            i13 = iIntValue3 & 8192;
            if (i13 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i2) == 306783378 || (i16 & 1171) != 1170, i2 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return obj;
        }

        private static final Unit IAuthTabCallbackStubProxy(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions.onNavigationEvent());
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor, selectparentresolutions);
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback + 43;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static final Unit getInterfaceDescriptor(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions.onNavigationEvent());
            onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, selectparentresolutions);
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 97;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static /* synthetic */ Object access000(Object[] objArr) {
            Unit unit;
            Function1 function1 = (Function1) objArr[0];
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 121;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                function1.invoke(selectparentresolutions.onNavigationEvent());
                onNavigationEvent(getsupportedhighspeedresolutionsfor, selectparentresolutions);
                unit = Unit.INSTANCE;
                int i4 = 36 / 0;
            } else {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                function1.invoke(selectparentresolutions.onNavigationEvent());
                onNavigationEvent(getsupportedhighspeedresolutionsfor, selectparentresolutions);
                unit = Unit.INSTANCE;
            }
            int i5 = IAuthTabCallback + 73;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return unit;
        }

        private static /* synthetic */ Object access100(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions.onNavigationEvent());
            onWarmupCompleted(getsupportedhighspeedresolutionsfor, selectparentresolutions);
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 13;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 63 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0262  */
        /* JADX WARN: Removed duplicated region for block: B:242:0x0456  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x047a  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x049d  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x0526  */
        /* JADX WARN: Removed duplicated region for block: B:284:0x0545  */
        /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x013f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onWarmupCompleted(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super String, Unit> function12, @NotNull final Function1<? super String, Unit> function13, @NotNull final Function1<? super String, Unit> function14, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str5, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str6, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final List<setFontAssetDelegate> list2;
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            String str7;
            final boolean z4;
            final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            final String str8;
            final boolean z5;
            final boolean z6;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            boolean z7;
            boolean z8;
            setCacheComposition.onWarmupCompleted onwarmupcompleted3;
            boolean z9;
            Object obj;
            Object obj2;
            int i17;
            int i18;
            int i19 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            Intrinsics.checkNotNullParameter(function14, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1777566008);
            if ((i2 & 6) == 0) {
                i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                    int i20 = onWarmupCompleted + 49;
                    IAuthTabCallback = i20 % 128;
                    i18 = i20 % 2 != 0 ? 30743 : 16384;
                } else {
                    i18 = 8192;
                }
                i5 |= i18;
            }
            if ((i2 & 196608) == 0) {
                int i21 = IAuthTabCallback + 37;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13)) {
                    int i23 = onWarmupCompleted + 31;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i5 |= i17;
            }
            if ((12582912 & i2) == 0) {
                int i25 = IAuthTabCallback + 121;
                onWarmupCompleted = i25 % 128;
                if (i25 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14);
                    throw null;
                }
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14) ? 8388608 : 4194304;
            }
            int i26 = i4 & 256;
            if (i26 != 0) {
                i5 |= 100663296;
            } else {
                if ((100663296 & i2) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 67108864 : 33554432;
                }
                i6 = i4 & 512;
                if (i6 == 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 536870912 : 268435456;
                }
                i7 = i4 & 1024;
                if (i7 == 0) {
                    i8 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i8 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 4 : 2);
                } else {
                    i8 = i3;
                }
                i9 = i4 & 2048;
                if (i9 == 0) {
                    i8 |= 48;
                } else if ((i3 & 48) == 0) {
                    i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ? 32 : 16;
                }
                i10 = i8;
                i11 = i4 & 4096;
                if (i11 == 0) {
                    i10 |= 384;
                } else if ((i3 & 384) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                        int i27 = IAuthTabCallback + 85;
                        onWarmupCompleted = i27 % 128;
                        int i28 = i27 % 2;
                        i12 = 256;
                    } else {
                        i12 = 128;
                    }
                    i10 |= i12;
                }
                i13 = i4 & 8192;
                if (i13 == 0) {
                    i10 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 2048 : 1024;
                }
                i14 = i4 & 16384;
                if (i14 == 0) {
                    i10 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str6) ? 16384 : 8192;
                    }
                    i15 = i4 & 32768;
                    if (i15 != 0) {
                        int i29 = IAuthTabCallback + 39;
                        onWarmupCompleted = i29 % 128;
                        if (i29 % 2 == 0) {
                            throw null;
                        }
                        i10 |= 196608;
                    } else {
                        if ((196608 & i3) == 0) {
                            i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
                        }
                        i16 = i4 & 65536;
                        if (i16 != 0) {
                            if ((1572864 & i3) == 0) {
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 1048576 : 524288;
                            }
                            if ((12582912 & i3) == 0) {
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 8388608 : 4194304;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i5 & 306783379) == 306783378 && (4793491 & i10) == 4793490) ? false : true, i5 & 1)) {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i26 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                List<setFontAssetDelegate> listEmptyList = i6 != 0 ? CollectionsKt.emptyList() : list;
                                setCacheComposition.IAuthTabCallbackStub onnavigationevent = i7 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                                String str9 = i9 != 0 ? null : str5;
                                boolean z10 = i11 != 0 ? false : z;
                                setCacheComposition.onWarmupCompleted onwarmupcompleted4 = i13 != 0 ? setCacheComposition.onWarmupCompleted.APPEAR : onwarmupcompleted;
                                String str10 = i14 != 0 ? null : str6;
                                if (i15 != 0) {
                                    int i30 = IAuthTabCallback + 111;
                                    onWarmupCompleted = i30 % 128;
                                    int i31 = i30 % 2;
                                    z7 = false;
                                } else {
                                    z7 = z2;
                                }
                                boolean z11 = i16 != 0 ? true : z3;
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1777566008, i5, i10, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Card (SplitTextField.kt:777)");
                                }
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted5 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                boolean z12 = z11;
                                if (objOnMinimized == onwarmupcompleted5.onExtraCallback()) {
                                    z8 = z7;
                                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                                    objOnMinimized = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                                } else {
                                    z8 = z7;
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                                selectParentResolutions selectparentresolutionsOnExtraCallback = selectParentResolutions.onExtraCallback(onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor), str, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                String str11 = str10;
                                if (objOnMinimized2 == onwarmupcompleted5.onExtraCallback()) {
                                    onwarmupcompleted3 = onwarmupcompleted4;
                                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str2, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                                    objOnMinimized2 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
                                } else {
                                    onwarmupcompleted3 = onwarmupcompleted4;
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                                selectParentResolutions selectparentresolutionsOnExtraCallback2 = selectParentResolutions.onExtraCallback(onWarmupCompleted((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor2), str2, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                boolean z13 = z10;
                                if (objOnMinimized3 == onwarmupcompleted5.onExtraCallback()) {
                                    str7 = str9;
                                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str3, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted3);
                                    objOnMinimized3 = getsupportedhighspeedresolutionsforOnWarmupCompleted3;
                                } else {
                                    str7 = str9;
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                                selectParentResolutions selectparentresolutionsOnExtraCallback3 = selectParentResolutions.onExtraCallback(asBinder((getSupportedHighSpeedResolutionsFor<selectParentResolutions>) getsupportedhighspeedresolutionsfor3), str3, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized4 == onwarmupcompleted5.onExtraCallback()) {
                                    iAuthTabCallbackStub2 = onnavigationevent;
                                    objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str4, 0L, (getNumberOfTargets) null, 6, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                } else {
                                    iAuthTabCallbackStub2 = onnavigationevent;
                                }
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                                selectParentResolutions selectparentresolutionsOnExtraCallback4 = selectParentResolutions.onExtraCallback((selectParentResolutions) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor4}, zzgsa.onWarmupCompleted(), -719779860, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 719779870, zzgsa.onWarmupCompleted()), str4, 0L, (getNumberOfTargets) null, 6, (Object) null);
                                List<setFontAssetDelegate> list3 = listEmptyList;
                                if ((57344 & i5) == 16384) {
                                    int i32 = IAuthTabCallback + 55;
                                    onWarmupCompleted = i32 % 128;
                                    int i33 = i32 % 2;
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!z9) {
                                    Object obj3 = objOnMinimized5;
                                    if (objOnMinimized5 == onwarmupcompleted5.onExtraCallback()) {
                                        Object obj4 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda23
                                            private static int onExtraCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj5) {
                                                int i34 = 2 % 2;
                                                int i35 = onExtraCallback + 73;
                                                onExtraCallbackWithResult = i35 % 128;
                                                Object obj6 = null;
                                                if (i35 % 2 == 0) {
                                                    SplitTextField.IAuthTabCallback.onExtraCallback(function1, getsupportedhighspeedresolutionsfor, (selectParentResolutions) obj5);
                                                    throw null;
                                                }
                                                Unit unitOnExtraCallback = SplitTextField.IAuthTabCallback.onExtraCallback(function1, getsupportedhighspeedresolutionsfor, (selectParentResolutions) obj5);
                                                int i36 = onExtraCallbackWithResult + 33;
                                                onExtraCallback = i36 % 128;
                                                if (i36 % 2 == 0) {
                                                    return unitOnExtraCallback;
                                                }
                                                obj6.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj4);
                                        obj3 = obj4;
                                    }
                                    Function1<? super selectParentResolutions, Unit> function15 = (Function1) obj3;
                                    boolean z14 = (458752 & i5) == 131072;
                                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!z14) {
                                        Object obj5 = objOnMinimized6;
                                        if (objOnMinimized6 == onwarmupcompleted5.onExtraCallback()) {
                                            Object obj6 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda24
                                                private static int onExtraCallback = 1;
                                                private static int onExtraCallbackWithResult;

                                                public final Object invoke(Object obj7) {
                                                    Unit unitIAuthTabCallbackStub;
                                                    int i34 = 2 % 2;
                                                    int i35 = onExtraCallback + 85;
                                                    onExtraCallbackWithResult = i35 % 128;
                                                    if (i35 % 2 != 0) {
                                                        unitIAuthTabCallbackStub = SplitTextField.IAuthTabCallback.IAuthTabCallbackStub(function12, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj7);
                                                        int i36 = 52 / 0;
                                                    } else {
                                                        unitIAuthTabCallbackStub = SplitTextField.IAuthTabCallback.IAuthTabCallbackStub(function12, getsupportedhighspeedresolutionsfor2, (selectParentResolutions) obj7);
                                                    }
                                                    int i37 = onExtraCallback + 81;
                                                    onExtraCallbackWithResult = i37 % 128;
                                                    int i38 = i37 % 2;
                                                    return unitIAuthTabCallbackStub;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj6);
                                            obj5 = obj6;
                                        }
                                        Function1<? super selectParentResolutions, Unit> function16 = (Function1) obj5;
                                        if ((3670016 & i5) == 1048576) {
                                            int i34 = onWarmupCompleted + 15;
                                            IAuthTabCallback = i34 % 128;
                                            boolean z15 = i34 % 2 == 0;
                                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (z15 || objOnMinimized7 == onwarmupcompleted5.onExtraCallback()) {
                                                Object obj7 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda25
                                                    private static int onExtraCallbackWithResult = 1;
                                                    private static int onNavigationEvent;

                                                    public final Object invoke(Object obj8) {
                                                        int i35 = 2 % 2;
                                                        int i36 = onNavigationEvent + 93;
                                                        onExtraCallbackWithResult = i36 % 128;
                                                        int i37 = i36 % 2;
                                                        Unit unitOnTransact = SplitTextField.IAuthTabCallback.onTransact(function13, getsupportedhighspeedresolutionsfor3, (selectParentResolutions) obj8);
                                                        int i38 = onNavigationEvent + 93;
                                                        onExtraCallbackWithResult = i38 % 128;
                                                        if (i38 % 2 == 0) {
                                                            int i39 = 56 / 0;
                                                        }
                                                        return unitOnTransact;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj7);
                                                obj = obj7;
                                            } else {
                                                obj = objOnMinimized7;
                                            }
                                            Function1<? super selectParentResolutions, Unit> function17 = (Function1) obj;
                                            boolean z16 = (29360128 & i5) == 8388608;
                                            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (z16 || objOnMinimized8 == onwarmupcompleted5.onExtraCallback()) {
                                                Object obj8 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda26
                                                    private static int IAuthTabCallback = 1;
                                                    private static int onExtraCallback;

                                                    public final Object invoke(Object obj9) {
                                                        int i35 = 2 % 2;
                                                        int i36 = IAuthTabCallback + 29;
                                                        onExtraCallback = i36 % 128;
                                                        int i37 = i36 % 2;
                                                        Object[] objArr = {function14, getsupportedhighspeedresolutionsfor4, (selectParentResolutions) obj9};
                                                        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                                        Unit unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), 567009652, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -567009643, iOnWarmupCompleted);
                                                        int i38 = onExtraCallback + 17;
                                                        IAuthTabCallback = i38 % 128;
                                                        int i39 = i38 % 2;
                                                        return unit;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj8);
                                                obj2 = obj8;
                                            } else {
                                                obj2 = objOnMinimized8;
                                            }
                                            IAuthTabCallback(selectparentresolutionsOnExtraCallback, selectparentresolutionsOnExtraCallback2, selectparentresolutionsOnExtraCallback3, selectparentresolutionsOnExtraCallback4, function15, function16, function17, (Function1) obj2, quirksExternalSyntheticBackport03, list3, iAuthTabCallbackStub2, str7, z13, onwarmupcompleted3, str11, z8, z12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5 & 2113929216, i10 & 33554430, 0);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            list2 = list3;
                                            z6 = z12;
                                            z5 = z8;
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                            str8 = str11;
                                            onwarmupcompleted2 = onwarmupcompleted3;
                                            z4 = z13;
                                        }
                                    }
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                list2 = list;
                                iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                str7 = str5;
                                z4 = z;
                                onwarmupcompleted2 = onwarmupcompleted;
                                str8 = str6;
                                z5 = z2;
                                z6 = z3;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub3 = iAuthTabCallbackStub2;
                                final String str12 = str7;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda27
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj9, Object obj10) {
                                        int i35 = 2 % 2;
                                        int i36 = onExtraCallbackWithResult + 11;
                                        onWarmupCompleted = i36 % 128;
                                        int i37 = i36 % 2;
                                        Unit unitOnExtraCallback = SplitTextField.IAuthTabCallback.onExtraCallback(this.f$0, str, str2, str3, str4, function1, function12, function13, function14, quirksExternalSyntheticBackport02, list2, iAuthTabCallbackStub3, str12, z4, onwarmupcompleted2, str8, z5, z6, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj9, ((Integer) obj10).intValue());
                                        int i38 = onExtraCallbackWithResult + 71;
                                        onWarmupCompleted = i38 % 128;
                                        if (i38 % 2 != 0) {
                                            return unitOnExtraCallback;
                                        }
                                        Object obj11 = null;
                                        obj11.hashCode();
                                        throw null;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        int i35 = IAuthTabCallback + 5;
                        onWarmupCompleted = i35 % 128;
                        if (i35 % 2 == 0) {
                            throw null;
                        }
                        i10 |= 1572864;
                        if ((12582912 & i3) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i5 & 306783379) == 306783378 && (4793491 & i10) == 4793490) ? false : true, i5 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i16 = i4 & 65536;
                    if (i16 != 0) {
                    }
                    if ((12582912 & i3) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i5 & 306783379) == 306783378 && (4793491 & i10) == 4793490) ? false : true, i5 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i15 = i4 & 32768;
                if (i15 != 0) {
                }
                i16 = i4 & 65536;
                if (i16 != 0) {
                }
                if ((12582912 & i3) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i5 & 306783379) == 306783378 && (4793491 & i10) == 4793490) ? false : true, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i4 & 512;
            if (i6 == 0) {
            }
            i7 = i4 & 1024;
            if (i7 == 0) {
            }
            i9 = i4 & 2048;
            if (i9 == 0) {
            }
            i10 = i8;
            i11 = i4 & 4096;
            if (i11 == 0) {
            }
            i13 = i4 & 8192;
            if (i13 == 0) {
            }
            i14 = i4 & 16384;
            if (i14 == 0) {
            }
            i15 = i4 & 32768;
            if (i15 != 0) {
            }
            i16 = i4 & 65536;
            if (i16 != 0) {
            }
            if ((12582912 & i3) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i5 & 306783379) == 306783378 && (4793491 & i10) == 4793490) ? false : true, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }

        private static final Unit readTypedObject(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i5 = IAuthTabCallback + 71;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                }
            }
            return Unit.INSTANCE;
        }

        private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i3 = onWarmupCompleted + 91;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    int i5 = onWarmupCompleted + 91;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit onMinimized(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            Function1 function1IAuthTabCallbackDefault;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 111;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null && (function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault()) != null) {
                int i5 = onWarmupCompleted + 51;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    throw null;
                }
                function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                function1.invoke(selectparentresolutions);
                int i4 = 6 / 0;
                if (setfontassetdelegate != null) {
                    Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                    if (function1IAuthTabCallbackDefault != null) {
                        int i5 = IAuthTabCallback + 65;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                function1.invoke(selectparentresolutions);
                if (setfontassetdelegate != null) {
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit IAuthTabCallbackDefault(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            boolean z;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i2 & 17) != 16) {
                int i4 = IAuthTabCallback + 37;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onWarmupCompleted + 23;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1024841946, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Card.<anonymous>.<anonymous> (SplitTextField.kt:909)");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1024841946, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Card.<anonymous>.<anonymous> (SplitTextField.kt:909)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = IAuthTabCallback + 47;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0240  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x02f1  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x031d  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x065d  */
        /* JADX WARN: Removed duplicated region for block: B:294:0x0683  */
        /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0159  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final selectParentResolutions selectparentresolutions2, @NotNull final selectParentResolutions selectparentresolutions3, @NotNull final selectParentResolutions selectparentresolutions4, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final Function1<? super selectParentResolutions, Unit> function12, @NotNull final Function1<? super selectParentResolutions, Unit> function13, @NotNull final Function1<? super selectParentResolutions, Unit> function14, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str2, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final List<setFontAssetDelegate> list2;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            final String str3;
            final boolean z4;
            setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            final String str4;
            final boolean z5;
            final boolean z6;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
            boolean z7;
            boolean z8;
            boolean z9;
            Object obj;
            Object obj2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
            boolean z10;
            final setFontAssetDelegate setfontassetdelegate;
            boolean z11;
            final setFontAssetDelegate setfontassetdelegate2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4;
            final setFontAssetDelegate setfontassetdelegate3;
            boolean z12;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5;
            Object obj3;
            getBacktraceNote getbacktracenoteOnExtraCallback;
            int i17;
            int i18;
            int i19 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions2, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions3, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions4, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            Intrinsics.checkNotNullParameter(function14, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1375856632);
            if ((i2 & 6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions)) {
                    int i20 = onWarmupCompleted + 51;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i5 = i18 | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions3) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions4) ? 2048 : 1024;
            }
            int i22 = 8192;
            if ((i2 & 24576) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 16384 : 8192;
            }
            if ((i2 & 196608) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 1048576 : 524288;
            }
            if ((i2 & 12582912) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14)) {
                    int i23 = onWarmupCompleted + 31;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i5 |= i17;
            }
            int i25 = i4 & 256;
            if (i25 != 0) {
                i5 |= 100663296;
            } else {
                if ((100663296 & i2) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 67108864 : 33554432;
                }
                i6 = i4 & 512;
                if (i6 == 0) {
                    int i26 = IAuthTabCallback + 49;
                    onWarmupCompleted = i26 % 128;
                    int i27 = i26 % 2;
                    i5 |= 805306368;
                } else {
                    if ((805306368 & i2) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 536870912 : 268435456;
                    }
                    i7 = i5;
                    i8 = i4 & 1024;
                    if (i8 != 0) {
                        i9 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i9 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 4 : 2);
                    } else {
                        i9 = i3;
                    }
                    i10 = i4 & 2048;
                    if (i10 != 0) {
                        i9 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i9 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true) ? 32 : 16;
                    }
                    i11 = i9;
                    i12 = i4 & 4096;
                    if (i12 != 0) {
                        i11 |= 384;
                    } else {
                        if ((i3 & 384) == 0) {
                            i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
                        }
                        i13 = i4 & 8192;
                        if (i13 == 0) {
                            i11 |= 3072;
                        } else if ((i3 & 3072) == 0) {
                            i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 2048 : 1024;
                        }
                        i14 = i4 & 16384;
                        if (i14 == 0) {
                            i11 |= 24576;
                        } else if ((i3 & 24576) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                                int i28 = onWarmupCompleted + 49;
                                IAuthTabCallback = i28 % 128;
                                i22 = i28 % 2 != 0 ? 28872 : 16384;
                            }
                            i11 |= i22;
                        }
                        i15 = 32768 & i4;
                        if (i15 != 0) {
                            if ((196608 & i3) == 0) {
                                int i29 = IAuthTabCallback + 17;
                                onWarmupCompleted = i29 % 128;
                                int i30 = i29 % 2;
                                i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
                            }
                            i16 = i4 & 65536;
                            Object obj4 = null;
                            if (i16 != 0) {
                                i11 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                int i31 = IAuthTabCallback + 25;
                                onWarmupCompleted = i31 % 128;
                                if (i31 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3);
                                    obj4.hashCode();
                                    throw null;
                                }
                                i11 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 1048576 : 524288) | i11;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i7) == 306783378 && (599187 & i11) == 599186) ? false : true, i7 & 1)) {
                                if (i25 != 0) {
                                    int i32 = IAuthTabCallback + 79;
                                    onWarmupCompleted = i32 % 128;
                                    int i33 = i32 % 2;
                                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                } else {
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                }
                                List<setFontAssetDelegate> listEmptyList = i6 != 0 ? CollectionsKt.emptyList() : list;
                                setCacheComposition.IAuthTabCallbackStub onnavigationevent = i8 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                                String str5 = i10 != 0 ? null : str;
                                boolean z13 = i12 != 0 ? false : z;
                                onwarmupcompleted2 = i13 != 0 ? setCacheComposition.onWarmupCompleted.APPEAR : onwarmupcompleted;
                                String str6 = i14 != 0 ? null : str2;
                                boolean z14 = i15 != 0 ? false : z2;
                                if (i16 != 0) {
                                    int i34 = IAuthTabCallback + 45;
                                    onWarmupCompleted = i34 % 128;
                                    int i35 = i34 % 2;
                                    z7 = true;
                                } else {
                                    z7 = z3;
                                }
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1375856632, i7, i11, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Card (SplitTextField.kt:839)");
                                }
                                int i36 = 1879048192 & i7;
                                boolean z15 = i36 == 536870912;
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z15 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 0);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                final setFontAssetDelegate setfontassetdelegate4 = (setFontAssetDelegate) objOnMinimized;
                                boolean z16 = i36 == 536870912;
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!z16) {
                                    Object obj5 = objOnMinimized2;
                                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        setFontAssetDelegate setfontassetdelegate5 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 1);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate5);
                                        obj5 = setfontassetdelegate5;
                                    }
                                    setFontAssetDelegate setfontassetdelegate6 = (setFontAssetDelegate) obj5;
                                    if (i36 == 536870912) {
                                        int i37 = IAuthTabCallback + 73;
                                        onWarmupCompleted = i37 % 128;
                                        int i38 = i37 % 2;
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!z8) {
                                        Object obj6 = objOnMinimized3;
                                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            setFontAssetDelegate setfontassetdelegate7 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 0);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate7);
                                            obj6 = setfontassetdelegate7;
                                        }
                                        setFontAssetDelegate setfontassetdelegate8 = (setFontAssetDelegate) obj6;
                                        boolean z17 = i36 == 536870912;
                                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (z17 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            z9 = true;
                                            setFontAssetDelegate setfontassetdelegate9 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 1);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate9);
                                            obj = setfontassetdelegate9;
                                        } else {
                                            z9 = true;
                                            obj = objOnMinimized4;
                                        }
                                        setFontAssetDelegate setfontassetdelegate10 = (setFontAssetDelegate) obj;
                                        setMaxFrame.IAuthTabCallback iAuthTabCallback = new setMaxFrame.IAuthTabCallback(1.0f);
                                        setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted;
                                        getParentSizesThatAreTooLarge.onExtraCallback onextracallback = getParentSizesThatAreTooLarge.Companion;
                                        int iOnExtraCallback = onextracallback.onExtraCallback();
                                        filterResolutionsByAspectRatio.onNavigationEvent onnavigationevent2 = filterResolutionsByAspectRatio.Companion;
                                        CameraUnavailableException cameraUnavailableException = new CameraUnavailableException(0, (Boolean) null, iOnExtraCallback, onnavigationevent2.onExtraCallback(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                        boolean z18 = (57344 & i7) == 16384 ? z9 : false;
                                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setfontassetdelegate4);
                                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if ((z18 || zOnNavigationEvent) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            Function1 function15 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda53
                                                private static int onExtraCallback = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj7) {
                                                    int i39 = 2 % 2;
                                                    int i40 = onWarmupCompleted + 53;
                                                    onExtraCallback = i40 % 128;
                                                    int i41 = i40 % 2;
                                                    Unit unitOnTransact = SplitTextField.IAuthTabCallback.onTransact(function1, setfontassetdelegate4, (selectParentResolutions) obj7);
                                                    int i42 = onExtraCallback + 13;
                                                    onWarmupCompleted = i42 % 128;
                                                    if (i42 % 2 != 0) {
                                                        int i43 = 51 / 0;
                                                    }
                                                    return unitOnTransact;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function15);
                                            obj2 = function15;
                                        } else {
                                            obj2 = objOnMinimized5;
                                        }
                                        int i39 = i11;
                                        List<setFontAssetDelegate> list3 = listEmptyList;
                                        final String str7 = str6;
                                        setFailureListener setfontassetdelegate11 = new setFontAssetDelegate(selectparentresolutions, (Function1) obj2, iAuthTabCallback, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, 0, 4, onextracallbackwithresult, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 108920824, (DefaultConstructorMarker) null);
                                        setMaxFrame.IAuthTabCallback iAuthTabCallback2 = new setMaxFrame.IAuthTabCallback(1.0f);
                                        CameraUnavailableException cameraUnavailableException2 = new CameraUnavailableException(0, (Boolean) null, onextracallback.onExtraCallback(), onnavigationevent2.onExtraCallbackWithResult(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                        if ((i7 & 458752) == 131072) {
                                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            setfontassetdelegate = setfontassetdelegate6;
                                            z10 = true;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            z10 = false;
                                            setfontassetdelegate = setfontassetdelegate6;
                                        }
                                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(setfontassetdelegate);
                                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                                        if ((zOnNavigationEvent2 | z10) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            objOnMinimized6 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda54
                                                private static int onNavigationEvent = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj7) {
                                                    int i40 = 2 % 2;
                                                    int i41 = onNavigationEvent + 43;
                                                    onWarmupCompleted = i41 % 128;
                                                    int i42 = i41 % 2;
                                                    Object[] objArr = {function12, setfontassetdelegate, (selectParentResolutions) obj7};
                                                    int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                                    Unit unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -1144928010, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1144928038, iOnWarmupCompleted);
                                                    int i43 = onNavigationEvent + 91;
                                                    onWarmupCompleted = i43 % 128;
                                                    int i44 = i43 % 2;
                                                    return unit;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized6);
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult6 = cameraCaptureResultEmptyCameraCaptureResult3;
                                        setFailureListener setfontassetdelegate12 = new setFontAssetDelegate(selectparentresolutions2, (Function1) objOnMinimized6, iAuthTabCallback2, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException2, (CameraState) null, false, false, false, 0, 4, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125698040, (DefaultConstructorMarker) null);
                                        setMaxFrame.IAuthTabCallback iAuthTabCallback3 = new setMaxFrame.IAuthTabCallback(1.0f);
                                        CameraUnavailableException cameraUnavailableException3 = new CameraUnavailableException(0, (Boolean) null, onextracallback.onExtraCallback(), onnavigationevent2.onExtraCallbackWithResult(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                        if ((i7 & 3670016) == 1048576) {
                                            setfontassetdelegate2 = setfontassetdelegate8;
                                            cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult6;
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                            setfontassetdelegate2 = setfontassetdelegate8;
                                            cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult6;
                                        }
                                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(setfontassetdelegate2);
                                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                                        if ((zOnNavigationEvent3 | z11) || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            objOnMinimized7 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda55
                                                private static int onExtraCallback = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke(Object obj7) {
                                                    int i40 = 2 % 2;
                                                    int i41 = onWarmupCompleted + 47;
                                                    onExtraCallback = i41 % 128;
                                                    int i42 = i41 % 2;
                                                    Function1 function16 = function13;
                                                    if (i42 == 0) {
                                                        return SplitTextField.IAuthTabCallback.writeTypedObject(function16, setfontassetdelegate2, (selectParentResolutions) obj7);
                                                    }
                                                    Unit unitWriteTypedObject = SplitTextField.IAuthTabCallback.writeTypedObject(function16, setfontassetdelegate2, (selectParentResolutions) obj7);
                                                    int i43 = 49 / 0;
                                                    return unitWriteTypedObject;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized7);
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult7 = cameraCaptureResultEmptyCameraCaptureResult4;
                                        setFailureListener setfontassetdelegate13 = new setFontAssetDelegate(selectparentresolutions3, (Function1) objOnMinimized7, iAuthTabCallback3, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException3, (CameraState) null, false, false, false, 0, 4, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125698040, (DefaultConstructorMarker) null);
                                        setMaxFrame.IAuthTabCallback iAuthTabCallback4 = new setMaxFrame.IAuthTabCallback(1.0f);
                                        CameraUnavailableException cameraUnavailableException4 = new CameraUnavailableException(0, (Boolean) null, onextracallback.onExtraCallback(), onnavigationevent2.onExtraCallbackWithResult(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                        if ((i7 & 29360128) == 8388608) {
                                            setfontassetdelegate3 = setfontassetdelegate10;
                                            cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult7;
                                            z12 = true;
                                        } else {
                                            setfontassetdelegate3 = setfontassetdelegate10;
                                            z12 = false;
                                            cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult7;
                                        }
                                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult5.onNavigationEvent(setfontassetdelegate3);
                                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult5.onMinimized();
                                        if ((zOnNavigationEvent4 || z12) || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            Function1 function16 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda56
                                                private static int onExtraCallback = 1;
                                                private static int onNavigationEvent;

                                                public final Object invoke(Object obj7) {
                                                    int i40 = 2 % 2;
                                                    int i41 = onNavigationEvent + 97;
                                                    onExtraCallback = i41 % 128;
                                                    int i42 = i41 % 2;
                                                    Function1 function17 = function14;
                                                    if (i42 != 0) {
                                                        return SplitTextField.IAuthTabCallback.asBinder(function17, setfontassetdelegate3, (selectParentResolutions) obj7);
                                                    }
                                                    Unit unitAsBinder = SplitTextField.IAuthTabCallback.asBinder(function17, setfontassetdelegate3, (selectParentResolutions) obj7);
                                                    int i43 = 4 / 0;
                                                    return unitAsBinder;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(function16);
                                            obj3 = function16;
                                        } else {
                                            obj3 = objOnMinimized8;
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult8 = cameraCaptureResultEmptyCameraCaptureResult5;
                                        setFailureListener setfontassetdelegate14 = new setFontAssetDelegate(selectparentresolutions4, (Function1) obj3, iAuthTabCallback4, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException4, (CameraState) null, false, false, false, 0, 4, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125698040, (DefaultConstructorMarker) null);
                                        setFontMap setfontmap = setFontMap.onNavigationEvent;
                                        List listListOf = CollectionsKt.listOf(new setFailureListener[]{setfontassetdelegate11, setfontmap, setfontassetdelegate12, setfontmap, setfontassetdelegate13, setfontmap, setfontassetdelegate14});
                                        if (str7 == null) {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult8;
                                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1267932197);
                                            getbacktracenoteOnExtraCallback = null;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult8;
                                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1267932196);
                                            getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1024841946, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda57
                                                private static int onExtraCallback = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                    int i40 = 2 % 2;
                                                    int i41 = onWarmupCompleted + 87;
                                                    onExtraCallback = i41 % 128;
                                                    int i42 = i41 % 2;
                                                    Unit unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(new Object[]{str7, (RowScope) obj7, (CameraCaptureResultEmptyCameraCaptureResult) obj8, Integer.valueOf(((Integer) obj9).intValue())}, zzgsa.onWarmupCompleted(), -475529271, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 475529291, zzgsa.onWarmupCompleted());
                                                    int i43 = onWarmupCompleted + 123;
                                                    onExtraCallback = i43 % 128;
                                                    int i44 = i43 % 2;
                                                    return unit;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                        int i40 = i39 << 6;
                                        setIgnoreDisabledSystemAnimations.onExtraCallbackWithResult(listListOf, quirksExternalSyntheticBackport03, onnavigationevent, str5, z13, onwarmupcompleted2, getbacktracenoteOnExtraCallback, z14, z7, cameraCaptureResultEmptyCameraCaptureResult2, ((i7 >> 21) & 112) | (i40 & 896) | (i40 & 7168) | (57344 & i40) | (458752 & i40) | (29360128 & i40) | (i40 & 234881024), 0);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        str4 = str7;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                        iAuthTabCallbackStub2 = onnavigationevent;
                                        str3 = str5;
                                        z4 = z13;
                                        z5 = z14;
                                        z6 = z7;
                                        list2 = list3;
                                    }
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                int i41 = onWarmupCompleted + 107;
                                IAuthTabCallback = i41 % 128;
                                int i42 = i41 % 2;
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                list2 = list;
                                iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                str3 = str;
                                z4 = z;
                                onwarmupcompleted2 = onwarmupcompleted;
                                str4 = str2;
                                z5 = z2;
                                z6 = z3;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                final setCacheComposition.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted2;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda58
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj7, Object obj8) {
                                        int i43 = 2 % 2;
                                        int i44 = onExtraCallbackWithResult + 39;
                                        onExtraCallback = i44 % 128;
                                        int i45 = i44 % 2;
                                        Unit unitOnNavigationEvent = SplitTextField.IAuthTabCallback.onNavigationEvent(this.f$0, selectparentresolutions, selectparentresolutions2, selectparentresolutions3, selectparentresolutions4, function1, function12, function13, function14, quirksExternalSyntheticBackport02, list2, iAuthTabCallbackStub2, str3, z4, onwarmupcompleted3, str4, z5, z6, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                        int i46 = onExtraCallback + 95;
                                        onExtraCallbackWithResult = i46 % 128;
                                        if (i46 % 2 != 0) {
                                            return unitOnNavigationEvent;
                                        }
                                        throw null;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i11 |= 196608;
                        i16 = i4 & 65536;
                        Object obj42 = null;
                        if (i16 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i7) == 306783378 && (599187 & i11) == 599186) ? false : true, i7 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i13 = i4 & 8192;
                    if (i13 == 0) {
                    }
                    i14 = i4 & 16384;
                    if (i14 == 0) {
                    }
                    i15 = 32768 & i4;
                    if (i15 != 0) {
                    }
                    i16 = i4 & 65536;
                    Object obj422 = null;
                    if (i16 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i7) == 306783378 && (599187 & i11) == 599186) ? false : true, i7 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i7 = i5;
                i8 = i4 & 1024;
                if (i8 != 0) {
                }
                i10 = i4 & 2048;
                if (i10 != 0) {
                }
                i11 = i9;
                i12 = i4 & 4096;
                if (i12 != 0) {
                }
                i13 = i4 & 8192;
                if (i13 == 0) {
                }
                i14 = i4 & 16384;
                if (i14 == 0) {
                }
                i15 = 32768 & i4;
                if (i15 != 0) {
                }
                i16 = i4 & 65536;
                Object obj4222 = null;
                if (i16 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i7) == 306783378 && (599187 & i11) == 599186) ? false : true, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i4 & 512;
            if (i6 == 0) {
            }
            i7 = i5;
            i8 = i4 & 1024;
            if (i8 != 0) {
            }
            i10 = i4 & 2048;
            if (i10 != 0) {
            }
            i11 = i9;
            i12 = i4 & 4096;
            if (i12 != 0) {
            }
            i13 = i4 & 8192;
            if (i13 == 0) {
            }
            i14 = i4 & 16384;
            if (i14 == 0) {
            }
            i15 = 32768 & i4;
            if (i15 != 0) {
            }
            i16 = i4 & 65536;
            Object obj42222 = null;
            if (i16 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i7) == 306783378 && (599187 & i11) == 599186) ? false : true, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }

        private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
            Function1 function1IAuthTabCallbackDefault;
            Function1 function1 = (Function1) objArr[0];
            setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 73;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                function1.invoke(selectparentresolutions);
                throw null;
            }
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null && (function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault()) != null) {
                int i4 = onWarmupCompleted + 9;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    int i5 = 11 / 0;
                } else {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit asBinder(Resources resources, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Resources.NotFoundException {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
                int i4 = IAuthTabCallback + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1510137936, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RegistrationDate.<anonymous> (SplitTextField.kt:947)");
                    int i6 = IAuthTabCallback + 63;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                }
                String string = resources.getString(R.string.register_date_yyyy);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i3 = onWarmupCompleted + 31;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    int i5 = IAuthTabCallback + 95;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 61;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 43 / 0;
            }
            return unit;
        }

        private static final Unit IAuthTabCallbackStub(Resources resources, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Resources.NotFoundException {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i4 = onWarmupCompleted + 15;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-243331732, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RegistrationDate.<anonymous> (SplitTextField.kt:964)");
                        int i5 = 51 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-243331732, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RegistrationDate.<anonymous> (SplitTextField.kt:964)");
                    }
                }
                String string = resources.getString(R.string.register_date_mm);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = IAuthTabCallback + 47;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i7 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                int i8 = IAuthTabCallback + 51;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            return Unit.INSTANCE;
        }

        private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) objArr[1];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[2];
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i3 = onWarmupCompleted + 115;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    int i5 = IAuthTabCallback + 59;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                        throw null;
                    }
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit asInterface(Resources resources, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Resources.NotFoundException {
            boolean z;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i2 & 17) != 16) {
                int i4 = onWarmupCompleted + 71;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = IAuthTabCallback + 105;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1734571091, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RegistrationDate.<anonymous> (SplitTextField.kt:978)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1734571091, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RegistrationDate.<anonymous> (SplitTextField.kt:978)");
                }
                String string = resources.getString(R.string.register_date_dd);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = IAuthTabCallback + 5;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i8 == 0) {
                        int i9 = 96 / 0;
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit asInterface(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            boolean z;
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.checkNotNullParameter(rowScope, "");
                z = (i2 & 63) != 102;
            } else {
                Intrinsics.checkNotNullParameter(rowScope, "");
                if ((i2 & 17) != 16) {
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                int i5 = onWarmupCompleted + 59;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onWarmupCompleted + 93;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1882599986, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RegistrationDate.<anonymous>.<anonymous> (SplitTextField.kt:994)");
                    int i9 = onWarmupCompleted + 105;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i11 = IAuthTabCallback + 29;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x02c0  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x02e0  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x035f  */
        /* JADX WARN: Removed duplicated region for block: B:266:0x060b  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x0627  */
        /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0143  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onWarmupCompleted(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final selectParentResolutions selectparentresolutions2, @NotNull final selectParentResolutions selectparentresolutions3, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final Function1<? super selectParentResolutions, Unit> function12, @NotNull final Function1<? super selectParentResolutions, Unit> function13, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str2, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            boolean z4;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final List<setFontAssetDelegate> list2;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            final String str3;
            final boolean z5;
            final setCacheComposition.onWarmupCompleted onwarmupcompleted2;
            final String str4;
            final boolean z6;
            final boolean z7;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            List<setFontAssetDelegate> listEmptyList;
            boolean z8;
            boolean z9;
            Object obj;
            Object obj2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
            final setFontAssetDelegate setfontassetdelegate;
            boolean z10;
            final setFontAssetDelegate setfontassetdelegate2;
            boolean z11;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4;
            getBacktraceNote getbacktracenoteOnExtraCallback;
            int i14 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions2, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions3, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2111994384);
            if ((i2 & 6) == 0) {
                i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i5 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions3) ? 128 : 256;
            }
            if ((i2 & 3072) == 0) {
                int i15 = IAuthTabCallback + 105;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 131072 : 65536;
            }
            int i17 = i4 & 64;
            Object obj3 = null;
            if (i17 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                int i18 = onWarmupCompleted + 103;
                IAuthTabCallback = i18 % 128;
                if (i18 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                    obj3.hashCode();
                    throw null;
                }
                i5 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ^ true) ? 1048576 : 524288;
            }
            int i19 = i4 & 128;
            if (i19 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 8388608 : 4194304;
            }
            int i20 = i4 & 256;
            if (i20 != 0) {
                int i21 = onWarmupCompleted + 107;
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                i5 |= 100663296;
            } else {
                if ((100663296 & i2) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 67108864 : 33554432;
                }
                i6 = i4 & 512;
                if (i6 == 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 536870912 : 268435456;
                }
                i7 = i4 & 1024;
                if (i7 == 0) {
                    i8 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i8 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2);
                } else {
                    i8 = i3;
                }
                i9 = i4 & 2048;
                if (i9 == 0) {
                    int i23 = IAuthTabCallback + 31;
                    onWarmupCompleted = i23 % 128;
                    int i24 = i23 % 2;
                    i8 |= 48;
                } else {
                    if ((i3 & 48) == 0) {
                        i10 = i8 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 32 : 16);
                    }
                    i11 = i4 & 4096;
                    if (i11 != 0) {
                        i10 |= 384;
                    } else {
                        if ((i3 & 384) == 0) {
                            i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
                        }
                        i12 = i4 & 8192;
                        if (i12 == 0) {
                            i10 |= 3072;
                        } else {
                            if ((i3 & 3072) == 0) {
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 2048 : 1024;
                            }
                            i13 = i4 & 16384;
                            if (i13 == 0) {
                                if ((i3 & 24576) == 0) {
                                    i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 16384 : 8192;
                                }
                                if ((i5 & 306783379) != 306783378) {
                                    int i25 = IAuthTabCallback + 49;
                                    int i26 = i25 % 128;
                                    onWarmupCompleted = i26;
                                    if (i25 % 2 != 0 ? (i10 & 9363) != 9362 : (i10 & 11768) != 6571) {
                                        z4 = true;
                                    } else {
                                        int i27 = i26 + 29;
                                        IAuthTabCallback = i27 % 128;
                                        int i28 = i27 % 2;
                                        z4 = false;
                                    }
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                    list2 = list;
                                    iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                    str3 = str;
                                    z5 = z;
                                    onwarmupcompleted2 = onwarmupcompleted;
                                    str4 = str2;
                                    z6 = z2;
                                    z7 = z3;
                                } else {
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i17 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    if (i19 != 0) {
                                        int i29 = IAuthTabCallback + 71;
                                        onWarmupCompleted = i29 % 128;
                                        int i30 = i29 % 2;
                                        listEmptyList = CollectionsKt.emptyList();
                                    } else {
                                        listEmptyList = list;
                                    }
                                    setCacheComposition.IAuthTabCallbackStub onnavigationevent = i20 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent((setCacheComposition.onTransact) null, 0, (setCacheComposition.onNavigationEvent) null, 7, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                                    String str5 = i6 != 0 ? null : str;
                                    boolean z12 = i7 != 0 ? false : z;
                                    setCacheComposition.onWarmupCompleted onwarmupcompleted3 = i9 != 0 ? setCacheComposition.onWarmupCompleted.APPEAR : onwarmupcompleted;
                                    String str6 = i11 != 0 ? null : str2;
                                    boolean z13 = i12 != 0 ? false : z2;
                                    boolean z14 = i13 != 0 ? false : z3;
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2111994384, i5, i10, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RegistrationDate (SplitTextField.kt:932)");
                                    }
                                    int i31 = 29360128 & i5;
                                    if (i31 == 8388608) {
                                        int i32 = onWarmupCompleted + 57;
                                        IAuthTabCallback = i32 % 128;
                                        int i33 = i32 % 2;
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z8 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        z9 = false;
                                        setFontAssetDelegate setfontassetdelegate3 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 0);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate3);
                                        obj = setfontassetdelegate3;
                                    } else {
                                        z9 = false;
                                        obj = objOnMinimized;
                                    }
                                    final setFontAssetDelegate setfontassetdelegate4 = (setFontAssetDelegate) obj;
                                    boolean z15 = i31 == 8388608 ? true : z9;
                                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!z15) {
                                        Object obj4 = objOnMinimized2;
                                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            setFontAssetDelegate setfontassetdelegate5 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 1);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate5);
                                            obj4 = setfontassetdelegate5;
                                        }
                                        setFontAssetDelegate setfontassetdelegate6 = (setFontAssetDelegate) obj4;
                                        if (i31 == 8388608) {
                                            int i34 = IAuthTabCallback + 23;
                                            onWarmupCompleted = i34 % 128;
                                            boolean z16 = i34 % 2 == 0 ? z9 : true;
                                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (z16 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                setFontAssetDelegate setfontassetdelegate7 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 2);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate7);
                                                obj2 = setfontassetdelegate7;
                                            } else {
                                                obj2 = objOnMinimized3;
                                            }
                                            setFontAssetDelegate setfontassetdelegate8 = (setFontAssetDelegate) obj2;
                                            final Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                                            setMaxFrame.IAuthTabCallback iAuthTabCallback = new setMaxFrame.IAuthTabCallback(2.0f);
                                            getParentSizesThatAreTooLarge.onExtraCallback onextracallback = getParentSizesThatAreTooLarge.Companion;
                                            int iOnExtraCallback = onextracallback.onExtraCallback();
                                            filterResolutionsByAspectRatio.onNavigationEvent onnavigationevent2 = filterResolutionsByAspectRatio.Companion;
                                            CameraUnavailableException cameraUnavailableException = new CameraUnavailableException(0, (Boolean) null, iOnExtraCallback, onnavigationevent2.onExtraCallback(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                            boolean z17 = (i5 & 7168) == 2048 ? true : z9;
                                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setfontassetdelegate4);
                                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!(z17 | zOnNavigationEvent)) {
                                                Object obj5 = objOnMinimized4;
                                                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    Function1 function14 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda15
                                                        private static int onExtraCallbackWithResult = 0;
                                                        private static int onWarmupCompleted = 1;

                                                        public final Object invoke(Object obj6) {
                                                            int i35 = 2 % 2;
                                                            int i36 = onWarmupCompleted + 111;
                                                            onExtraCallbackWithResult = i36 % 128;
                                                            if (i36 % 2 != 0) {
                                                                SplitTextField.IAuthTabCallback.access100(function1, setfontassetdelegate4, (selectParentResolutions) obj6);
                                                                throw null;
                                                            }
                                                            Unit unitAccess100 = SplitTextField.IAuthTabCallback.access100(function1, setfontassetdelegate4, (selectParentResolutions) obj6);
                                                            int i37 = onWarmupCompleted + 103;
                                                            onExtraCallbackWithResult = i37 % 128;
                                                            if (i37 % 2 != 0) {
                                                                int i38 = 53 / 0;
                                                            }
                                                            return unitAccess100;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function14);
                                                    obj5 = function14;
                                                }
                                                int i35 = i5;
                                                List<setFontAssetDelegate> list3 = listEmptyList;
                                                final String str7 = str6;
                                                int i36 = i10;
                                                setFailureListener setfailurelistenerOnExtraCallbackWithResult = new setFontAssetDelegate(selectparentresolutions, (Function1) obj5, iAuthTabCallback, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, ForwardingCameraControl.onExtraCallback(-1510137936, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda16
                                                    private static int IAuthTabCallback = 1;
                                                    private static int onExtraCallbackWithResult;

                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        int i37 = 2 % 2;
                                                        int i38 = IAuthTabCallback + 47;
                                                        onExtraCallbackWithResult = i38 % 128;
                                                        int i39 = i38 % 2;
                                                        Object[] objArr = {resources, (RowScope) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, Integer.valueOf(((Integer) obj8).intValue())};
                                                        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                                        Unit unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), 1210226519, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1210226515, iOnWarmupCompleted);
                                                        int i40 = onExtraCallbackWithResult + 27;
                                                        IAuthTabCallback = i40 % 128;
                                                        int i41 = i40 % 2;
                                                        return unit;
                                                    }
                                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, 0, 4, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125697912, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate4);
                                                setMaxFrame.IAuthTabCallback iAuthTabCallback2 = new setMaxFrame.IAuthTabCallback(1.0f);
                                                CameraUnavailableException cameraUnavailableException2 = new CameraUnavailableException(0, (Boolean) null, onextracallback.onExtraCallback(), onnavigationevent2.onExtraCallback(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                                if ((i35 & 57344) == 16384) {
                                                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                    setfontassetdelegate = setfontassetdelegate6;
                                                    z10 = true;
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                    setfontassetdelegate = setfontassetdelegate6;
                                                    z10 = false;
                                                }
                                                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(setfontassetdelegate);
                                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                                                if ((zOnNavigationEvent2 | z10) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized5 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda17
                                                        private static int IAuthTabCallback = 1;
                                                        private static int onWarmupCompleted;

                                                        public final Object invoke(Object obj6) {
                                                            int i37 = 2 % 2;
                                                            int i38 = onWarmupCompleted + 101;
                                                            IAuthTabCallback = i38 % 128;
                                                            int i39 = i38 % 2;
                                                            Unit unitIAuthTabCallback = SplitTextField.IAuthTabCallback.IAuthTabCallback(function12, setfontassetdelegate, (selectParentResolutions) obj6);
                                                            int i40 = IAuthTabCallback + 15;
                                                            onWarmupCompleted = i40 % 128;
                                                            if (i40 % 2 != 0) {
                                                                int i41 = 77 / 0;
                                                            }
                                                            return unitIAuthTabCallback;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized5);
                                                }
                                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult3;
                                                setFailureListener setfailurelistenerOnExtraCallbackWithResult2 = new setFontAssetDelegate(selectparentresolutions2, (Function1) objOnMinimized5, iAuthTabCallback2, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, ForwardingCameraControl.onExtraCallback(-243331732, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda18
                                                    private static int onExtraCallback = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) throws Resources.NotFoundException {
                                                        int i37 = 2 % 2;
                                                        int i38 = onWarmupCompleted + 51;
                                                        onExtraCallback = i38 % 128;
                                                        int i39 = i38 % 2;
                                                        Unit unitIAuthTabCallback = SplitTextField.IAuthTabCallback.IAuthTabCallback(resources, (RowScope) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                        int i40 = onExtraCallback + 19;
                                                        onWarmupCompleted = i40 % 128;
                                                        int i41 = i40 % 2;
                                                        return unitIAuthTabCallback;
                                                    }
                                                }, cameraCaptureResultEmptyCameraCaptureResult3, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException2, (CameraState) null, false, false, false, 0, 2, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125697912, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate);
                                                setMaxFrame.IAuthTabCallback iAuthTabCallback3 = new setMaxFrame.IAuthTabCallback(1.0f);
                                                CameraUnavailableException cameraUnavailableException3 = new CameraUnavailableException(0, (Boolean) null, onextracallback.onExtraCallback(), onnavigationevent2.onExtraCallbackWithResult(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                                if ((i35 & 458752) == 131072) {
                                                    setfontassetdelegate2 = setfontassetdelegate8;
                                                    cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult5;
                                                    z11 = true;
                                                } else {
                                                    setfontassetdelegate2 = setfontassetdelegate8;
                                                    z11 = false;
                                                    cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult5;
                                                }
                                                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(setfontassetdelegate2);
                                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                                                if ((zOnNavigationEvent3 | z11) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized6 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda19
                                                        private static int onExtraCallback = 1;
                                                        private static int onExtraCallbackWithResult;

                                                        public final Object invoke(Object obj6) {
                                                            int i37 = 2 % 2;
                                                            int i38 = onExtraCallback + 25;
                                                            onExtraCallbackWithResult = i38 % 128;
                                                            int i39 = i38 % 2;
                                                            Unit unitIAuthTabCallbackStubProxy = SplitTextField.IAuthTabCallback.IAuthTabCallbackStubProxy(function13, setfontassetdelegate2, (selectParentResolutions) obj6);
                                                            int i40 = onExtraCallback + 103;
                                                            onExtraCallbackWithResult = i40 % 128;
                                                            if (i40 % 2 == 0) {
                                                                return unitIAuthTabCallbackStubProxy;
                                                            }
                                                            Object obj7 = null;
                                                            obj7.hashCode();
                                                            throw null;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized6);
                                                }
                                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult6 = cameraCaptureResultEmptyCameraCaptureResult4;
                                                List listListOf = CollectionsKt.listOf(new setFailureListener[]{setfailurelistenerOnExtraCallbackWithResult, setFontMap.onNavigationEvent, new setFallbackResource(CollectionsKt.listOf(new setFailureListener[]{setfailurelistenerOnExtraCallbackWithResult2, new setFontAssetDelegate(selectparentresolutions3, (Function1) objOnMinimized6, iAuthTabCallback3, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, ForwardingCameraControl.onExtraCallback(-1734571091, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda20
                                                    private static int onExtraCallbackWithResult = 0;
                                                    private static int onNavigationEvent = 1;

                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) throws Resources.NotFoundException {
                                                        int i37 = 2 % 2;
                                                        int i38 = onExtraCallbackWithResult + 65;
                                                        onNavigationEvent = i38 % 128;
                                                        int i39 = i38 % 2;
                                                        Unit unitOnExtraCallback = SplitTextField.IAuthTabCallback.onExtraCallback(resources, (RowScope) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                        int i40 = onNavigationEvent + 33;
                                                        onExtraCallbackWithResult = i40 % 128;
                                                        int i41 = i40 % 2;
                                                        return unitOnExtraCallback;
                                                    }
                                                }, cameraCaptureResultEmptyCameraCaptureResult4, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException3, (CameraState) null, false, false, false, 0, 2, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125697912, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate2)}), new setMaxFrame.IAuthTabCallback(1.0f), (setMaxFrame) null, 4, (DefaultConstructorMarker) null)});
                                                if (str7 == null) {
                                                    int i37 = IAuthTabCallback + 29;
                                                    onWarmupCompleted = i37 % 128;
                                                    if (i37 % 2 == 0) {
                                                        cameraCaptureResultEmptyCameraCaptureResult6.onExtraCallbackWithResult(1452737619);
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult6;
                                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1452737619);
                                                    getbacktracenoteOnExtraCallback = null;
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult6;
                                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1452737620);
                                                    getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(1882599986, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda21
                                                        private static int IAuthTabCallback = 0;
                                                        private static int onWarmupCompleted = 1;

                                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                            int i38 = 2 % 2;
                                                            int i39 = IAuthTabCallback + 41;
                                                            onWarmupCompleted = i39 % 128;
                                                            int i40 = i39 % 2;
                                                            String str8 = str7;
                                                            RowScope rowScope = (RowScope) obj6;
                                                            if (i40 != 0) {
                                                                return SplitTextField.IAuthTabCallback.IAuthTabCallback(str8, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                            }
                                                            Unit unitIAuthTabCallback = SplitTextField.IAuthTabCallback.IAuthTabCallback(str8, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                            int i41 = 73 / 0;
                                                            return unitIAuthTabCallback;
                                                        }
                                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                                int i38 = i35 >> 18;
                                                int i39 = i36 << 12;
                                                setIgnoreDisabledSystemAnimations.onExtraCallbackWithResult(listListOf, quirksExternalSyntheticBackport03, onnavigationevent, str5, z12, onwarmupcompleted3, getbacktracenoteOnExtraCallback, z13, z14, cameraCaptureResultEmptyCameraCaptureResult2, (i38 & 7168) | ((i35 >> 15) & 112) | (i38 & 896) | (57344 & i39) | (458752 & i39) | (29360128 & i39) | (i39 & 234881024), 0);
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                                str4 = str7;
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                iAuthTabCallbackStub2 = onnavigationevent;
                                                str3 = str5;
                                                z5 = z12;
                                                onwarmupcompleted2 = onwarmupcompleted3;
                                                z6 = z13;
                                                z7 = z14;
                                                list2 = list3;
                                            }
                                        }
                                    }
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda22
                                        private static int onNavigationEvent = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj6, Object obj7) {
                                            int i40 = 2 % 2;
                                            int i41 = onNavigationEvent + 29;
                                            onWarmupCompleted = i41 % 128;
                                            int i42 = i41 % 2;
                                            Unit unitOnExtraCallback = SplitTextField.IAuthTabCallback.onExtraCallback(this.f$0, selectparentresolutions, selectparentresolutions2, selectparentresolutions3, function1, function12, function13, quirksExternalSyntheticBackport02, list2, iAuthTabCallbackStub2, str3, z5, onwarmupcompleted2, str4, z6, z7, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                                            int i43 = onWarmupCompleted + 115;
                                            onNavigationEvent = i43 % 128;
                                            if (i43 % 2 != 0) {
                                                return unitOnExtraCallback;
                                            }
                                            Object obj8 = null;
                                            obj8.hashCode();
                                            throw null;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 |= 24576;
                            if ((i5 & 306783379) != 306783378) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i13 = i4 & 16384;
                        if (i13 == 0) {
                        }
                        if ((i5 & 306783379) != 306783378) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i12 = i4 & 8192;
                    if (i12 == 0) {
                    }
                    i13 = i4 & 16384;
                    if (i13 == 0) {
                    }
                    if ((i5 & 306783379) != 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i10 = i8;
                i11 = i4 & 4096;
                if (i11 != 0) {
                }
                i12 = i4 & 8192;
                if (i12 == 0) {
                }
                i13 = i4 & 16384;
                if (i13 == 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i4 & 512;
            if (i6 == 0) {
            }
            i7 = i4 & 1024;
            if (i7 == 0) {
            }
            i9 = i4 & 2048;
            if (i9 == 0) {
            }
            i10 = i8;
            i11 = i4 & 4096;
            if (i11 != 0) {
            }
            i12 = i4 & 8192;
            if (i12 == 0) {
            }
            i13 = i4 & 16384;
            if (i13 == 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }

        private static final Unit onUnminimized(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 33;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i5 = onWarmupCompleted + 103;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    setfontassetdelegate.IAuthTabCallbackDefault();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = IAuthTabCallback + 95;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private static final Unit ICustomTabsCallbackStub(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            Function1 function1IAuthTabCallbackDefault;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null && (function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault()) != null) {
                int i5 = IAuthTabCallback + 5;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
            }
            return Unit.INSTANCE;
        }

        private static final Unit ICustomTabsCallbackStubProxy(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            function1.invoke(selectparentresolutions);
            if (setfontassetdelegate != null) {
                int i3 = IAuthTabCallback + 111;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    setfontassetdelegate.IAuthTabCallbackDefault();
                    throw null;
                }
                Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                if (function1IAuthTabCallbackDefault != null) {
                    function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                }
            }
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit onRelationshipValidationResult(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 5;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                function1.invoke(selectparentresolutions);
                int i4 = 50 / 0;
                if (setfontassetdelegate != null) {
                    Function1 function1IAuthTabCallbackDefault = setfontassetdelegate.IAuthTabCallbackDefault();
                    if (function1IAuthTabCallbackDefault != null) {
                        int i5 = IAuthTabCallback + 73;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        function1IAuthTabCallbackDefault.invoke(selectparentresolutions);
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(selectparentresolutions, "");
                function1.invoke(selectparentresolutions);
                if (setfontassetdelegate != null) {
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = IAuthTabCallback + 109;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 67 / 0;
            }
            return unit;
        }

        private static final Unit onExtraCallbackWithResult(Resources resources, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Resources.NotFoundException {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = IAuthTabCallback + 65;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-209518781, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.ForeignSerialNumber.<anonymous> (SplitTextField.kt:1088)");
                    int i8 = onWarmupCompleted + 53;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 5 % 4;
                    }
                }
                String string = resources.getString(R.string.foreign_serial_number_first_field_label);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = IAuthTabCallback + 109;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x01f2  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x02c1  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x02eb  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0312  */
        /* JADX WARN: Removed duplicated region for block: B:240:0x039f  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x0621  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x0638  */
        /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0147  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(@NotNull final selectParentResolutions selectparentresolutions, @NotNull final selectParentResolutions selectparentresolutions2, @NotNull final selectParentResolutions selectparentresolutions3, @NotNull final selectParentResolutions selectparentresolutions4, @NotNull final Function1<? super selectParentResolutions, Unit> function1, @NotNull final Function1<? super selectParentResolutions, Unit> function12, @NotNull final Function1<? super selectParentResolutions, Unit> function13, @NotNull final Function1<? super selectParentResolutions, Unit> function14, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<setFontAssetDelegate> list, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str, boolean z, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
            int i5;
            int i6;
            List<setFontAssetDelegate> listEmptyList;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            boolean z4;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
            final setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub2;
            final String str2;
            final boolean z5;
            final boolean z6;
            final List<setFontAssetDelegate> list2;
            final boolean z7;
            clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
            boolean z8;
            boolean z9;
            Object obj;
            boolean z10;
            Object obj2;
            Object obj3;
            boolean z11;
            final setFontAssetDelegate setfontassetdelegate;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
            boolean z12;
            final setFontAssetDelegate setfontassetdelegate2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4;
            int i14;
            int i15 = 2 % 2;
            Intrinsics.checkNotNullParameter(selectparentresolutions, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions2, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions3, "");
            Intrinsics.checkNotNullParameter(selectparentresolutions4, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            Intrinsics.checkNotNullParameter(function14, "");
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1097990127);
            if ((i2 & 6) == 0) {
                i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
            int i16 = 32;
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions3) ? 256 : 128;
            }
            int i17 = 2048;
            if ((i2 & 3072) == 0) {
                int i18 = IAuthTabCallback + 97;
                onWarmupCompleted = i18 % 128;
                if (i18 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions4);
                    throw null;
                }
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(selectparentresolutions4) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                int i19 = onWarmupCompleted + 1;
                IAuthTabCallback = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 43 / 0;
                    i14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 131072 : 65536;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                }
                i5 |= i14;
            }
            if ((1572864 & i2) == 0) {
                int i21 = onWarmupCompleted + 23;
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 1048576 : 524288;
            }
            if ((12582912 & i2) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14) ? 8388608 : 4194304;
            }
            int i23 = i4 & 256;
            if (i23 != 0) {
                i5 |= 100663296;
            } else {
                if ((100663296 & i2) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 67108864 : 33554432;
                }
                i6 = i4 & 512;
                if (i6 == 0) {
                    i5 |= 805306368;
                    listEmptyList = list;
                } else {
                    listEmptyList = list;
                    if ((i2 & 805306368) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(listEmptyList) ? 536870912 : 268435456;
                    }
                }
                i7 = i4 & 1024;
                if (i7 == 0) {
                    i8 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i8 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 4 : 2);
                } else {
                    i8 = i3;
                }
                i9 = i4 & 2048;
                if (i9 == 0) {
                    i8 |= 48;
                } else if ((i3 & 48) == 0) {
                    int i24 = IAuthTabCallback + 7;
                    onWarmupCompleted = i24 % 128;
                    if (i24 % 2 == 0) {
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                            i16 = 59;
                        }
                    } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                        i16 = 16;
                    }
                    i8 |= i16;
                }
                i10 = i8;
                i11 = i4 & 4096;
                if (i11 == 0) {
                    i10 |= 384;
                } else {
                    if ((i3 & 384) == 0) {
                        i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
                    }
                    i12 = i4 & 8192;
                    if (i12 != 0) {
                        i10 |= 3072;
                    } else if ((i3 & 3072) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                            int i25 = IAuthTabCallback + 13;
                            onWarmupCompleted = i25 % 128;
                            if (i25 % 2 == 0) {
                                i17 = 6361;
                            }
                        } else {
                            i17 = 1024;
                        }
                        i10 |= i17;
                    }
                    i13 = i4 & 16384;
                    if (i13 == 0) {
                        if ((i3 & 24576) == 0) {
                            z4 = z3;
                            i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 16384 : 8192;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i10 & 9363) != 9362, i5 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                            str2 = str;
                            z5 = z;
                            z6 = z4;
                            list2 = listEmptyList;
                            z7 = z2;
                        } else {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i23 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            if (i6 != 0) {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                            setCacheComposition.IAuthTabCallbackStub onwarmupcompleted = i7 != 0 ? new setCacheComposition.IAuthTabCallbackStub.onWarmupCompleted((setCacheComposition.onTransact) null, (setCacheComposition.onNavigationEvent) null, 3, (DefaultConstructorMarker) null) : iAuthTabCallbackStub;
                            String str3 = i9 != 0 ? null : str;
                            if (i11 != 0) {
                                int i26 = onWarmupCompleted + 45;
                                IAuthTabCallback = i26 % 128;
                                int i27 = i26 % 2;
                                z8 = false;
                            } else {
                                z8 = z;
                            }
                            boolean z13 = i12 != 0 ? false : z2;
                            boolean z14 = i13 != 0 ? true : z4;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1097990127, i5, i10, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.ForeignSerialNumber (SplitTextField.kt:1017)");
                            }
                            int i28 = 1879048192 & i5;
                            boolean z15 = i28 == 536870912;
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!z15) {
                                Object obj4 = objOnMinimized;
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    setFontAssetDelegate setfontassetdelegate3 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 0);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate3);
                                    obj4 = setfontassetdelegate3;
                                }
                                final setFontAssetDelegate setfontassetdelegate4 = (setFontAssetDelegate) obj4;
                                boolean z16 = i28 == 536870912;
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z16) {
                                    z9 = false;
                                } else {
                                    int i29 = IAuthTabCallback + 19;
                                    onWarmupCompleted = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        z9 = false;
                                        int i30 = 6 / 0;
                                        obj = objOnMinimized2;
                                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        }
                                        final setFontAssetDelegate setfontassetdelegate5 = (setFontAssetDelegate) obj;
                                        z10 = i28 == 536870912 ? true : z9;
                                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!z10) {
                                            int i31 = IAuthTabCallback + 65;
                                            onWarmupCompleted = i31 % 128;
                                            if (i31 % 2 == 0) {
                                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                                Object obj5 = null;
                                                obj5.hashCode();
                                                throw null;
                                            }
                                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                obj2 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 2);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj2);
                                            } else {
                                                obj2 = objOnMinimized3;
                                            }
                                            setFontAssetDelegate setfontassetdelegate6 = (setFontAssetDelegate) obj2;
                                            boolean z17 = i28 == 536870912 ? true : z9;
                                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!z17) {
                                                Object obj6 = objOnMinimized4;
                                                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    setFontAssetDelegate setfontassetdelegate7 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 3);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate7);
                                                    obj6 = setfontassetdelegate7;
                                                }
                                                setFontAssetDelegate setfontassetdelegate8 = (setFontAssetDelegate) obj6;
                                                final Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                                                CameraUnavailableException cameraUnavailableException = new CameraUnavailableException(0, (Boolean) null, getParentSizesThatAreTooLarge.Companion.onExtraCallback(), filterResolutionsByAspectRatio.Companion.onExtraCallback(), (removeDuplicates) null, (Boolean) null, (addCameraErrorListener) null, 115, (DefaultConstructorMarker) null);
                                                setFailureListener setfallbackresource = new setFallbackResource(CollectionsKt.listOf(new setFrame("-")), new setMaxFrame.onNavigationEvent((setMaxFrame.onExtraCallbackWithResult) null, 0.0f, 3, (DefaultConstructorMarker) null), (setMaxFrame) null, 4, (DefaultConstructorMarker) null);
                                                setMaxFrame.IAuthTabCallback iAuthTabCallback = new setMaxFrame.IAuthTabCallback(1.0f);
                                                int iOnTransact = createCameraCaptureCallback.Companion.onTransact();
                                                boolean z18 = (57344 & i5) == 16384 ? true : z9;
                                                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setfontassetdelegate4);
                                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!(z18 | zOnNavigationEvent)) {
                                                    Object obj7 = objOnMinimized5;
                                                    if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        Function1 function15 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda47
                                                            private static int IAuthTabCallback = 1;
                                                            private static int onExtraCallbackWithResult;

                                                            public final Object invoke(Object obj8) {
                                                                int i32 = 2 % 2;
                                                                int i33 = onExtraCallbackWithResult + 107;
                                                                IAuthTabCallback = i33 % 128;
                                                                int i34 = i33 % 2;
                                                                Function1 function16 = function1;
                                                                if (i34 != 0) {
                                                                    return SplitTextField.IAuthTabCallback.extraCallback(function16, setfontassetdelegate4, (selectParentResolutions) obj8);
                                                                }
                                                                SplitTextField.IAuthTabCallback.extraCallback(function16, setfontassetdelegate4, (selectParentResolutions) obj8);
                                                                Object obj9 = null;
                                                                obj9.hashCode();
                                                                throw null;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function15);
                                                        obj7 = function15;
                                                    }
                                                    int i32 = i5;
                                                    int i33 = i10;
                                                    List<setFontAssetDelegate> list3 = listEmptyList;
                                                    boolean z19 = z9;
                                                    setFailureListener setfailurelistenerOnExtraCallbackWithResult = new setFontAssetDelegate(selectparentresolutions, (Function1) obj7, iAuthTabCallback, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, iOnTransact, 1, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 121503736, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate4);
                                                    setMaxFrame.IAuthTabCallback iAuthTabCallback2 = new setMaxFrame.IAuthTabCallback(3.0f);
                                                    boolean z20 = (i32 & 458752) == 131072 ? z19 ? 1 : 0 : true;
                                                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setfontassetdelegate5);
                                                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (((!z20) || zOnNavigationEvent2) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        Function1 function16 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda48
                                                            private static int IAuthTabCallback = 1;
                                                            private static int onNavigationEvent;

                                                            public final Object invoke(Object obj8) {
                                                                int i34 = 2 % 2;
                                                                int i35 = onNavigationEvent + 115;
                                                                IAuthTabCallback = i35 % 128;
                                                                Object obj9 = null;
                                                                if (i35 % 2 == 0) {
                                                                    SplitTextField.IAuthTabCallback.onWarmupCompleted(function12, setfontassetdelegate5, (selectParentResolutions) obj8);
                                                                    obj9.hashCode();
                                                                    throw null;
                                                                }
                                                                Unit unitOnWarmupCompleted = SplitTextField.IAuthTabCallback.onWarmupCompleted(function12, setfontassetdelegate5, (selectParentResolutions) obj8);
                                                                int i36 = IAuthTabCallback + 79;
                                                                onNavigationEvent = i36 % 128;
                                                                if (i36 % 2 == 0) {
                                                                    return unitOnWarmupCompleted;
                                                                }
                                                                throw null;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function16);
                                                        obj3 = function16;
                                                    } else {
                                                        obj3 = objOnMinimized6;
                                                    }
                                                    setFailureListener setfailurelistenerOnExtraCallbackWithResult2 = new setFontAssetDelegate(selectparentresolutions2, (Function1) obj3, iAuthTabCallback2, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, 0, 3, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125698040, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate5);
                                                    setMaxFrame.IAuthTabCallback iAuthTabCallback3 = new setMaxFrame.IAuthTabCallback(3.0f);
                                                    if ((i32 & 3670016) == 1048576) {
                                                        int i34 = onWarmupCompleted + 21;
                                                        IAuthTabCallback = i34 % 128;
                                                        int i35 = i34 % 2;
                                                        setfontassetdelegate = setfontassetdelegate6;
                                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                        z11 = true;
                                                    } else {
                                                        z11 = z19 ? 1 : 0;
                                                        setfontassetdelegate = setfontassetdelegate6;
                                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                    }
                                                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(setfontassetdelegate);
                                                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                                                    if ((zOnNavigationEvent3 | z11) || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        objOnMinimized7 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda49
                                                            private static int onExtraCallback = 0;
                                                            private static int onExtraCallbackWithResult = 1;

                                                            public final Object invoke(Object obj8) {
                                                                int i36 = 2 % 2;
                                                                int i37 = onExtraCallback + 121;
                                                                onExtraCallbackWithResult = i37 % 128;
                                                                int i38 = i37 % 2;
                                                                Function1 function17 = function13;
                                                                if (i38 != 0) {
                                                                    return SplitTextField.IAuthTabCallback.asInterface(function17, setfontassetdelegate, (selectParentResolutions) obj8);
                                                                }
                                                                SplitTextField.IAuthTabCallback.asInterface(function17, setfontassetdelegate, (selectParentResolutions) obj8);
                                                                throw null;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized7);
                                                    }
                                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult3;
                                                    setFailureListener setfailurelistenerOnExtraCallbackWithResult3 = new setFontAssetDelegate(selectparentresolutions3, (Function1) objOnMinimized7, iAuthTabCallback3, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, 0, 3, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125698040, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate);
                                                    setMaxFrame.IAuthTabCallback iAuthTabCallback4 = new setMaxFrame.IAuthTabCallback(4.0f);
                                                    if ((i32 & 29360128) == 8388608) {
                                                        setfontassetdelegate2 = setfontassetdelegate8;
                                                        cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult5;
                                                        z12 = true;
                                                    } else {
                                                        z12 = z19 ? 1 : 0;
                                                        setfontassetdelegate2 = setfontassetdelegate8;
                                                        cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult5;
                                                    }
                                                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(setfontassetdelegate2);
                                                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                                                    if ((zOnNavigationEvent4 | z12) || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        objOnMinimized8 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda50
                                                            private static int onExtraCallback = 1;
                                                            private static int onNavigationEvent;

                                                            public final Object invoke(Object obj8) {
                                                                int i36 = 2 % 2;
                                                                int i37 = onNavigationEvent + 95;
                                                                onExtraCallback = i37 % 128;
                                                                int i38 = i37 % 2;
                                                                Unit unitOnExtraCallback = SplitTextField.IAuthTabCallback.onExtraCallback(function14, setfontassetdelegate2, (selectParentResolutions) obj8);
                                                                int i39 = onNavigationEvent + 25;
                                                                onExtraCallback = i39 % 128;
                                                                if (i39 % 2 != 0) {
                                                                    return unitOnExtraCallback;
                                                                }
                                                                throw null;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized8);
                                                        int i36 = onWarmupCompleted + 59;
                                                        IAuthTabCallback = i36 % 128;
                                                        int i37 = i36 % 2;
                                                    }
                                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult6 = cameraCaptureResultEmptyCameraCaptureResult4;
                                                    setFailureListener setfailurelistenerOnExtraCallbackWithResult4 = new setFontAssetDelegate(selectparentresolutions4, (Function1) objOnMinimized8, iAuthTabCallback4, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, cameraUnavailableException, (CameraState) null, false, false, false, 0, 4, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 125698040, (DefaultConstructorMarker) null).onExtraCallbackWithResult(setfontassetdelegate2);
                                                    setFailureListener[] setfailurelistenerArr = new setFailureListener[8];
                                                    setfailurelistenerArr[z19 ? 1 : 0] = setfailurelistenerOnExtraCallbackWithResult;
                                                    setfailurelistenerArr[1] = setfallbackresource;
                                                    setfailurelistenerArr[2] = setfailurelistenerOnExtraCallbackWithResult2;
                                                    setfailurelistenerArr[3] = setfallbackresource;
                                                    setfailurelistenerArr[4] = setFontMap.onNavigationEvent;
                                                    setfailurelistenerArr[5] = setfailurelistenerOnExtraCallbackWithResult3;
                                                    setfailurelistenerArr[6] = setfallbackresource;
                                                    setfailurelistenerArr[7] = setfailurelistenerOnExtraCallbackWithResult4;
                                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult6;
                                                    int i38 = i33 << 6;
                                                    int i39 = i33 << 12;
                                                    setIgnoreDisabledSystemAnimations.onExtraCallbackWithResult(CollectionsKt.listOf(setfailurelistenerArr), quirksExternalSyntheticBackport03, onwarmupcompleted, str3, z8, setCacheComposition.onWarmupCompleted.SUSTAIN, ForwardingCameraControl.onExtraCallback(-209518781, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda51
                                                        private static int onExtraCallback = 1;
                                                        private static int onWarmupCompleted;

                                                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                            int i40 = 2 % 2;
                                                            int i41 = onWarmupCompleted + 123;
                                                            onExtraCallback = i41 % 128;
                                                            int i42 = i41 % 2;
                                                            Object[] objArr = {resources, (RowScope) obj8, (CameraCaptureResultEmptyCameraCaptureResult) obj9, Integer.valueOf(((Integer) obj10).intValue())};
                                                            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                                            Unit unit = (Unit) SplitTextField.IAuthTabCallback.onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -1931078254, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1931078261, iOnWarmupCompleted);
                                                            int i43 = onWarmupCompleted + 113;
                                                            onExtraCallback = i43 % 128;
                                                            if (i43 % 2 != 0) {
                                                                return unit;
                                                            }
                                                            throw null;
                                                        }
                                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), z13, z14, cameraCaptureResultEmptyCameraCaptureResult2, (i38 & 57344) | ((i32 >> 21) & 112) | 1769472 | (i38 & 896) | (i38 & 7168) | (29360128 & i39) | (i39 & 234881024), 0);
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                                    }
                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                    iAuthTabCallbackStub2 = onwarmupcompleted;
                                                    str2 = str3;
                                                    z5 = z8;
                                                    z7 = z13;
                                                    z6 = z14;
                                                    list2 = list3;
                                                }
                                            }
                                        }
                                    } else {
                                        z9 = false;
                                        obj = objOnMinimized2;
                                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        }
                                        final setFontAssetDelegate setfontassetdelegate52 = (setFontAssetDelegate) obj;
                                        if (i28 == 536870912) {
                                        }
                                        Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!z10) {
                                        }
                                    }
                                }
                                setFontAssetDelegate setfontassetdelegate9 = (setFontAssetDelegate) CollectionsKt.getOrNull(listEmptyList, 1);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(setfontassetdelegate9);
                                obj = setfontassetdelegate9;
                                final setFontAssetDelegate setfontassetdelegate522 = (setFontAssetDelegate) obj;
                                if (i28 == 536870912) {
                                }
                                Object objOnMinimized322 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!z10) {
                                }
                            }
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$Companion$$ExternalSyntheticLambda52
                                private static int onExtraCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj8, Object obj9) {
                                    int i40 = 2 % 2;
                                    int i41 = onWarmupCompleted + 33;
                                    onExtraCallback = i41 % 128;
                                    int i42 = i41 % 2;
                                    Unit unitOnWarmupCompleted = SplitTextField.IAuthTabCallback.onWarmupCompleted(this.f$0, selectparentresolutions, selectparentresolutions2, selectparentresolutions3, selectparentresolutions4, function1, function12, function13, function14, quirksExternalSyntheticBackport02, list2, iAuthTabCallbackStub2, str2, z5, z7, z6, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                                    int i43 = onWarmupCompleted + 97;
                                    onExtraCallback = i43 % 128;
                                    if (i43 % 2 == 0) {
                                        int i44 = 93 / 0;
                                    }
                                    return unitOnWarmupCompleted;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 |= 24576;
                    z4 = z3;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i10 & 9363) != 9362, i5 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i12 = i4 & 8192;
                if (i12 != 0) {
                }
                i13 = i4 & 16384;
                if (i13 == 0) {
                }
                z4 = z3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i10 & 9363) != 9362, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i4 & 512;
            if (i6 == 0) {
            }
            i7 = i4 & 1024;
            if (i7 == 0) {
            }
            i9 = i4 & 2048;
            if (i9 == 0) {
            }
            i10 = i8;
            i11 = i4 & 4096;
            if (i11 == 0) {
            }
            i12 = i4 & 8192;
            if (i12 != 0) {
            }
            i13 = i4 & 16384;
            if (i13 == 0) {
            }
            z4 = z3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 306783379) == 306783378 || (i10 & 9363) != 9362, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }

        private static final selectParentResolutions readTypedObject(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (i4 != 0) {
                return selectparentresolutions;
            }
            throw null;
        }

        private static final void IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            int i5 = onWarmupCompleted + 87;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 92 / 0;
            }
        }

        private static final selectParentResolutions extraCallback(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 35;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (i4 != 0) {
                return selectparentresolutions;
            }
            throw null;
        }

        private static final void access000(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 57;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            int i5 = onWarmupCompleted + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        private static /* synthetic */ Object asBinder(Object[] objArr) {
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (i4 == 0) {
                return selectparentresolutions;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final void onTransact(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            int i5 = IAuthTabCallback + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 73 / 0;
            }
        }

        private static final selectParentResolutions IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 35;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            int i5 = IAuthTabCallback + 85;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return selectparentresolutions;
        }

        private static final selectParentResolutions IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            int i5 = onWarmupCompleted + 47;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return selectparentresolutions;
            }
            throw null;
        }

        private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            int i5 = IAuthTabCallback + 107;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
            }
        }

        private static final selectParentResolutions IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            int i5 = IAuthTabCallback + 27;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return selectparentresolutions;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final void asInterface(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 33;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            int i5 = onWarmupCompleted + 5;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        private static final selectParentResolutions asInterface(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (i4 == 0) {
                int i5 = 77 / 0;
            }
            return selectparentresolutions;
        }

        private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
            selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[1];
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            if (i4 == 0) {
                throw null;
            }
            int i5 = IAuthTabCallback + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        private static final selectParentResolutions getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = onWarmupCompleted + 125;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return selectparentresolutions;
        }

        private static final boolean onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 113;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (i4 != 0) {
                bool.booleanValue();
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            int i5 = onWarmupCompleted + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return zBooleanValue;
        }

        private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 81;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
            if (i4 != 0) {
                int i5 = 39 / 0;
            }
            int i6 = onWarmupCompleted + 31;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        private static final selectParentResolutions onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            int i5 = IAuthTabCallback + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return selectparentresolutions;
        }

        private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            int i5 = onWarmupCompleted + 25;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final selectParentResolutions onWarmupCompleted(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            int i5 = IAuthTabCallback + 117;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return selectparentresolutions;
        }

        private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            int i5 = IAuthTabCallback + 85;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }

        private static final selectParentResolutions asBinder(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (i4 == 0) {
                throw null;
            }
            int i5 = onWarmupCompleted + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return selectparentresolutions;
        }

        private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            int i5 = IAuthTabCallback + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }

        private static /* synthetic */ Object onTransact(Object[] objArr) {
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            selectParentResolutions selectparentresolutions = (selectParentResolutions) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (i4 != 0) {
                int i5 = 96 / 0;
            }
            int i6 = IAuthTabCallback + 41;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return selectparentresolutions;
        }

        private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
            int i5 = IAuthTabCallback + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }

        public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Resources.NotFoundException {
            String str;
            int i8 = ~i6;
            int i9 = (~(i8 | i3)) | i7;
            int i10 = ~i3;
            int i11 = ~i7;
            int i12 = (~(i10 | i11)) | i6;
            int i13 = (~(i7 | i10 | i6)) | (~(i8 | i10 | i11)) | (~(i11 | i3 | i6));
            int i14 = i3 + i6 + i4 + ((-104759182) * i5) + ((-453318476) * i2);
            int i15 = i14 * i14;
            int i16 = ((i3 * (-1431886989)) - 1507491630) + (i6 * (-1431886989)) + (i9 * (-122)) + (i12 * 244) + (i13 * 122) + ((-1431886867) * i4) + (722567050 * i5) + ((-1618605404) * i2) + (i15 * 297664512);
            int i17 = (i3 * 1504131295) + 1805123584 + (1504131295 * i6) + (179255518 * i9) + ((-358511036) * i12) + ((-179255518) * i13) + (1324875776 * i4) + (711983104 * i5) + (1180696576 * i2) + (1022754816 * i15) + (i16 * i16 * (-277217280));
            Float fValueOf = Float.valueOf(0.0f);
            boolean z = false;
            switch (i17) {
                case 1:
                    return onExtraCallback(objArr);
                case 2:
                    return IAuthTabCallback(objArr);
                case 3:
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                    selectParentResolutions selectparentresolutions = (selectParentResolutions) objArr[1];
                    int i18 = 2 % 2;
                    int i19 = onWarmupCompleted + 3;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    getsupportedhighspeedresolutionsfor.IAuthTabCallback(selectparentresolutions);
                    int i21 = IAuthTabCallback + 33;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    return null;
                case 4:
                    return onWarmupCompleted(objArr);
                case 5:
                    return onExtraCallbackWithResult(objArr);
                case 6:
                    return asInterface(objArr);
                case 7:
                    Resources resources = (Resources) objArr[0];
                    RowScope rowScope = (RowScope) objArr[1];
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                    int iIntValue = ((Number) objArr[3]).intValue();
                    int i23 = 2 % 2;
                    int i24 = onWarmupCompleted + 115;
                    IAuthTabCallback = i24 % 128;
                    int i25 = i24 % 2;
                    Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(resources, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    int i26 = onWarmupCompleted + 29;
                    IAuthTabCallback = i26 % 128;
                    int i27 = i26 % 2;
                    return unitOnExtraCallbackWithResult;
                case 8:
                    return IAuthTabCallbackStub(objArr);
                case 9:
                    return IAuthTabCallbackDefault(objArr);
                case 10:
                    return onTransact(objArr);
                case 11:
                    return asBinder(objArr);
                case 12:
                    return access000(objArr);
                case 13:
                    return IAuthTabCallbackStubProxy(objArr);
                case 14:
                    String str2 = (String) objArr[0];
                    RowScope rowScope2 = (RowScope) objArr[1];
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                    int iIntValue2 = ((Number) objArr[3]).intValue();
                    int i28 = 2 % 2;
                    Intrinsics.checkNotNullParameter(rowScope2, "");
                    if ((iIntValue2 & 17) != 16) {
                        int i29 = IAuthTabCallback + 37;
                        onWarmupCompleted = i29 % 128;
                        if (i29 % 2 != 0) {
                            z = true;
                        }
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1269683136, iIntValue2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.Email.<anonymous>.<anonymous> (SplitTextField.kt:600)");
                        }
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, null, 0L, 0L, 0L, null, null, null, fValueOf, null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            int i30 = onWarmupCompleted + 29;
                            IAuthTabCallback = i30 % 128;
                            int i31 = i30 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    }
                    return Unit.INSTANCE;
                case 15:
                    return getInterfaceDescriptor(objArr);
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    return IAuthTabCallback_Parcel(objArr);
                case 17:
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[0];
                    int i32 = 2 % 2;
                    int i33 = IAuthTabCallback + 79;
                    onWarmupCompleted = i33 % 128;
                    if (i33 % 2 == 0) {
                        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, false);
                    } else {
                        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, true);
                    }
                    return Unit.INSTANCE;
                case 18:
                    return access100(objArr);
                case 19:
                    return writeTypedObject(objArr);
                case 20:
                    String str3 = (String) objArr[0];
                    RowScope rowScope3 = (RowScope) objArr[1];
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                    int iIntValue3 = ((Number) objArr[3]).intValue();
                    int i34 = 2 % 2;
                    int i35 = IAuthTabCallback + 117;
                    onWarmupCompleted = i35 % 128;
                    int i36 = i35 % 2;
                    Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str3, rowScope3, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue3);
                    int i37 = onWarmupCompleted + 117;
                    IAuthTabCallback = i37 % 128;
                    int i38 = i37 % 2;
                    return unitIAuthTabCallbackDefault;
                case 21:
                    return readTypedObject(objArr);
                case 22:
                    return ICustomTabsCallback(objArr);
                case 23:
                    return extraCallback(objArr);
                case 24:
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[0];
                    selectParentResolutions selectparentresolutions2 = (selectParentResolutions) objArr[1];
                    int i39 = 2 % 2;
                    int i40 = onWarmupCompleted + 31;
                    IAuthTabCallback = i40 % 128;
                    int i41 = i40 % 2;
                    getsupportedhighspeedresolutionsfor3.IAuthTabCallback(selectparentresolutions2);
                    int i42 = onWarmupCompleted + 55;
                    IAuthTabCallback = i42 % 128;
                    int i43 = i42 % 2;
                    return null;
                case 25:
                    String str4 = (String) objArr[0];
                    RowScope rowScope4 = (RowScope) objArr[1];
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                    int iIntValue4 = ((Number) objArr[3]).intValue();
                    int i44 = 2 % 2;
                    Intrinsics.checkNotNullParameter(rowScope4, "");
                    if (!(!cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted((iIntValue4 & 17) != 16, iIntValue4 & 1))) {
                        int i45 = IAuthTabCallback + 53;
                        onWarmupCompleted = i45 % 128;
                        int i46 = i45 % 2;
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1383648667, iIntValue4, -1, "im.toss.compose.v3.textfield.split.SplitTextField.Companion.RrnFirst7.<anonymous> (SplitTextField.kt:367)");
                        }
                        if (str4 == null) {
                            cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1753493441);
                            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.uikit_rrn_text_field_label_jumin_no, cameraCaptureResultEmptyCameraCaptureResult4, 0);
                            cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                            str = strOnExtraCallback;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1753493162);
                            cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                            str = str4;
                        }
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, fValueOf, null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult4, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackStubProxy();
                    }
                    Unit unit = Unit.INSTANCE;
                    int i47 = IAuthTabCallback + 79;
                    onWarmupCompleted = i47 % 128;
                    int i48 = i47 % 2;
                    return unit;
                case 26:
                    return extraCallbackWithResult(objArr);
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    return onActivityResized(objArr);
                case 28:
                    Function1 function1 = (Function1) objArr[0];
                    setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) objArr[1];
                    selectParentResolutions selectparentresolutions3 = (selectParentResolutions) objArr[2];
                    int i49 = 2 % 2;
                    int i50 = IAuthTabCallback + 11;
                    onWarmupCompleted = i50 % 128;
                    int i51 = i50 % 2;
                    Unit unit2 = (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions3}, zzgsa.onWarmupCompleted(), -950518763, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 950518779, zzgsa.onWarmupCompleted());
                    int i52 = onWarmupCompleted + 55;
                    IAuthTabCallback = i52 % 128;
                    int i53 = i52 % 2;
                    return unit2;
                case 29:
                    return onMessageChannelReady(objArr);
                case 30:
                    return onActivityLayout(objArr);
                default:
                    return onNavigationEvent(objArr);
            }
        }

        public static /* synthetic */ Unit onNavigationEvent(Resources resources, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            Object[] objArr = {resources, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -1931078254, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1931078261, iOnWarmupCompleted);
        }

        public static /* synthetic */ Unit onWarmupCompleted(IAuthTabCallback iAuthTabCallback, String str, String str2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str3, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str4, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            Object[] objArr = {iAuthTabCallback, str, str2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str3, Boolean.valueOf(z), onwarmupcompleted, str4, Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), 1971773933, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1971773928, iOnWarmupCompleted);
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), 1103093550, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1103093537, iOnWarmupCompleted);
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), -1843432682, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1843432697, iOnWarmupCompleted);
        }

        public static /* synthetic */ Unit asBinder(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), 567009652, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -567009643, iOnWarmupCompleted);
        }

        public static /* synthetic */ Unit onWarmupCompleted(Resources resources, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            Object[] objArr = {resources, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), 1210226519, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -1210226515, iOnWarmupCompleted);
        }

        public static /* synthetic */ Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -672075033, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 672075063, iOnWarmupCompleted);
        }

        public static /* synthetic */ Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -475529271, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 475529291, iOnWarmupCompleted);
        }

        public static /* synthetic */ Unit IAuthTabCallbackStub(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -157951469, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 157951490, iOnWarmupCompleted);
        }

        public static /* synthetic */ Unit IAuthTabCallback_Parcel(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -1144928010, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1144928038, iOnWarmupCompleted);
        }

        private static final selectParentResolutions onExtraCallback(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (selectParentResolutions) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, zzgsa.onWarmupCompleted(), -719779860, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 719779870, iOnWarmupCompleted);
        }

        private static final Unit IAuthTabCallback_Parcel(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), 150533055, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -150533043, iOnWarmupCompleted);
        }

        private static final Unit ICustomTabsCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), -992898357, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 992898375, iOnWarmupCompleted);
        }

        private static final Unit onActivityResized(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -950518763, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 950518779, iOnWarmupCompleted);
        }

        private static final Unit onPostMessage(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -455154617, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 455154625, iOnWarmupCompleted);
        }

        private static final Unit onTransact(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -394433852, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 394433866, iOnWarmupCompleted);
        }

        private static final Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, String str, String str2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str3, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str4, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            Object[] objArr = {iAuthTabCallback, str, str2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str3, Boolean.valueOf(z), onwarmupcompleted, str4, Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -1803727751, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1803727774, iOnWarmupCompleted);
        }

        private static final Unit access000(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, zzgsa.onWarmupCompleted(), -1087555448, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1087555465, iOnWarmupCompleted);
        }

        private static final void asBinder(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) throws Resources.NotFoundException {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), -1609116054, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1609116083, iOnWarmupCompleted);
        }

        private static final void IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) throws Resources.NotFoundException {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), 881498920, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -881498896, iOnWarmupCompleted);
        }

        private static final Unit readTypedObject(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), 2009504280, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -2009504274, iOnWarmupCompleted);
        }

        private static final Unit extraCommand(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), 2069701008, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -2069700989, iOnWarmupCompleted);
        }

        private static final Unit isEngagementSignalsApiAvailable(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -1077781087, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1077781088, iOnWarmupCompleted);
        }

        private static final Unit ICustomTabsService(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -1635908165, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1635908191, iOnWarmupCompleted);
        }

        private static final selectParentResolutions IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (selectParentResolutions) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, zzgsa.onWarmupCompleted(), -1872766937, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1872766948, iOnWarmupCompleted);
        }

        private static final Unit postMessage(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -1644363592, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1644363619, iOnWarmupCompleted);
        }

        private static final Unit onWarmupCompleted(IAuthTabCallback iAuthTabCallback, selectParentResolutions selectparentresolutions, selectParentResolutions selectparentresolutions2, Function1 function1, Function1 function12, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, String str, boolean z, setCacheComposition.onWarmupCompleted onwarmupcompleted, String str2, boolean z2, boolean z3, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
            Object[] objArr = {iAuthTabCallback, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, iAuthTabCallbackStub, str, Boolean.valueOf(z), onwarmupcompleted, str2, Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), 830615256, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), -830615234, iOnWarmupCompleted);
        }

        private static final void IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor, selectParentResolutions selectparentresolutions) throws Resources.NotFoundException {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, selectparentresolutions}, zzgsa.onWarmupCompleted(), -37108946, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 37108949, iOnWarmupCompleted);
        }

        private static final Unit prefetch(Function1 function1, setFontAssetDelegate setfontassetdelegate, selectParentResolutions selectparentresolutions) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(new Object[]{function1, setfontassetdelegate, selectparentresolutions}, zzgsa.onWarmupCompleted(), -2137060677, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 2137060677, iOnWarmupCompleted);
        }

        private static final Unit access000(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (Unit) onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -1511648598, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 1511648623, iOnWarmupCompleted);
        }

        public final void IAuthTabCallback(@NotNull selectParentResolutions selectparentresolutions, @NotNull selectParentResolutions selectparentresolutions2, @NotNull Function1<? super selectParentResolutions, Unit> function1, @NotNull Function1<? super selectParentResolutions, Unit> function12, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable List<String> list, @Nullable List<setFontAssetDelegate> list2, @Nullable setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str, boolean z, @Nullable setCacheComposition.onWarmupCompleted onwarmupcompleted, @Nullable String str2, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) throws Resources.NotFoundException {
            Object[] objArr = {this, selectparentresolutions, selectparentresolutions2, function1, function12, quirksExternalSyntheticBackport0, list, list2, iAuthTabCallbackStub, str, Boolean.valueOf(z), onwarmupcompleted, str2, Boolean.valueOf(z2), Boolean.valueOf(z3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            onWarmupCompleted(objArr, zzgsa.onWarmupCompleted(), -773824889, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), 773824891, iOnWarmupCompleted);
        }
    }

    public void onExtraCallbackWithResult(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) throws Resources.NotFoundException {
        int i3;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(818695466);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i7 = access000 + 47;
                IAuthTabCallback_Parcel = i7 % 128;
                i5 = i7 % 2 == 0 ? 3 : 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i8 = access000 + 41;
                IAuthTabCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i10 = i3;
        if ((i10 & 19) != 18) {
            int i11 = access000;
            int i12 = i11 + 43;
            IAuthTabCallback_Parcel = i12 % 128;
            z = i12 % 2 != 0;
            int i13 = i11 + 37;
            IAuthTabCallback_Parcel = i13 % 128;
            int i14 = i13 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(818695466, i10, -1, "im.toss.compose.v3.textfield.split.SplitTextField.TdsContent (SplitTextField.kt:67)");
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(787329748);
            LiveDataObservableExternalSyntheticLambda1<getSupportedHighSpeedResolutionsFor<String>> liveDataObservableExternalSyntheticLambda1 = this.IAuthTabCallbackStub;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(liveDataObservableExternalSyntheticLambda1, 10));
            Iterator it = liveDataObservableExternalSyntheticLambda1.iterator();
            while (it.hasNext()) {
                int i15 = IAuthTabCallback_Parcel + 103;
                access000 = i15 % 128;
                int i16 = i15 % 2;
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) it.next();
                Object objOnExtraCallbackWithResult = getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj) {
                            int i17 = 2 % 2;
                            int i18 = onExtraCallback + 7;
                            IAuthTabCallback = i18 % 128;
                            int i19 = i18 % 2;
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                            String str = (String) obj;
                            if (i19 == 0) {
                                return SplitTextField.onExtraCallback(getsupportedhighspeedresolutionsfor2, str);
                            }
                            SplitTextField.onExtraCallback(getsupportedhighspeedresolutionsfor2, str);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                arrayList.add(new Pair(objOnExtraCallbackWithResult, (Function1) objOnMinimized));
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            onExtraCallback onextracallback = (onExtraCallback) this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
            if (Intrinsics.areEqual(onextracallback, onExtraCallback.IAuthTabCallback.onExtraCallback)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1362419425);
                Companion.onExtraCallbackWithResult((String) ((Pair) arrayList.get(0)).getFirst(), (String) ((Pair) arrayList.get(1)).getFirst(), (Function1<? super String, Unit>) ((Pair) arrayList.get(0)).getSecond(), (Function1<? super String, Unit>) ((Pair) arrayList.get(1)).getSecond(), quirksExternalSyntheticBackport0, (List<setFontAssetDelegate>) this.onNavigationEvent, (setCacheComposition.IAuthTabCallbackStub) this.asInterface.onExtraCallbackWithResult(), (String) this.onExtraCallbackWithResult.onExtraCallbackWithResult(), ((Boolean) this.onTransact.onExtraCallbackWithResult()).booleanValue(), (setCacheComposition.onWarmupCompleted) this.IAuthTabCallbackDefault.onExtraCallbackWithResult(), (String) this.asBinder.onExtraCallbackWithResult(), ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue(), ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i10 << 12) & 57344, 3072, 0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                z2 = true;
            } else {
                if (Intrinsics.areEqual(onextracallback, onExtraCallback.C0038onExtraCallback.IAuthTabCallback)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1361732093);
                    z2 = true;
                    Companion.onNavigationEvent((String) ((Pair) arrayList.get(0)).getFirst(), (String) ((Pair) arrayList.get(1)).getFirst(), (Function1) ((Pair) arrayList.get(0)).getSecond(), (Function1) ((Pair) arrayList.get(1)).getSecond(), quirksExternalSyntheticBackport0, this.onNavigationEvent, (setCacheComposition.IAuthTabCallbackStub) this.asInterface.onExtraCallbackWithResult(), (String) this.onExtraCallbackWithResult.onExtraCallbackWithResult(), ((Boolean) this.onTransact.onExtraCallbackWithResult()).booleanValue(), (setCacheComposition.onWarmupCompleted) this.IAuthTabCallbackDefault.onExtraCallbackWithResult(), (String) this.asBinder.onExtraCallbackWithResult(), ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue(), ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i10 << 12) & 57344, 3072, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    z2 = true;
                    if (Intrinsics.areEqual(onextracallback, onExtraCallback.onNavigationEvent.onExtraCallbackWithResult)) {
                        int i17 = access000 + 17;
                        IAuthTabCallback_Parcel = i17 % 128;
                        int i18 = i17 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1361048605);
                        z2 = true;
                        Companion.onWarmupCompleted((String) ((Pair) arrayList.get(0)).getFirst(), (String) ((Pair) arrayList.get(1)).getFirst(), (Function1) ((Pair) arrayList.get(0)).getSecond(), (Function1) ((Pair) arrayList.get(1)).getSecond(), quirksExternalSyntheticBackport0, null, this.onNavigationEvent, (setCacheComposition.IAuthTabCallbackStub) this.asInterface.onExtraCallbackWithResult(), (String) this.onExtraCallbackWithResult.onExtraCallbackWithResult(), ((Boolean) this.onTransact.onExtraCallbackWithResult()).booleanValue(), (setCacheComposition.onWarmupCompleted) this.IAuthTabCallbackDefault.onExtraCallbackWithResult(), (String) this.asBinder.onExtraCallbackWithResult(), ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue(), ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i10 << 12) & 57344, 24576, 32);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else if (Intrinsics.areEqual(onextracallback, onExtraCallback.onWarmupCompleted.IAuthTabCallback)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1360365117);
                        z2 = true;
                        Companion.onExtraCallback((String) ((Pair) arrayList.get(0)).getFirst(), (String) ((Pair) arrayList.get(1)).getFirst(), (Function1<? super String, Unit>) ((Pair) arrayList.get(0)).getSecond(), (Function1<? super String, Unit>) ((Pair) arrayList.get(1)).getSecond(), quirksExternalSyntheticBackport0, (List<setFontAssetDelegate>) this.onNavigationEvent, (setCacheComposition.IAuthTabCallbackStub) this.asInterface.onExtraCallbackWithResult(), (String) this.onExtraCallbackWithResult.onExtraCallbackWithResult(), ((Boolean) this.onTransact.onExtraCallbackWithResult()).booleanValue(), (setCacheComposition.onWarmupCompleted) this.IAuthTabCallbackDefault.onExtraCallbackWithResult(), (String) this.asBinder.onExtraCallbackWithResult(), ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue(), ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i10 << 12) & 57344, 3072, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else if (Intrinsics.areEqual(onextracallback, onExtraCallback.onExtraCallbackWithResult.onExtraCallbackWithResult)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1359676514);
                        z2 = true;
                        Companion.onWarmupCompleted((String) ((Pair) arrayList.get(0)).getFirst(), (String) ((Pair) arrayList.get(1)).getFirst(), (String) ((Pair) arrayList.get(2)).getFirst(), (String) ((Pair) arrayList.get(3)).getFirst(), (Function1<? super String, Unit>) ((Pair) arrayList.get(0)).getSecond(), (Function1<? super String, Unit>) ((Pair) arrayList.get(1)).getSecond(), (Function1<? super String, Unit>) ((Pair) arrayList.get(2)).getSecond(), (Function1<? super String, Unit>) ((Pair) arrayList.get(3)).getSecond(), quirksExternalSyntheticBackport0, (List<setFontAssetDelegate>) this.onNavigationEvent, (setCacheComposition.IAuthTabCallbackStub) this.asInterface.onExtraCallbackWithResult(), (String) this.onExtraCallbackWithResult.onExtraCallbackWithResult(), ((Boolean) this.onTransact.onExtraCallbackWithResult()).booleanValue(), (setCacheComposition.onWarmupCompleted) this.IAuthTabCallbackDefault.onExtraCallbackWithResult(), (String) this.asBinder.onExtraCallbackWithResult(), ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue(), ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i10 << 24) & 234881024, 12582912, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1358846954);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            }
            if ((CameraConfigExternalSyntheticLambda0.asBinder() ^ z2) != z2) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            int i19 = IAuthTabCallback_Parcel + 51;
            access000 = i19 % 128;
            int i20 = i19 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextField$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    int i21 = 2 % 2;
                    int i22 = onExtraCallback + 23;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    SplitTextField splitTextField = this.f$0;
                    if (i23 == 0) {
                        return SplitTextField.onExtraCallback(splitTextField, quirksExternalSyntheticBackport0, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    SplitTextField.onExtraCallback(splitTextField, quirksExternalSyntheticBackport0, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    public final void setType(@NotNull onExtraCallback onextracallback) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 47;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(onextracallback);
        this.IAuthTabCallbackStub.clear();
        int iOnExtraCallback = onextracallback.onExtraCallback();
        int i5 = 0;
        while (i5 < iOnExtraCallback) {
            int i6 = IAuthTabCallback_Parcel + 27;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            this.IAuthTabCallbackStub.add(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null));
            this.onNavigationEvent.add((Object) null);
            i5++;
            int i8 = access000 + 77;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public final void setStyle(@NotNull setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i2 = 2 % 2;
        int i3 = access000 + 31;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        this.asInterface.IAuthTabCallback(iAuthTabCallbackStub);
        int i5 = IAuthTabCallback_Parcel + 121;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setHelpMessage(@Nullable String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 121;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.onExtraCallbackWithResult.IAuthTabCallback(str);
        int i4 = access000 + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setError(boolean z) {
        int i2 = 2 % 2;
        int i3 = access000 + 119;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.onTransact.IAuthTabCallback(Boolean.valueOf(z));
        int i5 = IAuthTabCallback_Parcel + 83;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setLabelOption(@NotNull setCacheComposition.onWarmupCompleted onwarmupcompleted) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 93;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.IAuthTabCallbackDefault.IAuthTabCallback(onwarmupcompleted);
        int i5 = IAuthTabCallback_Parcel + 73;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setLabel(@NotNull String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 71;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.asBinder.IAuthTabCallback(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.asBinder.IAuthTabCallback(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setEnabled(boolean z) {
        int i2 = 2 % 2;
        int i3 = access000 + 107;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback.IAuthTabCallback(Boolean.valueOf(!z));
        int i5 = access000 + 93;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setAutoFocus(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 27;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z));
        if (i4 != 0) {
            throw null;
        }
    }

    public final void setText(int i2, @NotNull String str) {
        int i3 = 2 % 2;
        int i4 = access000 + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ((getSupportedHighSpeedResolutionsFor) this.IAuthTabCallbackStub.get(i2)).IAuthTabCallback(str);
        int i6 = access000 + 45;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: setField-fFvQtsQ$default, reason: not valid java name */
    public static /* synthetic */ void m165setFieldfFvQtsQ$default(SplitTextField splitTextField, int i2, Function1 function1, Integer num, String str, Boolean bool, Boolean bool2, getMergedResolutions getmergedresolutions, CameraUnavailableException cameraUnavailableException, CameraState cameraState, String str2, String str3, setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, getBacktraceNote getbacktracenote, Boolean bool3, Function0 function0, setCacheComposition.IAuthTabCallback iAuthTabCallback, createCameraCaptureCallback createcameracapturecallback, Function1 function12, int i3, Object obj) {
        Integer num2;
        getMergedResolutions getmergedresolutions2;
        CameraUnavailableException cameraUnavailableException2;
        CameraState cameraState2;
        String str4;
        setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult2;
        setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault2;
        Boolean bool4;
        Function0 function02;
        int i4 = 2 % 2;
        Function1 function13 = (i3 & 2) != 0 ? null : function1;
        if ((i3 & 4) != 0) {
            int i5 = IAuthTabCallback_Parcel + 107;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        String str5 = (i3 & 8) != 0 ? null : str;
        Boolean bool5 = (i3 & 16) != 0 ? null : bool;
        Boolean bool6 = (i3 & 32) != 0 ? null : bool2;
        if ((i3 & 64) != 0) {
            int i7 = IAuthTabCallback_Parcel + 105;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            getmergedresolutions2 = null;
        } else {
            getmergedresolutions2 = getmergedresolutions;
        }
        if ((i3 & 128) != 0) {
            int i9 = IAuthTabCallback_Parcel;
            int i10 = i9 + 71;
            access000 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 0 / 0;
            }
            int i12 = i9 + 73;
            access000 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 / 4;
            }
            cameraUnavailableException2 = null;
        } else {
            cameraUnavailableException2 = cameraUnavailableException;
        }
        if ((i3 & 256) != 0) {
            int i14 = access000 + 21;
            IAuthTabCallback_Parcel = i14 % 128;
            int i15 = i14 % 2;
            cameraState2 = null;
        } else {
            cameraState2 = cameraState;
        }
        String str6 = (i3 & 512) != 0 ? null : str2;
        if ((i3 & 1024) != 0) {
            int i16 = access000 + 67;
            IAuthTabCallback_Parcel = i16 % 128;
            int i17 = i16 % 2;
            str4 = null;
        } else {
            str4 = str3;
        }
        if ((i3 & 2048) != 0) {
            int i18 = IAuthTabCallback_Parcel + 49;
            access000 = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 38 / 0;
            }
            onextracallbackwithresult2 = null;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        if ((i3 & 4096) != 0) {
            int i20 = access000 + 113;
            IAuthTabCallback_Parcel = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 99 / 0;
            }
            iAuthTabCallbackDefault2 = null;
        } else {
            iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
        }
        getBacktraceNote getbacktracenote2 = (i3 & 8192) != 0 ? null : getbacktracenote;
        Boolean bool7 = (i3 & 16384) != 0 ? null : bool3;
        if ((i3 & 32768) != 0) {
            int i22 = IAuthTabCallback_Parcel + 99;
            bool4 = bool7;
            access000 = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 24 / 0;
            }
            function02 = null;
        } else {
            bool4 = bool7;
            function02 = function0;
        }
        splitTextField.m166setFieldfFvQtsQ(i2, function13, num2, str5, bool5, bool6, getmergedresolutions2, cameraUnavailableException2, cameraState2, str6, str4, onextracallbackwithresult2, iAuthTabCallbackDefault2, getbacktracenote2, bool4, function02, (65536 & i3) != 0 ? null : iAuthTabCallback, (i3 & 131072) != 0 ? null : createcameracapturecallback, (i3 & 262144) != 0 ? null : function12);
    }

    /* renamed from: setField-fFvQtsQ, reason: not valid java name */
    public final void m166setFieldfFvQtsQ(int i2, @Nullable Function1<? super selectParentResolutions, Unit> function1, @Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable getMergedResolutions getmergedresolutions, @Nullable CameraUnavailableException cameraUnavailableException, @Nullable CameraState cameraState, @Nullable String str2, @Nullable String str3, @Nullable setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult, @Nullable setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable Boolean bool3, @Nullable Function0<Unit> function0, @Nullable setCacheComposition.IAuthTabCallback iAuthTabCallback, @Nullable createCameraCaptureCallback createcameracapturecallback, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function12) {
        int iAsInterface;
        EncoderProfilesProxyVideoProfileProxy interfaceDescriptor;
        boolean zBooleanValue;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyAccess100;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyIAuthTabCallback_Parcel;
        setCacheComposition.IAuthTabCallbackDefault iAuthTabCallbackDefault2;
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteIAuthTabCallbackStub;
        Function1<? super SurfaceProcessorNodeOut, Unit> function13;
        int i3 = 2 % 2;
        LiveDataObservableExternalSyntheticLambda1<setFontAssetDelegate> liveDataObservableExternalSyntheticLambda1 = this.onNavigationEvent;
        setFontAssetDelegate setfontassetdelegate = (setFontAssetDelegate) liveDataObservableExternalSyntheticLambda1.get(i2);
        if (setfontassetdelegate == null) {
            setfontassetdelegate = new setFontAssetDelegate(new selectParentResolutions((String) null, 0L, (getNumberOfTargets) null, 7, (DefaultConstructorMarker) null), (Function1) null, (setMaxFrame) null, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, (CameraUnavailableException) null, (CameraState) null, false, false, false, 0, 0, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 134217726, (DefaultConstructorMarker) null);
        }
        setFontAssetDelegate setfontassetdelegate2 = setfontassetdelegate;
        Function1<? super selectParentResolutions, Unit> function1IAuthTabCallbackDefault = function1 == null ? setfontassetdelegate2.IAuthTabCallbackDefault() : function1;
        Object obj = null;
        if (num != null) {
            int i4 = IAuthTabCallback_Parcel + 119;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                num.intValue();
                obj.hashCode();
                throw null;
            }
            iAsInterface = num.intValue();
        } else {
            iAsInterface = setfontassetdelegate2.asInterface();
        }
        int i5 = iAsInterface;
        if (str == null || (interfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(-1326335766, true, new SplitTextField$.ExternalSyntheticLambda0(str))) == null) {
            interfaceDescriptor = setfontassetdelegate2.getInterfaceDescriptor();
        }
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy = interfaceDescriptor;
        if (bool != null) {
            int i6 = IAuthTabCallback_Parcel + 89;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = ((Boolean) setFontAssetDelegate.IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -399369704, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{setfontassetdelegate2}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 399369708)).booleanValue();
        }
        boolean z = zBooleanValue;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : setfontassetdelegate2.onExtraCallbackWithResult();
        getMergedResolutions getmergedresolutionsICustomTabsCallback = getmergedresolutions == null ? setfontassetdelegate2.ICustomTabsCallback() : getmergedresolutions;
        CameraUnavailableException cameraUnavailableExceptionOnWarmupCompleted = cameraUnavailableException == null ? setfontassetdelegate2.onWarmupCompleted() : cameraUnavailableException;
        CameraState cameraStateOnNavigationEvent = cameraState == null ? setfontassetdelegate2.onNavigationEvent() : cameraState;
        if (str2 == null || (encoderProfilesProxyVideoProfileProxyAccess100 = ForwardingCameraControl.onExtraCallbackWithResult(-739747216, true, new SplitTextField$.ExternalSyntheticLambda1(str2))) == null) {
            encoderProfilesProxyVideoProfileProxyAccess100 = setfontassetdelegate2.access100();
        }
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy2 = encoderProfilesProxyVideoProfileProxyAccess100;
        if (str3 == null || (encoderProfilesProxyVideoProfileProxyIAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(1971238745, true, new SplitTextField$.ExternalSyntheticLambda2(str3))) == null) {
            encoderProfilesProxyVideoProfileProxyIAuthTabCallback_Parcel = setfontassetdelegate2.IAuthTabCallback_Parcel();
        }
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy3 = encoderProfilesProxyVideoProfileProxyIAuthTabCallback_Parcel;
        setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult == null ? (setCacheComposition.onExtraCallbackWithResult) setFontAssetDelegate.IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1963581688, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{setfontassetdelegate2}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1963581691) : onextracallbackwithresult;
        if (iAuthTabCallbackDefault == null) {
            int i8 = IAuthTabCallback_Parcel + 37;
            access000 = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            iAuthTabCallbackDefault2 = (setCacheComposition.IAuthTabCallbackDefault) setFontAssetDelegate.IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -682190254, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{setfontassetdelegate2}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 682190254);
        } else {
            int i9 = IAuthTabCallback_Parcel + 107;
            access000 = i9 % 128;
            int i10 = i9 % 2;
            iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
        }
        if (getbacktracenote == null) {
            int i11 = access000 + 91;
            IAuthTabCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
            getbacktracenoteIAuthTabCallbackStub = setfontassetdelegate2.IAuthTabCallbackStub();
        } else {
            getbacktracenoteIAuthTabCallbackStub = getbacktracenote;
        }
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : setfontassetdelegate2.onExtraCallback();
        Function0<Unit> function0AsBinder = function0 == null ? setfontassetdelegate2.asBinder() : function0;
        setCacheComposition.IAuthTabCallback IAuthTabCallback2 = iAuthTabCallback == null ? setfontassetdelegate2.IAuthTabCallback() : iAuthTabCallback;
        int iAsInterface2 = createcameracapturecallback != null ? createcameracapturecallback.asInterface() : setfontassetdelegate2.writeTypedObject();
        if (function12 == null) {
            int i13 = access000 + 67;
            IAuthTabCallback_Parcel = i13 % 128;
            int i14 = i13 % 2;
            function13 = (Function1) setFontAssetDelegate.IAuthTabCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 812121319, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{setfontassetdelegate2}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -812121318);
        } else {
            function13 = function12;
        }
        liveDataObservableExternalSyntheticLambda1.set(i2, setFontAssetDelegate.onExtraCallback(setfontassetdelegate2, (selectParentResolutions) null, function1IAuthTabCallbackDefault, (setMaxFrame) null, (QuirksExternalSyntheticBackport0) null, (setMaxFrame) null, (setCacheComposition.onExtraCallback) null, function0AsBinder, (getBacktraceNote) null, encoderProfilesProxyVideoProfileProxy, encoderProfilesProxyVideoProfileProxy2, encoderProfilesProxyVideoProfileProxy3, getbacktracenoteIAuthTabCallbackStub, (getBacktraceNote) null, iAuthTabCallbackDefault2, getmergedresolutionsICustomTabsCallback, (setCacheComposition.onWarmupCompleted) null, onextracallbackwithresult2, cameraUnavailableExceptionOnWarmupCompleted, cameraStateOnNavigationEvent, zBooleanValue3, z, zBooleanValue2, iAsInterface2, i5, IAuthTabCallback2, function13, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 67145917, (Object) null));
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        boolean z = true;
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue & 17) != 16) {
            int i3 = IAuthTabCallback_Parcel + 103;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-739747216, iIntValue, -1, "im.toss.compose.v3.textfield.split.SplitTextField.setField.<anonymous>.<anonymous>.<anonymous> (SplitTextField.kt:244)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = access000 + 33;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i6 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1971238745, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextField.setField.<anonymous>.<anonymous>.<anonymous> (SplitTextField.kt:245)");
                int i4 = access000 + 99;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = access000 + 25;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1365518771, 1365518772, objArr);
    }

    private static final Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -2049839265, 2049839265, objArr);
    }
}
