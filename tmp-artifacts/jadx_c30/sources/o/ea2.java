package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bson.types.Decimal128;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ea2 extends wiesya {
    private static final byte[] $$a = {117, -24, -14, ISOFileInfo.FCP_BYTE};
    private static final int $$b = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 478308997;
    private final Decimal128 onExtraCallback;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = (b * 4) + 105;
        int i6 = (i * 2) + 4;
        int i7 = 1 - (i2 * 3);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            int i10 = i6;
            int i11 = i6 + i8;
            int i12 = i10 + 1;
            i3 = i9;
            i5 = i11;
            i6 = i12;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i5;
            i10 = i6;
            i6 = bArr[i6];
            i9 = i4;
            i8 = i13;
            int i112 = i6 + i8;
            int i122 = i10 + 1;
            i3 = i9;
            i5 = i112;
            i6 = i122;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i7) {
            }
        }
    }

    public ea2(Decimal128 decimal128) throws Throwable {
        Object[] objArr = new Object[1];
        a(4 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 2 - (Process.myTid() >> 22), new char[]{65525, '\n', 65529, '\t', 0}, true, 280 - View.resolveSize(0, 0), objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), decimal128);
        this.onExtraCallback = decimal128;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        t_ t_Var;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            t_Var = t_.DECIMAL128;
            int i3 = 41 / 0;
        } else {
            t_Var = t_.DECIMAL128;
        }
        int i4 = onNavigationEvent + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return t_Var;
    }

    public Decimal128 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj == null || ea2.class != obj.getClass()) {
            int i4 = onNavigationEvent + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IAuthTabCallback + 99;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        if (this.onExtraCallback.equals(((ea2) obj).onExtraCallback)) {
            return true;
        }
        int i8 = onNavigationEvent + 33;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback.hashCode();
        }
        int i3 = 2 / 0;
        return this.onExtraCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BsonDecimal128{value=" + this.onExtraCallback + '}';
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 29;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35125), 23 - ((Process.getThreadPriority(0) + 20) >> 6), 10278 - Color.red(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2166, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i9 = $10 + 125;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i11 = $11 + 107;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i13 = $11 + 111;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i >> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) >>> 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ExpandableListView.getPackedPositionType(0L)), 54 - Process.getGidForName(BuildConfig.FLAVOR), 2167 - (ViewConfiguration.getTapTimeout() >> 16), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12843), 55 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), Process.getGidForName(BuildConfig.FLAVOR) + 2168, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    i4 = 2083011369;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
