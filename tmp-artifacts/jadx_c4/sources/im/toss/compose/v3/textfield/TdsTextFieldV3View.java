package im.toss.compose.v3.textfield;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.geometry.Rect;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.compose.v3.textfield.TdsTextFieldV3View;
import im.toss.compose.v3.textfield.TdsTextFieldV3View$;
import im.toss.tds.view.compat.component.TdsComposeView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7;
import o.Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda4;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraState;
import o.CameraUnavailableException;
import o.CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.Futures3;
import o.FuturesCallbackListener;
import o.IAnimation;
import o.QuirksExternalSyntheticBackport0;
import o.SurfaceProcessorNodeOut;
import o.UseCaseAdditionSimulator;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15300;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.findResAndMsg;
import o.getBacktraceNote;
import o.getMaxSupportedFrameRate;
import o.getMergedResolutions;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getSupportedHighSpeedResolutionsFor;
import o.hasProvider;
import o.isZslDisabledByByUserCaseConfig;
import o.r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI;
import o.removeUpdateListener;
import o.setCacheComposition;
import o.setDefaultFontFileExtension;
import o.setRipple;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TdsTextFieldV3View extends TdsComposeView {
    private static int ICustomTabsCallback_Parcel = 0;
    private static int ICustomTabsService = 1;
    private Function1<? super Boolean, Unit> IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStub;
    private final getMinWebSocketMessageToCompressokhttp IAuthTabCallbackStubProxy;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback_Parcel;
    private Function1<? super String, Unit> ICustomTabsCallback;
    private final getMinWebSocketMessageToCompressokhttp ICustomTabsCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor ICustomTabsCallbackStub;
    private final getMinWebSocketMessageToCompressokhttp ICustomTabsCallbackStubProxy;
    private final getSupportedHighSpeedResolutionsFor access000;
    private final getSupportedHighSpeedResolutionsFor access100;
    private final getSupportedHighSpeedResolutionsFor asBinder;
    private final getSupportedHighSpeedResolutionsFor asInterface;
    private final getSupportedHighSpeedResolutionsFor extraCallback;
    private final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 extraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor getInterfaceDescriptor;
    private final getMinWebSocketMessageToCompressokhttp onActivityLayout;
    private Function1<? super Boolean, Unit> onActivityResized;
    private final getMaxSupportedFrameRate onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onMessageChannelReady;
    private final getSupportedHighSpeedResolutionsFor onMinimized;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final getMinWebSocketMessageToCompressokhttp onPostMessage;
    private final getSupportedHighSpeedResolutionsFor onRelationshipValidationResult;
    private setCacheComposition.IAuthTabCallback onTransact;
    private final getSupportedHighSpeedResolutionsFor onUnminimized;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;
    private Function1<? super String, Boolean> readTypedObject;
    private Function0<Unit> writeTypedObject;

    public static final /* synthetic */ class IAuthTabCallbackStub {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int asBinder = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            try {
                iArr[onNavigationEvent.BOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onNavigationEvent.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onNavigationEvent.LINE_BIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onNavigationEvent.HERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr2[onExtraCallbackWithResult.APPEAR.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[onExtraCallbackWithResult.SUSTAIN.ordinal()] = 2;
                int i2 = onExtraCallback + 121;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallbackWithResult = iArr2;
            int[] iArr3 = new int[IAuthTabCallback.values().length];
            try {
                iArr3[IAuthTabCallback.APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[IAuthTabCallback.SUSTAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            onWarmupCompleted = iArr3;
            int[] iArr4 = new int[onWarmupCompleted.values().length];
            try {
                iArr4[onWarmupCompleted.CLEAR.ordinal()] = 1;
                int i4 = onExtraCallback + 71;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[onWarmupCompleted.SECRET.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            IAuthTabCallback = iArr4;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTextFieldV3View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTextFieldV3View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        Futures3 futures3 = (Futures3) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 43;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), -192836943, iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 192836945, new Object[]{getsupportedhighspeedresolutionsfor, futures3});
        int i4 = ICustomTabsCallback_Parcel + 101;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i2) | i6);
        int i11 = i9 | i10 | (~(i6 | i3));
        int i12 = (~(i3 | i2)) | (~(i7 | i2));
        int i13 = i8 | i10;
        int i14 = i2 + i6 + i5 + (793188503 * i) + (2090109681 * i4);
        int i15 = i14 * i14;
        int i16 = (837707615 * i2) + 1286602752 + ((-1676358574) * i6) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i5) + (1186463744 * i) + (1166540800 * i4) + ((-1956446208) * i15);
        int i17 = ((i2 * 1389925299) - 652765764) + (i6 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i5 * 1389926445) + (i * (-1551828341)) + (i4 * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        if (i18 == 1) {
            TdsTextFieldV3View tdsTextFieldV3View = (TdsTextFieldV3View) objArr[0];
            int i19 = 2 % 2;
            int i20 = ICustomTabsService + 9;
            ICustomTabsCallback_Parcel = i20 % 128;
            int i21 = i20 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) tdsTextFieldV3View.onUnminimized.onExtraCallbackWithResult();
            int i22 = ICustomTabsService + 125;
            ICustomTabsCallback_Parcel = i22 % 128;
            int i23 = i22 % 2;
            return onnavigationevent;
        }
        if (i18 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 != 3) {
            return i18 != 4 ? i18 != 5 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }
        TdsTextFieldV3View tdsTextFieldV3View2 = (TdsTextFieldV3View) objArr[0];
        int i24 = 2 % 2;
        int i25 = ICustomTabsCallback_Parcel + 75;
        ICustomTabsService = i25 % 128;
        int i26 = i25 % 2;
        int iIntValue = ((Number) tdsTextFieldV3View2.extraCallback.onExtraCallbackWithResult()).intValue();
        int i27 = ICustomTabsCallback_Parcel + 75;
        ICustomTabsService = i27 % 128;
        int i28 = i27 % 2;
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 51;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(function1, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(function1, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ICustomTabsService + 125;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onNavigationEvent(TdsTextFieldV3View tdsTextFieldV3View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = ICustomTabsService + 63;
        ICustomTabsCallback_Parcel = i4 % 128;
        tdsTextFieldV3View.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ LinearLayout onWarmupCompleted(Function1 function1, Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 13;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, context);
        int i4 = ICustomTabsCallback_Parcel + 101;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return linearLayoutOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsTextFieldV3View tdsTextFieldV3View = (TdsTextFieldV3View) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 71;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tdsTextFieldV3View, str);
        int i4 = ICustomTabsService + 55;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsTextFieldV3View tdsTextFieldV3View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback_Parcel + 49;
        ICustomTabsService = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            onNavigationEvent(tdsTextFieldV3View, quirksExternalSyntheticBackport0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(tdsTextFieldV3View, quirksExternalSyntheticBackport0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = ICustomTabsCallback_Parcel + 81;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTextFieldV3View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.ICustomTabsCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onUnminimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onNavigationEvent.HERO, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onExtraCallback.IAuthTabCallback.onNavigationEvent, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.getInterfaceDescriptor = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onExtraCallbackWithResult.APPEAR, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStubProxy = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
        this.onActivityLayout = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
        this.ICustomTabsCallbackStubProxy = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
        this.ICustomTabsCallbackDefault = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
        this.onPostMessage = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onMessageChannelReady = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(IAuthTabCallback.APPEAR, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        Boolean bool = Boolean.FALSE;
        this.asInterface = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onWarmupCompleted.NONE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access000 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(removeUpdateListener.onWarmupCompleted.onExtraCallback(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onRelationshipValidationResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(CameraUnavailableException.Companion.onExtraCallbackWithResult(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access100 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(CameraState.Companion.IAuthTabCallback(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.extraCallbackWithResult = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
        this.onExtraCallbackWithResult = new getMaxSupportedFrameRate();
        this.IAuthTabCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onTransact = setCacheComposition.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted;
        this.extraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(50, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTextFieldV3View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ICustomTabsCallback_Parcel + 63;
            int i4 = i3 % 128;
            ICustomTabsService = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 87;
            ICustomTabsCallback_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 4;
            } else {
                int i8 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = ICustomTabsCallback_Parcel + 5;
            int i10 = i9 % 128;
            ICustomTabsService = i10;
            i = i9 % 2 == 0 ? 1 : 0;
            int i11 = i10 + 93;
            ICustomTabsCallback_Parcel = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ Function1 IAuthTabCallback(TdsTextFieldV3View tdsTextFieldV3View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 79;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        Function1<? super Boolean, Unit> function1 = tdsTextFieldV3View.onActivityResized;
        int i5 = i3 + 91;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public static final /* synthetic */ getMaxSupportedFrameRate onExtraCallbackWithResult(TdsTextFieldV3View tdsTextFieldV3View) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 27;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        getMaxSupportedFrameRate getmaxsupportedframerate = tdsTextFieldV3View.onExtraCallbackWithResult;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 29;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return getmaxsupportedframerate;
    }

    public static final /* synthetic */ Function1 onNavigationEvent(TdsTextFieldV3View tdsTextFieldV3View) {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 57;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Function1<? super Boolean, Unit> function1 = tdsTextFieldV3View.IAuthTabCallback;
        int i5 = i2 + 83;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return function1;
    }

    public static final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 onWarmupCompleted(TdsTextFieldV3View tdsTextFieldV3View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 17;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = tdsTextFieldV3View.extraCallbackWithResult;
        int i5 = i3 + 87;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
    }

    public final void setOnClick(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 25;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        this.writeTypedObject = function0;
        int i5 = i3 + 99;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
    }

    public final getMinWebSocketMessageToCompressokhttp IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 93;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 85;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getminwebsocketmessagetocompressokhttp;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsTextFieldV3View tdsTextFieldV3View = (TdsTextFieldV3View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 25;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = tdsTextFieldV3View.onActivityLayout;
        int i5 = i2 + 89;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            return getminwebsocketmessagetocompressokhttp;
        }
        throw null;
    }

    public final void setInputType(@NotNull setCacheComposition.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 21;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.onTransact = iAuthTabCallback;
            int i3 = 75 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.onTransact = iAuthTabCallback;
        }
        int i4 = ICustomTabsCallback_Parcel + 57;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private /* synthetic */ Object L$0;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = TdsTextFieldV3View.this.new asInterface(access13800Var);
            asinterface.L$0 = obj;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return asinterface;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return asinterfaceCreate.invokeSuspend(unit);
            }
            asinterfaceCreate.invokeSuspend(unit);
            throw null;
        }

        /* renamed from: im.toss.compose.v3.textfield.TdsTextFieldV3View$asInterface$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TdsTextFieldV3View this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(TdsTextFieldV3View tdsTextFieldV3View, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.this$0 = tdsTextFieldV3View;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, access13800Var);
                anonymousClass3.L$0 = obj;
                int i2 = onWarmupCompleted + 43;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 95;
                onWarmupCompleted = i2 % 128;
                Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 = (Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    onExtraCallback(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7, access13800Var);
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7, access13800Var);
                int i3 = onExtraCallback + 37;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 21;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 = (Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                if (camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 instanceof Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.onExtraCallbackWithResult) {
                    Function1 function1OnNavigationEvent = TdsTextFieldV3View.onNavigationEvent(this.this$0);
                    if (function1OnNavigationEvent != null) {
                        int i4 = onWarmupCompleted + 105;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        function1OnNavigationEvent.invoke(access14000.onNavigationEvent(true));
                    }
                } else if (!(!(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 instanceof Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.onExtraCallback))) {
                    int i6 = onExtraCallback + 121;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    Function1 function1OnNavigationEvent2 = TdsTextFieldV3View.onNavigationEvent(this.this$0);
                    if (function1OnNavigationEvent2 != null) {
                        function1OnNavigationEvent2.invoke(access14000.onNavigationEvent(false));
                    }
                } else if (camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 instanceof Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted) {
                    Function1 function1IAuthTabCallback = TdsTextFieldV3View.IAuthTabCallback(this.this$0);
                    if (function1IAuthTabCallback != null) {
                        int i8 = onExtraCallback + 7;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            function1IAuthTabCallback.invoke(access14000.onNavigationEvent(false));
                        } else {
                            function1IAuthTabCallback.invoke(access14000.onNavigationEvent(true));
                        }
                    }
                } else if (camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 instanceof Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback) {
                    Function1 function1IAuthTabCallback2 = TdsTextFieldV3View.IAuthTabCallback(this.this$0);
                    if (function1IAuthTabCallback2 != null) {
                        int i9 = onWarmupCompleted + 73;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        function1IAuthTabCallback2.invoke(access14000.onNavigationEvent(false));
                    }
                } else if (camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7 instanceof Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onNavigationEvent) {
                    int i11 = onWarmupCompleted + 53;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        TdsTextFieldV3View.IAuthTabCallback(this.this$0);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Function1 function1IAuthTabCallback3 = TdsTextFieldV3View.IAuthTabCallback(this.this$0);
                    if (function1IAuthTabCallback3 != null) {
                        function1IAuthTabCallback3.invoke(access14000.onNavigationEvent(false));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(TdsTextFieldV3View.onWarmupCompleted(TdsTextFieldV3View.this).onExtraCallbackWithResult(), new AnonymousClass3(TdsTextFieldV3View.this, null)), findresandmsg);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }

    private static final Unit onWarmupCompleted(TdsTextFieldV3View tdsTextFieldV3View, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Function1<? super String, Boolean> function1 = tdsTextFieldV3View.readTypedObject;
        if (function1 != null) {
            int i2 = ICustomTabsService + 119;
            ICustomTabsCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0 ? ((Boolean) function1.invoke(str)).booleanValue() : ((Boolean) function1.invoke(str)).booleanValue()) {
                int i3 = ICustomTabsService + 61;
                ICustomTabsCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                throw null;
            }
        }
        tdsTextFieldV3View.setText(str);
        Function1<? super String, Unit> function12 = tdsTextFieldV3View.ICustomTabsCallback;
        if (function12 != null) {
            int i4 = ICustomTabsCallback_Parcel + 113;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
            function12.invoke(str);
        }
        Unit unit2 = Unit.INSTANCE;
        int i6 = ICustomTabsCallback_Parcel + 17;
        ICustomTabsService = i6 % 128;
        int i7 = i6 % 2;
        return unit2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        Futures3 futures3 = (Futures3) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 75;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            IAuthTabCallback(getsupportedhighspeedresolutionsfor, FuturesCallbackListener.onExtraCallbackWithResult(futures3));
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, FuturesCallbackListener.onExtraCallbackWithResult(futures3));
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsService + 119;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ boolean onWarmupCompleted(TdsTextFieldV3View tdsTextFieldV3View) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(tdsTextFieldV3View);
            }
            onExtraCallbackWithResult(tdsTextFieldV3View);
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsTextFieldV3View.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final boolean onExtraCallbackWithResult(TdsTextFieldV3View tdsTextFieldV3View) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnActivityResized = tdsTextFieldV3View.onActivityResized();
            int i4 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return zOnActivityResized;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                final TdsTextFieldV3View tdsTextFieldV3View = TdsTextFieldV3View.this;
                IAnimation iAnimationOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3View$TdsContent$4$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onNavigationEvent + 63;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Boolean boolValueOf = Boolean.valueOf(TdsTextFieldV3View.IAuthTabCallbackDefault.onWarmupCompleted(tdsTextFieldV3View));
                        int i10 = onNavigationEvent + 59;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        return boolValueOf;
                    }
                });
                final TdsTextFieldV3View tdsTextFieldV3View2 = TdsTextFieldV3View.this;
                setRipple setripple = new setRipple() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3View.IAuthTabCallbackDefault.3
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        Object objIAuthTabCallback;
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 119;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        if (i9 == 0) {
                            objIAuthTabCallback = IAuthTabCallback(zBooleanValue, access13800Var);
                            int i10 = 45 / 0;
                        } else {
                            objIAuthTabCallback = IAuthTabCallback(zBooleanValue, access13800Var);
                        }
                        int i11 = IAuthTabCallback + 39;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 != 0) {
                            return objIAuthTabCallback;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final Object IAuthTabCallback(boolean z, access13800<? super Unit> access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 101;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        if (z) {
                            getMaxSupportedFrameRate.onNavigationEvent(TdsTextFieldV3View.onExtraCallbackWithResult(tdsTextFieldV3View2), 0, 1, (Object) null);
                            int i10 = IAuthTabCallback + 25;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (iAnimationOnWarmupCompleted.collect(setripple, this) == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 91;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        setCacheComposition.IAuthTabCallbackStub onnavigationevent;
        setCacheComposition.onExtraCallback onwarmupcompleted;
        setCacheComposition.onWarmupCompleted onwarmupcompleted2;
        setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult;
        setCacheComposition.IAuthTabCallbackDefault onextracallbackwithresult2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1360373046);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i5 = ICustomTabsService + 31;
            ICustomTabsCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
                obj.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                i3 = 16;
            } else {
                int i6 = ICustomTabsCallback_Parcel + 7;
                ICustomTabsService = i6 % 128;
                int i7 = i6 % 2;
                i3 = 32;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = ICustomTabsCallback_Parcel + 37;
            ICustomTabsService = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1360373046, i2, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3View.TdsContent (TdsTextFieldV3View.kt:72)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted3 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted3.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Rect.Companion.onWarmupCompleted(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = this.extraCallbackWithResult;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(!zOnExtraCallback) || objOnMinimized2 == onwarmupcompleted3.onExtraCallback()) {
                objOnMinimized2 = new asInterface(null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            String strICustomTabsCallback = ICustomTabsCallback();
            int i10 = IAuthTabCallbackStub.onNavigationEvent[((onNavigationEvent) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), 896450188, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -896450187, new Object[]{this})).ordinal()];
            if (i10 == 1) {
                onnavigationevent = new setCacheComposition.IAuthTabCallbackStub.onNavigationEvent(null, 0, null, 7, null);
            } else if (i10 == 2) {
                onnavigationevent = new setCacheComposition.IAuthTabCallbackStub.onWarmupCompleted(null, null, 3, null);
            } else if (i10 == 3) {
                onnavigationevent = new setCacheComposition.IAuthTabCallbackStub.onExtraCallbackWithResult(null, null, 3, null);
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                onnavigationevent = new setCacheComposition.IAuthTabCallbackStub.onExtraCallback(null, null, 3, null);
            }
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub = onnavigationevent;
            boolean zOnWarmupCompleted = onWarmupCompleted();
            Function0<Unit> function0 = this.writeTypedObject;
            onExtraCallback onextracallbackOnNavigationEvent = onNavigationEvent();
            if (Intrinsics.areEqual(onextracallbackOnNavigationEvent, onExtraCallback.IAuthTabCallback.onNavigationEvent)) {
                onwarmupcompleted = setCacheComposition.onExtraCallback.onExtraCallbackWithResult.IAuthTabCallback;
            } else {
                if (!(onextracallbackOnNavigationEvent instanceof onExtraCallback.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNull(onNavigationEvent(), "");
                onwarmupcompleted = new setCacheComposition.onExtraCallback.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((onExtraCallback.onNavigationEvent) r7).onWarmupCompleted()), null);
            }
            int i11 = IAuthTabCallbackStub.onExtraCallbackWithResult[getInterfaceDescriptor().ordinal()];
            if (i11 == 1) {
                onwarmupcompleted2 = setCacheComposition.onWarmupCompleted.APPEAR;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                onwarmupcompleted2 = setCacheComposition.onWarmupCompleted.SUSTAIN;
            }
            setCacheComposition.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted2;
            getBacktraceNote getbacktracenoteOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent();
            getBacktraceNote getbacktracenoteOnNavigationEvent2 = this.onActivityLayout.onNavigationEvent();
            getBacktraceNote getbacktracenoteOnNavigationEvent3 = this.ICustomTabsCallbackDefault.onNavigationEvent();
            getBacktraceNote getbacktracenoteOnNavigationEvent4 = this.onPostMessage.onNavigationEvent();
            getBacktraceNote getbacktracenoteOnNavigationEvent5 = onExtraCallbackWithResult().onNavigationEvent();
            getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteAccess000 = access000();
            int i12 = IAuthTabCallbackStub.onWarmupCompleted[extraCallback().ordinal()];
            if (i12 == 1) {
                onextracallbackwithresult = setCacheComposition.onExtraCallbackWithResult.APPEAR;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                onextracallbackwithresult = setCacheComposition.onExtraCallbackWithResult.SUSTAIN;
            }
            setCacheComposition.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult;
            boolean zOnPostMessage = onPostMessage();
            boolean zIAuthTabCallback = IAuthTabCallback();
            int i13 = IAuthTabCallbackStub.IAuthTabCallback[writeTypedObject().ordinal()];
            if (i13 != 1) {
                int i14 = ICustomTabsService + 91;
                int i15 = i14 % 128;
                ICustomTabsCallback_Parcel = i15;
                int i16 = i14 % 2;
                if (i13 != 2) {
                    int i17 = i15 + 51;
                    ICustomTabsService = i17 % 128;
                    if (i17 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    onextracallbackwithresult2 = null;
                } else {
                    onextracallbackwithresult2 = new setCacheComposition.IAuthTabCallbackDefault.onExtraCallback(null, null, null, 7, null);
                }
            } else {
                onextracallbackwithresult2 = new setCacheComposition.IAuthTabCallbackDefault.onExtraCallbackWithResult(null, null, 3, null);
            }
            getMergedResolutions typedObject = readTypedObject();
            CameraUnavailableException cameraUnavailableExceptionOnTransact = onTransact();
            CameraState cameraStateAsBinder = asBinder();
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = this.extraCallbackWithResult;
            setCacheComposition.IAuthTabCallback iAuthTabCallback = this.onTransact;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = UseCaseAdditionSimulator.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, this.onExtraCallbackWithResult);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted3.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3View$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = IAuthTabCallback + 105;
                        onExtraCallbackWithResult = i19 % 128;
                        int i20 = i19 % 2;
                        Object[] objArr = {getsupportedhighspeedresolutionsfor, (Futures3) obj2};
                        Unit unit = (Unit) TdsTextFieldV3View.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), 670046049, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -670046049, objArr);
                        int i21 = onExtraCallbackWithResult + 97;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized3);
            int iIntValue = ((Integer) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), 597893448, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -597893445, new Object[]{this})).intValue();
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnExtraCallback2) {
                Object obj2 = objOnMinimized4;
                if (objOnMinimized4 == onwarmupcompleted3.onExtraCallback()) {
                    Function1 function1 = new Function1() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3View$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj3) {
                            int i18 = 2 % 2;
                            int i19 = onNavigationEvent + 17;
                            IAuthTabCallback = i19 % 128;
                            int i20 = i19 % 2;
                            Object[] objArr = {this.f$0, (String) obj3};
                            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                            if (i20 == 0) {
                                return (Unit) TdsTextFieldV3View.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), 609910473, iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -609910469, objArr);
                            }
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                    obj2 = function1;
                }
                setDefaultFontFileExtension.onWarmupCompleted(strICustomTabsCallback, (Function1<? super String, Unit>) obj2, iAuthTabCallbackStub, quirksExternalSyntheticBackport0OnNavigationEvent, onwarmupcompleted, function0, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenoteOnNavigationEvent, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenoteOnNavigationEvent2, false, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenoteOnNavigationEvent3, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenoteOnNavigationEvent4, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenoteAccess000, (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenoteOnNavigationEvent5, onextracallbackwithresult2, typedObject, onwarmupcompleted4, onextracallbackwithresult3, cameraUnavailableExceptionOnTransact, cameraStateAsBinder, zOnWarmupCompleted, zOnPostMessage, zIAuthTabCallback, 0, iIntValue, iAuthTabCallback, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0, 0, 37748992);
                Unit unit = Unit.INSTANCE;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(this);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(!zOnExtraCallback3) || objOnMinimized5 == onwarmupcompleted3.onExtraCallback()) {
                    objOnMinimized5 = new IAuthTabCallbackDefault(null);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3View$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    int i18 = 2 % 2;
                    int i19 = onNavigationEvent + 41;
                    onExtraCallbackWithResult = i19 % 128;
                    if (i19 % 2 != 0) {
                        TdsTextFieldV3View.onWarmupCompleted(this.f$0, quirksExternalSyntheticBackport0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = TdsTextFieldV3View.onWarmupCompleted(this.f$0, quirksExternalSyntheticBackport0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i20 = onExtraCallbackWithResult + 7;
                    onNavigationEvent = i20 % 128;
                    int i21 = i20 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    public final void setOnTextChanged(@NotNull Function1<? super String, Unit> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 25;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ICustomTabsCallback = function1;
            int i3 = 75 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ICustomTabsCallback = function1;
        }
        int i4 = ICustomTabsService + 47;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
    }

    public final void setOnTextPreChanged(@NotNull Function1<? super String, Boolean> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 31;
        ICustomTabsService = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.readTypedObject = function1;
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        this.readTypedObject = function1;
        int i3 = ICustomTabsService + 69;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setTextFieldStyle(@NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 113;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        setStyle(onnavigationevent);
        int i4 = ICustomTabsService + 41;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setOnClickListener(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 53;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        setEditable(false);
        this.writeTypedObject = function0;
        int i4 = ICustomTabsCallback_Parcel + 73;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public boolean hasOnClickListeners() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 7;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        if (this.writeTypedObject != null) {
            int i5 = i3 + 81;
            ICustomTabsService = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i3 + 123;
        ICustomTabsService = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final void setFocusChangedListener(@NotNull Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 39;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = function1;
        int i4 = ICustomTabsCallback_Parcel + 71;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setOnPressedChangedListener(@NotNull Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.onActivityResized = function1;
        int i4 = ICustomTabsService + 69;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setPlaceHolder(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 97;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onActivityLayout.onNavigationEvent(str);
        int i4 = ICustomTabsService + 65;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setLeftView(@NotNull Function1<? super ViewGroup, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        setLeftItem(ForwardingCameraControl.onExtraCallbackWithResult(94439740, true, new TdsTextFieldV3View$.ExternalSyntheticLambda3(function1)));
        int i2 = ICustomTabsCallback_Parcel + 103;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final LinearLayout onExtraCallbackWithResult(Function1 function1, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        layoutParams.width = -2;
        layoutParams.height = -2;
        linearLayout.setLayoutParams(layoutParams);
        function1.invoke(linearLayout);
        int i2 = ICustomTabsCallback_Parcel + 77;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(Function1 function1, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 85;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = ICustomTabsCallback_Parcel + 43;
            ICustomTabsService = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ICustomTabsCallback_Parcel + 97;
                ICustomTabsService = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(94439740, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3View.setLeftView.<anonymous> (TdsTextFieldV3View.kt:187)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(94439740, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3View.setLeftView.<anonymous> (TdsTextFieldV3View.kt:187)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i8 = ICustomTabsService + 65;
                ICustomTabsCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    TdsTextFieldV3View$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new TdsTextFieldV3View$.ExternalSyntheticLambda4(function1);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                    obj = externalSyntheticLambda4;
                }
                CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback((Function1) obj, (QuirksExternalSyntheticBackport0) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = ICustomTabsCallback_Parcel + 95;
                    ICustomTabsService = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i11 == 0) {
                        throw null;
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = ICustomTabsCallback_Parcel + 95;
            ICustomTabsService = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    public final void setRight(@NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 115;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            setRightType(onwarmupcompleted);
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        setRightType(onwarmupcompleted);
        int i3 = ICustomTabsService + 115;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent BOX = new onNavigationEvent("BOX", 0);
        public static final onNavigationEvent LINE = new onNavigationEvent("LINE", 1);
        public static final onNavigationEvent LINE_BIG = new onNavigationEvent("LINE_BIG", 2);
        public static final onNavigationEvent HERO = new onNavigationEvent("HERO", 3);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 109;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {BOX, LINE, LINE_BIG, HERO};
            int i5 = i2 + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return onnavigationeventArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 != 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onWarmupCompleted + 15;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onNavigationEvent(String str, int i) {
        }
    }

    public interface onExtraCallback {

        public static final class IAuthTabCallback implements onExtraCallback {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();

            static {
                int i = onExtraCallbackWithResult + 77;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            private IAuthTabCallback() {
            }
        }

        public static final class onNavigationEvent implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private final int onWarmupCompleted;

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
            
                if ((r7 instanceof im.toss.compose.v3.textfield.TdsTextFieldV3View.onExtraCallback.onNavigationEvent) != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                r3 = r3 + 103;
                im.toss.compose.v3.textfield.TdsTextFieldV3View.onExtraCallback.onNavigationEvent.IAuthTabCallback = r3 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            
                if ((r3 % 2) != 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
            
                if (r6.onWarmupCompleted == ((im.toss.compose.v3.textfield.TdsTextFieldV3View.onExtraCallback.onNavigationEvent) r7).onWarmupCompleted) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r1 = r1 + 81;
                im.toss.compose.v3.textfield.TdsTextFieldV3View.onExtraCallback.onNavigationEvent.onNavigationEvent = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 39;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                if (i3 % 2 == 0) {
                    int i5 = 99 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Integer.hashCode(this.onWarmupCompleted);
                int i4 = IAuthTabCallback + 55;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Fixed(sizeDp=" + this.onWarmupCompleted + ")";
                int i2 = onNavigationEvent + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onNavigationEvent(int i) {
                this.onWarmupCompleted = i;
            }

            public final int onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 99;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = this.onWarmupCompleted;
                int i6 = i3 + 27;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult APPEAR = new onExtraCallbackWithResult("APPEAR", 0);
        public static final onExtraCallbackWithResult SUSTAIN = new onExtraCallbackWithResult("SUSTAIN", 1);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult onextracallbackwithresult = APPEAR;
                onExtraCallbackWithResult onextracallbackwithresult2 = SUSTAIN;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[5];
                onextracallbackwithresultArr[1] = onextracallbackwithresult;
                onextracallbackwithresultArr[1] = onextracallbackwithresult2;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{APPEAR, SUSTAIN};
            }
            int i4 = i2 + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 39;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i4 = i2 + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                int i4 = 69 / 0;
            }
            int i5 = IAuthTabCallback + 13;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = IAuthTabCallback + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresultArr;
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 25;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private onExtraCallbackWithResult(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback APPEAR = new IAuthTabCallback("APPEAR", 0);
        public static final IAuthTabCallback SUSTAIN = new IAuthTabCallback("SUSTAIN", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = APPEAR;
            return i3 == 0 ? new IAuthTabCallback[]{SUSTAIN, iAuthTabCallback} : new IAuthTabCallback[]{iAuthTabCallback, SUSTAIN};
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 17;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 59;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 != 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = IAuthTabCallback + 89;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onWarmupCompleted CLEAR = new onWarmupCompleted("CLEAR", 0);
        public static final onWarmupCompleted SECRET = new onWarmupCompleted("SECRET", 1);
        public static final onWarmupCompleted NONE = new onWarmupCompleted("NONE", 2);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = CLEAR;
            if (i3 == 0) {
                return new onWarmupCompleted[]{onwarmupcompleted, SECRET, NONE};
            }
            onWarmupCompleted onwarmupcompleted2 = SECRET;
            onWarmupCompleted onwarmupcompleted3 = NONE;
            onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[5];
            onwarmupcompletedArr[0] = onwarmupcompleted;
            onwarmupcompletedArr[1] = onwarmupcompleted2;
            onwarmupcompletedArr[4] = onwarmupcompleted3;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 13;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + 37;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
            }
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onNavigationEvent + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallback + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    public final String ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 23;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.ICustomTabsCallbackStub.onExtraCallbackWithResult();
        int i4 = ICustomTabsService + 75;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setText(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 71;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.ICustomTabsCallbackStub.IAuthTabCallback(str);
        int i4 = ICustomTabsCallback_Parcel + 79;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setStyle(@NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 119;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onUnminimized.IAuthTabCallback(onnavigationevent);
        int i4 = ICustomTabsService + 97;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onWarmupCompleted() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 21;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            zBooleanValue = ((Boolean) this.onNavigationEvent.onExtraCallbackWithResult()).booleanValue();
            int i3 = 76 / 0;
        } else {
            zBooleanValue = ((Boolean) this.onNavigationEvent.onExtraCallbackWithResult()).booleanValue();
        }
        int i4 = ICustomTabsCallback_Parcel + 123;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public final void setEditable(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 15;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = ICustomTabsCallback_Parcel + 31;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final onExtraCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 87;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback onextracallback = (onExtraCallback) this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
            int i3 = ICustomTabsService + 37;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 97 / 0;
            }
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setHeight(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 27;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.IAuthTabCallbackDefault.IAuthTabCallback(onextracallback);
            int i3 = 55 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.IAuthTabCallbackDefault.IAuthTabCallback(onextracallback);
        }
        int i4 = ICustomTabsService + 39;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final onExtraCallbackWithResult getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 11;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) this.getInterfaceDescriptor.onExtraCallbackWithResult();
        int i4 = ICustomTabsService + 51;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    public final void setLabelOption(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 55;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.getInterfaceDescriptor.IAuthTabCallback(onextracallbackwithresult);
        int i4 = ICustomTabsCallback_Parcel + 83;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    public final getMinWebSocketMessageToCompressokhttp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 45;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return (getMinWebSocketMessageToCompressokhttp) this.asBinder.onExtraCallbackWithResult();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setHelpMessage(@NotNull getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 125;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getminwebsocketmessagetocompressokhttp, "");
        this.asBinder.IAuthTabCallback(getminwebsocketmessagetocompressokhttp);
        int i4 = ICustomTabsService + 15;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public final IAuthTabCallback extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 79;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return (IAuthTabCallback) this.onMessageChannelReady.onExtraCallbackWithResult();
        }
        throw null;
    }

    public final void setPrefixOption(@NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 15;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            this.onMessageChannelReady.IAuthTabCallback(iAuthTabCallback);
            throw null;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onMessageChannelReady.IAuthTabCallback(iAuthTabCallback);
        int i3 = ICustomTabsService + 13;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onPostMessage() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 119;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            zBooleanValue = ((Boolean) this.asInterface.onExtraCallbackWithResult()).booleanValue();
            int i3 = 68 / 0;
        } else {
            zBooleanValue = ((Boolean) this.asInterface.onExtraCallbackWithResult()).booleanValue();
        }
        int i4 = ICustomTabsService + 95;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public final void setError(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 67;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = ICustomTabsService + 11;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 73;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onWarmupCompleted.onExtraCallbackWithResult()).booleanValue();
        int i4 = ICustomTabsService + 5;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public final void setDisabled(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 41;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = ICustomTabsCallback_Parcel + 99;
            ICustomTabsService = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 96 / 0;
                return;
            }
            return;
        }
        this.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onWarmupCompleted writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 107;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return (onWarmupCompleted) this.onMinimized.onExtraCallbackWithResult();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRightType(@NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 45;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onMinimized.IAuthTabCallback(onwarmupcompleted);
        int i4 = ICustomTabsCallback_Parcel + 101;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 45;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = (getBacktraceNote) this.access000.onExtraCallbackWithResult();
        int i4 = ICustomTabsCallback_Parcel + 3;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final void setLeftItem(@NotNull getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 23;
        ICustomTabsCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            this.access000.IAuthTabCallback(getbacktracenote);
            throw null;
        }
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.access000.IAuthTabCallback(getbacktracenote);
        int i3 = ICustomTabsService + 75;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final getMergedResolutions readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 25;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return (getMergedResolutions) this.onRelationshipValidationResult.onExtraCallbackWithResult();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTransform(@Nullable getMergedResolutions getmergedresolutions) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 45;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onRelationshipValidationResult.IAuthTabCallback(getmergedresolutions);
        int i4 = ICustomTabsCallback_Parcel + 73;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    public final CameraUnavailableException onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 85;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
            return (CameraUnavailableException) this.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
        }
        return (CameraUnavailableException) this.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
    }

    public final void setKeyboardOptions(@NotNull CameraUnavailableException cameraUnavailableException) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 115;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cameraUnavailableException, "");
            this.IAuthTabCallback_Parcel.IAuthTabCallback(cameraUnavailableException);
        } else {
            Intrinsics.checkNotNullParameter(cameraUnavailableException, "");
            this.IAuthTabCallback_Parcel.IAuthTabCallback(cameraUnavailableException);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final CameraState asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 109;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return (CameraState) this.access100.onExtraCallbackWithResult();
        }
        throw null;
    }

    public final void setKeyboardActions(@NotNull CameraState cameraState) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 75;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cameraState, "");
            this.access100.IAuthTabCallback(cameraState);
        } else {
            Intrinsics.checkNotNullParameter(cameraState, "");
            this.access100.IAuthTabCallback(cameraState);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final boolean onActivityResized() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 75;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallbackStub.onExtraCallbackWithResult()).booleanValue();
        int i4 = ICustomTabsService + 3;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return zBooleanValue;
    }

    public final void setRequestFocus(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 3;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackStub.IAuthTabCallback(Boolean.valueOf(z));
            return;
        }
        this.IAuthTabCallbackStub.IAuthTabCallback(Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMaxLength(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 65;
        ICustomTabsService = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.extraCallback.IAuthTabCallback(Integer.valueOf(i));
            int i4 = ICustomTabsCallback_Parcel + 59;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.extraCallback.IAuthTabCallback(Integer.valueOf(i));
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Rect> getsupportedhighspeedresolutionsfor, Rect rect) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 125;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(rect);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(TdsTextFieldV3View tdsTextFieldV3View, String str) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), 609910473, iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -609910469, new Object[]{tdsTextFieldV3View, str});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), 670046049, iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -670046049, new Object[]{getsupportedhighspeedresolutionsfor, futures3});
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), -192836943, iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 192836945, new Object[]{getsupportedhighspeedresolutionsfor, futures3});
    }

    public final int IAuthTabCallbackStubProxy() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return ((Integer) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), 597893448, iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -597893445, new Object[]{this})).intValue();
    }

    public final getMinWebSocketMessageToCompressokhttp access100() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (getMinWebSocketMessageToCompressokhttp) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), 1090086362, iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1090086357, new Object[]{this});
    }

    public final onNavigationEvent extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (onNavigationEvent) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), 896450188, iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -896450187, new Object[]{this});
    }
}
