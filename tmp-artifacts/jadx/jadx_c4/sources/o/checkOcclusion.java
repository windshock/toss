package o;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.Lazy;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.checkOcclusion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkOcclusion implements r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onTransact;
    private boolean IAuthTabCallback;
    private final getBillingPeriod IAuthTabCallbackStub;
    private volatile boolean onExtraCallback;
    private final Lazy<FirebaseAnalytics> onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final installModel onWarmupCompleted;

    static {
        int i = IAuthTabCallbackDefault + 59;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(checkOcclusion checkocclusion) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(checkocclusion);
        int i4 = asBinder + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        checkOcclusion checkocclusion = (checkOcclusion) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(checkocclusion, str, bundle);
        int i4 = asBinder + 53;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, Activity activity, checkOcclusion checkocclusion) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, activity, checkocclusion);
        int i4 = asBinder + 77;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(checkOcclusion checkocclusion, String str, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(checkocclusion, str, bundle);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = asBinder + 55;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i2);
        int i11 = ~i2;
        int i12 = (~(i7 | i4)) | (~(i8 | i11)) | (~(i8 | i6));
        int i13 = ~(i11 | i9);
        int i14 = i6 + i4 + i + (1938118820 * i3) + ((-1869228383) * i5);
        int i15 = i14 * i14;
        int i16 = (i6 * (-1046486968)) + 2037645312 + ((-1046486968) * i4) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i) + ((-1907359744) * i3) + (1374945280 * i5) + (1516044288 * i15);
        int i17 = ((i6 * 647972376) - 1941852458) + (i4 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i * 647973227) + (i3 * (-1260466036)) + (i5 * 1557372491) + (i15 * 1239351296);
        int i18 = i16 + (i17 * i17 * 490405888);
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(checkOcclusion checkocclusion) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(checkocclusion);
        }
        onExtraCallback(checkocclusion);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public checkOcclusion(@NotNull getBillingPeriod getbillingperiod, @NotNull Lazy<FirebaseAnalytics> lazy) {
        boolean z;
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        this.IAuthTabCallbackStub = getbillingperiod;
        this.onExtraCallbackWithResult = lazy;
        if (getbillingperiod.onExtraCallbackWithResult() == getPricingPhaseList.EU) {
            int i = asInterface + 107;
            asBinder = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            z = true;
        } else {
            int i4 = 2 % 2;
            z = false;
        }
        this.onWarmupCompleted = new installModel(200, z);
        int i5 = asInterface + 71;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult() {
        Object obj;
        Object obj2;
        synchronized (this) {
            if (this.onExtraCallback) {
                return;
            }
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(this.onExtraCallbackWithResult.get());
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FirebaseMarketingChannel", "FirebaseAnalytics initialization failed", th2, (Map) null, 8, (Object) null);
            }
            if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
                this.onWarmupCompleted.onWarmupCompleted();
                return;
            }
            Intrinsics.checkNotNullExpressionValue(obj, "");
            FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) obj;
            this.onNavigationEvent = true;
            try {
                Result.Companion companion3 = kotlin.Result.Companion;
                onExtraCallback(firebaseAnalytics);
                FirebaseAnalytics.ConsentType consentType = FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE;
                FirebaseAnalytics.ConsentStatus consentStatus = FirebaseAnalytics.ConsentStatus.GRANTED;
                firebaseAnalytics.setConsent(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(consentType, consentStatus), getWrite.IAuthTabCallback(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus), getWrite.IAuthTabCallback(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus), getWrite.IAuthTabCallback(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus)}));
                firebaseAnalytics.setAnalyticsCollectionEnabled(true);
                obj2 = kotlin.Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion4 = kotlin.Result.Companion;
                obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th3));
            }
            Throwable th4 = kotlin.Result.exceptionOrNull-impl(obj2);
            if (th4 != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FirebaseMarketingChannel", "grantConsent failed", th4, (Map) null, 8, (Object) null);
            }
            if (kotlin.Result.onNavigationEvent(obj2)) {
                this.onExtraCallback = true;
                checkFaceMinSize.onWarmupCompleted.onExtraCallback();
                this.onWarmupCompleted.IAuthTabCallback();
            } else {
                checkFaceMinSize.onWarmupCompleted.onNavigationEvent();
                this.onWarmupCompleted.onWarmupCompleted();
                onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 18393923, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -18393922, new Object[]{this, firebaseAnalytics});
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        checkOcclusion checkocclusion = (checkOcclusion) objArr[0];
        synchronized (checkocclusion) {
            checkFaceMinSize.onWarmupCompleted.onNavigationEvent();
            checkocclusion.onWarmupCompleted.onWarmupCompleted();
            checkocclusion.onExtraCallback = false;
            if (checkocclusion.onNavigationEvent) {
                FirebaseAnalytics firebaseAnalytics = checkocclusion.onExtraCallbackWithResult.get();
                Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "");
                int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
                onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 18393923, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -18393922, new Object[]{checkocclusion, firebaseAnalytics});
            }
        }
        return null;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted.onWarmupCompleted(new Function0() { // from class: im.toss.core.tracker.marketing.impl.firebase.FirebaseMarketingChannel$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 23;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                checkOcclusion checkocclusion = this.f$0;
                if (i4 == 0) {
                    return checkOcclusion.IAuthTabCallback(checkocclusion);
                }
                checkOcclusion.IAuthTabCallback(checkocclusion);
                throw null;
            }
        });
        int i2 = asBinder + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(checkOcclusion checkocclusion) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        FirebaseAnalytics firebaseAnalytics = checkocclusion.onExtraCallbackWithResult.get();
        String upperCase = checkocclusion.IAuthTabCallbackStub.onExtraCallbackWithResult().getCode().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        firebaseAnalytics.setUserProperty("toss_service_region", upperCase);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 117;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void IAuthTabCallback() {
        int i = 2 % 2;
        this.onWarmupCompleted.onWarmupCompleted(new Function0() { // from class: im.toss.core.tracker.marketing.impl.firebase.FirebaseMarketingChannel$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = checkOcclusion.onWarmupCompleted(this.f$0);
                int i5 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        });
        int i2 = asInterface + 119;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(checkOcclusion checkocclusion) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        checkocclusion.onExtraCallbackWithResult.get().setUserProperty("userGA", (String) null);
        checkocclusion.onExtraCallbackWithResult.get().setUserProperty("gaNo", (String) null);
        checkocclusion.onExtraCallbackWithResult.get().setUserProperty("toss_service_region", (String) null);
        checkocclusion.onExtraCallbackWithResult.get().setUserId((String) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(FirebaseAnalytics firebaseAnalytics) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (!this.IAuthTabCallback) {
            firebaseAnalytics.setUserProperty("userGA", (String) null);
            firebaseAnalytics.setUserProperty("gaNo", (String) null);
            firebaseAnalytics.setUserId((String) null);
            this.IAuthTabCallback = true;
            int i5 = asInterface + 55;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = i3 + 39;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void onExtraCallback(@NotNull final String str, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        final Bundle bundleOnExtraCallbackWithResult = zzbf.onExtraCallbackWithResult(map, (Bundle) null, 1, (Object) null);
        this.onWarmupCompleted.onWarmupCompleted(new Function0() { // from class: im.toss.core.tracker.marketing.impl.firebase.FirebaseMarketingChannel$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 35;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0, str, bundleOnExtraCallbackWithResult};
                Unit unit = (Unit) checkOcclusion.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 315373849, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -315373847, objArr);
                int i5 = onWarmupCompleted + 41;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        });
        int i2 = asBinder + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(checkOcclusion checkocclusion, String str, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        checkocclusion.onExtraCallback(str, bundle);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 3;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void IAuthTabCallback(@NotNull final String str, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("logType", "screen");
        this.onWarmupCompleted.onWarmupCompleted(new Function0() { // from class: im.toss.core.tracker.marketing.impl.firebase.FirebaseMarketingChannel$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() throws Throwable {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 49;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnNavigationEvent = checkOcclusion.onNavigationEvent(this.f$0, str, bundle);
                int i7 = onExtraCallbackWithResult + 19;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i4 = asBinder + 121;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(checkOcclusion checkocclusion, String str, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        checkocclusion.onExtraCallback(str, bundle);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 67;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void onExtraCallback(@Nullable final Activity activity, @NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted.onExtraCallback(new Function0() { // from class: im.toss.core.tracker.marketing.impl.firebase.FirebaseMarketingChannel$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                if (i4 != 0) {
                    return checkOcclusion.onNavigationEvent(str2, activity, this);
                }
                checkOcclusion.onNavigationEvent(str2, activity, this);
                throw null;
            }
        });
        int i2 = asInterface + 21;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(String str, Activity activity, checkOcclusion checkocclusion) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("FirebaseMarketingChannel", e);
        }
        if (TextUtils.isEmpty(str)) {
            int i4 = asBinder + 79;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }
        if (activity != null) {
            checkocclusion.onExtraCallbackWithResult.get().setCurrentScreen(activity, str, (String) null);
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(String str, Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Objects.toString(bundle);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.onExtraCallbackWithResult.get().logEvent(str, bundle);
            int i2 = asBinder + 119;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("FirebaseMarketingChannel", e);
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        Object obj;
        Unit unit;
        Object obj2;
        FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) objArr[1];
        int i = 2 % 2;
        int i2 = 0;
        Throwable th = null;
        while (true) {
            if (i2 >= 3) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FirebaseMarketingChannel", "disable analytics collection failed", th, (Map) null, 8, (Object) null);
                break;
            }
            int i3 = asInterface + 91;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    firebaseAnalytics.setAnalyticsCollectionEnabled(false);
                    unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
                }
            } else {
                Result.Companion companion3 = kotlin.Result.Companion;
                firebaseAnalytics.setAnalyticsCollectionEnabled(false);
                unit = Unit.INSTANCE;
            }
            obj2 = kotlin.Result.constructor-impl(unit);
            if (kotlin.Result.onNavigationEvent(obj2)) {
                break;
            }
            th = kotlin.Result.exceptionOrNull-impl(obj2);
            i2++;
        }
        int i4 = 0;
        Throwable th3 = null;
        while (true) {
            if (i4 >= 3) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FirebaseMarketingChannel", "deny analytics consent failed", th3, (Map) null, 8, (Object) null);
                break;
            }
            int i5 = asBinder + 7;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            try {
                Result.Companion companion4 = kotlin.Result.Companion;
                FirebaseAnalytics.ConsentType consentType = FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE;
                FirebaseAnalytics.ConsentStatus consentStatus = FirebaseAnalytics.ConsentStatus.DENIED;
                firebaseAnalytics.setConsent(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(consentType, consentStatus), getWrite.IAuthTabCallback(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus), getWrite.IAuthTabCallback(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus), getWrite.IAuthTabCallback(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus)}));
                obj = kotlin.Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion5 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th4));
            }
            if (kotlin.Result.onNavigationEvent(obj)) {
                break;
            }
            th3 = kotlin.Result.exceptionOrNull-impl(obj);
            i4++;
        }
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(checkOcclusion checkocclusion, String str, Bundle bundle) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Unit) onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 315373849, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -315373847, new Object[]{checkocclusion, str, bundle});
    }

    private final void onExtraCallbackWithResult(FirebaseAnalytics firebaseAnalytics) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 18393923, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -18393922, new Object[]{this, firebaseAnalytics});
    }

    public final void onNavigationEvent() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -498720122, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 498720122, new Object[]{this});
    }
}
