package o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.withInitListener;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class withInitListener extends SSLSocketFactory {
    private final SSLSocketFactory delegate;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallback = 8;
    private static final Lazy<X509TrustManager> onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.TossSslSocketFactory$$ExternalSyntheticLambda0
        public final Object invoke() {
            return withInitListener.asBinder();
        }
    });
    private static final Lazy<withInitListener> onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.TossSslSocketFactory$$ExternalSyntheticLambda1
        public final Object invoke() {
            return withInitListener.onNavigationEvent();
        }
    });

    private withInitListener(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.delegate.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "");
        return defaultCipherSuites;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket();
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "");
        return onNavigationEvent(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(@Nullable Socket socket, @Nullable String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(socket, str, i, z);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "");
        return onNavigationEvent(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(@Nullable String str, int i) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(str, i);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "");
        return onNavigationEvent(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(@Nullable String str, int i, @Nullable InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(str, i, inetAddress, i2);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "");
        return onNavigationEvent(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(@Nullable InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(inetAddress, i);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "");
        return onNavigationEvent(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(@Nullable InetAddress inetAddress, int i, @Nullable InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.delegate.createSocket(inetAddress, i, inetAddress2, i2);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "");
        return onNavigationEvent(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.delegate.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "");
        return supportedCipherSuites;
    }

    private final Socket onNavigationEvent(Socket socket) throws SocketException {
        socket.setTcpNoDelay(true);
        return socket;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final X509TrustManager onExtraCallback() {
            return (X509TrustManager) withInitListener.onWarmupCompleted.getValue();
        }

        public final SSLSocketFactory IAuthTabCallback() {
            return (SSLSocketFactory) withInitListener.onNavigationEvent.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X509TrustManager asBinder() {
        return Platform.Companion.get().platformTrustManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final withInitListener onNavigationEvent() {
        return new withInitListener(Platform.Companion.get().newSslSocketFactory(Companion.onExtraCallback()));
    }
}
