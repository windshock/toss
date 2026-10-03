package viva.republica.toss.account.register.openbanking;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.google.android.flexbox.FlexboxLayout;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.base.BaseActivity;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.featurescommon.profile.library.model.Profile;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_SetCertVerifyEnvOCSP;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.M_;
import o.MapConverter;
import o.NetConverter3;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UST_CMP_IssueCertificate_SendConf;
import o.access13800;
import o.access14300;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.disableMountItemReorderingAndroid;
import o.findResAndMsg;
import o.getIssuerAndSerialNumber;
import o.getNightColor;
import o.getParamImp;
import o.initMiniApp;
import o.onPageExit;
import o.response;
import o.sendBroadcastWithAdObject;
import o.varyMatches;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.register.openbanking.InputEmailActivity$;
import viva.republica.toss.account.register.openbanking.OpenBankingInquiryAgreementActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InputEmailActivity extends Hilt_InputEmailActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static char IAuthTabCallbackStubProxy = 0;
    private static char ICustomTabsCallback = 0;
    private static char extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static int onActivityResized = 0;
    private static int onPostMessage = 1;
    public static final int onTransact;
    private static char readTypedObject = 0;
    private static int writeTypedObject = 1;
    private Long IAuthTabCallbackStub;
    private TabBarInfoQueryPointOnTabBarInfoQueryListener access100;

    @Inject
    public getNightColor profileRepository;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            return InputEmailActivity.onExtraCallback(this.f$0);
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return (String) InputEmailActivity.onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -986313126, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 986313131, objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
        }
    });
    private final List<String> access000 = new ArrayList();
    private final List<TextView> getInterfaceDescriptor = new ArrayList();
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallback_Parcel = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda2
        public final Object invoke(Object obj) {
            return InputEmailActivity.IAuthTabCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    static {
        setEngagementSignalsCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        onTransact = 8;
        int i = onActivityResized + 73;
        onPostMessage = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        InputEmailActivity inputEmailActivity = (InputEmailActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(inputEmailActivity, iIntValue, view);
        int i4 = extraCallbackWithResult + 93;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InputEmailActivity inputEmailActivity, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 117;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -2033920800, iOnWarmupCompleted3, 2033920802, new Object[]{inputEmailActivity, str, setDetectableSize}, iOnWarmupCompleted4, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        int i3 = extraCallbackWithResult + 69;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InputEmailActivity inputEmailActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(inputEmailActivity, th);
        int i4 = writeTypedObject + 75;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InputEmailActivity inputEmailActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(inputEmailActivity, iEngagementSignalsCallbackDefault);
        int i4 = extraCallbackWithResult + 117;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        int i4 = writeTypedObject + 43;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -603286729, iOnWarmupCompleted, 603286740, new Object[]{function1, obj}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        int i4 = writeTypedObject + 119;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 107;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 73;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        InputEmailActivity inputEmailActivity = (InputEmailActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 7;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(inputEmailActivity, view);
        int i4 = extraCallbackWithResult + 9;
        writeTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = writeTypedObject + 63;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i4);
        int i9 = ~(i2 | i4);
        int i10 = i7 | (~i4);
        int i11 = i9 | (~(i10 | i3));
        int i12 = (~i3) | i10;
        int i13 = i2 + i4 + i5 + (770105990 * i) + ((-157043368) * i6);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i2) - 1432092672) + ((-1000312294) * i4) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i5) + ((-2121269248) * i) + (1950351360 * i6) + ((-66846720) * i14);
        int i16 = (i2 * 105828664) + 1394048361 + (i4 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i5 * 105828275) + (i * (-227623502)) + (i6 * 619312264) + (i14 * 1925971968);
        switch (i15 + (i16 * i16 * 261881856)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                BaseActivity baseActivity = (InputEmailActivity) objArr[0];
                int i17 = 2 % 2;
                int i18 = writeTypedObject + 15;
                extraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                String stringExtra = baseActivity.getIntent().getStringExtra("bankCode");
                if (stringExtra != null) {
                    return stringExtra;
                }
                int i20 = extraCallbackWithResult + 97;
                writeTypedObject = i20 % 128;
                int i21 = i20 % 2;
                return "";
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                InputEmailActivity inputEmailActivity = (InputEmailActivity) objArr[0];
                Profile profile = (Profile) objArr[1];
                int i22 = 2 % 2;
                int i23 = writeTypedObject + 91;
                extraCallbackWithResult = i23 % 128;
                int i24 = i23 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(inputEmailActivity, profile);
                int i25 = extraCallbackWithResult + 43;
                writeTypedObject = i25 % 128;
                int i26 = i25 % 2;
                return unitIAuthTabCallback;
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ String onExtraCallback(InputEmailActivity inputEmailActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        String str = (String) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 97819321, iOnWarmupCompleted, -97819318, new Object[]{inputEmailActivity}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        int i4 = extraCallbackWithResult + 41;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Unit onExtraCallback(InputEmailActivity inputEmailActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(inputEmailActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(InputEmailActivity inputEmailActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(inputEmailActivity, deserializeurinullablecollection);
        int i4 = extraCallbackWithResult + 35;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        InputEmailActivity inputEmailActivity = (InputEmailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(inputEmailActivity);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return strOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(th);
        int i4 = extraCallbackWithResult + 1;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InputEmailActivity inputEmailActivity, Unit unit) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(inputEmailActivity, unit);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = writeTypedObject + 91;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 105;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(InputEmailActivity inputEmailActivity, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(inputEmailActivity, charSequence);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(inputEmailActivity, charSequence);
        int i3 = extraCallbackWithResult + 73;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        InputEmailActivity inputEmailActivity = (InputEmailActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 7;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(inputEmailActivity, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(inputEmailActivity, setDetectableSize);
        int i3 = extraCallbackWithResult + 99;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        int i4 = writeTypedObject + 77;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(InputEmailActivity inputEmailActivity, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 115;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(inputEmailActivity, charSequence);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(inputEmailActivity, charSequence);
        int i3 = extraCallbackWithResult + 47;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(InputEmailActivity inputEmailActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 107;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        asInterface(inputEmailActivity);
        int i4 = extraCallbackWithResult + 93;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    public static /* synthetic */ boolean onWarmupCompleted(InputEmailActivity inputEmailActivity, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(inputEmailActivity, view, motionEvent);
        int i4 = writeTypedObject + 99;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return 1000872L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements Function0<CERT_SetCertVerifyEnvOCSP> {
        final /* synthetic */ Activity IAuthTabCallback;

        public onWarmupCompleted(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CERT_SetCertVerifyEnvOCSP invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_SetCertVerifyEnvOCSP.onExtraCallbackWithResult(layoutInflater);
        }
    }

    private final String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 51;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asInterface.getValue();
        int i4 = extraCallbackWithResult + 13;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final String ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackDefault.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onNavigationEvent(InputEmailActivity inputEmailActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 43;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = inputEmailActivity.getIntent().getStringExtra("accountNo");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = extraCallbackWithResult + 107;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 25;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackerb;
        }
        throw null;
    }

    public final getNightColor IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        getNightColor getnightcolor = this.profileRepository;
        if (getnightcolor != null) {
            return getnightcolor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = writeTypedObject + 13;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        InputEmailActivity inputEmailActivity = (InputEmailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = inputEmailActivity.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CERT_SetCertVerifyEnvOCSP cERT_SetCertVerifyEnvOCSP = (CERT_SetCertVerifyEnvOCSP) value;
        int i4 = writeTypedObject + 31;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return cERT_SetCertVerifyEnvOCSP;
    }

    private final TdsTopV1T03View IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        TdsTopV1T03View tdsTopV1T03View = ((CERT_SetCertVerifyEnvOCSP) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 562777918, iOnWarmupCompleted, -562777911, new Object[]{this}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted())).onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T03View, "");
        int i4 = writeTypedObject + 35;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsTopV1T03View;
        }
        throw null;
    }

    private final TextFieldLine onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        if (i3 == 0) {
            Intrinsics.checkNotNullExpressionValue(((CERT_SetCertVerifyEnvOCSP) onExtraCallback(iOnWarmupCompleted3, 562777918, iOnWarmupCompleted, -562777911, objArr, iOnWarmupCompleted2, iOnWarmupCompleted4)).asInterface, "");
            throw null;
        }
        TextFieldLine textFieldLine = ((CERT_SetCertVerifyEnvOCSP) onExtraCallback(iOnWarmupCompleted3, 562777918, iOnWarmupCompleted, -562777911, objArr, iOnWarmupCompleted2, iOnWarmupCompleted4)).asInterface;
        Intrinsics.checkNotNullExpressionValue(textFieldLine, "");
        int i4 = extraCallbackWithResult + 21;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return textFieldLine;
    }

    private final KeyboardBottomCta ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        KeyboardBottomCta keyboardBottomCta = ((CERT_SetCertVerifyEnvOCSP) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 562777918, iOnWarmupCompleted, -562777911, new Object[]{this}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted())).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        int i4 = writeTypedObject + 61;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return keyboardBottomCta;
    }

    private final LinearLayout writeTypedList() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        LinearLayout linearLayout = ((CERT_SetCertVerifyEnvOCSP) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 562777918, iOnWarmupCompleted, -562777911, new Object[]{this}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted())).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        int i4 = extraCallbackWithResult + 107;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return linearLayout;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        ConstraintLayout constraintLayout;
        InputEmailActivity inputEmailActivity = (InputEmailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {inputEmailActivity};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        if (i3 == 0) {
            constraintLayout = ((CERT_SetCertVerifyEnvOCSP) onExtraCallback(iOnWarmupCompleted3, 562777918, iOnWarmupCompleted, -562777911, objArr2, iOnWarmupCompleted2, iOnWarmupCompleted4)).IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            int i4 = 91 / 0;
        } else {
            constraintLayout = ((CERT_SetCertVerifyEnvOCSP) onExtraCallback(iOnWarmupCompleted3, 562777918, iOnWarmupCompleted, -562777911, objArr2, iOnWarmupCompleted2, iOnWarmupCompleted4)).IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        }
        int i5 = writeTypedObject + 23;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String ICustomTabsService_Parcel() throws Throwable {
        Intent intent;
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            intent = getIntent();
            Object[] objArr = new Object[1];
            a(new char[]{5273, 46799, 3962, 55825, 15473, 26753, 49642, 26648}, 115 % Color.red(0), objArr);
            obj = objArr[0];
        } else {
            intent = getIntent();
            Object[] objArr2 = new Object[1];
            a(new char[]{5273, 46799, 3962, 55825, 15473, 26753, 49642, 26648}, 8 - Color.red(0), objArr2);
            obj = objArr2[0];
        }
        return intent.getStringExtra(((String) obj).intern());
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        BaseActivity baseActivity = (InputEmailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = baseActivity.getIntent();
        if (i3 != 0) {
            return intent.getStringExtra("serviceReferrer");
        }
        intent.getStringExtra("serviceReferrer");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(InputEmailActivity inputEmailActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            inputEmailActivity.setResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
            inputEmailActivity.finish();
            int i4 = writeTypedObject + 123;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        CharSequence charSequence;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 43;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 101;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (extraCallback ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(readTypedObject);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cRgb = (char) (Color.rgb(i3, i3, i3) + 16777216);
                        charSequence = "";
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf(charSequence, '0', i3);
                        int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, iLastIndexOf, i12, -787580090, false, "C", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i13 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ICustomTabsCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(charSequence, '0', 0) + 1), TextUtils.lastIndexOf(charSequence, '0', 0) + 11, 12434 - (ViewConfiguration.getPressedStateDuration() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i13 + 1;
                    int i14 = $10 + 43;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 16014), MotionEvent.axisFromString("") + 15, 19901 - View.resolveSizeAndState(0, 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05c9  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, android.content.Context, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, java.lang.Object, viva.republica.toss.account.register.openbanking.InputEmailActivity] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v58, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v59, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputEmailActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputEmailActivity.onCreate(android.os.Bundle):void");
    }

    public View access000() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLine textFieldLineOnVerticalScrollEvent = onVerticalScrollEvent();
        if (i3 != 0) {
            return textFieldLineOnVerticalScrollEvent.getEditText();
        }
        textFieldLineOnVerticalScrollEvent.getEditText();
        throw null;
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(menu, "");
            getMenuInflater().inflate(R.menu.menu_account_activation, menu);
            return false;
        }
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_account_activation, menu);
        return true;
    }

    public boolean onPrepareOptionsMenu(@Nullable Menu menu) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        if (menu == null) {
            return true;
        }
        int i5 = i3 + 11;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        MenuItem menuItemFindItem = menu.findItem(R.id.setting);
        if (menuItemFindItem == null) {
            return true;
        }
        menuItemFindItem.setVisible(IEngagementSignalsCallback_Parcel());
        int i7 = extraCallbackWithResult + 69;
        writeTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private static final Unit IAuthTabCallback(InputEmailActivity inputEmailActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(inputEmailActivity.getScreenParams());
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", inputEmailActivity.getScreenName());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 13;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() != R.id.setting) {
            return super.onOptionsItemSelected(menuItem);
        }
        int i2 = extraCallbackWithResult + 19;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = this.access100;
        if (tabBarInfoQueryPointOnTabBarInfoQueryListener != null) {
            ConvertByteArrayToFloatArray.onWarmupCompleted("click_account_setting", false, (String) null, (List) null, (Map) null, new InputEmailActivity$.ExternalSyntheticLambda23(this), 30, (Object) null);
            SessionTrackerb sessionTrackerbOnNavigationEvent = onNavigationEvent();
            String strOnNavigationEvent = tabBarInfoQueryPointOnTabBarInfoQueryListener.onNavigationEvent(":");
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{61287, 8065, 49670, 16605, 54965, 1654, 57071, 19516, 37494, 57207, 53676, 47345, 5270, 24407, 14070, 24730, 3657, 25655, 59350, 6343, 34805, 43415, 31455, 36897, 51771, 211, 53337, 30242, 21582, 51196, 26824, 24768, 20925, 55006, 11624, 24645, 4694, 53125, 2964, 30613, 49642, 26648, 8557, 27657, 27054, 39216, 19805, 30565, 48568, 38175}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 69, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strOnNavigationEvent);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i3 = writeTypedObject + 17;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 o.IPostMessageServiceStubProxy) = (r1v4 o.IPostMessageServiceStubProxy), (r1v9 o.IPostMessageServiceStubProxy) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onGreatestScrollPercentageIncreased() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.register.openbanking.InputEmailActivity.writeTypedObject
            int r1 = r1 + 103
            int r2 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputEmailActivity.extraCallbackWithResult = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            o.IPostMessageServiceStubProxy r1 = r3.getSupportActionBar()
            r2 = 81
            int r2 = r2 / 0
            if (r1 == 0) goto L23
            goto L1f
        L19:
            o.IPostMessageServiceStubProxy r1 = r3.getSupportActionBar()
            if (r1 == 0) goto L23
        L1f:
            r2 = 1
            r1.onNavigationEvent(r2)
        L23:
            int r1 = viva.republica.toss.account.register.openbanking.InputEmailActivity.extraCallbackWithResult
            int r1 = r1 + 119
            int r2 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputEmailActivity.writeTypedObject = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputEmailActivity.onGreatestScrollPercentageIncreased():void");
    }

    private static final void IAuthTabCallback(final InputEmailActivity inputEmailActivity, View view) {
        String string;
        Editable text;
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = inputEmailActivity.onVerticalScrollEvent().getEditText();
        if (editText == null || (text = editText.getText()) == null) {
            string = null;
        } else {
            string = text.toString();
            int i4 = writeTypedObject + 121;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if (string == null) {
            string = "";
        }
        inputEmailActivity.onExtraCallback(string);
        ConvertByteArrayToFloatArray.onWarmupCompleted("click_button_confirm", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                return (Unit) InputEmailActivity.onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1411397816, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1411397824, objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
            }
        }, 30, (Object) null);
    }

    private static final Unit onWarmupCompleted(InputEmailActivity inputEmailActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", inputEmailActivity.getScreenName());
            int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            setDetectableSize.onExtraCallback((Map) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -333692062, iOnWarmupCompleted, 333692063, new Object[]{inputEmailActivity}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted()));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", inputEmailActivity.getScreenName());
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        setDetectableSize.onExtraCallback((Map) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -333692062, iOnWarmupCompleted3, 333692063, new Object[]{inputEmailActivity}, iOnWarmupCompleted4, GriverCommonAbilityProxyImpl.onWarmupCompleted()));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
    }

    private static final Unit onExtraCallback(InputEmailActivity inputEmailActivity, CharSequence charSequence) {
        boolean z;
        String str;
        String str2;
        String str3;
        CharSequence charSequence2;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNull(charSequence);
        if (charSequence.length() <= 0 || (!disableMountItemReorderingAndroid.onNavigationEvent.onExtraCallbackWithResult(charSequence.toString()))) {
            z = false;
        } else {
            int i3 = extraCallbackWithResult;
            int i4 = i3 + 47;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 61;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        boolean z3 = charSequence.length() == 0 || z;
        inputEmailActivity.ICustomTabsServiceStubProxy().onWarmupCompleted().setEnabled(z);
        if (!(!z3)) {
            inputEmailActivity.onVerticalScrollEvent().setError((CharSequence) null);
            inputEmailActivity.onVerticalScrollEvent().setErrorEnabled(false);
        }
        int i8 = 0;
        for (Object obj : inputEmailActivity.getInterfaceDescriptor) {
            if (i8 < 0) {
                int i9 = extraCallbackWithResult + 23;
                writeTypedObject = i9 % 128;
                int i10 = i9 % 2;
                CollectionsKt.throwIndexOverflow();
            }
            TextView textView = (TextView) obj;
            String str4 = inputEmailActivity.access000.get(i8);
            if (StringsKt.contains$default(charSequence, "@", false, 2, (Object) null)) {
                str = "@";
                str2 = (String) CollectionsKt.last(StringsKt.split$default(charSequence, new String[]{"@"}, false, 0, 6, (Object) null));
            } else {
                str = "@";
                str2 = "";
            }
            String str5 = str2;
            if (StringsKt.contains$default(charSequence, str, false, 2, (Object) null)) {
                int i11 = writeTypedObject + 67;
                extraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                str3 = str5;
                charSequence2 = (CharSequence) CollectionsKt.first(StringsKt.split$default(charSequence, new String[]{str}, false, 0, 6, (Object) null));
            } else {
                str3 = str5;
                charSequence2 = charSequence;
            }
            String str6 = ((Object) charSequence2) + str + str4;
            textView.setText(str6);
            if (charSequence.length() <= 0 || Intrinsics.areEqual(charSequence.toString(), str6)) {
                z2 = true;
            } else {
                if (str3.length() != 0) {
                    int i13 = writeTypedObject + 9;
                    extraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    z2 = true;
                    if (StringsKt.startsWith(str4, str3, true)) {
                    }
                    textView.setVisibility(i);
                    i8++;
                } else {
                    z2 = true;
                }
                i = 0;
                textView.setVisibility(i);
                i8++;
            }
            i = 8;
            textView.setVisibility(i);
            i8++;
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 25;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.account.register.openbanking.InputEmailActivity r6, java.lang.CharSequence r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.register.openbanking.InputEmailActivity.writeTypedObject
            int r1 = r1 + 83
            int r2 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputEmailActivity.extraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            int r1 = r7.length()
            r4 = 85
            int r4 = r4 / r2
            if (r1 == 0) goto L32
            goto L26
        L1d:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            int r1 = r7.length()
            if (r1 == 0) goto L32
        L26:
            o.disableMountItemReorderingAndroid r1 = o.disableMountItemReorderingAndroid.onNavigationEvent
            java.lang.String r7 = r7.toString()
            boolean r7 = r1.onExtraCallbackWithResult(r7)
            if (r7 == 0) goto L33
        L32:
            r2 = r3
        L33:
            im.toss.uikit.widget.textField.TextFieldLine r7 = r6.onVerticalScrollEvent()
            if (r2 == r3) goto L49
            int r1 = viva.republica.toss.R.string.app_account_register_openbanking___d6ae753096
            java.lang.String r1 = r6.getString(r1)
            int r4 = viva.republica.toss.account.register.openbanking.InputEmailActivity.writeTypedObject
            int r4 = r4 + 43
            int r5 = r4 % 128
            viva.republica.toss.account.register.openbanking.InputEmailActivity.extraCallbackWithResult = r5
            int r4 = r4 % r0
            goto L53
        L49:
            int r1 = viva.republica.toss.account.register.openbanking.InputEmailActivity.writeTypedObject
            int r1 = r1 + 27
            int r4 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputEmailActivity.extraCallbackWithResult = r4
            int r1 = r1 % r0
            r1 = 0
        L53:
            r7.setError(r1)
            im.toss.uikit.widget.textField.TextFieldLine r6 = r6.onVerticalScrollEvent()
            r7 = r2 ^ 1
            r6.setErrorEnabled(r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            int r7 = viva.republica.toss.account.register.openbanking.InputEmailActivity.writeTypedObject
            int r7 = r7 + 53
            int r1 = r7 % 128
            viva.republica.toss.account.register.openbanking.InputEmailActivity.extraCallbackWithResult = r1
            int r7 = r7 % r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputEmailActivity.onExtraCallbackWithResult(viva.republica.toss.account.register.openbanking.InputEmailActivity, java.lang.CharSequence):kotlin.Unit");
    }

    private static final boolean IAuthTabCallback(InputEmailActivity inputEmailActivity, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (motionEvent.getAction() == 1) {
            int i4 = extraCallbackWithResult + 11;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {M_.onExtraCallback, inputEmailActivity.onVerticalScrollEvent().getEditText()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            M_.onNavigationEvent(1483765845, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
            int i6 = extraCallbackWithResult + 43;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
        return true;
    }

    public static final class onExtraCallback {
        private static short[] onWarmupCompleted;
        private static final byte[] $$a = {79, -25, -14, 102};
        private static final int $$b = 39;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent = 1933148265;
        private static int IAuthTabCallback = -1538795429;
        private static int onExtraCallback = 807760360;
        private static byte[] onExtraCallbackWithResult = {-67, 5, -5, 8, 5, -9, 9, -5};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, byte r7, int r8) {
            /*
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r7 = r7 * 2
                int r7 = 115 - r7
                int r6 = r6 * 2
                int r0 = 1 - r6
                byte[] r1 = viva.republica.toss.account.register.openbanking.InputEmailActivity.onExtraCallback.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L19
                r4 = r6
                r7 = r8
                r3 = r2
                goto L2c
            L19:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L1d:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L28:
                int r3 = r3 + 1
                r4 = r1[r7]
            L2c:
                int r4 = -r4
                int r8 = r8 + r4
                int r7 = r7 + 1
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputEmailActivity.onExtraCallback.$$c(int, byte, int):java.lang.String");
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r26, byte r27, int r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 678
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputEmailActivity.onExtraCallback.a(short, byte, int, int, int, java.lang.Object[]):void");
        }

        private onExtraCallback() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @NotNull String str, @NotNull String str2, @Nullable Long l, @Nullable String str3, @Nullable String str4) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) InputEmailActivity.class).putExtra("bankCode", str).putExtra("accountNo", str2).putExtra("EXTRA_KEY_COIN_VERIFICATION_SESSION_ID", l);
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 679585694 - ImageFormat.getBitsPerPixel(0), MotionEvent.axisFromString("") + 1805473427, ImageFormat.getBitsPerPixel(0) - 83, objArr);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr[0]).intern(), str3).putExtra("serviceReferrer", str4);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "");
            int i2 = IAuthTabCallbackDefault + 43;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra2;
        }
    }

    private static final void onWarmupCompleted(final InputEmailActivity inputEmailActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 91;
        extraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            EditText editText = inputEmailActivity.onVerticalScrollEvent().getEditText();
            if (editText != null) {
                int i4 = writeTypedObject + 9;
                extraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    String str = (String) CollectionsKt.getOrNull(inputEmailActivity.access000, i);
                    if (str != null) {
                        Editable text = editText.getText();
                        Intrinsics.checkNotNullExpressionValue(text, "");
                        final String str2 = CollectionsKt.first(StringsKt.split$default(text, new String[]{"@"}, false, 0, 6, (Object) null)) + "@" + str;
                        editText.setText(str2);
                        editText.setSelection(str2.length());
                        inputEmailActivity.onExtraCallback(str2);
                        ConvertByteArrayToFloatArray.onWarmupCompleted("click_email", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda22
                            public final Object invoke(Object obj2) {
                                return InputEmailActivity.IAuthTabCallback(this.f$0, str2, (SetDetectableSize) obj2);
                            }
                        }, 30, (Object) null);
                        int i5 = writeTypedObject + 97;
                        extraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                    return;
                }
                obj.hashCode();
                throw null;
            }
            return;
        }
        inputEmailActivity.onVerticalScrollEvent().getEditText();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        InputEmailActivity inputEmailActivity = (InputEmailActivity) objArr[0];
        String str = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", inputEmailActivity.getScreenName());
        setDetectableSize.onExtraCallback("label", str);
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        setDetectableSize.onExtraCallback((Map) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -333692062, iOnWarmupCompleted, 333692063, new Object[]{inputEmailActivity}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted()));
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 89;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStub() throws Resources.NotFoundException {
        int i = 2 % 2;
        IEngagementSignalsCallbackDefault().setText(getString(R.string.app_account_register_openbanking___2139c1be22));
        KeyboardBottomCta.setCta$default(ICustomTabsServiceStubProxy(), im.toss.uikit.R.string.uikit_confirm, new InputEmailActivity$.ExternalSyntheticLambda8(this), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        EditText editText = onVerticalScrollEvent().getEditText();
        if (editText != null) {
            editText.setSaveEnabled(false);
            editText.setImeOptions(6);
            editText.setInputType(32);
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxTextView.IAuthTabCallback(editText).IAuthTabCallback(new InputEmailActivity$.ExternalSyntheticLambda10(new InputEmailActivity$.ExternalSyntheticLambda9(this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
            onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = RxTextView.IAuthTabCallback(editText).onExtraCallback(1500L, TimeUnit.MILLISECONDS).onExtraCallbackWithResult(NetConverter3.onExtraCallback()).IAuthTabCallback(new InputEmailActivity$.ExternalSyntheticLambda12(new InputEmailActivity$.ExternalSyntheticLambda11(this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
            onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback2);
            int i2 = writeTypedObject + 17;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        ((ConstraintLayout) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1835994586, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1835994596, new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted())).setOnTouchListener(new InputEmailActivity$.ExternalSyntheticLambda13(this));
        this.access000.clear();
        List<String> list = this.access000;
        String[] stringArray = getResources().getStringArray(R.array.recommend_domain);
        Intrinsics.checkNotNullExpressionValue(stringArray, "");
        list.addAll(ArraysKt.filterNotNull(stringArray));
        int size = this.access000.size();
        int i4 = 0;
        while (i4 < size) {
            TextView typography5 = new Typography5(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            typography5.onNavigationEvent(response.Medium);
            M_ m_ = M_.onExtraCallback;
            Context context = typography5.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            typography5.setBackgroundResource(m_.onWarmupCompleted(context));
            ViewGroup.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
            DisplayMetrics displayMetrics = typography5.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(6, displayMetrics);
            DisplayMetrics displayMetrics2 = typography5.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            typography5.setPadding(0, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(6, displayMetrics2));
            typography5.setLayoutParams(layoutParams);
            typography5.setOnClickListener(new InputEmailActivity$.ExternalSyntheticLambda14(this, i4));
            this.getInterfaceDescriptor.add(typography5);
            writeTypedList().addView(typography5);
            i4++;
            int i5 = extraCallbackWithResult + 121;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallbackWithResult + 17;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    private final void validateRelationship() {
        int i = 2 % 2;
        Object obj = null;
        writeRaw writerawOnExtraCallback = getNightColor.onExtraCallback(IAuthTabCallback(), false, 1, (Object) null);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writerawIAuthTabCallback.onNavigationEvent(new InputEmailActivity$.ExternalSyntheticLambda5(new InputEmailActivity$.ExternalSyntheticLambda4(this)), new InputEmailActivity$.ExternalSyntheticLambda7(new InputEmailActivity$.ExternalSyntheticLambda6()));
        int i2 = writeTypedObject + 97;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(InputEmailActivity inputEmailActivity, Profile profile) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = inputEmailActivity.onVerticalScrollEvent().getEditText();
        if (editText != null) {
            int i4 = writeTypedObject + 19;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String strOnExtraCallbackWithResult = profile.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult == null) {
                int i6 = extraCallbackWithResult + 39;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
                strOnExtraCallbackWithResult = "";
            }
            editText.setText(strOnExtraCallbackWithResult);
            editText.setSelection(strOnExtraCallbackWithResult.length());
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 103;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onTransact(Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 23;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(String str, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$email = str;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return InputEmailActivity.this.new IAuthTabCallback(this.$email, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getNightColor getnightcolorIAuthTabCallback = InputEmailActivity.this.IAuthTabCallback();
                String str = this.$email;
                this.label = 1;
                objOnWarmupCompleted = getnightcolorIAuthTabCallback.onWarmupCompleted(str, this);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = ((Result) obj).onNavigationEvent();
            }
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            return Unit.INSTANCE;
        }
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallbackWithResult + 77;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(InputEmailActivity inputEmailActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 45;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
            i = 5;
        } else {
            z = false;
            i = 3;
        }
        BaseActivity.IAuthTabCallback(inputEmailActivity, (String) null, z, i, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void asInterface(InputEmailActivity inputEmailActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        inputEmailActivity.bo_();
        int i4 = extraCallbackWithResult + 77;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (ICustomTabsServiceStub().length() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r6 = kotlinx.coroutines.rx2.RxSingleKt.IAuthTabCallback((kotlin.coroutines.CoroutineContext) null, new viva.republica.toss.account.register.openbanking.InputEmailActivity.IAuthTabCallback(r5, r6, null), 1, (java.lang.Object) null).IAuthTabCallback(o.NetConverter3.onExtraCallback());
        r1 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda15(r5);
        r6 = r6.onExtraCallback(new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda16(r1)).onWarmupCompleted(new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda17(r5));
        r1 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda18(r5);
        r0 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda19(r1);
        r1 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda20(r5);
        r6.onNavigationEvent(r0, new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda21(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (ICustomTabsServiceStub().length() == 0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallback(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r5.ICustomTabsServiceDefault()
            int r1 = r1.length()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L73
            int r1 = viva.republica.toss.account.register.openbanking.InputEmailActivity.extraCallbackWithResult
            int r1 = r1 + 39
            int r4 = r1 % 128
            viva.republica.toss.account.register.openbanking.InputEmailActivity.writeTypedObject = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L27
            java.lang.String r1 = r5.ICustomTabsServiceStub()
            int r1 = r1.length()
            r4 = 4
            int r4 = r4 / r2
            if (r1 != 0) goto L32
            goto L73
        L27:
            java.lang.String r1 = r5.ICustomTabsServiceStub()
            int r1 = r1.length()
            if (r1 != 0) goto L32
            goto L73
        L32:
            viva.republica.toss.account.register.openbanking.InputEmailActivity$IAuthTabCallback r0 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$IAuthTabCallback
            r0.<init>(r6, r3)
            r6 = 1
            o.writeRaw r6 = kotlinx.coroutines.rx2.RxSingleKt.IAuthTabCallback(r3, r0, r6, r3)
            o.MapConverter r0 = o.NetConverter3.onExtraCallback()
            o.writeRaw r6 = r6.IAuthTabCallback(r0)
            viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda16 r0 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda16
            viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda15 r1 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda15
            r1.<init>()
            r0.<init>()
            o.writeRaw r6 = r6.onExtraCallback(r0)
            viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda17 r0 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda17
            r0.<init>()
            o.writeRaw r6 = r6.onWarmupCompleted(r0)
            viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda19 r0 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda19
            viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda18 r1 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda18
            r1.<init>()
            r0.<init>()
            viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda20 r1 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda20
            r1.<init>()
            viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda21 r2 = new viva.republica.toss.account.register.openbanking.InputEmailActivity$$ExternalSyntheticLambda21
            r2.<init>()
            r6.onNavigationEvent(r0, r2)
            return
        L73:
            int r6 = viva.republica.toss.R.string.openbanking_account_invalidate_message
            o.onJsBridgeReady.IAuthTabCallback(r5, r6, r2, r0, r3)
            r5.finish()
            int r6 = viva.republica.toss.account.register.openbanking.InputEmailActivity.extraCallbackWithResult
            int r6 = r6 + 69
            int r1 = r6 % 128
            viva.republica.toss.account.register.openbanking.InputEmailActivity.writeTypedObject = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L87
            return
        L87:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.InputEmailActivity.onExtraCallback(java.lang.String):void");
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallbackWithResult + 9;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(InputEmailActivity inputEmailActivity, Unit unit) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = inputEmailActivity.IAuthTabCallback_Parcel;
        OpenBankingInquiryAgreementActivity.IAuthTabCallback iAuthTabCallback = OpenBankingInquiryAgreementActivity.Companion;
        String strICustomTabsServiceDefault = inputEmailActivity.ICustomTabsServiceDefault();
        String strICustomTabsServiceStub = inputEmailActivity.ICustomTabsServiceStub();
        Long l = inputEmailActivity.IAuthTabCallbackStub;
        String strICustomTabsService_Parcel = inputEmailActivity.ICustomTabsService_Parcel();
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        iEngagementSignalsCallback_Parcel.onNavigationEvent(iAuthTabCallback.onExtraCallback(inputEmailActivity, strICustomTabsServiceDefault, strICustomTabsServiceStub, l, strICustomTabsService_Parcel, (String) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1557722609, iOnWarmupCompleted, -1557722597, new Object[]{inputEmailActivity}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted())));
        Unit unit2 = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 123;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 55;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(InputEmailActivity inputEmailActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, inputEmailActivity, true, (initMiniApp) null, (Function0) null, (Function1) null, 28, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 103;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return unit;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 103;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return "account_register__input_email_address";
        }
        int i3 = 61 / 0;
        return "account_register__input_email_address";
    }

    public Map<String, Object> getScreenParams() {
        String str;
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "screen");
        if (!IEngagementSignalsCallback_Parcel()) {
            str = "register";
        } else {
            int i2 = extraCallbackWithResult + 5;
            int i3 = i2 % 128;
            writeTypedObject = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 53;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            str = "account_setting";
        }
        linkedHashMap.put("status", str);
        linkedHashMap.putAll((Map) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -333692062, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 333692063, new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted()));
        return linkedHashMap;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        InputEmailActivity inputEmailActivity = (InputEmailActivity) objArr[0];
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sendBroadcastWithAdObject sendbroadcastwithadobject = sendBroadcastWithAdObject.ACCOUNT_REGISTER;
        linkedHashMap.put("category", sendbroadcastwithadobject.getValue());
        linkedHashMap.put("service", sendbroadcastwithadobject.getValue());
        linkedHashMap.put("bank_code", inputEmailActivity.ICustomTabsServiceDefault());
        linkedHashMap.put("count", 1);
        Object[] objArr2 = new Object[1];
        a(new char[]{21043, 63207, 49670, 16605}, TextUtils.getCapsMode("", 0, 0) + 4, objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), "user_action");
        String strICustomTabsService_Parcel = inputEmailActivity.ICustomTabsService_Parcel();
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        String str = (String) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1557722609, iOnWarmupCompleted, -1557722597, new Object[]{inputEmailActivity}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        if (strICustomTabsService_Parcel != null && !StringsKt.isBlank(strICustomTabsService_Parcel)) {
            Object[] objArr3 = new Object[1];
            a(new char[]{5273, 46799, 3962, 55825, 15473, 26753, 49642, 26648}, 9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
            linkedHashMap.put(((String) objArr3[0]).intern(), strICustomTabsService_Parcel);
        }
        if (str != null) {
            int i2 = writeTypedObject + 25;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                StringsKt.isBlank(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(str)) {
                linkedHashMap.put("service_referrer", str);
                int i3 = writeTypedObject + 71;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        linkedHashMap.put("execution_id", getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK));
        return linkedHashMap;
    }

    private final boolean IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.access100 == null) {
            return false;
        }
        int i4 = i3 + 59;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InputEmailActivity inputEmailActivity, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1411397816, iOnWarmupCompleted, 1411397824, new Object[]{inputEmailActivity, setDetectableSize}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InputEmailActivity inputEmailActivity, Profile profile) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 2114361467, iOnWarmupCompleted, -2114361461, new Object[]{inputEmailActivity, profile}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    public static /* synthetic */ void onNavigationEvent(InputEmailActivity inputEmailActivity, int i, View view) {
        Object[] objArr = {inputEmailActivity, Integer.valueOf(i), view};
        onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 298637986, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -298637982, objArr, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    public static /* synthetic */ String IAuthTabCallback(InputEmailActivity inputEmailActivity) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (String) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -986313126, iOnWarmupCompleted, 986313131, new Object[]{inputEmailActivity}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    public static /* synthetic */ void onExtraCallbackWithResult(InputEmailActivity inputEmailActivity, View view) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -863829121, iOnWarmupCompleted, 863829130, new Object[]{inputEmailActivity, view}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1745920413, iOnWarmupCompleted, -1745920413, new Object[]{function1, obj}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -603286729, iOnWarmupCompleted, 603286740, new Object[]{function1, obj}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private static final String onExtraCallbackWithResult(InputEmailActivity inputEmailActivity) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (String) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 97819321, iOnWarmupCompleted, -97819318, new Object[]{inputEmailActivity}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private final CERT_SetCertVerifyEnvOCSP updateVisuals() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (CERT_SetCertVerifyEnvOCSP) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 562777918, iOnWarmupCompleted, -562777911, new Object[]{this}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private final ConstraintLayout IEngagementSignalsCallback() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (ConstraintLayout) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1835994586, iOnWarmupCompleted, 1835994596, new Object[]{this}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private final Map<String, Object> access200() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Map) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -333692062, iOnWarmupCompleted, 333692063, new Object[]{this}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private final String onSessionEnded() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (String) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1557722609, iOnWarmupCompleted, -1557722597, new Object[]{this}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(InputEmailActivity inputEmailActivity, String str, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -2033920800, iOnWarmupCompleted, 2033920802, new Object[]{inputEmailActivity, str, setDetectableSize}, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputEmailActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputEmailActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallbackWithResult + 61;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputEmailActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = writeTypedObject + 19;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_InputEmailActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
        int i4 = writeTypedObject + 17;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void setEngagementSignalsCallback() {
        IAuthTabCallbackStubProxy = (char) 59366;
        ICustomTabsCallback = (char) 37840;
        extraCallback = (char) 24986;
        readTypedObject = (char) 2106;
    }
}
