package okhttp3.java.net.cookiejar;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access8000;
import o.access8200;
import o.getWrite;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class JavaNetCookieJar implements CookieJar {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private final CookieHandler cookieHandler;
    private static char[] onExtraCallbackWithResult = {32475, 32503, 32499, 32509, 32505};
    private static int onWarmupCompleted = -1184333978;
    private static boolean onNavigationEvent = true;
    private static boolean IAuthTabCallback = true;

    public JavaNetCookieJar(@NotNull CookieHandler cookieHandler) {
        Intrinsics.checkNotNullParameter(cookieHandler, "");
        this.cookieHandler = cookieHandler;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<Cookie> it = list.iterator();
        int i2 = asInterface + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            int i4 = asInterface + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(Internal.cookieToString(it.next(), true));
        }
        try {
            this.cookieHandler.put(httpUrl.uri(), access8200.IAuthTabCallback(getWrite.IAuthTabCallback("Set-Cookie", arrayList)));
        } catch (IOException e) {
            Platform platform = Platform.Companion.get();
            StringBuilder sb = new StringBuilder();
            sb.append("Saving cookies failed for ");
            HttpUrl httpUrlResolve = httpUrl.resolve("/...");
            Intrinsics.checkNotNull(httpUrlResolve);
            sb.append(httpUrlResolve);
            platform.log(sb.toString(), 5, e);
        }
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        try {
            Map<String, List<String>> map = this.cookieHandler.get(httpUrl.uri(), access8000.IAuthTabCallback());
            Intrinsics.checkNotNull(map);
            Object obj = null;
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                int i4 = onExtraCallback + 125;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                String key = entry.getKey();
                List<String> value = entry.getValue();
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-123, -124, -125, -126, -126, -127}, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, objArr);
                if (!StringsKt__StringsJVMKt.equals(((String) objArr[0]).intern(), key, true)) {
                    int i6 = onExtraCallback + 15;
                    asInterface = i6 % 128;
                    if (i6 % 2 == 0) {
                        if (StringsKt__StringsJVMKt.equals("Cookie2", key, true)) {
                        }
                    } else if (StringsKt__StringsJVMKt.equals("Cookie2", key, true)) {
                    }
                }
                Intrinsics.checkNotNull(value);
                if (!value.isEmpty()) {
                    for (String str : value) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            int i7 = onExtraCallback + 91;
                            asInterface = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        Intrinsics.checkNotNull(str);
                        arrayList.addAll(decodeHeaderAsJavaNetCookies(httpUrl, str));
                    }
                }
            }
            if (arrayList != null) {
                int i9 = asInterface + 113;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNull(listUnmodifiableList);
                return listUnmodifiableList;
            }
            List<Cookie> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            int i11 = onExtraCallback + 95;
            asInterface = i11 % 128;
            if (i11 % 2 != 0) {
                return listEmptyList;
            }
            obj.hashCode();
            throw null;
        } catch (IOException e) {
            Platform platform = Platform.Companion.get();
            StringBuilder sb = new StringBuilder();
            sb.append("Loading cookies failed for ");
            HttpUrl httpUrlResolve = httpUrl.resolve("/...");
            Intrinsics.checkNotNull(httpUrlResolve);
            sb.append(httpUrlResolve);
            platform.log(sb.toString(), 5, e);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    private final List<Cookie> decodeHeaderAsJavaNetCookies(HttpUrl httpUrl, String str) {
        String strSubstring;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = asInterface + 73;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, ";,", i2, length);
            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(str, '=', i2, iDelimiterOffset);
            String strTrimSubstring = _UtilCommonKt.trimSubstring(str, i2, iDelimiterOffset2);
            if (!StringsKt__StringsJVMKt.startsWith$default(strTrimSubstring, "$", false, 2, null)) {
                if (iDelimiterOffset2 < iDelimiterOffset) {
                    strSubstring = _UtilCommonKt.trimSubstring(str, iDelimiterOffset2 + 1, iDelimiterOffset);
                    int i5 = asInterface + 55;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                if (StringsKt__StringsJVMKt.startsWith$default(strSubstring, "\"", false, 2, null) && !(!StringsKt__StringsJVMKt.endsWith$default(strSubstring, "\"", false, 2, null)) && strSubstring.length() >= 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                }
                arrayList.add(new Cookie.Builder().name(strTrimSubstring).value(strSubstring).domain(httpUrl.host()).build());
                int i7 = onExtraCallback + 71;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            }
            i2 = iDelimiterOffset + 1;
            int i9 = onExtraCallback + 91;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
        }
        return arrayList;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 78 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 20952 - (ViewConfiguration.getLongPressTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET)), 75 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 16036 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i6 = $10 + 85;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62, 12214 - Color.red(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $10 + 109;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 63 - (ViewConfiguration.getJumpTapTimeout() >> 16), 12214 - Color.alpha(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i10 = $10 + 71;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 29;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] * iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted - 1;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
        }
        objArr[0] = new String(cArr6);
    }
}
