package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TopLayoutDislike23 {
    private boolean IAuthTabCallback;
    private int IAuthTabCallbackStub;
    long onExtraCallback;
    private InputStream onExtraCallbackWithResult;
    int onWarmupCompleted;
    private final byte[] onNavigationEvent = new byte[4160];
    private final int[] onTransact = new int[1040];
    private final RFEndCardBackUpLayout IAuthTabCallbackDefault = new RFEndCardBackUpLayout();
    private int asInterface = 0;

    TopLayoutDislike23() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r4.IAuthTabCallback = true;
        r4.asInterface = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r1 = r1 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void onWarmupCompleted(TopLayoutDislike23 topLayoutDislike23) throws IOException {
        int i = topLayoutDislike23.IAuthTabCallbackStub;
        if (i > 1015) {
            if (topLayoutDislike23.IAuthTabCallback) {
                if (onNavigationEvent(topLayoutDislike23) < -2) {
                    throw new TopLayoutDislike26("No more input");
                }
                return;
            }
            int i2 = i << 2;
            int i3 = 4096 - i2;
            byte[] bArr = topLayoutDislike23.onNavigationEvent;
            System.arraycopy(bArr, i2, bArr, 0, i3);
            topLayoutDislike23.IAuthTabCallbackStub = 0;
            while (true) {
                if (i3 >= 4096) {
                    break;
                }
                try {
                    int i4 = topLayoutDislike23.onExtraCallbackWithResult.read(topLayoutDislike23.onNavigationEvent, i3, 4096 - i3);
                    if (i4 <= 0) {
                        break;
                    } else {
                        i3 += i4;
                    }
                } catch (IOException e) {
                    throw new TopLayoutDislike26("Failed to read input", e);
                }
            }
            RFEndCardBackUpLayout.IAuthTabCallback(topLayoutDislike23.IAuthTabCallbackDefault, i3 >> 2);
        }
    }

    static void onExtraCallbackWithResult(TopLayoutDislike23 topLayoutDislike23, boolean z) {
        if (topLayoutDislike23.IAuthTabCallback) {
            int i = ((topLayoutDislike23.IAuthTabCallbackStub << 2) + ((topLayoutDislike23.onWarmupCompleted + 7) >> 3)) - 8;
            int i2 = topLayoutDislike23.asInterface;
            if (i > i2) {
                throw new TopLayoutDislike26("Read after end");
            }
            if (z && i != i2) {
                throw new TopLayoutDislike26("Unused bytes after end");
            }
        }
    }

    static void onExtraCallbackWithResult(TopLayoutDislike23 topLayoutDislike23) {
        int i = topLayoutDislike23.onWarmupCompleted;
        if (i >= 32) {
            int[] iArr = topLayoutDislike23.onTransact;
            topLayoutDislike23.IAuthTabCallbackStub = topLayoutDislike23.IAuthTabCallbackStub + 1;
            topLayoutDislike23.onExtraCallback = (iArr[r3] << 32) | (topLayoutDislike23.onExtraCallback >>> 32);
            topLayoutDislike23.onWarmupCompleted = i - 32;
        }
    }

    static int IAuthTabCallback(TopLayoutDislike23 topLayoutDislike23, int i) {
        onExtraCallbackWithResult(topLayoutDislike23);
        long j = topLayoutDislike23.onExtraCallback;
        int i2 = topLayoutDislike23.onWarmupCompleted;
        int i3 = (int) (j >>> i2);
        topLayoutDislike23.onWarmupCompleted = i2 + i;
        return i3 & ((1 << i) - 1);
    }

    static void onWarmupCompleted(TopLayoutDislike23 topLayoutDislike23, InputStream inputStream) throws IOException {
        if (topLayoutDislike23.onExtraCallbackWithResult != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        RFEndCardBackUpLayout.onExtraCallback(topLayoutDislike23.IAuthTabCallbackDefault, topLayoutDislike23.onNavigationEvent, topLayoutDislike23.onTransact);
        topLayoutDislike23.onExtraCallbackWithResult = inputStream;
        topLayoutDislike23.onExtraCallback = 0L;
        topLayoutDislike23.onWarmupCompleted = 64;
        topLayoutDislike23.IAuthTabCallbackStub = 1024;
        topLayoutDislike23.IAuthTabCallback = false;
        onTransact(topLayoutDislike23);
    }

    private static void onTransact(TopLayoutDislike23 topLayoutDislike23) throws IOException {
        onWarmupCompleted(topLayoutDislike23);
        onExtraCallbackWithResult(topLayoutDislike23, false);
        onExtraCallbackWithResult(topLayoutDislike23);
        onExtraCallbackWithResult(topLayoutDislike23);
    }

    static void IAuthTabCallbackDefault(TopLayoutDislike23 topLayoutDislike23) throws IOException {
        if (topLayoutDislike23.onWarmupCompleted == 64) {
            onTransact(topLayoutDislike23);
        }
    }

    static void IAuthTabCallback(TopLayoutDislike23 topLayoutDislike23) throws IOException {
        InputStream inputStream = topLayoutDislike23.onExtraCallbackWithResult;
        topLayoutDislike23.onExtraCallbackWithResult = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    static void onExtraCallback(TopLayoutDislike23 topLayoutDislike23) {
        int i = (64 - topLayoutDislike23.onWarmupCompleted) & 7;
        if (i != 0 && IAuthTabCallback(topLayoutDislike23, i) != 0) {
            throw new TopLayoutDislike26("Corrupted padding bits");
        }
    }

    static int onNavigationEvent(TopLayoutDislike23 topLayoutDislike23) {
        return (topLayoutDislike23.IAuthTabCallback ? (topLayoutDislike23.asInterface + 3) >> 2 : 1024) - topLayoutDislike23.IAuthTabCallbackStub;
    }

    static void onNavigationEvent(TopLayoutDislike23 topLayoutDislike23, byte[] bArr, int i, int i2) throws IOException {
        if ((topLayoutDislike23.onWarmupCompleted & 7) != 0) {
            throw new TopLayoutDislike26("Unaligned copyBytes");
        }
        while (true) {
            int i3 = topLayoutDislike23.onWarmupCompleted;
            if (i3 == 64 || i2 == 0) {
                break;
            }
            bArr[i] = (byte) (topLayoutDislike23.onExtraCallback >>> i3);
            topLayoutDislike23.onWarmupCompleted = i3 + 8;
            i2--;
            i++;
        }
        if (i2 != 0) {
            int iMin = Math.min(onNavigationEvent(topLayoutDislike23), i2 >> 2);
            if (iMin > 0) {
                int i4 = iMin << 2;
                System.arraycopy(topLayoutDislike23.onNavigationEvent, topLayoutDislike23.IAuthTabCallbackStub << 2, bArr, i, i4);
                i += i4;
                i2 -= i4;
                topLayoutDislike23.IAuthTabCallbackStub += iMin;
            }
            if (i2 != 0) {
                if (onNavigationEvent(topLayoutDislike23) <= 0) {
                    while (i2 > 0) {
                        try {
                            int i5 = topLayoutDislike23.onExtraCallbackWithResult.read(bArr, i, i2);
                            if (i5 == -1) {
                                throw new TopLayoutDislike26("Unexpected end of input");
                            }
                            i += i5;
                            i2 -= i5;
                        } catch (IOException e) {
                            throw new TopLayoutDislike26("Failed to read input", e);
                        }
                    }
                    return;
                }
                onExtraCallbackWithResult(topLayoutDislike23);
                while (i2 != 0) {
                    long j = topLayoutDislike23.onExtraCallback;
                    int i6 = topLayoutDislike23.onWarmupCompleted;
                    bArr[i] = (byte) (j >>> i6);
                    topLayoutDislike23.onWarmupCompleted = i6 + 8;
                    i2--;
                    i++;
                }
                onExtraCallbackWithResult(topLayoutDislike23, false);
            }
        }
    }
}
