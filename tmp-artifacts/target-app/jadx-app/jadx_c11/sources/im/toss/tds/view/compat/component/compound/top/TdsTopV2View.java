package im.toss.tds.view.compat.component.compound.top;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.google.android.gms.internal.ads.zzaq;
import com.google.common.collect.Synchronized;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddings;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddingsKt;
import im.toss.tds.compose.component.compound.top.v2.RightPreset;
import im.toss.tds.view.compat.R;
import im.toss.tds.view.compat.component.TdsComposeView;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AUTextView;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.AvoidCaptureProcessProgressAvailabilityCheckQuirk;
import o.ByteOrderedDataOutputStream;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.ExifSpeedConverter;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.MaxAdPlacerExternalSyntheticLambda2;
import o.OkHttpClientBuilder;
import o.PreviewExternalSyntheticLambda3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.access15300;
import o.accessgetCameraFactoryp;
import o.addCameraErrorListener;
import o.addInterceptor;
import o.bindChildren;
import o.callTimeout;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.delete;
import o.deprecated_dispatcher;
import o.deprecated_eventListenerFactory;
import o.eventListener;
import o.eventListenerFactory;
import o.getAuthenticatorokhttp;
import o.getBacktraceNote;
import o.getChildPreviewOutConfig;
import o.getCookieJarokhttp;
import o.getDispatcherokhttp;
import o.getDnsokhttp;
import o.getExtensionsBeforeInitialized;
import o.getFollowRedirectsokhttp;
import o.getHighestSurfacePriority;
import o.getHumanReadableName;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getParentMetadataCallback;
import o.getPrivacyDestinationUri;
import o.getSupportedHighSpeedResolutionsFor;
import o.getSurfaceSize;
import o.handleNativeAdClick;
import o.hasMoreElements;
import o.hasProvider;
import o.isRepeatingEnabled;
import o.mergeChildrenConfigs;
import o.networkInterceptors;
import o.newWebSocket;
import o.notifySessionStop;
import o.oExternalSyntheticLambda0;
import o.oExternalSyntheticLambda1;
import o.r8lambdak6CWcefLe9tXuLSlGJo2BURuBM;
import o.r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg;
import o.retryOnConnectionFailure;
import o.setAdvertiser;
import o.setByteOrder;
import o.setCallToAction;
import o.setMainImageAspectRatio;
import o.setPostviewFormatSelector;
import o.setPrivacyIconUri;
import o.unregisterOutputSurface;
import o.use;
import o.useAndConfigureProgramWithTexture;
import o.varyMatches;
import o.x509TrustManager;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1ExternalSyntheticLambda4;
import o.y1ExternalSyntheticLambda6;
import o.y1a;
import o.y1b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsTopV2View extends TdsComposeView {
    private static int onActivityLayout = 1;
    private static int onPostMessage;
    private getSupportedHighSpeedResolutionsFor<eventListener> IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallbackDefault;
    private getSupportedHighSpeedResolutionsFor<eventListener> IAuthTabCallbackStub;
    private getSupportedHighSpeedResolutionsFor<y1ExternalSyntheticLambda0.onExtraCallbackWithResult> IAuthTabCallbackStubProxy;
    private getSupportedHighSpeedResolutionsFor<onExtraCallbackWithResult> IAuthTabCallback_Parcel;
    private getSupportedHighSpeedResolutionsFor<y1ExternalSyntheticLambda0.onNavigationEvent> ICustomTabsCallback;
    private getSupportedHighSpeedResolutionsFor<eventListener> access000;
    private getSupportedHighSpeedResolutionsFor<eventListener> access100;
    private getSupportedHighSpeedResolutionsFor<IAuthTabCallback> asBinder;
    private getSupportedHighSpeedResolutionsFor<String> asInterface;
    private getSupportedHighSpeedResolutionsFor<CharSequence> extraCallback;
    private getSupportedHighSpeedResolutionsFor<eventListener> extraCallbackWithResult;
    private getSupportedHighSpeedResolutionsFor<y1ExternalSyntheticLambda0.onExtraCallbackWithResult> getInterfaceDescriptor;
    private getSupportedHighSpeedResolutionsFor<eventListener> onActivityResized;
    private Function0<Unit> onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> onMessageChannelReady;
    private getSupportedHighSpeedResolutionsFor<onTransact> onMinimized;
    private getSupportedHighSpeedResolutionsFor<onNavigationEvent> onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onTransact;
    private final getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> onWarmupCompleted;
    private getSupportedHighSpeedResolutionsFor<onExtraCallbackWithResult> readTypedObject;
    private getSupportedHighSpeedResolutionsFor<IAuthTabCallbackStub> writeTypedObject;

    public static final /* synthetic */ class asBinder {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        public static final /* synthetic */ int[] IAuthTabCallbackStub;
        private static int asInterface = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onTransact;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onTransact.values().length];
            try {
                iArr[onTransact.ASSET_V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onTransact.ASSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onTransact.BADGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr2[onExtraCallbackWithResult.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[onExtraCallbackWithResult.BADGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[onExtraCallbackWithResult.TEXT_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            IAuthTabCallback = iArr2;
            int[] iArr3 = new int[onWarmupCompleted.values().length];
            try {
                iArr3[onWarmupCompleted.SIZE_13.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[onWarmupCompleted.SIZE_15.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[onWarmupCompleted.SIZE_17.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            onExtraCallback = iArr3;
            int[] iArr4 = new int[IAuthTabCallbackStub.values().length];
            try {
                iArr4[IAuthTabCallbackStub.PARAGRAPH.ordinal()] = 1;
                int i = asInterface + 29;
                IAuthTabCallbackDefault = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[IAuthTabCallbackStub.SELECTOR.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[IAuthTabCallbackStub.ROLLING_NUMBER.ordinal()] = 3;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[IAuthTabCallbackStub.TEXT_BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            onNavigationEvent = iArr4;
            int[] iArr5 = new int[onExtraCallback.values().length];
            try {
                iArr5[onExtraCallback.SIZE_22.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[onExtraCallback.SIZE_28.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            onExtraCallbackWithResult = iArr5;
            int[] iArr6 = new int[IAuthTabCallback.values().length];
            try {
                iArr6[IAuthTabCallback.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[IAuthTabCallback.ASSET_V1_NONE_CROP_BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[IAuthTabCallback.ASSET_V1_CIRCLE_BIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[IAuthTabCallback.ASSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            IAuthTabCallbackStub = iArr6;
            int[] iArr7 = new int[onNavigationEvent.values().length];
            try {
                iArr7[onNavigationEvent.TINY_BUTTON.ordinal()] = 1;
                int i6 = asInterface + 107;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[onNavigationEvent.TWO_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            onTransact = iArr7;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i | i7 | (~i4);
        int i9 = ~i;
        int i10 = (~(i4 | i7)) | (~(i7 | i9));
        int i11 = i6 + i + i5 + ((-92689393) * i3) + (1942122663 * i2);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i6) - 357761024) + ((-674687396) * i) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i5) + ((-1056047104) * i3) + ((-742522880) * i2) + ((-592117760) * i12);
        int i14 = (i6 * 1048061654) + 1366922925 + (i * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i5 * 1048061961) + (i3 * 439444615) + (i2 * (-1279783457)) + (i12 * 173867008);
        int i15 = i13 + (i14 * i14 * (-1898250240));
        return i15 != 1 ? i15 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private static final Unit onNavigationEvent(TdsTopV2View tdsTopV2View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onActivityLayout + 29;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        tdsTopV2View.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onActivityLayout + 109;
        onPostMessage = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsTopV2View tdsTopV2View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 111;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(tdsTopV2View, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(tdsTopV2View, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsTopV2View tdsTopV2View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onActivityLayout + 5;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tdsTopV2View, quirksExternalSyntheticBackport0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onActivityLayout + 9;
        onPostMessage = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTopV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException {
        Object next;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        int i2 = 2;
        this.extraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onActivityResized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback_Parcel = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access000 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        y1ExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallback onextracallback = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion;
        this.IAuthTabCallbackStubProxy = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onextracallback.onExtraCallbackWithResult(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.readTypedObject = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access100 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.getInterfaceDescriptor = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(onextracallback.onExtraCallbackWithResult(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.writeTypedObject = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(IAuthTabCallbackStub.PARAGRAPH, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.extraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asInterface = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.IAuthTabCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onMessageChannelReady = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onTransact = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        if (attributeSet != null) {
            int[] iArr = R.styleable.TdsTopV2View;
            Intrinsics.checkNotNullExpressionValue(iArr, "");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i3 = 0;
            Integer numValueOf = null;
            bindChildren bindchildrenIAuthTabCallback = null;
            String string = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            String string2 = null;
            String string3 = null;
            Integer numValueOf4 = null;
            Integer numValueOf5 = null;
            Integer numValueOf6 = null;
            Integer numValueOf7 = null;
            bindChildren bindchildrenIAuthTabCallback2 = null;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.TdsTopV2View_titleText) {
                    int i4 = onActivityLayout + 17;
                    onPostMessage = i4 % 128;
                    int i5 = i4 % i2;
                    string = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.TdsTopV2View_topTitleType) {
                    numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.TdsTopV2View_topTitleTextType) {
                    bindchildrenIAuthTabCallback = IAuthTabCallback(typedArrayObtainStyledAttributes, index);
                } else if (index == R.styleable.TdsTopV2View_lowerItemType) {
                    int i6 = onActivityLayout + 83;
                    onPostMessage = i6 % 128;
                    int i7 = i6 % 2;
                    numValueOf4 = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == R.styleable.TdsTopV2View_upperIcon) {
                    numValueOf5 = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(index, 0));
                } else if (index == R.styleable.TdsTopV2View_rightItemText) {
                    string3 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.TdsTopV2View_rightItemType) {
                    int i8 = onPostMessage + 15;
                    onActivityLayout = i8 % 128;
                    if (i8 % 2 == 0) {
                        numValueOf2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(index, -1));
                        int i9 = 97 / 0;
                    } else {
                        numValueOf2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(index, -1));
                    }
                } else {
                    if (index == R.styleable.TdsTopV2View_rightItemResource) {
                        int i10 = onPostMessage + 63;
                        onActivityLayout = i10 % 128;
                        int i11 = i10 % 2;
                        numValueOf3 = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(index, 0));
                        int i12 = 2 % 2;
                    } else if (index == R.styleable.TdsTopV2View_subAreaAlign) {
                        numValueOf7 = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(index, 0));
                    } else if (index == R.styleable.TdsTopV2View_subAreaText) {
                        string2 = typedArrayObtainStyledAttributes.getString(index);
                    } else if (index == R.styleable.TdsTopV2View_subAreaType) {
                        numValueOf6 = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(index, 0));
                    } else if (index == R.styleable.TdsTopV2View_subAreaTextType) {
                        bindchildrenIAuthTabCallback2 = IAuthTabCallback(typedArrayObtainStyledAttributes, index);
                    }
                    i3++;
                    i2 = 2;
                }
                i3++;
                i2 = 2;
            }
            Iterator it = IAuthTabCallbackStub.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    int i13 = 2 % 2;
                    next = null;
                    break;
                }
                int i14 = onPostMessage + 85;
                onActivityLayout = i14 % 128;
                int i15 = i14 % 2;
                next = it.next();
                int iOrdinal = ((IAuthTabCallbackStub) next).ordinal();
                if (numValueOf != null && iOrdinal == numValueOf.intValue()) {
                    int i16 = onPostMessage + 125;
                    onActivityLayout = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                }
            }
            IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) next;
            if (iAuthTabCallbackStub != null) {
                setTitleType(iAuthTabCallbackStub);
                getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
                if (getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel != null) {
                    getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(string);
                    getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.getInterfaceDescriptor().IAuthTabCallback(bindchildrenIAuthTabCallback);
                }
            }
            if (numValueOf2 != null) {
                setRightType((IAuthTabCallback) IAuthTabCallback.getEntries().get(numValueOf2.intValue()));
                if (numValueOf3 != null) {
                    int i17 = onPostMessage + 15;
                    onActivityLayout = i17 % 128;
                    if (i17 % 2 == 0) {
                        numValueOf3.intValue();
                        onExtraCallbackWithResult();
                        throw null;
                    }
                    int iIntValue = numValueOf3.intValue();
                    getDispatcherokhttp getdispatcherokhttpOnExtraCallbackWithResult = onExtraCallbackWithResult();
                    if (getdispatcherokhttpOnExtraCallbackWithResult != null) {
                        getdispatcherokhttpOnExtraCallbackWithResult.IAuthTabCallback(iIntValue);
                    }
                }
                x509TrustManager x509trustmanager = (x509TrustManager) onNavigationEvent(1402869775, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, RNSScreenManagerDelegate.onNavigationEvent(), -1402869773);
                if (x509trustmanager != null && string3 != null) {
                    x509trustmanager.onNavigationEvent(string3);
                }
            }
            if (numValueOf5 != null) {
                int iIntValue2 = numValueOf5.intValue();
                setUpperType(onTransact.ASSET);
                getCookieJarokhttp getcookiejarokhttpIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
                if (getcookiejarokhttpIAuthTabCallbackStubProxy != null) {
                    getCookieJarokhttp.IAuthTabCallback(new Object[]{getcookiejarokhttpIAuthTabCallbackStubProxy, Integer.valueOf(iIntValue2)}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 607969934, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -607969934);
                    getcookiejarokhttpIAuthTabCallbackStubProxy.IAuthTabCallback(handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onTransact());
                }
            }
            if (numValueOf4 != null) {
                setLowerType((onNavigationEvent) onNavigationEvent.getEntries().get(numValueOf4.intValue()));
            }
            if (numValueOf6 != null) {
                int i18 = onPostMessage + 97;
                onActivityLayout = i18 % 128;
                if (i18 % 2 == 0) {
                    Object obj = null;
                    numValueOf6.intValue();
                    obj.hashCode();
                    throw null;
                }
                int iIntValue3 = numValueOf6.intValue();
                onExtraCallbackWithResult onextracallbackwithresult = iIntValue3 != 0 ? iIntValue3 != 1 ? iIntValue3 != 2 ? null : onExtraCallbackWithResult.TEXT_BUTTON : onExtraCallbackWithResult.BADGE : onExtraCallbackWithResult.PARAGRAPH;
                if (numValueOf7 != null && numValueOf7.intValue() == 1) {
                    int i19 = onActivityLayout + 89;
                    onPostMessage = i19 % 128;
                    if (i19 % 2 != 0) {
                        setSubtitle1Type(onextracallbackwithresult);
                        onWarmupCompleted();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    setSubtitle1Type(onextracallbackwithresult);
                    getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpOnWarmupCompleted = onWarmupCompleted();
                    if (getminwebsocketmessagetocompressokhttpOnWarmupCompleted != null) {
                        getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onNavigationEvent(string2);
                        getminwebsocketmessagetocompressokhttpOnWarmupCompleted.getInterfaceDescriptor().IAuthTabCallback(bindchildrenIAuthTabCallback2);
                    }
                    getFollowRedirectsokhttp getfollowredirectsokhttpAsBinder = asBinder();
                    if (getfollowredirectsokhttpAsBinder != null) {
                        getfollowredirectsokhttpAsBinder.onNavigationEvent(string2);
                    }
                } else {
                    bindChildren bindchildren = bindchildrenIAuthTabCallback2;
                    int i20 = onActivityLayout + 75;
                    onPostMessage = i20 % 128;
                    if (i20 % 2 != 0) {
                        setSubtitle2Type(onextracallbackwithresult);
                        onTransact();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    setSubtitle2Type(onextracallbackwithresult);
                    getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpOnTransact = onTransact();
                    if (getminwebsocketmessagetocompressokhttpOnTransact != null) {
                        getminwebsocketmessagetocompressokhttpOnTransact.onNavigationEvent(string2);
                        getminwebsocketmessagetocompressokhttpOnTransact.getInterfaceDescriptor().IAuthTabCallback(bindchildren);
                        int i21 = 2 % 2;
                    }
                    getFollowRedirectsokhttp getfollowredirectsokhttp = (getFollowRedirectsokhttp) onNavigationEvent(31415468, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, RNSScreenManagerDelegate.onNavigationEvent(), -31415468);
                    if (getfollowredirectsokhttp != null) {
                        getfollowredirectsokhttp.onNavigationEvent(string2);
                        int i22 = 2 % 2;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            int i23 = 2 % 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTopV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onActivityLayout + 13;
            onPostMessage = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onActivityLayout + 29;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onTransact {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onTransact[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onTransact ASSET_V1 = new onTransact("ASSET_V1", 0);
        public static final onTransact ASSET = new onTransact("ASSET", 1);
        public static final onTransact BADGE = new onTransact("BADGE", 2);

        public static final /* synthetic */ class IAuthTabCallback {
            public static final /* synthetic */ int[] onExtraCallback;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            static {
                int[] iArr = new int[onTransact.values().length];
                try {
                    iArr[onTransact.ASSET_V1.ordinal()] = 1;
                    int i = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onTransact.ASSET.ordinal()] = 2;
                    int i2 = onExtraCallbackWithResult + 125;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 3 / 3;
                    } else {
                        int i4 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onTransact.BADGE.ordinal()] = 3;
                    int i5 = onExtraCallbackWithResult + 19;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused3) {
                }
                onExtraCallback = iArr;
            }
        }

        public static /* synthetic */ Unit $r8$lambda$FE0zSwG4TGbzmX2u_c8zy1jAcRk(getDispatcherokhttp getdispatcherokhttp, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit upperItem$lambda$0$0 = toUpperItem$lambda$0$0(getdispatcherokhttp, y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return upperItem$lambda$0$0;
        }

        public static /* synthetic */ Unit $r8$lambda$MomdrhU0JrBhJXIX1oixnTrMcBc(addInterceptor addinterceptor, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                toUpperItem$lambda$2$0(addinterceptor, y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit upperItem$lambda$2$0 = toUpperItem$lambda$2$0(addinterceptor, y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i4 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return upperItem$lambda$2$0;
        }

        public static /* synthetic */ Unit $r8$lambda$VzoVyxgOodo0152kCJQ9uAInI64(getCookieJarokhttp getcookiejarokhttp, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Unit upperItem$lambda$1$0 = toUpperItem$lambda$1$0(getcookiejarokhttp, y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return upperItem$lambda$1$0;
            }
            throw null;
        }

        public static /* synthetic */ Unit $r8$lambda$WEBPZp1oSSrSsrE1YzMlww93Gl8(addInterceptor addinterceptor, y1b y1bVar, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                toUpperItem$lambda$2$0$0(addinterceptor, y1bVar, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
                obj.hashCode();
                throw null;
            }
            Unit upperItem$lambda$2$0$0 = toUpperItem$lambda$2$0$0(addinterceptor, y1bVar, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i4 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return upperItem$lambda$2$0$0;
            }
            throw null;
        }

        public static /* synthetic */ Unit $r8$lambda$svt4TTmmNmL3Ue3lAXKfVoZk9MM(getDispatcherokhttp getdispatcherokhttp, getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return toUpperItem$lambda$0$0$0$0(getdispatcherokhttp, onextracallbackwithresult, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
            }
            toUpperItem$lambda$0$0$0$0(getdispatcherokhttp, onextracallbackwithresult, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ onTransact[] $values() {
            onTransact[] ontransactArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 5;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                onTransact ontransact = ASSET_V1;
                onTransact ontransact2 = ASSET;
                onTransact ontransact3 = BADGE;
                ontransactArr = new onTransact[3];
                ontransactArr[1] = ontransact;
                ontransactArr[0] = ontransact2;
                ontransactArr[4] = ontransact3;
            } else {
                ontransactArr = new onTransact[]{ASSET_V1, ASSET, BADGE};
            }
            int i4 = i2 + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
            return ontransactArr;
        }

        public static EnumEntries<onTransact> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 67;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onTransact> enumEntries = $ENTRIES;
            int i5 = i2 + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onTransact valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransact = (onTransact) Enum.valueOf(onTransact.class, str);
            int i4 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return ontransact;
            }
            throw null;
        }

        public static onTransact[] values() {
            onTransact[] ontransactArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                ontransactArr = (onTransact[]) $VALUES.clone();
                int i3 = 36 / 0;
            } else {
                ontransactArr = (onTransact[]) $VALUES.clone();
            }
            int i4 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
            return ontransactArr;
        }

        private onTransact(String str, int i) {
        }

        static {
            onTransact[] ontransactArr$values = $values();
            $VALUES = ontransactArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(ontransactArr$values);
            int i = IAuthTabCallback + 117;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        
            if ((r2 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            if (r1 == 4) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r1 == 2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (r1 != 3) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            if ((r7 instanceof o.addInterceptor) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            r7 = (o.addInterceptor) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        
            r5 = r5 + 97;
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onTransact.onExtraCallbackWithResult = r5 % 128;
            r5 = r5 % 2;
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        
            if (r7 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        
            if (r7.onExtraCallback().isEmpty() != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        
            r7 = o.ForwardingCameraControl.onExtraCallbackWithResult(1129092006, true, new im.toss.tds.view.compat.component.compound.top.TdsTopV2View$UpperType$$ExternalSyntheticLambda3(r7));
            r1 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onTransact.onWarmupCompleted + 15;
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onTransact.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        
            throw new kotlin.NoWhenBranchMatchedException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        
            if ((r7 instanceof o.getCookieJarokhttp) == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        
            r5 = r5 + 57;
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onTransact.onExtraCallbackWithResult = r5 % 128;
            r5 = r5 % 2;
            r7 = (o.getCookieJarokhttp) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (r7 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
        
            return o.ForwardingCameraControl.onExtraCallbackWithResult(832738318, true, new im.toss.tds.view.compat.component.compound.top.TdsTopV2View$UpperType$$ExternalSyntheticLambda2(r7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
        
            if ((r7 instanceof o.getDispatcherokhttp) == true) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
        
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
        
            r1 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onTransact.onExtraCallbackWithResult + 79;
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onTransact.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
            r7 = (o.getDispatcherokhttp) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
        
            if (r7 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
        
            return o.ForwardingCameraControl.onExtraCallbackWithResult(-766474760, true, new im.toss.tds.view.compat.component.compound.top.TdsTopV2View$UpperType$$ExternalSyntheticLambda1(r7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        
            if (r1 != 1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        
            if (r1 != 1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        
            r2 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onTransact.onExtraCallbackWithResult + 77;
            r5 = r2 % 128;
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onTransact.onWarmupCompleted = r5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> toUpperItem$tds_view_compat_release(@NotNull eventListener eventlistener) throws NoWhenBranchMatchedException {
            int i;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(eventlistener, "");
                i = IAuthTabCallback.onExtraCallback[ordinal()];
            } else {
                Intrinsics.checkNotNullParameter(eventlistener, "");
                i = IAuthTabCallback.onExtraCallback[ordinal()];
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toUpperItem$lambda$0$0$0$0(getDispatcherokhttp getdispatcherokhttp, getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                if ((i & 61) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                        int i5 = onExtraCallbackWithResult + 27;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    i |= i2;
                }
            } else {
                Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                if ((i & 6) == 0) {
                }
            }
            boolean z = false;
            if ((i & 19) != 18) {
                int i7 = onExtraCallbackWithResult + 15;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    z = true;
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onWarmupCompleted + 75;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1249595978, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.UpperType.toUpperItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:117)");
                    int i10 = onExtraCallbackWithResult + 109;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                }
                eventListenerFactory.onExtraCallback(appLovinNativeAdImplExternalSyntheticLambda1, (eventListener) getdispatcherokhttp.onWarmupCompleted().onExtraCallbackWithResult(), onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i & 14);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toUpperItem$lambda$0$0(final getDispatcherokhttp getdispatcherokhttp, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            boolean z;
            int i3;
            int i4 = 2 % 2;
            int i5 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullParameter(y1bVar, "");
            if ((i & 6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar)) {
                    int i7 = onExtraCallbackWithResult + 91;
                    onWarmupCompleted = i7 % 128;
                    i3 = i7 % 2 == 0 ? 3 : 4;
                } else {
                    i3 = 2;
                }
                i2 = i | i3;
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18) {
                int i8 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onExtraCallbackWithResult + 23;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-766474760, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.UpperType.toUpperItem.<anonymous>.<anonymous> (TdsTopV2View.kt:111)");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-766474760, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.UpperType.toUpperItem.<anonymous>.<anonymous> (TdsTopV2View.kt:111)");
                }
                final getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult = (getPrivacyDestinationUri.onExtraCallbackWithResult) getdispatcherokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult();
                if (onextracallbackwithresult == null) {
                    int i11 = onWarmupCompleted + 111;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2003366414);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2003366413);
                    y1bVar.onExtraCallback(onextracallbackwithresult, null, (getBacktraceNote) getdispatcherokhttp.asBinder().onExtraCallbackWithResult(), ((setByteOrder) ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttp}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent())).onExtraCallbackWithResult()).access100(), (Function0) getdispatcherokhttp.IAuthTabCallback().onExtraCallbackWithResult(), ForwardingCameraControl.onExtraCallback(-1249595978, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$UpperType$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i13 = 2 % 2;
                            int i14 = onNavigationEvent + 69;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            Unit unit$r8$lambda$svt4TTmmNmL3Ue3lAXKfVoZk9MM = TdsTopV2View.onTransact.$r8$lambda$svt4TTmmNmL3Ue3lAXKfVoZk9MM(getdispatcherokhttp, onextracallbackwithresult, (AppLovinNativeAdImplExternalSyntheticLambda1) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i16 = onExtraCallbackWithResult + 49;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            return unit$r8$lambda$svt4TTmmNmL3Ue3lAXKfVoZk9MM;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 196608, 2);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = onExtraCallbackWithResult + 119;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toUpperItem$lambda$1$0(getCookieJarokhttp getcookiejarokhttp, y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2;
            boolean z;
            long jAccess100;
            int i3;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(y1bVar, "");
            if ((i & 6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar)) {
                    int i5 = onWarmupCompleted + 91;
                    onExtraCallbackWithResult = i5 % 128;
                    i3 = i5 % 2 != 0 ? 3 : 4;
                } else {
                    i3 = 2;
                }
                i2 = i | i3;
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18) {
                int i6 = onExtraCallbackWithResult + 81;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
                int i8 = onExtraCallbackWithResult + 25;
                onWarmupCompleted = i8 % 128;
                Object obj = null;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onWarmupCompleted + 125;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(832738318, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.UpperType.toUpperItem.<anonymous>.<anonymous> (TdsTopV2View.kt:127)");
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(832738318, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.UpperType.toUpperItem.<anonymous>.<anonymous> (TdsTopV2View.kt:127)");
                }
                handleNativeAdClick.onExtraCallback onextracallback = (handleNativeAdClick.onExtraCallback) getcookiejarokhttp.getInterfaceDescriptor().onExtraCallbackWithResult();
                Object objOnExtraCallbackWithResult = ((getSupportedHighSpeedResolutionsFor) getCookieJarokhttp.IAuthTabCallback(new Object[]{getcookiejarokhttp}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 1351605746, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1351605744)).onExtraCallbackWithResult();
                if (onextracallback != null) {
                    int i10 = onExtraCallbackWithResult + 73;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    if (objOnExtraCallbackWithResult != null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(376346565);
                        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(context);
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(objOnExtraCallbackWithResult);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                            int i12 = onWarmupCompleted + 97;
                            onExtraCallbackWithResult = i12 % 128;
                            if (i12 % 2 != 0) {
                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                obj.hashCode();
                                throw null;
                            }
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = deprecated_dispatcher.onWarmupCompleted(deprecated_eventListenerFactory.Companion, context, objOnExtraCallbackWithResult);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                                int i13 = onExtraCallbackWithResult + 73;
                                onWarmupCompleted = i13 % 128;
                                int i14 = i13 % 2;
                            }
                            deprecated_eventListenerFactory deprecated_eventlistenerfactory = (deprecated_eventListenerFactory) objOnMinimized;
                            getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote = (getBacktraceNote) getcookiejarokhttp.IAuthTabCallback().onExtraCallbackWithResult();
                            Object objOnExtraCallbackWithResult2 = getcookiejarokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult();
                            if (((setByteOrder) objOnExtraCallbackWithResult2).access100() == 16) {
                                int i15 = onExtraCallbackWithResult + 63;
                                onWarmupCompleted = i15 % 128;
                                int i16 = i15 % 2;
                            } else {
                                obj = objOnExtraCallbackWithResult2;
                            }
                            setByteOrder setbyteorder = (setByteOrder) obj;
                            if (setbyteorder == null) {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1397634628);
                                jAccess100 = setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, 48);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                int i17 = onWarmupCompleted + 55;
                                onExtraCallbackWithResult = i17 % 128;
                                int i18 = i17 % 2;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1397631032);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                jAccess100 = setbyteorder.access100();
                            }
                            y1bVar.onExtraCallbackWithResult(objOnExtraCallbackWithResult, deprecated_eventlistenerfactory, onextracallback, null, ((setByteOrder) getcookiejarokhttp.asInterface().onExtraCallbackWithResult()).access100(), ((Number) getcookiejarokhttp.IAuthTabCallbackStub().onExtraCallbackWithResult()).intValue(), ((Number) getcookiejarokhttp.IAuthTabCallbackDefault().onExtraCallbackWithResult()).floatValue(), jAccess100, getbacktracenote, ((VirtualCameraControlExternalSyntheticLambda1) getcookiejarokhttp.onExtraCallback().onExtraCallbackWithResult()).IAuthTabCallback(), (Function0) getcookiejarokhttp.asBinder().onExtraCallbackWithResult(), (String) getcookiejarokhttp.onWarmupCompleted().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0, (i2 << 6) & 896, 8);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(377560308);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toUpperItem$lambda$2$0$0(addInterceptor addinterceptor, y1b y1bVar, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
                int i3 = onExtraCallbackWithResult + 93;
                onWarmupCompleted = i3 % 128;
                z = i3 % 2 != 0;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                int i4 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onExtraCallbackWithResult + 49;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1893815597, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.UpperType.toUpperItem.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:158)");
                        int i7 = 50 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1893815597, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.UpperType.toUpperItem.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:158)");
                    }
                }
                for (retryOnConnectionFailure retryonconnectionfailure : addinterceptor.onExtraCallback()) {
                    hasProvider hasprovider = (hasProvider) retryonconnectionfailure.onExtraCallbackWithResult().IAuthTabCallbackStub().onExtraCallbackWithResult();
                    if (hasprovider == null) {
                        hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                    }
                    y1bVar.onWarmupCompleted(hasprovider, null, (AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent) retryonconnectionfailure.onWarmupCompleted().onExtraCallbackWithResult(), (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) retryonconnectionfailure.IAuthTabCallback().onExtraCallbackWithResult(), (AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted) retryonconnectionfailure.onExtraCallback().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                    int i8 = onWarmupCompleted + 95;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onWarmupCompleted + 55;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit toUpperItem$lambda$2$0(final addInterceptor addinterceptor, final y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(y1bVar, "");
            if ((i & 6) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar) ? 4 : 2;
            }
            if ((i & 19) != 18) {
                int i5 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1129092006, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.UpperType.toUpperItem.<anonymous>.<anonymous> (TdsTopV2View.kt:157)");
                }
                y1bVar.onExtraCallback(ForwardingCameraControl.onExtraCallback(-1893815597, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$UpperType$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 103;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        addInterceptor addinterceptor2 = addinterceptor;
                        if (i9 == 0) {
                            return TdsTopV2View.onTransact.$r8$lambda$WEBPZp1oSSrSsrE1YzMlww93Gl8(addinterceptor2, y1bVar, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        Unit unit$r8$lambda$WEBPZp1oSSrSsrE1YzMlww93Gl8 = TdsTopV2View.onTransact.$r8$lambda$WEBPZp1oSSrSsrE1YzMlww93Gl8(addinterceptor2, y1bVar, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i10 = 61 / 0;
                        return unit$r8$lambda$WEBPZp1oSSrSsrE1YzMlww93Gl8;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final onExtraCallback SIZE_28 = new onExtraCallback("SIZE_28", 0);
        public static final onExtraCallback SIZE_22 = new onExtraCallback("SIZE_22", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = SIZE_28;
            if (i3 == 0) {
                return new onExtraCallback[]{onextracallback, SIZE_22};
            }
            onExtraCallback onextracallback2 = SIZE_22;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[3];
            onextracallbackArr[0] = onextracallback;
            onextracallbackArr[0] = onextracallback2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 17;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i2 + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallback + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
                int i3 = 97 / 0;
            } else {
                onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            }
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onNavigationEvent + 23;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final onWarmupCompleted SIZE_13 = new onWarmupCompleted("SIZE_13", 0);
        public static final onWarmupCompleted SIZE_15 = new onWarmupCompleted("SIZE_15", 1);
        public static final onWarmupCompleted SIZE_17 = new onWarmupCompleted("SIZE_17", 2);
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = SIZE_13;
            if (i3 != 0) {
                return new onWarmupCompleted[]{onwarmupcompleted, SIZE_15, SIZE_17};
            }
            onWarmupCompleted onwarmupcompleted2 = SIZE_15;
            onWarmupCompleted onwarmupcompleted3 = SIZE_17;
            onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[3];
            onwarmupcompletedArr[0] = onwarmupcompleted;
            onwarmupcompletedArr[1] = onwarmupcompleted2;
            onwarmupcompletedArr[3] = onwarmupcompleted3;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + 63;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 == 0) {
                int i4 = 49 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 61;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallbackWithResult PARAGRAPH = new onExtraCallbackWithResult("PARAGRAPH", 0);
        public static final onExtraCallbackWithResult BADGE = new onExtraCallbackWithResult("BADGE", 1);
        public static final onExtraCallbackWithResult TEXT_BUTTON = new onExtraCallbackWithResult("TEXT_BUTTON", 2);

        public static final /* synthetic */ class onExtraCallback {
            public static final /* synthetic */ int[] onExtraCallback;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int[] iArr = new int[onExtraCallbackWithResult.values().length];
                try {
                    iArr[onExtraCallbackWithResult.PARAGRAPH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onExtraCallbackWithResult.BADGE.ordinal()] = 2;
                    int i = onNavigationEvent + 77;
                    onWarmupCompleted = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onExtraCallbackWithResult.TEXT_BUTTON.ordinal()] = 3;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                onExtraCallback = iArr;
                int i4 = onWarmupCompleted + 79;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 56 / 0;
                }
            }
        }

        /* renamed from: $r8$lambda$0o-hKqPufg8dscU3BoxCvAv8aeY, reason: not valid java name */
        public static /* synthetic */ Unit m91$r8$lambda$0ohKqPufg8dscU3BoxCvAv8aeY(getFollowRedirectsokhttp getfollowredirectsokhttp, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit subtitleComposable$lambda$2$0 = toSubtitleComposable$lambda$2$0(getfollowredirectsokhttp, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return subtitleComposable$lambda$2$0;
        }

        public static /* synthetic */ Unit $r8$lambda$Dr2El4Zi3PcLKVU8WQcCRoWx0Ww(getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Unit subtitleComposable$lambda$0$0 = toSubtitleComposable$lambda$0$0(getminwebsocketmessagetocompressokhttp, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return subtitleComposable$lambda$0$0;
        }

        public static /* synthetic */ Unit $r8$lambda$SGQU_KRIUfAtByeiIaBjc5mkDu8(addInterceptor addinterceptor, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Unit subtitleComposable$lambda$1$0$0 = toSubtitleComposable$lambda$1$0$0(addinterceptor, y1externalsyntheticlambda3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return subtitleComposable$lambda$1$0$0;
        }

        /* renamed from: $r8$lambda$TmLD-cp-4BvH-a58p0pJzTMVm8s, reason: not valid java name */
        public static /* synthetic */ Unit m92$r8$lambda$TmLDcp4BvHa58p0pJzTMVm8s(addInterceptor addinterceptor, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit subtitleComposable$lambda$1$0 = toSubtitleComposable$lambda$1$0(addinterceptor, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return subtitleComposable$lambda$1$0;
        }

        public static /* synthetic */ Unit $r8$lambda$dFr2vGYgq67RBFIXm9jHKYuhqgY(getFollowRedirectsokhttp getfollowredirectsokhttp, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return toSubtitleComposable$lambda$2$0$0(getfollowredirectsokhttp, cameraCaptureResultEmptyCameraCaptureResult, i);
            }
            toSubtitleComposable$lambda$2$0$0(getfollowredirectsokhttp, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult onextracallbackwithresult = PARAGRAPH;
                onExtraCallbackWithResult onextracallbackwithresult2 = BADGE;
                onExtraCallbackWithResult onextracallbackwithresult3 = TEXT_BUTTON;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[3];
                onextracallbackwithresultArr[0] = onextracallbackwithresult;
                onextracallbackwithresultArr[1] = onextracallbackwithresult2;
                onextracallbackwithresultArr[5] = onextracallbackwithresult3;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{PARAGRAPH, BADGE, TEXT_BUTTON};
            }
            int i4 = i3 + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i3 + 55;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
            }
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onWarmupCompleted + 91;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> toSubtitleComposable$tds_view_compat_release(@NotNull eventListener eventlistener) throws NoWhenBranchMatchedException {
            final addInterceptor addinterceptor;
            final getFollowRedirectsokhttp getfollowredirectsokhttp;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(eventlistener, "");
            int i4 = onExtraCallback.onExtraCallback[ordinal()];
            Object obj = null;
            if (i4 == 1) {
                final getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = eventlistener instanceof getMinWebSocketMessageToCompressokhttp ? (getMinWebSocketMessageToCompressokhttp) eventlistener : null;
                if (getminwebsocketmessagetocompressokhttp != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(1107356767, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$SubtitleType$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 61;
                            IAuthTabCallback = i6 % 128;
                            int i7 = i6 % 2;
                            getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp2 = getminwebsocketmessagetocompressokhttp;
                            y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj2;
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            if (i7 == 0) {
                                return TdsTopV2View.onExtraCallbackWithResult.$r8$lambda$Dr2El4Zi3PcLKVU8WQcCRoWx0Ww(getminwebsocketmessagetocompressokhttp2, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                            }
                            TdsTopV2View.onExtraCallbackWithResult.$r8$lambda$Dr2El4Zi3PcLKVU8WQcCRoWx0Ww(getminwebsocketmessagetocompressokhttp2, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                            throw null;
                        }
                    });
                }
                return null;
            }
            if (i4 != 2) {
                int i5 = onExtraCallbackWithResult + 81;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                if (i5 % 2 == 0 ? i4 != 3 : i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (eventlistener instanceof getFollowRedirectsokhttp) {
                    int i7 = i6 + 113;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    getfollowredirectsokhttp = (getFollowRedirectsokhttp) eventlistener;
                } else {
                    getfollowredirectsokhttp = null;
                }
                if (getfollowredirectsokhttp != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(2118586437, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$SubtitleType$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i9 = 2 % 2;
                            int i10 = onNavigationEvent + 79;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            getFollowRedirectsokhttp getfollowredirectsokhttp2 = getfollowredirectsokhttp;
                            y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) obj2;
                            if (i11 != 0) {
                                return TdsTopV2View.onExtraCallbackWithResult.m91$r8$lambda$0ohKqPufg8dscU3BoxCvAv8aeY(getfollowredirectsokhttp2, y1externalsyntheticlambda3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            }
                            TdsTopV2View.onExtraCallbackWithResult.m91$r8$lambda$0ohKqPufg8dscU3BoxCvAv8aeY(getfollowredirectsokhttp2, y1externalsyntheticlambda3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                    });
                }
                return null;
            }
            if (eventlistener instanceof addInterceptor) {
                addinterceptor = (addInterceptor) eventlistener;
                int i9 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            } else {
                addinterceptor = null;
            }
            if (addinterceptor != null) {
                int i11 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    addinterceptor.onExtraCallback().isEmpty();
                    obj.hashCode();
                    throw null;
                }
                if (!addinterceptor.onExtraCallback().isEmpty()) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(-383649939, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$SubtitleType$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i12 = 2 % 2;
                            int i13 = onNavigationEvent + 21;
                            onExtraCallbackWithResult = i13 % 128;
                            int i14 = i13 % 2;
                            Unit unitM92$r8$lambda$TmLDcp4BvHa58p0pJzTMVm8s = TdsTopV2View.onExtraCallbackWithResult.m92$r8$lambda$TmLDcp4BvHa58p0pJzTMVm8s(addinterceptor, (y1ExternalSyntheticLambda3) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i15 = onExtraCallbackWithResult + 61;
                            onNavigationEvent = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = 97 / 0;
                            }
                            return unitM92$r8$lambda$TmLDcp4BvHa58p0pJzTMVm8s;
                        }
                    });
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toSubtitleComposable$lambda$0$0(getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2;
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
                if ((i & 96) == 0) {
                    int i5 = IAuthTabCallback + 25;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3);
                        obj.hashCode();
                        throw null;
                    }
                    i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2);
                } else {
                    i2 = i;
                }
            } else {
                Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
                if ((i & 6) == 0) {
                }
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1))) {
                int i6 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1107356767, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.SubtitleType.toSubtitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:195)");
                }
                hasProvider hasprovider = (hasProvider) getminwebsocketmessagetocompressokhttp.IAuthTabCallbackStub().onExtraCallbackWithResult();
                if (hasprovider == null) {
                    hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                }
                y1externalsyntheticlambda3.onExtraCallbackWithResult(hasprovider, null, ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) getminwebsocketmessagetocompressokhttp.IAuthTabCallbackStubProxy().onExtraCallbackWithResult()).IAuthTabCallback(), ((setByteOrder) getminwebsocketmessagetocompressokhttp.onTransact().onExtraCallbackWithResult()).access100(), (GraphicDeviceInfo) getminwebsocketmessagetocompressokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onExtraCallbackWithResult + 47;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toSubtitleComposable$lambda$1$0$0(addInterceptor addinterceptor, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(rowScope, "");
                if ((i & 109) != 11) {
                    z = true;
                } else {
                    int i4 = onExtraCallbackWithResult + 87;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 4 / 2;
                    }
                    z = false;
                }
            } else {
                Intrinsics.checkNotNullParameter(rowScope, "");
                if ((i & 17) != 16) {
                }
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(533381715, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.SubtitleType.toSubtitleComposable.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:210)");
                }
                Iterator it = addinterceptor.onExtraCallback().iterator();
                while (true) {
                    Object obj = null;
                    if (it.hasNext()) {
                        int i6 = onExtraCallbackWithResult + 7;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                        retryOnConnectionFailure retryonconnectionfailure = (retryOnConnectionFailure) it.next();
                        hasProvider hasprovider = (hasProvider) retryonconnectionfailure.onExtraCallbackWithResult().IAuthTabCallbackStub().onExtraCallbackWithResult();
                        if (hasprovider == null) {
                            hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                        }
                        y1externalsyntheticlambda3.onNavigationEvent(hasprovider, (QuirksExternalSyntheticBackport0) null, (AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent) retryonconnectionfailure.onWarmupCompleted().onExtraCallbackWithResult(), (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) retryonconnectionfailure.IAuthTabCallback().onExtraCallbackWithResult(), (AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted) retryonconnectionfailure.onExtraCallback().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                    } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i7 = IAuthTabCallback + 117;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toSubtitleComposable$lambda$1$0(final addInterceptor addinterceptor, final y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i & 6) == 0) {
                int i3 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2;
            }
            if ((i & 19) != 18) {
                z = true;
            } else {
                int i5 = IAuthTabCallback + 99;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-383649939, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.SubtitleType.toSubtitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:209)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-383649939, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.SubtitleType.toSubtitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:209)");
                }
                y1externalsyntheticlambda3.onExtraCallback(null, ForwardingCameraControl.onExtraCallback(533381715, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$SubtitleType$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i8 = 2 % 2;
                        int i9 = IAuthTabCallback + 113;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unit$r8$lambda$SGQU_KRIUfAtByeiIaBjc5mkDu8 = TdsTopV2View.onExtraCallbackWithResult.$r8$lambda$SGQU_KRIUfAtByeiIaBjc5mkDu8(addinterceptor, y1externalsyntheticlambda3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i11 = IAuthTabCallback + 5;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 != 0) {
                            return unit$r8$lambda$SGQU_KRIUfAtByeiIaBjc5mkDu8;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 48, 1);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = IAuthTabCallback + 121;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 3 % 3;
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toSubtitleComposable$lambda$2$0$0(getFollowRedirectsokhttp getfollowredirectsokhttp, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 27;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 != 0 ? (i & 3) == 2 : (i & 3) == 2) {
                z = false;
            } else {
                int i5 = i4 + 27;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                int i7 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = IAuthTabCallback + 119;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1559020407, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.SubtitleType.toSubtitleComposable.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:230)");
                        int i10 = 76 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1559020407, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.SubtitleType.toSubtitleComposable.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:230)");
                    }
                }
                hasProvider hasprovider = (hasProvider) getfollowredirectsokhttp.IAuthTabCallbackDefault().onExtraCallbackWithResult();
                if (hasprovider == null) {
                    hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                }
                getHumanReadableName gethumanreadablename = (getHumanReadableName) getfollowredirectsokhttp.asInterface().onExtraCallbackWithResult();
                if (gethumanreadablename == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(724982320);
                    gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallbackWithResult());
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(724980987);
                }
                getHumanReadableName gethumanreadablename2 = gethumanreadablename;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = (oExternalSyntheticLambda0.onExtraCallbackWithResult) getfollowredirectsokhttp.onTransact().onExtraCallbackWithResult();
                if (onextracallbackwithresultOnWarmupCompleted == null) {
                    int i11 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(724985998);
                    onextracallbackwithresultOnWarmupCompleted = ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onWarmupCompleted();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(724984076);
                }
                oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = onextracallbackwithresultOnWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i13 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = (oExternalSyntheticLambda0.IAuthTabCallback) getfollowredirectsokhttp.asBinder().onExtraCallbackWithResult();
                if (iAuthTabCallbackOnWarmupCompleted == null) {
                    iAuthTabCallbackOnWarmupCompleted = oExternalSyntheticLambda0.IAuthTabCallback.Companion.onWarmupCompleted();
                    int i15 = onExtraCallbackWithResult + 39;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                }
                oExternalSyntheticLambda1.onWarmupCompleted(hasprovider, null, 0L, onextracallbackwithresult, iAuthTabCallbackOnWarmupCompleted, 0L, null, 0L, gethumanreadablename2, null, (GraphicDeviceInfo) getfollowredirectsokhttp.onWarmupCompleted().onExtraCallbackWithResult(), null, null, null, (Function0) getfollowredirectsokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult(), null, null, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 244454);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toSubtitleComposable$lambda$2$0(final getFollowRedirectsokhttp getfollowredirectsokhttp, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i & 17) != 16) {
                int i3 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2118586437, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.SubtitleType.toSubtitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:229)");
                }
                OkHttpClientBuilder.IAuthTabCallback(getfollowredirectsokhttp, ForwardingCameraControl.onExtraCallback(-1559020407, true, new Function2() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$SubtitleType$$ExternalSyntheticLambda4
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 37;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unit$r8$lambda$dFr2vGYgq67RBFIXm9jHKYuhqgY = TdsTopV2View.onExtraCallbackWithResult.$r8$lambda$dFr2vGYgq67RBFIXm9jHKYuhqgY(getfollowredirectsokhttp, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i8 = onWarmupCompleted + 1;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 == 0) {
                            return unit$r8$lambda$dFr2vGYgq67RBFIXm9jHKYuhqgY;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = onExtraCallbackWithResult + 3;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallbackStub {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallbackStub[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallbackStub PARAGRAPH = new IAuthTabCallbackStub("PARAGRAPH", 0);
        public static final IAuthTabCallbackStub ROLLING_NUMBER = new IAuthTabCallbackStub("ROLLING_NUMBER", 1);
        public static final IAuthTabCallbackStub TEXT_BUTTON = new IAuthTabCallbackStub("TEXT_BUTTON", 2);
        public static final IAuthTabCallbackStub SELECTOR = new IAuthTabCallbackStub("SELECTOR", 3);

        public static final /* synthetic */ class onExtraCallbackWithResult {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[IAuthTabCallbackStub.values().length];
                try {
                    iArr[IAuthTabCallbackStub.PARAGRAPH.ordinal()] = 1;
                    int i = onExtraCallback + 79;
                    onExtraCallbackWithResult = i % 128;
                    int i2 = i % 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IAuthTabCallbackStub.ROLLING_NUMBER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IAuthTabCallbackStub.TEXT_BUTTON.ordinal()] = 3;
                    int i4 = onExtraCallback + 21;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IAuthTabCallbackStub.SELECTOR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                onWarmupCompleted = iArr;
            }
        }

        public static /* synthetic */ Unit $r8$lambda$2eCMJfVG84D_jhUpGJcwUWxzWCw(CharSequence charSequence, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return toTitleComposable$lambda$1$0$0$0(charSequence, useandconfigureprogramwithtexture);
            }
            toTitleComposable$lambda$1$0$0$0(charSequence, useandconfigureprogramwithtexture);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit $r8$lambda$7LvKfToyarxvCpkHNIWTrEwe9qc(CharSequence charSequence, getFollowRedirectsokhttp getfollowredirectsokhttp, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 5;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit titleComposable$lambda$2$0$0 = toTitleComposable$lambda$2$0$0(charSequence, getfollowredirectsokhttp, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onNavigationEvent + 101;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return titleComposable$lambda$2$0$0;
        }

        public static /* synthetic */ Unit $r8$lambda$NU5OV36CO795BzHYJUvCKkZpEiw(getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, CharSequence charSequence, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Unit titleComposable$lambda$0$0 = toTitleComposable$lambda$0$0(getminwebsocketmessagetocompressokhttp, charSequence, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallback + 47;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return titleComposable$lambda$0$0;
            }
            throw null;
        }

        public static /* synthetic */ Unit $r8$lambda$PF0l2ygyVXEQTf6kfvWTNf3FSgg(getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, CharSequence charSequence, String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 121;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Unit titleComposable$lambda$1$0 = toTitleComposable$lambda$1$0(getminwebsocketmessagetocompressokhttp, charSequence, str, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallback + 55;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return titleComposable$lambda$1$0;
        }

        /* renamed from: $r8$lambda$ZAJ-CIxyUQqGWh3368gL_Onw9Z8, reason: not valid java name */
        public static /* synthetic */ Unit m89$r8$lambda$ZAJCIxyUQqGWh3368gL_Onw9Z8(CharSequence charSequence, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit titleComposable$lambda$2$0$0$0$0 = toTitleComposable$lambda$2$0$0$0$0(charSequence, useandconfigureprogramwithtexture);
            int i4 = onExtraCallback + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return titleComposable$lambda$2$0$0$0$0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: $r8$lambda$dP9Zj8q1yqnG5Xjvz8-RiFcPtHE, reason: not valid java name */
        public static /* synthetic */ Unit m90$r8$lambda$dP9Zj8q1yqnG5Xjvz8RiFcPtHE(CharSequence charSequence, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit titleComposable$lambda$3$0$0$0 = toTitleComposable$lambda$3$0$0$0(charSequence, useandconfigureprogramwithtexture);
            int i4 = onNavigationEvent + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return titleComposable$lambda$3$0$0$0;
        }

        public static /* synthetic */ Unit $r8$lambda$mYP9ZaWRHpu3QRJqBcidRX2hSRc(getDnsokhttp getdnsokhttp, CharSequence charSequence, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Unit titleComposable$lambda$3$0 = toTitleComposable$lambda$3$0(getdnsokhttp, charSequence, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallback + 113;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return titleComposable$lambda$3$0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit $r8$lambda$rF_8v23qJFdNWgRAE7Wi0phvduY(getFollowRedirectsokhttp getfollowredirectsokhttp, CharSequence charSequence, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 27;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return toTitleComposable$lambda$2$0(getfollowredirectsokhttp, charSequence, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            }
            toTitleComposable$lambda$2$0(getfollowredirectsokhttp, charSequence, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }

        public static /* synthetic */ Unit $r8$lambda$vYpKYFL1_ADCQuKIaR8EQ8KekqU(CharSequence charSequence, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit titleComposable$lambda$0$0$0$0 = toTitleComposable$lambda$0$0$0$0(charSequence, useandconfigureprogramwithtexture);
            int i4 = onExtraCallback + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return titleComposable$lambda$0$0$0$0;
        }

        private static final /* synthetic */ IAuthTabCallbackStub[] $values() {
            IAuthTabCallbackStub[] iAuthTabCallbackStubArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                IAuthTabCallbackStub iAuthTabCallbackStub = PARAGRAPH;
                IAuthTabCallbackStub iAuthTabCallbackStub2 = ROLLING_NUMBER;
                IAuthTabCallbackStub iAuthTabCallbackStub3 = TEXT_BUTTON;
                IAuthTabCallbackStub iAuthTabCallbackStub4 = SELECTOR;
                iAuthTabCallbackStubArr = new IAuthTabCallbackStub[]{iAuthTabCallbackStub, iAuthTabCallbackStub2};
                iAuthTabCallbackStubArr[5] = iAuthTabCallbackStub3;
                iAuthTabCallbackStubArr[4] = iAuthTabCallbackStub4;
            } else {
                iAuthTabCallbackStubArr = new IAuthTabCallbackStub[]{PARAGRAPH, ROLLING_NUMBER, TEXT_BUTTON, SELECTOR};
            }
            int i4 = i3 + 121;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackStubArr;
        }

        public static EnumEntries<IAuthTabCallbackStub> getEntries() {
            EnumEntries<IAuthTabCallbackStub> enumEntries;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 81;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                enumEntries = $ENTRIES;
                int i4 = 95 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallbackStub valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) Enum.valueOf(IAuthTabCallbackStub.class, str);
            int i4 = onNavigationEvent + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackStub;
        }

        public static IAuthTabCallbackStub[] values() {
            IAuthTabCallbackStub[] iAuthTabCallbackStubArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                iAuthTabCallbackStubArr = (IAuthTabCallbackStub[]) $VALUES.clone();
                int i3 = 92 / 0;
            } else {
                iAuthTabCallbackStubArr = (IAuthTabCallbackStub[]) $VALUES.clone();
            }
            int i4 = onNavigationEvent + 121;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackStubArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallbackStub(String str, int i) {
        }

        static {
            IAuthTabCallbackStub[] iAuthTabCallbackStubArr$values = $values();
            $VALUES = iAuthTabCallbackStubArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackStubArr$values);
            int i = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public static /* synthetic */ getBacktraceNote toTitleComposable$tds_view_compat_release$default(IAuthTabCallbackStub iAuthTabCallbackStub, eventListener eventlistener, CharSequence charSequence, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toTitleComposable");
            }
            int i3 = onExtraCallback;
            int i4 = i3 + 105;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 5) != 0) {
                int i5 = i3 + 45;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                charSequence = "";
            }
            if ((i & 4) != 0) {
                int i7 = onNavigationEvent + 45;
                onExtraCallback = i7 % 128;
                Object obj2 = null;
                if (i7 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                str = null;
            }
            return iAuthTabCallbackStub.toTitleComposable$tds_view_compat_release(eventlistener, charSequence, str);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> toTitleComposable$tds_view_compat_release(@NotNull eventListener eventlistener, @NotNull final CharSequence charSequence, @Nullable final String str) throws NoWhenBranchMatchedException {
            final getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp;
            final getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp2;
            final getFollowRedirectsokhttp getfollowredirectsokhttp;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(eventlistener, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            int i2 = onExtraCallbackWithResult.onWarmupCompleted[ordinal()];
            Object obj = null;
            if (i2 == 1) {
                if (eventlistener instanceof getMinWebSocketMessageToCompressokhttp) {
                    int i3 = onExtraCallback;
                    int i4 = i3 + 47;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    getminwebsocketmessagetocompressokhttp = (getMinWebSocketMessageToCompressokhttp) eventlistener;
                    int i5 = i3 + 51;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    getminwebsocketmessagetocompressokhttp = null;
                }
                if (getminwebsocketmessagetocompressokhttp != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(940971401, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$TitleType$$ExternalSyntheticLambda4
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i7 = 2 % 2;
                            int i8 = onExtraCallback + 31;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unit$r8$lambda$NU5OV36CO795BzHYJUvCKkZpEiw = TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$NU5OV36CO795BzHYJUvCKkZpEiw(getminwebsocketmessagetocompressokhttp, charSequence, (y1a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i10 = onExtraCallback + 113;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 == 0) {
                                return unit$r8$lambda$NU5OV36CO795BzHYJUvCKkZpEiw;
                            }
                            throw null;
                        }
                    });
                }
                return null;
            }
            if (i2 == 2) {
                if (eventlistener instanceof getMinWebSocketMessageToCompressokhttp) {
                    getminwebsocketmessagetocompressokhttp2 = (getMinWebSocketMessageToCompressokhttp) eventlistener;
                } else {
                    int i7 = onNavigationEvent + 5;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 4 % 2;
                    }
                    getminwebsocketmessagetocompressokhttp2 = null;
                }
                if (getminwebsocketmessagetocompressokhttp2 != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(1166941376, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$TitleType$$ExternalSyntheticLambda5
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i9 = 2 % 2;
                            int i10 = onExtraCallbackWithResult + 83;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 != 0) {
                                return TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$PF0l2ygyVXEQTf6kfvWTNf3FSgg(getminwebsocketmessagetocompressokhttp2, charSequence, str, (y1a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            }
                            Unit unit$r8$lambda$PF0l2ygyVXEQTf6kfvWTNf3FSgg = TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$PF0l2ygyVXEQTf6kfvWTNf3FSgg(getminwebsocketmessagetocompressokhttp2, charSequence, str, (y1a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i11 = 35 / 0;
                            return unit$r8$lambda$PF0l2ygyVXEQTf6kfvWTNf3FSgg;
                        }
                    });
                }
                return null;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                final getDnsokhttp getdnsokhttp = eventlistener instanceof getDnsokhttp ? (getDnsokhttp) eventlistener : null;
                if (getdnsokhttp != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(-1171088816, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$TitleType$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i9 = 2 % 2;
                            int i10 = onWarmupCompleted + 31;
                            onExtraCallback = i10 % 128;
                            if (i10 % 2 != 0) {
                                TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$mYP9ZaWRHpu3QRJqBcidRX2hSRc(getdnsokhttp, charSequence, (y1a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                throw null;
                            }
                            Unit unit$r8$lambda$mYP9ZaWRHpu3QRJqBcidRX2hSRc = TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$mYP9ZaWRHpu3QRJqBcidRX2hSRc(getdnsokhttp, charSequence, (y1a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i11 = onWarmupCompleted + 45;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            return unit$r8$lambda$mYP9ZaWRHpu3QRJqBcidRX2hSRc;
                        }
                    });
                }
                return null;
            }
            if (eventlistener instanceof getFollowRedirectsokhttp) {
                int i9 = onNavigationEvent + 53;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
                getfollowredirectsokhttp = (getFollowRedirectsokhttp) eventlistener;
            } else {
                getfollowredirectsokhttp = null;
            }
            if (getfollowredirectsokhttp != null) {
                return ForwardingCameraControl.onExtraCallbackWithResult(-650474769, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$TitleType$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i10 = 2 % 2;
                        int i11 = IAuthTabCallback + 95;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unit$r8$lambda$rF_8v23qJFdNWgRAE7Wi0phvduY = TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$rF_8v23qJFdNWgRAE7Wi0phvduY(getfollowredirectsokhttp, charSequence, (y1a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i13 = IAuthTabCallback + 101;
                        onExtraCallback = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i14 = 47 / 0;
                        }
                        return unit$r8$lambda$rF_8v23qJFdNWgRAE7Wi0phvduY;
                    }
                });
            }
            return null;
        }

        private static final Unit toTitleComposable$lambda$0$0$0$0(CharSequence charSequence, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
                unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, charSequence.toString());
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, charSequence.toString());
            int i3 = 8 / 0;
            return Unit.INSTANCE;
        }

        private static final Unit toTitleComposable$lambda$0$0(getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, final CharSequence charSequence, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i & 6) == 0) {
                int i4 = onNavigationEvent + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
                int i6 = onNavigationEvent + 53;
                onExtraCallback = i6 % 128;
                Object obj = null;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    obj.hashCode();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onExtraCallback + 119;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(940971401, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.TitleType.toTitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:258)");
                        int i8 = 85 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(940971401, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.TitleType.toTitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:258)");
                    }
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) getminwebsocketmessagetocompressokhttp.onExtraCallback().onExtraCallbackWithResult();
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(charSequence);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$TitleType$$ExternalSyntheticLambda8
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            Unit unit$r8$lambda$vYpKYFL1_ADCQuKIaR8EQ8KekqU;
                            int i9 = 2 % 2;
                            int i10 = IAuthTabCallback + 43;
                            onWarmupCompleted = i10 % 128;
                            if (i10 % 2 != 0) {
                                unit$r8$lambda$vYpKYFL1_ADCQuKIaR8EQ8KekqU = TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$vYpKYFL1_ADCQuKIaR8EQ8KekqU(charSequence, (useAndConfigureProgramWithTexture) obj2);
                                int i11 = 43 / 0;
                            } else {
                                unit$r8$lambda$vYpKYFL1_ADCQuKIaR8EQ8KekqU = TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$vYpKYFL1_ADCQuKIaR8EQ8KekqU(charSequence, (useAndConfigureProgramWithTexture) obj2);
                            }
                            int i12 = onWarmupCompleted + 61;
                            IAuthTabCallback = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 36 / 0;
                            }
                            return unit$r8$lambda$vYpKYFL1_ADCQuKIaR8EQ8KekqU;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized, 1, (Object) null);
                hasProvider hasprovider = (hasProvider) getminwebsocketmessagetocompressokhttp.IAuthTabCallbackStub().onExtraCallbackWithResult();
                if (hasprovider == null) {
                    hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                }
                y1aVar.onWarmupCompleted(hasprovider, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, ((setByteOrder) getminwebsocketmessagetocompressokhttp.onTransact().onExtraCallbackWithResult()).access100(), ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) getminwebsocketmessagetocompressokhttp.IAuthTabCallbackStubProxy().onExtraCallbackWithResult()).IAuthTabCallback(), (GraphicDeviceInfo) getminwebsocketmessagetocompressokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = onExtraCallback + 59;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toTitleComposable$lambda$1$0$0$0(CharSequence charSequence, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, charSequence.toString());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toTitleComposable$lambda$1$0(getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp, final CharSequence charSequence, String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            Long longOrNull;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 87;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(y1aVar, "");
                if ((i & 75) != 95) {
                    int i4 = onNavigationEvent + 83;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                Intrinsics.checkNotNullParameter(y1aVar, "");
                if ((i & 17) != 16) {
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onNavigationEvent + 97;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1166941376, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.TitleType.toTitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:274)");
                        int i7 = 70 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1166941376, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.TitleType.toTitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:274)");
                    }
                }
                long jIAuthTabCallbackStub = ((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted())).IAuthTabCallbackStub();
                hasProvider hasprovider = (hasProvider) getminwebsocketmessagetocompressokhttp.IAuthTabCallbackStub().onExtraCallbackWithResult();
                if (hasprovider != null) {
                    int i8 = onNavigationEvent + 27;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        hasprovider.toString();
                        throw null;
                    }
                    String string = hasprovider.toString();
                    long jLongValue = (string == null || (longOrNull = StringsKt.toLongOrNull(string)) == null) ? 0L : longOrNull.longValue();
                    long jAccess100 = ((setByteOrder) getminwebsocketmessagetocompressokhttp.onTransact().onExtraCallbackWithResult()).access100();
                    GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = (GraphicDeviceInfo) getminwebsocketmessagetocompressokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult();
                    if (graphicDeviceInfoOnExtraCallbackWithResult == null) {
                        int i9 = onNavigationEvent + 63;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
                    }
                    GraphicDeviceInfo graphicDeviceInfo = graphicDeviceInfoOnExtraCallbackWithResult;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) getminwebsocketmessagetocompressokhttp.onExtraCallback().onExtraCallbackWithResult();
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(charSequence);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$TitleType$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj) {
                                int i11 = 2 % 2;
                                int i12 = onNavigationEvent + 41;
                                IAuthTabCallback = i12 % 128;
                                int i13 = i12 % 2;
                                Unit unit$r8$lambda$2eCMJfVG84D_jhUpGJcwUWxzWCw = TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$2eCMJfVG84D_jhUpGJcwUWxzWCw(charSequence, (useAndConfigureProgramWithTexture) obj);
                                int i14 = IAuthTabCallback + 53;
                                onNavigationEvent = i14 % 128;
                                int i15 = i14 % 2;
                                return unit$r8$lambda$2eCMJfVG84D_jhUpGJcwUWxzWCw;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    r8lambdambBE3yEBIgRHNjLFWGiIjcwqgYg.IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{Long.valueOf(jLongValue), getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized, 1, (Object) null), null, Long.valueOf(jAccess100), Long.valueOf(jIAuthTabCallbackStub), 0L, null, Float.valueOf(0.0f), null, null, 0L, graphicDeviceInfo, null, null, null, 0L, str, 0L, false, false, false, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 0, 4126692}, 1952929193, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1952929184);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i11 = onNavigationEvent + 43;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toTitleComposable$lambda$2$0$0$0$0(CharSequence charSequence, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, charSequence.toString());
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 121;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit toTitleComposable$lambda$2$0$0(final CharSequence charSequence, getFollowRedirectsokhttp getfollowredirectsokhttp, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            if ((i & 3) != 2) {
                int i3 = onNavigationEvent + 61;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1869951957, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.TitleType.toTitleComposable.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:293)");
                    int i5 = onNavigationEvent + 119;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(charSequence);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$TitleType$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = onWarmupCompleted + 39;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitM89$r8$lambda$ZAJCIxyUQqGWh3368gL_Onw9Z8 = TdsTopV2View.IAuthTabCallbackStub.m89$r8$lambda$ZAJCIxyUQqGWh3368gL_Onw9Z8(charSequence, (useAndConfigureProgramWithTexture) obj);
                            int i10 = onWarmupCompleted + 29;
                            onExtraCallbackWithResult = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 6 / 0;
                            }
                            return unitM89$r8$lambda$ZAJCIxyUQqGWh3368gL_Onw9Z8;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
                hasProvider hasprovider = (hasProvider) getfollowredirectsokhttp.IAuthTabCallbackDefault().onExtraCallbackWithResult();
                if (hasprovider == null) {
                    hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                }
                getHumanReadableName gethumanreadablename = (getHumanReadableName) getfollowredirectsokhttp.asInterface().onExtraCallbackWithResult();
                if (gethumanreadablename == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1727485902);
                    gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallbackWithResult());
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1727487235);
                    int i7 = onExtraCallback + 105;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
                getHumanReadableName gethumanreadablename2 = gethumanreadablename;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = (oExternalSyntheticLambda0.onExtraCallbackWithResult) getfollowredirectsokhttp.onTransact().onExtraCallbackWithResult();
                if (onextracallbackwithresultOnWarmupCompleted == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1727482224);
                    onextracallbackwithresultOnWarmupCompleted = ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onWarmupCompleted();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1727484146);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = (oExternalSyntheticLambda0.IAuthTabCallback) getfollowredirectsokhttp.asBinder().onExtraCallbackWithResult();
                if (iAuthTabCallbackOnWarmupCompleted == null) {
                    int i9 = onNavigationEvent + 29;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        oExternalSyntheticLambda0.IAuthTabCallback.Companion.onWarmupCompleted();
                        throw null;
                    }
                    iAuthTabCallbackOnWarmupCompleted = oExternalSyntheticLambda0.IAuthTabCallback.Companion.onWarmupCompleted();
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -566999436, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, hasprovider, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, onextracallbackwithresultOnWarmupCompleted, iAuthTabCallbackOnWarmupCompleted, null, 0L, 0L, gethumanreadablename2, (GraphicDeviceInfo) getfollowredirectsokhttp.onWarmupCompleted().onExtraCallbackWithResult(), (Function0) getfollowredirectsokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 112}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 566999436);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toTitleComposable$lambda$2$0(final getFollowRedirectsokhttp getfollowredirectsokhttp, final CharSequence charSequence, final y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(y1aVar, "");
            boolean z = false;
            if ((i & 6) == 0) {
                int i4 = onExtraCallback + 45;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 93 / 0;
                    i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2;
                } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                }
                i |= i2;
            }
            if ((i & 19) != 18) {
                int i6 = onExtraCallback + 37;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    z = true;
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-650474769, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.TitleType.toTitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:292)");
                    int i7 = onExtraCallback + 47;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
                OkHttpClientBuilder.IAuthTabCallback(getfollowredirectsokhttp, ForwardingCameraControl.onExtraCallback(-1869951957, true, new Function2() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$TitleType$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 99;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        CharSequence charSequence2 = charSequence;
                        if (i11 == 0) {
                            return TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$7LvKfToyarxvCpkHNIWTrEwe9qc(charSequence2, getfollowredirectsokhttp, y1aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        TdsTopV2View.IAuthTabCallbackStub.$r8$lambda$7LvKfToyarxvCpkHNIWTrEwe9qc(charSequence2, getfollowredirectsokhttp, y1aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            Unit unit = Unit.INSTANCE;
            int i9 = onNavigationEvent + 101;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static final Unit toTitleComposable$lambda$3$0$0$0(CharSequence charSequence, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, charSequence.toString());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toTitleComposable$lambda$3$0(getDnsokhttp getdnsokhttp, final CharSequence charSequence, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            int i3;
            long jIAuthTabCallbackStub;
            int i4 = 2 % 2;
            int i5 = onNavigationEvent + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.checkNotNullParameter(y1aVar, "");
                if ((i & 117) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                        int i6 = onNavigationEvent + 1;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    i3 = i | i2;
                    int i8 = onExtraCallback + 53;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    i3 = i;
                }
            } else {
                Intrinsics.checkNotNullParameter(y1aVar, "");
                if ((i & 6) == 0) {
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1171088816, i3, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.TitleType.toTitleComposable.<anonymous>.<anonymous> (TdsTopV2View.kt:313)");
                }
                getHumanReadableName gethumanreadablename = (getHumanReadableName) getdnsokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult();
                if (gethumanreadablename == null) {
                    int i10 = onExtraCallback + 29;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-134918217);
                    gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-134919240);
                }
                getHumanReadableName gethumanreadablename2 = gethumanreadablename;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i12 = onNavigationEvent + 91;
                onExtraCallback = i12 % 128;
                Object obj = null;
                if (i12 % 2 == 0) {
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(charSequence);
                    cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    throw null;
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(charSequence);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    int i13 = onExtraCallback + 115;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$TitleType$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2) {
                                int i15 = 2 % 2;
                                int i16 = IAuthTabCallback + 63;
                                onWarmupCompleted = i16 % 128;
                                int i17 = i16 % 2;
                                CharSequence charSequence2 = charSequence;
                                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj2;
                                if (i17 == 0) {
                                    return TdsTopV2View.IAuthTabCallbackStub.m90$r8$lambda$dP9Zj8q1yqnG5Xjvz8RiFcPtHE(charSequence2, useandconfigureprogramwithtexture);
                                }
                                TdsTopV2View.IAuthTabCallbackStub.m90$r8$lambda$dP9Zj8q1yqnG5Xjvz8RiFcPtHE(charSequence2, useandconfigureprogramwithtexture);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback2, false, (Function1) objOnMinimized, 1, (Object) null);
                    hasProvider hasprovider = (hasProvider) getdnsokhttp.onTransact().onExtraCallbackWithResult();
                    if (hasprovider == null) {
                        hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                    }
                    hasProvider hasprovider2 = hasprovider;
                    long jIAuthTabCallback = ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) getdnsokhttp.asBinder().onExtraCallbackWithResult()).IAuthTabCallback();
                    if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jIAuthTabCallback) == 0) {
                        int i15 = onNavigationEvent;
                        int i16 = i15 + 113;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        int i18 = i15 + 97;
                        onExtraCallback = i18 % 128;
                        if (i18 % 2 == 0) {
                            gethumanreadablename2.IAuthTabCallbackStub();
                            obj.hashCode();
                            throw null;
                        }
                        jIAuthTabCallbackStub = gethumanreadablename2.IAuthTabCallbackStub();
                    } else {
                        jIAuthTabCallbackStub = jIAuthTabCallback;
                    }
                    y1aVar.onExtraCallback(hasprovider2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function0<Unit>) getdnsokhttp.onWarmupCompleted().onExtraCallbackWithResult(), ((setByteOrder) getdnsokhttp.IAuthTabCallback().onExtraCallbackWithResult()).access100(), getHumanReadableName.onNavigationEvent(gethumanreadablename2, 0L, jIAuthTabCallbackStub, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777213, (Object) null), ((setByteOrder) getdnsokhttp.IAuthTabCallbackDefault().onExtraCallbackWithResult()).access100(), 0L, (GraphicDeviceInfo) getdnsokhttp.onExtraCallback().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, (i3 << 24) & 234881024, 64);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
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
        public static final IAuthTabCallback ASSET = new IAuthTabCallback("ASSET", 0);
        public static final IAuthTabCallback ASSET_V1_CIRCLE_BIG = new IAuthTabCallback("ASSET_V1_CIRCLE_BIG", 1);
        public static final IAuthTabCallback ASSET_V1_NONE_CROP_BIG = new IAuthTabCallback("ASSET_V1_NONE_CROP_BIG", 2);
        public static final IAuthTabCallback BUTTON = new IAuthTabCallback("BUTTON", 3);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        /* renamed from: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final /* synthetic */ class C0002IAuthTabCallback {
            public static final /* synthetic */ int[] onExtraCallback;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            static {
                int[] iArr = new int[IAuthTabCallback.values().length];
                try {
                    iArr[IAuthTabCallback.ASSET_V1_CIRCLE_BIG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IAuthTabCallback.ASSET_V1_NONE_CROP_BIG.ordinal()] = 2;
                    int i = onExtraCallbackWithResult + 121;
                    onNavigationEvent = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 5 % 2;
                    } else {
                        int i3 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IAuthTabCallback.ASSET.ordinal()] = 3;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IAuthTabCallback.BUTTON.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                onExtraCallback = iArr;
                int i5 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        public static /* synthetic */ Unit $r8$lambda$7kPB9gb8c_vCXqLn3pb81IWfNzY(getCookieJarokhttp getcookiejarokhttp, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 111;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit rightItem$lambda$1$0 = toRightItem$lambda$1$0(getcookiejarokhttp, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = IAuthTabCallback + 17;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return rightItem$lambda$1$0;
            }
            throw null;
        }

        public static /* synthetic */ Unit $r8$lambda$DNLjyC82lbSEt9fuyaSqzdTCbKk(getDispatcherokhttp getdispatcherokhttp, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit rightItem$lambda$0$0 = toRightItem$lambda$0$0(getdispatcherokhttp, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onWarmupCompleted + 111;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return rightItem$lambda$0$0;
            }
            throw null;
        }

        public static /* synthetic */ Unit $r8$lambda$SaXodPL38oEARRPT1zZKQG4DUWg(getDispatcherokhttp getdispatcherokhttp, getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 69;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit rightItem$lambda$0$0$0 = toRightItem$lambda$0$0$0(getdispatcherokhttp, onextracallbackwithresult, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
            if (i4 != 0) {
                int i5 = 68 / 0;
            }
            return rightItem$lambda$0$0$0;
        }

        /* renamed from: $r8$lambda$ezeMelP5si8bcTUhIqY8f-Cr6ic, reason: not valid java name */
        public static /* synthetic */ Unit m87$r8$lambda$ezeMelP5si8bcTUhIqY8fCr6ic(x509TrustManager x509trustmanager, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit rightItem$lambda$2$0 = toRightItem$lambda$2$0(x509trustmanager, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            if (i4 == 0) {
                int i5 = 52 / 0;
            }
            return rightItem$lambda$2$0;
        }

        /* renamed from: $r8$lambda$g8TO_-nahJ0yZvhDXzD2W5B0PWs, reason: not valid java name */
        public static /* synthetic */ Unit m88$r8$lambda$g8TO_nahJ0yZvhDXzD2W5B0PWs(x509TrustManager x509trustmanager, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 69;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit rightItem$lambda$2$0$0 = toRightItem$lambda$2$0$0(x509trustmanager, onextracallbackwithresult, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            if (i4 == 0) {
                int i5 = 10 / 0;
            }
            return rightItem$lambda$2$0$0;
        }

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {ASSET, ASSET_V1_CIRCLE_BIG, ASSET_V1_NONE_CROP_BIG, BUTTON};
            int i5 = i3 + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 7;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onWarmupCompleted + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallbackWithResult + 65;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> toRightItem$tds_view_compat_release(@Nullable eventListener eventlistener) throws NoWhenBranchMatchedException {
            final getDispatcherokhttp getdispatcherokhttp;
            final x509TrustManager x509trustmanager;
            int i = 2 % 2;
            int i2 = C0002IAuthTabCallback.onExtraCallback[ordinal()];
            Object obj = null;
            if (i2 == 1 || i2 == 2) {
                if (eventlistener instanceof getDispatcherokhttp) {
                    int i3 = onWarmupCompleted + 27;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    getdispatcherokhttp = (getDispatcherokhttp) eventlistener;
                } else {
                    getdispatcherokhttp = null;
                }
                if (getdispatcherokhttp != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(1752429310, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$RightType$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i4 = 2 % 2;
                            int i5 = onExtraCallbackWithResult + 41;
                            onExtraCallback = i5 % 128;
                            int i6 = i5 % 2;
                            Unit unit$r8$lambda$DNLjyC82lbSEt9fuyaSqzdTCbKk = TdsTopV2View.IAuthTabCallback.$r8$lambda$DNLjyC82lbSEt9fuyaSqzdTCbKk(getdispatcherokhttp, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i7 = onExtraCallback + 67;
                            onExtraCallbackWithResult = i7 % 128;
                            int i8 = i7 % 2;
                            return unit$r8$lambda$DNLjyC82lbSEt9fuyaSqzdTCbKk;
                        }
                    });
                }
                return null;
            }
            if (i2 == 3) {
                final getCookieJarokhttp getcookiejarokhttp = eventlistener instanceof getCookieJarokhttp ? (getCookieJarokhttp) eventlistener : null;
                if (getcookiejarokhttp != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(2136902292, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$RightType$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i4 = 2 % 2;
                            int i5 = onExtraCallbackWithResult + 29;
                            onNavigationEvent = i5 % 128;
                            int i6 = i5 % 2;
                            Unit unit$r8$lambda$7kPB9gb8c_vCXqLn3pb81IWfNzY = TdsTopV2View.IAuthTabCallback.$r8$lambda$7kPB9gb8c_vCXqLn3pb81IWfNzY(getcookiejarokhttp, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i7 = onExtraCallbackWithResult + 83;
                            onNavigationEvent = i7 % 128;
                            if (i7 % 2 != 0) {
                                return unit$r8$lambda$7kPB9gb8c_vCXqLn3pb81IWfNzY;
                            }
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                    });
                }
                return null;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = IAuthTabCallback;
            int i5 = i4 + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z = eventlistener instanceof x509TrustManager;
                throw null;
            }
            if (eventlistener instanceof x509TrustManager) {
                int i6 = i4 + 65;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                x509trustmanager = (x509TrustManager) eventlistener;
            } else {
                x509trustmanager = null;
            }
            if (x509trustmanager != null) {
                return ForwardingCameraControl.onExtraCallbackWithResult(1510208588, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$RightType$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        Unit unitM87$r8$lambda$ezeMelP5si8bcTUhIqY8fCr6ic;
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 97;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            unitM87$r8$lambda$ezeMelP5si8bcTUhIqY8fCr6ic = TdsTopV2View.IAuthTabCallback.m87$r8$lambda$ezeMelP5si8bcTUhIqY8fCr6ic(x509trustmanager, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i9 = 64 / 0;
                        } else {
                            unitM87$r8$lambda$ezeMelP5si8bcTUhIqY8fCr6ic = TdsTopV2View.IAuthTabCallback.m87$r8$lambda$ezeMelP5si8bcTUhIqY8fCr6ic(x509trustmanager, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        int i10 = onWarmupCompleted + 119;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unitM87$r8$lambda$ezeMelP5si8bcTUhIqY8fCr6ic;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                });
            }
            int i7 = onWarmupCompleted + 109;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toRightItem$lambda$0$0$0(getDispatcherokhttp getdispatcherokhttp, getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 47;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                if ((i & 86) == 0) {
                    i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ^ true ? 2 : 4;
                }
            } else {
                Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                if ((i & 6) == 0) {
                }
            }
            boolean z = false;
            if ((i & 19) != 18) {
                int i4 = onWarmupCompleted + 75;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    z = true;
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i5 = onWarmupCompleted + 71;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1859464275, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.RightType.toRightItem.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:356)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1859464275, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.RightType.toRightItem.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:356)");
                }
                eventListenerFactory.onExtraCallback(appLovinNativeAdImplExternalSyntheticLambda1, (eventListener) getdispatcherokhttp.onWarmupCompleted().onExtraCallbackWithResult(), onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, i & 14);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toRightItem$lambda$0$0(final getDispatcherokhttp getdispatcherokhttp, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
                int i6 = IAuthTabCallback + 75;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1752429310, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.RightType.toRightItem.<anonymous>.<anonymous> (TdsTopV2View.kt:349)");
                    int i8 = IAuthTabCallback + 45;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                }
                final getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackDefault = (getPrivacyDestinationUri.onExtraCallbackWithResult) getdispatcherokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult();
                if (onextracallbackwithresultIAuthTabCallbackDefault == null) {
                    int i10 = IAuthTabCallback + 63;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    onextracallbackwithresultIAuthTabCallbackDefault = getPrivacyDestinationUri.onExtraCallbackWithResult.C0021onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault();
                }
                float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) getdispatcherokhttp.asInterface().onExtraCallbackWithResult()).IAuthTabCallback();
                int i12 = ((i2 << 21) & 29360128) | 1572864;
                getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult = onextracallbackwithresultIAuthTabCallbackDefault;
                rightPreset.onExtraCallback(null, onextracallbackwithresult, (getBacktraceNote) getdispatcherokhttp.asBinder().onExtraCallbackWithResult(), ((setByteOrder) ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttp}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent())).onExtraCallbackWithResult()).access100(), fIAuthTabCallback, (Function0) getdispatcherokhttp.IAuthTabCallback().onExtraCallbackWithResult(), ForwardingCameraControl.onExtraCallback(1859464275, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$RightType$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i13 = 2 % 2;
                        int i14 = onWarmupCompleted + 85;
                        onExtraCallback = i14 % 128;
                        int i15 = i14 % 2;
                        getDispatcherokhttp getdispatcherokhttp2 = getdispatcherokhttp;
                        if (i15 != 0) {
                            return TdsTopV2View.IAuthTabCallback.$r8$lambda$SaXodPL38oEARRPT1zZKQG4DUWg(getdispatcherokhttp2, onextracallbackwithresultIAuthTabCallbackDefault, (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        TdsTopV2View.IAuthTabCallback.$r8$lambda$SaXodPL38oEARRPT1zZKQG4DUWg(getdispatcherokhttp2, onextracallbackwithresultIAuthTabCallbackDefault, (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, i12, 1);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toRightItem$lambda$1$0(getCookieJarokhttp getcookiejarokhttp, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2;
            long jAccess100;
            int i3;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
                int i5 = IAuthTabCallback + 45;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i7 = onWarmupCompleted + 101;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i2 = i | i3;
            } else {
                i2 = i;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2136902292, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.RightType.toRightItem.<anonymous>.<anonymous> (TdsTopV2View.kt:365)");
                }
                handleNativeAdClick.onExtraCallback onextracallback = (handleNativeAdClick.onExtraCallback) getcookiejarokhttp.getInterfaceDescriptor().onExtraCallbackWithResult();
                Object objOnExtraCallbackWithResult = ((getSupportedHighSpeedResolutionsFor) getCookieJarokhttp.IAuthTabCallback(new Object[]{getcookiejarokhttp}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 1351605746, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1351605744)).onExtraCallbackWithResult();
                Object obj = null;
                if (onextracallback == null || objOnExtraCallbackWithResult == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(452350126);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    int i9 = IAuthTabCallback + 51;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(451136383);
                    Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(context);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(objOnExtraCallbackWithResult);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = deprecated_dispatcher.onWarmupCompleted(deprecated_eventListenerFactory.Companion, context, objOnExtraCallbackWithResult);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    deprecated_eventListenerFactory deprecated_eventlistenerfactory = (deprecated_eventListenerFactory) objOnMinimized;
                    getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote = (getBacktraceNote) getcookiejarokhttp.IAuthTabCallback().onExtraCallbackWithResult();
                    Object objOnExtraCallbackWithResult2 = getcookiejarokhttp.onExtraCallbackWithResult().onExtraCallbackWithResult();
                    if (((setByteOrder) objOnExtraCallbackWithResult2).access100() == 16) {
                        objOnExtraCallbackWithResult2 = null;
                    }
                    setByteOrder setbyteorder = (setByteOrder) objOnExtraCallbackWithResult2;
                    if (setbyteorder == null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(568763210);
                        jAccess100 = setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, 48);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i11 = onWarmupCompleted + 91;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(568759614);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        jAccess100 = setbyteorder.access100();
                    }
                    rightPreset.onExtraCallback(objOnExtraCallbackWithResult, deprecated_eventlistenerfactory, onextracallback, null, ((setByteOrder) getcookiejarokhttp.asInterface().onExtraCallbackWithResult()).access100(), ((Number) getcookiejarokhttp.IAuthTabCallbackStub().onExtraCallbackWithResult()).intValue(), ((Number) getcookiejarokhttp.IAuthTabCallbackDefault().onExtraCallbackWithResult()).floatValue(), jAccess100, getbacktracenote, ((VirtualCameraControlExternalSyntheticLambda1) getcookiejarokhttp.onExtraCallback().onExtraCallbackWithResult()).IAuthTabCallback(), (Function0) getcookiejarokhttp.asBinder().onExtraCallbackWithResult(), (String) getcookiejarokhttp.onWarmupCompleted().onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0, (i2 << 6) & 896, 8);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = onWarmupCompleted + 13;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit toRightItem$lambda$2$0$0(x509TrustManager x509trustmanager, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            hasProvider hasprovider;
            setCallToAction.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
            setCallToAction.onExtraCallback onextracallbackOnWarmupCompleted;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
            setCallToAction.onNavigationEvent onnavigationeventOnExtraCallbackWithResult;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 35;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 2) == 3) {
                z = false;
            } else {
                int i5 = i3 + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                int i7 = IAuthTabCallback + 11;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 0;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-142555512, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.RightType.toRightItem.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:396)");
                    }
                    hasprovider = (hasProvider) x509trustmanager.IAuthTabCallback_Parcel().onExtraCallbackWithResult();
                    if (hasprovider == null) {
                        hasprovider = new hasProvider("", (List) null, 2, (DefaultConstructorMarker) null);
                    }
                    hasProvider hasprovider2 = hasprovider;
                    Function0<Unit> function0 = (Function0) x509trustmanager.onTransact().onExtraCallbackWithResult();
                    onwarmupcompletedIAuthTabCallback = (setCallToAction.onWarmupCompleted) x509trustmanager.onWarmupCompleted().onExtraCallbackWithResult();
                    if (onwarmupcompletedIAuthTabCallback == null) {
                        onwarmupcompletedIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        int i9 = IAuthTabCallback + 63;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    setCallToAction.onWarmupCompleted onwarmupcompleted = onwarmupcompletedIAuthTabCallback;
                    onextracallbackOnWarmupCompleted = (setCallToAction.onExtraCallback) x509trustmanager.asInterface().onExtraCallbackWithResult();
                    if (onextracallbackOnWarmupCompleted == null) {
                        onextracallbackOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
                    }
                    setCallToAction.onExtraCallback onextracallback = onextracallbackOnWarmupCompleted;
                    iAuthTabCallbackOnExtraCallback = (setCallToAction.IAuthTabCallback) x509trustmanager.asBinder().onExtraCallbackWithResult();
                    if (iAuthTabCallbackOnExtraCallback == null) {
                        iAuthTabCallbackOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                    }
                    setCallToAction.IAuthTabCallback iAuthTabCallback = iAuthTabCallbackOnExtraCallback;
                    onnavigationeventOnExtraCallbackWithResult = (setCallToAction.onNavigationEvent) x509trustmanager.onExtraCallbackWithResult().onExtraCallbackWithResult();
                    if (onnavigationeventOnExtraCallbackWithResult == null) {
                        int i11 = IAuthTabCallback + 1;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        onnavigationeventOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
                    }
                    setCallToAction.onNavigationEvent onnavigationevent = onnavigationeventOnExtraCallbackWithResult;
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) x509trustmanager.IAuthTabCallbackStub().onExtraCallbackWithResult();
                    boolean zBooleanValue = ((Boolean) x509trustmanager.IAuthTabCallbackStubProxy().onExtraCallbackWithResult()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) x509trustmanager.getInterfaceDescriptor().onExtraCallbackWithResult()).booleanValue();
                    int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                    rightPreset.onNavigationEvent(hasprovider2, (QuirksExternalSyntheticBackport0) null, function0, (Function0<Unit>) ((getSupportedHighSpeedResolutionsFor) x509TrustManager.onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{x509trustmanager}, -1039469773, 1039469774, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback)).onExtraCallbackWithResult(), onwarmupcompleted, onextracallback, iAuthTabCallback, onnavigationevent, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, zBooleanValue, zBooleanValue2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 2);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    hasprovider = (hasProvider) x509trustmanager.IAuthTabCallback_Parcel().onExtraCallbackWithResult();
                    if (hasprovider == null) {
                    }
                    hasProvider hasprovider22 = hasprovider;
                    Function0<Unit> function02 = (Function0) x509trustmanager.onTransact().onExtraCallbackWithResult();
                    onwarmupcompletedIAuthTabCallback = (setCallToAction.onWarmupCompleted) x509trustmanager.onWarmupCompleted().onExtraCallbackWithResult();
                    if (onwarmupcompletedIAuthTabCallback == null) {
                    }
                    setCallToAction.onWarmupCompleted onwarmupcompleted2 = onwarmupcompletedIAuthTabCallback;
                    onextracallbackOnWarmupCompleted = (setCallToAction.onExtraCallback) x509trustmanager.asInterface().onExtraCallbackWithResult();
                    if (onextracallbackOnWarmupCompleted == null) {
                    }
                    setCallToAction.onExtraCallback onextracallback2 = onextracallbackOnWarmupCompleted;
                    iAuthTabCallbackOnExtraCallback = (setCallToAction.IAuthTabCallback) x509trustmanager.asBinder().onExtraCallbackWithResult();
                    if (iAuthTabCallbackOnExtraCallback == null) {
                    }
                    setCallToAction.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallbackOnExtraCallback;
                    onnavigationeventOnExtraCallbackWithResult = (setCallToAction.onNavigationEvent) x509trustmanager.onExtraCallbackWithResult().onExtraCallbackWithResult();
                    if (onnavigationeventOnExtraCallbackWithResult == null) {
                    }
                    setCallToAction.onNavigationEvent onnavigationevent2 = onnavigationeventOnExtraCallbackWithResult;
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) x509trustmanager.IAuthTabCallbackStub().onExtraCallbackWithResult();
                    boolean zBooleanValue3 = ((Boolean) x509trustmanager.IAuthTabCallbackStubProxy().onExtraCallbackWithResult()).booleanValue();
                    boolean zBooleanValue22 = ((Boolean) x509trustmanager.getInterfaceDescriptor().onExtraCallbackWithResult()).booleanValue();
                    int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                    rightPreset.onNavigationEvent(hasprovider22, (QuirksExternalSyntheticBackport0) null, function02, (Function0<Unit>) ((getSupportedHighSpeedResolutionsFor) x509TrustManager.onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{x509trustmanager}, -1039469773, 1039469774, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2)).onExtraCallbackWithResult(), onwarmupcompleted2, onextracallback2, iAuthTabCallback2, onnavigationevent2, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, zBooleanValue3, zBooleanValue22, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 2);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toRightItem$lambda$2$0(final x509TrustManager x509trustmanager, final RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i4 = onWarmupCompleted + 77;
                    IAuthTabCallback = i4 % 128;
                    i2 = i4 % 2 == 0 ? 5 : 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
            if ((i & 19) != 18) {
                int i5 = IAuthTabCallback + 57;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onWarmupCompleted + 83;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1510208588, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.RightType.toRightItem.<anonymous>.<anonymous> (TdsTopV2View.kt:394)");
                }
                final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult = (setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback());
                OkHttpClientBuilder.IAuthTabCallback(x509trustmanager, ForwardingCameraControl.onExtraCallback(-142555512, true, new Function2() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$RightType$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 59;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitM88$r8$lambda$g8TO_nahJ0yZvhDXzD2W5B0PWs = TdsTopV2View.IAuthTabCallback.m88$r8$lambda$g8TO_nahJ0yZvhDXzD2W5B0PWs(x509trustmanager, onextracallbackwithresult, rightPreset, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i12 = onExtraCallback + 65;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        return unitM88$r8$lambda$g8TO_nahJ0yZvhDXzD2W5B0PWs;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onNavigationEvent TINY_BUTTON = new onNavigationEvent("TINY_BUTTON", 0);
        public static final onNavigationEvent TWO_BUTTON = new onNavigationEvent("TWO_BUTTON", 1);
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public static final /* synthetic */ class onExtraCallback {
            public static final /* synthetic */ int[] IAuthTabCallback;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            static {
                int[] iArr = new int[onNavigationEvent.values().length];
                try {
                    iArr[onNavigationEvent.TINY_BUTTON.ordinal()] = 1;
                    int i = onNavigationEvent + 75;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onNavigationEvent.TWO_BUTTON.ordinal()] = 2;
                    int i3 = onExtraCallbackWithResult + 9;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                IAuthTabCallback = iArr;
            }
        }

        public static /* synthetic */ Unit $r8$lambda$P0SSPtazLaC521QQco7ggXKVC1I(x509TrustManager x509trustmanager, y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit lowerItem$lambda$0$0$0 = toLowerItem$lambda$0$0$0(x509trustmanager, y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return lowerItem$lambda$0$0$0;
        }

        /* renamed from: $r8$lambda$lL55ijVS5kpUAbV7MHtPzCa-y1E, reason: not valid java name */
        public static /* synthetic */ Unit m93$r8$lambda$lL55ijVS5kpUAbV7MHtPzCay1E(getAuthenticatorokhttp getauthenticatorokhttp, y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Unit lowerItem$lambda$1$0 = toLowerItem$lambda$1$0(getauthenticatorokhttp, y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return lowerItem$lambda$1$0;
        }

        public static /* synthetic */ Unit $r8$lambda$ypBzpSFnwd1kSqxbS63SCTMCSxU(x509TrustManager x509trustmanager, y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit lowerItem$lambda$0$0 = toLowerItem$lambda$0$0(x509trustmanager, y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, i);
            if (i4 != 0) {
                int i5 = 15 / 0;
            }
            int i6 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 63 / 0;
            }
            return lowerItem$lambda$0$0;
        }

        private static final /* synthetic */ onNavigationEvent[] $values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 115;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onNavigationEvent onnavigationevent = TINY_BUTTON;
                onNavigationEvent onnavigationevent2 = TWO_BUTTON;
                onnavigationeventArr = new onNavigationEvent[3];
                onnavigationeventArr[0] = onnavigationevent;
                onnavigationeventArr[1] = onnavigationevent2;
            } else {
                onnavigationeventArr = new onNavigationEvent[]{TINY_BUTTON, TWO_BUTTON};
            }
            int i4 = i2 + 53;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationeventArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onWarmupCompleted + 5;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> toLowerItem$tds_view_compat_release(@Nullable eventListener eventlistener) throws NoWhenBranchMatchedException {
            int i;
            final x509TrustManager x509trustmanager;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0 ? (i = onExtraCallback.IAuthTabCallback[ordinal()]) == 1 : (i = onExtraCallback.IAuthTabCallback[ordinal()]) == 0) {
                if (!(eventlistener instanceof x509TrustManager)) {
                    x509trustmanager = null;
                } else {
                    int i4 = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    x509trustmanager = (x509TrustManager) eventlistener;
                }
                if (x509trustmanager != null) {
                    return ForwardingCameraControl.onExtraCallbackWithResult(915645807, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$LowerType$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i6 = 2 % 2;
                            int i7 = onNavigationEvent + 19;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unit$r8$lambda$ypBzpSFnwd1kSqxbS63SCTMCSxU = TdsTopV2View.onNavigationEvent.$r8$lambda$ypBzpSFnwd1kSqxbS63SCTMCSxU(x509trustmanager, (y1ExternalSyntheticLambda4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i9 = onNavigationEvent + 43;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            return unit$r8$lambda$ypBzpSFnwd1kSqxbS63SCTMCSxU;
                        }
                    });
                }
                return null;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            final getAuthenticatorokhttp getauthenticatorokhttp = eventlistener instanceof getAuthenticatorokhttp ? (getAuthenticatorokhttp) eventlistener : null;
            if (getauthenticatorokhttp == null) {
                return null;
            }
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1314282450, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$LowerType$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 101;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    getAuthenticatorokhttp getauthenticatorokhttp2 = getauthenticatorokhttp;
                    y1ExternalSyntheticLambda4 y1externalsyntheticlambda4 = (y1ExternalSyntheticLambda4) obj;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (i8 != 0) {
                        return TdsTopV2View.onNavigationEvent.m93$r8$lambda$lL55ijVS5kpUAbV7MHtPzCay1E(getauthenticatorokhttp2, y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    }
                    TdsTopV2View.onNavigationEvent.m93$r8$lambda$lL55ijVS5kpUAbV7MHtPzCay1E(getauthenticatorokhttp2, y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
            });
            int i6 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult;
        }

        private static final Unit toLowerItem$lambda$0$0$0(x509TrustManager x509trustmanager, y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            boolean z;
            String strOnTransact;
            setCallToAction.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
            int i2 = 2 % 2;
            if ((i & 3) != 2) {
                z = true;
            } else {
                int i3 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                int i5 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    obj.hashCode();
                    throw null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(878171819, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.LowerType.toLowerItem.<anonymous>.<anonymous>.<anonymous> (TdsTopV2View.kt:425)");
                }
                setCallToAction.onExtraCallbackWithResult onextracallbackwithresult = (setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback());
                hasProvider hasprovider = (hasProvider) x509trustmanager.IAuthTabCallback_Parcel().onExtraCallbackWithResult();
                if (hasprovider == null || (strOnTransact = hasprovider.onTransact()) == null) {
                    strOnTransact = "";
                }
                Function0<Unit> function0 = (Function0) x509trustmanager.onTransact().onExtraCallbackWithResult();
                setCallToAction.onWarmupCompleted onwarmupcompleted = (setCallToAction.onWarmupCompleted) x509trustmanager.onWarmupCompleted().onExtraCallbackWithResult();
                if (onwarmupcompleted == null) {
                    int i6 = onExtraCallbackWithResult + 1;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        onextracallbackwithresult.IAuthTabCallback();
                        obj.hashCode();
                        throw null;
                    }
                    onwarmupcompletedIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                } else {
                    onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
                }
                setCallToAction.onExtraCallback onextracallbackOnWarmupCompleted = (setCallToAction.onExtraCallback) x509trustmanager.asInterface().onExtraCallbackWithResult();
                if (onextracallbackOnWarmupCompleted == null) {
                    onextracallbackOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
                }
                setCallToAction.onExtraCallback onextracallback = onextracallbackOnWarmupCompleted;
                setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallback = (setCallToAction.IAuthTabCallback) x509trustmanager.asBinder().onExtraCallbackWithResult();
                if (iAuthTabCallbackOnExtraCallback == null) {
                    int i7 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        onextracallbackwithresult.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    iAuthTabCallbackOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                }
                setCallToAction.IAuthTabCallback iAuthTabCallback = iAuthTabCallbackOnExtraCallback;
                setCallToAction.onNavigationEvent onnavigationevent = (setCallToAction.onNavigationEvent) x509trustmanager.onExtraCallbackWithResult().onExtraCallbackWithResult();
                y1externalsyntheticlambda4.onNavigationEvent(strOnTransact, null, (Function0) ((getSupportedHighSpeedResolutionsFor) x509TrustManager.onNavigationEvent(AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{x509trustmanager}, -1039469773, 1039469774, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback())).onExtraCallbackWithResult(), function0, iAuthTabCallback, onwarmupcompletedIAuthTabCallback, onextracallback, onnavigationevent == null ? onextracallbackwithresult.onExtraCallbackWithResult() : onnavigationevent, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) x509trustmanager.IAuthTabCallbackStub().onExtraCallbackWithResult(), ((Boolean) x509trustmanager.IAuthTabCallbackStubProxy().onExtraCallbackWithResult()).booleanValue(), ((Boolean) x509trustmanager.getInterfaceDescriptor().onExtraCallbackWithResult()).booleanValue(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = IAuthTabCallback + 99;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toLowerItem$lambda$0$0(final x509TrustManager x509trustmanager, final y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
            if ((i & 6) == 0) {
                int i3 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4) ? 4 : 2;
            }
            if ((i & 19) != 18) {
                int i5 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(915645807, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.LowerType.toLowerItem.<anonymous>.<anonymous> (TdsTopV2View.kt:424)");
                }
                OkHttpClientBuilder.IAuthTabCallback(x509trustmanager, ForwardingCameraControl.onExtraCallback(878171819, true, new Function2() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$LowerType$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 125;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unit$r8$lambda$P0SSPtazLaC521QQco7ggXKVC1I = TdsTopV2View.onNavigationEvent.$r8$lambda$P0SSPtazLaC521QQco7ggXKVC1I(x509trustmanager, y1externalsyntheticlambda4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i10 = onExtraCallbackWithResult + 123;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unit$r8$lambda$P0SSPtazLaC521QQco7ggXKVC1I;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit toLowerItem$lambda$1$0(getAuthenticatorokhttp getauthenticatorokhttp, y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
            Object obj = null;
            if ((i & 6) == 0) {
                int i4 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4);
                    obj.hashCode();
                    throw null;
                }
                if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4))) {
                    int i5 = IAuthTabCallback + 57;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    int i7 = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 2;
                }
                i |= i2;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
                int i9 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = IAuthTabCallback + 59;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1314282450, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.LowerType.toLowerItem.<anonymous>.<anonymous> (TdsTopV2View.kt:447)");
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1314282450, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.LowerType.toLowerItem.<anonymous>.<anonymous> (TdsTopV2View.kt:447)");
                }
                getauthenticatorokhttp.onExtraCallbackWithResult().invoke(y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 14));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(TdsTopV2View tdsTopV2View, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> rightItem$tds_view_compat_release;
        onExtraCallbackWithResult onextracallbackwithresult;
        onTransact ontransact;
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 99;
        onPostMessage = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 5) != 3, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1406818755, i, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.TdsContent.<anonymous> (TdsTopV2View.kt:563)");
            }
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedWriteTypedObject = tdsTopV2View.writeTypedObject();
            getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> subtitleComposable$tds_view_compat_release = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            eventListener eventlistener = (eventListener) tdsTopV2View.onActivityResized.onExtraCallbackWithResult();
            getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> upperItem$tds_view_compat_release = (eventlistener == null || (ontransact = (onTransact) tdsTopV2View.onMinimized.onExtraCallbackWithResult()) == null) ? null : ontransact.toUpperItem$tds_view_compat_release(eventlistener);
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) tdsTopV2View.asBinder.onExtraCallbackWithResult();
            if (iAuthTabCallback != null) {
                int i4 = onPostMessage + 33;
                onActivityLayout = i4 % 128;
                if (i4 % 2 == 0) {
                    iAuthTabCallback.toRightItem$tds_view_compat_release((eventListener) tdsTopV2View.IAuthTabCallbackStub.onExtraCallbackWithResult());
                    subtitleComposable$tds_view_compat_release.hashCode();
                    throw null;
                }
                rightItem$tds_view_compat_release = iAuthTabCallback.toRightItem$tds_view_compat_release((eventListener) tdsTopV2View.IAuthTabCallbackStub.onExtraCallbackWithResult());
            } else {
                rightItem$tds_view_compat_release = null;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) tdsTopV2View.onNavigationEvent.onExtraCallbackWithResult();
            getBacktraceNote<y1ExternalSyntheticLambda4, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> lowerItem$tds_view_compat_release = onnavigationevent != null ? onnavigationevent.toLowerItem$tds_view_compat_release((eventListener) tdsTopV2View.IAuthTabCallback.onExtraCallbackWithResult()) : null;
            y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent2 = (y1ExternalSyntheticLambda0.onNavigationEvent) tdsTopV2View.ICustomTabsCallback.onExtraCallbackWithResult();
            getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> titleComposable$tds_view_compat_release = ((IAuthTabCallbackStub) tdsTopV2View.writeTypedObject.onExtraCallbackWithResult()).toTitleComposable$tds_view_compat_release((eventListener) tdsTopV2View.extraCallbackWithResult.onExtraCallbackWithResult(), (CharSequence) tdsTopV2View.extraCallback.onExtraCallbackWithResult(), (String) tdsTopV2View.asInterface.onExtraCallbackWithResult());
            if (titleComposable$tds_view_compat_release == null) {
                titleComposable$tds_view_compat_release = networkInterceptors.IAuthTabCallback.IAuthTabCallback();
            }
            getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = titleComposable$tds_view_compat_release;
            y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) tdsTopV2View.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
            y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult3 = (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) tdsTopV2View.getInterfaceDescriptor.onExtraCallbackWithResult();
            eventListener eventlistener2 = (eventListener) tdsTopV2View.access100.onExtraCallbackWithResult();
            getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> subtitleComposable$tds_view_compat_release2 = (eventlistener2 == null || (onextracallbackwithresult = (onExtraCallbackWithResult) tdsTopV2View.readTypedObject.onExtraCallbackWithResult()) == null) ? null : onextracallbackwithresult.toSubtitleComposable$tds_view_compat_release(eventlistener2);
            eventListener eventlistener3 = (eventListener) tdsTopV2View.access000.onExtraCallbackWithResult();
            if (eventlistener3 != null) {
                int i5 = onActivityLayout + 39;
                onPostMessage = i5 % 128;
                int i6 = i5 % 2;
                onExtraCallbackWithResult onextracallbackwithresult4 = (onExtraCallbackWithResult) tdsTopV2View.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
                if (onextracallbackwithresult4 != null) {
                    int i7 = onActivityLayout + 121;
                    onPostMessage = i7 % 128;
                    int i8 = i7 % 2;
                    subtitleComposable$tds_view_compat_release = onextracallbackwithresult4.toSubtitleComposable$tds_view_compat_release(eventlistener3);
                }
            }
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(getbacktracenote, quirksExternalSyntheticBackport0OnExtraCallback, onnavigationevent2, subtitleComposable$tds_view_compat_release, onextracallbackwithresult2, subtitleComposable$tds_view_compat_release2, onextracallbackwithresult3, rightItem$tds_view_compat_release, onwarmupcompletedWriteTypedObject, upperItem$tds_view_compat_release, lowerItem$tds_view_compat_release, ((VirtualCameraControlExternalSyntheticLambda1) tdsTopV2View.onMessageChannelReady.onExtraCallbackWithResult()).IAuthTabCallback(), ((VirtualCameraControlExternalSyntheticLambda1) tdsTopV2View.onWarmupCompleted.onExtraCallbackWithResult()).IAuthTabCallback(), tdsTopV2View.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onActivityLayout + 27;
                onPostMessage = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    @Override // im.toss.tds.view.compat.component.TdsComposeView
    public void onExtraCallbackWithResult(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1849785987);
        if ((i & 6) == 0) {
            int i4 = onPostMessage + 39;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            i2 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2 : 4) | i;
        } else {
            int i6 = onPostMessage + 33;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onPostMessage + 109;
                onActivityLayout = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1849785987, i2, -1, "im.toss.tds.view.compat.component.compound.top.TdsTopV2View.TdsContent (TdsTopV2View.kt:555)");
            }
            setPostviewFormatSelector.onNavigationEvent(RemoveCompoundPaddingsKt.onExtraCallbackWithResult().onExtraCallback(extraCallbackWithResult() ^ true ? RemoveCompoundPaddings.Companion.IAuthTabCallback() : RemoveCompoundPaddings.Companion.onExtraCallbackWithResult()), ForwardingCameraControl.onExtraCallback(-1406818755, true, new Function2() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 59;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    TdsTopV2View tdsTopV2View = this.f$0;
                    if (i12 != 0) {
                        return TdsTopV2View.onNavigationEvent(tdsTopV2View, quirksExternalSyntheticBackport0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    TdsTopV2View.onNavigationEvent(tdsTopV2View, quirksExternalSyntheticBackport0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.view.compat.component.compound.top.TdsTopV2View$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitOnWarmupCompleted;
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 67;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        unitOnWarmupCompleted = TdsTopV2View.onWarmupCompleted(this.f$0, quirksExternalSyntheticBackport0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i12 = 33 / 0;
                    } else {
                        unitOnWarmupCompleted = TdsTopV2View.onWarmupCompleted(this.f$0, quirksExternalSyntheticBackport0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i13 = onExtraCallback + 65;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    public final void setOnClickListener(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onPostMessage + 31;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallbackWithResult = function0;
        int i4 = onPostMessage + 117;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setUpperType(@Nullable onTransact ontransact) {
        Object getdispatcherokhttp;
        int i = 2 % 2;
        this.onMinimized.IAuthTabCallback(ontransact);
        getSupportedHighSpeedResolutionsFor<eventListener> getsupportedhighspeedresolutionsfor = this.onActivityResized;
        int i2 = ontransact == null ? -1 : asBinder.onWarmupCompleted[ontransact.ordinal()];
        if (i2 != 1) {
            int i3 = onPostMessage + 103;
            onActivityLayout = i3 % 128;
            if (i3 % 2 != 0 ? i2 == 2 : i2 == 4) {
                getdispatcherokhttp = new getCookieJarokhttp(newWebSocket.onWarmupCompleted(this, MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent), null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
            } else {
                getdispatcherokhttp = null;
                if (i2 == 3) {
                    getdispatcherokhttp = new addInterceptor(null, 1, null);
                }
            }
        } else {
            getdispatcherokhttp = new getDispatcherokhttp(newWebSocket.onWarmupCompleted(this, MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent), null, null, null, null, null, 62, null);
            int i4 = onActivityLayout + 85;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getdispatcherokhttp);
    }

    public final void setSubtitle1Type(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        Object getminwebsocketmessagetocompressokhttp;
        int i = 2 % 2;
        this.IAuthTabCallback_Parcel.IAuthTabCallback(onextracallbackwithresult);
        getSupportedHighSpeedResolutionsFor<eventListener> getsupportedhighspeedresolutionsfor = this.access000;
        int i2 = onextracallbackwithresult == null ? -1 : asBinder.IAuthTabCallback[onextracallbackwithresult.ordinal()];
        if (i2 != 1) {
            int i3 = onActivityLayout + 107;
            int i4 = i3 % 128;
            onPostMessage = i4;
            getminwebsocketmessagetocompressokhttp = null;
            if (i3 % 2 == 0 ? i2 == 2 : i2 == 4) {
                getminwebsocketmessagetocompressokhttp = new addInterceptor(null, 1, null);
            } else {
                int i5 = i4 + 83;
                onActivityLayout = i5 % 128;
                int i6 = i5 % 2;
                if (i2 == 3) {
                    getminwebsocketmessagetocompressokhttp = new getFollowRedirectsokhttp((hasProvider) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 8191, (DefaultConstructorMarker) null);
                    int i7 = onActivityLayout + 47;
                    onPostMessage = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        } else {
            getminwebsocketmessagetocompressokhttp = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getminwebsocketmessagetocompressokhttp);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setSubtitle1TextSize(@NotNull onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onExtraCallbackWithResult2;
        int i = 2 % 2;
        int i2 = onActivityLayout + 115;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        getSupportedHighSpeedResolutionsFor<y1ExternalSyntheticLambda0.onExtraCallbackWithResult> getsupportedhighspeedresolutionsfor = this.IAuthTabCallbackStubProxy;
        int i4 = asBinder.onExtraCallback[onwarmupcompleted.ordinal()];
        if (i4 == 1) {
            onExtraCallbackWithResult2 = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult();
        } else if (i4 == 2) {
            onExtraCallbackWithResult2 = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
            int i5 = onActivityLayout + 43;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onExtraCallbackWithResult2 = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback();
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(onExtraCallbackWithResult2);
    }

    public final void setSubtitle2Type(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        int i;
        int i2 = 2 % 2;
        this.readTypedObject.IAuthTabCallback(onextracallbackwithresult);
        getSupportedHighSpeedResolutionsFor<eventListener> getsupportedhighspeedresolutionsfor = this.access100;
        Object getminwebsocketmessagetocompressokhttp = null;
        if (onextracallbackwithresult == null) {
            int i3 = onPostMessage;
            int i4 = i3 + 99;
            onActivityLayout = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 107;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            i = -1;
        } else {
            i = asBinder.IAuthTabCallback[onextracallbackwithresult.ordinal()];
            int i7 = onPostMessage + 111;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
        }
        if (i == 1) {
            getminwebsocketmessagetocompressokhttp = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
            int i9 = onPostMessage + 19;
            onActivityLayout = i9 % 128;
            int i10 = i9 % 2;
        } else if (i == 2) {
            getminwebsocketmessagetocompressokhttp = new addInterceptor(null, 1, null);
        } else if (i == 3) {
            getminwebsocketmessagetocompressokhttp = new getFollowRedirectsokhttp((hasProvider) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 8191, (DefaultConstructorMarker) null);
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getminwebsocketmessagetocompressokhttp);
        int i11 = onActivityLayout + 1;
        onPostMessage = i11 % 128;
        int i12 = i11 % 2;
    }

    public final void setSubtitle2Text(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 111;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        eventListener eventlistener = (eventListener) this.access100.onExtraCallbackWithResult();
        if (eventlistener != null) {
            int i4 = onActivityLayout + 23;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            callTimeout.onNavigationEvent(eventlistener, str);
            if (i5 != 0) {
                int i6 = 87 / 0;
            }
        }
    }

    public final void setSubtitle1Text(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 107;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        eventListener eventlistener = (eventListener) this.access000.onExtraCallbackWithResult();
        if (eventlistener != null) {
            callTimeout.onNavigationEvent(eventlistener, str);
            int i4 = onPostMessage + 59;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setSubtitle1Text(@NotNull hasProvider hasprovider) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        eventListener eventlistener = (eventListener) this.access000.onExtraCallbackWithResult();
        if (eventlistener != null) {
            int i2 = onActivityLayout + 15;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            callTimeout.onExtraCallback(eventlistener, hasprovider);
            int i4 = onPostMessage + 25;
            onActivityLayout = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
        }
    }

    public final void setSubtitle2Text(@NotNull hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = onPostMessage + 109;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(hasprovider, "");
        eventListener eventlistener = (eventListener) this.access100.onExtraCallbackWithResult();
        if (eventlistener != null) {
            int i3 = onActivityLayout + 27;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            callTimeout.onExtraCallback(eventlistener, hasprovider);
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = onPostMessage + 71;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void setSubtitle1TextColor(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 111;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        eventListener eventlistener = (eventListener) this.access000.onExtraCallbackWithResult();
        if (eventlistener != null) {
            callTimeout.onNavigationEvent(eventlistener, Integer.valueOf(i));
            int i5 = onActivityLayout + 45;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void setSubtitle2TextColor(int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 27;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        eventListener eventlistener = (eventListener) this.access100.onExtraCallbackWithResult();
        if (eventlistener != null) {
            callTimeout.IAuthTabCallback(eventlistener, setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(i)));
            int i4 = onPostMessage + 79;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* renamed from: setSubtitle1TextColor-8_81llA, reason: not valid java name */
    public final void m84setSubtitle1TextColor8_81llA(long j) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 17;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        eventListener eventlistener = (eventListener) this.access000.onExtraCallbackWithResult();
        if (eventlistener != null) {
            callTimeout.IAuthTabCallback(eventlistener, setByteOrder.onNavigationEvent(j));
            int i3 = onPostMessage + 53;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* renamed from: setSubtitle2TextColor-8_81llA, reason: not valid java name */
    public final void m85setSubtitle2TextColor8_81llA(long j) {
        int i = 2 % 2;
        int i2 = onPostMessage + 117;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        eventListener eventlistener = (eventListener) this.access100.onExtraCallbackWithResult();
        if (eventlistener != null) {
            callTimeout.IAuthTabCallback(eventlistener, setByteOrder.onNavigationEvent(j));
            int i3 = onPostMessage + 21;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setSubtitle2TextSize(@NotNull onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onExtraCallbackWithResult2;
        int i = 2 % 2;
        int i2 = onPostMessage + 23;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        getSupportedHighSpeedResolutionsFor<y1ExternalSyntheticLambda0.onExtraCallbackWithResult> getsupportedhighspeedresolutionsfor = this.getInterfaceDescriptor;
        int i4 = asBinder.onExtraCallback[onwarmupcompleted.ordinal()];
        if (i4 == 1) {
            onExtraCallbackWithResult2 = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult();
            int i5 = onActivityLayout + 95;
            onPostMessage = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 5;
            }
        } else if (i4 != 2) {
            int i7 = onPostMessage + 93;
            onActivityLayout = i7 % 128;
            if (i7 % 2 != 0 ? i4 != 3 : i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onExtraCallbackWithResult2 = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback();
        } else {
            onExtraCallbackWithResult2 = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(onExtraCallbackWithResult2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setTitleType(@NotNull IAuthTabCallbackStub iAuthTabCallbackStub) throws NoWhenBranchMatchedException {
        Object getminwebsocketmessagetocompressokhttp;
        int i = 2 % 2;
        int i2 = onPostMessage + 99;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        this.writeTypedObject.IAuthTabCallback(iAuthTabCallbackStub);
        getSupportedHighSpeedResolutionsFor<eventListener> getsupportedhighspeedresolutionsfor = this.extraCallbackWithResult;
        int i4 = asBinder.onNavigationEvent[iAuthTabCallbackStub.ordinal()];
        if (i4 == 1) {
            getminwebsocketmessagetocompressokhttp = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
        } else if (i4 != 2) {
            int i5 = onPostMessage + 1;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            if (i4 == 3) {
                getminwebsocketmessagetocompressokhttp = new getMinWebSocketMessageToCompressokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 65535, (DefaultConstructorMarker) null);
            } else {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                getminwebsocketmessagetocompressokhttp = new getFollowRedirectsokhttp((hasProvider) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 8191, (DefaultConstructorMarker) null);
            }
        } else {
            getminwebsocketmessagetocompressokhttp = new getDnsokhttp((hasProvider) null, 0L, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, (getSupportedHighSpeedResolutionsFor) null, 63, (DefaultConstructorMarker) null);
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getminwebsocketmessagetocompressokhttp);
    }

    public final void setTitleText(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 103;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        callTimeout.onNavigationEvent((eventListener) this.extraCallbackWithResult.onExtraCallbackWithResult(), str);
        int i4 = onActivityLayout + 67;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTitleText(@NotNull hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        callTimeout.onExtraCallback((eventListener) this.extraCallbackWithResult.onExtraCallbackWithResult(), hasprovider);
        int i4 = onPostMessage + 109;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: setTitleTextColor-8_81llA, reason: not valid java name */
    public final void m86setTitleTextColor8_81llA(long j) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 57;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        callTimeout.IAuthTabCallback((eventListener) this.extraCallbackWithResult.onExtraCallbackWithResult(), setByteOrder.onNavigationEvent(j));
        int i4 = onPostMessage + 105;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTitleTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 71;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            m86setTitleTextColor8_81llA(ByteOrderedDataOutputStream.onExtraCallback(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        m86setTitleTextColor8_81llA(ByteOrderedDataOutputStream.onExtraCallback(i));
        int i4 = onPostMessage + 1;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[PHI: r1
      0x004d: PHI (r1v7 o.getSupportedHighSpeedResolutionsFor<o.y1ExternalSyntheticLambda0$onNavigationEvent>) = 
      (r1v4 o.getSupportedHighSpeedResolutionsFor<o.y1ExternalSyntheticLambda0$onNavigationEvent>)
      (r1v8 o.getSupportedHighSpeedResolutionsFor<o.y1ExternalSyntheticLambda0$onNavigationEvent>)
     binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r5
      0x0030: PHI (r1v5 o.getSupportedHighSpeedResolutionsFor<o.y1ExternalSyntheticLambda0$onNavigationEvent>) = 
      (r1v4 o.getSupportedHighSpeedResolutionsFor<o.y1ExternalSyntheticLambda0$onNavigationEvent>)
      (r1v8 o.getSupportedHighSpeedResolutionsFor<o.y1ExternalSyntheticLambda0$onNavigationEvent>)
     binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r5v3 int) = (r5v2 int), (r5v11 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleTextSize(@NotNull onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        getSupportedHighSpeedResolutionsFor<y1ExternalSyntheticLambda0.onNavigationEvent> getsupportedhighspeedresolutionsfor;
        int i;
        y1ExternalSyntheticLambda0.onNavigationEvent onNavigationEvent2;
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 25;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            getsupportedhighspeedresolutionsfor = this.ICustomTabsCallback;
            i = asBinder.onExtraCallbackWithResult[onextracallback.ordinal()];
            if (i != 0) {
                int i4 = onActivityLayout + 93;
                onPostMessage = i4 % 128;
                if (i4 % 2 == 0 ? i != 2 : i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                onNavigationEvent2 = y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onNavigationEvent();
            } else {
                onNavigationEvent2 = y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback();
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            getsupportedhighspeedresolutionsfor = this.ICustomTabsCallback;
            i = asBinder.onExtraCallbackWithResult[onextracallback.ordinal()];
            if (i != 1) {
            }
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(onNavigationEvent2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setRightType(@Nullable IAuthTabCallback iAuthTabCallback) {
        Object x509trustmanager;
        Object objOnNavigationEvent;
        int i = 2 % 2;
        this.asBinder.IAuthTabCallback(iAuthTabCallback);
        getSupportedHighSpeedResolutionsFor<eventListener> getsupportedhighspeedresolutionsfor = this.IAuthTabCallbackStub;
        int i2 = iAuthTabCallback == null ? -1 : asBinder.IAuthTabCallbackStub[iAuthTabCallback.ordinal()];
        if (i2 != 1) {
            int i3 = onPostMessage + 75;
            int i4 = i3 % 128;
            onActivityLayout = i4;
            if (i3 % 2 != 0 ? i2 == 2 : i2 == 4) {
                getDispatcherokhttp getdispatcherokhttp = new getDispatcherokhttp(newWebSocket.onWarmupCompleted(this, MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent), null, null, null, null, null, 62, null);
                getSupportedHighSpeedResolutionsFor<getPrivacyDestinationUri.onExtraCallbackWithResult> getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = getdispatcherokhttp.onExtraCallbackWithResult();
                if (iAuthTabCallback == IAuthTabCallback.ASSET_V1_NONE_CROP_BIG) {
                    objOnNavigationEvent = getPrivacyDestinationUri.onExtraCallbackWithResult.C0021onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault();
                    int i5 = onActivityLayout + 65;
                    onPostMessage = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    objOnNavigationEvent = getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent();
                }
                getsupportedhighspeedresolutionsforOnExtraCallbackWithResult.IAuthTabCallback(objOnNavigationEvent);
                int i7 = onActivityLayout + 15;
                onPostMessage = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 % 4;
                }
                x509trustmanager = getdispatcherokhttp;
            } else {
                int i9 = i4 + 97;
                int i10 = i9 % 128;
                onPostMessage = i10;
                int i11 = i9 % 2;
                if (i2 != 3) {
                    int i12 = i10 + 75;
                    onActivityLayout = i12 % 128;
                    x509trustmanager = (i12 % 2 != 0 ? i2 == 4 : i2 == 5) ? new getCookieJarokhttp(newWebSocket.onWarmupCompleted(this, MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent), null, null, null, null, null, null, null, null, null, null, null, null, 8190, null) : null;
                }
            }
        } else {
            x509trustmanager = new x509TrustManager(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(x509trustmanager);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[PHI: r3
      0x0033: PHI (r3v8 o.getSupportedHighSpeedResolutionsFor<o.eventListener>) = 
      (r3v5 o.getSupportedHighSpeedResolutionsFor<o.eventListener>)
      (r3v10 o.getSupportedHighSpeedResolutionsFor<o.eventListener>)
     binds: [B:8:0x0026, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r3
      0x0028: PHI (r3v6 o.getSupportedHighSpeedResolutionsFor<o.eventListener>) = 
      (r3v5 o.getSupportedHighSpeedResolutionsFor<o.eventListener>)
      (r3v10 o.getSupportedHighSpeedResolutionsFor<o.eventListener>)
     binds: [B:8:0x0026, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setLowerType(@Nullable onNavigationEvent onnavigationevent) {
        getSupportedHighSpeedResolutionsFor<eventListener> getsupportedhighspeedresolutionsfor;
        int i;
        int i2 = 2 % 2;
        int i3 = onPostMessage + 123;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback(onnavigationevent);
            getsupportedhighspeedresolutionsfor = this.IAuthTabCallback;
            int i4 = 6 / 0;
            if (onnavigationevent == null) {
                int i5 = onPostMessage + 105;
                onActivityLayout = i5 % 128;
                int i6 = i5 % 2;
                i = -1;
            } else {
                i = asBinder.onTransact[onnavigationevent.ordinal()];
            }
        } else {
            this.onNavigationEvent.IAuthTabCallback(onnavigationevent);
            getsupportedhighspeedresolutionsfor = this.IAuthTabCallback;
            if (onnavigationevent == null) {
            }
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(i != 1 ? i != 2 ? null : new getAuthenticatorokhttp(networkInterceptors.IAuthTabCallback.onExtraCallback()) : new x509TrustManager(null, null, null, null, null, null, null, null, null, null, null, 2047, null));
    }

    public final void setLowerView(@NotNull getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.IAuthTabCallback.IAuthTabCallback(new getAuthenticatorokhttp(getbacktracenote));
        int i2 = onPostMessage + 105;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setUpperGap(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 83;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        this.onMessageChannelReady.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i)));
        int i5 = onPostMessage + 63;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
    }

    public final void setUpperGap(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 125;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor = this.onMessageChannelReady;
        if (i3 != 0) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f)));
        } else {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f)));
            throw null;
        }
    }

    public final void setLowerGap(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 91;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            this.onWarmupCompleted.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i)));
            int i4 = onPostMessage + 119;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.onWarmupCompleted.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i)));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLowerGap(float f) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 105;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f)));
        int i4 = onPostMessage + 33;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTitleRollingTextSuffix(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 59;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.asInterface.IAuthTabCallback(str);
        int i4 = onPostMessage + 19;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHorizontalPadding(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 57;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(true);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics);
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setPadding(iOnNavigationEvent, 0, varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics2), 0);
        int i4 = onActivityLayout + 97;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTitleContentDescription(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onPostMessage + 123;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        getSupportedHighSpeedResolutionsFor<CharSequence> getsupportedhighspeedresolutionsfor = this.extraCallback;
        if (charSequence == null) {
            int i5 = i3 + 69;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            charSequence = "";
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(charSequence);
    }

    private final bindChildren IAuthTabCallback(TypedArray typedArray, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onActivityLayout + 97;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            i2 = typedArray.getInt(i, -1);
            int i5 = 75 / 0;
            if (i2 == -1) {
                return null;
            }
        } else {
            i2 = typedArray.getInt(i, -1);
            if (i2 == -1) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (i2 == 0) {
            int i6 = onActivityLayout + 91;
            onPostMessage = i6 % 128;
            if (i6 % 2 != 0) {
                arrayList.add(bindChildren.Companion.onWarmupCompleted());
                int i7 = 53 / 0;
            } else {
                arrayList.add(bindChildren.Companion.onWarmupCompleted());
            }
        }
        bindChildren.onNavigationEvent onnavigationevent = bindChildren.Companion;
        if ((onnavigationevent.IAuthTabCallback().onWarmupCompleted() & i2) != 0) {
            int i8 = onActivityLayout + 7;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
            arrayList.add(onnavigationevent.IAuthTabCallback());
        }
        if ((i2 & onnavigationevent.onExtraCallback().onWarmupCompleted()) != 0) {
            arrayList.add(onnavigationevent.onExtraCallback());
        }
        bindChildren bindchildrenOnWarmupCompleted = onnavigationevent.onWarmupCompleted(arrayList);
        int i10 = onPostMessage + 41;
        onActivityLayout = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 26 / 0;
        }
        return bindchildrenOnWarmupCompleted;
    }

    public final getDispatcherokhttp access100() {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = this.onActivityResized.onExtraCallbackWithResult();
        Object obj = null;
        if (!(objOnExtraCallbackWithResult instanceof getDispatcherokhttp)) {
            int i2 = onActivityLayout + 69;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        getDispatcherokhttp getdispatcherokhttp = (getDispatcherokhttp) objOnExtraCallbackWithResult;
        int i4 = onPostMessage + 115;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return getdispatcherokhttp;
        }
        obj.hashCode();
        throw null;
    }

    public final getCookieJarokhttp IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onPostMessage + 77;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.onActivityResized.onExtraCallbackWithResult();
        Object obj = null;
        if (!(objOnExtraCallbackWithResult instanceof getCookieJarokhttp)) {
            return null;
        }
        int i4 = onPostMessage + 35;
        int i5 = i4 % 128;
        onActivityLayout = i5;
        int i6 = i4 % 2;
        getCookieJarokhttp getcookiejarokhttp = (getCookieJarokhttp) objOnExtraCallbackWithResult;
        int i7 = i5 + 87;
        onPostMessage = i7 % 128;
        if (i7 % 2 == 0) {
            return getcookiejarokhttp;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return (o.getMinWebSocketMessageToCompressokhttp) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r1 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onPostMessage + 79;
        im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onActivityLayout = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if ((!(r1 instanceof o.getMinWebSocketMessageToCompressokhttp)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((r1 instanceof o.getMinWebSocketMessageToCompressokhttp) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getMinWebSocketMessageToCompressokhttp onWarmupCompleted() {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onPostMessage + 49;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            objOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
            int i3 = 99 / 0;
        } else {
            objOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
        }
    }

    public final getFollowRedirectsokhttp asBinder() {
        int i = 2 % 2;
        int i2 = onPostMessage + 61;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.access000.onExtraCallbackWithResult();
        if (!(objOnExtraCallbackWithResult instanceof getFollowRedirectsokhttp)) {
            return null;
        }
        int i4 = onActivityLayout;
        int i5 = i4 + 89;
        onPostMessage = i5 % 128;
        getFollowRedirectsokhttp getfollowredirectsokhttp = (getFollowRedirectsokhttp) objOnExtraCallbackWithResult;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        int i7 = i4 + 99;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2;
        return getfollowredirectsokhttp;
    }

    public final getMinWebSocketMessageToCompressokhttp onTransact() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 109;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.access100.onExtraCallbackWithResult();
        Object obj = null;
        if (!(objOnExtraCallbackWithResult instanceof getMinWebSocketMessageToCompressokhttp)) {
            return null;
        }
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = (getMinWebSocketMessageToCompressokhttp) objOnExtraCallbackWithResult;
        int i4 = onActivityLayout + 37;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return getminwebsocketmessagetocompressokhttp;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsTopV2View tdsTopV2View = (TdsTopV2View) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 57;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = tdsTopV2View.access100.onExtraCallbackWithResult();
        if (!(objOnExtraCallbackWithResult instanceof getFollowRedirectsokhttp)) {
            return null;
        }
        getFollowRedirectsokhttp getfollowredirectsokhttp = (getFollowRedirectsokhttp) objOnExtraCallbackWithResult;
        int i4 = onActivityLayout + 35;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return getfollowredirectsokhttp;
        }
        throw null;
    }

    public final getMinWebSocketMessageToCompressokhttp IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 27;
        onPostMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = this.extraCallbackWithResult.onExtraCallbackWithResult() instanceof getMinWebSocketMessageToCompressokhttp;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallbackWithResult = this.extraCallbackWithResult.onExtraCallbackWithResult();
        if (!(objOnExtraCallbackWithResult instanceof getMinWebSocketMessageToCompressokhttp)) {
            return null;
        }
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttp = (getMinWebSocketMessageToCompressokhttp) objOnExtraCallbackWithResult;
        int i3 = onPostMessage + 9;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return getminwebsocketmessagetocompressokhttp;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsTopV2View tdsTopV2View = (TdsTopV2View) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 83;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object objOnExtraCallbackWithResult = tdsTopV2View.extraCallbackWithResult.onExtraCallbackWithResult();
        if (i3 == 0) {
            boolean z = objOnExtraCallbackWithResult instanceof getFollowRedirectsokhttp;
            obj.hashCode();
            throw null;
        }
        if (!(objOnExtraCallbackWithResult instanceof getFollowRedirectsokhttp)) {
            return null;
        }
        getFollowRedirectsokhttp getfollowredirectsokhttp = (getFollowRedirectsokhttp) objOnExtraCallbackWithResult;
        int i4 = onActivityLayout + 37;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return getfollowredirectsokhttp;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = ((TdsTopV2View) objArr[0]).IAuthTabCallbackStub.onExtraCallbackWithResult();
        Object obj = null;
        if (!(objOnExtraCallbackWithResult instanceof x509TrustManager)) {
            int i2 = onPostMessage + 121;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = onActivityLayout + 91;
        onPostMessage = i4 % 128;
        x509TrustManager x509trustmanager = (x509TrustManager) objOnExtraCallbackWithResult;
        if (i4 % 2 == 0) {
            return x509trustmanager;
        }
        obj.hashCode();
        throw null;
    }

    public final getDispatcherokhttp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 107;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult();
        if (objOnExtraCallbackWithResult instanceof getDispatcherokhttp) {
            return (getDispatcherokhttp) objOnExtraCallbackWithResult;
        }
        int i4 = onActivityLayout + 93;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final x509TrustManager onNavigationEvent() {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
        if (!(!(objOnExtraCallbackWithResult instanceof x509TrustManager))) {
            int i2 = onPostMessage + 23;
            onActivityLayout = i2 % 128;
            x509TrustManager x509trustmanager = (x509TrustManager) objOnExtraCallbackWithResult;
            if (i2 % 2 == 0) {
                int i3 = 34 / 0;
            }
            return x509trustmanager;
        }
        int i4 = onActivityLayout + 123;
        onPostMessage = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final QuirkSettingsLoader.onWarmupCompleted writeTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 93;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
        int i4 = onPostMessage + 27;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 19;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return ((Boolean) this.onTransact.onExtraCallbackWithResult()).booleanValue();
        }
        ((Boolean) this.onTransact.onExtraCallbackWithResult()).booleanValue();
        throw null;
    }

    private final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 3;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onActivityLayout + 7;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final x509TrustManager IAuthTabCallback() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        return (x509TrustManager) onNavigationEvent(1402869775, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[]{this}, iOnNavigationEvent2, -1402869773);
    }

    public final getFollowRedirectsokhttp access000() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        return (getFollowRedirectsokhttp) onNavigationEvent(31415468, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[]{this}, iOnNavigationEvent2, -31415468);
    }

    public final getFollowRedirectsokhttp getInterfaceDescriptor() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        return (getFollowRedirectsokhttp) onNavigationEvent(-282332163, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[]{this}, iOnNavigationEvent2, 282332164);
    }
}
