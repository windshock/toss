package o;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.dw;
import o.hz;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class fiz {
    private static short[] asBinder;
    protected dw.onExtraCallback onExtraCallback = null;
    protected hz.onWarmupCompleted onWarmupCompleted = null;
    private static final byte[] $$a = {66, 42, 112, 97};
    private static final int $$b = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = -537248297;
    private static int IAuthTabCallback = -1538795515;
    private static int onExtraCallbackWithResult = -251108006;
    private static byte[] IAuthTabCallbackDefault = {7, -10, 8};

    public enum onExtraCallbackWithResult {
        MATCHED,
        NOT_MATCHED
    }

    public enum onWarmupCompleted {
        NONE,
        ONEWAY,
        TWOWAY
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i * 4;
        int i4 = (b * 2) + 4;
        int i5 = (s * 3) + 115;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i5 += i7;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i2++;
            i5 += i7;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public abstract List<hz> IAuthTabCallback(String str, boolean z);

    public abstract List<hz> onExtraCallback(ByteBuffer byteBuffer, boolean z);

    public abstract onExtraCallbackWithResult onExtraCallbackWithResult(kdr kdrVar) throws ghr;

    public abstract fiz onExtraCallbackWithResult();

    public abstract onWarmupCompleted onNavigationEvent();

    public abstract ksy onNavigationEvent(ksy ksyVar) throws ghr;

    public abstract lbb onNavigationEvent(kdr kdrVar, lw lwVar) throws ghr;

    public abstract void onNavigationEvent(fh fhVar, hz hzVar) throws gjv;

    public abstract ByteBuffer onWarmupCompleted(hz hzVar);

    public abstract List<hz> onWarmupCompleted(ByteBuffer byteBuffer) throws gjv;

    public abstract onExtraCallbackWithResult onWarmupCompleted(kdr kdrVar, ln lnVar) throws ghr;

    public abstract void onWarmupCompleted();

    public static ByteBuffer onExtraCallback(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate;
        byte b;
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            b = 116;
        } else {
            byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            b = 48;
        }
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            byteBufferAllocate.put(b2);
            if (b == 13 && b2 == 10) {
                int i3 = asInterface + 43;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                    byteBufferAllocate.position(1);
                    return byteBufferAllocate;
                }
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                return byteBufferAllocate;
            }
            int i4 = asInterface + 11;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
        return null;
    }

    public static String onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ByteBuffer byteBufferOnExtraCallback = onExtraCallback(byteBuffer);
        if (byteBufferOnExtraCallback == null) {
            return null;
        }
        String strOnExtraCallback = mtm.onExtraCallback(byteBufferOnExtraCallback.array(), 0, byteBufferOnExtraCallback.limit());
        int i4 = asInterface + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r3.length != 3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r4 = o.fiz.IAuthTabCallbackStub + 11;
        o.fiz.asInterface = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if ((r4 % 2) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r17 != o.dw.onExtraCallback.CLIENT) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if ("101".equals(r3[1]) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if ("HTTP/1.1".equalsIgnoreCase(r3[0]) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r1 = new o.kyd();
        r1.onWarmupCompleted(java.lang.Short.parseShort(r3[1]));
        r1.IAuthTabCallback(r3[2]);
        r3 = o.fiz.IAuthTabCallbackStub + 103;
        o.fiz.asInterface = r3 % 128;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if ((r3 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        r3 = 3 / 2;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        throw new o.ghr("Invalid status line received: " + r3[0] + " Status line: " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        throw new o.ghr("Invalid status code received: " + r3[1] + " Status line: " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        r4 = new java.lang.Object[1];
        a((short) android.graphics.Color.argb(0, 0, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) - 1), (-2076042719) - (android.os.Process.myPid() >> 22), android.graphics.Color.argb(0, 0, 0, 0) - 1431289099, (-10) - android.text.TextUtils.indexOf(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET, okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET, 0, 0), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        if (((java.lang.String) r4[0]).intern().equalsIgnoreCase(r3[0]) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f1, code lost:
    
        r4 = o.fiz.IAuthTabCallbackStub + 49;
        o.fiz.asInterface = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        if ((r4 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0103, code lost:
    
        if ("HTTP/1.1".equalsIgnoreCase(r3[4]) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010c, code lost:
    
        if ("HTTP/1.1".equalsIgnoreCase(r3[2]) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010e, code lost:
    
        r1 = new o.ko();
        r1.onNavigationEvent(r3[1]);
        r3 = o.fiz.IAuthTabCallbackStub + 41;
        o.fiz.asInterface = r3 % 128;
        r3 = r3 % 2;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0121, code lost:
    
        r3 = onExtraCallbackWithResult(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0125, code lost:
    
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012b, code lost:
    
        if (r3.length() <= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012d, code lost:
    
        r4 = o.fiz.IAuthTabCallbackStub + 79;
        o.fiz.asInterface = r4 % 128;
        r4 = r4 % 2;
        r3 = r3.split(":", 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013d, code lost:
    
        if (r3.length != 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0147, code lost:
    
        if (r1.onWarmupCompleted(r3[0]) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0149, code lost:
    
        r1.onExtraCallback(r3[0], r1.onExtraCallback(r3[0]) + "; " + r3[1].replaceFirst("^ +", okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016f, code lost:
    
        r1.onExtraCallback(r3[0], r3[1].replaceFirst("^ +", okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017a, code lost:
    
        r3 = onExtraCallbackWithResult(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0186, code lost:
    
        throw new o.ghr("not an http header");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0187, code lost:
    
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0189, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018f, code lost:
    
        throw new o.gjd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ac, code lost:
    
        throw new o.ghr("Invalid status line received: " + r3[2] + " Status line: " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01cb, code lost:
    
        throw new o.ghr("Invalid request method received: " + r3[0] + " Status line: " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cc, code lost:
    
        r0 = o.dw.onExtraCallback.CLIENT;
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d8, code lost:
    
        throw new o.ghr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e4, code lost:
    
        throw new o.gjd(r16.capacity() + 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r3 = r1.split(" ", 3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [o.kyd, o.lw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lbb onWarmupCompleted(ByteBuffer byteBuffer, dw.onExtraCallback onextracallback) throws Throwable {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            strOnExtraCallbackWithResult = onExtraCallbackWithResult(byteBuffer);
            int i3 = 99 / 0;
        } else {
            strOnExtraCallbackWithResult = onExtraCallbackWithResult(byteBuffer);
        }
    }

    protected boolean onNavigationEvent(kfb kfbVar) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            kfbVar.onExtraCallback("Upgrade").equalsIgnoreCase("websocket");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (kfbVar.onExtraCallback("Upgrade").equalsIgnoreCase("websocket")) {
            int i3 = asInterface + 109;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            if (kfbVar.onExtraCallback("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
                int i5 = asInterface + 91;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        int i7 = IAuthTabCallbackStub + 37;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public List<hz> onExtraCallbackWithResult(hz.onWarmupCompleted onwarmupcompleted, ByteBuffer byteBuffer, boolean z) {
        jxj hhVar;
        int i = 2 % 2;
        hz.onWarmupCompleted onwarmupcompleted2 = hz.onWarmupCompleted.BINARY;
        Object obj = null;
        if (onwarmupcompleted != onwarmupcompleted2) {
            int i2 = asInterface + 125;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                hz.onWarmupCompleted onwarmupcompleted3 = hz.onWarmupCompleted.TEXT;
                obj.hashCode();
                throw null;
            }
            if (onwarmupcompleted != hz.onWarmupCompleted.TEXT) {
                throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
            }
        }
        if (this.onWarmupCompleted != null) {
            hhVar = new Cif();
            int i3 = IAuthTabCallbackStub + 7;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } else {
            this.onWarmupCompleted = onwarmupcompleted;
            hhVar = onwarmupcompleted == onwarmupcompleted2 ? new hh() : onwarmupcompleted == hz.onWarmupCompleted.TEXT ? new jl() : null;
        }
        hhVar.onWarmupCompleted(byteBuffer);
        hhVar.IAuthTabCallback(z);
        try {
            hhVar.onExtraCallback();
            if (z) {
                int i5 = IAuthTabCallbackStub + 123;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    this.onWarmupCompleted = null;
                    int i6 = 8 / 0;
                } else {
                    this.onWarmupCompleted = null;
                }
            } else {
                this.onWarmupCompleted = onwarmupcompleted;
            }
            return Collections.singletonList(hhVar);
        } catch (gjv e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<ByteBuffer> onWarmupCompleted(kfb kfbVar, dw.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List<ByteBuffer> listOnWarmupCompleted = onWarmupCompleted(kfbVar, onextracallback, true);
        int i4 = asInterface + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<ByteBuffer> onWarmupCompleted(kfb kfbVar, dw.onExtraCallback onextracallback, boolean z) {
        int length;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(100);
        byte[] bArrOnWarmupCompleted = null;
        if (kfbVar instanceof kdr) {
            int i2 = IAuthTabCallbackStub + 15;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                sb.append("GET ");
                sb.append(((kdr) kfbVar).onNavigationEvent());
                sb.append(" HTTP/1.1");
                throw null;
            }
            sb.append("GET ");
            sb.append(((kdr) kfbVar).onNavigationEvent());
            sb.append(" HTTP/1.1");
        } else {
            if (!(kfbVar instanceof ln)) {
                throw new IllegalArgumentException("unknown role");
            }
            sb.append("HTTP/1.1 101 ");
            sb.append(((ln) kfbVar).IAuthTabCallback());
        }
        sb.append("\r\n");
        Iterator<String> itOnExtraCallbackWithResult = kfbVar.onExtraCallbackWithResult();
        while (!(!itOnExtraCallbackWithResult.hasNext())) {
            int i3 = asInterface + 23;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            String next = itOnExtraCallbackWithResult.next();
            String strOnExtraCallback = kfbVar.onExtraCallback(next);
            sb.append(next);
            sb.append(": ");
            sb.append(strOnExtraCallback);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] bArrOnExtraCallback = mtm.onExtraCallback(sb.toString());
        if (z) {
            int i5 = IAuthTabCallbackStub + 23;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            bArrOnWarmupCompleted = kfbVar.onWarmupCompleted();
        }
        if (bArrOnWarmupCompleted == null) {
            int i7 = IAuthTabCallbackStub + 43;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            length = 0;
        } else {
            length = bArrOnWarmupCompleted.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + bArrOnExtraCallback.length);
        byteBufferAllocate.put(bArrOnExtraCallback);
        if (bArrOnWarmupCompleted != null) {
            byteBufferAllocate.put(bArrOnWarmupCompleted);
        }
        byteBufferAllocate.flip();
        return Collections.singletonList(byteBufferAllocate);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01f9 A[PHI: r0
      0x01f9: PHI (r0v9 int) = (r0v8 int), (r0v44 int) binds: [B:48:0x01f7, B:45:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb A[PHI: r0
      0x01fb: PHI (r0v41 int) = (r0v8 int), (r0v44 int) binds: [B:48:0x01f7, B:45:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSize(0, 0)), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 22439 - Gravity.getAbsoluteGravity(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (!(!z2)) {
                byte[] bArr = IAuthTabCallbackDefault;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 7;
                        $10 = i9 % 128;
                        if (i9 % i6 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 12843), 54 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54, (ViewConfiguration.getPressedStateDuration() >> 16) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                        }
                        i8++;
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IAuthTabCallbackDefault;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 43424), 42 - ((Process.getThreadPriority(0) + 20) >> 6), Drawable.resolveOpacity(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (asBinder[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = $10 + 77;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    i4 = ((i >> iIntValue) << 4) << ((int) (onNavigationEvent % (-4629411779493505016L)));
                    i5 = z2 ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                    if (z2) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 86, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallbackDefault;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $11 + 97;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            bArr5[i11] = (byte) (bArr4[i11] % (-4629411779493505016L));
                        } else {
                            bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                            i11++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $10 + 73;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = asBinder;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = IAuthTabCallbackDefault;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public kfb onNavigationEvent(ByteBuffer byteBuffer) throws Throwable {
        lbb lbbVarOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            lbbVarOnWarmupCompleted = onWarmupCompleted(byteBuffer, this.onExtraCallback);
            int i3 = 62 / 0;
        } else {
            lbbVarOnWarmupCompleted = onWarmupCompleted(byteBuffer, this.onExtraCallback);
        }
        int i4 = IAuthTabCallbackStub + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return lbbVarOnWarmupCompleted;
    }

    public int IAuthTabCallback(int i) throws gjv {
        int i2 = 2 % 2;
        if (i < 0) {
            throw new gjv(1002, "Negative count");
        }
        int i3 = IAuthTabCallbackStub + 41;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 15;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    int onExtraCallbackWithResult(kfb kfbVar) {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            strOnExtraCallback = kfbVar.onExtraCallback("Sec-WebSocket-Version");
            int i3 = 21 / 0;
            if (strOnExtraCallback.length() <= 0) {
                return -1;
            }
        } else {
            strOnExtraCallback = kfbVar.onExtraCallback("Sec-WebSocket-Version");
            if (strOnExtraCallback.length() <= 0) {
                return -1;
            }
        }
        try {
            int iIntValue = new Integer(strOnExtraCallback.trim()).intValue();
            int i4 = IAuthTabCallbackStub + 73;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return iIntValue;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public void onWarmupCompleted(dw.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback = onextracallback;
        int i5 = i2 + 29;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String simpleName = getClass().getSimpleName();
        int i4 = asInterface + 1;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return simpleName;
    }
}
