package o;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.ptr.IntByReference;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.List;
import o.RetentionManager;
import org.xbill.DNS.config.ResolverConfigProvider;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getCertCount implements ResolverConfigProvider {
    private static final AppSetIdAndScope1 onNavigationEvent = ea10.onWarmupCompleted((Class<?>) getCertCount.class);
    private onExtraCallback onExtraCallbackWithResult;

    public getCertCount() {
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                this.onExtraCallbackWithResult = new onExtraCallback();
            } catch (NoClassDefFoundError unused) {
            }
        }
    }

    static final class onExtraCallback extends setPrivacyText {
        private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onWarmupCompleted((Class<?>) onExtraCallback.class);

        private onExtraCallback() {
        }

        @Override // org.xbill.DNS.config.ResolverConfigProvider
        public void onExtraCallback() throws zbycx1 {
            onWarmupCompleted();
            Memory memory = new Memory(15360L);
            IntByReference intByReference = new IntByReference(0);
            RetentionManager retentionManager = RetentionManager.IAuthTabCallback;
            if (retentionManager.onExtraCallback(0, 39, Pointer.NULL, memory, intByReference) == 111) {
                memory = new Memory(intByReference.getValue());
                int iOnExtraCallback = retentionManager.onExtraCallback(0, 39, Pointer.NULL, memory, intByReference);
                if (iOnExtraCallback != 0) {
                    throw new zbycx1((Exception) new Win32Exception(iOnExtraCallback));
                }
            }
            RetentionManager.onNavigationEvent onnavigationevent = new RetentionManager.onNavigationEvent(memory);
            do {
                if (onnavigationevent.IAuthTabCallbackDefault == 1) {
                    for (RetentionManager.onWarmupCompleted.IAuthTabCallback iAuthTabCallback = onnavigationevent.onWarmupCompleted; iAuthTabCallback != null; iAuthTabCallback = iAuthTabCallback.onWarmupCompleted) {
                        try {
                            InetAddress inetAddressOnExtraCallback = iAuthTabCallback.IAuthTabCallback.onExtraCallback();
                            if ((inetAddressOnExtraCallback instanceof Inet4Address) || !inetAddressOnExtraCallback.isSiteLocalAddress()) {
                                onNavigationEvent(new InetSocketAddress(inetAddressOnExtraCallback, 53));
                            } else {
                                int i = onnavigationevent.onNavigationEvent;
                            }
                        } catch (UnknownHostException unused) {
                            int i2 = onnavigationevent.onNavigationEvent;
                        }
                    }
                    onNavigationEvent(onnavigationevent.onExtraCallback.toString());
                    for (RetentionManager.onExtraCallback.C0021onExtraCallback c0021onExtraCallback = onnavigationevent.onExtraCallbackWithResult; c0021onExtraCallback != null; c0021onExtraCallback = c0021onExtraCallback.onExtraCallback) {
                        onNavigationEvent(String.valueOf(c0021onExtraCallback.onWarmupCompleted));
                    }
                }
                onnavigationevent = onnavigationevent.asBinder;
            } while (onnavigationevent != null);
        }
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public void onExtraCallback() throws zbycx1 {
        this.onExtraCallbackWithResult.onExtraCallback();
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public List<InetSocketAddress> IAuthTabCallback() {
        return this.onExtraCallbackWithResult.IAuthTabCallback();
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public List<yzp2> onNavigationEvent() {
        return this.onExtraCallbackWithResult.onNavigationEvent();
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult != null;
    }
}
