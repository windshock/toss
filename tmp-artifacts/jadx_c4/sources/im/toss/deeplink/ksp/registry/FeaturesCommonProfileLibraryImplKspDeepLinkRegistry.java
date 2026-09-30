package im.toss.deeplink.ksp.registry;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.NebulaTitleViewTheme;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesCommonProfileLibraryImplKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private static int onExtraCallbackWithResult = 478309007;

    private static String $$c(short s, short s2, short s3) {
        int i = (s3 * 2) + 4;
        byte[] bArr = $$a;
        int i2 = s2 * 4;
        int i3 = (s * 4) + 105;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = i2 + i;
            i++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = i;
            i3 += bArr[i];
            i = i6 + 1;
            i4 = i5;
        }
    }

    public static /* synthetic */ Class $r8$lambda$4KzBWv9Nns7jn6tWCIz7scBhJYs() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesCommonProfileLibraryImplKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(19 - (ViewConfiguration.getWindowTouchSlop() >> 8), 10 - View.resolveSize(0, 0), new char[]{65493, 65482, 65482, 11, '\r', '\n', 1, 4, 7, 0, 14, 16, 11, 0, '\r', 15, '\n', 14, 14}, false, 267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCommonProfileLibraryImplKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesCommonProfileLibraryImplKspDeepLinkRegistry.$r8$lambda$4KzBWv9Nns7jn6tWCIz7scBhJYs();
                }
                FeaturesCommonProfileLibraryImplKspDeepLinkRegistry.$r8$lambda$4KzBWv9Nns7jn6tWCIz7scBhJYs();
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return NebulaTitleViewTheme.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        char c;
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $10 + 59;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            c = 3;
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 35125), 23 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char deadChar = (char) (12843 - KeyEvent.getDeadChar(0, 0));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 56;
                    int gidForName = Process.getGidForName("") + 2168;
                    byte b = (byte) ($$a[3] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(deadChar, iIndexOf, gidForName, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
            int i9 = $10 + 77;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $11 + 33;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i13 = $10 + 103;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char c2 = (char) (12843 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 56;
                        int i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2166;
                        byte b3 = (byte) ($$a[c] - 1);
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, bitsPerPixel, i14, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback4 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 12843);
                        int i15 = 55 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2167;
                        byte b5 = (byte) ($$a[3] - 1);
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i15, iNormalizeMetaState, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                c = 3;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
