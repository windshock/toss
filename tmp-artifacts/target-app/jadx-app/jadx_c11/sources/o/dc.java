package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.rn.spec.ReactAuBundleVerificationKey;
import im.toss.rn.spec.ReactBankBundleVerificationKey;
import im.toss.rn.spec.ReactBundleVerificationKey;
import im.toss.rn.spec.ReactEuBundleVerificationKey;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.security.PublicKey;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class dc {
    private static final byte[] $$a = {110, -114, 93, -109};
    private static final int $$b = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 478308871;
    private final PublicKey IAuthTabCallback;
    private final PublicKey onExtraCallbackWithResult;
    private final PublicKey onNavigationEvent;
    private final PublicKey onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3 = 105 - (b * 2);
        int i4 = b2 + 4;
        byte[] bArr = $$a;
        int i5 = i * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i3 = i5;
            int i6 = i4;
            int i7 = 0;
            i3 += -i4;
            i4 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i4 + 1;
            int i9 = i2 + 1;
            i6 = i8;
            i4 = bArr[i8];
            i7 = i9;
            i3 += -i4;
            i4 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    @Inject
    public dc(@ReactBundleVerificationKey @NotNull PublicKey publicKey, @ReactBankBundleVerificationKey @NotNull PublicKey publicKey2, @ReactAuBundleVerificationKey @NotNull PublicKey publicKey3, @ReactEuBundleVerificationKey @NotNull PublicKey publicKey4) {
        Intrinsics.checkNotNullParameter(publicKey, "");
        Intrinsics.checkNotNullParameter(publicKey2, "");
        Intrinsics.checkNotNullParameter(publicKey3, "");
        Intrinsics.checkNotNullParameter(publicKey4, "");
        this.IAuthTabCallback = publicKey;
        this.onExtraCallbackWithResult = publicKey2;
        this.onWarmupCompleted = publicKey3;
        this.onNavigationEvent = publicKey4;
    }

    public final PublicKey IAuthTabCallback(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!(!Intrinsics.areEqual(str, "kr"))) {
            int i2 = IAuthTabCallbackStub + 69;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(ExpandableListView.getPackedPositionGroup(0L) + 4, (-16777212) - Color.rgb(0, 0, 0), new char[]{65529, 5, '\b', 65531}, false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 152, objArr);
            if (Intrinsics.areEqual(str2, ((String) objArr[0]).intern())) {
                return this.IAuthTabCallback;
            }
        }
        Object obj = null;
        if (Intrinsics.areEqual(str, "kr") && Intrinsics.areEqual(str2, "bank")) {
            int i4 = IAuthTabCallbackDefault + 23;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(str, "au")) {
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3, 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{65529, 5, '\b', 65531}, false, ExpandableListView.getPackedPositionType(0L) + 152, objArr2);
            if (Intrinsics.areEqual(str2, ((String) objArr2[0]).intern())) {
                int i5 = IAuthTabCallbackDefault + 81;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return this.onWarmupCompleted;
            }
        }
        if (Intrinsics.areEqual(str, "eu")) {
            Object[] objArr3 = new Object[1];
            a(4 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, new char[]{65529, 5, '\b', 65531}, false, 152 - TextUtils.getCapsMode("", 0, 0), objArr3);
            if (Intrinsics.areEqual(str2, ((String) objArr3[0]).intern())) {
                int i7 = IAuthTabCallbackDefault + 93;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    return this.onNavigationEvent;
                }
                obj.hashCode();
                throw null;
            }
        }
        throw new IllegalArgumentException("Unsupported region/company combination: " + str + TossSecRoute.Main.PATH + str2);
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 49;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 35125), ((Process.getThreadPriority(0) + 20) >> 6) + 23, 10278 - TextUtils.indexOf("", "", 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - KeyEvent.normalizeMetaState(0)), 55 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2167 - (ViewConfiguration.getEdgeSlop() >> 16), 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            int i9 = $11 + 49;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $11 + 109;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ((Process.getThreadPriority(0) + 20) >> 6)), 55 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2167 - View.getDefaultSize(0, 0), 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
