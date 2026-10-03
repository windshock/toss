package viva.republica.toss.account.register;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.define.MobileCarrier;
import im.toss.network.model.BaseApiResponse;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.API_GetLastErrorCode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.EncryptedContentInfoParser;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.M_;
import o.MapConverter;
import o.NetConverter3;
import o.PageShowPoint;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.SpannedDataExternalSyntheticLambda0;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.UST_CMP_IssueCertificate_SendConf;
import o.UTF8Decoder;
import o.access8100;
import o.accessgetStartTimeMscp;
import o.checkDeviceBrand;
import o.checkNavigationBarBySystemProperties;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.getIssuerAndSerialNumber;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.onExitFullscreen;
import o.onPageExit;
import o.overrideEventDispatcher;
import o.setDescriptionTextColor;
import o.setMessageBytes;
import o.updateRuntimeShadowNodeReferencesOnCommit;
import o.willDispatchViewUpdates;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementActivity;
import viva.republica.toss.account.register.BankAccountV2Activity$;
import viva.republica.toss.network.model.verify.SessionKnownType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BankAccountV2Activity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int[] getInterfaceDescriptor;
    private checkNavigationBarBySystemProperties onTransact;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallbackWithResult(this));
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.register.BankAccountV2Activity$$ExternalSyntheticLambda10
        public final Object invoke(Object obj) {
            return BankAccountV2Activity.IAuthTabCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.register.BankAccountV2Activity$$ExternalSyntheticLambda11
        public final Object invoke(Object obj) {
            return BankAccountV2Activity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    static {
        IAuthTabCallback();
        Companion = new onWarmupCompleted(null);
        IAuthTabCallbackStub = 8;
        int i = access100 + 45;
        access000 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BankAccountV2Activity bankAccountV2Activity = (BankAccountV2Activity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallbackWithResult(bankAccountV2Activity, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i5) | i7 | i3);
        int i9 = ~i3;
        int i10 = (~(i7 | i5)) | (~(i7 | i9)) | (~(i9 | i5));
        int i11 = (~(i9 | i6)) | i5;
        int i12 = i6 + i5 + i2 + ((-946781377) * i4) + ((-59450693) * i);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i6) - 346488832) + (357422218 * i5) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i2) + ((-1205993472) * i4) + ((-1651113984) * i) + ((-884408320) * i13);
        int i15 = ((i6 * 358501064) - 1042343473) + (i5 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i2 * 358500791) + (i4 * (-249165559)) + (i * 1905372845) + (i13 * 573505536);
        switch (i14 + (i15 * i15 * (-553189376))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                BankAccountV2Activity bankAccountV2Activity = (BankAccountV2Activity) objArr[0];
                int i16 = 2 % 2;
                int i17 = IAuthTabCallback_Parcel + 85;
                IAuthTabCallbackStubProxy = i17 % 128;
                int i18 = i17 % 2;
                TextFieldLine textFieldLine = ((API_GetLastErrorCode) IAuthTabCallback(new Object[]{bankAccountV2Activity}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1209829212, 1209829214)).onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(textFieldLine, "");
                int i19 = IAuthTabCallback_Parcel + 7;
                IAuthTabCallbackStubProxy = i19 % 128;
                int i20 = i19 % 2;
                return textFieldLine;
            case 4:
                BankAccountV2Activity bankAccountV2Activity2 = (BankAccountV2Activity) objArr[0];
                int i21 = 2 % 2;
                int i22 = IAuthTabCallbackStubProxy + 121;
                IAuthTabCallback_Parcel = i22 % 128;
                int i23 = i22 % 2;
                BaseActivity.IAuthTabCallback(bankAccountV2Activity2, (String) null, false, 3, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i24 = IAuthTabCallback_Parcel + 121;
                IAuthTabCallbackStubProxy = i24 % 128;
                int i25 = i24 % 2;
                return unit;
            case 5:
                BaseActivity baseActivity = (BankAccountV2Activity) objArr[0];
                int i26 = 2 % 2;
                int i27 = IAuthTabCallbackStubProxy + 73;
                IAuthTabCallback_Parcel = i27 % 128;
                if (i27 % 2 == 0) {
                    String string = baseActivity.getString(R.string.account_confirm_in_progress);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    baseActivity.onNavigationEvent(string, true);
                } else {
                    String string2 = baseActivity.getString(R.string.account_confirm_in_progress);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    baseActivity.onNavigationEvent(string2, false);
                }
                return Unit.INSTANCE;
            case 6:
                return onExtraCallbackWithResult(objArr);
            case 7:
                return onExtraCallback(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(BankAccountV2Activity bankAccountV2Activity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(bankAccountV2Activity, th);
        }
        onExtraCallback(bankAccountV2Activity, th);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BankAccountV2Activity bankAccountV2Activity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(bankAccountV2Activity, iEngagementSignalsCallbackDefault);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(bankAccountV2Activity, iEngagementSignalsCallbackDefault);
        int i3 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallback(BankAccountV2Activity bankAccountV2Activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(bankAccountV2Activity);
        int i4 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(BankAccountV2Activity bankAccountV2Activity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(bankAccountV2Activity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallback_Parcel(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(BankAccountV2Activity bankAccountV2Activity, TextView textView, int i, KeyEvent keyEvent) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(bankAccountV2Activity, textView, i, keyEvent);
        int i5 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return zOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BankAccountV2Activity bankAccountV2Activity = (BankAccountV2Activity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(bankAccountV2Activity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallbackStubProxy + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BankAccountV2Activity bankAccountV2Activity, long j, boolean z, setDescriptionTextColor setdescriptiontextcolor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(j);
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 == 0) {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{bankAccountV2Activity, lValueOf, boolValueOf, setdescriptiontextcolor}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1462254963, 1462254971);
        int i4 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BankAccountV2Activity bankAccountV2Activity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(bankAccountV2Activity, setDetectableSize);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(bankAccountV2Activity, setDetectableSize);
        int i3 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BankAccountV2Activity bankAccountV2Activity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{bankAccountV2Activity, deserializeurinullablecollection}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1620411010, 1620411015);
        int i4 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BankAccountV2Activity bankAccountV2Activity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(bankAccountV2Activity, th);
        int i4 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(BankAccountV2Activity bankAccountV2Activity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(bankAccountV2Activity, iEngagementSignalsCallbackDefault);
        }
        onExtraCallback(bankAccountV2Activity, iEngagementSignalsCallbackDefault);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BankAccountV2Activity bankAccountV2Activity, willDispatchViewUpdates willdispatchviewupdates) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(bankAccountV2Activity, willdispatchviewupdates);
        int i4 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BankAccountV2Activity bankAccountV2Activity = (BankAccountV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(bankAccountV2Activity);
        if (i3 == 0) {
            return null;
        }
        int i4 = 29 / 0;
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(willDispatchViewUpdates willdispatchviewupdates, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(willdispatchviewupdates, commonModule_setLeftEdgeTouchEnabled);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(willdispatchviewupdates, commonModule_setLeftEdgeTouchEnabled);
        int i3 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BankAccountV2Activity bankAccountV2Activity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{bankAccountV2Activity, deserializeurinullablecollection}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1222337304, 1222337308);
        int i3 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            IAuthTabCallback(new Object[]{function1, obj}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -2123467302, 2123467311);
            int i3 = 80 / 0;
        } else {
            int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            IAuthTabCallback(new Object[]{function1, obj}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -2123467302, 2123467311);
        }
        int i4 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return 1001516L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult implements Function0<API_GetLastErrorCode> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final API_GetLastErrorCode invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return API_GetLastErrorCode.IAuthTabCallback(layoutInflater);
        }
    }

    public static final /* synthetic */ boolean onExtraCallback(BankAccountV2Activity bankAccountV2Activity, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = bankAccountV2Activity.IAuthTabCallback(charSequence);
        int i4 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ KeyboardBottomCta onExtraCallbackWithResult(BankAccountV2Activity bankAccountV2Activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bankAccountV2Activity.ICustomTabsServiceDefault();
            obj.hashCode();
            throw null;
        }
        KeyboardBottomCta keyboardBottomCtaICustomTabsServiceDefault = bankAccountV2Activity.ICustomTabsServiceDefault();
        int i3 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return keyboardBottomCtaICustomTabsServiceDefault;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BankAccountV2Activity bankAccountV2Activity = (BankAccountV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = bankAccountV2Activity.asInterface.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        API_GetLastErrorCode aPI_GetLastErrorCode = (API_GetLastErrorCode) value;
        int i4 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return aPI_GetLastErrorCode;
        }
        throw null;
    }

    private final ConstraintLayout updateVisuals() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        if (i3 != 0) {
            constraintLayout = ((API_GetLastErrorCode) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, -1209829212, 1209829214)).onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            int i4 = 69 / 0;
        } else {
            constraintLayout = ((API_GetLastErrorCode) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, -1209829212, 1209829214)).onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        }
        int i5 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        throw null;
    }

    private final TdsTopV1View ICustomTabsService_Parcel() {
        TdsTopV1View tdsTopV1View;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        if (i3 != 0) {
            tdsTopV1View = ((API_GetLastErrorCode) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, -1209829212, 1209829214)).IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
            int i4 = 56 / 0;
        } else {
            tdsTopV1View = ((API_GetLastErrorCode) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, -1209829212, 1209829214)).IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
        }
        int i5 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return tdsTopV1View;
    }

    private final KeyboardBottomCta ICustomTabsServiceDefault() {
        KeyboardBottomCta keyboardBottomCta;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        if (i3 == 0) {
            keyboardBottomCta = ((API_GetLastErrorCode) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, -1209829212, 1209829214)).IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
            int i4 = 77 / 0;
        } else {
            keyboardBottomCta = ((API_GetLastErrorCode) IAuthTabCallback(objArr, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, -1209829212, 1209829214)).IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        }
        int i5 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return keyboardBottomCta;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(BankAccountV2Activity bankAccountV2Activity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            bankAccountV2Activity.setResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
            bankAccountV2Activity.finish();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        bankAccountV2Activity.setResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
        bankAccountV2Activity.finish();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(viva.republica.toss.account.register.BankAccountV2Activity r4, o.IEngagementSignalsCallbackDefault r5) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallbackStubProxy
            int r1 = r1 + 91
            int r2 = r1 % 128
            viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            r2 = -1
            java.lang.String r3 = ""
            if (r1 != 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int r1 = r5.onNavigationEvent()
            r3 = 25
            int r3 = r3 / 0
            if (r1 != r2) goto L38
            goto L28
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int r1 = r5.onNavigationEvent()
            if (r1 != r2) goto L38
        L28:
            android.content.Intent r5 = r5.onExtraCallbackWithResult()
            r4.onExtraCallbackWithResult(r5)
            int r4 = viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallbackStubProxy
            int r4 = r4 + 11
            int r5 = r4 % 128
            viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback_Parcel = r5
            int r4 = r4 % r0
        L38:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.BankAccountV2Activity.onExtraCallback(viva.republica.toss.account.register.BankAccountV2Activity, o.IEngagementSignalsCallbackDefault):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String ICustomTabsServiceStub() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(new int[]{-1847871295, -89844097, -1583123481, -1290779715}, 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        int i4 = IAuthTabCallbackStubProxy + 63;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("serviceReferrer");
        int i4 = IAuthTabCallback_Parcel + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(BankAccountV2Activity bankAccountV2Activity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        M_ m_ = M_.onExtraCallback;
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        m_.onExtraCallback(((TextFieldLine) IAuthTabCallback(new Object[]{bankAccountV2Activity}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1042331698, -1042331695)).getEditText());
        int i4 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    public static final class onExtraCallback extends accessgetStartTimeMscp {
        onExtraCallback() {
        }

        public void afterTextChanged(Editable editable) {
            BankAccountV2Activity.onExtraCallbackWithResult(BankAccountV2Activity.this).onWarmupCompleted().setEnabled(BankAccountV2Activity.onExtraCallback(BankAccountV2Activity.this, editable));
        }
    }

    public static final class onWarmupCompleted {
        private static final byte[] $$a = {120, -46, -95, -23};
        private static final int $$b = 154;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static char[] onWarmupCompleted = {60832, 54574, 40070, 17409, 4093, 60848, 54562, 40065, 17422, 4074, 63330, 48854, 24997, 10533, 4240, 55300, 60838, 54562, 40084, 17416, 4074, 63353, 48835, 24995};
        private static long onExtraCallback = 6172481974705706311L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r7, int r8, short r9) {
            /*
                byte[] r0 = viva.republica.toss.account.register.BankAccountV2Activity.onWarmupCompleted.$$a
                int r9 = r9 * 2
                int r9 = 3 - r9
                int r7 = r7 * 2
                int r7 = 1 - r7
                int r8 = r8 * 4
                int r8 = r8 + 97
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L27:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2c:
                int r8 = r8 + r9
                r9 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.BankAccountV2Activity.onWarmupCompleted.$$c(short, int, short):java.lang.String");
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $10 + 11;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.green(0)), 17 - TextUtils.indexOf("", "", 0), 10973 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - KeyEvent.getDeadChar(0, 0)), 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 20220 - View.MeasureSpec.getSize(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49123), Color.rgb(0, 0, 0) + 16777260, 1493 - TextUtils.indexOf((CharSequence) "", '0', 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $10 + 55;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49123), (ViewConfiguration.getPressedStateDuration() >> 16) + 44, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        private onWarmupCompleted() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @Nullable String str5, @Nullable String str6) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intent intent = new Intent(context, (Class<?>) BankAccountV2Activity.class);
            intent.putExtra("bankCode", str);
            intent.putExtra("accountNo", str2);
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.getSize(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 5, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str3);
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getTouchSlop() >> 8) + 5, 11 - View.MeasureSpec.getSize(0), (char) TextUtils.getTrimmedLength(""), objArr2);
            intent.putExtra(((String) objArr2[0]).intern(), str4);
            intent.putExtra("showSmsGuide", z);
            Object[] objArr3 = new Object[1];
            a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, TextUtils.getOffsetBefore("", 0) + 8, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr3);
            intent.putExtra(((String) objArr3[0]).intern(), str5);
            intent.putExtra("serviceReferrer", str6);
            int i2 = IAuthTabCallback + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    private static final boolean onNavigationEvent(BankAccountV2Activity bankAccountV2Activity, TextView textView, int i, KeyEvent keyEvent) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 61;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0 ? i == 6 : i == 105) {
            if (bankAccountV2Activity.ICustomTabsServiceDefault().onWarmupCompleted().isEnabled()) {
                bankAccountV2Activity.onNavigationEvent(true);
            }
        }
        int i4 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static final void onNavigationEvent(BankAccountV2Activity bankAccountV2Activity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        bankAccountV2Activity.onNavigationEvent(true);
        int i4 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0123 A[PHI: r6
      0x0123: PHI (r6v15 int) = (r6v14 int), (r6v18 int) binds: [B:24:0x0121, B:21:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.BankAccountV2Activity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean IAuthTabCallback(java.lang.CharSequence r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallbackStubProxy
            int r2 = r1 + 79
            int r3 = r2 % 128
            viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback_Parcel = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L15
            r2 = 50
            int r2 = r2 / r3
            if (r6 == 0) goto L2f
            goto L17
        L15:
            if (r6 == 0) goto L2f
        L17:
            r2 = 1
            int r1 = r1 + r2
            int r4 = r1 % 128
            viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback_Parcel = r4
            int r1 = r1 % r0
            int r6 = r6.length()
            r1 = 7
            if (r6 < r1) goto L2f
            int r6 = viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback_Parcel
            int r6 = r6 + 53
            int r1 = r6 % 128
            viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallbackStubProxy = r1
            int r6 = r6 % r0
            return r2
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback(java.lang.CharSequence):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            if (i2 != -1) {
                int i6 = IAuthTabCallbackStubProxy + 31;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                if (i2 != 444) {
                    return;
                }
            }
            setResult(-1, intent);
            finish();
        }
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 119;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return "input_account_info_number";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public View access000() {
        TextFieldLine textFieldLine;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            textFieldLine = (TextFieldLine) IAuthTabCallback(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1042331698, -1042331695);
            int i3 = 10 / 0;
        } else {
            int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            textFieldLine = (TextFieldLine) IAuthTabCallback(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1042331698, -1042331695);
        }
        int i4 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return textFieldLine;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getInterfaceDescriptor;
        int i4 = -1469660336;
        float f = 0.0f;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 72 - View.combineMeasuredStates(0, 0), 8848 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getInterfaceDescriptor;
        if (iArr5 != null) {
            int i7 = $10 + 115;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", i5, i5), View.combineMeasuredStates(i5, i5) + 72, 8848 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            int i10 = $10 + 103;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $10 + 43;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 39, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 78, TextUtils.getOffsetAfter("", 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystemproperties = this.onTransact;
        if (checknavigationbarbysystemproperties == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = IAuthTabCallback_Parcel + 117;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            checknavigationbarbysystemproperties = null;
        }
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("bank_code", String.valueOf(checknavigationbarbysystemproperties.IAuthTabCallbackStub())), getWrite.IAuthTabCallback("execution_id", getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK))});
        String strICustomTabsServiceStub = ICustomTabsServiceStub();
        String strAccess200 = access200();
        if (strICustomTabsServiceStub != null && !StringsKt.isBlank(strICustomTabsServiceStub)) {
            Object[] objArr = new Object[1];
            a(new int[]{-1847871295, -89844097, -1583123481, -1290779715}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8, objArr);
            mapIAuthTabCallback.put(((String) objArr[0]).intern(), strICustomTabsServiceStub);
        }
        if (strAccess200 != null && !StringsKt.isBlank(strAccess200)) {
            int i6 = IAuthTabCallbackStubProxy + 37;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            mapIAuthTabCallback.put("service_referrer", strAccess200);
            if (i7 == 0) {
                throw null;
            }
        }
        return mapIAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(BankAccountV2Activity bankAccountV2Activity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new int[]{2008287241, -1309186890}, 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), bankAccountV2Activity.getScreenName());
        setDetectableSize.onExtraCallback().put("view", bankAccountV2Activity.getScreenName());
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        a(new int[]{-1628389262, 1877250411, 1985350011, 507871217}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6, objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), "fill_number");
        setDetectableSize.onExtraCallback().put("execution_id", getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK));
        checkNavigationBarBySystemProperties checknavigationbarbysystemproperties = bankAccountV2Activity.onTransact;
        Object obj = null;
        if (checknavigationbarbysystemproperties == null) {
            int i2 = IAuthTabCallback_Parcel + 11;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            checknavigationbarbysystemproperties = null;
        }
        setDetectableSize.onExtraCallback("bank_code", String.valueOf(checknavigationbarbysystemproperties.IAuthTabCallbackStub()));
        String strICustomTabsServiceStub = bankAccountV2Activity.ICustomTabsServiceStub();
        if (strICustomTabsServiceStub != null && strICustomTabsServiceStub.length() != 0) {
            Object[] objArr3 = new Object[1];
            a(new int[]{-1847871295, -89844097, -1583123481, -1290779715}, 8 - Color.argb(0, 0, 0, 0), objArr3);
            setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), bankAccountV2Activity.ICustomTabsServiceStub());
        }
        String strAccess200 = bankAccountV2Activity.access200();
        if (strAccess200 != null) {
            int i3 = IAuthTabCallback_Parcel + 97;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                strAccess200.length();
                throw null;
            }
            if (strAccess200.length() != 0) {
                setDetectableSize.onExtraCallback("service_referrer", bankAccountV2Activity.access200());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent(boolean r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback_Parcel
            int r1 = r1 + 71
            int r2 = r1 % 128
            viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 28
            int r1 = r1 / 0
            if (r11 == 0) goto L28
            goto L17
        L15:
            if (r11 == 0) goto L28
        L17:
            java.lang.String r2 = "click_button"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            viva.republica.toss.account.register.BankAccountV2Activity$$ExternalSyntheticLambda9 r7 = new viva.republica.toss.account.register.BankAccountV2Activity$$ExternalSyntheticLambda9
            r7.<init>(r10)
            r8 = 30
            r9 = 0
            o.ConvertByteArrayToFloatArray.onWarmupCompleted(r2, r3, r4, r5, r6, r7, r8, r9)
        L28:
            o.checkNavigationBarBySystemProperties r11 = r10.onTransact
            if (r11 != 0) goto L3b
            int r11 = viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback_Parcel
            int r11 = r11 + 61
            int r1 = r11 % 128
            viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallbackStubProxy = r1
            int r11 = r11 % r0
            java.lang.String r11 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            r11 = 0
        L3b:
            int r11 = r11.IAuthTabCallbackStub()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            o.checkNavigationBarByWindowManagerService r1 = o.checkNavigationBarByWindowManagerService.SANGHO
            java.lang.String r1 = r1.getCode()
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r1)
            if (r11 == 0) goto L5c
            int r11 = viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback_Parcel
            int r11 = r11 + 103
            int r1 = r11 % 128
            viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallbackStubProxy = r1
            int r11 = r11 % r0
            r10.onNavigationEvent()
            return
        L5c:
            r10.ICustomTabsServiceStubProxy()
            int r11 = viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallbackStubProxy
            int r11 = r11 + 65
            int r1 = r11 % 128
            viva.republica.toss.account.register.BankAccountV2Activity.IAuthTabCallback_Parcel = r1
            int r11 = r11 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.BankAccountV2Activity.onNavigationEvent(boolean):void");
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onWarmupCompleted(BankAccountV2Activity bankAccountV2Activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        bankAccountV2Activity.bo_();
        int i4 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    private static final Unit IAuthTabCallback(willDispatchViewUpdates willdispatchviewupdates, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(R.string.guide));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(willdispatchviewupdates.onNavigationEvent());
        Object obj = null;
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(BankAccountV2Activity bankAccountV2Activity, willDispatchViewUpdates willdispatchviewupdates) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            willdispatchviewupdates.IAuthTabCallback();
            throw null;
        }
        if (!willdispatchviewupdates.IAuthTabCallback()) {
            int i3 = IAuthTabCallbackStubProxy + 115;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                bankAccountV2Activity.ICustomTabsServiceStubProxy();
                int i4 = 78 / 0;
            } else {
                bankAccountV2Activity.ICustomTabsServiceStubProxy();
            }
        } else {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(bankAccountV2Activity, new BankAccountV2Activity$.ExternalSyntheticLambda8(willdispatchviewupdates));
            int i5 = IAuthTabCallbackStubProxy + 53;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 56 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(BankAccountV2Activity bankAccountV2Activity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, bankAccountV2Activity, true, (initMiniApp) null, (Function0) null, (Function1) null, 62, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, bankAccountV2Activity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent() throws Throwable {
        Editable text;
        Editable text2;
        int i = 2 % 2;
        EditText editText = ((TextFieldLine) IAuthTabCallback(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1042331698, -1042331695)).getEditText();
        if (editText != null) {
            int i2 = IAuthTabCallback_Parcel + 1;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            text = editText.getText();
        } else {
            text = null;
        }
        if (text != null) {
            int i4 = IAuthTabCallbackStubProxy + 51;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (text.length() != 0) {
                int i6 = IAuthTabCallback_Parcel + 77;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                EditText editText2 = ((TextFieldLine) IAuthTabCallback(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1042331698, -1042331695)).getEditText();
                if (editText2 != null) {
                    int i8 = IAuthTabCallback_Parcel + 67;
                    IAuthTabCallbackStubProxy = i8 % 128;
                    int i9 = i8 % 2;
                    text2 = editText2.getText();
                } else {
                    text2 = null;
                }
                String strValueOf = String.valueOf(text2);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - TextUtils.indexOf("", "", 0)), 22 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf((CharSequence) "", '0') + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - ((Process.getThreadPriority(0) + 20) >> 6)), 22 - (ViewConfiguration.getPressedStateDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 24734, -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                    }
                    writeRaw<BaseApiResponse<willDispatchViewUpdates>> writerawOnTransact = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).onTransact(strValueOf);
                    MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                    Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                    writeRaw writerawIAuthTabCallback = writerawOnTransact.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                    Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                    writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new BankAccountV2Activity$.ExternalSyntheticLambda16(new BankAccountV2Activity$.ExternalSyntheticLambda15(this))).onWarmupCompleted(new BankAccountV2Activity$.ExternalSyntheticLambda17(this));
                    Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
                    onNavigationEvent(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new BankAccountV2Activity$.ExternalSyntheticLambda18(this), new BankAccountV2Activity$.ExternalSyntheticLambda19(this)));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(BankAccountV2Activity bankAccountV2Activity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(bankAccountV2Activity.getString(R.string.app_account_register___55d180cecf));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStubProxy() throws Throwable {
        String str;
        String str2;
        int i = 2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystemproperties = this.onTransact;
        Object obj = null;
        if (checknavigationbarbysystemproperties == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            checknavigationbarbysystemproperties = null;
        }
        String strValueOf = String.valueOf(checknavigationbarbysystemproperties.IAuthTabCallbackStub());
        EditText editText = ((TextFieldLine) IAuthTabCallback(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1042331698, -1042331695)).getEditText();
        Intrinsics.checkNotNull(editText);
        String string = editText.getText().toString();
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback = PageShowPoint.Companion.onExtraCallback(strValueOf, string);
        if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback != null && tabBarInfoQueryPointOnTabBarInfoQueryListenerOnExtraCallback.requestPostMessageChannelWithExtras()) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new BankAccountV2Activity$.ExternalSyntheticLambda7(this));
            int i2 = IAuthTabCallback_Parcel + 103;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.IAuthTabCallbackDefault;
        overrideEventDispatcher overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
        String strName = SessionKnownType.REGISTER_BANK_ACCOUNT.name();
        String str3 = "BANK_DEPOSIT_EXECUTION_ID:" + getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK);
        String strICustomTabsServiceStub = ICustomTabsServiceStub();
        if (strICustomTabsServiceStub == null) {
            int i3 = IAuthTabCallbackStubProxy + 59;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            str = "";
        } else {
            str = strICustomTabsServiceStub;
        }
        String strAccess200 = access200();
        if (strAccess200 == null) {
            int i5 = IAuthTabCallback_Parcel + 9;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        } else {
            str2 = strAccess200;
        }
        iEngagementSignalsCallback_Parcel.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher, this, strName, "SV-WBA", (checkDeviceBrand) null, (String) null, false, (String) null, (String) null, (MobileCarrier) null, (String) null, (String) null, false, false, false, str, str2, str3, true, Boolean.TRUE, false, (String) null, (String) null, strValueOf, string, false, false, false, (String) null, false, (updateRuntimeShadowNodeReferencesOnCommit) null, 0L, 0L, false, false, false, false, false, (String) null, (String) null, -13090824, 127, (Object) null));
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(BankAccountV2Activity bankAccountV2Activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        bankAccountV2Activity.bo_();
        int i4 = IAuthTabCallbackStubProxy + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, viva.republica.toss.account.register.BankAccountV2Activity] */
    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        ?? r3 = (BankAccountV2Activity) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        setDescriptionTextColor setdescriptiontextcolor = (setDescriptionTextColor) objArr[3];
        int i = 2 % 2;
        AccountAgreementActivity.onExtraCallback onextracallback = AccountAgreementActivity.Companion;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = ((BankAccountV2Activity) r3).asBinder;
        long jOnWarmupCompleted = setdescriptiontextcolor.onWarmupCompleted();
        int iOnExtraCallback = setdescriptiontextcolor.onExtraCallback();
        String strOnExtraCallbackWithResult = setdescriptiontextcolor.onExtraCallbackWithResult();
        TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = setdescriptiontextcolor.IAuthTabCallback();
        String strICustomTabsServiceStub = r3.ICustomTabsServiceStub();
        if (strICustomTabsServiceStub == null) {
            int i2 = IAuthTabCallback_Parcel + 65;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            strICustomTabsServiceStub = "";
        }
        String strAccess200 = r3.access200();
        AccountAgreementActivity.onExtraCallback.IAuthTabCallback(onextracallback, (Activity) r3, iEngagementSignalsCallback_Parcel, Long.valueOf(jOnWarmupCompleted), String.valueOf(iOnExtraCallback), strOnExtraCallbackWithResult, onextracallbackwithresultIAuthTabCallback, (UTF8Decoder) null, true, Long.valueOf(jLongValue), (String) null, (String) null, zBooleanValue, false, strICustomTabsServiceStub, strAccess200, 5696, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(BankAccountV2Activity bankAccountV2Activity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, bankAccountV2Activity, true, (initMiniApp) null, (Function0) null, (Function1) null, 28, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v33, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r14v34, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r14v35, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r14v36, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r14v37, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r20v0, types: [android.app.Activity, im.toss.uikit.base.UIKitBaseActivity, viva.republica.toss.account.register.BankAccountV2Activity] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(android.content.Intent r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.BankAccountV2Activity.onExtraCallbackWithResult(android.content.Intent):void");
    }

    public static /* synthetic */ Unit onWarmupCompleted(BankAccountV2Activity bankAccountV2Activity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{bankAccountV2Activity, commonModule_setLeftEdgeTouchEnabled}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1794767007, -1794767001);
    }

    public static /* synthetic */ void onExtraCallback(BankAccountV2Activity bankAccountV2Activity) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        IAuthTabCallback(new Object[]{bankAccountV2Activity}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 419449253, -419449252);
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        IAuthTabCallback(new Object[]{function1, obj}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1184815630, -1184815623);
    }

    public static /* synthetic */ void onWarmupCompleted(BankAccountV2Activity bankAccountV2Activity, View view) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        IAuthTabCallback(new Object[]{bankAccountV2Activity, view}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1818281868, -1818281868);
    }

    private static final Unit onNavigationEvent(BankAccountV2Activity bankAccountV2Activity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{bankAccountV2Activity, deserializeurinullablecollection}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1222337304, 1222337308);
    }

    private final TextFieldLine setEngagementSignalsCallback() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (TextFieldLine) IAuthTabCallback(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1042331698, -1042331695);
    }

    private final API_GetLastErrorCode validateRelationship() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (API_GetLastErrorCode) IAuthTabCallback(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1209829212, 1209829214);
    }

    private static final Unit IAuthTabCallback(BankAccountV2Activity bankAccountV2Activity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{bankAccountV2Activity, deserializeurinullablecollection}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1620411010, 1620411015);
    }

    private static final Unit onNavigationEvent(BankAccountV2Activity bankAccountV2Activity, long j, boolean z, setDescriptionTextColor setdescriptiontextcolor) {
        Object[] objArr = {bankAccountV2Activity, Long.valueOf(j), Boolean.valueOf(z), setdescriptiontextcolor};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) IAuthTabCallback(objArr, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -1462254963, 1462254971);
    }

    private static final void access000(Function1 function1, Object obj) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        IAuthTabCallback(new Object[]{function1, obj}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -2123467302, 2123467311);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStubProxy + 63;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void IAuthTabCallback() {
        getInterfaceDescriptor = new int[]{-2145238094, 477797081, -1083133000, 80749893, -259714192, 840736314, 2108122835, 1718069493, 786913545, 641822246, 29607036, 296318668, 459841789, 417848348, -538560014, 976473097, -1636499836, -60471953};
    }
}
