package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import o.TTLandingPageActivity5;
import o.TTLandingPageActivity6;
import o.TTLandingPageActivity8;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTLandingPageActivity6 extends TTLandingPageActivity15 {
    private TTLandingPageActivity8 IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final Map<Integer, TTLandingPageActivity8> IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private final byte[] IAuthTabCallback_Parcel;
    private final TTWebsiteActivity7 access000;
    private int access100;
    private final Map<Integer, TTLandingPageActivity3> asBinder;
    private boolean asInterface;
    private final Queue<TTLandingPageActivity8> getInterfaceDescriptor;
    private byte[] onExtraCallback;
    private long onExtraCallbackWithResult;
    private long onNavigationEvent;
    private long onTransact;
    protected TTLandingPageActivity81 onWarmupCompleted;

    public static /* synthetic */ int onExtraCallbackWithResult(TTLandingPageActivity8 tTLandingPageActivity8, TTLandingPageActivity8 tTLandingPageActivity82) {
        if (tTLandingPageActivity8.asBinder() == null || tTLandingPageActivity82.asBinder() == null) {
            return Integer.MAX_VALUE;
        }
        return tTLandingPageActivity8.asBinder().compareTo(tTLandingPageActivity82.asBinder());
    }

    public void close() throws IOException {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.IAuthTabCallbackDefault = true;
        this.onWarmupCompleted.close();
    }

    public long onExtraCallbackWithResult() {
        return this.onWarmupCompleted.onExtraCallbackWithResult();
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public TTLandingPageActivity8 onNavigationEvent() throws IOException {
        if (!this.getInterfaceDescriptor.isEmpty()) {
            return this.getInterfaceDescriptor.remove();
        }
        TTLandingPageActivity8 tTLandingPageActivity8 = null;
        String str = null;
        while (tTLandingPageActivity8 == null) {
            if (this.asInterface) {
                return null;
            }
            while (this.access100 < this.IAuthTabCallback.IAuthTabCallback()) {
                TTLandingPageActivity8 tTLandingPageActivity82 = this.IAuthTabCallback;
                int i = this.access100;
                this.access100 = i + 1;
                if (!tTLandingPageActivity82.onExtraCallbackWithResult(i) && this.onWarmupCompleted.skip(1024L) == -1) {
                    throw new EOFException();
                }
            }
            this.access100 = 0;
            this.onTransact = this.onWarmupCompleted.onExtraCallbackWithResult();
            byte[] bArrOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
            if (!TTLandingPageActivity61.onNavigationEvent(bArrOnNavigationEvent)) {
                throw new InvalidFormatException();
            }
            this.IAuthTabCallback = TTLandingPageActivity8.onWarmupCompleted(bArrOnNavigationEvent);
            while (TTLandingPageActivity5.onNavigationEvent.ADDR == this.IAuthTabCallback.onExtraCallbackWithResult()) {
                if (this.onWarmupCompleted.skip((this.IAuthTabCallback.IAuthTabCallback() - this.IAuthTabCallback.onWarmupCompleted()) << 10) == -1) {
                    throw new EOFException();
                }
                this.onTransact = this.onWarmupCompleted.onExtraCallbackWithResult();
                byte[] bArrOnNavigationEvent2 = this.onWarmupCompleted.onNavigationEvent();
                if (!TTLandingPageActivity61.onNavigationEvent(bArrOnNavigationEvent2)) {
                    throw new InvalidFormatException();
                }
                this.IAuthTabCallback = TTLandingPageActivity8.onWarmupCompleted(bArrOnNavigationEvent2);
            }
            if (TTLandingPageActivity5.onNavigationEvent.END == this.IAuthTabCallback.onExtraCallbackWithResult()) {
                this.asInterface = true;
                return null;
            }
            TTLandingPageActivity8 tTLandingPageActivity83 = this.IAuthTabCallback;
            if (tTLandingPageActivity83.asInterface()) {
                onNavigationEvent(this.IAuthTabCallback);
                this.onExtraCallbackWithResult = 0L;
                this.onNavigationEvent = 0L;
                this.access100 = this.IAuthTabCallback.IAuthTabCallback();
            } else {
                this.onExtraCallbackWithResult = 0L;
                this.onNavigationEvent = this.IAuthTabCallback.onExtraCallback();
                this.access100 = 0;
            }
            this.IAuthTabCallbackStubProxy = this.IAuthTabCallback_Parcel.length;
            String strIAuthTabCallback = IAuthTabCallback(tTLandingPageActivity83);
            if (strIAuthTabCallback == null) {
                tTLandingPageActivity83 = null;
            }
            TTLandingPageActivity8 tTLandingPageActivity84 = tTLandingPageActivity83;
            str = strIAuthTabCallback;
            tTLandingPageActivity8 = tTLandingPageActivity84;
        }
        tTLandingPageActivity8.onNavigationEvent(str);
        tTLandingPageActivity8.onExtraCallback(this.asBinder.get(Integer.valueOf(tTLandingPageActivity8.onNavigationEvent())).onExtraCallbackWithResult());
        tTLandingPageActivity8.onNavigationEvent(this.onTransact);
        return tTLandingPageActivity8;
    }

    private String IAuthTabCallback(TTLandingPageActivity8 tTLandingPageActivity8) {
        Stack stack = new Stack();
        int iOnNavigationEvent = tTLandingPageActivity8.onNavigationEvent();
        while (true) {
            if (!this.asBinder.containsKey(Integer.valueOf(iOnNavigationEvent))) {
                stack.clear();
                break;
            }
            TTLandingPageActivity3 tTLandingPageActivity3 = this.asBinder.get(Integer.valueOf(iOnNavigationEvent));
            stack.push(tTLandingPageActivity3.onExtraCallbackWithResult());
            if (tTLandingPageActivity3.IAuthTabCallback() == tTLandingPageActivity3.onWarmupCompleted()) {
                break;
            }
            iOnNavigationEvent = tTLandingPageActivity3.onWarmupCompleted();
        }
        if (stack.isEmpty()) {
            this.IAuthTabCallbackStub.put(Integer.valueOf(tTLandingPageActivity8.onNavigationEvent()), tTLandingPageActivity8);
            return null;
        }
        StringBuilder sb = new StringBuilder((String) stack.pop());
        while (!stack.isEmpty()) {
            sb.append('/');
            sb.append((String) stack.pop());
        }
        return sb.toString();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.asInterface || this.IAuthTabCallbackDefault) {
            return -1;
        }
        long j = this.onExtraCallbackWithResult;
        long j2 = this.onNavigationEvent;
        if (j >= j2) {
            return -1;
        }
        if (this.IAuthTabCallback == null) {
            throw new IllegalStateException("No current dump entry");
        }
        if (i2 + j > j2) {
            i2 = (int) (j2 - j);
        }
        int i3 = 0;
        while (i2 > 0) {
            int iMin = Math.min(i2, this.IAuthTabCallback_Parcel.length - this.IAuthTabCallbackStubProxy);
            int i4 = this.IAuthTabCallbackStubProxy;
            byte[] bArr2 = this.IAuthTabCallback_Parcel;
            if (i4 + iMin <= bArr2.length) {
                System.arraycopy(bArr2, i4, bArr, i, iMin);
                i3 += iMin;
                this.IAuthTabCallbackStubProxy += iMin;
                i2 -= iMin;
                i += iMin;
            }
            if (i2 > 0) {
                if (this.access100 >= 512) {
                    byte[] bArrOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
                    if (!TTLandingPageActivity61.onNavigationEvent(bArrOnNavigationEvent)) {
                        throw new InvalidFormatException();
                    }
                    this.IAuthTabCallback = TTLandingPageActivity8.onWarmupCompleted(bArrOnNavigationEvent);
                    this.access100 = 0;
                }
                TTLandingPageActivity8 tTLandingPageActivity8 = this.IAuthTabCallback;
                int i5 = this.access100;
                this.access100 = i5 + 1;
                if (!tTLandingPageActivity8.onExtraCallbackWithResult(i5)) {
                    TTLandingPageActivity81 tTLandingPageActivity81 = this.onWarmupCompleted;
                    byte[] bArr3 = this.IAuthTabCallback_Parcel;
                    if (tTLandingPageActivity81.read(bArr3, 0, bArr3.length) != this.IAuthTabCallback_Parcel.length) {
                        throw new EOFException();
                    }
                } else {
                    Arrays.fill(this.IAuthTabCallback_Parcel, (byte) 0);
                }
                this.IAuthTabCallbackStubProxy = 0;
            }
        }
        this.onExtraCallbackWithResult += i3;
        return i3;
    }

    private void onNavigationEvent(TTLandingPageActivity8 tTLandingPageActivity8) throws IOException {
        long jOnExtraCallback = tTLandingPageActivity8.onExtraCallback();
        boolean z = true;
        while (true) {
            if (!z && TTLandingPageActivity5.onNavigationEvent.ADDR != tTLandingPageActivity8.onExtraCallbackWithResult()) {
                return;
            }
            if (!z) {
                this.onWarmupCompleted.onNavigationEvent();
            }
            if (!this.asBinder.containsKey(Integer.valueOf(tTLandingPageActivity8.onNavigationEvent())) && TTLandingPageActivity5.onNavigationEvent.INODE == tTLandingPageActivity8.onExtraCallbackWithResult()) {
                this.IAuthTabCallbackStub.put(Integer.valueOf(tTLandingPageActivity8.onNavigationEvent()), tTLandingPageActivity8);
            }
            int iIAuthTabCallback = tTLandingPageActivity8.IAuthTabCallback() << 10;
            byte[] bArr = this.onExtraCallback;
            if (bArr.length < iIAuthTabCallback) {
                byte[] bArrOnExtraCallback = PAGNativeAdLoadListener.onExtraCallback(this.onWarmupCompleted, iIAuthTabCallback);
                this.onExtraCallback = bArrOnExtraCallback;
                if (bArrOnExtraCallback.length != iIAuthTabCallback) {
                    throw new EOFException();
                }
            } else if (this.onWarmupCompleted.read(bArr, 0, iIAuthTabCallback) != iIAuthTabCallback) {
                throw new EOFException();
            }
            int i = 0;
            while (i < iIAuthTabCallback - 8 && i < jOnExtraCallback - 8) {
                int iOnNavigationEvent = TTLandingPageActivity61.onNavigationEvent(this.onExtraCallback, i);
                int iOnExtraCallback = TTLandingPageActivity61.onExtraCallback(this.onExtraCallback, i + 4);
                byte[] bArr2 = this.onExtraCallback;
                byte b = bArr2[i + 6];
                String strOnExtraCallbackWithResult = TTLandingPageActivity61.onExtraCallbackWithResult(this.access000, bArr2, i + 8, bArr2[i + 7]);
                if (!onVideoError.onExtraCallbackWithResult.equals(strOnExtraCallbackWithResult) && !"..".equals(strOnExtraCallbackWithResult)) {
                    this.asBinder.put(Integer.valueOf(iOnNavigationEvent), new TTLandingPageActivity3(iOnNavigationEvent, tTLandingPageActivity8.onNavigationEvent(), b, strOnExtraCallbackWithResult));
                    this.IAuthTabCallbackStub.forEach(new BiConsumer() { // from class: org.apache.commons.compress.archivers.dump.DumpArchiveInputStream$$ExternalSyntheticLambda1
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            TTLandingPageActivity6.IAuthTabCallback(this.f$0, (Integer) obj, (TTLandingPageActivity8) obj2);
                        }
                    });
                    this.getInterfaceDescriptor.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.dump.DumpArchiveInputStream$$ExternalSyntheticLambda2
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.f$0.IAuthTabCallbackStub.remove(Integer.valueOf(((TTLandingPageActivity8) obj).onNavigationEvent()));
                        }
                    });
                }
                i += iOnExtraCallback;
            }
            byte[] bArrOnExtraCallback2 = this.onWarmupCompleted.onExtraCallback();
            if (!TTLandingPageActivity61.onNavigationEvent(bArrOnExtraCallback2)) {
                throw new InvalidFormatException();
            }
            tTLandingPageActivity8 = TTLandingPageActivity8.onWarmupCompleted(bArrOnExtraCallback2);
            jOnExtraCallback -= 1024;
            z = false;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(TTLandingPageActivity6 tTLandingPageActivity6, Integer num, TTLandingPageActivity8 tTLandingPageActivity8) {
        String strIAuthTabCallback = tTLandingPageActivity6.IAuthTabCallback(tTLandingPageActivity8);
        if (strIAuthTabCallback != null) {
            tTLandingPageActivity8.onNavigationEvent(strIAuthTabCallback);
            tTLandingPageActivity8.onExtraCallback(tTLandingPageActivity6.asBinder.get(num).onExtraCallbackWithResult());
            tTLandingPageActivity6.getInterfaceDescriptor.add(tTLandingPageActivity8);
        }
    }
}
