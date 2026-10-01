package o;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.StringTokenizer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RetentionManagerPeriod extends setPrivacyText {
    private int onWarmupCompleted;

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public void onExtraCallback() {
        onNavigationEvent("dns.server", "dns.search", "dns.ndots");
    }

    protected void onNavigationEvent(String str, String str2, String str3) {
        onWarmupCompleted();
        String property = System.getProperty(str);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    URI uri = new URI("dns://" + strNextToken);
                    if (uri.getHost() == null) {
                        onNavigationEvent(new InetSocketAddress(strNextToken, 53));
                    } else {
                        int port = uri.getPort();
                        onNavigationEvent(new InetSocketAddress(uri.getHost(), port != -1 ? port : 53));
                    }
                } catch (URISyntaxException unused) {
                    AppSetIdAndScope1 appSetIdAndScope1 = this.onExtraCallback;
                }
            }
        }
        IAuthTabCallback(System.getProperty(str2), ",");
        this.onWarmupCompleted = onExtraCallbackWithResult(System.getProperty(str3));
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public int asInterface() {
        return this.onWarmupCompleted;
    }
}
