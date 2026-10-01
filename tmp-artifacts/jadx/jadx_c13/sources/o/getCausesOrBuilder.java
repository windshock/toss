package o;

import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getCausesOrBuilder extends getCausesOrBuilderList {
    public static final getCommandLine onNavigationEvent() {
        byte[] bArr = new byte[16];
        getCausesOrBuilderList.onNavigationEvent(bArr);
        return IAuthTabCallback(bArr);
    }

    public static final getCommandLine IAuthTabCallback(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | ByteCompanionObject.MIN_VALUE);
        return getCommandLine.Companion.onExtraCallback(bArr);
    }

    public static final long onExtraCallback(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i + 7] & 255);
    }

    public static final void onExtraCallback(long j, @NotNull byte[] bArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = setAbortMessageBytes.IAuthTabCallback()[(int) ((j >> (i4 << 3)) & 255)];
            bArr[i] = (byte) (i6 >> 8);
            int i7 = i + 2;
            bArr[i + 1] = (byte) i6;
            if (i4 == i5) {
                return;
            }
            i4--;
            i = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNavigationEvent(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(str, "");
        String strSubstring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        sb.append("...");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNavigationEvent(byte[] bArr, int i) {
        return ArraysKt___ArraysKt.joinToString$default(bArr, (CharSequence) null, (CharSequence) "[", (CharSequence) "]", i, (CharSequence) null, (Function1) null, 49, (Object) null);
    }

    public static final Void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static final getCommandLine onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        long j = 0;
        for (int i = 0; i < 8; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') != 0 || setAbortMessageBytes.onNavigationEvent[cCharAt] < 0) {
                onExtraCallbackWithResult(str, "a hexadecimal digit", i);
                throw new setWrite();
            }
            j = (j << 4) | setAbortMessageBytes.onNavigationEvent[cCharAt];
        }
        if (str.charAt(8) != '-') {
            onExtraCallbackWithResult(str, "'-' (hyphen)", 8);
            throw new setWrite();
        }
        long j2 = 0;
        for (int i2 = 9; i2 < 13; i2++) {
            char cCharAt2 = str.charAt(i2);
            if ((cCharAt2 >>> '\b') != 0 || setAbortMessageBytes.onNavigationEvent[cCharAt2] < 0) {
                onExtraCallbackWithResult(str, "a hexadecimal digit", i2);
                throw new setWrite();
            }
            j2 = (j2 << 4) | setAbortMessageBytes.onNavigationEvent[cCharAt2];
        }
        if (str.charAt(13) != '-') {
            onExtraCallbackWithResult(str, "'-' (hyphen)", 13);
            throw new setWrite();
        }
        long j3 = 0;
        for (int i3 = 14; i3 < 18; i3++) {
            char cCharAt3 = str.charAt(i3);
            if ((cCharAt3 >>> '\b') != 0 || setAbortMessageBytes.onNavigationEvent[cCharAt3] < 0) {
                onExtraCallbackWithResult(str, "a hexadecimal digit", i3);
                throw new setWrite();
            }
            j3 = (j3 << 4) | setAbortMessageBytes.onNavigationEvent[cCharAt3];
        }
        if (str.charAt(18) != '-') {
            onExtraCallbackWithResult(str, "'-' (hyphen)", 18);
            throw new setWrite();
        }
        long j4 = 0;
        for (int i4 = 19; i4 < 23; i4++) {
            char cCharAt4 = str.charAt(i4);
            if ((cCharAt4 >>> '\b') != 0 || setAbortMessageBytes.onNavigationEvent[cCharAt4] < 0) {
                onExtraCallbackWithResult(str, "a hexadecimal digit", i4);
                throw new setWrite();
            }
            j4 = (j4 << 4) | setAbortMessageBytes.onNavigationEvent[cCharAt4];
        }
        if (str.charAt(23) != '-') {
            onExtraCallbackWithResult(str, "'-' (hyphen)", 23);
            throw new setWrite();
        }
        long j5 = 0;
        for (int i5 = 24; i5 < 36; i5++) {
            char cCharAt5 = str.charAt(i5);
            if ((cCharAt5 >>> '\b') != 0 || setAbortMessageBytes.onNavigationEvent[cCharAt5] < 0) {
                onExtraCallbackWithResult(str, "a hexadecimal digit", i5);
                throw new setWrite();
            }
            j5 = (j5 << 4) | setAbortMessageBytes.onNavigationEvent[cCharAt5];
        }
        return getCommandLine.Companion.onExtraCallback((j << 32) | (j2 << 16) | j3, (j4 << 48) | j5);
    }

    public static final getCommandLine onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        long j = 0;
        while (true) {
            if (i < 16) {
                char cCharAt = str.charAt(i);
                if ((cCharAt >>> '\b') != 0 || setAbortMessageBytes.onNavigationEvent[cCharAt] < 0) {
                    break;
                }
                j = (j << 4) | setAbortMessageBytes.onNavigationEvent[cCharAt];
                i++;
            } else {
                long j2 = 0;
                for (int i2 = 16; i2 < 32; i2++) {
                    char cCharAt2 = str.charAt(i2);
                    if ((cCharAt2 >>> '\b') == 0 && setAbortMessageBytes.onNavigationEvent[cCharAt2] >= 0) {
                        j2 = (j2 << 4) | setAbortMessageBytes.onNavigationEvent[cCharAt2];
                    } else {
                        onExtraCallbackWithResult(str, "a hexadecimal digit", i2);
                        throw new setWrite();
                    }
                }
                return getCommandLine.Companion.onExtraCallback(j, j2);
            }
        }
        onExtraCallbackWithResult(str, "a hexadecimal digit", i);
        throw new setWrite();
    }
}
