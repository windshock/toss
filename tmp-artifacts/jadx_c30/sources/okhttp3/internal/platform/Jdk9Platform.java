package okhttp3.internal.platform;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class Jdk9Platform extends Platform {
    public static final Companion Companion = new Companion(null);
    private static final boolean isAvailable;
    private static final Integer majorVersion;

    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<Protocol> list) {
        Intrinsics.checkNotNullParameter(sSLSocket, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) Platform.Companion.alpnProtocolNames(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, BuildConfig.FLAVOR);
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (Intrinsics.areEqual(applicationProtocol, BuildConfig.FLAVOR)) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory) {
        Intrinsics.checkNotNullParameter(sSLSocketFactory, BuildConfig.FLAVOR);
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 8 (>= 252) or JDK 9+");
    }

    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext;
        Integer num = majorVersion;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            Intrinsics.checkNotNullExpressionValue(sSLContext2, BuildConfig.FLAVOR);
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance("TLS");
        }
        Intrinsics.checkNotNull(sSLContext);
        return sSLContext;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isAvailable() {
            return Jdk9Platform.isAvailable;
        }

        public final Integer getMajorVersion() {
            return Jdk9Platform.majorVersion;
        }

        public final Jdk9Platform buildIfSupported() {
            if (isAvailable()) {
                return new Jdk9Platform();
            }
            return null;
        }
    }

    static {
        boolean z;
        String property = System.getProperty("java.specification.version");
        Integer intOrNull = property != null ? StringsKt.toIntOrNull(property) : null;
        majorVersion = intOrNull;
        if (intOrNull != null) {
            z = intOrNull.intValue() >= 9;
        } else {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        isAvailable = z;
    }
}
