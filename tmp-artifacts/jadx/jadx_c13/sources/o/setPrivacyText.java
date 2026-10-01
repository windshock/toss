package o;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import o.setPrivacyText;
import org.xbill.DNS.TextParseException;
import org.xbill.DNS.config.ResolverConfigProvider;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setPrivacyText implements ResolverConfigProvider {
    private static final boolean onExtraCallbackWithResult = Boolean.getBoolean("java.net.preferIPv4Stack");
    private static final boolean onWarmupCompleted = Boolean.getBoolean("java.net.preferIPv6Addresses");
    private final List<InetSocketAddress> IAuthTabCallback = new ArrayList(3);
    protected final AppSetIdAndScope1 onExtraCallback = ea10.onWarmupCompleted(getClass());
    public final List<yzp2> onNavigationEvent = new ArrayList(1);

    public final void onWarmupCompleted() {
        this.IAuthTabCallback.clear();
        this.onNavigationEvent.clear();
    }

    public void IAuthTabCallback(String str, String str2) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
            while (stringTokenizer.hasMoreTokens()) {
                onNavigationEvent(stringTokenizer.nextToken());
            }
        }
    }

    public void onNavigationEvent(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            yzp2 yzp2VarOnExtraCallback = yzp2.onExtraCallback(str, yzp2.IAuthTabCallback);
            if (this.onNavigationEvent.contains(yzp2VarOnExtraCallback)) {
                return;
            }
            this.onNavigationEvent.add(yzp2VarOnExtraCallback);
        } catch (TextParseException unused) {
        }
    }

    public void onNavigationEvent(InetSocketAddress inetSocketAddress) {
        if (this.IAuthTabCallback.contains(inetSocketAddress)) {
            return;
        }
        this.IAuthTabCallback.add(inetSocketAddress);
    }

    public int onExtraCallbackWithResult(String str) throws NumberFormatException {
        if (str == null || str.isEmpty()) {
            return 1;
        }
        try {
            int i = Integer.parseInt(str);
            if (i < 0) {
                return 1;
            }
            if (i > 15) {
                return 15;
            }
            return i;
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public final List<InetSocketAddress> IAuthTabCallback() {
        if (onWarmupCompleted) {
            return (List) this.IAuthTabCallback.stream().sorted(new Comparator() { // from class: org.xbill.DNS.config.BaseResolverConfigProvider$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Integer.compare(((InetSocketAddress) obj2).getAddress().getAddress().length, ((InetSocketAddress) obj).getAddress().getAddress().length);
                }
            }).collect(Collectors.toList());
        }
        if (onExtraCallbackWithResult) {
            return (List) this.IAuthTabCallback.stream().filter(new Predicate() { // from class: org.xbill.DNS.config.BaseResolverConfigProvider$$ExternalSyntheticLambda1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return setPrivacyText.onExtraCallback((InetSocketAddress) obj);
                }
            }).collect(Collectors.toList());
        }
        return Collections.unmodifiableList(this.IAuthTabCallback);
    }

    public static /* synthetic */ boolean onExtraCallback(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.getAddress() instanceof Inet4Address;
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public final List<yzp2> onNavigationEvent() {
        return Collections.unmodifiableList(this.onNavigationEvent);
    }
}
