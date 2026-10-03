package viva.republica.toss.account.savingbox;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.common.collect.Synchronized;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AppLovinAdServiceImplc;
import o.BEROctetStringParser;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BitmapUtilWhenMappings;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DERConstructedSet;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.JsonReaderUnknownNumberParsing;
import o.KeyBoardVisiblePoint;
import o.MapConverter;
import o.NativeAdView;
import o.NetConverter3;
import o.PageShowPoint;
import o.ParamUtils;
import o.RVGroup;
import o.SetDetectableSize;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TitleBarCloseBtnClickInterceptPoint;
import o.TitleBarCloseBtnClickInterceptPointCloseButtonClickCallback;
import o.TypeUtils2;
import o.UST_TSA_VerifyTimeStampTokenWithHash;
import o.UTF8Decoder;
import o.UtilsKtExternalSyntheticLambda17;
import o.access13800;
import o.access14300;
import o.access15400;
import o.checkDeviceBrand;
import o.clearTid;
import o.decodeArrayLoop;
import o.decodeDimensions;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.downloadZip;
import o.findResAndMsg;
import o.getAdService;
import o.getParamImp;
import o.getSizeInBytes;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.initMiniApp;
import o.isVideoAutoplay;
import o.logAndOpenStore;
import o.maybeUpdateAnimatable;
import o.onCollectWhenDestroy;
import o.onDisclaimerClick;
import o.onJsBridgeReady;
import o.onVisit;
import o.readIntokhttp;
import o.sendBroadcastSyncWithPendingBroadcasts;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setTid;
import o.shortValue;
import o.transparentBackground;
import o.varyMatches;
import o.verifyHASH;
import o.writeRaw;
import o.ycxExternalSyntheticLambda1;
import o.zzat;
import o.zzav;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.SelectAccountBottomSheetDialog;
import viva.republica.toss.account.savingbox.SavingAccountEditActivity;
import viva.republica.toss.account.savingbox.SavingAccountEditActivity$;
import viva.republica.toss.account.savingbox.SavingAccountEditActivity$showSetAccountNameDialog$1$;
import viva.republica.toss.main.SchemeWebActivity;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;
import viva.republica.toss.send.SendActivity;
import viva.republica.toss.send.common.BankListBottomSheet;
import viva.republica.toss.widget.dialog.InputBottomSheetDialog;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SavingAccountEditActivity extends Hilt_SavingAccountEditActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static char[] ICustomTabsCallback = null;
    private static int ICustomTabsCallbackDefault = 1;
    private static boolean onActivityLayout = false;
    private static int onActivityResized = 1;
    private static int onMessageChannelReady;
    private static int onMinimized;
    private static boolean onPostMessage;
    private static int readTypedObject;
    private onDisclaimerClick access000;

    @Inject
    public AppLovinAdServiceImplc analyticsHelper;
    private KeyBoardVisiblePoint extraCallback;
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda16
        public final Object invoke() {
            return SavingAccountEditActivity.onExtraCallbackWithResult(this.f$0);
        }
    });
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda17
        public final Object invoke() {
            return SavingAccountEditActivity.IAuthTabCallback(this.f$0);
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda18
        public final Object invoke() {
            return (TextView) SavingAccountEditActivity.IAuthTabCallback(-259159179, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 259159197, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.f$0}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
    });
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda19
        public final Object invoke() {
            return (TdsListRowV1View) SavingAccountEditActivity.IAuthTabCallback(914077228, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -914077226, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.f$0}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda20
        public final Object invoke() {
            return SavingAccountEditActivity.asInterface(this.f$0);
        }
    });
    private final Lazy writeTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda21
        public final Object invoke() {
            return SavingAccountEditActivity.IAuthTabCallbackDefault(this.f$0);
        }
    });
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda22
        public final Object invoke() {
            return (TdsListRowV1View) SavingAccountEditActivity.IAuthTabCallback(315136114, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -315136103, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.f$0}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda23
        public final Object invoke() {
            return SavingAccountEditActivity.onExtraCallback(this.f$0);
        }
    });
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda24
        public final Object invoke() {
            return SavingAccountEditActivity.asBinder(this.f$0);
        }
    });
    private final onNavigationEvent extraCallbackWithResult = new onNavigationEvent();

    static {
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackStub = 8;
        int i = ICustomTabsCallbackDefault + 121;
        onMessageChannelReady = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ LinearLayout IAuthTabCallback(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 89;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            onPostMessage(savingAccountEditActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinearLayout linearLayoutOnPostMessage = onPostMessage(savingAccountEditActivity);
        int i3 = onActivityResized + 67;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 79 / 0;
        }
        return linearLayoutOnPostMessage;
    }

    /* JADX WARN: Type inference failed for: r8v30, types: [android.content.Context, viva.republica.toss.account.savingbox.SavingAccountEditActivity] */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        boolean z;
        initMiniApp initminiapp;
        Function0 function0;
        Function1 function1;
        int i7;
        int i8 = (~((~i2) | i4)) | i;
        int i9 = ~i;
        int i10 = (~(i9 | i4)) | (~(i9 | i2)) | (~(i4 | i2));
        int i11 = (~(i2 | (~i4))) | i9;
        int i12 = i + i4 + i3 + ((-2137991558) * i5) + (111092868 * i6);
        int i13 = i12 * i12;
        int i14 = (((-431794203) * i) - 566755328) + (427185167 * i4) + (i8 * 1717982222) + (1717982222 * i10) + ((-1717982222) * i11) + ((-1290797056) * i3) + ((-1247805440) * i5) + ((-1807745024) * i6) + ((-591921152) * i13);
        int i15 = (i * (-1469267343)) + 1003592187 + (i4 * (-1469268429)) + (i8 * (-362)) + (i10 * (-362)) + (i11 * 362) + (i3 * (-1469268067)) + (i5 * 1951436498) + (i6 * (-746069772)) + (i13 * (-1529348096));
        switch (i14 + (i15 * i15 * 1762131968)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
                DialogInterface dialogInterface = (DialogInterface) objArr[1];
                int i16 = 2 % 2;
                int i17 = onActivityResized + 5;
                onMinimized = i17 % 128;
                if (i17 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(dialogInterface, "");
                    savingAccountEditActivity.extraCallbackWithResult.onWarmupCompleted().onExtraCallback(Boolean.FALSE);
                    onNavigationEvent(savingAccountEditActivity, null, 0, null);
                } else {
                    Intrinsics.checkNotNullParameter(dialogInterface, "");
                    savingAccountEditActivity.extraCallbackWithResult.onWarmupCompleted().onExtraCallback(Boolean.FALSE);
                    onNavigationEvent(savingAccountEditActivity, null, 1, null);
                }
                Unit unit = Unit.INSTANCE;
                int i18 = onMinimized + 27;
                onActivityResized = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 9:
                return onTransact(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return access100(objArr);
            case 13:
                BaseActivity baseActivity = (SavingAccountEditActivity) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i20 = 2 % 2;
                int i21 = onActivityResized + 61;
                onMinimized = i21 % 128;
                if (i21 % 2 != 0) {
                    Intrinsics.checkNotNull(th);
                    z = false;
                    initminiapp = null;
                    function0 = null;
                    function1 = null;
                    i7 = 115;
                } else {
                    Intrinsics.checkNotNull(th);
                    z = true;
                    initminiapp = null;
                    function0 = null;
                    function1 = null;
                    i7 = 28;
                }
                getParamImp.onWarmupCompleted(th, baseActivity, z, initminiapp, function0, function1, i7, (Object) null);
                return Unit.INSTANCE;
            case 14:
                return access000(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                return IAuthTabCallback_Parcel(objArr);
            case 17:
                return writeTypedObject(objArr);
            case 18:
                return extraCallback(objArr);
            case 19:
                return ICustomTabsCallback(objArr);
            case 20:
                final ?? r8 = (SavingAccountEditActivity) objArr[0];
                int i22 = 2 % 2;
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r8, new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda36
                    public final Object invoke(Object obj) {
                        return (Unit) SavingAccountEditActivity.IAuthTabCallback(1287298464, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1287298460, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                    }
                });
                int i23 = onActivityResized + 121;
                onMinimized = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 21:
                return readTypedObject(objArr);
            case 22:
                return extraCallbackWithResult(objArr);
            case 23:
                return onMinimized(objArr);
            case 24:
                return onActivityResized(objArr);
            case 25:
                SavingAccountEditActivity savingAccountEditActivity2 = (SavingAccountEditActivity) objArr[0];
                int i25 = 2 % 2;
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(savingAccountEditActivity2), new asBinder(CoroutineExceptionHandler.extraCallbackWithResult, savingAccountEditActivity2), (setRandomHost) null, savingAccountEditActivity2.new onTransact(((Boolean) objArr[1]).booleanValue(), null), 2, (Object) null);
                int i26 = onMinimized + 51;
                onActivityResized = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 26:
                final SavingAccountEditActivity savingAccountEditActivity3 = (SavingAccountEditActivity) objArr[0];
                final onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) objArr[1];
                int i28 = 2 % 2;
                JsonReaderUnknownNumberParsing<NativeAdView> jsonReaderUnknownNumberParsingOnWarmupCompleted = DERConstructedSet.onNavigationEvent.onWarmupCompleted(ondisclaimerclick.onExtraCallbackWithResult());
                MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted2, "");
                final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda27
                    public final Object invoke(Object obj) {
                        return (Unit) SavingAccountEditActivity.IAuthTabCallback(162556944, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -162556944, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.f$0, (ycxExternalSyntheticLambda1) obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                    }
                };
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted2.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda28
                    public final void accept(Object obj) {
                        SavingAccountEditActivity.asInterface(function12, obj);
                    }
                }).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda29
                    public final void run() {
                        SavingAccountEditActivity.access000(this.f$0);
                    }
                });
                final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda30
                    public final Object invoke(Object obj) {
                        return SavingAccountEditActivity.IAuthTabCallback(this.f$0, ondisclaimerclick, (HashMap) obj);
                    }
                };
                deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda31
                    public final void accept(Object obj) throws Throwable {
                        SavingAccountEditActivity.IAuthTabCallback(-1685415726, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1685415742, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{function13, obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                    }
                };
                final Function1 function14 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda32
                    public final Object invoke(Object obj) {
                        return SavingAccountEditActivity.IAuthTabCallback(this.f$0, (Throwable) obj);
                    }
                };
                deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda33
                    public final void accept(Object obj) throws Throwable {
                        SavingAccountEditActivity.onWarmupCompleted(function14, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
                savingAccountEditActivity3.onNavigationEvent(deserializeurinullablecollectionOnWarmupCompleted);
                int i29 = onMinimized + 27;
                onActivityResized = i29 % 128;
                int i30 = i29 % 2;
                return null;
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = (ycxExternalSyntheticLambda1) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 103;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(savingAccountEditActivity, ycxexternalsyntheticlambda1);
        }
        IAuthTabCallback(savingAccountEditActivity, ycxexternalsyntheticlambda1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 21;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(setDetectableSize);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = onMinimized + 27;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SavingAccountEditActivity savingAccountEditActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(savingAccountEditActivity, dialogInterface);
        int i4 = onActivityResized + 93;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SavingAccountEditActivity savingAccountEditActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = onActivityResized + 9;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(252051956, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -252051943, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, th}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onMinimized + 13;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SavingAccountEditActivity savingAccountEditActivity, onDisclaimerClick ondisclaimerclick, HashMap map) {
        int i = 2 % 2;
        int i2 = onMinimized + 55;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(savingAccountEditActivity, ondisclaimerclick, map);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(savingAccountEditActivity, ondisclaimerclick, map);
        int i3 = onActivityResized + 107;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 17;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, setDetectableSize);
        int i4 = onActivityResized + 115;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, SavingAccountEditActivity savingAccountEditActivity, TypeUtils2 typeUtils2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onMinimized + 115;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(z), savingAccountEditActivity, typeUtils2};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 == 0) {
            unit = (Unit) IAuthTabCallback(1607707894, iOnWarmupCompleted, iOnWarmupCompleted2, -1607707871, iOnWarmupCompleted3, objArr, iOnWarmupCompleted4);
            int i4 = 31 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(1607707894, iOnWarmupCompleted, iOnWarmupCompleted2, -1607707871, iOnWarmupCompleted3, objArr, iOnWarmupCompleted4);
        }
        int i5 = onMinimized + 109;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(SavingAccountEditActivity savingAccountEditActivity, TdsListRowV1View tdsListRowV1View, CompoundButton compoundButton, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(savingAccountEditActivity, tdsListRowV1View, compoundButton, z);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
    }

    public static /* synthetic */ TdsListRowV1View IAuthTabCallbackDefault(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 99;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewOnRelationshipValidationResult = onRelationshipValidationResult(savingAccountEditActivity);
        int i4 = onMinimized + 3;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsListRowV1ViewOnRelationshipValidationResult;
        }
        throw null;
    }

    public static /* synthetic */ BitmapUtilWhenMappings IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        BitmapUtilWhenMappings bitmapUtilWhenMappingsICustomTabsCallback = ICustomTabsCallback(function1, obj);
        int i4 = onActivityResized + 59;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return bitmapUtilWhenMappingsICustomTabsCallback;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(SavingAccountEditActivity savingAccountEditActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 11;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady(savingAccountEditActivity);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onActivityResized + 73;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 67;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady(function1, obj);
        int i4 = onMinimized + 51;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 103;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = onMinimized + 27;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void access000(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 83;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(savingAccountEditActivity);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void access100(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 31;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(2035930335, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -2035930323, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{function1, obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onActivityResized + 33;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ TdsListRowV1View asBinder(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewWriteTypedObject = writeTypedObject(savingAccountEditActivity);
        int i4 = onActivityResized + 61;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsListRowV1ViewWriteTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        int i4 = onMinimized + 3;
        onActivityResized = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ TdsListRowV1View asInterface(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 27;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallback(savingAccountEditActivity);
        }
        extraCallback(savingAccountEditActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        decodeDimensions decodedimensions = (decodeDimensions) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 57;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        BitmapUtilWhenMappings bitmapUtilWhenMappings = (BitmapUtilWhenMappings) IAuthTabCallback(-2039804929, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 2039804946, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{decodedimensions}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onActivityResized + 79;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return bitmapUtilWhenMappings;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 45;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        int i4 = onActivityResized + 99;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 27;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback(savingAccountEditActivity);
        }
        ICustomTabsCallback(savingAccountEditActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 57;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(function1, obj);
        int i4 = onActivityResized + 11;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 61;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View typedObject = readTypedObject(savingAccountEditActivity);
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return typedObject;
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 113;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onActivityResized(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) throws Throwable {
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onTransact(savingAccountEditActivity, view);
        int i4 = onActivityResized + 65;
        onMinimized = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TdsListRowV1View onExtraCallback(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 35;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewExtraCallbackWithResult = extraCallbackWithResult(savingAccountEditActivity);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = onActivityResized + 3;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return tdsListRowV1ViewExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityResized + 1;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-185597679, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 185597687, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, dialogInterface}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onMinimized + 75;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, BitmapUtilWhenMappings bitmapUtilWhenMappings) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 3;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(savingAccountEditActivity, bitmapUtilWhenMappings);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(savingAccountEditActivity, bitmapUtilWhenMappings);
        int i3 = onActivityResized + 115;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, onDisclaimerClick ondisclaimerclick, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 97;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(savingAccountEditActivity, ondisclaimerclick, dialogInterface);
        int i4 = onActivityResized + 37;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, onDisclaimerClick ondisclaimerclick, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onMinimized + 69;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(savingAccountEditActivity, ondisclaimerclick, commonModule_setLeftEdgeTouchEnabled);
        int i4 = onActivityResized + 47;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ View onExtraCallbackWithResult(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onActivityLayout(savingAccountEditActivity);
            throw null;
        }
        View viewOnActivityLayout = onActivityLayout(savingAccountEditActivity);
        int i3 = onMinimized + 119;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            return viewOnActivityLayout;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 15;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewOnActivityResized = onActivityResized(savingAccountEditActivity);
        int i4 = onMinimized + 31;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return tdsListRowV1ViewOnActivityResized;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(tdsListRowV1View, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(tdsListRowV1View, view);
        int i3 = onMinimized + 11;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        int i4 = onActivityResized + 13;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SavingAccountEditActivity savingAccountEditActivity, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(savingAccountEditActivity, th);
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SavingAccountEditActivity savingAccountEditActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onMinimized + 99;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(savingAccountEditActivity, commonModule_setLeftEdgeTouchEnabled);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(savingAccountEditActivity, commonModule_setLeftEdgeTouchEnabled);
        int i3 = onActivityResized + 83;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SavingAccountEditActivity savingAccountEditActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 1;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(savingAccountEditActivity, view);
        int i4 = onActivityResized + 21;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 95;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-1285837126, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1285837141, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{setDetectableSize}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onMinimized + 47;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(SavingAccountEditActivity savingAccountEditActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityResized + 105;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(savingAccountEditActivity, dialogInterface);
        }
        onWarmupCompleted(savingAccountEditActivity, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SavingAccountEditActivity savingAccountEditActivity, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(savingAccountEditActivity, th);
        int i4 = onActivityResized + 111;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(SavingAccountEditActivity savingAccountEditActivity, decodeDimensions decodedimensions) {
        int i = 2 % 2;
        int i2 = onActivityResized + 33;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(savingAccountEditActivity, decodedimensions);
        int i4 = onActivityResized + 91;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(SavingAccountEditActivity savingAccountEditActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 15;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        asBinder(savingAccountEditActivity, view);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 1;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallbackDefault(savingAccountEditActivity, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onActivityResized + 91;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 123;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = onActivityResized + 109;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(savingAccountEditActivity, commonModule_setLeftEdgeTouchEnabled);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 55;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(setDetectableSize);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SavingAccountEditActivity savingAccountEditActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = onActivityResized + 125;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(savingAccountEditActivity, th);
        int i4 = onMinimized + 15;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 17;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Object[] objArr = {function1, obj};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 == 0) {
            IAuthTabCallback(1522616024, iOnWarmupCompleted, iOnWarmupCompleted2, -1522616010, iOnWarmupCompleted3, objArr, iOnWarmupCompleted4);
            throw null;
        }
        IAuthTabCallback(1522616024, iOnWarmupCompleted, iOnWarmupCompleted2, -1522616010, iOnWarmupCompleted3, objArr, iOnWarmupCompleted4);
        int i4 = onActivityResized + 99;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(SavingAccountEditActivity savingAccountEditActivity, View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        asInterface(savingAccountEditActivity, view);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) throws Throwable {
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = onMinimized + 113;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(gettypedexportedconstants, savingAccountEditActivity, view);
        int i4 = onActivityResized + 115;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onActivityResized + 35;
        int i3 = i2 % 128;
        onMinimized = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 23;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return 1007791L;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallback implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();

        public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class asBinder extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ SavingAccountEditActivity onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, SavingAccountEditActivity savingAccountEditActivity) {
            super(onwarmupcompleted);
            this.onExtraCallbackWithResult = savingAccountEditActivity;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            zzav.IAuthTabCallback(zzat.onExtraCallback(), th, onVisit.IAuthTabCallback(this.onExtraCallbackWithResult), false, 4, (Object) null);
        }
    }

    public static final class IAuthTabCallbackStub<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public IAuthTabCallbackStub(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<decodeDimensions> apply(writeRaw<BaseApiResponse<decodeDimensions>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass4 anonymousClass4 = new Function1<BaseApiResponse<decodeDimensions>, deserializeIp<? extends decodeDimensions>>() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity.IAuthTabCallbackStub.4
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends decodeDimensions> invoke(BaseApiResponse<decodeDimensions> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = decodeDimensions.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass4) { // from class: o.UtilsKtExternalSyntheticLambda17$onNewIntent
                private final /* synthetic */ Function1 IAuthTabCallback;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass4, "");
                    this.IAuthTabCallback = anonymousClass4;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.IAuthTabCallback.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
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

    public static final /* synthetic */ onDisclaimerClick IAuthTabCallbackStubProxy(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onDisclaimerClick ondisclaimerclick = savingAccountEditActivity.access000;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return ondisclaimerclick;
    }

    public static final /* synthetic */ TextView IAuthTabCallback_Parcel(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 99;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return savingAccountEditActivity.ICustomTabsServiceDefault();
        }
        savingAccountEditActivity.ICustomTabsServiceDefault();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
        onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 39;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        savingAccountEditActivity.access000 = ondisclaimerclick;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 39;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ onNavigationEvent access100(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationevent = savingAccountEditActivity.extraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return onnavigationevent;
    }

    public static final /* synthetic */ void getInterfaceDescriptor(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 7;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        savingAccountEditActivity.IPostMessageServiceDefault();
        int i4 = onMinimized + 21;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(SavingAccountEditActivity savingAccountEditActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onMinimized + 115;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        savingAccountEditActivity.onNavigationEvent(deserializeurinullablecollection);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onMinimized + 23;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(SavingAccountEditActivity savingAccountEditActivity, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 69;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        savingAccountEditActivity.onExtraCallbackWithResult(z);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = onMinimized + 25;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
    }

    private final View IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 7;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        View view = (View) this.IAuthTabCallbackStubProxy.getValue();
        if (i3 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final View onActivityLayout(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 115;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = savingAccountEditActivity.findViewById(R.id.loading_layout);
        int i4 = onMinimized + 13;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return viewFindViewById;
    }

    private static final LinearLayout onPostMessage(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 3;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = (LinearLayout) savingAccountEditActivity.findViewById(R.id.edit_account_name);
        int i4 = onActivityResized + 33;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return linearLayout;
    }

    private final LinearLayout writeTypedList() {
        int i = 2 % 2;
        int i2 = onMinimized + 13;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) this.access100.getValue();
        int i3 = onActivityResized + 115;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return linearLayout;
    }

    private static final TextView ICustomTabsCallback(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 33;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = (TextView) savingAccountEditActivity.findViewById(R.id.account_name);
        int i4 = onActivityResized + 89;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return textView;
    }

    private final TextView ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = (TextView) this.onTransact.getValue();
        int i4 = onMinimized + 35;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return textView;
        }
        throw null;
    }

    private final TdsListRowV1View access200() {
        int i = 2 % 2;
        int i2 = onMinimized + 77;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) this.getInterfaceDescriptor.getValue();
        if (i3 != 0) {
            return tdsListRowV1View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TdsListRowV1View onActivityResized(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 31;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewFindViewById = savingAccountEditActivity.findViewById(R.id.row_guide);
        if (i3 == 0) {
            return tdsListRowV1ViewFindViewById;
        }
        throw null;
    }

    private static final TdsListRowV1View extraCallback(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 69;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewFindViewById = savingAccountEditActivity.findViewById(R.id.row_account_saving);
        if (i3 != 0) {
            return tdsListRowV1ViewFindViewById;
        }
        throw null;
    }

    private final TdsListRowV1View setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) this.asInterface.getValue();
        int i4 = onMinimized + 65;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return tdsListRowV1View;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) savingAccountEditActivity.writeTypedObject.getValue();
        int i4 = onMinimized + 67;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsListRowV1View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TdsListRowV1View onRelationshipValidationResult(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 63;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewFindViewById = savingAccountEditActivity.findViewById(R.id.row_withdraw_account);
        int i4 = onActivityResized + 95;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return tdsListRowV1ViewFindViewById;
    }

    private static final TdsListRowV1View readTypedObject(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 61;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewFindViewById = savingAccountEditActivity.findViewById(R.id.row_saving_amount_level);
        if (i3 == 0) {
            return tdsListRowV1ViewFindViewById;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsListRowV1View validateRelationship() {
        TdsListRowV1View tdsListRowV1View;
        int i = 2 % 2;
        int i2 = onMinimized + 83;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            tdsListRowV1View = (TdsListRowV1View) this.asBinder.getValue();
            int i3 = 70 / 0;
        } else {
            tdsListRowV1View = (TdsListRowV1View) this.asBinder.getValue();
        }
        int i4 = onMinimized + 69;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsListRowV1View;
        }
        throw null;
    }

    private static final TdsListRowV1View extraCallbackWithResult(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewFindViewById = savingAccountEditActivity.findViewById(R.id.row_account_saving_period);
        if (i3 == 0) {
            return tdsListRowV1ViewFindViewById;
        }
        throw null;
    }

    private final TdsListRowV1View updateVisuals() {
        int i = 2 % 2;
        int i2 = onActivityResized + 73;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) this.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return tdsListRowV1View;
    }

    private final TdsListRowV1View ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityResized + 13;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) this.IAuthTabCallback_Parcel.getValue();
        int i4 = onActivityResized + 23;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsListRowV1View;
        }
        throw null;
    }

    private static final TdsListRowV1View writeTypedObject(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onMinimized + 29;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1ViewFindViewById = savingAccountEditActivity.findViewById(R.id.row_delete);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return tdsListRowV1ViewFindViewById;
    }

    public final AppLovinAdServiceImplc onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 79;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        AppLovinAdServiceImplc appLovinAdServiceImplc = this.analyticsHelper;
        if (appLovinAdServiceImplc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 53;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return appLovinAdServiceImplc;
    }

    public static final class asInterface implements BankListBottomSheet.IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 7478;
        private static int IAuthTabCallbackStub = 0;
        private static char onExtraCallback = 44459;
        private static char onExtraCallbackWithResult = 'J';
        private static int onTransact = 1;
        private static char onWarmupCompleted = 12442;

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i4 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i5 = $11 + 7;
                $10 = i5 % 128;
                int i6 = 58224;
                if (i5 % 2 != 0) {
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent / i4];
                    i2 = 1;
                } else {
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    i2 = i4;
                }
                while (i2 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i4];
                    int i7 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i8 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[1] = Integer.valueOf(i7);
                        objArr2[i4] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", i4);
                            int iResolveSize = View.resolveSize(i4, i4) + 10;
                            int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12433;
                            Class[] clsArr = new Class[4];
                            clsArr[i4] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, iResolveSize, i9, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, (ViewConfiguration.getLongPressTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i2++;
                        cArr3 = cArr4;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16062 - AndroidCharacter.getMirror('0')), Drawable.resolveOpacity(0, 0) + 14, 19901 - (ViewConfiguration.getScrollBarSize() >> 8), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i4 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i10 = $11 + 33;
            $10 = i10 % 128;
            if (i10 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i11 = 32 / 0;
                objArr[0] = str;
            }
        }

        asInterface() {
        }

        @Override // viva.republica.toss.send.common.BankListBottomSheet.IAuthTabCallback
        public void onExtraCallbackWithResult(String str, String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 19;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            DERConstructedSet dERConstructedSet = DERConstructedSet.onNavigationEvent;
            SavingAccountEditActivity savingAccountEditActivity = SavingAccountEditActivity.this;
            Object[] objArr = new Object[1];
            a(new char[]{60943, 38276, 41043, 52531, 27363, 1853, 23800, 4375, 21265, 27505, 16210, 62887, 63182, 62498, 23800, 4375, 1418, 53327, 52085, 32977, 30515, 11525, 53980, 11517}, 24 - Gravity.getAbsoluteGravity(0, 0), objArr);
            DERConstructedSet.onExtraCallback(dERConstructedSet, savingAccountEditActivity, str, null, null, null, "SAVING_BOX", 8951, null, null, ((String) objArr[0]).intern(), false, "SAVING_BOX", false, null, null, 30108, null);
            int i4 = onTransact + 59;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.account.savingbox.Hilt_SavingAccountEditActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            setContentView(R.layout.activity_toss_saving_account_edit);
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            String str = "";
            if (supportActionBar != null) {
                supportActionBar.onExtraCallbackWithResult("");
                supportActionBar.onNavigationEvent(true);
            }
            String stringExtra = getIntent().getStringExtra("keyTossAccountId");
            if (stringExtra != null) {
                int i3 = onActivityResized + 121;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                str = stringExtra;
            }
            onDisclaimerClick ondisclaimerclickIAuthTabCallback = DERConstructedSet.IAuthTabCallback(str);
            this.access000 = ondisclaimerclickIAuthTabCallback;
            if (ondisclaimerclickIAuthTabCallback == null) {
                finish();
                return;
            }
            ((TdsListRowV1View) IAuthTabCallback(1720071857, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1720071851, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).setRightText1MaxLines(2);
            onSessionEnded();
            onVerticalScrollEvent();
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_toss_saving_account_edit);
        getSupportActionBar();
        throw null;
    }

    private final BitmapUtilWhenMappings ICustomTabsServiceStub() {
        decodeDimensions decodedimensions;
        int i = 2 % 2;
        int i2 = onActivityResized + 9;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onDisclaimerClick ondisclaimerclick = this.access000;
            if (ondisclaimerclick == null || (decodedimensions = (decodeDimensions) BEROctetStringParser.Companion.onWarmupCompleted(ondisclaimerclick).onExtraCallback().onExtraCallback()) == null) {
                int i3 = onActivityResized + 77;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            int i5 = onActivityResized + 69;
            onMinimized = i5 % 128;
            if (i5 % 2 == 0) {
                return decodedimensions.onWarmupCompleted();
            }
            BitmapUtilWhenMappings bitmapUtilWhenMappingsOnWarmupCompleted = decodedimensions.onWarmupCompleted();
            int i6 = 99 / 0;
            return bitmapUtilWhenMappingsOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static final BitmapUtilWhenMappings ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 27;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BitmapUtilWhenMappings bitmapUtilWhenMappings = (BitmapUtilWhenMappings) function1.invoke(obj);
        int i4 = onActivityResized + 43;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return bitmapUtilWhenMappings;
        }
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        BitmapUtilWhenMappings bitmapUtilWhenMappingsOnWarmupCompleted;
        decodeDimensions decodedimensions = (decodeDimensions) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 57;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decodedimensions, "");
            bitmapUtilWhenMappingsOnWarmupCompleted = decodedimensions.onWarmupCompleted();
            int i3 = 67 / 0;
        } else {
            Intrinsics.checkNotNullParameter(decodedimensions, "");
            bitmapUtilWhenMappingsOnWarmupCompleted = decodedimensions.onWarmupCompleted();
        }
        int i4 = onMinimized + 3;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return bitmapUtilWhenMappingsOnWarmupCompleted;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 63;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(SavingAccountEditActivity savingAccountEditActivity, BitmapUtilWhenMappings bitmapUtilWhenMappings) throws Throwable {
        KeyBoardVisiblePoint keyBoardVisiblePointOnWarmupCompleted;
        int i = 2 % 2;
        if (bitmapUtilWhenMappings != null) {
            keyBoardVisiblePointOnWarmupCompleted = bitmapUtilWhenMappings.onWarmupCompleted();
            int i2 = onActivityResized + 101;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = onMinimized + 55;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 3;
            }
            keyBoardVisiblePointOnWarmupCompleted = null;
        }
        IAuthTabCallback(-192262475, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 192262480, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, keyBoardVisiblePointOnWarmupCompleted}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        savingAccountEditActivity.onExtraCallbackWithResult(bitmapUtilWhenMappings);
        return Unit.INSTANCE;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 119;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        int i5 = onActivityResized + 99;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit asBinder(SavingAccountEditActivity savingAccountEditActivity, Throwable th) throws Throwable {
        KeyBoardVisiblePoint keyBoardVisiblePointOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onMinimized + 79;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        BitmapUtilWhenMappings bitmapUtilWhenMappingsICustomTabsServiceStub = savingAccountEditActivity.ICustomTabsServiceStub();
        if (bitmapUtilWhenMappingsICustomTabsServiceStub != null) {
            int i4 = onActivityResized + 9;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            keyBoardVisiblePointOnWarmupCompleted = bitmapUtilWhenMappingsICustomTabsServiceStub.onWarmupCompleted();
        } else {
            keyBoardVisiblePointOnWarmupCompleted = null;
        }
        IAuthTabCallback(-192262475, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 192262480, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, keyBoardVisiblePointOnWarmupCompleted}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        savingAccountEditActivity.onExtraCallbackWithResult(savingAccountEditActivity.ICustomTabsServiceStub());
        return Unit.INSTANCE;
    }

    private final void onVerticalScrollEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 123;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        onDisclaimerClick ondisclaimerclick = this.access000;
        if (ondisclaimerclick != null) {
            writeRaw<decodeDimensions> writerawOnExtraCallbackWithResult = BEROctetStringParser.Companion.onWarmupCompleted(ondisclaimerclick).onExtraCallbackWithResult();
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda38
                public final Object invoke(Object obj) {
                    return (BitmapUtilWhenMappings) SavingAccountEditActivity.IAuthTabCallback(-1056047755, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1056047762, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{(decodeDimensions) obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                }
            };
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda39
                public final Object apply(Object obj) {
                    return SavingAccountEditActivity.IAuthTabCallbackDefault(function1, obj);
                }
            }).IAuthTabCallback(NetConverter3.onExtraCallback());
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda40
                public final Object invoke(Object obj) {
                    return SavingAccountEditActivity.onExtraCallback(this.f$0, (BitmapUtilWhenMappings) obj);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda41
                public final void accept(Object obj) {
                    SavingAccountEditActivity.onTransact(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda42
                public final Object invoke(Object obj) {
                    return SavingAccountEditActivity.onNavigationEvent(this.f$0, (Throwable) obj);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda43
                public final void accept(Object obj) throws Throwable {
                    SavingAccountEditActivity.IAuthTabCallback(-628192759, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 628192769, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{function13, obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
            return;
        }
        int i5 = i2 + 113;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackStub(java.lang.Object[] r5) {
        /*
            r0 = 0
            r1 = r5[r0]
            viva.republica.toss.account.savingbox.SavingAccountEditActivity r1 = (viva.republica.toss.account.savingbox.SavingAccountEditActivity) r1
            r2 = 1
            r5 = r5[r2]
            o.KeyBoardVisiblePoint r5 = (o.KeyBoardVisiblePoint) r5
            r2 = 2
            int r3 = r2 % r2
            int r3 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r3 = r3 + 81
            int r4 = r3 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r4
            int r3 = r3 % r2
            if (r3 != 0) goto L1e
            r3 = 58
            int r3 = r3 / r0
            if (r5 == 0) goto L34
            goto L20
        L1e:
            if (r5 == 0) goto L34
        L20:
            r1.extraCallback = r5
            viva.republica.toss.account.savingbox.SavingAccountEditActivity$onNavigationEvent r0 = r1.extraCallbackWithResult
            o.setTid r0 = r0.IAuthTabCallback()
            r0.onExtraCallback(r5)
            int r5 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized
            int r5 = r5 + 47
            int r0 = r5 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized = r0
            int r5 = r5 % r2
        L34:
            int r5 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r5 = r5 + 25
            int r0 = r5 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r0
            int r5 = r5 % r2
            r0 = 0
            if (r5 == 0) goto L41
            return r0
        L41:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.SavingAccountEditActivity.IAuthTabCallbackStub(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(o.BitmapUtilWhenMappings r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            android.view.View r1 = r12.IEngagementSignalsCallback()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3 = 8
            r1.setVisibility(r3)
            o.onDisclaimerClick r1 = r12.access000
            if (r1 == 0) goto Lde
            android.widget.TextView r4 = r12.ICustomTabsServiceDefault()
            java.lang.String r1 = r1.onActivityResized()
            r4.setText(r1)
            java.lang.Object[] r10 = new java.lang.Object[]{r12}
            int r6 = im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted()
            int r7 = im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted()
            int r9 = im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted()
            int r11 = im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted()
            r5 = 1720071857(0x668636b1, float:3.16903E23)
            r8 = -1720071851(0xffffffff9979c955, float:-1.2913657E-23)
            java.lang.Object r1 = IAuthTabCallback(r5, r6, r7, r8, r9, r10, r11)
            im.toss.tds.view.component.compound.listrow.TdsListRowV1View r1 = (im.toss.tds.view.component.compound.listrow.TdsListRowV1View) r1
            o.KeyBoardVisiblePoint r4 = r12.extraCallback
            if (r4 == 0) goto L4a
            java.lang.String r4 = r4.asBinder()
            if (r4 != 0) goto L53
        L4a:
            int r4 = viva.republica.toss.R.string.app_account_savingbox___bd9f1c8b4c
            java.lang.String r4 = r12.getString(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
        L53:
            r1.setRightText1(r4)
            r1 = 0
            if (r13 == 0) goto L69
            int r4 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized
            int r4 = r4 + 19
            int r5 = r4 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized = r5
            int r4 = r4 % r0
            boolean r4 = r13.onNavigationEvent()
            r5 = 1
            if (r4 == r5) goto L6a
        L69:
            r5 = r1
        L6a:
            viva.republica.toss.account.savingbox.SavingAccountEditActivity$onNavigationEvent r4 = r12.extraCallbackWithResult
            o.setTid r4 = r4.onWarmupCompleted()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r4.onExtraCallback(r6)
            im.toss.tds.view.component.compound.listrow.TdsListRowV1View r4 = r12.setEngagementSignalsCallback()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            r2 = 0
            im.toss.tds.view.component.compound.listrow.TdsListRowV1View.setRightSwitchChecked$default(r4, r5, r1, r0, r2)
            im.toss.tds.view.component.compound.listrow.TdsListRowV1View r4 = r12.validateRelationship()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            if (r5 == 0) goto La2
            int r6 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r7 = r6 + 79
            int r8 = r7 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r8
            int r7 = r7 % r0
            int r6 = r6 + 115
            int r7 = r6 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r7
            int r6 = r6 % r0
            if (r6 != 0) goto La0
            r6 = 4
            int r6 = r6 % 5
        La0:
            r6 = r1
            goto La3
        La2:
            r6 = r3
        La3:
            r4.setVisibility(r6)
            int r6 = viva.republica.toss.R.string.app_account_savingbox___5574b1aed4
            if (r13 == 0) goto Lb4
            o.setUseDecodeBufferHelper r13 = r13.onTransact()
            if (r13 == 0) goto Lb4
            java.lang.String r2 = r13.toLongText()
        Lb4:
            java.lang.Object[] r13 = new java.lang.Object[]{r2}
            java.lang.String r13 = r12.getString(r6, r13)
            r4.setRightText1(r13)
            im.toss.tds.view.component.compound.listrow.TdsListRowV1View r13 = r12.updateVisuals()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            if (r5 == 0) goto Ld2
            int r2 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized
            int r2 = r2 + 107
            int r3 = r2 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized = r3
            int r2 = r2 % r0
            r3 = r1
        Ld2:
            r13.setVisibility(r3)
            o.DERSet r0 = o.DERSet.onExtraCallback
            java.lang.String r0 = r0.onBackPressedInput_delegatelambda0()
            r13.setRightText1(r0)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.SavingAccountEditActivity.onExtraCallbackWithResult(o.BitmapUtilWhenMappings):void");
    }

    private static final void asBinder(SavingAccountEditActivity savingAccountEditActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 49;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(248896172, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132032303).substring(0, 2).length() + 1605538550, RVGroup.onWarmupCompleted(), -248896169, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 1486437703);
            obj.hashCode();
            throw null;
        }
        IAuthTabCallback(248896172, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132032303).substring(0, 2).length() + 1605538550, RVGroup.onWarmupCompleted(), -248896169, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 1486437703);
        int i3 = onMinimized + 19;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int length;
        char[] cArr2;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = ICustomTabsCallback;
        if (cArr3 != null) {
            int i7 = $10 + 109;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 0;
            }
            while (i4 < length) {
                int i8 = $10 + 43;
                $11 = i8 % 128;
                int i9 = i8 % i5;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 77 - View.MeasureSpec.getSize(0), 20952 - KeyEvent.normalizeMetaState(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i5 = 2;
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
        Object[] objArr3 = {Integer.valueOf(readTypedObject)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 74 - TextUtils.lastIndexOf("", '0', 0), 16037 - TextUtils.indexOf("", "", 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i10 = 1052772399;
        if (onPostMessage) {
            int i11 = $11 + 93;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i10);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 63, (ViewConfiguration.getLongPressTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i10 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onActivityLayout) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i13 = $11 + 73;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] >> iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted - 1;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i14 = $11 + 45;
        $10 = i14 % 128;
        if (i14 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        }
        char[] cArr6 = new char[i3];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i15 = $11 + 33;
        $10 = i15 % 128;
        int i16 = i15 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 63 - View.combineMeasuredStates(0, 0), 12214 - (ViewConfiguration.getPressedStateDuration() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onTransact(SavingAccountEditActivity savingAccountEditActivity, View view) throws Throwable {
        int i = 2 % 2;
        SchemeWebActivity.onExtraCallback onextracallback = SchemeWebActivity.Companion;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-106, -107, -108, -109, -110, -111, -122, -124, -114, -112, -113, -126, -122, -114, -120, -115, -124, -124, -116, -126, -115, -124, -119, -116, -117, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 175 - AndroidCharacter.getMirror('0'), objArr);
        savingAccountEditActivity.startActivity(SchemeWebActivity.onExtraCallback.onExtraCallback(onextracallback, savingAccountEditActivity, ((String) objArr[0]).intern(), null, null, false, false, 60, null));
        ConvertByteArrayToFloatArray.onExtraCallback(1007793L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda25
            public final Object invoke(Object obj) {
                return SavingAccountEditActivity.onExtraCallbackWithResult((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onMinimized + 7;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMinimized + 17;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", "info");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "info");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMinimized + 81;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(SavingAccountEditActivity savingAccountEditActivity, TdsListRowV1View tdsListRowV1View, CompoundButton compoundButton, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 63;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            Intrinsics.areEqual(Boolean.valueOf(z), savingAccountEditActivity.extraCallbackWithResult.onWarmupCompleted().onWarmupCompleted());
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(compoundButton, "");
        if (Intrinsics.areEqual(Boolean.valueOf(z), savingAccountEditActivity.extraCallbackWithResult.onWarmupCompleted().onWarmupCompleted())) {
            return;
        }
        Intrinsics.checkNotNull(tdsListRowV1View);
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View, !z, false, 2, (Object) null);
        if (!z) {
            IAuthTabCallback(-34603647, RVGroup.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 34603667, RVGroup.onWarmupCompleted(), new Object[]{savingAccountEditActivity}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        } else {
            int i3 = onActivityResized + 81;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            savingAccountEditActivity.onGreatestScrollPercentageIncreased();
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1007795L, false, (String) null, (Map) null, new SavingAccountEditActivity$.ExternalSyntheticLambda34(z), 14, (Object) null);
    }

    private static final Unit onWarmupCompleted(boolean z, SetDetectableSize setDetectableSize) {
        String str;
        int i = 2 % 2;
        int i2 = onMinimized + 39;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("rule_type", "savingbox");
        if (z) {
            int i4 = onMinimized + 11;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            str = "on";
        } else {
            str = "off";
        }
        setDetectableSize.onExtraCallback("act_type", str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f A[PHI: r10
      0x005f: PHI (r10v3 im.toss.tds.view.component.atom.switches.TdsSwitchV1View) = 
      (r10v2 im.toss.tds.view.component.atom.switches.TdsSwitchV1View)
      (r10v11 im.toss.tds.view.component.atom.switches.TdsSwitchV1View)
     binds: [B:8:0x005d, B:5:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(im.toss.tds.view.component.compound.listrow.TdsListRowV1View r10, android.view.View r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L3a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r10}
            int r8 = com.google.common.collect.Synchronized.SynchronizedAsMapEntries.onNavigationEvent()
            int r6 = com.google.common.collect.Synchronized.SynchronizedAsMapEntries.onNavigationEvent()
            int r9 = com.google.common.collect.Synchronized.SynchronizedAsMapEntries.onNavigationEvent()
            int r5 = com.google.common.collect.Synchronized.SynchronizedAsMapEntries.onNavigationEvent()
            r4 = -1467355518(0xffffffffa889ee82, float:-1.5313492E-14)
            r7 = 1467355519(0x5776117f, float:2.70555E14)
            java.lang.Object r10 = im.toss.tds.view.component.compound.listrow.TdsListRowV1View.IAuthTabCallback(r3, r4, r5, r6, r7, r8, r9)
            im.toss.tds.view.component.atom.switches.TdsSwitchV1View r10 = (im.toss.tds.view.component.atom.switches.TdsSwitchV1View) r10
            r11 = 96
            int r11 = r11 / 0
            if (r10 == 0) goto L6f
            goto L5f
        L3a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            int r6 = com.google.common.collect.Synchronized.SynchronizedAsMapEntries.onNavigationEvent()
            int r4 = com.google.common.collect.Synchronized.SynchronizedAsMapEntries.onNavigationEvent()
            int r7 = com.google.common.collect.Synchronized.SynchronizedAsMapEntries.onNavigationEvent()
            int r3 = com.google.common.collect.Synchronized.SynchronizedAsMapEntries.onNavigationEvent()
            r2 = -1467355518(0xffffffffa889ee82, float:-1.5313492E-14)
            r5 = 1467355519(0x5776117f, float:2.70555E14)
            java.lang.Object r10 = im.toss.tds.view.component.compound.listrow.TdsListRowV1View.IAuthTabCallback(r1, r2, r3, r4, r5, r6, r7)
            im.toss.tds.view.component.atom.switches.TdsSwitchV1View r10 = (im.toss.tds.view.component.atom.switches.TdsSwitchV1View) r10
            if (r10 == 0) goto L6f
        L5f:
            r10.toggle()
            int r10 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r10 = r10 + 17
            int r11 = r10 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r11
            int r10 = r10 % r0
            if (r10 != 0) goto L6f
            r10 = 5
            int r10 = r10 / r0
        L6f:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.SavingAccountEditActivity.onNavigationEvent(im.toss.tds.view.component.compound.listrow.TdsListRowV1View, android.view.View):kotlin.Unit");
    }

    private static final void IAuthTabCallbackStub(SavingAccountEditActivity savingAccountEditActivity, View view) throws Throwable {
        int i = 2 % 2;
        IAuthTabCallback(1183638788, RVGroup.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1183638763, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132028298).substring(0, 2).length() - 1789955613, new Object[]{savingAccountEditActivity, false}, RVGroup.onWarmupCompleted());
        ConvertByteArrayToFloatArray.onExtraCallback(1007793L, false, (String) null, (Map) null, new SavingAccountEditActivity$.ExternalSyntheticLambda44(), 14, (Object) null);
        int i2 = onMinimized + 67;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 119;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", "linked_account");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "linked_account");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMinimized + 1;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallbackDefault(SavingAccountEditActivity savingAccountEditActivity, View view) {
        int i = 2 % 2;
        savingAccountEditActivity.startActivityForResult(AutoSavingBoxAdjustSavingLevelActivity.Companion.onExtraCallbackWithResult(savingAccountEditActivity), 8953);
        ConvertByteArrayToFloatArray.onExtraCallback(1007797L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return SavingAccountEditActivity.onWarmupCompleted((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = onMinimized + 17;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onTransact(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 91;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("rule_type", "savingbox");
        setDetectableSize.onExtraCallback("button_type", "saving_amt");
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 25;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onSessionEnded() {
        int i = 2 % 2;
        LinearLayout linearLayoutWriteTypedList = writeTypedList();
        ParamUtils paramUtils = ParamUtils.NORMAL;
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = transparentBackground.onWarmupCompleted(linearLayoutWriteTypedList, paramUtils, new SavingAccountEditActivity$.ExternalSyntheticLambda9(this));
        if (deserializeurinullablecollectionOnWarmupCompleted != null) {
            int i2 = onActivityResized + 19;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            addSubscription(deserializeurinullablecollectionOnWarmupCompleted);
        }
        access200().setOnClickListener(new SavingAccountEditActivity$.ExternalSyntheticLambda10(this));
        TdsListRowV1View engagementSignalsCallback = setEngagementSignalsCallback();
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{engagementSignalsCallback}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View != null) {
            tdsSwitchV1View.setOnCheckedChangeListener(new SavingAccountEditActivity$.ExternalSyntheticLambda11(this, engagementSignalsCallback));
        }
        Object[] objArr = {engagementSignalsCallback, paramUtils, new SavingAccountEditActivity$.ExternalSyntheticLambda12(engagementSignalsCallback)};
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        transparentBackground.onWarmupCompleted((TdsListRowV1View) IAuthTabCallback(1720071857, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1720071851, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted()), paramUtils, new SavingAccountEditActivity$.ExternalSyntheticLambda13(this));
        transparentBackground.onWarmupCompleted(validateRelationship(), paramUtils, new SavingAccountEditActivity$.ExternalSyntheticLambda14(this));
        transparentBackground.onWarmupCompleted(ICustomTabsServiceStubProxy(), paramUtils, new SavingAccountEditActivity$.ExternalSyntheticLambda15(this));
        int i4 = onActivityResized + 27;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r0
      0x001b: PHI (r0v5 o.onDisclaimerClick) = (r0v4 o.onDisclaimerClick), (r0v6 o.onDisclaimerClick) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void asInterface(viva.republica.toss.account.savingbox.SavingAccountEditActivity r9, android.view.View r10) {
        /*
            r10 = 2
            int r0 = r10 % r10
            int r0 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r0 = r0 + 37
            int r1 = r0 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r1
            int r0 = r0 % r10
            if (r0 != 0) goto L17
            o.onDisclaimerClick r0 = r9.access000
            r1 = 84
            int r1 = r1 / 0
            if (r0 == 0) goto L4a
            goto L1b
        L17:
            o.onDisclaimerClick r0 = r9.access000
            if (r0 == 0) goto L4a
        L1b:
            boolean r1 = r0.ax_()
            if (r1 == 0) goto L47
            int r1 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized
            int r1 = r1 + 79
            int r2 = r1 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized = r2
            int r1 = r1 % r10
            r10 = 0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3b
            r5 = 1
            long r1 = o.KeyBoardVisiblePoint.IAuthTabCallback(r0, r5, r2, r10)
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 <= 0) goto L47
            goto L43
        L3b:
            long r1 = o.KeyBoardVisiblePoint.IAuthTabCallback(r0, r3, r2, r10)
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 <= 0) goto L47
        L43:
            r9.IEngagementSignalsCallbackStubProxy()
            goto L4a
        L47:
            r9.onWarmupCompleted(r0)
        L4a:
            r1 = 1007793(0xf60b1, double:4.97916E-318)
            r3 = 0
            r4 = 0
            r5 = 0
            viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda35 r6 = new viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda35
            r6.<init>()
            r7 = 14
            r8 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r1, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.SavingAccountEditActivity.asInterface(viva.republica.toss.account.savingbox.SavingAccountEditActivity, android.view.View):void");
    }

    private static final Unit IAuthTabCallbackDefault(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityResized + 105;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", "delete");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "delete");
        int i3 = 67 / 0;
        return Unit.INSTANCE;
    }

    private final void IPostMessageServiceStub() throws Throwable {
        String str;
        int i = 2 % 2;
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = new TrackEvent.IAuthTabCallback("click_button").onNavigationEvent("view", "s51_ihub_savingbox_settings").onNavigationEvent("category", "invest");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-104, -116, -126, -126, -105, -100}, ((Process.getThreadPriority(0) + 20) >> 6) + 127, objArr);
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent2 = iAuthTabCallbackOnNavigationEvent.onNavigationEvent(((String) objArr[0]).intern(), "savingbox_settings_confirm");
        Object[] objArr2 = {setEngagementSignalsCallback()};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(objArr2, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View == null || !tdsSwitchV1View.isChecked()) {
            int i2 = onMinimized + 43;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            str = "off";
        } else {
            int i4 = onActivityResized + 63;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            str = "on";
        }
        Object[] objArr3 = {iAuthTabCallbackOnNavigationEvent2.onNavigationEvent("option", str).onNavigationEvent("productname", StringsKt.trim(ICustomTabsServiceDefault().getText().toString()).toString()).onWarmupCompleted()};
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, -870178991, objArr3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 79;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return "s51_ihub_savingbox_settings";
    }

    private final void onExtraCallbackWithResult(final boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            IPostMessageServiceStub();
            if (this.access000 != null) {
                writeRaw writerawOnWarmupCompleted = shortValue.onWarmupCompleted(shortValue.Companion, this, UTF8Decoder.TOSS_SAVING_BOX_EDIT, 0L, this, false, false, false, false, (String) null, (decodeArrayLoop) null, (Function1) null, 2032, (Object) null);
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return SavingAccountEditActivity.IAuthTabCallback(z, this, (TypeUtils2) obj);
                    }
                };
                deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda2
                    public final void accept(Object obj) throws Throwable {
                        SavingAccountEditActivity.IAuthTabCallback(-996918261, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 996918283, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{function1, obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                    }
                };
                final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj) {
                        return SavingAccountEditActivity.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
                    }
                };
                writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda4
                    public final void accept(Object obj) {
                        SavingAccountEditActivity.getInterfaceDescriptor(function12, obj);
                    }
                });
            }
            int i3 = onMinimized + 29;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        IPostMessageServiceStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
    }

    private static final void onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 69;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityResized + 7;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        SavingAccountEditActivity savingAccountEditActivity = (SavingAccountEditActivity) objArr[1];
        TypeUtils2 typeUtils2 = (TypeUtils2) objArr[2];
        int i = 2 % 2;
        if (zBooleanValue) {
            int i2 = onMinimized + 37;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            savingAccountEditActivity.extraCallbackWithResult.onWarmupCompleted().onExtraCallback(Boolean.TRUE);
        }
        savingAccountEditActivity.onWarmupCompleted(typeUtils2);
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 73;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(SavingAccountEditActivity savingAccountEditActivity, Throwable th) throws Throwable {
        KeyBoardVisiblePoint keyBoardVisiblePointOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        BitmapUtilWhenMappings bitmapUtilWhenMappingsICustomTabsServiceStub = savingAccountEditActivity.ICustomTabsServiceStub();
        if (bitmapUtilWhenMappingsICustomTabsServiceStub != null) {
            int i4 = onMinimized + 23;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                keyBoardVisiblePointOnWarmupCompleted = bitmapUtilWhenMappingsICustomTabsServiceStub.onWarmupCompleted();
                int i5 = 60 / 0;
            } else {
                keyBoardVisiblePointOnWarmupCompleted = bitmapUtilWhenMappingsICustomTabsServiceStub.onWarmupCompleted();
            }
        } else {
            keyBoardVisiblePointOnWarmupCompleted = null;
        }
        IAuthTabCallback(-192262475, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 192262480, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, keyBoardVisiblePointOnWarmupCompleted}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        savingAccountEditActivity.onExtraCallbackWithResult(savingAccountEditActivity.ICustomTabsServiceStub());
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallbackDefault implements InputBottomSheetDialog.onWarmupCompleted {
        IAuthTabCallbackDefault() {
        }

        public void onExtraCallback(BottomSheetDialog bottomSheetDialog, CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(bottomSheetDialog, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            bottomSheetDialog.dismiss();
            onDisclaimerClick ondisclaimerclickIAuthTabCallbackStubProxy = SavingAccountEditActivity.IAuthTabCallbackStubProxy(SavingAccountEditActivity.this);
            Intrinsics.checkNotNull(ondisclaimerclickIAuthTabCallbackStubProxy);
            TitleBarCloseBtnClickInterceptPoint titleBarCloseBtnClickInterceptPointOnNavigationEvent = TitleBarCloseBtnClickInterceptPoint.onNavigationEvent(new TitleBarCloseBtnClickInterceptPoint(ondisclaimerclickIAuthTabCallbackStubProxy), (String) null, charSequence.toString(), false, (String) null, 13, (Object) null);
            BaseActivity.IAuthTabCallback(SavingAccountEditActivity.this, (String) null, false, 3, (Object) null);
            SavingAccountEditActivity savingAccountEditActivity = SavingAccountEditActivity.this;
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = PageShowPoint.Companion.onExtraCallbackWithResult(titleBarCloseBtnClickInterceptPointOnNavigationEvent).onWarmupCompleted(new SavingAccountEditActivity$showSetAccountNameDialog$1$.ExternalSyntheticLambda0(SavingAccountEditActivity.this)).onNavigationEvent(new SavingAccountEditActivity$showSetAccountNameDialog$1$.ExternalSyntheticLambda2(new SavingAccountEditActivity$showSetAccountNameDialog$1$.ExternalSyntheticLambda1(SavingAccountEditActivity.this)), new SavingAccountEditActivity$showSetAccountNameDialog$1$.ExternalSyntheticLambda4(new SavingAccountEditActivity$showSetAccountNameDialog$1$.ExternalSyntheticLambda3(SavingAccountEditActivity.this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            SavingAccountEditActivity.onWarmupCompleted(savingAccountEditActivity, deserializeurinullablecollectionOnNavigationEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallback(SavingAccountEditActivity savingAccountEditActivity) {
            savingAccountEditActivity.bo_();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, TitleBarCloseBtnClickInterceptPointCloseButtonClickCallback titleBarCloseBtnClickInterceptPointCloseButtonClickCallback) throws Throwable {
            List listOnExtraCallbackWithResult = titleBarCloseBtnClickInterceptPointCloseButtonClickCallback.onExtraCallbackWithResult();
            List list = listOnExtraCallbackWithResult;
            if (list != null && !list.isEmpty()) {
                onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) listOnExtraCallbackWithResult.get(0);
                SavingAccountEditActivity.IAuthTabCallback(828965657, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -828965638, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, ondisclaimerclick}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                SavingAccountEditActivity.IAuthTabCallback_Parcel(savingAccountEditActivity).setText(StringsKt.trim(ondisclaimerclick.onActivityResized()).toString());
                PageShowPoint.Companion.onWarmupCompleted(ondisclaimerclick);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onWarmupCompleted(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, Throwable th) {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, savingAccountEditActivity, true, (initMiniApp) null, (Function0) null, (Function1) null, 28, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.account.savingbox.SavingAccountEditActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r22) {
        /*
            r0 = 0
            r0 = r22[r0]
            r2 = r0
            viva.republica.toss.account.savingbox.SavingAccountEditActivity r2 = (viva.republica.toss.account.savingbox.SavingAccountEditActivity) r2
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r1 = r1 + 97
            int r3 = r1 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r3
            int r1 = r1 % r0
            r20 = 0
            if (r1 == 0) goto L84
            o.onDisclaimerClick r1 = r2.access000
            if (r1 != 0) goto L1b
            return r20
        L1b:
            int r1 = viva.republica.toss.R.string.setting_account_name
            java.lang.String r3 = r2.getString(r1)
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            o.onDisclaimerClick r4 = r2.access000
            if (r4 == 0) goto L42
            int r5 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r5 = r5 + 81
            int r6 = r5 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L3e
            java.lang.String r4 = r4.onActivityResized()
            if (r4 != 0) goto L3c
            goto L42
        L3c:
            r5 = r4
            goto L43
        L3e:
            r4.onActivityResized()
            throw r20
        L42:
            r5 = r1
        L43:
            int r4 = viva.republica.toss.R.string.teens_savingbox
            java.lang.String r4 = r2.getString(r4)
            r6 = r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            int r4 = im.toss.uikit.R.string.uikit_confirm
            java.lang.String r4 = r2.getString(r4)
            r8 = r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            viva.republica.toss.account.savingbox.SavingAccountEditActivity$IAuthTabCallbackDefault r1 = new viva.republica.toss.account.savingbox.SavingAccountEditActivity$IAuthTabCallbackDefault
            r10 = r1
            r1.<init>()
            viva.republica.toss.widget.dialog.InputBottomSheetDialog r21 = new viva.republica.toss.widget.dialog.InputBottomSheetDialog
            r1 = r21
            java.lang.String r4 = ""
            java.lang.String r7 = ""
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 65024(0xfe00, float:9.1118E-41)
            r19 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r21.show()
            int r1 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r1 = r1 + 97
            int r2 = r1 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r2
            int r1 = r1 % r0
            return r20
        L84:
            o.onDisclaimerClick r0 = r2.access000
            throw r20
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.SavingAccountEditActivity.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    static /* synthetic */ void onNavigationEvent(SavingAccountEditActivity savingAccountEditActivity, TypeUtils2 typeUtils2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 17;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            typeUtils2 = null;
        }
        savingAccountEditActivity.onWarmupCompleted(typeUtils2);
        int i4 = onActivityResized + 25;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onMessageChannelReady(SavingAccountEditActivity savingAccountEditActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            savingAccountEditActivity.onVerticalScrollEvent();
            savingAccountEditActivity.bo_();
            int i3 = onMinimized + 109;
            onActivityResized = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 24 / 0;
                return;
            }
            return;
        }
        savingAccountEditActivity.onVerticalScrollEvent();
        savingAccountEditActivity.bo_();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 5;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityResized + 81;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, decodeDimensions decodedimensions) {
        int i = 2 % 2;
        int i2 = onActivityResized + 97;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            savingAccountEditActivity.setResult(-1);
            Unit unit = Unit.INSTANCE;
            int i3 = onMinimized + 81;
            onActivityResized = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        savingAccountEditActivity.setResult(-1);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final void onMessageChannelReady(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 83;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityResized + 119;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(SavingAccountEditActivity savingAccountEditActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = onMinimized + 47;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, savingAccountEditActivity, true, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        } else {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, savingAccountEditActivity, true, (initMiniApp) null, (Function0) null, (Function1) null, 28, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(TypeUtils2 typeUtils2) {
        int i = 2 % 2;
        int i2 = onActivityResized + 107;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onDisclaimerClick ondisclaimerclick = this.access000;
        if (ondisclaimerclick == null) {
            return;
        }
        BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) this.extraCallbackWithResult.IAuthTabCallback().onWarmupCompleted();
        BEROctetStringParser bEROctetStringParserOnWarmupCompleted = BEROctetStringParser.Companion.onWarmupCompleted(ondisclaimerclick);
        onCollectWhenDestroy oncollectwhendestroyOnWarmupCompleted = keyBoardVisiblePoint != null ? keyBoardVisiblePoint.onWarmupCompleted() : null;
        String strOnExtraCallbackWithResult = keyBoardVisiblePoint != null ? keyBoardVisiblePoint.onExtraCallbackWithResult() : null;
        setTid<Boolean> settidOnWarmupCompleted = this.extraCallbackWithResult.onWarmupCompleted();
        Object obj = Boolean.FALSE;
        Object objOnWarmupCompleted = settidOnWarmupCompleted.onWarmupCompleted();
        if (objOnWarmupCompleted != null) {
            int i4 = onActivityResized + 3;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            obj = objOnWarmupCompleted;
        }
        writeRaw<getSizeInBytes> writerawOnWarmupCompleted = bEROctetStringParserOnWarmupCompleted.onWarmupCompleted(oncollectwhendestroyOnWarmupCompleted, strOnExtraCallbackWithResult, ((Boolean) obj).booleanValue(), typeUtils2);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new IAuthTabCallbackStub(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawOnWarmupCompleted2 = writerawIAuthTabCallback.onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda45
            public final void run() throws Throwable {
                SavingAccountEditActivity.IAuthTabCallbackStub(this.f$0);
            }
        });
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda46
            public final Object invoke(Object obj2) {
                return SavingAccountEditActivity.onNavigationEvent(this.f$0, (decodeDimensions) obj2);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda47
            public final void accept(Object obj2) throws Throwable {
                SavingAccountEditActivity.access100(function1, obj2);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda48
            public final Object invoke(Object obj2) {
                return SavingAccountEditActivity.onWarmupCompleted(this.f$0, (Throwable) obj2);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted2.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda49
            public final void accept(Object obj2) {
                SavingAccountEditActivity.IAuthTabCallbackStubProxy(function12, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009b, code lost:
    
        r12.onExtraCallbackWithResult(true);
        r11 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized + 47;
        viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a7, code lost:
    
        if ((r11 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a9, code lost:
    
        r11 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r12.extraCallbackWithResult.IAuthTabCallback().onWarmupCompleted() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r12.extraCallbackWithResult.IAuthTabCallback().onWarmupCompleted() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        r0 = (java.lang.Object[]) null;
        IAuthTabCallback(1183638788, o.RVGroup.onWarmupCompleted(), im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1183638763, ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132028298).substring(0, 2).length() - 1789955613, new java.lang.Object[]{r12, true}, o.RVGroup.onWarmupCompleted());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IAuthTabCallback(o.getTypedExportedConstants r11, viva.republica.toss.account.savingbox.SavingAccountEditActivity r12, android.view.View r13) throws java.lang.Throwable {
        /*
            r13 = 2
            int r0 = r13 % r13
            int r0 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r0 = r0 + 119
            int r1 = r0 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r1
            int r0 = r0 % r13
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2d
            r11.dismiss()
            r3 = 1007863(0xf60f7, double:4.979505E-318)
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r3, r5, r6, r7, r8, r9, r10)
            viva.republica.toss.account.savingbox.SavingAccountEditActivity$onNavigationEvent r11 = r12.extraCallbackWithResult
            o.setTid r11 = r11.IAuthTabCallback()
            java.lang.Object r11 = r11.onWarmupCompleted()
            if (r11 != 0) goto L9b
            goto L49
        L2d:
            r11.dismiss()
            r3 = 1007863(0xf60f7, double:4.979505E-318)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 30
            r10 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r3, r5, r6, r7, r8, r9, r10)
            viva.republica.toss.account.savingbox.SavingAccountEditActivity$onNavigationEvent r11 = r12.extraCallbackWithResult
            o.setTid r11 = r11.IAuthTabCallback()
            java.lang.Object r11 = r11.onWarmupCompleted()
            if (r11 != 0) goto L9b
        L49:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r8 = new java.lang.Object[]{r12, r11}
            int r4 = o.RVGroup.onWarmupCompleted()
            int r5 = im.toss.splittarget.impl.fsm.AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted()
            java.lang.String r11 = "android.app.ActivityThread"
            java.lang.Class r11 = java.lang.Class.forName(r11)
            java.lang.String r12 = "currentApplication"
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.reflect.Method r11 = r11.getMethod(r12, r0)
            r12 = 0
            r0 = r12
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object r11 = r11.invoke(r12, r12)
            android.content.Context r11 = (android.content.Context) r11
            android.content.Context r11 = r11.getApplicationContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2132028298(0x7f142b8a, float:1.9695181E38)
            java.lang.String r11 = r11.getString(r12)
            java.lang.String r11 = r11.substring(r2, r13)
            int r11 = r11.length()
            r12 = -1789955613(0xffffffff954f71e3, float:-4.1893158E-26)
            int r7 = r11 + r12
            int r9 = o.RVGroup.onWarmupCompleted()
            r3 = 1183638788(0x468ce504, float:18034.508)
            r6 = -1183638763(0xffffffffb9731b15, float:-2.3184375E-4)
            IAuthTabCallback(r3, r4, r5, r6, r7, r8, r9)
            return
        L9b:
            r12.onExtraCallbackWithResult(r1)
            int r11 = viva.republica.toss.account.savingbox.SavingAccountEditActivity.onMinimized
            int r11 = r11 + 47
            int r12 = r11 % 128
            viva.republica.toss.account.savingbox.SavingAccountEditActivity.onActivityResized = r12
            int r11 = r11 % r13
            if (r11 != 0) goto Lac
            r11 = 89
            int r11 = r11 / r2
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.savingbox.SavingAccountEditActivity.IAuthTabCallback(o.getTypedExportedConstants, viva.republica.toss.account.savingbox.SavingAccountEditActivity, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.onNavigationEvent;
        Object obj = null;
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, iAuthTabCallback, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(getString(R.string.app_account_savingbox___7391068a96));
        bottomSheetHeader.setDescription(getString(R.string.app_account_savingbox___a2868b4c92));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        String string = getString(R.string.app_account_savingbox___cebd4d7a5d);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.app_account_savingbox___1f839e3692);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        DERSet dERSet = DERSet.onExtraCallback;
        String str = String.format(string2, Arrays.copyOf(new Object[]{StringsKt.toLongOrNull(dERSet.validateRelationship())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        onExtraCallback(linearLayout, string, str);
        String string3 = getString(R.string.app_account_savingbox___dde6aac3ba);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        onExtraCallback(linearLayout, string3, dERSet.onBackPressedInput_delegatelambda0());
        String string4 = getString(R.string.app_account_savingbox___b64b159e97);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = getString(R.string.app_account_savingbox___e33731c8a9);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        onExtraCallback(linearLayout, string4, string5);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context3);
        String string6 = getString(R.string.app_account_savingbox___389b82de7b);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string6, new SavingAccountEditActivity$.ExternalSyntheticLambda26(gettypedexportedconstants, this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        ConvertByteArrayToFloatArray.onExtraCallback(1007861L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        int i2 = onMinimized + 93;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(final SavingAccountEditActivity savingAccountEditActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(savingAccountEditActivity.getString(R.string.app_account_savingbox___5488eba9b9));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = savingAccountEditActivity.getString(R.string.app_account_savingbox___0bdff14578);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$$ExternalSyntheticLambda37
            public final Object invoke(Object obj) {
                return SavingAccountEditActivity.onExtraCallback(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onMinimized + 47;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $isSavingBoxCreate;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(boolean z, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$isSavingBoxCreate = z;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SavingAccountEditActivity.this.new onTransact(this.$isSavingBoxCreate, access13800Var);
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context, viva.republica.toss.account.savingbox.SavingAccountEditActivity] */
        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            String str;
            String str2;
            String str3;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                ArrayList arrayList = new ArrayList();
                List listIAuthTabCallback = PageShowPoint.Companion.IAuthTabCallback();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listIAuthTabCallback) {
                    if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj2).requestPostMessageChannelWithExtras()) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList.addAll(arrayList2);
                List<? extends KeyBoardVisiblePoint> listSortedWith = CollectionsKt.sortedWith(arrayList, new UST_TSA_VerifyTimeStampTokenWithHash());
                verifyHASH verifyhash = verifyHASH.onExtraCallback;
                this.L$0 = access15400.onNavigationEvent(listSortedWith);
                this.I$0 = 0;
                this.label = 1;
                objOnNavigationEvent = verifyhash.onNavigationEvent(listSortedWith, (access13800<? super List<? extends KeyBoardVisiblePoint>>) this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = obj;
            }
            List list = (List) objOnNavigationEvent;
            KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) SavingAccountEditActivity.access100(SavingAccountEditActivity.this).IAuthTabCallback().onWarmupCompleted();
            if (this.$isSavingBoxCreate) {
                String string = SavingAccountEditActivity.this.getString(R.string.app_account_savingbox___941a6b209b);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = SavingAccountEditActivity.this.getString(R.string.app_account_savingbox___94bab8c691);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String str4 = String.format("첫 저금은 %,d원으로 시작해요.", Arrays.copyOf(new Object[]{StringsKt.toLongOrNull(DERSet.onExtraCallback.validateRelationship())}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "");
                str = string;
                str3 = str4;
                str2 = string2;
            } else {
                String string3 = SavingAccountEditActivity.this.getString(R.string.app_account_savingbox___630963efb7);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = SavingAccountEditActivity.this.getString(R.string.app_next_time_withdraw_from_changed_account);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                str = string3;
                str2 = "";
                str3 = string4;
            }
            final ?? r5 = SavingAccountEditActivity.this;
            final boolean z = this.$isSavingBoxCreate;
            Function2 function2 = new Function2() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$onShowAccountSelectBottomSheet$2$$ExternalSyntheticLambda0
                public final Object invoke(Object obj3, Object obj4) {
                    return SavingAccountEditActivity.onTransact.onExtraCallbackWithResult(r5, z, (String) obj3, (KeyBoardVisiblePoint) obj4);
                }
            };
            final SavingAccountEditActivity savingAccountEditActivity = SavingAccountEditActivity.this;
            new SelectAccountBottomSheetDialog((Context) r5, str, str2, str3, (String) null, list, keyBoardVisiblePoint, false, (TdsCheckBoxV2View.onNavigationEvent) null, function2, new Function1() { // from class: viva.republica.toss.account.savingbox.SavingAccountEditActivity$onShowAccountSelectBottomSheet$2$$ExternalSyntheticLambda1
                public final Object invoke(Object obj3) {
                    return SavingAccountEditActivity.onTransact.onExtraCallback(savingAccountEditActivity, (String) obj3);
                }
            }, (String) null, (String) null, 6544, (DefaultConstructorMarker) null).show();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(SavingAccountEditActivity savingAccountEditActivity, boolean z, String str, KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
            SavingAccountEditActivity.access100(savingAccountEditActivity).IAuthTabCallback().onExtraCallback(keyBoardVisiblePoint);
            SavingAccountEditActivity.onWarmupCompleted(savingAccountEditActivity, z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, String str) {
            SavingAccountEditActivity.getInterfaceDescriptor(savingAccountEditActivity);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        asInterface asinterface = new asInterface();
        String string = getString(R.string.app_account_savingbox___3a709a94be);
        Intrinsics.checkNotNullExpressionValue(string, "");
        new BankListBottomSheet(this, asinterface, string, checkDeviceBrand.WITHDRAWAL, null, 16, null).show();
        int i2 = onMinimized + 67;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(onDisclaimerClick ondisclaimerclick) {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new SavingAccountEditActivity$.ExternalSyntheticLambda0(this, ondisclaimerclick));
        int i2 = onActivityResized + 107;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(SavingAccountEditActivity savingAccountEditActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 109;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        savingAccountEditActivity.onNavigationEvent().IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onNavigationEvent(), savingAccountEditActivity.getScreenName(), "N");
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 59;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(SavingAccountEditActivity savingAccountEditActivity, onDisclaimerClick ondisclaimerclick, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 41;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            IAuthTabCallback(-1408529233, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1408529259, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, ondisclaimerclick}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
            savingAccountEditActivity.onNavigationEvent().IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onNavigationEvent(), savingAccountEditActivity.getScreenName(), "Y");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        IAuthTabCallback(-1408529233, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1408529259, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, ondisclaimerclick}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        savingAccountEditActivity.onNavigationEvent().IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onNavigationEvent(), savingAccountEditActivity.getScreenName(), "Y");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(SavingAccountEditActivity savingAccountEditActivity, onDisclaimerClick ondisclaimerclick, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(savingAccountEditActivity.getString(R.string.app_account_savingbox___3c0b03c380));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new SavingAccountEditActivity$.ExternalSyntheticLambda6(savingAccountEditActivity))};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = savingAccountEditActivity.getString(R.string.confirm_delete);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new SavingAccountEditActivity$.ExternalSyntheticLambda7(savingAccountEditActivity, ondisclaimerclick), 6, (Object) null)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityResized + 111;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new SavingAccountEditActivity$.ExternalSyntheticLambda50(this));
        int i2 = onActivityResized + 33;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit asInterface(SavingAccountEditActivity savingAccountEditActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 91;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            IAuthTabCallback(-656829485, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 656829486, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        IAuthTabCallback(-656829485, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 656829486, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(SavingAccountEditActivity savingAccountEditActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(savingAccountEditActivity.getString(R.string.app_account_savingbox___bef5961d71));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = savingAccountEditActivity.getString(R.string.app_account_savingbox___2de6fa32ef);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new SavingAccountEditActivity$.ExternalSyntheticLambda8(savingAccountEditActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onMinimized + 39;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        ComponentActivity componentActivity = (SavingAccountEditActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 115;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            onDisclaimerClick ondisclaimerclick = ((SavingAccountEditActivity) componentActivity).access000;
            throw null;
        }
        onDisclaimerClick ondisclaimerclick2 = ((SavingAccountEditActivity) componentActivity).access000;
        String strOnExtraCallbackWithResult = ondisclaimerclick2 != null ? ondisclaimerclick2.onExtraCallbackWithResult() : null;
        onDisclaimerClick ondisclaimerclick3 = ((SavingAccountEditActivity) componentActivity).access000;
        Long lOnNavigationEvent = ondisclaimerclick3 != null ? ondisclaimerclick3.onNavigationEvent() : null;
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-101, -114, -116, -112, -102, -126, -104, -105, -116, -119, -119, -121, -103, -117, -104, -113, -124, -122, -122, -123, -124, -124, -116, -126, -112, -113, -125, -105, -124}, (ViewConfiguration.getTapTimeout() >> 16) + 127, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(strOnExtraCallbackWithResult);
        sb.append("&accountTypeFrom=toss&amount=");
        sb.append(lOnNavigationEvent);
        sb.append("&title=출금&justClose=true");
        componentActivity.startActivityForResult(SendActivity.Companion.IAuthTabCallback(componentActivity, sb.toString()), 8950);
        int i3 = onMinimized + 7;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(SavingAccountEditActivity savingAccountEditActivity, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(savingAccountEditActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 61;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 89;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityResized + 45;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onMinimized(SavingAccountEditActivity savingAccountEditActivity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 67;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        savingAccountEditActivity.bo_();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 57;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 31;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onActivityResized + 25;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, onDisclaimerClick ondisclaimerclick, HashMap map) {
        int i = 2 % 2;
        onJsBridgeReady.onNavigationEvent(savingAccountEditActivity, savingAccountEditActivity.getString(R.string.app_account_savingbox___996ffcdd5b), 0, 2, (Object) null);
        Intent intent = new Intent();
        intent.putExtra("toss.intent.extra.ACCOUNT_ID", ondisclaimerclick.onExtraCallbackWithResult());
        savingAccountEditActivity.setResult(-1, intent);
        savingAccountEditActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = onMinimized + 59;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onMinimized;
        int i5 = i4 + 57;
        int i6 = i5 % 128;
        onActivityResized = i6;
        if (i5 % 2 != 0 ? i == 8950 : i == 26354) {
            if (i2 == -1) {
                int i7 = i6 + 61;
                onMinimized = i7 % 128;
                int i8 = i7 % 2;
                onDisclaimerClick ondisclaimerclick = this.access000;
                if (ondisclaimerclick != null) {
                    IAuthTabCallback(-1408529233, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1408529259, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, ondisclaimerclick}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
                    return;
                }
                return;
            }
            return;
        }
        Object obj = null;
        if (i == 8951) {
            if (i2 == -1) {
                IAuthTabCallback(1183638788, RVGroup.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1183638763, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132028298).substring(0, 2).length() - 1789955613, new Object[]{this, true}, RVGroup.onWarmupCompleted());
                return;
            }
            return;
        }
        if (i != 8953) {
            int i9 = i4 + 105;
            onActivityResized = i9 % 128;
            if (i9 % 2 != 0) {
                super.onActivityResult(i, i2, intent);
                return;
            } else {
                super.onActivityResult(i, i2, intent);
                obj.hashCode();
                throw null;
            }
        }
        if (i2 == -1) {
            int i10 = i6 + 113;
            onMinimized = i10 % 128;
            int i11 = i10 % 2;
            setResult(-1);
            onVerticalScrollEvent();
        }
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            this.extraCallbackWithResult.IAuthTabCallbackStubProxy();
        } else {
            super.onDestroy();
            this.extraCallbackWithResult.IAuthTabCallbackStubProxy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final class onNavigationEvent extends isVideoAutoplay {
        private final setTid<KeyBoardVisiblePoint> IAuthTabCallback = access000();
        private final setTid<Boolean> onWarmupCompleted = onNavigationEvent((onNavigationEvent) Boolean.FALSE);

        public onNavigationEvent() {
        }

        public final setTid<KeyBoardVisiblePoint> IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public final setTid<Boolean> onWarmupCompleted() {
            return this.onWarmupCompleted;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) SavingAccountEditActivity.class);
            intent.putExtra("keyTossAccountId", str);
            return intent;
        }
    }

    private static final void onExtraCallback(ViewGroup viewGroup, String str, String str2) {
        int i = 2 % 2;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1A);
        Context context2 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onWarmupCompleted(configuration)).onRelationshipValidationResult());
        Context context3 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View.setRightText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).ICustomTabsCallbackStubProxy());
        tdsListRowV1View.setCenterText1(str);
        tdsListRowV1View.setRightText1(str2);
        DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(tdsListRowV1View, -1, varyMatches.onNavigationEvent(44, displayMetrics));
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, tdsListRowV1View);
        int i2 = onActivityResized + 93;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TdsListRowV1View onNavigationEvent(SavingAccountEditActivity savingAccountEditActivity) {
        return (TdsListRowV1View) IAuthTabCallback(315136114, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -315136103, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ BitmapUtilWhenMappings onExtraCallbackWithResult(decodeDimensions decodedimensions) {
        return (BitmapUtilWhenMappings) IAuthTabCallback(-1056047755, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1056047762, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{decodedimensions}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) IAuthTabCallback(1287298464, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1287298460, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, commonModule_setLeftEdgeTouchEnabled}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ TextView onWarmupCompleted(SavingAccountEditActivity savingAccountEditActivity) {
        return (TextView) IAuthTabCallback(-259159179, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 259159197, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ TdsListRowV1View onTransact(SavingAccountEditActivity savingAccountEditActivity) {
        return (TdsListRowV1View) IAuthTabCallback(914077228, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -914077226, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SavingAccountEditActivity savingAccountEditActivity, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        return (Unit) IAuthTabCallback(162556944, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -162556944, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, ycxexternalsyntheticlambda1}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void onExtraCallbackWithResult(onDisclaimerClick ondisclaimerclick) throws Throwable {
        IAuthTabCallback(-1408529233, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1408529259, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, ondisclaimerclick}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(SavingAccountEditActivity savingAccountEditActivity, Throwable th) {
        return (Unit) IAuthTabCallback(252051956, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -252051943, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, th}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final void writeTypedObject(Function1 function1, Object obj) throws Throwable {
        IAuthTabCallback(1522616024, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1522616010, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{function1, obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final TdsListRowV1View ICustomTabsService_Parcel() {
        return (TdsListRowV1View) IAuthTabCallback(1720071857, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1720071851, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit asInterface(SetDetectableSize setDetectableSize) {
        return (Unit) IAuthTabCallback(-1285837126, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1285837141, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{setDetectableSize}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final BitmapUtilWhenMappings onExtraCallback(decodeDimensions decodedimensions) {
        return (BitmapUtilWhenMappings) IAuthTabCallback(-2039804929, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 2039804946, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{decodedimensions}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void IEngagementSignalsCallbackDefault() throws Throwable {
        IAuthTabCallback(-656829485, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 656829486, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void IEngagementSignalsCallbackStub() throws Throwable {
        IAuthTabCallback(-34603647, RVGroup.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 34603667, RVGroup.onWarmupCompleted(), new Object[]{this}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(SavingAccountEditActivity savingAccountEditActivity, DialogInterface dialogInterface) {
        return (Unit) IAuthTabCallback(-185597679, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 185597687, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{savingAccountEditActivity, dialogInterface}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void onExtraCallback(boolean z) throws Throwable {
        IAuthTabCallback(1183638788, RVGroup.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1183638763, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132028298).substring(0, 2).length() - 1789955613, new Object[]{this, Boolean.valueOf(z)}, RVGroup.onWarmupCompleted());
    }

    private static final void onPostMessage(Function1 function1, Object obj) throws Throwable {
        IAuthTabCallback(2035930335, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -2035930323, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{function1, obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(boolean z, SavingAccountEditActivity savingAccountEditActivity, TypeUtils2 typeUtils2) {
        return (Unit) IAuthTabCallback(1607707894, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1607707871, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Boolean.valueOf(z), savingAccountEditActivity, typeUtils2}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final void IEngagementSignalsCallback_Parcel() throws Throwable {
        IAuthTabCallback(248896172, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132032303).substring(0, 2).length() + 1605538550, RVGroup.onWarmupCompleted(), -248896169, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 1486437703);
    }

    private final void IAuthTabCallback(KeyBoardVisiblePoint keyBoardVisiblePoint) throws Throwable {
        IAuthTabCallback(-192262475, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 192262480, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, keyBoardVisiblePoint}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    @Override // viva.republica.toss.account.savingbox.Hilt_SavingAccountEditActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onActivityResized + 37;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = onActivityResized + 5;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.savingbox.Hilt_SavingAccountEditActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onActivityResized + 59;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = onMinimized + 115;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.savingbox.Hilt_SavingAccountEditActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onActivityResized + 65;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onActivityResized + 121;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.savingbox.Hilt_SavingAccountEditActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onMinimized + 117;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = onActivityResized + 29;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void IAuthTabCallback() {
        ICustomTabsCallback = new char[]{32576, 32636, 32632, 32637, 32566, 32569, 32591, 32583, 32589, 32571, 32588, 32633, 32570, 32635, 32579, 32638, 32556, 32575, 32568, 32563, 32561, 32567, 32627, 32634, 32553, 32546, 32555, 32590};
        readTypedObject = -1184333848;
        onActivityLayout = true;
        onPostMessage = true;
    }
}
