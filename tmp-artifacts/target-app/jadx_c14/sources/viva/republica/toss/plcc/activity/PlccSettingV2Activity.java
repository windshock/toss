package viva.republica.toss.plcc.activity;

import android.animation.AnimatorInflater;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.core.content.res.ResourcesCompat;
import com.google.common.collect.Synchronized;
import im.toss.base.BaseActivity;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.network.model.BaseApiResponse;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import o.AdSettingsIntegrationErrorMode;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_closeView;
import o.ConvertByteArrayToFloatArray;
import o.DalvikPurgeableDecoder;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.IdGeneratorExternalSyntheticLambda1;
import o.InterstitialAdInterstitialAdShowConfigBuilder;
import o.MapConverter;
import o.NetConverter3;
import o.OkHttp;
import o.ParamImpl;
import o.PlayerErrorCode;
import o.ReactNativeFeatureFlagsAccessor;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o._string;
import o.access13800;
import o.access14000;
import o.access14300;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getCurrentDarkerSystemColorsState;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDummyAd;
import o.getLongName;
import o.getNavigationBar;
import o.getOriginalFullResponse;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.initMiniApp;
import o.matches;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0;
import o.r8lambdaU57xnDihMSuETYHRoaz0sEQy8Bc;
import o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE;
import o.readIntokhttp;
import o.response;
import o.setBodyokhttp;
import o.setHasShown;
import o.setHeadersokhttp;
import o.setMessageBytes;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setVisitUrl;
import o.shouldUseHardwareBitmapConfig;
import o.varyMatches;
import o.withWriteTimeout;
import o.writeRaw;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.credit.commons.views.TitleContentBottomSheetDialog;
import viva.republica.toss.plcc.activity.PlccSettingV2Activity$;
import viva.republica.toss.plcc.dialog.PlccCardLimitDialog;
import viva.republica.toss.plcc.dialog.PlccCashbackBottomSheetDialog;
import viva.republica.toss.plcc.expectbillamount.PlccExpectedBillAmountActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccSettingV2Activity extends Hilt_PlccSettingV2Activity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static char[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100;
    public static final int asInterface;
    private static int getInterfaceDescriptor;
    private TdsListRowV1View IAuthTabCallbackStub;

    @Inject
    public r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE agreedToAllRequiredTermsUseCase;

    @Inject
    public r8lambdaU57xnDihMSuETYHRoaz0sEQy8Bc disagreeStandardTermsCodeUseCase;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public zzag tossClock;

    @Inject
    public SessionTrackerb tossRouter;
    private final SessionTrackera asBinder = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.plcc.activity.PlccSettingV2Activity$$ExternalSyntheticLambda9
        public final Object invoke(Object obj) {
            return PlccSettingV2Activity.onWarmupCompleted(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        }
    });
    private final CompoundButton.OnCheckedChangeListener onTransact = new CompoundButton.OnCheckedChangeListener() { // from class: viva.republica.toss.plcc.activity.PlccSettingV2Activity$$ExternalSyntheticLambda10
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Object[] objArr = {this.f$0, compoundButton, Boolean.valueOf(z)};
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            PlccSettingV2Activity.onNavigationEvent(objArr, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1704557024, iOnWarmupCompleted, 1704557028, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        }
    };

    static {
        ICustomTabsServiceStub();
        Companion = new onWarmupCompleted(null);
        asInterface = 8;
        int i = access100 + 9;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsListRowV1View tdsListRowV1View, PlccSettingV2Activity plccSettingV2Activity, getCurrentDarkerSystemColorsState getcurrentdarkersystemcolorsstate) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tdsListRowV1View, plccSettingV2Activity, getcurrentdarkersystemcolorsstate);
        int i4 = access000 + 31;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity, View view) {
        int i = 2 % 2;
        int i2 = access000 + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, view}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -59597132, iOnWarmupCompleted, 59597143, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        int i4 = getInterfaceDescriptor + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(plccSettingV2Activity, shouldusehardwarebitmapconfig);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        int i5 = access000 + 33;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity, DalvikPurgeableDecoder dalvikPurgeableDecoder, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(plccSettingV2Activity, dalvikPurgeableDecoder, view);
        int i4 = access000 + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        PlccSettingV2Activity plccSettingV2Activity = (PlccSettingV2Activity) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(plccSettingV2Activity, deserializeurinullablecollection);
        int i4 = getInterfaceDescriptor + 77;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        PlccSettingV2Activity plccSettingV2Activity = (PlccSettingV2Activity) objArr[0];
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, tdsListRowV1View, view}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 310533925, iOnWarmupCompleted, -310533925, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        int i4 = getInterfaceDescriptor + 55;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PlccSettingV2Activity plccSettingV2Activity = (PlccSettingV2Activity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(plccSettingV2Activity, view);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        int i4 = getInterfaceDescriptor + 125;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PlccSettingV2Activity plccSettingV2Activity = (PlccSettingV2Activity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, dialogInterface}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 401560231, iOnWarmupCompleted, -401560229, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        int i4 = getInterfaceDescriptor + 5;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(PlccSettingV2Activity plccSettingV2Activity, Throwable th) {
        int i = 2 % 2;
        int i2 = access000 + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(plccSettingV2Activity, th);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        int i5 = getInterfaceDescriptor + 21;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(PlccSettingV2Activity plccSettingV2Activity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(plccSettingV2Activity, setDetectableSize);
        int i4 = getInterfaceDescriptor + 13;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            return (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, shouldusehardwarebitmapconfig}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 302667070, iOnWarmupCompleted, -302667067, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        }
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig, View view) {
        int i = 2 % 2;
        int i2 = access000 + 21;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(plccSettingV2Activity, shouldusehardwarebitmapconfig, view);
        }
        onExtraCallbackWithResult(plccSettingV2Activity, shouldusehardwarebitmapconfig, view);
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(PlccSettingV2Activity plccSettingV2Activity) {
        int i = 2 % 2;
        int i2 = access000 + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(plccSettingV2Activity);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(PlccSettingV2Activity plccSettingV2Activity, TitleContentBottomSheetDialog titleContentBottomSheetDialog, View view) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(plccSettingV2Activity, titleContentBottomSheetDialog, view);
        int i4 = getInterfaceDescriptor + 113;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccSettingV2Activity plccSettingV2Activity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(plccSettingV2Activity, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(plccSettingV2Activity, view);
        int i3 = access000 + 29;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccSettingV2Activity plccSettingV2Activity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(plccSettingV2Activity, deserializeurinullablecollection);
        }
        onExtraCallback(plccSettingV2Activity, deserializeurinullablecollection);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig, TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        int i2 = access000 + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(plccSettingV2Activity, shouldusehardwarebitmapconfig, tdsListRowV1View, view);
        int i4 = getInterfaceDescriptor + 9;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PlccSettingV2Activity plccSettingV2Activity = (PlccSettingV2Activity) objArr[0];
        CompoundButton compoundButton = (CompoundButton) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        if (i3 != 0) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            onNavigationEvent(new Object[]{plccSettingV2Activity, compoundButton, boolValueOf}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 713329553, iOnWarmupCompleted, -713329546, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
            return null;
        }
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        onNavigationEvent(new Object[]{plccSettingV2Activity, compoundButton, boolValueOf}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 713329553, iOnWarmupCompleted2, -713329546, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~((~i3) | i8);
        int i10 = i3 | i8;
        int i11 = i2 + i4 + i + ((-189913888) * i6) + ((-1809372279) * i5);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i2) - 1671495680) + (10634006 * i4) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i) + (952107008 * i6) + (1092222976 * i5) + ((-70844416) * i12);
        int i14 = (i2 * 986545540) + 223666697 + (i4 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i * 986544659) + (i6 * 1843362976) + (i5 * (-1872984789)) + (i12 * (-2050686976));
        switch (i13 + (i14 * i14 * 1179713536)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                int i15 = 2 % 2;
                zzag zzagVar = ((PlccSettingV2Activity) objArr[0]).tossClock;
                if (zzagVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    return null;
                }
                int i16 = access000;
                int i17 = i16 + 111;
                getInterfaceDescriptor = i17 % 128;
                int i18 = i17 % 2;
                int i19 = i16 + 49;
                getInterfaceDescriptor = i19 % 128;
                int i20 = i19 % 2;
                return zzagVar;
            case 10:
                return asInterface(objArr);
            case 11:
                return access000(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PlccSettingV2Activity plccSettingV2Activity = (PlccSettingV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(plccSettingV2Activity);
        int i4 = getInterfaceDescriptor + 97;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig, PlccSettingV2Activity plccSettingV2Activity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(shouldusehardwarebitmapconfig, plccSettingV2Activity, view);
        int i4 = access000 + 89;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity, Throwable th) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(plccSettingV2Activity, th);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = getInterfaceDescriptor + 105;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = access000 + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(plccSettingV2Activity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i4 = getInterfaceDescriptor + 1;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(plccSettingV2Activity, shouldusehardwarebitmapconfig);
        int i4 = access000 + 109;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access000 + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        onNavigationEvent(new Object[]{function1, obj}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1234156735, iOnWarmupCompleted, 1234156743, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        int i4 = access000 + 1;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 63;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return -1L;
    }

    public static final class getInterfaceDescriptor implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
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

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access000 implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public access000(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access100 implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public access100(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asBinder(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
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

    public static final /* synthetic */ SessionTrackera IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 93;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackera sessionTrackera = plccSettingV2Activity.asBinder;
        int i5 = i2 + 49;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackera;
    }

    public static final /* synthetic */ void IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity, boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        plccSettingV2Activity.onWarmupCompleted(z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 17;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PlccSettingV2Activity plccSettingV2Activity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        plccSettingV2Activity.IEngagementSignalsCallback();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(PlccSettingV2Activity plccSettingV2Activity, String str) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        plccSettingV2Activity.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        int i5 = access000 + 59;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.plcc.activity.PlccSettingV2Activity.getInterfaceDescriptor + 123;
        viva.republica.toss.plcc.activity.PlccSettingV2Activity.access000 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 19;
        viva.republica.toss.plcc.activity.PlccSettingV2Activity.getInterfaceDescriptor = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.SessionTrackerb validateRelationship() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.plcc.activity.PlccSettingV2Activity.access000
            int r2 = r1 + 43
            int r3 = r2 % 128
            viva.republica.toss.plcc.activity.PlccSettingV2Activity.getInterfaceDescriptor = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L18
            o.SessionTrackerb r2 = r5.tossRouter
            r4 = 70
            int r4 = r4 / 0
            if (r2 == 0) goto L27
            goto L1c
        L18:
            o.SessionTrackerb r2 = r5.tossRouter
            if (r2 == 0) goto L27
        L1c:
            int r1 = r1 + 19
            int r4 = r1 % 128
            viva.republica.toss.plcc.activity.PlccSettingV2Activity.getInterfaceDescriptor = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L26
            return r2
        L26:
            throw r3
        L27:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.plcc.activity.PlccSettingV2Activity.getInterfaceDescriptor
            int r1 = r1 + 123
            int r2 = r1 % 128
            viva.republica.toss.plcc.activity.PlccSettingV2Activity.access000 = r2
            int r1 = r1 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccSettingV2Activity.validateRelationship():o.SessionTrackerb");
    }

    public final getDummyAd setEngagementSignalsCallback() {
        int i = 2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad != null) {
            int i2 = getInterfaceDescriptor + 87;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 22 / 0;
            }
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = access000 + 29;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final r8lambdaU57xnDihMSuETYHRoaz0sEQy8Bc IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 23;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaU57xnDihMSuETYHRoaz0sEQy8Bc r8lambdau57xndihmsuetyhroaz0seqy8bc = this.disagreeStandardTermsCodeUseCase;
        if (r8lambdau57xndihmsuetyhroaz0seqy8bc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 53;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdau57xndihmsuetyhroaz0seqy8bc;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 17;
        viva.republica.toss.plcc.activity.PlccSettingV2Activity.access000 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE onNavigationEvent() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.plcc.activity.PlccSettingV2Activity.getInterfaceDescriptor
            int r2 = r1 + 95
            int r3 = r2 % 128
            viva.republica.toss.plcc.activity.PlccSettingV2Activity.access000 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L18
            o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r2 = r5.agreedToAllRequiredTermsUseCase
            r4 = 87
            int r4 = r4 / 0
            if (r2 == 0) goto L2a
            goto L1c
        L18:
            o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r2 = r5.agreedToAllRequiredTermsUseCase
            if (r2 == 0) goto L2a
        L1c:
            int r1 = r1 + 17
            int r4 = r1 % 128
            viva.republica.toss.plcc.activity.PlccSettingV2Activity.access000 = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            return r2
        L26:
            r3.hashCode()
            throw r3
        L2a:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.activity.PlccSettingV2Activity.onNavigationEvent():o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE");
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access000 + 11;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return "tosscreditcard__settings";
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 r8lambdahekmogpxfnmskbbrjd3t2vn5d0IAuthTabCallback = r8lambda6v0yvgpvgcqzeji1gnetqsiyse.IAuthTabCallback();
        if (r8lambdahekmogpxfnmskbbrjd3t2vn5d0IAuthTabCallback == r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_COMPLETED_MESSAGE) {
            int i2 = access000 + 79;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                String string = plccSettingV2Activity.getString(R.string.app_plcc_activity___8f8879b929);
                Intrinsics.checkNotNullExpressionValue(string, "");
                plccSettingV2Activity.onWarmupCompleted(string);
                int i3 = 32 / 0;
            } else {
                String string2 = plccSettingV2Activity.getString(R.string.app_plcc_activity___8f8879b929);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                plccSettingV2Activity.onWarmupCompleted(string2);
            }
        } else if (!r8lambdahekmogpxfnmskbbrjd3t2vn5d0IAuthTabCallback.isSucceed()) {
            int i4 = getInterfaceDescriptor + 117;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            plccSettingV2Activity.onWarmupCompleted(false);
            int i6 = access000 + 61;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 3;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PlccSettingV2Activity plccSettingV2Activity = (PlccSettingV2Activity) objArr[0];
        CompoundButton compoundButton = (CompoundButton) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        Object obj = null;
        if (!(!zBooleanValue)) {
            plccSettingV2Activity.access200();
            return null;
        }
        plccSettingV2Activity.ICustomTabsServiceDefault();
        int i4 = getInterfaceDescriptor + 113;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        int i5 = getInterfaceDescriptor + 67;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onExtraCallback(PlccSettingV2Activity plccSettingV2Activity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = access000 + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(plccSettingV2Activity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallbackStub(PlccSettingV2Activity plccSettingV2Activity) {
        int i = 2 % 2;
        int i2 = access000 + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        plccSettingV2Activity.bo_();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access000 + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(shouldusehardwarebitmapconfig);
            View viewOnExtraCallbackWithResult = plccSettingV2Activity.onExtraCallbackWithResult(shouldusehardwarebitmapconfig);
            plccSettingV2Activity.setContentView(viewOnExtraCallbackWithResult);
            disableImageViewPreallocationAndroid.onNavigationEvent(viewOnExtraCallbackWithResult, viewOnExtraCallbackWithResult.findViewById(R.id.appBarLayout), (View) null, (View) null, false, 19, (Object) null);
        } else {
            Intrinsics.checkNotNull(shouldusehardwarebitmapconfig);
            View viewOnExtraCallbackWithResult2 = plccSettingV2Activity.onExtraCallbackWithResult(shouldusehardwarebitmapconfig);
            plccSettingV2Activity.setContentView(viewOnExtraCallbackWithResult2);
            disableImageViewPreallocationAndroid.onNavigationEvent(viewOnExtraCallbackWithResult2, viewOnExtraCallbackWithResult2.findViewById(R.id.appBarLayout), (View) null, (View) null, false, 14, (Object) null);
        }
        plccSettingV2Activity.ICustomTabsServiceStubProxy();
        Unit unit = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 75;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PlccSettingV2Activity plccSettingV2Activity = (PlccSettingV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        plccSettingV2Activity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 87;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(PlccSettingV2Activity plccSettingV2Activity, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, plccSettingV2Activity, false, (initMiniApp) null, (Function0) null, new PlccSettingV2Activity$.ExternalSyntheticLambda8(plccSettingV2Activity), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 39;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSettingV2Activity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, KeyEvent.getDeadChar(0, 0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971064817);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - TextUtils.getOffsetAfter("", 0)), 22 - (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.getDeadChar(0, 0) + 24734, -1144844641, false, "access100", new Class[0]);
            }
            writeRaw<BaseApiResponse<shouldUseHardwareBitmapConfig>> writerawOnExtraCallbackWithResult = ((InterstitialAdInterstitialAdShowConfigBuilder) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallbackWithResult();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new ICustomTabsCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new PlccSettingV2Activity$.ExternalSyntheticLambda1(new PlccSettingV2Activity$.ExternalSyntheticLambda0(this))).onWarmupCompleted(new PlccSettingV2Activity$.ExternalSyntheticLambda2(this));
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
            onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new PlccSettingV2Activity$.ExternalSyntheticLambda3(this), new PlccSettingV2Activity$.ExternalSyntheticLambda4(this)));
            int i2 = access000 + 95;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, viva.republica.toss.plcc.activity.PlccSettingV2Activity] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SessionTrackerb sessionTrackerbValidateRelationship;
        String strOnWarmupCompleted;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        Object obj;
        ?? r2 = (PlccSettingV2Activity) objArr[0];
        shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig = (shouldUseHardwareBitmapConfig) objArr[1];
        int i2 = 2 % 2;
        int i3 = access000 + 47;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            sessionTrackerbValidateRelationship = r2.validateRelationship();
            strOnWarmupCompleted = shouldusehardwarebitmapconfig.onWarmupCompleted();
            z = true;
            function1 = null;
            bundle = null;
            z2 = false;
            i = 64;
            obj = null;
        } else {
            sessionTrackerbValidateRelationship = r2.validateRelationship();
            strOnWarmupCompleted = shouldusehardwarebitmapconfig.onWarmupCompleted();
            z = false;
            function1 = null;
            bundle = null;
            z2 = false;
            i = 60;
            obj = null;
        }
        SessionTrackerb.IAuthTabCallback(sessionTrackerbValidateRelationship, (Activity) r2, strOnWarmupCompleted, z, function1, bundle, z2, i, obj);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 11;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb.IAuthTabCallback(plccSettingV2Activity.validateRelationship(), plccSettingV2Activity, shouldusehardwarebitmapconfig.onWarmupCompleted(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 89;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig, PlccSettingV2Activity plccSettingV2Activity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (shouldusehardwarebitmapconfig.IAuthTabCallback() != 0) {
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = new IdGeneratorExternalSyntheticLambda1("yy.MM.dd");
            Object[] objArr = {CommonModule_closeView.onWarmupCompleted};
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            Date date = ((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback())).parse(shouldusehardwarebitmapconfig.asInterface());
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            zzag zzagVar = (zzag) onNavigationEvent(new Object[]{plccSettingV2Activity}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1412078940, iOnWarmupCompleted, 1412078949, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            Calendar calendarOnWarmupCompleted = zzagVar.onWarmupCompleted(((zzag) onNavigationEvent(new Object[]{plccSettingV2Activity}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1412078940, iOnWarmupCompleted2, 1412078949, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).asBinder());
            calendarOnWarmupCompleted.set(5, 15);
            int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            zzag zzagVar2 = (zzag) onNavigationEvent(new Object[]{plccSettingV2Activity}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1412078940, iOnWarmupCompleted3, 1412078949, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
            int iOnWarmupCompleted4 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            if (zzagVar2.onWarmupCompleted(((zzag) onNavigationEvent(new Object[]{plccSettingV2Activity}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1412078940, iOnWarmupCompleted4, 1412078949, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).asBinder()).get(5) < 15) {
                int i4 = access000 + 61;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                calendarOnWarmupCompleted.add(2, -1);
                int i6 = access000 + 39;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
            }
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            String string = plccSettingV2Activity.getString(R.string.app_plcc_activity___db0d483514, getLongName.onNavigationEvent(shouldusehardwarebitmapconfig.IAuthTabCallback(), (ParamImpl) null, 1, (Object) null));
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = plccSettingV2Activity.getString(R.string.app_plcc_activity___225bbaacd0, idGeneratorExternalSyntheticLambda1.format(date), idGeneratorExternalSyntheticLambda1.format(new Date(calendarOnWarmupCompleted.getTimeInMillis())));
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = plccSettingV2Activity.getString(R.string.app_plcc_activity___bf44e14a4e);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            PlccSettingV2Activity$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new PlccSettingV2Activity$.ExternalSyntheticLambda5(plccSettingV2Activity, shouldusehardwarebitmapconfig);
            Object[] objArr2 = new Object[1];
            a(new char[]{2, 30, '#', 26, 5, '\t', 13855, 13855, 2, '!', 20, '#', 15, 6, 26, '!', 21, 0, '\t', '!', '\r', 6, 15, ' ', 20, 30, 30, 14, 2, '\r', 5, 27, 20, 30, 15, 2, 24, 23, '!', 31, 7, 3, 31, 3, 20, 27, 20, '#', 18, 24, 21, 26, '!', 5, 19, 21}, (byte) (106 - (ViewConfiguration.getLongPressTimeout() >> 16)), 56 - TextUtils.indexOf("", "", 0, 0), objArr2);
            new PlccCashbackBottomSheetDialog(context, ((String) objArr2[0]).intern(), string, string2, string3, externalSyntheticLambda5).show();
        } else {
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            String string4 = plccSettingV2Activity.getString(R.string.app_plcc_activity___f116cab58e);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String string5 = plccSettingV2Activity.getString(R.string.app_plcc_activity___4bed5cccdf);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            String string6 = plccSettingV2Activity.getString(R.string.app_plcc_activity___bf44e14a4e);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            PlccSettingV2Activity$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new PlccSettingV2Activity$.ExternalSyntheticLambda6(plccSettingV2Activity, shouldusehardwarebitmapconfig);
            Object[] objArr3 = new Object[1];
            a(new char[]{2, 30, '#', 26, 5, '\t', 13799, 13799, 2, '!', 20, '#', 15, 6, 26, '!', 21, 0, '\t', '!', '\r', 6, 15, ' ', 20, 30, 30, 14, 2, 4, 15, 2, 24, 23, 2, 20, 5, 27, 20, 30, 26, 27, 18, 21, 0, 22, '\t', 25, '!', 5, 19, 21}, (byte) (50 - View.getDefaultSize(0, 0)), 52 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
            new PlccCashbackBottomSheetDialog(context2, ((String) objArr3[0]).intern(), string4, string5, string6, externalSyntheticLambda6).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity, DalvikPurgeableDecoder dalvikPurgeableDecoder, View view) {
        int i = 2 % 2;
        int i2 = access000 + 71;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            SessionTrackerb.IAuthTabCallback(plccSettingV2Activity.validateRelationship(), plccSettingV2Activity, dalvikPurgeableDecoder.onNavigationEvent(), true, (Function1) null, (Bundle) null, true, 102, (Object) null);
        } else {
            SessionTrackerb.IAuthTabCallback(plccSettingV2Activity.validateRelationship(), plccSettingV2Activity, dalvikPurgeableDecoder.onNavigationEvent(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = IAuthTabCallbackDefault;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 13;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - Color.green(0), 23139 - ((Process.getThreadPriority(0) + 20) >> 6), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback_Parcel)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 26 - TextUtils.indexOf("", "", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $10 + 85;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 95;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i10 = $10 + 33;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24825 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 74 - Color.red(0), 8088 - KeyEvent.normalizeMetaState(0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 31 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i16];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i17 = $11 + 43;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                obj2 = obj;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity, View view) {
        PlccExpectedBillAmountActivity.IAuthTabCallback iAuthTabCallback;
        boolean z;
        int i = 2 % 2;
        int i2 = access000 + 49;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            iAuthTabCallback = PlccExpectedBillAmountActivity.Companion;
            z = true;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            iAuthTabCallback = PlccExpectedBillAmountActivity.Companion;
            z = false;
        }
        getNavigationBar.IAuthTabCallback(iAuthTabCallback.onExtraCallback(plccSettingV2Activity, z), plccSettingV2Activity);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig, TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        String string = plccSettingV2Activity.getString(R.string.app_plcc_activity___5b6467fabb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = plccSettingV2Activity.getString(R.string.app_plcc_activity___91edad772f);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String strOnNavigationEvent = getLongName.onNavigationEvent(shouldusehardwarebitmapconfig.onTransact(), (ParamImpl) null, 1, (Object) null);
        Context context = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        PlccCardLimitDialog.onWarmupCompleted onwarmupcompleted = new PlccCardLimitDialog.onWarmupCompleted.onWarmupCompleted(string2, strOnNavigationEvent, new getUrlokhttp(new access100(configuration)).requestPostMessageChannel().asBinder());
        String string3 = plccSettingV2Activity.getString(R.string.app_plcc_activity___4805ce69f2);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String strOnNavigationEvent2 = getLongName.onNavigationEvent(shouldusehardwarebitmapconfig.onExtraCallbackWithResult(), (ParamImpl) null, 1, (Object) null);
        Context context2 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        PlccCardLimitDialog.onWarmupCompleted onwarmupcompleted2 = new PlccCardLimitDialog.onWarmupCompleted.onWarmupCompleted(string3, strOnNavigationEvent2, new getUrlokhttp(new access000(configuration2)).ICustomTabsCallbackStubProxy());
        String string4 = plccSettingV2Activity.getString(R.string.app_plcc_activity___0751295d5c, PlayerErrorCode.onPostMessage());
        Intrinsics.checkNotNullExpressionValue(string4, "");
        new PlccCardLimitDialog(plccSettingV2Activity, string, CollectionsKt.listOf(new PlccCardLimitDialog.onWarmupCompleted[]{onwarmupcompleted, onwarmupcompleted2, new PlccCardLimitDialog.onWarmupCompleted.IAuthTabCallback(string4)})).show();
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 123;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity, TitleContentBottomSheetDialog titleContentBottomSheetDialog, View view) {
        int i = 2 % 2;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:1800-4970"));
        plccSettingV2Activity.startActivity(intent);
        titleContentBottomSheetDialog.dismiss();
        int i2 = access000 + 95;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onTransact(PlccSettingV2Activity plccSettingV2Activity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        String string = plccSettingV2Activity.getString(R.string.app_plcc_activity___35372d883e);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = plccSettingV2Activity.getString(R.string.app_plcc_activity___2a7498eb7c);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TitleContentBottomSheetDialog titleContentBottomSheetDialog = new TitleContentBottomSheetDialog(plccSettingV2Activity, string, string2);
        String string3 = plccSettingV2Activity.getString(R.string.app_plcc_activity___2996511e63);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TitleContentBottomSheetDialog.onWarmupCompleted(titleContentBottomSheetDialog, string3, new PlccSettingV2Activity$.ExternalSyntheticLambda7(plccSettingV2Activity, titleContentBottomSheetDialog), (String) null, (View.OnClickListener) null, 12, (Object) null);
        titleContentBottomSheetDialog.show();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 37;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(plccSettingV2Activity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 93;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 81;
        access000 = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity) {
        int i = 2 % 2;
        int i2 = access000 + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        plccSettingV2Activity.bo_();
        int i4 = getInterfaceDescriptor + 93;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(TdsListRowV1View tdsListRowV1View, PlccSettingV2Activity plccSettingV2Activity, getCurrentDarkerSystemColorsState getcurrentdarkersystemcolorsstate) throws Throwable {
        Iterator it;
        Object next;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            it = getcurrentdarkersystemcolorsstate.IAuthTabCallback().iterator();
            int i3 = 26 / 0;
        } else {
            it = getcurrentdarkersystemcolorsstate.IAuthTabCallback().iterator();
        }
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = access000 + 15;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            if (((getCurrentDarkerSystemColorsState.onWarmupCompleted) next).onExtraCallback() == 36) {
                break;
            }
        }
        if (((getCurrentDarkerSystemColorsState.onWarmupCompleted) next) != null) {
            SessionTrackerb sessionTrackerbValidateRelationship = plccSettingV2Activity.validateRelationship();
            Context context = tdsListRowV1View.getContext();
            Object[] objArr = new Object[1];
            a(new char[]{4, 2, 27, 29, 15, 6, 2, 31, 21, 0, 5, '\t', 13776, 13776, 7, 15, 2, '!', 19, 6, 2, 25, 27, 1, 2, 25, 24, 16, 7, 3, 27, 7, 2, 19, 31, 2, ' ', 20, 11, 29, 31, 28, 20, 27, 16, 0, 1, 7, 21, 7, 20, '#', 7, 1, 20, 24, '\t', 16, 26, 6, '#', 20, '!', 1, 16, '\f', 13766}, (byte) (28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 67, objArr);
            SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbValidateRelationship, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        } else {
            onJsBridgeReady.onNavigationEvent(plccSettingV2Activity, plccSettingV2Activity.getString(R.string.app_plcc_activity___a81f572e24), 0, 2, (Object) null);
            int i6 = access000 + 5;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity, Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, plccSettingV2Activity, true, (initMiniApp) null, (Function0) null, (Function1) null, 52, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, plccSettingV2Activity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = access000 + 53;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PlccSettingV2Activity plccSettingV2Activity = (PlccSettingV2Activity) objArr[0];
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[2], "");
        writeRaw<BaseApiResponse<getCurrentDarkerSystemColorsState>> writerawOnExtraCallbackWithResult = AdSettingsIntegrationErrorMode.onNavigationEvent.access100().onExtraCallbackWithResult();
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new IAuthTabCallback_Parcel(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new PlccSettingV2Activity$.ExternalSyntheticLambda12(new PlccSettingV2Activity$.ExternalSyntheticLambda11(plccSettingV2Activity))).onWarmupCompleted(new PlccSettingV2Activity$.ExternalSyntheticLambda13(plccSettingV2Activity));
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        plccSettingV2Activity.onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new PlccSettingV2Activity$.ExternalSyntheticLambda14(plccSettingV2Activity), new PlccSettingV2Activity$.ExternalSyntheticLambda15(tdsListRowV1View, plccSettingV2Activity)));
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 123;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 79;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", plccSettingV2Activity.getScreenName());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", plccSettingV2Activity.getScreenName());
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 27;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        SessionTrackerb.IAuthTabCallback(plccSettingV2Activity.validateRelationship(), plccSettingV2Activity, shouldusehardwarebitmapconfig.onExtraCallback(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__settings_benefits", false, (String) null, (List) null, (Map) null, new PlccSettingV2Activity$.ExternalSyntheticLambda16(plccSettingV2Activity), 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        BaseActivity baseActivity = (PlccSettingV2Activity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ReactNativeFeatureFlagsAccessor.onExtraCallback.onWarmupCompleted(baseActivity, "1800-4970");
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 53;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        extraCallbackWithResult(access13800<? super extraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlccSettingV2Activity.this.new extraCallbackWithResult(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcweOnNavigationEvent = PlccSettingV2Activity.this.onNavigationEvent();
                this.label = 1;
                objOnNavigationEvent = r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.onNavigationEvent(r8lambdackpzfvkcnb19lbykxqj6b3xvcweOnNavigationEvent, "STD_154_TOSS_CREDIT_CARD_CASHBACK", false, this, 2, (Object) null);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            }
            if (Result.exceptionOrNull-impl(objOnNavigationEvent) != null) {
                objOnNavigationEvent = access14000.onNavigationEvent(false);
            }
            PlccSettingV2Activity.IAuthTabCallback(PlccSettingV2Activity.this, ((Boolean) objOnNavigationEvent).booleanValue());
            return Unit.INSTANCE;
        }
    }

    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new extraCallbackWithResult(null), 3, (Object) null);
        int i2 = access000 + 81;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        TdsListRowV1View tdsListRowV1View = this.IAuthTabCallbackStub;
        Object obj = null;
        if (tdsListRowV1View == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tdsListRowV1View = null;
        }
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View != null) {
            int i2 = access000 + 25;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                tdsSwitchV1View.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                obj.hashCode();
                throw null;
            }
            tdsSwitchV1View.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        TdsListRowV1View tdsListRowV1View2 = this.IAuthTabCallbackStub;
        if (tdsListRowV1View2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tdsListRowV1View2 = null;
        }
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View2, z, false, 2, (Object) null);
        TdsListRowV1View tdsListRowV1View3 = this.IAuthTabCallbackStub;
        if (tdsListRowV1View3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = getInterfaceDescriptor + 123;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            tdsListRowV1View3 = null;
        }
        TdsSwitchV1View tdsSwitchV1View2 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View3}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (tdsSwitchV1View2 != null) {
            int i5 = getInterfaceDescriptor + 83;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                tdsSwitchV1View2.setOnCheckedChangeListener(this.onTransact);
            } else {
                tdsSwitchV1View2.setOnCheckedChangeListener(this.onTransact);
                obj.hashCode();
                throw null;
            }
        }
    }

    static final class extraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        extraCallback(access13800<? super extraCallback> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlccSettingV2Activity.this.new extraCallback(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelIAuthTabCallback = PlccSettingV2Activity.IAuthTabCallback(PlccSettingV2Activity.this);
                getDummyAd engagementSignalsCallback = PlccSettingV2Activity.this.setEngagementSignalsCallback();
                BaseActivity baseActivity = PlccSettingV2Activity.this;
                this.L$0 = iEngagementSignalsCallback_ParcelIAuthTabCallback;
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(engagementSignalsCallback, baseActivity, "STD_154_TOSS_CREDIT_CARD_CASHBACK", (String) null, "toss_plcc", 0L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388596, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                iEngagementSignalsCallback_Parcel = iEngagementSignalsCallback_ParcelIAuthTabCallback;
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

    private final void access200() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new extraCallback(null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 19;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PlccSettingV2Activity.this.new IAuthTabCallbackStubProxy(access13800Var);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, viva.republica.toss.plcc.activity.PlccSettingV2Activity] */
        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                BaseActivity.IAuthTabCallback(PlccSettingV2Activity.this, (String) null, false, 3, (Object) null);
                r8lambdaU57xnDihMSuETYHRoaz0sEQy8Bc r8lambdau57xndihmsuetyhroaz0seqy8bcIAuthTabCallback = PlccSettingV2Activity.this.IAuthTabCallback();
                this.label = 1;
                objOnNavigationEvent = r8lambdau57xndihmsuetyhroaz0seqy8bcIAuthTabCallback.onNavigationEvent("STD_154_TOSS_CREDIT_CARD_CASHBACK", this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            }
            ?? r0 = PlccSettingV2Activity.this;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                if (((Boolean) objOnNavigationEvent).booleanValue()) {
                    String string = r0.getString(R.string.app_plcc_activity___e6b72594e6);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    PlccSettingV2Activity.onNavigationEvent((PlccSettingV2Activity) r0, string);
                } else {
                    PlccSettingV2Activity.onExtraCallbackWithResult((PlccSettingV2Activity) r0);
                }
            }
            PlccSettingV2Activity plccSettingV2Activity = PlccSettingV2Activity.this;
            if (Result.exceptionOrNull-impl(objOnNavigationEvent) != null) {
                PlccSettingV2Activity.onExtraCallbackWithResult(plccSettingV2Activity);
            }
            PlccSettingV2Activity.this.bo_();
            return Unit.INSTANCE;
        }
    }

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(null), 3, (Object) null);
        int i2 = access000 + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(true);
        onJsBridgeReady.onNavigationEvent(this, getString(R.string.error_retry_message), 0, 2, (Object) null);
        int i4 = access000 + 3;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            getView();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View view = getView();
        if (view == null) {
            return;
        }
        onExtraCallback(view, str);
        int i3 = getInterfaceDescriptor + 105;
        access000 = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context, (Class<?>) PlccSettingV2Activity.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View onExtraCallbackWithResult(shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig) throws Throwable {
        LinearLayout linearLayout;
        int i = 2 % 2;
        Integer num = 24;
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        Context context = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppBarLayout appBarLayout = new AppBarLayout(context, (AttributeSet) null);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(appBarLayout.getContext(), im.toss.uikit.R.drawable.appbar_elevation_off));
        appBarLayout.setId(R.id.appBarLayout);
        Context context2 = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Toolbar toolbar = new Toolbar(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onExtraCallbackWithResult("");
            supportActionBar.onNavigationEvent(true);
            Unit unit = Unit.INSTANCE;
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, appBarLayout);
        Context context3 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context3, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, 0);
        Intrinsics.checkNotNull(layoutParams);
        ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        Context context4 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LinearLayout linearLayout3 = new LinearLayout(context4);
        linearLayout3.setOrientation(1);
        Context context5 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP2);
        tdsTopV1View.setUpperText(getString(R.string.app_plcc_activity___ffed8b8e9c));
        tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsTopV1View);
        Context context6 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context6, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2F);
        tdsListRowV1View.setCenterText1(getString(R.string.app_plcc_activity___d6feb4f78a));
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = tdsListRowV1View.ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            int i2 = access000 + 21;
            linearLayout = linearLayout2;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            baseTextViewICustomTabsCallbackStubProxy.onNavigationEvent(response.SemiBold);
            Unit unit2 = Unit.INSTANCE;
        } else {
            linearLayout = linearLayout2;
        }
        tdsListRowV1View.setCenterText2(getLongName.onNavigationEvent(shouldusehardwarebitmapconfig.IAuthTabCallback(), (ParamImpl) null, 1, (Object) null));
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View.setLeftImage(withWriteTimeout.IAuthTabCallback(OkHttp.onExtraCallback));
        DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(num, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(num, displayMetrics2));
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1A);
        tdsListRowV1View.setRightArrow(true);
        Object[] objArr = {tdsListRowV1View, new PlccSettingV2Activity$.ExternalSyntheticLambda17(shouldusehardwarebitmapconfig, this)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View);
        List listOnNavigationEvent = shouldusehardwarebitmapconfig.onNavigationEvent();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent, 10));
        Iterator it = listOnNavigationEvent.iterator();
        while (it.hasNext()) {
            DalvikPurgeableDecoder dalvikPurgeableDecoder = (DalvikPurgeableDecoder) it.next();
            Context context7 = linearLayout3.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            TdsListRowV1View tdsListRowV1View2 = new TdsListRowV1View(context7, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2F);
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1A);
            tdsListRowV1View2.setCenterText1(dalvikPurgeableDecoder.onTransact());
            tdsListRowV1View2.setCenterText2(dalvikPurgeableDecoder.onExtraCallbackWithResult());
            String strOnExtraCallback = dalvikPurgeableDecoder.onExtraCallback();
            Iterator it2 = it;
            Configuration configuration = tdsListRowV1View2.getContext().getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Integer num2 = num;
            tdsListRowV1View2.setCenterText2Color(setBodyokhttp.onWarmupCompleted(this, strOnExtraCallback, new getUrlokhttp(new asInterface(configuration)).ICustomTabsCallbackStubProxy()));
            if (dalvikPurgeableDecoder.onNavigationEvent().length() > 0) {
                tdsListRowV1View2.setRightArrow(true);
                tdsListRowV1View2.setOnClickListener(new PlccSettingV2Activity$.ExternalSyntheticLambda18(this, dalvikPurgeableDecoder));
                int i4 = getInterfaceDescriptor + 55;
                access000 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 3;
                }
            }
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View2);
            arrayList.add(tdsListRowV1View2);
            num = num2;
            it = it2;
        }
        Integer num3 = num;
        View view = new View(linearLayout3.getContext());
        ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        DisplayMetrics displayMetrics3 = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        layoutParams3.height = varyMatches.onNavigationEvent(16, displayMetrics3);
        layoutParams3.width = -1;
        view.setLayoutParams(layoutParams2);
        Context context8 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        Resources resources = context8.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        view.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new getInterfaceDescriptor(configuration2)).onExtraCallbackWithResult());
        DisplayMetrics displayMetrics4 = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(view, varyMatches.onNavigationEvent(8, displayMetrics4));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, view);
        Context context9 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        TdsListRowV1View tdsListRowV1View3 = new TdsListRowV1View(context9, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics5 = tdsListRowV1View3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        tdsListRowV1View3.setPaddingTop(varyMatches.onNavigationEvent(16, displayMetrics5));
        DisplayMetrics displayMetrics6 = tdsListRowV1View3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        tdsListRowV1View3.setPaddingBottom(varyMatches.onNavigationEvent(16, displayMetrics6));
        TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW1B;
        tdsListRowV1View3.setCenterType(onextracallbackwithresult);
        tdsListRowV1View3.setCenterText1(getString(R.string.app_plcc_activity___2de14788e8));
        BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View3.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            int i6 = access000 + 7;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            baseTextViewICustomTabsCallbackDefault.onNavigationEvent(response.SemiBold);
            Unit unit3 = Unit.INSTANCE;
        }
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View3}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (baseTextView != null) {
            baseTextView.setGravity(16);
            Drawable drawableOnExtraCallback = ResourcesCompat.onExtraCallback(baseTextView.getContext().getResources(), im.toss.core.R.drawable.icn_navigation_guide, (Resources.Theme) null);
            if (drawableOnExtraCallback != null) {
                int i8 = access000 + 47;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                DisplayMetrics displayMetrics7 = baseTextView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
                int iOnNavigationEvent3 = varyMatches.onNavigationEvent(18, displayMetrics7);
                DisplayMetrics displayMetrics8 = baseTextView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
                drawableOnExtraCallback.setBounds(0, 0, iOnNavigationEvent3, varyMatches.onNavigationEvent(18, displayMetrics8));
                Unit unit4 = Unit.INSTANCE;
            }
            DisplayMetrics displayMetrics9 = baseTextView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
            baseTextView.setCompoundDrawablePadding(varyMatches.onNavigationEvent(6, displayMetrics9));
            baseTextView.setCompoundDrawables((Drawable) null, (Drawable) null, drawableOnExtraCallback, (Drawable) null);
            Unit unit5 = Unit.INSTANCE;
        }
        tdsListRowV1View3.setRightType(TdsListRowV1View.asBinder.SWITCH);
        Unit unit6 = Unit.INSTANCE;
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View3);
        this.IAuthTabCallbackStub = tdsListRowV1View3;
        Context context10 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "");
        TdsListRowV1View tdsListRowV1View4 = new TdsListRowV1View(context10, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics10 = tdsListRowV1View4.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
        tdsListRowV1View4.setPaddingTop(varyMatches.onNavigationEvent(16, displayMetrics10));
        DisplayMetrics displayMetrics11 = tdsListRowV1View4.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics11, "");
        tdsListRowV1View4.setPaddingBottom(varyMatches.onNavigationEvent(16, displayMetrics11));
        tdsListRowV1View4.setCenterType(onextracallbackwithresult);
        tdsListRowV1View4.setCenterText1(getString(R.string.app_plcc_activity___350f662576));
        BaseTextView baseTextViewICustomTabsCallbackDefault2 = tdsListRowV1View4.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault2 != null) {
            baseTextViewICustomTabsCallbackDefault2.onNavigationEvent(response.SemiBold);
        }
        TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.ROW1A;
        tdsListRowV1View4.setRightType(asbinder);
        tdsListRowV1View4.setRightArrow(true);
        Object[] objArr2 = {tdsListRowV1View4, new PlccSettingV2Activity$.ExternalSyntheticLambda19(this)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View4);
        Context context11 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "");
        TdsListRowV1View tdsListRowV1View5 = new TdsListRowV1View(context11, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics12 = tdsListRowV1View5.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics12, "");
        tdsListRowV1View5.setPaddingTop(varyMatches.onNavigationEvent(16, displayMetrics12));
        DisplayMetrics displayMetrics13 = tdsListRowV1View5.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics13, "");
        tdsListRowV1View5.setPaddingBottom(varyMatches.onNavigationEvent(16, displayMetrics13));
        tdsListRowV1View5.setCenterType(onextracallbackwithresult);
        tdsListRowV1View5.setCenterText1(getString(R.string.app_plcc_activity___5b6467fabb));
        BaseTextView baseTextViewICustomTabsCallbackDefault3 = tdsListRowV1View5.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault3 != null) {
            baseTextViewICustomTabsCallbackDefault3.onNavigationEvent(response.SemiBold);
        }
        tdsListRowV1View5.setRightType(asbinder);
        tdsListRowV1View5.setRightArrow(true);
        Object[] objArr3 = {tdsListRowV1View5, new PlccSettingV2Activity$.ExternalSyntheticLambda20(this, shouldusehardwarebitmapconfig, tdsListRowV1View5)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr3, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View5);
        Context context12 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "");
        TdsListRowV1View tdsListRowV1View6 = new TdsListRowV1View(context12, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics14 = tdsListRowV1View6.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics14, "");
        tdsListRowV1View6.setPaddingTop(varyMatches.onNavigationEvent(16, displayMetrics14));
        DisplayMetrics displayMetrics15 = tdsListRowV1View6.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics15, "");
        tdsListRowV1View6.setPaddingBottom(varyMatches.onNavigationEvent(16, displayMetrics15));
        tdsListRowV1View6.setCenterType(onextracallbackwithresult);
        tdsListRowV1View6.setCenterText1(getString(R.string.app_plcc_activity___35372d883e));
        BaseTextView baseTextViewICustomTabsCallbackDefault4 = tdsListRowV1View6.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault4 != null) {
            int i10 = access000 + 33;
            getInterfaceDescriptor = i10 % 128;
            if (i10 % 2 != 0) {
                baseTextViewICustomTabsCallbackDefault4.onNavigationEvent(response.SemiBold);
                throw null;
            }
            baseTextViewICustomTabsCallbackDefault4.onNavigationEvent(response.SemiBold);
        }
        tdsListRowV1View6.setRightType(asbinder);
        tdsListRowV1View6.setRightArrow(true);
        Object[] objArr4 = {tdsListRowV1View6, new PlccSettingV2Activity$.ExternalSyntheticLambda21(this)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr4, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View6);
        Context context13 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "");
        TdsListRowV1View tdsListRowV1View7 = new TdsListRowV1View(context13, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics16 = tdsListRowV1View7.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics16, "");
        tdsListRowV1View7.setPaddingTop(varyMatches.onNavigationEvent(16, displayMetrics16));
        DisplayMetrics displayMetrics17 = tdsListRowV1View7.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics17, "");
        tdsListRowV1View7.setPaddingBottom(varyMatches.onNavigationEvent(16, displayMetrics17));
        tdsListRowV1View7.setCenterType(onextracallbackwithresult);
        tdsListRowV1View7.setCenterText1(getString(R.string.app_plcc_activity___ae2ce92137));
        BaseTextView baseTextViewICustomTabsCallbackDefault5 = tdsListRowV1View7.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault5 != null) {
            baseTextViewICustomTabsCallbackDefault5.onNavigationEvent(response.SemiBold);
        }
        tdsListRowV1View7.setRightType(asbinder);
        tdsListRowV1View7.setRightArrow(true);
        Object[] objArr5 = {tdsListRowV1View7, new PlccSettingV2Activity$.ExternalSyntheticLambda22(this, tdsListRowV1View7)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr5, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View7);
        Context context14 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context14, "");
        TdsListRowV1View tdsListRowV1View8 = new TdsListRowV1View(context14, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics18 = tdsListRowV1View8.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics18, "");
        tdsListRowV1View8.setPaddingTop(varyMatches.onNavigationEvent(16, displayMetrics18));
        DisplayMetrics displayMetrics19 = tdsListRowV1View8.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics19, "");
        tdsListRowV1View8.setPaddingBottom(varyMatches.onNavigationEvent(16, displayMetrics19));
        tdsListRowV1View8.setCenterType(onextracallbackwithresult);
        tdsListRowV1View8.setCenterText1(getString(R.string.app_plcc_activity___f46c5d9b20));
        BaseTextView baseTextViewICustomTabsCallbackDefault6 = tdsListRowV1View8.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault6 != null) {
            baseTextViewICustomTabsCallbackDefault6.onNavigationEvent(response.SemiBold);
        }
        tdsListRowV1View8.setRightType(asbinder);
        tdsListRowV1View8.setRightArrow(true);
        Object[] objArr6 = {tdsListRowV1View8, new PlccSettingV2Activity$.ExternalSyntheticLambda23(this, shouldusehardwarebitmapconfig)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr6, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View8);
        View view2 = new View(linearLayout3.getContext());
        ViewGroup.LayoutParams layoutParams4 = (ViewGroup.LayoutParams) ViewGroup.MarginLayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams.width = -1;
        DisplayMetrics displayMetrics20 = view2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics20, "");
        marginLayoutParams.height = varyMatches.onNavigationEvent(Float.valueOf(0.5f), displayMetrics20);
        DisplayMetrics displayMetrics21 = view2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics21, "");
        marginLayoutParams.topMargin = varyMatches.onNavigationEvent(8, displayMetrics21);
        DisplayMetrics displayMetrics22 = view2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics22, "");
        marginLayoutParams.leftMargin = varyMatches.onNavigationEvent(num3, displayMetrics22);
        view2.setLayoutParams(layoutParams4);
        Context context15 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "");
        Configuration configuration3 = context15.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        view2.setBackgroundColor(new getUrlokhttp(new IAuthTabCallback(configuration3)).isEngagementSignalsApiAvailable());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, view2);
        Context context16 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "");
        TdsListRowV1View tdsListRowV1View9 = new TdsListRowV1View(context16, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics23 = tdsListRowV1View9.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics23, "");
        tdsListRowV1View9.setPaddingTop(varyMatches.onNavigationEvent(16, displayMetrics23));
        DisplayMetrics displayMetrics24 = tdsListRowV1View9.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics24, "");
        tdsListRowV1View9.setPaddingBottom(varyMatches.onNavigationEvent(16, displayMetrics24));
        tdsListRowV1View9.setCenterType(onextracallbackwithresult);
        tdsListRowV1View9.setCenterText1(getString(R.string.app_plcc_activity___e9da445167));
        BaseTextView baseTextViewICustomTabsCallbackDefault7 = tdsListRowV1View9.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault7 != null) {
            baseTextViewICustomTabsCallbackDefault7.onNavigationEvent(response.SemiBold);
        }
        tdsListRowV1View9.setRightType(asbinder);
        Context context17 = tdsListRowV1View9.getContext();
        Intrinsics.checkNotNullExpressionValue(context17, "");
        Configuration configuration4 = context17.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        tdsListRowV1View9.setRightText1Color(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onNavigationEvent(configuration4)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        tdsListRowV1View9.setRightText1("1800-4970");
        int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        BaseTextView baseTextView2 = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View9}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, iOnNavigationEvent4, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (baseTextView2 != null) {
            baseTextView2.onNavigationEvent(response.SemiBold);
        }
        Object[] objArr7 = {tdsListRowV1View9, new PlccSettingV2Activity$.ExternalSyntheticLambda24(this)};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr7, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View9);
        Context context18 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context18, "");
        TdsListRowV1View tdsListRowV1View10 = new TdsListRowV1View(context18, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics25 = tdsListRowV1View10.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics25, "");
        tdsListRowV1View10.setPaddingTop(varyMatches.onNavigationEvent(16, displayMetrics25));
        DisplayMetrics displayMetrics26 = tdsListRowV1View10.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics26, "");
        tdsListRowV1View10.setPaddingBottom(varyMatches.onNavigationEvent(16, displayMetrics26));
        tdsListRowV1View10.setCenterType(onextracallbackwithresult);
        tdsListRowV1View10.setCenterText1(getString(R.string.app_plcc_activity___5dce35af73));
        BaseTextView baseTextViewICustomTabsCallbackDefault8 = tdsListRowV1View10.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault8 != null) {
            baseTextViewICustomTabsCallbackDefault8.onNavigationEvent(response.SemiBold);
        }
        tdsListRowV1View10.setRightType(asbinder);
        tdsListRowV1View10.setRightText1(getString(R.string.app_plcc_activity___0d3be2e6c7));
        int iOnNavigationEvent5 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        BaseTextView baseTextView3 = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View10}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, iOnNavigationEvent5, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (baseTextView3 != null) {
            baseTextView3.onNavigationEvent(response.SemiBold);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsListRowV1View10);
        Space space = new Space(linearLayout3.getContext());
        ViewGroup.LayoutParams layoutParams5 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        DisplayMetrics displayMetrics27 = space.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics27, "");
        layoutParams6.height = varyMatches.onNavigationEvent(num3, displayMetrics27);
        layoutParams6.width = -1;
        space.setLayoutParams(layoutParams5);
        Context context19 = space.getContext();
        Intrinsics.checkNotNullExpressionValue(context19, "");
        Resources resources2 = context19.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration5 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        space.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration5)).onWarmupCompleted());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, space);
        Context context20 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context20, "");
        LinearLayout linearLayout4 = new LinearLayout(context20);
        linearLayout4.setOrientation(1);
        Context context21 = linearLayout4.getContext();
        Intrinsics.checkNotNullExpressionValue(context21, "");
        Resources resources3 = context21.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "");
        Configuration configuration6 = resources3.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration6, "");
        linearLayout4.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration6)).onExtraCallbackWithResult());
        ViewGroup.LayoutParams layoutParams7 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams7);
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.width = -1;
        DisplayMetrics displayMetrics28 = linearLayout4.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics28, "");
        layoutParams8.height = varyMatches.onNavigationEvent(180, displayMetrics28);
        linearLayout4.setLayoutParams(layoutParams7);
        Context context22 = linearLayout4.getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "");
        LinearLayout linearLayout5 = new LinearLayout(context22);
        linearLayout5.setOrientation(0);
        ViewGroup.LayoutParams layoutParams9 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams9);
        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
        layoutParams10.width = -2;
        layoutParams10.height = -2;
        layoutParams10.gravity = 1;
        linearLayout5.setLayoutParams(layoutParams9);
        DisplayMetrics displayMetrics29 = linearLayout5.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics29, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(linearLayout5, varyMatches.onNavigationEvent(40, displayMetrics29));
        Context context23 = linearLayout5.getContext();
        Intrinsics.checkNotNullExpressionValue(context23, "");
        TdsImageView tdsImageView = new TdsImageView(context23, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams11 = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams11);
        layoutParams11.width = -2;
        DisplayMetrics displayMetrics30 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics30, "");
        layoutParams11.height = varyMatches.onNavigationEvent(18, displayMetrics30);
        tdsImageView.setLayoutParams(layoutParams11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        tdsImageView.setScaleType(scaleType);
        tdsImageView.setAdjustViewBounds(true);
        Context context24 = tdsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context24, "");
        Configuration configuration7 = context24.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration7, "");
        tdsImageView.setImageTintList(ColorStateList.valueOf(new getUrlokhttp(new IAuthTabCallbackStub(configuration7)).onPostMessage()));
        Object[] objArr8 = new Object[1];
        a(new char[]{2, 30, '#', 26, 5, '\t', 13842, 13842, 2, '!', 20, '#', 15, 6, 26, '!', 21, 0, '\t', '!', '\r', 6, 17, 20, 13894, 13894, 2, 31, 2, 15, 30, 20, 13894, 13894, 11, 21, 28, 2, 15, ' ', 19, 30, 24, 0, 5, 18, 21, 18, 11, 21, 28, 2, 28, 24, 19, ' '}, (byte) (92 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 56, objArr8);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr8[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout5, tdsImageView);
        View view3 = new View(linearLayout5.getContext());
        ViewGroup.LayoutParams layoutParams12 = (ViewGroup.LayoutParams) ViewGroup.MarginLayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams12);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams12;
        DisplayMetrics displayMetrics31 = view3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics31, "");
        marginLayoutParams2.width = varyMatches.onNavigationEvent(1, displayMetrics31);
        DisplayMetrics displayMetrics32 = view3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics32, "");
        marginLayoutParams2.height = varyMatches.onNavigationEvent(16, displayMetrics32);
        DisplayMetrics displayMetrics33 = view3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics33, "");
        marginLayoutParams2.leftMargin = varyMatches.onNavigationEvent(16, displayMetrics33);
        DisplayMetrics displayMetrics34 = view3.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics34, "");
        marginLayoutParams2.rightMargin = varyMatches.onNavigationEvent(16, displayMetrics34);
        view3.setLayoutParams(layoutParams12);
        Context context25 = view3.getContext();
        Intrinsics.checkNotNullExpressionValue(context25, "");
        Configuration configuration8 = context25.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration8, "");
        view3.setBackgroundColor(new getUrlokhttp(new onTransact(configuration8)).onMessageChannelReady());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout5, view3);
        Context context26 = linearLayout5.getContext();
        Intrinsics.checkNotNullExpressionValue(context26, "");
        TdsImageView tdsImageView2 = new TdsImageView(context26, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams13 = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams13);
        layoutParams13.width = -2;
        DisplayMetrics displayMetrics35 = tdsImageView2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics35, "");
        layoutParams13.height = varyMatches.onNavigationEvent(18, displayMetrics35);
        tdsImageView2.setLayoutParams(layoutParams13);
        tdsImageView2.setScaleType(scaleType);
        tdsImageView2.setAdjustViewBounds(true);
        Context context27 = tdsImageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context27, "");
        Configuration configuration9 = context27.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration9, "");
        tdsImageView2.setImageTintList(ColorStateList.valueOf(new getUrlokhttp(new asBinder(configuration9)).onPostMessage()));
        Object[] objArr9 = new Object[1];
        a(new char[]{2, 30, '#', 26, 5, '\t', 13775, 13775, 2, '!', 20, '#', 15, 6, 26, '!', 21, 0, '\t', '!', '\r', 6, 17, 20, 13827, 13827, 2, 31, 2, 15, 30, 20, 13827, 13827, 11, 21, 28, 2, 15, ' ', 19, 30, 24, 0, 27, 15, 11, 21, 28, 2, 28, 24, 19, ' '}, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 26), 54 - TextUtils.indexOf("", "", 0, 0), objArr9);
        TdsImageView.setImage$default(tdsImageView2, ((String) objArr9[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout5, tdsImageView2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout4, linearLayout5);
        BaseTextView baseTextView4 = (BaseTextView) Typography7.class.getDeclaredConstructor(Context.class).newInstance(linearLayout4.getContext());
        Intrinsics.checkNotNull(baseTextView4);
        DisplayMetrics displayMetrics36 = baseTextView4.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics36, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(baseTextView4, varyMatches.onNavigationEvent(16, displayMetrics36));
        baseTextView4.setGravity(1);
        baseTextView4.setText("토스신용카드는 하나카드에서 발급하며\nBC카드 국내 ・ 온 오프라인 가맹점,\nVisa 해외 ・ 온 오프라인 가맹점에서 쓸 수 있어요.");
        Context context28 = baseTextView4.getContext();
        Intrinsics.checkNotNullExpressionValue(context28, "");
        Configuration configuration10 = context28.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration10, "");
        Object[] objArr10 = {new getUrlokhttp(new IAuthTabCallbackDefault(configuration10))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        baseTextView4.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(objArr10, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
        Intrinsics.checkNotNull(baseTextView4);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout4, baseTextView4);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, linearLayout4);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout3);
        LinearLayout linearLayout6 = linearLayout;
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout6, tdsScrollView);
        return linearLayout6;
    }

    public static /* synthetic */ Unit onExtraCallback(PlccSettingV2Activity plccSettingV2Activity, View view) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, view}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 597914246, iOnWarmupCompleted, -597914236, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    public static /* synthetic */ void onNavigationEvent(PlccSettingV2Activity plccSettingV2Activity) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        onNavigationEvent(new Object[]{plccSettingV2Activity}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -43618200, iOnWarmupCompleted, 43618206, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    public static /* synthetic */ void onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {plccSettingV2Activity, compoundButton, Boolean.valueOf(z)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        onNavigationEvent(objArr, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1704557024, iOnWarmupCompleted, 1704557028, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccSettingV2Activity plccSettingV2Activity, TdsListRowV1View tdsListRowV1View, View view) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, tdsListRowV1View, view}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -2051815740, iOnWarmupCompleted, 2051815752, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccSettingV2Activity plccSettingV2Activity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, deserializeurinullablecollection}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1887126340, iOnWarmupCompleted, -1887126335, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PlccSettingV2Activity plccSettingV2Activity, DialogInterface dialogInterface) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, dialogInterface}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1276502537, iOnWarmupCompleted, -1276502536, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(PlccSettingV2Activity plccSettingV2Activity, shouldUseHardwareBitmapConfig shouldusehardwarebitmapconfig) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, shouldusehardwarebitmapconfig}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 302667070, iOnWarmupCompleted, -302667067, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(PlccSettingV2Activity plccSettingV2Activity, View view) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, view}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -59597132, iOnWarmupCompleted, 59597143, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(PlccSettingV2Activity plccSettingV2Activity, TdsListRowV1View tdsListRowV1View, View view) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, tdsListRowV1View, view}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 310533925, iOnWarmupCompleted, -310533925, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        onNavigationEvent(new Object[]{function1, obj}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1234156735, iOnWarmupCompleted, 1234156743, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final void onNavigationEvent(PlccSettingV2Activity plccSettingV2Activity, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {plccSettingV2Activity, compoundButton, Boolean.valueOf(z)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        onNavigationEvent(objArr, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 713329553, iOnWarmupCompleted, -713329546, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(PlccSettingV2Activity plccSettingV2Activity, DialogInterface dialogInterface) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(new Object[]{plccSettingV2Activity, dialogInterface}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 401560231, iOnWarmupCompleted, -401560229, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    public final zzag updateVisuals() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (zzag) onNavigationEvent(new Object[]{this}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1412078940, iOnWarmupCompleted, 1412078949, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSettingV2Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSettingV2Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = getInterfaceDescriptor + 111;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSettingV2Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.plcc.activity.Hilt_PlccSettingV2Activity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ICustomTabsServiceStub() {
        IAuthTabCallbackDefault = new char[]{64987, 64982, 65065, 64960, 64983, 64981, 65064, 64990, 64917, 64976, 64970, 64905, 64986, 64966, 64924, 64910, 64979, 64906, 64988, 64908, 64989, 64977, 64898, 64978, 64900, 64926, 64961, 64925, 64965, 64963, 65004, 64980, 64967, 64991, 64962, 64985};
        IAuthTabCallback_Parcel = (char) 51247;
    }
}
