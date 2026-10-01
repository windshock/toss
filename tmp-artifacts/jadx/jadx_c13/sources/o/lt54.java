package o;

import java.util.HashMap;
import java.util.function.Supplier;
import o.DeviceUtils1;
import o.DeviceUtils3;
import o.IPBroadcastReceiver21;
import o.IPBroadcastReceiver3;
import o.aeuycx;
import o.beforeTextChanged;
import o.copyStringToBuffer;
import o.dc1;
import o.dc2;
import o.dc4;
import o.dc5;
import o.dy2;
import o.dy3;
import o.dy4;
import o.dy5;
import o.dy8;
import o.fby10;
import o.fby11;
import o.getColumnName;
import o.jcdj;
import o.jcsya;
import o.lt18;
import o.lt19;
import o.lt23;
import o.lt24;
import o.lt25;
import o.lt26;
import o.lt28;
import o.lt29;
import o.lt35;
import o.lt43;
import o.lt45;
import o.lt46;
import o.lt47;
import o.lt57;
import o.lt58;
import o.lt60;
import o.lt63;
import o.moveToLast;
import o.moveToPrevious;
import o.oby1;
import o.oby2;
import o.obysya;
import o.obyycx;
import o.obyzb;
import o.onChildViewRemoved;
import o.respond;
import o.rysya;
import o.sz2;
import o.sz3;
import o.sz4;
import o.szycx;
import o.szzb;
import o.tn1;
import o.uhzb;
import o.unregisterContentObserver;
import o.ycxfby;
import o.ycxlt;
import o.ycxul;
import okhttp3.internal.http2.Settings;
import org.opencv.imgcodecs.Imgcodecs;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt54 {
    private static final onExtraCallbackWithResult onNavigationEvent;

    public static boolean onWarmupCompleted(int i) {
        if (i == 41) {
            return false;
        }
        switch (i) {
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
            case 254:
            case 255:
                return false;
            default:
                return true;
        }
    }

    static class onExtraCallbackWithResult extends sz1 {
        private final HashMap<Integer, Supplier<Record>> onExtraCallback;

        public onExtraCallbackWithResult() {
            super("Type", 2);
            onWarmupCompleted("TYPE");
            onNavigationEvent(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.onExtraCallback = new HashMap<>();
        }

        public void IAuthTabCallback(int i, String str, Supplier<Record> supplier) {
            super.IAuthTabCallback(i, str);
            this.onExtraCallback.put(Integer.valueOf(i), supplier);
        }

        @Override // o.sz1
        public void onExtraCallbackWithResult(int i) {
            lt54.IAuthTabCallback(i);
        }

        public Supplier<Record> onExtraCallback(int i) {
            onExtraCallbackWithResult(i);
            return this.onExtraCallback.get(Integer.valueOf(i));
        }
    }

    static {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        onNavigationEvent = onextracallbackwithresult;
        onextracallbackwithresult.IAuthTabCallback(1, "A", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dy4();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(2, "NS", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda11
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ycxul();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(3, "MD", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda22
            @Override // java.util.function.Supplier
            public final Object get() {
                return new oby2();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(4, "MF", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda33
            @Override // java.util.function.Supplier
            public final Object get() {
                return new obysya();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(5, "CNAME", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda44
            @Override // java.util.function.Supplier
            public final Object get() {
                return new jcdj();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(6, "SOA", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda55
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt26();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(7, "MB", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda58
            @Override // java.util.function.Supplier
            public final Object get() {
                return new aeuycx();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(8, "MG", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda59
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dc5();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(9, "MR", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda60
            @Override // java.util.function.Supplier
            public final Object get() {
                return new obyycx();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(10, "NULL", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda61
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ycxlt();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(11, "WKS", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt58();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(12, "PTR", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt19();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(13, "HINFO", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return new moveToLast();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(14, "MINFO", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda4
            @Override // java.util.function.Supplier
            public final Object get() {
                return new oby1();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(15, "MX", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda5
            @Override // java.util.function.Supplier
            public final Object get() {
                return new obyzb();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(16, "TXT", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda6
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt47();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(17, "RP", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda7
            @Override // java.util.function.Supplier
            public final Object get() {
                return new RPRecord();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(18, "AFSDB", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda8
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dy3();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(19, "X25", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda9
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt60();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(20, "ISDN", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda10
            @Override // java.util.function.Supplier
            public final Object get() {
                return new DeviceUtils3();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(21, "RT", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda12
            @Override // java.util.function.Supplier
            public final Object get() {
                return new RTRecord();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(22, "NSAP", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda13
            @Override // java.util.function.Supplier
            public final Object get() {
                return new sz2();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(23, "NSAP-PTR", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda14
            @Override // java.util.function.Supplier
            public final Object get() {
                return new sz4();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(24, "SIG", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda15
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt23();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(25, "KEY", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda16
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dc1();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(26, "PX", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda17
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt18();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(27, "GPOS", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda18
            @Override // java.util.function.Supplier
            public final Object get() {
                return new moveToPrevious();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(28, "AAAA", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda19
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dy2();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(29, "LOC", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda20
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dc2();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(30, "NXT", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda21
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ycxfby();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(31, "EID");
        onextracallbackwithresult.IAuthTabCallback(32, "NIMLOC");
        onextracallbackwithresult.IAuthTabCallback(33, "SRV", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda23
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt29();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(34, "ATMA");
        onextracallbackwithresult.IAuthTabCallback(35, "NAPTR", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda24
            @Override // java.util.function.Supplier
            public final Object get() {
                return new onChildViewRemoved();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(36, "KX", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda25
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dc4();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(37, "CERT", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda26
            @Override // java.util.function.Supplier
            public final Object get() {
                return new jcsya();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(38, "A6", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda27
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IPBroadcastReceiver21();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(39, "DNAME", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda28
            @Override // java.util.function.Supplier
            public final Object get() {
                return new uhzb();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(40, "SINK");
        onextracallbackwithresult.IAuthTabCallback(41, "OPT", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda29
            @Override // java.util.function.Supplier
            public final Object get() {
                return new fby10();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(42, "APL", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda30
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IPBroadcastReceiver3();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(43, "DS", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda31
            @Override // java.util.function.Supplier
            public final Object get() {
                return new getColumnName();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(44, "SSHFP", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda32
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt28();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(45, "IPSECKEY", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda34
            @Override // java.util.function.Supplier
            public final Object get() {
                return new DeviceUtils1();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(46, "RRSIG", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda35
            @Override // java.util.function.Supplier
            public final Object get() {
                return new RRSIGRecord();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(47, "NSEC", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda36
            @Override // java.util.function.Supplier
            public final Object get() {
                return new szzb();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(48, "DNSKEY", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda37
            @Override // java.util.function.Supplier
            public final Object get() {
                return new copyStringToBuffer();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(49, "DHCID", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda38
            @Override // java.util.function.Supplier
            public final Object get() {
                return new rysya();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(50, "NSEC3", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda39
            @Override // java.util.function.Supplier
            public final Object get() {
                return new sz3();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(51, "NSEC3PARAM", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda40
            @Override // java.util.function.Supplier
            public final Object get() {
                return new szycx();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(52, "TLSA", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda41
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt45();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(53, "SMIMEA", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda42
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt25();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(55, "HIP", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda43
            @Override // java.util.function.Supplier
            public final Object get() {
                return new unregisterContentObserver();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(56, "NINFO");
        onextracallbackwithresult.IAuthTabCallback(57, "RKEY");
        onextracallbackwithresult.IAuthTabCallback(58, "TALINK");
        onextracallbackwithresult.IAuthTabCallback(59, "CDS", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda45
            @Override // java.util.function.Supplier
            public final Object get() {
                return new tn1();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(60, "CDNSKEY", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda46
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dy8();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(61, "OPENPGPKEY", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda47
            @Override // java.util.function.Supplier
            public final Object get() {
                return new fby11();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(62, "CSYNC");
        onextracallbackwithresult.IAuthTabCallback(63, "ZONEMD", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda48
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt63();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(64, "SVCB", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda49
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt35();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(65, "HTTPS", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda50
            @Override // java.util.function.Supplier
            public final Object get() {
                return new respond();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(99, "SPF", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda51
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt24();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(100, "UINFO");
        onextracallbackwithresult.IAuthTabCallback(101, "UID");
        onextracallbackwithresult.IAuthTabCallback(102, "GID");
        onextracallbackwithresult.IAuthTabCallback(103, "UNSPEC");
        onextracallbackwithresult.IAuthTabCallback(104, "NID");
        onextracallbackwithresult.IAuthTabCallback(105, "L32");
        onextracallbackwithresult.IAuthTabCallback(106, "L64");
        onextracallbackwithresult.IAuthTabCallback(107, "LP");
        onextracallbackwithresult.IAuthTabCallback(108, "EUI48");
        onextracallbackwithresult.IAuthTabCallback(109, "EUI64");
        onextracallbackwithresult.IAuthTabCallback(249, "TKEY", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda52
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt43();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(250, "TSIG", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda53
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt46();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(251, "IXFR");
        onextracallbackwithresult.IAuthTabCallback(252, "AXFR");
        onextracallbackwithresult.IAuthTabCallback(253, "MAILB");
        onextracallbackwithresult.IAuthTabCallback(254, "MAILA");
        onextracallbackwithresult.IAuthTabCallback(255, "ANY");
        onextracallbackwithresult.IAuthTabCallback(256, "URI", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda54
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt57();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(Imgcodecs.IMWRITE_TIFF_XDPI, "CAA", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda56
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dy5();
            }
        });
        onextracallbackwithresult.IAuthTabCallback(Imgcodecs.IMWRITE_TIFF_YDPI, "AVC");
        onextracallbackwithresult.IAuthTabCallback(Imgcodecs.IMWRITE_TIFF_COMPRESSION, "DOA");
        onextracallbackwithresult.IAuthTabCallback(260, "AMTRELAY");
        onextracallbackwithresult.IAuthTabCallback(32768, "TA");
        onextracallbackwithresult.IAuthTabCallback(32769, "DLV", new Supplier() { // from class: org.xbill.DNS.Type$$ExternalSyntheticLambda57
            @Override // java.util.function.Supplier
            public final Object get() {
                return new beforeTextChanged();
            }
        });
    }

    public static void IAuthTabCallback(int i) {
        if (!lt56.onNavigationEvent(i)) {
            throw new DeviceUtilsAudioInfoReceiver1(i);
        }
    }

    public static String onNavigationEvent(int i) {
        return onNavigationEvent.IAuthTabCallback(i);
    }

    public static Supplier<Record> onExtraCallback(int i) {
        return onNavigationEvent.onExtraCallback(i);
    }
}
