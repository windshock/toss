package o;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ul5 extends isCircle {
    private onExtraCallbackWithResult IAuthTabCallback;
    private int onWarmupCompleted;

    enum onExtraCallbackWithResult {
        NO_BLOCK,
        IN_LITERAL,
        LOOKING_FOR_BACK_REFERENCE,
        IN_BACK_REFERENCE,
        EOF
    }

    public ul5(InputStream inputStream) {
        super(inputStream, PKIFailureInfo.notAuthorized);
        this.IAuthTabCallback = onExtraCallbackWithResult.NO_BLOCK;
    }

    private boolean onExtraCallback() throws IOException {
        try {
            int iIAuthTabCallback = (int) showPrivacyActivity.IAuthTabCallback(this.onExtraCallbackWithResult, 2);
            int i = this.onWarmupCompleted;
            long jOnNavigationEvent = i;
            if (i == 15) {
                jOnNavigationEvent += onNavigationEvent();
            }
            if (jOnNavigationEvent < 0) {
                throw new IOException("Illegal block with a negative match length found");
            }
            try {
                IAuthTabCallback(iIAuthTabCallback, jOnNavigationEvent + 4);
                this.IAuthTabCallback = onExtraCallbackWithResult.IN_BACK_REFERENCE;
                return true;
            } catch (IllegalArgumentException e) {
                throw new IOException("Illegal block with bad offset found", e);
            }
        } catch (IOException e2) {
            if (this.onWarmupCompleted == 0) {
                return false;
            }
            throw e2;
        }
    }

    /* renamed from: o.ul5$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            onExtraCallback = iArr;
            try {
                iArr[onExtraCallbackWithResult.EOF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[onExtraCallbackWithResult.NO_BLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[onExtraCallbackWithResult.IN_LITERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[onExtraCallbackWithResult.LOOKING_FOR_BACK_REFERENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallback[onExtraCallbackWithResult.IN_BACK_REFERENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = AnonymousClass2.onExtraCallback[this.IAuthTabCallback.ordinal()];
        if (i3 == 1) {
            return -1;
        }
        if (i3 == 2) {
            asInterface();
        } else if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IOException("Unknown stream state " + this.IAuthTabCallback);
                }
            } else if (!onExtraCallback()) {
                this.IAuthTabCallback = onExtraCallbackWithResult.EOF;
                return -1;
            }
            int iOnWarmupCompleted = onWarmupCompleted(bArr, i, i2);
            if (!IAuthTabCallback()) {
                this.IAuthTabCallback = onExtraCallbackWithResult.NO_BLOCK;
            }
            return iOnWarmupCompleted > 0 ? iOnWarmupCompleted : read(bArr, i, i2);
        }
        int iOnNavigationEvent = onNavigationEvent(bArr, i, i2);
        if (!IAuthTabCallback()) {
            this.IAuthTabCallback = onExtraCallbackWithResult.LOOKING_FOR_BACK_REFERENCE;
        }
        return iOnNavigationEvent > 0 ? iOnNavigationEvent : read(bArr, i, i2);
    }

    private long onNavigationEvent() throws IOException {
        int iOnWarmupCompleted;
        long j = 0;
        do {
            iOnWarmupCompleted = onWarmupCompleted();
            if (iOnWarmupCompleted == -1) {
                throw new IOException("Premature end of stream while parsing length");
            }
            j += iOnWarmupCompleted;
        } while (iOnWarmupCompleted == 255);
        return j;
    }

    private void asInterface() throws IOException {
        int iOnWarmupCompleted = onWarmupCompleted();
        if (iOnWarmupCompleted == -1) {
            throw new IOException("Premature end of stream while looking for next block");
        }
        this.onWarmupCompleted = iOnWarmupCompleted & 15;
        long jOnNavigationEvent = (iOnWarmupCompleted & 240) >> 4;
        if (jOnNavigationEvent == 15) {
            jOnNavigationEvent += onNavigationEvent();
        }
        if (jOnNavigationEvent < 0) {
            throw new IOException("Illegal block with a negative literal size found");
        }
        onExtraCallbackWithResult(jOnNavigationEvent);
        this.IAuthTabCallback = onExtraCallbackWithResult.IN_LITERAL;
    }
}
