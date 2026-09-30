package im.toss.features.bank.widget.currency;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import im.toss.features.bank.widget.currency.BankCurrencyWidgetConfig;
import im.toss.features.bank.widget.currency.BankCurrencyWidgetSettingActivity$;
import im.toss.features.bank.widget.currency.BankCurrencyWidgetWorker;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.isUserHaveDeniedPermissionNever;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class BankCurrencyWidgetSettingActivity extends Hilt_BankCurrencyWidgetSettingActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackStub = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new BankCurrencyWidgetSettingActivity$.ExternalSyntheticLambda1(this));

    @Inject
    public SessionTrackerb tossRouter;

    public static /* synthetic */ Unit onExtraCallbackWithResult(BankCurrencyWidgetSettingActivity bankCurrencyWidgetSettingActivity, int i, Throwable th) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(bankCurrencyWidgetSettingActivity, i, th);
        int i5 = IAuthTabCallbackDefault + 103;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = i8 | i4;
        int i10 = (~(i7 | i8)) | (~(i7 | i4)) | (~i9);
        int i11 = ~i4;
        int i12 = (~(i2 | i11 | i6)) | (~(i7 | i11 | i8)) | (~(i9 | i6));
        int i13 = ~(i8 | i11 | i6);
        int i14 = i4 + i6 + i3 + ((-973178360) * i5) + (1542423572 * i);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i4) - 1073741824) + ((-187520530) * i6) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i3) + (1207959552 * i5) + ((-1275068416) * i) + (196542464 * i15);
        int i17 = (i4 * (-490823948)) + 944362368 + (i6 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i3 * (-490822951)) + (i5 * 2145288392) + (i * 779328756) + (i15 * (-1138819072));
        return i16 + ((i17 * i17) * 1440284672) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(BankCurrencyWidgetSettingActivity bankCurrencyWidgetSettingActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(bankCurrencyWidgetSettingActivity, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallbackDefault + 11;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public abstract BankCurrencyWidgetConfig.Type IAuthTabCallback();

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 57;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public abstract String onNavigationEvent();

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BankCurrencyWidgetSettingActivity bankCurrencyWidgetSettingActivity = (BankCurrencyWidgetSettingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        bankCurrencyWidgetSettingActivity.ICustomTabsServiceDefault();
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public final SessionTrackerb setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 5;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackerb;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(BankCurrencyWidgetSettingActivity bankCurrencyWidgetSettingActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Bundle extras = bankCurrencyWidgetSettingActivity.getIntent().getExtras();
        int i4 = extras != null ? extras.getInt("appWidgetId") : 0;
        if (i4 != 0) {
            if (((Boolean) onNavigationEvent(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -64923405, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 64923406, new Object[]{bankCurrencyWidgetSettingActivity, Integer.valueOf(i4)})).booleanValue()) {
                int i5 = IAuthTabCallbackDefault + 89;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    bankCurrencyWidgetSettingActivity.onWarmupCompleted(i4);
                    return;
                }
                bankCurrencyWidgetSettingActivity.onWarmupCompleted(i4);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        bankCurrencyWidgetSettingActivity.setResult(0);
        bankCurrencyWidgetSettingActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.features.bank.widget.currency.Hilt_BankCurrencyWidgetSettingActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        SessionTrackerb.onNavigationEvent(setEngagementSignalsCallback(), this, "banktoss://fx/widget?type=" + IAuthTabCallback().name() + "&showBridge=true&bridgeType=bank", this.IAuthTabCallbackStub, (Bundle) null, 8, (Object) null);
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onExtraCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ BankCurrencyWidgetSettingActivity onExtraCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, BankCurrencyWidgetSettingActivity bankCurrencyWidgetSettingActivity) {
            super(onwarmupcompleted);
            this.onExtraCallback = bankCurrencyWidgetSettingActivity;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.onExtraCallback};
            BankCurrencyWidgetSettingActivity.onNavigationEvent(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -83751625, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 83751625, objArr);
            int i4 = IAuthTabCallback + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BankCurrencyWidgetSettingActivity bankCurrencyWidgetSettingActivity = (BankCurrencyWidgetSettingActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        isUserHaveDeniedPermissionNever isuserhavedeniedpermissionnever = isUserHaveDeniedPermissionNever.IAuthTabCallback;
        String strOnWarmupCompleted = isuserhavedeniedpermissionnever.onWarmupCompleted();
        if (strOnWarmupCompleted.length() != 0) {
            String strOnExtraCallback = isuserhavedeniedpermissionnever.onNavigationEvent(bankCurrencyWidgetSettingActivity.IAuthTabCallback(), iIntValue).onExtraCallback();
            Object[] objArr2 = {isuserhavedeniedpermissionnever, Integer.valueOf(iIntValue), strOnWarmupCompleted};
            isUserHaveDeniedPermissionNever.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1745647678, 1745647678, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (!Intrinsics.areEqual(strOnWarmupCompleted, strOnExtraCallback)) {
                isuserhavedeniedpermissionnever.onNavigationEvent(iIntValue);
            }
            return true;
        }
        int i4 = asBinder + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), new onExtraCallback(CoroutineExceptionHandler.extraCallbackWithResult, this), (setRandomHost) null, new onExtraCallbackWithResult(this, i, (access13800) null), 2, (Object) null).onExtraCallback(new BankCurrencyWidgetSettingActivity$.ExternalSyntheticLambda0(this, i));
        int i3 = asBinder + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 53 / 0;
        }
    }

    private static final Unit onNavigationEvent(BankCurrencyWidgetSettingActivity bankCurrencyWidgetSettingActivity, int i, Throwable th) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 57;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if (th != null) {
            int i6 = i4 + 13;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            bankCurrencyWidgetSettingActivity.onExtraCallbackWithResult(i);
        }
        Unit unit = Unit.INSTANCE;
        int i8 = asBinder + 117;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setResult(-1);
        finish();
        int i4 = IAuthTabCallbackDefault + 99;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 77;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        BankCurrencyWidgetWorker.onExtraCallback onextracallback = BankCurrencyWidgetWorker.Companion;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        onextracallback.onExtraCallback(applicationContext, onNavigationEvent(), i, true);
        int i5 = asBinder + 107;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(BankCurrencyWidgetSettingActivity bankCurrencyWidgetSettingActivity) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -83751625, iIAuthTabCallback3, 83751625, new Object[]{bankCurrencyWidgetSettingActivity});
    }

    private final boolean onExtraCallback(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        return ((Boolean) onNavigationEvent(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -64923405, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 64923406, objArr)).booleanValue();
    }

    @Override // im.toss.features.bank.widget.currency.Hilt_BankCurrencyWidgetSettingActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.features.bank.widget.currency.Hilt_BankCurrencyWidgetSettingActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.features.bank.widget.currency.Hilt_BankCurrencyWidgetSettingActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.features.bank.widget.currency.Hilt_BankCurrencyWidgetSettingActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
