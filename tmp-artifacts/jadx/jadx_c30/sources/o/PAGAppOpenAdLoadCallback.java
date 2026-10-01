package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGAppOpenAdLoadCallback {
    private final IAuthTabCallback onExtraCallback;
    private final onWarmupCompleted onNavigationEvent;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback BIT_32;
        public static final IAuthTabCallback BIT_64;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 0;
        public static final IAuthTabCallback UNKNOWN;
        private static int asBinder = 1;
        private static boolean onExtraCallback = false;
        private static int onExtraCallbackWithResult = 0;
        private static boolean onNavigationEvent = false;
        private static int onTransact = 1;
        private static char[] onWarmupCompleted;
        private final String label;

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onTransact + 39;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                int i4 = 65 / 0;
            }
            int i5 = onTransact + 79;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = IAuthTabCallbackDefault + 125;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return iAuthTabCallbackArr;
        }

        static {
            onExtraCallbackWithResult();
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback("BIT_32", 0, "32-bit");
            BIT_32 = iAuthTabCallback;
            IAuthTabCallback iAuthTabCallback2 = new IAuthTabCallback("BIT_64", 1, "64-bit");
            BIT_64 = iAuthTabCallback2;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-126, ISOFileInfo.PROP_INFO, -124, -126, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, 175 - AndroidCharacter.getMirror('0'), objArr);
            IAuthTabCallback iAuthTabCallback3 = new IAuthTabCallback(((String) objArr[0]).intern(), 2, "Unknown");
            UNKNOWN = iAuthTabCallback3;
            $VALUES = new IAuthTabCallback[]{iAuthTabCallback, iAuthTabCallback2, iAuthTabCallback3};
            int i = asBinder + 65;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallback(String str, int i, String str2) {
            this.label = str2;
        }

        public String getLabel() {
            String str;
            int i = 2 % 2;
            int i2 = onTransact + 109;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                str = this.label;
                int i4 = 44 / 0;
            } else {
                str = this.label;
            }
            int i5 = i3 + 29;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onWarmupCompleted;
            char c = '0';
            if (cArr2 != null) {
                int i3 = $11 + 57;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $10 + 115;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 76 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, c, 0), TextUtils.indexOf(BuildConfig.FLAVOR, c, 0) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5++;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 75 - Color.green(0), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i8 = 1052772399;
            if (onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $11 + 111;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63, 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i11 = $10 + 5;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i13 = $11 + 7;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 62 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), 12214 - (KeyEvent.getMaxKeyCode() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i8 = 1052772399;
            }
            objArr[0] = new String(cArr6);
        }

        static void onExtraCallbackWithResult() {
            onWarmupCompleted = new char[]{32560, 32575, 32570, 32574, 32566};
            onExtraCallbackWithResult = -1184333875;
            onNavigationEvent = true;
            onExtraCallback = true;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted IA_64;
        private static int IAuthTabCallback;
        public static final onWarmupCompleted PPC;
        public static final onWarmupCompleted UNKNOWN;
        public static final onWarmupCompleted X86;
        private static int onExtraCallbackWithResult;
        private static char onNavigationEvent;
        private static long onWarmupCompleted;
        private static final byte[] $$a = {ISO7816.INS_INCREASE, -82, -81, 124};
        private static final int $$b = 96;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int onTransact = 1;
        private static int onExtraCallback = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, short s2, short s3) {
            int i;
            byte[] bArr = $$a;
            int i2 = s + 109;
            int i3 = (s3 * 3) + 4;
            int i4 = s2 * 4;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                int i8 = i5;
                i2 = (-i2) + i8;
                i3 = i6 + 1;
                i = i7;
                bArr2[i] = (byte) i2;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                int i9 = bArr[i3];
                int i10 = i3;
                i8 = i2;
                i2 = i9;
                i7 = i + 1;
                i6 = i10;
                i2 = (-i2) + i8;
                i3 = i6 + 1;
                i = i7;
                bArr2[i] = (byte) i2;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i2;
                if (i == i5) {
                }
            }
        }

        private onWarmupCompleted(String str, int i) {
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = asBinder + 1;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onTransact + 71;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = asBinder + 11;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i3 = onTransact + 83;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 35 / 0;
            }
            return onwarmupcompletedArr;
        }

        static {
            IAuthTabCallback = 0;
            onWarmupCompleted();
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted("X86", 0);
            X86 = onwarmupcompleted;
            onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted("IA_64", 1);
            IA_64 = onwarmupcompleted2;
            onWarmupCompleted onwarmupcompleted3 = new onWarmupCompleted("PPC", 2);
            PPC = onwarmupcompleted3;
            Object[] objArr = new Object[1];
            a((char) View.resolveSize(0, 0), Color.red(0) - 588673510, new char[]{12240, 43988, 7121, 25530, 37589, 1122, 51447}, new char[]{0, 0, 0, 0}, new char[]{6890, 59790, 36572, 3549}, objArr);
            onWarmupCompleted onwarmupcompleted4 = new onWarmupCompleted(((String) objArr[0]).intern(), 3);
            UNKNOWN = onwarmupcompleted4;
            $VALUES = new onWarmupCompleted[]{onwarmupcompleted, onwarmupcompleted2, onwarmupcompleted3, onwarmupcompleted4};
            int i = onExtraCallback + 39;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i4 = $11 + 21;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i6 = $10 + 121;
                $11 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 43 - (Process.myPid() >> 22), 1451 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 44 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 1494 - Color.red(0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)), Drawable.resolveOpacity(0, 0) + 50, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - View.MeasureSpec.getMode(0)), 29 - (ViewConfiguration.getTapTimeout() >> 16), 12576 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                i2 = 2;
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            String str = new String(cArr6);
            int i8 = $11 + 35;
            $10 = i8 % 128;
            if (i8 % 2 == 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static void onWarmupCompleted() {
            onWarmupCompleted = 7798559133331975163L;
            onExtraCallbackWithResult = -1776194565;
            onNavigationEvent = (char) 7592;
        }
    }

    public PAGAppOpenAdLoadCallback(IAuthTabCallback iAuthTabCallback, onWarmupCompleted onwarmupcompleted) {
        this.onExtraCallback = iAuthTabCallback;
        this.onNavigationEvent = onwarmupcompleted;
    }
}
