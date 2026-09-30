package o;

import android.content.Context;
import android.content.res.Resources;
import im.toss.features.edoc.register.AptPasswordActivity$;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.getPurposeConsentStatus;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getPurposeConsentStatus implements getTcfVendorConsentStatus {
    private static Locale IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static setDone onExtraCallback;
    private static AppLovinPostbackListener onExtraCallbackWithResult;
    public static final getPurposeConsentStatus onWarmupCompleted = new getPurposeConsentStatus();
    private final /* synthetic */ contentType onNavigationEvent = contentType.onExtraCallback;

    public static /* synthetic */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zWriteTypedObject = writeTypedObject();
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return zWriteTypedObject;
    }

    public static /* synthetic */ okhttp3.OkHttpClient onWarmupCompleted(AppLovinPostbackListener appLovinPostbackListener) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        okhttp3.OkHttpClient okHttpClientIAuthTabCallback = IAuthTabCallback(appLovinPostbackListener);
        int i4 = asBinder + 105;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return okHttpClientIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // o.CacheCacheResponseBody
    public Resources IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        contentType contenttype = this.onNavigationEvent;
        if (i3 == 0) {
            return contenttype.IAuthTabCallbackDefault();
        }
        contenttype.IAuthTabCallbackDefault();
        throw null;
    }

    @Override // o.CacheCacheResponseBody
    public Context IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        contentType contenttype = this.onNavigationEvent;
        if (i3 == 0) {
            return contenttype.IAuthTabCallbackStubProxy();
        }
        contenttype.IAuthTabCallbackStubProxy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.CacheCacheResponseBody
    public Resources IAuthTabCallback_Parcel() {
        Resources resourcesIAuthTabCallback_Parcel;
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            resourcesIAuthTabCallback_Parcel = this.onNavigationEvent.IAuthTabCallback_Parcel();
            int i3 = 60 / 0;
        } else {
            resourcesIAuthTabCallback_Parcel = this.onNavigationEvent.IAuthTabCallback_Parcel();
        }
        int i4 = asInterface + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return resourcesIAuthTabCallback_Parcel;
    }

    @Override // o.CacheCacheResponseBody
    public Context onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Context contextOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
        int i4 = asInterface + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return contextOnWarmupCompleted;
    }

    private getPurposeConsentStatus() {
    }

    @Override // o.getTcfVendorConsentStatus
    public /* bridge */ float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = super.IAuthTabCallback();
        int i4 = asBinder + 15;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    @Override // o.getTcfVendorConsentStatus
    public /* bridge */ maxAge onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        maxAge maxageOnExtraCallback = super.onExtraCallback();
        int i4 = asInterface + 61;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return maxageOnExtraCallback;
        }
        throw null;
    }

    @Override // o.getTcfVendorConsentStatus
    public /* bridge */ void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onNavigationEvent(f);
        int i4 = asBinder + 3;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getTcfVendorConsentStatus
    public /* bridge */ void onWarmupCompleted(@NotNull maxAge maxage) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(maxage);
        int i4 = asBinder + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        Locale locale = Locale.KOREA;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        IAuthTabCallback = locale;
        onExtraCallback = setDone.Companion.onNavigationEvent();
        int i = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public Locale IAuthTabCallbackStub() {
        Locale locale;
        int i = 2 % 2;
        int i2 = asBinder + 105;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            locale = IAuthTabCallback;
            int i4 = 64 / 0;
        } else {
            locale = IAuthTabCallback;
        }
        int i5 = i3 + 43;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return locale;
    }

    public void onNavigationEvent(@NotNull Locale locale) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(locale, "");
        IAuthTabCallback = locale;
        int i4 = asBinder + 97;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
    }

    public setDone access000() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 5;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setDone setdone = onExtraCallback;
        int i4 = i2 + 115;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return setdone;
    }

    public deprecated_maxAgeSeconds access100() {
        deprecated_maxAgeSeconds deprecated_maxagesecondsAsInterface;
        int i = 2 % 2;
        AppLovinPostbackListener appLovinPostbackListener = onExtraCallbackWithResult;
        if (appLovinPostbackListener == null || (deprecated_maxagesecondsAsInterface = appLovinPostbackListener.asInterface()) == null) {
            deprecated_maxAgeSeconds deprecated_maxagesecondsOnExtraCallbackWithResult = deprecated_maxAgeSeconds.Companion.onExtraCallbackWithResult();
            int i2 = asInterface + 7;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return deprecated_maxagesecondsOnExtraCallbackWithResult;
        }
        int i4 = asBinder + 121;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return deprecated_maxagesecondsAsInterface;
    }

    public accessinit asBinder() {
        accessinit accessinitVarOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asInterface + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AppLovinPostbackListener appLovinPostbackListener = onExtraCallbackWithResult;
        if (appLovinPostbackListener != null && (accessinitVarOnWarmupCompleted = appLovinPostbackListener.onWarmupCompleted()) != null) {
            return accessinitVarOnWarmupCompleted;
        }
        route routeVar = route.onExtraCallback;
        int i4 = asInterface + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return routeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 != null) goto L11;
     */
    @Override // o.getTcfVendorConsentStatus
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public clampToInt onExtraCallbackWithResult() {
        clampToInt clamptoint;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 79;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        AppLovinPostbackListener appLovinPostbackListener = onExtraCallbackWithResult;
        if (appLovinPostbackListener != null) {
            int i5 = i2 + 5;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                clamptoint = (clampToInt) AppLovinPostbackListener.onNavigationEvent(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, -70712096, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), new Object[]{appLovinPostbackListener}, 70712097);
                int i6 = 67 / 0;
            } else {
                int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                clamptoint = (clampToInt) AppLovinPostbackListener.onNavigationEvent(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted4, iOnWarmupCompleted3, -70712096, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), new Object[]{appLovinPostbackListener}, 70712097);
            }
        }
        return clampToInt.Companion.onExtraCallback();
    }

    public isUserConsentSet getInterfaceDescriptor() {
        isUserConsentSet isuserconsentsetIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = asBinder + 75;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppLovinPostbackListener appLovinPostbackListener = onExtraCallbackWithResult;
        if (appLovinPostbackListener == null || (isuserconsentsetIAuthTabCallbackDefault = appLovinPostbackListener.IAuthTabCallbackDefault()) == null) {
            return isUserConsentSet.Companion.IAuthTabCallback();
        }
        int i3 = asBinder + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return isuserconsentsetIAuthTabCallbackDefault;
    }

    public isDoNotSellSet onTransact() {
        int i = 2 % 2;
        AppLovinPostbackListener appLovinPostbackListener = onExtraCallbackWithResult;
        if (appLovinPostbackListener != null) {
            int i2 = asInterface + 3;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            isDoNotSellSet isdonotsellset = (isDoNotSellSet) AppLovinPostbackListener.onNavigationEvent(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, 1657773374, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), new Object[]{appLovinPostbackListener}, -1657773374);
            if (isdonotsellset != null) {
                int i4 = asInterface + 99;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 41 / 0;
                }
                return isdonotsellset;
            }
        }
        isDoNotSellSet isdonotsellsetOnExtraCallbackWithResult = isDoNotSellSet.Companion.onExtraCallbackWithResult();
        int i6 = asInterface + 57;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return isdonotsellsetOnExtraCallbackWithResult;
        }
        throw null;
    }

    public getPins asInterface() {
        getPins getpinsOnTransact;
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AppLovinPostbackListener appLovinPostbackListener = onExtraCallbackWithResult;
        if (appLovinPostbackListener == null || (getpinsOnTransact = appLovinPostbackListener.onTransact()) == null) {
            return getPins.Companion.onWarmupCompleted();
        }
        int i4 = asInterface + 39;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return getpinsOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(appLovinPostbackListener, "");
            if (onExtraCallbackWithResult == null) {
                AppLovinPostbackListener appLovinPostbackListenerOnNavigationEvent = onNavigationEvent(appLovinPostbackListener);
                contentType.onExtraCallback.onExtraCallbackWithResult(appLovinPostbackListenerOnNavigationEvent.onExtraCallback());
                onNavigationEvent(appLovinPostbackListenerOnNavigationEvent.IAuthTabCallbackStub());
                deprecated_maxAgeSeconds deprecated_maxagesecondsAsInterface = appLovinPostbackListenerOnNavigationEvent.asInterface();
                if (deprecated_maxagesecondsAsInterface != null) {
                    onExtraCallback = new setDone(deprecated_maxagesecondsAsInterface, null, null, 6, null);
                    onExtraCallbackWithResult = appLovinPostbackListenerOnNavigationEvent;
                    sha256Hash.onNavigationEvent.onExtraCallbackWithResult(appLovinPostbackListenerOnNavigationEvent);
                    getCacheokhttp.onWarmupCompleted.onExtraCallback(appLovinPostbackListenerOnNavigationEvent);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
    }

    private static final okhttp3.OkHttpClient IAuthTabCallback(AppLovinPostbackListener appLovinPostbackListener) {
        okhttp3.OkHttpClient okHttpClientBuild;
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient.Builder builderIAuthTabCallback = appLovinPostbackListener.onTransact().IAuthTabCallback();
        if (i3 != 0) {
            okHttpClientBuild = builderIAuthTabCallback.build();
            int i4 = 73 / 0;
        } else {
            okHttpClientBuild = builderIAuthTabCallback.build();
        }
        int i5 = asBinder + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return okHttpClientBuild;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r7 == r19.asInterface()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r7 == r19.asInterface()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r2 = o.getPurposeConsentStatus.asInterface + 125;
        o.getPurposeConsentStatus.asBinder = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        return r19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AppLovinPostbackListener onNavigationEvent(final AppLovinPostbackListener appLovinPostbackListener) {
        int i = 2 % 2;
        Context applicationContext = appLovinPostbackListener.onExtraCallback().getApplicationContext();
        if (applicationContext == null) {
            int i2 = asInterface + 53;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            applicationContext = appLovinPostbackListener.onExtraCallback();
            int i4 = asBinder + 41;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        Context context = applicationContext;
        deprecated_maxAgeSeconds deprecated_maxagesecondsAsInterface = appLovinPostbackListener.asInterface();
        if (deprecated_maxagesecondsAsInterface == null) {
            deprecated_maxagesecondsAsInterface = new writeCertList(new CacheControl() { // from class: im.toss.tds.foundation.TdsFoundationImpl$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // o.CacheControl
                public final boolean check() {
                    int i6 = 2 % 2;
                    int i7 = onWarmupCompleted + 73;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        getPurposeConsentStatus.onNavigationEvent();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    boolean zOnNavigationEvent = getPurposeConsentStatus.onNavigationEvent();
                    int i8 = onExtraCallbackWithResult + 93;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 62 / 0;
                    }
                    return zOnNavigationEvent;
                }
            }, null, new Function0() { // from class: im.toss.tds.foundation.TdsFoundationImpl$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 45;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    OkHttpClient okHttpClientOnWarmupCompleted = getPurposeConsentStatus.onWarmupCompleted(appLovinPostbackListener);
                    int i9 = onWarmupCompleted + 73;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 20 / 0;
                    }
                    return okHttpClientOnWarmupCompleted;
                }
            }, 2, null);
        }
        deprecated_maxAgeSeconds deprecated_maxageseconds = deprecated_maxagesecondsAsInterface;
        if (context == appLovinPostbackListener.onExtraCallback()) {
            int i6 = asBinder + 21;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 66 / 0;
            }
        }
        Locale localeIAuthTabCallbackStub = appLovinPostbackListener.IAuthTabCallbackStub();
        accessinit accessinitVarOnWarmupCompleted = appLovinPostbackListener.onWarmupCompleted();
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        clampToInt clamptoint = (clampToInt) AppLovinPostbackListener.onNavigationEvent(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, -70712096, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), new Object[]{appLovinPostbackListener}, 70712097);
        isUserConsentSet isuserconsentsetIAuthTabCallbackDefault = appLovinPostbackListener.IAuthTabCallbackDefault();
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return new AppLovinPostbackListener(context, localeIAuthTabCallbackStub, deprecated_maxageseconds, accessinitVarOnWarmupCompleted, clamptoint, isuserconsentsetIAuthTabCallbackDefault, (isDoNotSellSet) AppLovinPostbackListener.onNavigationEvent(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted4, iOnWarmupCompleted3, 1657773374, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), new Object[]{appLovinPostbackListener}, -1657773374), appLovinPostbackListener.onTransact(), appLovinPostbackListener.IAuthTabCallback(), appLovinPostbackListener.asBinder());
    }

    public void onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            contentType.onExtraCallback.onWarmupCompleted(context);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            contentType.onExtraCallback.onWarmupCompleted(context);
            throw null;
        }
    }
}
