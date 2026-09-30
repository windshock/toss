package org.bouncycastle.its;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.bouncycastle.oer.its.PublicEncryptionKey;
import org.bouncycastle.oer.its.SymmAlgorithm;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ITSPublicEncryptionKey {
    public final PublicEncryptionKey encryptionKey;

    public ITSPublicEncryptionKey(PublicEncryptionKey publicEncryptionKey) {
        this.encryptionKey = publicEncryptionKey;
    }

    public PublicEncryptionKey toASN1Structure() {
        return this.encryptionKey;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'aes128Ccm' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class symmAlgorithm {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ symmAlgorithm[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final symmAlgorithm aes128Ccm;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int[] onWarmupCompleted;
        private final int tagValue;

        static {
            onExtraCallbackWithResult();
            Object[] objArr = new Object[1];
            a(new int[]{420649308, -618125778, -1091719904, -1080178110, 1468509256, 1155327458}, Color.red(0) + 9, objArr);
            symmAlgorithm symmalgorithm = new symmAlgorithm(((String) objArr[0]).intern(), 0, SymmAlgorithm.aes128Ccm.intValueExact());
            aes128Ccm = symmalgorithm;
            $VALUES = new symmAlgorithm[]{symmalgorithm};
            int i = onNavigationEvent + 5;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private symmAlgorithm(String str, int i, int i2) {
            this.tagValue = i2;
        }

        public static symmAlgorithm valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            symmAlgorithm symmalgorithm = (symmAlgorithm) Enum.valueOf(symmAlgorithm.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return symmalgorithm;
        }

        public static symmAlgorithm[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            symmAlgorithm[] symmalgorithmArr = (symmAlgorithm[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return symmalgorithmArr;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onWarmupCompleted;
            long j = 0;
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 71, 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i6++;
                        j = 0;
                        i4 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onWarmupCompleted;
            char c = '0';
            if (iArr5 != null) {
                int i7 = $11 + 13;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(iArr5[i9]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, c, i5, i5) + 1), 71 - ((byte) KeyEvent.getModifierMetaStateMask()), 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i9++;
                        c = '0';
                        i5 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i10 = $10 + 41;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                iArr5 = iArr6;
                i2 = 0;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i12 = 0;
                while (i12 < 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), 38 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i12++;
                    int i13 = $10 + 51;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                }
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 4034), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 79, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        static void onExtraCallbackWithResult() {
            onWarmupCompleted = new int[]{1948318606, 1434807886, 1470200583, 923996894, 1802622372, -1695219999, 55375600, -1009192112, 414205841, -103593626, 168037726, -1074965230, 47866978, -683037966, -628626109, -887870172, -755743334, -1218217524};
        }
    }
}
