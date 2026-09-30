package okhttp3.internal.authenticator;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class JavaNetAuthenticator implements Authenticator {
    private final Dns defaultDns;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public JavaNetAuthenticator(@NotNull Dns dns) {
        Intrinsics.checkNotNullParameter(dns, "");
        this.defaultDns = dns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dns.SYSTEM : dns);
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(@Nullable Route route, @NotNull Response response) throws IOException {
        Proxy proxy;
        Dns dns;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        Address address;
        Intrinsics.checkNotNullParameter(response, "");
        List<Challenge> listChallenges = response.challenges();
        Request request = response.request();
        HttpUrl httpUrlUrl = request.url();
        boolean z = response.code() == 407;
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : listChallenges) {
            if (StringsKt__StringsJVMKt.equals("Basic", challenge.scheme(), true)) {
                if (route == null || (address = route.address()) == null || (dns = address.dns()) == null) {
                    dns = this.defaultDns;
                }
                if (z) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.checkNotNull(socketAddressAddress, "");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNull(proxy);
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, connectToInetAddress(proxy, httpUrlUrl, dns), inetSocketAddress.getPort(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), Authenticator.RequestorType.PROXY);
                } else {
                    String strHost = httpUrlUrl.host();
                    Intrinsics.checkNotNull(proxy);
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(strHost, connectToInetAddress(proxy, httpUrlUrl, dns), httpUrlUrl.port(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "");
                    return request.newBuilder().header(str, Credentials.basic(userName, new String(password), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    private final InetAddress connectToInetAddress(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return (InetAddress) CollectionsKt___CollectionsKt.first((List) dns.lookup(httpUrl.host()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.checkNotNull(socketAddressAddress, "");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "");
        return address;
    }
}
