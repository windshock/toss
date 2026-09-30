package o;

import com.applovin.shadow.okio.NioFileSystemWrappingFileSystem$;
import j$.time.Clock;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.TimeConversions;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import o.yzp2;
import org.xbill.DNS.TextParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TRANS_ExportCert {
    private static final AppSetIdAndScope1 onExtraCallback = ea10.onWarmupCompleted((Class<?>) TRANS_ExportCert.class);
    private volatile Map<String, InetAddress> IAuthTabCallback;
    private Instant IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final Path IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private boolean asBinder;
    private Instant asInterface;
    private Clock onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private long onTransact;
    private final Duration onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public TRANS_ExportCert() {
        Path path;
        if (System.getProperty("os.name").contains("Windows")) {
            path = Paths.get(System.getenv("SystemRoot"), "\\System32\\drivers\\etc\\hosts");
        } else {
            path = Paths.get("/etc/hosts", new String[0]);
        }
        this(path, true);
    }

    public TRANS_ExportCert(Path path, boolean z) {
        this.IAuthTabCallback_Parcel = Integer.parseInt(System.getProperty("dnsjava.hostsfile.max_size_bytes", "16384"));
        this.onWarmupCompleted = Duration.ofMillis(Integer.parseInt(System.getProperty("dnsjava.hostsfile.change_check_interval_ms", "300000")));
        this.onExtraCallbackWithResult = Clock.systemUTC();
        this.asInterface = null;
        this.IAuthTabCallbackDefault = null;
        this.asBinder = false;
        Objects.requireNonNull(path, "path is required");
        this.IAuthTabCallbackStubProxy = NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline7.m(path);
        this.onNavigationEvent = z;
        if (Files.isDirectory(path, new LinkOption[0])) {
            throw new IllegalArgumentException("path must be a file");
        }
    }

    public Optional<InetAddress> onExtraCallbackWithResult(yzp2 yzp2Var, int i) throws IOException {
        Objects.requireNonNull(yzp2Var, "name is required");
        if (i != 1 && i != 28) {
            throw new IllegalArgumentException("type can only be A or AAAA");
        }
        onNavigationEvent();
        InetAddress inetAddress = this.IAuthTabCallback.get(IAuthTabCallback(yzp2Var, i));
        if (inetAddress != null) {
            return Optional.of(inetAddress);
        }
        if (this.IAuthTabCallbackStub) {
            return Optional.empty();
        }
        if (this.onTransact > this.IAuthTabCallback_Parcel) {
            onExtraCallback(yzp2Var, i);
        }
        return Optional.ofNullable(this.IAuthTabCallback.get(IAuthTabCallback(yzp2Var, i)));
    }

    private void onExtraCallbackWithResult() throws IOException {
        int i = 0;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicInteger atomicInteger2 = new AtomicInteger(0);
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(this.IAuthTabCallbackStubProxy, StandardCharsets.UTF_8);
        while (true) {
            try {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line == null) {
                    break;
                }
                i++;
                onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(i, line, atomicInteger, atomicInteger2);
                if (onnavigationeventIAuthTabCallback != null) {
                    for (yzp2 yzp2Var : onnavigationeventIAuthTabCallback.onExtraCallbackWithResult) {
                        this.IAuthTabCallback.putIfAbsent(IAuthTabCallback(yzp2Var, onnavigationeventIAuthTabCallback.onExtraCallback), InetAddress.getByAddress(yzp2Var.IAuthTabCallback(true), onnavigationeventIAuthTabCallback.onNavigationEvent));
                    }
                }
            } catch (Throwable th) {
                if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        bufferedReaderNewBufferedReader.close();
        if (this.asBinder) {
            return;
        }
        if (atomicInteger.get() > 0 || atomicInteger2.get() > 0) {
            new Object[]{this.IAuthTabCallbackStubProxy, Integer.valueOf(atomicInteger.get()), atomicInteger2};
            this.asBinder = true;
        }
    }

    private void onExtraCallback(yzp2 yzp2Var, int i) throws IOException {
        int i2 = 0;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicInteger atomicInteger2 = new AtomicInteger(0);
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(this.IAuthTabCallbackStubProxy, StandardCharsets.UTF_8);
        while (true) {
            try {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line != null) {
                    i2++;
                    onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(i2, line, atomicInteger, atomicInteger2);
                    if (onnavigationeventIAuthTabCallback != null) {
                        for (yzp2 yzp2Var2 : onnavigationeventIAuthTabCallback.onExtraCallbackWithResult) {
                            if (yzp2Var2.equals(yzp2Var) && i == onnavigationeventIAuthTabCallback.onExtraCallback) {
                                this.IAuthTabCallback.putIfAbsent(IAuthTabCallback(yzp2Var2, onnavigationeventIAuthTabCallback.onExtraCallback), InetAddress.getByAddress(yzp2Var2.IAuthTabCallback(true), onnavigationeventIAuthTabCallback.onNavigationEvent));
                                bufferedReaderNewBufferedReader.close();
                                return;
                            }
                        }
                    }
                } else {
                    bufferedReaderNewBufferedReader.close();
                    if (this.asBinder) {
                        return;
                    }
                    if (atomicInteger.get() > 0 || atomicInteger2.get() > 0) {
                        new Object[]{yzp2Var, this.IAuthTabCallbackStubProxy, Integer.valueOf(atomicInteger.get()), atomicInteger2};
                        this.asBinder = true;
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    static final class onNavigationEvent {
        final int onExtraCallback;
        final Iterable<? extends yzp2> onExtraCallbackWithResult;
        final byte[] onNavigationEvent;

        public onNavigationEvent(int i, byte[] bArr, Iterable<? extends yzp2> iterable) {
            this.onExtraCallback = i;
            this.onNavigationEvent = bArr;
            this.onExtraCallbackWithResult = iterable;
        }
    }

    private onNavigationEvent IAuthTabCallback(final int i, String str, AtomicInteger atomicInteger, final AtomicInteger atomicInteger2) {
        String[] strArrOnNavigationEvent = onNavigationEvent(str);
        if (strArrOnNavigationEvent.length < 2) {
            return null;
        }
        int i2 = 1;
        byte[] bArrOnExtraCallbackWithResult = dy6.onExtraCallbackWithResult(strArrOnNavigationEvent[0], 1);
        if (bArrOnExtraCallbackWithResult == null) {
            bArrOnExtraCallbackWithResult = dy6.onExtraCallbackWithResult(strArrOnNavigationEvent[0], 2);
            i2 = 28;
        }
        if (bArrOnExtraCallbackWithResult == null) {
            new Object[]{strArrOnNavigationEvent[0], this.IAuthTabCallbackStubProxy, Integer.valueOf(i)};
            atomicInteger.incrementAndGet();
            return null;
        }
        final Stream streamFilter = Arrays.stream(strArrOnNavigationEvent).skip(1L).map(new Function() { // from class: org.xbill.DNS.hosts.HostsFileParser$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.onNavigationEvent((String) obj, i, atomicInteger2);
            }
        }).filter(new Predicate() { // from class: org.xbill.DNS.hosts.HostsFileParser$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((yzp2) obj);
            }
        });
        Objects.requireNonNull(streamFilter);
        return new onNavigationEvent(i2, bArrOnExtraCallbackWithResult, new Iterable() { // from class: org.xbill.DNS.hosts.HostsFileParser$$ExternalSyntheticLambda2
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return streamFilter.iterator();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yzp2 onNavigationEvent(String str, int i, AtomicInteger atomicInteger) {
        try {
            return yzp2.onExtraCallback(str, yzp2.IAuthTabCallback);
        } catch (TextParseException unused) {
            new Object[]{str, this.IAuthTabCallbackStubProxy, Integer.valueOf(i)};
            atomicInteger.incrementAndGet();
            return null;
        }
    }

    private String[] onNavigationEvent(String str) {
        int iIndexOf = str.indexOf(35);
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        return str.substring(0, iIndexOf).trim().split("\\s+");
    }

    private void onNavigationEvent() throws IOException {
        Instant instant;
        Instant instant2;
        if (!this.onNavigationEvent) {
            if (this.IAuthTabCallback == null) {
                synchronized (this) {
                    if (this.IAuthTabCallback == null) {
                        onWarmupCompleted();
                    }
                }
                return;
            }
            return;
        }
        if (this.IAuthTabCallback == null || (instant2 = this.asInterface) == null || instant2.plus(this.onWarmupCompleted).isBefore(this.onExtraCallbackWithResult.instant())) {
            synchronized (this) {
                if (this.IAuthTabCallback == null || (instant = this.asInterface) == null || instant.plus(this.onWarmupCompleted).isBefore(this.onExtraCallbackWithResult.instant())) {
                    this.asInterface = this.onExtraCallbackWithResult.instant();
                    onWarmupCompleted();
                }
            }
        }
    }

    private void onWarmupCompleted() throws IOException {
        if (Files.exists(this.IAuthTabCallbackStubProxy, new LinkOption[0])) {
            Instant instantConvert = TimeConversions.convert(Files.getLastModifiedTime(this.IAuthTabCallbackStubProxy, new LinkOption[0]).toInstant());
            Instant instant = this.IAuthTabCallbackDefault;
            if (instant == null || !instant.equals(instantConvert)) {
                IAuthTabCallback();
                long size = Files.size(this.IAuthTabCallbackStubProxy);
                this.onTransact = size;
                if (size <= this.IAuthTabCallback_Parcel) {
                    onExtraCallbackWithResult();
                    this.IAuthTabCallbackStub = true;
                }
                this.IAuthTabCallbackDefault = instantConvert;
                return;
            }
            return;
        }
        IAuthTabCallback();
    }

    private void IAuthTabCallback() {
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = new ConcurrentHashMap();
        } else {
            this.IAuthTabCallback.clear();
        }
    }

    private String IAuthTabCallback(yzp2 yzp2Var, int i) {
        return yzp2Var.toString() + '\t' + i;
    }
}
