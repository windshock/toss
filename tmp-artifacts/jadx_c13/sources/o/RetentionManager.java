package o;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.WString;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.W32APIOptions;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
interface RetentionManager extends Library {
    public static final RetentionManager IAuthTabCallback = (RetentionManager) Native.load("IPHlpAPI", RetentionManager.class, W32APIOptions.ASCII_OPTIONS);

    @Structure.FieldOrder({"Next", "_String"})
    public static class onExtraCallback extends Structure {
        public C0021onExtraCallback onExtraCallback;
        public char[] onWarmupCompleted = new char[256];

        /* renamed from: o.RetentionManager$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static class C0021onExtraCallback extends onExtraCallback implements Structure.ByReference {
        }
    }

    @Structure.FieldOrder({"Length", "Reserved", "Next", "Address"})
    public static class onWarmupCompleted extends Structure {
        public onExtraCallbackWithResult IAuthTabCallback;
        public IAuthTabCallback onWarmupCompleted;

        public static class IAuthTabCallback extends onWarmupCompleted implements Structure.ByReference {
        }
    }

    int onExtraCallback(int i, int i2, Pointer pointer, Pointer pointer2, IntByReference intByReference);

    @Structure.FieldOrder({"sin_family", "sin_port", "sin_addr", "sin_zero"})
    public static class IAuthTabCallback extends Structure {
        public byte[] onExtraCallbackWithResult;
        public byte[] onWarmupCompleted;

        public IAuthTabCallback(Pointer pointer) {
            super(pointer);
            this.onExtraCallbackWithResult = new byte[4];
            this.onWarmupCompleted = new byte[8];
            read();
        }
    }

    @Structure.FieldOrder({"sin6_family", "sin6_port", "sin6_flowinfo", "sin6_addr", "sin6_scope_id"})
    public static class asInterface extends Structure {
        public int onExtraCallback;
        public byte[] onExtraCallbackWithResult;

        public asInterface(Pointer pointer) {
            super(pointer);
            this.onExtraCallbackWithResult = new byte[16];
            read();
        }
    }

    @Structure.FieldOrder({"lpSockaddr", "iSockaddrLength"})
    public static class onExtraCallbackWithResult extends Structure {
        public Pointer onExtraCallbackWithResult;

        InetAddress onExtraCallback() throws UnknownHostException {
            short s = this.onExtraCallbackWithResult.getShort(0L);
            if (s == 2) {
                return InetAddress.getByAddress(new IAuthTabCallback(this.onExtraCallbackWithResult).onExtraCallbackWithResult);
            }
            if (s != 23) {
                return null;
            }
            asInterface asinterface = new asInterface(this.onExtraCallbackWithResult);
            return Inet6Address.getByAddress(_UrlKt.FRAGMENT_ENCODE_SET, asinterface.onExtraCallbackWithResult, asinterface.onExtraCallback);
        }
    }

    @Structure.FieldOrder({"Length", "IfIndex", "Next", "AdapterName", "FirstUnicastAddress", "FirstAnycastAddress", "FirstMulticastAddress", "FirstDnsServerAddress", "DnsSuffix", "Description", "FriendlyName", "PhysicalAddress", "PhysicalAddressLength", "Flags", "Mtu", "IfType", "OperStatus", "Ipv6IfIndex", "ZoneIndices", "FirstPrefix", "TransmitLinkSpeed", "ReceiveLinkSpeed", "FirstWinsServerAddress", "FirstGatewayAddress", "Ipv4Metric", "Ipv6Metric", "Luid", "Dhcpv4Server", "CompartmentId", "NetworkGuid", "ConnectionType", "TunnelType", "Dhcpv6Server", "Dhcpv6ClientDuid", "Dhcpv6ClientDuidLength", "Dhcpv6Iaid", "FirstDnsSuffix"})
    public static class onNavigationEvent extends Structure {
        public byte[] IAuthTabCallback;
        public int IAuthTabCallbackDefault;
        public byte[] IAuthTabCallbackStub;
        public onExtraCallbackWithResult asBinder;
        public int[] asInterface;
        public WString onExtraCallback;
        public onExtraCallback.C0021onExtraCallback onExtraCallbackWithResult;
        public int onNavigationEvent;
        public onWarmupCompleted.IAuthTabCallback onWarmupCompleted;

        public static class onExtraCallbackWithResult extends onNavigationEvent implements Structure.ByReference {
        }

        public onNavigationEvent(Pointer pointer) {
            super(pointer);
            this.IAuthTabCallbackStub = new byte[8];
            this.asInterface = new int[16];
            this.IAuthTabCallback = new byte[130];
            read();
        }

        public onNavigationEvent() {
            this.IAuthTabCallbackStub = new byte[8];
            this.asInterface = new int[16];
            this.IAuthTabCallback = new byte[130];
        }
    }
}
