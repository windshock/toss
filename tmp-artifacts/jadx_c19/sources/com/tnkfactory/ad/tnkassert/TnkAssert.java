package com.tnkfactory.ad.tnkassert;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tnkfactory.ad.AppResource;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.TnkSession;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.PubInfo;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.SessionInfo;
import com.tnkfactory.ad.rwd.data.constants.Constants;
import com.tnkfactory.ad.tnkassert.TnkAssert$;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAssert {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String APP_PREFIX = "tnk_rwd_client_t1_";
    private static int[] IAuthTabCallback = null;
    public static final TnkAssert INSTANCE;
    public static String a = "----WebKitFormBoundarynuXSuFo6d9f2xtbb";
    public static final OfferwallTabClick b;
    public static OfferwallDetailShow c = null;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final void eventItemClick(@NotNull String str, @NotNull String str2, int i2, int i3) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        runOnBackgroundAndIgnoreException(new TnkAssert$.ExternalSyntheticLambda4(str, i2, str2, i3));
        int i5 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAppId() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String applicationId = TnkCore.INSTANCE.getSessionInfo().getApplicationId();
        if (applicationId != null) {
            return applicationId;
        }
        int i5 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    public final String getBoundary() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return a;
        }
        throw null;
    }

    public final OfferwallDetailShow getLastClickItem() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        OfferwallDetailShow offerwallDetailShow = c;
        if (i4 == 0) {
            int i5 = 31 / 0;
        }
        return offerwallDetailShow;
    }

    public final Context getMContext() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        AppResource appResource = TnkCore.INSTANCE.getAppResource();
        if (i4 == 0) {
            return appResource.getApplicationContext();
        }
        appResource.getApplicationContext();
        throw null;
    }

    public final OfferwallTabClick getMOfferwallTabClick() {
        OfferwallTabClick offerwallTabClick;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            offerwallTabClick = b;
            int i5 = 35 / 0;
        } else {
            offerwallTabClick = b;
        }
        int i6 = i3 + 21;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return offerwallTabClick;
    }

    public final String getMdUserNm() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        TnkCore tnkCore = TnkCore.INSTANCE;
        String mediaUserName = tnkCore.getSessionInfo().getMediaUserName();
        if (mediaUserName != null) {
            return mediaUserName;
        }
        String adid = tnkCore.getSessionInfo().getAdid();
        if (adid == null) {
            int i5 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            adid = "";
        }
        int i7 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return adid;
    }

    public final void offerwallDetailClick(@NotNull final AdListVo adListVo) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(adListVo, "");
        runOnBackgroundAndIgnoreException(new Function0() { // from class: com.tnkfactory.ad.tnkassert.TnkAssert$$ExternalSyntheticLambda2
            public final Object invoke() {
                return TnkAssert.a(adListVo);
            }
        });
        int i3 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void offerwallDetailShow(@NotNull final String str, @NotNull final String str2, final int i2, @NotNull final String str3, final int i3, final int i4) {
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        runOnBackgroundAndIgnoreException(new Function0() { // from class: com.tnkfactory.ad.tnkassert.TnkAssert$$ExternalSyntheticLambda0
            public final Object invoke() {
                return TnkAssert.a(str, str2, i2, str3, i3, i4);
            }
        });
        int i6 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void offerwallError(@NotNull final TnkError tnkError) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tnkError, "");
        runOnBackgroundAndIgnoreException(new Function0() { // from class: com.tnkfactory.ad.tnkassert.TnkAssert$$ExternalSyntheticLambda3
            public final Object invoke() {
                return TnkAssert.a(tnkError);
            }
        });
        int i3 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void offerwallSuccess() {
        int i2 = 2 % 2;
        runOnBackgroundAndIgnoreException(new Function0() { // from class: com.tnkfactory.ad.tnkassert.TnkAssert$$ExternalSyntheticLambda1
            public final Object invoke() {
                return TnkAssert.a();
            }
        });
        int i3 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void offerwallTabClick() {
        int i2 = 2 % 2;
        runOnBackgroundAndIgnoreException(new Function0() { // from class: com.tnkfactory.ad.tnkassert.TnkAssert$$ExternalSyntheticLambda5
            public final Object invoke() {
                return TnkAssert.b();
            }
        });
        int i3 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void offerwallViewClose(final long j) {
        int i2 = 2 % 2;
        runOnBackgroundAndIgnoreException(new Function0() { // from class: com.tnkfactory.ad.tnkassert.TnkAssert$$ExternalSyntheticLambda6
            public final Object invoke() {
                return TnkAssert.a(j);
            }
        });
        int i3 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void runOnBackgroundAndIgnoreException(@NotNull final Function0<Unit> function0) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        TnkSession.INSTANCE.runOnIoThread(new Runnable() { // from class: com.tnkfactory.ad.tnkassert.TnkAssert$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                TnkAssert.a(function0);
            }
        });
        int i3 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void setBoundary(@NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            a = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        a = str;
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    public final void setLastClickItem(@Nullable OfferwallDetailShow offerwallDetailShow) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        c = offerwallDetailShow;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 103;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void sponsorshipClickBig(@NotNull final String str, @NotNull final String str2, final int i2, final int i3, boolean z) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        runOnBackgroundAndIgnoreException(new Function0() { // from class: com.tnkfactory.ad.tnkassert.TnkAssert$$ExternalSyntheticLambda8
            public final Object invoke() {
                return TnkAssert.a(str, str2, i3, i2);
            }
        });
        int i5 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final Unit b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            TnkAssert tnkAssert = INSTANCE;
            OfferwallTabClick offerwallTabClick = b;
            tnkAssert.postData(offerwallTabClick.getDocName(), offerwallTabClick);
            return Unit.INSTANCE;
        }
        TnkAssert tnkAssert2 = INSTANCE;
        OfferwallTabClick offerwallTabClick2 = b;
        tnkAssert2.postData(offerwallTabClick2.getDocName(), offerwallTabClick2);
        int i4 = 31 / 0;
        return Unit.INSTANCE;
    }

    static {
        IAuthTabCallback();
        TnkAssert tnkAssert = new TnkAssert();
        INSTANCE = tnkAssert;
        String mdUserNm = tnkAssert.getMdUserNm();
        String applicationId = TnkCore.INSTANCE.getSessionInfo().getApplicationId();
        if (applicationId == null) {
            int i2 = onExtraCallback + 59;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            applicationId = "";
        }
        String str = applicationId;
        HashMap map = new HashMap();
        map.put(0, 0);
        Unit unit = Unit.INSTANCE;
        HashMap map2 = new HashMap();
        map2.put(0, 0);
        b = new OfferwallTabClick(mdUserNm, str, map, map2, 0, 0, 0, 0, 0, 0);
        int i7 = onNavigationEvent + 113;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final void a(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        try {
            function0.invoke();
            int i5 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception unused) {
        }
    }

    public final void postData(@NotNull String str, @NotNull AssertData assertData) throws Throwable {
        int i2 = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(assertData, "");
        AdiscopeReport adiscopeReport = new AdiscopeReport(null, new AdiscopeHeader(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null), 1, null);
        adiscopeReport.getBody().setClientTime(System.currentTimeMillis());
        AdiscopeBoday body = adiscopeReport.getBody();
        String applicationId = TnkCore.INSTANCE.getSessionInfo().getApplicationId();
        if (applicationId == null) {
            int i3 = onExtraCallbackWithResult + 81;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 107;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str2 = applicationId;
        }
        body.setMediaId(str2);
        adiscopeReport.getBody().getDatas().add(assertData);
        adiscopeReport.postData();
    }

    public static final Unit a() throws Throwable {
        int i2 = 2 % 2;
        PubInfo pubInfo = TnkCore.INSTANCE.getOffRepository().getPubInfo();
        TnkAssert tnkAssert = INSTANCE;
        OfferwallView offerwallView = new OfferwallView(tnkAssert.getAppId(), tnkAssert.getMdUserNm(), 1, 0, "", pubInfo.getHdr_msg(), pubInfo.getEimg_url());
        tnkAssert.postData(offerwallView.getDocName(), offerwallView);
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Unit a(TnkError tnkError) throws Throwable {
        int i2 = 2 % 2;
        TnkAssert tnkAssert = INSTANCE;
        OfferwallView offerwallView = new OfferwallView(tnkAssert.getAppId(), tnkAssert.getMdUserNm(), 0, tnkError.getCode(), tnkError.getMessage(), "", "");
        tnkAssert.postData(offerwallView.getDocName(), offerwallView);
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
        }
        return unit;
    }

    public static final Unit a(String str, int i2, String str2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int refererTab = b.getRefererTab();
        TnkAssert tnkAssert = INSTANCE;
        TAssertEventClick tAssertEventClick = new TAssertEventClick(tnkAssert.getAppId(), tnkAssert.getMdUserNm(), str, String.valueOf(refererTab), i2, str2, i3, 0);
        tnkAssert.postData(tAssertEventClick.getDocName(), tAssertEventClick);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048 A[PHI: r7
      0x0048: PHI (r7v7 android.content.pm.ApplicationInfo) = (r7v6 android.content.pm.ApplicationInfo), (r7v10 android.content.pm.ApplicationInfo) binds: [B:29:0x0046, B:26:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AdiscopeHeader makeHeader(@Nullable Context context, @Nullable SessionInfo sessionInfo) throws Throwable {
        Integer numValueOf;
        String str;
        Integer numValueOf2;
        Integer numValueOf3;
        String str2;
        String str3;
        String widevineIdL1;
        PackageManager packageManager;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        String osVersionCode;
        ApplicationInfo applicationInfo;
        String deviceCountryCode;
        String deviceLanguage;
        String installMarket;
        int i2 = 2 % 2;
        String str4 = (sessionInfo == null || (installMarket = sessionInfo.getInstallMarket()) == null) ? "" : installMarket;
        String str5 = (sessionInfo == null || (deviceLanguage = sessionInfo.getDeviceLanguage()) == null) ? "" : deviceLanguage;
        String str6 = (sessionInfo == null || (deviceCountryCode = sessionInfo.getDeviceCountryCode()) == null) ? "" : deviceCountryCode;
        String widevineIdL3 = null;
        if (context != null) {
            int i3 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                applicationInfo = context.getApplicationInfo();
                int i4 = 19 / 0;
                numValueOf = applicationInfo != null ? Integer.valueOf(applicationInfo.targetSdkVersion) : null;
            } else {
                applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                }
            }
        }
        String strValueOf = String.valueOf(numValueOf);
        String str7 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str7, "");
        String str8 = (sessionInfo == null || (osVersionCode = sessionInfo.getOsVersionCode()) == null) ? "" : osVersionCode;
        if (context != null) {
            int i5 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                context.getPackageName();
                widevineIdL3.hashCode();
                throw null;
            }
            String packageName = context.getPackageName();
            str = packageName == null ? "" : packageName;
        }
        if (context != null) {
            int i6 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            ApplicationInfo applicationInfo2 = context.getApplicationInfo();
            if (applicationInfo2 != null) {
                int i8 = onWarmupCompleted + 27;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    numValueOf2 = Integer.valueOf(applicationInfo2.targetSdkVersion);
                    int i9 = 3 / 0;
                } else {
                    numValueOf2 = Integer.valueOf(applicationInfo2.targetSdkVersion);
                }
            } else {
                numValueOf2 = null;
            }
        }
        String strValueOf2 = String.valueOf(numValueOf2);
        if (context != null) {
            int i10 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            PackageManager packageManager2 = context.getPackageManager();
            numValueOf3 = (packageManager2 == null || (packageInfo2 = packageManager2.getPackageInfo(context.getPackageName(), 0)) == null) ? null : Integer.valueOf(packageInfo2.versionCode);
        }
        String strValueOf3 = String.valueOf(numValueOf3);
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            str2 = "";
        } else {
            int i12 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0 ? (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) != null : (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 1)) != null) {
                String str9 = packageInfo.versionName;
                if (str9 != null) {
                    str2 = str9;
                }
            }
        }
        if (sessionInfo == null || (widevineIdL1 = sessionInfo.getWidevineIdL1()) == null) {
            if (sessionInfo != null) {
                widevineIdL3 = sessionInfo.getWidevineIdL3();
                int i13 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
            }
            if (widevineIdL3 == null) {
                int i15 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 99 / 0;
                }
                str3 = "";
            } else {
                str3 = widevineIdL3;
            }
        } else {
            str3 = widevineIdL1;
        }
        Object[] objArr = new Object[1];
        d(new int[]{-354938728, -494645256}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        d(new int[]{-354938728, -494645256}, AndroidCharacter.getMirror('0') - '/', objArr2);
        return new AdiscopeHeader(str4, str5, str6, strValueOf, str7, "android", str8, str, Constants.VERSION_NUMBER, strValueOf2, strIntern, ((String) objArr2[0]).intern(), strValueOf3, str2, str3);
    }

    public final SSLContext getCertContext() throws NoSuchAlgorithmException, KeyManagementException {
        int i2 = 2 % 2;
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.tnkfactory.ad.tnkassert.TnkAssert$getCertContext$trustAllCerts$1
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        Intrinsics.checkNotNull(sSLContext);
        int i3 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return sSLContext;
    }

    public static final Unit a(String str, String str2, int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        TnkAssert tnkAssert = INSTANCE;
        SponsorshipClickBig sponsorshipClickBig = new SponsorshipClickBig(tnkAssert.getMdUserNm(), tnkAssert.getAppId(), str, "", str2, String.valueOf(i2), i3);
        tnkAssert.postData(sponsorshipClickBig.getDocName(), sponsorshipClickBig);
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final Unit a(String str, String str2, int i2, String str3, int i3, int i4) throws Throwable {
        int i5 = 2 % 2;
        TnkAssert tnkAssert = INSTANCE;
        OfferwallDetailShow offerwallDetailShow = new OfferwallDetailShow(tnkAssert.getMdUserNm(), tnkAssert.getAppId(), str, str2, i2, str3, i3, i4);
        c = offerwallDetailShow;
        tnkAssert.postData(offerwallDetailShow.getDocName(), offerwallDetailShow);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit a(AdListVo adListVo) throws Throwable {
        String unitId;
        String str;
        OfferwallDetailAction offerwallDetailAction;
        String str2;
        int i2 = 2 % 2;
        OfferwallDetailShow offerwallDetailShow = c;
        if (offerwallDetailShow == null || (unitId = offerwallDetailShow.getUnitId()) == null) {
            int i3 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            unitId = "";
        }
        Object obj = null;
        if (Intrinsics.areEqual(unitId, String.valueOf(adListVo.getAppId()))) {
            String mdUserNm = INSTANCE.getMdUserNm();
            String applicationId = TnkCore.INSTANCE.getSessionInfo().getApplicationId();
            if (applicationId == null) {
                int i5 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                str2 = "";
            } else {
                str2 = applicationId;
            }
            long appId = adListVo.getAppId();
            int refererTab = b.getRefererTab();
            String title = adListVo.getTitle();
            int adType = adListVo.getAdType();
            OfferwallDetailShow offerwallDetailShow2 = c;
            int rank = offerwallDetailShow2 != null ? offerwallDetailShow2.getRank() : 0;
            OfferwallDetailShow offerwallDetailShow3 = c;
            if (offerwallDetailShow3 != null) {
                int i7 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    offerwallDetailShow3.getArea();
                    obj.hashCode();
                    throw null;
                }
                String area = offerwallDetailShow3.getArea();
                String str3 = area == null ? "" : area;
                offerwallDetailAction = new OfferwallDetailAction(mdUserNm, str2, appId, refererTab, title, String.valueOf(adType), rank, str3, adListVo.getCampaignType());
            }
        } else {
            String mdUserNm2 = INSTANCE.getMdUserNm();
            String applicationId2 = TnkCore.INSTANCE.getSessionInfo().getApplicationId();
            if (applicationId2 == null) {
                int i8 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                str = "";
            } else {
                str = applicationId2;
            }
            offerwallDetailAction = new OfferwallDetailAction(mdUserNm2, str, adListVo.getAppId(), b.getRefererTab(), adListVo.getTitle(), String.valueOf(adListVo.getAdType()), 0, "", adListVo.getCampaignType());
        }
        INSTANCE.postData(offerwallDetailAction.getDocName(), offerwallDetailAction);
        return Unit.INSTANCE;
    }

    public static final Unit a(long j) throws Throwable {
        int i2 = 2 % 2;
        TnkAssert tnkAssert = INSTANCE;
        OfferwallViewClose offerwallViewClose = new OfferwallViewClose(tnkAssert.getMdUserNm(), j, tnkAssert.getAppId());
        tnkAssert.postData(offerwallViewClose.getDocName(), offerwallViewClose);
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void d(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Process.getGidForName("") + 73, Color.argb(0, 0, 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
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
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int i8 = $10 + 119;
            $11 = i8 % 128;
            int i9 = 2;
            int i10 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 79;
                $10 = i12 % 128;
                if (i12 % i9 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 72 - TextUtils.indexOf("", "", i6), KeyEvent.keyCodeFromString("") + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i11 %= 0;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 72, ExpandableListView.getPackedPositionGroup(0L) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i11++;
                }
                i6 = 0;
                i9 = 2;
            }
            i3 = i6;
            iArr5 = iArr6;
        } else {
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i3;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $10 + 89;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i15 = 0; i15 < 16; i15++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getEdgeSlop() >> 16)), KeyEvent.normalizeMetaState(0) + 39, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
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
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 4034), Process.getGidForName("") + 79, 7398 - View.combineMeasuredStates(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new int[]{-1760341785, 92244612, -1656283141, 1033129929, 816754984, -919212711, 1443113430, -2114252420, 747363393, -636025372, -1768144223, -558404433, -2031466418, -1396521453, 357335364, -1993124766, -748562298, -1786481380};
    }
}
