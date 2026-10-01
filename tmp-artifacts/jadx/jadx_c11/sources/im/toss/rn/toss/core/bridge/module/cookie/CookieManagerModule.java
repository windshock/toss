package im.toss.rn.toss.core.bridge.module.cookie;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule$;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpCookie;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CookieManagerModule extends ReactContextBaseJavaModule {
    private static final String CLEAR_BY_NAME_NOT_SUPPORTED = "Cannot remove a single cookie by name on Android";
    public static final onNavigationEvent Companion;
    private static final String GET_ALL_NOT_SUPPORTED = "Get all cookies not supported for Android (iOS only)";
    private static final boolean HTTP_ONLY_SUPPORTED;
    private static int IAuthTabCallback = 0;
    private static final String INVALID_COOKIE_VALUES = "Unable to add cookie - invalid values";
    private static final String INVALID_DOMAINS = "Cookie URL host %s and domain %s mismatched. The cookie won't set correctly.";
    private static final String INVALID_URL_MISSING_HTTP = "Invalid URL: It may be missing a protocol (ex. http:// or https://).";
    private static final boolean USES_LEGACY_STORE;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static short[] onWarmupCompleted;
    private final CookieSyncManager cookieSyncManager;
    private static final byte[] $$a = {7, 75, -84, -52};
    private static final int $$b = 164;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3 = i * 3;
        int i4 = 4 - (s * 3);
        int i5 = (s2 * 4) + 115;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4++;
            i5 += -i6;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i4];
            i4++;
            i5 += -i6;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    /* renamed from: $r8$lambda$0OxZK9lEMyQcMiaE-FOc0RZUQBw, reason: not valid java name */
    public static /* synthetic */ void m3$r8$lambda$0OxZK9lEMyQcMiaEFOc0RZUQBw(Promise promise, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        clearAll$lambda$0(promise, bool);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        int i5 = IAuthTabCallbackStub + 39;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: $r8$lambda$E-5bG4Ty-lds05nvhfRxhAPH7ys, reason: not valid java name */
    public static /* synthetic */ void m4$r8$lambda$E5bG4Tylds05nvhfRxhAPH7ys(Promise promise, Boolean bool) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        addCookies$lambda$0(promise, bool);
        int i4 = asInterface + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    /* renamed from: $r8$lambda$YN5gra_q1LrEh-LxNOSjZMIFCSo, reason: not valid java name */
    public static /* synthetic */ void m5$r8$lambda$YN5gra_q1LrEhLxNOSjZMIFCSo(Promise promise, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        removeSessionCookies$lambda$0(promise, bool);
        int i4 = IAuthTabCallbackStub + 81;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CookieManagerModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        CookieSyncManager cookieSyncManagerCreateInstance = CookieSyncManager.createInstance(reactApplicationContext);
        Intrinsics.checkNotNullExpressionValue(cookieSyncManagerCreateInstance, "");
        this.cookieSyncManager = cookieSyncManagerCreateInstance;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return "RNCookieManagerAndroid";
    }

    @ReactMethod
    public final void set(@NotNull String str, @NotNull ReadableMap readableMap, boolean z, @NotNull Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        try {
            String rFC6265string = toRFC6265string(makeHTTPCookieObject(str, readableMap));
            if (rFC6265string.length() == 0) {
                promise.reject(new Exception(INVALID_COOKIE_VALUES));
                return;
            }
            addCookies(str, rFC6265string, promise);
            int i4 = IAuthTabCallbackStub + 77;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("operation", "set");
            Object[] objArr = new Object[1];
            a((short) (114 - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) (TextUtils.indexOf("", "", 0, 0) - 90), 1790323136 - TextUtils.getOffsetBefore("", 0), MotionEvent.axisFromString("") - 1781927420, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 85, objArr);
            convertFloatArrayToByteArray.onExtraCallbackWithResult("CookieManagerModule", "cookie_operation_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
            promise.reject(e);
        }
    }

    @ReactMethod
    public final void setFromResponse(@NotNull String str, @Nullable String str2, @NotNull Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(promise, "");
        if (str2 != null) {
            addCookies(str, str2, promise);
            return;
        }
        promise.reject(new Exception(INVALID_COOKIE_VALUES));
        int i4 = IAuthTabCallbackStub + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @ReactMethod
    public final void flush(@NotNull Promise promise) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(promise, "");
        try {
            getCookieManager().flush();
            promise.resolve(Boolean.TRUE);
            int i4 = IAuthTabCallbackStub + 73;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("CookieManagerModule", "cookie_operation_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("operation", "flush"), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
            promise.reject(e);
        }
    }

    private static final void removeSessionCookies$lambda$0(Promise promise, Boolean bool) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        promise.resolve(bool);
        int i4 = IAuthTabCallbackStub + 77;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @ReactMethod
    public final void removeSessionCookies(@NotNull Promise promise) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(promise, "");
        try {
            getCookieManager().removeSessionCookies(new CookieManagerModule$.ExternalSyntheticLambda1(promise));
            int i2 = IAuthTabCallbackStub + 111;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("CookieManagerModule", "cookie_operation_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("operation", "removeSessionCookies"), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
            promise.reject(e);
        }
    }

    @ReactMethod
    public final void getFromResponse(@NotNull String str, @NotNull Promise promise) throws URISyntaxException, IOException {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(promise, "");
        promise.resolve(str);
        int i4 = IAuthTabCallbackStub + 113;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
    }

    @ReactMethod
    public final void getAll(boolean z, @NotNull Promise promise) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(promise, "");
        promise.reject(new Exception(GET_ALL_NOT_SUPPORTED));
        int i2 = asInterface + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r13 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r15.resolve(createCookieList(getCookieManager().getCookie(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        r3 = o.getWrite.IAuthTabCallback("operation", "get");
        r11 = new java.lang.Object[1];
        a((short) (115 - android.view.KeyEvent.getDeadChar(0, 0)), (byte) ((-90) - android.view.Gravity.getAbsoluteGravity(0, 0)), 1790323136 - android.view.View.getDefaultSize(0, 0), (-1781927420) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (-85) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), r11);
        r1.onExtraCallbackWithResult("CookieManagerModule", "cookie_operation_failed", r0, o.access8100.onWarmupCompleted(new kotlin.Pair[]{r3, o.getWrite.IAuthTabCallback(((java.lang.String) r11[0]).intern(), r13), o.getWrite.IAuthTabCallback("errorType", r0.getClass().getSimpleName())}));
        r15.reject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (isEmpty(r13) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (isEmpty(r13) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r15.reject(new java.lang.Exception(im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.INVALID_URL_MISSING_HTTP));
        r13 = im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.IAuthTabCallbackStub + 89;
        im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.asInterface = r13 % 128;
     */
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void get(@NotNull String str, boolean z, @NotNull Promise promise) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(promise, "");
            int i3 = 29 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(promise, "");
        }
    }

    @ReactMethod
    public final void clearByName(@NotNull String str, @NotNull String str2, boolean z, @NotNull Promise promise) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(promise, "");
        promise.reject(new Exception(CLEAR_BY_NAME_NOT_SUPPORTED));
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void clearAll$lambda$0(Promise promise, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        promise.resolve(bool);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if ((!im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.USES_LEGACY_STORE) != true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r2 = im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.IAuthTabCallbackStub + 23;
        im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.asInterface = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if ((r2 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r0.removeAllCookie();
        r0.removeSessionCookie();
        r7.cookieSyncManager.sync();
        r9.resolve(java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r0.removeAllCookie();
        r0.removeSessionCookie();
        r7.cookieSyncManager.sync();
        r9.resolve(java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r0.removeAllCookies(new im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule$.ExternalSyntheticLambda0(r9));
        r0.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.USES_LEGACY_STORE != false) goto L16;
     */
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clearAll(boolean z, @NotNull Promise promise) {
        CookieManager cookieManager;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(promise, "");
                cookieManager = getCookieManager();
                int i3 = 12 / 0;
            } else {
                Intrinsics.checkNotNullParameter(promise, "");
                cookieManager = getCookieManager();
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("CookieManagerModule", "cookie_operation_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("operation", "clearAll"), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
            promise.reject(e);
        }
    }

    private static final void addCookies$lambda$0(Promise promise, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        promise.resolve(bool);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        int i5 = asInterface + 83;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.USES_LEGACY_STORE != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r8 = im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.asInterface + 3;
        im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.IAuthTabCallbackStub = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if ((r8 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r5.setCookie(r18, r19);
        r17.cookieSyncManager.sync();
        r20.resolve(java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r5.setCookie(r18, r19);
        r17.cookieSyncManager.sync();
        r20.resolve(java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r5.setCookie(r18, r19, new im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule$.ExternalSyntheticLambda2(r20));
        r5.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule.USES_LEGACY_STORE != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addCookies(String str, String str2, Promise promise) throws Throwable {
        CookieManager cookieManager;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                cookieManager = getCookieManager();
                int i3 = 9 / 0;
            } else {
                cookieManager = getCookieManager();
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("operation", "addCookies");
            Object[] objArr = new Object[1];
            a((short) (115 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (byte) (View.resolveSize(0, 0) - 90), View.resolveSize(0, 0) + 1790323136, (-1781927421) + (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-84) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            convertFloatArrayToByteArray.onExtraCallbackWithResult("CookieManagerModule", "cookie_operation_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
            promise.reject(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v5 com.facebook.react.bridge.WritableMap) = (r1v4 com.facebook.react.bridge.WritableMap), (r1v7 com.facebook.react.bridge.WritableMap) binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WritableMap createCookieList(String str) throws Exception {
        WritableMap writableMapCreateMap;
        List listSplit$default;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            writableMapCreateMap = Arguments.createMap();
            int i3 = 63 / 0;
            if (!isEmpty(str)) {
                int i4 = IAuthTabCallbackStub + 73;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                if (str != null && (listSplit$default = StringsKt.split$default(str, new String[]{";"}, false, 0, 6, (Object) null)) != null) {
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        List<HttpCookie> list = HttpCookie.parse((String) it.next());
                        Intrinsics.checkNotNullExpressionValue(list, "");
                        for (HttpCookie httpCookie : list) {
                            if (!isEmpty(httpCookie.getName())) {
                                int i6 = IAuthTabCallbackStub + 43;
                                asInterface = i6 % 128;
                                int i7 = i6 % 2;
                                if (!isEmpty(httpCookie.getValue())) {
                                    int i8 = IAuthTabCallbackStub + 3;
                                    asInterface = i8 % 128;
                                    int i9 = i8 % 2;
                                    WritableMap writableMapCreateCookieData = createCookieData(httpCookie);
                                    String name = httpCookie.getName();
                                    Intrinsics.checkNotNullExpressionValue(name, "");
                                    writableMapCreateMap.putMap(name, writableMapCreateCookieData);
                                    int i10 = IAuthTabCallbackStub + 53;
                                    asInterface = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        int i11 = 2 % 5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            writableMapCreateMap = Arguments.createMap();
            if (!isEmpty(str)) {
            }
        }
        return writableMapCreateMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpCookie makeHTTPCookieObject(String str, ReadableMap readableMap) throws Exception {
        Date date;
        int i = 2 % 2;
        try {
            String host = new URL(str).getHost();
            if (isEmpty(host)) {
                throw new Exception(INVALID_URL_MISSING_HTTP);
            }
            Object[] objArr = new Object[1];
            a((short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 61), (byte) (Color.green(0) - 67), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1790323138, (-1781927428) + TextUtils.getOffsetBefore("", 0), (-82) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            String string = readableMap.getString(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a((short) (101 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (byte) (TextUtils.getCapsMode("", 0, 0) - 36), 1790323141 + (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1781927420) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-82) - View.resolveSizeAndState(0, 0, 0), objArr2);
            HttpCookie httpCookie = new HttpCookie(string, readableMap.getString(((String) objArr2[0]).intern()));
            Object obj = null;
            if (!readableMap.hasKey("domain") || isEmpty(readableMap.getString("domain"))) {
                httpCookie.setDomain(host);
            } else {
                String string2 = readableMap.getString("domain");
                if (string2 == null) {
                    throw new Exception(INVALID_COOKIE_VALUES);
                }
                if (StringsKt.startsWith$default(string2, ".", false, 2, (Object) null)) {
                    int i2 = asInterface + 39;
                    IAuthTabCallbackStub = i2 % 128;
                    int i3 = i2 % 2;
                    string2 = string2.substring(1);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                }
                Intrinsics.checkNotNull(host);
                if (!StringsKt.contains$default(host, string2, false, 2, (Object) null)) {
                    int i4 = IAuthTabCallbackStub + 105;
                    asInterface = i4 % 128;
                    if (i4 % 2 == 0) {
                        Intrinsics.areEqual(host, string2);
                        obj.hashCode();
                        throw null;
                    }
                    if (!Intrinsics.areEqual(host, string2)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str2 = String.format(INVALID_DOMAINS, Arrays.copyOf(new Object[]{host, string2}, 2));
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        throw new Exception(str2);
                    }
                }
                httpCookie.setDomain(string2);
            }
            if (readableMap.hasKey("path")) {
                int i5 = IAuthTabCallbackStub + 15;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 43 / 0;
                    if (!isEmpty(readableMap.getString("path"))) {
                        httpCookie.setPath(readableMap.getString("path"));
                    }
                } else if (!isEmpty(readableMap.getString("path"))) {
                }
            }
            if (readableMap.hasKey("expires") && !isEmpty(readableMap.getString("expires")) && (date = parseDate(readableMap.getString("expires"))) != null) {
                int i7 = IAuthTabCallbackStub + 19;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                httpCookie.setMaxAge(date.getTime());
            }
            if (readableMap.hasKey("secure")) {
                int i9 = IAuthTabCallbackStub + 93;
                asInterface = i9 % 128;
                if (i9 % 2 == 0) {
                    readableMap.getBoolean("secure");
                    throw null;
                }
                if (readableMap.getBoolean("secure")) {
                    httpCookie.setSecure(true);
                    int i10 = IAuthTabCallbackStub + 91;
                    asInterface = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
            if (HTTP_ONLY_SUPPORTED) {
                int i12 = IAuthTabCallbackStub + 15;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                if (readableMap.hasKey("httpOnly")) {
                    int i14 = IAuthTabCallbackStub + 119;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
                    if (readableMap.getBoolean("httpOnly")) {
                        httpCookie.setHttpOnly(true);
                    }
                }
            }
            return httpCookie;
        } catch (Exception unused) {
            throw new Exception(INVALID_URL_MISSING_HTTP);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j2 = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, 22439 - (ViewConfiguration.getTouchSlop() >> 8), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 23;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            float f = 0.0f;
            if (i4 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char bitsPerPixel = (char) (12842 - ImageFormat.getBitsPerPixel(0));
                            int i9 = (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 55;
                            int packedPositionChild = 2166 - ExpandableListView.getPackedPositionChild(j2);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(bitsPerPixel, i9, packedPositionChild, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i8++;
                        j2 = 0;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 43424), 42 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 86, 9566 - TextUtils.lastIndexOf("", '0'), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        int i11 = $11 + 31;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        bArr5[i10] = (byte) (bArr4[i10] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $11 + 95;
                    $10 = i13 % 128;
                    boolean z = i13 % 2 == 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i14 = $11 + 103;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                        if (z) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final WritableMap createCookieData(HttpCookie httpCookie) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Object[] objArr = new Object[1];
        a((short) (61 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) - 67), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1790323138, (ViewConfiguration.getLongPressTimeout() >> 16) - 1781927428, (-83) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        writableMapCreateMap.putString(((String) objArr[0]).intern(), httpCookie.getName());
        Object[] objArr2 = new Object[1];
        a((short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 99), (byte) ((-36) - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.getCapsMode("", 0, 0) + 1790323141, KeyEvent.getDeadChar(0, 0) - 1781927420, Color.alpha(0) - 82, objArr2);
        writableMapCreateMap.putString(((String) objArr2[0]).intern(), httpCookie.getValue());
        writableMapCreateMap.putString("domain", httpCookie.getDomain());
        writableMapCreateMap.putString("path", httpCookie.getPath());
        writableMapCreateMap.putBoolean("secure", httpCookie.getSecure());
        if (HTTP_ONLY_SUPPORTED) {
            int i4 = IAuthTabCallbackStub + 125;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            writableMapCreateMap.putBoolean("httpOnly", httpCookie.isHttpOnly());
        }
        long maxAge = httpCookie.getMaxAge();
        if (maxAge > 0) {
            String date$default = formatDate$default(this, new Date(maxAge), false, 2, null);
            if (!isEmpty(date$default)) {
                int i6 = asInterface + 105;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                writableMapCreateMap.putString("expires", date$default);
            }
        }
        return writableMapCreateMap;
    }

    private final String toRFC6265string(HttpCookie httpCookie) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(httpCookie.getName());
        sb.append('=');
        sb.append(httpCookie.getValue());
        if (!httpCookie.hasExpired()) {
            long maxAge = httpCookie.getMaxAge();
            if (maxAge > 0) {
                String date = formatDate(new Date(maxAge), true);
                if (!isEmpty(date)) {
                    int i2 = asInterface + 71;
                    IAuthTabCallbackStub = i2 % 128;
                    int i3 = i2 % 2;
                    sb.append("; expires=");
                    sb.append(date);
                }
            }
        }
        if (!isEmpty(httpCookie.getDomain())) {
            sb.append("; domain=");
            sb.append(httpCookie.getDomain());
        }
        if (!isEmpty(httpCookie.getPath())) {
            int i4 = asInterface + 113;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            sb.append("; path=");
            sb.append(httpCookie.getPath());
        }
        if (httpCookie.getSecure()) {
            sb.append("; secure");
        }
        if (HTTP_ONLY_SUPPORTED && !(!httpCookie.isHttpOnly())) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final boolean isEmpty(String str) {
        int i = 2 % 2;
        if (str == null || str.length() == 0) {
            int i2 = IAuthTabCallbackStub + 119;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = asInterface + 91;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final DateFormat dateFormatter() {
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        int i2 = asInterface + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private final DateFormat rfc1123dateFormatter() {
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        int i2 = asInterface + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return simpleDateFormat;
    }

    private final Date parseDate(String str) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 119;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            return parseDate(str, false);
        }
        int i5 = i2 + 115;
        int i6 = i5 % 128;
        IAuthTabCallbackStub = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i7 = i6 + 33;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 68 / 0;
        }
        return null;
    }

    private final Date parseDate(String str, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 57;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (!z) {
                return dateFormatter().parse(str);
            }
            int i5 = i2 + 71;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return rfc1123dateFormatter().parse(str);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    static /* synthetic */ String formatDate$default(CookieManagerModule cookieManagerModule, Date date, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 57;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i3 + 5;
            IAuthTabCallbackStub = i5 % 128;
            z = i5 % 2 != 0;
        }
        return cookieManagerModule.formatDate(date, z);
    }

    private final String formatDate(Date date, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (z) {
                return rfc1123dateFormatter().format(date);
            }
            String str = dateFormatter().format(date);
            int i4 = asInterface + 95;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        } catch (Exception e) {
            e.getMessage();
            int i5 = IAuthTabCallbackStub + 51;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
    }

    private final CookieManager getCookieManager() throws Exception {
        CookieManager cookieManager;
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackStub = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
            } else {
                cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
            }
            Intrinsics.checkNotNull(cookieManager);
            return cookieManager;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        onTransact = 0;
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        USES_LEGACY_STORE = false;
        HTTP_ONLY_SUPPORTED = true;
        int i = asBinder + 89;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 823004744;
        onNavigationEvent = -1538795425;
        onExtraCallbackWithResult = -831400326;
        onExtraCallback = new byte[]{-31, -32, 0, 124, 25, -64, 121, 123, -37, 8, 8, 8};
    }
}
