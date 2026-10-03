package viva.republica.toss.main.more;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.common.collect.Synchronized;
import im.toss.base.BaseActivity;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.GeckoHubImp;
import o.IAPIntegrationHelper2;
import o.IAPIntegrationHelper3;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.JsonReaderUnknownNumberParsing;
import o.PlayerErrorCode;
import o.RectangleShape;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.TypeUtils1;
import o.TypeUtils7;
import o.UTF8Decoder;
import o.access13800;
import o.access14300;
import o.access15300;
import o.accessMapSafely;
import o.addExtra;
import o.deserializeFloat;
import o.disableImageViewPreallocationAndroid;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.enableFabricRenderer;
import o.findResAndMsg;
import o.getAdService;
import o.getBillingPeriod;
import o.getByteBuffer;
import o.getDeviceVolume;
import o.getEnvType;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getTid;
import o.initMiniApp;
import o.isFireOS;
import o.isJSONTypeIgnore;
import o.isJacksonCreator;
import o.isMuted;
import o.isWifiEnabled;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A;
import o.readIntokhttp;
import o.refreshUserIdFromWalletApi;
import o.sendBroadcastWithAdObject;
import o.setCommonNetworkProxy;
import o.setRandomHost;
import o.setVideoWidth;
import o.shortValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.SecuritySettingV2Activity;
import viva.republica.toss.main.more.SecuritySettingV2Activity$;
import viva.republica.toss.password.PasswordSettingActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SecuritySettingV2Activity extends Hilt_SecuritySettingV2Activity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int asInterface;
    private static char extraCallback = 0;
    private static int onActivityLayout = 1;
    private static int onActivityResized = 1;
    private static int onPostMessage;
    private static char[] readTypedObject;
    private static int writeTypedObject;
    private TdsListRowV1View IAuthTabCallbackDefault;
    private TdsListRowV1View IAuthTabCallbackStub;
    private TdsListRowV1View IAuthTabCallbackStubProxy;
    private ScrollView IAuthTabCallback_Parcel;
    private TdsListRowV1View ICustomTabsCallback;
    private View access100;

    @Inject
    public r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A affiliateTermsAgreedUseCase;

    @Inject
    public getDeviceVolume appLockIntent;
    private View asBinder;

    @Inject
    public isJacksonCreator authUiConfig;
    private TdsListRowV1View extraCallbackWithResult;

    @Inject
    public IAPIntegrationHelper2 isStoreLoginTokenUseCase;

    @Inject
    public setCommonNetworkProxy loginTokenStore;
    private TdsListRowV1View onTransact;

    @Inject
    public setVideoWidth passkeyManager;

    @Inject
    public getBillingPeriod regionManager;

    @Inject
    public isWifiEnabled securityLevelUseCase;

    @Inject
    public IAPIntegrationHelper3 showLoginTokenConsentDescriptionBottomSheet;

    @Inject
    public getTid showLoginTokenDisableBottomSheetUseCase;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public refreshUserIdFromWalletApi updateConsentAndManageLoginTokenUseCase;
    private final IEngagementSignalsCallback_Parcel<Intent> access000 = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.main.more.SecuritySettingV2Activity$$ExternalSyntheticLambda1
        public final Object invoke(Object obj) {
            return SecuritySettingV2Activity.onExtraCallbackWithResult(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> getInterfaceDescriptor = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.main.more.SecuritySettingV2Activity$$ExternalSyntheticLambda2
        public final Object invoke(Object obj) {
            return SecuritySettingV2Activity.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    static final class onNavigationEvent extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$10;
        int I$11;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        int I$7;
        int I$8;
        int I$9;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SecuritySettingV2Activity.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{SecuritySettingV2Activity.this, this}, -582703295, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 582703307);
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.APP_SECURITY_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.LOGIN_TOKEN_ENBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    static {
        onGreatestScrollPercentageIncreased();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        asInterface = 8;
        int i = onActivityLayout + 79;
        onPostMessage = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) objArr[1];
        CompoundButton compoundButton = (CompoundButton) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallbackWithResult(securitySettingV2Activity, tdsListRowV1View, compoundButton, zBooleanValue);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + 23;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SecuritySettingV2Activity securitySettingV2Activity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(securitySettingV2Activity, setDetectableSize);
        int i4 = writeTypedObject + 123;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallback(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 79;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, view}, 978145853, iOnExtraCallbackWithResult3, -978145852);
            return;
        }
        int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, view}, 978145853, iOnExtraCallbackWithResult6, -978145852);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallbackStub(function1, obj);
        if (i3 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(securitySettingV2Activity, bool);
        int i4 = writeTypedObject + 11;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        int i4 = writeTypedObject + 123;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 33;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {securitySettingV2Activity, view};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        if (i3 == 0) {
            onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, objArr2, -1135050743, iOnExtraCallbackWithResult3, 1135050752);
            obj.hashCode();
            throw null;
        }
        onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, objArr2, -1135050743, iOnExtraCallbackWithResult3, 1135050752);
        int i4 = writeTypedObject + 85;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(view);
        int i4 = onActivityResized + 103;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(SecuritySettingV2Activity securitySettingV2Activity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onActivityResized + 55;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, iEngagementSignalsCallbackDefault}, 891696728, iOnExtraCallbackWithResult6, -891696722);
        int i3 = writeTypedObject + 89;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(SecuritySettingV2Activity securitySettingV2Activity, deserializeFloat deserializefloat, Pair pair) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 81;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(securitySettingV2Activity, deserializefloat, pair);
        int i4 = writeTypedObject + 81;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(securitySettingV2Activity, iEngagementSignalsCallbackDefault);
        int i4 = writeTypedObject + 107;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Type inference failed for: r14v5, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.Context, androidx.appcompat.app.AppCompatActivity, java.lang.Object, viva.republica.toss.main.more.SecuritySettingV2Activity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object onNavigationEvent(int r32, int r33, int r34, java.lang.Object[] r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.SecuritySettingV2Activity.onNavigationEvent(int, int, int, java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static /* synthetic */ Unit onNavigationEvent(SecuritySettingV2Activity securitySettingV2Activity, deserializeFloat deserializefloat, Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 41;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(securitySettingV2Activity, deserializefloat, th);
        int i4 = onActivityResized + 17;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asInterface(securitySettingV2Activity, view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + 87;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(securitySettingV2Activity, view);
        int i4 = writeTypedObject + 63;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ void onTransact(SecuritySettingV2Activity securitySettingV2Activity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 101;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(securitySettingV2Activity, view);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        int i5 = writeTypedObject + 111;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        int i2 = onActivityResized + 103;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, tdsListHeaderV3View}, 1881697264, iOnExtraCallbackWithResult3, -1881697264);
        int i4 = onActivityResized + 47;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(securitySettingV2Activity, str);
        }
        onExtraCallback(securitySettingV2Activity, str);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(securitySettingV2Activity, view);
        int i4 = onActivityResized + 63;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(securitySettingV2Activity, compoundButton, z);
        int i4 = writeTypedObject + 105;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return 1013301L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access000 implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public access000(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access100 implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public access100(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public asBinder(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asInterface(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onTransact(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class ICustomTabsCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
        }

        public ICustomTabsCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }
    }

    public static final class writeTypedObject extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] IAuthTabCallback = {-2119777198, -54524664, 1400188623, 1721000468, -963677144, -1839093246, 1619599325, -887660179, 1607434142, -400625922, 887311095, 892230695, -443049841, -625867875, -334363169, -187324658, 405942909, -1101459323};
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ SecuritySettingV2Activity onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public writeTypedObject(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, SecuritySettingV2Activity securitySettingV2Activity) {
            super(onwarmupcompleted);
            this.onExtraCallbackWithResult = securitySettingV2Activity;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            BaseActivity baseActivity;
            boolean z;
            initMiniApp initminiapp;
            Function0 function0;
            Function1 function1;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 5;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a(new int[]{-1584413335, -724345904, -1597536069, 1368815392, -292852825, -110958130, -690996765, 1952198158, 1568049627, -1099914567, -17818071, -1029804043, -876250360, 215889906}, 127 >>> (ViewConfiguration.getMinimumFlingVelocity() << 80), objArr);
                convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), th);
                baseActivity = this.onExtraCallbackWithResult;
                z = true;
                initminiapp = null;
                function0 = null;
                function1 = null;
                i = 127;
            } else {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                a(new int[]{-1584413335, -724345904, -1597536069, 1368815392, -292852825, -110958130, -690996765, 1952198158, 1568049627, -1099914567, -17818071, -1029804043, -876250360, 215889906}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, objArr2);
                convertFloatArrayToByteArray2.IAuthTabCallback(((String) objArr2[0]).intern(), th);
                baseActivity = this.onExtraCallbackWithResult;
                z = false;
                initminiapp = null;
                function0 = null;
                function1 = null;
                i = 30;
            }
            getParamImp.onWarmupCompleted(th, baseActivity, z, initminiapp, function0, function1, i, (Object) null);
            this.onExtraCallbackWithResult.finish();
            int i4 = onWarmupCompleted + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int length;
            int[] iArr2;
            int i3;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = IAuthTabCallback;
            long j = 0;
            int i5 = -1469660336;
            int i6 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i7 = 0;
                while (i7 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 72 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 8849 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7++;
                        j = 0;
                        i5 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = IAuthTabCallback;
            if (iArr6 != null) {
                int i8 = $11 + 109;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i3 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr6[i3]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getPressedStateDuration() >> 16) + 72, 8848 - TextUtils.getCapsMode("", i6, i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i3++;
                    i6 = 0;
                }
                i2 = i6;
                iArr6 = iArr2;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr6, i2, iArr5, i2, length3);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i9 = $11 + 87;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                int i11 = 0;
                for (int i12 = 16; i11 < i12; i12 = 16) {
                    int i13 = $11 + 81;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i11];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.getOffsetAfter("", 0)), 40 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 10301 - KeyEvent.normalizeMetaState(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i11++;
                }
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 4033), View.resolveSizeAndState(0, 0, 0) + 78, 7398 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr2, 0, i);
            int i18 = $11 + 113;
            $10 = i18 % 128;
            if (i18 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i19 = 91 / 0;
                objArr[0] = str;
            }
        }
    }

    public static final /* synthetic */ TdsListRowV1View IAuthTabCallback(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = securitySettingV2Activity.IAuthTabCallbackStub;
        int i5 = i3 + 77;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return tdsListRowV1View;
    }

    public static final /* synthetic */ onExtraCallback IAuthTabCallbackDefault(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallbackOnSessionEnded = securitySettingV2Activity.onSessionEnded();
        int i4 = writeTypedObject + 85;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallbackOnSessionEnded;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access100(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 85;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity}, -667509377, iOnExtraCallbackWithResult3, 667509384);
            return;
        }
        int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity}, -667509377, iOnExtraCallbackWithResult6, 667509384);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ TdsListRowV1View asBinder(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = securitySettingV2Activity.ICustomTabsCallback;
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        int i6 = i3 + 123;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 76 / 0;
        }
        return tdsListRowV1View;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        access13800 access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Object objOnNavigationEvent = onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, access13800Var}, -629291421, iOnExtraCallbackWithResult3, 629291432);
        int i4 = onActivityResized + 71;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ TdsListRowV1View asInterface(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 5;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        TdsListRowV1View tdsListRowV1View = securitySettingV2Activity.extraCallbackWithResult;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 37;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return tdsListRowV1View;
    }

    public static final /* synthetic */ boolean getInterfaceDescriptor(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = onActivityResized + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zIPostMessageService = securitySettingV2Activity.IPostMessageService();
        int i4 = writeTypedObject + 49;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return zIPostMessageService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ TdsListRowV1View onExtraCallback(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 53;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        TdsListRowV1View tdsListRowV1View = securitySettingV2Activity.IAuthTabCallbackDefault;
        int i5 = i2 + 31;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return tdsListRowV1View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 81;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = securitySettingV2Activity.getInterfaceDescriptor;
        int i5 = i2 + 113;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return iEngagementSignalsCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ TdsListRowV1View onTransact(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        Object obj = null;
        TdsListRowV1View tdsListRowV1View = securitySettingV2Activity.IAuthTabCallbackStubProxy;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 29;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return tdsListRowV1View;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        Object obj = null;
        TdsListRowV1View tdsListRowV1View = securitySettingV2Activity.onTransact;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 121;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return tdsListRowV1View;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ RectangleShape onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        RectangleShape rectangleShapeIEngagementSignalsCallbackDefault = securitySettingV2Activity.IEngagementSignalsCallbackDefault();
        int i4 = onActivityResized + 23;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return rectangleShapeIEngagementSignalsCallbackDefault;
    }

    public static final /* synthetic */ void onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onActivityResized + 15;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        securitySettingV2Activity.onNavigationEvent(onextracallback);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onActivityResized + 15;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final isWifiEnabled ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 1;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        isWifiEnabled iswifienabled = this.securityLevelUseCase;
        if (iswifienabled != null) {
            int i5 = i2 + 123;
            writeTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
            return iswifienabled;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = writeTypedObject + 93;
        onActivityResized = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 25;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        Object obj = null;
        r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A r8lambdar_kd5j2ktjkq2tqcokmlhfuqu6a = securitySettingV2Activity.affiliateTermsAgreedUseCase;
        if (i4 != 0) {
            throw null;
        }
        if (r8lambdar_kd5j2ktjkq2tqcokmlhfuqu6a != null) {
            int i5 = i3 + 73;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            return r8lambdar_kd5j2ktjkq2tqcokmlhfuqu6a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = onActivityResized + 117;
        writeTypedObject = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final getDeviceVolume onNavigationEvent() {
        int i = 2 % 2;
        getDeviceVolume getdevicevolume = this.appLockIntent;
        if (getdevicevolume == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = onActivityResized;
        int i3 = i2 + 19;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 55;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return getdevicevolume;
        }
        throw null;
    }

    public final SessionTrackerb writeTypedList() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 47;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackerb;
    }

    public final setCommonNetworkProxy validateRelationship() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        int i3 = i2 % 128;
        onActivityResized = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        setCommonNetworkProxy setcommonnetworkproxy = this.loginTokenStore;
        if (setcommonnetworkproxy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 45;
        int i5 = i4 % 128;
        writeTypedObject = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 103;
        onActivityResized = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 52 / 0;
        }
        return setcommonnetworkproxy;
    }

    public final IAPIntegrationHelper2 ICustomTabsService_Parcel() {
        int i = 2 % 2;
        IAPIntegrationHelper2 iAPIntegrationHelper2 = this.isStoreLoginTokenUseCase;
        if (iAPIntegrationHelper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = onActivityResized + 99;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return iAPIntegrationHelper2;
    }

    public final getTid IEngagementSignalsCallback() {
        int i = 2 % 2;
        getTid gettid = this.showLoginTokenDisableBottomSheetUseCase;
        if (gettid == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = writeTypedObject;
        int i3 = i2 + 31;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = i2 + 1;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return gettid;
    }

    public final refreshUserIdFromWalletApi ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityResized + 113;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        refreshUserIdFromWalletApi refreshuseridfromwalletapi = this.updateConsentAndManageLoginTokenUseCase;
        if (refreshuseridfromwalletapi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 9;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return refreshuseridfromwalletapi;
    }

    public final IAPIntegrationHelper3 access200() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        IAPIntegrationHelper3 iAPIntegrationHelper3 = this.showLoginTokenConsentDescriptionBottomSheet;
        if (iAPIntegrationHelper3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 125;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return iAPIntegrationHelper3;
    }

    public final setVideoWidth ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = onActivityResized + 43;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        setVideoWidth setvideowidth = this.passkeyManager;
        if (setvideowidth == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 83;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return setvideowidth;
    }

    public final getBillingPeriod updateVisuals() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 5;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getBillingPeriod getbillingperiod = this.regionManager;
        if (getbillingperiod != null) {
            int i5 = i2 + 67;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                return getbillingperiod;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = writeTypedObject + 45;
        onActivityResized = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public final isJacksonCreator setEngagementSignalsCallback() {
        int i = 2 % 2;
        isJacksonCreator isjacksoncreator = this.authUiConfig;
        if (isjacksoncreator != null) {
            int i2 = onActivityResized + 53;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return isjacksoncreator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = onActivityResized + 101;
        writeTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0531, code lost:
    
        r6 = (java.lang.Enum) r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0598  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, viva.republica.toss.main.more.SecuritySettingV2Activity] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final viva.republica.toss.main.more.SecuritySettingV2Activity.onExtraCallback onSessionEnded() {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.SecuritySettingV2Activity.onSessionEnded():viva.republica.toss.main.more.SecuritySettingV2Activity$onExtraCallback");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(SecuritySettingV2Activity securitySettingV2Activity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            TdsListRowV1View tdsListRowV1View = securitySettingV2Activity.IAuthTabCallbackStubProxy;
            if (tdsListRowV1View == null) {
                int i2 = onActivityResized + 43;
                writeTypedObject = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i3 = 27 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                int i4 = onActivityResized + 3;
                writeTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 4;
                }
                tdsListRowV1View = null;
            }
            tdsListRowV1View.setRightText1(securitySettingV2Activity.ICustomTabsServiceStub().onNavigationEvent(securitySettingV2Activity));
        }
        securitySettingV2Activity.IPostMessageServiceDefault();
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = writeTypedObject + 121;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            securitySettingV2Activity.IPostMessageServiceDefault();
            int i4 = onActivityResized + 79;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        readTypedObject(access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SecuritySettingV2Activity.this.new readTypedObject(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                SecuritySettingV2Activity securitySettingV2Activity = SecuritySettingV2Activity.this;
                this.label = 1;
                int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                obj = SecuritySettingV2Activity.onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, this}, -582703295, iOnExtraCallbackWithResult3, 582703307);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            LinearLayout linearLayout = (LinearLayout) obj;
            SecuritySettingV2Activity.this.setContentView(linearLayout);
            IPostMessageServiceStubProxy supportActionBar = SecuritySettingV2Activity.this.getSupportActionBar();
            Intrinsics.checkNotNull(supportActionBar);
            supportActionBar.onNavigationEvent(true);
            disableImageViewPreallocationAndroid.onNavigationEvent(linearLayout, linearLayout.findViewById(R.id.appBarLayout), (View) null, (View) null, false, 14, (Object) null);
            SecuritySettingV2Activity.access100(SecuritySettingV2Activity.this);
            return Unit.INSTANCE;
        }
    }

    @Override // viva.republica.toss.main.more.Hilt_SecuritySettingV2Activity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new readTypedObject(null), 3, (Object) null);
        int i2 = writeTypedObject + 49;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void asInterface(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            securitySettingV2Activity.access000.onNavigationEvent(securitySettingV2Activity.onNavigationEvent().onExtraCallback(securitySettingV2Activity));
        } else {
            securitySettingV2Activity.access000.onNavigationEvent(securitySettingV2Activity.onNavigationEvent().onExtraCallback(securitySettingV2Activity));
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallbackStub(SecuritySettingV2Activity securitySettingV2Activity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 11;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1506167L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        SessionTrackerb sessionTrackerbWriteTypedList = securitySettingV2Activity.writeTypedList();
        Object[] objArr = new Object[1];
        a(new char[]{23, 3, 16, 22, 7, 3, 17, 19, 19, '\r', 13820, 13820, 22, 17, 13872, 13872, 23, 22, '\t', 15, 16, 23, 13877, 13877, 20, 19, 0, 11, 6, 23, 6, 22, 13871, 13871, 23, 6, 2, 14, 13873, 13873, '\b', 16, 22, 1, 4, 22, 16, 0, 13872}, (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 71), 49 - (Process.myTid() >> 22), objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbWriteTypedList, securitySettingV2Activity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = onActivityResized + 61;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback APP_SECURITY_LEVEL;
        private static short[] IAuthTabCallback;
        public static final onExtraCallback LOGIN_TOKEN_ENBLE;
        private static int asBinder;
        private static int onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static byte[] onWarmupCompleted;
        private final String paramValue;
        private static final byte[] $$a = {15, -12, 105, 108};
        private static final int $$b = 179;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 0;
        private static int IAuthTabCallbackDefault = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, byte r7, short r8) {
            /*
                int r7 = r7 * 4
                int r0 = 1 - r7
                byte[] r1 = viva.republica.toss.main.more.SecuritySettingV2Activity.onExtraCallback.$$a
                int r8 = r8 * 4
                int r8 = 115 - r8
                int r6 = r6 * 4
                int r6 = 3 - r6
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L19
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2e
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                int r6 = r6 + 1
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r5
            L2e:
                int r6 = r6 + r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.SecuritySettingV2Activity.onExtraCallback.$$c(int, byte, short):java.lang.String");
        }

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onTransact + 71;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = APP_SECURITY_LEVEL;
            if (i3 != 0) {
                return new onExtraCallback[]{onextracallback, LOGIN_TOKEN_ENBLE};
            }
            onExtraCallback onextracallback2 = LOGIN_TOKEN_ENBLE;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[4];
            onextracallbackArr[0] = onextracallback;
            onextracallbackArr[1] = onextracallback2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 119;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 117;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onTransact + 119;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onTransact + 3;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int length;
            byte[] bArr;
            int i4;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43424), 42 - (ViewConfiguration.getFadingEdgeLength() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                Object obj = null;
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i7 = iIntValue == -1 ? 1 : 0;
                long j = 0;
                if (i7 != 0) {
                    int i8 = $11 + 99;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    byte[] bArr2 = onWarmupCompleted;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        int i9 = 0;
                        while (i9 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 54 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i9++;
                            j = 0;
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        int i10 = $11 + 59;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            byte[] bArr4 = onWarmupCompleted;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSize(0, 0)), 42 - View.getDefaultSize(0, 0), 22439 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] / (-4629411779493505016L))) >>> ((int) (onExtraCallbackWithResult / (-4629411779493505016L)));
                        } else {
                            byte[] bArr5 = onWarmupCompleted;
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43424), 42 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 22439 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr5[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                        }
                        iIntValue = (byte) i5;
                    } else {
                        iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L))) + i7;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 86 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 9567 - TextUtils.indexOf("", ""), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr6 = onWarmupCompleted;
                    if (bArr6 != null) {
                        int i11 = $11 + 45;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            length = bArr6.length;
                            bArr = new byte[length];
                            i4 = 1;
                        } else {
                            length = bArr6.length;
                            bArr = new byte[length];
                            i4 = 0;
                        }
                        while (i4 < length) {
                            bArr[i4] = (byte) (bArr6[i4] ^ (-4629411779493505016L));
                            i4++;
                        }
                        bArr6 = bArr;
                    }
                    if (bArr6 != null) {
                        int i12 = $11 + 49;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!z) {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr7 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r4] ^ (-4629411779493505016L))) + s)) ^ b));
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

        private onExtraCallback(String str, int i, String str2) {
            this.paramValue = str2;
        }

        public final String getParamValue() {
            String str;
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 89;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.paramValue;
                int i4 = 2 / 0;
            } else {
                str = this.paramValue;
            }
            int i5 = i2 + 7;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            asBinder = 1;
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a((short) ((-94) - TextUtils.getCapsMode("", 0, 0)), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), 535002758 + (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1249531835) - (KeyEvent.getMaxKeyCode() >> 16), (-59) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            APP_SECURITY_LEVEL = new onExtraCallback("APP_SECURITY_LEVEL", 0, ((String) objArr[0]).intern());
            LOGIN_TOKEN_ENBLE = new onExtraCallback("LOGIN_TOKEN_ENBLE", 1, "loginTokenEnable");
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = IAuthTabCallbackStub + 33;
            asBinder = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void onNavigationEvent() {
            onNavigationEvent = 1146837362;
            onExtraCallbackWithResult = -1538795470;
            onExtraCallback = -297959404;
            onWarmupCompleted = new byte[]{-34, 109, 69, 103, Byte.MAX_VALUE, 57, 107, 97, 93, 83, 120, 84, 120, 73, 86, 101};
        }
    }

    private static final Unit onExtraCallback(SecuritySettingV2Activity securitySettingV2Activity, String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            getEnvType.onExtraCallbackWithResult.onExtraCallbackWithResult(securitySettingV2Activity.validateRelationship().IAuthTabCallback(), str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        getEnvType.onExtraCallbackWithResult.onExtraCallbackWithResult(securitySettingV2Activity.validateRelationship().IAuthTabCallback(), str);
        int i3 = 82 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, viva.republica.toss.main.more.SecuritySettingV2Activity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final ?? r1 = (SecuritySettingV2Activity) objArr[0];
        int i = 2 % 2;
        getEnvType getenvtype = getEnvType.onExtraCallbackWithResult;
        getEnvType.onExtraCallbackWithResult(-1632555927, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{getenvtype, Boolean.valueOf(r1.validateRelationship().IAuthTabCallback())}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1632555928);
        r1.access200().onExtraCallback((Context) r1, new Function1() { // from class: viva.republica.toss.main.more.SecuritySettingV2Activity$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return SecuritySettingV2Activity.onWarmupCompleted(this.f$0, (String) obj);
            }
        });
        getenvtype.onWarmupCompleted(r1.validateRelationship().IAuthTabCallback());
        int i2 = writeTypedObject + 71;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            securitySettingV2Activity.onExtraCallbackWithResult(z);
        } else {
            Intrinsics.checkNotNullParameter(compoundButton, "");
            securitySettingV2Activity.onExtraCallbackWithResult(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = readTypedObject;
        long j = 0;
        if (cArr2 != null) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(j), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, View.MeasureSpec.makeMeasureSpec(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(extraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getTrimmedLength("") + 26, 23139 - (ViewConfiguration.getTapTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 117;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i9 = $10 + 25;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i11 = $10 + 23;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback << b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback * b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24825), 73 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 8088 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), Process.getGidForName("") + 31, 19488 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        int i13 = $10 + 15;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                    } else {
                        int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $isChecked;
        final /* synthetic */ TdsListRowV1View $this_listRowV1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, TdsListRowV1View tdsListRowV1View, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$isChecked = z;
            this.$this_listRowV1 = tdsListRowV1View;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SecuritySettingV2Activity.this.new onExtraCallbackWithResult(this.$isChecked, this.$this_listRowV1, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                accessMapSafely accessmapsafely = accessMapSafely.onNavigationEvent;
                SecuritySettingV2Activity securitySettingV2Activity = SecuritySettingV2Activity.this;
                boolean z = this.$isChecked;
                this.label = 1;
                Object[] objArr = {accessmapsafely, securitySettingV2Activity, securitySettingV2Activity, Boolean.valueOf(z), 80L, this};
                int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                obj = accessMapSafely.onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, 1556985347, -1556985345);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object[] objArr2 = {this.$this_listRowV1};
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(objArr2, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (tdsSwitchV1View != null) {
                TdsSwitchV1View.setCheckedState$default(tdsSwitchV1View, zBooleanValue, false, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final void onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity, TdsListRowV1View tdsListRowV1View, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(securitySettingV2Activity), (CoroutineContext) null, (setRandomHost) null, securitySettingV2Activity.new onExtraCallbackWithResult(z, tdsListRowV1View, null), 3, (Object) null);
        int i2 = onActivityResized + 111;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackDefault(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 81;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        securitySettingV2Activity.IEngagementSignalsCallback_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 85;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb.IAuthTabCallback(securitySettingV2Activity.writeTypedList(), securitySettingV2Activity.getActivity(), DERSet.onExtraCallback.addOnUserLeaveHintListener(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = onActivityResized + 79;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void IAuthTabCallback_Parcel(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            SessionTrackerb.IAuthTabCallback(securitySettingV2Activity.writeTypedList(), securitySettingV2Activity.getActivity(), DERSet.onExtraCallback.onRetainCustomNonConfigurationInstance(), false, (Function1) null, (Bundle) null, false, 0, (Object) null);
        } else {
            SessionTrackerb.IAuthTabCallback(securitySettingV2Activity.writeTypedList(), securitySettingV2Activity.getActivity(), DERSet.onExtraCallback.onRetainCustomNonConfigurationInstance(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
    }

    private static final Unit onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("category", sendBroadcastWithAdObject.COMMON);
        setDetectableSize.onExtraCallback().put("view", securitySettingV2Activity.getScreenName());
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{3, 20, 13903, 13903, 17, 16}, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 96), 6 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), "password_setting");
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 9;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class extraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        extraCallback(access13800<? super extraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SecuritySettingV2Activity.this.new extraCallback(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getByteBuffer getbytebufferIAuthTabCallback = shortValue.IAuthTabCallback(shortValue.Companion, SecuritySettingV2Activity.this, UTF8Decoder.CHECK_RESET_PASSWORD, 63L, true, false, false, false, (shortValue.onNavigationEvent) null, false, (Function0) null, false, (TypeUtils1) null, false, (String) null, new Function1() { // from class: viva.republica.toss.main.more.SecuritySettingV2Activity$onPasswordChangeRowClick$2$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj2) {
                        return SecuritySettingV2Activity.extraCallback.onNavigationEvent((TypeUtils7) obj2);
                    }
                }, 16368, (Object) null);
                this.label = 1;
                objOnExtraCallback = RxAwaitKt.onExtraCallback(getbytebufferIAuthTabCallback, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objOnExtraCallback;
            IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelOnExtraCallbackWithResult = SecuritySettingV2Activity.onExtraCallbackWithResult(SecuritySettingV2Activity.this);
            PasswordSettingActivity.onNavigationEvent onnavigationevent = PasswordSettingActivity.Companion;
            BaseActivity baseActivity = SecuritySettingV2Activity.this;
            Intrinsics.checkNotNull(isjsontypeignore);
            iEngagementSignalsCallback_ParcelOnExtraCallbackWithResult.onNavigationEvent(PasswordSettingActivity.onNavigationEvent.onExtraCallback(onnavigationevent, baseActivity, isjsontypeignore, false, false, null, 28, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNavigationEvent(TypeUtils7 typeUtils7) {
            typeUtils7.onWarmupCompleted(true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback_Parcel() {
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel;
        PasswordSettingActivity.onNavigationEvent onnavigationevent;
        UTF8Decoder uTF8Decoder;
        long j;
        boolean z;
        boolean z2;
        UTF8Decoder uTF8Decoder2;
        int i;
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onWarmupCompleted("click_button", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.main.more.SecuritySettingV2Activity$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return SecuritySettingV2Activity.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        if (!setEngagementSignalsCallback().IAuthTabCallback(this)) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), new ICustomTabsCallback(CoroutineExceptionHandler.extraCallbackWithResult), (setRandomHost) null, new extraCallback(null), 2, (Object) null);
            int i3 = writeTypedObject + 15;
            onActivityResized = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 6 / 0;
                return;
            }
            return;
        }
        int i5 = writeTypedObject + 49;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            iEngagementSignalsCallback_Parcel = this.getInterfaceDescriptor;
            onnavigationevent = PasswordSettingActivity.Companion;
            uTF8Decoder = UTF8Decoder.CHECK_RESET_PASSWORD;
            j = 63;
            z = false;
            z2 = false;
            uTF8Decoder2 = null;
            i = 46;
        } else {
            iEngagementSignalsCallback_Parcel = this.getInterfaceDescriptor;
            onnavigationevent = PasswordSettingActivity.Companion;
            uTF8Decoder = UTF8Decoder.CHECK_RESET_PASSWORD;
            j = 63;
            z = false;
            z2 = false;
            uTF8Decoder2 = null;
            i = 56;
        }
        iEngagementSignalsCallback_Parcel.onNavigationEvent(PasswordSettingActivity.onNavigationEvent.onNavigationEvent(onnavigationevent, this, uTF8Decoder, j, z, z2, uTF8Decoder2, i, null));
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        extraCallbackWithResult(access13800<? super extraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SecuritySettingV2Activity.this.new extraCallbackWithResult(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        
            if (r15 != r0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.SecuritySettingV2Activity.extraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        SecuritySettingV2Activity securitySettingV2Activity = (SecuritySettingV2Activity) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(securitySettingV2Activity), new writeTypedObject(CoroutineExceptionHandler.extraCallbackWithResult, securitySettingV2Activity), (setRandomHost) null, securitySettingV2Activity.new extraCallbackWithResult(null), 2, (Object) null);
        int i2 = onActivityResized + 39;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return null;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            int i4 = writeTypedObject + 17;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == -1) {
                onExtraCallbackWithResult((deserializeFloat<Boolean>) new SecuritySettingV2Activity$.ExternalSyntheticLambda18(this));
                int i6 = onActivityResized + 109;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(SecuritySettingV2Activity securitySettingV2Activity, Boolean bool) {
        int i = 2 % 2;
        String string = securitySettingV2Activity.getString(R.string.setting_reset_password_success_message);
        Intrinsics.checkNotNullExpressionValue(string, "");
        new TdsToastV1.onNavigationEvent(securitySettingV2Activity, string).onNavigationEvent();
        int i2 = writeTypedObject + 119;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 25;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(deserializeFloat<Boolean> deserializefloat) {
        int i = 2 % 2;
        Object[] objArr = {disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, null};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        ((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(554839421, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -554839418, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).onNavigationEvent(4L, TimeUnit.SECONDS).onWarmupCompleted(new SecuritySettingV2Activity$.ExternalSyntheticLambda4(new SecuritySettingV2Activity$.ExternalSyntheticLambda3(this, deserializefloat)), new SecuritySettingV2Activity$.ExternalSyntheticLambda6(new SecuritySettingV2Activity$.ExternalSyntheticLambda5(this, deserializefloat)));
        int i2 = writeTypedObject + 113;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
        }
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityResized + 43;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(SecuritySettingV2Activity securitySettingV2Activity, deserializeFloat deserializefloat, Pair pair) {
        int i = 2 % 2;
        int i2 = onActivityResized + 15;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            securitySettingV2Activity.bo_();
            deserializefloat.accept(Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            int i3 = onActivityResized + 31;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        securitySettingV2Activity.bo_();
        deserializefloat.accept(Boolean.TRUE);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, deserializeFloat deserializefloat, Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            securitySettingV2Activity.bo_();
            deserializefloat.accept(Boolean.FALSE);
            Unit unit = Unit.INSTANCE;
            int i3 = writeTypedObject + 47;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        securitySettingV2Activity.bo_();
        deserializefloat.accept(Boolean.FALSE);
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceDefault() throws Throwable {
        int i = 2 % 2;
        if (!enableFabricRenderer.onExtraCallback.onExtraCallbackWithResult(this).onWarmupCompleted()) {
            return;
        }
        int i2 = writeTypedObject + 27;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            accessMapSafely.onNavigationEvent.IAuthTabCallback();
            throw null;
        }
        boolean zIAuthTabCallback = accessMapSafely.onNavigationEvent.IAuthTabCallback();
        TdsListRowV1View tdsListRowV1View = this.IAuthTabCallbackStub;
        if (tdsListRowV1View == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tdsListRowV1View = null;
        }
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View != null) {
            int i3 = writeTypedObject + 107;
            onActivityResized = i3 % 128;
            TdsSwitchV1View.setCheckedState$default(tdsSwitchV1View, zIAuthTabCallback, i3 % 2 == 0, 2, (Object) null);
        }
    }

    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onPostMessage(z, this, (access13800) null), 3, (Object) null);
        int i2 = onActivityResized + 13;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RectangleShape IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onActivityResized + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RectangleShape rectangleShapeOnExtraCallbackWithResult = enableFabricRenderer.onExtraCallback.onExtraCallbackWithResult(this);
        int i4 = onActivityResized + 17;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return rectangleShapeOnExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View onVerticalScrollEvent() {
        int i = 2 % 2;
        View view = new View(getContext());
        view.setVisibility(8);
        view.setBackgroundColor(getColor(R.color.color_app_setting_guide_color));
        int i2 = onActivityResized + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return view;
    }

    private static final Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 3;
        writeTypedObject = i2 % 128;
        view.setVisibility(i2 % 2 != 0 ? 61 : 8);
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(final View view) {
        int i = 2 % 2;
        view.setVisibility(0);
        Object[] objArr = {RallysKt.onExtraCallback(new LinearInterpolator(), 1000), 600};
        Object[] objArr2 = {(Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), -1007685538, objArr, 1007685539, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), Float.valueOf(1.0f), Float.valueOf(0.0f), (Function1) null, 4, (Object) null), 1, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1912, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: viva.republica.toss.main.more.SecuritySettingV2Activity$$ExternalSyntheticLambda0
            public final Object invoke() {
                return SecuritySettingV2Activity.onExtraCallback(view);
            }
        }, 1, null};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr2, 2128644226), false, 1, (Object) null);
        int i2 = onActivityResized + 71;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static final class onMinimized extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        onMinimized(access13800<? super onMinimized> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SecuritySettingV2Activity.this.new onMinimized(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: Exception -> 0x00d0, CancellationException -> 0x00db, WebResourceResponseModel -> 0x00dd, TryCatch #2 {CancellationException -> 0x00db, Exception -> 0x00d0, WebResourceResponseModel -> 0x00dd, blocks: (B:7:0x0016, B:23:0x0063, B:24:0x006e, B:26:0x0074, B:28:0x0083, B:29:0x0087, B:32:0x00ab, B:33:0x00af, B:35:0x00b5, B:36:0x00c7, B:19:0x0044), top: B:47:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[Catch: Exception -> 0x00d0, CancellationException -> 0x00db, WebResourceResponseModel -> 0x00dd, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00db, Exception -> 0x00d0, WebResourceResponseModel -> 0x00dd, blocks: (B:7:0x0016, B:23:0x0063, B:24:0x006e, B:26:0x0074, B:28:0x0083, B:29:0x0087, B:32:0x00ab, B:33:0x00af, B:35:0x00b5, B:36:0x00c7, B:19:0x0044), top: B:47:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[Catch: Exception -> 0x00d0, CancellationException -> 0x00db, WebResourceResponseModel -> 0x00dd, TryCatch #2 {CancellationException -> 0x00db, Exception -> 0x00d0, WebResourceResponseModel -> 0x00dd, blocks: (B:7:0x0016, B:23:0x0063, B:24:0x006e, B:26:0x0074, B:28:0x0083, B:29:0x0087, B:32:0x00ab, B:33:0x00af, B:35:0x00b5, B:36:0x00c7, B:19:0x0044), top: B:47:0x0008 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r9.L$1
                o.access13800 r0 = (o.access13800) r0
                java.lang.Object r0 = r9.L$0
                viva.republica.toss.main.more.SecuritySettingV2Activity r0 = (viva.republica.toss.main.more.SecuritySettingV2Activity) r0
                kotlin.ResultKt.onNavigationEvent(r10)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                goto L63
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                kotlin.ResultKt.onNavigationEvent(r10)
                goto L37
            L26:
                kotlin.ResultKt.onNavigationEvent(r10)
                viva.republica.toss.main.more.SecuritySettingV2Activity r10 = viva.republica.toss.main.more.SecuritySettingV2Activity.this
                o.setVideoWidth r10 = r10.ICustomTabsServiceDefault()
                r9.label = r3
                java.lang.Object r10 = r10.onWarmupCompleted(r9)
                if (r10 == r0) goto Lea
            L37:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L42
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L42:
                viva.republica.toss.main.more.SecuritySettingV2Activity r10 = viva.republica.toss.main.more.SecuritySettingV2Activity.this
                kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                o.setVideoWidth r1 = r10.ICustomTabsServiceDefault()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                r9.L$0 = r10     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                java.lang.Object r3 = o.access15400.onNavigationEvent(r9)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                r9.L$1 = r3     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                r3 = 0
                r9.I$0 = r3     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                r9.I$1 = r3     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                r9.label = r2     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                java.lang.Object r1 = r1.onExtraCallbackWithResult(r9)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                if (r1 != r0) goto L61
                goto Lea
            L61:
                r0 = r10
                r10 = r1
            L63:
                java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                r1.<init>()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
            L6e:
                boolean r2 = r10.hasNext()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                if (r2 == 0) goto L87
                java.lang.Object r2 = r10.next()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                r3 = r2
                im.toss.features.verify.login.model.GetUserPassKeyResponse r3 = (im.toss.features.verify.login.model.GetUserPassKeyResponse) r3     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                o.viscousFluid r3 = r3.onTransact()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                o.viscousFluid r4 = o.viscousFluid.ACTIVE     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                if (r3 != r4) goto L6e
                r1.add(r2)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                goto L6e
            L87:
                java.lang.Object[] r5 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                int r2 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                int r3 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                int r7 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                int r4 = im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                r6 = -1156019573(0xffffffffbb188a8b, float:-0.0023275937)
                r8 = 1156019577(0x44e77579, float:1851.671)
                java.lang.Object r10 = viva.republica.toss.main.more.SecuritySettingV2Activity.onNavigationEvent(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                im.toss.tds.view.component.compound.listrow.TdsListRowV1View r10 = (im.toss.tds.view.component.compound.listrow.TdsListRowV1View) r10     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                java.lang.String r2 = ""
                if (r10 != 0) goto Laf
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                r10 = 0
            Laf:
                boolean r3 = r1.isEmpty()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                if (r3 != 0) goto Lc7
                int r2 = viva.republica.toss.R.string.app_security_setting_passkey_numbers     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                int r1 = r1.size()     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                java.lang.Integer r1 = o.access14000.onNavigationEvent(r1)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                java.lang.String r2 = r0.getString(r2, r1)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
            Lc7:
                r10.setRightText1(r2)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                kotlin.Result.constructor-impl(r10)     // Catch: java.lang.Exception -> Ld0 java.util.concurrent.CancellationException -> Ldb o.WebResourceResponseModel -> Ldd
                goto Le7
            Ld0:
                r10 = move-exception
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
                kotlin.Result.constructor-impl(r10)
                goto Le7
            Ldb:
                r10 = move-exception
                throw r10
            Ldd:
                r10 = move-exception
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
                kotlin.Result.constructor-impl(r10)
            Le7:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            Lea:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.more.SecuritySettingV2Activity.onMinimized.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // viva.republica.toss.main.more.Hilt_SecuritySettingV2Activity
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onMinimized(null), 3, (Object) null);
        int i2 = onActivityResized + 75;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
    }

    public void onNewIntent(@NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        onNavigationEvent(onSessionEnded());
        int i4 = writeTypedObject + 79;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(onExtraCallback onextracallback) {
        int i;
        int i2 = 2 % 2;
        if (onextracallback == null) {
            int i3 = onActivityResized + 101;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
        } else {
            i = onWarmupCompleted.IAuthTabCallback[onextracallback.ordinal()];
        }
        View view = null;
        if (i != 1) {
            int i5 = onActivityResized + 83;
            writeTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                if (i != 5) {
                    return;
                }
            } else if (i != 2) {
                return;
            }
            View view2 = this.asBinder;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = onActivityResized + 65;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
            } else {
                view = view2;
            }
            onExtraCallbackWithResult(view);
            return;
        }
        View view3 = this.access100;
        if (view3 == null) {
            int i8 = writeTypedObject + 93;
            onActivityResized = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        onExtraCallbackWithResult(view3);
        View view4 = this.IAuthTabCallbackStubProxy;
        if (view4 == null) {
            int i9 = writeTypedObject + 43;
            onActivityResized = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i10 == 0) {
                throw null;
            }
        } else {
            view = view4;
        }
        view.setRightText1(ICustomTabsServiceStub().onNavigationEvent(this));
    }

    private final boolean IPostMessageService() {
        int i = 2 % 2;
        int i2 = onActivityResized + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (!addExtra.onWarmupCompleted(playerErrorCode) && !updateVisuals().onExtraCallback()) {
            int i4 = writeTypedObject + 115;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                addExtra.extraCallback(playerErrorCode);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!addExtra.extraCallback(playerErrorCode)) {
                return true;
            }
        }
        int i5 = writeTypedObject + 75;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(IAuthTabCallback iAuthTabCallback, Context context, onExtraCallback onextracallback, int i, Object obj) {
            if ((i & 2) != 0) {
                onextracallback = null;
            }
            return iAuthTabCallback.onNavigationEvent(context, onextracallback);
        }

        public final Intent onNavigationEvent(@NotNull Context context, @Nullable onExtraCallback onextracallback) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) SecuritySettingV2Activity.class);
            if (onextracallback != null) {
                intent.putExtra("playGuide", onextracallback.getParamValue());
            }
            return intent;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{function1, obj}, -1220979210, iOnExtraCallbackWithResult3, 1220979223);
    }

    public static /* synthetic */ Unit onExtraCallback(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, view}, 1277830769, iOnExtraCallbackWithResult3, -1277830761);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, view}, 1262463174, iOnExtraCallbackWithResult3, -1262463164);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SecuritySettingV2Activity securitySettingV2Activity, Boolean bool) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, bool}, 1275526980, iOnExtraCallbackWithResult3, -1275526966);
    }

    public static /* synthetic */ void onNavigationEvent(SecuritySettingV2Activity securitySettingV2Activity, TdsListRowV1View tdsListRowV1View, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {securitySettingV2Activity, tdsListRowV1View, compoundButton, Boolean.valueOf(z)};
        onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, 1101553811, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1101553808);
    }

    public static final /* synthetic */ Object onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, access13800 access13800Var) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, access13800Var}, -582703295, iOnExtraCallbackWithResult3, 582703307);
    }

    public static final /* synthetic */ TdsListRowV1View onNavigationEvent(SecuritySettingV2Activity securitySettingV2Activity) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (TdsListRowV1View) onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity}, -1156019573, iOnExtraCallbackWithResult3, 1156019577);
    }

    public static final /* synthetic */ ScrollView IAuthTabCallbackStub(SecuritySettingV2Activity securitySettingV2Activity) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (ScrollView) onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity}, -1695659018, iOnExtraCallbackWithResult3, 1695659023);
    }

    private final Object IAuthTabCallback(access13800<? super LinearLayout> access13800Var) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this, access13800Var}, -629291421, iOnExtraCallbackWithResult3, 629291432);
    }

    private static final Unit onExtraCallback(SecuritySettingV2Activity securitySettingV2Activity, TdsListHeaderV3View tdsListHeaderV3View) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, tdsListHeaderV3View}, 1881697264, iOnExtraCallbackWithResult3, -1881697264);
    }

    private static final void asBinder(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, view}, 978145853, iOnExtraCallbackWithResult3, -978145852);
    }

    private static final void IAuthTabCallbackStubProxy(SecuritySettingV2Activity securitySettingV2Activity, View view) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, view}, -1135050743, iOnExtraCallbackWithResult3, 1135050752);
    }

    private final void IEngagementSignalsCallbackStub() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, -667509377, iOnExtraCallbackWithResult3, 667509384);
    }

    private static final Unit onWarmupCompleted(SecuritySettingV2Activity securitySettingV2Activity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{securitySettingV2Activity, iEngagementSignalsCallbackDefault}, 891696728, iOnExtraCallbackWithResult3, -891696722);
    }

    public final r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A IAuthTabCallback() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A) onNavigationEvent(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 303068032, iOnExtraCallbackWithResult3, -303068030);
    }

    @Override // viva.republica.toss.main.more.Hilt_SecuritySettingV2Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.main.more.Hilt_SecuritySettingV2Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = writeTypedObject + 55;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.main.more.Hilt_SecuritySettingV2Activity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
    }

    static void onGreatestScrollPercentageIncreased() {
        readTypedObject = new char[]{64977, 64980, 64967, 64979, 64910, 64970, 65004, 64981, 64961, 65064, 64908, 64983, 64978, 64976, 64905, 64989, 64988, 64963, 64960, 64924, 65065, 64982, 64984, 64966, 64986};
        extraCallback = (char) 51244;
    }
}
