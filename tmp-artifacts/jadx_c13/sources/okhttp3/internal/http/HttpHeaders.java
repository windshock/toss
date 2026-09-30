package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.access8000;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HttpHeaders {
    private static final TTBaseLandingPageActivity QUOTED_STRING_DELIMITERS;
    private static final TTBaseLandingPageActivity TOKEN_DELIMITERS;

    static {
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        QUOTED_STRING_DELIMITERS = iAuthTabCallback.IAuthTabCallback("\"\\");
        TOKEN_DELIMITERS = iAuthTabCallback.IAuthTabCallback("\t ,=");
    }

    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String str) {
        Intrinsics.checkNotNullParameter(headers, "");
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (StringsKt__StringsJVMKt.equals(str, headers.name(i), true)) {
                try {
                    readChallengeHeader(new TTBaseActivity().onExtraCallback(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void readChallengeHeader(TTBaseActivity tTBaseActivity, List<Challenge> list) throws EOFException {
        String token;
        int iSkipAll;
        LinkedHashMap linkedHashMap;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(tTBaseActivity);
                    token2 = readToken(tTBaseActivity);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(tTBaseActivity);
                token = readToken(tTBaseActivity);
                if (token == null) {
                    if (tTBaseActivity.IAuthTabCallback_Parcel()) {
                        list.add(new Challenge(token2, (Map<String, String>) access8000.IAuthTabCallback()));
                        return;
                    }
                    return;
                }
                iSkipAll = _UtilCommonKt.skipAll(tTBaseActivity, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(tTBaseActivity);
                if (zSkipCommasAndWhitespace || (!zSkipCommasAndWhitespace2 && !tTBaseActivity.IAuthTabCallback_Parcel())) {
                    linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = iSkipAll + _UtilCommonKt.skipAll(tTBaseActivity, (byte) 61);
                    while (true) {
                        if (token == null) {
                            token = readToken(tTBaseActivity);
                            if (!skipCommasAndWhitespace(tTBaseActivity)) {
                                iSkipAll2 = _UtilCommonKt.skipAll(tTBaseActivity, (byte) 61);
                                if (iSkipAll2 == 0) {
                                    if (iSkipAll2 > 1 || skipCommasAndWhitespace(tTBaseActivity)) {
                                        return;
                                    }
                                    String quotedString = startsWith(tTBaseActivity, (byte) 34) ? readQuotedString(tTBaseActivity) : readToken(tTBaseActivity);
                                    if (quotedString == null || ((String) linkedHashMap.put(token, quotedString)) != null) {
                                        return;
                                    }
                                    if (!skipCommasAndWhitespace(tTBaseActivity) && !tTBaseActivity.IAuthTabCallback_Parcel()) {
                                        return;
                                    } else {
                                        token = null;
                                    }
                                }
                            }
                        } else if (iSkipAll2 == 0) {
                            break;
                        }
                    }
                }
                list.add(new Challenge(token2, linkedHashMap));
                token2 = token;
            }
            Map mapSingletonMap = Collections.singletonMap(null, token + StringsKt__StringsJVMKt.repeat("=", iSkipAll));
            Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "");
            list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
        }
    }

    private static final boolean skipCommasAndWhitespace(TTBaseActivity tTBaseActivity) throws EOFException {
        boolean z = false;
        while (!tTBaseActivity.IAuthTabCallback_Parcel()) {
            byte bOnExtraCallbackWithResult = tTBaseActivity.onExtraCallbackWithResult(0L);
            if (bOnExtraCallbackWithResult != 44) {
                if (bOnExtraCallbackWithResult != 32 && bOnExtraCallbackWithResult != 9) {
                    break;
                }
                tTBaseActivity.ICustomTabsCallback();
            } else {
                tTBaseActivity.ICustomTabsCallback();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(TTBaseActivity tTBaseActivity, byte b) {
        return !tTBaseActivity.IAuthTabCallback_Parcel() && tTBaseActivity.onExtraCallbackWithResult(0L) == b;
    }

    private static final String readQuotedString(TTBaseActivity tTBaseActivity) throws EOFException {
        if (tTBaseActivity.ICustomTabsCallback() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        TTBaseActivity tTBaseActivity2 = new TTBaseActivity();
        while (true) {
            long jOnExtraCallbackWithResult = tTBaseActivity.onExtraCallbackWithResult(QUOTED_STRING_DELIMITERS);
            if (jOnExtraCallbackWithResult == -1) {
                return null;
            }
            if (tTBaseActivity.onExtraCallbackWithResult(jOnExtraCallbackWithResult) == 34) {
                tTBaseActivity2.write(tTBaseActivity, jOnExtraCallbackWithResult);
                tTBaseActivity.ICustomTabsCallback();
                return tTBaseActivity2.onRelationshipValidationResult();
            }
            if (tTBaseActivity.ICustomTabsCallbackDefault() == jOnExtraCallbackWithResult + 1) {
                return null;
            }
            tTBaseActivity2.write(tTBaseActivity, jOnExtraCallbackWithResult);
            tTBaseActivity.ICustomTabsCallback();
            tTBaseActivity2.write(tTBaseActivity, 1L);
        }
    }

    private static final String readToken(TTBaseActivity tTBaseActivity) {
        long jOnExtraCallbackWithResult = tTBaseActivity.onExtraCallbackWithResult(TOKEN_DELIMITERS);
        if (jOnExtraCallbackWithResult == -1) {
            jOnExtraCallbackWithResult = tTBaseActivity.ICustomTabsCallbackDefault();
        }
        if (jOnExtraCallbackWithResult != 0) {
            return tTBaseActivity.IAuthTabCallback(jOnExtraCallbackWithResult);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(headers, "");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> all = Cookie.Companion.parseAll(httpUrl, headers);
            if (all.isEmpty()) {
                return;
            }
            cookieJar.saveFromResponse(httpUrl, all);
        }
    }

    public static final boolean promisesBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && _UtilJvmKt.headersContentLength(response) == -1 && !StringsKt__StringsJVMKt.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    @Deprecated
    public static final boolean hasBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        return promisesBody(response);
    }
}
