package im.toss.feature.credit.ui.main.test;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.RowScope;
import com.google.common.collect.Synchronized;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.base.BaseActivity;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0;
import im.toss.feature.credit.terms.domain.usecase.RefreshCreditTermGroupCacheUseCase;
import im.toss.feature.credit.ui.main.test.CreditTestActivity$;
import im.toss.features.credit.ui.R;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.network.model.BaseApiResponse;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.uikit.widget.textField.TextField;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.AppLovinNativeAdImplExternalSyntheticLambda6;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.AppLovinVastMediaViewb;
import o.AppLovinVastMediaViewc;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.BackgroundModeProxy;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CameraControlImplExternalSyntheticLambda2;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERTaggedObject;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.MaxRewardedInterstitialAdapterListener;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RVNativePermissionRequestManager;
import o.SessionTrackerb;
import o.SpannedDataExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TimelineExternalSyntheticLambda1;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.WebResourceResponseModel;
import o.YuvImageOnePixelShiftQuirk;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.addFixedPosition;
import o.addPolicy;
import o.component5;
import o.dequeImageProxy;
import o.enableSwitch;
import o.findResAndMsg;
import o.getAdService;
import o.getAppAlias;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.getDevicePerformance;
import o.getHostnameVerifierokhttp;
import o.getSpecialFeatureOptInStatus;
import o.getSubtitle;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getViewTypeCount;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasRootStatusPermission;
import o.initMiniApp;
import o.isRepeatingEnabled;
import o.logAndOpenStore;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0;
import o.readIntokhttp;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setConfig;
import o.setContentInsetsAbsolute;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import o.varyMatches;
import o.w4;
import o.w5a;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import o.zzad;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

@DERTaggedObject
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditTestActivity extends Hilt_CreditTestActivity {

    @Inject
    public getAppAlias creditGatewayApi;

    @Inject
    public hasRootStatusPermission creditPlusApi;

    @Inject
    public setConfig creditTermRepository;

    @Inject
    public r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 disagreeTermsIdUseCase;

    @Inject
    public zzad environments;

    @Inject
    public getDevicePerformance kcbSurveyApi;

    @Inject
    public RefreshCreditTermGroupCacheUseCase refreshCreditTermGroupCacheUseCase;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {0, Byte.MIN_VALUE, 34, -14, 68};
    private static final int $$b = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static char[] IAuthTabCallbackDefault = {17591, 37419, 59810, 50988, 7813, 29717, 17309, 39286, 61691, 52845, 9683, 29456, 19091, 41449, 65316, 54973, 11269, 31616, 20829, 43159, 34413, 56824, 11129, 709, 22609, 47059, 36517, 58404, 13224, 2377, 24713, 48662, 38377, 58215, 15102, 4149, 28609, 17759, 40139, 60337, 49469, 6321, 30222, 19911, 39694, 62179, 51323, 10231, 32080, 60839, 15147, 16560, 28207, 46990, 56594, 60039, 12385, 23031, 26420, 35999, 55829, 58319, 2212, 22077, 32678, 34077, 53898, 63567, 414, 12147, 29941, 33403, 43984, 61765, 7872, 10171, 19829, 39589, 40984, 51596, 5904, 15611, 18977, 37874, 47471, 50906, 60483, 13786, 17056, 26657, 45500, 57165, 58521, 12830, 23539, 24956, 36587, 54336, 64993, 2889, 20679, 31148, 34612, 44199, 64004, 897, 10545, 30434, 40063, 42495, 62275, 6356, 9814};
    private static long asInterface = 3384451600210803550L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = (b2 * 2) + 97;
        int i4 = i * 2;
        int i5 = 5 - (b * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i3 += -i7;
            i5++;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i3 += -i7;
            i5++;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        RightPreset rightPreset = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) onWarmupCompleted(710830520, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -710830508, objArr2, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback());
        int i4 = onTransact + 17;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 33;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 107;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 83;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(-794083533, iOnExtraCallback4, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 794083550, new Object[]{creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnExtraCallback6, iOnExtraCallback5);
        int i5 = onTransact + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 43;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallbackStubProxy(getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStubProxy(getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, str);
        int i4 = asBinder + 115;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ void IAuthTabCallback(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        asInterface(compoundButton, z);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        asInterface(gettypedexportedconstants, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitUpdateVisuals = updateVisuals(creditTestActivity);
        int i4 = asBinder + 91;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitUpdateVisuals;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitReceiveFile = receiveFile(creditTestActivity);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return unitReceiveFile;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(CreditTestActivity creditTestActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditTestActivity};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onWarmupCompleted(697020924, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -697020916, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
            int i4 = 79 / 0;
        } else {
            int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onWarmupCompleted(697020924, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -697020916, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3);
        }
        int i5 = asBinder + 37;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSession = newSession(creditTestActivity);
        int i4 = onTransact + 57;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitNewSession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitPrefetch = prefetch(creditTestActivity);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        int i5 = onTransact + 21;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return unitPrefetch;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSessionWithExtras = newSessionWithExtras(creditTestActivity);
        int i4 = asBinder + 51;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return unitNewSessionWithExtras;
    }

    public static /* synthetic */ Unit access000(CreditTestActivity creditTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsServiceStub(creditTestActivity);
            throw null;
        }
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub(creditTestActivity);
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unitICustomTabsServiceStub;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnSessionEnded = onSessionEnded();
        int i4 = asBinder + 113;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return unitOnSessionEnded;
    }

    public static /* synthetic */ Unit access100(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub(creditTestActivity);
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = onTransact + 101;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitIEngagementSignalsCallbackStub;
    }

    public static /* synthetic */ Unit asBinder(CreditTestActivity creditTestActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditTestActivity};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onWarmupCompleted(438530334, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -438530325, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
            int i4 = 65 / 0;
        } else {
            int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onWarmupCompleted(438530334, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -438530325, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3);
        }
        int i5 = asBinder + 25;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Unit unit;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(zBooleanValue)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        if (i3 == 0) {
            unit = (Unit) onWarmupCompleted(1551677779, iOnExtraCallback, iOnExtraCallback4, -1551677763, objArr2, iOnExtraCallback3, iOnExtraCallback2);
            int i4 = 73 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(1551677779, iOnExtraCallback, iOnExtraCallback4, -1551677763, objArr2, iOnExtraCallback3, iOnExtraCallback2);
        }
        int i5 = asBinder + 11;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit asInterface(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(1422853303, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1422853277, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
        int i4 = asBinder + 3;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit extraCallback(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedList = writeTypedList(creditTestActivity);
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unitWriteTypedList;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return requestPostMessageChannel(creditTestActivity);
        }
        requestPostMessageChannel(creditTestActivity);
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objArr[5];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(creditTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = asBinder + 33;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(-1481306433, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1481306457, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
        int i4 = onTransact + 89;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(-98136519, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 98136525, objArr2, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        int i4 = onTransact + 37;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onActivityResized(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(creditTestActivity);
        int i4 = asBinder + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return unitIsEngagementSignalsApiAvailable;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            IEngagementSignalsCallback(creditTestActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback(creditTestActivity);
        int i3 = onTransact + 41;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitIEngagementSignalsCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitMayLaunchUrl = mayLaunchUrl(creditTestActivity);
        int i4 = onTransact + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitMayLaunchUrl;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 69;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            asInterface(creditTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitAsInterface = asInterface(creditTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 75;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditTestActivity creditTestActivity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 65;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditTestActivity, maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 75;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 115;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackDefault(creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackDefault(creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, str);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = asBinder + 69;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onExtraCallback(CompoundButton compoundButton, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {compoundButton, Boolean.valueOf(z)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(1505332034, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1505332004, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        int i4 = onTransact + 57;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return warmup(creditTestActivity);
        }
        warmup(creditTestActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 85;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(creditTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 117;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditTestActivity creditTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 7;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditTestActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 121;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 105;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return asBinder(creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asBinder(creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onTransact + 79;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        if (i4 != 0) {
            unit = (Unit) onWarmupCompleted(1680174346, iOnExtraCallback, iOnExtraCallback4, -1680174344, objArr, iOnExtraCallback3, iOnExtraCallback2);
            int i5 = 96 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(1680174346, iOnExtraCallback, iOnExtraCallback4, -1680174344, objArr, iOnExtraCallback3, iOnExtraCallback2);
        }
        int i6 = onTransact + 57;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 22 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(getsupportedhighspeedresolutionsfor, str);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, z);
        }
        IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, z);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        asBinder(compoundButton, z);
        int i4 = onTransact + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-430056804, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 430056814, new Object[]{objectRef, objectRef2, gettypedexportedconstants, view}, iOnExtraCallback3, iOnExtraCallback2);
        int i4 = onTransact + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onMessageChannelReady(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            prefetchWithMultipleUrls(creditTestActivity);
            throw null;
        }
        Unit unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls(creditTestActivity);
        int i3 = onTransact + 105;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unitPrefetchWithMultipleUrls;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitValidateRelationship = validateRelationship(creditTestActivity);
        int i4 = onTransact + 85;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitValidateRelationship;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onMinimized(CreditTestActivity creditTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(creditTestActivity);
        int i4 = onTransact + 97;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return unitICustomTabsCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(-756597989, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 756598012, new Object[0], iOnExtraCallback3, iOnExtraCallback2);
        int i4 = asBinder + 51;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            access200(creditTestActivity);
            throw null;
        }
        Unit unitAccess200 = access200(creditTestActivity);
        int i3 = onTransact + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitAccess200;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 65;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(creditTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 87 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 14 / 0;
        }
        int i6 = asBinder + 9;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 45;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        if (i3 != 0) {
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onWarmupCompleted(1727664478, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1727664450, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        }
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(compoundButton, z);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(gettypedexportedconstants, view);
        int i4 = asBinder + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onPostMessage(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return setEngagementSignalsCallback(creditTestActivity);
        }
        setEngagementSignalsCallback(creditTestActivity);
        throw null;
    }

    public static /* synthetic */ Unit onRelationshipValidationResult(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsServiceDefault(creditTestActivity);
            throw null;
        }
        Unit unitICustomTabsServiceDefault = ICustomTabsServiceDefault(creditTestActivity);
        int i3 = asBinder + 103;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return unitICustomTabsServiceDefault;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[3];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objArr[4];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objArr[5];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objArr[6];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 101;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsService_Parcel = ICustomTabsService_Parcel(creditTestActivity);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        int i5 = onTransact + 45;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return unitICustomTabsService_Parcel;
    }

    public static /* synthetic */ Unit onTransact(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 117;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallbackStubProxy(creditTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStubProxy(creditTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        RightPreset rightPreset = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = asBinder + 27;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onUnminimized(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditTestActivity};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(1082992928, iOnExtraCallback, iOnExtraCallback4, -1082992914, objArr, iOnExtraCallback3, iOnExtraCallback2);
        int i4 = asBinder + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [android.app.Activity, im.toss.feature.credit.ui.main.test.CreditTestActivity] */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = (~((~i2) | i)) | i4;
        int i8 = ~i4;
        int i9 = (~(i8 | i)) | (~(i8 | i2)) | (~(i | i2));
        int i10 = (~(i2 | (~i))) | i8;
        int i11 = i4 + i + i6 + ((-2137991558) * i5) + (111092868 * i3);
        int i12 = i11 * i11;
        int i13 = (i4 * (-1469267343)) + 1003592187 + (i * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + ((-1469268067) * i6) + (1951436498 * i5) + ((-746069772) * i3) + (i12 * (-1529348096));
        switch ((((-431794203) * i4) - 566755328) + (427185167 * i) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i6) + ((-1247805440) * i5) + ((-1807745024) * i3) + ((-591921152) * i12) + (i13 * i13 * 1762131968)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
                RightPreset rightPreset = (RightPreset) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i14 = 2 % 2;
                int i15 = asBinder + 101;
                onTransact = i15 % 128;
                int i16 = i15 % 2;
                Intrinsics.checkNotNullParameter(rightPreset, "");
                if ((iIntValue & 17) != 16) {
                    int i17 = onTransact + 87;
                    asBinder = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    int i19 = asBinder + 5;
                    onTransact = i19 % 128;
                    int i20 = i19 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1052719183, iIntValue, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:251)");
                        int i21 = onTransact + 89;
                        asBinder = i21 % 128;
                        int i22 = i21 % 2;
                    }
                    String strOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new CreditTestActivity$.ExternalSyntheticLambda63(getsupportedhighspeedresolutionsfor);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    RVNativePermissionRequestManager.onNavigationEvent(strOnExtraCallback, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 48);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[0];
                String str = (String) objArr[1];
                int i23 = 2 % 2;
                int i24 = asBinder + 113;
                onTransact = i24 % 128;
                int i25 = i24 % 2;
                getsupportedhighspeedresolutionsfor2.IAuthTabCallback(str);
                int i26 = asBinder + 111;
                onTransact = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                ?? r10 = (CreditTestActivity) objArr[0];
                int i28 = 2 % 2;
                int i29 = asBinder + 115;
                onTransact = i29 % 128;
                int i30 = i29 % 2;
                SessionTrackerb sessionTrackerbAccess200 = r10.access200();
                Object[] objArr2 = new Object[1];
                a(TextUtils.lastIndexOf("", '0') + 1, 49 - ExpandableListView.getPackedPositionGroup(0L), (char) (View.resolveSizeAndState(0, 0, 0) + 43280), objArr2);
                SessionTrackerb.IAuthTabCallback(sessionTrackerbAccess200, (Activity) r10, ((String) objArr2[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i31 = onTransact + 13;
                asBinder = i31 % 128;
                int i32 = i31 % 2;
                return unit;
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return onTransact(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[0];
                RightPreset rightPreset2 = (RightPreset) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i33 = 2 % 2;
                Intrinsics.checkNotNullParameter(rightPreset2, "");
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    int i34 = asBinder + 107;
                    onTransact = i34 % 128;
                    int i35 = i34 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1330254000, iIntValue2, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:611)");
                        int i36 = asBinder + 13;
                        onTransact = i36 % 128;
                        int i37 = i36 % 2;
                    }
                    boolean zOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new CreditTestActivity$.ExternalSyntheticLambda14(getsupportedhighspeedresolutionsfor3);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    AppLovinVastMediaViewc.onExtraCallbackWithResult(zOnWarmupCompleted, (Function1) objOnMinimized2, (QuirksExternalSyntheticBackport0) null, false, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (AppLovinVastMediaViewb) null, cameraCaptureResultEmptyCameraCaptureResult2, 48, 60);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                Unit unit2 = Unit.INSTANCE;
                int i38 = onTransact + 63;
                asBinder = i38 % 128;
                int i39 = i38 % 2;
                return unit2;
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return asInterface(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
                w5a w5aVar = (w5a) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int i40 = 2 % 2;
                Intrinsics.checkNotNullParameter(w5aVar, "");
                if ((iIntValue3 & 6) == 0) {
                    int i41 = asBinder + 95;
                    onTransact = i41 % 128;
                    int i42 = i41 % 2;
                    iIntValue3 |= cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(w5aVar) ? 4 : 2;
                    int i43 = onTransact + 43;
                    asBinder = i43 % 128;
                    int i44 = i43 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1197842883, iIntValue3, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:275)");
                    }
                    w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(18748588, true, new CreditTestActivity$.ExternalSyntheticLambda58(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult3, 54), cameraCaptureResultEmptyCameraCaptureResult3, ((iIntValue3 << 3) & 112) | 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i45 = asBinder + 117;
                        onTransact = i45 % 128;
                        int i46 = i45 % 2;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return access100(objArr);
            case 19:
                return access000(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            case 21:
                return ICustomTabsCallback(objArr);
            case 22:
                return writeTypedObject(objArr);
            case 23:
                return extraCallback(objArr);
            case 24:
                return readTypedObject(objArr);
            case 25:
                return onMinimized(objArr);
            case 26:
                return onActivityResized(objArr);
            case 27:
                return onPostMessage(objArr);
            case 28:
                return onMessageChannelReady(objArr);
            case 29:
                return onActivityLayout(objArr);
            case 30:
                return ICustomTabsCallbackStubProxy(objArr);
            case 31:
                return onUnminimized(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCommand = extraCommand(creditTestActivity);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = asBinder + 93;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitExtraCommand;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 121;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(creditTestActivity, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 81;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditTestActivity creditTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {creditTestActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onWarmupCompleted(1338895906, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1338895905, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback());
        int i5 = asBinder + 111;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 59;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 61;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ void onWarmupCompleted(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onTransact(compoundButton, z);
        int i4 = asBinder + 67;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit readTypedObject(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(-1835441168, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1835441189, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
        int i4 = asBinder + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws Throwable {
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-1434085155, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1434085182, new Object[]{gettypedexportedconstants, view}, iOnExtraCallback3, iOnExtraCallback2);
        int i4 = onTransact + 9;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit writeTypedObject(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(creditTestActivity);
        int i4 = onTransact + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallbackStubProxy;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return -1L;
    }

    public static final class access000 implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 1;
        public static final access000 onExtraCallback = new access000();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 11;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public final void onExtraCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            int i4 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    public static final class getInterfaceDescriptor implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final getInterfaceDescriptor onNavigationEvent = new getInterfaceDescriptor();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 21;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public final void onExtraCallbackWithResult(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            int i4 = onWarmupCompleted + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 91 / 0;
            }
            return unit;
        }
    }

    public static final class ICustomTabsCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public ICustomTabsCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    int i3 = IAuthTabCallback + 69;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i5 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public static final class extraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onWarmupCompleted;

        public extraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 61;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            int i3 = onExtraCallback + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i4 == 0) {
                int i5 = 75 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class extraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public extraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class readTypedObject implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public readTypedObject(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = IAuthTabCallback + 5;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 != 0) {
                    int i5 = 4 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public static final class writeTypedObject implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public writeTypedObject(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            obj.hashCode();
            throw null;
        }
    }

    public final getAppAlias setEngagementSignalsCallback() {
        int i = 2 % 2;
        getAppAlias getappalias = this.creditGatewayApi;
        if (getappalias != null) {
            int i2 = onTransact + 51;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 54 / 0;
            }
            return getappalias;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = asBinder + 77;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 31;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        hasRootStatusPermission hasrootstatuspermission = creditTestActivity.creditPlusApi;
        Object obj = null;
        if (hasrootstatuspermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 5;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return hasrootstatuspermission;
        }
        obj.hashCode();
        throw null;
    }

    public final getDevicePerformance ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        int i3 = i2 % 128;
        onTransact = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getDevicePerformance getdeviceperformance = this.kcbSurveyApi;
        if (getdeviceperformance != null) {
            int i4 = i3 + 11;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return getdeviceperformance;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = asBinder + 29;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 updateVisuals() {
        int i = 2 % 2;
        r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 r8lambdapobfacqjckmctdzvvklu6mrmi0 = this.disagreeTermsIdUseCase;
        if (r8lambdapobfacqjckmctdzvvklu6mrmi0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = onTransact + 17;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i3 = onTransact;
        int i4 = i3 + 119;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        int i6 = i3 + 119;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return r8lambdapobfacqjckmctdzvvklu6mrmi0;
    }

    public final SessionTrackerb access200() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = asBinder;
        int i3 = i2 + 25;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackerb;
    }

    public final zzad validateRelationship() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 29;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        float f;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            f = 0.0f;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 59698), ((byte) KeyEvent.getModifierMetaStateMask()) + 18, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(asInterface), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 46134), 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 49123);
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 44;
                            int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1494;
                            byte b = $$a[0];
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, fadingEdgeLength, i5, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $10 + 111;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    char windowTouchSlop = (char) (49123 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int iGreen = 44 - Color.green(0);
                    int i7 = (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 1493;
                    byte b3 = $$a[0];
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, iGreen, i7, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i8 = 26 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49123);
                    int iAlpha = Color.alpha(0) + 44;
                    int iRgb = (-16775722) - Color.rgb(0, 0, 0);
                    byte b5 = $$a[0];
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(edgeSlop, iAlpha, iRgb, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i9 = $11 + 43;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            f = 0.0f;
        }
        objArr[0] = new String(cArr);
    }

    @Override // im.toss.feature.credit.ui.main.test.Hilt_CreditTestActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            if (!validateRelationship().ITrustedWebActivityService_Parcel()) {
                finish();
                return;
            }
            IEngagementSignalsCallbackStub();
            int i3 = onTransact + 103;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 58 / 0;
                return;
            }
            return;
        }
        super.onCreate(bundle);
        validateRelationship().ITrustedWebActivityService_Parcel();
        throw null;
    }

    private final void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(660103877, true, new CreditTestActivity$.ExternalSyntheticLambda13(this))), 1, (Object) null);
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CreditTestActivity creditTestActivity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
        boolean z = false;
        if ((i & 6) == 0) {
            int i3 = asBinder + 101;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxRewardedInterstitialAdapterListener)) {
                    int i5 = asBinder + 93;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2 == 0 ? 2 : 4;
                    i |= i6;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxRewardedInterstitialAdapterListener)) {
            }
        }
        if ((i & 19) != 18) {
            int i7 = asBinder + 57;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = asBinder + 89;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1470921335, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:125)");
            }
            String string = creditTestActivity.getString(R.string.credit_ui_main_test___7be449ad19);
            Intrinsics.checkNotNullExpressionValue(string, "");
            maxRewardedInterstitialAdapterListener.onExtraCallback(string, (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackDefault(CreditTestActivity creditTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        creditTestActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z;
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = asBinder + 7;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(230735666, iIntValue, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:124)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i7 = onTransact + 67;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CreditTestActivity$.ExternalSyntheticLambda66 externalSyntheticLambda66 = new CreditTestActivity$.ExternalSyntheticLambda66(creditTestActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda66);
                    obj = externalSyntheticLambda66;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(-1470921335, true, new CreditTestActivity$.ExternalSyntheticLambda67(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 126);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onTransact + 13;
                    asBinder = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i10 = 41 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onTransact + 109;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackStubProxy(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            creditTestActivity.IEngagementSignalsCallbackStubProxy();
            Unit unit = Unit.INSTANCE;
            int i3 = asBinder + 35;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        creditTestActivity.IEngagementSignalsCallbackStubProxy();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_NICE_RESULT_CODE", str);
            onNavigationEvent((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, RVNativePermissionRequestManager.onExtraCallback(str));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_NICE_RESULT_CODE", str);
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, RVNativePermissionRequestManager.onExtraCallback(str));
        int i3 = 74 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 17) != 16) {
            int i5 = onTransact;
            int i6 = i5 + 123;
            asBinder = i6 % 128;
            z = i6 % 2 == 0;
            int i7 = i5 + 9;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onTransact + 7;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1339557419, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:163)");
            }
            String strOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new CreditTestActivity$.ExternalSyntheticLambda57(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            RVNativePermissionRequestManager.IAuthTabCallback(strOnNavigationEvent, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onSessionEnded() {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_SCORE_REPORT_LAST_VIEWED_AT", "");
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 3;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_LAST_CLOSED_INTELLI_ID", "");
            return Unit.INSTANCE;
        }
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_LAST_CLOSED_INTELLI_ID", "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit ICustomTabsService_Parcel(CreditTestActivity creditTestActivity) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("pref_key_loan_needs_first_row_shown_date", 0L);
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("pref_key_loan_needs_expand_anim_date", 1L);
            addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("pref_key_loan_needs_expand_anim_count", 1);
            i = 4;
        } else {
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("pref_key_loan_needs_first_row_shown_date", 0L);
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("pref_key_loan_needs_expand_anim_date", 0L);
            addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("pref_key_loan_needs_expand_anim_count", 0);
        }
        onJsBridgeReady.onNavigationEvent(creditTestActivity, "초기화 완료", 0, i, null);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        getHostnameVerifierokhttp gethostnameverifierokhttp = (CreditTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("pref_key_dual_row_anim_shown_date", 0L);
        Object obj = null;
        onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "초기화 완료", 0, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 89;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IEngagementSignalsCallbackStub(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_CREDIT_HISTORY_LOAN_NUDGE_DATE", "");
        onJsBridgeReady.onNavigationEvent(creditTestActivity, "초기화 완료", 0, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_CREDIT_TEST_HISTORY_FORCE_KCB", str);
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, (String) RVNativePermissionRequestManager.onExtraCallbackWithResult(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{str}, 1747598685, -1747598682, iIAuthTabCallback3, iIAuthTabCallback));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 81;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_CREDIT_TEST_HISTORY_FORCE_NICE", str);
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Object[] objArr = {getsupportedhighspeedresolutionsfor, (String) RVNativePermissionRequestManager.onExtraCallbackWithResult(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{str}, 1747598685, -1747598682, iIAuthTabCallback3, iIAuthTabCallback)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-1731779763, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1731779770, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 123;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 17) != 16) {
            int i3 = onTransact + 19;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = asBinder + 107;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1451431950, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:267)");
            }
            String strIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new CreditTestActivity$.ExternalSyntheticLambda5(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            RVNativePermissionRequestManager.onNavigationEvent(strIAuthTabCallback, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asBinder + 89;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStubProxy(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = asBinder + 13;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onTransact + 39;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(18748588, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:276)");
            }
            String string = creditTestActivity.getString(R.string.credit_ui_main_test___539238c9d8);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = asBinder + 11;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, im.toss.feature.credit.ui.main.test.CreditTestActivity] */
    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        SessionTrackerb sessionTrackerbAccess200;
        String strOnExtraCallbackWithResult;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        Object obj;
        ?? r1 = (CreditTestActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = asBinder + 79;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            sessionTrackerbAccess200 = r1.access200();
            z = true;
            obj = null;
            strOnExtraCallbackWithResult = h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback, true, "test", true, null, 91, null);
            function1 = null;
            bundle = null;
            z2 = true;
            i = 93;
        } else {
            sessionTrackerbAccess200 = r1.access200();
            strOnExtraCallbackWithResult = h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackDefault.onExtraCallback, false, "test", false, null, 13, null);
            z = false;
            function1 = null;
            bundle = null;
            z2 = false;
            i = 60;
            obj = null;
        }
        SessionTrackerb.IAuthTabCallback(sessionTrackerbAccess200, (Activity) r1, strOnExtraCallbackWithResult, z, function1, bundle, z2, i, obj);
        return Unit.INSTANCE;
    }

    private static final Unit extraCommand(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        creditTestActivity.IAuthTabCallback(false);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 105;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit mayLaunchUrl(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        creditTestActivity.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 45;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 57;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 57) != 80;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onTransact + 35;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1003874802, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:335)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1003874802, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:335)");
            }
            String string = creditTestActivity.getString(R.string.credit_ui_main_test___0da5899754);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i5 = onTransact + 19;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i7 = onTransact + 119;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = asBinder + 69;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1098907717, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:333)");
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1003874802, true, new CreditTestActivity$.ExternalSyntheticLambda15(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = asBinder + 35;
        onTransact = i11 % 128;
        if (i11 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit isEngagementSignalsApiAvailable(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        creditTestActivity.ICustomTabsService_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 43;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asBinder(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onTransact + 25;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onTransact + 81;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i7 = asBinder + 47;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(605162035, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:349)");
            }
            String string = creditTestActivity.getString(R.string.credit_ui_main_test_missions_reset);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = asBinder + 5;
                onTransact = i4 % 128;
                i2 = i4 % 2 == 0 ? 5 : 4;
            } else {
                int i5 = asBinder + 37;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 % 5;
                }
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1497620484, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:347)");
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(605162035, true, new CreditTestActivity$.ExternalSyntheticLambda60(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit newSession(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            SessionTrackerb.IAuthTabCallback(creditTestActivity.access200(), creditTestActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.onMinimized.IAuthTabCallback, true, "test", true, null, 96, null), true, (Function1) null, (Bundle) null, false, 0, (Object) null);
        } else {
            SessionTrackerb.IAuthTabCallback(creditTestActivity.access200(), creditTestActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.onMinimized.IAuthTabCallback, false, "test", false, null, 13, null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, im.toss.feature.credit.ui.main.test.CreditTestActivity] */
    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        SessionTrackerb sessionTrackerbAccess200;
        boolean z;
        Object obj;
        String strOnExtraCallbackWithResult;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        ?? r1 = (CreditTestActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = asBinder + 33;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            sessionTrackerbAccess200 = r1.access200();
            strOnExtraCallbackWithResult = h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.onMinimized.IAuthTabCallback, false, "my_loan_mgmt__mission_detail", true, null, 108, null);
            z = true;
            function1 = null;
            bundle = null;
            z2 = true;
            i = 91;
            obj = null;
        } else {
            sessionTrackerbAccess200 = r1.access200();
            z = false;
            obj = null;
            strOnExtraCallbackWithResult = h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.onMinimized.IAuthTabCallback, false, "my_loan_mgmt__mission_detail", false, null, 13, null);
            function1 = null;
            bundle = null;
            z2 = false;
            i = 60;
        }
        SessionTrackerb.IAuthTabCallback(sessionTrackerbAccess200, (Activity) r1, strOnExtraCallbackWithResult, z, function1, bundle, z2, i, obj);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Unit unit;
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            creditTestActivity.onVerticalScrollEvent();
            unit = Unit.INSTANCE;
            int i3 = 38 / 0;
        } else {
            creditTestActivity.onVerticalScrollEvent();
            unit = Unit.INSTANCE;
        }
        int i4 = onTransact + 75;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit prefetch(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            creditTestActivity.ICustomTabsServiceStubProxy();
            int i3 = 27 / 0;
            return Unit.INSTANCE;
        }
        creditTestActivity.ICustomTabsServiceStubProxy();
        return Unit.INSTANCE;
    }

    private static final Unit newSessionWithExtras(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        creditTestActivity.IEngagementSignalsCallbackDefault();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 91;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asBinder + 125;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_CREDIT_PLUS_TEST_PAY", zBooleanValue);
            Object[] objArr2 = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(zBooleanValue)};
            onWarmupCompleted(-491688503, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 491688523, objArr2, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback());
            return Unit.INSTANCE;
        }
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_CREDIT_PLUS_TEST_PAY", zBooleanValue);
        Object[] objArr3 = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(zBooleanValue)};
        onWarmupCompleted(-491688503, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 491688523, objArr3, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asBinder + 123;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            z = (i & 56) != 87;
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(406735122, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:453)");
            }
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new CreditTestActivity$.ExternalSyntheticLambda2(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            AppLovinVastMediaViewc.onExtraCallbackWithResult(zOnExtraCallbackWithResult, (Function1) objOnMinimized, (QuirksExternalSyntheticBackport0) null, false, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (AppLovinVastMediaViewb) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 60);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onTransact + 45;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = asBinder + 61;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_CREDIT_PLUS_GIFT_TEST_PAY", zBooleanValue);
        asBinder((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, zBooleanValue);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 51;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 17) != 16) {
            int i3 = onTransact + 7;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = asBinder + 111;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onTransact + 35;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(224988840, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:467)");
            }
            boolean zOnTransact = onTransact((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new CreditTestActivity$.ExternalSyntheticLambda59(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            AppLovinVastMediaViewc.onExtraCallbackWithResult(zOnTransact, (Function1) objOnMinimized, (QuirksExternalSyntheticBackport0) null, false, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (AppLovinVastMediaViewb) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 60);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = onTransact + 33;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit prefetchWithMultipleUrls(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            SessionTrackerb.IAuthTabCallback(creditTestActivity.access200(), creditTestActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.extraCallback.onExtraCallbackWithResult, false, "my_loan_mgmt__mission_detail", true, null, 83, null), false, (Function1) null, (Bundle) null, true, 48, (Object) null);
        } else {
            SessionTrackerb.IAuthTabCallback(creditTestActivity.access200(), creditTestActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.extraCallback.onExtraCallbackWithResult, false, "my_loan_mgmt__mission_detail", false, null, 13, null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            creditTestActivity.IEngagementSignalsCallback();
            return Unit.INSTANCE;
        }
        creditTestActivity.IEngagementSignalsCallback();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = asBinder + 33;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1129968146, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:522)");
            }
            String string = creditTestActivity.getString(R.string.credit_ui_main_test___1f7009a493);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onTransact + 113;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onTransact + 29;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i3 = asBinder + 121;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = asBinder + 21;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-972814373, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:520)");
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1129968146, true, new CreditTestActivity$.ExternalSyntheticLambda62(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit setEngagementSignalsCallback(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            creditTestActivity.writeTypedList();
            Unit unit = Unit.INSTANCE;
            int i3 = onTransact + 47;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        creditTestActivity.writeTypedList();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit receiveFile(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            creditTestActivity.IPostMessageServiceStub();
            int i3 = 25 / 0;
            return Unit.INSTANCE;
        }
        creditTestActivity.IPostMessageServiceStub();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = asBinder + 57;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onTransact + 51;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 72 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onTransact + 121;
                    asBinder = i7 % 128;
                    if (i7 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1261702707, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:550)");
                        int i8 = 34 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1261702707, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:550)");
                    }
                }
                String string = creditTestActivity.getString(R.string.credit_ui_main_test___cdff705820);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onTransact + 121;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                String string2 = creditTestActivity.getString(R.string.credit_ui_main_test___cdff705820);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string2, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = asBinder + 77;
        onTransact = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = asBinder + 5;
        onTransact = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 18) == 0) {
                int i5 = asBinder + 53;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                    obj.hashCode();
                    throw null;
                }
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onTransact + 35;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onTransact + 37;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1770239907, i2, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:549)");
                    int i8 = 71 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1770239907, i2, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:549)");
                }
            }
            w5a.onExtraCallback(new Object[]{w5aVar, ForwardingCameraControl.onExtraCallback(1261702707, true, new CreditTestActivity$.ExternalSyntheticLambda1(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), BackgroundModeProxy.onNavigationEvent.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = onTransact + 57;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit requestPostMessageChannel(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb.IAuthTabCallback(creditTestActivity.access200(), creditTestActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.ICustomTabsCallbackDefault.IAuthTabCallback, false, "test", false, null, 13, null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 45;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit ICustomTabsServiceDefault(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb.IAuthTabCallback(creditTestActivity.access200(), creditTestActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.ICustomTabsCallbackDefault.IAuthTabCallback, false, "my_loan_mgmt__mission_detail", false, null, 13, null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 35;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit ICustomTabsServiceStub(CreditTestActivity creditTestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbAccess200 = creditTestActivity.access200();
        Object[] objArr = new Object[1];
        a(View.resolveSize(0, 0) + 49, View.resolveSizeAndState(0, 0, 0) + 64, (char) TextUtils.indexOf("", "", 0, 0), objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbAccess200, creditTestActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 69;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit getInterfaceDescriptor(CreditTestActivity creditTestActivity, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 1;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 24) != 118;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-863595689, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:605)");
            }
            String string = creditTestActivity.getString(R.string.credit_ui_main_test___add35e799f);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = asBinder + 83;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        boolean z;
        CreditTestActivity creditTestActivity = (CreditTestActivity) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            int i2 = asBinder + 57;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i4 = onTransact + 107;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = asBinder + 37;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = asBinder + 59;
                onTransact = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1328589088, iIntValue, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:604)");
                    int i9 = 96 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1328589088, iIntValue, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:604)");
                }
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-863595689, true, new CreditTestActivity$.ExternalSyntheticLambda0(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_USE_BANK", z);
            asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
            return Unit.INSTANCE;
        }
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("PREF_USE_BANK", z);
        asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = CreditTestActivity.this.new IAuthTabCallbackStub(access13800Var);
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 111;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            } else {
                ResultKt.onNavigationEvent(obj);
                r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 r8lambdapobfacqjckmctdzvvklu6mrmi0UpdateVisuals = CreditTestActivity.this.updateVisuals();
                List listListOf = CollectionsKt.listOf(new Long[]{access14000.onExtraCallback(2687L), access14000.onExtraCallback(2685L), access14000.onExtraCallback(2681L)});
                this.label = 1;
                objOnNavigationEvent = r8lambdapobfacqjckmctdzvvklu6mrmi0UpdateVisuals.onNavigationEvent(listListOf, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 61;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "약관 동의 취소 완료", 0, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit updateVisuals(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditTestActivity), (CoroutineContext) null, (setRandomHost) null, creditTestActivity.new IAuthTabCallbackStub(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 115;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = CreditTestActivity.this.new asBinder(access13800Var);
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return asbinder;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 88 / 0;
            }
            int i5 = onWarmupCompleted + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 r8lambdapobfacqjckmctdzvvklu6mrmi0UpdateVisuals = CreditTestActivity.this.updateVisuals();
                this.label = 1;
                objOnNavigationEvent = r8lambdapobfacqjckmctdzvvklu6mrmi0UpdateVisuals.onNavigationEvent(4829L, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 49;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                int i7 = onWarmupCompleted + 111;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "약관 동의 취소 완료", 0, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit warmup(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditTestActivity), (CoroutineContext) null, (setRandomHost) null, creditTestActivity.new asBinder(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = CreditTestActivity.this.new IAuthTabCallbackDefault(access13800Var);
            int i2 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            } else {
                ResultKt.onNavigationEvent(obj);
                r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 r8lambdapobfacqjckmctdzvvklu6mrmi0OnWarmupCompleted = r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0.Companion.onWarmupCompleted(CreditTestActivity.this);
                this.label = 1;
                objOnNavigationEvent = r8lambdapobfacqjckmctdzvvklu6mrmi0OnWarmupCompleted.onNavigationEvent(4881L, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "약관 동의 취소 완료", 0, 2, null);
                enableSwitch.IAuthTabCallback.onWarmupCompleted();
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit validateRelationship(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditTestActivity), (CoroutineContext) null, (setRandomHost) null, creditTestActivity.new IAuthTabCallbackDefault(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = CreditTestActivity.this.new asInterface(access13800Var);
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 90 / 0;
            }
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 5 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            } else {
                ResultKt.onNavigationEvent(obj);
                r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 r8lambdapobfacqjckmctdzvvklu6mrmi0OnWarmupCompleted = r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0.Companion.onWarmupCompleted(CreditTestActivity.this);
                this.label = 1;
                objOnNavigationEvent = r8lambdapobfacqjckmctdzvvklu6mrmi0OnWarmupCompleted.onNavigationEvent(5205L, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    int i7 = onExtraCallbackWithResult + 21;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            Object obj2 = null;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                int i9 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "약관 동의 취소 완료", 1, 5, null);
                } else {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "약관 동의 취소 완료", 0, 2, null);
                }
            }
            Unit unit = Unit.INSTANCE;
            int i10 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit IEngagementSignalsCallback(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditTestActivity), (CoroutineContext) null, (setRandomHost) null, creditTestActivity.new asInterface(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 119;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = CreditTestActivity.this.new onTransact(access13800Var);
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = 79 / 0;
            } else {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            }
            int i4 = IAuthTabCallback + 23;
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
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                int i5 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 r8lambdapobfacqjckmctdzvvklu6mrmi0OnWarmupCompleted = r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0.Companion.onWarmupCompleted(CreditTestActivity.this);
                this.label = 1;
                objOnNavigationEvent = r8lambdapobfacqjckmctdzvvklu6mrmi0OnWarmupCompleted.onNavigationEvent(5145L, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (!(!Result.onNavigationEvent(objOnNavigationEvent))) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "약관 동의 취소 완료", 0, 2, null);
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static final Unit writeTypedList(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditTestActivity), (CoroutineContext) null, (setRandomHost) null, creditTestActivity.new onTransact(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = CreditTestActivity.this.new IAuthTabCallback_Parcel(access13800Var);
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 123;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 19 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 r8lambdapobfacqjckmctdzvvklu6mrmi0OnWarmupCompleted = r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0.Companion.onWarmupCompleted(CreditTestActivity.this);
                this.label = 1;
                objOnNavigationEvent = r8lambdapobfacqjckmctdzvvklu6mrmi0OnWarmupCompleted.onNavigationEvent(5136L, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    int i3 = onExtraCallback + 85;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 13 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                int i5 = onNavigationEvent + 91;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "약관 동의 취소 완료", 1, 2, null);
                } else {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "약관 동의 취소 완료", 0, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit access200(CreditTestActivity creditTestActivity) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditTestActivity), (CoroutineContext) null, (setRandomHost) null, creditTestActivity.new IAuthTabCallback_Parcel(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 103;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0de5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0e50  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(CreditTestActivity creditTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object obj;
        boolean zOnExtraCallback;
        Object obj2;
        boolean zOnExtraCallback2;
        Object obj3;
        boolean zOnExtraCallback3;
        Object obj4;
        boolean zOnExtraCallback4;
        int i3 = 2 % 2;
        int i4 = onTransact + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) != 0) {
            i2 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
            int i6 = onTransact + 9;
            asBinder = i6 % 128;
            int i7 = i6 % 2 != 0 ? 2 : 4;
            i2 = i | i7;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1726893269, i2, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous>.<anonymous> (CreditTestActivity.kt:129)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, deviceQuirksExternalSyntheticLambda0), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🏚 신용홈 테스트 기능 모음", quirksExternalSyntheticBackport0OnNavigationEvent, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            BackgroundModeProxy backgroundModeProxy = BackgroundModeProxy.onNavigationEvent;
            getBacktraceNote getbacktracenote = (getBacktraceNote) BackgroundModeProxy.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -610164964, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{backgroundModeProxy}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 610164970, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback5) {
                Object obj5 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CreditTestActivity$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new CreditTestActivity$.ExternalSyntheticLambda16(creditTestActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda16);
                    obj5 = externalSyntheticLambda16;
                }
                w4.onExtraCallbackWithResult(getbacktracenote, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj5, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                w4.onExtraCallbackWithResult(backgroundModeProxy.isEngagementSignalsApiAvailable(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(1339557419, true, new CreditTestActivity$.ExternalSyntheticLambda27(getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
                getBacktraceNote getbacktracenoteAccess100 = backgroundModeProxy.access100();
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new CreditTestActivity$.ExternalSyntheticLambda38();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                w4.onExtraCallbackWithResult(getbacktracenoteAccess100, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) objOnMinimized2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 24576, 114686);
                getBacktraceNote getbacktracenoteICustomTabsCallback = backgroundModeProxy.ICustomTabsCallback();
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new CreditTestActivity$.ExternalSyntheticLambda49();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                w4.onExtraCallbackWithResult(getbacktracenoteICustomTabsCallback, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) objOnMinimized3, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 24576, 114686);
                getBacktraceNote getbacktracenoteOnWarmupCompleted = backgroundModeProxy.onWarmupCompleted();
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback6) {
                    Object obj6 = objOnMinimized4;
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        CreditTestActivity$.ExternalSyntheticLambda51 externalSyntheticLambda51 = new CreditTestActivity$.ExternalSyntheticLambda51(creditTestActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda51);
                        obj6 = externalSyntheticLambda51;
                    }
                    w4.onExtraCallbackWithResult(getbacktracenoteOnWarmupCompleted, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj6, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                    getBacktraceNote getbacktracenoteOnNavigationEvent = backgroundModeProxy.onNavigationEvent();
                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback7) {
                        CreditTestActivity$.ExternalSyntheticLambda52 externalSyntheticLambda52 = new CreditTestActivity$.ExternalSyntheticLambda52(creditTestActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda52);
                        obj = externalSyntheticLambda52;
                        w4.onExtraCallbackWithResult(getbacktracenoteOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                        getBacktraceNote getbacktracenote2 = (getBacktraceNote) BackgroundModeProxy.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -497600093, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{backgroundModeProxy}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 497600106, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnExtraCallback) {
                            Object obj7 = objOnMinimized6;
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                CreditTestActivity$.ExternalSyntheticLambda53 externalSyntheticLambda53 = new CreditTestActivity$.ExternalSyntheticLambda53(creditTestActivity);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda53);
                                obj7 = externalSyntheticLambda53;
                            }
                            w4.onExtraCallbackWithResult(getbacktracenote2, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj7, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                            w4.onExtraCallbackWithResult(backgroundModeProxy.onUnminimized(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1052719183, true, new CreditTestActivity$.ExternalSyntheticLambda54(getsupportedhighspeedresolutionsfor2), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
                            w4.onExtraCallbackWithResult(backgroundModeProxy.onActivityLayout(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1451431950, true, new CreditTestActivity$.ExternalSyntheticLambda55(getsupportedhighspeedresolutionsfor3), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
                            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1197842883, true, new CreditTestActivity$.ExternalSyntheticLambda56(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54);
                            boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnExtraCallback8) {
                                Object obj8 = objOnMinimized7;
                                if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                    CreditTestActivity$.ExternalSyntheticLambda17 externalSyntheticLambda17 = new CreditTestActivity$.ExternalSyntheticLambda17(creditTestActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda17);
                                    obj8 = externalSyntheticLambda17;
                                }
                                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj8, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.onExtraCallbackWithResult onextracallbackwithresult2 = AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion;
                                AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"📝 신용성향설문 테스트 기능 모음", CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 6, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                getBacktraceNote getbacktracenoteAccess000 = backgroundModeProxy.access000();
                                boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnExtraCallback9) {
                                    Object obj9 = objOnMinimized8;
                                    if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                        CreditTestActivity$.ExternalSyntheticLambda18 externalSyntheticLambda18 = new CreditTestActivity$.ExternalSyntheticLambda18(creditTestActivity);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda18);
                                        obj9 = externalSyntheticLambda18;
                                    }
                                    w4.onExtraCallbackWithResult(getbacktracenoteAccess000, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj9, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                    getBacktraceNote getbacktracenote3 = (getBacktraceNote) BackgroundModeProxy.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1714245949, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{backgroundModeProxy}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1714245938, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                                    boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!zOnExtraCallback10) {
                                        Object obj10 = objOnMinimized9;
                                        if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                                            CreditTestActivity$.ExternalSyntheticLambda19 externalSyntheticLambda19 = new CreditTestActivity$.ExternalSyntheticLambda19(creditTestActivity);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda19);
                                            obj10 = externalSyntheticLambda19;
                                        }
                                        w4.onExtraCallbackWithResult(getbacktracenote3, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj10, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                        AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🌠 신용 퀴즈 테스트 기능 모음", CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 6, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1098907717, true, new CreditTestActivity$.ExternalSyntheticLambda20(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                        boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (!zOnExtraCallback11) {
                                            Object obj11 = objOnMinimized10;
                                            if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                                                CreditTestActivity$.ExternalSyntheticLambda21 externalSyntheticLambda21 = new CreditTestActivity$.ExternalSyntheticLambda21(creditTestActivity);
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda21);
                                                obj11 = externalSyntheticLambda21;
                                            }
                                            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj11, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(-1497620484, true, new CreditTestActivity$.ExternalSyntheticLambda22(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                            boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!zOnExtraCallback12) {
                                                Object obj12 = objOnMinimized11;
                                                if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                                                    CreditTestActivity$.ExternalSyntheticLambda23 externalSyntheticLambda23 = new CreditTestActivity$.ExternalSyntheticLambda23(creditTestActivity);
                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda23);
                                                    obj12 = externalSyntheticLambda23;
                                                }
                                                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback3, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj12, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                getBacktraceNote getbacktracenoteAsInterface = backgroundModeProxy.asInterface();
                                                boolean zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                if (!zOnExtraCallback13) {
                                                    Object obj13 = objOnMinimized12;
                                                    if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                                                        CreditTestActivity$.ExternalSyntheticLambda24 externalSyntheticLambda24 = new CreditTestActivity$.ExternalSyntheticLambda24(creditTestActivity);
                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda24);
                                                        obj13 = externalSyntheticLambda24;
                                                    }
                                                    w4.onExtraCallbackWithResult(getbacktracenoteAsInterface, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj13, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                    getBacktraceNote getbacktracenoteICustomTabsCallbackDefault = backgroundModeProxy.ICustomTabsCallbackDefault();
                                                    boolean zOnExtraCallback14 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                    Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (!zOnExtraCallback14) {
                                                        Object obj14 = objOnMinimized13;
                                                        if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                                                            CreditTestActivity$.ExternalSyntheticLambda25 externalSyntheticLambda25 = new CreditTestActivity$.ExternalSyntheticLambda25(creditTestActivity);
                                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda25);
                                                            obj14 = externalSyntheticLambda25;
                                                        }
                                                        w4.onExtraCallbackWithResult(getbacktracenoteICustomTabsCallbackDefault, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj14, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                        AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                                                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🧸 신용플러스 테스트 기능 모음", CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 6, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                                        getBacktraceNote getbacktracenoteOnMinimized = backgroundModeProxy.onMinimized();
                                                        boolean zOnExtraCallback15 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                        Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (!zOnExtraCallback15) {
                                                            int i8 = onTransact + 5;
                                                            asBinder = i8 % 128;
                                                            if (i8 % 2 != 0) {
                                                                int i9 = 45 / 0;
                                                                obj2 = objOnMinimized14;
                                                                if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                                                                    CreditTestActivity$.ExternalSyntheticLambda26 externalSyntheticLambda26 = new CreditTestActivity$.ExternalSyntheticLambda26(creditTestActivity);
                                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda26);
                                                                    obj2 = externalSyntheticLambda26;
                                                                }
                                                                w4.onExtraCallbackWithResult(getbacktracenoteOnMinimized, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                getBacktraceNote getbacktracenoteOnActivityResized = backgroundModeProxy.onActivityResized();
                                                                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                if (zOnExtraCallback2) {
                                                                    Object obj15 = objOnMinimized15;
                                                                    if (objOnMinimized15 == onwarmupcompleted.onExtraCallback()) {
                                                                        CreditTestActivity$.ExternalSyntheticLambda28 externalSyntheticLambda28 = new CreditTestActivity$.ExternalSyntheticLambda28(creditTestActivity);
                                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda28);
                                                                        obj15 = externalSyntheticLambda28;
                                                                    }
                                                                    w4.onExtraCallbackWithResult(getbacktracenoteOnActivityResized, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj15, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                    getBacktraceNote getbacktracenoteExtraCommand = backgroundModeProxy.extraCommand();
                                                                    boolean zOnExtraCallback16 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                    Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                    if (!zOnExtraCallback16) {
                                                                        Object obj16 = objOnMinimized16;
                                                                        if (objOnMinimized16 == onwarmupcompleted.onExtraCallback()) {
                                                                            CreditTestActivity$.ExternalSyntheticLambda29 externalSyntheticLambda29 = new CreditTestActivity$.ExternalSyntheticLambda29(creditTestActivity);
                                                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda29);
                                                                            obj16 = externalSyntheticLambda29;
                                                                        }
                                                                        w4.onExtraCallbackWithResult(getbacktracenoteExtraCommand, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj16, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                        w4.onExtraCallbackWithResult(backgroundModeProxy.mayLaunchUrl(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(406735122, true, new CreditTestActivity$.ExternalSyntheticLambda30(getsupportedhighspeedresolutionsfor4), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
                                                                        w4.onExtraCallbackWithResult((getBacktraceNote) BackgroundModeProxy.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 2064813985, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{backgroundModeProxy}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -2064813967, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback()), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(224988840, true, new CreditTestActivity$.ExternalSyntheticLambda31(getsupportedhighspeedresolutionsfor5), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
                                                                        getBacktraceNote getbacktracenote4 = (getBacktraceNote) BackgroundModeProxy.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -180482925, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{backgroundModeProxy}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 180482925, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                                                                        boolean zOnExtraCallback17 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                        Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                        if (!zOnExtraCallback17) {
                                                                            Object obj17 = objOnMinimized17;
                                                                            if (objOnMinimized17 == onwarmupcompleted.onExtraCallback()) {
                                                                                CreditTestActivity$.ExternalSyntheticLambda32 externalSyntheticLambda32 = new CreditTestActivity$.ExternalSyntheticLambda32(creditTestActivity);
                                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda32);
                                                                                obj17 = externalSyntheticLambda32;
                                                                            }
                                                                            w4.onExtraCallbackWithResult(getbacktracenote4, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj17, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                            getBacktraceNote typedObject = backgroundModeProxy.readTypedObject();
                                                                            boolean zOnExtraCallback18 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                            Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                            if (!zOnExtraCallback18) {
                                                                                int i10 = asBinder + 103;
                                                                                onTransact = i10 % 128;
                                                                                if (i10 % 2 == 0) {
                                                                                    int i11 = 37 / 0;
                                                                                    obj3 = objOnMinimized18;
                                                                                    if (objOnMinimized18 == onwarmupcompleted.onExtraCallback()) {
                                                                                        CreditTestActivity$.ExternalSyntheticLambda33 externalSyntheticLambda33 = new CreditTestActivity$.ExternalSyntheticLambda33(creditTestActivity);
                                                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda33);
                                                                                        obj3 = externalSyntheticLambda33;
                                                                                    }
                                                                                    w4.onExtraCallbackWithResult(typedObject, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj3, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                    AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                                                                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🐎 신점올 테스트 기능 모음", CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 6, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                                                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback4 = ForwardingCameraControl.onExtraCallback(-972814373, true, new CreditTestActivity$.ExternalSyntheticLambda34(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                                                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                    Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                    if (!zOnExtraCallback3) {
                                                                                        CreditTestActivity$.ExternalSyntheticLambda35 externalSyntheticLambda35 = new CreditTestActivity$.ExternalSyntheticLambda35(creditTestActivity);
                                                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda35);
                                                                                        obj4 = externalSyntheticLambda35;
                                                                                        w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback4, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj4, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                        getBacktraceNote getbacktracenoteOnExtraCallbackWithResult = backgroundModeProxy.onExtraCallbackWithResult();
                                                                                        zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                        Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                        if (zOnExtraCallback4) {
                                                                                            int i12 = onTransact + 5;
                                                                                            asBinder = i12 % 128;
                                                                                            int i13 = i12 % 2;
                                                                                            Object obj18 = objOnMinimized20;
                                                                                            if (objOnMinimized20 == onwarmupcompleted.onExtraCallback()) {
                                                                                                CreditTestActivity$.ExternalSyntheticLambda36 externalSyntheticLambda36 = new CreditTestActivity$.ExternalSyntheticLambda36(creditTestActivity);
                                                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda36);
                                                                                                obj18 = externalSyntheticLambda36;
                                                                                            }
                                                                                            w4.onExtraCallbackWithResult(getbacktracenoteOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj18, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback5 = ForwardingCameraControl.onExtraCallback(-1770239907, true, new CreditTestActivity$.ExternalSyntheticLambda37(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                                                            boolean zOnExtraCallback19 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                            Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                            if (!zOnExtraCallback19) {
                                                                                                int i14 = onTransact + 5;
                                                                                                asBinder = i14 % 128;
                                                                                                int i15 = i14 % 2;
                                                                                                Object obj19 = objOnMinimized21;
                                                                                                if (objOnMinimized21 == onwarmupcompleted.onExtraCallback()) {
                                                                                                    CreditTestActivity$.ExternalSyntheticLambda39 externalSyntheticLambda39 = new CreditTestActivity$.ExternalSyntheticLambda39(creditTestActivity);
                                                                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda39);
                                                                                                    obj19 = externalSyntheticLambda39;
                                                                                                }
                                                                                                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback5, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj19, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                                getBacktraceNote getbacktracenoteICustomTabsCallbackStub = backgroundModeProxy.ICustomTabsCallbackStub();
                                                                                                boolean zOnExtraCallback20 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                if (!zOnExtraCallback20) {
                                                                                                    int i16 = asBinder + 95;
                                                                                                    onTransact = i16 % 128;
                                                                                                    int i17 = i16 % 2;
                                                                                                    Object obj20 = objOnMinimized22;
                                                                                                    if (objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
                                                                                                        CreditTestActivity$.ExternalSyntheticLambda40 externalSyntheticLambda40 = new CreditTestActivity$.ExternalSyntheticLambda40(creditTestActivity);
                                                                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda40);
                                                                                                        obj20 = externalSyntheticLambda40;
                                                                                                    }
                                                                                                    w4.onExtraCallbackWithResult(getbacktracenoteICustomTabsCallbackStub, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj20, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                                    getBacktraceNote getbacktracenoteOnMessageChannelReady = backgroundModeProxy.onMessageChannelReady();
                                                                                                    boolean zOnExtraCallback21 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                                    Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                    if (!zOnExtraCallback21) {
                                                                                                        Object obj21 = objOnMinimized23;
                                                                                                        if (objOnMinimized23 == onwarmupcompleted.onExtraCallback()) {
                                                                                                            CreditTestActivity$.ExternalSyntheticLambda41 externalSyntheticLambda41 = new CreditTestActivity$.ExternalSyntheticLambda41(creditTestActivity);
                                                                                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda41);
                                                                                                            obj21 = externalSyntheticLambda41;
                                                                                                        }
                                                                                                        w4.onExtraCallbackWithResult(getbacktracenoteOnMessageChannelReady, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj21, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                                        w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1328589088, true, new CreditTestActivity$.ExternalSyntheticLambda42(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(1330254000, true, new CreditTestActivity$.ExternalSyntheticLambda43(getsupportedhighspeedresolutionsfor6), cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
                                                                                                        AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                                                                                                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"😡 약관 테스트 기능 모음", CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 6, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                                                                                        getBacktraceNote getbacktracenotePostMessage = backgroundModeProxy.postMessage();
                                                                                                        boolean zOnExtraCallback22 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                                        Object objOnMinimized24 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                        if (!zOnExtraCallback22) {
                                                                                                            Object obj22 = objOnMinimized24;
                                                                                                            if (objOnMinimized24 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                CreditTestActivity$.ExternalSyntheticLambda44 externalSyntheticLambda44 = new CreditTestActivity$.ExternalSyntheticLambda44(creditTestActivity);
                                                                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda44);
                                                                                                                obj22 = externalSyntheticLambda44;
                                                                                                            }
                                                                                                            w4.onExtraCallbackWithResult(getbacktracenotePostMessage, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj22, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                                            getBacktraceNote getbacktracenote5 = (getBacktraceNote) BackgroundModeProxy.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -708801543, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{backgroundModeProxy}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 708801550, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                                                                                                            boolean zOnExtraCallback23 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                                            Object objOnMinimized25 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                            if (!zOnExtraCallback23) {
                                                                                                                Object obj23 = objOnMinimized25;
                                                                                                                if (objOnMinimized25 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                    CreditTestActivity$.ExternalSyntheticLambda45 externalSyntheticLambda45 = new CreditTestActivity$.ExternalSyntheticLambda45(creditTestActivity);
                                                                                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda45);
                                                                                                                    obj23 = externalSyntheticLambda45;
                                                                                                                }
                                                                                                                w4.onExtraCallbackWithResult(getbacktracenote5, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj23, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                                                getBacktraceNote getbacktracenoteOnRelationshipValidationResult = backgroundModeProxy.onRelationshipValidationResult();
                                                                                                                boolean zOnExtraCallback24 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                                                Object objOnMinimized26 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                                if (!zOnExtraCallback24) {
                                                                                                                    Object obj24 = objOnMinimized26;
                                                                                                                    if (objOnMinimized26 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                        CreditTestActivity$.ExternalSyntheticLambda46 externalSyntheticLambda46 = new CreditTestActivity$.ExternalSyntheticLambda46(creditTestActivity);
                                                                                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda46);
                                                                                                                        obj24 = externalSyntheticLambda46;
                                                                                                                    }
                                                                                                                    w4.onExtraCallbackWithResult(getbacktracenoteOnRelationshipValidationResult, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj24, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                                                    getBacktraceNote getbacktracenoteIAuthTabCallback_Parcel = backgroundModeProxy.IAuthTabCallback_Parcel();
                                                                                                                    boolean zOnExtraCallback25 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                                                    Object objOnMinimized27 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                                    if (!zOnExtraCallback25) {
                                                                                                                        Object obj25 = objOnMinimized27;
                                                                                                                        if (objOnMinimized27 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                            CreditTestActivity$.ExternalSyntheticLambda47 externalSyntheticLambda47 = new CreditTestActivity$.ExternalSyntheticLambda47(creditTestActivity);
                                                                                                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda47);
                                                                                                                            obj25 = externalSyntheticLambda47;
                                                                                                                        }
                                                                                                                        w4.onExtraCallbackWithResult(getbacktracenoteIAuthTabCallback_Parcel, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj25, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                                                        getBacktraceNote getbacktracenote6 = (getBacktraceNote) BackgroundModeProxy.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -80714585, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{backgroundModeProxy}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 80714602, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                                                                                                                        boolean zOnExtraCallback26 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                                                        Object objOnMinimized28 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                                        if (!zOnExtraCallback26) {
                                                                                                                            Object obj26 = objOnMinimized28;
                                                                                                                            if (objOnMinimized28 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                                CreditTestActivity$.ExternalSyntheticLambda48 externalSyntheticLambda48 = new CreditTestActivity$.ExternalSyntheticLambda48(creditTestActivity);
                                                                                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda48);
                                                                                                                                obj26 = externalSyntheticLambda48;
                                                                                                                            }
                                                                                                                            w4.onExtraCallbackWithResult(getbacktracenote6, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj26, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                                                            getBacktraceNote getbacktracenote7 = (getBacktraceNote) BackgroundModeProxy.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 777989927, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{backgroundModeProxy}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -777989901, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                                                                                                                            boolean zOnExtraCallback27 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                                                            Object objOnMinimized29 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                                                            if (!zOnExtraCallback27) {
                                                                                                                                Object obj27 = objOnMinimized29;
                                                                                                                                if (objOnMinimized29 == onwarmupcompleted.onExtraCallback()) {
                                                                                                                                    CreditTestActivity$.ExternalSyntheticLambda50 externalSyntheticLambda50 = new CreditTestActivity$.ExternalSyntheticLambda50(creditTestActivity);
                                                                                                                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda50);
                                                                                                                                    obj27 = externalSyntheticLambda50;
                                                                                                                                }
                                                                                                                                w4.onExtraCallbackWithResult(getbacktracenote7, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj27, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                                                                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                                                                                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                                                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        obj4 = objOnMinimized19;
                                                                                        if (objOnMinimized19 == onwarmupcompleted.onExtraCallback()) {
                                                                                        }
                                                                                        w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback4, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj4, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                        getBacktraceNote getbacktracenoteOnExtraCallbackWithResult2 = backgroundModeProxy.onExtraCallbackWithResult();
                                                                                        zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                        Object objOnMinimized202 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                        if (zOnExtraCallback4) {
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    obj3 = objOnMinimized18;
                                                                                    if (objOnMinimized18 == onwarmupcompleted.onExtraCallback()) {
                                                                                    }
                                                                                    w4.onExtraCallbackWithResult(typedObject, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj3, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                                    AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                                                                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"🐎 신점올 테스트 기능 모음", CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 6, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                                                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback42 = ForwardingCameraControl.onExtraCallback(-972814373, true, new CreditTestActivity$.ExternalSyntheticLambda34(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54);
                                                                                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                                    Object objOnMinimized192 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                                    if (!zOnExtraCallback3) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                obj2 = objOnMinimized14;
                                                                if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                                                                }
                                                                w4.onExtraCallbackWithResult(getbacktracenoteOnMinimized, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                                                                getBacktraceNote getbacktracenoteOnActivityResized2 = backgroundModeProxy.onActivityResized();
                                                                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                                                                Object objOnMinimized152 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                                if (zOnExtraCallback2) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        obj = objOnMinimized5;
                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        }
                        w4.onExtraCallbackWithResult(getbacktracenoteOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                        getBacktraceNote getbacktracenote22 = (getBacktraceNote) BackgroundModeProxy.onExtraCallbackWithResult(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -497600093, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{backgroundModeProxy}, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 497600106, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback());
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditTestActivity);
                        Object objOnMinimized62 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnExtraCallback) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(CreditTestActivity creditTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onTransact + 73;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(259965549, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous>.<anonymous> (CreditTestActivity.kt:121)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult(YuvImageOnePixelShiftQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion), (dequeImageProxy) null, ForwardingCameraControl.onExtraCallback(230735666, true, new CreditTestActivity$.ExternalSyntheticLambda64(creditTestActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(-1726893269, true, new CreditTestActivity$.ExternalSyntheticLambda65(creditTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384, 12582912, 131066);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i4 = asBinder + 125;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 87;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(CreditTestActivity creditTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(660103877, i, -1, "im.toss.feature.credit.ui.main.test.CreditTestActivity.initView.<anonymous> (CreditTestActivity.kt:113)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            Object obj = null;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i3 = onTransact + 119;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("PREF_USE_BANK", false)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("PREF_CREDIT_PLUS_TEST_PAY", false)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("PREF_CREDIT_PLUS_GIFT_TEST_PAY", false)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                int i5 = asBinder + 109;
                onTransact = i5 % 128;
                objOnMinimized4 = i5 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(RVNativePermissionRequestManager.onExtraCallback(addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("PREF_NICE_RESULT_CODE", "")), (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(RVNativePermissionRequestManager.onExtraCallback(addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("PREF_NICE_RESULT_CODE", "")), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((String) RVNativePermissionRequestManager.onExtraCallbackWithResult(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_CREDIT_TEST_HISTORY_FORCE_KCB", "")}, 1747598685, -1747598682, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((String) RVNativePermissionRequestManager.onExtraCallbackWithResult(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_CREDIT_TEST_HISTORY_FORCE_NICE", "")}, 1747598685, -1747598682, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(259965549, true, new CreditTestActivity$.ExternalSyntheticLambda61(creditTestActivity, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, (getSupportedHighSpeedResolutionsFor) objOnMinimized6, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = onTransact + 85;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = asBinder + 73;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void ICustomTabsService_Parcel() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
        int i2 = onTransact + 5;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = CreditTestActivity.this.new onNavigationEvent(access13800Var);
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = onExtraCallback + 5;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    BaseActivity.IAuthTabCallback((BaseActivity) CreditTestActivity.this, (String) null, false, 3, (Object) null);
                    CreditTestActivity creditTestActivity = CreditTestActivity.this;
                    Result.Companion companion = Result.Companion;
                    getAppAlias engagementSignalsCallback = creditTestActivity.setEngagementSignalsCallback();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = engagementSignalsCallback.onNavigationEvent(this);
                    if (obj == objOnWarmupCompleted) {
                        int i4 = onExtraCallbackWithResult + 51;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                obj2 = Result.constructor-impl(obj);
                int i6 = onExtraCallbackWithResult + 45;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, gethostnameverifierokhttp.getString(R.string.credit_ui_main_test___9b3277309e), 0, 2, null);
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp2 = CreditTestActivity.this;
            if (Result.onNavigationEvent(obj2)) {
                if (Intrinsics.areEqual(((BaseApiResponse) obj2).onTransact(), access14000.onNavigationEvent(true))) {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp2, gethostnameverifierokhttp2.getString(R.string.credit_ui_main_test___32db8b6050), 0, 2, null);
                } else {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp2, gethostnameverifierokhttp2.getString(R.string.credit_ui_main_test___9b3277309e), 0, 2, null);
                }
            }
            CreditTestActivity.this.bo_();
            return Unit.INSTANCE;
        }
    }

    private final void onVerticalScrollEvent() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = CreditTestActivity.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onWarmupCompleted + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = onExtraCallback + 31;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    BaseActivity.IAuthTabCallback((BaseActivity) CreditTestActivity.this, (String) null, false, 3, (Object) null);
                    CreditTestActivity creditTestActivity = CreditTestActivity.this;
                    Result.Companion companion = Result.Companion;
                    int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (objOnWarmupCompleted == null) {
                        int i4 = onWarmupCompleted + 21;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return objOnWarmupCompleted;
                    }
                    obj = null;
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (!(!Result.onNavigationEvent(obj2))) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "신용플러스 무료체험 초대 성공", 0, 2, null);
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp2 = CreditTestActivity.this;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp2, "초대 실패", 0, 2, null);
                int i6 = onExtraCallback + 99;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 5;
                }
            }
            CreditTestActivity.this.bo_();
            return Unit.INSTANCE;
        }
    }

    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(null), 3, (Object) null);
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = CreditTestActivity.this.new IAuthTabCallback(access13800Var);
            int i2 = onWarmupCompleted + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return iAuthTabCallbackCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
                if (i4 != 0) {
                    int i5 = onWarmupCompleted + 7;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    BaseActivity.IAuthTabCallback((BaseActivity) CreditTestActivity.this, (String) null, false, 3, (Object) null);
                    CreditTestActivity creditTestActivity = CreditTestActivity.this;
                    Result.Companion companion = Result.Companion;
                    int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (objOnWarmupCompleted == null) {
                        return objOnWarmupCompleted;
                    }
                    obj = null;
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (Result.onNavigationEvent(obj2)) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "신용플러스 무료체험 내역 삭제", 0, 2, null);
                int i6 = onWarmupCompleted + 23;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp2 = CreditTestActivity.this;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp2, "삭제 실패", 0, 2, null);
            }
            CreditTestActivity.this.bo_();
            Unit unit = Unit.INSTANCE;
            int i8 = IAuthTabCallback + 83;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    private final void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new access100(null), 3, (Object) null);
        int i2 = onTransact + 35;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        access100(access13800<? super access100> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = CreditTestActivity.this.new access100(access13800Var);
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return access100Var;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    BaseActivity.IAuthTabCallback((BaseActivity) CreditTestActivity.this, (String) null, false, 3, (Object) null);
                    CreditTestActivity creditTestActivity = CreditTestActivity.this;
                    Result.Companion companion = Result.Companion;
                    int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (objOnWarmupCompleted == null) {
                        return objOnWarmupCompleted;
                    }
                    obj = null;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (Exception e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (Result.onNavigationEvent(obj2)) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "환불 성공", 0, 2, null);
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp2 = CreditTestActivity.this;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                int i5 = onExtraCallback + 29;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp2, "환불 실패", 0, 4, null);
                } else {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp2, "환불 실패", 0, 2, null);
                }
            }
            CreditTestActivity.this.bo_();
            Unit unit = Unit.INSTANCE;
            int i6 = onWarmupCompleted + 73;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(z, null), 3, (Object) null);
        int i2 = onTransact + 55;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean $resetAll;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(boolean z, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$resetAll = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = CreditTestActivity.this.new IAuthTabCallbackStubProxy(this.$resetAll, access13800Var);
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStubProxy;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 111;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 111;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    BaseActivity.IAuthTabCallback((BaseActivity) CreditTestActivity.this, (String) null, false, 3, (Object) null);
                    CreditTestActivity creditTestActivity = CreditTestActivity.this;
                    boolean z = this.$resetAll;
                    Result.Companion companion = Result.Companion;
                    getDevicePerformance getdeviceperformanceICustomTabsServiceStub = creditTestActivity.ICustomTabsServiceStub();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = getdeviceperformanceICustomTabsServiceStub.onNavigationEvent(z, this);
                    if (obj == objOnWarmupCompleted) {
                        int i5 = IAuthTabCallback + 99;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (Result.onNavigationEvent(obj2)) {
                int i7 = IAuthTabCallback + 59;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "초기화 성공", 0, 5, null);
                } else {
                    onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "초기화 성공", 0, 2, null);
                }
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp2 = CreditTestActivity.this;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp2, "초기화 실패", 0, 2, null);
                int i8 = IAuthTabCallback + 45;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            CreditTestActivity.this.bo_();
            return Unit.INSTANCE;
        }
    }

    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
        int i2 = onTransact + 21;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = CreditTestActivity.this.new onExtraCallback(access13800Var);
            int i2 = onWarmupCompleted + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 81;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onextracallbackCreate.invokeSuspend(unit);
            }
            onextracallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = IAuthTabCallback + 45;
                    int i4 = i3 % 128;
                    onWarmupCompleted = i4;
                    if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i4 + 29;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    int i7 = IAuthTabCallback + 107;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    BaseActivity.IAuthTabCallback((BaseActivity) CreditTestActivity.this, (String) null, false, 3, (Object) null);
                    CreditTestActivity creditTestActivity = CreditTestActivity.this;
                    Result.Companion companion = Result.Companion;
                    int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                    int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
                    hasRootStatusPermission hasrootstatuspermission = (hasRootStatusPermission) CreditTestActivity.onWarmupCompleted(-753801095, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 753801100, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = hasrootstatuspermission.onWarmupCompleted(this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp = CreditTestActivity.this;
            if (Result.onNavigationEvent(obj2)) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp, "취소 성공", 0, 2, null);
            }
            getHostnameVerifierokhttp gethostnameverifierokhttp2 = CreditTestActivity.this;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                onJsBridgeReady.onNavigationEvent(gethostnameverifierokhttp2, "취소 실패", 0, 2, null);
            }
            CreditTestActivity.this.bo_();
            Unit unit = Unit.INSTANCE;
            int i9 = onWarmupCompleted + 67;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }
    }

    private final void writeTypedList() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
    }

    private static final void asBinder(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_RESULT", z);
        } else {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_RESULT", z);
            int i3 = 28 / 0;
        }
    }

    private static final void onTransact(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_RESULT_NICE", z);
        int i4 = onTransact + 19;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        CompoundButton compoundButton = (CompoundButton) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_COOLTIME", zBooleanValue);
            return null;
        }
        Intrinsics.checkNotNullParameter(compoundButton, "");
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_COOLTIME", zBooleanValue);
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStub(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_TOSSMOBILE", z);
        int i4 = asBinder + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void asInterface(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_BANK", z);
        } else {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_BANK", z);
            throw null;
        }
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_RESULT", true);
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_BANK", true);
        } else {
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_RESULT", false);
            addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_BANK", false);
        }
        addPolicy.ITrustedWebActivityCallbackDefault().onNavigationEvent("KEY_SCORE_RAISE_TOSSMOBILE", false);
        gettypedexportedconstants.dismiss();
        int i3 = onTransact + 27;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static final void asInterface(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        gettypedexportedconstants.dismiss();
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceStub() {
        int i = 2 % 2;
        getInterfaceDescriptor getinterfacedescriptor = getInterfaceDescriptor.onNavigationEvent;
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, getinterfacedescriptor, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle("신점올 결과 조작");
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context3, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW2C;
        tdsListRowV1View.setCenterType(onextracallbackwithresult);
        Context context4 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new ICustomTabsCallback(configuration)).onRelationshipValidationResult());
        tdsListRowV1View.setCenterText1("신점올 결과에서 KCB 점수 상승");
        TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.SWITCH;
        tdsListRowV1View.setRightType(asbinder);
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View != null) {
            tdsSwitchV1View.setOnCheckedChangeListener(new CreditTestActivity$.ExternalSyntheticLambda6());
            int i2 = asBinder + 1;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View, addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("KEY_SCORE_RAISE_RESULT", false), false, 2, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsListRowV1View tdsListRowV1View2 = new TdsListRowV1View(context5, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View2.setCenterType(onextracallbackwithresult);
        Context context6 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        Configuration configuration2 = context6.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new extraCallback(configuration2)).onRelationshipValidationResult());
        tdsListRowV1View2.setCenterText1("신점올 결과에서 NICE 점수 상승");
        tdsListRowV1View2.setRightType(asbinder);
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        TdsSwitchV1View tdsSwitchV1View2 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View2}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View2 != null) {
            tdsSwitchV1View2.setOnCheckedChangeListener(new CreditTestActivity$.ExternalSyntheticLambda7());
        }
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View2, addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("KEY_SCORE_RAISE_RESULT_NICE", false), false, 2, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View2);
        Context context7 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        TdsListRowV1View tdsListRowV1View3 = new TdsListRowV1View(context7, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View3.setCenterType(onextracallbackwithresult);
        Context context8 = tdsListRowV1View3.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        Configuration configuration3 = context8.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsListRowV1View3.setCenterText1Color(new getUrlokhttp(new readTypedObject(configuration3)).onRelationshipValidationResult());
        tdsListRowV1View3.setCenterText1("신점올 쿨타임 화면 보기");
        tdsListRowV1View3.setRightType(asbinder);
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        TdsSwitchV1View tdsSwitchV1View3 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View3}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent3, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View3 != null) {
            tdsSwitchV1View3.setOnCheckedChangeListener(new CreditTestActivity$.ExternalSyntheticLambda8());
        }
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View3, addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("KEY_SCORE_RAISE_COOLTIME", false), false, 2, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View3);
        Context context9 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        TdsListRowV1View tdsListRowV1View4 = new TdsListRowV1View(context9, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View4.setCenterType(onextracallbackwithresult);
        Context context10 = tdsListRowV1View4.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "");
        Configuration configuration4 = context10.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        tdsListRowV1View4.setCenterText1Color(new getUrlokhttp(new extraCallbackWithResult(configuration4)).onRelationshipValidationResult());
        tdsListRowV1View4.setCenterText1("신점올 토스모바일 유저 되기");
        tdsListRowV1View4.setRightType(asbinder);
        int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        TdsSwitchV1View tdsSwitchV1View4 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View4}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent4, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View4 != null) {
            tdsSwitchV1View4.setOnCheckedChangeListener(new CreditTestActivity$.ExternalSyntheticLambda9());
            int i4 = asBinder + 107;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 3;
            }
        }
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View4, addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("KEY_SCORE_RAISE_TOSSMOBILE", false), false, 2, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View4);
        Context context11 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "");
        TdsListRowV1View tdsListRowV1View5 = new TdsListRowV1View(context11, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View5.setCenterType(onextracallbackwithresult);
        Context context12 = tdsListRowV1View5.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "");
        Configuration configuration5 = context12.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        tdsListRowV1View5.setCenterText1Color(new getUrlokhttp(new writeTypedObject(configuration5)).onRelationshipValidationResult());
        tdsListRowV1View5.setCenterText1("신점올 뱅크 비회원 유저 되기");
        tdsListRowV1View5.setRightType(asbinder);
        int iOnNavigationEvent5 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        TdsSwitchV1View tdsSwitchV1View5 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View5}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent5, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View5 != null) {
            tdsSwitchV1View5.setOnCheckedChangeListener(new CreditTestActivity$.ExternalSyntheticLambda10());
        }
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View5, addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallback("KEY_SCORE_RAISE_BANK", false), false, 2, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View5);
        TdsButtonV1View.asInterface asinterface = new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, TdsButtonV1View.IAuthTabCallback.BLOCK, 5, (DefaultConstructorMarker) null);
        Context context13 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "");
        TdsButtonV1View tdsButtonV1View = new TdsButtonV1View(context13);
        tdsButtonV1View.setTheme(asinterface);
        tdsButtonV1View.setText("가짜결과 설정 초기화");
        tdsButtonV1View.setOnClickListener(new CreditTestActivity$.ExternalSyntheticLambda11(gettypedexportedconstants));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsButtonV1View);
        TdsButtonV1View.asInterface asinterface2 = new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, TdsButtonV1View.IAuthTabCallbackDefault.FILL, (TdsButtonV1View.onWarmupCompleted) null, TdsButtonV1View.IAuthTabCallback.FULL, 5, (DefaultConstructorMarker) null);
        Context context14 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context14, "");
        TdsButtonV1View tdsButtonV1View2 = new TdsButtonV1View(context14);
        tdsButtonV1View2.setTheme(asinterface2);
        tdsButtonV1View2.setText("완료");
        tdsButtonV1View2.setEnabled(true);
        tdsButtonV1View2.setOnClickListener(new CreditTestActivity$.ExternalSyntheticLambda12(gettypedexportedconstants));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsButtonV1View2);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    private static final void onExtraCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_CREDIT_TEST_KCB_SCORE", 0);
        addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_CREDIT_TEST_NICE_SCORE", 0);
        gettypedexportedconstants.dismiss();
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TextField textField;
        int iIntValue;
        TextField textField2;
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[0];
        Ref.ObjectRef objectRef2 = (Ref.ObjectRef) objArr[1];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault = addPolicy.ITrustedWebActivityCallbackDefault();
            Object obj2 = objectRef.element;
            if (obj2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textField = null;
            } else {
                textField = (TextField) obj2;
                int i3 = onTransact + 79;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            }
            Integer intOrNull = StringsKt.toIntOrNull(((Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{textField}, -450491624, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).toString());
            if (intOrNull != null) {
                int i5 = asBinder + 65;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                iIntValue = intOrNull.intValue();
            } else {
                int i7 = asBinder + 17;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                iIntValue = 0;
            }
            textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault.onExtraCallbackWithResult("KEY_CREDIT_TEST_KCB_SCORE", iIntValue);
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault2 = addPolicy.ITrustedWebActivityCallbackDefault();
            Object obj3 = objectRef2.element;
            if (obj3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textField2 = null;
            } else {
                textField2 = (TextField) obj3;
            }
            Integer intOrNull2 = StringsKt.toIntOrNull(((Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{textField2}, -450491624, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).toString());
            textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault2.onExtraCallbackWithResult("KEY_CREDIT_TEST_NICE_SCORE", intOrNull2 != null ? intOrNull2.intValue() : 0);
            gettypedexportedconstants.dismiss();
            return null;
        }
        addPolicy.ITrustedWebActivityCallbackDefault();
        Object obj4 = objectRef.element;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        int iOnWarmupCompleted = addPolicy.ITrustedWebActivityCallbackDefault().onWarmupCompleted("KEY_CREDIT_TEST_KCB_SCORE", 0);
        int iOnWarmupCompleted2 = addPolicy.ITrustedWebActivityCallbackDefault().onWarmupCompleted("KEY_CREDIT_TEST_NICE_SCORE", 0);
        access000 access000Var = access000.onExtraCallback;
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, access000Var, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle("신용 점수를 입력해주세요 (차례대로 KCB, NICE)");
        bottomSheetHeader.setDescription("가짜 점수 설정을 초기화하려면 빈 값이나 0을 입력해주세요");
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        TextField.onWarmupCompleted onwarmupcompleted = TextField.onWarmupCompleted.NORMAL;
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TextField textField = new TextField(context3);
        textField.setTextFieldType(onwarmupcompleted);
        DisplayMetrics displayMetrics = textField.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = textField.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        Object[] objArr = {textField, Integer.valueOf(iOnNavigationEvent), Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics2))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -935338024, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 935338026);
        textField.IAuthTabCallback().setInputType(2);
        textField.setText(String.valueOf(iOnWarmupCompleted));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, textField);
        objectRef.element = textField;
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TextField textField2 = new TextField(context4);
        textField2.setTextFieldType(onwarmupcompleted);
        DisplayMetrics displayMetrics3 = textField2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics3);
        DisplayMetrics displayMetrics4 = textField2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        Object[] objArr2 = {textField2, Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics4))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -935338024, objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 935338026);
        textField2.IAuthTabCallback().setInputType(2);
        textField2.setText(String.valueOf(iOnWarmupCompleted2));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, textField2);
        objectRef2.element = textField2;
        TdsButtonV1View.asInterface asinterface = new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, TdsButtonV1View.IAuthTabCallback.BLOCK, 5, (DefaultConstructorMarker) null);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsButtonV1View tdsButtonV1View = new TdsButtonV1View(context5);
        tdsButtonV1View.setTheme(asinterface);
        tdsButtonV1View.setText("가짜점수 설정 초기화");
        tdsButtonV1View.setOnClickListener(new CreditTestActivity$.ExternalSyntheticLambda3(gettypedexportedconstants));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsButtonV1View);
        TdsButtonV1View.asInterface asinterface2 = new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, TdsButtonV1View.IAuthTabCallbackDefault.FILL, (TdsButtonV1View.onWarmupCompleted) null, TdsButtonV1View.IAuthTabCallback.FULL, 5, (DefaultConstructorMarker) null);
        Context context6 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsButtonV1View tdsButtonV1View2 = new TdsButtonV1View(context6);
        tdsButtonV1View2.setTheme(asinterface2);
        tdsButtonV1View2.setText(getString(viva.republica.toss.R.string.save));
        tdsButtonV1View2.setEnabled(true);
        tdsButtonV1View2.setOnClickListener(new CreditTestActivity$.ExternalSyntheticLambda4(objectRef, objectRef2, gettypedexportedconstants));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsButtonV1View2);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i2 = onTransact + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = asBinder + 69;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 81;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asBinder + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = asBinder + 83;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return null;
    }

    private static final boolean onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = asBinder + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onTransact + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final String onNavigationEvent(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = onTransact + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final String onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return str;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final String IAuthTabCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = asBinder + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditTestActivity creditTestActivity) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-460647099, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 460647118, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditTestActivity creditTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-1137884976, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1137884987, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(861730730, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -861730699, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(CreditTestActivity creditTestActivity) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-782542509, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 782542512, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1319177815, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1319177802, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(1155787098, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1155787076, new Object[]{gettypedexportedconstants, view}, iOnExtraCallback3, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(656269824, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -656269820, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditTestActivity creditTestActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditTestActivity, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-545755346, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 545755361, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1186461430, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1186461412, new Object[0], iOnExtraCallback3, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onActivityLayout(CreditTestActivity creditTestActivity) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-1961318839, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1961318864, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onTransact(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1485108033, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1485108004, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-1261776151, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1261776151, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final void asBinder(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) throws Throwable {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-1731779763, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1731779770, new Object[]{getsupportedhighspeedresolutionsfor, str}, iOnExtraCallback3, iOnExtraCallback2);
    }

    private static final Unit onNavigationEvent(CreditTestActivity creditTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditTestActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1338895906, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1338895905, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit ICustomTabsService(CreditTestActivity creditTestActivity) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1422853303, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1422853277, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
    }

    private static final Unit ICustomTabsCallback_Parcel(CreditTestActivity creditTestActivity) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(438530334, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -438530325, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
    }

    private static final Unit postMessage(CreditTestActivity creditTestActivity) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-1481306433, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1481306457, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
    }

    private static final Unit newAuthTabSession(CreditTestActivity creditTestActivity) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1082992928, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1082992914, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1551677779, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1551677763, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1727664478, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1727664450, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit requestPostMessageChannelWithExtras(CreditTestActivity creditTestActivity) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(697020924, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -697020916, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
    }

    private static final Unit onGreatestScrollPercentageIncreased() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-756597989, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 756598012, new Object[0], iOnExtraCallback3, iOnExtraCallback2);
    }

    private static final Unit access100(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-98136519, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 98136525, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(710830520, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -710830508, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit ICustomTabsServiceStubProxy(CreditTestActivity creditTestActivity) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-1835441168, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1835441189, new Object[]{creditTestActivity}, iOnExtraCallback3, iOnExtraCallback2);
    }

    private static final Unit access100(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1680174346, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1680174344, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit getInterfaceDescriptor(CreditTestActivity creditTestActivity, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-794083533, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 794083550, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final void IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) throws Throwable {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-491688503, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 491688523, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final void onNavigationEvent(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-430056804, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 430056814, new Object[]{objectRef, objectRef2, gettypedexportedconstants, view}, iOnExtraCallback3, iOnExtraCallback2);
    }

    private static final void IAuthTabCallbackDefault(CompoundButton compoundButton, boolean z) throws Throwable {
        Object[] objArr = {compoundButton, Boolean.valueOf(z)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(1505332034, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1505332004, objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final void onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-1434085155, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1434085182, new Object[]{gettypedexportedconstants, view}, iOnExtraCallback3, iOnExtraCallback2);
    }

    public final hasRootStatusPermission ICustomTabsServiceDefault() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (hasRootStatusPermission) onWarmupCompleted(-753801095, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 753801100, new Object[]{this}, iOnExtraCallback3, iOnExtraCallback2);
    }

    @Override // im.toss.feature.credit.ui.main.test.Hilt_CreditTestActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = asBinder + 11;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.test.Hilt_CreditTestActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = onTransact + 101;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.test.Hilt_CreditTestActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 27;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.test.Hilt_CreditTestActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
    }
}
