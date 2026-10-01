package viva.republica.toss.account.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.google.android.gms.internal.ads.zzaq;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.TossApplication;
import im.toss.base.BaseActivity;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.features.leave.ui.remainingbalance.selectaccount.ComposableSingletons$SelectAccountScreenKt$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.password.api.annotation.RequiresAuth;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.inventory_sdk.model.InventoryAdDto;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.R;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.AdSettingsIntegrationErrorMode;
import o.AppLovinAdServiceImplc;
import o.BEROctetStringParser;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModuleImplExternalSyntheticLambda1;
import o.BrickModuleImplExternalSyntheticLambda3;
import o.CERT_GetAuthorityKeyIdentifierInfo;
import o.CMS_DecSignedAndEnvelopedData;
import o.CommonModule_closeView;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertFloatArrayToByteArray;
import o.DERConstructedSet;
import o.DERSet;
import o.DERString;
import o.DebugCorePackageExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.ExtraHintsHintType;
import o.FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3;
import o.FullScreenAd;
import o.GeckoHubImp;
import o.GraniteModule_onEventListenerRemoved;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.JsonReaderUnknownNumberParsing;
import o.KeyBoardVisiblePoint;
import o.LifecyclesKtawaitStarted21;
import o.MapConverter;
import o.NativeAdView;
import o.NativeI18nManagerSpec;
import o.NativeJSCHeapCaptureSpec;
import o.NetConverter3;
import o.OperationHelperV1a;
import o.OperationHelperV2;
import o.OperationHelperV3;
import o.PageShowPoint;
import o.PlayerErrorCode;
import o.ReactInstanceEventListener;
import o.ReactInstanceManagerExternalSyntheticLambda0;
import o.ReactInstanceManagerExternalSyntheticLambda6;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.ReactQueueConfigurationImplCompanion;
import o.ResultUtil;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.ToolkitManagerb;
import o.ToolkitManagerc;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UST_GET_APPLICENSEINFO;
import o.UST_SET_ANDROIDINFO;
import o.UTF8Decoder;
import o.UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access8000;
import o.addExtra;
import o.addPolicy;
import o.allowRTL;
import o.auth;
import o.byteToInt;
import o.captureComplete;
import o.changeResultMsg;
import o.clearTid;
import o.commonTestFlag;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeLongCollection;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.downloadZip;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getIconPaddingLeft;
import o.getInitializationType;
import o.getNativeModuleIteratorReactAndroid_release;
import o.getNativeProtocolAudience;
import o.getNavigationBar;
import o.getOctetOutputStream;
import o.getPadBits;
import o.getParamImp;
import o.getTimestampBytes;
import o.getWrite;
import o.handleCxxError;
import o.initMiniApp;
import o.isMixedAudience;
import o.isShowTransAnimate;
import o.issueCertV3;
import o.logToFile;
import o.mergeParams;
import o.notifyTaskFinished;
import o.notifyTaskRetry;
import o.onDisclaimerClick;
import o.onJsBridgeReady;
import o.onLoadStarted;
import o.onPageExit;
import o.queryCache;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;
import o.sendBroadcastSyncWithPendingBroadcasts;
import o.setDoubleTapZoomDpi;
import o.setMessageBytes;
import o.setMinimumDpi;
import o.setTagBytes;
import o.startOperationBatch;
import o.swapLeftAndRightInRTL;
import o.writeRaw;
import o.zzad;
import o.zzae;
import o.zzag;
import o.zzaj;
import o.zzbq;
import o.zzen;
import o.zzm;
import o.zzo;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.core.Core;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import ua.naiksoftware.stomp.dto.StompHeader;
import viva.republica.toss.account.detail.TossAccountHistoryActivity;
import viva.republica.toss.account.detail.TossAccountHistoryActivity$;
import viva.republica.toss.account.savingbox.SavingAccountEditActivity;
import viva.republica.toss.main.StatusManager;
import viva.republica.toss.send.SendActivity;
import viva.republica.toss.signup.SelectBankActivity;

@DERString
@RequiresAuth(onExtraCallback = 220, onExtraCallbackWithResult = true, onWarmupCompleted = UTF8Decoder.TOSS_MONEY_HISTORY_LIST)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossAccountHistoryActivity extends Hilt_TossAccountHistoryActivity implements UST_GET_APPLICENSEINFO.IAuthTabCallback, StatusManager.onExtraCallback, changeResultMsg.onWarmupCompleted, zzo {
    public static final onExtraCallbackWithResult Companion;
    private static int ICustomTabsCallbackStub;
    private static int ICustomTabsCallbackStubProxy;
    private static byte[] ICustomTabsCallback_Parcel;
    public static final int asInterface;
    private static short[] mayLaunchUrl;
    private static int newAuthTabSession;
    private static int onRelationshipValidationResult;
    private static int onUnminimized;
    private final Set<ToolkitManagerc.onNavigationEvent> IAuthTabCallbackStub;
    private int IAuthTabCallback_Parcel;
    private final IEngagementSignalsCallback_Parcel<Intent> ICustomTabsCallback;

    @Inject
    public AppLovinAdServiceImplc analyticsHelper;
    private swapLeftAndRightInRTL asBinder;

    @Inject
    public zzad environments;
    private final IEngagementSignalsCallback_Parcel<Intent> extraCallback;
    private handleCxxError extraCallbackWithResult;
    private final getTimestampBytes<Boolean> getInterfaceDescriptor;

    @Inject
    public InventoryAdManager inventoryAdManager;
    private String onActivityResized;
    private getNativeProtocolAudience onMinimized;
    private onDisclaimerClick onPostMessage;

    @Inject
    public zzag tossClock;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {15, -74, 84, -51};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsService = 0;
    private static int isEngagementSignalsApiAvailable = 0;
    private static int extraCommand = 1;
    private String IAuthTabCallbackStubProxy = _UrlKt.FRAGMENT_ENCODE_SET;
    private String onMessageChannelReady = "-2147483648";
    private String onActivityLayout = _UrlKt.FRAGMENT_ENCODE_SET;
    private final Lazy IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda40
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TossAccountHistoryActivity.asInterface(this.f$0);
        }
    });
    private final changeResultMsg onTransact = new changeResultMsg(this);
    private final Lazy access000 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda41
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (LinearLayoutManager) TossAccountHistoryActivity.IAuthTabCallback(-583254710, new Object[]{this.f$0}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 583254752);
        }
    });
    private final Lazy ICustomTabsCallbackDefault = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda42
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (UST_GET_APPLICENSEINFO) TossAccountHistoryActivity.IAuthTabCallback(-338851775, new Object[]{this.f$0}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 338851778);
        }
    });
    private boolean readTypedObject = true;
    private final Lazy access100 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda43
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TossAccountHistoryActivity.IAuthTabCallbackStub(this.f$0);
        }
    });
    private String writeTypedObject = _UrlKt.FRAGMENT_ENCODE_SET;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[ResultUtil.values().length];
            try {
                iArr[ResultUtil.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultUtil.DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResultUtil.WITHDRAWAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4;
        int i5 = i2 + 4;
        int i6 = (b * 10) + 105;
        int i7 = (i * 3) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6 = (-i6) + i8;
            i3 = i4;
            i5++;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = i6;
            i6 = bArr[i5];
            i6 = (-i6) + i8;
            i3 = i4;
            i5++;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i5++;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    static {
        newAuthTabSession = 1;
        IEngagementSignalsCallbackDefault();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        asInterface = 8;
        int i = ICustomTabsService + 123;
        newAuthTabSession = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [android.content.Context, viva.republica.toss.account.detail.TossAccountHistoryActivity] */
    /* JADX WARN: Type inference failed for: r0v43, types: [android.content.Context, viva.republica.toss.account.detail.TossAccountHistoryActivity] */
    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7;
        int i8 = ~i6;
        int i9 = ~i;
        int i10 = ~i2;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = (~(i2 | i)) | (~(i8 | i10));
        int i13 = ~(i10 | i6 | i);
        int i14 = i6 + i + i3 + ((-194346734) * i5) + (9035316 * i4);
        int i15 = i14 * i14;
        int i16 = (((-787818500) * i6) - 443744256) + ((-1492047866) * i) + (352114683 * i11) + (i12 * (-352114683)) + ((-352114683) * i13) + ((-1139933184) * i3) + (1190920192 * i5) + (1456996352 * i4) + ((-1774911488) * i15);
        int i17 = (i6 * 1174986172) + 1294669563 + (i * 1174986598) + (i11 * Core.StsNotImplemented) + (i12 * 213) + (i13 * 213) + (1174986385 * i3) + ((-1060063438) * i5) + (107475828 * i4) + (i15 * 168099840);
        switch (i16 + (i17 * i17 * 40566784)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
                int i18 = 2 % 2;
                int i19 = extraCommand + 125;
                isEngagementSignalsApiAvailable = i19 % 128;
                int i20 = i19 % 2;
                UST_GET_APPLICENSEINFO ust_get_applicenseinfoOnMinimized = onMinimized(tossAccountHistoryActivity);
                int i21 = isEngagementSignalsApiAvailable + 69;
                extraCommand = i21 % 128;
                int i22 = i21 % 2;
                return ust_get_applicenseinfoOnMinimized;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return access000(objArr);
            case 13:
                logToFile.onExtraCallback onextracallback = (TossAccountHistoryActivity) objArr[0];
                String str = (String) objArr[1];
                int i23 = 2 % 2;
                Intent intent = new Intent();
                intent.putExtra("toss.intent.extra.ACCOUNT_ID", str);
                onextracallback.setResult(-1, intent);
                onextracallback.finish();
                int i24 = extraCommand + 95;
                isEngagementSignalsApiAvailable = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 14:
                TossAccountHistoryActivity tossAccountHistoryActivity2 = (TossAccountHistoryActivity) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i26 = 2 % 2;
                int i27 = isEngagementSignalsApiAvailable + 15;
                extraCommand = i27 % 128;
                int i28 = i27 % 2;
                Intrinsics.checkNotNullParameter(th, "");
                UST_GET_APPLICENSEINFO.onExtraCallback(tossAccountHistoryActivity2.ITrustedWebActivityCallbackDefault(), (Long) null, 1, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i29 = isEngagementSignalsApiAvailable + 71;
                extraCommand = i29 % 128;
                int i30 = i29 % 2;
                return unit;
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
                int i31 = 2 % 2;
                int i32 = isEngagementSignalsApiAvailable + 3;
                extraCommand = i32 % 128;
                int i33 = i32 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("view", "s51_ihub_savingbox");
                setDetectableSize.onExtraCallback("category", "invest");
                Object[] objArr2 = new Object[1];
                a(TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 6, 4 - ExpandableListView.getPackedPositionChild(0L), new char[]{6, 5, 5, 0, 65535, 65523}, false, (ViewConfiguration.getJumpTapTimeout() >> 16) + Imgcodecs.IMWRITE_TIFF_XDPI, objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), "savingbox_settings");
                Unit unit2 = Unit.INSTANCE;
                int i34 = isEngagementSignalsApiAvailable + 37;
                extraCommand = i34 % 128;
                int i35 = i34 % 2;
                return unit2;
            case 17:
                return access100(objArr);
            case 18:
                return IAuthTabCallback_Parcel(objArr);
            case 19:
                return getInterfaceDescriptor(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            case 21:
                return ICustomTabsCallback(objArr);
            case 22:
                return extraCallback(objArr);
            case 23:
                ?? r0 = (TossAccountHistoryActivity) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                String str2 = (String) objArr[2];
                int i36 = 2 % 2;
                SessionTrackerb sessionTrackerbICustomTabsServiceDefault = r0.ICustomTabsServiceDefault();
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 27, (Process.myPid() >> 22) + 21, new char[]{'\f', 21, 65484, 6, 11, '\r', 18, 17, 65500, 16, 65534, 19, 6, 11, 4, 65503, '\f', 21, 65510, 1, 65498, 16, 18, '\r', 2, 15, 17, '\f', 16, 16, 65495, 65484, 65484, 17, 2, 2, 11, 16, 65484, 16, 65534, 19, 6, 11, 4, 65535}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022779).substring(0, 8).codePointAt(2) + 190, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(jLongValue);
                sb.append("&savingBoxType=");
                sb.append(str2);
                Intent intentOnExtraCallback = sessionTrackerbICustomTabsServiceDefault.onExtraCallback((Context) r0, sb.toString());
                if (intentOnExtraCallback == null) {
                    i7 = isEngagementSignalsApiAvailable + 105;
                } else {
                    ((TossAccountHistoryActivity) r0).ICustomTabsCallback.onNavigationEvent(intentOnExtraCallback);
                    i7 = isEngagementSignalsApiAvailable + 47;
                }
                extraCommand = i7 % 128;
                int i37 = i7 % 2;
                return null;
            case 24:
                return readTypedObject(objArr);
            case 25:
                return writeTypedObject(objArr);
            case 26:
                return onMessageChannelReady(objArr);
            case 27:
                return onPostMessage(objArr);
            case 28:
                return onActivityLayout(objArr);
            case 29:
                return onActivityResized(objArr);
            case 30:
                ?? r02 = (TossAccountHistoryActivity) objArr[0];
                String str3 = (String) objArr[1];
                int i38 = 2 % 2;
                int i39 = extraCommand + 83;
                isEngagementSignalsApiAvailable = i39 % 128;
                int i40 = i39 % 2;
                SessionTrackerb sessionTrackerbICustomTabsServiceDefault2 = r02.ICustomTabsServiceDefault();
                Object[] objArr4 = new Object[1];
                a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 32, (ViewConfiguration.getTouchSlop() >> 8) + 19, new char[]{1, 1, '\n', 15, 65483, 4, 1, '\n', 1, '\t', 65534, 11, 20, 65483, 5, '\n', '\f', 17, 16, 15, 17, '\f', 1, 14, 16, 11, 15, 15, 65494, 65483, 65483, 16}, false, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 246, objArr4);
                Intent intentOnExtraCallback2 = sessionTrackerbICustomTabsServiceDefault2.onExtraCallback((Context) r02, ((String) objArr4[0]).intern());
                if (intentOnExtraCallback2 == null) {
                    int i41 = isEngagementSignalsApiAvailable + 71;
                    extraCommand = i41 % 128;
                    int i42 = i41 % 2;
                    return null;
                }
                intentOnExtraCallback2.putExtra("henemBox", (Parcelable) ((TossAccountHistoryActivity) r02).asBinder);
                intentOnExtraCallback2.putExtra("henemBoxInputType", str3);
                ((TossAccountHistoryActivity) r02).ICustomTabsCallback.onNavigationEvent(intentOnExtraCallback2);
                return null;
            case 31:
                return onMinimized(objArr);
            case 32:
                return ICustomTabsCallbackStub(objArr);
            case 33:
                return ICustomTabsCallbackStubProxy(objArr);
            case 34:
                return ICustomTabsCallbackDefault(objArr);
            case 35:
                return onUnminimized(objArr);
            case 36:
                return onRelationshipValidationResult(objArr);
            case 37:
                return isEngagementSignalsApiAvailable(objArr);
            case 38:
                return extraCommand(objArr);
            case 39:
                return mayLaunchUrl(objArr);
            case 40:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i43 = 2 % 2;
                int i44 = extraCommand + 33;
                isEngagementSignalsApiAvailable = i44 % 128;
                int i45 = i44 % 2;
                IAuthTabCallback(-216487866, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 216487891);
                int i46 = extraCommand + 37;
                isEngagementSignalsApiAvailable = i46 % 128;
                int i47 = i46 % 2;
                return null;
            case 41:
                return ICustomTabsCallback_Parcel(objArr);
            case R.styleable.Chip_shapeAppearance /* 42 */:
                return ICustomTabsService(objArr);
            case R.styleable.Chip_shapeAppearanceOverlay /* 43 */:
                Function1 function12 = (Function1) objArr[0];
                Object obj2 = objArr[1];
                int i48 = 2 % 2;
                int i49 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
                extraCommand = i49 % 128;
                int i50 = i49 % 2;
                ICustomTabsServiceStub(function12, obj2);
                int i51 = isEngagementSignalsApiAvailable + 19;
                extraCommand = i51 % 128;
                int i52 = i51 % 2;
                return null;
            case 44:
                return newSession(objArr);
            case 45:
                return postMessage(objArr);
            case 46:
                return newSessionWithExtras(objArr);
            case 47:
                return prefetch(objArr);
            case 48:
                return newAuthTabSession(objArr);
            default:
                logToFile.onExtraCallback onextracallback2 = (TossAccountHistoryActivity) objArr[0];
                int i53 = 2 % 2;
                int i54 = isEngagementSignalsApiAvailable + 69;
                extraCommand = i54 % 128;
                int i55 = i54 % 2;
                CMS_DecSignedAndEnvelopedData cMS_DecSignedAndEnvelopedDataOnExtraCallback = CMS_DecSignedAndEnvelopedData.onExtraCallback(onextracallback2.getLayoutInflater());
                int i56 = isEngagementSignalsApiAvailable + 7;
                extraCommand = i56 % 128;
                int i57 = i56 % 2;
                return cMS_DecSignedAndEnvelopedDataOnExtraCallback;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tossAccountHistoryActivity, iIntValue);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 93;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(swapLeftAndRightInRTL swapleftandrightinrtl, TossAccountHistoryActivity tossAccountHistoryActivity, boolean z, Pair pair) {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(swapleftandrightinrtl, tossAccountHistoryActivity, z, pair);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCommand + 33;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossAccountHistoryActivity, bool);
        int i4 = extraCommand + 43;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(tossAccountHistoryActivity, th);
        }
        asBinder(tossAccountHistoryActivity, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = extraCommand + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossAccountHistoryActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = extraCommand + 93;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(tossAccountHistoryActivity, iEngagementSignalsCallbackDefault);
        }
        onExtraCallback(tossAccountHistoryActivity, iEngagementSignalsCallbackDefault);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 1;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(tossAccountHistoryActivity, setDetectableSize);
        int i4 = isEngagementSignalsApiAvailable + 61;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossAccountHistoryActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener, dialogInterface);
        int i4 = extraCommand + 65;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 53;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossAccountHistoryActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener, commonModule_setLeftEdgeTouchEnabled);
        int i4 = isEngagementSignalsApiAvailable + 31;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 97;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tossAccountHistoryActivity, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCommand + 101;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(th);
        int i4 = isEngagementSignalsApiAvailable + 87;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        prefetch(function1, obj);
        int i4 = extraCommand + 99;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tossAccountHistoryActivity, bool);
        int i4 = extraCommand + 75;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallback = extraCallback(th);
        int i4 = isEngagementSignalsApiAvailable + 47;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 109;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(tossAccountHistoryActivity, setDetectableSize);
        int i4 = extraCommand + 65;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ IAuthTabCallback IAuthTabCallbackStub(TossAccountHistoryActivity tossAccountHistoryActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallbackICustomTabsCallback = ICustomTabsCallback(tossAccountHistoryActivity);
        int i4 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallbackICustomTabsCallback;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 29;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(84867357, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -84867350);
        int i4 = extraCommand + 37;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 103;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        extraCommand(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + 85;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        postMessage(function1, obj);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 19;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        receiveFile(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + 27;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) throws Throwable {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 19;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onActivityResized(tossAccountHistoryActivity);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCommand + 51;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 101;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        access200(function1, obj);
        int i4 = extraCommand + 55;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk ICustomTabsCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 115;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(function1, obj);
        int i4 = extraCommand + 81;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIsEngagementSignalsApiAvailable;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(th);
        int i4 = isEngagementSignalsApiAvailable + 27;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ void ICustomTabsCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        requestPostMessageChannelWithExtras(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + 21;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        setMinimumDpi setminimumdpi = (setMinimumDpi) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(onExtraCallback(tossAccountHistoryActivity, setminimumdpi));
        }
        onExtraCallback(tossAccountHistoryActivity, setminimumdpi);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 71;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {tossAccountHistoryActivity};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) IAuthTabCallback(1246567427, objArr2, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, -1246567392);
        int i4 = extraCommand + 101;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return linearLayoutManager;
    }

    public static /* synthetic */ void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService_Parcel(function1, obj);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = extraCommand + 55;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + Imgproc.COLOR_YUV2RGBA_YVYU;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) IAuthTabCallback(-1848609903, new Object[]{setDetectableSize}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1848609919);
        }
        int i3 = 90 / 0;
        return (Unit) IAuthTabCallback(-1848609903, new Object[]{setDetectableSize}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1848609919);
    }

    public static /* synthetic */ void access100(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(2085806657, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2085806649);
        int i4 = isEngagementSignalsApiAvailable + 103;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        swapLeftAndRightInRTL swapleftandrightinrtl = (swapLeftAndRightInRTL) objArr[0];
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        Throwable th = (Throwable) objArr[3];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(swapleftandrightinrtl, tossAccountHistoryActivity, zBooleanValue, th);
        int i4 = extraCommand + 107;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 39;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(th);
        int i4 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(tossAccountHistoryActivity, setDetectableSize);
        int i4 = extraCommand + Imgproc.COLOR_YUV2RGBA_YVYU;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 75;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback_Parcel(function1, obj);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = extraCommand + 7;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ Unit asInterface(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 63;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(th);
        int i4 = isEngagementSignalsApiAvailable + 41;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ CMS_DecSignedAndEnvelopedData asInterface(TossAccountHistoryActivity tossAccountHistoryActivity) {
        CMS_DecSignedAndEnvelopedData cMS_DecSignedAndEnvelopedData;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 43;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tossAccountHistoryActivity};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 == 0) {
            cMS_DecSignedAndEnvelopedData = (CMS_DecSignedAndEnvelopedData) IAuthTabCallback(-2127595229, objArr, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, 2127595229);
            int i4 = 52 / 0;
        } else {
            cMS_DecSignedAndEnvelopedData = (CMS_DecSignedAndEnvelopedData) IAuthTabCallback(-2127595229, objArr, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, 2127595229);
        }
        int i5 = isEngagementSignalsApiAvailable + 75;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return cMS_DecSignedAndEnvelopedData;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 91;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        mayLaunchUrl(function1, obj);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = extraCommand + 123;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Boolean extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 3;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Boolean engagementSignalsCallback = setEngagementSignalsCallback(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return engagementSignalsCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        NativeAdView nativeAdView = (NativeAdView) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 65;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(tossAccountHistoryActivity, nativeAdView);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossAccountHistoryActivity, nativeAdView);
        int i3 = extraCommand + 111;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object isEngagementSignalsApiAvailable(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        warmup(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + 67;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object newSession(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(tossAccountHistoryActivity);
        int i4 = extraCommand + 7;
        isEngagementSignalsApiAvailable = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object newSessionWithExtras(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        requestPostMessageChannel(function1, obj);
        int i4 = extraCommand + 37;
        isEngagementSignalsApiAvailable = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = extraCommand + 19;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-1626556922, new Object[]{Integer.valueOf(iIntValue), tossAccountHistoryActivity, th}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1626556956);
        int i4 = extraCommand + 33;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 73;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(1957936460, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1957936431);
        int i4 = extraCommand + 63;
        isEngagementSignalsApiAvailable = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, tossAccountHistoryActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        int i5 = extraCommand + 89;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 37;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeJSCHeapCaptureSpec, setDetectableSize);
        int i4 = extraCommand + 95;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(onDisclaimerClick ondisclaimerclick) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(ondisclaimerclick);
        int i4 = extraCommand + 97;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(tossAccountHistoryActivity, view);
        }
        onTransact(tossAccountHistoryActivity, view);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 123;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(1585054893, new Object[]{tossAccountHistoryActivity, th}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1585054879);
        int i3 = extraCommand + 37;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(tossAccountHistoryActivity, setDetectableSize);
        int i4 = isEngagementSignalsApiAvailable + 45;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = extraCommand + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tossAccountHistoryActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener, commonModule_setLeftEdgeTouchEnabled);
        int i4 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCommand + 41;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {tossAccountHistoryActivity, deserializeurinullablecollection};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(2015042306, objArr, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, -2015042275);
        int i4 = isEngagementSignalsApiAvailable + 47;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, boolean z, queryCache querycache) {
        int i = 2 % 2;
        int i2 = extraCommand + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-133444703, new Object[]{tossAccountHistoryActivity, Boolean.valueOf(z), querycache}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 133444722);
        int i4 = isEngagementSignalsApiAvailable + 41;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallback(List list) {
        int i = 2 % 2;
        int i2 = extraCommand + 21;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(list);
            obj.hashCode();
            throw null;
        }
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnWarmupCompleted = onWarmupCompleted(list);
        int i3 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCommand + 21;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(-782857286, new Object[]{dialogInterface, Integer.valueOf(i)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 782857306);
        int i5 = extraCommand + 1;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage(tossAccountHistoryActivity);
        int i4 = extraCommand + 5;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, TossAccountHistoryActivity tossAccountHistoryActivity, Date date, boolean z, captureComplete capturecomplete) {
        int i2 = 2 % 2;
        int i3 = extraCommand + 63;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(-96057825, new Object[]{Integer.valueOf(i), tossAccountHistoryActivity, date, Boolean.valueOf(z), capturecomplete}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 96057843);
        int i5 = extraCommand + 107;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tossAccountHistoryActivity, dialogInterface);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossAccountHistoryActivity, th);
        int i4 = extraCommand + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 45;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(tossAccountHistoryActivity, setDetectableSize);
        int i4 = extraCommand + 27;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAccess000;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossAccountHistoryActivity, deserializeurinullablecollection);
        int i4 = isEngagementSignalsApiAvailable + 39;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(1649992638, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1649992626);
            int i3 = 40 / 0;
        } else {
            IAuthTabCallback(1649992638, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1649992626);
        }
        int i4 = extraCommand + 73;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 45;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(tossAccountHistoryActivity, dialogInterface, i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, onDisclaimerClick ondisclaimerclick) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return ((Boolean) IAuthTabCallback(-1920621480, new Object[]{tossAccountHistoryActivity, ondisclaimerclick}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1920621525)).booleanValue();
        }
        ((Boolean) IAuthTabCallback(-1920621480, new Object[]{tossAccountHistoryActivity, ondisclaimerclick}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1920621525)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        setMinimumDpi setminimumdpi = (setMinimumDpi) objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tossAccountHistoryActivity, setminimumdpi);
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = extraCommand + 73;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 21;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        updateVisuals(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + 7;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Long l = (Long) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallbackWithResult = onExtraCallbackWithResult(l);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return boolOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(ResultUtil resultUtil, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 59;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(resultUtil, setDetectableSize);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        int i5 = extraCommand + 21;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(setDetectableSize);
        }
        IAuthTabCallback(setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(tossAccountHistoryActivity, dialogInterface);
        int i4 = extraCommand + 65;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 59;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossAccountHistoryActivity, view);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 57;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(tossAccountHistoryActivity, th);
        }
        asInterface(tossAccountHistoryActivity, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossAccountHistoryActivity, pair);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(tossAccountHistoryActivity, setDetectableSize);
        int i4 = extraCommand + 1;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(tossAccountHistoryActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossAccountHistoryActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener, dialogInterface);
        int i3 = extraCommand + 5;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, onDisclaimerClick ondisclaimerclick) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 57;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(tossAccountHistoryActivity, ondisclaimerclick);
        }
        onWarmupCompleted(tossAccountHistoryActivity, ondisclaimerclick);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = extraCommand + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(tossAccountHistoryActivity, onwarmupcompleted);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(tossAccountHistoryActivity, onwarmupcompleted);
        int i3 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 81;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(tossAccountHistoryActivity, dialogInterface, i);
        int i5 = isEngagementSignalsApiAvailable + 67;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 33;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        writeTypedList(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + 107;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void onRelationshipValidationResult(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 41;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(1696795280, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1696795247);
            throw null;
        }
        IAuthTabCallback(1696795280, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1696795247);
        int i3 = isEngagementSignalsApiAvailable + 81;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ Unit onTransact(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy(th);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(th);
        int i3 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onTransact(TossAccountHistoryActivity tossAccountHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(1608371837, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1608371801);
        int i4 = isEngagementSignalsApiAvailable + 43;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onUnminimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 43;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            prefetchWithMultipleUrls(function1, obj);
            obj2.hashCode();
            throw null;
        }
        boolean zPrefetchWithMultipleUrls = prefetchWithMultipleUrls(function1, obj);
        int i3 = isEngagementSignalsApiAvailable + 33;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return zPrefetchWithMultipleUrls;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallbackStub(function1, obj);
        int i4 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = extraCommand + 91;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(commonModule_setLeftEdgeTouchEnabled);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(commonModule_setLeftEdgeTouchEnabled);
        int i3 = isEngagementSignalsApiAvailable + 11;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tossAccountHistoryActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(tossAccountHistoryActivity, view);
        }
        IAuthTabCallback(tossAccountHistoryActivity, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, DebugCorePackageExternalSyntheticLambda1 debugCorePackageExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = extraCommand + 23;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tossAccountHistoryActivity, debugCorePackageExternalSyntheticLambda1);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 65;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 9;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(tossAccountHistoryActivity, iEngagementSignalsCallbackDefault);
        }
        onNavigationEvent(tossAccountHistoryActivity, iEngagementSignalsCallbackDefault);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 79;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(1087445258, new Object[]{tossAccountHistoryActivity, setDetectableSize}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1087445220);
        int i4 = extraCommand + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsServiceStubProxy(function1, obj);
        int i4 = extraCommand + 33;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCommand + 45;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallbackStub(tossAccountHistoryActivity, dialogInterface, i);
        int i5 = extraCommand + 25;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        boolean zNewSession = newSession(function1, obj);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return Boolean.valueOf(zNewSession);
    }

    public static /* synthetic */ void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 73;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        newSessionWithExtras(function1, obj);
        int i4 = isEngagementSignalsApiAvailable + 11;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallbackDefault(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<allowRTL> apply(writeRaw<BaseApiResponse<allowRTL>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners(new Function1<BaseApiResponse<allowRTL>, deserializeIp<? extends allowRTL>>() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity.IAuthTabCallbackDefault.1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends allowRTL> invoke(BaseApiResponse<allowRTL> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = allowRTL.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class IAuthTabCallbackStub<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallbackStub(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<notifyTaskFinished> apply(writeRaw<BaseApiResponse<notifyTaskFinished>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners(new Function1<BaseApiResponse<notifyTaskFinished>, deserializeIp<? extends notifyTaskFinished>>() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity.IAuthTabCallbackStub.3
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends notifyTaskFinished> invoke(BaseApiResponse<notifyTaskFinished> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = notifyTaskFinished.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class IAuthTabCallback_Parcel<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallback_Parcel(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<ReactInstanceManagerExternalSyntheticLambda0> apply(writeRaw<BaseApiResponse<ReactInstanceManagerExternalSyntheticLambda0>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners(new Function1<BaseApiResponse<ReactInstanceManagerExternalSyntheticLambda0>, deserializeIp<? extends ReactInstanceManagerExternalSyntheticLambda0>>() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity.IAuthTabCallback_Parcel.5
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends ReactInstanceManagerExternalSyntheticLambda0> invoke(BaseApiResponse<ReactInstanceManagerExternalSyntheticLambda0> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = ReactInstanceManagerExternalSyntheticLambda0.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class access100<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallback;

        public access100(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<captureComplete> apply(writeRaw<BaseApiResponse<captureComplete>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners(new Function1<BaseApiResponse<captureComplete>, deserializeIp<? extends captureComplete>>() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity.access100.1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends captureComplete> invoke(BaseApiResponse<captureComplete> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = captureComplete.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class asBinder<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public asBinder(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<queryCache> apply(writeRaw<BaseApiResponse<queryCache>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners(new Function1<BaseApiResponse<queryCache>, deserializeIp<? extends queryCache>>() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity.asBinder.2
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends queryCache> invoke(BaseApiResponse<queryCache> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = queryCache.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class getInterfaceDescriptor<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallback;

        public getInterfaceDescriptor(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<ReactInstanceEventListener> apply(writeRaw<BaseApiResponse<ReactInstanceEventListener>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners(new Function1<BaseApiResponse<ReactInstanceEventListener>, deserializeIp<? extends ReactInstanceEventListener>>() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity.getInterfaceDescriptor.2
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends ReactInstanceEventListener> invoke(BaseApiResponse<ReactInstanceEventListener> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = ReactInstanceEventListener.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onExtraCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<Object> apply(writeRaw<BaseApiResponse<Object>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$initializeViewTreeOwners(new Function1<BaseApiResponse<Object>, deserializeIp<? extends Object>>() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity.onExtraCallback.5
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Object> invoke(BaseApiResponse<Object> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Object.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(ICustomTabsCallbackStubProxy)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 35126), View.resolveSizeAndState(0, 0, 0) + 23, 10278 - Color.green(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getTapTimeout() >> 16)), 'g' - AndroidCharacter.getMirror('0'), 2167 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 9;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), Color.argb(0, 0, 0, 0) + 55, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public TossAccountHistoryActivity() {
        getTimestampBytes<Boolean> gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
        this.getInterfaceDescriptor = gettimestampbytesIAuthTabCallback;
        this.onActivityResized = _UrlKt.FRAGMENT_ENCODE_SET;
        this.IAuthTabCallbackStub = new LinkedHashSet();
        this.ICustomTabsCallback = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onWarmupCompleted(this.f$0, (IEngagementSignalsCallbackDefault) obj);
            }
        });
        this.extraCallback = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.IAuthTabCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
            }
        });
    }

    public static final /* synthetic */ UST_GET_APPLICENSEINFO IAuthTabCallback_Parcel(TossAccountHistoryActivity tossAccountHistoryActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        UST_GET_APPLICENSEINFO ust_get_applicenseinfoITrustedWebActivityCallbackDefault = tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault();
        int i4 = extraCommand + 105;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return ust_get_applicenseinfoITrustedWebActivityCallbackDefault;
    }

    public static final /* synthetic */ onDisclaimerClick access000(TossAccountHistoryActivity tossAccountHistoryActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 63;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        onDisclaimerClick ondisclaimerclick = tossAccountHistoryActivity.onPostMessage;
        int i5 = i3 + 109;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return ondisclaimerclick;
        }
        throw null;
    }

    public static final /* synthetic */ boolean access100(TossAccountHistoryActivity tossAccountHistoryActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 65;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        boolean z = tossAccountHistoryActivity.readTypedObject;
        int i5 = i3 + 51;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ Map getInterfaceDescriptor(TossAccountHistoryActivity tossAccountHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return tossAccountHistoryActivity.IPostMessageServiceStub();
        }
        tossAccountHistoryActivity.IPostMessageServiceStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object newAuthTabSession(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 99;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        changeResultMsg changeresultmsg = tossAccountHistoryActivity.onTransact;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 45;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return changeresultmsg;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, Date date, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        tossAccountHistoryActivity.onWarmupCompleted(date, z);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = extraCommand + 59;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, boolean z) {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        Object obj = null;
        tossAccountHistoryActivity.readTypedObject = z;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 49;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public InventoryAdManager updateVisuals() {
        int i = 2 % 2;
        InventoryAdManager inventoryAdManager = this.inventoryAdManager;
        if (inventoryAdManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i2 = extraCommand + 17;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i3 = isEngagementSignalsApiAvailable + 17;
        int i4 = i3 % 128;
        extraCommand = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = i4 + 103;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return inventoryAdManager;
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object value = tossAccountHistoryActivity.IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CMS_DecSignedAndEnvelopedData cMS_DecSignedAndEnvelopedData = (CMS_DecSignedAndEnvelopedData) value;
        if (i3 != 0) {
            return cMS_DecSignedAndEnvelopedData;
        }
        throw null;
    }

    private final LinearLayoutManager IPostMessageService_Parcel() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 15;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.access000.getValue();
        if (i3 != 0) {
            return (LinearLayoutManager) value;
        }
        throw null;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        int i = 2 % 2;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((TossAccountHistoryActivity) objArr[0]);
        int i2 = extraCommand + 93;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return linearLayoutManager;
        }
        throw null;
    }

    private final UST_GET_APPLICENSEINFO ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCommand + 89;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        UST_GET_APPLICENSEINFO ust_get_applicenseinfo = (UST_GET_APPLICENSEINFO) this.ICustomTabsCallbackDefault.getValue();
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return ust_get_applicenseinfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final UST_GET_APPLICENSEINFO onMinimized(TossAccountHistoryActivity tossAccountHistoryActivity) {
        onDisclaimerClick ondisclaimerclick;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 107;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        onDisclaimerClick ondisclaimerclick2 = tossAccountHistoryActivity.onPostMessage;
        getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release = null;
        if (ondisclaimerclick2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick = null;
        } else {
            ondisclaimerclick = ondisclaimerclick2;
        }
        getNativeProtocolAudience getnativeprotocolaudience = tossAccountHistoryActivity.onMinimized;
        if (getnativeprotocolaudience != null) {
            int i4 = extraCommand + 19;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                getnativemoduleiteratorreactandroid_release.hashCode();
                throw null;
            }
            getnativemoduleiteratorreactandroid_release = (getNativeModuleIteratorReactAndroid_release) getNativeProtocolAudience.onExtraCallback(-733752186, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), 733752186, new Object[]{getnativeprotocolaudience});
        }
        return new UST_GET_APPLICENSEINFO(ondisclaimerclick, getnativemoduleiteratorreactandroid_release, tossAccountHistoryActivity, tossAccountHistoryActivity, tossAccountHistoryActivity.updateVisuals());
    }

    public static final class IAuthTabCallback extends OperationHelperV2 {
        IAuthTabCallback(asInterface asinterface, LinearLayoutManager linearLayoutManager) {
            super(asinterface, linearLayoutManager);
        }

        @Override // o.OperationHelperV2
        public void onExtraCallback() throws Throwable {
            Object[] objArr = {TossAccountHistoryActivity.IAuthTabCallback_Parcel(TossAccountHistoryActivity.this)};
            UST_GET_APPLICENSEINFO.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, lt.40.onExtraCallbackWithResult(), -1928380341, 1928380346);
            TossAccountHistoryActivity tossAccountHistoryActivity = TossAccountHistoryActivity.this;
            TossAccountHistoryActivity.onNavigationEvent(tossAccountHistoryActivity, TossAccountHistoryActivity.IAuthTabCallback_Parcel(tossAccountHistoryActivity).asInterface(), false);
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                onDisclaimerClick ondisclaimerclickAccess000 = TossAccountHistoryActivity.access000(TossAccountHistoryActivity.this);
                if (ondisclaimerclickAccess000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    ondisclaimerclickAccess000 = null;
                }
                if (ondisclaimerclickAccess000.onMessageChannelReady() && TossAccountHistoryActivity.access100(TossAccountHistoryActivity.this)) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    final TossAccountHistoryActivity tossAccountHistoryActivity = TossAccountHistoryActivity.this;
                    ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1225565L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$infiniteScrollListener$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TossAccountHistoryActivity.IAuthTabCallback.onWarmupCompleted(tossAccountHistoryActivity, (SetDetectableSize) obj);
                        }
                    }, 14, (Object) null);
                    TossAccountHistoryActivity.onNavigationEvent(TossAccountHistoryActivity.this, false);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(TossAccountHistoryActivity.getInterfaceDescriptor(tossAccountHistoryActivity));
            return Unit.INSTANCE;
        }
    }

    public static final class asInterface implements OperationHelperV2.onWarmupCompleted {
        asInterface() {
        }

        @Override // o.OperationHelperV2.onWarmupCompleted
        public int IAuthTabCallback() {
            return TossAccountHistoryActivity.IAuthTabCallback_Parcel(TossAccountHistoryActivity.this).onNavigationEvent();
        }

        @Override // o.OperationHelperV2.onWarmupCompleted
        public boolean onNavigationEvent() {
            return TossAccountHistoryActivity.IAuthTabCallback_Parcel(TossAccountHistoryActivity.this).onExtraCallbackWithResult();
        }
    }

    private final OperationHelperV2 IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        OperationHelperV2 operationHelperV2 = (OperationHelperV2) this.access100.getValue();
        int i4 = extraCommand + 15;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return operationHelperV2;
    }

    private static final IAuthTabCallback ICustomTabsCallback(TossAccountHistoryActivity tossAccountHistoryActivity) {
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = tossAccountHistoryActivity.new IAuthTabCallback(tossAccountHistoryActivity.new asInterface(), tossAccountHistoryActivity.IPostMessageService_Parcel());
        int i2 = isEngagementSignalsApiAvailable + 53;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return iAuthTabCallback;
    }

    private static final Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = extraCommand + 5;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault().onTransact();
            int i4 = isEngagementSignalsApiAvailable + 85;
            extraCommand = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = isEngagementSignalsApiAvailable + 125;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
            String string = tossAccountHistoryActivity.getString(viva.republica.toss.R.string.app_account_detail___ca404ffc9b);
            Intrinsics.checkNotNullExpressionValue(string, "");
            isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string).onNavigationEvent();
            tossAccountHistoryActivity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 23;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 59;
        viva.republica.toss.account.detail.TossAccountHistoryActivity.isEngagementSignalsApiAvailable = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SessionTrackerb ICustomTabsServiceDefault() {
        SessionTrackerb sessionTrackerb;
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 3;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            sessionTrackerb = this.tossRouter;
            int i4 = 49 / 0;
        } else {
            sessionTrackerb = this.tossRouter;
        }
    }

    public final AppLovinAdServiceImplc onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCommand + 81;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        AppLovinAdServiceImplc appLovinAdServiceImplc = this.analyticsHelper;
        if (appLovinAdServiceImplc == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }
        int i5 = i3 + 59;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return appLovinAdServiceImplc;
    }

    public final zzag setEngagementSignalsCallback() {
        int i = 2 % 2;
        zzag zzagVar = this.tossClock;
        Object obj = null;
        if (zzagVar != null) {
            int i2 = extraCommand + 103;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 == 0) {
                return zzagVar;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        int i3 = extraCommand + 97;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final zzad IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        zzad zzadVar = this.environments;
        Object obj = null;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }
        int i5 = i3 + 87;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            return zzadVar;
        }
        obj.hashCode();
        throw null;
    }

    private static void c(int i, byte b, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onUnminimized)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43424), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, 22438 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 21;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i9 = $11 + 119;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = ICustomTabsCallback_Parcel;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c) + 12844);
                            int iIndexOf = 54 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0);
                            int iIndexOf2 = TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c) + 2168;
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iIndexOf, iIndexOf2, -299036574, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i10++;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $10 + 111;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    byte[] bArr3 = ICustomTabsCallback_Parcel;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onRelationshipValidationResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 41 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onUnminimized ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (mayLaunchUrl[i + ((int) (onRelationshipValidationResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onUnminimized ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (onRelationshipValidationResult ^ (-4629411779493505016L)));
                if (z) {
                    int i14 = $10 + 25;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i13 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(ICustomTabsCallbackStub), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 86, 9567 - View.MeasureSpec.makeMeasureSpec(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = ICustomTabsCallback_Parcel;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        int i17 = $10 + 43;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        int i19 = $10 + 119;
                        $11 = i19 % 128;
                        if (i19 % 2 == 0) {
                            byte[] bArr6 = ICustomTabsCallback_Parcel;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent >>> 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback % (((byte) (((byte) (bArr6[r8] | (-4629411779493505016L))) - s)) ^ b);
                        } else {
                            byte[] bArr7 = ICustomTabsCallback_Parcel;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                    } else {
                        short[] sArr = mayLaunchUrl;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private static char[] onExtraCallback = {64981, 64980, 64961, 64982};
        private static char onWarmupCompleted = 51243;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            char c;
            int length;
            char[] cArr2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = onExtraCallback;
            Object obj2 = null;
            int i4 = 6;
            if (cArr3 != null) {
                int i5 = $11 + 71;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> i4), Color.red(0) + 26, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        i4 = 6;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                char c2 = '0';
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, 23138 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i7 = $10 + 103;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        i2 = i + 106;
                        cArr4[i2] = (char) (cArr[i2] >> b);
                    } else {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b);
                    }
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i8 = $11 + 85;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            c = c2;
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24824), 74 - KeyEvent.normalizeMetaState(0), 8088 - (KeyEvent.getMaxKeyCode() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    c = '0';
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 1), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 30, (ViewConfiguration.getFadingEdgeLength() >> 16) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c = '0';
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                            } else {
                                obj = null;
                                c = '0';
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                                } else {
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                                }
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                        c2 = c;
                    }
                }
                int i15 = 0;
                while (i15 < i) {
                    cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                    i15++;
                    int i16 = $11 + Imgproc.COLOR_YUV2RGBA_YVYU;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, Context context, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
            String str5;
            String str6;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 79;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            if ((i & 4) != 0) {
                int i6 = i4 + 67;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                str5 = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                str5 = str2;
            }
            if ((i & 8) != 0) {
                int i8 = i4 + 67;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                str6 = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                str6 = str3;
            }
            Intent intentOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult(context, str, str5, str6, (i & 16) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str4);
            int i10 = onNavigationEvent + 77;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return intentOnExtraCallbackWithResult;
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intent intent = new Intent(context, (Class<?>) TossAccountHistoryActivity.class);
            intent.putExtra("accountId", str);
            intent.putExtra("depositMessage", str2);
            intent.putExtra("transferType", str3);
            Object[] objArr = new Object[1];
            a(new char[]{3, 2, 1, 2, 13818, 13818, 2, 3}, (byte) (19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 9, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str4);
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.account.detail.Hilt_TossAccountHistoryActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        String stringExtra;
        int i = 2 % 2;
        super.onCreate(bundle);
        if (!onExtraCallback(bundle)) {
            try {
                if (StringsKt__StringsKt.isBlank(this.IAuthTabCallbackStubProxy)) {
                    Toast.makeText((Context) this, (CharSequence) "계좌 내역을 조회할 수 없습니다. 다시 시도해주세요. (지속적인 오류 발생 시 고객센터로 문의 바랍니다. 고객센터: 1599–4905)", 0).show();
                    return;
                }
                Uri uri = Uri.parse(StringsKt__StringsJVMKt.replace$default(this.IAuthTabCallbackStubProxy, "&", _UrlKt.FRAGMENT_ENCODE_SET, false, 4, (Object) null));
                Object[] objArr = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132024405).substring(0, 1).length() + 2, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022885).substring(0, 15).length() - 13, new char[]{1, 65531, 4}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 240, objArr);
                String strDecode = URLDecoder.decode(uri.getQueryParameter(((String) objArr[0]).intern()), "utf-8");
                Intrinsics.checkNotNullExpressionValue(strDecode, "");
                Uri uri2 = Uri.parse(strDecode);
                Object[] objArr2 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132024049).substring(0, 16).codePointAt(3) - 93, new char[]{7, 65530, 65531, 65530, 7, 7, 65530, 7}, true, 253 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), objArr2);
                String queryParameter = uri2.getQueryParameter(((String) objArr2[0]).intern());
                if (queryParameter == null) {
                    queryParameter = "service_category";
                }
                if (uri2.getPathSegments().contains("new-intro")) {
                    getOctetOutputStream.onExtraCallback.onExtraCallback(this, queryParameter);
                } else {
                    SessionTrackerb.IAuthTabCallback(ICustomTabsServiceDefault(), this, this.IAuthTabCallbackStubProxy, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                }
                return;
            } catch (Exception unused) {
                SessionTrackerb.IAuthTabCallback(ICustomTabsServiceDefault(), this, this.IAuthTabCallbackStubProxy, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                return;
            } finally {
                finish();
            }
        }
        if (GraniteModule_onEventListenerRemoved.onExtraCallback(this.writeTypedObject)) {
            int i2 = extraCommand + 91;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            onJsBridgeReady.onNavigationEvent(this, this.writeTypedObject, 0, 2, (Object) null);
        }
        ITrustedWebActivityCallback_Parcel();
        ITrustedWebActivityCallbackStub();
        cancelNotification();
        ITrustedWebActivityCallbackDefault().onTransact();
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
        if (keyBoardVisiblePoint == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        if (keyBoardVisiblePoint.access000()) {
            onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new ICustomTabsCallback(this, (access13800) null), 3, null);
            if (!addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted) || IAuthTabCallback().onActivityLayout() || DERSet.onExtraCallback.onRequestPermissionsResult()) {
                getSmallIconBitmap();
            }
        } else {
            onDisclaimerClick ondisclaimerclick = this.onPostMessage;
            if (ondisclaimerclick == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick = null;
            }
            if (ondisclaimerclick.onMessageChannelReady()) {
                onExtraCallbackWithResult(true);
            } else {
                onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
                if (ondisclaimerclick2 == null) {
                    int i4 = isEngagementSignalsApiAvailable + 85;
                    extraCommand = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    ondisclaimerclick2 = null;
                }
                if (ondisclaimerclick2.ICustomTabsCallbackStubProxy()) {
                    int i6 = extraCommand + 107;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    if (i6 % 2 != 0) {
                        onExtraCallback(UST_SET_ANDROIDINFO.onExtraCallback.SAVING_BOX_DETAIL);
                        ITrustedWebActivityService_Parcel();
                        write();
                        throw null;
                    }
                    onExtraCallback(UST_SET_ANDROIDINFO.onExtraCallback.SAVING_BOX_DETAIL);
                    ITrustedWebActivityService_Parcel();
                    write();
                }
            }
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("celebrationMessage")) == null) {
            stringExtra = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str = stringExtra.length() > 0 ? stringExtra : null;
        if (str != null) {
            RecyclerView recyclerView = ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            onExtraCallback(recyclerView, str);
        }
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault().IAuthTabCallbackStub();
        if (i3 != 0) {
            return null;
        }
        int i4 = 99 / 0;
        return null;
    }

    private final void ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        setContentView(((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult());
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnExtraCallbackWithResult, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutOnExtraCallbackWithResult, ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).IAuthTabCallback, (View) null, (View) null, false, 14, (Object) null);
        ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onWarmupCompleted.setOnRefreshListener(new TossAccountHistoryActivity$.ExternalSyntheticLambda32(this));
        ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onNavigationEvent.setAdapter(this.onTransact);
        ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onNavigationEvent.setLayoutManager(IPostMessageService_Parcel());
        ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onNavigationEvent.addOnScrollListener(IPostMessageServiceDefault());
        ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onNavigationEvent.addItemDecoration(new byteToInt(IPostMessageService_Parcel(), this.onTransact));
        FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3 itemAnimator = ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onNavigationEvent.getItemAnimator();
        FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3 = null;
        if (itemAnimator instanceof FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3) {
            int i2 = isEngagementSignalsApiAvailable + 65;
            extraCommand = i2 % 128;
            if (i2 % 2 == 0) {
                floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3.hashCode();
                throw null;
            }
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3 = itemAnimator;
        } else {
            int i3 = isEngagementSignalsApiAvailable + 99;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
        }
        if (floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3 != null) {
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3.onExtraCallback(false);
        }
    }

    private final void ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCommand + 71;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            ITrustedWebActivityServiceDefault();
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                int i3 = extraCommand + 47;
                isEngagementSignalsApiAvailable = i3 % 128;
                supportActionBar.onNavigationEvent(i3 % 2 == 0);
                return;
            }
            return;
        }
        ITrustedWebActivityServiceDefault();
        getSupportActionBar();
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk isEngagementSignalsApiAvailable(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(List list) {
        int i = 2 % 2;
        int i2 = extraCommand + Imgproc.COLOR_YUV2RGBA_YVYU;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = JsonReaderUnknownNumberParsing.onWarmupCompleted(list);
        int i4 = isEngagementSignalsApiAvailable + 79;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return jsonReaderUnknownNumberParsingOnWarmupCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r6) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r6 != true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object postMessage(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
        if (ondisclaimerclick.ax_()) {
            int i2 = isEngagementSignalsApiAvailable + 11;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            String str = tossAccountHistoryActivity.onMessageChannelReady;
            String strOnExtraCallbackWithResult = ondisclaimerclick.onExtraCallbackWithResult();
            if (i3 == 0) {
                boolean zAreEqual = Intrinsics.areEqual(str, strOnExtraCallbackWithResult);
                int i4 = 71 / 0;
            }
        }
        int i5 = extraCommand + 39;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private static final boolean prefetchWithMultipleUrls(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 69;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = extraCommand + 119;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return zBooleanValue;
    }

    private static final void requestPostMessageChannelWithExtras(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 93;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCommand + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback_Parcel(Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 81;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 59 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = extraCommand + 35;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, onDisclaimerClick ondisclaimerclick) {
        int i = 2 % 2;
        int i2 = extraCommand + 91;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(ondisclaimerclick);
            tossAccountHistoryActivity.IAuthTabCallback(ondisclaimerclick);
            Unit unit = Unit.INSTANCE;
            int i3 = isEngagementSignalsApiAvailable + 3;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        Intrinsics.checkNotNull(ondisclaimerclick);
        tossAccountHistoryActivity.IAuthTabCallback(ondisclaimerclick);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final void receiveFile(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
    }

    private static final void requestPostMessageChannel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 81;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault()};
        UST_GET_APPLICENSEINFO.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, lt.40.onExtraCallbackWithResult(), -2062011571, 2062011574);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 67;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void postMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 67;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final Unit getInterfaceDescriptor(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 93;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = extraCommand + 73;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnExtraCallbackWithResult, "");
        TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent((View) constraintLayoutOnExtraCallbackWithResult, (CharSequence) onwarmupcompleted.onExtraCallback()), onwarmupcompleted.IAuthTabCallback(), 0, 2, (Object) null).onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void prefetch(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 83;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
    }

    private static final boolean newSession(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 45;
        extraCommand = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            ((Boolean) function1.invoke(obj)).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        obj2.hashCode();
        throw null;
    }

    private static final boolean onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, setMinimumDpi setminimumdpi) {
        int i = 2 % 2;
        int i2 = extraCommand + 83;
        isEngagementSignalsApiAvailable = i2 % 128;
        KeyBoardVisiblePoint keyBoardVisiblePoint = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setminimumdpi, "");
            onDisclaimerClick ondisclaimerclick = tossAccountHistoryActivity.onPostMessage;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setminimumdpi, "");
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = tossAccountHistoryActivity.onPostMessage;
        if (keyBoardVisiblePoint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i3 = isEngagementSignalsApiAvailable + 43;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
        } else {
            keyBoardVisiblePoint = keyBoardVisiblePoint2;
        }
        return setminimumdpi.onNavigationEvent(keyBoardVisiblePoint.onExtraCallbackWithResult());
    }

    private static final void newSessionWithExtras(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = extraCommand + 9;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, setMinimumDpi setminimumdpi) {
        setDoubleTapZoomDpi setdoubletapzoomdpi;
        RecyclerView recyclerView;
        int i;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 35;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            tossAccountHistoryActivity.onActivityResized = setminimumdpi.IAuthTabCallback();
            setdoubletapzoomdpi = setDoubleTapZoomDpi.IAuthTabCallback;
            recyclerView = ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            i = 1;
        } else {
            tossAccountHistoryActivity.onActivityResized = setminimumdpi.IAuthTabCallback();
            setdoubletapzoomdpi = setDoubleTapZoomDpi.IAuthTabCallback;
            recyclerView = ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            i = 0;
        }
        setdoubletapzoomdpi.IAuthTabCallback(recyclerView, i);
        tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault().onTransact();
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit access000(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 15;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = isEngagementSignalsApiAvailable + 33;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelNotification() {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallbackStub = PageShowPoint.Companion.IAuthTabCallbackStub();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingIAuthTabCallbackStub.onExtraCallbackWithResult(500L, timeUnit).IAuthTabCallback((deserializeIntNullableCollection) new TossAccountHistoryActivity$.ExternalSyntheticLambda69(new TossAccountHistoryActivity$.ExternalSyntheticLambda58())).onWarmupCompleted((deserializeLongCollection) new TossAccountHistoryActivity$.ExternalSyntheticLambda71(new TossAccountHistoryActivity$.ExternalSyntheticLambda70(this)));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted2, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsingOnWarmupCompleted2.onWarmupCompleted((deserializeFloat) new TossAccountHistoryActivity$.ExternalSyntheticLambda73(new TossAccountHistoryActivity$.ExternalSyntheticLambda72(this)), (deserializeFloat<? super Throwable>) new TossAccountHistoryActivity$.ExternalSyntheticLambda75(new TossAccountHistoryActivity$.ExternalSyntheticLambda74()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted);
        getByteBuffer<Boolean> getbytebufferOnExtraCallback = this.getInterfaceDescriptor.onExtraCallback(200L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        getByteBuffer<R> getbytebufferOnExtraCallback2 = getbytebufferOnExtraCallback.onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback2, "");
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnExtraCallback2.IAuthTabCallback((deserializeFloat<? super R>) new TossAccountHistoryActivity$.ExternalSyntheticLambda77(new TossAccountHistoryActivity$.ExternalSyntheticLambda76(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
        getIconPaddingLeft geticonpaddingleft = getIconPaddingLeft.IAuthTabCallback;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = geticonpaddingleft.onWarmupCompleted().onExtraCallback(onWarmupCompleted.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted3 = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted3, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted2 = jsonReaderUnknownNumberParsingOnWarmupCompleted3.onWarmupCompleted((deserializeFloat) new TossAccountHistoryActivity$.ExternalSyntheticLambda60(new TossAccountHistoryActivity$.ExternalSyntheticLambda59(this)), (deserializeFloat<? super Throwable>) new TossAccountHistoryActivity$.ExternalSyntheticLambda62(new TossAccountHistoryActivity$.ExternalSyntheticLambda61()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted2, "");
        onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted2);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted4 = geticonpaddingleft.onWarmupCompleted().onExtraCallback(setMinimumDpi.class).onWarmupCompleted((deserializeLongCollection) new TossAccountHistoryActivity$.ExternalSyntheticLambda64(new TossAccountHistoryActivity$.ExternalSyntheticLambda63(this)));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted4, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted5 = jsonReaderUnknownNumberParsingOnWarmupCompleted4.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted5, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted3 = jsonReaderUnknownNumberParsingOnWarmupCompleted5.onWarmupCompleted((deserializeFloat) new TossAccountHistoryActivity$.ExternalSyntheticLambda66(new TossAccountHistoryActivity$.ExternalSyntheticLambda65(this)), (deserializeFloat<? super Throwable>) new TossAccountHistoryActivity$.ExternalSyntheticLambda68(new TossAccountHistoryActivity$.ExternalSyntheticLambda67()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted3, "");
        onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted3);
        int i2 = isEngagementSignalsApiAvailable + 77;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onTransact implements InventoryAdManager.onExtraCallbackWithResult {
        onTransact() {
        }

        public void IAuthTabCallback(InventoryAdDto inventoryAdDto) {
            TossAccountHistoryActivity.IAuthTabCallback_Parcel(TossAccountHistoryActivity.this).onNavigationEvent(inventoryAdDto);
            if (inventoryAdDto != null) {
                ((changeResultMsg) TossAccountHistoryActivity.IAuthTabCallback(-1720534805, new Object[]{TossAccountHistoryActivity.this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1720534853)).IAuthTabCallback(inventoryAdDto);
            }
        }
    }

    private final void onExtraCallback(UST_SET_ANDROIDINFO.onExtraCallback onextracallback) {
        int i = 2 % 2;
        InventoryAdManager.onExtraCallback(zzaq.onNavigationEvent(), new Object[]{updateVisuals(), this, onextracallback.getSpaceId(), null, null, null, ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onNavigationEvent, new onTransact(), 28, null}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1800729255, -1800729253);
        UST_GET_APPLICENSEINFO ust_get_applicenseinfoITrustedWebActivityCallbackDefault = ITrustedWebActivityCallbackDefault();
        InventoryAdManager inventoryAdManagerUpdateVisuals = updateVisuals();
        zzm zzmVar = (zzm) InventoryAdManager.onExtraCallback(zzaq.onNavigationEvent(), new Object[]{inventoryAdManagerUpdateVisuals}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1913827090, -1913827081);
        InventoryAdDto inventoryAdDto = null;
        if ((zzmVar == null ? -1 : OperationHelperV1a.onExtraCallback[zzmVar.ordinal()]) != 1) {
            int i2 = isEngagementSignalsApiAvailable + 87;
            extraCommand = i2 % 128;
            if (i2 % 2 == 0) {
                inventoryAdDto.hashCode();
                throw null;
            }
        } else {
            InventoryAdDto inventoryAdDto2 = (zzen) InventoryAdManager.onExtraCallback(zzaq.onNavigationEvent(), new Object[]{inventoryAdManagerUpdateVisuals}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1807457956, -1807457956);
            if (inventoryAdDto2 instanceof InventoryAdDto) {
                int i3 = isEngagementSignalsApiAvailable + 77;
                extraCommand = i3 % 128;
                int i4 = i3 % 2;
                inventoryAdDto = inventoryAdDto2;
            }
            inventoryAdDto = inventoryAdDto;
        }
        ust_get_applicenseinfoITrustedWebActivityCallbackDefault.onNavigationEvent(onextracallback, inventoryAdDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, viva.republica.toss.account.detail.TossAccountHistoryActivity] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        Bundle extras;
        ?? string;
        Object next;
        int i = 2 % 2;
        String stringExtra4 = "-2147483648";
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        String str2 = null;
        if (bundle != null) {
            stringExtra4 = bundle.getString("accountId", "-2147483648");
            Intrinsics.checkNotNull(stringExtra4);
        } else {
            Intent intent = getIntent();
            if (intent == null || (stringExtra3 = intent.getStringExtra("im.toss.deep_link_uri")) == null || !StringsKt__StringsKt.contains$default((CharSequence) stringExtra3, (CharSequence) "savingbox/detail", false, 2, (Object) null)) {
                Intent intent2 = getIntent();
                if (intent2 == null || (stringExtra2 = intent2.getStringExtra("im.toss.deep_link_uri")) == null || !StringsKt__StringsKt.contains$default((CharSequence) stringExtra2, (CharSequence) "teens/savingbox/transaction", false, 2, (Object) null)) {
                    String stringExtra5 = getIntent().getStringExtra("depositMessage");
                    if (stringExtra5 == null) {
                        stringExtra5 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    this.writeTypedObject = stringExtra5;
                    stringExtra = getIntent().getStringExtra("accountId");
                    if (stringExtra != null) {
                    }
                } else {
                    stringExtra4 = getIntent().getStringExtra("savingboxId");
                    if (stringExtra4 == null) {
                        stringExtra4 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                }
            } else {
                onDisclaimerClick ondisclaimerclickIAuthTabCallbackStub = DERConstructedSet.onNavigationEvent.IAuthTabCallbackStub();
                if (ondisclaimerclickIAuthTabCallbackStub != null) {
                    int i2 = extraCommand + 21;
                    isEngagementSignalsApiAvailable = i2 % 128;
                    int i3 = i2 % 2;
                    stringExtra = ondisclaimerclickIAuthTabCallbackStub.onExtraCallbackWithResult();
                    if (stringExtra == null) {
                        stringExtra = "-2147483648";
                    }
                    if (Intrinsics.areEqual(stringExtra, "-2147483648")) {
                        String stringExtra6 = getIntent().getStringExtra("landing");
                        if (stringExtra6 == null) {
                            stringExtra6 = _UrlKt.FRAGMENT_ENCODE_SET;
                        }
                        this.IAuthTabCallbackStubProxy = stringExtra6;
                    }
                }
            }
            stringExtra4 = stringExtra;
        }
        this.onMessageChannelReady = stringExtra4;
        onDisclaimerClick ondisclaimerclickIAuthTabCallback = DERConstructedSet.IAuthTabCallback(stringExtra4);
        if (ondisclaimerclickIAuthTabCallback != null) {
            int i4 = isEngagementSignalsApiAvailable + 63;
            extraCommand = i4 % 128;
            if (i4 % 2 == 0) {
                ondisclaimerclickIAuthTabCallback.ax_();
                throw null;
            }
            if (ondisclaimerclickIAuthTabCallback.ax_()) {
                this.onPostMessage = ondisclaimerclickIAuthTabCallback;
                Intent intent3 = getIntent();
                if (intent3 != null && (extras = intent3.getExtras()) != null && extras.containsKey("transferType")) {
                    if (zzbq.onNavigationEvent(intent3)) {
                        Bundle extras2 = intent3.getExtras();
                        if (extras2 != null && (string = extras2.getString("transferType")) != 0) {
                            if (Intrinsics.areEqual(String.class, Integer.class)) {
                                string = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
                            } else if (Intrinsics.areEqual(String.class, Long.class)) {
                                string = StringsKt__StringNumberConversionsKt.toLongOrNull(string);
                            } else if (Intrinsics.areEqual(String.class, Float.class)) {
                                string = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
                            } else if (Intrinsics.areEqual(String.class, Double.class)) {
                                string = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
                            } else if (Intrinsics.areEqual(String.class, Short.class)) {
                                int i5 = isEngagementSignalsApiAvailable + 113;
                                extraCommand = i5 % 128;
                                if (i5 % 2 == 0) {
                                    StringsKt__StringNumberConversionsKt.toShortOrNull(string);
                                    throw null;
                                }
                                string = StringsKt__StringNumberConversionsKt.toShortOrNull(string);
                            } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                                string = StringsKt__StringNumberConversionsKt.toByteOrNull(string);
                            } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                                string = Boolean.valueOf(Boolean.parseBoolean(string));
                            } else if (Intrinsics.areEqual(String.class, Character.class)) {
                                string = Character.valueOf(string.charAt(0));
                            } else if (!Intrinsics.areEqual(String.class, String.class)) {
                                if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : listSplit$default) {
                                        if (((String) obj).length() > 0) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                                    }
                                    string = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj2 : listSplit$default2) {
                                        if (((String) obj2).length() > 0) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                                    }
                                    string = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj3 : listSplit$default3) {
                                        if (((String) obj3).length() > 0) {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                    Iterator it3 = arrayList5.iterator();
                                    while (it3.hasNext()) {
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                                    }
                                    string = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it4 = listSplit$default4.iterator();
                                    while (it4.hasNext()) {
                                        int i6 = extraCommand + 51;
                                        isEngagementSignalsApiAvailable = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            ((String) it4.next()).length();
                                            str2.hashCode();
                                            throw null;
                                        }
                                        Object next2 = it4.next();
                                        if (((String) next2).length() > 0) {
                                            arrayList7.add(next2);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it5 = arrayList7.iterator();
                                    while (it5.hasNext()) {
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                                    }
                                    string = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj4 : listSplit$default5) {
                                        if (((String) obj4).length() > 0) {
                                            arrayList9.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it6 = arrayList9.iterator();
                                    while (it6.hasNext()) {
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                                    }
                                    string = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj5 : listSplit$default6) {
                                        if (((String) obj5).length() > 0) {
                                            int i7 = isEngagementSignalsApiAvailable + 111;
                                            extraCommand = i7 % 128;
                                            if (i7 % 2 == 0) {
                                                arrayList11.add(obj5);
                                                throw null;
                                            }
                                            arrayList11.add(obj5);
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it7 = arrayList11.iterator();
                                    while (it7.hasNext()) {
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                                    }
                                    string = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    for (Object obj6 : listSplit$default7) {
                                        if (((String) obj6).length() > 0) {
                                            arrayList13.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                    Iterator it8 = arrayList13.iterator();
                                    while (it8.hasNext()) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString())));
                                    }
                                    string = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList15 = new ArrayList();
                                    for (Object obj7 : listSplit$default8) {
                                        if (((String) obj7).length() > 0) {
                                            arrayList15.add(obj7);
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                                    Iterator it9 = arrayList15.iterator();
                                    while (it9.hasNext()) {
                                        arrayList16.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it9.next()).toString().charAt(0)));
                                    }
                                    string = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                    List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj8 : listSplit$default9) {
                                        if (((String) obj8).length() > 0) {
                                            int i8 = isEngagementSignalsApiAvailable + 81;
                                            extraCommand = i8 % 128;
                                            int i9 = i8 % 2;
                                            arrayList17.add(obj8);
                                        }
                                    }
                                    string = arrayList17.toArray(new String[0]);
                                } else {
                                    Object[] enumConstants = String.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        for (Object obj9 : enumConstants) {
                                            Intrinsics.checkNotNull(obj9, "");
                                            arrayList18.add((Enum) obj9);
                                        }
                                        Iterator it10 = arrayList18.iterator();
                                        while (true) {
                                            if (!it10.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it10.next();
                                            if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                int i10 = extraCommand + 113;
                                                isEngagementSignalsApiAvailable = i10 % 128;
                                                int i11 = i10 % 2;
                                                break;
                                            }
                                        }
                                        string = (Enum) next;
                                    } else {
                                        string = 0;
                                    }
                                    if (string == 0) {
                                        int i12 = extraCommand + 21;
                                        isEngagementSignalsApiAvailable = i12 % 128;
                                        int i13 = i12 % 2;
                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                            throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                        }
                                        string = 0;
                                    }
                                }
                            }
                            if (string instanceof String) {
                                str2 = string;
                            } else {
                                int i14 = isEngagementSignalsApiAvailable + 43;
                                extraCommand = i14 % 128;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                            }
                            str2 = str2;
                        }
                    } else {
                        Bundle extras3 = intent3.getExtras();
                        String str3 = extras3 != null ? extras3.get("transferType") : null;
                        if (str3 instanceof String) {
                            str2 = str3;
                        } else {
                            int i15 = isEngagementSignalsApiAvailable + 53;
                            extraCommand = i15 % 128;
                            int i16 = i15 % 2;
                        }
                        str2 = str2;
                    }
                }
                if (str2 != null) {
                    str = str2;
                }
                this.onActivityLayout = str;
                return true;
            }
        }
        if (this.IAuthTabCallbackStubProxy.length() == 0) {
            auth.onExtraCallbackWithResult(auth.onNavigationEvent, "TossAccount is null or invalid.", "tossAccountId : " + this.onMessageChannelReady, (Map) null, 4, (Object) null);
        }
        return false;
    }

    static /* synthetic */ void IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 99;
        extraCommand = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            z = false;
        }
        tossAccountHistoryActivity.onExtraCallbackWithResult(z);
        int i4 = isEngagementSignalsApiAvailable + 61;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, boolean z, swapLeftAndRightInRTL swapleftandrightinrtl) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        tossAccountHistoryActivity.asBinder = swapleftandrightinrtl;
        if (z) {
            tossAccountHistoryActivity.onTrackView();
            int i4 = extraCommand + 51;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        }
        tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault().IAuthTabCallback(swapleftandrightinrtl);
        tossAccountHistoryActivity.onTransact.notifyItemChanged(0);
        TdsBottomCtaV1View tdsBottomCtaV1View = ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        tdsBottomCtaV1View.setVisibility(0);
        tossAccountHistoryActivity.ITrustedWebActivityServiceStub();
    }

    private static final void ICustomTabsServiceStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = isEngagementSignalsApiAvailable + 33;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCommand + 23;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(tossAccountHistoryActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 9;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    private static final void onPostMessage(TossAccountHistoryActivity tossAccountHistoryActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 41;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        tossAccountHistoryActivity.bo_();
        int i4 = isEngagementSignalsApiAvailable + 97;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 49;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        int i4 = 66 / 0;
        return null;
    }

    private static final void warmup(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 53;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = isEngagementSignalsApiAvailable + 5;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    private static final Unit onNavigationEvent(swapLeftAndRightInRTL swapleftandrightinrtl, TossAccountHistoryActivity tossAccountHistoryActivity, boolean z, Pair pair) {
        Object next;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        notifyTaskFinished notifytaskfinished = (notifyTaskFinished) pair.onExtraCallbackWithResult();
        allowRTL allowrtl = (allowRTL) pair.IAuthTabCallback();
        Iterator it = notifytaskfinished.onExtraCallback().iterator();
        int i4 = extraCommand + 95;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 % 5;
        }
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long jIAuthTabCallback = ((notifyTaskRetry) next).IAuthTabCallback();
            Long lOnTransact = swapleftandrightinrtl.onTransact();
            if (lOnTransact != null) {
                int i6 = isEngagementSignalsApiAvailable + 27;
                extraCommand = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 55 / 0;
                    if (jIAuthTabCallback == lOnTransact.longValue()) {
                        break;
                    }
                } else if (jIAuthTabCallback == lOnTransact.longValue()) {
                    break;
                }
            }
        }
        notifyTaskRetry notifytaskretry = (notifyTaskRetry) next;
        swapleftandrightinrtl.IAuthTabCallback(notifytaskretry != null ? notifytaskretry.onWarmupCompleted() : null);
        swapleftandrightinrtl.onNavigationEvent(allowrtl.onWarmupCompleted());
        String strIAuthTabCallback = allowrtl.IAuthTabCallback();
        swapleftandrightinrtl.onWarmupCompleted(strIAuthTabCallback != null ? tossAccountHistoryActivity.asBinder(strIAuthTabCallback) : null);
        onExtraCallback(tossAccountHistoryActivity, z, swapleftandrightinrtl);
        return Unit.INSTANCE;
    }

    private static final void updateVisuals(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 99;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
    }

    private static final Unit IAuthTabCallback(swapLeftAndRightInRTL swapleftandrightinrtl, TossAccountHistoryActivity tossAccountHistoryActivity, boolean z, Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 9;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(tossAccountHistoryActivity, z, swapleftandrightinrtl);
            unit = Unit.INSTANCE;
            int i3 = 7 / 0;
        } else {
            onExtraCallback(tossAccountHistoryActivity, z, swapleftandrightinrtl);
            unit = Unit.INSTANCE;
        }
        int i4 = extraCommand + 5;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCommand + 39;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = isEngagementSignalsApiAvailable + 47;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [im.toss.uikit.base.UIKitBaseActivity, viva.republica.toss.account.detail.TossAccountHistoryActivity] */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        final ?? r1 = (TossAccountHistoryActivity) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        queryCache querycache = (queryCache) objArr[2];
        int i = 2 % 2;
        int i2 = extraCommand + 47;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        final swapLeftAndRightInRTL swapleftandrightinrtlOnNavigationEvent = querycache.onNavigationEvent();
        if (((Boolean) swapLeftAndRightInRTL.onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{swapleftandrightinrtlOnNavigationEvent}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1336129391, -1336129387, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue()) {
            r1.onExtraCallback(UST_SET_ANDROIDINFO.onExtraCallback.FANGIRL_BOX_DETAIL);
            setTagBytes settagbytes = setTagBytes.onNavigationEvent;
            AdSettingsIntegrationErrorMode adSettingsIntegrationErrorMode = AdSettingsIntegrationErrorMode.onNavigationEvent;
            writeRaw writerawIAuthTabCallback = adSettingsIntegrationErrorMode.IAuthTabCallbackStubProxy().IAuthTabCallback();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new IAuthTabCallbackStub(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            writeRaw writerawOnExtraCallbackWithResult = adSettingsIntegrationErrorMode.IAuthTabCallbackStubProxy().onExtraCallbackWithResult();
            MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, "");
            writeRaw writerawIAuthTabCallback3 = writerawOnExtraCallbackWithResult.IAuthTabCallback(new IAuthTabCallbackDefault(mapConverterOnExtraCallback2, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback3, "");
            writeRaw writerawIAuthTabCallback4 = settagbytes.IAuthTabCallback(writerawIAuthTabCallback2, writerawIAuthTabCallback3).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback4, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TossAccountHistoryActivity.IAuthTabCallback(swapleftandrightinrtlOnNavigationEvent, r1, zBooleanValue, (Pair) obj);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda2
                @Override // o.deserializeFloat
                public final void accept(Object obj) throws Throwable {
                    TossAccountHistoryActivity.IAuthTabCallback(-1882016990, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1882017027);
                }
            };
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    swapLeftAndRightInRTL swapleftandrightinrtl = swapleftandrightinrtlOnNavigationEvent;
                    TossAccountHistoryActivity tossAccountHistoryActivity = r1;
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    return (Unit) TossAccountHistoryActivity.IAuthTabCallback(-2122972838, new Object[]{swapleftandrightinrtl, tossAccountHistoryActivity, boolValueOf, (Throwable) obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2122972847);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback4.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda4
                @Override // o.deserializeFloat
                public final void accept(Object obj) {
                    TossAccountHistoryActivity.onMinimized(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            r1.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
            int i4 = extraCommand + 113;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        } else {
            r1.onExtraCallback(UST_SET_ANDROIDINFO.onExtraCallback.HENEM_BOX_DETAIL);
            onExtraCallback((TossAccountHistoryActivity) r1, zBooleanValue, swapleftandrightinrtlOnNavigationEvent);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface) {
        Unit unit;
        int i = 2 % 2;
        int i2 = extraCommand + 101;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            tossAccountHistoryActivity.finish();
            unit = Unit.INSTANCE;
            int i3 = 2 / 0;
        } else {
            tossAccountHistoryActivity.finish();
            unit = Unit.INSTANCE;
        }
        int i4 = extraCommand + 83;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asBinder(final TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, tossAccountHistoryActivity, false, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda95
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + 83;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(final boolean z) {
        int i = 2 % 2;
        ExtraHintsHintType extraHintsHintTypeIAuthTabCallbackStubProxy = AdSettingsIntegrationErrorMode.onNavigationEvent.IAuthTabCallbackStubProxy();
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
        if (keyBoardVisiblePoint == null) {
            int i2 = isEngagementSignalsApiAvailable + 105;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = extraCommand + 59;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            }
            keyBoardVisiblePoint = null;
        }
        writeRaw writerawOnExtraCallbackWithResult = extraHintsHintTypeIAuthTabCallbackStubProxy.onExtraCallbackWithResult(Long.parseLong(keyBoardVisiblePoint.onExtraCallbackWithResult()));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new asBinder(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onExtraCallbackWithResult(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda21
            @Override // o.deserializeFloat
            public final void accept(Object obj) throws Throwable {
                TossAccountHistoryActivity.IAuthTabCallback(-548431008, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 548431051);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda22
            @Override // o.deserializeDecimalCollection
            public final void run() {
                TossAccountHistoryActivity.onExtraCallback(this.f$0);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onExtraCallback(this.f$0, z, (queryCache) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda24
            @Override // o.deserializeFloat
            public final void accept(Object obj) throws Throwable {
                TossAccountHistoryActivity.IAuthTabCallback(1213054529, new Object[]{function12, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1213054528);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.IAuthTabCallback(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda26
            @Override // o.deserializeFloat
            public final void accept(Object obj) throws Throwable {
                TossAccountHistoryActivity.onRelationshipValidationResult(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        int i6 = isEngagementSignalsApiAvailable + 43;
        extraCommand = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
    }

    private final LocalDate asBinder(String str) {
        Object objM31constructorimpl;
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(LocalDateTime.parse(str).toLocalDate());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(objM31constructorimpl)) {
            int i4 = extraCommand + 49;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            objM31constructorimpl = null;
        }
        LocalDate localDate = (LocalDate) objM31constructorimpl;
        int i6 = extraCommand + 7;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 58 / 0;
        }
        return localDate;
    }

    private static final Unit getInterfaceDescriptor(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "withdraw");
        setDetectableSize.onExtraCallback(tossAccountHistoryActivity.IPostMessageServiceStub());
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 113;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final TossAccountHistoryActivity tossAccountHistoryActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1225563L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        tossAccountHistoryActivity.IPostMessageServiceStubProxy();
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + 57;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCommand(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", "save");
            setDetectableSize.onExtraCallback(tossAccountHistoryActivity.IPostMessageServiceStub());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "save");
        setDetectableSize.onExtraCallback(tossAccountHistoryActivity.IPostMessageServiceStub());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallback(final TossAccountHistoryActivity tossAccountHistoryActivity, View view) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1225563L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        IAuthTabCallback(-2107127153, new Object[]{tossAccountHistoryActivity, "DEPOSIT"}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2107127183);
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r2 = r2 + 89;
        viva.republica.toss.account.detail.TossAccountHistoryActivity.extraCommand = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if ((r2 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r3.onMinimized() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r3.onMinimized() != true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r2 = r18.asBinder;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r2.IAuthTabCallback() > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        r2 = viva.republica.toss.account.detail.TossAccountHistoryActivity.extraCommand + 57;
        viva.republica.toss.account.detail.TossAccountHistoryActivity.isEngagementSignalsApiAvailable = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r3 = ((o.CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new java.lang.Object[]{r18}, im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r4 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        r5 = viva.republica.toss.account.detail.TossAccountHistoryActivity.isEngagementSignalsApiAvailable + 35;
        viva.republica.toss.account.detail.TossAccountHistoryActivity.extraCommand = r5 % 128;
        r5 = r5 % 2;
        r5 = viva.republica.toss.R.string.app_account_detail___1505205c28;
        r6 = viva.republica.toss.account.detail.TossAccountHistoryActivity.extraCommand + 81;
        viva.republica.toss.account.detail.TossAccountHistoryActivity.isEngagementSignalsApiAvailable = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r5 = viva.republica.toss.R.string.app_account_detail___1ca69c20e6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        r6 = getString(r5);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
        im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.setCta$default(r3, r6, new viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda47(r18), (im.toss.tds.view.component.atom.button.TdsButtonV1View.asInterface) null, false, 12, (java.lang.Object) null);
        r3.onNavigationEvent();
        ((o.CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new java.lang.Object[]{r18}, im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult.asInterface().setEnabled(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        r1 = ((o.CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new java.lang.Object[]{r18}, im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        r3 = getString(viva.republica.toss.R.string.app_view_toss_account_history_header___ca736464b9);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "");
        im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.setCta$default(r1, r3, new viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda48(r18), (im.toss.tds.view.component.atom.button.TdsButtonV1View.asInterface) null, false, 12, (java.lang.Object) null);
        r3 = getString(viva.republica.toss.R.string.app_account_detail___1505205c28);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "");
        im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.setSecondary$default(r1, r3, new viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda49(r18), (im.toss.tds.view.component.atom.button.TdsButtonV1View.asInterface) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r2 = r2 + 53;
        viva.republica.toss.account.detail.TossAccountHistoryActivity.extraCommand = r2 % 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ITrustedWebActivityServiceStub() {
        swapLeftAndRightInRTL swapleftandrightinrtl;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 21;
        extraCommand = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            swapleftandrightinrtl = this.asBinder;
            int i4 = 45 / 0;
        } else {
            swapleftandrightinrtl = this.asBinder;
        }
    }

    private static final Unit access000(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCommand + 71;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", "withdraw");
            setDetectableSize.onExtraCallback(tossAccountHistoryActivity.IPostMessageServiceStub());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "withdraw");
        setDetectableSize.onExtraCallback(tossAccountHistoryActivity.IPostMessageServiceStub());
        Unit unit2 = Unit.INSTANCE;
        int i3 = extraCommand + 35;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onTransact(final TossAccountHistoryActivity tossAccountHistoryActivity, View view) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1225563L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        IAuthTabCallback(-2107127153, new Object[]{tossAccountHistoryActivity, "WITHDRAW"}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2107127183);
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Map<String, String> IPostMessageServiceStub() throws Throwable {
        Object obj;
        swapLeftAndRightInRTL swapleftandrightinrtl;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 51;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        swapLeftAndRightInRTL swapleftandrightinrtl2 = this.asBinder;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("henembox_name", swapleftandrightinrtl2 != null ? swapleftandrightinrtl2.onPostMessage() : null);
        swapLeftAndRightInRTL swapleftandrightinrtl3 = this.asBinder;
        String str = "Y";
        String str2 = (swapleftandrightinrtl3 == null || !swapleftandrightinrtl3.onMinimized()) ? "N" : "Y";
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 10, Color.alpha(0) + 9, new char[]{'\r', 65523, 7, 7, 65529, 65527, 65527, '\t', 7, 2}, true, AndroidCharacter.getMirror('0') + 206, objArr);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str2);
        swapLeftAndRightInRTL swapleftandrightinrtl4 = this.asBinder;
        if (swapleftandrightinrtl4 != null) {
            int i4 = extraCommand + 21;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            if (!swapleftandrightinrtl4.onMinimized() || (swapleftandrightinrtl = this.asBinder) == null) {
                obj = "N";
            } else {
                int i6 = isEngagementSignalsApiAvailable + 51;
                extraCommand = i6 % 128;
                if (i6 % 2 != 0 ? swapleftandrightinrtl.IAuthTabCallback() == 0 : swapleftandrightinrtl.IAuthTabCallback() == 1) {
                    int i7 = extraCommand + 51;
                    isEngagementSignalsApiAvailable = i7 % 128;
                    int i8 = i7 % 2;
                    obj = "Y";
                }
            }
        }
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("withdraw_yn", obj);
        swapLeftAndRightInRTL swapleftandrightinrtl5 = this.asBinder;
        if (swapleftandrightinrtl5 != null) {
            if (((Boolean) swapLeftAndRightInRTL.onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{swapleftandrightinrtl5}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1336129391, -1336129387, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue()) {
                int i9 = isEngagementSignalsApiAvailable + 83;
                extraCommand = i9 % 128;
                int i10 = i9 % 2;
            } else {
                str = "N";
            }
        }
        return access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("fangirl_savings", str));
    }

    private static final void extraCommand(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 9;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = isEngagementSignalsApiAvailable + 95;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 45;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult.asInterface().setLoading(true);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 33;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult.asInterface().setLoading(false);
        int i4 = isEngagementSignalsApiAvailable + 99;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, Object obj) {
        int i = 2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnExtraCallbackWithResult, "");
        String string = tossAccountHistoryActivity.getString(viva.republica.toss.R.string.app_account_detail___56daa61793);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object obj2 = null;
        TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent((View) constraintLayoutOnExtraCallbackWithResult, (CharSequence) string), viva.republica.toss.R.drawable.icn_success_color, 0, 2, (Object) null).onNavigationEvent();
        tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault().onTransact();
        int i2 = isEngagementSignalsApiAvailable + 101;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 19;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceStubProxy() {
        long jIAuthTabCallback;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 125;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        ExtraHintsHintType extraHintsHintTypeIAuthTabCallbackStubProxy = AdSettingsIntegrationErrorMode.onNavigationEvent.IAuthTabCallbackStubProxy();
        swapLeftAndRightInRTL swapleftandrightinrtl = this.asBinder;
        if (swapleftandrightinrtl != null) {
            long jLongValue = ((Long) swapLeftAndRightInRTL.onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{swapleftandrightinrtl}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 252394631, -252394628, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).longValue();
            swapLeftAndRightInRTL swapleftandrightinrtl2 = this.asBinder;
            if (swapleftandrightinrtl2 != null) {
                int i4 = isEngagementSignalsApiAvailable + 113;
                extraCommand = i4 % 128;
                int i5 = i4 % 2;
                jIAuthTabCallback = swapleftandrightinrtl2.IAuthTabCallback();
                int i6 = isEngagementSignalsApiAvailable + 25;
                extraCommand = i6 % 128;
                int i7 = i6 % 2;
            } else {
                jIAuthTabCallback = 0;
            }
            writeRaw writerawOnNavigationEvent = extraHintsHintTypeIAuthTabCallbackStubProxy.onNavigationEvent(jLongValue, new NativeI18nManagerSpec(jIAuthTabCallback, (String) null));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TossAccountHistoryActivity.onExtraCallback(this.f$0, (deserializeUriNullableCollection) obj);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda15
                @Override // o.deserializeFloat
                public final void accept(Object obj) throws Throwable {
                    TossAccountHistoryActivity.IAuthTabCallback(1009511969, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1009511954);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda16
                @Override // o.deserializeDecimalCollection
                public final void run() throws Throwable {
                    TossAccountHistoryActivity.onExtraCallbackWithResult(this.f$0);
                }
            });
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda17
                @Override // o.deserializeFloat
                public final void accept(Object obj) {
                    TossAccountHistoryActivity.IAuthTabCallback(this.f$0, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TossAccountHistoryActivity.onNavigationEvent(this.f$0, (Throwable) obj);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda19
                @Override // o.deserializeFloat
                public final void accept(Object obj) throws Throwable {
                    TossAccountHistoryActivity.IAuthTabCallbackStub(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 81;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, tossAccountHistoryActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 64, (Object) null);
        } else {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, tossAccountHistoryActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = isEngagementSignalsApiAvailable + 51;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final void writeTypedList(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[1];
        Date date = (Date) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        captureComplete capturecomplete = (captureComplete) objArr[4];
        int i = 2 % 2;
        if (iIntValue != tossAccountHistoryActivity.IAuthTabCallback_Parcel) {
            int i2 = isEngagementSignalsApiAvailable + 9;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            return Unit.INSTANCE;
        }
        UST_GET_APPLICENSEINFO ust_get_applicenseinfoITrustedWebActivityCallbackDefault = tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault();
        Intrinsics.checkNotNull(capturecomplete);
        ust_get_applicenseinfoITrustedWebActivityCallbackDefault.onWarmupCompleted(date, capturecomplete, zBooleanValue);
        Object[] objArr2 = {tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault(), capturecomplete};
        if (((Boolean) UST_GET_APPLICENSEINFO.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr2, lt.40.onExtraCallbackWithResult(), -416831501, 416831508)).booleanValue()) {
            int i4 = extraCommand + 13;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                tossAccountHistoryActivity.IPostMessageServiceDefault().onExtraCallbackWithResult();
                throw null;
            }
            tossAccountHistoryActivity.IPostMessageServiceDefault().onExtraCallbackWithResult();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = isEngagementSignalsApiAvailable + 77;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void access200(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 83;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = isEngagementSignalsApiAvailable + 23;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = extraCommand + 3;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        tossAccountHistoryActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCommand + 9;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context, viva.republica.toss.account.detail.TossAccountHistoryActivity] */
    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        final ?? r3 = (TossAccountHistoryActivity) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 81;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 == 0) {
            if (iIntValue == ((TossAccountHistoryActivity) r3).IAuthTabCallback_Parcel) {
                Intrinsics.checkNotNull(th);
                getParamImp.onWarmupCompleted(th, (Context) r3, false, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TossAccountHistoryActivity.onWarmupCompleted(this.f$0, (DialogInterface) obj);
                    }
                }, 14, (Object) null);
                return Unit.INSTANCE;
            }
            int i4 = i2 + 31;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }
        int i6 = ((TossAccountHistoryActivity) r3).IAuthTabCallback_Parcel;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(final Date date, final boolean z) throws Throwable {
        int i = 2 % 2;
        if (z) {
            int i2 = extraCommand;
            int i3 = i2 + 113;
            isEngagementSignalsApiAvailable = i3 % 128;
            this.IAuthTabCallback_Parcel = i3 % 2 != 0 ? this.IAuthTabCallback_Parcel : this.IAuthTabCallback_Parcel + 1;
            int i4 = i2 + 1;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
        }
        final int i6 = this.IAuthTabCallback_Parcel;
        ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult(OperationHelperV3.FETCHING);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 29378), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        KeyBoardVisiblePoint keyBoardVisiblePoint = null;
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 29427), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), 24734 - View.MeasureSpec.makeMeasureSpec(0, 0), -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
            }
            FullScreenAd fullScreenAd = (FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj, null);
            KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.onPostMessage;
            if (keyBoardVisiblePoint2 == null) {
                int i7 = isEngagementSignalsApiAvailable + 103;
                extraCommand = i7 % 128;
                if (i7 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                keyBoardVisiblePoint = keyBoardVisiblePoint2;
            }
            String strOnNavigationEvent = keyBoardVisiblePoint.onNavigationEvent(":");
            String str = CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult().format(date);
            Intrinsics.checkNotNullExpressionValue(str, "");
            writeRaw writerawOnExtraCallbackWithResult = fullScreenAd.onExtraCallbackWithResult(strOnNavigationEvent, str, z);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new access100(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TossAccountHistoryActivity.onExtraCallbackWithResult(i6, this, date, z, (captureComplete) obj2);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda36
                @Override // o.deserializeFloat
                public final void accept(Object obj2) throws Throwable {
                    TossAccountHistoryActivity.IAuthTabCallback(394088661, new Object[]{function1, obj2}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -394088634);
                }
            };
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return (Unit) TossAccountHistoryActivity.IAuthTabCallback(-2051431366, new Object[]{Integer.valueOf(i6), this, (Throwable) obj2}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2051431394);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda38
                @Override // o.deserializeFloat
                public final void accept(Object obj2) {
                    TossAccountHistoryActivity.ICustomTabsCallback(function12, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final Unit onExtraCallback(ResultUtil resultUtil, SetDetectableSize setDetectableSize) throws Throwable {
        ToolkitManagerc.onExtraCallback onextracallback;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCommand + 91;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i5 = onNavigationEvent.onNavigationEvent[resultUtil.ordinal()];
        if (i5 == 1) {
            onextracallback = ToolkitManagerc.onExtraCallback.FILTER_NONE;
            i = extraCommand + Imgproc.COLOR_YUV2RGBA_YVYU;
        } else {
            if (i5 == 2) {
                onextracallback = ToolkitManagerc.onExtraCallback.FILTER_INCOME;
                String lowerCase = onextracallback.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                Object[] objArr = new Object[1];
                a(TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 4, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, new char[]{4, '\t', 0, 65525}, false, 258 - Color.blue(0), objArr);
                setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), lowerCase);
                return Unit.INSTANCE;
            }
            int i6 = isEngagementSignalsApiAvailable + 103;
            extraCommand = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 3 : i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            onextracallback = ToolkitManagerc.onExtraCallback.FILTER_EXPENSE;
            i = extraCommand + 65;
        }
        isEngagementSignalsApiAvailable = i % 128;
        int i7 = i % 2;
        String lowerCase2 = onextracallback.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        Object[] objArr2 = new Object[1];
        a(TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 4, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, new char[]{4, '\t', 0, 65525}, false, 258 - Color.blue(0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), lowerCase2);
        return Unit.INSTANCE;
    }

    public void onExtraCallbackWithResult(@NotNull final ResultUtil resultUtil) {
        ToolkitManagerc.onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 89;
        extraCommand = i2 % 128;
        onDisclaimerClick ondisclaimerclick = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resultUtil, "");
            IPostMessageServiceDefault().onNavigationEvent();
            IPostMessageService_Parcel().getItemCount();
            ondisclaimerclick.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(resultUtil, "");
        IPostMessageServiceDefault().onNavigationEvent();
        if (IPostMessageService_Parcel().getItemCount() >= 0) {
            IPostMessageService_Parcel().scrollToPositionWithOffset(0, 0);
        }
        AppLovinAdServiceImplc appLovinAdServiceImplcOnNavigationEvent = onNavigationEvent();
        int index = resultUtil.getIndex();
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
        if (keyBoardVisiblePoint == null) {
            int i3 = isEngagementSignalsApiAvailable + 59;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        appLovinAdServiceImplcOnNavigationEvent.IAuthTabCallback(index, keyBoardVisiblePoint.asInterface(), getScreenName());
        if (areNotificationsEnabled()) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1217551L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TossAccountHistoryActivity.onNavigationEvent(resultUtil, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            return;
        }
        ToolkitManagerc toolkitManagerc = ToolkitManagerc.onNavigationEvent;
        int i5 = onNavigationEvent.onNavigationEvent[resultUtil.ordinal()];
        if (i5 == 1) {
            onextracallback = ToolkitManagerc.onExtraCallback.FILTER_NONE;
        } else if (i5 == 2) {
            onextracallback = ToolkitManagerc.onExtraCallback.FILTER_INCOME;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = isEngagementSignalsApiAvailable + 17;
            extraCommand = i6 % 128;
            if (i6 % 2 == 0) {
                ToolkitManagerc.onExtraCallback onextracallback2 = ToolkitManagerc.onExtraCallback.FILTER_EXPENSE;
                throw null;
            }
            onextracallback = ToolkitManagerc.onExtraCallback.FILTER_EXPENSE;
        }
        ToolkitManagerc.onExtraCallback onextracallback3 = onextracallback;
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.onPostMessage;
        if (keyBoardVisiblePoint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint2 = null;
        }
        String strAsInterface = keyBoardVisiblePoint2.asInterface();
        onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
        if (ondisclaimerclick2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            ondisclaimerclick = ondisclaimerclick2;
        }
        ToolkitManagerc.onNavigationEvent(toolkitManagerc, null, null, null, onextracallback3, strAsInterface, ondisclaimerclick.extraCallbackWithResult(), getScreenName(), null, null, null, 903, null);
    }

    private static final Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, int i) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCommand = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            UST_GET_APPLICENSEINFO ust_get_applicenseinfoITrustedWebActivityCallbackDefault = tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault();
            ResultUtil.IAuthTabCallback iAuthTabCallback = ResultUtil.Companion;
            Object[] objArr = {tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault()};
            ust_get_applicenseinfoITrustedWebActivityCallbackDefault.onExtraCallback(iAuthTabCallback.onNavigationEvent((ResultUtil[]) UST_GET_APPLICENSEINFO.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, lt.40.onExtraCallbackWithResult(), 647286213, -647286209), i));
            Unit unit = Unit.INSTANCE;
            int i4 = isEngagementSignalsApiAvailable + 15;
            extraCommand = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        UST_GET_APPLICENSEINFO ust_get_applicenseinfoITrustedWebActivityCallbackDefault2 = tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault();
        ResultUtil.IAuthTabCallback iAuthTabCallback2 = ResultUtil.Companion;
        Object[] objArr2 = {tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault()};
        ust_get_applicenseinfoITrustedWebActivityCallbackDefault2.onExtraCallback(iAuthTabCallback2.onNavigationEvent((ResultUtil[]) UST_GET_APPLICENSEINFO.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr2, lt.40.onExtraCallbackWithResult(), 647286213, -647286209), i));
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void validateRelationship() {
        List<? extends CharSequence> listListOf;
        int i = 2 % 2;
        onDisclaimerClick ondisclaimerclick = this.onPostMessage;
        onDisclaimerClick ondisclaimerclick2 = null;
        if (ondisclaimerclick == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick = null;
        }
        if (ondisclaimerclick.ICustomTabsCallbackStubProxy()) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1221707L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        }
        onDisclaimerClick ondisclaimerclick3 = this.onPostMessage;
        if (ondisclaimerclick3 == null) {
            int i2 = extraCommand + 57;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            ondisclaimerclick2 = ondisclaimerclick3;
        }
        if (ondisclaimerclick2.ICustomTabsCallbackStubProxy()) {
            int i4 = isEngagementSignalsApiAvailable + 31;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{getString(viva.republica.toss.R.string.transfer_history), getString(viva.republica.toss.R.string.filter_teens_savingbox_deposit), getString(viva.republica.toss.R.string.filter_teens_savingbox_withdrawal)});
        } else {
            ResultUtil[] resultUtilArr = (ResultUtil[]) UST_GET_APPLICENSEINFO.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{ITrustedWebActivityCallbackDefault()}, lt.40.onExtraCallbackWithResult(), 647286213, -647286209);
            ArrayList arrayList = new ArrayList(resultUtilArr.length);
            int length = resultUtilArr.length;
            int i6 = extraCommand + 31;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                int i9 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
                extraCommand = i9 % 128;
                if (i9 % 2 == 0) {
                    arrayList.add(getString(resultUtilArr[i8].getTypeTextResId()));
                    i8 += 56;
                } else {
                    arrayList.add(getString(resultUtilArr[i8].getTypeTextResId()));
                    i8++;
                }
            }
            listListOf = arrayList;
        }
        BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback = new BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback(this);
        String string = getString(viva.republica.toss.R.string.app_account_transactions___1873c2b854);
        Intrinsics.checkNotNullExpressionValue(string, "");
        iAuthTabCallback.onExtraCallbackWithResult(string).onExtraCallback(true).onExtraCallbackWithResult(listListOf).IAuthTabCallback(ITrustedWebActivityCallbackDefault().onWarmupCompleted().getIndex()).onExtraCallback(new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) TossAccountHistoryActivity.IAuthTabCallback(-81674254, new Object[]{this.f$0, Integer.valueOf(((Integer) obj).intValue())}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 81674260);
            }
        }).access100();
        int i10 = isEngagementSignalsApiAvailable + 3;
        extraCommand = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 96 / 0;
        }
    }

    public void onGreatestScrollPercentageIncreased() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 31;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        IPostMessageServiceDefault().onNavigationEvent();
        ITrustedWebActivityService();
        onWarmupCompleted(ITrustedWebActivityCallbackDefault().asInterface(), true);
        onDisclaimerClick ondisclaimerclick = this.onPostMessage;
        Object obj = null;
        if (ondisclaimerclick == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick = null;
        }
        if (ondisclaimerclick.onMessageChannelReady()) {
            int i4 = extraCommand + 15;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback(this, false, 1, (Object) null);
            int i6 = isEngagementSignalsApiAvailable + 27;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = extraCommand + 55;
        isEngagementSignalsApiAvailable = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onRetry() {
        int i = 2 % 2;
        int i2 = extraCommand + 43;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityCallbackDefault().onTransact();
        int i4 = extraCommand + 37;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCommand + 9;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact.onWarmupCompleted(ITrustedWebActivityCallbackDefault().IAuthTabCallback());
        ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onWarmupCompleted.setRefreshing(ITrustedWebActivityCallbackDefault().IAuthTabCallbackDefault());
        int i4 = extraCommand + 33;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(@NotNull getInitializationType getinitializationtype) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getinitializationtype, "");
        TrackLog trackLogOnNavigationEvent = getinitializationtype.onNavigationEvent();
        if (trackLogOnNavigationEvent != null) {
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            ((Boolean) downloadZip.onWarmupCompleted(iOnNavigationEvent2, 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, new Object[]{trackLogOnNavigationEvent}, iOnNavigationEvent3)).booleanValue();
            int i2 = extraCommand + 111;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
        }
        SessionTrackerb.IAuthTabCallback(ICustomTabsServiceDefault(), this, ((startOperationBatch) getinitializationtype.onExtraCallbackWithResult().get(0)).onExtraCallbackWithResult(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = isEngagementSignalsApiAvailable + 85;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void IEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 25;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
        Object[] objArr = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022713).substring(0, 23).length() - 367073470, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 226), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 535101476, (short) ((-32) - Gravity.getAbsoluteGravity(0, 0)), 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsServiceDefault, this, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = extraCommand + 101;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeTypedList() throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 17;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
        Object[] objArr = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132032300).substring(0, 10).codePointAt(7) - 367073544, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022768).substring(0, 7).length() - 132), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026431).substring(0, 1).codePointAt(0) + 535101292, (short) ((-32) - ((Process.getThreadPriority(0) + 20) >> 6)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 14, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsServiceDefault, this, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = extraCommand + 123;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
        onDisclaimerClick ondisclaimerclick = null;
        if (keyBoardVisiblePoint == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        if (keyBoardVisiblePoint.access000()) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1264713L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        } else {
            onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
            if (ondisclaimerclick2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i2 = isEngagementSignalsApiAvailable + 23;
                extraCommand = i2 % 128;
                int i3 = i2 % 2;
            } else {
                ondisclaimerclick = ondisclaimerclick2;
            }
            if (ondisclaimerclick.ICustomTabsCallbackStubProxy()) {
                int i4 = extraCommand + 105;
                isEngagementSignalsApiAvailable = i4 % 128;
                if (i4 % 2 != 0) {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1264723L, false, (String) null, (Map) null, (Function1) null, 44, (Object) null);
                } else {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1264723L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                }
            }
        }
        SessionTrackerb.IAuthTabCallback(ICustomTabsServiceDefault(), this, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            bundle.putString("accountId", this.onMessageChannelReady);
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            bundle.putString("accountId", this.onMessageChannelReady);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean bg_() throws Throwable {
        int i = 2 % 2;
        int iWriteTypedObject = PlayerErrorCode.writeTypedObject();
        if (14 <= iWriteTypedObject) {
            int i2 = isEngagementSignalsApiAvailable + 111;
            extraCommand = i2 % 128;
            if (i2 % 2 != 0 ? iWriteTypedObject < 17 : iWriteTypedObject < 38) {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer = addPolicy.RemoteActionCompatParcelizer();
                Object[] objArr = new Object[1];
                c((-367073600) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((-126) - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 535101475, (short) ((-16777342) - Color.rgb(0, 0, 0)), '\'' - AndroidCharacter.getMirror('0'), objArr);
                if (textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer.onExtraCallback(((String) objArr[0]).intern(), false)) {
                    int i3 = extraCommand + 47;
                    isEngagementSignalsApiAvailable = i3 % 128;
                    if (i3 % 2 == 0 ? !addPolicy.RemoteActionCompatParcelizer().onExtraCallback("KEY_SHOWN_HOME_TOSS_MONEY_HIGHLIGHT", false) : !addPolicy.RemoteActionCompatParcelizer().onExtraCallback("KEY_SHOWN_HOME_TOSS_MONEY_HIGHLIGHT", true)) {
                        SessionTrackerb sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
                        String str = this.onMessageChannelReady;
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr2 = new Object[1];
                        c((-367073315) - View.MeasureSpec.getSize(0), (byte) (126 - ((byte) KeyEvent.getModifierMetaStateMask())), 535101475 - View.getDefaultSize(0, 0), (short) (51 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), View.MeasureSpec.getMode(0) - 23, objArr2);
                        sb.append(((String) objArr2[0]).intern());
                        sb.append(str);
                        sb.append("&highlight=true");
                        SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsServiceDefault, this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                        addPolicy.RemoteActionCompatParcelizer().onNavigationEvent("KEY_SHOWN_HOME_TOSS_MONEY_HIGHLIGHT", true);
                    }
                }
            }
        }
        return super.bg_();
    }

    private final void write() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        this.getInterfaceDescriptor.onExtraCallback((getTimestampBytes<Boolean>) Boolean.TRUE);
        int i4 = isEngagementSignalsApiAvailable + 111;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ITrustedWebActivityService() {
        int i = 2 % 2;
        setMessageBytes.onExtraCallbackWithResult(PageShowPoint.Companion.onExtraCallback(this.onMessageChannelReady), new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onTransact((Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onExtraCallback((onDisclaimerClick) obj);
            }
        });
        int i2 = isEngagementSignalsApiAvailable + 21;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    private static final Unit onNavigationEvent(onDisclaimerClick ondisclaimerclick) {
        int i = 2 % 2;
        int i2 = extraCommand + 37;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
        DERConstructedSet.onNavigationEvent(CollectionsKt__CollectionsJVMKt.listOf(ondisclaimerclick));
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 25;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStubProxy(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 83;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        int i3 = 36 / 0;
        return Unit.INSTANCE;
    }

    private static final void onActivityResized(TossAccountHistoryActivity tossAccountHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 89;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        tossAccountHistoryActivity.notifyNotificationWithChannel();
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 9;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 49;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        int i5 = extraCommand + 37;
        isEngagementSignalsApiAvailable = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getNativeModuleIteratorReactAndroid_release $displayCardStyle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$displayCardStyle = getnativemoduleiteratorreactandroid_release;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TossAccountHistoryActivity.this.new access000(this.$displayCardStyle, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((access000) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                Integer numOnNavigationEvent = access14000.onNavigationEvent(16);
                this.label = 1;
                int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                obj = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "teens.ussCard.issuance.maxAge", numOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                if (obj == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            TossAccountHistoryActivity.IAuthTabCallback_Parcel(TossAccountHistoryActivity.this).IAuthTabCallback(this.$displayCardStyle);
            Object[] objArr = {TossAccountHistoryActivity.IAuthTabCallback_Parcel(TossAccountHistoryActivity.this), Integer.valueOf(iIntValue)};
            UST_GET_APPLICENSEINFO.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, lt.40.onExtraCallbackWithResult(), -521236882, 521236888);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[PHI: r3
      0x004d: PHI (r3v5 o.ReactInstanceManagerExternalSyntheticLambda6) = (r3v4 o.ReactInstanceManagerExternalSyntheticLambda6), (r3v7 o.ReactInstanceManagerExternalSyntheticLambda6) binds: [B:15:0x004b, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, DebugCorePackageExternalSyntheticLambda1 debugCorePackageExternalSyntheticLambda1) {
        getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_releaseOnExtraCallback;
        ReactInstanceManagerExternalSyntheticLambda6 reactInstanceManagerExternalSyntheticLambda6OnNavigationEvent;
        getNativeProtocolAudience getnativeprotocolaudienceIAuthTabCallback;
        int i = 2 % 2;
        if (debugCorePackageExternalSyntheticLambda1 != null && (getnativeprotocolaudienceIAuthTabCallback = debugCorePackageExternalSyntheticLambda1.IAuthTabCallback()) != null) {
            getnativemoduleiteratorreactandroid_releaseOnExtraCallback = (getNativeModuleIteratorReactAndroid_release) getNativeProtocolAudience.onExtraCallback(-733752186, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), 733752186, new Object[]{getnativeprotocolaudienceIAuthTabCallback});
            if (getnativemoduleiteratorreactandroid_releaseOnExtraCallback == null) {
            }
        } else if (debugCorePackageExternalSyntheticLambda1 != null) {
            int i2 = isEngagementSignalsApiAvailable + 87;
            extraCommand = i2 % 128;
            if (i2 % 2 == 0) {
                reactInstanceManagerExternalSyntheticLambda6OnNavigationEvent = debugCorePackageExternalSyntheticLambda1.onNavigationEvent();
                int i3 = 87 / 0;
                if (reactInstanceManagerExternalSyntheticLambda6OnNavigationEvent != null) {
                    getnativemoduleiteratorreactandroid_releaseOnExtraCallback = reactInstanceManagerExternalSyntheticLambda6OnNavigationEvent.onExtraCallback();
                    int i4 = isEngagementSignalsApiAvailable + 103;
                    extraCommand = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    getnativemoduleiteratorreactandroid_releaseOnExtraCallback = null;
                }
            } else {
                reactInstanceManagerExternalSyntheticLambda6OnNavigationEvent = debugCorePackageExternalSyntheticLambda1.onNavigationEvent();
                if (reactInstanceManagerExternalSyntheticLambda6OnNavigationEvent != null) {
                }
            }
        }
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tossAccountHistoryActivity), null, null, tossAccountHistoryActivity.new access000(getnativemoduleiteratorreactandroid_releaseOnExtraCallback, null), 3, null);
        if (getnativemoduleiteratorreactandroid_releaseOnExtraCallback != null) {
            int i6 = extraCommand + 39;
            isEngagementSignalsApiAvailable = i6 % 128;
            if (i6 % 2 != 0) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1232817L, false, (String) null, (Map) null, (Function1) null, 25, (Object) null);
            } else {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1232817L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            }
        }
        tossAccountHistoryActivity.onMinimized = debugCorePackageExternalSyntheticLambda1.IAuthTabCallback();
        return Unit.INSTANCE;
    }

    private static final void ICustomTabsService_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 91;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 63;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit extraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCommand + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getSmallIconBitmap() {
        int i = 2 % 2;
        writeRaw writerawOnNavigationEvent = AdSettingsIntegrationErrorMode.onNavigationEvent.onActivityResized().onNavigationEvent();
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback((deserializeUri) new IAuthTabCallbackStubProxy(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onWarmupCompleted((deserializeDecimalCollection) new TossAccountHistoryActivity$.ExternalSyntheticLambda83(this)).onNavigationEvent(new TossAccountHistoryActivity$.ExternalSyntheticLambda85(new TossAccountHistoryActivity$.ExternalSyntheticLambda84(this)), new TossAccountHistoryActivity$.ExternalSyntheticLambda87(new TossAccountHistoryActivity$.ExternalSyntheticLambda86()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = extraCommand + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 51;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, 4 - View.resolveSize(0, 0), new char[]{4, '\t', 0, 65525}, false, Color.alpha(0) + Imgcodecs.IMWRITE_TIFF_YDPI, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "normal");
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 41;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, Pair pair) throws Throwable {
        CERT_GetAuthorityKeyIdentifierInfo.onExtraCallback onextracallback;
        int i = 2 % 2;
        ReactInstanceManagerExternalSyntheticLambda0 reactInstanceManagerExternalSyntheticLambda0 = (ReactInstanceManagerExternalSyntheticLambda0) pair.onExtraCallbackWithResult();
        ReactInstanceEventListener reactInstanceEventListener = (ReactInstanceEventListener) pair.IAuthTabCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer = addPolicy.RemoteActionCompatParcelizer();
        Object[] objArr = new Object[1];
        c(TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) - 367073747, (byte) (101 - ExpandableListView.getPackedPositionType(0L)), 535101475 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), (short) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 85), View.MeasureSpec.makeMeasureSpec(0, 0) - 12, objArr);
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer.onExtraCallback(((String) objArr[0]).intern(), false);
        handleCxxError handlecxxerrorIAuthTabCallback = reactInstanceManagerExternalSyntheticLambda0.IAuthTabCallback();
        if ((handlecxxerrorIAuthTabCallback != null && handlecxxerrorIAuthTabCallback.onNavigationEvent()) || reactInstanceEventListener.IAuthTabCallback()) {
            UST_GET_APPLICENSEINFO ust_get_applicenseinfoITrustedWebActivityCallbackDefault = tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault();
            if (reactInstanceEventListener.IAuthTabCallbackStub()) {
                int i2 = extraCommand + 67;
                isEngagementSignalsApiAvailable = i2 % 128;
                int i3 = i2 % 2;
                onextracallback = CERT_GetAuthorityKeyIdentifierInfo.onExtraCallback.REACHED;
            } else {
                onextracallback = CERT_GetAuthorityKeyIdentifierInfo.onExtraCallback.WARNING;
            }
            UST_GET_APPLICENSEINFO.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{ust_get_applicenseinfoITrustedWebActivityCallbackDefault, onextracallback}, lt.40.onExtraCallbackWithResult(), -1254628075, 1254628077);
        } else if (zOnExtraCallback) {
            tossAccountHistoryActivity.onExtraCallback(UST_SET_ANDROIDINFO.onExtraCallback.TOSS_MONEY_DETAIL_20240527);
        } else {
            tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult(Long.valueOf(reactInstanceEventListener.onWarmupCompleted()));
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1246677L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda51
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TossAccountHistoryActivity.onNavigationEvent((SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer2 = addPolicy.RemoteActionCompatParcelizer();
            Object[] objArr2 = new Object[1];
            c((-367073749) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (ExpandableListView.getPackedPositionGroup(0L) + 101), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 535101475, (short) ((-86) - ImageFormat.getBitsPerPixel(0)), (-16777228) - Color.rgb(0, 0, 0), objArr2);
            textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer2.onNavigationEvent(((String) objArr2[0]).intern(), true);
        }
        handleCxxError handlecxxerrorIAuthTabCallback2 = reactInstanceManagerExternalSyntheticLambda0.IAuthTabCallback();
        if (handlecxxerrorIAuthTabCallback2 != null) {
            tossAccountHistoryActivity.extraCallbackWithResult = handlecxxerrorIAuthTabCallback2;
            tossAccountHistoryActivity.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult(handlecxxerrorIAuthTabCallback2);
            tossAccountHistoryActivity.AudioAttributesImplApi26Parcelizer();
        }
        tossAccountHistoryActivity.write();
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 13;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notifyNotificationWithChannel() throws Throwable {
        int i = 2 % 2;
        read();
        setTagBytes settagbytes = setTagBytes.onNavigationEvent;
        AdSettingsIntegrationErrorMode adSettingsIntegrationErrorMode = AdSettingsIntegrationErrorMode.onNavigationEvent;
        writeRaw writerawIAuthTabCallbackStub = adSettingsIntegrationErrorMode.onActivityLayout().IAuthTabCallbackStub();
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawIAuthTabCallbackStub.IAuthTabCallback(new IAuthTabCallback_Parcel(mapConverterOnExtraCallback, null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawAsInterface = adSettingsIntegrationErrorMode.onActivityLayout().asInterface();
        MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, "");
        writeRaw writerawIAuthTabCallback2 = writerawAsInterface.IAuthTabCallback(new getInterfaceDescriptor(mapConverterOnExtraCallback2, null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        writeRaw writerawIAuthTabCallback3 = settagbytes.IAuthTabCallback(writerawIAuthTabCallback, writerawIAuthTabCallback2).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback3, "");
        writeRaw writerawIAuthTabCallback4 = writerawIAuthTabCallback3.IAuthTabCallback(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback4, "");
        onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback4, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onExtraCallback(this.f$0, (Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onNavigationEvent(this.f$0, (Pair) obj);
            }
        }));
        int i2 = isEngagementSignalsApiAvailable + 95;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onMessageChannelReady(TossAccountHistoryActivity tossAccountHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 41;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbICustomTabsServiceDefault = tossAccountHistoryActivity.ICustomTabsServiceDefault();
        handleCxxError handlecxxerror = tossAccountHistoryActivity.extraCallbackWithResult;
        String strOnExtraCallbackWithResult = null;
        if (handlecxxerror != null) {
            int i4 = isEngagementSignalsApiAvailable + 1;
            extraCommand = i4 % 128;
            if (i4 % 2 == 0) {
                handlecxxerror.onExtraCallbackWithResult();
                throw null;
            }
            strOnExtraCallbackWithResult = handlecxxerror.onExtraCallbackWithResult();
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 88, 52 - Color.argb(0, 0, 0, 0), new char[]{'\b', 65481, 65533, 65535, 65535, 11, 17, '\n', 16, 65481, 65535, 4, 65533, 14, 3, 5, '\n', 3, 65499, 14, 1, 2, 1, 14, 14, 1, 14, 65497, 16, 11, 15, 15, '\t', 11, '\n', 1, 21, 65474, 65533, 65535, 65535, 11, 17, '\n', 16, 65514, 17, '\t', 65534, 1, 14, 65497, 15, 17, '\f', 1, 14, 16, 11, 15, 15, 65494, 65483, 65483, 16, 1, 1, '\n', 15, 65483, 11, '\n', 65534, 11, 65533, 14, 0, 5, '\n', 3, 65483, 18, 5, 14, 16, 17, 65533}, false, Color.green(0) + 246, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnExtraCallbackWithResult);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsServiceDefault, tossAccountHistoryActivity, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i5 = isEngagementSignalsApiAvailable + 103;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void ICustomTabsServiceStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCommand + 63;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void AudioAttributesImplApi26Parcelizer() throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 11;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer = addPolicy.RemoteActionCompatParcelizer();
        Object[] objArr = new Object[1];
        c(ExpandableListView.getPackedPositionType(0L) - 367073601, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 126), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 535101475, (short) ((-127) - ((byte) KeyEvent.getModifierMetaStateMask())), (-10) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr);
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer.onExtraCallback(((String) objArr[0]).intern(), false);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer2 = addPolicy.RemoteActionCompatParcelizer();
        Object[] objArr2 = new Object[1];
        c((-367073565) - ImageFormat.getBitsPerPixel(0), (byte) ((-40) - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 535101475, (short) (KeyEvent.getDeadChar(0, 0) + 109), (-6) - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), objArr2);
        boolean zOnExtraCallback2 = textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer2.onExtraCallback(((String) objArr2[0]).intern(), false);
        int iWriteTypedObject = PlayerErrorCode.writeTypedObject();
        if (14 <= iWriteTypedObject && iWriteTypedObject < 17) {
            int i4 = extraCommand + 17;
            int i5 = i4 % 128;
            isEngagementSignalsApiAvailable = i5;
            int i6 = i4 % 2;
            if (!zOnExtraCallback) {
                int i7 = i5 + 77;
                extraCommand = i7 % 128;
                int i8 = i7 % 2;
                onMessageChannelReady(this);
                SessionTrackerb sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
                handleCxxError handlecxxerror = this.extraCallbackWithResult;
                String strOnExtraCallbackWithResult = handlecxxerror != null ? handlecxxerror.onExtraCallbackWithResult() : null;
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[1];
                c((-367073523) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 63), 535101474 - ((byte) KeyEvent.getModifierMetaStateMask()), (short) ((ViewConfiguration.getTapTimeout() >> 16) - 53), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(strOnExtraCallbackWithResult);
                SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsServiceDefault, this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                return;
            }
        }
        if (zOnExtraCallback2) {
            return;
        }
        writeRaw<Boolean> writerawITrustedWebActivityCallbackStubProxy = ITrustedWebActivityCallbackStubProxy();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda91
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) TossAccountHistoryActivity.IAuthTabCallback(2030511846, new Object[]{this.f$0, (Boolean) obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2030511836);
            }
        };
        deserializeFloat<? super Boolean> deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda92
            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                TossAccountHistoryActivity.onWarmupCompleted(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda93
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.asBinder((Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawITrustedWebActivityCallbackStubProxy.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda94
            @Override // o.deserializeFloat
            public final void accept(Object obj) throws Throwable {
                TossAccountHistoryActivity.IAuthTabCallback(-1052877116, new Object[]{function12, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1052877121);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    private static final Unit ICustomTabsCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 55;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 83;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void IEngagementSignalsCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 25;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
    }

    private static final Unit onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, Boolean bool) throws Throwable {
        int i = 2 % 2;
        if (bool.booleanValue()) {
            int i2 = isEngagementSignalsApiAvailable + 109;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            onMessageChannelReady(tossAccountHistoryActivity);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 45;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final writeRaw<Boolean> ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        writeRaw writerawIAuthTabCallback = isMixedAudience.onExtraCallback.onExtraCallback().IAuthTabCallback(NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Boolean) TossAccountHistoryActivity.IAuthTabCallback(219142366, new Object[]{(Long) obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -219142362);
            }
        };
        writeRaw<Boolean> writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda31
            @Override // o.deserializeIntNullableCollection
            public final Object apply(Object obj) {
                return TossAccountHistoryActivity.extraCallback(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        int i2 = isEngagementSignalsApiAvailable + 25;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return writerawOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Boolean onExtraCallbackWithResult(Long l) {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCommand + 113;
        isEngagementSignalsApiAvailable = i3 % 128;
        boolean z = false;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(l, "");
            int i4 = 52 / 0;
            if (l.longValue() <= 30) {
                z = true;
                i = isEngagementSignalsApiAvailable + 1;
                extraCommand = i % 128;
            } else {
                i = extraCommand + 113;
                isEngagementSignalsApiAvailable = i % 128;
            }
        } else {
            Intrinsics.checkNotNullParameter(l, "");
            if (l.longValue() <= 30) {
            }
        }
        int i5 = i % 2;
        return Boolean.valueOf(z);
    }

    private static final Boolean setEngagementSignalsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i4 = isEngagementSignalsApiAvailable + 31;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean ITrustedWebActivityService_Parcel() throws Throwable {
        int i = 2 % 2;
        Date dateOnWarmupCompleted = zzae.onWarmupCompleted(setEngagementSignalsCallback(), CommonModule_closeView.onNavigationEvent.parse(PlayerErrorCode.extraCallback()), 19);
        if (PlayerErrorCode.writeTypedObject() == 18) {
            long jOnWarmupCompleted = commonTestFlag.onExtraCallback.onWarmupCompleted(dateOnWarmupCompleted, setEngagementSignalsCallback().asBinder());
            if (0 <= jOnWarmupCompleted && jOnWarmupCompleted < 31) {
                KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
                onDisclaimerClick ondisclaimerclick = null;
                if (keyBoardVisiblePoint == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    keyBoardVisiblePoint = null;
                }
                if (!keyBoardVisiblePoint.access000()) {
                    onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
                    if (ondisclaimerclick2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    } else {
                        ondisclaimerclick = ondisclaimerclick2;
                    }
                    if (ondisclaimerclick.ICustomTabsCallbackStubProxy()) {
                        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1264721L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                    }
                } else {
                    int i2 = isEngagementSignalsApiAvailable + 83;
                    extraCommand = i2 % 128;
                    if (i2 % 2 == 0) {
                        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1264711L, false, (String) null, (Map) null, (Function1) null, 15, (Object) null);
                    } else {
                        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1264711L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                    }
                }
                UST_GET_APPLICENSEINFO ust_get_applicenseinfoITrustedWebActivityCallbackDefault = ITrustedWebActivityCallbackDefault();
                String string = getString(viva.republica.toss.R.string.app_view_account_history_tossmoney_fade_out_banner___a3a016d48e);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Object[] objArr = new Object[1];
                c((-367073676) - KeyEvent.getDeadChar(0, 0), (byte) ((-116) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Color.argb(0, 0, 0, 0) + 535101475, (short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 128), (ViewConfiguration.getWindowTouchSlop() >> 8) + 29, objArr);
                ust_get_applicenseinfoITrustedWebActivityCallbackDefault.onNavigationEvent(string, ((String) objArr[0]).intern());
                int i3 = isEngagementSignalsApiAvailable + 31;
                extraCommand = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 92 / 0;
                }
                return true;
            }
        }
        int i5 = isEngagementSignalsApiAvailable + 71;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return false;
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        readTypedObject(access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TossAccountHistoryActivity.this.new readTypedObject(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((readTypedObject) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                this.label = 1;
                Object[] objArr = {lifecyclesKtawaitStarted21, "teens.tossmoney.noticeBanner.text", _UrlKt.FRAGMENT_ENCODE_SET, this};
                int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                obj = LifecyclesKtawaitStarted21.onExtraCallback(objArr, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                if (obj != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
                String str2 = (String) obj;
                if (!StringsKt__StringsKt.isBlank(str)) {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1264711L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                    TossAccountHistoryActivity.IAuthTabCallback_Parcel(TossAccountHistoryActivity.this).onNavigationEvent(str, str2);
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            String str3 = (String) obj;
            LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted212 = LifecyclesKtawaitStarted21.IAuthTabCallback;
            this.L$0 = str3;
            this.label = 2;
            Object[] objArr2 = {lifecyclesKtawaitStarted212, "teens.tossmoney.noticeBanner.landingUrl", _UrlKt.FRAGMENT_ENCODE_SET, this};
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            Object objOnExtraCallback2 = LifecyclesKtawaitStarted21.onExtraCallback(objArr2, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback2);
            if (objOnExtraCallback2 != objOnExtraCallback) {
                str = str3;
                obj = objOnExtraCallback2;
                String str22 = (String) obj;
                if (!StringsKt__StringsKt.isBlank(str)) {
                }
                return Unit.INSTANCE;
            }
            return objOnExtraCallback;
        }
    }

    private final void read() throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 1;
        extraCommand = i2 % 128;
        if (i2 % 2 != 0) {
            if (!ITrustedWebActivityService_Parcel()) {
                onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new readTypedObject(null), 3, null);
            }
            int i3 = extraCommand + 9;
            isEngagementSignalsApiAvailable = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        ITrustedWebActivityService_Parcel();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 53;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        c(View.MeasureSpec.makeMeasureSpec(0, 0) - 367073714, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 11), 535101476 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), (short) ((-42) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), KeyEvent.normalizeMetaState(0) - 42, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), tossAccountHistoryActivity.getString(viva.republica.toss.R.string.send));
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 69;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        if (!(keyBoardVisiblePoint instanceof onDisclaimerClick)) {
            int i2 = extraCommand + 93;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        String strOnExtraCallbackWithResult = keyBoardVisiblePoint.onExtraCallbackWithResult();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        c((-367073396) - Color.blue(0), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 30), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022786).substring(0, 42).codePointAt(10) + 535101443, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 54), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 132, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnExtraCallbackWithResult);
        sb.append("&accountTypeFrom=toss&origin=accnt_detail&justClose=true");
        SessionTrackerb.IAuthTabCallback(ICustomTabsServiceDefault(), this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        onDisclaimerClick ondisclaimerclick = this.onPostMessage;
        if (ondisclaimerclick == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick = null;
        }
        if (ondisclaimerclick.ICustomTabsCallbackDefault()) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1007777L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        } else if (addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1217539L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TossAccountHistoryActivity.IAuthTabCallbackStub(this.f$0, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
        } else {
            onNavigationEvent().onExtraCallback(getScreenName(), access8000.IAuthTabCallbackStubProxy(getWrite.IAuthTabCallback("TOSSB", "Y")));
        }
        ToolkitManagerc toolkitManagerc = ToolkitManagerc.onNavigationEvent;
        ToolkitManagerc.onExtraCallback onextracallback = ToolkitManagerc.onExtraCallback.TRANSFER;
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.onPostMessage;
        if (keyBoardVisiblePoint2 == null) {
            int i4 = extraCommand + 21;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint2 = null;
        }
        String strAsInterface = keyBoardVisiblePoint2.asInterface();
        onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
        if (ondisclaimerclick2 == null) {
            int i6 = extraCommand + 29;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick2 = null;
        }
        ToolkitManagerc.onNavigationEvent(toolkitManagerc, null, null, null, onextracallback, strAsInterface, ondisclaimerclick2.extraCallbackWithResult(), getScreenName(), null, null, null, 903, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit access100(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 93;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        c((-367073714) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 11), Drawable.resolveOpacity(0, 0) + 535101476, (short) ((-42) - KeyEvent.getDeadChar(0, 0)), (-42) - Drawable.resolveOpacity(0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), tossAccountHistoryActivity.getString(viva.republica.toss.R.string.app_view_toss_account_history_header___ca736464b9));
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 95;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ICustomTabsServiceStubProxy() throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1217539L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.asBinder(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        SessionTrackerb sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
        Object[] objArr = new Object[1];
        a(65 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 99, new char[]{65535, 19, '\r', 15, '\n', 65535, '\f', 14, '\t', '\r', '\r', 65492, 65481, 65481, 14, 65535, 65535, '\b', '\r', 65481, 65532, '\t', 14, 14, '\t', 7, '\r', 2, 65535, 65535, 14, 65481, 14, '\t', '\r', '\r', 7, '\t', '\b', 65535, 19, 65479, 65533, 2, 65531, '\f', 1, 65535, 65497, '\f', 65535, 0, 65535, '\f', '\f', 65535, '\f', 65495, 14, '\t', '\r', '\r', 7, '\t', '\b'}, false, KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 248, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsServiceDefault, this, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = extraCommand + 107;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void access200() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 5;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1232763L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        if (this.onMinimized != null) {
            int i4 = isEngagementSignalsApiAvailable + 9;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            SessionTrackerb sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
            Object[] objArr = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(viva.republica.toss.R.string.app_activity_credit_management_refund_info___ac62d6fb5d).substring(1, 2).length() - 367073369, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 2), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(viva.republica.toss.R.string.guardian_pending_certify_remaining_time_hours).substring(0, 2).codePointAt(0) + 535101438, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 71), 6 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), objArr);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsServiceDefault, this, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            return;
        }
        SessionTrackerb sessionTrackerbICustomTabsServiceDefault2 = ICustomTabsServiceDefault();
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 15, 12 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), new char[]{17, 65484, 65484, 65495, 16, 16, '\f', 17, 15, 2, '\r', 18, 16, 22, 2, 11, '\f', '\n', 16, 16, '\f', 17, 65498, 15, 2, 15, 15, 2, 3, 2, 15, 65475, 65490, 65498, 17, 18, '\f', 2, '\n', 6, 17, 65500, 1, 15, 65534, 0, 65484, 2, 4, 1, 6, 15, 65535, 65484, 16, 11, 2, 2, 17, 65484, 65484, 65495, 16, 16, '\f', 17, 2, 0, 6, 19, 15, 2, 16, 65498, '\t', 15, 18, 65500, 65535, 2, 20, 65482, 2, 0, 6, 19, 15, 2, 16, 65482, 17, 11, 2, 15, 65534, '\r', 16, 11, 65534, 15}, true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 245, objArr2);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsServiceDefault2, this, ((String) objArr2[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWarmupCompleted(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1217537L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback(this, str);
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = ((CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956)).onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnExtraCallbackWithResult, "");
        String string = getString(viva.republica.toss.R.string.app_account_detail___529f2d1063);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsToastV1.onNavigationEvent onNavigationEvent2 = TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent((View) constraintLayoutOnExtraCallbackWithResult, (CharSequence) string), viva.republica.toss.R.drawable.icn_success_color, 0, 2, (Object) null);
        if (Build.VERSION.SDK_INT > 32) {
            onNavigationEvent2.onExtraCallback();
            int i2 = extraCommand + 19;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = extraCommand + 69;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            onNavigationEvent2.onNavigationEvent();
        } else {
            onNavigationEvent2.onNavigationEvent();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = extraCommand + 7;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        ToolkitManagerb.IAuthTabCallback.onWarmupCompleted(this, charSequence.toString());
        int i4 = extraCommand + 51;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 51;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("view", tossAccountHistoryActivity.getScreenName());
        setDetectableSize.onExtraCallback("category", "dashboard");
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 101;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        IAuthTabCallback(-221356077, new Object[]{tossAccountHistoryActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult()}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 221356090);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 81;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(final TossAccountHistoryActivity tossAccountHistoryActivity, final TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(viva.republica.toss.R.string.account_register_required));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = tossAccountHistoryActivity.getString(viva.republica.toss.R.string.continue_register_account_question_format);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{tossAccountHistoryActivity.getString(viva.republica.toss.R.string.toss_account_charge)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2115179004, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -2115178997, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, viva.republica.toss.R.string.keep_continue, null, false, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.IAuthTabCallback(this.f$0, tabBarInfoQueryPointOnTabBarInfoQueryListener, (DialogInterface) obj);
            }
        }, 6, null)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = isEngagementSignalsApiAvailable + 123;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStub(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 23;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        tossAccountHistoryActivity.startActivity(SelectBankActivity.onExtraCallbackWithResult.onExtraCallbackWithResult(SelectBankActivity.Companion, tossAccountHistoryActivity, (ReactQueueConfigurationImplCompanion) null, "ONLINE_ACCOUNT_DETAIL", (String) null, (String) null, (String) null, (Integer[]) null, (String) null, (getPadBits) null, (String) null, (String) null, (String) null, false, 8186, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 69;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(final TossAccountHistoryActivity tossAccountHistoryActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(viva.republica.toss.R.string.account_register_required));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(viva.republica.toss.R.string.need_account_register_for_charge));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallback(new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onNavigationEvent(this.f$0, (DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = isEngagementSignalsApiAvailable + 87;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ICustomTabsServiceStub() throws Throwable {
        String strOnExtraCallbackWithResult;
        int i;
        int i2 = 2 % 2;
        DERConstructedSet dERConstructedSet = DERConstructedSet.onNavigationEvent;
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
        onDisclaimerClick ondisclaimerclick = null;
        if (keyBoardVisiblePoint == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        if (dERConstructedSet.onNavigationEvent(keyBoardVisiblePoint)) {
            int i3 = extraCommand + 95;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.onPostMessage;
            if (keyBoardVisiblePoint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                keyBoardVisiblePoint2 = null;
            }
            if (keyBoardVisiblePoint2.access000()) {
                i = viva.republica.toss.R.string.app_account_detail___3855010c3f;
                int i4 = isEngagementSignalsApiAvailable + 49;
                extraCommand = i4 % 128;
                int i5 = i4 % 2;
            } else {
                i = viva.republica.toss.R.string.deposit_transfer;
                int i6 = isEngagementSignalsApiAvailable + 1;
                extraCommand = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 3;
                }
            }
            String string = getString(i);
            Intrinsics.checkNotNull(string);
            SessionTrackerb sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
            KeyBoardVisiblePoint keyBoardVisiblePoint3 = this.onPostMessage;
            if (keyBoardVisiblePoint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                keyBoardVisiblePoint3 = null;
            }
            String strOnExtraCallbackWithResult2 = keyBoardVisiblePoint3.onExtraCallbackWithResult();
            String strIAuthTabCallback = mergeParams.IAuthTabCallback(string, (String) null, 1, (Object) null);
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132021129).substring(0, 1).codePointAt(0) - 14, (-16777198) - Color.rgb(0, 0, 0), new char[]{18, '\r', 65515, 23, 65522, '\r', 17, 17, 65503, 1, 1, '\r', 19, '\f', 18, 65511, 2, 65499, 17, 19, 14, 3, 16, 18, '\r', 17, 17, 65496, 65485, 65485, 17, 3, '\f', 2, 65501}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022878).substring(0, 8).codePointAt(7) + 130, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strOnExtraCallbackWithResult2);
            sb.append("&title=");
            sb.append(strIAuthTabCallback);
            sb.append("&origin=accnt_detail");
            SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbICustomTabsServiceDefault, this, sb.toString(), 10120, (Bundle) null, 8, (Object) null);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onExtraCallbackWithResult(), false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TossAccountHistoryActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
                }
            }, 30, (Object) null);
        } else {
            final TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = PageShowPoint.Companion.onWarmupCompleted();
            if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null) {
                int i8 = isEngagementSignalsApiAvailable + 105;
                extraCommand = i8 % 128;
                int i9 = i8 % 2;
                strOnExtraCallbackWithResult = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted.onExtraCallbackWithResult();
            } else {
                strOnExtraCallbackWithResult = null;
            }
            if (strOnExtraCallbackWithResult != null) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TossAccountHistoryActivity.onExtraCallback(this.f$0, tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted, (CommonModule_setLeftEdgeTouchEnabled) obj);
                    }
                });
                int i10 = extraCommand + 59;
                isEngagementSignalsApiAvailable = i10 % 128;
                int i11 = i10 % 2;
            } else {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TossAccountHistoryActivity.IAuthTabCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                    }
                });
            }
        }
        onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
        if (ondisclaimerclick2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick2 = null;
        }
        if (ondisclaimerclick2.ICustomTabsCallbackDefault()) {
            int i12 = extraCommand + 53;
            isEngagementSignalsApiAvailable = i12 % 128;
            if (i12 % 2 != 0) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1007775L, false, (String) null, (Map) null, (Function1) null, 106, (Object) null);
            } else {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1007775L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            }
        }
        ToolkitManagerc toolkitManagerc = ToolkitManagerc.onNavigationEvent;
        ToolkitManagerc.onExtraCallback onextracallback = ToolkitManagerc.onExtraCallback.CHARGE;
        KeyBoardVisiblePoint keyBoardVisiblePoint4 = this.onPostMessage;
        if (keyBoardVisiblePoint4 == null) {
            int i13 = isEngagementSignalsApiAvailable + 39;
            extraCommand = i13 % 128;
            if (i13 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i14 = extraCommand + 7;
            isEngagementSignalsApiAvailable = i14 % 128;
            int i15 = i14 % 2;
            keyBoardVisiblePoint4 = null;
        }
        String strAsInterface = keyBoardVisiblePoint4.asInterface();
        onDisclaimerClick ondisclaimerclick3 = this.onPostMessage;
        if (ondisclaimerclick3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            ondisclaimerclick = ondisclaimerclick3;
        }
        ToolkitManagerc.onNavigationEvent(toolkitManagerc, null, null, null, onextracallback, strAsInterface, ondisclaimerclick.extraCallbackWithResult(), getScreenName(), null, null, null, 903, null);
    }

    public void onExtraCallback(long j) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1221705L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        IAuthTabCallback(1599774498, new Object[]{this, Long.valueOf(j), "DEPOSIT"}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) + 1999772863, ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 173686553, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1599774475);
        int i4 = isEngagementSignalsApiAvailable + 115;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    public void IAuthTabCallback(long j) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 73;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1221703L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        IAuthTabCallback(1599774498, new Object[]{this, Long.valueOf(j), "WITHDRAW"}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) + 1999772863, ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 173686553, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1599774475);
        int i4 = isEngagementSignalsApiAvailable + 39;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getSmallIconId() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 79;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
        Object[] objArr = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022888).substring(0, 28).length() - 367073738, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 139), View.MeasureSpec.getSize(0) + 535101475, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 93), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 31, objArr);
        Intent intentOnExtraCallback = sessionTrackerbICustomTabsServiceDefault.onExtraCallback(this, ((String) objArr[0]).intern());
        if (intentOnExtraCallback != null) {
            this.extraCallback.onNavigationEvent(intentOnExtraCallback);
            return;
        }
        int i4 = isEngagementSignalsApiAvailable + 17;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getActiveNotifications() throws Throwable {
        Long lValueOf;
        int i = 2 % 2;
        SessionTrackerb sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
        swapLeftAndRightInRTL swapleftandrightinrtl = this.asBinder;
        if (swapleftandrightinrtl != null) {
            int i2 = isEngagementSignalsApiAvailable + 11;
            extraCommand = i2 % 128;
            if (i2 % 2 == 0) {
                lValueOf = Long.valueOf(((Long) swapLeftAndRightInRTL.onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{swapleftandrightinrtl}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 252394631, -252394628, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).longValue());
                int i3 = 2 / 0;
            } else {
                lValueOf = Long.valueOf(((Long) swapLeftAndRightInRTL.onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{swapleftandrightinrtl}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 252394631, -252394628, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).longValue());
            }
        } else {
            lValueOf = null;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 54, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 77, new char[]{2, 5, 65484, 16, 11, 2, 2, 17, 65484, 65484, 65495, 16, 16, '\f', 17, 15, 2, '\r', 18, 16, 65498, 1, 65510, 21, '\f', 65503, '\n', 2, 11, 2, 5, 65500, 16, 4, 11, 6, 17, 17, 2, 16, 65484, 21, '\f', 65535, '\n', 2, 11}, true, (Process.myTid() >> 22) + 245, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(lValueOf);
        Intent intentOnExtraCallback = sessionTrackerbICustomTabsServiceDefault.onExtraCallback(this, sb.toString());
        if (intentOnExtraCallback != null) {
            this.extraCallback.onNavigationEvent(intentOnExtraCallback);
            return;
        }
        int i4 = isEngagementSignalsApiAvailable + 91;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
        onDisclaimerClick ondisclaimerclick = null;
        if (keyBoardVisiblePoint == null) {
            int i2 = extraCommand + 109;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        if (keyBoardVisiblePoint.access000()) {
            getMenuInflater().inflate(viva.republica.toss.R.menu.menu_toss_main_account, menu);
        } else {
            getMenuInflater().inflate(viva.republica.toss.R.menu.menu_toss_mission_account_detail, menu);
            onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
            if (ondisclaimerclick2 == null) {
                int i4 = isEngagementSignalsApiAvailable + 95;
                extraCommand = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    ondisclaimerclick.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick2 = null;
            }
            if (ondisclaimerclick2.ICustomTabsCallbackDefault()) {
                MenuItem menuItemFindItem = menu.findItem(viva.republica.toss.R.id.action_delete);
                if (menuItemFindItem != null) {
                    menuItemFindItem.setVisible(false);
                }
                MenuItem menuItemFindItem2 = menu.findItem(viva.republica.toss.R.id.action_edit);
                if (menuItemFindItem2 != null) {
                    menuItemFindItem2.setShowAsActionFlags(1);
                }
            } else {
                onDisclaimerClick ondisclaimerclick3 = this.onPostMessage;
                if (ondisclaimerclick3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    ondisclaimerclick3 = null;
                }
                if (!ondisclaimerclick3.ICustomTabsCallbackStubProxy()) {
                    onDisclaimerClick ondisclaimerclick4 = this.onPostMessage;
                    if (ondisclaimerclick4 == null) {
                        int i5 = isEngagementSignalsApiAvailable + 109;
                        extraCommand = i5 % 128;
                        int i6 = i5 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                        int i7 = isEngagementSignalsApiAvailable + 97;
                        extraCommand = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        ondisclaimerclick = ondisclaimerclick4;
                    }
                    if (ondisclaimerclick.onMessageChannelReady()) {
                    }
                }
            }
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 15;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        int itemId = menuItem.getItemId();
        onDisclaimerClick ondisclaimerclick = null;
        if (itemId == viva.republica.toss.R.id.action_edit) {
            int i4 = extraCommand + 17;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
            if (ondisclaimerclick2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick2 = null;
            }
            if (ondisclaimerclick2.onMessageChannelReady()) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1238629L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                getActiveNotifications();
                int i6 = extraCommand + 61;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
            } else {
                onDisclaimerClick ondisclaimerclick3 = this.onPostMessage;
                if (ondisclaimerclick3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    ondisclaimerclick3 = null;
                }
                if (ondisclaimerclick3.ICustomTabsCallbackStubProxy()) {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1237793L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                    getSmallIconId();
                } else {
                    IAuthTabCallback(-262761237, new Object[]{this}, ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), 262761239);
                }
            }
            onDisclaimerClick ondisclaimerclick4 = this.onPostMessage;
            if (ondisclaimerclick4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick4 = null;
            }
            if (ondisclaimerclick4.ICustomTabsCallbackDefault()) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1007781L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            }
            ToolkitManagerc toolkitManagerc = ToolkitManagerc.onNavigationEvent;
            ToolkitManagerc.onExtraCallback onextracallback = ToolkitManagerc.onExtraCallback.SETTING;
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
            if (keyBoardVisiblePoint == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                keyBoardVisiblePoint = null;
            }
            String strAsInterface = keyBoardVisiblePoint.asInterface();
            onDisclaimerClick ondisclaimerclick5 = this.onPostMessage;
            if (ondisclaimerclick5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                ondisclaimerclick = ondisclaimerclick5;
            }
            ToolkitManagerc.onNavigationEvent(toolkitManagerc, null, null, null, onextracallback, strAsInterface, ondisclaimerclick.extraCallbackWithResult(), getScreenName(), null, null, null, 903, null);
        } else if (itemId == viva.republica.toss.R.id.action_delete) {
            KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.onPostMessage;
            if (keyBoardVisiblePoint2 == null) {
                int i8 = isEngagementSignalsApiAvailable + 51;
                extraCommand = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                keyBoardVisiblePoint2 = null;
            }
            if (keyBoardVisiblePoint2.ax_()) {
                KeyBoardVisiblePoint keyBoardVisiblePoint3 = this.onPostMessage;
                if (keyBoardVisiblePoint3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    keyBoardVisiblePoint3 = null;
                }
                if (KeyBoardVisiblePoint.onExtraCallback(keyBoardVisiblePoint3, 0L, 1, (Object) null) > 0) {
                    RemoteActionCompatParcelizer();
                }
            } else {
                ITrustedWebActivityServiceStubProxy();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        String stringExtra;
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            onDisclaimerClick ondisclaimerclickIAuthTabCallback = DERConstructedSet.IAuthTabCallback(this.onMessageChannelReady);
            if (ondisclaimerclickIAuthTabCallback != null) {
                IAuthTabCallback(ondisclaimerclickIAuthTabCallback);
            }
            if (i != 12) {
                int i4 = extraCommand;
                int i5 = i4 + 37;
                isEngagementSignalsApiAvailable = i5 % 128;
                if (i5 % 2 == 0 ? i == 10101 : i == 18345) {
                    if (intent != null) {
                        int i6 = i4 + 93;
                        isEngagementSignalsApiAvailable = i6 % 128;
                        int i7 = i6 % 2;
                        stringExtra = intent.getStringExtra("toss.intent.extra.ACCOUNT_ID");
                        if (stringExtra == null) {
                            stringExtra = _UrlKt.FRAGMENT_ENCODE_SET;
                        }
                    }
                    if (GraniteModule_onEventListenerRemoved.onExtraCallback(stringExtra)) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("toss.intent.extra.ACCOUNT_ID", this.onMessageChannelReady);
                        setResult(-1, intent2);
                        finish();
                        return;
                    }
                    if (ondisclaimerclickIAuthTabCallback != null) {
                        int i8 = isEngagementSignalsApiAvailable + 43;
                        extraCommand = i8 % 128;
                        if (i8 % 2 == 0) {
                            if (ondisclaimerclickIAuthTabCallback.ICustomTabsCallbackDefault()) {
                                return;
                            }
                        } else if (!ondisclaimerclickIAuthTabCallback.ICustomTabsCallbackDefault()) {
                            return;
                        }
                        ITrustedWebActivityCallbackDefault().onTransact();
                        return;
                    }
                    return;
                }
                if (i != 10120) {
                    int i9 = i4 + 9;
                    isEngagementSignalsApiAvailable = i9 % 128;
                    if (i9 % 2 != 0) {
                        if (i != 29556) {
                            return;
                        }
                    } else if (i != 10140) {
                        return;
                    }
                    setResult(-1, intent);
                    finish();
                    return;
                }
            }
            ITrustedWebActivityCallbackDefault().onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(onDisclaimerClick ondisclaimerclick) {
        onDisclaimerClick ondisclaimerclick2;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 87;
        extraCommand = i2 % 128;
        onDisclaimerClick ondisclaimerclick3 = null;
        if (i2 % 2 == 0) {
            ondisclaimerclick2 = this.onPostMessage;
            int i3 = 74 / 0;
            if (ondisclaimerclick2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick2 = null;
            }
        } else {
            ondisclaimerclick2 = this.onPostMessage;
            if (ondisclaimerclick2 == null) {
            }
        }
        boolean zAreEqual = Intrinsics.areEqual(ondisclaimerclick2.onTransact(), ondisclaimerclick.onTransact());
        this.onPostMessage = ondisclaimerclick;
        UST_GET_APPLICENSEINFO ust_get_applicenseinfoITrustedWebActivityCallbackDefault = ITrustedWebActivityCallbackDefault();
        onDisclaimerClick ondisclaimerclick4 = this.onPostMessage;
        if (ondisclaimerclick4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            ondisclaimerclick3 = ondisclaimerclick4;
        }
        ust_get_applicenseinfoITrustedWebActivityCallbackDefault.onWarmupCompleted(ondisclaimerclick3);
        write();
        if (!zAreEqual) {
            int i4 = extraCommand + 65;
            isEngagementSignalsApiAvailable = i4 % 128;
            if (i4 % 2 != 0) {
                ITrustedWebActivityCallbackDefault().onTransact();
                int i5 = 18 / 0;
            } else {
                ITrustedWebActivityCallbackDefault().onTransact();
            }
        }
        ITrustedWebActivityServiceDefault();
    }

    private final void ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            onDisclaimerClick ondisclaimerclick = this.onPostMessage;
            KeyBoardVisiblePoint keyBoardVisiblePoint = null;
            String strAsBinder = _UrlKt.FRAGMENT_ENCODE_SET;
            if (ondisclaimerclick == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick = null;
            }
            if (!ondisclaimerclick.ICustomTabsCallbackStubProxy()) {
                onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
                if (ondisclaimerclick2 == null) {
                    int i2 = isEngagementSignalsApiAvailable + 83;
                    extraCommand = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    if (i3 == 0) {
                        keyBoardVisiblePoint.hashCode();
                        throw null;
                    }
                    ondisclaimerclick2 = null;
                }
                if (!ondisclaimerclick2.onMessageChannelReady()) {
                    KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.onPostMessage;
                    if (keyBoardVisiblePoint2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    } else {
                        keyBoardVisiblePoint = keyBoardVisiblePoint2;
                    }
                    strAsBinder = keyBoardVisiblePoint.asBinder();
                    int i4 = isEngagementSignalsApiAvailable + 85;
                    extraCommand = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            supportActionBar.onExtraCallbackWithResult(strAsBinder);
            int i6 = isEngagementSignalsApiAvailable + 13;
            extraCommand = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ComponentActivity componentActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        onDisclaimerClick ondisclaimerclick = ((TossAccountHistoryActivity) componentActivity).onPostMessage;
        if (ondisclaimerclick == null) {
            int i2 = isEngagementSignalsApiAvailable + 123;
            extraCommand = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick = null;
        }
        if (ondisclaimerclick.ICustomTabsCallbackDefault()) {
            Intent intentOnWarmupCompleted = SavingAccountEditActivity.Companion.onWarmupCompleted(componentActivity, ((TossAccountHistoryActivity) componentActivity).onMessageChannelReady);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "click_button", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return (Unit) TossAccountHistoryActivity.IAuthTabCallback(-1310881232, new Object[]{(SetDetectableSize) obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1310881249);
                }
            }, 30, (Object) null);
            componentActivity.startActivityForResult(intentOnWarmupCompleted, 10101);
            int i4 = extraCommand + 61;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        KeyBoardVisiblePoint keyBoardVisiblePoint = ((TossAccountHistoryActivity) componentActivity).onPostMessage;
        if (keyBoardVisiblePoint == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        if (!(!keyBoardVisiblePoint.access000())) {
            getNavigationBar.IAuthTabCallback(TossMoneySettingActivity.Companion.onWarmupCompleted(componentActivity, "tossmoney_details"), componentActivity);
        }
        return null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 111;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        dialogInterface.dismiss();
        int i4 = extraCommand + 13;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return null;
    }

    private static final void IAuthTabCallbackStub(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 29;
        extraCommand = i3 % 128;
        int i4 = i3 % 2;
        dialogInterface.dismiss();
        tossAccountHistoryActivity.AudioAttributesCompatParcelizer();
        int i5 = isEngagementSignalsApiAvailable + 101;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void RemoteActionCompatParcelizer() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 71;
        isEngagementSignalsApiAvailable = i2 % 128;
        KeyBoardVisiblePoint keyBoardVisiblePoint = null;
        if (i2 % 2 == 0) {
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnNavigationEvent = TdsDialogV1.Companion.onExtraCallback(this).onNavigationEvent(viva.republica.toss.R.string.account_delete_alert_title);
            int i3 = viva.republica.toss.R.string.account_delete_alert_message;
            KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.onPostMessage;
            if (keyBoardVisiblePoint2 == null) {
                int i4 = isEngagementSignalsApiAvailable + 125;
                extraCommand = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    int i5 = 5 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                }
            } else {
                keyBoardVisiblePoint = keyBoardVisiblePoint2;
            }
            String string = getString(i3, issueCertV3.onNavigationEvent(keyBoardVisiblePoint));
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompletedOnNavigationEvent.onExtraCallbackWithResult(string), R.string.uikit_cancel, (DialogInterface.OnClickListener) new TossAccountHistoryActivity$.ExternalSyntheticLambda52(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null), viva.republica.toss.R.string.empty_account_balance, (DialogInterface.OnClickListener) new TossAccountHistoryActivity$.ExternalSyntheticLambda53(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
            return;
        }
        TdsDialogV1.Companion.onExtraCallback(this).onNavigationEvent(viva.republica.toss.R.string.account_delete_alert_title);
        int i6 = viva.republica.toss.R.string.account_delete_alert_message;
        throw null;
    }

    private static final Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        IAuthTabCallback(-221356077, new Object[]{tossAccountHistoryActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult()}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 221356090);
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 69;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(viva.republica.toss.R.string.account_register_required));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = tossAccountHistoryActivity.getString(viva.republica.toss.R.string.continue_register_account_question_format);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{tossAccountHistoryActivity.getString(viva.republica.toss.R.string.toss_account_transfer)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2115179004, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -2115178997, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, viva.republica.toss.R.string.keep_continue, null, false, new TossAccountHistoryActivity$.ExternalSyntheticLambda90(tossAccountHistoryActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener), 6, null)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = extraCommand + Imgproc.COLOR_YUV2RGB_YVYU;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void AudioAttributesCompatParcelizer() throws Throwable {
        int i = 2 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = null;
        if (keyBoardVisiblePoint == null) {
            int i2 = extraCommand + 7;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i3 = 36 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            keyBoardVisiblePoint = null;
        }
        if (keyBoardVisiblePoint.ax_()) {
            return;
        }
        KeyBoardVisiblePoint keyBoardVisiblePoint3 = this.onPostMessage;
        if (keyBoardVisiblePoint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint3 = null;
        }
        if (KeyBoardVisiblePoint.IAuthTabCallback(keyBoardVisiblePoint3, 0L, 1, (Object) null) <= 0) {
            int i4 = isEngagementSignalsApiAvailable + 125;
            extraCommand = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object[] objArr = {this, getString(viva.republica.toss.R.string.no_balance_to_transfer)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-956144460);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46479 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, 22730 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), -163407324, false, "onWarmupCompleted", new Class[]{Context.class, String.class});
                    }
                    ((Method) objOnExtraCallback).invoke(null, objArr);
                    return;
                }
                Object[] objArr2 = {this, getString(viva.republica.toss.R.string.no_balance_to_transfer)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-956144460);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46480), 13 - ExpandableListView.getPackedPositionGroup(0L), View.getDefaultSize(0, 0) + 22731, -163407324, false, "onWarmupCompleted", new Class[]{Context.class, String.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr2);
                keyBoardVisiblePoint2.hashCode();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        DERConstructedSet dERConstructedSet = DERConstructedSet.onNavigationEvent;
        KeyBoardVisiblePoint keyBoardVisiblePoint4 = this.onPostMessage;
        if (keyBoardVisiblePoint4 == null) {
            int i5 = extraCommand + 31;
            isEngagementSignalsApiAvailable = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i6 = 93 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            int i7 = extraCommand + 15;
            isEngagementSignalsApiAvailable = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 5;
            }
            keyBoardVisiblePoint4 = null;
        }
        if (!dERConstructedSet.onNavigationEvent(keyBoardVisiblePoint4)) {
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = PageShowPoint.Companion.onWarmupCompleted();
            if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new TossAccountHistoryActivity$.ExternalSyntheticLambda12(this, tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted));
                return;
            } else {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new TossAccountHistoryActivity$.ExternalSyntheticLambda13());
                return;
            }
        }
        String string = getString(viva.republica.toss.R.string.app_account_detail___85adc75f5c);
        Intrinsics.checkNotNullExpressionValue(string, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        StringBuilder sb = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 58, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 4, new char[]{16, '\r', 11, 65499, 18, '\r', 17, 17, 65476, 18, 7, 18, '\n', 3, 65499, 17, 19, 14, 3, 16, 18, '\r', 17, 17, 65496, 65485, 65485, 17, 3, '\f', 2, 65501, 65535, 1, 1, '\r', 19, '\f', 18, 65508, 16, '\r', 11, 65499, 65475, 17, 65476, 65535, 1, 1, '\r', 19, '\f', 18, 65522, 23, 14, 3, 65508}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 146, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(string);
        sb.append("&justClose=true");
        String string2 = sb.toString();
        KeyBoardVisiblePoint keyBoardVisiblePoint5 = this.onPostMessage;
        if (keyBoardVisiblePoint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i9 = isEngagementSignalsApiAvailable + 31;
            extraCommand = i9 % 128;
            int i10 = i9 % 2;
        } else {
            keyBoardVisiblePoint2 = keyBoardVisiblePoint5;
        }
        String str = String.format(string2, Arrays.copyOf(new Object[]{keyBoardVisiblePoint2.onExtraCallbackWithResult()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        startActivityForResult(SendActivity.Companion.IAuthTabCallback(this, str), 12);
        overridePendingTransition(viva.republica.toss.R.anim.anim_window_in_from_right, viva.republica.toss.R.anim.anim_window_out);
        Unit unit = Unit.INSTANCE;
        int i11 = extraCommand + 83;
        isEngagementSignalsApiAvailable = i11 % 128;
        int i12 = i11 % 2;
    }

    private static final Unit onExtraCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 5;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(viva.republica.toss.R.string.account_register_required));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(viva.republica.toss.R.string.need_account_register_for_transfer));
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 27;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            dialogInterface.dismiss();
            tossAccountHistoryActivity.onNavigationEvent().IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onNavigationEvent(), tossAccountHistoryActivity.getScreenName(), "N");
            int i4 = 80 / 0;
        } else {
            dialogInterface.dismiss();
            tossAccountHistoryActivity.onNavigationEvent().IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onNavigationEvent(), tossAccountHistoryActivity.getScreenName(), "N");
        }
        int i5 = extraCommand + 77;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
    }

    private static final void onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            tossAccountHistoryActivity.IEngagementSignalsCallback_Parcel();
            tossAccountHistoryActivity.onNavigationEvent().IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onNavigationEvent(), tossAccountHistoryActivity.getScreenName(), "Y");
            int i4 = 54 / 0;
        } else {
            tossAccountHistoryActivity.IEngagementSignalsCallback_Parcel();
            tossAccountHistoryActivity.onNavigationEvent().IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onNavigationEvent(), tossAccountHistoryActivity.getScreenName(), "Y");
        }
        int i5 = isEngagementSignalsApiAvailable + 111;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityServiceStubProxy() {
        int i = 2 % 2;
        Object[] objArr = {TdsDialogV1.Companion.onExtraCallback(this).onNavigationEvent(viva.republica.toss.R.string.alert_dialog_title_for_delete), Integer.valueOf(viva.republica.toss.R.string.alert_dialog_message_for_delete_with_cma)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -868633265, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 868633269, objArr, iOnExtraCallback)).onNavigationEvent(true), viva.republica.toss.R.string.alert_dialog_delete_cancel, (DialogInterface.OnClickListener) new TossAccountHistoryActivity$.ExternalSyntheticLambda88(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null), viva.republica.toss.R.string.alert_dialog_delete_ok, (DialogInterface.OnClickListener) new TossAccountHistoryActivity$.ExternalSyntheticLambda89(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
        int i2 = extraCommand + 107;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        String string = getString(viva.republica.toss.R.string.please_wait);
        Intrinsics.checkNotNullExpressionValue(string, "");
        onNavigationEvent(string, false);
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = DERConstructedSet.onNavigationEvent.onWarmupCompleted(this.onMessageChannelReady).IAuthTabCallback((deserializeDecimalCollection) new TossAccountHistoryActivity$.ExternalSyntheticLambda78(this)).onWarmupCompleted((deserializeFloat) new TossAccountHistoryActivity$.ExternalSyntheticLambda80(new TossAccountHistoryActivity$.ExternalSyntheticLambda79(this)), (deserializeFloat<? super Throwable>) new TossAccountHistoryActivity$.ExternalSyntheticLambda82(new TossAccountHistoryActivity$.ExternalSyntheticLambda81(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        addSubscription(deserializeurinullablecollectionOnWarmupCompleted);
        int i2 = isEngagementSignalsApiAvailable + 75;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final void extraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity) {
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3ICustomTabsCallback = tossAccountHistoryActivity.ICustomTabsCallback();
        Intrinsics.checkNotNull(brickModuleImplExternalSyntheticLambda3ICustomTabsCallback);
        if (i3 != 0) {
            brickModuleImplExternalSyntheticLambda3ICustomTabsCallback.dismiss();
            int i4 = 89 / 0;
        } else {
            brickModuleImplExternalSyntheticLambda3ICustomTabsCallback.dismiss();
        }
        int i5 = extraCommand + 3;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void ICustomTabsCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 27;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void mayLaunchUrl(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCommand + 79;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 85;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(TossAccountHistoryActivity tossAccountHistoryActivity, NativeAdView nativeAdView) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("toss.intent.extra.ACCOUNT_ID", tossAccountHistoryActivity.onMessageChannelReady);
        tossAccountHistoryActivity.setResult(-1, intent);
        tossAccountHistoryActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = isEngagementSignalsApiAvailable + 5;
        extraCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        String string;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCommand + 97;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        if (!TextUtils.isEmpty(th.getMessage())) {
            string = th.getMessage();
        } else {
            string = tossAccountHistoryActivity.getString(viva.republica.toss.R.string.network_error);
            int i5 = extraCommand + 113;
            isEngagementSignalsApiAvailable = i5 % 128;
            int i6 = i5 % 2;
        }
        Object obj = null;
        if (TextUtils.isEmpty(th.getMessage())) {
            int i7 = extraCommand + 101;
            isEngagementSignalsApiAvailable = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = im.toss.core.R.drawable.img_popup_network;
                obj.hashCode();
                throw null;
            }
            i = im.toss.core.R.drawable.img_popup_network;
        } else {
            i = im.toss.core.R.drawable.img_popup_warning;
            int i9 = isEngagementSignalsApiAvailable + 83;
            extraCommand = i9 % 128;
            int i10 = i9 % 2;
        }
        if (!tossAccountHistoryActivity.isFinishing()) {
            int i11 = extraCommand + 115;
            isEngagementSignalsApiAvailable = i11 % 128;
            if (i11 % 2 != 0) {
                tossAccountHistoryActivity.bo_();
                TdsDialogV1.Companion.onExtraCallback(tossAccountHistoryActivity);
                obj.hashCode();
                throw null;
            }
            tossAccountHistoryActivity.bo_();
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback = TdsDialogV1.Companion.onExtraCallback(tossAccountHistoryActivity);
            if (string == null) {
                string = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, new Object[]{onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult(string), Integer.valueOf(i)}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()), R.string.uikit_confirm, (DialogInterface.OnClickListener) null, (TdsButtonV1View.asInterface) null, false, 14, (Object) null).readTypedObject();
        }
        return Unit.INSTANCE;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCommand + 29;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            ((Number) ((Pair) IAuthTabCallback(1422706435, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1422706388)).getFirst()).longValue();
            throw null;
        }
        long jLongValue = ((Number) ((Pair) IAuthTabCallback(1422706435, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1422706388)).getFirst()).longValue();
        int i3 = extraCommand + 25;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return jLongValue;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 != 0) {
            return (String) ((Pair) IAuthTabCallback(1422706435, objArr, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, -1422706388)).getSecond();
        }
        int i4 = 22 / 0;
        return (String) ((Pair) IAuthTabCallback(1422706435, objArr, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted4, iOnWarmupCompleted3, -1422706388)).getSecond();
    }

    private static /* synthetic */ Object prefetch(Object[] objArr) {
        TossAccountHistoryActivity tossAccountHistoryActivity = (TossAccountHistoryActivity) objArr[0];
        int i = 2 % 2;
        onDisclaimerClick ondisclaimerclick = tossAccountHistoryActivity.onPostMessage;
        Object obj = null;
        if (ondisclaimerclick == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i2 = extraCommand + 5;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            ondisclaimerclick = null;
        }
        if (ondisclaimerclick.ICustomTabsCallbackDefault()) {
            return getWrite.IAuthTabCallback(1007391L, "s51_ihub_savingbox");
        }
        onDisclaimerClick ondisclaimerclick2 = tossAccountHistoryActivity.onPostMessage;
        if (ondisclaimerclick2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick2 = null;
        }
        if (!(!ondisclaimerclick2.ICustomTabsCallbackStubProxy())) {
            return getWrite.IAuthTabCallback(1221701L, "youth_home__savingbox_detail");
        }
        onDisclaimerClick ondisclaimerclick3 = tossAccountHistoryActivity.onPostMessage;
        if (ondisclaimerclick3 == null) {
            int i4 = isEngagementSignalsApiAvailable + 51;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick3 = null;
        }
        if (ondisclaimerclick3.onMessageChannelReady() && tossAccountHistoryActivity.asBinder != null) {
            return getWrite.IAuthTabCallback(1225557L, "teens_savingbox__henembox_detail");
        }
        KeyBoardVisiblePoint keyBoardVisiblePoint = tossAccountHistoryActivity.onPostMessage;
        if (keyBoardVisiblePoint == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        if (keyBoardVisiblePoint.access000() && !(!addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted))) {
            return getWrite.IAuthTabCallback(1217535L, "inquiry__tossmoney");
        }
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = tossAccountHistoryActivity.onPostMessage;
        if (keyBoardVisiblePoint2 == null) {
            int i6 = isEngagementSignalsApiAvailable + 41;
            extraCommand = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint2 = null;
        }
        if (!keyBoardVisiblePoint2.access000() || addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
            return getWrite.IAuthTabCallback(-1L, _UrlKt.FRAGMENT_ENCODE_SET);
        }
        int i7 = extraCommand + 23;
        isEngagementSignalsApiAvailable = i7 % 128;
        if (i7 % 2 == 0) {
            return getWrite.IAuthTabCallback(1000198L, "transactions_main_account");
        }
        getWrite.IAuthTabCallback(1000198L, "transactions_main_account");
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> getScreenParams() throws Throwable {
        Long lValueOf;
        swapLeftAndRightInRTL swapleftandrightinrtl;
        int i = 2 % 2;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        Map<String, Object> mapIAuthTabCallback = zzbq.IAuthTabCallback(intent);
        onDisclaimerClick ondisclaimerclick = this.onPostMessage;
        KeyBoardVisiblePoint keyBoardVisiblePointExtraCallbackWithResult = null;
        if (ondisclaimerclick == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            ondisclaimerclick = null;
        }
        if (ondisclaimerclick.ICustomTabsCallbackDefault()) {
            BEROctetStringParser.onExtraCallbackWithResult onextracallbackwithresult = BEROctetStringParser.Companion;
            onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
            if (ondisclaimerclick2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick2 = null;
            }
            onextracallbackwithresult.onWarmupCompleted(ondisclaimerclick2);
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
            if (keyBoardVisiblePoint == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                keyBoardVisiblePointExtraCallbackWithResult = keyBoardVisiblePoint;
            }
            mapIAuthTabCallback.put("amount", keyBoardVisiblePointExtraCallbackWithResult.onTransact());
            mapIAuthTabCallback.put("label", _UrlKt.FRAGMENT_ENCODE_SET);
            mapIAuthTabCallback.put("service_id", "69");
            Object[] objArr = new Object[1];
            a(4 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, new char[]{4, '\t', 0, 65525}, false, 258 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            mapIAuthTabCallback.put(((String) objArr[0]).intern(), "trx_history");
            mapIAuthTabCallback.put("banner", _UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            onDisclaimerClick ondisclaimerclick3 = this.onPostMessage;
            if (ondisclaimerclick3 == null) {
                int i2 = extraCommand + 9;
                isEngagementSignalsApiAvailable = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    keyBoardVisiblePointExtraCallbackWithResult.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick3 = null;
            }
            if (ondisclaimerclick3.onMessageChannelReady()) {
                int i3 = extraCommand + 41;
                isEngagementSignalsApiAvailable = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                swapLeftAndRightInRTL swapleftandrightinrtl2 = this.asBinder;
                mapIAuthTabCallback.put("henembox_goal_amount", swapleftandrightinrtl2 != null ? Long.valueOf(((Long) swapLeftAndRightInRTL.onNavigationEvent(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{swapleftandrightinrtl2}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -197983790, 197983795, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).longValue()) : null);
                swapLeftAndRightInRTL swapleftandrightinrtl3 = this.asBinder;
                mapIAuthTabCallback.put("success_percentage", swapleftandrightinrtl3 != null ? Integer.valueOf(swapleftandrightinrtl3.writeTypedObject()) : null);
                swapLeftAndRightInRTL swapleftandrightinrtl4 = this.asBinder;
                if (swapleftandrightinrtl4 != null) {
                    lValueOf = Long.valueOf(swapleftandrightinrtl4.IAuthTabCallback());
                } else {
                    int i4 = isEngagementSignalsApiAvailable + 11;
                    extraCommand = i4 % 128;
                    int i5 = i4 % 2;
                    lValueOf = null;
                }
                mapIAuthTabCallback.put("saving_amount", lValueOf);
                swapLeftAndRightInRTL swapleftandrightinrtl5 = this.asBinder;
                mapIAuthTabCallback.put("henembox_name", swapleftandrightinrtl5 != null ? swapleftandrightinrtl5.onPostMessage() : null);
                swapLeftAndRightInRTL swapleftandrightinrtl6 = this.asBinder;
                String str = "N";
                String str2 = (swapleftandrightinrtl6 == null || !swapleftandrightinrtl6.onMinimized()) ? "N" : "Y";
                Object[] objArr2 = new Object[1];
                a(9 - ImageFormat.getBitsPerPixel(0), View.resolveSize(0, 0) + 9, new char[]{'\r', 65523, 7, 7, 65529, 65527, 65527, '\t', 7, 2}, true, KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 254, objArr2);
                mapIAuthTabCallback.put(((String) objArr2[0]).intern(), str2);
                swapLeftAndRightInRTL swapleftandrightinrtl7 = this.asBinder;
                if (swapleftandrightinrtl7 != null && swapleftandrightinrtl7.onMinimized() && (swapleftandrightinrtl = this.asBinder) != null && swapleftandrightinrtl.IAuthTabCallback() == 0) {
                    str = "Y";
                }
                mapIAuthTabCallback.put("withdraw_yn", str);
                swapLeftAndRightInRTL swapleftandrightinrtl8 = this.asBinder;
                mapIAuthTabCallback.put("memo_comment", swapleftandrightinrtl8 != null ? swapleftandrightinrtl8.access100() : null);
                mapIAuthTabCallback.put("my_henembox_yn", "Y");
                swapLeftAndRightInRTL swapleftandrightinrtl9 = this.asBinder;
                if (swapleftandrightinrtl9 != null) {
                    int i6 = extraCommand + 119;
                    isEngagementSignalsApiAvailable = i6 % 128;
                    if (i6 % 2 != 0) {
                        keyBoardVisiblePointExtraCallbackWithResult = swapleftandrightinrtl9.extraCallbackWithResult();
                        int i7 = 84 / 0;
                    } else {
                        keyBoardVisiblePointExtraCallbackWithResult = swapleftandrightinrtl9.extraCallbackWithResult();
                    }
                }
                mapIAuthTabCallback.put("saving_type", keyBoardVisiblePointExtraCallbackWithResult);
                int i8 = isEngagementSignalsApiAvailable + 55;
                extraCommand = i8 % 128;
                int i9 = i8 % 2;
            } else {
                onDisclaimerClick ondisclaimerclick4 = this.onPostMessage;
                if (ondisclaimerclick4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    ondisclaimerclick4 = null;
                }
                if (ondisclaimerclick4.ICustomTabsCallbackStubProxy()) {
                    Intent intent2 = getIntent();
                    Object[] objArr3 = new Object[1];
                    a(TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 9, 5 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{7, 65530, 65531, 65530, 7, 7, 65530, 7}, true, 253 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                    String stringExtra = intent2.getStringExtra(((String) objArr3[0]).intern());
                    if (stringExtra == null) {
                        stringExtra = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    Object[] objArr4 = new Object[1];
                    a(8 - (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.normalizeMetaState(0) + 5, new char[]{7, 65530, 65531, 65530, 7, 7, 65530, 7}, true, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 253, objArr4);
                    mapIAuthTabCallback.put(((String) objArr4[0]).intern(), stringExtra);
                } else {
                    KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.onPostMessage;
                    if (keyBoardVisiblePoint2 == null) {
                        int i10 = isEngagementSignalsApiAvailable + 79;
                        extraCommand = i10 % 128;
                        int i11 = i10 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    } else {
                        keyBoardVisiblePointExtraCallbackWithResult = keyBoardVisiblePoint2;
                    }
                    if (keyBoardVisiblePointExtraCallbackWithResult.access000()) {
                    }
                }
            }
        }
        mapIAuthTabCallback.put("category", "dashboard");
        return mapIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 23;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((Process.myPid() >> 22) + 4, View.combineMeasuredStates(0, 0) + 4, new char[]{4, '\t', 0, 65525}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + Imgcodecs.IMWRITE_TIFF_XDPI, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "TOSSMONEY_UPGRADE_GUIDANCE");
        Object[] objArr2 = new Object[1];
        c((-367073713) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (11 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 535101476, (short) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) - 42), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) - 42, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), tossAccountHistoryActivity.getTitle());
        KeyBoardVisiblePoint keyBoardVisiblePoint = tossAccountHistoryActivity.onPostMessage;
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = null;
        if (keyBoardVisiblePoint == null) {
            int i4 = isEngagementSignalsApiAvailable + 95;
            extraCommand = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                keyBoardVisiblePoint2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        setDetectableSize.onExtraCallback("bank_code", keyBoardVisiblePoint.asInterface());
        setDetectableSize.onExtraCallback("screen_name", tossAccountHistoryActivity.getScreenName());
        KeyBoardVisiblePoint keyBoardVisiblePoint3 = tossAccountHistoryActivity.onPostMessage;
        if (keyBoardVisiblePoint3 == null) {
            int i5 = extraCommand + 87;
            isEngagementSignalsApiAvailable = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i6 = 81 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
        } else {
            keyBoardVisiblePoint2 = keyBoardVisiblePoint3;
        }
        setDetectableSize.onExtraCallback("bacnk_account_type", keyBoardVisiblePoint2.onWarmupCompleted().name());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1214737L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        SessionTrackerb.IAuthTabCallback(ICustomTabsServiceDefault(), this, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        finish();
        int i2 = extraCommand + 43;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNavigationEvent(@NotNull String str) {
        SessionTrackerb sessionTrackerbICustomTabsServiceDefault;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 7;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
            z = true;
            function1 = null;
            bundle = null;
            z2 = false;
            i = 79;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            sessionTrackerbICustomTabsServiceDefault = ICustomTabsServiceDefault();
            z = false;
            function1 = null;
            bundle = null;
            z2 = false;
            i = 60;
        }
        SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsServiceDefault, this, str, z, function1, bundle, z2, i, (Object) null);
    }

    public void IAuthTabCallback(@NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1214739L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda96
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TossAccountHistoryActivity.onExtraCallback(str, this, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = extraCommand + 85;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(String str, TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 33;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 4, 4 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), new char[]{4, '\t', 0, 65525}, false, 258 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "TOSSMONEY_UPGRADE_GUIDANCE");
        Object[] objArr2 = new Object[1];
        c((-367073714) - Color.argb(0, 0, 0, 0), (byte) (11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 535101476, (short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 42), (-43) - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        KeyBoardVisiblePoint keyBoardVisiblePoint = tossAccountHistoryActivity.onPostMessage;
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = null;
        if (keyBoardVisiblePoint == null) {
            int i4 = isEngagementSignalsApiAvailable + 29;
            extraCommand = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        setDetectableSize.onExtraCallback("bank_code", keyBoardVisiblePoint.asInterface());
        setDetectableSize.onExtraCallback("screen_name", tossAccountHistoryActivity.getScreenName());
        KeyBoardVisiblePoint keyBoardVisiblePoint3 = tossAccountHistoryActivity.onPostMessage;
        if (keyBoardVisiblePoint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            keyBoardVisiblePoint2 = keyBoardVisiblePoint3;
        }
        setDetectableSize.onExtraCallback("bacnk_account_type", keyBoardVisiblePoint2.onWarmupCompleted().name());
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCommand + 59;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(StompHeader.ID, nativeJSCHeapCaptureSpec.asInterface());
        Object[] objArr = new Object[1];
        c((-367073714) - View.MeasureSpec.getSize(0), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 11), KeyEvent.normalizeMetaState(0) + 535101476, (short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 42), (-43) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        setDetectableSize.onExtraCallback(strIntern, (String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(-1210258625, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpec}, 1210258625, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback));
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback4 = TossApplication.onSessionEnded.onExtraCallback();
        setDetectableSize.onExtraCallback("desc", (String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(1841901168, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpec}, -1841901167, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3));
        Object[] objArr2 = new Object[1];
        a(3 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionType(0L) + 2, new char[]{1, 65531, 4}, false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + Imgcodecs.IMWRITE_TIFF_YDPI, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), nativeJSCHeapCaptureSpec.IAuthTabCallbackStub());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCommand + 79;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onWarmupCompleted(@NotNull final NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeJSCHeapCaptureSpec, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (areNotificationsEnabled()) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1217549L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.detail.TossAccountHistoryActivity$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TossAccountHistoryActivity.onExtraCallback(nativeJSCHeapCaptureSpec, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
        } else {
            ToolkitManagerc toolkitManagerc = ToolkitManagerc.onNavigationEvent;
            String strAsInterface = nativeJSCHeapCaptureSpec.asInterface();
            int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
            String str2 = (String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(-1210258625, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpec}, 1210258625, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
            int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback4 = TossApplication.onSessionEnded.onExtraCallback();
            String str3 = (String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(1841901168, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpec}, -1841901167, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3);
            ToolkitManagerc.onExtraCallback onextracallback = ToolkitManagerc.onExtraCallback.TRANSACTION;
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
            onDisclaimerClick ondisclaimerclick = null;
            if (keyBoardVisiblePoint == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i2 = isEngagementSignalsApiAvailable + 21;
                extraCommand = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 3 / 4;
                }
                keyBoardVisiblePoint = null;
            }
            String strAsInterface2 = keyBoardVisiblePoint.asInterface();
            onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
            if (ondisclaimerclick2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = isEngagementSignalsApiAvailable + 69;
                extraCommand = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ondisclaimerclick = ondisclaimerclick2;
            }
            ToolkitManagerc.onNavigationEvent(toolkitManagerc, strAsInterface, str2, str3, onextracallback, strAsInterface2, ondisclaimerclick.extraCallbackWithResult(), getScreenName(), null, nativeJSCHeapCaptureSpec.IAuthTabCallbackStub(), null, 640, null);
        }
        SessionTrackerb.onExtraCallbackWithResult(ICustomTabsServiceDefault(), getContext(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    public boolean onNavigationEvent(@NotNull NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 115;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(nativeJSCHeapCaptureSpec, "");
        if (this.onActivityResized.length() > 0) {
            if (StringsKt__StringsKt.contains$default((CharSequence) nativeJSCHeapCaptureSpec.asInterface(), (CharSequence) this.onActivityResized, false, 2, (Object) null)) {
                return true;
            }
            int i4 = extraCommand + 81;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            if (StringsKt__StringsKt.contains$default((CharSequence) nativeJSCHeapCaptureSpec.IAuthTabCallbackStub(), (CharSequence) this.onActivityResized, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public void ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = extraCommand + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        onDisclaimerClick ondisclaimerclick = null;
        if (i2 % 2 != 0) {
            ITrustedWebActivityCallbackDefault().onTransact();
            ToolkitManagerc toolkitManagerc = ToolkitManagerc.onNavigationEvent;
            ToolkitManagerc.onExtraCallback onextracallback = ToolkitManagerc.onExtraCallback.REFRESH_BUTTON;
            ondisclaimerclick.hashCode();
            throw null;
        }
        ITrustedWebActivityCallbackDefault().onTransact();
        ToolkitManagerc toolkitManagerc2 = ToolkitManagerc.onNavigationEvent;
        ToolkitManagerc.onExtraCallback onextracallback2 = ToolkitManagerc.onExtraCallback.REFRESH_BUTTON;
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
        if (keyBoardVisiblePoint == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            keyBoardVisiblePoint = null;
        }
        String strAsInterface = keyBoardVisiblePoint.asInterface();
        onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
        if (ondisclaimerclick2 == null) {
            int i3 = isEngagementSignalsApiAvailable + Imgproc.COLOR_YUV2RGB_YVYU;
            extraCommand = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                ondisclaimerclick.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            ondisclaimerclick = ondisclaimerclick2;
        }
        ToolkitManagerc.onNavigationEvent(toolkitManagerc2, null, null, null, onextracallback2, strAsInterface, ondisclaimerclick.extraCallbackWithResult(), getScreenName(), null, null, null, 903, null);
    }

    @Override // o.changeResultMsg.onWarmupCompleted
    public void onWarmupCompleted(@NotNull NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec) {
        Intrinsics.checkNotNullParameter(nativeJSCHeapCaptureSpec, "");
        synchronized (this.IAuthTabCallbackStub) {
            Set<ToolkitManagerc.onNavigationEvent> set = this.IAuthTabCallbackStub;
            ToolkitManagerc.onNavigationEvent onnavigationevent = ToolkitManagerc.onNavigationEvent.TRANSACTION;
            if (set.contains(onnavigationevent)) {
                return;
            }
            this.IAuthTabCallbackStub.add(onnavigationevent);
            ToolkitManagerc toolkitManagerc = ToolkitManagerc.onNavigationEvent;
            String strAsInterface = nativeJSCHeapCaptureSpec.asInterface();
            int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
            String str = (String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(-1210258625, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpec}, 1210258625, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
            int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback4 = TossApplication.onSessionEnded.onExtraCallback();
            String str2 = (String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(1841901168, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpec}, -1841901167, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3);
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
            onDisclaimerClick ondisclaimerclick = null;
            if (keyBoardVisiblePoint == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                keyBoardVisiblePoint = null;
            }
            String strAsInterface2 = keyBoardVisiblePoint.asInterface();
            onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
            if (ondisclaimerclick2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                ondisclaimerclick = ondisclaimerclick2;
            }
            ToolkitManagerc.onExtraCallbackWithResult(toolkitManagerc, strAsInterface, str, str2, onnavigationevent, strAsInterface2, ondisclaimerclick.extraCallbackWithResult(), getScreenName(), null, nativeJSCHeapCaptureSpec.IAuthTabCallbackStub(), null, 640, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.changeResultMsg.onWarmupCompleted
    public void onVerticalScrollEvent() {
        synchronized (this.IAuthTabCallbackStub) {
            Set<ToolkitManagerc.onNavigationEvent> set = this.IAuthTabCallbackStub;
            ToolkitManagerc.onNavigationEvent onnavigationevent = ToolkitManagerc.onNavigationEvent.CHARGE_AND_TRANSFER;
            if (set.contains(onnavigationevent)) {
                return;
            }
            this.IAuthTabCallbackStub.add(onnavigationevent);
            ToolkitManagerc toolkitManagerc = ToolkitManagerc.onNavigationEvent;
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
            onDisclaimerClick ondisclaimerclick = null;
            if (keyBoardVisiblePoint == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                keyBoardVisiblePoint = null;
            }
            String strAsInterface = keyBoardVisiblePoint.asInterface();
            onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
            if (ondisclaimerclick2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                ondisclaimerclick = ondisclaimerclick2;
            }
            ToolkitManagerc.onExtraCallbackWithResult(toolkitManagerc, null, null, null, onnavigationevent, strAsInterface, ondisclaimerclick.extraCallbackWithResult(), getScreenName(), null, null, null, 903, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.changeResultMsg.onWarmupCompleted
    public void onSessionEnded() {
        synchronized (this.IAuthTabCallbackStub) {
            Set<ToolkitManagerc.onNavigationEvent> set = this.IAuthTabCallbackStub;
            ToolkitManagerc.onNavigationEvent onnavigationevent = ToolkitManagerc.onNavigationEvent.TRANSFER_ONLY;
            if (set.contains(onnavigationevent)) {
                return;
            }
            this.IAuthTabCallbackStub.add(onnavigationevent);
            ToolkitManagerc toolkitManagerc = ToolkitManagerc.onNavigationEvent;
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.onPostMessage;
            onDisclaimerClick ondisclaimerclick = null;
            if (keyBoardVisiblePoint == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                keyBoardVisiblePoint = null;
            }
            String strAsInterface = keyBoardVisiblePoint.asInterface();
            onDisclaimerClick ondisclaimerclick2 = this.onPostMessage;
            if (ondisclaimerclick2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                ondisclaimerclick = ondisclaimerclick2;
            }
            ToolkitManagerc.onExtraCallbackWithResult(toolkitManagerc, null, null, null, onnavigationevent, strAsInterface, ondisclaimerclick.extraCallbackWithResult(), getScreenName(), null, null, null, 903, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r6.extraCallbackWithResult != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1 = r1 + org.opencv.imgproc.Imgproc.COLOR_YUV2RGB_YVYU;
        viva.republica.toss.account.detail.TossAccountHistoryActivity.extraCommand = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r6.extraCallbackWithResult != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean areNotificationsEnabled() {
        int i = 2 % 2;
        int i2 = extraCommand + 11;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        if (addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
            int i4 = isEngagementSignalsApiAvailable;
            int i5 = i4 + 31;
            extraCommand = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
        }
        int i7 = extraCommand + 17;
        isEngagementSignalsApiAvailable = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 65 / 0;
        }
        return false;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        return (Unit) IAuthTabCallback(1199712090, new Object[]{th}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1199712058);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        return (Unit) IAuthTabCallback(-1310881232, new Object[]{setDetectableSize}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1310881249);
    }

    public static /* synthetic */ LinearLayoutManager onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity) {
        return (LinearLayoutManager) IAuthTabCallback(-583254710, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 583254752);
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        return (Unit) IAuthTabCallback(-2051431366, new Object[]{Integer.valueOf(i), tossAccountHistoryActivity, th}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2051431394);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(swapLeftAndRightInRTL swapleftandrightinrtl, TossAccountHistoryActivity tossAccountHistoryActivity, boolean z, Throwable th) {
        return (Unit) IAuthTabCallback(-2122972838, new Object[]{swapleftandrightinrtl, tossAccountHistoryActivity, Boolean.valueOf(z), th}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2122972847);
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, Boolean bool) {
        return (Unit) IAuthTabCallback(2030511846, new Object[]{tossAccountHistoryActivity, bool}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2030511836);
    }

    public static /* synthetic */ UST_GET_APPLICENSEINFO asBinder(TossAccountHistoryActivity tossAccountHistoryActivity) {
        return (UST_GET_APPLICENSEINFO) IAuthTabCallback(-338851775, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 338851778);
    }

    public static /* synthetic */ Boolean onWarmupCompleted(Long l) {
        return (Boolean) IAuthTabCallback(219142366, new Object[]{l}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -219142362);
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, setMinimumDpi setminimumdpi) {
        return (Unit) IAuthTabCallback(-313710681, new Object[]{tossAccountHistoryActivity, setminimumdpi}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 313710707);
    }

    public static /* synthetic */ Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, NativeAdView nativeAdView) {
        return (Unit) IAuthTabCallback(-200389131, new Object[]{tossAccountHistoryActivity, nativeAdView}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 200389153);
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossAccountHistoryActivity tossAccountHistoryActivity, int i) {
        return (Unit) IAuthTabCallback(-81674254, new Object[]{tossAccountHistoryActivity, Integer.valueOf(i)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 81674260);
    }

    public static final /* synthetic */ changeResultMsg IAuthTabCallbackDefault(TossAccountHistoryActivity tossAccountHistoryActivity) {
        return (changeResultMsg) IAuthTabCallback(-1720534805, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1720534853);
    }

    private static final CMS_DecSignedAndEnvelopedData IAuthTabCallbackStubProxy(TossAccountHistoryActivity tossAccountHistoryActivity) {
        return (CMS_DecSignedAndEnvelopedData) IAuthTabCallback(-2127595229, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2127595229);
    }

    private final void IEngagementSignalsCallbackStubProxy() throws Throwable {
        IAuthTabCallback(-262761237, new Object[]{this}, ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), 262761239);
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        return (Unit) IAuthTabCallback(-1848609903, new Object[]{setDetectableSize}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1848609919);
    }

    private final CMS_DecSignedAndEnvelopedData IPostMessageService() {
        return (CMS_DecSignedAndEnvelopedData) IAuthTabCallback(1603992995, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1603992956);
    }

    private final Pair<Long, String> ITrustedWebActivityCallback() {
        return (Pair) IAuthTabCallback(1422706435, new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1422706388);
    }

    private static final Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        return (Unit) IAuthTabCallback(2015042306, new Object[]{tossAccountHistoryActivity, deserializeurinullablecollection}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2015042275);
    }

    private static final void extraCallback(TossAccountHistoryActivity tossAccountHistoryActivity) throws Throwable {
        IAuthTabCallback(1649992638, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1649992626);
    }

    private static final void ICustomTabsService(Function1 function1, Object obj) throws Throwable {
        IAuthTabCallback(84867357, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -84867350);
    }

    private static final void newAuthTabSession(Function1 function1, Object obj) throws Throwable {
        IAuthTabCallback(-216487866, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 216487891);
    }

    private static final boolean onExtraCallback(TossAccountHistoryActivity tossAccountHistoryActivity, onDisclaimerClick ondisclaimerclick) {
        return ((Boolean) IAuthTabCallback(-1920621480, new Object[]{tossAccountHistoryActivity, ondisclaimerclick}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1920621525)).booleanValue();
    }

    private static final void writeTypedObject(TossAccountHistoryActivity tossAccountHistoryActivity) throws Throwable {
        IAuthTabCallback(1608371837, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1608371801);
    }

    private static final LinearLayoutManager readTypedObject(TossAccountHistoryActivity tossAccountHistoryActivity) {
        return (LinearLayoutManager) IAuthTabCallback(1246567427, new Object[]{tossAccountHistoryActivity}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1246567392);
    }

    private static final Unit onNavigationEvent(TossAccountHistoryActivity tossAccountHistoryActivity, boolean z, queryCache querycache) {
        return (Unit) IAuthTabCallback(-133444703, new Object[]{tossAccountHistoryActivity, Boolean.valueOf(z), querycache}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 133444722);
    }

    private static final void ICustomTabsServiceDefault(Function1 function1, Object obj) throws Throwable {
        IAuthTabCallback(1957936460, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1957936431);
    }

    private static final void validateRelationship(Function1 function1, Object obj) throws Throwable {
        IAuthTabCallback(1696795280, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1696795247);
    }

    private static final Unit IAuthTabCallbackDefault(TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        return (Unit) IAuthTabCallback(1585054893, new Object[]{tossAccountHistoryActivity, th}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1585054879);
    }

    private static final Unit IAuthTabCallback(int i, TossAccountHistoryActivity tossAccountHistoryActivity, Date date, boolean z, captureComplete capturecomplete) {
        return (Unit) IAuthTabCallback(-96057825, new Object[]{Integer.valueOf(i), tossAccountHistoryActivity, date, Boolean.valueOf(z), capturecomplete}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 96057843);
    }

    private static final Unit onExtraCallback(int i, TossAccountHistoryActivity tossAccountHistoryActivity, Throwable th) {
        return (Unit) IAuthTabCallback(-1626556922, new Object[]{Integer.valueOf(i), tossAccountHistoryActivity, th}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1626556956);
    }

    private static final void IEngagementSignalsCallback(Function1 function1, Object obj) throws Throwable {
        IAuthTabCallback(2085806657, new Object[]{function1, obj}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -2085806649);
    }

    private final void IAuthTabCallbackStub(String str) throws Throwable {
        IAuthTabCallback(-221356077, new Object[]{this, str}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 221356090);
    }

    private final void IAuthTabCallbackDefault(String str) throws Throwable {
        IAuthTabCallback(-2107127153, new Object[]{this, str}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 2107127183);
    }

    private final void onNavigationEvent(long j, String str) throws Throwable {
        IAuthTabCallback(1599774498, new Object[]{this, Long.valueOf(j), str}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) + 1999772863, ComposableSingletons$SelectAccountScreenKt$.ExternalSyntheticLambda2.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 173686553, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1599774475);
    }

    private static final Unit IAuthTabCallbackStubProxy(TossAccountHistoryActivity tossAccountHistoryActivity, SetDetectableSize setDetectableSize) {
        return (Unit) IAuthTabCallback(1087445258, new Object[]{tossAccountHistoryActivity, setDetectableSize}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1087445220);
    }

    private static final void IAuthTabCallback(DialogInterface dialogInterface, int i) throws Throwable {
        IAuthTabCallback(-782857286, new Object[]{dialogInterface, Integer.valueOf(i)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 782857306);
    }

    @Override // viva.republica.toss.account.detail.Hilt_TossAccountHistoryActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCommand + 83;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = isEngagementSignalsApiAvailable + 33;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.detail.Hilt_TossAccountHistoryActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 97;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = isEngagementSignalsApiAvailable + 31;
        extraCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.detail.Hilt_TossAccountHistoryActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCommand + 17;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.detail.Hilt_TossAccountHistoryActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCommand + 109;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void IEngagementSignalsCallbackDefault() {
        ICustomTabsCallbackStubProxy = 478309051;
        onRelationshipValidationResult = -1314471460;
        onUnminimized = -1538795481;
        ICustomTabsCallbackStub = 1146935384;
        ICustomTabsCallback_Parcel = new byte[]{-75, -17, -78, -75, -25, -77, -4, -79, -5, -18, -56, -54, -21, -53, -26, -66, -27, -75, -48, -50, -17, -25, -76, -56, -42, -78, -66, -5, -51, -31, -17, -54, -65, -19, 20, 21, 34, 32, -77, -33, -49, -38, -39, -52, 30, -127, -61, -57, -75, -77, -33, -51, -17, -72, 30, 118, -33, -61, -38, -53, 31, -38, -49, -111, -38, -34, -75, -36, -57, -49, -75, -36, -21, 9, -15, 0, 11, -7, 7, 32, -51, 2, 13, -9, 21, -11, -7, 1, 9, -21, -6, 74, -87, 16, -13, -5, 6, -2, 4, 0, -1, 51, -49, 9, -9, 4, 9, -5, 5, -9, 55, -43, -13, 12, -7, 15, 60, -52, -3, 1, 1, -10, 21, -10, 9, -16, -5, 70, -63, -16, -5, 2, -14, 78, 4, -15, -61, 4, 0, -1, 11, 6, -2, -9, 0, 9, -10, -15, 13, 13, -26, 25, -26, 5, -4, -13, 24, -17, 10, -15, 10, 4, 8, -10, -10, -25, 15, -28, 9, -10, 1, -25, 27, 33, 13, -58, 47, -9, -58, -7, -5, 0, 11, -3, -68, 120, 120, -75, 84, -75, 96, -73, -78, 83, -69, -68, 120, 101, -56, 84, -68, 120, 103, -50, 121, -68, 121, 111, 99, 101, 101, -74, 110, -49, 100, 101, 108, -74, 106, -76, -54, 107, 122, -56, 34, 96, 122, 8, -13, 70, 17, 101, -12, 101, 111, 123, 121, 50, -64, 87, -10, -2, 121, -15, 123, 103, -14, 54, 34, 96, 10, 123, 96, -2, 124, 10, 74, 34, 101, -12, 101, 111, 123, 121, 55, 60, 98, 15, 124, 121, 100, 10, -90, 35, -12, 120, 120, 9, 108, 9, 96, -9, -2, -69, -65, 120, 100, 123, 12, -72, 123, 8, 38, 123, 103, -14, 121, 96, 8, -14, 121, -65, -100, -108, -87, -111, -85, -81, -112, -36, 96, -90, -104, -85, -90, -108, -86, -104, -40, 96, -96, -105, -81, -106, -42, 93, -65, -100, -108, -87, -111, -85, -81, -112, -18, 87, -82, -94, -85, -102, -18, -85, -98, 108, -85, -81, -112, -87, -90, -98, -112, -87, 94, 72, 73, -6, 92, 0, 53, 0, 26, 14, 12, -20, 83, 48, 5, 60, -62, 14, 49, 79, 14, 2, 51, 12, 25, 49, 51, 12, 3, 36, 60, 17, 57, 31, 19, 56, -28, 104, 42, 32, 31, 42, 60, 30, 32, -32, 107, 43, 38, 18, 34, 31, 44, 33, -45, 104, 33, 14, 61, -27, 121, 31, 61, -43, 123, 18, 22, 31, 46, -46, 31, 34, 84, 31, 19, 56, 17, 42, 34, 56, 17, 115, 68, 71, 71, 53, 84, 16, 122, 92, 70, 77, 27, 68, 95, -115, 68, 64, 89, 66, 55, 95, 89, 66, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    }
}
