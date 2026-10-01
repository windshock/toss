package com.skp.smarttouch.sem.tools.network.usp;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.Gson;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.common.STUspProcException;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspResponse;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IPushApplet;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import com.skp.smarttouch.sem.tools.network.Network;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.xkzzb;
import o.zb2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class WorkerToSetAccessRuleAram extends AbstractWorker {
    private APITypeCode a;
    private Context b;
    private String c;
    private String d;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted = 478308988;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        byte[] bArr = $$a;
        int i4 = i2 + 4;
        int i5 = (s * 4) + 105;
        int i6 = (i * 4) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i5 = i6;
            i5 += i7;
            i4++;
            bArr2[i3] = (byte) i5;
            i3++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i5 += i7;
            i4++;
            bArr2[i3] = (byte) i5;
            i3++;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            i4++;
            bArr2[i3] = (byte) i5;
            i3++;
            if (i3 == i6) {
            }
        }
    }

    public WorkerToSetAccessRuleAram(Context context, String str, AbstractWorker.OnWorkerListener onWorkerListener) {
        super(context, str, onWorkerListener);
        this.a = APITypeCode.MGR_PUSH_APPLET_SET_ACCESS_RULE_ARAM;
        this.d = null;
        this.b = context;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        r1 = r9.a;
        r3 = java.lang.Boolean.FALSE;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        AbstractWorker.OnWorkerListener onWorkerListener;
        Object obj;
        IPushApplet.Response response;
        int i = 2 % 2;
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        String strOnExtraCallback = zb2.onExtraCallback(this.b);
        try {
            try {
                try {
                    xkzzb.onExtraCallback(new Object[]{">> setAccessRuleAram"});
                    xkzzb.onExtraCallback(new Object[]{"++ iccid : [%s]", this.m_strICCID});
                    xkzzb.onExtraCallback(new Object[]{"++ pkgName : [%s]", this.m_strPkgName});
                    xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", "MGR_PUSH_APPLET"});
                    Gson gson = new Gson();
                    IPushApplet.Request request = new IPushApplet.Request();
                    IPushApplet.BodyOfIPushApplet bodyOfIPushApplet = new IPushApplet.BodyOfIPushApplet();
                    bodyOfIPushApplet.setIccid(strOnExtraCallback);
                    bodyOfIPushApplet.setBoot_time(a());
                    request.setBody(bodyOfIPushApplet);
                    request.setUspHeader(this.b, this.m_strPkgName, "MGR_PUSH_APPLET");
                    String serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
                    xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
                    obj = null;
                    try {
                        response = (IPushApplet.Response) gson.fromJson(serverMessage, IPushApplet.Response.class);
                    } catch (Exception e) {
                        xkzzb.onNavigationEvent(e);
                        response = null;
                    }
                    a(response);
                } catch (Exception e2) {
                    xkzzb.onNavigationEvent(e2);
                    aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                    aPIResultCode.setMessage(e2.getMessage());
                    onWorkerListener = this.m_onListener;
                }
            } catch (STUspProcException e3) {
                xkzzb.onNavigationEvent(e3);
                aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                aPIResultCode.setMessage(e3.getErrorCode());
                onWorkerListener = this.m_onListener;
            }
            if (response.getBody() == null) {
                throw new STUspProcException("***** body is empty");
            }
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                "Y".equalsIgnoreCase(response.getBody().getNeed_reboot());
                obj.hashCode();
                throw null;
            }
            if ("Y".equalsIgnoreCase(response.getBody().getNeed_reboot())) {
                aPIResultCode = APIResultCode.SUCCESS_NEED_REBOOT;
            }
            onWorkerListener = this.m_onListener;
            if (onWorkerListener != null) {
                int i3 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                APITypeCode aPITypeCode = this.a;
                Boolean bool = Boolean.TRUE;
                onWorkerListener.onTerminateFromWorker(aPITypeCode, aPIResultCode, bool);
                return;
            }
            int i5 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            AbstractWorker.OnWorkerListener onWorkerListener2 = this.m_onListener;
            if (onWorkerListener2 != null) {
                onWorkerListener2.onTerminateFromWorker(this.a, aPIResultCode, Boolean.TRUE);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 35126), 22 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf("", "", 0, 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12844), (ViewConfiguration.getJumpTapTimeout() >> 16) + 55, (Process.myPid() >> 22) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 12844), 55 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 2168, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i9 = $11 + 75;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i10 = 48 / 0;
            objArr[0] = str;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STUspProcException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if ("000".equalsIgnoreCase(r7.getResultCode()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r7 = com.skp.smarttouch.sem.tools.network.usp.WorkerToSetAccessRuleAram.IAuthTabCallback + 117;
        com.skp.smarttouch.sem.tools.network.usp.WorkerToSetAccessRuleAram.onExtraCallbackWithResult = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        throw new com.skp.smarttouch.sem.tools.common.STUspProcException("***** header.result_code is not '000'", r7.getResultCode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        throw new com.skp.smarttouch.sem.tools.common.STUspProcException("***** response header is empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        throw new com.skp.smarttouch.sem.tools.common.STUspProcException("***** response is empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r7 = r7.getHeader();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(AbstractUspResponse abstractUspResponse) throws Exception {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = ">> verifyResponse()";
            xkzzb.onExtraCallback(objArr);
            Object[] objArr2 = new Object[4];
            objArr2[1] = "++ response : [%s]";
            objArr2[0] = abstractUspResponse;
            xkzzb.onExtraCallback(objArr2);
        } else {
            xkzzb.onExtraCallback(new Object[]{">> verifyResponse()"});
            xkzzb.onExtraCallback(new Object[]{"++ response : [%s]", abstractUspResponse});
        }
    }

    private String a() throws Throwable {
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> bootTime()"});
        Object[] objArr = new Object[1];
        e(TextUtils.indexOf("", "", 0) + 10, 6 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{65489, 3, 11, 21, 65507, 14, 23, 17, 7, 65525}, true, 179 - View.resolveSize(0, 0), objArr);
        TimeZone timeZone = DesugarTimeZone.getTimeZone(((String) objArr[0]).intern());
        Locale locale = Locale.KOREA;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS", locale);
        Object[] objArr2 = new Object[1];
        e((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14, 1 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{19, 19, '\r', '\r', 7, 7, 65506, 65506, 65534, 65534, 65511, 65511, 19, 19}, true, (ViewConfiguration.getTapTimeout() >> 16) + 187, objArr2);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(((String) objArr2[0]).intern(), locale);
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat2.setTimeZone(timeZone);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        String str = simpleDateFormat.format(Long.valueOf(gregorianCalendar.getTimeInMillis()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long time = simpleDateFormat.parse(str).getTime();
        xkzzb.onExtraCallback(new Object[]{"++ bootTime : now [%s]", str});
        gregorianCalendar.setTimeInMillis(time - jElapsedRealtime);
        String str2 = simpleDateFormat2.format(gregorianCalendar.getTime());
        xkzzb.onExtraCallback(new Object[]{"++ bootTime : retBootTime [%s]", str2});
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }
}
