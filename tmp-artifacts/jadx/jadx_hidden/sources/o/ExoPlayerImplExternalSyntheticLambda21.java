package o;

import android.os.Process;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda21 extends ExoPlayerImplExternalSyntheticLambda12<Set<ExoPlayerImplExternalSyntheticLambda12>> implements ExoPlayerImplExternalSyntheticLambda15 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private byte[] IAuthTabCallback;
    private final Set<ExoPlayerImplExternalSyntheticLambda12> onExtraCallback;

    /* synthetic */ ExoPlayerImplExternalSyntheticLambda21(Set set, byte[] bArr, byte b) {
        this(set, bArr);
    }

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ Set<ExoPlayerImplExternalSyntheticLambda12> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = (i2 ^ 121) + ((i2 & 121) << 1);
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Set<ExoPlayerImplExternalSyntheticLambda12> setIAuthTabCallback = IAuthTabCallback();
        int i5 = onNavigationEvent;
        int i6 = ((i5 | 83) << 1) - (i5 ^ 83);
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return setIAuthTabCallback;
        }
        throw new NullPointerException();
    }

    private ExoPlayerImplExternalSyntheticLambda21(Set<ExoPlayerImplExternalSyntheticLambda12> set, byte[] bArr) {
        super(ExoPlayerImplExternalSyntheticLambda14.IAuthTabCallbackStub);
        this.onExtraCallback = set;
        this.IAuthTabCallback = bArr;
    }

    private Set<ExoPlayerImplExternalSyntheticLambda12> IAuthTabCallback() {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(this.onExtraCallback);
        int i2 = onNavigationEvent;
        int i3 = (i2 ^ 81) + ((i2 & 81) << 1);
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return hashSet;
    }

    @Override // java.lang.Iterable
    public final Iterator<ExoPlayerImplExternalSyntheticLambda12> iterator() {
        int i = 2 % 2;
        Iterator<ExoPlayerImplExternalSyntheticLambda12> it = new HashSet(this.onExtraCallback).iterator();
        int i2 = onNavigationEvent;
        int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return it;
        }
        throw new ArithmeticException();
    }

    public static class onExtraCallbackWithResult extends ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda21> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) throws ExoPlayerImplExternalSyntheticLambda11, IOException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = (i2 & 119) + (i2 | 119);
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ExoPlayerImplExternalSyntheticLambda21 exoPlayerImplExternalSyntheticLambda21OnExtraCallbackWithResult = onExtraCallbackWithResult(bArr);
            int i5 = IAuthTabCallback + 9;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return exoPlayerImplExternalSyntheticLambda21OnExtraCallbackWithResult;
        }

        public onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        private ExoPlayerImplExternalSyntheticLambda21 onExtraCallbackWithResult(byte[] bArr) throws ExoPlayerImplExternalSyntheticLambda11, IOException {
            int i = 2 % 2;
            HashSet hashSet = new HashSet();
            ReorderingBufferQueueOutputConsumer reorderingBufferQueueOutputConsumer = new ReorderingBufferQueueOutputConsumer(this.onExtraCallback, bArr);
            try {
                Iterator<ExoPlayerImplExternalSyntheticLambda12> it = reorderingBufferQueueOutputConsumer.iterator();
                int i2 = IAuthTabCallback + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                while (!(!it.hasNext())) {
                    int iMyPid = Process.myPid();
                    int i4 = ~((~iMyPid) | (-317130965));
                    int i5 = ~((iMyPid ^ 771777689) | (iMyPid & 771777689));
                    int i6 = (i4 & i5) | (i4 ^ i5);
                    int i7 = ~iMyPid;
                    int i8 = -(-((i6 | (~(i7 | (-771777690)))) * 959));
                    int i9 = (i8 & 1759866612) + (i8 | 1759866612) + 713638473;
                    int i10 = ~((i7 ^ 771777689) | (771777689 & i7));
                    int i11 = ~((-317130965) | iMyPid);
                    int i12 = (i10 & i11) | (i10 ^ i11);
                    int i13 = ~((iMyPid & (-771777690)) | (iMyPid ^ (-771777690)));
                    int i14 = ((i13 & i12) | (i12 ^ i13)) * 959;
                    int i15 = (i9 ^ i14) + ((i14 & i9) << 1);
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i16 = ~iIdentityHashCode;
                    int i17 = ~((i16 ^ (-549255040)) | (i16 & (-549255040)));
                    int i18 = ~((iIdentityHashCode ^ 381069574) | (iIdentityHashCode & 381069574));
                    int i19 = ((i17 & i18) | (i17 ^ i18)) * 959;
                    int i20 = ((i19 ^ 99648637) + ((i19 & 99648637) << 1)) - 1545394048;
                    int i21 = ~((iIdentityHashCode & (-549255040)) | (iIdentityHashCode ^ (-549255040)));
                    int i22 = ~((i16 & 381069574) | (i16 ^ 381069574));
                    if (i15 > (i20 - (~(((i21 & i22) | (i21 ^ i22)) * 959))) - 1) {
                        hashSet.add(it.next());
                        throw new NullPointerException();
                    }
                    hashSet.add(it.next());
                }
                ExoPlayerImplExternalSyntheticLambda21 exoPlayerImplExternalSyntheticLambda21 = new ExoPlayerImplExternalSyntheticLambda21(hashSet, bArr, (byte) 0);
                try {
                    int i23 = IAuthTabCallback;
                    int i24 = (i23 ^ 15) + ((i23 & 15) << 1);
                    onWarmupCompleted = i24 % 128;
                    int i25 = i24 % 2;
                } catch (IOException unused) {
                }
                int i26 = IAuthTabCallback;
                int i27 = (i26 ^ 105) + ((i26 & 105) << 1);
                onWarmupCompleted = i27 % 128;
                int i28 = i27 % 2;
                return exoPlayerImplExternalSyntheticLambda21;
            } finally {
                try {
                    reorderingBufferQueueOutputConsumer.close();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
