package o;

import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getEncPrivateKey extends setPrivacyText {
    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public void onExtraCallback() throws IllegalAccessException, zbycx1, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        onWarmupCompleted();
        try {
            Class<?> cls = Class.forName("sun.net.dns.ResolverConfiguration");
            Object objInvoke = cls.getDeclaredMethod("open", null).invoke(null, null);
            Iterator it = ((List) cls.getMethod("nameservers", null).invoke(objInvoke, null)).iterator();
            while (it.hasNext()) {
                onNavigationEvent(new InetSocketAddress((String) it.next(), 53));
            }
            Iterator it2 = ((List) cls.getMethod("searchlist", null).invoke(objInvoke, null)).iterator();
            while (it2.hasNext()) {
                onNavigationEvent((String) it2.next());
            }
        } catch (Exception e) {
            throw new zbycx1(e);
        }
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public boolean onExtraCallbackWithResult() {
        return Boolean.getBoolean("dnsjava.configprovider.sunjvm.enabled");
    }
}
