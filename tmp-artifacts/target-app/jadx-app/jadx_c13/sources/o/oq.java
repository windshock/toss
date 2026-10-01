package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.annotation.Nullable;
import o.pvm;
import o.vzs;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class oq extends qgr {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int[] IAuthTabCallback_Parcel = null;
    private static int access000 = 1;
    private static int access100;
    private static int getInterfaceDescriptor;
    private static final vzs onExtraCallbackWithResult;
    private onExtraCallback IAuthTabCallbackDefault;
    private onWarmupCompleted IAuthTabCallbackStub;
    private boolean asBinder;
    private final String asInterface;
    private tz onTransact;

    public enum onWarmupCompleted {
        noQuirks,
        quirks,
        limitedQuirks
    }

    @Override // o.qgr, o.qq
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        oq oqVarOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = getInterfaceDescriptor + 63;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return oqVarOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.qgr
    /* renamed from: onTransact */
    public /* synthetic */ qgr clone() {
        int i = 2 % 2;
        int i2 = access000 + 5;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.qgr, o.qq
    /* renamed from: onWarmupCompleted */
    public /* synthetic */ qq clone() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public oq(String str) {
        super(sl.onExtraCallback("#root", sjd.onNavigationEvent), str);
        this.IAuthTabCallbackDefault = new onExtraCallback();
        this.IAuthTabCallbackStub = onWarmupCompleted.noQuirks;
        this.asBinder = false;
        this.asInterface = str;
        this.onTransact = tz.IAuthTabCallback();
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback_Parcel;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 37;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = $10 + 55;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 72 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.red(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i9++;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i12 = $11 + Imgproc.COLOR_YUV2RGBA_YVYU;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IAuthTabCallback_Parcel;
        if (iArr6 != null) {
            int i14 = $10 + 57;
            int i15 = i14 % 128;
            $11 = i15;
            if (i14 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i16 = i15 + 55;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 5 % 3;
            }
            int i18 = 0;
            while (i18 < length) {
                int i19 = $10 + 123;
                $11 = i19 % 128;
                int i20 = i19 % i3;
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr6[i18]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 71, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i18] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i18++;
                i3 = 2;
                i6 = 0;
            }
            i2 = i6;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i21 = $10 + 55;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            for (int i23 = 0; i23 < 16; i23++) {
                int i24 = $11 + 115;
                $10 = i24 % 128;
                int i25 = i24 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i23];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 22252), 39 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.resolveSize(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i26 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i26;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i27 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i28 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4033), 78 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), Color.blue(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        access100();
        Object[] objArr = new Object[1];
        a(new int[]{1865315726, -1772959303, 770549914, -378425724}, (-16777211) - Color.rgb(0, 0, 0), objArr);
        onExtraCallbackWithResult = new vzs.newSessionWithExtras(((String) objArr[0]).intern());
        int i = IAuthTabCallbackStubProxy + 59;
        access100 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.qq
    public String asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 15;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onActivityLayout();
        }
        super.onActivityLayout();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.qgr, o.qq
    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return "#document";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public oq onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            oq oqVar = (oq) super.clone();
            oqVar.IAuthTabCallbackDefault = this.IAuthTabCallbackDefault.clone();
            return oqVar;
        }
        ((oq) super.clone()).IAuthTabCallbackDefault = this.IAuthTabCallbackDefault.clone();
        throw null;
    }

    public static class onExtraCallback implements Cloneable {

        @Nullable
        pvm.IAuthTabCallback onNavigationEvent;
        private pvm.onExtraCallbackWithResult onWarmupCompleted = pvm.onExtraCallbackWithResult.base;
        private Charset onExtraCallbackWithResult = nf.IAuthTabCallback;
        private final ThreadLocal<CharsetEncoder> onExtraCallback = new ThreadLocal<>();
        private boolean asBinder = true;
        private boolean asInterface = false;
        private int IAuthTabCallback = 1;
        private IAuthTabCallback IAuthTabCallbackStub = IAuthTabCallback.html;

        public enum IAuthTabCallback {
            html,
            xml
        }

        public pvm.onExtraCallbackWithResult onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public onExtraCallback onExtraCallback(Charset charset) {
            this.onExtraCallbackWithResult = charset;
            return this;
        }

        public onExtraCallback onExtraCallback(String str) {
            onExtraCallback(Charset.forName(str));
            return this;
        }

        /* JADX WARN: Failed to analyze thrown exceptions
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
         */
        CharsetEncoder asBinder() {
            CharsetEncoder charsetEncoderNewEncoder = this.onExtraCallbackWithResult.newEncoder();
            this.onExtraCallback.set(charsetEncoderNewEncoder);
            this.onNavigationEvent = pvm.IAuthTabCallback.byName(charsetEncoderNewEncoder.charset().name());
            return charsetEncoderNewEncoder;
        }

        CharsetEncoder onExtraCallbackWithResult() {
            CharsetEncoder charsetEncoder = this.onExtraCallback.get();
            return charsetEncoder != null ? charsetEncoder : asBinder();
        }

        public IAuthTabCallback IAuthTabCallbackDefault() {
            return this.IAuthTabCallbackStub;
        }

        public boolean onTransact() {
            return this.asBinder;
        }

        public boolean IAuthTabCallback() {
            return this.asInterface;
        }

        public int onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public onExtraCallback clone() {
            try {
                onExtraCallback onextracallback = (onExtraCallback) super.clone();
                onextracallback.onExtraCallback(this.onExtraCallbackWithResult.name());
                onextracallback.onWarmupCompleted = pvm.onExtraCallbackWithResult.valueOf(this.onWarmupCompleted.name());
                return onextracallback;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public onExtraCallback IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onExtraCallback onextracallback = this.IAuthTabCallbackDefault;
        int i4 = i2 + 83;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return onextracallback;
    }

    public onWarmupCompleted IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 65;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        onWarmupCompleted onwarmupcompleted = this.IAuthTabCallbackStub;
        int i4 = i2 + 21;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    public oq onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 115;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = onwarmupcompleted;
        int i5 = i2 + 31;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public tz IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        tz tzVar = this.onTransact;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return tzVar;
    }

    public oq onExtraCallback(tz tzVar) {
        int i = 2 % 2;
        int i2 = access000 + 49;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.onTransact = tzVar;
        if (i4 != 0) {
            int i5 = 51 / 0;
        }
        int i6 = i3 + 119;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    static void access100() {
        IAuthTabCallback_Parcel = new int[]{-597109277, 1402946565, 272737910, 1136303303, 978470047, -1810670945, 1915684565, 1822450810, -533941548, 1442922648, 593202318, 1572621365, -2049987298, 1693326384, 451950251, 1335202124, -1660384576, 1080060771};
    }
}
