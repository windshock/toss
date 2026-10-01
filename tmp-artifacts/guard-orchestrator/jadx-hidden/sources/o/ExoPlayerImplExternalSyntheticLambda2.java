package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda2 extends ExoPlayerImplExternalSyntheticLambda24<String> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private String onExtraCallbackWithResult;

    /* synthetic */ ExoPlayerImplExternalSyntheticLambda2(byte[] bArr, String str, byte b) {
        this(bArr, str);
    }

    @Override // o.ExoPlayerImplExternalSyntheticLambda12
    public final /* synthetic */ Object onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallback;
        }
        throw new NullPointerException();
    }

    private ExoPlayerImplExternalSyntheticLambda2(byte[] bArr, String str) {
        super(ExoPlayerImplExternalSyntheticLambda14.onExtraCallbackWithResult, bArr);
        this.onExtraCallbackWithResult = str;
    }

    private String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw new NullPointerException();
    }

    public static class onExtraCallback extends ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // o.ByteArrayDataSourceExternalSyntheticLambda0
        public final /* synthetic */ ExoPlayerImplExternalSyntheticLambda12 onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, byte[] bArr) throws IOException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = (i2 & 73) + (i2 | 73);
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ExoPlayerImplExternalSyntheticLambda2 exoPlayerImplExternalSyntheticLambda2OnExtraCallback = onExtraCallback(bArr);
            int i5 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return exoPlayerImplExternalSyntheticLambda2OnExtraCallback;
            }
            throw new NullPointerException();
        }

        public onExtraCallback(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
            super(reorderingBufferQueueBuffersWithTimestamp);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static o.ExoPlayerImplExternalSyntheticLambda2 onExtraCallback(byte[] r10) throws java.io.IOException {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onWarmupCompleted
                r2 = r1 & 7
                r3 = r1 | 7
                int r2 = r2 + r3
                int r3 = r2 % 128
                o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult = r3
                int r2 = r2 % r0
                int r2 = r10.length
                r3 = 0
                if (r2 <= 0) goto L1f
                int r1 = r1 + 25
                int r2 = r1 % 128
                o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L1d
                goto L1f
            L1d:
                r1 = 1
                goto L20
            L1f:
                r1 = r3
            L20:
                o.ExoPlayerImplExternalSyntheticLambda29.onWarmupCompleted(r1)
                java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
                r1.<init>(r10)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r4 = r1.read()
                int r5 = r4 / 40
                r2.append(r5)
                r5 = 46
                r2.append(r5)
                int r4 = r4 % 40
                r2.append(r4)
            L40:
                int r4 = r1.available()
                if (r4 <= 0) goto L9c
                int r4 = o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onWarmupCompleted
                int r4 = r4 + 19
                int r6 = r4 % 128
                o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult = r6
                int r4 = r4 % r0
                int r4 = r1.read()
                r6 = 127(0x7f, float:1.78E-43)
                if (r4 >= r6) goto L6f
                int r6 = o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult
                int r6 = r6 + 69
                int r7 = r6 % 128
                o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onWarmupCompleted = r7
                int r6 = r6 % r0
                if (r6 == 0) goto L68
                r6 = 107(0x6b, float:1.5E-43)
                r2.append(r6)
                goto L6b
            L68:
                r2.append(r5)
            L6b:
                r2.append(r4)
                goto L40
            L6f:
                r4 = r4 & 127(0x7f, float:1.78E-43)
                long r7 = (long) r4
                java.math.BigInteger r4 = java.math.BigInteger.valueOf(r7)
                int r7 = o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult
                int r7 = r7 + 83
                int r8 = r7 % 128
                o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onWarmupCompleted = r8
                int r7 = r7 % r0
            L7f:
                int r7 = r1.read()
                r8 = 7
                java.math.BigInteger r4 = r4.shiftLeft(r8)
                r8 = r7 & 127(0x7f, float:1.78E-43)
                long r8 = (long) r8
                java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
                java.math.BigInteger r4 = r4.add(r8)
                if (r7 > r6) goto L7f
                r2.append(r5)
                r2.append(r4)
                goto L40
            L9c:
                o.ExoPlayerImplExternalSyntheticLambda2 r1 = new o.ExoPlayerImplExternalSyntheticLambda2
                java.lang.String r2 = r2.toString()
                r1.<init>(r10, r2, r3)
                int r10 = o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onWarmupCompleted
                int r10 = r10 + 123
                int r2 = r10 % 128
                o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult = r2
                int r10 = r10 % r0
                if (r10 == 0) goto Lb1
                return r1
            Lb1:
                java.lang.NullPointerException r10 = new java.lang.NullPointerException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerImplExternalSyntheticLambda2.onExtraCallback.onExtraCallback(byte[]):o.ExoPlayerImplExternalSyntheticLambda2");
        }
    }
}
