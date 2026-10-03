package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class signEX {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onTransact = 1;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("balance")
    private final Long balance;

    @SerializedName("withdrawableAmount")
    private final Long withdrawableAmount;
    private static char[] onNavigationEvent = {32534, 32546, 32575, 32570, 32559, 32537, 32567, 32565, 32568, 32574, 32521, 32552, 32555, 32564, 32755, 32558, 32530, 32742, 32759, 32763, 32569, 32556, 32562, 32563, 32553, 32538, 32566, 32754};
    private static int onWarmupCompleted = -1184333861;
    private static boolean onExtraCallback = true;
    private static boolean onExtraCallbackWithResult = true;

    public signEX() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 21;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof signEX)) {
            int i7 = i2 + 21;
            onTransact = i7 % 128;
            return i7 % 2 == 0;
        }
        signEX signex = (signEX) obj;
        if (Intrinsics.areEqual(this.accountId, signex.accountId)) {
            return Intrinsics.areEqual(this.balance, signex.balance) && Intrinsics.areEqual(this.withdrawableAmount, signex.withdrawableAmount);
        }
        int i8 = IAuthTabCallback + 93;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3 r4
      0x0028: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r3v6 java.lang.Long) = (r3v0 java.lang.Long), (r3v8 java.lang.Long) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r4v10 int) = (r4v0 int), (r4v11 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r1 r4
      0x0026: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r4v1 int) = (r4v0 int), (r4v11 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.signEX.IAuthTabCallback
            int r1 = r1 + 115
            int r2 = r1 % 128
            o.signEX.onTransact = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1b
            java.lang.String r1 = r7.accountId
            int r1 = r1.hashCode()
            java.lang.Long r3 = r7.balance
            r4 = 1
            if (r3 != 0) goto L28
            goto L26
        L1b:
            java.lang.String r1 = r7.accountId
            int r1 = r1.hashCode()
            java.lang.Long r3 = r7.balance
            r4 = r2
            if (r3 != 0) goto L28
        L26:
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            java.lang.Long r5 = r7.withdrawableAmount
            if (r5 == 0) goto L47
            int r4 = o.signEX.IAuthTabCallback
            int r4 = r4 + 101
            int r6 = r4 % 128
            o.signEX.onTransact = r6
            int r4 = r4 % r0
            if (r4 != 0) goto L43
            int r4 = r5.hashCode()
            r5 = 53
            int r5 = r5 / r2
            goto L47
        L43:
            int r4 = r5.hashCode()
        L47:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r3 = o.signEX.onTransact
            int r3 = r3 + 105
            int r4 = r3 % 128
            o.signEX.IAuthTabCallback = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L5b
            r0 = 42
            int r0 = r0 / r2
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.signEX.hashCode():int");
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.accountId;
        Long l = this.balance;
        Long l2 = this.withdrawableAmount;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-110, -125, -111, -123, -120, -112, -114, -119, -119, -124, -113, -118, -116, -120, -114, -115, -116, -118, -117, -118, -119, -120, -124, -121, -124, -122, -124, -123, -124, -125, -126, -127}, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-110, -118, -119, -120, -124, -121, -124, -107, -108, -109}, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(l);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-110, -123, -120, -112, -114, -101, -102, -118, -121, -107, -124, -106, -124, -103, -125, -104, -123, -105, -106, -108, -109}, (-16777089) - Color.rgb(0, 0, 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(l2);
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-100}, 126 - ImageFormat.getBitsPerPixel(0), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallback + 23;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public signEX(@NotNull String str, @Nullable Long l, @Nullable Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.balance = l;
        this.withdrawableAmount = l2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ signEX(String str, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 125;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 87;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            l = null;
        }
        if ((i & 4) != 0) {
            int i8 = onTransact + 55;
            int i9 = i8 % 128;
            IAuthTabCallback = i9;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i10 = i9 + 59;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            l2 = null;
        }
        this(str, l, l2);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = this.accountId;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Long l = this.balance;
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return l;
    }

    public final Long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.withdrawableAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = onNavigationEvent;
        float f = 0.0f;
        if (cArr4 != null) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = $10 + 11;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr4[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 76, KeyEvent.normalizeMetaState(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr4[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 77 - Color.red(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i2++;
                }
                i3 = 2;
                f = 0.0f;
            }
            cArr4 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "", 0) + 75, 16037 - KeyEvent.getDeadChar(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 62 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i7 = $10 + 49;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $11 + 87;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 97;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), AndroidCharacter.getMirror('0') + 15, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }
}
