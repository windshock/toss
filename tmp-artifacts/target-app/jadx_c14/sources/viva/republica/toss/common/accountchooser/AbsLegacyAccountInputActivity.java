package viva.republica.toss.common.accountchooser;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Base64Encoder;
import o.CERT_Init;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.IPostMessageServiceStubProxy;
import o.M_;
import o.PlayerErrorCode;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TurboModuleInteropUtilsParsingException;
import o.checkDeviceBrand;
import o.disableImageViewPreallocationAndroid;
import o.enableAccessibilityOrder;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.initMiniApp;
import o.readIntokhttp;
import o.sendBroadcastSyncWithPendingBroadcasts;
import o.setApTextSize;
import o.setMinimumWidth;
import o.writeBinary;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$;
import viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$initBankList$1$1$;
import viva.republica.toss.widget.BankListView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class AbsLegacyAccountInputActivity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder;
    private static int[] asInterface;
    private static int getInterfaceDescriptor;
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));

    static {
        ICustomTabsServiceStubProxy();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(absLegacyAccountInputActivity, bool);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(absLegacyAccountInputActivity, bool);
        int i3 = IAuthTabCallbackStub + 35;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, enableAccessibilityOrder.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(absLegacyAccountInputActivity, onextracallbackwithresult);
        int i4 = asBinder + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, obj}, -1266919690, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1266919694, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        int i4 = asBinder + 5;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
    }

    public static /* synthetic */ setMinimumWidth onExtraCallback(View view, setMinimumWidth setminimumwidth) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setMinimumWidth setminimumwidthOnWarmupCompleted = onWarmupCompleted(view, setminimumwidth);
        int i4 = asBinder + 77;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return setminimumwidthOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(setDetectableSize);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        int i3 = IAuthTabCallbackStub + 49;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(absLegacyAccountInputActivity, view, motionEvent);
        int i4 = asBinder + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ CharSequence onNavigationEvent(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) throws IOException {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 21;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(charSequence, i, i2, spanned, i3, i4);
        int i8 = asBinder + 51;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return charSequenceOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i) | i7)) | i9;
        int i11 = (~(i | i7)) | i9;
        int i12 = ~(i8 | i4);
        int i13 = i4 + i2 + i5 + (104229478 * i6) + ((-1414784667) * i3);
        int i14 = i13 * i13;
        int i15 = ((i4 * (-393484327)) - 513802240) + ((-393484327) * i2) + (i10 * 23337000) + (i11 * 23337000) + (23337000 * i12) + ((-370147328) * i5) + ((-1784676352) * i6) + ((-1146093568) * i3) + ((-1043988480) * i14);
        int i16 = ((i4 * 256725217) - 1927268364) + (i2 * 256725217) + (i10 * 872) + (i11 * 872) + (i12 * 872) + (i5 * 256726089) + (i6 * (-1692676330)) + (i3 * (-87465523)) + (i14 * 964034560);
        int i17 = i15 + (i16 * i16 * (-1055260672));
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i17 == 4) {
            return onExtraCallback(objArr);
        }
        if (i17 == 5) {
            return onNavigationEvent(objArr);
        }
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        AbsLegacyAccountInputActivity absLegacyAccountInputActivity = (AbsLegacyAccountInputActivity) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallbackStub + 27;
        asBinder = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onWarmupCompleted());
        setDetectableSize.onExtraCallback("message_title", (CharSequence) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1303993273, new Object[]{commonModule_setLeftEdgeTouchEnabled}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1303993264, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()));
        setDetectableSize.onExtraCallback("message_msg", commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
        setDetectableSize.onExtraCallback("screen_name", absLegacyAccountInputActivity.getScreenName());
        Unit unit = Unit.INSTANCE;
        int i21 = IAuthTabCallbackStub + 71;
        asBinder = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        AbsLegacyAccountInputActivity absLegacyAccountInputActivity = (AbsLegacyAccountInputActivity) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{commonModule_setLeftEdgeTouchEnabled, absLegacyAccountInputActivity, setDetectableSize}, -1413115440, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1413115440, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        int i4 = asBinder + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(absLegacyAccountInputActivity, num);
        }
        onWarmupCompleted(absLegacyAccountInputActivity, num);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(absLegacyAccountInputActivity, commonModule_setLeftEdgeTouchEnabled);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(absLegacyAccountInputActivity, commonModule_setLeftEdgeTouchEnabled);
        int i3 = asBinder + 1;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, obj}, -1047438558, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1047438560, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
            int i3 = 94 / 0;
        } else {
            onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, obj}, -1047438558, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1047438560, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        }
        int i4 = asBinder + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AbsLegacyAccountInputActivity absLegacyAccountInputActivity = (AbsLegacyAccountInputActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(absLegacyAccountInputActivity, view);
        int i4 = asBinder + 89;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
    }

    protected abstract CharSequence IAuthTabCallback();

    protected abstract CharSequence ICustomTabsServiceDefault();

    protected abstract String ICustomTabsServiceStub();

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    protected abstract void onExtraCallback(@NotNull String str, @NotNull String str2);

    protected abstract checkDeviceBrand onNavigationEvent();

    protected void updateVisuals() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements Function0<CERT_Init> {
        final /* synthetic */ Activity IAuthTabCallback;

        public onWarmupCompleted(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CERT_Init invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_Init.onWarmupCompleted(layoutInflater);
        }
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return "verify_bank_account";
        }
        throw null;
    }

    public final CERT_Init writeTypedList() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onTransact.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CERT_Init cERT_Init = (CERT_Init) value;
        int i4 = asBinder + 33;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cERT_Init;
    }

    private final BankListView setEngagementSignalsCallback() {
        BankListView bankListView;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            bankListView = writeTypedList().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(bankListView, "");
            int i3 = 27 / 0;
        } else {
            bankListView = writeTypedList().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(bankListView, "");
        }
        int i4 = asBinder + 63;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return bankListView;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(writeTypedList().getRoot());
        FrameLayout root = writeTypedList().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, writeTypedList().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
        IEngagementSignalsCallback();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, 1880271758, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1880271755, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        access200();
        validateRelationship();
        int i4 = asBinder + 43;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        asBinder = i2 % 128;
        Editable text = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            writeTypedList().IAuthTabCallbackDefault.getEditText();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        EditText editText = writeTypedList().IAuthTabCallbackDefault.getEditText();
        if (editText != null) {
            text = editText.getText();
        } else {
            int i3 = asBinder + 117;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        bundle.putString("accountNumber", String.valueOf(text));
        super.onSaveInstanceState(bundle);
    }

    public void onRestoreInstanceState(@NotNull Bundle bundle) {
        EditText editText;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*im.toss.uikit.base.UIKitBaseActivity*/.onRestoreInstanceState(bundle);
        String string = bundle.getString("accountNumber");
        if (string != null && (editText = writeTypedList().IAuthTabCallbackDefault.getEditText()) != null) {
            int i2 = asBinder + 67;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            editText.setText(string);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = IAuthTabCallbackStub + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(@NotNull Function1<? super CommonModule_setLeftEdgeTouchEnabled, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        CommonModule_setLeftEdgeTouchEnabled.Companion.onWarmupCompleted(this, (initMiniApp) null, function1);
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = new CommonModule_setLeftEdgeTouchEnabled(this, (initMiniApp) null, (writeBinary) null);
        function1.invoke(commonModule_setLeftEdgeTouchEnabled);
        ConvertByteArrayToFloatArray.onWarmupCompleted("popup_error", false, (String) null, (List) null, (Map) null, new AbsLegacyAccountInputActivity$.ExternalSyntheticLambda5(commonModule_setLeftEdgeTouchEnabled, this), 30, (Object) null);
        int i2 = IAuthTabCallbackStub + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(absLegacyAccountInputActivity.getString(R.string.account_chooser_not_my_account_dialog_title_with_name, PlayerErrorCode.onPostMessage()));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(absLegacyAccountInputActivity.getString(R.string.account_chooser_not_my_account_dialog_message));
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 85;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        absLegacyAccountInputActivity.updateVisuals();
        absLegacyAccountInputActivity.finish();
        int i4 = IAuthTabCallbackStub + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IEngagementSignalsCallback() {
        String strICustomTabsServiceStub;
        int i = 2 % 2;
        setToolbar(findViewById(R.id.toolbar));
        writeTypedList().onTransact.setNavigationOnClickListener(new AbsLegacyAccountInputActivity$.ExternalSyntheticLambda4(this));
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = asBinder + 79;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                supportActionBar.onNavigationEvent(false);
                strICustomTabsServiceStub = ICustomTabsServiceStub();
                if (strICustomTabsServiceStub == null) {
                    return;
                }
            } else {
                supportActionBar.onNavigationEvent(true);
                strICustomTabsServiceStub = ICustomTabsServiceStub();
                if (strICustomTabsServiceStub == null) {
                    return;
                }
            }
            supportActionBar.onExtraCallbackWithResult(strICustomTabsServiceStub);
            int i3 = IAuthTabCallbackStub + 107;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[PHI: r0
      0x0039: PHI (r0v4 char) = (r0v3 char), (r0v5 char) binds: [B:10:0x0037, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.CharSequence onExtraCallbackWithResult(java.lang.CharSequence r3, int r4, int r5, android.text.Spanned r6, int r7, int r8) throws java.io.IOException {
        /*
            r6 = 2
            int r7 = r6 % r6
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r3.length()
            r7 = 0
            r8 = r7
        L12:
            if (r8 >= r5) goto L3f
            int r0 = viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.asBinder
            int r0 = r0 + 39
            int r1 = r0 % 128
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.IAuthTabCallbackStub = r1
            int r0 = r0 % r6
            if (r0 != 0) goto L2d
            char r0 = r3.charAt(r8)
            boolean r1 = java.lang.Character.isDigit(r0)
            r2 = 92
            int r2 = r2 / r7
            if (r1 == 0) goto L3c
            goto L39
        L2d:
            char r0 = r3.charAt(r8)
            boolean r1 = java.lang.Character.isDigit(r0)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L3c
        L39:
            r4.append(r0)
        L3c:
            int r8 = r8 + 1
            goto L12
        L3f:
            java.lang.CharSequence r3 = o.PageKey.onWarmupCompleted(r4)
            int r4 = viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.asBinder
            int r4 = r4 + 33
            int r5 = r4 % 128
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.IAuthTabCallbackStub = r5
            int r4 = r4 % r6
            if (r4 != 0) goto L51
            r4 = 77
            int r4 = r4 / r7
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.onExtraCallbackWithResult(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    private static final setMinimumWidth onWarmupCompleted(View view, setMinimumWidth setminimumwidth) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(setminimumwidth, "");
        setMinimumWidth setminimumwidthIAuthTabCallback = new setMinimumWidth.IAuthTabCallback(setminimumwidth).IAuthTabCallback(setminimumwidth.IAuthTabCallback() | 1).IAuthTabCallback();
        int i2 = IAuthTabCallbackStub + 81;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return setminimumwidthIAuthTabCallback;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int length2;
        int[] iArr3;
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = asInterface;
        char c = '0';
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr4 != null) {
            int i6 = $11 + 51;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            int i7 = 0;
            while (i7 < length2) {
                int i8 = $10 + 15;
                $11 = i8 % 128;
                if (i8 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr4[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0) + 1), 72 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8848 - View.combineMeasuredStates(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr4[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 71, View.resolveSize(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i2 = 2;
                c = '0';
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = asInterface;
        if (iArr6 != null) {
            int i9 = $10 + 41;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 87;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr4 = new Object[1];
                objArr4[i5] = Integer.valueOf(iArr6[i10]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", i5) + 72, 8849 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i10++;
                i4 = -1469660336;
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        int i13 = i5;
        System.arraycopy(iArr6, i13, iArr5, i13, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i14 = $11 + 57;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                int i18 = $11 + 1;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i16];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 39 - (Process.myTid() >> 22), View.getDefaultSize(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4033), 77 - TextUtils.lastIndexOf("", '0', 0), Color.rgb(0, 0, 0) + 16784614, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    private static final boolean onWarmupCompleted(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, View view, MotionEvent motionEvent) {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {M_.onExtraCallback, absLegacyAccountInputActivity.writeTypedList().IAuthTabCallbackDefault.getEditText()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            M_.onNavigationEvent(1483765845, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
            z = true;
        } else {
            Object[] objArr2 = {M_.onExtraCallback, absLegacyAccountInputActivity.writeTypedList().IAuthTabCallbackDefault.getEditText()};
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            M_.onNavigationEvent(1483765845, objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent3, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent4);
            z = false;
        }
        int i3 = asBinder + 89;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public View access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = writeTypedList().IAuthTabCallbackDefault.getEditText();
        int i4 = IAuthTabCallbackStub + 125;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return editText;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        absLegacyAccountInputActivity.onVerticalScrollEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 121;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, Integer num) {
        int i = 2 % 2;
        if (num != null) {
            int i2 = asBinder + 51;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (num.intValue() == 6) {
                Object[] objArr = {M_.onExtraCallback, absLegacyAccountInputActivity.writeTypedList().IAuthTabCallbackDefault.getEditText()};
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                M_.onNavigationEvent(1483765845, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
                absLegacyAccountInputActivity.onVerticalScrollEvent();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 7;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return unit;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        int i5 = asBinder + 117;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
      0x002d: PHI (r1v7 android.widget.EditText) = (r1v6 android.widget.EditText), (r1v18 android.widget.EditText) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void access200() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.asBinder
            int r1 = r1 + 99
            int r2 = r1 % 128
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L21
            o.CERT_Init r1 = r6.writeTypedList()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.IAuthTabCallbackDefault
            android.widget.EditText r1 = r1.getEditText()
            r3 = 68
            int r3 = r3 / 0
            if (r1 == 0) goto L5f
            goto L2d
        L21:
            o.CERT_Init r1 = r6.writeTypedList()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.IAuthTabCallbackDefault
            android.widget.EditText r1 = r1.getEditText()
            if (r1 == 0) goto L5f
        L2d:
            o.UnPressableLinearLayout r3 = com.jakewharton.rxbinding3.view.RxView.onExtraCallback(r1)
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda7 r4 = new viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda7
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda6 r5 = new viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda6
            r5.<init>(r6)
            r4.<init>(r5)
            o.deserializeUriNullableCollection r3 = r3.IAuthTabCallback(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            r6.onNavigationEvent(r3)
            r3 = 1
            r4 = 0
            o.getByteBuffer r1 = com.jakewharton.rxbinding3.widget.RxTextView.onExtraCallback(r1, r4, r3, r4)
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda9 r3 = new viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda9
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda8 r4 = new viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda8
            r4.<init>(r6)
            r3.<init>(r4)
            o.deserializeUriNullableCollection r1 = r1.IAuthTabCallback(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r6.onNavigationEvent(r1)
        L5f:
            o.enableAccessibilityOrder r1 = o.enableAccessibilityOrder.onExtraCallbackWithResult
            o.JsonReaderUnknownNumberParsing r1 = r1.IAuthTabCallback(r6)
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda11 r3 = new viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda11
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda10 r4 = new viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda10
            r4.<init>(r6)
            r3.<init>(r4)
            o.deserializeUriNullableCollection r1 = r1.IAuthTabCallback(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r6.onNavigationEvent(r1)
            int r1 = viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.asBinder
            int r1 = r1 + 93
            int r2 = r1 % 128
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.access200():void");
    }

    private static final Unit onExtraCallbackWithResult(AbsLegacyAccountInputActivity absLegacyAccountInputActivity, enableAccessibilityOrder.onExtraCallbackWithResult onextracallbackwithresult) {
        boolean z;
        EditText editText;
        int length;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        if (onextracallbackwithresult == enableAccessibilityOrder.onExtraCallbackWithResult.CLOSED) {
            int i5 = asBinder + 107;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        EditText editText2 = absLegacyAccountInputActivity.writeTypedList().IAuthTabCallbackDefault.getEditText();
        if (editText2 != null) {
            int i7 = IAuthTabCallbackStub + 11;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                length = editText2.length();
                int i8 = 22 / 0;
            } else {
                length = editText2.length();
            }
            i4 = length;
        }
        if (z && i4 > 0 && (editText = absLegacyAccountInputActivity.writeTypedList().IAuthTabCallbackDefault.getEditText()) != null) {
            int i9 = asBinder + 47;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            editText.clearFocus();
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallback implements TurboModuleInteropUtilsParsingException {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private static char[] onNavigationEvent = {64963, 64970, 64982, 64967};
        private static char onExtraCallback = 51243;

        public static /* synthetic */ Unit onExtraCallbackWithResult(Base64Encoder base64Encoder, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(base64Encoder, setDetectableSize);
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            return unitIAuthTabCallback;
        }

        onExtraCallback() {
        }

        public /* bridge */ void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onNavigationEvent();
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit IAuthTabCallback(Base64Encoder base64Encoder, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{1, 3, 2, 0}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 56), 4 - View.combineMeasuredStates(0, 0), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "banner");
            setDetectableSize.onExtraCallback("bank_name", base64Encoder.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public void onNavigationEvent(Base64Encoder base64Encoder) {
            Editable text;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(base64Encoder, "");
            EditText editText = AbsLegacyAccountInputActivity.this.writeTypedList().IAuthTabCallbackDefault.getEditText();
            if (editText != null) {
                int i4 = IAuthTabCallback + 45;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                text = editText.getText();
                int i6 = onWarmupCompleted + 115;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                text = null;
            }
            String strValueOf = String.valueOf(text);
            ConvertByteArrayToFloatArray.onExtraCallback(1262111L, false, (String) null, (Map) null, new AbsLegacyAccountInputActivity$initBankList$1$1$.ExternalSyntheticLambda0(base64Encoder), 14, (Object) null);
            AbsLegacyAccountInputActivity.this.onExtraCallback(String.valueOf(base64Encoder.IAuthTabCallback()), strValueOf);
            int i8 = onWarmupCompleted + 19;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 97 / 0;
            }
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            boolean z;
            long j;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onNavigationEvent;
            boolean z2 = false;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 31;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 23139 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i4 %= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 26 - KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            long j2 = 0;
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, 23139 - View.MeasureSpec.makeMeasureSpec(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i6 = $10 + 51;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    i2 = i + 7;
                    cArr4[i2] = (char) (cArr[i2] * b);
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
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        z = z2;
                        j = j2;
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - View.MeasureSpec.makeMeasureSpec(0, 0)), (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 73, ((Process.getThreadPriority(0) + 20) >> 6) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i7 = $11 + 59;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                z = false;
                                j = 0;
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19488 - ExpandableListView.getPackedPositionType(0L), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                z = false;
                                j = 0;
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                        } else {
                            z = false;
                            j = 0;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            } else {
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    z2 = z;
                    j2 = j;
                }
            }
            int i14 = $11 + 75;
            $10 = i14 % 128;
            int i15 = 2;
            int i16 = i14 % 2;
            int i17 = 0;
            while (i17 < i) {
                int i18 = $11;
                int i19 = i18 + 61;
                $10 = i19 % 128;
                int i20 = i19 % i15;
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                i17++;
                int i21 = i18 + 47;
                $10 = i21 % 128;
                i15 = 2;
                int i22 = i21 % 2;
            }
            objArr[0] = new String(cArr4);
        }
    }

    private final void validateRelationship() {
        int i = 2 % 2;
        BankListView engagementSignalsCallback = setEngagementSignalsCallback();
        BankListView.onWarmupCompleted(engagementSignalsCallback, false, (String) null, onNavigationEvent(), (Function1) null, 11, (Object) null);
        engagementSignalsCallback.setItemClickListener(new onExtraCallback());
        int i2 = IAuthTabCallbackStub + 41;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onVerticalScrollEvent() {
        /*
            r14 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.asBinder
            int r1 = r1 + 61
            int r2 = r1 % 128
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L22
            o.CERT_Init r1 = r14.writeTypedList()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.IAuthTabCallbackDefault
            android.widget.EditText r1 = r1.getEditText()
            if (r1 == 0) goto L1f
            r4 = r2
            r5 = r3
            goto L30
        L1f:
            r5 = r3
            r3 = r2
            goto L3a
        L22:
            o.CERT_Init r1 = r14.writeTypedList()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.IAuthTabCallbackDefault
            android.widget.EditText r1 = r1.getEditText()
            r5 = r2
            if (r1 == 0) goto L3a
            r4 = r3
        L30:
            boolean r1 = r1.hasFocus()
            if (r1 == r3) goto L38
            r3 = r4
            goto L3a
        L38:
            r2 = r4
            goto L4e
        L3a:
            o.CERT_Init r1 = r14.writeTypedList()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.IAuthTabCallbackDefault
            android.widget.EditText r1 = r1.getEditText()
            if (r1 == 0) goto L4e
            int r1 = r1.length()
            if (r1 == 0) goto L4d
            goto L4e
        L4d:
            r2 = r3
        L4e:
            viva.republica.toss.widget.BankListView r1 = r14.setEngagementSignalsCallback()
            r3 = r2 ^ 1
            if (r3 == 0) goto L57
            goto L65
        L57:
            int r3 = viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.IAuthTabCallbackStub
            int r3 = r3 + 11
            int r4 = r3 % 128
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.asBinder = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L64
            r5 = 3
            goto L65
        L64:
            r5 = 4
        L65:
            r1.setVisibility(r5)
            if (r2 != 0) goto L7b
            r6 = 1262109(0x13421d, double:6.235647E-318)
            r8 = 0
            r9 = 0
            r10 = 0
            viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda3 r11 = new viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity$$ExternalSyntheticLambda3
            r11.<init>()
            r12 = 14
            r13 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r6, r8, r9, r10, r11, r12, r13)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.accountchooser.AbsLegacyAccountInputActivity.onVerticalScrollEvent():void");
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new int[]{-2096381063, 1500540119}, 4 % Process.getGidForName(""), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new int[]{-2096381063, 1500540119}, 3 - Process.getGidForName(""), objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), "banner");
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, AbsLegacyAccountInputActivity absLegacyAccountInputActivity, SetDetectableSize setDetectableSize) {
        return (Unit) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{commonModule_setLeftEdgeTouchEnabled, absLegacyAccountInputActivity, setDetectableSize}, -1700938940, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1700938945, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    private final void ICustomTabsService_Parcel() {
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, 1880271758, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1880271755, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    private static final void asInterface(Function1 function1, Object obj) {
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, obj}, -1266919690, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1266919694, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    private static final void asBinder(Function1 function1, Object obj) {
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{function1, obj}, -1047438558, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1047438560, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, AbsLegacyAccountInputActivity absLegacyAccountInputActivity, SetDetectableSize setDetectableSize) {
        return (Unit) onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{commonModule_setLeftEdgeTouchEnabled, absLegacyAccountInputActivity, setDetectableSize}, -1413115440, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1413115440, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asBinder + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 119;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 119;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ICustomTabsServiceStubProxy() {
        asInterface = new int[]{250530616, 166177868, 1521867400, 1789930275, -1970733972, 1056085480, 1119724632, 280764392, 1127202308, 854088845, -2122278688, 1038383847, -1042014643, 905883055, 435781253, -1017221502, 722216947, 956438806};
    }
}
