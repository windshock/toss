package org.xbill.DNS.config;

import java.net.InetSocketAddress;
import java.util.List;
import o.yzp2;
import o.zbycx1;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ResolverConfigProvider {
    List<InetSocketAddress> IAuthTabCallback();

    default int asInterface() {
        return 1;
    }

    void onExtraCallback() throws zbycx1;

    default boolean onExtraCallbackWithResult() {
        return true;
    }

    List<yzp2> onNavigationEvent();
}
