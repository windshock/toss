package o;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTRewardVideoActivity4 extends TTLandingPageActivity15 {
    private long IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final InputStream IAuthTabCallbackStub;
    private List<InputStream> IAuthTabCallbackStubProxy;
    private final byte[] IAuthTabCallback_Parcel;
    private final TTWebsiteActivity7 ICustomTabsCallback;
    private final byte[] access000;
    private final boolean access100;
    private long asBinder;
    private Map<String, String> asInterface;
    private final int getInterfaceDescriptor;
    private TTRewardVideoActivity7 onExtraCallback;
    private int onExtraCallbackWithResult;
    final String onNavigationEvent;
    private final List<TTVideoLandingPageActivity10> onTransact;
    private final int onWarmupCompleted;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public TTRewardVideoActivity4(InputStream inputStream) {
        this(inputStream, 10240, Imgcodecs.IMWRITE_AVIF_QUALITY);
    }

    public TTRewardVideoActivity4(InputStream inputStream, int i, int i2) {
        this(inputStream, i, i2, null);
    }

    public TTRewardVideoActivity4(InputStream inputStream, int i, int i2, String str) {
        this(inputStream, i, i2, str, false);
    }

    public TTRewardVideoActivity4(InputStream inputStream, int i, int i2, String str, boolean z) {
        this.access000 = new byte[256];
        this.asInterface = new HashMap();
        this.onTransact = new ArrayList();
        this.IAuthTabCallbackStub = inputStream;
        this.IAuthTabCallbackDefault = false;
        this.onNavigationEvent = str;
        this.ICustomTabsCallback = dj13.onExtraCallback(str);
        this.getInterfaceDescriptor = i2;
        this.IAuthTabCallback_Parcel = new byte[i2];
        this.onWarmupCompleted = i;
        this.access100 = z;
    }

    private void onNavigationEvent(Map<String, String> map, List<TTVideoLandingPageActivity10> list) throws IOException, NumberFormatException {
        this.onExtraCallback.onExtraCallbackWithResult(map);
        this.onExtraCallback.onExtraCallbackWithResult(list);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (asInterface()) {
            return 0;
        }
        return this.onExtraCallback.onWarmupCompleted() - this.IAuthTabCallback > 2147483647L ? IntCompanionObject.MAX_VALUE : (int) (this.onExtraCallback.onWarmupCompleted() - this.IAuthTabCallback);
    }

    private void asBinder() throws IOException {
        this.onExtraCallbackWithResult = -1;
        this.IAuthTabCallbackStubProxy = new ArrayList();
        List<TTVideoLandingPageActivity10> listOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        TTVideoLandingPageActivity tTVideoLandingPageActivity = new TTVideoLandingPageActivity();
        long jIAuthTabCallback = 0;
        for (TTVideoLandingPageActivity10 tTVideoLandingPageActivity10 : listOnExtraCallbackWithResult) {
            long jIAuthTabCallback2 = tTVideoLandingPageActivity10.IAuthTabCallback() - jIAuthTabCallback;
            if (jIAuthTabCallback2 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (jIAuthTabCallback2 > 0) {
                this.IAuthTabCallbackStubProxy.add(new setMrcTrackerKey(tTVideoLandingPageActivity, tTVideoLandingPageActivity10.IAuthTabCallback() - jIAuthTabCallback));
            }
            if (tTVideoLandingPageActivity10.onNavigationEvent() > 0) {
                this.IAuthTabCallbackStubProxy.add(new setMrcTrackerKey(this.IAuthTabCallbackStub, tTVideoLandingPageActivity10.onNavigationEvent()));
            }
            jIAuthTabCallback = tTVideoLandingPageActivity10.IAuthTabCallback() + tTVideoLandingPageActivity10.onNavigationEvent();
        }
        if (this.IAuthTabCallbackStubProxy.isEmpty()) {
            return;
        }
        this.onExtraCallbackWithResult = 0;
    }

    @Override // o.TTLandingPageActivity15
    public boolean IAuthTabCallback(TTLandingPageActivity14 tTLandingPageActivity14) {
        return tTLandingPageActivity14 instanceof TTRewardVideoActivity7;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        List<InputStream> list = this.IAuthTabCallbackStubProxy;
        if (list != null) {
            Iterator<InputStream> it = list.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
        this.IAuthTabCallbackStub.close();
    }

    private void IAuthTabCallbackStub() throws IOException {
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult();
        long j = this.onWarmupCompleted;
        long j2 = jOnExtraCallbackWithResult % j;
        if (j2 > 0) {
            onWarmupCompleted(PAGNativeAdLoadListener.onExtraCallbackWithResult(this.IAuthTabCallbackStub, j - j2));
        }
    }

    private long onNavigationEvent(long j, long j2, long j3) throws IOException {
        if (this.IAuthTabCallbackStub instanceof FileInputStream) {
            j2 = Math.min(j2, j);
        }
        if (j2 == j3) {
            return j2;
        }
        throw new IOException("Truncated TAR archive");
    }

    protected byte[] onExtraCallback() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = read(this.access000);
            if (i < 0) {
                break;
            }
            byteArrayOutputStream.write(this.access000, 0, i);
        }
        onNavigationEvent();
        if (this.onExtraCallback == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
    }

    @Override // o.TTLandingPageActivity15
    public TTLandingPageActivity14 onNavigationEvent() throws IOException {
        return onWarmupCompleted();
    }

    public TTRewardVideoActivity7 onWarmupCompleted() throws IOException {
        if (IAuthTabCallback()) {
            return null;
        }
        if (this.onExtraCallback != null) {
            PAGNativeAdLoadListener.onExtraCallbackWithResult(this, LongCompanionObject.MAX_VALUE);
            getInterfaceDescriptor();
        }
        byte[] bArrOnTransact = onTransact();
        if (bArrOnTransact == null) {
            this.onExtraCallback = null;
            return null;
        }
        try {
            TTRewardVideoActivity7 tTRewardVideoActivity7 = new TTRewardVideoActivity7(this.asInterface, bArrOnTransact, this.ICustomTabsCallback, this.access100);
            this.onExtraCallback = tTRewardVideoActivity7;
            this.IAuthTabCallback = 0L;
            this.asBinder = tTRewardVideoActivity7.onNavigationEvent();
            if (this.onExtraCallback.asInterface()) {
                byte[] bArrOnExtraCallback = onExtraCallback();
                if (bArrOnExtraCallback == null) {
                    return null;
                }
                this.onExtraCallback.onExtraCallbackWithResult(this.ICustomTabsCallback.onNavigationEvent(bArrOnExtraCallback));
            }
            if (this.onExtraCallback.access000()) {
                byte[] bArrOnExtraCallback2 = onExtraCallback();
                if (bArrOnExtraCallback2 == null) {
                    return null;
                }
                String strOnNavigationEvent = this.ICustomTabsCallback.onNavigationEvent(bArrOnExtraCallback2);
                this.onExtraCallback.onWarmupCompleted(strOnNavigationEvent);
                if (this.onExtraCallback.IAuthTabCallbackDefault() && !strOnNavigationEvent.endsWith("/")) {
                    this.onExtraCallback.onWarmupCompleted(strOnNavigationEvent + "/");
                }
            }
            if (this.onExtraCallback.IAuthTabCallbackStubProxy()) {
                IAuthTabCallback_Parcel();
            }
            try {
                if (this.onExtraCallback.extraCallbackWithResult()) {
                    access000();
                } else if (!this.asInterface.isEmpty()) {
                    onNavigationEvent(this.asInterface, this.onTransact);
                }
                if (this.onExtraCallback.getInterfaceDescriptor()) {
                    access100();
                }
                this.asBinder = this.onExtraCallback.onNavigationEvent();
                return this.onExtraCallback;
            } catch (NumberFormatException e) {
                throw new IOException("Error detected parsing the pax header", e);
            }
        } catch (IllegalArgumentException e2) {
            throw new IOException("Error detected parsing the header", e2);
        }
    }

    private byte[] onTransact() throws IOException {
        byte[] bArrIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallback(onWarmupCompleted(bArrIAuthTabCallbackDefault));
        if (!IAuthTabCallback() || bArrIAuthTabCallbackDefault == null) {
            return bArrIAuthTabCallbackDefault;
        }
        IAuthTabCallbackStubProxy();
        IAuthTabCallbackStub();
        return null;
    }

    protected final boolean IAuthTabCallback() {
        return this.IAuthTabCallbackDefault;
    }

    private boolean asInterface() {
        TTRewardVideoActivity7 tTRewardVideoActivity7 = this.onExtraCallback;
        return tTRewardVideoActivity7 != null && tTRewardVideoActivity7.IAuthTabCallbackDefault();
    }

    protected boolean onWarmupCompleted(byte[] bArr) {
        return bArr == null || PAGImageItem.onExtraCallbackWithResult(bArr, this.getInterfaceDescriptor);
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
        }
    }

    private void access000() throws IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapOnExtraCallbackWithResult = TTVideoLandingPageActivity4.onExtraCallbackWithResult(this, arrayList, this.asInterface, this.asBinder);
        if (mapOnExtraCallbackWithResult.containsKey("GNU.sparse.map")) {
            arrayList = new ArrayList(TTVideoLandingPageActivity4.onNavigationEvent(mapOnExtraCallbackWithResult.get("GNU.sparse.map")));
        }
        onNavigationEvent();
        if (this.onExtraCallback == null) {
            throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
        }
        onNavigationEvent(mapOnExtraCallbackWithResult, arrayList);
        if (this.onExtraCallback.access100()) {
            this.onExtraCallback.onExtraCallbackWithResult(TTVideoLandingPageActivity4.onWarmupCompleted(this.IAuthTabCallbackStub, this.getInterfaceDescriptor));
        }
        asBinder();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iOnNavigationEvent;
        if (i2 == 0) {
            return 0;
        }
        if (IAuthTabCallback() || asInterface()) {
            return -1;
        }
        TTRewardVideoActivity7 tTRewardVideoActivity7 = this.onExtraCallback;
        if (tTRewardVideoActivity7 == null) {
            throw new IllegalStateException("No current tar entry");
        }
        if (this.IAuthTabCallback >= tTRewardVideoActivity7.onWarmupCompleted()) {
            return -1;
        }
        int iMin = Math.min(i2, available());
        if (this.onExtraCallback.ICustomTabsCallback()) {
            iOnNavigationEvent = onNavigationEvent(bArr, i, iMin);
        } else {
            iOnNavigationEvent = this.IAuthTabCallbackStub.read(bArr, i, iMin);
        }
        if (iOnNavigationEvent != -1) {
            onWarmupCompleted(iOnNavigationEvent);
            this.IAuthTabCallback += iOnNavigationEvent;
            return iOnNavigationEvent;
        }
        if (iMin > 0) {
            throw new IOException("Truncated TAR archive");
        }
        onExtraCallback(true);
        return iOnNavigationEvent;
    }

    private void IAuthTabCallback_Parcel() throws IOException {
        this.asInterface = TTVideoLandingPageActivity4.onExtraCallbackWithResult(this, this.onTransact, this.asInterface, this.asBinder);
        onNavigationEvent();
        if (this.onExtraCallback == null) {
            throw new IOException("Error detected parsing the pax header");
        }
    }

    private void access100() throws IOException {
        TTVideoLandingPageActivity11 tTVideoLandingPageActivity11;
        if (this.onExtraCallback.onTransact()) {
            do {
                byte[] bArrOnTransact = onTransact();
                if (bArrOnTransact == null) {
                    throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                }
                tTVideoLandingPageActivity11 = new TTVideoLandingPageActivity11(bArrOnTransact);
                this.onExtraCallback.IAuthTabCallbackStub().addAll(tTVideoLandingPageActivity11.onExtraCallbackWithResult());
            } while (tTVideoLandingPageActivity11.IAuthTabCallback());
        }
        asBinder();
    }

    protected byte[] IAuthTabCallbackDefault() throws IOException {
        int iIAuthTabCallback = PAGNativeAdLoadListener.IAuthTabCallback(this.IAuthTabCallbackStub, this.IAuthTabCallback_Parcel);
        onWarmupCompleted(iIAuthTabCallback);
        if (iIAuthTabCallback != this.getInterfaceDescriptor) {
            return null;
        }
        return this.IAuthTabCallback_Parcel;
    }

    private int onNavigationEvent(byte[] bArr, int i, int i2) throws IOException {
        List<InputStream> list = this.IAuthTabCallbackStubProxy;
        if (list == null || list.isEmpty()) {
            return this.IAuthTabCallbackStub.read(bArr, i, i2);
        }
        if (this.onExtraCallbackWithResult >= this.IAuthTabCallbackStubProxy.size()) {
            return -1;
        }
        int i3 = this.IAuthTabCallbackStubProxy.get(this.onExtraCallbackWithResult).read(bArr, i, i2);
        if (this.onExtraCallbackWithResult == this.IAuthTabCallbackStubProxy.size() - 1) {
            return i3;
        }
        if (i3 == -1) {
            this.onExtraCallbackWithResult++;
            return onNavigationEvent(bArr, i, i2);
        }
        if (i3 >= i2) {
            return i3;
        }
        this.onExtraCallbackWithResult++;
        int iOnNavigationEvent = onNavigationEvent(bArr, i + i3, i2 - i3);
        return iOnNavigationEvent == -1 ? i3 : i3 + iOnNavigationEvent;
    }

    @Override // java.io.InputStream
    public void reset() {
        synchronized (this) {
        }
    }

    protected final void onExtraCallback(boolean z) {
        this.IAuthTabCallbackDefault = z;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long jOnExtraCallbackWithResult;
        if (j <= 0 || asInterface()) {
            return 0L;
        }
        long jAvailable = this.IAuthTabCallbackStub.available();
        long jMin = Math.min(j, this.onExtraCallback.onWarmupCompleted() - this.IAuthTabCallback);
        if (!this.onExtraCallback.ICustomTabsCallback()) {
            jOnExtraCallbackWithResult = onNavigationEvent(jAvailable, PAGNativeAdLoadListener.onExtraCallbackWithResult(this.IAuthTabCallbackStub, jMin), jMin);
        } else {
            jOnExtraCallbackWithResult = onExtraCallbackWithResult(jMin);
        }
        onWarmupCompleted(jOnExtraCallbackWithResult);
        this.IAuthTabCallback += jOnExtraCallbackWithResult;
        return jOnExtraCallbackWithResult;
    }

    private void getInterfaceDescriptor() throws IOException {
        if (asInterface()) {
            return;
        }
        long j = this.asBinder;
        if (j <= 0 || j % this.getInterfaceDescriptor == 0) {
            return;
        }
        long jAvailable = this.IAuthTabCallbackStub.available();
        long j2 = this.asBinder;
        long j3 = this.getInterfaceDescriptor;
        long j4 = (((j2 / j3) + 1) * j3) - j2;
        onWarmupCompleted(onNavigationEvent(jAvailable, PAGNativeAdLoadListener.onExtraCallbackWithResult(this.IAuthTabCallbackStub, j4), j4));
    }

    private long onExtraCallbackWithResult(long j) throws IOException {
        List<InputStream> list = this.IAuthTabCallbackStubProxy;
        if (list == null || list.isEmpty()) {
            return this.IAuthTabCallbackStub.skip(j);
        }
        long jSkip = 0;
        while (jSkip < j && this.onExtraCallbackWithResult < this.IAuthTabCallbackStubProxy.size()) {
            jSkip += this.IAuthTabCallbackStubProxy.get(this.onExtraCallbackWithResult).skip(j - jSkip);
            if (jSkip < j) {
                this.onExtraCallbackWithResult++;
            }
        }
        return jSkip;
    }

    private void IAuthTabCallbackStubProxy() throws IOException {
        boolean zMarkSupported = this.IAuthTabCallbackStub.markSupported();
        if (zMarkSupported) {
            this.IAuthTabCallbackStub.mark(this.getInterfaceDescriptor);
        }
        try {
            if (onWarmupCompleted(IAuthTabCallbackDefault()) || !zMarkSupported) {
            }
        } finally {
            if (zMarkSupported) {
                onExtraCallback(this.getInterfaceDescriptor);
                this.IAuthTabCallbackStub.reset();
            }
        }
    }
}
