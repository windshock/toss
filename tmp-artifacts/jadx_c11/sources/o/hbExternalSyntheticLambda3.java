package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.rn.toss.core.remoteprocess.RnSchemeAndroidOnlyQueryParamsKt;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda3 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static char[] onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onTransact;
    private static final String onWarmupCompleted;

    public static /* synthetic */ hbExternalSyntheticLambda5 onWarmupCompleted(hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, Bundle bundle, boolean z, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = asInterface + 87;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            bundle = null;
        }
        if ((i & 2) != 0) {
            int i5 = onTransact + 33;
            asInterface = i5 % 128;
            z = i5 % 2 == 0;
        }
        hbExternalSyntheticLambda5 hbexternalsyntheticlambda5OnExtraCallback = onExtraCallback(hcexternalsyntheticlambda0, bundle, z);
        int i6 = asInterface + 123;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 22 / 0;
        }
        return hbexternalsyntheticlambda5OnExtraCallback;
    }

    public static final hbExternalSyntheticLambda5 onExtraCallback(@NotNull hcExternalSyntheticLambda0 hcexternalsyntheticlambda0, @Nullable Bundle bundle, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(hcexternalsyntheticlambda0, "");
            onWarmupCompleted(hcexternalsyntheticlambda0.onNavigationEvent(), bundle, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(hcexternalsyntheticlambda0, "");
        hbExternalSyntheticLambda5 hbexternalsyntheticlambda5OnWarmupCompleted = onWarmupCompleted(hcexternalsyntheticlambda0.onNavigationEvent(), bundle, z);
        int i3 = onTransact + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return hbexternalsyntheticlambda5OnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hbExternalSyntheticLambda5 onWarmupCompleted(@NotNull String str, @Nullable Bundle bundle, boolean z) throws Throwable {
        boolean z2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onRewardedAdDisplayed onrewardedaddisplayedIAuthTabCallback = IAuthTabCallback(str);
        if (onrewardedaddisplayedIAuthTabCallback == null) {
            int i2 = onTransact + 117;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        bundle2.putString("bundlePath", onrewardedaddisplayedIAuthTabCallback.onWarmupCompleted());
        bundle2.putString("__originScheme", onrewardedaddisplayedIAuthTabCallback.onExtraCallback());
        if (z) {
            int i3 = asInterface + 25;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z2 = Intrinsics.areEqual(onrewardedaddisplayedIAuthTabCallback.onWarmupCompleted(), "beta");
        }
        bundle2.putBoolean("isBetaWebViewDebuggable", z2);
        bundle2.putString("_company", onrewardedaddisplayedIAuthTabCallback.IAuthTabCallback());
        return new hbExternalSyntheticLambda5(onrewardedaddisplayedIAuthTabCallback.onExtraCallback(), onrewardedaddisplayedIAuthTabCallback.onNavigationEvent(), bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final onRewardedAdDisplayed IAuthTabCallback(String str) throws Throwable {
        Object obj;
        onRewardedAdDisplayed onrewardedaddisplayed;
        String str2;
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asInterface = i2 % 128;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 == 0) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(Uri.parse(str));
            obj2.hashCode();
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        obj = Result.constructor-impl(Uri.parse(str));
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Uri uri = (Uri) obj;
        if (uri == null) {
            return null;
        }
        Uri uriOnExtraCallback = RnSchemeAndroidOnlyQueryParamsKt.onExtraCallback(uri);
        List<String> pathSegments = uriOnExtraCallback.getPathSegments();
        String host = uriOnExtraCallback.getHost();
        Object[] objArr = new Object[1];
        a(new char[]{7, '\b', '\f', 14}, (byte) (11 - View.MeasureSpec.makeMeasureSpec(0, 0)), (-16777212) - Color.rgb(0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{7, '\b', '\f', 14}, (byte) (10 - Process.getGidForName("")), 3 - ImageFormat.getBitsPerPixel(0), objArr2);
        if (Intrinsics.areEqual(host, ((String) objArr2[0]).intern())) {
            Intrinsics.checkNotNull(pathSegments);
            if (Intrinsics.areEqual(CollectionsKt.firstOrNull(pathSegments), "m")) {
                String string = uriOnExtraCallback.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                Object[] objArr3 = new Object[1];
                a(new char[]{'\r', 15, 1, 14, 3, 7, '\b', 15, '\r', '\b', 13826, 13826, 7, '\b', '\f', 14, '\n', 14}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 76), ((Process.getThreadPriority(0) + 20) >> 6) + 18, objArr3);
                String strOnExtraCallback = onExtraCallback(uriOnExtraCallback, ((String) objArr3[0]).intern());
                String str3 = (String) CollectionsKt.getOrNull(pathSegments, 1);
                if (str3 != null) {
                    int i3 = asInterface + 7;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    str3 = "";
                }
                Object[] objArr4 = new Object[1];
                a(new char[]{7, '\b', '\f', 14}, (byte) (11 - TextUtils.indexOf("", "")), TextUtils.getTrimmedLength("") + 4, objArr4);
                onrewardedaddisplayed = new onRewardedAdDisplayed(string, strOnExtraCallback, str3, ((String) objArr4[0]).intern());
            } else if (Intrinsics.areEqual(uriOnExtraCallback.getHost(), "bank")) {
                Intrinsics.checkNotNull(pathSegments);
                if (!Intrinsics.areEqual(CollectionsKt.firstOrNull(pathSegments), "m")) {
                    if (Intrinsics.areEqual(uriOnExtraCallback.getHost(), "m")) {
                        int i5 = onTransact + 117;
                        asInterface = i5 % 128;
                        if (i5 % 2 == 0) {
                            Intrinsics.checkNotNull(pathSegments);
                            int i6 = 10 / 0;
                            if (Intrinsics.areEqual(CollectionsKt.firstOrNull(pathSegments), "bank")) {
                                strIntern = "bank";
                            }
                            if (!Intrinsics.areEqual(strIntern, "bank")) {
                                int i7 = asInterface + 17;
                                onTransact = i7 % 128;
                                int i8 = i7 % 2;
                                str2 = (String) CollectionsKt.getOrNull(pathSegments, 1);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String string2 = uriOnExtraCallback.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "");
                                Object[] objArr5 = new Object[1];
                                a(new char[]{'\r', 15, 1, 14, 3, 7, '\b', 15, '\r', '\b', 13808, 13808, 13874}, (byte) (60 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
                                onrewardedaddisplayed = new onRewardedAdDisplayed(string2, onExtraCallback(uriOnExtraCallback, ((String) objArr5[0]).intern()), str2, strIntern);
                            } else {
                                str2 = (String) CollectionsKt.firstOrNull(pathSegments);
                                if (str2 == null) {
                                }
                                String string22 = uriOnExtraCallback.toString();
                                Intrinsics.checkNotNullExpressionValue(string22, "");
                                Object[] objArr52 = new Object[1];
                                a(new char[]{'\r', 15, 1, 14, 3, 7, '\b', 15, '\r', '\b', 13808, 13808, 13874}, (byte) (60 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr52);
                                onrewardedaddisplayed = new onRewardedAdDisplayed(string22, onExtraCallback(uriOnExtraCallback, ((String) objArr52[0]).intern()), str2, strIntern);
                            }
                        } else {
                            Intrinsics.checkNotNull(pathSegments);
                            if (Intrinsics.areEqual(CollectionsKt.firstOrNull(pathSegments), "bank")) {
                            }
                            if (!Intrinsics.areEqual(strIntern, "bank")) {
                            }
                        }
                    } else {
                        onrewardedaddisplayed = null;
                    }
                } else {
                    int i9 = onTransact + 107;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    String string3 = uriOnExtraCallback.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    Object[] objArr6 = new Object[1];
                    a(new char[]{'\r', 15, 1, 14, 3, 7, '\b', 15, '\r', '\b', 13775, 13775, 4, 6, 1, 2, '\n', 14}, (byte) ((Process.myPid() >> 22) + 26), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr6);
                    String strOnExtraCallback2 = onExtraCallback(uriOnExtraCallback, ((String) objArr6[0]).intern());
                    String str4 = (String) CollectionsKt.getOrNull(pathSegments, 1);
                    onrewardedaddisplayed = new onRewardedAdDisplayed(string3, strOnExtraCallback2, str4 != null ? str4 : "", "bank");
                }
            }
        }
        if (onrewardedaddisplayed == null || StringsKt.isBlank(onrewardedaddisplayed.onWarmupCompleted())) {
            return null;
        }
        return onrewardedaddisplayed;
    }

    private static final String onExtraCallback(Uri uri, String str) {
        int i = 2 % 2;
        Uri.Builder builderClearQuery = Uri.parse(str).buildUpon().clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        for (String str2 : queryParameterNames) {
            int i2 = onTransact + 47;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            List<String> queryParameters = uri.getQueryParameters(str2);
            Intrinsics.checkNotNullExpressionValue(queryParameters, "");
            Iterator<T> it = queryParameters.iterator();
            int i4 = asInterface + 47;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                builderClearQuery.appendQueryParameter(str2, (String) it.next());
            }
        }
        String string = builderClearQuery.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        boolean z;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $10 + 99;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 26 - TextUtils.getOffsetBefore("", 0), 23139 - TextUtils.indexOf("", "", 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            boolean z2 = false;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 23139 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i7 = $11 + 11;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        z = z2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getTapTimeout() >> 16) + 74, 8089 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                z = false;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 31 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 19489 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                z = false;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                        } else {
                            obj = null;
                            z = false;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i9 = $11 + 97;
                                $10 = i9 % 128;
                                int i10 = i9 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            } else {
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                    z2 = z;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            String str = new String(cArr4);
            int i16 = $10 + 93;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 15, 1, 14, 3, 7, '\b', 15, '\r', '\b', 13808, 13808, 13874}, (byte) (Drawable.resolveOpacity(0, 0) + 59), TextUtils.indexOf((CharSequence) "", '0', 0) + 14, objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{'\r', 15, 1, 14, 3, 7, '\b', 15, '\r', '\b', 13826, 13826, 7, '\b', '\f', 14, '\n', 14}, (byte) (77 - View.resolveSize(0, 0)), Color.alpha(0) + 18, objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{'\r', 15, 1, 14, 3, 7, '\b', 15, '\r', '\b', 13775, 13775, 4, 6, 1, 2, '\n', 14}, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26), 18 - TextUtils.indexOf("", ""), objArr3);
        onNavigationEvent = ((String) objArr3[0]).intern();
        int i = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{64989, 64984, 64963, 64967, 64976, 64978, 64924, 64977, 64991, 64905, 64990, 64988, 64960, 64982, 64966, 64961};
        onExtraCallbackWithResult = (char) 51245;
    }
}
