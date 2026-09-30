package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getFaultAddress;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ConnectionSpec {
    private static final List<CipherSuite> APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final Companion Companion = new Companion(null);
    public static final ConnectionSpec MODERN_TLS;
    private static final List<CipherSuite> RESTRICTED_CIPHER_SUITES;
    public static final ConnectionSpec RESTRICTED_TLS;
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final String[] tlsVersionsAsString;

    public ConnectionSpec(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    public final boolean isTls() {
        return this.isTls;
    }

    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final String[] getCipherSuitesAsString$okhttp() {
        return this.cipherSuitesAsString;
    }

    public final List<CipherSuite> cipherSuites() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.Companion.forJavaName(str));
        }
        return arrayList;
    }

    @Deprecated
    /* renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final List<CipherSuite> m191deprecated_cipherSuites() {
        return cipherSuites();
    }

    public final List<TlsVersion> tlsVersions() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.Companion.forJavaName(str));
        }
        return arrayList;
    }

    @Deprecated
    /* renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final List<TlsVersion> m193deprecated_tlsVersions() {
        return tlsVersions();
    }

    @Deprecated
    /* renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m192deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final void apply$okhttp(@NotNull SSLSocket sSLSocket, boolean z) {
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        ConnectionSpec connectionSpecSupportedSpec = supportedSpec(sSLSocket, z);
        if (connectionSpecSupportedSpec.tlsVersions() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecSupportedSpec.tlsVersionsAsString);
        }
        if (connectionSpecSupportedSpec.cipherSuites() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecSupportedSpec.cipherSuitesAsString);
        }
    }

    private final ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        Intrinsics.checkNotNull(enabledCipherSuites);
        String[] strArrEffectiveCipherSuites = Internal.effectiveCipherSuites(this, enabledCipherSuites);
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "");
            enabledProtocols = _UtilCommonKt.intersect(enabledProtocols2, this.tlsVersionsAsString, getFaultAddress.onExtraCallbackWithResult());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNull(supportedCipherSuites);
        int iIndexOf = _UtilCommonKt.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        if (z && iIndexOf != -1) {
            String str = supportedCipherSuites[iIndexOf];
            Intrinsics.checkNotNullExpressionValue(str, "");
            strArrEffectiveCipherSuites = _UtilCommonKt.concat(strArrEffectiveCipherSuites, str);
        }
        return new Builder(this).cipherSuites((String[]) Arrays.copyOf(strArrEffectiveCipherSuites, strArrEffectiveCipherSuites.length)).tlsVersions((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).build();
    }

    public final boolean isCompatible(@NotNull SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !_UtilCommonKt.hasIntersection(strArr, sSLSocket.getEnabledProtocols(), getFaultAddress.onExtraCallbackWithResult())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || _UtilCommonKt.hasIntersection(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.isTls;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z != connectionSpec.isTls) {
            return false;
        }
        return !z || (Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions);
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((((iHashCode + 527) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(cipherSuites(), "[all enabled]") + ", tlsVersions=" + Objects.toString(tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }

    public static final class Builder {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        public final void setTls$okhttp(boolean z) {
            this.tls = z;
        }

        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final void setCipherSuites$okhttp(@Nullable String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setTlsVersions$okhttp(@Nullable String[] strArr) {
            this.tlsVersions = strArr;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z) {
            this.supportsTlsExtensions = z;
        }

        public Builder(boolean z) {
            this.tls = z;
        }

        public Builder(@NotNull ConnectionSpec connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "");
            this.tls = connectionSpec.isTls();
            this.cipherSuites = connectionSpec.getCipherSuitesAsString$okhttp();
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        public final Builder allEnabledCipherSuites() {
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            this.cipherSuites = null;
            return this;
        }

        public final Builder cipherSuites(@NotNull CipherSuite... cipherSuiteArr) {
            Intrinsics.checkNotNullParameter(cipherSuiteArr, "");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
            for (CipherSuite cipherSuite : cipherSuiteArr) {
                arrayList.add(cipherSuite.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Builder cipherSuites(@NotNull String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.cipherSuites = (String[]) objArrCopyOf;
            return this;
        }

        public final Builder allEnabledTlsVersions() {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            this.tlsVersions = null;
            return this;
        }

        public final Builder tlsVersions(@NotNull TlsVersion... tlsVersionArr) {
            Intrinsics.checkNotNullParameter(tlsVersionArr, "");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Builder tlsVersions(@NotNull String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.tlsVersions = (String[]) objArrCopyOf;
            return this;
        }

        @Deprecated
        public final Builder supportsTlsExtensions(boolean z) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = z;
            return this;
        }

        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.TLS_AES_128_GCM_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_AES_256_GCM_SHA384;
        CipherSuite cipherSuite3 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite7 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite8 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite9 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        List<CipherSuite> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CipherSuite[]{cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9});
        RESTRICTED_CIPHER_SUITES = listListOf;
        List<CipherSuite> listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new CipherSuite[]{cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA});
        APPROVED_CIPHER_SUITES = listListOf2;
        Builder builder = new Builder(true);
        CipherSuite[] cipherSuiteArr = (CipherSuite[]) listListOf.toArray(new CipherSuite[0]);
        Builder builderCipherSuites = builder.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        RESTRICTED_TLS = builderCipherSuites.tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        Builder builder2 = new Builder(true);
        List<CipherSuite> list = listListOf2;
        CipherSuite[] cipherSuiteArr2 = (CipherSuite[]) list.toArray(new CipherSuite[0]);
        MODERN_TLS = builder2.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        Builder builder3 = new Builder(true);
        CipherSuite[] cipherSuiteArr3 = (CipherSuite[]) list.toArray(new CipherSuite[0]);
        COMPATIBLE_TLS = builder3.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length)).tlsVersions(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
    }
}
