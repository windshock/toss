package o;

import android.os.Process;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class handleMessage implements ReorderingBufferQueueBuffersWithTimestamp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @Override // o.ReorderingBufferQueueBuffersWithTimestamp
    public final ExoPlayerImplExternalSyntheticLambda14<? extends ExoPlayerImplExternalSyntheticLambda12> onExtraCallbackWithResult(InputStream inputStream) throws IOException {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = (i4 & 17) + (i4 | 17);
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        try {
            int i7 = inputStream.read();
            byte b = (byte) i7;
            int iOnExtraCallbackWithResult = ExoPlayerImplExternalSyntheticLambda1.onExtraCallbackWithResult(b);
            ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17IAuthTabCallback = ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback(b);
            int i8 = i7 & 31;
            if (i8 <= 30) {
                int i9 = onExtraCallback;
                int i10 = (i9 ^ 57) + ((i9 & 57) << 1);
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                ExoPlayerImplExternalSyntheticLambda14<? extends ExoPlayerImplExternalSyntheticLambda12> exoPlayerImplExternalSyntheticLambda14OnExtraCallback = ExoPlayerImplExternalSyntheticLambda14.onExtraCallbackWithResult(iOnExtraCallbackWithResult, i8).onExtraCallback(exoPlayerImplExternalSyntheticLambda17IAuthTabCallback);
                int i12 = IAuthTabCallback;
                int i13 = ((i12 | 51) << 1) - (i12 ^ 51);
                onExtraCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    return exoPlayerImplExternalSyntheticLambda14OnExtraCallback;
                }
                throw new NullPointerException();
            }
            int i14 = inputStream.read();
            if ((i14 & 127) == 0) {
                throw new ExoPlayerImplExternalSyntheticLambda11();
            }
            int i15 = 0;
            while (i14 >= 0) {
                int i16 = onExtraCallback;
                int i17 = i16 + 61;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                if ((i14 & 128) == 0) {
                    break;
                }
                int i19 = (i16 & 61) + (i16 | 61);
                IAuthTabCallback = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = i14 & 5;
                    i = ((i20 & i15) | (i15 ^ i20)) + 117;
                    i2 = inputStream.read();
                } else {
                    int i21 = i14 & 127;
                    i = ((i21 & i15) | (i15 ^ i21)) << 7;
                    i2 = inputStream.read();
                }
                int i22 = i2;
                i15 = i;
                i14 = i22;
            }
            if (i14 < 0) {
                throw new ExoPlayerImplExternalSyntheticLambda11();
            }
            int i23 = i14 & 127;
            ExoPlayerImplExternalSyntheticLambda14<? extends ExoPlayerImplExternalSyntheticLambda12> exoPlayerImplExternalSyntheticLambda14OnExtraCallback2 = ExoPlayerImplExternalSyntheticLambda14.onExtraCallbackWithResult(iOnExtraCallbackWithResult, (i23 & i15) | (i15 ^ i23)).onExtraCallback(exoPlayerImplExternalSyntheticLambda17IAuthTabCallback);
            int i24 = onExtraCallback + 9;
            IAuthTabCallback = i24 % 128;
            if (i24 % 2 != 0) {
                return exoPlayerImplExternalSyntheticLambda14OnExtraCallback2;
            }
            throw new ArithmeticException();
        } catch (IOException e) {
            throw new ExoPlayerImplExternalSyntheticLambda11(e);
        }
    }

    @Override // o.ReorderingBufferQueueBuffersWithTimestamp
    public final int onWarmupCompleted(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (i2 ^ 17) + ((i2 & 17) << 1);
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            int i5 = inputStream.read();
            if (i5 <= 127) {
                int i6 = IAuthTabCallback;
                int i7 = ((i6 | 109) << 1) - (i6 ^ 109);
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    return i5;
                }
                throw new ArithmeticException();
            }
            int i8 = i5 & 127;
            int i9 = 0;
            int i10 = 0;
            while (i9 < i8) {
                int i11 = IAuthTabCallback + 33;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                i10 = (i10 << 8) + inputStream.read();
                int i13 = i9 + 7;
                i9 = (i13 | (-6)) + (i13 & (-6));
            }
            if (i10 == 0) {
                throw new ExoPlayerImplExternalSyntheticLambda11();
            }
            int i14 = IAuthTabCallback + 67;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            return i10;
        } catch (IOException e) {
            throw new ExoPlayerImplExternalSyntheticLambda11(e);
        }
    }

    @Override // o.ReorderingBufferQueueBuffersWithTimestamp
    public final byte[] onExtraCallback(int i, InputStream inputStream) throws IOException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            byte[] bArr = new byte[i];
            int i5 = 0;
            while (i5 < i) {
                int i6 = onExtraCallback;
                int i7 = ((i6 | 83) << 1) - (i6 ^ 83);
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = -i5;
                int iMyUid = Process.myUid();
                int i10 = ~i9;
                int i11 = ~((i10 & i) | (i10 ^ i));
                int i12 = ~iMyUid;
                int i13 = ~((i12 & i) | (i12 ^ i));
                int i14 = (((i9 * 55) + (i * (-107))) - (~(((i11 & i13) | (i11 ^ i13)) * (-108)))) - 1;
                int i15 = ~i9;
                int i16 = ~((i15 & iMyUid) | (i15 ^ iMyUid));
                int i17 = ~i;
                int i18 = ~((i17 ^ i9) | (i17 & i9));
                int i19 = (i16 & i18) | (i16 ^ i18);
                int i20 = ~iMyUid;
                int i21 = ~((i20 & i9) | (i20 ^ i9));
                int i22 = i14 + (((i19 & i21) | (i19 ^ i21)) * 54);
                int i23 = ~((i9 & i17) | (i17 ^ i9));
                int i24 = inputStream.read(bArr, i5, (i22 - (~(((i23 & iMyUid) | (iMyUid ^ i23)) * 54))) - 1);
                if (i24 == -1) {
                    break;
                }
                int i25 = IAuthTabCallback + 63;
                int i26 = i25 % 128;
                onExtraCallback = i26;
                int i27 = i25 % 2;
                int i28 = -(-i24);
                i5 = (i5 | i28) + (i5 & i28);
                int i29 = (i26 ^ 113) + ((i26 & 113) << 1);
                IAuthTabCallback = i29 % 128;
                int i30 = i29 % 2;
            }
            int i31 = IAuthTabCallback;
            int i32 = (i31 ^ 93) + ((i31 & 93) << 1);
            onExtraCallback = i32 % 128;
            int i33 = i32 % 2;
            return bArr;
        } catch (IOException e) {
            throw new ExoPlayerImplExternalSyntheticLambda11(e);
        }
    }
}
