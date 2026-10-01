package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipException;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class onPostExecute implements dj11 {
    private byte[] IAuthTabCallback;
    private byte[] onExtraCallback;
    private final dj4 onWarmupCompleted;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AES128' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback AES128;
        public static final onExtraCallback AES192;
        public static final onExtraCallback AES256;
        public static final onExtraCallback DES;
        private static boolean IAuthTabCallback = false;
        public static final onExtraCallback RC2;
        public static final onExtraCallback RC2pre52;
        public static final onExtraCallback RC4;
        public static final onExtraCallback TripleDES168;
        public static final onExtraCallback TripleDES192;
        public static final onExtraCallback UNKNOWN;
        private static int asBinder = 1;
        private static int asInterface = 1;
        private static final Map<Integer, onExtraCallback> codeToEnum;
        private static int onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static boolean onNavigationEvent;
        private static int onTransact;
        private static char[] onWarmupCompleted;
        private final int code;

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onTransact + 85;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onTransact + 7;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 0 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onTransact + 87;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i3 = onTransact + 61;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackArr;
        }

        static {
            onExtraCallbackWithResult();
            onExtraCallback onextracallback = new onExtraCallback("DES", 0, 26113);
            DES = onextracallback;
            onExtraCallback onextracallback2 = new onExtraCallback("RC2pre52", 1, 26114);
            RC2pre52 = onextracallback2;
            onExtraCallback onextracallback3 = new onExtraCallback("TripleDES168", 2, 26115);
            TripleDES168 = onextracallback3;
            onExtraCallback onextracallback4 = new onExtraCallback("TripleDES192", 3, 26121);
            TripleDES192 = onextracallback4;
            Object[] objArr = new Object[1];
            Object obj = null;
            a(null, null, new byte[]{-122, ISOFileInfo.PROP_INFO, -124, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, objArr);
            onExtraCallback onextracallback5 = new onExtraCallback(((String) objArr[0]).intern(), 4, 26126);
            AES128 = onextracallback5;
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.PROP_INFO, ISOFileInfo.FCI_EXT, -124, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, KeyEvent.getDeadChar(0, 0) + CertificateBody.profileType, objArr2);
            onExtraCallback onextracallback6 = new onExtraCallback(((String) objArr2[0]).intern(), 5, 26127);
            AES192 = onextracallback6;
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-119, -120, ISOFileInfo.PROP_INFO, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, 127 - Color.blue(0), objArr3);
            onExtraCallback onextracallback7 = new onExtraCallback(((String) objArr3[0]).intern(), 6, 26128);
            AES256 = onextracallback7;
            onExtraCallback onextracallback8 = new onExtraCallback("RC2", 7, 26370);
            RC2 = onextracallback8;
            onExtraCallback onextracallback9 = new onExtraCallback("RC4", 8, 26625);
            RC4 = onextracallback9;
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + CertificateBody.profileType, objArr4);
            onExtraCallback onextracallback10 = new onExtraCallback(((String) objArr4[0]).intern(), 9, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            UNKNOWN = onextracallback10;
            $VALUES = new onExtraCallback[]{onextracallback, onextracallback2, onextracallback3, onextracallback4, onextracallback5, onextracallback6, onextracallback7, onextracallback8, onextracallback9, onextracallback10};
            HashMap map = new HashMap();
            onExtraCallback[] onextracallbackArrValues = values();
            int i = onExtraCallbackWithResult + 71;
            asInterface = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
            for (onExtraCallback onextracallback11 : onextracallbackArrValues) {
                map.put(Integer.valueOf(onextracallback11.getCode()), onextracallback11);
            }
            codeToEnum = Collections.unmodifiableMap(map);
            int i3 = onExtraCallbackWithResult + 67;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback getAlgorithmByCode(int i) {
            int i2 = 2 % 2;
            int i3 = onTransact + 101;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback onextracallback = codeToEnum.get(Integer.valueOf(i));
            int i5 = asBinder + 7;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 48 / 0;
            }
            return onextracallback;
        }

        private onExtraCallback(String str, int i, int i2) {
            this.code = i2;
        }

        public int getCode() {
            int i = 2 % 2;
            int i2 = asBinder + 115;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.code;
            }
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            char[] cArr2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onWarmupCompleted;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = $10 + 45;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 77, 20952 - View.MeasureSpec.getMode(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 75 - View.resolveSize(0, 0), 16037 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i7 = 1052772399;
            long j = 0;
            if (IAuthTabCallback) {
                int i8 = $11 + 49;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i10 = $11 + 45;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] << iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 63, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 62, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    i7 = 1052772399;
                    j = 0;
                }
                String str = new String(cArr5);
                int i11 = $10 + 107;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                objArr[0] = str;
                return;
            }
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i13 = $11 + 83;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] + iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted >>> 1;
                    } else {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i14 = $10 + 49;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63, 12213 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        static void onExtraCallbackWithResult() {
            onWarmupCompleted = new char[]{32584, 32588, 32638, 32600, 32607, 32593, 32592, 32604, 32595, 32636, 32635, 32582, 32634, 32626};
            onExtraCallback = -1184334071;
            onNavigationEvent = true;
            IAuthTabCallback = true;
        }
    }

    public enum onNavigationEvent {
        NONE(0),
        CRC32(1),
        MD5(32771),
        SHA1(32772),
        RIPEND160(32775),
        SHA256(32780),
        SHA384(32781),
        SHA512(32782);

        private static final Map<Integer, onNavigationEvent> codeToEnum;
        private final int code;

        static {
            HashMap map = new HashMap();
            for (onNavigationEvent onnavigationevent : values()) {
                map.put(Integer.valueOf(onnavigationevent.getCode()), onnavigationevent);
            }
            codeToEnum = Collections.unmodifiableMap(map);
        }

        public static onNavigationEvent getAlgorithmByCode(int i) {
            return codeToEnum.get(Integer.valueOf(i));
        }

        onNavigationEvent(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    protected onPostExecute(dj4 dj4Var) {
        this.onWarmupCompleted = dj4Var;
    }

    protected final void onNavigationEvent(int i, int i2) throws ZipException {
        if (i2 >= i) {
            return;
        }
        throw new ZipException(getClass().getName() + " is too short, only " + i2 + " bytes, expected at least " + i);
    }

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        byte[] bArr = this.onExtraCallback;
        if (bArr != null) {
            return dj5.onWarmupCompleted(bArr);
        }
        return onExtraCallbackWithResult();
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        if (this.onExtraCallback != null) {
            return new dj4(this.onExtraCallback.length);
        }
        return onExtraCallback();
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return this.onWarmupCompleted;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        return dj5.onWarmupCompleted(this.IAuthTabCallback);
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        byte[] bArr = this.IAuthTabCallback;
        return new dj4(bArr != null ? bArr.length : 0);
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        onExtraCallback(bArrCopyOfRange);
        if (this.IAuthTabCallback == null) {
            IAuthTabCallback(bArrCopyOfRange);
        }
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        IAuthTabCallback(Arrays.copyOfRange(bArr, i, i2 + i));
    }

    public void onExtraCallback(byte[] bArr) {
        this.onExtraCallback = dj5.onWarmupCompleted(bArr);
    }

    public void IAuthTabCallback(byte[] bArr) {
        this.IAuthTabCallback = dj5.onWarmupCompleted(bArr);
    }
}
