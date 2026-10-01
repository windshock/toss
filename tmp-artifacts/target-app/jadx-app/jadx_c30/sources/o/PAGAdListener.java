package o;

import java.io.IOException;
import java.io.OutputStream;
import o.setCornerBottomRightRadius;
import o.showPrivacyActivity;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGAdListener extends dj9 {
    private final showPrivacyActivity.onExtraCallbackWithResult IAuthTabCallback;
    private final OutputStream onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final setCornerBottomRightRadius onNavigationEvent;
    private final byte[] onWarmupCompleted;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.PAGAdListener$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[setCornerBottomRightRadius.onExtraCallback.onExtraCallbackWithResult.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[setCornerBottomRightRadius.onExtraCallback.onExtraCallbackWithResult.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[setCornerBottomRightRadius.onExtraCallback.onExtraCallbackWithResult.BACK_REFERENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[setCornerBottomRightRadius.onExtraCallback.onExtraCallbackWithResult.EOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ void onExtraCallback(PAGAdListener pAGAdListener, setCornerBottomRightRadius.onExtraCallback onextracallback) throws IOException {
        int i = AnonymousClass5.IAuthTabCallback[onextracallback.IAuthTabCallback().ordinal()];
        if (i == 1) {
            pAGAdListener.onExtraCallback((setCornerBottomRightRadius.onNavigationEvent) onextracallback);
        } else {
            if (i != 2) {
                return;
            }
            pAGAdListener.onExtraCallbackWithResult((setCornerBottomRightRadius.onExtraCallbackWithResult) onextracallback);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            onNavigationEvent();
        } finally {
            this.onExtraCallback.close();
        }
    }

    public void onNavigationEvent() throws IOException {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onNavigationEvent.onExtraCallback();
        this.onExtraCallbackWithResult = true;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.onNavigationEvent.onWarmupCompleted(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.onWarmupCompleted;
        bArr[0] = (byte) i;
        write(bArr);
    }

    private void onExtraCallbackWithResult(setCornerBottomRightRadius.onExtraCallbackWithResult onextracallbackwithresult) throws IOException {
        int iOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
        int iOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
        if (iOnWarmupCompleted >= 4 && iOnWarmupCompleted <= 11 && iOnNavigationEvent <= 1024) {
            onWarmupCompleted(iOnWarmupCompleted, iOnNavigationEvent);
        } else if (iOnNavigationEvent < 32768) {
            IAuthTabCallback(iOnWarmupCompleted, iOnNavigationEvent);
        } else {
            onExtraCallback(iOnWarmupCompleted, iOnNavigationEvent);
        }
    }

    private void onExtraCallback(int i, int i2) throws IOException {
        onNavigationEvent(3, 4, i, i2);
    }

    private void onNavigationEvent(int i, int i2, int i3, int i4) throws IOException {
        this.onExtraCallback.write(i | ((i3 - 1) << 2));
        onExtraCallbackWithResult(i2, i4);
    }

    private void onWarmupCompleted(int i, int i2) throws IOException {
        this.onExtraCallback.write(((i - 4) << 2) | 1 | ((i2 & 1792) >> 3));
        this.onExtraCallback.write(i2 & GF2Field.MASK);
    }

    private void IAuthTabCallback(int i, int i2) throws IOException {
        onNavigationEvent(2, 2, i, i2);
    }

    private void onExtraCallback(setCornerBottomRightRadius.onNavigationEvent onnavigationevent) throws IOException {
        int iOnNavigationEvent = onnavigationevent.onNavigationEvent();
        if (iOnNavigationEvent <= 60) {
            IAuthTabCallback(onnavigationevent, iOnNavigationEvent);
            return;
        }
        if (iOnNavigationEvent <= 256) {
            onExtraCallback(onnavigationevent, iOnNavigationEvent);
            return;
        }
        if (iOnNavigationEvent <= 65536) {
            onNavigationEvent(onnavigationevent, iOnNavigationEvent);
        } else if (iOnNavigationEvent <= 16777216) {
            onExtraCallbackWithResult(onnavigationevent, iOnNavigationEvent);
        } else {
            onWarmupCompleted(onnavigationevent, iOnNavigationEvent);
        }
    }

    private void onWarmupCompleted(setCornerBottomRightRadius.onNavigationEvent onnavigationevent, int i) throws IOException {
        IAuthTabCallback(252, 4, i, onnavigationevent);
    }

    private void IAuthTabCallback(setCornerBottomRightRadius.onNavigationEvent onnavigationevent, int i) throws IOException {
        IAuthTabCallback((i - 1) << 2, 0, i, onnavigationevent);
    }

    private void onExtraCallback(setCornerBottomRightRadius.onNavigationEvent onnavigationevent, int i) throws IOException {
        IAuthTabCallback(240, 1, i, onnavigationevent);
    }

    private void onExtraCallbackWithResult(setCornerBottomRightRadius.onNavigationEvent onnavigationevent, int i) throws IOException {
        IAuthTabCallback(248, 3, i, onnavigationevent);
    }

    private void onNavigationEvent(setCornerBottomRightRadius.onNavigationEvent onnavigationevent, int i) throws IOException {
        IAuthTabCallback(244, 2, i, onnavigationevent);
    }

    private void IAuthTabCallback(int i, int i2, int i3, setCornerBottomRightRadius.onNavigationEvent onnavigationevent) throws IOException {
        this.onExtraCallback.write(i);
        onExtraCallbackWithResult(i2, i3 - 1);
        this.onExtraCallback.write(onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.onWarmupCompleted(), i3);
    }

    private void onExtraCallbackWithResult(int i, int i2) throws IOException {
        showPrivacyActivity.onWarmupCompleted(this.IAuthTabCallback, i2, i);
    }
}
