package o;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import org.xbill.DNS.config.ResolverConfigProvider;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ycx91 implements ResolverConfigProvider {
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onWarmupCompleted((Class<?>) ycx91.class);
    private onExtraCallback onExtraCallback;

    public ycx91() {
        if (System.getProperty("java.vendor").contains("Android")) {
            return;
        }
        try {
            this.onExtraCallback = new onExtraCallback();
        } catch (NoClassDefFoundError unused) {
        }
    }

    static final class onExtraCallback extends setPrivacyText {
        private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onWarmupCompleted((Class<?>) onExtraCallback.class);

        private onExtraCallback() {
        }

        @Override // org.xbill.DNS.config.ResolverConfigProvider
        public void onExtraCallback() {
            String str;
            onWarmupCompleted();
            Hashtable hashtable = new Hashtable();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns://");
            try {
                InitialDirContext initialDirContext = new InitialDirContext(hashtable);
                str = (String) initialDirContext.getEnvironment().get("java.naming.provider.url");
                try {
                    initialDirContext.close();
                } catch (NamingException unused) {
                }
            } catch (NamingException unused2) {
                str = null;
            }
            if (str != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
                while (stringTokenizer.hasMoreTokens()) {
                    try {
                        URI uri = new URI(stringTokenizer.nextToken());
                        String host = uri.getHost();
                        if (host != null && !host.isEmpty()) {
                            int port = uri.getPort();
                            if (port == -1) {
                                port = 53;
                            }
                            onNavigationEvent(new InetSocketAddress(host, port));
                        }
                    } catch (URISyntaxException unused3) {
                    }
                }
            }
        }
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public void onExtraCallback() {
        this.onExtraCallback.onExtraCallback();
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public List<InetSocketAddress> IAuthTabCallback() {
        return this.onExtraCallback.IAuthTabCallback();
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public List<yzp2> onNavigationEvent() {
        return this.onExtraCallback.onNavigationEvent();
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public boolean onExtraCallbackWithResult() {
        return this.onExtraCallback != null;
    }
}
