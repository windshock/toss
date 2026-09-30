package o;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTPlayableLandingPageActivity8 implements Closeable {
    static final byte[] onExtraCallbackWithResult = {55, 122, PSSSigner.TRAILER_IMPLICIT, -81, 39, 28};
    private int IAuthTabCallback;
    private final TTRewardVideoActivity2 IAuthTabCallbackDefault;
    private InputStream IAuthTabCallbackStub;
    private long IAuthTabCallback_Parcel;
    private final String asBinder;
    private final ArrayList<InputStream> asInterface;
    private byte[] getInterfaceDescriptor;
    private final TTPlayableLandingPageActivity onExtraCallback;
    private SeekableByteChannel onNavigationEvent;
    private int onTransact;
    private long onWarmupCompleted;

    private InputStream onNavigationEvent(TTRewardExpressVideoActivity tTRewardExpressVideoActivity, long j, int i, TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71) throws IOException {
        this.onNavigationEvent.position(j);
        FilterInputStream filterInputStream = new FilterInputStream(new BufferedInputStream(new TTPlayableLandingPageActivity1(this.onNavigationEvent, this.onExtraCallback.onExtraCallback[i]))) { // from class: o.TTPlayableLandingPageActivity8.2
            private void IAuthTabCallback(int i2) {
                TTPlayableLandingPageActivity8.this.onWarmupCompleted += i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                int i2 = ((FilterInputStream) this).in.read();
                if (i2 >= 0) {
                    IAuthTabCallback(1);
                }
                return i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr) throws IOException {
                return read(bArr, 0, bArr.length);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
                if (i3 == 0) {
                    return 0;
                }
                int i4 = ((FilterInputStream) this).in.read(bArr, i2, i3);
                if (i4 >= 0) {
                    IAuthTabCallback(i4);
                }
                return i4;
            }
        };
        LinkedList linkedList = new LinkedList();
        InputStream inputStreamIAuthTabCallback = filterInputStream;
        for (TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4 : tTRewardExpressVideoActivity.IAuthTabCallback()) {
            if (tTPlayableLandingPageActivity4.onNavigationEvent != 1 || tTPlayableLandingPageActivity4.onExtraCallbackWithResult != 1) {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
            TTRewardVideoActivity tTRewardVideoActivityById = TTRewardVideoActivity.byId(tTPlayableLandingPageActivity4.IAuthTabCallback);
            inputStreamIAuthTabCallback = TTPlayableLandingPageActivity2.IAuthTabCallback(this.asBinder, inputStreamIAuthTabCallback, tTRewardExpressVideoActivity.onNavigationEvent(tTPlayableLandingPageActivity4), tTPlayableLandingPageActivity4, this.getInterfaceDescriptor, this.IAuthTabCallbackDefault.onNavigationEvent());
            linkedList.addFirst(new TTRewardVideoActivity21(tTRewardVideoActivityById, TTPlayableLandingPageActivity2.onExtraCallback(tTRewardVideoActivityById).onExtraCallback(tTPlayableLandingPageActivity4, inputStreamIAuthTabCallback)));
        }
        tTPlayableLandingPageActivity71.onWarmupCompleted(linkedList);
        return tTRewardExpressVideoActivity.IAuthTabCallback ? new registerViewForInteraction(inputStreamIAuthTabCallback, tTRewardExpressVideoActivity.onNavigationEvent(), tTRewardExpressVideoActivity.onWarmupCompleted) : inputStreamIAuthTabCallback;
    }

    private void onWarmupCompleted(int i, boolean z) throws IOException {
        boolean z2;
        TTPlayableLandingPageActivity tTPlayableLandingPageActivity = this.onExtraCallback;
        TTRewardVideoActivity3 tTRewardVideoActivity3 = tTPlayableLandingPageActivity.asBinder;
        if (tTRewardVideoActivity3 == null) {
            throw new IOException("Archive doesn't contain stream information to read entries");
        }
        int i2 = tTRewardVideoActivity3.IAuthTabCallback[i];
        if (i2 < 0) {
            this.asInterface.clear();
            return;
        }
        TTPlayableLandingPageActivity71[] tTPlayableLandingPageActivity71Arr = tTPlayableLandingPageActivity.onWarmupCompleted;
        TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 = tTPlayableLandingPageActivity71Arr[i];
        if (this.onTransact == i2) {
            if (i > 0) {
                tTPlayableLandingPageActivity71.onWarmupCompleted(tTPlayableLandingPageActivity71Arr[i - 1].onExtraCallback());
            }
            if (z && tTPlayableLandingPageActivity71.onExtraCallback() == null) {
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = this.onExtraCallback;
                tTPlayableLandingPageActivity71.onWarmupCompleted(tTPlayableLandingPageActivity2.onWarmupCompleted[tTPlayableLandingPageActivity2.asBinder.onWarmupCompleted[i2]].onExtraCallback());
            }
            z2 = true;
        } else {
            this.onTransact = i2;
            onExtraCallback(i2, tTPlayableLandingPageActivity71);
            z2 = false;
        }
        boolean zIAuthTabCallback = z ? IAuthTabCallback(i, z2, i2) : false;
        if (z && this.IAuthTabCallback == i && !zIAuthTabCallback) {
            return;
        }
        registerViewForInteraction setmrctrackerkey = new setMrcTrackerKey(this.IAuthTabCallbackStub, tTPlayableLandingPageActivity71.access000());
        if (tTPlayableLandingPageActivity71.onTransact()) {
            setmrctrackerkey = new registerViewForInteraction(setmrctrackerkey, tTPlayableLandingPageActivity71.access000(), tTPlayableLandingPageActivity71.onExtraCallbackWithResult());
        }
        this.asInterface.add(setmrctrackerkey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SeekableByteChannel seekableByteChannel = this.onNavigationEvent;
        if (seekableByteChannel != null) {
            try {
                seekableByteChannel.close();
            } finally {
                this.onNavigationEvent = null;
                byte[] bArr = this.getInterfaceDescriptor;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                this.getInterfaceDescriptor = null;
            }
        }
    }

    private InputStream onExtraCallback() throws IOException {
        if (this.onExtraCallback.onWarmupCompleted[this.IAuthTabCallback].access000() == 0) {
            return new ByteArrayInputStream(showPrivacyActivity.onExtraCallback);
        }
        if (this.asInterface.isEmpty()) {
            throw new IllegalStateException("No current 7z entry (call getNextEntry() first).");
        }
        while (this.asInterface.size() > 1) {
            InputStream inputStreamRemove = this.asInterface.remove(0);
            try {
                PAGNativeAdLoadListener.onExtraCallbackWithResult(inputStreamRemove, Long.MAX_VALUE);
                if (inputStreamRemove != null) {
                    inputStreamRemove.close();
                }
                this.onWarmupCompleted = 0L;
            } finally {
            }
        }
        return this.asInterface.get(0);
    }

    public String onWarmupCompleted() {
        if ("unknown archive".equals(this.asBinder) || this.asBinder == null) {
            return null;
        }
        String name = new File(this.asBinder).getName();
        int iLastIndexOf = name.lastIndexOf(onVideoError.onExtraCallbackWithResult);
        if (iLastIndexOf > 0) {
            return name.substring(0, iLastIndexOf);
        }
        return name + "~";
    }

    public TTPlayableLandingPageActivity71 onNavigationEvent() throws IOException {
        int i = this.IAuthTabCallback;
        TTPlayableLandingPageActivity71[] tTPlayableLandingPageActivity71Arr = this.onExtraCallback.onWarmupCompleted;
        if (i >= tTPlayableLandingPageActivity71Arr.length - 1) {
            return null;
        }
        int i2 = i + 1;
        this.IAuthTabCallback = i2;
        TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 = tTPlayableLandingPageActivity71Arr[i2];
        if (tTPlayableLandingPageActivity71.IAuthTabCallbackStubProxy() == null && this.IAuthTabCallbackDefault.onExtraCallback()) {
            tTPlayableLandingPageActivity71.onExtraCallbackWithResult(onWarmupCompleted());
        }
        onWarmupCompleted(this.IAuthTabCallback, false);
        this.onWarmupCompleted = 0L;
        this.IAuthTabCallback_Parcel = 0L;
        return tTPlayableLandingPageActivity71;
    }

    private boolean onExtraCallbackWithResult() {
        if (this.asInterface.isEmpty()) {
            return false;
        }
        ArrayList<InputStream> arrayList = this.asInterface;
        setMrcTrackerKey setmrctrackerkey = (InputStream) arrayList.get(arrayList.size() - 1);
        return setmrctrackerkey instanceof setMrcTrackerKey ? setmrctrackerkey.onWarmupCompleted() != this.onExtraCallback.onWarmupCompleted[this.IAuthTabCallback].access000() : (setmrctrackerkey instanceof registerViewForInteraction) && ((registerViewForInteraction) setmrctrackerkey).onExtraCallback() != this.onExtraCallback.onWarmupCompleted[this.IAuthTabCallback].access000();
    }

    public int onExtraCallbackWithResult(byte[] bArr) throws IOException {
        return IAuthTabCallback(bArr, 0, bArr.length);
    }

    public int IAuthTabCallback(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = onExtraCallback().read(bArr, i, i2);
        if (i3 > 0) {
            this.IAuthTabCallback_Parcel += i3;
        }
        return i3;
    }

    public static /* synthetic */ TTPlayableLandingPageActivity71[] onWarmupCompleted(int i) {
        return new TTPlayableLandingPageActivity71[i];
    }

    private void onExtraCallback(int i, TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71) throws IOException {
        this.asInterface.clear();
        InputStream inputStream = this.IAuthTabCallbackStub;
        if (inputStream != null) {
            inputStream.close();
            this.IAuthTabCallbackStub = null;
        }
        TTPlayableLandingPageActivity tTPlayableLandingPageActivity = this.onExtraCallback;
        TTRewardExpressVideoActivity tTRewardExpressVideoActivity = tTPlayableLandingPageActivity.onExtraCallbackWithResult[i];
        TTRewardVideoActivity3 tTRewardVideoActivity3 = tTPlayableLandingPageActivity.asBinder;
        int i2 = tTRewardVideoActivity3.onExtraCallback[i];
        this.IAuthTabCallbackStub = onNavigationEvent(tTRewardExpressVideoActivity, tTPlayableLandingPageActivity.onNavigationEvent + 32 + tTRewardVideoActivity3.onNavigationEvent[i2], i2, tTPlayableLandingPageActivity71);
    }

    private boolean IAuthTabCallback(int i, boolean z, int i2) throws IOException {
        TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 = this.onExtraCallback.onWarmupCompleted[i];
        if (this.IAuthTabCallback == i && !onExtraCallbackWithResult()) {
            return false;
        }
        int i3 = this.onExtraCallback.asBinder.onWarmupCompleted[this.onTransact];
        if (z) {
            int i4 = this.IAuthTabCallback;
            if (i4 < i) {
                i3 = i4 + 1;
            } else {
                onExtraCallback(i2, tTPlayableLandingPageActivity71);
            }
        }
        while (i3 < i) {
            TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity712 = this.onExtraCallback.onWarmupCompleted[i3];
            registerViewForInteraction setmrctrackerkey = new setMrcTrackerKey(this.IAuthTabCallbackStub, tTPlayableLandingPageActivity712.access000());
            if (tTPlayableLandingPageActivity712.onTransact()) {
                setmrctrackerkey = new registerViewForInteraction(setmrctrackerkey, tTPlayableLandingPageActivity712.access000(), tTPlayableLandingPageActivity712.onExtraCallbackWithResult());
            }
            this.asInterface.add(setmrctrackerkey);
            tTPlayableLandingPageActivity712.onWarmupCompleted(tTPlayableLandingPageActivity71.onExtraCallback());
            i3++;
        }
        return true;
    }

    public String toString() {
        return this.onExtraCallback.toString();
    }
}
