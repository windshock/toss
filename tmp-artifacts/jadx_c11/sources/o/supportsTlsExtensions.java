package o;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class supportsTlsExtensions {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[allEnabledTlsVersions.values().length];
            try {
                iArr[allEnabledTlsVersions.Float.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[allEnabledTlsVersions.Float2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[allEnabledTlsVersions.Float3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[allEnabledTlsVersions.Float4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[allEnabledTlsVersions.Mat3.ordinal()] = 5;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[allEnabledTlsVersions.Mat4.ordinal()] = 6;
                int i2 = onWarmupCompleted + 113;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[allEnabledTlsVersions.Int.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[allEnabledTlsVersions.Int2.ordinal()] = 8;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[allEnabledTlsVersions.Int3.ordinal()] = 9;
                int i5 = onWarmupCompleted + 57;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[allEnabledTlsVersions.Int4.ordinal()] = 10;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[allEnabledTlsVersions.Bool.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[allEnabledTlsVersions.None.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            IAuthTabCallback = iArr;
        }
    }

    public static final FloatBuffer IAuthTabCallback(@NotNull float[] fArr) {
        FloatBuffer floatBufferPut;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fArr, "");
            floatBufferPut = ByteBuffer.allocateDirect(fArr.length >>> 5).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(fArr, "");
            floatBufferPut = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
            i = 0;
        }
        Buffer bufferPosition = floatBufferPut.position(i);
        Intrinsics.checkNotNull(bufferPosition, "");
        FloatBuffer floatBuffer = (FloatBuffer) bufferPosition;
        int i4 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return floatBuffer;
        }
        throw null;
    }

    public static final IntBuffer IAuthTabCallback(@NotNull int[] iArr) {
        IntBuffer intBufferPut;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iArr, "");
            intBufferPut = ByteBuffer.allocateDirect(iArr.length >>> 3).order(ByteOrder.nativeOrder()).asIntBuffer().put(iArr);
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(iArr, "");
            intBufferPut = ByteBuffer.allocateDirect(iArr.length << 2).order(ByteOrder.nativeOrder()).asIntBuffer().put(iArr);
            i = 0;
        }
        Buffer bufferPosition = intBufferPut.position(i);
        Intrinsics.checkNotNull(bufferPosition, "");
        IntBuffer intBuffer = (IntBuffer) bufferPosition;
        int i4 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return intBuffer;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(List list, String str, allEnabledTlsVersions allenabledtlsversions, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 ? (i & 4) != 0 : (i & 4) != 0) {
            int i5 = i3 + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        IAuthTabCallback(list, str, allenabledtlsversions, z);
    }

    public static final void IAuthTabCallback(@NotNull List<cipherSuites> list, @NotNull String str, @NotNull allEnabledTlsVersions allenabledtlsversions, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(allenabledtlsversions, "");
        list.add(new cipherSuites(str, allenabledtlsversions, onExtraCallback(allenabledtlsversions), 0, z, 8, null));
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final int onExtraCallback(@NotNull allEnabledTlsVersions allenabledtlsversions) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(allenabledtlsversions, "");
        switch (onExtraCallbackWithResult.IAuthTabCallback[allenabledtlsversions.ordinal()]) {
            case 1:
                return 4;
            case 2:
                int i4 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 17 / 0;
                }
                return 8;
            case 3:
                return 12;
            case 4:
                return 16;
            case 5:
                return 36;
            case 6:
                return 64;
            case 7:
                return 4;
            case 8:
                return 8;
            case 9:
                return 12;
            case 10:
                return 16;
            case 11:
                return 1;
            case 12:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
