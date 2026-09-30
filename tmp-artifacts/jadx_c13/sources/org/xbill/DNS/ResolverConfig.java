package org.xbill.DNS;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import o.AppSetIdAndScope1;
import o.RetentionManagerPeriod;
import o.ea10;
import o.getCertCount;
import o.getEncPrivateKey;
import o.lt61;
import o.setExtraFuncationHelper;
import o.ycx91;
import o.yzp2;
import o.zbycx1;
import org.xbill.DNS.config.ResolvConfResolverConfigProvider;
import org.xbill.DNS.config.ResolverConfigProvider;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResolverConfig {
    private static List<ResolverConfigProvider> IAuthTabCallback;
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onWarmupCompleted((Class<?>) ResolverConfig.class);
    private static ResolverConfig onWarmupCompleted;
    private final List<InetSocketAddress> IAuthTabCallbackDefault = new ArrayList(2);
    private final List<yzp2> onExtraCallback = new ArrayList(0);
    private int onNavigationEvent;

    private static void asInterface() {
        if (onWarmupCompleted == null || IAuthTabCallback == null) {
            onWarmupCompleted();
        }
    }

    public static ResolverConfig onNavigationEvent() {
        ResolverConfig resolverConfig;
        synchronized (ResolverConfig.class) {
            asInterface();
            resolverConfig = onWarmupCompleted;
        }
        return resolverConfig;
    }

    public static void onWarmupCompleted() {
        ResolverConfig resolverConfig = new ResolverConfig();
        synchronized (ResolverConfig.class) {
            onWarmupCompleted = resolverConfig;
        }
    }

    public ResolverConfig() {
        this.onNavigationEvent = 1;
        synchronized (ResolverConfig.class) {
            if (IAuthTabCallback == null) {
                IAuthTabCallback = new ArrayList(8);
                if (!Boolean.getBoolean("dnsjava.configprovider.skipinit")) {
                    IAuthTabCallback.add(new RetentionManagerPeriod());
                    IAuthTabCallback.add(new ResolvConfResolverConfigProvider());
                    IAuthTabCallback.add(new getCertCount());
                    IAuthTabCallback.add(new lt61());
                    IAuthTabCallback.add(new ycx91());
                    IAuthTabCallback.add(new getEncPrivateKey());
                    IAuthTabCallback.add(new setExtraFuncationHelper());
                }
            }
        }
        for (ResolverConfigProvider resolverConfigProvider : IAuthTabCallback) {
            if (resolverConfigProvider.onExtraCallbackWithResult()) {
                try {
                    resolverConfigProvider.onExtraCallback();
                    if (this.IAuthTabCallbackDefault.isEmpty()) {
                        this.IAuthTabCallbackDefault.addAll(resolverConfigProvider.IAuthTabCallback());
                    }
                    if (this.onExtraCallback.isEmpty()) {
                        List<yzp2> listOnNavigationEvent = resolverConfigProvider.onNavigationEvent();
                        if (!listOnNavigationEvent.isEmpty()) {
                            this.onExtraCallback.addAll(listOnNavigationEvent);
                            this.onNavigationEvent = resolverConfigProvider.asInterface();
                        }
                    }
                    if (!this.IAuthTabCallbackDefault.isEmpty() && !this.onExtraCallback.isEmpty()) {
                        return;
                    }
                } catch (zbycx1 unused) {
                    continue;
                }
            }
        }
        if (this.IAuthTabCallbackDefault.isEmpty()) {
            this.IAuthTabCallbackDefault.add(new InetSocketAddress(InetAddress.getLoopbackAddress(), 53));
        }
    }

    public List<InetSocketAddress> IAuthTabCallbackStub() {
        return this.IAuthTabCallbackDefault;
    }

    public InetSocketAddress onExtraCallbackWithResult() {
        return this.IAuthTabCallbackDefault.get(0);
    }

    public List<yzp2> onExtraCallback() {
        return this.onExtraCallback;
    }

    public int IAuthTabCallback() {
        return this.onNavigationEvent;
    }
}
