package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda16 extends ExoPlayerImplExternalSyntheticLambda12<List<ExoPlayerImplExternalSyntheticLambda12>> implements ExoPlayerImplExternalSyntheticLambda15 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final List<ExoPlayerImplExternalSyntheticLambda12> IAuthTabCallback;
    private byte[] onExtraCallbackWithResult;

    /* synthetic */ ExoPlayerImplExternalSyntheticLambda16(List list, byte[] bArr, byte b) {
        this(list, bArr);
    }

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ List<ExoPlayerImplExternalSyntheticLambda12> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = (i2 & 85) + (i2 | 85);
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<ExoPlayerImplExternalSyntheticLambda12> listOnNavigationEvent = onNavigationEvent();
        int i5 = onNavigationEvent;
        int i6 = (i5 ^ 95) + ((i5 & 95) << 1);
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return listOnNavigationEvent;
    }

    private ExoPlayerImplExternalSyntheticLambda16(List<ExoPlayerImplExternalSyntheticLambda12> list, byte[] bArr) {
        super(ExoPlayerImplExternalSyntheticLambda14.asBinder);
        this.IAuthTabCallback = list;
        this.onExtraCallbackWithResult = bArr;
    }

    private List<ExoPlayerImplExternalSyntheticLambda12> onNavigationEvent() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(this.IAuthTabCallback);
        int i2 = onExtraCallback;
        int i3 = ((i2 | 71) << 1) - (i2 ^ 71);
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return arrayList;
        }
        throw new NullPointerException();
    }

    @Override // java.lang.Iterable
    public final Iterator<ExoPlayerImplExternalSyntheticLambda12> iterator() {
        int i = 2 % 2;
        Iterator<ExoPlayerImplExternalSyntheticLambda12> it = new ArrayList(this.IAuthTabCallback).iterator();
        int i2 = onExtraCallback;
        int i3 = ((i2 | 63) << 1) - (i2 ^ 63);
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return it;
        }
        throw new NullPointerException();
    }

    public final ExoPlayerImplExternalSyntheticLambda12 onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12 = this.IAuthTabCallback.get(i);
        int i5 = onNavigationEvent;
        int i6 = (i5 & 1) + (i5 | 1);
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return exoPlayerImplExternalSyntheticLambda12;
        }
        throw new NullPointerException();
    }

    public static class onExtraCallback extends ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda16> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) throws ExoPlayerImplExternalSyntheticLambda11, IOException {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = (i2 ^ 21) + ((i2 & 21) << 1);
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallback(bArr);
            }
            onExtraCallback(bArr);
            throw new NullPointerException();
        }

        public onExtraCallback(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        private ExoPlayerImplExternalSyntheticLambda16 onExtraCallback(byte[] bArr) throws ExoPlayerImplExternalSyntheticLambda11, IOException {
            int i = 2 % 2;
            ArrayList arrayList = new ArrayList();
            ReorderingBufferQueueOutputConsumer reorderingBufferQueueOutputConsumer = new ReorderingBufferQueueOutputConsumer(this.onExtraCallback, bArr);
            try {
                Iterator<ExoPlayerImplExternalSyntheticLambda12> it = reorderingBufferQueueOutputConsumer.iterator();
                int i2 = IAuthTabCallback;
                int i3 = (i2 ^ 81) + ((i2 & 81) << 1);
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 / 3;
                }
                while (!(!it.hasNext())) {
                    int i5 = onNavigationEvent + 65;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList.add(it.next());
                    int i7 = onNavigationEvent + 23;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
                ExoPlayerImplExternalSyntheticLambda16 exoPlayerImplExternalSyntheticLambda16 = new ExoPlayerImplExternalSyntheticLambda16(arrayList, bArr, (byte) 0);
                int i9 = IAuthTabCallback;
                int i10 = (i9 ^ 71) + ((i9 & 71) << 1);
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return exoPlayerImplExternalSyntheticLambda16;
            } finally {
                try {
                    reorderingBufferQueueOutputConsumer.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
