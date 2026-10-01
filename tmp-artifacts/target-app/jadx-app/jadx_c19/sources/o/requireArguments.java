package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class requireArguments {
    private static final char[] onNavigationEvent = postponeEnterTransition.onExtraCallback(true);
    private static final byte[] onWarmupCompleted = postponeEnterTransition.onNavigationEvent(true);
    private static final requireArguments onExtraCallback = new requireArguments();

    public static requireArguments IAuthTabCallback() {
        return onExtraCallback;
    }

    public char[] onExtraCallbackWithResult(String str) {
        int iIAuthTabCallback;
        int length = str.length();
        char[] cArrAsBinder = new char[onExtraCallbackWithResult(length)];
        int[] iArrOnWarmupCompleted = postponeEnterTransition.onWarmupCompleted();
        int length2 = iArrOnWarmupCompleted.length;
        markState markstateOnNavigationEvent = null;
        char[] cArrOnWarmupCompleted = null;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i3 < length) {
            do {
                char cCharAt = str.charAt(i3);
                if (cCharAt >= length2 || iArrOnWarmupCompleted[cCharAt] == 0) {
                    if (i2 >= cArrAsBinder.length) {
                        if (markstateOnNavigationEvent == null) {
                            markstateOnNavigationEvent = markState.onNavigationEvent(cArrAsBinder);
                        }
                        try {
                            cArrAsBinder = markstateOnNavigationEvent.asBinder();
                            i2 = 0;
                        } catch (IOException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    cArrAsBinder[i2] = cCharAt;
                    i3++;
                    i2++;
                } else {
                    if (cArrOnWarmupCompleted == null) {
                        cArrOnWarmupCompleted = onWarmupCompleted();
                    }
                    char cCharAt2 = str.charAt(i3);
                    int i4 = iArrOnWarmupCompleted[cCharAt2];
                    if (i4 < 0) {
                        iIAuthTabCallback = onExtraCallbackWithResult(cCharAt2, cArrOnWarmupCompleted);
                    } else {
                        iIAuthTabCallback = IAuthTabCallback(i4, cArrOnWarmupCompleted);
                    }
                    int i5 = i2 + iIAuthTabCallback;
                    if (i5 > cArrAsBinder.length) {
                        int length3 = cArrAsBinder.length - i2;
                        if (length3 > 0) {
                            System.arraycopy(cArrOnWarmupCompleted, 0, cArrAsBinder, i2, length3);
                        }
                        if (markstateOnNavigationEvent == null) {
                            markstateOnNavigationEvent = markState.onNavigationEvent(cArrAsBinder);
                        }
                        try {
                            cArrAsBinder = markstateOnNavigationEvent.asBinder();
                            int i6 = iIAuthTabCallback - length3;
                            System.arraycopy(cArrOnWarmupCompleted, length3, cArrAsBinder, 0, i6);
                            i2 = i6;
                        } catch (IOException e2) {
                            throw new IllegalStateException(e2);
                        }
                    } else {
                        System.arraycopy(cArrOnWarmupCompleted, 0, cArrAsBinder, i2, iIAuthTabCallback);
                        i2 = i5;
                    }
                    i3++;
                }
            } while (i3 < length);
        }
        if (markstateOnNavigationEvent == null) {
            return Arrays.copyOfRange(cArrAsBinder, 0, i2);
        }
        markstateOnNavigationEvent.onExtraCallbackWithResult(i2);
        try {
            return markstateOnNavigationEvent.onWarmupCompleted();
        } catch (IOException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] onWarmupCompleted(String str) {
        int i2;
        int i3;
        int length = str.length();
        byte[] bArrOnExtraCallbackWithResult = new byte[onWarmupCompleted(length)];
        startPostponedEnterTransition startpostponedentertransitionOnExtraCallback = null;
        int iIAuthTabCallback = 0;
        int i4 = 0;
        loop0: while (i4 < length) {
            int[] iArrOnWarmupCompleted = postponeEnterTransition.onWarmupCompleted();
            do {
                char cCharAt = str.charAt(i4);
                if (cCharAt <= 127 && iArrOnWarmupCompleted[cCharAt] == 0) {
                    if (iIAuthTabCallback >= bArrOnExtraCallbackWithResult.length) {
                        if (startpostponedentertransitionOnExtraCallback == null) {
                            startpostponedentertransitionOnExtraCallback = startPostponedEnterTransition.onExtraCallback(bArrOnExtraCallbackWithResult, iIAuthTabCallback);
                        }
                        bArrOnExtraCallbackWithResult = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                        iIAuthTabCallback = 0;
                    }
                    bArrOnExtraCallbackWithResult[iIAuthTabCallback] = (byte) cCharAt;
                    i4++;
                    iIAuthTabCallback++;
                } else {
                    if (startpostponedentertransitionOnExtraCallback == null) {
                        startpostponedentertransitionOnExtraCallback = startPostponedEnterTransition.onExtraCallback(bArrOnExtraCallbackWithResult, iIAuthTabCallback);
                    }
                    if (iIAuthTabCallback >= bArrOnExtraCallbackWithResult.length) {
                        bArrOnExtraCallbackWithResult = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                        iIAuthTabCallback = 0;
                    }
                    int i5 = i4 + 1;
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 <= 127) {
                        i4 = i5;
                        iIAuthTabCallback = IAuthTabCallback(cCharAt2, iArrOnWarmupCompleted[cCharAt2], startpostponedentertransitionOnExtraCallback, iIAuthTabCallback);
                        bArrOnExtraCallbackWithResult = startpostponedentertransitionOnExtraCallback.onExtraCallbackWithResult();
                    } else {
                        if (cCharAt2 <= 2047) {
                            i2 = iIAuthTabCallback + 1;
                            bArrOnExtraCallbackWithResult[iIAuthTabCallback] = (byte) ((cCharAt2 >> 6) | 192);
                        } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                            int i6 = iIAuthTabCallback + 1;
                            bArrOnExtraCallbackWithResult[iIAuthTabCallback] = (byte) ((cCharAt2 >> '\f') | 224);
                            if (i6 >= bArrOnExtraCallbackWithResult.length) {
                                bArrOnExtraCallbackWithResult = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                                i6 = 0;
                            }
                            bArrOnExtraCallbackWithResult[i6] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                            i2 = i6 + 1;
                        } else {
                            if (cCharAt2 > 56319) {
                                onNavigationEvent(cCharAt2);
                            }
                            if (i5 >= length) {
                                onNavigationEvent(cCharAt2);
                            }
                            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(cCharAt2, str.charAt(i5));
                            if (iOnExtraCallbackWithResult > 1114111) {
                                onNavigationEvent(iOnExtraCallbackWithResult);
                            }
                            int i7 = iIAuthTabCallback + 1;
                            bArrOnExtraCallbackWithResult[iIAuthTabCallback] = (byte) ((iOnExtraCallbackWithResult >> 18) | 240);
                            if (i7 >= bArrOnExtraCallbackWithResult.length) {
                                bArrOnExtraCallbackWithResult = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                                i7 = 0;
                            }
                            int i8 = i7 + 1;
                            bArrOnExtraCallbackWithResult[i7] = (byte) (((iOnExtraCallbackWithResult >> 12) & 63) | 128);
                            if (i8 >= bArrOnExtraCallbackWithResult.length) {
                                bArrOnExtraCallbackWithResult = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                                i8 = 0;
                            }
                            bArrOnExtraCallbackWithResult[i8] = (byte) (((iOnExtraCallbackWithResult >> 6) & 63) | 128);
                            i5 = i4 + 2;
                            i2 = i8 + 1;
                            i3 = (iOnExtraCallbackWithResult & 63) | 128;
                            if (i2 >= bArrOnExtraCallbackWithResult.length) {
                                bArrOnExtraCallbackWithResult = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                                i2 = 0;
                            }
                            bArrOnExtraCallbackWithResult[i2] = (byte) i3;
                            iIAuthTabCallback = i2 + 1;
                            i4 = i5;
                        }
                        i3 = (cCharAt2 & '?') | 128;
                        if (i2 >= bArrOnExtraCallbackWithResult.length) {
                        }
                        bArrOnExtraCallbackWithResult[i2] = (byte) i3;
                        iIAuthTabCallback = i2 + 1;
                        i4 = i5;
                    }
                }
            } while (i4 < length);
        }
        if (startpostponedentertransitionOnExtraCallback == null) {
            return Arrays.copyOfRange(bArrOnExtraCallbackWithResult, 0, iIAuthTabCallback);
        }
        return startpostponedentertransitionOnExtraCallback.IAuthTabCallback(iIAuthTabCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] IAuthTabCallback(String str) {
        int i2;
        int i3;
        int length = str.length();
        int iOnWarmupCompleted = onWarmupCompleted(length);
        byte[] bArrOnNavigationEvent = new byte[iOnWarmupCompleted];
        startPostponedEnterTransition startpostponedentertransitionOnExtraCallback = null;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i5 >= length) {
                break;
            }
            int i6 = i5 + 1;
            int iCharAt = str.charAt(i5);
            while (iCharAt <= 127) {
                if (i4 >= iOnWarmupCompleted) {
                    if (startpostponedentertransitionOnExtraCallback == null) {
                        startpostponedentertransitionOnExtraCallback = startPostponedEnterTransition.onExtraCallback(bArrOnNavigationEvent, i4);
                    }
                    byte[] bArrOnNavigationEvent2 = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                    i4 = 0;
                    bArrOnNavigationEvent = bArrOnNavigationEvent2;
                    iOnWarmupCompleted = bArrOnNavigationEvent2.length;
                }
                int i7 = i4 + 1;
                bArrOnNavigationEvent[i4] = (byte) iCharAt;
                if (i6 >= length) {
                    i4 = i7;
                    break loop0;
                }
                iCharAt = str.charAt(i6);
                i6++;
                i4 = i7;
            }
            if (startpostponedentertransitionOnExtraCallback == null) {
                startpostponedentertransitionOnExtraCallback = startPostponedEnterTransition.onExtraCallback(bArrOnNavigationEvent, i4);
            }
            if (i4 >= iOnWarmupCompleted) {
                bArrOnNavigationEvent = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                iOnWarmupCompleted = bArrOnNavigationEvent.length;
                i4 = 0;
            }
            if (iCharAt < 2048) {
                i2 = i4 + 1;
                bArrOnNavigationEvent[i4] = (byte) ((iCharAt >> 6) | 192);
            } else if (iCharAt < 55296 || iCharAt > 57343) {
                int i8 = i4 + 1;
                bArrOnNavigationEvent[i4] = (byte) ((iCharAt >> 12) | 224);
                if (i8 >= iOnWarmupCompleted) {
                    bArrOnNavigationEvent = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                    iOnWarmupCompleted = bArrOnNavigationEvent.length;
                    i8 = 0;
                }
                bArrOnNavigationEvent[i8] = (byte) (((iCharAt >> 6) & 63) | 128);
                i2 = i8 + 1;
            } else {
                if (iCharAt > 56319) {
                    onNavigationEvent(iCharAt);
                }
                if (i6 >= length) {
                    onNavigationEvent(iCharAt);
                }
                iCharAt = onExtraCallbackWithResult(iCharAt, str.charAt(i6));
                if (iCharAt > 1114111) {
                    onNavigationEvent(iCharAt);
                }
                int i9 = i4 + 1;
                bArrOnNavigationEvent[i4] = (byte) ((iCharAt >> 18) | 240);
                if (i9 >= iOnWarmupCompleted) {
                    bArrOnNavigationEvent = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                    iOnWarmupCompleted = bArrOnNavigationEvent.length;
                    i9 = 0;
                }
                int i10 = i9 + 1;
                bArrOnNavigationEvent[i9] = (byte) (((iCharAt >> 12) & 63) | 128);
                if (i10 >= iOnWarmupCompleted) {
                    bArrOnNavigationEvent = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                    iOnWarmupCompleted = bArrOnNavigationEvent.length;
                    i10 = 0;
                }
                bArrOnNavigationEvent[i10] = (byte) (((iCharAt >> 6) & 63) | 128);
                i6++;
                i3 = i10 + 1;
                int i11 = i6;
                int i12 = iCharAt;
                i5 = i11;
                if (i3 < iOnWarmupCompleted) {
                    byte[] bArrOnNavigationEvent3 = startpostponedentertransitionOnExtraCallback.onNavigationEvent();
                    i3 = 0;
                    bArrOnNavigationEvent = bArrOnNavigationEvent3;
                    iOnWarmupCompleted = bArrOnNavigationEvent3.length;
                }
                bArrOnNavigationEvent[i3] = (byte) ((i12 & 63) | 128);
                i4 = i3 + 1;
            }
            i3 = i2;
            int i112 = i6;
            int i122 = iCharAt;
            i5 = i112;
            if (i3 < iOnWarmupCompleted) {
            }
            bArrOnNavigationEvent[i3] = (byte) ((i122 & 63) | 128);
            i4 = i3 + 1;
        }
        if (startpostponedentertransitionOnExtraCallback == null) {
            return Arrays.copyOfRange(bArrOnNavigationEvent, 0, i4);
        }
        return startpostponedentertransitionOnExtraCallback.IAuthTabCallback(i4);
    }

    private char[] onWarmupCompleted() {
        return new char[]{'\\', 0, '0', '0', 0, 0};
    }

    private int onExtraCallbackWithResult(int i2, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = onNavigationEvent;
        cArr[4] = cArr2[i2 >> 4];
        cArr[5] = cArr2[i2 & 15];
        return 6;
    }

    private int IAuthTabCallback(int i2, char[] cArr) {
        cArr[1] = (char) i2;
        return 2;
    }

    private int IAuthTabCallback(int i2, int i3, startPostponedEnterTransition startpostponedentertransition, int i4) {
        startpostponedentertransition.onNavigationEvent(i4);
        startpostponedentertransition.onWarmupCompleted(92);
        if (i3 < 0) {
            startpostponedentertransition.onWarmupCompleted(117);
            if (i2 > 255) {
                byte[] bArr = onWarmupCompleted;
                startpostponedentertransition.onWarmupCompleted(bArr[i2 >> 12]);
                startpostponedentertransition.onWarmupCompleted(bArr[(i2 >> 8) & 15]);
                i2 &= OggPageHeader.MAX_SEGMENT_COUNT;
            } else {
                startpostponedentertransition.onWarmupCompleted(48);
                startpostponedentertransition.onWarmupCompleted(48);
            }
            byte[] bArr2 = onWarmupCompleted;
            startpostponedentertransition.onWarmupCompleted(bArr2[i2 >> 4]);
            startpostponedentertransition.onWarmupCompleted(bArr2[i2 & 15]);
        } else {
            startpostponedentertransition.onWarmupCompleted((byte) i3);
        }
        return startpostponedentertransition.IAuthTabCallback();
    }

    private static int onExtraCallbackWithResult(int i2, int i3) {
        if (i3 >= 56320 && i3 <= 57343) {
            return ((i2 << 10) + i3) - 56613888;
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i3) + "; illegal combination");
    }

    private static void onNavigationEvent(int i2) {
        throw new IllegalArgumentException(restoreChildFragmentState.onExtraCallbackWithResult(i2));
    }

    static int onExtraCallbackWithResult(int i2) {
        return Math.min(Math.max(16, i2 + Math.min((i2 >> 3) + 6, 1000)), 32000);
    }

    static int onWarmupCompleted(int i2) {
        return Math.min(Math.max(24, i2 + 6 + (i2 >> 1)), 32000);
    }
}
