package o;

import android.app.Activity;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.parseDate;
import o.requestLatestUpdateDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class parseDate implements r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private static final boolean onWarmupCompleted = false;
    private final getBillingPeriod IAuthTabCallback;
    private volatile Map<String, ? extends Object> onExtraCallbackWithResult;
    private final requestLatestUpdateDate onNavigationEvent;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[requestLatestUpdateDate.IAuthTabCallback.values().length];
            try {
                iArr[requestLatestUpdateDate.IAuthTabCallback.QUEUED.ordinal()] = 1;
                int i = onNavigationEvent + 109;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[requestLatestUpdateDate.IAuthTabCallback.SENT.ordinal()] = 2;
                int i3 = IAuthTabCallback + 89;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[requestLatestUpdateDate.IAuthTabCallback.DROPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[getPricingPhaseList.values().length];
            try {
                iArr2[getPricingPhaseList.KR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr2;
        }
    }

    static {
        int i = asInterface + 23;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i)) | (~(i7 | i4)) | (~(i | i4));
        int i9 = (~(i5 | i4)) | i;
        int i10 = (~(i4 | i5 | i)) | (~(i7 | (~i) | (~i4)));
        int i11 = i5 + i + i2 + (862446602 * i6) + (395103901 * i3);
        int i12 = i11 * i11;
        int i13 = (((-1892237052) * i5) - 438566912) + ((-683246085) * i) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i2) + ((-128450560) * i6) + ((-674496512) * i3) + ((-1108934656) * i12);
        int i14 = (i5 * 1384179468) + 550727958 + (i * 1384180977) + (i8 * 503) + (i9 * (-1006)) + (i10 * 503) + (i2 * 1384179971) + (i6 * 1640285726) + (i3 * 120803543) + (i12 * 2025127936);
        int i15 = i13 + (i14 * i14 * (-275709952));
        if (i15 != 1) {
            return i15 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        int i16 = 2 % 2;
        int i17 = onExtraCallback + 119;
        onTransact = i17 % 128;
        int i18 = i17 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i19 = onTransact + 67;
        onExtraCallback = i19 % 128;
        int i20 = i19 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallback(parseDate parsedate, String str, Map map) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(parsedate, str, map);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(parseDate parsedate, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(parsedate, str);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = onExtraCallback + 73;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    @Inject
    public parseDate(@NotNull getBillingPeriod getbillingperiod) {
        boolean z;
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        this.IAuthTabCallback = getbillingperiod;
        this.onExtraCallbackWithResult = access8100.onNavigationEvent();
        if (getbillingperiod.onExtraCallbackWithResult() == getPricingPhaseList.EU) {
            int i = onExtraCallback + 25;
            onTransact = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
            z = true;
        } else {
            int i3 = 2 % 2;
            z = false;
        }
        this.onNavigationEvent = new requestLatestUpdateDate(z);
        int i4 = onTransact + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(parseDate parsedate, String str, Map map) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        IAuthTabCallback(-1401662062, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1401662062, new Object[]{parsedate, str, map}, iOnExtraCallbackWithResult3);
        int i4 = onExtraCallback + 11;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = onWarmupCompleted;
        int i5 = i3 + 47;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public /* bridge */ void onExtraCallback(@Nullable Activity activity, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallback(activity, str);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
    }

    private static final Unit onNavigationEvent(parseDate parsedate, String str, Map map) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        parsedate.IAuthTabCallbackStub();
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        IAuthTabCallback(-1401662062, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1401662062, new Object[]{parsedate, str, map}, iOnExtraCallbackWithResult3);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void onExtraCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (onWarmupCompleted) {
            Objects.toString(map);
            int i4 = onExtraCallback + 105;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallback.onExtraCallbackWithResult[this.onNavigationEvent.onWarmupCompleted(str, map, new Function2() { // from class: im.toss.core.tracker.marketing.impl.appsflyer.AppsFlyerMarketingChannel$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 3;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnExtraCallback = parseDate.onExtraCallback(this.f$0, (String) obj, (Map) obj2);
                int i10 = onExtraCallback + 61;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                return unitOnExtraCallback;
            }
        }).ordinal()];
        if (i6 == 1) {
            onWarmupCompleted(str, map);
            return;
        }
        int i7 = onTransact + 91;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            if (i6 == 5) {
                return;
            }
        } else if (i6 == 2) {
            return;
        }
        if (i6 != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void IAuthTabCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        onExtraCallback(str, map);
        int i4 = onExtraCallback + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(parseDate parsedate, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        parsedate.onNavigationEvent(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 93;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void onExtraCallbackWithResult(@NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.tracker.marketing.impl.appsflyer.AppsFlyerMarketingChannel$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = parseDate.onExtraCallbackWithResult(this.f$0, str);
                int i5 = IAuthTabCallback + 45;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        int i2 = onExtraCallback + 103;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
    }

    private static final Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            AppsFlyerLib.getInstance().setCustomerUserId((String) null);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        AppsFlyerLib.getInstance().setCustomerUserId((String) null);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void IAuthTabCallback() {
        int i = 2 % 2;
        this.onNavigationEvent.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.tracker.marketing.impl.appsflyer.AppsFlyerMarketingChannel$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
                Unit unit = (Unit) parseDate.IAuthTabCallback(563027941, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -563027940, new Object[0], iOnExtraCallbackWithResult3);
                int i5 = IAuthTabCallback + 109;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onExtraCallback + 49;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        onExtraCallback(Object obj) {
            super(0, obj, parseDate.class, "syncCustomerUserId", "syncCustomerUserId()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                ((parseDate) ((CallableReference) this).receiver).IAuthTabCallbackStub();
                int i3 = 18 / 0;
            } else {
                ((parseDate) ((CallableReference) this).receiver).IAuthTabCallbackStub();
            }
            int i4 = IAuthTabCallback + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void asBinder() {
        int i = 2 % 2;
        this.onNavigationEvent.onExtraCallback(new onExtraCallback(this), new onNavigationEvent(this));
        int i2 = onTransact + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function2<String, Map<String, ? extends Object>, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onNavigationEvent(Object obj) {
            super(2, obj, parseDate.class, "sendEvent", "sendEvent(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((String) obj, (Map) obj2);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback(String str, Map<String, ? extends Object> map) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                parseDate.IAuthTabCallback((parseDate) ((CallableReference) this).receiver, str, map);
                int i3 = 69 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                parseDate.IAuthTabCallback((parseDate) ((CallableReference) this).receiver, str, map);
            }
            int i4 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
            }
        }
    }

    public final void asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onExtraCallback();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        IAuthTabCallbackStub();
        getPricingPhaseList getpricingphaselistOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String upperCase = getpricingphaselistOnExtraCallbackWithResult.getCode().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        appsFlyerLib.setAdditionalData(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("toss_service_region", upperCase), getWrite.IAuthTabCallback("gaNo", PlayerErrorCode.onActivityLayout())}));
        IAuthTabCallback(context);
        int i4 = onExtraCallback + 97;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(PlayerErrorCode.onActivityLayout());
        if (i3 == 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(@NotNull Context context) throws Throwable {
        Object obj;
        String id;
        Boolean boolValueOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(AdvertisingIdClient.getAdvertisingIdInfo(context));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AppsFlyerMarketingChannel", "Failed to get Advertising ID", th2, (Map) null, 8, (Object) null);
        }
        Boolean bool = null;
        if (!(!kotlin.Result.onExtraCallback(obj))) {
            obj = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("appsflyer_id", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
        if (info != null) {
            id = info.getId();
            int i2 = onTransact + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = onTransact + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            id = null;
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("adid", id);
        if (info != null) {
            int i6 = onTransact + 97;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                boolValueOf = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                int i7 = 77 / 0;
            } else {
                boolValueOf = Boolean.valueOf(info.isLimitAdTrackingEnabled());
            }
            bool = boolValueOf;
        }
        this.onExtraCallbackWithResult = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("aie", bool)});
    }

    public final String onExtraCallbackWithResult() {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            obj = this.onExtraCallbackWithResult.get("adid");
            int i3 = 84 / 0;
            if (!(obj instanceof String)) {
                return null;
            }
        } else {
            obj = this.onExtraCallbackWithResult.get("adid");
            if (!(obj instanceof String)) {
                return null;
            }
        }
        String str = (String) obj;
        int i4 = onTransact + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
        if (appsFlyerUID != null) {
            return appsFlyerUID;
        }
        int i4 = onTransact + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private final void onWarmupCompleted(String str, Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_name", str);
        linkedHashMap.putAll(map);
        Unit unit = Unit.INSTANCE;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "AppsflyerPendingEvent", (String) null, (Map) linkedHashMap, (String) null, false, (String) null, 58, (Object) null);
        int i2 = onTransact + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (str.length() > 0) {
            int i4 = onExtraCallback + 13;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            Object[] objArr = {this, str};
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = JsParamKeys.onExtraCallbackWithResult();
            if (i5 != 0) {
                appsFlyerLib.setCustomerUserId((String) IAuthTabCallback(835780987, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, -835780985, objArr, iOnExtraCallbackWithResult3));
                return;
            }
            appsFlyerLib.setCustomerUserId((String) IAuthTabCallback(835780987, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, -835780985, objArr, iOnExtraCallbackWithResult3));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements AppsFlyerRequestListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Map<String, Object> onExtraCallbackWithResult;
        final /* synthetic */ String onWarmupCompleted;

        onExtraCallbackWithResult(String str, Map<String, Object> map) {
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = map;
        }

        public void onSuccess() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                parseDate.onExtraCallback();
                throw null;
            }
            if (parseDate.onExtraCallback()) {
                Objects.toString(this.onExtraCallbackWithResult);
                int i3 = IAuthTabCallback + 13;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        public void onError(int i, String str) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AppsFlyerMarketingChannel", "Failed to send logEvent", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("eventName", this.onWarmupCompleted), getWrite.IAuthTabCallback("errorCode", Integer.valueOf(i)), getWrite.IAuthTabCallback("errorDesc", str)}), 4, (Object) null);
            int i5 = IAuthTabCallback + 15;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        parseDate parsedate = (parseDate) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted((Map) objArr[2]);
        mapOnWarmupCompleted.putAll(parsedate.onExtraCallbackWithResult);
        AppsFlyerLib.getInstance().logEvent(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), str, mapOnWarmupCompleted, new onExtraCallbackWithResult(str, mapOnWarmupCompleted));
        new BestShot(str, mapOnWarmupCompleted).onWarmupCompleted(true);
        int i2 = onTransact + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        parseDate parsedate = (parseDate) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getPricingPhaseList getpricingphaselistOnExtraCallbackWithResult = parsedate.IAuthTabCallback.onExtraCallbackWithResult();
        if (IAuthTabCallback.onExtraCallback[getpricingphaselistOnExtraCallbackWithResult.ordinal()] == 1) {
            int i4 = onTransact + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String upperCase = getpricingphaselistOnExtraCallbackWithResult.getCode().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        String str2 = upperCase + "_" + str;
        int i5 = onExtraCallback + 67;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(563027941, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -563027940, new Object[0], iOnExtraCallbackWithResult3);
    }

    private final String onExtraCallback(String str) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(835780987, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -835780985, new Object[]{this, str}, iOnExtraCallbackWithResult3);
    }

    private final void onExtraCallbackWithResult(String str, Map<String, ? extends Object> map) {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        IAuthTabCallback(-1401662062, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1401662062, new Object[]{this, str, map}, iOnExtraCallbackWithResult3);
    }
}
