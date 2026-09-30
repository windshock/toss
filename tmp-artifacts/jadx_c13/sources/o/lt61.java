package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class lt61 extends setPrivacyText {
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onWarmupCompleted((Class<?>) lt61.class);
    private static Context onWarmupCompleted = null;

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public void onExtraCallback() throws zbycx1 {
        LinkProperties linkProperties;
        onWarmupCompleted();
        Context context = onWarmupCompleted;
        if (context == null) {
            throw new zbycx1("Context must be initialized by calling setContext");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
            return;
        }
        Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
        while (it.hasNext()) {
            onNavigationEvent(new InetSocketAddress(it.next(), 53));
        }
        IAuthTabCallback(linkProperties.getDomains(), ",");
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public boolean onExtraCallbackWithResult() {
        return System.getProperty("java.vendor").contains("Android");
    }
}
