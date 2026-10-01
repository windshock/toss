package viva.republica.toss.account.detail;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERConstructedSet;
import o.DERDump;
import o.NetConverter3;
import o.PageShowPoint;
import o.SessionTrackerb;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TimelineExternalSyntheticLambda0;
import o.TinyAppLifecyclePoint;
import o.deserializeUriNullableCollection;
import o.getPadBits;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.detail.UnconnectedBankAccountBridgeActivity$;
import viva.republica.toss.account.register.openbanking.ExternalAppExecutingDialog;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UnconnectedBankAccountBridgeActivity extends Hilt_UnconnectedBankAccountBridgeActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static long IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 0;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final int onTransact;
    private TabBarInfoQueryPointOnTabBarInfoQueryListener IAuthTabCallbackDefault;
    private String asBinder = _UrlKt.FRAGMENT_ENCODE_SET;

    @Inject
    public SessionTrackerb tossRouter;

    static {
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        onTransact = 8;
        int i = IAuthTabCallback_Parcel + 13;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(UnconnectedBankAccountBridgeActivity unconnectedBankAccountBridgeActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(unconnectedBankAccountBridgeActivity);
        int i4 = getInterfaceDescriptor + 89;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(ExternalAppExecutingDialog externalAppExecutingDialog, Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(externalAppExecutingDialog, function0);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asInterface + 17;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        int i3 = 15 / 0;
        return -1L;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb != null) {
            int i5 = i3 + 21;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                return sessionTrackerb;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        int i6 = asInterface + 49;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(UnconnectedBankAccountBridgeActivity unconnectedBankAccountBridgeActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        unconnectedBankAccountBridgeActivity.setEngagementSignalsCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 57;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.account.detail.Hilt_UnconnectedBankAccountBridgeActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        Object obj = null;
        String string = bundle != null ? bundle.getString("toss.intent.extra.ACCOUNT_ID") : null;
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        if (string == null) {
            int i2 = getInterfaceDescriptor + 95;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            string = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (string.length() == 0 && (string = getIntent().getStringExtra("toss.intent.extra.ACCOUNT_ID")) == null) {
            int i4 = getInterfaceDescriptor + 83;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            string = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (string.length() == 0) {
            int i6 = asInterface + 87;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 == 0) {
                getIntent().getStringExtra("accountId");
                obj.hashCode();
                throw null;
            }
            string = getIntent().getStringExtra("accountId");
            if (string == null) {
                string = _UrlKt.FRAGMENT_ENCODE_SET;
            }
        }
        String stringExtra = getIntent().getStringExtra("from");
        if (stringExtra == null) {
            int i7 = getInterfaceDescriptor + 39;
            asInterface = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str = stringExtra;
        }
        this.asBinder = str;
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = PageShowPoint.Companion.onWarmupCompleted(string);
        this.IAuthTabCallbackDefault = tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted;
        if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted == null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "UnconnectedBankAccountBridgeActivity", "invalid access - accountId is null", (Throwable) null, (Map) null, 12, (Object) null);
            finish();
            return;
        }
        if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null) {
            int i8 = getInterfaceDescriptor + 35;
            asInterface = i8 % 128;
            if (i8 % 2 == 0 ? TinyAppLifecyclePoint.onWarmupCompleted(tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted) : !TinyAppLifecyclePoint.onWarmupCompleted(tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted)) {
                onExtraCallback(new UnconnectedBankAccountBridgeActivity$.ExternalSyntheticLambda0(this));
                return;
            }
        }
        updateVisuals();
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackStub ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 79;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 53;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Color.argb(0, 0, 0, 0) + 84, 21233 - Gravity.getAbsoluteGravity(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - KeyEvent.getDeadChar(0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19, 8807 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private final void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = this.IAuthTabCallbackDefault;
        if (tabBarInfoQueryPointOnTabBarInfoQueryListener != null) {
            DERConstructedSet dERConstructedSet = DERConstructedSet.onNavigationEvent;
            String strAsInterface = tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface();
            String strOnExtraCallbackWithResult = tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult();
            String strOnPostMessage = tabBarInfoQueryPointOnTabBarInfoQueryListener.onPostMessage();
            String str = this.asBinder;
            DERConstructedSet.onExtraCallback(dERConstructedSet, this, strAsInterface, strOnExtraCallbackWithResult, strOnPostMessage, (getPadBits) null, str, 200, (String) null, (String) null, (String) null, false, str, false, (String) null, (Function0) null, 30608, (Object) null);
            int i3 = getInterfaceDescriptor + 93;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateVisuals() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = this.IAuthTabCallbackDefault;
        if (tabBarInfoQueryPointOnTabBarInfoQueryListener != null) {
            SessionTrackerb sessionTrackerbOnNavigationEvent = onNavigationEvent();
            String strAsInterface = tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface();
            String strBP_ = tabBarInfoQueryPointOnTabBarInfoQueryListener.bP_();
            String strOnExtraCallbackWithResult = tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult();
            String str = this.asBinder;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{52868, 52983, 17355, 51887, 46627, 8647, 49254, 8375, 6361, 34921, 2948, 38424, 25219, 57933, 23902, 44418, 19511, 15309, 42872, 17303, 38455, 3577, 35120, 6574, 57844, 26409, 53406, 12146, 52179, 47482, 15056, 50443, 5511, 37724, 3143, 40129, 32583, 58514, 22128, 45716, 18799, 16072, 47136, 18594, 37095, 4125, 33762, 7804, 64221, 27199}, 1 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strAsInterface);
            sb.append("&accountNumber=");
            sb.append(strBP_);
            sb.append("&accountId=");
            sb.append(strOnExtraCallbackWithResult);
            sb.append("&accountType=bank&referrer=");
            sb.append(str);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        finish();
        int i3 = getInterfaceDescriptor + 25;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        if (i == 200 && i2 == -1) {
            setResult(-1);
            if (intent != null) {
                int i4 = asInterface + 5;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                a(new char[]{58692, 58657, 30531, 11321, 33462, 51031, 1726, 58987, 13073, 48349, 60677, 20693, 18783, 54979, 48087, 27408, 26503, 3854, 16891, 34119}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 110, objArr);
                DERDump parcelableExtra = intent.getParcelableExtra(((String) objArr[0]).intern());
                if (parcelableExtra != null) {
                    int i6 = getInterfaceDescriptor + 59;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    if (parcelableExtra.onNavigationEvent() == 1200) {
                        int i8 = asInterface + 39;
                        getInterfaceDescriptor = i8 % 128;
                        int i9 = i8 % 2;
                        setEngagementSignalsCallback();
                    }
                }
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
        finish();
    }

    private static final void onNavigationEvent(ExternalAppExecutingDialog externalAppExecutingDialog, Function0 function0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            externalAppExecutingDialog.dismiss();
            Result.m31constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.Companion;
            function0.invoke();
            Result.m31constructorimpl(Unit.INSTANCE);
            int i4 = asInterface + 89;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(Function0<Unit> function0) {
        int i = 2 % 2;
        String string = getString(R.string.app_account_detail___aee40ad5d0);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ExternalAppExecutingDialog externalAppExecutingDialog = new ExternalAppExecutingDialog(this, string);
        externalAppExecutingDialog.setCanceledOnTouchOutside(false);
        externalAppExecutingDialog.setCancelable(false);
        externalAppExecutingDialog.show();
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = NetConverter3.onExtraCallback().onNavigationEvent(new UnconnectedBankAccountBridgeActivity$.ExternalSyntheticLambda1(externalAppExecutingDialog, function0), 3000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = asInterface + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 65;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return "account_register__bank_activation_bridge";
    }

    @Override // viva.republica.toss.account.detail.Hilt_UnconnectedBankAccountBridgeActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent(context, (Class<?>) UnconnectedBankAccountBridgeActivity.class);
            intent.putExtra("toss.intent.extra.ACCOUNT_ID", str);
            intent.putExtra("from", str2);
            return intent;
        }
    }

    @Override // viva.republica.toss.account.detail.Hilt_UnconnectedBankAccountBridgeActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = getInterfaceDescriptor + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.detail.Hilt_UnconnectedBankAccountBridgeActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 3;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.detail.Hilt_UnconnectedBankAccountBridgeActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = -1663071600821432703L;
    }
}
