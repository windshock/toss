package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(@NotNull String str, int i, @NotNull Dns dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, @NotNull Authenticator authenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> list, @NotNull List<ConnectionSpec> list2, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dns, "");
        Intrinsics.checkNotNullParameter(socketFactory, "");
        Intrinsics.checkNotNullParameter(authenticator, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(proxySelector, "");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = _UtilJvmKt.toImmutableList(list);
        this.connectionSpecs = _UtilJvmKt.toImmutableList(list2);
    }

    public final Dns dns() {
        return this.dns;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @Deprecated
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m171deprecated_url() {
        return this.url;
    }

    @Deprecated
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m163deprecated_dns() {
        return this.dns;
    }

    @Deprecated
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m169deprecated_socketFactory() {
        return this.socketFactory;
    }

    @Deprecated
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m167deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @Deprecated
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m165deprecated_protocols() {
        return this.protocols;
    }

    @Deprecated
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m162deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @Deprecated
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m168deprecated_proxySelector() {
        return this.proxySelector;
    }

    @Deprecated
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m166deprecated_proxy() {
        return this.proxy;
    }

    @Deprecated
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m170deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @Deprecated
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m164deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Deprecated
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m161deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.areEqual(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode();
        int iHashCode2 = this.dns.hashCode();
        int iHashCode3 = this.proxyAuthenticator.hashCode();
        int iHashCode4 = this.protocols.hashCode();
        int iHashCode5 = this.connectionSpecs.hashCode();
        int iHashCode6 = this.proxySelector.hashCode();
        int iHashCode7 = Objects.hashCode(this.proxy);
        return ((((((((((((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    public final boolean equalsNonHost$okhttp(@NotNull Address address) {
        Intrinsics.checkNotNullParameter(address, "");
        return Intrinsics.areEqual(this.dns, address.dns) && Intrinsics.areEqual(this.proxyAuthenticator, address.proxyAuthenticator) && Intrinsics.areEqual(this.protocols, address.protocols) && Intrinsics.areEqual(this.connectionSpecs, address.connectionSpecs) && Intrinsics.areEqual(this.proxySelector, address.proxySelector) && Intrinsics.areEqual(this.proxy, address.proxy) && Intrinsics.areEqual(this.sslSocketFactory, address.sslSocketFactory) && Intrinsics.areEqual(this.hostnameVerifier, address.hostnameVerifier) && Intrinsics.areEqual(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
