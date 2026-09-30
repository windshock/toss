package o;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.appevents.IAuthTabCallbackStubProxy;
import com.facebook.appevents.asInterface;
import com.facebook.internal.ICustomTabsService;
import com.facebook.internal.extraCallback;
import com.facebook.internal.onMessageChannelReady;
import com.facebook.internal.writeTypedObject;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class requestDisallowInterceptTouchEvent {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static final IAuthTabCallbackStubProxy onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final requestDisallowInterceptTouchEvent onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        onWarmupCompleted = new requestDisallowInterceptTouchEvent();
        IAuthTabCallback = requestDisallowInterceptTouchEvent.class.getCanonicalName();
        onExtraCallback = new IAuthTabCallbackStubProxy(performIntercept.onExtraCallbackWithResult());
        int i2 = onNavigationEvent + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private requestDisallowInterceptTouchEvent() {
    }

    @JvmStatic
    public static final void onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 103;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Context contextOnExtraCallbackWithResult = performIntercept.onExtraCallbackWithResult();
            String strOnTransact = performIntercept.onTransact();
            boolean zAsBinder = performIntercept.asBinder();
            ICustomTabsService.onExtraCallbackWithResult(contextOnExtraCallbackWithResult, "context");
            if ((!zAsBinder) || !(contextOnExtraCallbackWithResult instanceof Application)) {
                return;
            }
            int i4 = IAuthTabCallbackStub + 35;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                asInterface.Companion.IAuthTabCallback((Application) contextOnExtraCallbackWithResult, strOnTransact);
                return;
            } else {
                asInterface.Companion.IAuthTabCallback((Application) contextOnExtraCallbackWithResult, strOnTransact);
                int i5 = 46 / 0;
                return;
            }
        }
        Context contextOnExtraCallbackWithResult2 = performIntercept.onExtraCallbackWithResult();
        performIntercept.onTransact();
        performIntercept.asBinder();
        ICustomTabsService.onExtraCallbackWithResult(contextOnExtraCallbackWithResult2, "context");
        throw null;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $10 + 99;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.lastIndexOf("", '0')), Gravity.getAbsoluteGravity(0, 0) + 84, 21233 - View.combineMeasuredStates(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - ImageFormat.getBitsPerPixel(0)), 19 - TextUtils.getTrimmedLength(""), KeyEvent.getDeadChar(0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 109;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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

    @JvmStatic
    public static final void onWarmupCompleted(@Nullable String str, long j) {
        Context contextOnExtraCallbackWithResult;
        extraCallback extracallbackOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = asInterface + 45;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            contextOnExtraCallbackWithResult = performIntercept.onExtraCallbackWithResult();
            String strOnTransact = performIntercept.onTransact();
            ICustomTabsService.onExtraCallbackWithResult(contextOnExtraCallbackWithResult, "context");
            Intrinsics.checkNotNullExpressionValue(strOnTransact, "");
            extracallbackOnExtraCallbackWithResult = onMessageChannelReady.onExtraCallbackWithResult(strOnTransact, true);
            if (extracallbackOnExtraCallbackWithResult == null) {
                return;
            }
        } else {
            contextOnExtraCallbackWithResult = performIntercept.onExtraCallbackWithResult();
            String strOnTransact2 = performIntercept.onTransact();
            ICustomTabsService.onExtraCallbackWithResult(contextOnExtraCallbackWithResult, "context");
            Intrinsics.checkNotNullExpressionValue(strOnTransact2, "");
            extracallbackOnExtraCallbackWithResult = onMessageChannelReady.onExtraCallbackWithResult(strOnTransact2, false);
            if (extracallbackOnExtraCallbackWithResult == null) {
                return;
            }
        }
        int i4 = IAuthTabCallbackStub + 123;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            extracallbackOnExtraCallbackWithResult.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (extracallbackOnExtraCallbackWithResult.onWarmupCompleted() && j > 0) {
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(contextOnExtraCallbackWithResult);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            iAuthTabCallbackStubProxy.onNavigationEvent("fb_aa_time_spent_on_view", j, bundle);
            int i5 = IAuthTabCallbackStub + 11;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull String str, @NotNull String str2, boolean z) {
        onExtraCallbackWithResult onExtraCallbackWithResult2;
        String str3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!onWarmupCompleted() || (onExtraCallbackWithResult2 = onWarmupCompleted.onExtraCallbackWithResult(str, str2)) == null) {
            return;
        }
        int i5 = IAuthTabCallbackStub + 103;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
            if (z) {
                if (writeTypedObject.onExtraCallback("app_events_if_auto_log_subs", performIntercept.onTransact(), false)) {
                    if (onNestedScroll.IAuthTabCallback(str2)) {
                        str3 = "StartTrial";
                    } else {
                        int i7 = IAuthTabCallbackStub + 73;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        str3 = "Subscribe";
                    }
                    onExtraCallback.onWarmupCompleted(str3, onExtraCallbackWithResult2.onNavigationEvent(), onExtraCallbackWithResult2.onWarmupCompleted(), onExtraCallbackWithResult2.onExtraCallbackWithResult());
                    return;
                }
            }
        } else if (z) {
        }
        onExtraCallback.onExtraCallback(onExtraCallbackWithResult2.onNavigationEvent(), onExtraCallbackWithResult2.onWarmupCompleted(), onExtraCallbackWithResult2.onExtraCallbackWithResult());
    }

    @JvmStatic
    public static final boolean onWarmupCompleted() {
        int i2 = 2 % 2;
        extraCallback extracallbackOnExtraCallbackWithResult = onMessageChannelReady.onExtraCallbackWithResult(performIntercept.onTransact());
        if (extracallbackOnExtraCallbackWithResult == null) {
            return false;
        }
        int i3 = IAuthTabCallbackStub + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (!performIntercept.asBinder() || !extracallbackOnExtraCallbackWithResult.onTransact()) {
            return false;
        }
        int i5 = IAuthTabCallbackStub + 103;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final onExtraCallbackWithResult onExtraCallbackWithResult(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        onExtraCallbackWithResult onExtraCallbackWithResult2 = onExtraCallbackWithResult(str, str2, new HashMap());
        int i3 = asInterface + 13;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
        }
        return onExtraCallbackWithResult2;
    }

    private final onExtraCallbackWithResult onExtraCallbackWithResult(String str, String str2, Map<String, String> map) throws Throwable {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            Object[] objArr = new Object[1];
            a(new char[]{18377, 18365, 34557, 51405, 19464, 53454, 25916, 36443, 32456}, Color.red(0) + 1, objArr);
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString(((String) objArr[0]).intern()));
            Object[] objArr2 = new Object[1];
            a(new char[]{9346, 9446, 60565, 41641, 7474, 33267, 51806, 8502, 7572, 9597, 52052, 60997, 22051, 25575, 4646}, 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString(((String) objArr2[0]).intern()));
            Object[] objArr3 = new Object[1];
            a(new char[]{44821, 44897, 44124, 57980, 31285, 59127, 38763, 31749}, -ExpandableListView.getPackedPositionChild(0L), objArr3);
            String strOptString = jSONObject2.optString(((String) objArr3[0]).intern());
            bundle.putCharSequence("fb_iap_product_type", strOptString);
            if (Intrinsics.areEqual(strOptString, "subs")) {
                int i3 = asInterface + 47;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String strOptString2 = jSONObject2.optString("introductoryPriceCycles");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                if (strOptString2.length() != 0) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", strOptString2);
                }
            }
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (!(!it.hasNext())) {
                int i5 = IAuthTabCallbackStub + 69;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                Map.Entry<String, String> next = it.next();
                bundle.putCharSequence(next.getKey(), next.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            Intrinsics.checkNotNullExpressionValue(currency, "");
            return new onExtraCallbackWithResult(bigDecimal, currency, bundle);
        } catch (JSONException unused) {
            return null;
        }
    }

    static final class onExtraCallbackWithResult {
        private Bundle onExtraCallbackWithResult;
        private Currency onNavigationEvent;
        private BigDecimal onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull BigDecimal bigDecimal, @NotNull Currency currency, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(currency, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            this.onWarmupCompleted = bigDecimal;
            this.onNavigationEvent = currency;
            this.onExtraCallbackWithResult = bundle;
        }

        public final Bundle onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public final BigDecimal onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public final Currency onWarmupCompleted() {
            return this.onNavigationEvent;
        }
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 6947532991913801045L;
    }
}
