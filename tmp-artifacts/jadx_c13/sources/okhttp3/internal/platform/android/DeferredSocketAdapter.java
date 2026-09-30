package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DeferredSocketAdapter implements SocketAdapter {
    private SocketAdapter delegate;
    private final Factory socketAdapterFactory;

    public interface Factory {
        SocketAdapter create(@NotNull SSLSocket sSLSocket);

        boolean matchesSocket(@NotNull SSLSocket sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return true;
    }

    public DeferredSocketAdapter(@NotNull Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "");
        this.socketAdapterFactory = factory;
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
    public boolean matchesSocket(@NotNull SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        return this.socketAdapterFactory.matchesSocket(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends Protocol> list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        Intrinsics.checkNotNullParameter(list, "");
        SocketAdapter delegate = getDelegate(sSLSocket);
        if (delegate != null) {
            delegate.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        SocketAdapter delegate = getDelegate(sSLSocket);
        if (delegate != null) {
            return delegate.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    private final SocketAdapter getDelegate(SSLSocket sSLSocket) {
        SocketAdapter socketAdapter;
        synchronized (this) {
            if (this.delegate == null && this.socketAdapterFactory.matchesSocket(sSLSocket)) {
                this.delegate = this.socketAdapterFactory.create(sSLSocket);
            }
            socketAdapter = this.delegate;
        }
        return socketAdapter;
    }
}
