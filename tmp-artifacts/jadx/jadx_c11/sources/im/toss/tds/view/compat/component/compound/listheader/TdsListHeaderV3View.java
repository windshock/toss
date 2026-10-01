package im.toss.tds.view.compat.component.compound.listheader;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddings;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddingsKt;
import im.toss.tds.compose.component.compound.listheader.v3.RightPreset;
import im.toss.tds.view.compat.R;
import im.toss.tds.view.compat.component.TdsComposeView;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AvoidCaptureProcessProgressAvailabilityCheckQuirk;
import o.ByteOrderedDataOutputStream;
import o.C0081cookieJar;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.MaxAdPlacerExternalSyntheticLambda2;
import o.PreviewExternalSyntheticLambda3;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.access15300;
import o.accessgetCameraFactoryp;
import o.accessgetTlsVersionsAsStringp;
import o.accessisMonitoringp;
import o.addFixedPosition;
import o.addTags;
import o.areAllItemsEnabled;
import o.bindChildren;
import o.callTimeout;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.eventListener;
import o.getBacktraceNote;
import o.getDnsokhttp;
import o.getExtensionsBeforeInitialized;
import o.getFollowRedirectsokhttp;
import o.getFollowSslRedirectsokhttp;
import o.getHumanReadableName;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getSupportedHighSpeedResolutions;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTitleMarginEnd;
import o.hasProvider;
import o.measureChildConstrained;
import o.oExternalSyntheticLambda0;
import o.r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI;
import o.response;
import o.setByteOrder;
import o.setPostviewFormatSelector;
import o.unregisterOutputSurface;
import o.use;
import o.useAndConfigureProgramWithTexture;
import o.w0a;
import o.w2;
import o.wa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsListHeaderV3View extends TdsComposeView {
    private static int readTypedObject = 1;
    private static int writeTypedObject;
    private final getSupportedHighSpeedResolutionsFor<eventListener> IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor<Function0<Unit>> IAuthTabCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor<Boolean> IAuthTabCallbackStub;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackStubProxy;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback_Parcel;
    private final getSupportedHighSpeedResolutionsFor<wa.IAuthTabCallbackStub> ICustomTabsCallback;
    private final getSupportedHighSpeedResolutionsFor<eventListener> access000;
    private getSupportedHighSpeedResolutionsFor<wa.IAuthTabCallback> access100;
    private final getSupportedHighSpeedResolutionsFor<onExtraCallback> asBinder;
    private final getSupportedHighSpeedResolutionsFor<wa.onExtraCallback> asInterface;
    private final getSupportedHighSpeedResolutions extraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor<onNavigationEvent> getInterfaceDescriptor;
    private final getSupportedHighSpeedResolutionsFor<IAuthTabCallback> onExtraCallbackWithResult;
    private getSupportedHighSpeedResolutionsFor<wa.onNavigationEvent> onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor<eventListener> onTransact;
    private final getSupportedHighSpeedResolutionsFor<setByteOrder> onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallbackStub {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onTransact = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr2[onExtraCallbackWithResult.LARGE.ordinal()] = 1;
                int i = onTransact + 9;
                IAuthTabCallbackDefault = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[onExtraCallbackWithResult.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[onExtraCallbackWithResult.XSMALL.ordinal()] = 3;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onWarmupCompleted = iArr2;
            int[] iArr3 = new int[onWarmupCompleted.values().length];
            try {
                iArr3[onWarmupCompleted.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[onWarmupCompleted.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            onNavigationEvent = iArr3;
            int[] iArr4 = new int[onNavigationEvent.values().length];
            try {
                iArr4[onNavigationEvent.TEXT_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[onNavigationEvent.SELECTOR.ordinal()] = 2;
                int i4 = IAuthTabCallbackDefault + 101;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[onNavigationEvent.PARAGRAPH.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            onExtraCallback = iArr4;
            int[] iArr5 = new int[IAuthTabCallback.values().length];
            try {
                iArr5[IAuthTabCallback.TEXT.ordinal()] = 1;
                int i7 = onTransact + 7;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            IAuthTabCallback = iArr5;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV3View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV3View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit onExtraCallback(TdsListHeaderV3View tdsListHeaderV3View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 75;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {tdsListHeaderV3View, quirksExternalSyntheticBackport0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), objArr, -1306892945, JsParamKeys.onExtraCallbackWithResult(), 1306892947, iOnExtraCallbackWithResult2);
        int i6 = readTypedObject + 19;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsListHeaderV3View tdsListHeaderV3View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 21;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(tdsListHeaderV3View, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsListHeaderV3View, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = readTypedObject + 85;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = (~i) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i5)) | i9;
        int i11 = (~(i7 | (~i5) | i)) | (~(i8 | i5)) | (~(i3 | i5 | i));
        int i12 = (~(i | i3)) | i5 | i9;
        int i13 = i3 + i5 + i6 + (5090439 * i4) + ((-1076018391) * i2);
        int i14 = i13 * i13;
        int i15 = ((1425068070 * i3) - 1475346432) + (1088368604 * i5) + (i10 * (-168349733)) + ((-168349733) * i11) + (168349733 * i12) + (1256718336 * i6) + (1616379904 * i4) + ((-1222115328) * i2) + (1028194304 * i14);
        int i16 = (i3 * (-1092730454)) + 799718796 + (i5 * (-1092731068)) + (i10 * (-307)) + (i11 * (-307)) + (i12 * 307) + (i6 * (-1092730761)) + (i4 * 1582232257) + (i2 * 741505039) + (i14 * (-1125187584));
        int i17 = i15 + (i16 * i16 * (-410583040));
        if (i17 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 2) {
            TdsListHeaderV3View tdsListHeaderV3View = (TdsListHeaderV3View) objArr[0];
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
            ((Number) objArr[4]).intValue();
            int i18 = 2 % 2;
            int i19 = readTypedObject + 81;
            writeTypedObject = i19 % 128;
            tdsListHeaderV3View.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i19 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue));
            return Unit.INSTANCE;
        }
        if (i17 != 3) {
            return onWarmupCompleted(objArr);
        }
        TdsListHeaderV3View tdsListHeaderV3View2 = (TdsListHeaderV3View) objArr[0];
        int i20 = 2 % 2;
        int i21 = readTypedObject + 21;
        writeTypedObject = i21 % 128;
        int i22 = i21 % 2;
        boolean zBooleanValue = ((Boolean) tdsListHeaderV3View2.IAuthTabCallback_Parcel.onExtraCallbackWithResult()).booleanValue();
        int i23 = writeTypedObject + 33;
        readTypedObject = i23 % 128;
        int i24 = i23 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Unit unitIAuthTabCallback_Parcel;
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
            int i3 = 6 / 0;
        } else {
            unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        }
        int i4 = writeTypedObject + 99;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallback = extraCallback();
        int i4 = writeTypedObject + 71;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View.OnClickListener onClickListener, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), new Object[]{onClickListener, tdsListHeaderV3View}, -53938017, iOnExtraCallbackWithResult3, 53938017, iOnExtraCallbackWithResult2);
        int i4 = writeTypedObject + 101;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsListHeaderV3View tdsListHeaderV3View, getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp2, hasProvider hasprovider, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 97;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tdsListHeaderV3View, getminwebsocketmessagetocompressokhttp, getminwebsocketmessagetocompressokhttp2, hasprovider, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        int i6 = writeTypedObject + 107;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV3View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException {
        onNavigationEvent onnavigationevent;
        Function0 function0;
        int i2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Object obj = null;
        this.access100 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(wa.IAuthTabCallback.Companion.onNavigationEvent(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        onNavigationEvent onnavigationevent2 = onNavigationEvent.PARAGRAPH;
        this.getInterfaceDescriptor = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onnavigationevent2, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access000 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        Boolean bool = Boolean.FALSE;
        this.IAuthTabCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setByteOrder.onNavigationEvent(setByteOrder.Companion.onTransact()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.extraCallbackWithResult = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.6f);
        this.IAuthTabCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStubProxy = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asInterface = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        if (attributeSet != null) {
            int iOrdinal = onnavigationevent2.ordinal();
            int iOrdinal2 = onExtraCallback.TEXT.ordinal();
            int[] iArr = R.styleable.TdsListHeaderV3View;
            Intrinsics.checkNotNullExpressionValue(iArr, "");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i3 = iOrdinal;
            String string = null;
            String string2 = null;
            String string3 = null;
            int i4 = iOrdinal2;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.TdsListHeaderV3View_listHeaderTitleType) {
                    i3 = typedArrayObtainStyledAttributes.getInt(index, i3);
                    int i6 = readTypedObject + 43;
                    writeTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    if (index == R.styleable.TdsListHeaderV3View_title) {
                        int i8 = writeTypedObject + 121;
                        readTypedObject = i8 % 128;
                        int i9 = i8 % 2;
                        string = typedArrayObtainStyledAttributes.getString(index);
                    } else if (index == R.styleable.TdsListHeaderV3View_description) {
                        int i10 = readTypedObject + 25;
                        writeTypedObject = i10 % 128;
                        if (i10 % 2 != 0) {
                            typedArrayObtainStyledAttributes.getString(index);
                            obj.hashCode();
                            throw null;
                        }
                        string2 = typedArrayObtainStyledAttributes.getString(index);
                    } else if (index == R.styleable.TdsListHeaderV3View_listHeaderRightType) {
                        int i11 = typedArrayObtainStyledAttributes.getInt(index, i4);
                        int i12 = 2 % 2;
                        i4 = i11;
                    } else if (index == R.styleable.TdsListHeaderV3View_rightText) {
                        string3 = typedArrayObtainStyledAttributes.getString(index);
                    }
                }
                int i13 = 2 % 2;
            }
            if (string != null) {
                int i14 = readTypedObject + 13;
                writeTypedObject = i14 % 128;
                if (i14 % 2 != 0) {
                    onnavigationevent = (onNavigationEvent) onNavigationEvent.getEntries().get(i3);
                    function0 = null;
                    i2 = 5;
                } else {
                    onnavigationevent = (onNavigationEvent) onNavigationEvent.getEntries().get(i3);
                    function0 = null;
                    i2 = 4;
                }
                setTitleType$default(this, onnavigationevent, string, function0, i2, (Object) null);
                int i15 = 2 % 2;
            }
            setRightType((onExtraCallback) onExtraCallback.getEntries().get(i4));
            if (string3 != null) {
                setRightText(string3);
            }
            if (string2 != null) {
                setDescription(string2);
            }
            typedArrayObtainStyledAttributes.recycle();
            int i16 = readTypedObject + 91;
            writeTypedObject = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsListHeaderV3View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = writeTypedObject + 31;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = writeTypedObject + 85;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final getSupportedHighSpeedResolutionsFor<wa.IAuthTabCallback> asBinder() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getSupportedHighSpeedResolutionsFor<wa.IAuthTabCallback> getsupportedhighspeedresolutionsfor = this.access100;
        int i4 = i3 + 109;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return getsupportedhighspeedresolutionsfor;
    }

    public final void setSize(@NotNull getSupportedHighSpeedResolutionsFor<wa.IAuthTabCallback> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
        this.access100 = getsupportedhighspeedresolutionsfor;
        int i4 = writeTypedObject + 3;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDescriptionPosition(@NotNull getSupportedHighSpeedResolutionsFor<wa.onNavigationEvent> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
            this.onNavigationEvent = getsupportedhighspeedresolutionsfor;
        } else {
            Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
            this.onNavigationEvent = getsupportedhighspeedresolutionsfor;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final onExtraCallbackWithResult LARGE = new onExtraCallbackWithResult("LARGE", 0);
        public static final onExtraCallbackWithResult MEDIUM = new onExtraCallbackWithResult("MEDIUM", 1);
        public static final onExtraCallbackWithResult XSMALL = new onExtraCallbackWithResult("XSMALL", 2);
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {LARGE, MEDIUM, XSMALL};
            int i5 = i2 + 103;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 31 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onExtraCallback + 9;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onExtraCallback + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 94 / 0;
            }
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallback + 125;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted BOTTOM = new onWarmupCompleted("BOTTOM", 0);
        public static final onWarmupCompleted TOP = new onWarmupCompleted("TOP", 1);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                onWarmupCompleted onwarmupcompleted = BOTTOM;
                onWarmupCompleted onwarmupcompleted2 = TOP;
                onwarmupcompletedArr = new onWarmupCompleted[5];
                onwarmupcompletedArr[1] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{BOTTOM, TOP};
            }
            int i4 = i3 + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onExtraCallback + 29;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        public static final onNavigationEvent PARAGRAPH = new onNavigationEvent("PARAGRAPH", 0);
        public static final onNavigationEvent TEXT_BUTTON = new onNavigationEvent("TEXT_BUTTON", 1);
        public static final onNavigationEvent SELECTOR = new onNavigationEvent("SELECTOR", 2);

        public static final /* synthetic */ class onExtraCallback {
            public static final /* synthetic */ int[] onExtraCallback;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int[] iArr = new int[onNavigationEvent.values().length];
                try {
                    iArr[onNavigationEvent.PARAGRAPH.ordinal()] = 1;
                    int i = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onNavigationEvent.TEXT_BUTTON.ordinal()] = 2;
                    int i2 = onNavigationEvent + 115;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onNavigationEvent.SELECTOR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                onExtraCallback = iArr;
                int i4 = onWarmupCompleted + 9;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public static /* synthetic */ Unit $r8$lambda$3HsWHCc0c6Jd7H9CJvL26Wfh7HQ(getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit titleComposable$lambda$0$0 = toTitleComposable$lambda$0$0(getminwebsocketmessagetocompressokhttp, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = IAuthTabCallback + 33;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return titleComposable$lambda$0$0;
        }

        /* renamed from: $r8$lambda$FXVTfv-i-eLXHn9OelbZSu5mtbU, reason: not valid java name */
        public static /* synthetic */ Unit m83$r8$lambda$FXVTfvieLXHn9OelbZSu5mtbU(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                toTitleComposable$lambda$0$0$0$0(useandconfigureprogramwithtexture);
                obj.hashCode();
                throw null;
            }
            Unit titleComposable$lambda$0$0$0$0 = toTitleComposable$lambda$0$0$0$0(useandconfigureprogramwithtexture);
            int i3 = onWarmupCompleted + 3;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return titleComposable$lambda$0$0$0$0;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit $r8$lambda$qUGfxwhJvYkmRbZ0tEVoG_RlAJg(getFollowRedirectsokhttp getfollowredirectsokhttp, wa.IAuthTabCallback iAuthTabCallback, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit titleComposable$lambda$1$0 = toTitleComposable$lambda$1$0(getfollowredirectsokhttp, iAuthTabCallback, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = IAuthTabCallback + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return titleComposable$lambda$1$0;
        }

        private static final /* synthetic */ onNavigationEvent[] $values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                onNavigationEvent onnavigationevent = PARAGRAPH;
                onNavigationEvent onnavigationevent2 = TEXT_BUTTON;
                onNavigationEvent onnavigationevent3 = SELECTOR;
                onnavigationeventArr = new onNavigationEvent[3];
                onnavigationeventArr[0] = onnavigationevent;
                onnavigationeventArr[0] = onnavigationevent2;
                onnavigationeventArr[5] = onnavigationevent3;
            } else {
                onnavigationeventArr = new onNavigationEvent[]{PARAGRAPH, TEXT_BUTTON, SELECTOR};
            }
            int i4 = i3 + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 55;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 == 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallback + 65;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final getBacktraceNote<areAllItemsEnabled, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> toTitleComposable(@Nullable eventListener eventlistener, @Nullable final wa.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
            int i;
            final getFollowRedirectsokhttp getfollowredirectsokhttp;
            getDnsokhttp getdnsokhttp;
            final getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 65;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0 ? (i = onExtraCallback.onExtraCallback[ordinal()]) == 1 : (i = onExtraCallback.onExtraCallback[ordinal()]) == 0) {
                if (eventlistener instanceof getMinWebSocketMessageToCompressokhttp) {
                    int i4 = onWarmupCompleted + 21;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    getminwebsocketmessagetocompressokhttp = (getMinWebSocketMessageToCompressokhttp) eventlistener;
                } else {
                    getminwebsocketmessagetocompressokhttp = null;
                }
                if (getminwebsocketmessagetocompressokhttp != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(-1007189426, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View$TitleType$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i6 = 2 % 2;
                            int i7 = onExtraCallback + 87;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unit$r8$lambda$3HsWHCc0c6Jd7H9CJvL26Wfh7HQ = TdsListHeaderV3View.onNavigationEvent.$r8$lambda$3HsWHCc0c6Jd7H9CJvL26Wfh7HQ(getminwebsocketmessagetocompressokhttp, (areAllItemsEnabled) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i9 = onExtraCallback + 125;
                            onWarmupCompleted = i9 % 128;
                            if (i9 % 2 != 0) {
                                return unit$r8$lambda$3HsWHCc0c6Jd7H9CJvL26Wfh7HQ;
                            }
                            throw null;
                        }
                    });
                }
                int i6 = onWarmupCompleted + 103;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return null;
            }
            if (i == 2) {
                if (eventlistener instanceof getFollowRedirectsokhttp) {
                    int i8 = IAuthTabCallback + 7;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    getfollowredirectsokhttp = (getFollowRedirectsokhttp) eventlistener;
                } else {
                    getfollowredirectsokhttp = null;
                }
                if (getfollowredirectsokhttp != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(-95202381, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View$TitleType$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i9 = 2 % 2;
                            int i10 = onExtraCallbackWithResult + 11;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unit$r8$lambda$qUGfxwhJvYkmRbZ0tEVoG_RlAJg = TdsListHeaderV3View.onNavigationEvent.$r8$lambda$qUGfxwhJvYkmRbZ0tEVoG_RlAJg(getfollowredirectsokhttp, iAuthTabCallback, (areAllItemsEnabled) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i12 = onNavigationEvent + 47;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            return unit$r8$lambda$qUGfxwhJvYkmRbZ0tEVoG_RlAJg;
                        }
                    });
                }
                return null;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (eventlistener instanceof getDnsokhttp) {
                int i9 = onWarmupCompleted + 59;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                getdnsokhttp = (getDnsokhttp) eventlistener;
            } else {
                getdnsokhttp = null;
            }
            if (getdnsokhttp != null) {
                return getdnsokhttp.onNavigationEvent();
            }
            return null;
        }

        private static final Unit toTitleComposable$lambda$0$0$0$0(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
                unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture);
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture);
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        private static final Unit toTitleComposable$lambda$0$0(getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            boolean z;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(areallitemsenabled, "");
            if ((i & 17) != 16) {
                int i3 = onWarmupCompleted + 11;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                int i5 = onWarmupCompleted + 65;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1007189426, i, -1, "im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View.TitleType.toTitleComposable.<anonymous>.<anonymous> (TdsListHeaderV3View.kt:90)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View$TitleType$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = IAuthTabCallback + 93;
                            onNavigationEvent = i8 % 128;
                            Object obj2 = null;
                            useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                            if (i8 % 2 != 0) {
                                TdsListHeaderV3View.onNavigationEvent.m83$r8$lambda$FXVTfvieLXHn9OelbZSu5mtbU(useandconfigureprogramwithtexture);
                                obj2.hashCode();
                                throw null;
                            }
                            Unit unitM83$r8$lambda$FXVTfvieLXHn9OelbZSu5mtbU = TdsListHeaderV3View.onNavigationEvent.m83$r8$lambda$FXVTfvieLXHn9OelbZSu5mtbU(useandconfigureprogramwithtexture);
                            int i9 = IAuthTabCallback + 45;
                            onNavigationEvent = i9 % 128;
                            if (i9 % 2 == 0) {
                                return unitM83$r8$lambda$FXVTfvieLXHn9OelbZSu5mtbU;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                getminwebsocketmessagetocompressokhttp.IAuthTabCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = IAuthTabCallback + 79;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[PHI: r11
          0x0064: PHI (r11v7 o.accessgetTlsVersionsAsStringp) = (r11v6 o.accessgetTlsVersionsAsStringp), (r11v10 o.accessgetTlsVersionsAsStringp) binds: [B:22:0x0062, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toTitleComposable$lambda$1$0(getFollowRedirectsokhttp getfollowredirectsokhttp, wa.IAuthTabCallback iAuthTabCallback, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            float fIAuthTabCallback;
            accessgetTlsVersionsAsStringp accessgettlsversionsasstringpAccess100;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(areallitemsenabled, "");
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
                int i3 = onWarmupCompleted + 29;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = IAuthTabCallback + 69;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-95202381, i, -1, "im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View.TitleType.toTitleComposable.<anonymous>.<anonymous> (TdsListHeaderV3View.kt:100)");
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-95202381, i, -1, "im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View.TitleType.toTitleComposable.<anonymous>.<anonymous> (TdsListHeaderV3View.kt:100)");
                }
                if (iAuthTabCallback != null) {
                    int i6 = onWarmupCompleted + 49;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        accessgettlsversionsasstringpAccess100 = iAuthTabCallback.access100();
                        int i7 = 92 / 0;
                        if (accessgettlsversionsasstringpAccess100 != null) {
                            int i8 = IAuthTabCallback + 43;
                            onWarmupCompleted = i8 % 128;
                            if (i8 % 2 != 0) {
                                VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(accessgettlsversionsasstringpAccess100.getSize());
                                throw null;
                            }
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(accessgettlsversionsasstringpAccess100.getSize());
                        } else {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                        }
                    } else {
                        accessgettlsversionsasstringpAccess100 = iAuthTabCallback.access100();
                        if (accessgettlsversionsasstringpAccess100 != null) {
                        }
                    }
                    getfollowredirectsokhttp.onWarmupCompleted(null, (getTitleMarginEnd) w2.IAuthTabCallback(1160267148, new Object[]{Float.valueOf(fIAuthTabCallback), false, false, 6, null}, -1160267144, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback()), false, cameraCaptureResultEmptyCameraCaptureResult, 0, 5);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback TEXT = new IAuthTabCallback("TEXT", 0);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public static final /* synthetic */ class onExtraCallback {
            public static final /* synthetic */ int[] IAuthTabCallback;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            static {
                int[] iArr = new int[IAuthTabCallback.values().length];
                try {
                    iArr[IAuthTabCallback.TEXT.ordinal()] = 1;
                    int i = onExtraCallbackWithResult + 95;
                    onExtraCallback = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                IAuthTabCallback = iArr;
                int i3 = onExtraCallbackWithResult + 55;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 6 / 0;
                }
            }
        }

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                iAuthTabCallbackArr = new IAuthTabCallback[0];
                iAuthTabCallbackArr[0] = TEXT;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{TEXT};
            }
            int i4 = i3 + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 0 / 0;
            }
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 75 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = IAuthTabCallback + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 != 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            int i4 = 60 / 0;
            return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallbackWithResult + 121;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final getBacktraceNote<w0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> toDescriptionComposable$tds_view_compat_release(@Nullable eventListener eventlistener) throws NoWhenBranchMatchedException {
            getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (onExtraCallback.IAuthTabCallback[ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = IAuthTabCallback + 79;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            Object obj = null;
            if (eventlistener instanceof getMinWebSocketMessageToCompressokhttp) {
                getminwebsocketmessagetocompressokhttp = (getMinWebSocketMessageToCompressokhttp) eventlistener;
                int i7 = i5 + 35;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                getminwebsocketmessagetocompressokhttp = null;
            }
            if (getminwebsocketmessagetocompressokhttp == null) {
                return null;
            }
            getBacktraceNote<w0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnNavigationEvent = getminwebsocketmessagetocompressokhttp.onNavigationEvent();
            int i9 = IAuthTabCallback + 103;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                return getbacktracenoteOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final onExtraCallback TEXT = new onExtraCallback("TEXT", 0);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {TEXT};
            int i5 = i3 + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 75;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(TdsListHeaderV3View tdsListHeaderV3View, getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp2, hasProvider hasprovider, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        oExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback2;
        CameraPresenceProviderExternalSyntheticLambda6<Function0<Unit>> cameraPresenceProviderExternalSyntheticLambda6AsInterface;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i4 = writeTypedObject + 95;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = readTypedObject + 99;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(774803356, i2, -1, "im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View.TdsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListHeaderV3View.kt:187)");
                int i8 = writeTypedObject + 53;
                readTypedObject = i8 % 128;
                int i9 = i8 % 2;
            }
            getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp3 = (getMinWebSocketMessageToCompressokhttp) tdsListHeaderV3View.onTransact.onExtraCallbackWithResult();
            Function0<Unit> function0 = (getminwebsocketmessagetocompressokhttp3 == null || (cameraPresenceProviderExternalSyntheticLambda6AsInterface = getminwebsocketmessagetocompressokhttp3.asInterface()) == null) ? null : (Function0) cameraPresenceProviderExternalSyntheticLambda6AsInterface.onExtraCallbackWithResult();
            boolean zBooleanValue = ((Boolean) tdsListHeaderV3View.IAuthTabCallbackStub.onExtraCallbackWithResult()).booleanValue();
            if (function0 != null) {
                int i10 = writeTypedObject + 19;
                readTypedObject = i10 % 128;
                if (i10 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1012839770);
                    int i11 = 75 / 0;
                    IAuthTabCallback2 = zBooleanValue ? oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback() : null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1012839770);
                    if (zBooleanValue) {
                    }
                }
                rightPreset.onNavigationEvent(hasprovider, (QuirksExternalSyntheticBackport0) getminwebsocketmessagetocompressokhttp2.onExtraCallback().onExtraCallbackWithResult(), ((setByteOrder) getminwebsocketmessagetocompressokhttp.onTransact().onExtraCallbackWithResult()).access100(), null, IAuthTabCallback2, 0L, null, ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) getminwebsocketmessagetocompressokhttp.IAuthTabCallbackStubProxy().onExtraCallbackWithResult()).IAuthTabCallback(), (GraphicDeviceInfo) getminwebsocketmessagetocompressokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult(), null, function0, cameraCaptureResultEmptyCameraCaptureResult, 0, (i2 << 3) & 112, 616);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1013507882);
                getHumanReadableName gethumanreadablename = (getHumanReadableName) getminwebsocketmessagetocompressokhttp.asBinder().onExtraCallbackWithResult();
                if (gethumanreadablename == null) {
                    int i12 = writeTypedObject + 109;
                    readTypedObject = i12 % 128;
                    int i13 = i12 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1556719971);
                    gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1556719041);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i14 = i2;
                rightPreset.IAuthTabCallback(hasprovider, (QuirksExternalSyntheticBackport0) getminwebsocketmessagetocompressokhttp2.onExtraCallback().onExtraCallbackWithResult(), gethumanreadablename, ((setByteOrder) getminwebsocketmessagetocompressokhttp.onTransact().onExtraCallbackWithResult()).access100(), ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) getminwebsocketmessagetocompressokhttp.IAuthTabCallbackStubProxy().onExtraCallbackWithResult()).IAuthTabCallback(), (GraphicDeviceInfo) getminwebsocketmessagetocompressokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 0);
                if (zBooleanValue) {
                    int i15 = writeTypedObject + 37;
                    readTypedObject = i15 % 128;
                    int i16 = i15 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1014105283);
                    rightPreset.onNavigationEvent(null, ((setByteOrder) tdsListHeaderV3View.onWarmupCompleted.onExtraCallbackWithResult()).access100(), cameraCaptureResultEmptyCameraCaptureResult, (i14 << 6) & 896, 1);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1014231174);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final TdsListHeaderV3View tdsListHeaderV3View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy;
        wa.onNavigationEvent onnavigationevent;
        Object objOnExtraCallbackWithResult;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = writeTypedObject + 71;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(555397917, i, -1, "im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View.TdsContent.<anonymous> (TdsListHeaderV3View.kt:175)");
            }
            getBacktraceNote<areAllItemsEnabled, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> titleComposable = ((onNavigationEvent) tdsListHeaderV3View.getInterfaceDescriptor.onExtraCallbackWithResult()).toTitleComposable((eventListener) tdsListHeaderV3View.access000.onExtraCallbackWithResult(), (wa.IAuthTabCallback) tdsListHeaderV3View.access100.onExtraCallbackWithResult());
            if (titleComposable == null) {
                int i5 = readTypedObject + 33;
                writeTypedObject = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                titleComposable = (getBacktraceNote) C0081cookieJar.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), 377973122, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{C0081cookieJar.onNavigationEvent}, OverseasRrnInputTextField.IAuthTabCallback(), -377973122, OverseasRrnInputTextField.IAuthTabCallback());
            }
            wa.IAuthTabCallback iAuthTabCallback = (wa.IAuthTabCallback) tdsListHeaderV3View.access100.onExtraCallbackWithResult();
            IAuthTabCallback iAuthTabCallback2 = (IAuthTabCallback) tdsListHeaderV3View.onExtraCallbackWithResult.onExtraCallbackWithResult();
            getBacktraceNote<w0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> descriptionComposable$tds_view_compat_release = iAuthTabCallback2 != null ? iAuthTabCallback2.toDescriptionComposable$tds_view_compat_release((eventListener) tdsListHeaderV3View.IAuthTabCallback.onExtraCallbackWithResult()) : null;
            wa.IAuthTabCallbackStub iAuthTabCallbackStubOnWarmupCompleted = (wa.IAuthTabCallbackStub) tdsListHeaderV3View.ICustomTabsCallback.onExtraCallbackWithResult();
            if (iAuthTabCallbackStubOnWarmupCompleted == null) {
                iAuthTabCallbackStubOnWarmupCompleted = wa.IAuthTabCallbackStub.Companion.onWarmupCompleted();
            }
            wa.IAuthTabCallbackStub iAuthTabCallbackStub = iAuthTabCallbackStubOnWarmupCompleted;
            wa.onExtraCallback onExtraCallback2 = (wa.onExtraCallback) tdsListHeaderV3View.asInterface.onExtraCallbackWithResult();
            if (onExtraCallback2 == null) {
                int i6 = readTypedObject + 119;
                writeTypedObject = i6 % 128;
                if (i6 % 2 != 0) {
                    onExtraCallback2 = wa.onExtraCallback.Companion.onExtraCallback();
                    int i7 = 52 / 0;
                } else {
                    onExtraCallback2 = wa.onExtraCallback.Companion.onExtraCallback();
                }
            }
            wa.onExtraCallback onextracallback = onExtraCallback2;
            onExtraCallback onextracallback2 = (onExtraCallback) tdsListHeaderV3View.asBinder.onExtraCallbackWithResult();
            if (onextracallback2 != null && IAuthTabCallbackStub.onExtraCallbackWithResult[onextracallback2.ordinal()] == 1) {
                int i8 = writeTypedObject + 31;
                readTypedObject = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1646002041);
                Object objOnExtraCallbackWithResult2 = tdsListHeaderV3View.onTransact.onExtraCallbackWithResult();
                final getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = objOnExtraCallbackWithResult2 instanceof getMinWebSocketMessageToCompressokhttp ? (getMinWebSocketMessageToCompressokhttp) objOnExtraCallbackWithResult2 : null;
                if (getminwebsocketmessagetocompressokhttp == null) {
                    int i10 = writeTypedObject + 5;
                    readTypedObject = i10 % 128;
                    int i11 = i10 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1646002040);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1646002041);
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1161476804);
                    final hasProvider hasprovider = (hasProvider) getminwebsocketmessagetocompressokhttp.IAuthTabCallbackStub().onExtraCallbackWithResult();
                    if (hasprovider == null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-191904300);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-191904299);
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(774803356, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                int i12 = 2 % 2;
                                int i13 = IAuthTabCallback + 77;
                                onNavigationEvent = i13 % 128;
                                if (i13 % 2 != 0) {
                                    return TdsListHeaderV3View.onNavigationEvent(this.f$0, getminwebsocketmessagetocompressokhttp, getminwebsocketmessagetocompressokhttp, hasprovider, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                }
                                Unit unitOnNavigationEvent = TdsListHeaderV3View.onNavigationEvent(this.f$0, getminwebsocketmessagetocompressokhttp, getminwebsocketmessagetocompressokhttp, hasprovider, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i14 = 52 / 0;
                                return unitOnNavigationEvent;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    encoderProfilesProxyVideoProfileProxy = encoderProfilesProxyVideoProfileProxyOnExtraCallback;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    float fOnNavigationEvent = tdsListHeaderV3View.extraCallbackWithResult.onNavigationEvent();
                    onnavigationevent = (wa.onNavigationEvent) tdsListHeaderV3View.onNavigationEvent.onExtraCallbackWithResult();
                    if (onnavigationevent == null) {
                        int i12 = writeTypedObject + 83;
                        readTypedObject = i12 % 128;
                        if (i12 % 2 == 0) {
                            onnavigationevent = wa.onNavigationEvent.Top;
                            int i13 = 51 / 0;
                        } else {
                            onnavigationevent = wa.onNavigationEvent.Top;
                        }
                    }
                    wa.onNavigationEvent onnavigationevent2 = onnavigationevent;
                    objOnExtraCallbackWithResult = tdsListHeaderV3View.IAuthTabCallbackDefault.onExtraCallbackWithResult();
                    if (objOnExtraCallbackWithResult == null) {
                        int i14 = writeTypedObject + 69;
                        readTypedObject = i14 % 128;
                        int i15 = i14 % 2;
                        quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(measureChildConstrained.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) objOnExtraCallbackWithResult, 15, (Object) null));
                    } else {
                        quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0;
                    }
                    w2.IAuthTabCallback(titleComposable, quirksExternalSyntheticBackport0OnExtraCallback, null, iAuthTabCallback, fOnNavigationEvent, onnavigationevent2, descriptionComposable$tds_view_compat_release, iAuthTabCallbackStub, onextracallback, encoderProfilesProxyVideoProfileProxy, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 3076);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i16 = writeTypedObject + 69;
                        readTypedObject = i16 % 128;
                        if (i16 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1648002656);
            }
            encoderProfilesProxyVideoProfileProxy = null;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            float fOnNavigationEvent2 = tdsListHeaderV3View.extraCallbackWithResult.onNavigationEvent();
            onnavigationevent = (wa.onNavigationEvent) tdsListHeaderV3View.onNavigationEvent.onExtraCallbackWithResult();
            if (onnavigationevent == null) {
            }
            wa.onNavigationEvent onnavigationevent22 = onnavigationevent;
            objOnExtraCallbackWithResult = tdsListHeaderV3View.IAuthTabCallbackDefault.onExtraCallbackWithResult();
            if (objOnExtraCallbackWithResult == null) {
            }
            w2.IAuthTabCallback(titleComposable, quirksExternalSyntheticBackport0OnExtraCallback, null, iAuthTabCallback, fOnNavigationEvent2, onnavigationevent22, descriptionComposable$tds_view_compat_release, iAuthTabCallbackStub, onextracallback, encoderProfilesProxyVideoProfileProxy, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 3076);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[PHI: r2
      0x003d: PHI (r2v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r2
      0x0032: PHI (r2v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // im.toss.tds.view.compat.component.TdsComposeView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        boolean z;
        RemoveCompoundPaddings removeCompoundPaddingsIAuthTabCallback;
        int i3;
        int i4 = 2 % 2;
        int i5 = readTypedObject + 35;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(848781277);
            if ((i & 54) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(848781277);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                int i6 = readTypedObject + 27;
                writeTypedObject = i6 % 128;
                i3 = i6 % 2 != 0 ? 117 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i7 = readTypedObject + 117;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = readTypedObject + 67;
                writeTypedObject = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(848781277, i2, -1, "im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View.TdsContent (TdsListHeaderV3View.kt:166)");
            }
            accessisMonitoringp<RemoveCompoundPaddings> accessismonitoringpOnExtraCallbackWithResult = RemoveCompoundPaddingsKt.onExtraCallbackWithResult();
            if (((Boolean) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1549354851, JsParamKeys.onExtraCallbackWithResult(), -1549354848, JsParamKeys.onExtraCallbackWithResult())).booleanValue() && access100()) {
                int i11 = writeTypedObject + 71;
                readTypedObject = i11 % 128;
                int i12 = i11 % 2;
                removeCompoundPaddingsIAuthTabCallback = RemoveCompoundPaddings.Companion.onNavigationEvent();
            } else {
                if (((Boolean) onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1549354851, JsParamKeys.onExtraCallbackWithResult(), -1549354848, JsParamKeys.onExtraCallbackWithResult())).booleanValue()) {
                    removeCompoundPaddingsIAuthTabCallback = RemoveCompoundPaddings.Companion.onExtraCallbackWithResult();
                } else if (access100()) {
                    int i13 = writeTypedObject + 55;
                    readTypedObject = i13 % 128;
                    int i14 = i13 % 2;
                    removeCompoundPaddingsIAuthTabCallback = RemoveCompoundPaddings.Companion.onExtraCallback();
                } else {
                    removeCompoundPaddingsIAuthTabCallback = RemoveCompoundPaddings.Companion.IAuthTabCallback();
                }
            }
            setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnExtraCallbackWithResult.onExtraCallback(removeCompoundPaddingsIAuthTabCallback), ForwardingCameraControl.onExtraCallback(555397917, true, new Function2() { // from class: im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallback + 69;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 == 0) {
                        TdsListHeaderV3View.onExtraCallback(this.f$0, quirksExternalSyntheticBackport0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = TdsListHeaderV3View.onExtraCallback(this.f$0, quirksExternalSyntheticBackport0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i17 = onNavigationEvent + 87;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = readTypedObject + 33;
                writeTypedObject = i15 % 128;
                if (i15 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = onNavigationEvent + 33;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unitOnExtraCallback = TdsListHeaderV3View.onExtraCallback(this.f$0, quirksExternalSyntheticBackport0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i19 = onNavigationEvent + 95;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setSize(@NotNull onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        wa.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        getSupportedHighSpeedResolutionsFor<wa.IAuthTabCallback> getsupportedhighspeedresolutionsfor = this.access100;
        int i4 = IAuthTabCallbackStub.onWarmupCompleted[onextracallbackwithresult.ordinal()];
        if (i4 != 1) {
            int i5 = readTypedObject + 1;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0 ? i4 == 2 : i4 == 5) {
                iAuthTabCallbackOnWarmupCompleted = wa.IAuthTabCallback.Companion.onExtraCallback();
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iAuthTabCallbackOnWarmupCompleted = wa.IAuthTabCallback.Companion.onNavigationEvent();
            }
        } else {
            iAuthTabCallbackOnWarmupCompleted = wa.IAuthTabCallback.Companion.onWarmupCompleted();
            int i6 = writeTypedObject + 107;
            readTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 5;
            }
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(iAuthTabCallbackOnWarmupCompleted);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setDescriptionPosition(@NotNull onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        wa.onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        getSupportedHighSpeedResolutionsFor<wa.onNavigationEvent> getsupportedhighspeedresolutionsfor = this.onNavigationEvent;
        int i4 = IAuthTabCallbackStub.onNavigationEvent[onwarmupcompleted.ordinal()];
        if (i4 != 1) {
            int i5 = readTypedObject;
            int i6 = i5 + 73;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = i5 + 125;
            writeTypedObject = i8 % 128;
            int i9 = i8 % 2;
            onnavigationevent = wa.onNavigationEvent.Top;
            int i10 = writeTypedObject + 73;
            readTypedObject = i10 % 128;
            int i11 = i10 % 2;
        } else {
            onnavigationevent = wa.onNavigationEvent.Bottom;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(onnavigationevent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setRightType(@Nullable onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int i;
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 7;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder.IAuthTabCallback(onextracallback);
        getSupportedHighSpeedResolutionsFor<eventListener> getsupportedhighspeedresolutionsfor = this.onTransact;
        if (onextracallback == null) {
            int i5 = writeTypedObject + 101;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            i = -1;
        } else {
            i = IAuthTabCallbackStub.onExtraCallbackWithResult[onextracallback.ordinal()];
            int i7 = readTypedObject + 35;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
        }
        if (i == -1) {
            getminwebsocketmessagetocompressokhttp = null;
        } else {
            if (i != 1) {
                throw new NoWhenBranchMatchedException();
            }
            getminwebsocketmessagetocompressokhttp = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getminwebsocketmessagetocompressokhttp);
    }

    public final void setRightText(@NotNull String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (IAuthTabCallback() == null) {
            setRightType(onExtraCallback.TEXT);
        }
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback = IAuthTabCallback();
        if (getminwebsocketmessagetocompressokhttpIAuthTabCallback != null) {
            int i3 = readTypedObject + 35;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            getminwebsocketmessagetocompressokhttpIAuthTabCallback.onNavigationEvent(str);
        }
    }

    public final void setRightText(@NotNull hasProvider hasprovider) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            IAuthTabCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(hasprovider, "");
        if (IAuthTabCallback() == null) {
            setRightType(onExtraCallback.TEXT);
        }
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback = IAuthTabCallback();
        if (getminwebsocketmessagetocompressokhttpIAuthTabCallback != null) {
            int i3 = writeTypedObject + 101;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            getminwebsocketmessagetocompressokhttpIAuthTabCallback.onNavigationEvent(hasprovider);
            if (i4 == 0) {
                throw null;
            }
        }
    }

    public final void setArrowColor(int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 81;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted.IAuthTabCallback(setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(i)));
        int i5 = readTypedObject + 19;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setArrowVisible(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 121;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = readTypedObject + 121;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTitleType$default(TdsListHeaderV3View tdsListHeaderV3View, onNavigationEvent onnavigationevent, String str, Function0 function0, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 61;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 109;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
                    Unit unit = (Unit) TdsListHeaderV3View.onExtraCallbackWithResult(iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), new Object[0], 1953567845, iOnExtraCallbackWithResult3, -1953567844, iOnExtraCallbackWithResult2);
                    int i8 = onNavigationEvent + 5;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return unit;
                }
            };
        }
        tdsListHeaderV3View.setTitleType(onnavigationevent, str, (Function0<Unit>) function0);
        int i5 = readTypedObject + 119;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setTitleType(@NotNull onNavigationEvent onnavigationevent, @NotNull String str, @NotNull Function0<Unit> function0) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        setTitleType(onnavigationevent, new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), function0);
        int i2 = writeTypedObject + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit extraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTitleType$default(TdsListHeaderV3View tdsListHeaderV3View, onNavigationEvent onnavigationevent, hasProvider hasprovider, Function0 function0, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 121;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 45;
                    onNavigationEvent = i6 % 128;
                    Object obj2 = null;
                    if (i6 % 2 != 0) {
                        TdsListHeaderV3View.onExtraCallbackWithResult();
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = TdsListHeaderV3View.onExtraCallbackWithResult();
                    int i7 = onNavigationEvent + 87;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    obj2.hashCode();
                    throw null;
                }
            };
            int i5 = writeTypedObject + 51;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
        tdsListHeaderV3View.setTitleType(onnavigationevent, hasprovider, (Function0<Unit>) function0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setTitleType(@NotNull onNavigationEvent onnavigationevent, @NotNull hasProvider hasprovider, @NotNull Function0<Unit> function0) throws NoWhenBranchMatchedException {
        getFollowSslRedirectsokhttp getminwebsocketmessagetocompressokhttp;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.getInterfaceDescriptor.IAuthTabCallback(onnavigationevent);
        getSupportedHighSpeedResolutionsFor<eventListener> getsupportedhighspeedresolutionsfor = this.access000;
        int i2 = IAuthTabCallbackStub.onExtraCallback[onnavigationevent.ordinal()];
        if (i2 == 1) {
            getFollowRedirectsokhttp getfollowredirectsokhttp = new getFollowRedirectsokhttp(hasprovider, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 8190, (DefaultConstructorMarker) null);
            getfollowredirectsokhttp.onNavigationEvent(function0);
            getminwebsocketmessagetocompressokhttp = getfollowredirectsokhttp;
        } else if (i2 != 2) {
            int i3 = readTypedObject + 99;
            writeTypedObject = i3 % 128;
            if (i3 % 2 == 0 ? i2 != 3 : i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getminwebsocketmessagetocompressokhttp = new getMinWebSocketMessageToCompressokhttp(hasprovider, (getHumanReadableName) null, (GraphicDeviceInfo) null, 0L, 0L, 0L, (Integer) null, 0, (VirtualCameraControlExternalSyntheticLambda1) null, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (QuirksExternalSyntheticBackport0) null, 65534, (DefaultConstructorMarker) null);
        } else {
            getDnsokhttp getdnsokhttp = new getDnsokhttp(hasprovider, (getHumanReadableName) null, 0L, 0L, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult()}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue(), (GraphicDeviceInfo) null, 46, (DefaultConstructorMarker) null);
            getdnsokhttp.onNavigationEvent(function0);
            int i4 = readTypedObject + 57;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            getminwebsocketmessagetocompressokhttp = getdnsokhttp;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getminwebsocketmessagetocompressokhttp);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View.OnClickListener onClickListener = (View.OnClickListener) objArr[0];
        addTags addtags = (TdsListHeaderV3View) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onClickListener.onClick(addtags);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 87;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            function0.hashCode();
            throw null;
        }
        this.IAuthTabCallbackDefault.IAuthTabCallback(onClickListener != null ? new Function0() { // from class: im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallbackWithResult = TdsListHeaderV3View.onExtraCallbackWithResult(onClickListener, this);
                int i6 = onNavigationEvent + 67;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 74 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        } : null);
        int i3 = readTypedObject + 81;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setTitleText(@Nullable String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (access000() != null) {
            eventListener eventlistener = (eventListener) this.access000.onExtraCallbackWithResult();
            if (eventlistener != null) {
                callTimeout.onNavigationEvent(eventlistener, str);
                return;
            }
            return;
        }
        int i2 = writeTypedObject + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationevent = onNavigationEvent.PARAGRAPH;
        if (str == null) {
            int i4 = readTypedObject + 99;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        setTitleType$default(this, onnavigationevent, str, (Function0) null, 4, (Object) null);
    }

    public final void setTitleText(@Nullable hasProvider hasprovider) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (access000() == null) {
            onNavigationEvent onnavigationevent = onNavigationEvent.PARAGRAPH;
            if (hasprovider == null) {
                hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
            }
            setTitleType$default(this, onnavigationevent, hasprovider, (Function0) null, 4, (Object) null);
            return;
        }
        eventListener eventlistener = (eventListener) this.access000.onExtraCallbackWithResult();
        if (eventlistener != null) {
            callTimeout.onExtraCallback(eventlistener, hasprovider);
        }
        int i4 = readTypedObject + 51;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public final void setTitleFont(@NotNull response responseVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        setTitleFontWeight(new GraphicDeviceInfo(responseVar.getWeight()));
        int i2 = writeTypedObject + 53;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTitleFontWeight(@NotNull GraphicDeviceInfo graphicDeviceInfo) {
        getSupportedHighSpeedResolutionsFor<GraphicDeviceInfo> getsupportedhighspeedresolutionsforOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = writeTypedObject + 33;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
            access000();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpAccess000 = access000();
        if (getminwebsocketmessagetocompressokhttpAccess000 == null || (getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = getminwebsocketmessagetocompressokhttpAccess000.onExtraCallbackWithResult()) == null) {
            return;
        }
        int i3 = readTypedObject + 119;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getsupportedhighspeedresolutionsforOnExtraCallbackWithResult.IAuthTabCallback(graphicDeviceInfo);
    }

    public final void setTitleTextColor(int i) {
        int i2 = 2 % 2;
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpAccess000 = access000();
        Object obj = null;
        if (getminwebsocketmessagetocompressokhttpAccess000 != null) {
            int i3 = readTypedObject + 67;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            getminwebsocketmessagetocompressokhttpAccess000.onNavigationEvent(Integer.valueOf(i));
            if (i4 != 0) {
                throw null;
            }
        }
        int i5 = writeTypedObject + 45;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setDescriptionType(@Nullable IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i;
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp;
        int i2 = 2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(iAuthTabCallback);
        getSupportedHighSpeedResolutionsFor<eventListener> getsupportedhighspeedresolutionsfor = this.IAuthTabCallback;
        if (iAuthTabCallback == null) {
            int i3 = readTypedObject + 111;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
        } else {
            i = IAuthTabCallbackStub.IAuthTabCallback[iAuthTabCallback.ordinal()];
        }
        if (i == -1) {
            getminwebsocketmessagetocompressokhttp = null;
        } else {
            if (i != 1) {
                throw new NoWhenBranchMatchedException();
            }
            getminwebsocketmessagetocompressokhttp = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
            int i5 = writeTypedObject + 125;
            readTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 3;
            }
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getminwebsocketmessagetocompressokhttp);
    }

    public final void setDescription(@NotNull String str) throws NoWhenBranchMatchedException {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (StringsKt.isBlank(str)) {
            iAuthTabCallback = null;
        } else {
            int i2 = writeTypedObject + 45;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallback = IAuthTabCallback.TEXT;
        }
        setDescriptionType(iAuthTabCallback);
        eventListener eventlistener = (eventListener) this.IAuthTabCallback.onExtraCallbackWithResult();
        if (eventlistener != null) {
            int i4 = readTypedObject + 99;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            callTimeout.onNavigationEvent(eventlistener, str);
            if (i5 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final void setTitleWidthRatioValue(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallbackWithResult.onNavigationEvent(f);
        int i4 = writeTypedObject + 53;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setVerticalPadding(@NotNull wa.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            this.ICustomTabsCallback.IAuthTabCallback(iAuthTabCallbackStub);
            int i3 = 80 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            this.ICustomTabsCallback.IAuthTabCallback(iAuthTabCallbackStub);
        }
        int i4 = writeTypedObject + 73;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setHorizontalPadding(@NotNull wa.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.asInterface.IAuthTabCallback(onextracallback);
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.asInterface.IAuthTabCallback(onextracallback);
        int i3 = writeTypedObject + 71;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final getMinWebSocketMessageToCompressokhttp access000() {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
        if (!(objOnExtraCallbackWithResult instanceof getMinWebSocketMessageToCompressokhttp)) {
            return null;
        }
        int i4 = writeTypedObject + 65;
        readTypedObject = i4 % 128;
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = (getMinWebSocketMessageToCompressokhttp) objOnExtraCallbackWithResult;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return getminwebsocketmessagetocompressokhttp;
    }

    public final getFollowRedirectsokhttp IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
        if (!(objOnExtraCallbackWithResult instanceof getFollowRedirectsokhttp)) {
            return null;
        }
        getFollowRedirectsokhttp getfollowredirectsokhttp = (getFollowRedirectsokhttp) objOnExtraCallbackWithResult;
        int i4 = writeTypedObject + 85;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return getfollowredirectsokhttp;
    }

    public final getDnsokhttp onTransact() {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
        Object obj = null;
        if (!(objOnExtraCallbackWithResult instanceof getDnsokhttp)) {
            return null;
        }
        int i2 = writeTypedObject;
        int i3 = i2 + 117;
        readTypedObject = i3 % 128;
        getDnsokhttp getdnsokhttp = (getDnsokhttp) objOnExtraCallbackWithResult;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 41;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return getdnsokhttp;
    }

    public final getMinWebSocketMessageToCompressokhttp onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
        if (!(objOnExtraCallbackWithResult instanceof getMinWebSocketMessageToCompressokhttp)) {
            return null;
        }
        int i4 = writeTypedObject + 77;
        int i5 = i4 % 128;
        readTypedObject = i5;
        int i6 = i4 % 2;
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = (getMinWebSocketMessageToCompressokhttp) objOnExtraCallbackWithResult;
        int i7 = i5 + 71;
        writeTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return getminwebsocketmessagetocompressokhttp;
    }

    public final getMinWebSocketMessageToCompressokhttp IAuthTabCallback() {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = this.onTransact.onExtraCallbackWithResult();
        if (!(objOnExtraCallbackWithResult instanceof getMinWebSocketMessageToCompressokhttp)) {
            int i2 = writeTypedObject + 105;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = readTypedObject + 85;
        writeTypedObject = i4 % 128;
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = (getMinWebSocketMessageToCompressokhttp) objOnExtraCallbackWithResult;
        if (i4 % 2 == 0) {
            return getminwebsocketmessagetocompressokhttp;
        }
        throw null;
    }

    private final boolean access100() {
        int i = 2 % 2;
        int i2 = readTypedObject + 67;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult()).booleanValue();
        int i4 = writeTypedObject + 65;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), new Object[0], 1953567845, iOnExtraCallbackWithResult3, -1953567844, iOnExtraCallbackWithResult2);
    }

    private static final Unit onNavigationEvent(TdsListHeaderV3View tdsListHeaderV3View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {tdsListHeaderV3View, quirksExternalSyntheticBackport0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), objArr, -1306892945, JsParamKeys.onExtraCallbackWithResult(), 1306892947, iOnExtraCallbackWithResult2);
    }

    private final boolean getInterfaceDescriptor() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, 1549354851, iOnExtraCallbackWithResult3, -1549354848, iOnExtraCallbackWithResult2)).booleanValue();
    }

    private static final Unit onNavigationEvent(View.OnClickListener onClickListener, TdsListHeaderV3View tdsListHeaderV3View) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, JsParamKeys.onExtraCallbackWithResult(), new Object[]{onClickListener, tdsListHeaderV3View}, -53938017, iOnExtraCallbackWithResult3, 53938017, iOnExtraCallbackWithResult2);
    }
}
