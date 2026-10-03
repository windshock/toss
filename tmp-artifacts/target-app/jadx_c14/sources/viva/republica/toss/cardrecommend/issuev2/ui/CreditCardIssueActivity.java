package viva.republica.toss.cardrecommend.issuev2.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_GetIsCA;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EncryptedContentInfoParser;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.MacData;
import o.NativeAdViewAttributesApi;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RightClickGesturesKtonRightClickDown2;
import o.Ripple_androidKt;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TypeUtils1;
import o.TypeUtils7;
import o.TypographyKtExternalSyntheticLambda0;
import o.UTF8Decoder;
import o.access13800;
import o.access14300;
import o.createAdSizeApi;
import o.deprecated_authenticator;
import o.deserializeUriNullableCollection;
import o.filterCreatePageParams;
import o.findResAndMsg;
import o.getANActivityLifecycleCallbacksListener;
import o.getCoefficient;
import o.getDigestAlgorithms;
import o.getDummyAd;
import o.getEncryptedData;
import o.getExponent2;
import o.getModulus;
import o.getNavigationBar;
import o.getOriginalFullResponse;
import o.getPSourceAlgorithm;
import o.getParamImp;
import o.getPublicExponent;
import o.initMiniApp;
import o.isJSONTypeIgnore;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.setHasShown;
import o.setMessageBytes;
import o.setRandomHost;
import o.shortValue;
import o.writeRaw;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueActivity extends Hilt_CreditCardIssueActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    public static final int IAuthTabCallbackStub;
    private static boolean IAuthTabCallbackStubProxy = false;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static char[] access100 = null;
    private static int extraCallback = 1;
    private static boolean getInterfaceDescriptor = false;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;

    @Inject
    public zzad environments;

    @Inject
    public getDummyAd termsIntent;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy IAuthTabCallbackDefault = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CardIssueOverviewViewModel.class), new onMessageChannelReady(this), new onActivityResized(this), new onActivityLayout(null, this));
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onPostMessage(this));
    private final IEngagementSignalsCallback_Parcel<Intent> asInterface = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActivity$$ExternalSyntheticLambda2
        public final Object invoke(Object obj) {
            return CreditCardIssueActivity.IAuthTabCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final SessionTrackera onTransact = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActivity$$ExternalSyntheticLambda3
        public final Object invoke(Object obj) {
            return CreditCardIssueActivity.onWarmupCompleted(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        }
    });

    static {
        updateVisuals();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        IAuthTabCallbackStub = 8;
        int i = readTypedObject + 113;
        extraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditCardIssueActivity creditCardIssueActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access000 + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{creditCardIssueActivity, th}, -578368928, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 578368931);
        int i4 = writeTypedObject + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditCardIssueActivity creditCardIssueActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(creditCardIssueActivity, iEngagementSignalsCallbackDefault);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditCardIssueActivity, iEngagementSignalsCallbackDefault);
        int i3 = access000 + 101;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallback(CreditCardIssueActivity creditCardIssueActivity, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = access000 + 119;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(creditCardIssueActivity, typographyKtExternalSyntheticLambda0, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, bundle);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = writeTypedObject + 85;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditCardIssueActivity creditCardIssueActivity = (CreditCardIssueActivity) objArr[0];
        NativeAdViewAttributesApi nativeAdViewAttributesApi = (NativeAdViewAttributesApi) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditCardIssueActivity, nativeAdViewAttributesApi);
        int i4 = writeTypedObject + 97;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~(i3 | i6);
        int i8 = ~(i6 | i);
        int i9 = i7 | i8;
        int i10 = ~i3;
        int i11 = ~i6;
        int i12 = (~(i10 | i)) | (~(i10 | i11)) | (~(i11 | i));
        int i13 = ~i;
        int i14 = i12 | (~(i13 | i3 | i6));
        int i15 = (~(i13 | i11)) | i3 | i8;
        int i16 = i3 + i6 + i4 + (1962400304 * i2) + (1167700406 * i5);
        int i17 = i16 * i16;
        int i18 = ((i3 * (-1629562239)) - 1134582380) + (i6 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + ((-1629561329) * i4) + ((-1621399344) * i2) + ((-873382486) * i5) + (i17 * 1407582208);
        switch (((i3 * (-1019457937)) - 559939584) + ((-1019457937) * i6) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i4) + ((-1660944384) * i2) + ((-325058560) * i5) + (867827712 * i17) + (i18 * i18 * (-1895432192))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                CreditCardIssueActivity creditCardIssueActivity = (CreditCardIssueActivity) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i19 = 2 % 2;
                int i20 = writeTypedObject + 85;
                access000 = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(th, "");
                creditCardIssueActivity.access200().mayLaunchUrl().setValue(th);
                Unit unit = Unit.INSTANCE;
                int i22 = writeTypedObject + 75;
                access000 = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 4:
                BaseActivity baseActivity = (CreditCardIssueActivity) objArr[0];
                int i24 = 2 % 2;
                int i25 = writeTypedObject + 37;
                access000 = i25 % 128;
                int i26 = i25 % 2;
                Uri data = baseActivity.getIntent().getData();
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, 127 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Uri data2 = baseActivity.getIntent().getData();
                Object[] objArr3 = new Object[1];
                a(null, null, new byte[]{-127, -126, -127, -126, -125, -126, -127}, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
                String str = (String) filterCreatePageParams.onWarmupCompleted(new Object[]{data, strIntern, (String) filterCreatePageParams.onWarmupCompleted(new Object[]{data2, ((String) objArr3[0]).intern(), ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789)}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
                int i27 = writeTypedObject + 47;
                access000 = i27 % 128;
                int i28 = i27 % 2;
                return str;
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return onExtraCallbackWithResult(objArr);
            default:
                BaseActivity baseActivity2 = (CreditCardIssueActivity) objArr[0];
                int i29 = 2 % 2;
                int i30 = access000 + 45;
                writeTypedObject = i30 % 128;
                int i31 = i30 % 2;
                boolean zOnExtraCallback = filterCreatePageParams.onExtraCallback(baseActivity2.getIntent().getData(), "debug", false);
                int i32 = writeTypedObject + 55;
                access000 = i32 % 128;
                int i33 = i32 % 2;
                return Boolean.valueOf(zOnExtraCallback);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(dialogInterface);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = writeTypedObject + 25;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(getEncryptedData getencrypteddata, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(getencrypteddata, commonModule_setLeftEdgeTouchEnabled);
        }
        onWarmupCompleted(getencrypteddata, commonModule_setLeftEdgeTouchEnabled);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditCardIssueActivity creditCardIssueActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(creditCardIssueActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(creditCardIssueActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = writeTypedObject + 125;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 1;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 25;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onPostMessage implements Function0<CERT_GetIsCA> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public onPostMessage(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CERT_GetIsCA invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetIsCA.IAuthTabCallback(layoutInflater);
        }
    }

    public static final /* synthetic */ CardIssueOverviewViewModel IAuthTabCallback(CreditCardIssueActivity creditCardIssueActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOverviewViewModel cardIssueOverviewViewModelAccess200 = creditCardIssueActivity.access200();
        int i4 = writeTypedObject + 17;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return cardIssueOverviewViewModelAccess200;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditCardIssueActivity creditCardIssueActivity = (CreditCardIssueActivity) objArr[0];
        getDigestAlgorithms<getPSourceAlgorithm> getdigestalgorithms = (getDigestAlgorithms) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        creditCardIssueActivity.onNavigationEvent(getdigestalgorithms);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = access000 + 117;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onExtraCallback(CreditCardIssueActivity creditCardIssueActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 67;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = creditCardIssueActivity.asInterface;
        int i5 = i2 + 81;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return iEngagementSignalsCallback_Parcel;
        }
        throw null;
    }

    public static final /* synthetic */ SessionTrackera onExtraCallbackWithResult(CreditCardIssueActivity creditCardIssueActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        SessionTrackera sessionTrackera = creditCardIssueActivity.onTransact;
        if (i4 != 0) {
            int i5 = 91 / 0;
        }
        int i6 = i3 + 15;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return sessionTrackera;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CreditCardIssueActivity creditCardIssueActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        creditCardIssueActivity.onNavigationEvent(deserializeurinullablecollection);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
    }

    public static final /* synthetic */ CERT_GetIsCA onNavigationEvent(CreditCardIssueActivity creditCardIssueActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        CERT_GetIsCA cERT_GetIsCAICustomTabsServiceDefault = creditCardIssueActivity.ICustomTabsServiceDefault();
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return cERT_GetIsCAICustomTabsServiceDefault;
    }

    public static final /* synthetic */ TypographyKtExternalSyntheticLambda0 onWarmupCompleted(CreditCardIssueActivity creditCardIssueActivity) {
        int i = 2 % 2;
        int i2 = access000 + 85;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            creditCardIssueActivity.ICustomTabsServiceStub();
            obj.hashCode();
            throw null;
        }
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0ICustomTabsServiceStub = creditCardIssueActivity.ICustomTabsServiceStub();
        int i3 = access000 + 21;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return typographyKtExternalSyntheticLambda0ICustomTabsServiceStub;
        }
        obj.hashCode();
        throw null;
    }

    public final SessionTrackerb setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 85;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i5 = i3 + 43;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = writeTypedObject + 39;
        access000 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 76 / 0;
        }
        return null;
    }

    public final getDummyAd IAuthTabCallback() {
        int i = 2 % 2;
        getDummyAd getdummyad = this.termsIntent;
        if (getdummyad != null) {
            int i2 = writeTypedObject + 125;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = writeTypedObject + 101;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final zzad onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 27;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 123;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return zzadVar;
        }
        throw null;
    }

    private final CardIssueOverviewViewModel access200() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackDefault.getValue();
        if (i3 == 0) {
            return (CardIssueOverviewViewModel) value;
        }
        throw null;
    }

    private final TypographyKtExternalSyntheticLambda0 ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access000 + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Ripple_androidKt ripple_androidKtFindFragmentById = getSupportFragmentManager().findFragmentById(viva.republica.toss.R.id.navHostFragment);
        Intrinsics.checkNotNull(ripple_androidKtFindFragmentById, "");
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0IAuthTabCallback = ripple_androidKtFindFragmentById.IAuthTabCallback();
        int i4 = access000 + 43;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return typographyKtExternalSyntheticLambda0IAuthTabCallback;
        }
        throw null;
    }

    public static final class onActivityResized implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public onActivityResized(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.IAuthTabCallback.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String validateRelationship() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return (String) filterCreatePageParams.onWarmupCompleted(new Object[]{getIntent().getData(), "funnelId", ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
        }
        int i3 = 74 / 0;
        return (String) filterCreatePageParams.onWarmupCompleted(new Object[]{getIntent().getData(), "funnelId", ""}, 1209790, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1209789);
    }

    public static final class onMessageChannelReady implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public onMessageChannelReady(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.IAuthTabCallback.getViewModelStore();
        }
    }

    public static final class onActivityLayout implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;
        final /* synthetic */ Function0 onWarmupCompleted;

        public onActivityLayout(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onWarmupCompleted;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.IAuthTabCallback.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BaseActivity baseActivity = (CreditCardIssueActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 71;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = baseActivity.getIntent().getStringExtra("referrer_item_id");
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        int i5 = writeTypedObject + 95;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access000 + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("service_referrer");
        int i4 = writeTypedObject + 15;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private final CERT_GetIsCA ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access000 + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CERT_GetIsCA cERT_GetIsCA = (CERT_GetIsCA) value;
        int i4 = access000 + 27;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return cERT_GetIsCA;
        }
        throw null;
    }

    private final Toolbar writeTypedList() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(ICustomTabsServiceDefault().onExtraCallbackWithResult, "");
            throw null;
        }
        Toolbar toolbar = ICustomTabsServiceDefault().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        return toolbar;
    }

    private static final Unit onWarmupCompleted(CreditCardIssueActivity creditCardIssueActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        int iOnNavigationEvent = iEngagementSignalsCallbackDefault.onNavigationEvent();
        if (iOnNavigationEvent == -1) {
            creditCardIssueActivity.access200().onNavigationEvent();
        } else if (iOnNavigationEvent == 301) {
            getDigestAlgorithms getdigestalgorithms = (getDigestAlgorithms) creditCardIssueActivity.access200().newSession().getValue();
            if (getdigestalgorithms == null) {
                return Unit.INSTANCE;
            }
            createAdSizeApi createadsizeapiOnExtraCallbackWithResult = ((getModulus) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{getdigestalgorithms}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onExtraCallbackWithResult();
            if (createadsizeapiOnExtraCallbackWithResult == null) {
                int i2 = access000 + 117;
                writeTypedObject = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = Unit.INSTANCE;
                int i4 = access000 + 57;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
            getDigestAlgorithms.onExtraCallbackWithResult(getdigestalgorithms, creditCardIssueActivity.ICustomTabsServiceStub(), createadsizeapiOnExtraCallbackWithResult, creditCardIssueActivity.access200(), (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = access100;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 77 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback_Parcel)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 75, 16037 - (ViewConfiguration.getTapTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallbackStubProxy) {
            int i4 = $10 + 117;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $10 + 27;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 64, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!getInterfaceDescriptor) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr5);
            int i8 = $10 + 87;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            objArr[0] = str;
            return;
        }
        int i10 = $11 + 117;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 63;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 0) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] / iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 63, (ViewConfiguration.getTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 64, 12214 - TextUtils.getCapsMode("", 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            f = 0.0f;
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit onNavigationEvent(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 99;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(getEncryptedData getencrypteddata, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        MacData macData = (MacData) getencrypteddata;
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(macData.onTransact());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(macData.IAuthTabCallbackStub());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, new CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(macData.onExtraCallbackWithResult().onNavigationEvent(), (TdsButtonV1View.asInterface) null, false, new CreditCardIssueActivity$.ExternalSyntheticLambda1(), 6, (DefaultConstructorMarker) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActivity r25, o.NativeAdViewAttributesApi r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActivity.IAuthTabCallback(viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActivity, o.NativeAdViewAttributesApi):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CreditCardIssueActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActivity.onCreate(android.os.Bundle):void");
    }

    private static final void onWarmupCompleted(CreditCardIssueActivity creditCardIssueActivity, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, "");
            creditCardIssueActivity.onActivityLayout();
            int i3 = 90 / 0;
        } else {
            Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2, "");
            creditCardIssueActivity.onActivityLayout();
        }
        int i4 = writeTypedObject + 121;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(new Bundle());
        int i2 = writeTypedObject + 33;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static final class getInterfaceDescriptor implements Function1<DialogInterface, Unit> {
        getInterfaceDescriptor() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback((DialogInterface) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(DialogInterface dialogInterface) {
            CreditCardIssueActivity.this.finish();
        }
    }

    static final class writeTypedObject implements Function1<TypeUtils7, Unit> {
        writeTypedObject() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted((TypeUtils7) obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(TypeUtils7 typeUtils7) {
            Intrinsics.checkNotNullParameter(typeUtils7, "");
            typeUtils7.onNavigationEvent(CreditCardIssueActivity.this.getString(viva.republica.toss.R.string.app_cardrecommend_issuev2_ui___c35fc36f9a));
        }
    }

    static final class extraCallback implements Function1<isJSONTypeIgnore, Unit> {
        final /* synthetic */ getDigestAlgorithms<getCoefficient> IAuthTabCallback;

        extraCallback(getDigestAlgorithms<getCoefficient> getdigestalgorithms) {
            this.IAuthTabCallback = getdigestalgorithms;
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback((isJSONTypeIgnore) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(isJSONTypeIgnore isjsontypeignore) {
            CardIssueOverviewViewModel cardIssueOverviewViewModelIAuthTabCallback = CreditCardIssueActivity.IAuthTabCallback(CreditCardIssueActivity.this);
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnWarmupCompleted = CreditCardIssueActivity.onWarmupCompleted(CreditCardIssueActivity.this);
            getANActivityLifecycleCallbacksListener getanactivitylifecyclecallbackslistener = new getANActivityLifecycleCallbacksListener(true);
            getDigestAlgorithms<getCoefficient> getdigestalgorithms = this.IAuthTabCallback;
            Intrinsics.checkNotNull(getdigestalgorithms);
            cardIssueOverviewViewModelIAuthTabCallback.onNavigationEvent(typographyKtExternalSyntheticLambda0OnWarmupCompleted, getanactivitylifecyclecallbackslistener, getdigestalgorithms);
        }
    }

    static final class extraCallbackWithResult implements Function1<Throwable, Unit> {
        extraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void IAuthTabCallback(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            CreditCardIssueActivity.IAuthTabCallback(CreditCardIssueActivity.this).mayLaunchUrl().setValue(th);
        }
    }

    private final void onSessionEnded() {
        int i = 2 % 2;
        access200().onNavigationEvent(validateRelationship());
        access200().extraCommand().observe(this, new BaseActivity.validateRelationship(new IAuthTabCallback()));
        access200().prefetch().observe(this, new BaseActivity.validateRelationship(new asBinder()));
        access200().IAuthTabCallbackStubProxy().observe(this, new BaseActivity.validateRelationship(new IAuthTabCallbackDefault()));
        access200().onMessageChannelReady().observe(this, new BaseActivity.validateRelationship(new onTransact()));
        access200().ICustomTabsCallback_Parcel().observe(this, new BaseActivity.validateRelationship(new asInterface()));
        access200().receiveFile().observe(this, new BaseActivity.validateRelationship(new IAuthTabCallbackStub()));
        access200().ICustomTabsService().observe(this, new BaseActivity.validateRelationship(new access000()));
        access200().isEngagementSignalsApiAvailable().observe(this, new BaseActivity.validateRelationship(new IAuthTabCallbackStubProxy()));
        access200().newAuthTabSession().observe(this, new BaseActivity.validateRelationship(new access100()));
        access200().mayLaunchUrl().observe(this, new BaseActivity.validateRelationship(new onExtraCallbackWithResult()));
        access200().requestPostMessageChannel().observe(this, new BaseActivity.validateRelationship(new onWarmupCompleted()));
        access200().newSession().observe(this, new BaseActivity.validateRelationship(new onExtraCallback()));
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new ICustomTabsCallback(this, (access13800) null), 3, (Object) null);
        int i2 = access000 + 23;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(CreditCardIssueActivity creditCardIssueActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = access000 + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            int i4 = writeTypedObject + 1;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                creditCardIssueActivity.access200().newAuthTabSession().onWarmupCompleted();
                int i5 = 38 / 0;
            } else {
                creditCardIssueActivity.access200().newAuthTabSession().onWarmupCompleted();
            }
        }
        return Unit.INSTANCE;
    }

    static final class readTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getDigestAlgorithms<getPSourceAlgorithm> $navigator;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        readTypedObject(getDigestAlgorithms<getPSourceAlgorithm> getdigestalgorithms, access13800<? super readTypedObject> access13800Var) {
            super(2, access13800Var);
            this.$navigator = getdigestalgorithms;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CreditCardIssueActivity.this.new readTypedObject(this.$navigator, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelOnExtraCallbackWithResult = CreditCardIssueActivity.onExtraCallbackWithResult(CreditCardIssueActivity.this);
                getDummyAd getdummyadIAuthTabCallback = CreditCardIssueActivity.this.IAuthTabCallback();
                BaseActivity baseActivity = CreditCardIssueActivity.this;
                String strOnWarmupCompleted = ((getPSourceAlgorithm) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{this.$navigator}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onWarmupCompleted();
                String strOnActivityResized = CreditCardIssueActivity.IAuthTabCallback(CreditCardIssueActivity.this).onActivityResized();
                String strICustomTabsCallbackStub = CreditCardIssueActivity.IAuthTabCallback(CreditCardIssueActivity.this).ICustomTabsCallbackStub();
                if (strICustomTabsCallbackStub == null) {
                    strICustomTabsCallbackStub = "card_brokerage";
                }
                this.L$0 = iEngagementSignalsCallback_ParcelOnExtraCallbackWithResult;
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadIAuthTabCallback, baseActivity, strOnWarmupCompleted, strOnActivityResized, strICustomTabsCallbackStub, 305L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388576, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                iEngagementSignalsCallback_Parcel = iEngagementSignalsCallback_ParcelOnExtraCallbackWithResult;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel2 = (SessionTrackera) this.L$0;
                ResultKt.onNavigationEvent(obj);
                iEngagementSignalsCallback_Parcel = iEngagementSignalsCallback_Parcel2;
                objOnExtraCallback = obj;
            }
            iEngagementSignalsCallback_Parcel.onNavigationEvent(objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    private final void onNavigationEvent(getDigestAlgorithms<getPSourceAlgorithm> getdigestalgorithms) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new readTypedObject(getdigestalgorithms, null), 3, (Object) null);
        int i2 = access000 + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static final class IAuthTabCallback implements Function1<getDigestAlgorithms<? extends MacData>, Unit> {
        public IAuthTabCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent(obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActivity] */
        public final void onNavigationEvent(getDigestAlgorithms<? extends MacData> getdigestalgorithms) {
            ?? r0 = CreditCardIssueActivity.this;
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r0, new IAuthTabCallback_Parcel(getdigestalgorithms, (CreditCardIssueActivity) r0));
        }
    }

    public static final class IAuthTabCallbackDefault implements Function1<createAdSizeApi.onExtraCallbackWithResult, Unit> {
        public IAuthTabCallbackDefault() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(createAdSizeApi.onExtraCallbackWithResult onextracallbackwithresult) {
            createAdSizeApi.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
            if ((onextracallbackwithresult2 != null ? onextracallbackwithresult2.onWarmupCompleted() : null) != null) {
                SessionTrackerb.IAuthTabCallback(CreditCardIssueActivity.this.setEngagementSignalsCallback(), CreditCardIssueActivity.this, onextracallbackwithresult2.onWarmupCompleted(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            }
            CreditCardIssueActivity.this.finish();
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<getPublicExponent, Unit> {
        public IAuthTabCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(getPublicExponent getpublicexponent) {
            SessionTrackerb.IAuthTabCallback(CreditCardIssueActivity.this.setEngagementSignalsCallback(), CreditCardIssueActivity.this, getpublicexponent.onWarmupCompleted(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
    }

    public static final class IAuthTabCallbackStubProxy implements Function1<getDigestAlgorithms<? extends getPSourceAlgorithm>, Unit> {
        public IAuthTabCallbackStubProxy() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(getDigestAlgorithms<? extends getPSourceAlgorithm> getdigestalgorithms) throws Throwable {
            getDigestAlgorithms<? extends getPSourceAlgorithm> getdigestalgorithms2 = getdigestalgorithms;
            CreditCardIssueActivity creditCardIssueActivity = CreditCardIssueActivity.this;
            Intrinsics.checkNotNull(getdigestalgorithms2);
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            CreditCardIssueActivity.onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{creditCardIssueActivity, getdigestalgorithms2}, 1617433832, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), -1617433830);
        }
    }

    public static final class access000 implements Function1<Unit, Unit> {
        public access000() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent(obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(Unit unit) {
            getNavigationBar.IAuthTabCallback(CardIssueDccGuideActivity.Companion.onNavigationEvent(CreditCardIssueActivity.this), CreditCardIssueActivity.this);
        }
    }

    public static final class access100 implements Function1<Unit, Unit> {
        public access100() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Unit unit) {
            getDigestAlgorithms getdigestalgorithms = (getDigestAlgorithms) CreditCardIssueActivity.IAuthTabCallback(CreditCardIssueActivity.this).isEngagementSignalsApiAvailable().getValue();
            if (getdigestalgorithms != null) {
                getDigestAlgorithms.onExtraCallback(getdigestalgorithms, CreditCardIssueActivity.onWarmupCompleted(CreditCardIssueActivity.this), CreditCardIssueActivity.IAuthTabCallback(CreditCardIssueActivity.this), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, (String) null, (Map) null, 40, (Object) null);
            }
        }
    }

    public static final class asBinder implements Function1<getExponent2, Unit> {
        public asBinder() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(getExponent2 getexponent2) {
            getExponent2 getexponent22 = getexponent2;
            ConstraintLayout root = CreditCardIssueActivity.onNavigationEvent(CreditCardIssueActivity.this).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            TdsToastV1.onNavigationEvent.onWarmupCompleted(new TdsToastV1.onNavigationEvent(root, getexponent22.onExtraCallbackWithResult()), deprecated_authenticator.onWarmupCompleted(getexponent22.onWarmupCompleted()), 0, 2, (Object) null).onNavigationEvent();
        }
    }

    public static final class asInterface implements Function1<Boolean, Unit> {
        public asInterface() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(Boolean bool) {
            if (bool.booleanValue()) {
                BaseActivity.IAuthTabCallback(CreditCardIssueActivity.this, (String) null, false, 3, (Object) null);
            } else {
                CreditCardIssueActivity.this.bo_();
            }
        }
    }

    public static final class onExtraCallback implements Function1<getDigestAlgorithms<? extends getModulus>, Unit> {
        public onExtraCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onExtraCallbackWithResult(getDigestAlgorithms<? extends getModulus> getdigestalgorithms) {
            getDigestAlgorithms<? extends getModulus> getdigestalgorithms2 = getdigestalgorithms;
            CardIssueOverviewViewModel cardIssueOverviewViewModelIAuthTabCallback = CreditCardIssueActivity.IAuthTabCallback(CreditCardIssueActivity.this);
            Intrinsics.checkNotNull(getdigestalgorithms2);
            cardIssueOverviewViewModelIAuthTabCallback.IAuthTabCallback((getDigestAlgorithms<getModulus>) getdigestalgorithms2);
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Throwable, Unit> {
        public onExtraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback(obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActivity] */
        public final void onExtraCallback(Throwable th) {
            Throwable th2 = th;
            Intrinsics.checkNotNull(th2);
            ?? r1 = CreditCardIssueActivity.this;
            getParamImp.onWarmupCompleted(th2, (Context) r1, false, (initMiniApp) null, (Function0) null, new getInterfaceDescriptor(), 14, (Object) null);
        }
    }

    public static final class onTransact implements Function1<createAdSizeApi.onNavigationEvent, Unit> {
        public onTransact() {
        }

        public final void IAuthTabCallback(createAdSizeApi.onNavigationEvent onnavigationevent) {
            createAdSizeApi.onNavigationEvent onnavigationevent2 = onnavigationevent;
            if ((onnavigationevent2 != null ? onnavigationevent2.onWarmupCompleted() : null) != null) {
                SessionTrackerb.IAuthTabCallback(CreditCardIssueActivity.this.setEngagementSignalsCallback(), CreditCardIssueActivity.this, onnavigationevent2.onWarmupCompleted(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class onWarmupCompleted implements Function1<getDigestAlgorithms<? extends getCoefficient>, Unit> {
        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(getDigestAlgorithms<? extends getCoefficient> getdigestalgorithms) {
            CreditCardIssueActivity creditCardIssueActivity = CreditCardIssueActivity.this;
            writeRaw writerawExtraCallback = shortValue.IAuthTabCallback(shortValue.Companion, creditCardIssueActivity, UTF8Decoder.TOSS_CARD_SETTINGS, 0L, false, false, false, false, (shortValue.onNavigationEvent) null, false, (Function0) null, false, (TypeUtils1) null, false, (String) null, creditCardIssueActivity.new writeTypedObject(), 16376, (Object) null).extraCallback();
            Intrinsics.checkNotNullExpressionValue(writerawExtraCallback, "");
            CreditCardIssueActivity.onExtraCallbackWithResult(creditCardIssueActivity, setMessageBytes.onExtraCallbackWithResult(writerawExtraCallback, CreditCardIssueActivity.this.new extraCallbackWithResult(), CreditCardIssueActivity.this.new extraCallback(getdigestalgorithms)));
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditCardIssueActivity creditCardIssueActivity, NativeAdViewAttributesApi nativeAdViewAttributesApi) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{creditCardIssueActivity, nativeAdViewAttributesApi}, -412436542, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 412436548);
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{dialogInterface}, 334882993, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), -334882988);
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditCardIssueActivity creditCardIssueActivity, getDigestAlgorithms getdigestalgorithms) throws Throwable {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{creditCardIssueActivity, getdigestalgorithms}, 1617433832, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), -1617433830);
    }

    private final String ICustomTabsService_Parcel() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (String) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{this}, -801117647, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 801117651);
    }

    private final String IEngagementSignalsCallback() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (String) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{this}, -764522116, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 764522117);
    }

    private final boolean IEngagementSignalsCallbackDefault() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{this}, -1646133020, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 1646133020)).booleanValue();
    }

    private static final Unit onExtraCallbackWithResult(CreditCardIssueActivity creditCardIssueActivity, Throwable th) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{creditCardIssueActivity, th}, -578368928, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 578368931);
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CreditCardIssueActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = writeTypedObject + 27;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CreditCardIssueActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 73;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = writeTypedObject + 93;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CreditCardIssueActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access000 + 1;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.Hilt_CreditCardIssueActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 79;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 13;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void updateVisuals() {
        access100 = new char[]{32503, 32452, 32507};
        IAuthTabCallback_Parcel = -1184333983;
        getInterfaceDescriptor = true;
        IAuthTabCallbackStubProxy = true;
    }
}
