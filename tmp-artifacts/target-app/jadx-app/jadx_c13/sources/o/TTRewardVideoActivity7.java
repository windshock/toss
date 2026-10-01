package o;

import j$.time.Instant;
import j$.time.TimeConversions;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import kotlin.jvm.internal.ByteCompanionObject;
import o.TTRewardVideoActivity7;
import o.TTVideoLandingPageActivity10;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTRewardVideoActivity7 implements TTLandingPageActivity14 {
    private static final TTRewardVideoActivity7[] onExtraCallbackWithResult = new TTRewardVideoActivity7[0];
    private FileTime IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final Path IAuthTabCallbackStub;
    private byte IAuthTabCallbackStubProxy;
    private String IAuthTabCallback_Parcel;
    private String ICustomTabsCallback;
    private String ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private List<TTVideoLandingPageActivity10> ICustomTabsCallbackStubProxy;
    private String access000;
    private boolean access100;
    private int asBinder;
    private final Map<String, String> asInterface;
    private FileTime extraCallback;
    private String extraCallbackWithResult;
    private long getInterfaceDescriptor;
    private long onActivityLayout;
    private long onActivityResized;
    private FileTime onExtraCallback;
    private boolean onMessageChannelReady;
    private boolean onMinimized;
    private FileTime onNavigationEvent;
    private final boolean onPostMessage;
    private String onRelationshipValidationResult;
    private long onTransact;
    private long onUnminimized;
    private boolean onWarmupCompleted;
    private final LinkOption[] readTypedObject;
    private int writeTypedObject;

    private static FileTime sY_(long j) {
        if (j <= 0) {
            return null;
        }
        return PAGNativeAdLoadCallback.tI_(j);
    }

    private static String onNavigationEvent(String str, boolean z) {
        String property;
        int iIndexOf;
        if (!z && (property = System.getProperty("os.name")) != null) {
            String lowerCase = property.toLowerCase(Locale.ROOT);
            if (lowerCase.startsWith("windows")) {
                if (str.length() > 2) {
                    char cCharAt = str.charAt(0);
                    if (str.charAt(1) == ':' && ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                        str = str.substring(2);
                    }
                }
            } else if (lowerCase.contains("netware") && (iIndexOf = str.indexOf(58)) != -1) {
                str = str.substring(iIndexOf + 1);
            }
        }
        String strReplace = str.replace(File.separatorChar, '/');
        while (!z && strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        return strReplace;
    }

    private static Instant IAuthTabCallback(String str) {
        BigDecimal bigDecimal = new BigDecimal(str);
        return Instant.ofEpochSecond(bigDecimal.longValue(), bigDecimal.remainder(BigDecimal.ONE).movePointRight(9).longValue());
    }

    private TTRewardVideoActivity7(boolean z) {
        this.ICustomTabsCallback = _UrlKt.FRAGMENT_ENCODE_SET;
        this.IAuthTabCallback_Parcel = _UrlKt.FRAGMENT_ENCODE_SET;
        this.extraCallbackWithResult = "ustar\u0000";
        this.onRelationshipValidationResult = "00";
        this.access000 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.asInterface = new HashMap();
        this.onTransact = -1L;
        String property = System.getProperty("user.name", _UrlKt.FRAGMENT_ENCODE_SET);
        this.ICustomTabsCallbackDefault = property.length() > 31 ? property.substring(0, 31) : property;
        this.IAuthTabCallbackStub = null;
        this.readTypedObject = PAGNativeAdLoadListener.onExtraCallbackWithResult;
        this.onPostMessage = z;
    }

    public TTRewardVideoActivity7(Map<String, String> map, byte[] bArr, TTWebsiteActivity7 tTWebsiteActivity7, boolean z) throws IOException {
        this(false);
        onExtraCallbackWithResult(map, bArr, tTWebsiteActivity7, false, z);
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return IAuthTabCallback((TTRewardVideoActivity7) obj);
    }

    public boolean IAuthTabCallback(TTRewardVideoActivity7 tTRewardVideoActivity7) {
        return tTRewardVideoActivity7 != null && onExtraCallback().equals(tTRewardVideoActivity7.onExtraCallback());
    }

    private int IAuthTabCallback(Map<String, String> map, byte[] bArr) {
        if (PAGImageItem.onExtraCallback("ustar ", bArr, Imgcodecs.IMWRITE_TIFF_XDPI, 6)) {
            return 2;
        }
        if (PAGImageItem.onExtraCallback("ustar\u0000", bArr, Imgcodecs.IMWRITE_TIFF_XDPI, 6)) {
            return onExtraCallback(map, bArr) ? 4 : 3;
        }
        return 0;
    }

    void IAuthTabCallback(Map<String, String> map) {
        this.onMessageChannelReady = true;
        this.onActivityLayout = Integer.parseInt(map.get("GNU.sparse.size"));
        if (map.containsKey("GNU.sparse.name")) {
            this.ICustomTabsCallback = map.get("GNU.sparse.name");
        }
    }

    void onNavigationEvent(Map<String, String> map) throws IOException {
        this.onMessageChannelReady = true;
        this.onMinimized = true;
        if (map.containsKey("GNU.sparse.name")) {
            this.ICustomTabsCallback = map.get("GNU.sparse.name");
        }
        if (map.containsKey("GNU.sparse.realsize")) {
            try {
                this.onActivityLayout = Integer.parseInt(map.get("GNU.sparse.realsize"));
            } catch (NumberFormatException unused) {
                throw new IOException("Corrupted TAR archive. GNU.sparse.realsize header for " + this.ICustomTabsCallback + " contains non-numeric value");
            }
        }
    }

    void onExtraCallback(Map<String, String> map) throws IOException {
        this.ICustomTabsCallbackStub = true;
        if (map.containsKey("SCHILY.realsize")) {
            try {
                this.onActivityLayout = Long.parseLong(map.get("SCHILY.realsize"));
            } catch (NumberFormatException unused) {
                throw new IOException("Corrupted TAR archive. SCHILY.realsize header for " + this.ICustomTabsCallback + " contains non-numeric value");
            }
        }
    }

    public long IAuthTabCallback() {
        return this.onTransact;
    }

    public String onExtraCallback() {
        return this.ICustomTabsCallback;
    }

    public List<TTVideoLandingPageActivity10> onExtraCallbackWithResult() throws IOException {
        List<TTVideoLandingPageActivity10> list = this.ICustomTabsCallbackStubProxy;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<TTVideoLandingPageActivity10> list2 = (List) this.ICustomTabsCallbackStubProxy.stream().filter(new Predicate() { // from class: org.apache.commons.compress.archivers.tar.TarArchiveEntry$$ExternalSyntheticLambda6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return TTRewardVideoActivity7.onExtraCallback((TTVideoLandingPageActivity10) obj);
            }
        }).sorted(Comparator.comparingLong(new ToLongFunction() { // from class: org.apache.commons.compress.archivers.tar.TarArchiveEntry$$ExternalSyntheticLambda7
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((TTVideoLandingPageActivity10) obj).IAuthTabCallback();
            }
        })).collect(Collectors.toList());
        int size = list2.size();
        int i = 0;
        while (i < size) {
            TTVideoLandingPageActivity10 tTVideoLandingPageActivity10 = list2.get(i);
            i++;
            if (i < size && tTVideoLandingPageActivity10.IAuthTabCallback() + tTVideoLandingPageActivity10.onNavigationEvent() > list2.get(i).IAuthTabCallback()) {
                throw new IOException("Corrupted TAR archive. Sparse blocks for " + onExtraCallback() + " overlap each other.");
            }
            if (tTVideoLandingPageActivity10.IAuthTabCallback() + tTVideoLandingPageActivity10.onNavigationEvent() < 0) {
                throw new IOException("Unreadable TAR archive. Offset and numbytes for sparse block in " + onExtraCallback() + " too large.");
            }
        }
        if (!list2.isEmpty()) {
            TTVideoLandingPageActivity10 tTVideoLandingPageActivity102 = list2.get(size - 1);
            if (tTVideoLandingPageActivity102.IAuthTabCallback() + tTVideoLandingPageActivity102.onNavigationEvent() > onWarmupCompleted()) {
                throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
            }
        }
        return list2;
    }

    public static /* synthetic */ boolean onExtraCallback(TTVideoLandingPageActivity10 tTVideoLandingPageActivity10) {
        return tTVideoLandingPageActivity10.IAuthTabCallback() > 0 || tTVideoLandingPageActivity10.onNavigationEvent() > 0;
    }

    public long onWarmupCompleted() {
        if (!ICustomTabsCallback()) {
            return onNavigationEvent();
        }
        return this.onActivityLayout;
    }

    public long onNavigationEvent() {
        return this.onActivityResized;
    }

    public List<TTVideoLandingPageActivity10> IAuthTabCallbackStub() {
        return this.ICustomTabsCallbackStubProxy;
    }

    public int hashCode() {
        return onExtraCallback().hashCode();
    }

    public boolean IAuthTabCallbackDefault() {
        Path path = this.IAuthTabCallbackStub;
        if (path != null) {
            return Files.isDirectory(path, this.readTypedObject);
        }
        if (this.IAuthTabCallbackStubProxy == 53) {
            return true;
        }
        return (extraCallbackWithResult() || IAuthTabCallbackStubProxy() || !onExtraCallback().endsWith("/")) ? false : true;
    }

    public boolean onTransact() {
        return this.access100;
    }

    public boolean asBinder() {
        Path path = this.IAuthTabCallbackStub;
        if (path != null) {
            return Files.isRegularFile(path, this.readTypedObject);
        }
        byte b = this.IAuthTabCallbackStubProxy;
        if (b == 0 || b == 48) {
            return true;
        }
        return !onExtraCallback().endsWith("/");
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.IAuthTabCallbackStubProxy == 103;
    }

    public boolean asInterface() {
        return this.IAuthTabCallbackStubProxy == 75;
    }

    public boolean access000() {
        return this.IAuthTabCallbackStubProxy == 76;
    }

    public boolean IAuthTabCallback_Parcel() {
        return getInterfaceDescriptor() || readTypedObject();
    }

    private boolean onWarmupCompleted(byte[] bArr) {
        byte b = bArr[475];
        if (b == 0) {
            return false;
        }
        if (bArr[156] != 77) {
            return true;
        }
        return (bArr[464] & ByteCompanionObject.MIN_VALUE) == 0 && b != 32;
    }

    private boolean onExtraCallback(byte[] bArr, int i, int i2) {
        if ((bArr[i] & ByteCompanionObject.MIN_VALUE) == 0) {
            int i3 = i2 - 1;
            for (int i4 = 0; i4 < i3; i4++) {
                byte b = bArr[i + i4];
                if (b < 48 || b > 55) {
                    return true;
                }
            }
            byte b2 = bArr[i + i3];
            if (b2 != 32 && b2 != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean getInterfaceDescriptor() {
        return this.IAuthTabCallbackStubProxy == 83;
    }

    public boolean access100() {
        return this.onMinimized;
    }

    public boolean readTypedObject() {
        return this.onMessageChannelReady;
    }

    public boolean extraCallbackWithResult() {
        byte b = this.IAuthTabCallbackStubProxy;
        return b == 120 || b == 88;
    }

    public boolean ICustomTabsCallback() {
        return IAuthTabCallback_Parcel() || writeTypedObject();
    }

    public boolean writeTypedObject() {
        return this.ICustomTabsCallbackStub;
    }

    private boolean onExtraCallback(Map<String, String> map, byte[] bArr) {
        if (PAGImageItem.onExtraCallback("tar\u0000", bArr, 508, 4)) {
            return true;
        }
        String str = map.get("SCHILY.archtype");
        return str != null ? "xustar".equals(str) || "exustar".equals(str) : (onWarmupCompleted(bArr) || onExtraCallback(bArr, 476, 12) || onExtraCallback(bArr, 488, 12)) ? false : true;
    }

    private long onNavigationEvent(byte[] bArr, int i, int i2, boolean z) {
        if (z) {
            try {
                return TTVideoLandingPageActivity4.onNavigationEvent(bArr, i, i2);
            } catch (IllegalArgumentException unused) {
                return -1L;
            }
        }
        return TTVideoLandingPageActivity4.onNavigationEvent(bArr, i, i2);
    }

    private void onExtraCallbackWithResult(Map<String, String> map, byte[] bArr, TTWebsiteActivity7 tTWebsiteActivity7, boolean z, boolean z2) throws IOException {
        try {
            onWarmupCompleted(map, bArr, tTWebsiteActivity7, z, z2);
        } catch (IllegalArgumentException e) {
            throw new IOException("Corrupted TAR archive.", e);
        }
    }

    private void onWarmupCompleted(Map<String, String> map, byte[] bArr, TTWebsiteActivity7 tTWebsiteActivity7, boolean z, boolean z2) throws IOException {
        String strOnNavigationEvent;
        String strOnNavigationEvent2;
        String strOnNavigationEvent3;
        String strOnNavigationEvent4;
        String strOnNavigationEvent5;
        String strOnNavigationEvent6;
        if (z) {
            strOnNavigationEvent = TTVideoLandingPageActivity4.IAuthTabCallback(bArr, 0, 100);
        } else {
            strOnNavigationEvent = TTVideoLandingPageActivity4.onNavigationEvent(bArr, 0, 100, tTWebsiteActivity7);
        }
        this.ICustomTabsCallback = strOnNavigationEvent;
        this.writeTypedObject = (int) onNavigationEvent(bArr, 100, 8, z2);
        this.onUnminimized = (int) onNavigationEvent(bArr, 108, 8, z2);
        this.getInterfaceDescriptor = (int) onNavigationEvent(bArr, 116, 8, z2);
        long jOnNavigationEvent = TTVideoLandingPageActivity4.onNavigationEvent(bArr, 124, 12);
        this.onActivityResized = jOnNavigationEvent;
        if (jOnNavigationEvent < 0) {
            throw new IOException("broken archive, entry with negative size");
        }
        this.extraCallback = PAGNativeAdLoadCallback.tI_(onNavigationEvent(bArr, 136, 12, z2));
        this.onWarmupCompleted = TTVideoLandingPageActivity4.onExtraCallback(bArr);
        this.IAuthTabCallbackStubProxy = bArr[156];
        if (z) {
            strOnNavigationEvent2 = TTVideoLandingPageActivity4.IAuthTabCallback(bArr, 157, 100);
        } else {
            strOnNavigationEvent2 = TTVideoLandingPageActivity4.onNavigationEvent(bArr, 157, 100, tTWebsiteActivity7);
        }
        this.IAuthTabCallback_Parcel = strOnNavigationEvent2;
        this.extraCallbackWithResult = TTVideoLandingPageActivity4.IAuthTabCallback(bArr, Imgcodecs.IMWRITE_TIFF_XDPI, 6);
        this.onRelationshipValidationResult = TTVideoLandingPageActivity4.IAuthTabCallback(bArr, 263, 2);
        if (z) {
            strOnNavigationEvent3 = TTVideoLandingPageActivity4.IAuthTabCallback(bArr, 265, 32);
        } else {
            strOnNavigationEvent3 = TTVideoLandingPageActivity4.onNavigationEvent(bArr, 265, 32, tTWebsiteActivity7);
        }
        this.ICustomTabsCallbackDefault = strOnNavigationEvent3;
        if (z) {
            strOnNavigationEvent4 = TTVideoLandingPageActivity4.IAuthTabCallback(bArr, 297, 32);
        } else {
            strOnNavigationEvent4 = TTVideoLandingPageActivity4.onNavigationEvent(bArr, 297, 32, tTWebsiteActivity7);
        }
        this.access000 = strOnNavigationEvent4;
        byte b = this.IAuthTabCallbackStubProxy;
        if (b == 51 || b == 52) {
            this.asBinder = (int) onNavigationEvent(bArr, 329, 8, z2);
            this.IAuthTabCallbackDefault = (int) onNavigationEvent(bArr, 337, 8, z2);
        }
        int iIAuthTabCallback = IAuthTabCallback(map, bArr);
        if (iIAuthTabCallback == 2) {
            this.IAuthTabCallback = sY_(onNavigationEvent(bArr, 345, 12, z2));
            this.onNavigationEvent = sY_(onNavigationEvent(bArr, 357, 12, z2));
            this.ICustomTabsCallbackStubProxy = new ArrayList(TTVideoLandingPageActivity4.onWarmupCompleted(bArr, 386, 4));
            this.access100 = TTVideoLandingPageActivity4.onNavigationEvent(bArr, 482);
            this.onActivityLayout = TTVideoLandingPageActivity4.onExtraCallback(bArr, 483, 12);
            return;
        }
        if (iIAuthTabCallback == 4) {
            if (z) {
                strOnNavigationEvent5 = TTVideoLandingPageActivity4.IAuthTabCallback(bArr, 345, Imgproc.COLOR_RGB2YUV_YV12);
            } else {
                strOnNavigationEvent5 = TTVideoLandingPageActivity4.onNavigationEvent(bArr, 345, Imgproc.COLOR_RGB2YUV_YV12, tTWebsiteActivity7);
            }
            if (!strOnNavigationEvent5.isEmpty()) {
                this.ICustomTabsCallback = strOnNavigationEvent5 + "/" + this.ICustomTabsCallback;
            }
            this.IAuthTabCallback = sY_(onNavigationEvent(bArr, 476, 12, z2));
            this.onNavigationEvent = sY_(onNavigationEvent(bArr, 488, 12, z2));
            return;
        }
        if (z) {
            strOnNavigationEvent6 = TTVideoLandingPageActivity4.IAuthTabCallback(bArr, 345, Imgproc.COLOR_COLORCVT_MAX);
        } else {
            strOnNavigationEvent6 = TTVideoLandingPageActivity4.onNavigationEvent(bArr, 345, Imgproc.COLOR_COLORCVT_MAX, tTWebsiteActivity7);
        }
        if (IAuthTabCallbackDefault() && !this.ICustomTabsCallback.endsWith("/")) {
            this.ICustomTabsCallback += "/";
        }
        if (strOnNavigationEvent6.isEmpty()) {
            return;
        }
        this.ICustomTabsCallback = strOnNavigationEvent6 + "/" + this.ICustomTabsCallback;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallback(String str, String str2, Map<String, String> map) throws IOException, NumberFormatException {
        switch (str) {
            case "SCHILY.devmajor":
                int i = Integer.parseInt(str2);
                if (i < 0) {
                    throw new IOException("Corrupted TAR archive. Dev-Major is negative");
                }
                onExtraCallbackWithResult(i);
                return;
            case "SCHILY.devminor":
                int i2 = Integer.parseInt(str2);
                if (i2 < 0) {
                    throw new IOException("Corrupted TAR archive. Dev-Minor is negative");
                }
                IAuthTabCallback(i2);
                return;
            case "GNU.sparse.realsize":
                onNavigationEvent(map);
                return;
            case "GNU.sparse.size":
                IAuthTabCallback(map);
                return;
            case "gid":
                onWarmupCompleted(Long.parseLong(str2));
                return;
            case "uid":
                onExtraCallbackWithResult(Long.parseLong(str2));
                return;
            case "path":
                onWarmupCompleted(str2);
                return;
            case "size":
                long j = Long.parseLong(str2);
                if (j < 0) {
                    throw new IOException("Corrupted TAR archive. Entry size is negative");
                }
                onNavigationEvent(j);
                return;
            case "atime":
                ta_(FileTime.from(TimeConversions.convert(IAuthTabCallback(str2))));
                return;
            case "ctime":
                tc_(FileTime.from(TimeConversions.convert(IAuthTabCallback(str2))));
                return;
            case "gname":
                onNavigationEvent(str2);
                return;
            case "mtime":
                tb_(FileTime.from(TimeConversions.convert(IAuthTabCallback(str2))));
                return;
            case "uname":
                onExtraCallback(str2);
                return;
            case "LIBARCHIVE.creationtime":
                sZ_(FileTime.from(TimeConversions.convert(IAuthTabCallback(str2))));
                return;
            case "SCHILY.filetype":
                if ("sparse".equals(str2)) {
                    onExtraCallback(map);
                    return;
                }
                return;
            case "linkpath":
                onExtraCallbackWithResult(str2);
                return;
            default:
                this.asInterface.put(str, str2);
                return;
        }
    }

    public void sZ_(FileTime fileTime) {
        this.onExtraCallback = fileTime;
    }

    public void onExtraCallbackWithResult(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Major device number is out of range: " + i);
        }
        this.asBinder = i;
    }

    public void IAuthTabCallback(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Minor device number is out of range: " + i);
        }
        this.IAuthTabCallbackDefault = i;
    }

    public void onWarmupCompleted(long j) {
        this.getInterfaceDescriptor = j;
    }

    public void onNavigationEvent(String str) {
        this.access000 = str;
    }

    public void ta_(FileTime fileTime) {
        this.IAuthTabCallback = fileTime;
    }

    public void tb_(FileTime fileTime) {
        Objects.requireNonNull(fileTime, "Time must not be null");
        TTRewardVideoActivity5.te_(fileTime);
        this.extraCallback = fileTime;
    }

    public void onExtraCallbackWithResult(String str) {
        this.IAuthTabCallback_Parcel = str;
    }

    public void onWarmupCompleted(String str) {
        this.ICustomTabsCallback = onNavigationEvent(str, this.onPostMessage);
    }

    public void onNavigationEvent(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Size is out of range: " + j);
        }
        this.onActivityResized = j;
    }

    public void onExtraCallbackWithResult(List<TTVideoLandingPageActivity10> list) {
        this.ICustomTabsCallbackStubProxy = list;
    }

    public void tc_(FileTime fileTime) {
        this.onNavigationEvent = fileTime;
    }

    public void onExtraCallbackWithResult(long j) {
        this.onUnminimized = j;
    }

    public void onExtraCallback(String str) {
        this.ICustomTabsCallbackDefault = str;
    }

    void onExtraCallbackWithResult(Map<String, String> map) throws IOException, NumberFormatException {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            onExtraCallback(entry.getKey(), entry.getValue(), map);
        }
    }
}
