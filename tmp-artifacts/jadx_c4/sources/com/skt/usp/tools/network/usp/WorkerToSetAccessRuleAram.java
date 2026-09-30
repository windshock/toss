package com.skt.usp.tools.network.usp;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.skt.usp.tools.common.APIResultCode;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.common.USPProcException;
import com.skt.usp.tools.dao.protocol.usp.AbstractUspResponse;
import com.skt.usp.tools.dao.protocol.usp.HeaderOfUsp;
import com.skt.usp.tools.dao.protocol.usp.usim.IPushApplet;
import com.skt.usp.tools.network.AbstractWorker;
import com.skt.usp.tools.network.Network;
import com.skt.usp.utils.Telephone;
import com.skt.usp.utils.UCPLog;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class WorkerToSetAccessRuleAram extends AbstractWorker {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted = {27163, 27277, 27289, 27264, 27391, 27364, 27275, 27293, 27285, 27287, 27260, 27178, 27160, 27142, 27156, 27171, 27198, 27197, 27192, 27191, 27191, 27191, 27181, 27139};
    private APITypeCode a;
    private Context b;
    private String c;
    private String d;
    private Boolean e;

    public WorkerToSetAccessRuleAram(Context context, String str, AbstractWorker.OnWorkerListener onWorkerListener, Boolean bool) {
        super(context, str, onWorkerListener);
        this.a = APITypeCode.MGR_PUSH_APPLET_SET_ACCESS_RULE_ARAM;
        this.d = null;
        this.b = context;
        this.c = str;
        this.e = bool;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractWorker.OnWorkerListener onWorkerListener;
        Gson gson;
        String serverMessage;
        int i = 2 % 2;
        UCPLog.info(">> setAccessRuleAram");
        APIResultCode aPIResultCode = APIResultCode.SUCCESS;
        String simSerialNumber = Telephone.getSimSerialNumber(this.b);
        try {
            try {
                UCPLog.debug("++ iccid : [%s]", this.m_strICCID);
                UCPLog.debug("++ pkgName : [%s]", this.m_strPkgName);
                UCPLog.debug("++ compId : [%s]", "MGR_PUSH_APPLET");
                gson = new Gson();
                IPushApplet.Request request = new IPushApplet.Request();
                IPushApplet.BodyOfIPushApplet bodyOfIPushApplet = new IPushApplet.BodyOfIPushApplet();
                bodyOfIPushApplet.setIccid(simSerialNumber);
                bodyOfIPushApplet.setBoot_time(a());
                request.setBody(bodyOfIPushApplet);
                request.setUspHeader(this.b, this.m_strPkgName, "MGR_PUSH_APPLET");
                serverMessage = Network.getServerMessage(request.generateUrl(), gson.toJson(request));
                UCPLog.debug("++ jsonOfResponse : [%s]", serverMessage);
            } catch (USPProcException e) {
                UCPLog.error(e.getMessage());
                APIResultCode aPIResultCode2 = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                aPIResultCode2.setMessage(e.getErrorMsg());
                String errorCode = e.getErrorCode();
                AbstractWorker.OnWorkerListener onWorkerListener2 = this.m_onListener;
                if (onWorkerListener2 != null) {
                    int i2 = onExtraCallbackWithResult + 109;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        onWorkerListener2.onTerminateFromWorker(this.a, aPIResultCode2, errorCode);
                        return;
                    } else {
                        onWorkerListener2.onTerminateFromWorker(this.a, aPIResultCode2, errorCode);
                        int i3 = 59 / 0;
                        return;
                    }
                }
                return;
            } catch (Exception e2) {
                UCPLog.error(e2.getMessage());
                aPIResultCode = APIResultCode.ERROR_USP_INTERACTION_FAIL;
                onWorkerListener = this.m_onListener;
                if (onWorkerListener == null) {
                    return;
                }
            }
            if (serverMessage.contains("server connection error")) {
                throw new USPProcException(serverMessage);
            }
            int i4 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i4 % 128;
            IPushApplet.Response response = null;
            try {
            } catch (Exception e3) {
                UCPLog.error(e3.getMessage());
            }
            if (i4 % 2 == 0) {
                throw null;
            }
            response = (IPushApplet.Response) gson.fromJson(serverMessage, IPushApplet.Response.class);
            a(response);
            if (response.getBody() == null) {
                throw new USPProcException("body is empty");
            }
            int i5 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if ("Y".equalsIgnoreCase(response.getBody().getNeed_reboot())) {
                aPIResultCode = APIResultCode.SUCCESS_NEED_REBOOT;
            }
            onWorkerListener = this.m_onListener;
            if (onWorkerListener == null) {
                return;
            }
            onWorkerListener.onTerminateFromWorker(this.a, aPIResultCode, "999");
        } catch (Throwable th) {
            AbstractWorker.OnWorkerListener onWorkerListener3 = this.m_onListener;
            if (onWorkerListener3 != null) {
                onWorkerListener3.onTerminateFromWorker(this.a, aPIResultCode, "999");
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if ("000".equalsIgnoreCase(r4.getResultCode()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r4 = com.skt.usp.tools.network.usp.WorkerToSetAccessRuleAram.onNavigationEvent + 47;
        com.skt.usp.tools.network.usp.WorkerToSetAccessRuleAram.onExtraCallbackWithResult = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        throw new com.skt.usp.tools.common.USPProcException("header.result_code is not 000", r4.getResultCode(), r4.getResultMsg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if ("000".equalsIgnoreCase(r4.getResultCode()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(AbstractUspResponse abstractUspResponse) throws Exception {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> verifyResponse()");
        UCPLog.debug("++ response : [%s]", abstractUspResponse);
        if (abstractUspResponse == null) {
            throw new USPProcException("response is empty");
        }
        int i4 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        HeaderOfUsp header = abstractUspResponse.getHeader();
        if (header == null) {
            throw new USPProcException("response header is empty");
        }
        int i6 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
    }

    private String a() throws Throwable {
        int i = 2 % 2;
        UCPLog.info(">> bootTime()");
        Object[] objArr = new Object[1];
        f(new int[]{0, 10, 105, 0}, false, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, objArr);
        TimeZone timeZone = DesugarTimeZone.getTimeZone(((String) objArr[0]).intern());
        Locale locale = Locale.KOREA;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS", locale);
        Object[] objArr2 = new Object[1];
        f(new int[]{10, 14, 0, 8}, false, new byte[]{0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, objArr2);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(((String) objArr2[0]).intern(), locale);
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat2.setTimeZone(timeZone);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        String str = simpleDateFormat.format(Long.valueOf(gregorianCalendar.getTimeInMillis()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long time = simpleDateFormat.parse(str).getTime();
        UCPLog.debug("++ bootTime : now [%s]", str);
        gregorianCalendar.setTimeInMillis(time - jElapsedRealtime);
        String str2 = simpleDateFormat2.format(gregorianCalendar.getTime());
        UCPLog.debug("++ bootTime : retBootTime [%s]", str2);
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return str2;
    }

    private static void f(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int i8 = $10 + 19;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 35, 14239 - View.resolveSizeAndState(0, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i9 = $11 + 103;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i11 = $10 + 35;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - MotionEvent.axisFromString("")), 65 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 16717 - TextUtils.lastIndexOf("", '0', 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), TextUtils.getCapsMode("", 0, 0) + 29, 17656 - MotionEvent.axisFromString(""), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.blue(0)), 70 - View.combineMeasuredStates(0, 0), 12486 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i15 = $10 + 1;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i17 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i17, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i17);
        }
        if (z) {
            int i18 = $10 + 103;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i20 = $11 + 109;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 >>> trackGroupExternalSyntheticLambda0.onNavigationEvent) >> 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                int i21 = $10 + 19;
                $11 = i21 % 128;
                int i22 = i21 % 2;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
