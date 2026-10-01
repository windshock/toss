package o;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class performance {
    public static final performance IAuthTabCallback;
    private static volatile setLogBuffers onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {73, 121, -48, -56};
    private static final int $$b = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = (i * 2) + 1;
        int i5 = 105 - (s * 3);
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i5 += i7;
            bArr2[i3] = (byte) i5;
            i3++;
            i6++;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i6];
            i5 += i7;
            bArr2[i3] = (byte) i5;
            i3++;
            i6++;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i3++;
            i6++;
            if (i3 == i4) {
            }
        }
    }

    static {
        onWarmupCompleted = 0;
        onExtraCallback();
        IAuthTabCallback = new performance();
        int i = onExtraCallback + 31;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private performance() {
    }

    public final void onNavigationEvent(@NotNull PangleEncryptManager pangleEncryptManager) throws Throwable {
        long jAccess100;
        int i = 2 % 2;
        int i2 = asBinder + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        setRevision setrevision = setRevision.MILLISECONDS;
        long jIAuthTabCallback = setCommandLine.IAuthTabCallback(jElapsedRealtime, setrevision);
        long jAccess1002 = setLogBuffers.access100(setLogBuffers.onWarmupCompleted(jIAuthTabCallback, setCommandLine.IAuthTabCallback(Process.getStartElapsedRealtime(), setrevision)));
        setLogBuffers setlogbuffers = onExtraCallbackWithResult;
        if (setlogbuffers != null) {
            int i4 = onTransact + 117;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            jAccess100 = setLogBuffers.access100(setLogBuffers.onWarmupCompleted(jIAuthTabCallback, setlogbuffers.onExtraCallback()));
        } else {
            jAccess100 = -1;
        }
        Object[] objArr = new Object[1];
        a(31 - TextUtils.lastIndexOf("", '0', 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, new char[]{4, 0, 5, '\f', 11, 65532, '\n', 65526, '\n', 0, 5, 65530, 65532, 65526, 65528, 7, 7, 65526, 3, 65528, '\f', 5, 65530, 65535, 65532, 3, 65528, 7, '\n', 65532, 65531, 65526}, false, 200 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        dynamicTrack.onNavigationEvent(pangleEncryptManager, ((String) objArr[0]).intern(), Long.valueOf(jAccess1002));
        Object[] objArr2 = new Object[1];
        a(33 - ((byte) KeyEvent.getModifierMetaStateMask()), 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{'\t', 65525, '\t', 65531, '\n', 11, 4, 65535, 3, 65525, 65530, 65531, '\t', 6, 65527, 2, 65531, '\n', 6, 3, 65531, '\n', '\n', 65527, 65525, '\n', '\t', 65527, 2, 65525, 65531, 65529, 4, 65535}, true, View.combineMeasuredStates(0, 0) + 201, objArr2);
        dynamicTrack.onNavigationEvent(pangleEncryptManager, ((String) objArr2[0]).intern(), Long.valueOf(jAccess100));
        int i6 = onTransact + 45;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - KeyEvent.getDeadChar(0, 0)), 22 - TextUtils.lastIndexOf("", '0'), 10277 - TextUtils.indexOf((CharSequence) "", '0'), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 12843), 55 - View.resolveSize(0, 0), 2166 - ExpandableListView.getPackedPositionChild(0L), 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i6 = $11 + 19;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            int i8 = $10 + 109;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 12843), View.MeasureSpec.getMode(0) + 55, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2166, 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onNavigationEvent = 478308982;
    }
}
