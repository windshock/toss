package im.toss.deeplink;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.io.EOFException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.TTBaseActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class QueryParameterParser {
    static final String CONVERT_TO_URI_ENCODE_SET = "^`{}|\\";
    static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final String FRAGMENT_ENCODE_SET = "";
    private static int IAuthTabCallback = 0;
    static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final String QUERY_COMPONENT_ENCODE_SET = " \"'<>#&=";
    static final String QUERY_ENCODE_SET = " \"'<>#";
    static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String fragment;
    private final String host;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static int onNavigationEvent = 13 % 128;

    /* renamed from: -$$Nest$fgethost, reason: not valid java name */
    static /* synthetic */ String m101$$Nest$fgethost(QueryParameterParser queryParameterParser) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = queryParameterParser.host;
        int i5 = i3 + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: -$$Nest$fgetport, reason: not valid java name */
    static /* synthetic */ int m102$$Nest$fgetport(QueryParameterParser queryParameterParser) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = queryParameterParser.port;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i2 + 123;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* renamed from: -$$Nest$fgetscheme, reason: not valid java name */
    static /* synthetic */ String m103$$Nest$fgetscheme(QueryParameterParser queryParameterParser) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = queryParameterParser.scheme;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: -$$Nest$smdelimiterOffset, reason: not valid java name */
    static /* synthetic */ int m104$$Nest$smdelimiterOffset(String str, int i, int i2, String str2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int iDelimiterOffset = delimiterOffset(str, i, i2, str2);
        int i6 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return iDelimiterOffset;
        }
        throw null;
    }

    static int decodeHexDigit(char c) {
        int i = 2 % 2;
        if (c >= '0') {
            int i2 = onWarmupCompleted + 99;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (c <= '9') {
                int i5 = i3 + 63;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 == 0 ? c << '%' : c - '0';
            }
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    static {
        if (13 % 2 == 0) {
            int i = 38 / 0;
        }
    }

    private QueryParameterParser(Builder builder) {
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername);
        this.password = percentDecode(builder.encodedPassword);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments);
        List<String> list = builder.encodedQueryNamesAndValues;
        String strPercentDecode = null;
        this.queryNamesAndValues = list != null ? percentDecode(list) : null;
        String str = builder.encodedFragment;
        if (str != null) {
            int i = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                strPercentDecode = percentDecode(str);
                int i2 = 2 % 2;
            } else {
                percentDecode(str);
                strPercentDecode.hashCode();
                throw null;
            }
        }
        this.fragment = strPercentDecode;
        this.url = builder.toString();
        int i3 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    URL url() {
        int i = 2 % 2;
        try {
            URL url = new URL(this.url);
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 27 / 0;
            }
            return url;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    URI uri() {
        int i = 2 % 2;
        try {
            URI uri = new URI(canonicalize(this.url, CONVERT_TO_URI_ENCODE_SET, true, false));
            int i2 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 26 / 0;
            }
            return uri;
        } catch (EOFException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException unused) {
            throw new IllegalStateException("not valid as a java.net.URI: " + this.url);
        }
    }

    String scheme() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.scheme;
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    boolean isHttps() {
        boolean zEquals;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            zEquals = this.scheme.equals("https");
            int i3 = 25 / 0;
        } else {
            zEquals = this.scheme.equals("https");
        }
        int i4 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zEquals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    String encodedUsername() {
        int i = 2 % 2;
        if (!this.username.isEmpty()) {
            int length = this.scheme.length() + 3;
            String str = this.url;
            String strSubstring = this.url.substring(length, delimiterOffset(str, length, str.length(), ":@"));
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return strSubstring;
        }
        int i4 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return FRAGMENT_ENCODE_SET;
    }

    String username() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.username;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    String encodedPassword() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!this.password.isEmpty()) {
            int iIndexOf = this.url.indexOf(58, this.scheme.length() + 3);
            return this.url.substring(iIndexOf + 1, this.url.indexOf(64));
        }
        int i4 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        throw null;
    }

    String password() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.password;
        int i5 = i3 + 47;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return str;
    }

    String host() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 67;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.host;
        int i4 = i2 + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    String encodedHost() throws EOFException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strCanonicalize = canonicalize(this.host, CONVERT_TO_URI_ENCODE_SET, true, true);
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strCanonicalize;
    }

    int port() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.port;
        int i5 = i2 + 45;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static int defaultPort(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!str.equals("http")) {
            return str.equals("https") ? 443 : -1;
        }
        int i4 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i4 % 128;
        return i4 % 2 != 0 ? 108 : 80;
    }

    int pathSize() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int size = this.pathSegments.size();
        int i4 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    String encodedPath() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIndexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        String strSubstring = this.url.substring(iIndexOf, delimiterOffset(str, iIndexOf, str.length(), "?#"));
        int i4 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strSubstring;
    }

    static void pathSegmentsToString(StringBuilder sb, List<String> list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int size = list.size();
        int i4 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < size) {
            sb.append('/');
            sb.append(list.get(i6));
            i6++;
            int i7 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    List<String> encodedPathSegments() {
        int i = 2 % 2;
        int iIndexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        int iDelimiterOffset = delimiterOffset(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iDelimiterOffset) {
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                iIndexOf++;
            }
            int iDelimiterOffset2 = delimiterOffset(this.url, iIndexOf, iDelimiterOffset, "/");
            arrayList.add(this.url.substring(iIndexOf, iDelimiterOffset2));
            iIndexOf = iDelimiterOffset2;
            int i3 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        return arrayList;
    }

    List<String> pathSegments() {
        List<String> list;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            list = this.pathSegments;
            int i4 = 89 / 0;
        } else {
            list = this.pathSegments;
        }
        int i5 = i3 + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    String encodedQuery() {
        int i = 2 % 2;
        if (this.queryNamesAndValues != null) {
            int iIndexOf = this.url.indexOf(63);
            String str = this.url;
            String strSubstring = this.url.substring(iIndexOf + 1, delimiterOffset(str, iIndexOf + 2, str.length(), "#"));
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return strSubstring;
        }
        int i4 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static void namesAndValuesToQueryString(StringBuilder sb, List<String> list) {
        int i = 2 % 2;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                int i3 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i3 % 128;
                sb.append(i3 % 2 == 0 ? (char) 127 : '=');
                sb.append(str2);
            }
            i2 += 2;
            int i4 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static List<String> queryStringToNamesAndValues(String str) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int iIndexOf = str.indexOf(38, i2);
            if (iIndexOf == -1) {
                int i3 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i2);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i2, iIndexOf));
                arrayList.add(null);
            } else {
                int i5 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(str.substring(i2, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i2 = iIndexOf + 1;
        }
        int i7 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 2 / 0;
        }
        return arrayList;
    }

    static final class Builder {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        String encodedFragment;
        final List<String> encodedPathSegments;
        List<String> encodedQueryNamesAndValues;
        String host;
        String scheme;
        String encodedUsername = QueryParameterParser.FRAGMENT_ENCODE_SET;
        String encodedPassword = QueryParameterParser.FRAGMENT_ENCODE_SET;
        int port = -1;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        static final class ParseResult {
            private static int $10 = 0;
            private static int $11 = 1;
            private static final /* synthetic */ ParseResult[] $VALUES;
            private static int IAuthTabCallback = 0;
            public static final ParseResult INVALID_HOST;
            public static final ParseResult INVALID_PORT;
            public static final ParseResult MISSING_SCHEME;
            public static final ParseResult SUCCESS;
            public static final ParseResult UNSUPPORTED_SCHEME;
            private static int asBinder = 1;
            private static char[] onExtraCallback = null;
            private static int onExtraCallbackWithResult = 1;
            private static char onNavigationEvent;
            private static int onWarmupCompleted;

            private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                long j;
                int i3 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
                char[] cArr2 = onExtraCallback;
                float f = 0.0f;
                Object obj2 = null;
                if (cArr2 != null) {
                    int i4 = $10 + 21;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = $11 + 47;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 26, (ViewConfiguration.getPressedStateDuration() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                                }
                                cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                                i6 /= 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Gravity.getAbsoluteGravity(0, 0) + 26, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i6++;
                        }
                        f = 0.0f;
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                long j2 = 0;
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + 26, 23139 - View.MeasureSpec.makeMeasureSpec(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                    int i8 = $10 + 47;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    int i10 = $11 + 5;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        int i12 = $10 + 27;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            j = j2;
                            obj = obj2;
                        } else {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 24824), 74 - ExpandableListView.getPackedPositionType(j2), TextUtils.indexOf((CharSequence) QueryParameterParser.FRAGMENT_ENCODE_SET, '0') + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback5 == null) {
                                    j = 0;
                                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    j = 0;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            } else {
                                obj = null;
                                j = 0;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                                    int i17 = $10 + 109;
                                    $11 = i17 % 128;
                                    int i18 = i17 % 2;
                                } else {
                                    int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                                }
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                        j2 = j;
                    }
                }
                int i21 = 0;
                while (i21 < i) {
                    cArr4[i21] = (char) (cArr4[i21] ^ 13722);
                    i21++;
                    int i22 = $10 + 1;
                    $11 = i22 % 128;
                    int i23 = i22 % 2;
                }
                objArr[0] = new String(cArr4);
            }

            private static /* synthetic */ ParseResult[] $values() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 9;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                ParseResult[] parseResultArr = {SUCCESS, MISSING_SCHEME, UNSUPPORTED_SCHEME, INVALID_PORT, INVALID_HOST};
                int i5 = i2 + 55;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return parseResultArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private ParseResult(String str, int i) {
            }

            public static ParseResult valueOf(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                ParseResult parseResult = (ParseResult) Enum.valueOf(ParseResult.class, str);
                int i4 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return parseResult;
            }

            public static ParseResult[] values() {
                ParseResult[] parseResultArr;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    parseResultArr = (ParseResult[]) $VALUES.clone();
                    int i3 = 91 / 0;
                } else {
                    parseResultArr = (ParseResult[]) $VALUES.clone();
                }
                int i4 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return parseResultArr;
            }

            static {
                onExtraCallbackWithResult();
                Object[] objArr = new Object[1];
                a(new char[]{5, 6, 13885, 13885, 0, '\b', 13869}, (byte) (100 - View.getDefaultSize(0, 0)), 7 - TextUtils.indexOf(QueryParameterParser.FRAGMENT_ENCODE_SET, QueryParameterParser.FRAGMENT_ENCODE_SET, 0), objArr);
                SUCCESS = new ParseResult(((String) objArr[0]).intern(), 0);
                MISSING_SCHEME = new ParseResult("MISSING_SCHEME", 1);
                UNSUPPORTED_SCHEME = new ParseResult("UNSUPPORTED_SCHEME", 2);
                INVALID_PORT = new ParseResult("INVALID_PORT", 3);
                Object[] objArr2 = new Object[1];
                a(new char[]{'\f', 11, 5, 1, 7, 3, '\b', 11, 3, 1, 5, 4}, (byte) (44 - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.getDeadChar(0, 0) + 12, objArr2);
                INVALID_HOST = new ParseResult(((String) objArr2[0]).intern(), 4);
                $VALUES = $values();
                int i = IAuthTabCallback + 47;
                asBinder = i % 128;
                int i2 = i % 2;
            }

            static void onExtraCallbackWithResult() {
                onExtraCallback = new char[]{65020, 64997, 65019, 65023, 64992, 64998, 65009, 64999, 65021, 65008, 65004, 65015, 65014, 65010, 65022, 65018};
                onNavigationEvent = (char) 51245;
            }
        }

        Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add(QueryParameterParser.FRAGMENT_ENCODE_SET);
        }

        Builder scheme(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            int i5 = i2 + 93;
            onNavigationEvent = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                this.scheme = str;
                throw null;
            }
            this.scheme = str;
            int i6 = i2 + 19;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        Builder username(String str) throws EOFException {
            int i = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("username == null");
            }
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.encodedUsername = QueryParameterParser.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false);
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        Builder encodedUsername(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (str == null) {
                throw new IllegalArgumentException("encodedUsername == null");
            }
            this.encodedUsername = QueryParameterParser.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false);
            int i3 = onExtraCallback + 53;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }

        Builder password(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("password == null");
            }
            int i5 = i3 + 99;
            onExtraCallback = i5 % 128;
            boolean z = i5 % 2 == 0;
            this.encodedPassword = QueryParameterParser.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", z, z);
            return this;
        }

        Builder encodedPassword(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (str != null) {
                int i5 = i2 + 47;
                onNavigationEvent = i5 % 128;
                this.encodedPassword = i5 % 2 != 0 ? QueryParameterParser.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, true) : QueryParameterParser.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false);
                return this;
            }
            throw new IllegalArgumentException("encodedPassword == null");
        }

        Builder host(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String strCanonicalizeHost = canonicalizeHost(str, 0, str.length());
            if (strCanonicalizeHost == null) {
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            this.host = strCanonicalizeHost;
            int i4 = onNavigationEvent + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
            return this;
        }

        Builder port(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 87;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if (i > 0) {
                int i6 = i4 + 25;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                if (i <= 65535) {
                    int i8 = i4 + 65;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    this.port = i;
                    return this;
                }
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        int effectivePort() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = this.port;
            if (i3 != -1) {
                return i3;
            }
            int iDefaultPort = QueryParameterParser.defaultPort(this.scheme);
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iDefaultPort;
        }

        Builder addPathSegment(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str == null) {
                throw new IllegalArgumentException("pathSegment == null");
            }
            push(str, 0, str.length(), false, false);
            int i3 = onExtraCallback + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        Builder addEncodedPathSegment(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedPathSegment == null");
            }
            int i5 = i3 + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            push(str, 0, str.length(), false, true);
            int i7 = onExtraCallback + 119;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }

        Builder setPathSegment(int i, String str) throws EOFException {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (str == null) {
                throw new IllegalArgumentException("pathSegment == null");
            }
            String strCanonicalize = QueryParameterParser.canonicalize(str, 0, str.length(), QueryParameterParser.PATH_SEGMENT_ENCODE_SET, false, false);
            if (!isDot(strCanonicalize)) {
                int i5 = onNavigationEvent + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (!isDotDot(strCanonicalize)) {
                    int i7 = onNavigationEvent + 63;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    this.encodedPathSegments.set(i, strCanonicalize);
                    return this;
                }
            }
            throw new IllegalArgumentException("unexpected path segment: " + str);
        }

        Builder setEncodedPathSegment(int i, String str) throws EOFException {
            int i2 = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedPathSegment == null");
            }
            int i3 = onExtraCallback + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String strCanonicalize = QueryParameterParser.canonicalize(str, 0, str.length(), QueryParameterParser.PATH_SEGMENT_ENCODE_SET, true, false);
            this.encodedPathSegments.set(i, strCanonicalize);
            if (!isDot(strCanonicalize) && !isDotDot(strCanonicalize)) {
                int i5 = onExtraCallback + 27;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return this;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            throw new IllegalArgumentException("unexpected path segment: " + str);
        }

        Builder removePathSegment(int i) {
            int i2 = 2 % 2;
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                int i3 = onNavigationEvent + 97;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                this.encodedPathSegments.add(QueryParameterParser.FRAGMENT_ENCODE_SET);
                int i5 = onExtraCallback + 11;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 5;
                }
            }
            int i7 = onExtraCallback + 97;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        Builder encodedPath(String str) throws EOFException {
            int i = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedPath == null");
            }
            int i2 = onNavigationEvent + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (str.startsWith("/")) {
                int i4 = onNavigationEvent + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: " + str);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        Builder query(String str) throws EOFException {
            List<String> listQueryStringToNamesAndValues;
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 36 / 0;
                if (str != null) {
                    listQueryStringToNamesAndValues = QueryParameterParser.queryStringToNamesAndValues(QueryParameterParser.canonicalize(str, QueryParameterParser.QUERY_ENCODE_SET, false, true));
                    int i4 = onNavigationEvent + 33;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    listQueryStringToNamesAndValues = null;
                }
            } else if (str != null) {
            }
            this.encodedQueryNamesAndValues = listQueryStringToNamesAndValues;
            return this;
        }

        Builder encodedQuery(String str) throws EOFException {
            List<String> listQueryStringToNamesAndValues;
            int i = 2 % 2;
            Object obj = null;
            if (str != null) {
                int i2 = onNavigationEvent + 85;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                listQueryStringToNamesAndValues = QueryParameterParser.queryStringToNamesAndValues(QueryParameterParser.canonicalize(str, QueryParameterParser.QUERY_ENCODE_SET, true, true));
            } else {
                listQueryStringToNamesAndValues = null;
            }
            this.encodedQueryNamesAndValues = listQueryStringToNamesAndValues;
            int i4 = onNavigationEvent + 3;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        Builder addQueryParameter(String str, String str2) throws EOFException {
            String strCanonicalize;
            int i = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            this.encodedQueryNamesAndValues.add(QueryParameterParser.canonicalize(str, QueryParameterParser.QUERY_COMPONENT_ENCODE_SET, false, true));
            List<String> list = this.encodedQueryNamesAndValues;
            if (str2 != null) {
                strCanonicalize = QueryParameterParser.canonicalize(str2, QueryParameterParser.QUERY_COMPONENT_ENCODE_SET, false, true);
                int i2 = onExtraCallback + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            } else {
                strCanonicalize = null;
            }
            list.add(strCanonicalize);
            int i4 = onExtraCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        Builder addEncodedQueryParameter(String str, String str2) throws EOFException {
            String strCanonicalize;
            int i = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedName == null");
            }
            int i2 = onExtraCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            this.encodedQueryNamesAndValues.add(QueryParameterParser.canonicalize(str, QueryParameterParser.QUERY_COMPONENT_ENCODE_SET, true, true));
            List<String> list = this.encodedQueryNamesAndValues;
            if (str2 != null) {
                strCanonicalize = QueryParameterParser.canonicalize(str2, QueryParameterParser.QUERY_COMPONENT_ENCODE_SET, true, true);
                int i4 = onNavigationEvent + 85;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 3;
                }
            } else {
                strCanonicalize = null;
            }
            list.add(strCanonicalize);
            return this;
        }

        Builder setQueryParameter(String str, String str2) throws EOFException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            int i4 = onNavigationEvent + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        Builder setEncodedQueryParameter(String str, String str2) throws EOFException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                removeAllEncodedQueryParameters(str);
                addEncodedQueryParameter(str, str2);
                int i3 = 6 / 0;
            } else {
                removeAllEncodedQueryParameters(str);
                addEncodedQueryParameter(str, str2);
            }
            int i4 = onNavigationEvent + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        Builder removeAllQueryParameters(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            int i5 = i2 + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (this.encodedQueryNamesAndValues == null) {
                int i7 = i2 + 121;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            removeAllCanonicalQueryParameters(QueryParameterParser.canonicalize(str, QueryParameterParser.QUERY_COMPONENT_ENCODE_SET, false, true));
            return this;
        }

        Builder removeAllEncodedQueryParameters(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (str == null) {
                throw new IllegalArgumentException("encodedName == null");
            }
            int i4 = i3 + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(QueryParameterParser.canonicalize(str, QueryParameterParser.QUERY_COMPONENT_ENCODE_SET, true, true));
            int i6 = onNavigationEvent + 95;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        private void removeAllCanonicalQueryParameters(String str) {
            int i = 2 % 2;
            int size = this.encodedQueryNamesAndValues.size() - 2;
            while (size >= 0) {
                int i2 = onExtraCallback + 81;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    str.equals(this.encodedQueryNamesAndValues.get(size));
                    obj.hashCode();
                    throw null;
                }
                if (str.equals(this.encodedQueryNamesAndValues.get(size))) {
                    int i3 = onExtraCallback + 55;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        int i5 = onExtraCallback + 123;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                }
                size -= 2;
                int i7 = onNavigationEvent + 35;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        }

        Builder fragment(String str) throws EOFException {
            int i = 2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("fragment == null");
            }
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.encodedFragment = QueryParameterParser.canonicalize(str, QueryParameterParser.FRAGMENT_ENCODE_SET, false, false);
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        Builder encodedFragment(String str) throws EOFException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (str == null) {
                throw new IllegalArgumentException("encodedFragment == null");
            }
            this.encodedFragment = QueryParameterParser.canonicalize(str, QueryParameterParser.FRAGMENT_ENCODE_SET, true, false);
            int i4 = onNavigationEvent + 19;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        QueryParameterParser build() {
            int i = 2 % 2;
            if (this.scheme == null) {
                throw new IllegalStateException("scheme == null");
            }
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            QueryParameterParserIA queryParameterParserIA = null;
            if (i2 % 2 != 0) {
                queryParameterParserIA.hashCode();
                throw null;
            }
            if (this.host == null) {
                throw new IllegalStateException("host == null");
            }
            QueryParameterParser queryParameterParser = new QueryParameterParser(this);
            int i3 = onNavigationEvent + 29;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return queryParameterParser;
            }
            throw null;
        }

        public String toString() {
            char c;
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(this.scheme);
            sb.append("://");
            if (!this.encodedUsername.isEmpty() || !this.encodedPassword.isEmpty()) {
                sb.append(this.encodedUsername);
                if (!this.encodedPassword.isEmpty()) {
                    int i2 = onExtraCallback + 39;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            if (this.host.indexOf(58) != -1) {
                int i4 = onNavigationEvent + 89;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    sb.append(' ');
                    sb.append(this.host);
                    c = '5';
                } else {
                    sb.append('[');
                    sb.append(this.host);
                    c = ']';
                }
                sb.append(c);
                int i5 = onNavigationEvent + 5;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                sb.append(this.host);
                int i7 = onExtraCallback + 45;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            int iEffectivePort = effectivePort();
            if (iEffectivePort != QueryParameterParser.defaultPort(this.scheme)) {
                sb.append(':');
                sb.append(iEffectivePort);
            }
            QueryParameterParser.pathSegmentsToString(sb, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                int i9 = onNavigationEvent + 85;
                onExtraCallback = i9 % 128;
                sb.append(i9 % 2 == 0 ? 'j' : '?');
                QueryParameterParser.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        ParseResult parse(QueryParameterParser queryParameterParser, String str) throws NumberFormatException, EOFException {
            int iM104$$Nest$smdelimiterOffset;
            char cCharAt;
            int i;
            int i2 = 2 % 2;
            boolean z = false;
            int iSkipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str, 0, str.length());
            int iSkipTrailingAsciiWhitespace = skipTrailingAsciiWhitespace(str, iSkipLeadingAsciiWhitespace, str.length());
            int iSchemeDelimiterOffset = schemeDelimiterOffset(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace);
            if (iSchemeDelimiterOffset != -1) {
                if (str.regionMatches(true, iSkipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.scheme = "https";
                    iSkipLeadingAsciiWhitespace += 6;
                } else if (str.regionMatches(true, iSkipLeadingAsciiWhitespace, "http:", 0, 5)) {
                    int i3 = onExtraCallback + 15;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    this.scheme = "http";
                    iSkipLeadingAsciiWhitespace += 5;
                } else {
                    String strSubstring = str.substring(iSkipLeadingAsciiWhitespace, iSchemeDelimiterOffset);
                    this.scheme = strSubstring;
                    iSkipLeadingAsciiWhitespace += strSubstring.length() + 1;
                }
            } else {
                if (queryParameterParser == null) {
                    return ParseResult.MISSING_SCHEME;
                }
                int i5 = onNavigationEvent + 87;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    this.scheme = QueryParameterParser.m103$$Nest$fgetscheme(queryParameterParser);
                    int i6 = 18 / 0;
                } else {
                    this.scheme = QueryParameterParser.m103$$Nest$fgetscheme(queryParameterParser);
                }
            }
            int iSlashCount = slashCount(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace);
            char c = '?';
            char c2 = '#';
            if (iSlashCount < 2) {
                int i7 = onExtraCallback + 41;
                int i8 = i7 % 128;
                onNavigationEvent = i8;
                int i9 = i7 % 2;
                if (queryParameterParser != null) {
                    int i10 = i8 + 23;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        QueryParameterParser.m103$$Nest$fgetscheme(queryParameterParser).equals(this.scheme);
                        throw null;
                    }
                    if (QueryParameterParser.m103$$Nest$fgetscheme(queryParameterParser).equals(this.scheme)) {
                        this.encodedUsername = queryParameterParser.encodedUsername();
                        this.encodedPassword = queryParameterParser.encodedPassword();
                        this.host = QueryParameterParser.m101$$Nest$fgethost(queryParameterParser);
                        this.port = QueryParameterParser.m102$$Nest$fgetport(queryParameterParser);
                        this.encodedPathSegments.clear();
                        this.encodedPathSegments.addAll(queryParameterParser.encodedPathSegments());
                        if (iSkipLeadingAsciiWhitespace == iSkipTrailingAsciiWhitespace || str.charAt(iSkipLeadingAsciiWhitespace) == '#') {
                            encodedQuery(queryParameterParser.encodedQuery());
                        }
                    } else {
                        int i11 = iSkipLeadingAsciiWhitespace + iSlashCount;
                        boolean z2 = false;
                        while (true) {
                            iM104$$Nest$smdelimiterOffset = QueryParameterParser.m104$$Nest$smdelimiterOffset(str, i11, iSkipTrailingAsciiWhitespace, "@/\\?#");
                            if (iM104$$Nest$smdelimiterOffset != iSkipTrailingAsciiWhitespace) {
                                int i12 = onExtraCallback + 115;
                                onNavigationEvent = i12 % 128;
                                int i13 = i12 % 2;
                                cCharAt = str.charAt(iM104$$Nest$smdelimiterOffset);
                            } else {
                                cCharAt = 65535;
                            }
                            if (cCharAt == 65535 || cCharAt == c2 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c) {
                                break;
                            }
                            if (cCharAt == '@') {
                                if (z) {
                                    i = iM104$$Nest$smdelimiterOffset;
                                    this.encodedPassword += "%40" + QueryParameterParser.canonicalize(str, i11, i, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                } else {
                                    int iM104$$Nest$smdelimiterOffset2 = QueryParameterParser.m104$$Nest$smdelimiterOffset(str, i11, iM104$$Nest$smdelimiterOffset, ":");
                                    i = iM104$$Nest$smdelimiterOffset;
                                    String strCanonicalize = QueryParameterParser.canonicalize(str, i11, iM104$$Nest$smdelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                    if (z2) {
                                        strCanonicalize = this.encodedUsername + "%40" + strCanonicalize;
                                    }
                                    this.encodedUsername = strCanonicalize;
                                    if (iM104$$Nest$smdelimiterOffset2 != i) {
                                        int i14 = onExtraCallback + 61;
                                        onNavigationEvent = i14 % 128;
                                        int i15 = i14 % 2;
                                        this.encodedPassword = QueryParameterParser.canonicalize(str, iM104$$Nest$smdelimiterOffset2 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                        z = true;
                                    }
                                    z2 = true;
                                }
                                i11 = i + 1;
                                c = '?';
                                c2 = '#';
                            }
                        }
                        int iPortColonOffset = portColonOffset(str, i11, iM104$$Nest$smdelimiterOffset);
                        int i16 = iPortColonOffset + 1;
                        if (i16 < iM104$$Nest$smdelimiterOffset) {
                            this.host = canonicalizeHost(str, i11, iPortColonOffset);
                            int port = parsePort(str, i16, iM104$$Nest$smdelimiterOffset);
                            this.port = port;
                            if (port == -1) {
                                return ParseResult.INVALID_PORT;
                            }
                        } else {
                            this.host = canonicalizeHost(str, i11, iPortColonOffset);
                            this.port = QueryParameterParser.defaultPort(this.scheme);
                        }
                        if (this.host == null) {
                            return ParseResult.INVALID_HOST;
                        }
                        iSkipLeadingAsciiWhitespace = iM104$$Nest$smdelimiterOffset;
                    }
                }
            }
            int iM104$$Nest$smdelimiterOffset3 = QueryParameterParser.m104$$Nest$smdelimiterOffset(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace, "?#");
            resolvePath(str, iSkipLeadingAsciiWhitespace, iM104$$Nest$smdelimiterOffset3);
            if (iM104$$Nest$smdelimiterOffset3 < iSkipTrailingAsciiWhitespace) {
                int i17 = onExtraCallback + 1;
                onNavigationEvent = i17 % 128;
                if (i17 % 2 == 0 ? str.charAt(iM104$$Nest$smdelimiterOffset3) == '?' : str.charAt(iM104$$Nest$smdelimiterOffset3) == 4) {
                    int iM104$$Nest$smdelimiterOffset4 = QueryParameterParser.m104$$Nest$smdelimiterOffset(str, iM104$$Nest$smdelimiterOffset3, iSkipTrailingAsciiWhitespace, "#");
                    this.encodedQueryNamesAndValues = QueryParameterParser.queryStringToNamesAndValues(QueryParameterParser.canonicalize(str, iM104$$Nest$smdelimiterOffset3 + 1, iM104$$Nest$smdelimiterOffset4, QueryParameterParser.QUERY_ENCODE_SET, true, true));
                    iM104$$Nest$smdelimiterOffset3 = iM104$$Nest$smdelimiterOffset4;
                }
            }
            if (iM104$$Nest$smdelimiterOffset3 < iSkipTrailingAsciiWhitespace && str.charAt(iM104$$Nest$smdelimiterOffset3) == '#') {
                this.encodedFragment = QueryParameterParser.canonicalize(str, 1 + iM104$$Nest$smdelimiterOffset3, iSkipTrailingAsciiWhitespace, QueryParameterParser.FRAGMENT_ENCODE_SET, true, false);
            }
            return ParseResult.SUCCESS;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void resolvePath(String str, int i, int i2) throws EOFException {
            int i3 = 2 % 2;
            if (i != i2) {
                int i4 = onExtraCallback + 59;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                char cCharAt = str.charAt(i);
                if (cCharAt != '/') {
                    int i6 = onExtraCallback + 95;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0 ? cCharAt == '\\' : cCharAt == 'i') {
                        this.encodedPathSegments.clear();
                        this.encodedPathSegments.add(QueryParameterParser.FRAGMENT_ENCODE_SET);
                        i++;
                    } else {
                        List<String> list = this.encodedPathSegments;
                        list.set(list.size() - 1, QueryParameterParser.FRAGMENT_ENCODE_SET);
                    }
                }
                int i7 = i;
                while (i7 < i2) {
                    int iM104$$Nest$smdelimiterOffset = QueryParameterParser.m104$$Nest$smdelimiterOffset(str, i7, i2, "/\\");
                    boolean z = iM104$$Nest$smdelimiterOffset < i2;
                    push(str, i7, iM104$$Nest$smdelimiterOffset, z, true);
                    if (z) {
                        iM104$$Nest$smdelimiterOffset++;
                    }
                    i7 = iM104$$Nest$smdelimiterOffset;
                    int i8 = onExtraCallback + 117;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        }

        private void push(String str, int i, int i2, boolean z, boolean z2) throws EOFException {
            int i3 = 2 % 2;
            String strCanonicalize = QueryParameterParser.canonicalize(str, i, i2, QueryParameterParser.PATH_SEGMENT_ENCODE_SET, z2, false);
            if (isDot(strCanonicalize)) {
                return;
            }
            if (!isDotDot(strCanonicalize)) {
                List<String> list = this.encodedPathSegments;
                if (!(!list.get(list.size() - 1).isEmpty())) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, strCanonicalize);
                } else {
                    this.encodedPathSegments.add(strCanonicalize);
                }
                if (z) {
                    this.encodedPathSegments.add(QueryParameterParser.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            }
            int i4 = onNavigationEvent + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            pop();
            int i6 = onExtraCallback + 59;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private boolean isDot(String str) {
            int i = 2 % 2;
            if (!str.equals(".")) {
                int i2 = onNavigationEvent + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                if (!str.equalsIgnoreCase("%2e")) {
                    int i4 = onNavigationEvent + 95;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
            }
            return true;
        }

        private boolean isDotDot(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (!str.equals("..") && !str.equalsIgnoreCase("%2e.") && !str.equalsIgnoreCase(".%2e")) {
                    int i3 = onNavigationEvent + 63;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (!str.equalsIgnoreCase("%2e%2e")) {
                        return false;
                    }
                }
                return true;
            }
            str.equals("..");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void pop() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                List<String> list = this.encodedPathSegments;
                if (list.remove(list.size()).isEmpty()) {
                    if (!this.encodedPathSegments.isEmpty()) {
                        this.encodedPathSegments.set(r0.size() - 1, QueryParameterParser.FRAGMENT_ENCODE_SET);
                        return;
                    }
                }
            } else {
                if (this.encodedPathSegments.remove(r1.size() - 1).isEmpty()) {
                }
            }
            this.encodedPathSegments.add(QueryParameterParser.FRAGMENT_ENCODE_SET);
            int i3 = onNavigationEvent + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }

        private int skipLeadingAsciiWhitespace(String str, int i, int i2) {
            int i3 = 2 % 2;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && cCharAt != '\n') {
                    int i4 = onNavigationEvent;
                    int i5 = i4 + 23;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (cCharAt != '\f') {
                        int i7 = i4 + 85;
                        int i8 = i7 % 128;
                        onExtraCallback = i8;
                        int i9 = i7 % 2;
                        if (cCharAt != '\r' && cCharAt != ' ') {
                            int i10 = i8 + 13;
                            int i11 = i10 % 128;
                            onNavigationEvent = i11;
                            if (i10 % 2 != 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i12 = i11 + 89;
                            onExtraCallback = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 31 / 0;
                            }
                            return i;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0011 -> B:6:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private int skipTrailingAsciiWhitespace(String str, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            i2 = i4 % 2 != 0 ? i2 + 79 : i2 - 1;
            if (i2 < i) {
                return i;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                int i5 = onNavigationEvent + 37;
                onExtraCallback = i5 % 128;
                return i5 % 2 == 0 ? i2 >> 1 : i2 + 1;
            }
            if (i2 < i) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[PHI: r1
          0x003e: PHI (r1v11 char) = (r1v6 char), (r1v12 char) binds: [B:18:0x003c, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int schemeDelimiterOffset(String str, int i, int i2) {
            char cCharAt;
            int i3 = 2 % 2;
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || (cCharAt2 >= 'A' && cCharAt2 <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    int i4 = onExtraCallback + 11;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        cCharAt = str.charAt(i);
                        if (cCharAt >= 29) {
                            int i5 = onExtraCallback + 57;
                            onNavigationEvent = i5 % 128;
                            if (i5 % 2 != 0) {
                                if (cCharAt <= 2) {
                                    continue;
                                }
                            } else if (cCharAt <= 'z') {
                                continue;
                            }
                        }
                        if (cCharAt >= 'A' || cCharAt > 'Z') {
                            if (cCharAt >= '0' || cCharAt > '9') {
                                if (cCharAt != '+' && cCharAt != '-') {
                                    if (cCharAt == '.') {
                                        int i6 = onNavigationEvent + 71;
                                        onExtraCallback = i6 % 128;
                                        int i7 = i6 % 2;
                                    } else if (cCharAt == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    } else {
                        cCharAt = str.charAt(i);
                        if (cCharAt >= 'a') {
                        }
                        if (cCharAt >= 'A') {
                        }
                        if (cCharAt >= '0') {
                        }
                        if (cCharAt != '+') {
                            continue;
                        }
                    }
                }
            }
            return -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r2
          0x002b: PHI (r2v5 char) = (r2v4 char), (r2v6 char) binds: [B:10:0x0029, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int slashCount(String str, int i, int i2) {
            char cCharAt;
            int i3 = 2 % 2;
            int i4 = onNavigationEvent + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i < i2) {
                int i7 = onNavigationEvent + 83;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    cCharAt = str.charAt(i);
                    if (cCharAt == 'm') {
                        continue;
                    } else if (cCharAt != '/') {
                        break;
                    }
                    i6++;
                    i++;
                } else {
                    cCharAt = str.charAt(i);
                    if (cCharAt == '\\') {
                        continue;
                    }
                    i6++;
                    i++;
                }
            }
            return i6;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int portColonOffset(String str, int i, int i2) {
            int i3 = 2 % 2;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    int i4 = onNavigationEvent + 123;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 34 / 0;
                    }
                    return i;
                }
                int i6 = onExtraCallback + 69;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    if (cCharAt == '\b') {
                        while (true) {
                            i++;
                            if (i < i2) {
                                int i7 = onExtraCallback + 99;
                                onNavigationEvent = i7 % 128;
                                if (i7 % 2 != 0) {
                                    if (str.charAt(i) == '(') {
                                        break;
                                    }
                                } else if (str.charAt(i) == ']') {
                                    break;
                                }
                            }
                        }
                        int i8 = onNavigationEvent + 63;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 58 / 0;
                        }
                    }
                } else if (cCharAt != '[') {
                }
                i++;
            }
            return i2;
        }

        private static String canonicalizeHost(String str, int i, int i2) {
            int i3 = 2 % 2;
            String strPercentDecode = QueryParameterParser.percentDecode(str, i, i2);
            if (!strPercentDecode.startsWith("[") || !strPercentDecode.endsWith("]")) {
                return domainToAscii(strPercentDecode);
            }
            InetAddress inetAddressDecodeIpv6 = decodeIpv6(strPercentDecode, 1, strPercentDecode.length() - 1);
            if (inetAddressDecodeIpv6 == null) {
                int i4 = onExtraCallback + 51;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 64 / 0;
                }
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length != 16) {
                throw new AssertionError();
            }
            int i6 = onExtraCallback + 107;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return inet6AddressToAscii(address);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
        
            if (r8 == 16) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
        
            if (r9 != (-1)) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
        
            r0 = im.toss.deeplink.QueryParameterParser.Builder.onNavigationEvent + 7;
            im.toss.deeplink.QueryParameterParser.Builder.onExtraCallback = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00d2, code lost:
        
            if ((r0 % 2) == 0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d4, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
        
            r0 = r8 - r9;
            java.lang.System.arraycopy(r4, r9, r4, 16 - r0, r0);
            java.util.Arrays.fill(r4, r9, (16 - r8) + r9, (byte) 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00e7, code lost:
        
            return java.net.InetAddress.getByAddress(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
        
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00c4 A[EDGE_INSN: B:70:0x00c4->B:50:0x00c4 BREAK  A[LOOP:0: B:3:0x0012->B:49:0x00b5], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static InetAddress decodeIpv6(String str, int i, int i2) {
            int i3;
            int i4;
            int i5 = 2 % 2;
            byte[] bArr = new byte[16];
            int i6 = 0;
            int i7 = i;
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            while (true) {
                if (i7 >= i2) {
                    break;
                }
                int i11 = onNavigationEvent + 109;
                int i12 = i11 % 128;
                onExtraCallback = i12;
                if (i11 % 2 == 0) {
                    if (i10 == 15) {
                        break;
                    }
                    i3 = i7 + 2;
                    if (i3 <= i2) {
                        int i13 = i12 + 103;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                        if (str.regionMatches(i7, "::", i6, 2)) {
                            if (i8 == -1) {
                                i10 += 2;
                                i8 = i10;
                                if (i3 != i2) {
                                    i9 = i3;
                                    int i15 = i6;
                                    i7 = i9;
                                    while (i7 < i2) {
                                        int i16 = onExtraCallback + 3;
                                        onNavigationEvent = i16 % 128;
                                        int i17 = i16 % 2;
                                        int iDecodeHexDigit = QueryParameterParser.decodeHexDigit(str.charAt(i7));
                                        if (iDecodeHexDigit == -1) {
                                            break;
                                        }
                                        i15 = (i15 << 4) + iDecodeHexDigit;
                                        i7++;
                                    }
                                    i4 = i7 - i9;
                                    if (i4 == 0) {
                                        break;
                                    }
                                    int i18 = onExtraCallback + 103;
                                    onNavigationEvent = i18 % 128;
                                    int i19 = i18 % 2;
                                    if (i4 > 4) {
                                        break;
                                    }
                                    bArr[i10] = (byte) (i15 >>> 8);
                                    bArr[i10 + 1] = (byte) i15;
                                    i10 += 2;
                                    i6 = 0;
                                } else {
                                    break;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                    if (i10 != 0) {
                        if (str.regionMatches(i7, ":", i6, 1)) {
                            i7++;
                        } else {
                            if (!str.regionMatches(i7, ".", i6, 1)) {
                                return null;
                            }
                            int i20 = onNavigationEvent + 91;
                            onExtraCallback = i20 % 128;
                            if (i20 % 2 != 0 ? !decodeIpv4Suffix(str, i9, i2, bArr, i10 - 2) : !decodeIpv4Suffix(str, i9, i2, bArr, i10 >>> 2)) {
                                int i21 = onNavigationEvent + 9;
                                onExtraCallback = i21 % 128;
                                int i22 = i21 % 2;
                                return null;
                            }
                            i10 += 2;
                        }
                    }
                    i9 = i7;
                    int i152 = i6;
                    i7 = i9;
                    while (i7 < i2) {
                    }
                    i4 = i7 - i9;
                    if (i4 == 0) {
                    }
                } else {
                    if (i10 == 16) {
                        break;
                    }
                    i3 = i7 + 2;
                    if (i3 <= i2) {
                    }
                    if (i10 != 0) {
                    }
                    i9 = i7;
                    int i1522 = i6;
                    i7 = i9;
                    while (i7 < i2) {
                    }
                    i4 = i7 - i9;
                    if (i4 == 0) {
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = 2 % 2;
            int i5 = i3;
            while (i < i2) {
                if (i5 == bArr.length) {
                    int i6 = onNavigationEvent + 33;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (i5 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i8 = i;
                int i9 = 0;
                while (i8 < i2) {
                    char cCharAt = str.charAt(i8);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    int i10 = onNavigationEvent;
                    int i11 = i10 + 25;
                    int i12 = i11 % 128;
                    onExtraCallback = i12;
                    if (i11 % 2 == 0) {
                        int i13 = 47 / 0;
                        if (i9 == 0) {
                            if (i != i8) {
                                return false;
                            }
                        }
                    } else if (i9 == 0) {
                    }
                    i9 = ((i9 * 10) + cCharAt) - 48;
                    if (i9 > 255) {
                        int i14 = i12 + 55;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        return false;
                    }
                    i8++;
                    int i16 = i10 + 53;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                }
                if (i8 - i == 0) {
                    return false;
                }
                bArr[i5] = (byte) i9;
                i5++;
                i = i8;
            }
            if (i5 == i3 + 4) {
                return true;
            }
            int i18 = onExtraCallback + 77;
            onNavigationEvent = i18 % 128;
            return i18 % 2 != 0;
        }

        private static String domainToAscii(String str) {
            String lowerCase;
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            try {
                lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            } catch (IllegalArgumentException unused) {
            }
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (!containsInvalidHostnameAsciiCodes(lowerCase)) {
                return lowerCase;
            }
            int i4 = onNavigationEvent + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[LOOP:0: B:3:0x000e->B:17:0x0043, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static boolean containsInvalidHostnameAsciiCodes(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 0;
            while (i4 < str.length()) {
                int i5 = onNavigationEvent + 61;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                char cCharAt = str.charAt(i4);
                if (cCharAt > 31) {
                    int i7 = onNavigationEvent + 123;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        if (cCharAt >= 5) {
                        }
                        if (" #%/:?@[\\]".indexOf(cCharAt) == -1) {
                            return true;
                        }
                        i4++;
                        int i8 = onExtraCallback + 91;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        if (cCharAt >= 127) {
                        }
                        if (" #%/:?@[\\]".indexOf(cCharAt) == -1) {
                        }
                    }
                }
                return true;
            }
            return false;
        }

        private static String inet6AddressToAscii(byte[] bArr) {
            int i = 2 % 2;
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (i4 < bArr.length) {
                int i6 = i4;
                while (i6 < 16) {
                    int i7 = onExtraCallback + 121;
                    int i8 = i7 % 128;
                    onNavigationEvent = i8;
                    int i9 = i7 % 2;
                    if (bArr[i6] != 0) {
                        break;
                    }
                    int i10 = i8 + 47;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    if (bArr[i6 + 1] != 0) {
                        break;
                    }
                    i6 += 2;
                }
                int i12 = i6 - i4;
                if (i12 > i5) {
                    int i13 = onNavigationEvent + 77;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    i3 = i4;
                    i5 = i12;
                }
                i4 = i6 + 2;
            }
            TTBaseActivity tTBaseActivity = new TTBaseActivity();
            while (i2 < bArr.length) {
                if (i2 == i3) {
                    tTBaseActivity.onWarmupCompleted(58);
                    i2 += i5;
                    if (i2 == 16) {
                        tTBaseActivity.onWarmupCompleted(58);
                    }
                } else {
                    if (i2 > 0) {
                        tTBaseActivity.onWarmupCompleted(58);
                    }
                    tTBaseActivity.IAuthTabCallback_Parcel(((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255));
                    i2 += 2;
                    int i15 = onExtraCallback + 109;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            return tTBaseActivity.onRelationshipValidationResult();
        }

        private static int parsePort(String str, int i, int i2) throws NumberFormatException {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            try {
                int i6 = Integer.parseInt(QueryParameterParser.canonicalize(str, i, i2, QueryParameterParser.FRAGMENT_ENCODE_SET, false, false));
                if (i6 > 0) {
                    int i7 = onNavigationEvent + 105;
                    int i8 = i7 % 128;
                    onExtraCallback = i8;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    if (i6 <= 65535) {
                        int i9 = i8 + 33;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        return i6;
                    }
                }
                return -1;
            } catch (EOFException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    String query() {
        int i = 2 % 2;
        if (this.queryNamesAndValues != null) {
            StringBuilder sb = new StringBuilder();
            namesAndValuesToQueryString(sb, this.queryNamesAndValues);
            return sb.toString();
        }
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = i2 + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    List<String> getQueryNamesAndValues() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.queryNamesAndValues;
        int i4 = i3 + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    int querySize() {
        int i = 2 % 2;
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0 ? list.size() + 4 : list.size() / 2;
        }
        int i3 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r1 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r3 >= r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        r4 = im.toss.deeplink.QueryParameterParser.onExtraCallbackWithResult + 117;
        im.toss.deeplink.QueryParameterParser.onWarmupCompleted = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r7.equals(r6.queryNamesAndValues.get(r3)) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return r6.queryNamesAndValues.get(r3 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r3 = r3 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String queryParameter(String str) {
        List<String> list;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            list = this.queryNamesAndValues;
            int i4 = 83 / 0;
        } else {
            list = this.queryNamesAndValues;
        }
    }

    public Set<String> queryParameterNames() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this.queryNamesAndValues != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = this.queryNamesAndValues.size();
            for (int i5 = 0; i5 < size; i5 += 2) {
                linkedHashSet.add(this.queryNamesAndValues.get(i5));
            }
            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
            int i6 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 14 / 0;
            }
            return setUnmodifiableSet;
        }
        int i8 = i3 + 65;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return Collections.EMPTY_SET;
        }
        int i9 = 67 / 0;
        return Collections.EMPTY_SET;
    }

    public List<String> queryParameterValues(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.queryNamesAndValues == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            int size = this.queryNamesAndValues.size();
            for (int i3 = 0; i3 < size; i3 += 2) {
                if (str.equals(this.queryNamesAndValues.get(i3))) {
                    arrayList.add(this.queryNamesAndValues.get(i3 + 1));
                }
            }
            List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            int i4 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return listUnmodifiableList;
        }
        throw null;
    }

    String queryParameterName(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.queryNamesAndValues.get(i << 1);
        int i5 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    String queryParameterValue(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.queryNamesAndValues.get((i << 1) + 1);
        int i5 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    String encodedFragment() {
        int i = 2 % 2;
        Object obj = null;
        if (this.fragment != null) {
            String strSubstring = this.url.substring(this.url.indexOf(35) + 1);
            int i2 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return strSubstring;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    String fragment() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.fragment;
        int i5 = i3 + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    QueryParameterParser resolve(String str) throws EOFException {
        int i = 2 % 2;
        Builder builder = new Builder();
        if (builder.parse(this, str) != Builder.ParseResult.SUCCESS) {
            int i2 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return builder.build();
        }
        int i4 = 38 / 0;
        return builder.build();
    }

    Builder newBuilder() throws EOFException {
        int i = 2 % 2;
        Builder builder = new Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        builder.port = this.port;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return builder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static QueryParameterParser parse(String str) throws EOFException {
        QueryParameterParser queryParameterParserBuild;
        int i = 2 % 2;
        Builder builder = new Builder();
        Object obj = null;
        if (builder.parse(null, str) != Builder.ParseResult.SUCCESS) {
            return null;
        }
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            queryParameterParserBuild = builder.build();
            int i3 = 64 / 0;
        } else {
            queryParameterParserBuild = builder.build();
        }
        int i4 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return queryParameterParserBuild;
        }
        obj.hashCode();
        throw null;
    }

    static QueryParameterParser get(URL url) throws EOFException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String string = url.toString();
        if (i3 == 0) {
            return parse(string);
        }
        parse(string);
        throw null;
    }

    /* renamed from: im.toss.deeplink.QueryParameterParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$im$toss$deeplink$QueryParameterParser$Builder$ParseResult;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[Builder.ParseResult.values().length];
            $SwitchMap$im$toss$deeplink$QueryParameterParser$Builder$ParseResult = iArr;
            try {
                iArr[Builder.ParseResult.SUCCESS.ordinal()] = 1;
                int i = onNavigationEvent + 19;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$im$toss$deeplink$QueryParameterParser$Builder$ParseResult[Builder.ParseResult.INVALID_HOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$im$toss$deeplink$QueryParameterParser$Builder$ParseResult[Builder.ParseResult.UNSUPPORTED_SCHEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$im$toss$deeplink$QueryParameterParser$Builder$ParseResult[Builder.ParseResult.MISSING_SCHEME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$im$toss$deeplink$QueryParameterParser$Builder$ParseResult[Builder.ParseResult.INVALID_PORT.ordinal()] = 5;
                int i4 = onNavigationEvent + 111;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 87 / 0;
                }
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static QueryParameterParser getChecked(String str) throws MalformedURLException, NumberFormatException, EOFException, UnknownHostException {
        int i = 2 % 2;
        Builder builder = new Builder();
        Builder.ParseResult parseResult = builder.parse(null, str);
        int i2 = AnonymousClass1.$SwitchMap$im$toss$deeplink$QueryParameterParser$Builder$ParseResult[parseResult.ordinal()];
        if (i2 != 1) {
            int i3 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (i2 == 2) {
                throw new UnknownHostException("Invalid host: " + str);
            }
            throw new MalformedURLException("Invalid URL: " + parseResult + " for " + str);
        }
        QueryParameterParser queryParameterParserBuild = builder.build();
        int i5 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return queryParameterParserBuild;
    }

    static QueryParameterParser get(URI uri) throws EOFException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String string = uri.toString();
        if (i3 == 0) {
            parse(string);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        QueryParameterParser queryParameterParser = parse(string);
        int i4 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return queryParameterParser;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof QueryParameterParser)) {
            return false;
        }
        int i5 = i2 + 83;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        if (!((QueryParameterParser) obj).url.equals(this.url)) {
            return false;
        }
        int i7 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.url.hashCode();
        int i4 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int delimiterOffset(String str, int i, int i2, String str2) {
        int i3 = 2 % 2;
        while (i < i2) {
            int i4 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                str2.indexOf(str.charAt(i));
                throw null;
            }
            if (str2.indexOf(str.charAt(i)) != -1) {
                int i5 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return i;
                }
                throw null;
            }
            i++;
        }
        return i2;
    }

    static String percentDecode(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strPercentDecode = percentDecode(str, 0, str.length());
        int i4 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return strPercentDecode;
    }

    private List<String> percentDecode(List<String> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            int i2 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strPercentDecode = null;
            if (str != null) {
                int i4 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    percentDecode(str);
                    strPercentDecode.hashCode();
                    throw null;
                }
                strPercentDecode = percentDecode(str);
            }
            arrayList.add(strPercentDecode);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String percentDecode(String str, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = i; i6 < i2; i6++) {
            int i7 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                if (str.charAt(i6) == '=') {
                    TTBaseActivity tTBaseActivity = new TTBaseActivity();
                    tTBaseActivity.onExtraCallbackWithResult(str, i, i6);
                    percentDecode(tTBaseActivity, str, i6, i2);
                    return tTBaseActivity.onRelationshipValidationResult();
                }
            } else {
                if (str.charAt(i6) == '%') {
                    TTBaseActivity tTBaseActivity2 = new TTBaseActivity();
                    tTBaseActivity2.onExtraCallbackWithResult(str, i, i6);
                    percentDecode(tTBaseActivity2, str, i6, i2);
                    return tTBaseActivity2.onRelationshipValidationResult();
                }
            }
        }
        String strSubstring = str.substring(i, i2);
        int i8 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return strSubstring;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void percentDecode(TTBaseActivity tTBaseActivity, String str, int i, int i2) {
        int i3 = 2 % 2;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37) {
                int i4 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i + 2;
                if (i6 < i2) {
                    int iDecodeHexDigit = decodeHexDigit(str.charAt(i + 1));
                    int iDecodeHexDigit2 = decodeHexDigit(str.charAt(i6));
                    if (iDecodeHexDigit != -1 && iDecodeHexDigit2 != -1) {
                        int i7 = onWarmupCompleted + 17;
                        onExtraCallbackWithResult = i7 % 128;
                        tTBaseActivity.onWarmupCompleted(i7 % 2 != 0 ? (iDecodeHexDigit - 2) >>> iDecodeHexDigit2 : (iDecodeHexDigit << 4) + iDecodeHexDigit2);
                        i = i6;
                    } else {
                        tTBaseActivity.IAuthTabCallbackStubProxy(iCodePointAt);
                    }
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String canonicalize(String str, int i, int i2, String str2, boolean z, boolean z2) throws EOFException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt < 127 && str2.indexOf(iCodePointAt) == -1) {
                if (iCodePointAt == 37) {
                    int i6 = onWarmupCompleted + 113;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    if (z) {
                        if (!z2 || iCodePointAt != 43) {
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                }
            }
            TTBaseActivity tTBaseActivity = new TTBaseActivity();
            tTBaseActivity.onExtraCallbackWithResult(str, i, iCharCount);
            canonicalize(tTBaseActivity, str, iCharCount, i2, str2, z, z2);
            return tTBaseActivity.onRelationshipValidationResult();
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void canonicalize(TTBaseActivity tTBaseActivity, String str, int i, int i2, String str2, boolean z, boolean z2) throws EOFException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        TTBaseActivity tTBaseActivity2 = null;
        while (i < i2) {
            int i6 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int iCodePointAt = str.codePointAt(i);
            if (z) {
                if (iCodePointAt != 9) {
                    int i8 = onWarmupCompleted;
                    int i9 = i8 + 47;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        if (iCodePointAt != 83) {
                            int i10 = i8 + 91;
                            int i11 = i10 % 128;
                            onExtraCallbackWithResult = i11;
                            int i12 = i10 % 2;
                            if (iCodePointAt == 12) {
                                continue;
                            } else if (iCodePointAt == 13) {
                                int i13 = i11 + 55;
                                onWarmupCompleted = i13 % 128;
                                int i14 = i13 % 2;
                            }
                        } else {
                            continue;
                        }
                    } else if (iCodePointAt == 10) {
                        continue;
                    }
                } else {
                    continue;
                }
            } else if (!(!z2)) {
                int i15 = onExtraCallbackWithResult + 25;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                if (iCodePointAt == 43) {
                    tTBaseActivity.onNavigationEvent(z ? "%20" : "%2B");
                } else if (iCodePointAt >= 32) {
                    int i17 = onExtraCallbackWithResult + 83;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    if (iCodePointAt >= 127 || str2.indexOf(iCodePointAt) != -1) {
                        if (tTBaseActivity2 == null) {
                            tTBaseActivity2 = new TTBaseActivity();
                        }
                        tTBaseActivity2.IAuthTabCallbackStubProxy(iCodePointAt);
                        while (!tTBaseActivity2.IAuthTabCallback_Parcel()) {
                            try {
                                byte bICustomTabsCallback = tTBaseActivity2.ICustomTabsCallback();
                                tTBaseActivity.onWarmupCompleted(37);
                                char[] cArr = HEX_DIGITS;
                                tTBaseActivity.onWarmupCompleted(cArr[((bICustomTabsCallback & 255) >> 4) & 15]);
                                tTBaseActivity.onWarmupCompleted(cArr[bICustomTabsCallback & 15]);
                            } catch (EOFException unused) {
                                System.err.println("Unable to canonicalize deeplink url!");
                            }
                        }
                    } else {
                        int i19 = onWarmupCompleted + 89;
                        int i20 = i19 % 128;
                        onExtraCallbackWithResult = i20;
                        int i21 = i19 % 2;
                        if (iCodePointAt == 37) {
                            int i22 = i20 + 85;
                            onWarmupCompleted = i22 % 128;
                            if (i22 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (z) {
                            }
                        }
                        tTBaseActivity.IAuthTabCallbackStubProxy(iCodePointAt);
                    }
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    static String canonicalize(String str, String str2, boolean z, boolean z2) throws EOFException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? canonicalize(str, 0, str.length(), str2, z, z2) : canonicalize(str, 0, str.length(), str2, z, z2);
    }
}
