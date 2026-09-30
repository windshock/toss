package o;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setMaskColor extends isCircle {
    private boolean IAuthTabCallback;
    private int onExtraCallback;
    private onWarmupCompleted onNavigationEvent;
    private final int onWarmupCompleted;

    enum onWarmupCompleted {
        NO_BLOCK,
        IN_LITERAL,
        IN_BACK_REFERENCE
    }

    public setMaskColor(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.onNavigationEvent = onWarmupCompleted.NO_BLOCK;
        int iOnExtraCallback = (int) onExtraCallback();
        this.onWarmupCompleted = iOnExtraCallback;
        this.onExtraCallback = iOnExtraCallback;
    }

    private void onNavigationEvent() throws IOException {
        if (this.onExtraCallback == 0) {
            this.IAuthTabCallback = true;
            return;
        }
        int iOnWarmupCompleted = onWarmupCompleted();
        if (iOnWarmupCompleted == -1) {
            throw new IOException("Premature end of stream reading block start");
        }
        int i = iOnWarmupCompleted & 3;
        if (i == 0) {
            int iOnExtraCallback = onExtraCallback(iOnWarmupCompleted);
            if (iOnExtraCallback < 0) {
                throw new IOException("Illegal block with a negative literal size found");
            }
            this.onExtraCallback -= iOnExtraCallback;
            onExtraCallbackWithResult(iOnExtraCallback);
            this.onNavigationEvent = onWarmupCompleted.IN_LITERAL;
            return;
        }
        if (i == 1) {
            int i2 = ((iOnWarmupCompleted >> 2) & 7) + 4;
            this.onExtraCallback -= i2;
            int iOnWarmupCompleted2 = onWarmupCompleted();
            if (iOnWarmupCompleted2 == -1) {
                throw new IOException("Premature end of stream reading back-reference length");
            }
            try {
                IAuthTabCallback(((iOnWarmupCompleted & 224) << 3) | iOnWarmupCompleted2, i2);
                this.onNavigationEvent = onWarmupCompleted.IN_BACK_REFERENCE;
                return;
            } catch (IllegalArgumentException e) {
                throw new IOException("Illegal block with bad offset found", e);
            }
        }
        if (i == 2) {
            int i3 = (iOnWarmupCompleted >> 2) + 1;
            if (i3 < 0) {
                throw new IOException("Illegal block with a negative match length found");
            }
            this.onExtraCallback -= i3;
            try {
                IAuthTabCallback((int) showPrivacyActivity.IAuthTabCallback(this.onExtraCallbackWithResult, 2), i3);
                this.onNavigationEvent = onWarmupCompleted.IN_BACK_REFERENCE;
                return;
            } catch (IllegalArgumentException e2) {
                throw new IOException("Illegal block with bad offset found", e2);
            }
        }
        if (i != 3) {
            return;
        }
        int i4 = (iOnWarmupCompleted >> 2) + 1;
        if (i4 < 0) {
            throw new IOException("Illegal block with a negative match length found");
        }
        this.onExtraCallback -= i4;
        try {
            IAuthTabCallback(Integer.MAX_VALUE & ((int) showPrivacyActivity.IAuthTabCallback(this.onExtraCallbackWithResult, 4)), i4);
            this.onNavigationEvent = onWarmupCompleted.IN_BACK_REFERENCE;
        } catch (IllegalArgumentException e3) {
            throw new IOException("Illegal block with bad offset found", e3);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.IAuthTabCallback) {
            return -1;
        }
        int i3 = AnonymousClass4.onExtraCallbackWithResult[this.onNavigationEvent.ordinal()];
        if (i3 == 1) {
            onNavigationEvent();
            return read(bArr, i, i2);
        }
        if (i3 == 2) {
            int iOnNavigationEvent = onNavigationEvent(bArr, i, i2);
            if (!IAuthTabCallback()) {
                this.onNavigationEvent = onWarmupCompleted.NO_BLOCK;
            }
            return iOnNavigationEvent > 0 ? iOnNavigationEvent : read(bArr, i, i2);
        }
        if (i3 == 3) {
            int iOnWarmupCompleted = onWarmupCompleted(bArr, i, i2);
            if (!IAuthTabCallback()) {
                this.onNavigationEvent = onWarmupCompleted.NO_BLOCK;
            }
            return iOnWarmupCompleted > 0 ? iOnWarmupCompleted : read(bArr, i, i2);
        }
        throw new IOException("Unknown stream state " + this.onNavigationEvent);
    }

    /* renamed from: o.setMaskColor$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[onWarmupCompleted.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[onWarmupCompleted.NO_BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[onWarmupCompleted.IN_LITERAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallbackWithResult[onWarmupCompleted.IN_BACK_REFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int onExtraCallback(int i) throws IOException {
        long jIAuthTabCallback;
        int iOnWarmupCompleted = i >> 2;
        switch (iOnWarmupCompleted) {
            case 60:
                iOnWarmupCompleted = onWarmupCompleted();
                if (iOnWarmupCompleted == -1) {
                    throw new IOException("Premature end of stream reading literal length");
                }
                return iOnWarmupCompleted + 1;
            case 61:
                jIAuthTabCallback = showPrivacyActivity.IAuthTabCallback(this.onExtraCallbackWithResult, 2);
                iOnWarmupCompleted = (int) jIAuthTabCallback;
                return iOnWarmupCompleted + 1;
            case 62:
                jIAuthTabCallback = showPrivacyActivity.IAuthTabCallback(this.onExtraCallbackWithResult, 3);
                iOnWarmupCompleted = (int) jIAuthTabCallback;
                return iOnWarmupCompleted + 1;
            case 63:
                jIAuthTabCallback = showPrivacyActivity.IAuthTabCallback(this.onExtraCallbackWithResult, 4);
                iOnWarmupCompleted = (int) jIAuthTabCallback;
                return iOnWarmupCompleted + 1;
            default:
                return iOnWarmupCompleted + 1;
        }
    }

    private long onExtraCallback() throws IOException {
        int i = 0;
        long j = 0;
        while (true) {
            int iOnWarmupCompleted = onWarmupCompleted();
            if (iOnWarmupCompleted == -1) {
                throw new IOException("Premature end of stream reading size");
            }
            j |= (iOnWarmupCompleted & CertificateBody.profileType) << (i * 7);
            if ((iOnWarmupCompleted & 128) == 0) {
                return j;
            }
            i++;
        }
    }
}
