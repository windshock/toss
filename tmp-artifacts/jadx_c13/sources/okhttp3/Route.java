package okhttp3;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal._HostnamesCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(@NotNull Address address, @NotNull Proxy proxy, @NotNull InetSocketAddress inetSocketAddress) {
        Intrinsics.checkNotNullParameter(address, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @Deprecated
    /* renamed from: -deprecated_address, reason: not valid java name */
    public final Address m301deprecated_address() {
        return this.address;
    }

    @Deprecated
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m302deprecated_proxy() {
        return this.proxy;
    }

    @Deprecated
    /* renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m303deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final boolean requiresTunnel() {
        if (this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.address.sslSocketFactory() != null || this.address.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return Intrinsics.areEqual(route.address, this.address) && Intrinsics.areEqual(route.proxy, this.proxy) && Intrinsics.areEqual(route.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return ((((this.address.hashCode() + 527) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        String strHost = this.address.url().host();
        InetAddress address = this.socketAddress.getAddress();
        String canonicalHost = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : _HostnamesCommonKt.toCanonicalHost(hostAddress);
        if (StringsKt__StringsKt.contains$default((CharSequence) strHost, ':', false, 2, (Object) null)) {
            sb.append("[");
            sb.append(strHost);
            sb.append("]");
        } else {
            sb.append(strHost);
        }
        if (this.address.url().port() != this.socketAddress.getPort() || Intrinsics.areEqual(strHost, canonicalHost)) {
            sb.append(":");
            sb.append(this.address.url().port());
        }
        if (!Intrinsics.areEqual(strHost, canonicalHost)) {
            if (Intrinsics.areEqual(this.proxy, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (canonicalHost == null) {
                sb.append("<unresolved>");
            } else if (StringsKt__StringsKt.contains$default((CharSequence) canonicalHost, ':', false, 2, (Object) null)) {
                sb.append("[");
                sb.append(canonicalHost);
                sb.append("]");
            } else {
                sb.append(canonicalHost);
            }
            sb.append(":");
            sb.append(this.socketAddress.getPort());
        }
        return sb.toString();
    }
}
