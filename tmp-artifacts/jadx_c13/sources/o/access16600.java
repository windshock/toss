package o;

import java.nio.charset.Charset;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access16600 {
    private static final access16600 IAuthTabCallback;
    private static final access16600 onNavigationEvent;
    private static final access16600 onWarmupCompleted;
    private final int IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final boolean asBinder;
    private final int asInterface;
    private final onWarmupCompleted onTransact;
    public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent(null);
    private static final byte[] onExtraCallback = {13, 10};

    public /* synthetic */ access16600(boolean z, boolean z2, int i, onWarmupCompleted onwarmupcompleted, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, onwarmupcompleted);
    }

    private access16600(boolean z, boolean z2, int i, onWarmupCompleted onwarmupcompleted) {
        this.asBinder = z;
        this.IAuthTabCallbackStub = z2;
        this.asInterface = i;
        this.onTransact = onwarmupcompleted;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.IAuthTabCallbackDefault = i / 4;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted PRESENT = new onWarmupCompleted("PRESENT", 0);
        public static final onWarmupCompleted ABSENT = new onWarmupCompleted("ABSENT", 1);
        public static final onWarmupCompleted PRESENT_OPTIONAL = new onWarmupCompleted("PRESENT_OPTIONAL", 2);
        public static final onWarmupCompleted ABSENT_OPTIONAL = new onWarmupCompleted("ABSENT_OPTIONAL", 3);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            return new onWarmupCompleted[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            return $ENTRIES;
        }

        public static onWarmupCompleted valueOf(String str) {
            return (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
        }

        public static onWarmupCompleted[] values() {
            return (onWarmupCompleted[]) $VALUES.clone();
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
        }
    }

    public static /* synthetic */ String onExtraCallback(access16600 access16600Var, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return access16600Var.onExtraCallback(bArr, i, i2);
    }

    public final String onExtraCallback(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new String(onNavigationEvent(bArr, i, i2), Charsets.ISO_8859_1);
    }

    public static /* synthetic */ byte[] onExtraCallbackWithResult(access16600 access16600Var, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return access16600Var.onWarmupCompleted(bArr, i, i2);
    }

    public final byte[] onWarmupCompleted(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        onExtraCallback(bArr.length, i, i2);
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr, i, i2);
        byte[] bArr2 = new byte[iOnExtraCallbackWithResult];
        if (onExtraCallback(bArr, bArr2, 0, i, i2) == iOnExtraCallbackWithResult) {
            return bArr2;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static /* synthetic */ byte[] onWarmupCompleted(access16600 access16600Var, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return access16600Var.IAuthTabCallback(charSequence, i, i2);
    }

    public final byte[] IAuthTabCallback(@NotNull CharSequence charSequence, int i, int i2) {
        byte[] bArrOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            onExtraCallback(str.length(), i, i2);
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "");
            bArrOnExtraCallbackWithResult = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrOnExtraCallbackWithResult, "");
        } else {
            bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(charSequence, i, i2);
        }
        return onExtraCallbackWithResult(this, bArrOnExtraCallbackWithResult, 0, 0, 6, null);
    }

    public final byte[] onNavigationEvent(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        onExtraCallback(bArr.length, i, i2);
        byte[] bArr2 = new byte[onWarmupCompleted(i2 - i)];
        onWarmupCompleted(bArr, bArr2, 0, i, i2);
        return bArr2;
    }

    public final int onWarmupCompleted(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        onExtraCallback(bArr.length, i2, i3);
        onExtraCallbackWithResult(bArr2.length, i, onWarmupCompleted(i3 - i2));
        byte[] bArr3 = this.asBinder ? access16500.onWarmupCompleted : access16500.onExtraCallbackWithResult;
        int i5 = this.IAuthTabCallbackStub ? this.IAuthTabCallbackDefault : IntCompanionObject.MAX_VALUE;
        int i6 = i;
        while (true) {
            i4 = i2 + 2;
            if (i4 >= i3) {
                break;
            }
            int iMin = Math.min((i3 - i2) / 3, i5);
            int i7 = 0;
            while (i7 < iMin) {
                int i8 = i2 + 3;
                int i9 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
                bArr2[i6] = bArr3[i9 >>> 18];
                bArr2[i6 + 1] = bArr3[(i9 >>> 12) & 63];
                bArr2[i6 + 2] = bArr3[(i9 >>> 6) & 63];
                bArr2[i6 + 3] = bArr3[i9 & 63];
                i7++;
                i6 += 4;
                i2 = i8;
            }
            if (iMin == i5 && i2 != i3) {
                byte[] bArr4 = onExtraCallback;
                bArr2[i6] = bArr4[0];
                bArr2[i6 + 1] = bArr4[1];
                i6 += 2;
            }
        }
        int i10 = i3 - i2;
        if (i10 == 1) {
            int i11 = i2 + 1;
            int i12 = (bArr[i2] & 255) << 4;
            bArr2[i6] = bArr3[i12 >>> 6];
            int i13 = i6 + 2;
            bArr2[i6 + 1] = bArr3[i12 & 63];
            if (onWarmupCompleted()) {
                bArr2[i13] = 61;
                bArr2[i6 + 3] = 61;
                i6 += 4;
            } else {
                i6 = i13;
            }
            i2 = i11;
        } else if (i10 == 2) {
            int i14 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
            bArr2[i6] = bArr3[i14 >>> 12];
            bArr2[i6 + 1] = bArr3[(i14 >>> 6) & 63];
            int i15 = i6 + 3;
            bArr2[i6 + 2] = bArr3[i14 & 63];
            if (onWarmupCompleted()) {
                i6 += 4;
                bArr2[i15] = 61;
            } else {
                i6 = i15;
            }
            i2 = i4;
        }
        if (i2 == i3) {
            return i6 - i;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int onWarmupCompleted(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = i2 << 2;
        if (i3 != 0) {
            i4 += onWarmupCompleted() ? 4 : i3 + 1;
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.IAuthTabCallbackStub) {
            i4 += ((i4 - 1) / this.asInterface) << 1;
        }
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    private final boolean onWarmupCompleted() {
        onWarmupCompleted onwarmupcompleted = this.onTransact;
        return onwarmupcompleted == onWarmupCompleted.PRESENT || onwarmupcompleted == onWarmupCompleted.PRESENT_OPTIONAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (r7 == (-2)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r7 == (-8)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (r4 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if (r17.onTransact == o.access16600.onWarmupCompleted.PRESENT) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
    
        if (r8 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        r3 = IAuthTabCallback(r18, r6, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
    
        if (r3 < r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
    
        return r9 - r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        r1 = r18[r3] & 255;
        r2 = new java.lang.StringBuilder();
        r2.append("Symbol '");
        r2.append((char) r1);
        r2.append("'(");
        r1 = java.lang.Integer.toString(r1, kotlin.text.CharsKt__CharJVMKt.checkRadix(8));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r2.append(r1);
        r2.append(") at index ");
        r2.append(r3 - 1);
        r2.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
    
        throw new java.lang.IllegalArgumentException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0131, code lost:
    
        throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
    
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int onExtraCallback(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        boolean z;
        int i4;
        int[] iArr = this.asBinder ? access16500.onExtraCallback : access16500.onNavigationEvent;
        int i5 = -8;
        int i6 = i;
        int iOnExtraCallbackWithResult = i2;
        int i7 = -8;
        int i8 = 0;
        while (true) {
            if (iOnExtraCallbackWithResult >= i3) {
                z = false;
                break;
            }
            if (i7 == i5 && (i4 = iOnExtraCallbackWithResult + 3) < i3) {
                int i9 = iArr[bArr[i4] & 255] | (iArr[bArr[iOnExtraCallbackWithResult] & 255] << 18) | (iArr[bArr[iOnExtraCallbackWithResult + 1] & 255] << 12) | (iArr[bArr[iOnExtraCallbackWithResult + 2] & 255] << 6);
                if (i9 >= 0) {
                    bArr2[i6] = (byte) (i9 >> 16);
                    bArr2[i6 + 1] = (byte) (i9 >> 8);
                    bArr2[i6 + 2] = (byte) i9;
                    iOnExtraCallbackWithResult += 4;
                    i6 += 3;
                }
                i5 = -8;
            }
            int i10 = bArr[iOnExtraCallbackWithResult] & 255;
            int i11 = iArr[i10];
            if (i11 >= 0) {
                iOnExtraCallbackWithResult++;
                i8 = (i8 << 6) | i11;
                int i12 = i7 + 6;
                if (i12 >= 0) {
                    bArr2[i6] = (byte) (i8 >>> i12);
                    i8 &= (1 << i12) - 1;
                    i7 -= 2;
                    i6++;
                } else {
                    i7 = i12;
                }
            } else {
                if (i11 == -2) {
                    iOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr, iOnExtraCallbackWithResult, i3, i7);
                    z = true;
                    break;
                }
                if (!this.IAuthTabCallbackStub) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid symbol '");
                    sb.append((char) i10);
                    sb.append("'(");
                    String string = Integer.toString(i10, CharsKt__CharJVMKt.checkRadix(8));
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    sb.append(string);
                    sb.append(") at index ");
                    sb.append(iOnExtraCallbackWithResult);
                    throw new IllegalArgumentException(sb.toString());
                }
                iOnExtraCallbackWithResult++;
            }
            i5 = -8;
        }
    }

    public final int onExtraCallbackWithResult(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int i3 = i2 - i;
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i + ", endIndex: " + i2);
        }
        if (this.IAuthTabCallbackStub) {
            while (true) {
                if (i >= i2) {
                    break;
                }
                int i4 = access16500.onNavigationEvent[bArr[i] & 255];
                if (i4 < 0) {
                    if (i4 == -2) {
                        i3 -= i2 - i;
                        break;
                    }
                    i3--;
                }
                i++;
            }
        } else if (bArr[i2 - 1] == 61) {
            i3 = bArr[i2 + (-2)] == 61 ? i3 - 2 : i3 - 1;
        }
        return (int) ((i3 * 6) / 8);
    }

    public final byte[] onExtraCallbackWithResult(@NotNull CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        onExtraCallback(charSequence.length(), i, i2);
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt <= 255) {
                bArr[i3] = (byte) cCharAt;
            } else {
                bArr[i3] = 63;
            }
            i3++;
            i++;
        }
        return bArr;
    }

    private final int onExtraCallbackWithResult(byte[] bArr, int i, int i2, int i3) {
        if (i3 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i);
        }
        if (i3 == -6) {
            onNavigationEvent(i);
            return i + 1;
        }
        if (i3 != -4) {
            if (i3 == -2) {
                return i + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        onNavigationEvent(i);
        int iIAuthTabCallback = IAuthTabCallback(bArr, i + 1, i2);
        if (iIAuthTabCallback != i2 && bArr[iIAuthTabCallback] == 61) {
            return iIAuthTabCallback + 1;
        }
        throw new IllegalArgumentException("Missing one pad character at index " + iIAuthTabCallback);
    }

    private final void onNavigationEvent(int i) {
        if (this.onTransact != onWarmupCompleted.ABSENT) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i);
    }

    private final int IAuthTabCallback(byte[] bArr, int i, int i2) {
        if (!this.IAuthTabCallbackStub) {
            return i;
        }
        while (i < i2) {
            if (access16500.onNavigationEvent[bArr[i] & 255] != -1) {
                break;
            }
            i++;
        }
        return i;
    }

    public final void onExtraCallback(int i, int i2, int i3) {
        AbstractList.Companion.onWarmupCompleted(i2, i3, i);
    }

    private final void onExtraCallbackWithResult(int i, int i2, int i3) {
        if (i2 < 0 || i2 > i) {
            throw new IndexOutOfBoundsException("destination offset: " + i2 + ", destination size: " + i);
        }
        int i4 = i2 + i3;
        if (i4 < 0 || i4 > i) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i2 + ", destination size: " + i + ", capacity needed: " + i3);
        }
    }

    public static final class onNavigationEvent extends access16600 {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
            super(false, false, -1, onWarmupCompleted.PRESENT, null);
        }
    }

    static {
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.PRESENT;
        onNavigationEvent = new access16600(true, false, -1, onwarmupcompleted);
        onWarmupCompleted = new access16600(false, true, 76, onwarmupcompleted);
        IAuthTabCallback = new access16600(false, true, 64, onwarmupcompleted);
    }
}
