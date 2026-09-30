package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.TTHistoryActivity4;
import okhttp3.internal._HostnamesCommonKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String str, @NotNull SSLSession sSLSession) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sSLSession, "");
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "");
            return verify(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(@NotNull String str, @NotNull X509Certificate x509Certificate) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(x509Certificate, "");
        return _HostnamesCommonKt.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(canonicalHost, _HostnamesCommonKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) TTHistoryActivity4.onNavigationEvent(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt__StringsJVMKt.startsWith$default(str, ".", false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !StringsKt__StringsJVMKt.startsWith$default(str2, ".", false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(str2, "..", false, 2, null)) {
            if (!StringsKt__StringsJVMKt.endsWith$default(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!StringsKt__StringsJVMKt.endsWith$default(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strAsciiToLowercase = asciiToLowercase(str2);
            if (!StringsKt__StringsKt.contains$default((CharSequence) strAsciiToLowercase, (CharSequence) "*", false, 2, (Object) null)) {
                return Intrinsics.areEqual(str3, strAsciiToLowercase);
            }
            if (!StringsKt__StringsJVMKt.startsWith$default(strAsciiToLowercase, "*.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) strAsciiToLowercase, '*', 1, false, 4, (Object) null) != -1 || str3.length() < strAsciiToLowercase.length() || Intrinsics.areEqual("*.", strAsciiToLowercase)) {
                return false;
            }
            String strSubstring = strAsciiToLowercase.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            if (!StringsKt__StringsJVMKt.endsWith$default(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, '.', length + (-1), false, 4, (Object) null) == -1;
        }
        return false;
    }

    public final List<String> allSubjectAltNames(@NotNull X509Certificate x509Certificate) throws CertificateParsingException {
        Intrinsics.checkNotNullParameter(x509Certificate, "");
        return CollectionsKt___CollectionsKt.plus((Collection) getSubjectAltNames(x509Certificate, 7), (Iterable) getSubjectAltNames(x509Certificate, 2));
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
