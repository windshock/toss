package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {
    public static final Companion Companion;
    private static final DeferredSocketAdapter.Factory factory;
    private static final boolean isSupported;

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@NotNull SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public /* bridge */ boolean matchesSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory) {
        return super.matchesSocketFactory(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public /* bridge */ X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory) {
        return super.trustManager(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return isSupported;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || Intrinsics.areEqual(applicationProtocol, _UrlKt.FRAGMENT_ENCODE_SET)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends Protocol> list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (matchesSocket(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) Platform.Companion.alpnProtocolNames(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DeferredSocketAdapter.Factory getFactory() {
            return BouncyCastleSocketAdapter.factory;
        }

        public final boolean isSupported() {
            return BouncyCastleSocketAdapter.isSupported;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        factory = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
            public boolean matchesSocket(SSLSocket sSLSocket) {
                Intrinsics.checkNotNullParameter(sSLSocket, "");
                BouncyCastleSocketAdapter.Companion.isSupported();
                return false;
            }

            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
            public SocketAdapter create(SSLSocket sSLSocket) {
                Intrinsics.checkNotNullParameter(sSLSocket, "");
                return new BouncyCastleSocketAdapter();
            }
        };
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, companion.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        isSupported = z;
    }
}
