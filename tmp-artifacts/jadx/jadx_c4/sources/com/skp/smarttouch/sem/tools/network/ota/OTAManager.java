package com.skp.smarttouch.sem.tools.network.ota;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.common.STIllegarSmartCardException;
import com.skp.smarttouch.sem.tools.common.STOtaProcException;
import com.skp.smarttouch.sem.tools.common.UspCodeEnum;
import com.skp.smarttouch.sem.tools.dao.ConfigDFParamData;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.BodyOfOta;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.DispData;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.HeaderOfOta;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.IOTAProtocol;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.IssueData;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.OTAWorkerData;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.OtaBody;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.OtaHeader;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.OtaResult;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.ParamData;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.Rpdu;
import com.skp.smarttouch.sem.tools.network.AbstractWorker;
import com.skp.smarttouch.sem.tools.network.Network;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.putStringSet;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class OTAManager {
    private static OTAManager g;
    private static Context h;
    private static int onExtraCallback;
    private static int onWarmupCompleted;
    private final String a = "000";
    private final String b = "000";
    private final String c = "999";
    private final String d;
    private final String e;
    private final String f;
    private AbstractWorker.OnWorkerListener i;
    private AbstractWorker.TidListener j;
    private APITypeCode k;
    private String l;
    private static final byte[] $$a = {114, 69, -115, -114};
    private static final int $$b = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        int i3 = s * 3;
        int i4 = 105 - (s2 * 4);
        int i5 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i2 = 0;
            int i9 = i7;
            i4 = i5 + i8;
            i5 = i9;
            int i10 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i8 = bArr[i10];
            int i11 = i4;
            i7 = i10;
            i5 = i11;
            int i92 = i7;
            i4 = i5 + i8;
            i5 = i92;
            int i102 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    static {
        onExtraCallback = 1;
        onNavigationEvent();
        int i = IAuthTabCallback + 99;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private OTAManager() throws Throwable {
        Object[] objArr = new Object[1];
        m(-Process.getGidForName(""), 1 - View.combineMeasuredStates(0, 0), new char[]{0}, true, 140 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        this.d = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        m((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 1, new char[]{0}, false, TextUtils.getOffsetAfter("", 0) + 139, objArr2);
        this.e = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        m(-TextUtils.indexOf((CharSequence) "", '0', 0), (KeyEvent.getMaxKeyCode() >> 16) + 1, new char[]{0}, true, 140 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
        this.f = ((String) objArr3[0]).intern();
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = "N";
        xkzzb.onExtraCallback(new Object[]{">> OTAManager()"});
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OTAManager getInstance(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            objArr[1] = ">> getInstance()";
            xkzzb.onExtraCallback(objArr);
            Object[] objArr2 = new Object[3];
            objArr2[1] = "++ context : [%s]";
            objArr2[1] = context;
            xkzzb.onExtraCallback(objArr2);
            h = context;
            if (g == null) {
                g = new OTAManager();
                int i3 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            xkzzb.onExtraCallback(new Object[]{">> getInstance()"});
            xkzzb.onExtraCallback(new Object[]{"++ context : [%s]", context});
            h = context;
            if (g == null) {
            }
        }
        return g;
    }

    public void release() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> release()"});
        g = null;
        int i4 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setStagingYn(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> setStagingYn()"});
        xkzzb.onExtraCallback(new Object[]{"++ yn : [%s]", str});
        this.l = str;
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getStagingYn() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.l;
        }
        throw null;
    }

    private static void m(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        Object obj;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = -1;
            i5 = 2083011369;
            obj = null;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 35124), 23 - View.combineMeasuredStates(0, 0), Process.getGidForName("") + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12842), 'g' - AndroidCharacter.getMirror('0'), 2167 - (ViewConfiguration.getPressedStateDuration() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 117;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i10 = $10 + 81;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i12 = $11 + 3;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    cArr4[i13] = cArr2[0];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) i4;
                            byte b4 = (byte) (b3 + 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - KeyEvent.getDeadChar(0, 0)), 54 - Process.getGidForName(""), TextUtils.indexOf("", "", 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(obj, objArr4);
                        i4 = -1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback4 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.getDefaultSize(0, 0) + 55, View.getDefaultSize(0, 0) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        i4 = -1;
                        obj = null;
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public void setOnWorkerListener(APITypeCode aPITypeCode, AbstractWorker.OnWorkerListener onWorkerListener, AbstractWorker.TidListener tidListener) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.k = aPITypeCode;
            this.i = onWorkerListener;
            this.j = tidListener;
        } else {
            this.k = aPITypeCode;
            this.i = onWorkerListener;
            this.j = tidListener;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public OtaResult requestIssueApplet(AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5) throws STOtaProcException {
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> requestIssueApplet()"});
        xkzzb.onExtraCallback(new Object[]{"++ smartCard : [%s]", abstractSmartcard});
        xkzzb.onExtraCallback(new Object[]{"++ stId : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ aid : [%s]", str4});
        xkzzb.onExtraCallback(new Object[]{"++ version : [%s]", str5});
        new OtaResult();
        OTAWorkerData oTAWorkerData = new OTAWorkerData();
        oTAWorkerData.setUspCode(UspCodeEnum.INSTALL);
        oTAWorkerData.setStId(str2);
        oTAWorkerData.setCompId(str3);
        oTAWorkerData.setInstanceAid(str4);
        oTAWorkerData.setAppletVersion(str5);
        oTAWorkerData.setIccid(str);
        OtaResult otaResultA = a(abstractSmartcard, oTAWorkerData);
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return otaResultA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public OtaResult requestDeleteApplet(AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5) throws STOtaProcException {
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> requestDeleteApplet()"});
        xkzzb.onExtraCallback(new Object[]{"++ smartCard : [%s]", abstractSmartcard});
        OTAWorkerData oTAWorkerData = new OTAWorkerData();
        oTAWorkerData.setUspCode(UspCodeEnum.DELETE);
        oTAWorkerData.setStId(str2);
        oTAWorkerData.setCompId(str3);
        oTAWorkerData.setInstanceAid(str4);
        oTAWorkerData.setAppletVersion(str5);
        oTAWorkerData.setIccid(str);
        OtaResult otaResultA = a(abstractSmartcard, oTAWorkerData);
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return otaResultA;
    }

    public OtaResult lockApplet(AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5) throws STOtaProcException {
        int i = 2 % 2;
        OTAWorkerData oTAWorkerData = new OTAWorkerData();
        oTAWorkerData.setUspCode(UspCodeEnum.LOCK);
        oTAWorkerData.setStId(str2);
        oTAWorkerData.setCompId(str3);
        oTAWorkerData.setInstanceAid(str4);
        oTAWorkerData.setAppletVersion(str5);
        oTAWorkerData.setIccid(str);
        OtaResult otaResultA = a(abstractSmartcard, oTAWorkerData);
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return otaResultA;
    }

    public OtaResult unLockApplet(AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5) throws STOtaProcException {
        int i = 2 % 2;
        OTAWorkerData oTAWorkerData = new OTAWorkerData();
        oTAWorkerData.setUspCode(UspCodeEnum.UNLOCK);
        oTAWorkerData.setStId(str2);
        oTAWorkerData.setCompId(str3);
        oTAWorkerData.setInstanceAid(str4);
        oTAWorkerData.setAppletVersion(str5);
        oTAWorkerData.setIccid(str);
        OtaResult otaResultA = a(abstractSmartcard, oTAWorkerData);
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return otaResultA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public OtaResult enableApplet(AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5) throws STOtaProcException {
        int i = 2 % 2;
        OTAWorkerData oTAWorkerData = new OTAWorkerData();
        oTAWorkerData.setUspCode(UspCodeEnum.ENABLE);
        oTAWorkerData.setStId(str2);
        oTAWorkerData.setCompId(str3);
        oTAWorkerData.setInstanceAid(str4);
        oTAWorkerData.setAppletVersion(str5);
        oTAWorkerData.setIccid(str);
        OtaResult otaResultA = a(abstractSmartcard, oTAWorkerData);
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return otaResultA;
    }

    public OtaResult blockingApplet(AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5) throws STOtaProcException {
        int i = 2 % 2;
        OTAWorkerData oTAWorkerData = new OTAWorkerData();
        oTAWorkerData.setUspCode(UspCodeEnum.BLOCKING);
        oTAWorkerData.setStId(str2);
        oTAWorkerData.setCompId(str3);
        oTAWorkerData.setInstanceAid(str4);
        oTAWorkerData.setAppletVersion(str5);
        oTAWorkerData.setIccid(str);
        OtaResult otaResultA = a(abstractSmartcard, oTAWorkerData);
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 56 / 0;
        }
        return otaResultA;
    }

    public OtaResult requestSetPpse(AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5) throws STOtaProcException {
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> requestSetPpse()"});
        xkzzb.onExtraCallback(new Object[]{"++ smartCard : [%s]", abstractSmartcard});
        xkzzb.onExtraCallback(new Object[]{"++ stId : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ aid : [%s]", str4});
        xkzzb.onExtraCallback(new Object[]{"++ version : [%s]", str5});
        new OtaResult();
        OTAWorkerData oTAWorkerData = new OTAWorkerData();
        oTAWorkerData.setUspCode(UspCodeEnum.SETPPSE);
        oTAWorkerData.setStId(str2);
        oTAWorkerData.setCompId(str3);
        oTAWorkerData.setInstanceAid(str4);
        oTAWorkerData.setAppletVersion(str5);
        oTAWorkerData.setIccid(str);
        OtaResult otaResultA = a(abstractSmartcard, oTAWorkerData);
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return otaResultA;
    }

    public OtaResult requestSetConfigDF(AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5, ConfigDFParamData configDFParamData) throws STOtaProcException {
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> requestSetConfigDF()"});
        xkzzb.onExtraCallback(new Object[]{"++ smartCard : [%s]", abstractSmartcard});
        xkzzb.onExtraCallback(new Object[]{"++ stId : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ compId : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ aid : [%s]", str4});
        xkzzb.onExtraCallback(new Object[]{"++ version : [%s]", str5});
        new OtaResult();
        OTAWorkerData oTAWorkerData = new OTAWorkerData();
        oTAWorkerData.setUspCode(UspCodeEnum.SETCONFIGDF);
        oTAWorkerData.setStId(str2);
        oTAWorkerData.setCompId(str3);
        oTAWorkerData.setInstanceAid(str4);
        oTAWorkerData.setAppletVersion(str5);
        oTAWorkerData.setIccid(str);
        ParamData paramData = new ParamData();
        paramData.setCardSpec(configDFParamData.getCardSpec());
        paramData.setSItem(configDFParamData.getSItem());
        paramData.setIDCenter(configDFParamData.getIDCenter());
        paramData.setCommand(configDFParamData.getCommand());
        paramData.setADFAID(configDFParamData.getADFAID());
        paramData.setExtraInfo(configDFParamData.getExtraInfo());
        paramData.setCardType(configDFParamData.getCardType());
        paramData.setExpireDate(configDFParamData.getExpireDate());
        paramData.setCardSerial(configDFParamData.getCardSerial());
        paramData.setManageNumber(configDFParamData.getManageNumber());
        paramData.setPartnerInfo(configDFParamData.getPartnerInfo());
        oTAWorkerData.setParamData(paramData);
        OtaResult otaResultA = a(abstractSmartcard, oTAWorkerData);
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return otaResultA;
    }

    public OtaResult lockTrans(AbstractSmartcard abstractSmartcard, String str, String str2, String str3, String str4, String str5) throws STOtaProcException {
        int i = 2 % 2;
        OTAWorkerData oTAWorkerData = new OTAWorkerData();
        oTAWorkerData.setUspCode(UspCodeEnum.LOCKTRANS);
        oTAWorkerData.setStId(str2);
        oTAWorkerData.setCompId(str3);
        oTAWorkerData.setInstanceAid(str4);
        oTAWorkerData.setAppletVersion(str5);
        oTAWorkerData.setIccid(str);
        OtaResult otaResultA = a(abstractSmartcard, oTAWorkerData);
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return otaResultA;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x032d, code lost:
    
        o.xkzzb.onExtraCallback(new java.lang.Object[]{"##############################################################################"});
        o.xkzzb.onExtraCallback(new java.lang.Object[]{"## 완료 ==> next_url is empty [%s]", java.lang.Integer.valueOf(r3)});
        o.xkzzb.onExtraCallback(new java.lang.Object[]{"##############################################################################"});
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x034d, code lost:
    
        a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0350, code lost:
    
        r28.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0353, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0354, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f2 A[Catch: all -> 0x038e, TRY_LEAVE, TryCatch #7 {all -> 0x038e, blocks: (B:5:0x0037, B:6:0x0054, B:8:0x00ab, B:10:0x00b3, B:11:0x00d3, B:13:0x013b, B:22:0x0193, B:25:0x01a5, B:26:0x01bb, B:29:0x01cf, B:82:0x032d, B:83:0x034d, B:110:0x039c, B:112:0x03f2, B:32:0x01e5, B:35:0x01ee, B:39:0x0219, B:43:0x022b, B:45:0x0231, B:46:0x023a, B:49:0x024a, B:51:0x0252, B:53:0x0261, B:55:0x026c, B:54:0x0267, B:61:0x0281, B:63:0x0287, B:67:0x02a7, B:69:0x02c9, B:71:0x02de, B:58:0x027b, B:59:0x027e, B:95:0x0372, B:96:0x0379, B:117:0x042c, B:118:0x0433), top: B:136:0x0037, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private OtaResult a(AbstractSmartcard abstractSmartcard, OTAWorkerData oTAWorkerData) throws STOtaProcException {
        Gson gson;
        RequestBuilder requestBuilder;
        String str;
        Exception exc;
        int i;
        String str2;
        int i2;
        Exception exc2;
        String str3;
        ArrayList arrayList;
        AbstractSmartcard abstractSmartcard2 = abstractSmartcard;
        String str4 = "";
        int i3 = 2 % 2;
        xkzzb.onNavigationEvent(new Object[]{">> process()"});
        OtaResult otaResult = new OtaResult();
        if (abstractSmartcard2 == null) {
            throw new IllegalArgumentException("***** invaild smartcard");
        }
        RequestBuilder requestBuilder2 = new RequestBuilder(h);
        Gson gson2 = new Gson();
        UspCodeEnum uspCode = oTAWorkerData.getUspCode();
        String str5 = null;
        try {
            try {
                try {
                    xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                    xkzzb.onExtraCallback(new Object[]{"## Initialize[%s]", 0});
                    xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                    try {
                        String json = gson2.toJson(requestBuilder2.buildInitiate(Integer.toString(0), oTAWorkerData));
                        xkzzb.onExtraCallback(new Object[]{"++ jsonOfRequest : [%s]", json});
                        String serverMessage = Network.getServerMessage(a(oTAWorkerData.getUspCode()), json);
                        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage});
                        IOTAProtocol.Response response = (IOTAProtocol.Response) gson2.fromJson(serverMessage, IOTAProtocol.Response.class);
                        String tid = response.getBody().getTid();
                        this.j.setTidFromWorker(tid);
                        otaResult.setTid(tid);
                        oTAWorkerData.setTid(tid);
                        b(response);
                        a(response);
                        if (!UspCodeEnum.MEMBERSHIP_DELETE.equals(uspCode)) {
                            try {
                                if (UspCodeEnum.MEMBERSHIP_ISSUE.equals(uspCode)) {
                                    i2 = 1;
                                } else {
                                    xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                                    xkzzb.onExtraCallback(new Object[]{"## Authenticate[%s]", 1});
                                    xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                                    try {
                                        String json2 = gson2.toJson(requestBuilder2.buildAuthenticate(Integer.toString(1), oTAWorkerData));
                                        xkzzb.onExtraCallback(new Object[]{"++ jsonOfRequest : [%s]", json2});
                                        String serverMessage2 = Network.getServerMessage(a(oTAWorkerData.getUspCode()), json2);
                                        xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage2});
                                        IOTAProtocol.Response response2 = (IOTAProtocol.Response) gson2.fromJson(serverMessage2, IOTAProtocol.Response.class);
                                        b(response2);
                                        a(response2);
                                        String accessToken = response2.getBody().getOtaHeader().getAccessToken();
                                        xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                                        xkzzb.onExtraCallback(new Object[]{"## 최초 수행 [%s]", 2});
                                        xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                                        try {
                                            String json3 = gson2.toJson(requestBuilder2.buildNewRequest(Integer.toString(2), oTAWorkerData, accessToken));
                                            xkzzb.onExtraCallback(new Object[]{"++ jsonOfRequest : [%s]", json3});
                                            String serverMessage3 = Network.getServerMessage(a(oTAWorkerData.getUspCode()), json3);
                                            xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage3});
                                            response = (IOTAProtocol.Response) gson2.fromJson(serverMessage3, IOTAProtocol.Response.class);
                                            i2 = 3;
                                        } catch (Exception e) {
                                            exc = e;
                                            gson = gson2;
                                            requestBuilder = requestBuilder2;
                                            str = "";
                                            i = 3;
                                            str2 = str5;
                                            xkzzb.onNavigationEvent(exc);
                                            otaResult.setSuccess(false);
                                            String string = Integer.toString(i);
                                            String str6 = str;
                                            Object[] objArr = new Object[1];
                                            m((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 1 - TextUtils.getOffsetAfter(str6, 0), new char[]{65534, 5, 65534, 65531, 65534, 65535, 7}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 201, objArr);
                                            String json4 = gson.toJson(requestBuilder.buildEnd(string, "999", ((String) objArr[0]).intern(), null, oTAWorkerData));
                                            if (str2 != null) {
                                            }
                                            abstractSmartcard.disconnect();
                                            return otaResult;
                                        }
                                    } catch (Exception e2) {
                                        exc = e2;
                                        gson = gson2;
                                        requestBuilder = requestBuilder2;
                                        str = "";
                                        i = 2;
                                    }
                                }
                                try {
                                    if (abstractSmartcard.connect() < 0) {
                                        gson = gson2;
                                        requestBuilder = requestBuilder2;
                                        str = "";
                                        try {
                                            throw new STIllegarSmartCardException("***** smartcard connected fail!!");
                                        } catch (Exception e3) {
                                            e = e3;
                                            i = i2;
                                            exc = e;
                                            str2 = str5;
                                            xkzzb.onNavigationEvent(exc);
                                            otaResult.setSuccess(false);
                                            String string2 = Integer.toString(i);
                                            String str62 = str;
                                            Object[] objArr2 = new Object[1];
                                            m((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 1 - TextUtils.getOffsetAfter(str62, 0), new char[]{65534, 5, 65534, 65531, 65534, 65535, 7}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 201, objArr2);
                                            String json42 = gson.toJson(requestBuilder.buildEnd(string2, "999", ((String) objArr2[0]).intern(), null, oTAWorkerData));
                                            if (str2 != null) {
                                            }
                                            abstractSmartcard.disconnect();
                                            return otaResult;
                                        }
                                    }
                                    int i4 = onNavigationEvent + 105;
                                    onExtraCallbackWithResult = i4 % 128;
                                    int i5 = i4 % 2;
                                    String nextUrl = null;
                                    while (true) {
                                        try {
                                            b(response);
                                            a(response);
                                            BodyOfOta body = response.getBody();
                                            OtaHeader otaHeader = body.getOtaHeader();
                                            OtaBody otaBody = body.getOtaBody();
                                            nextUrl = otaHeader.getNextUrl();
                                            try {
                                                String msgType = otaHeader.getMsgType();
                                                if (nextUrl == null) {
                                                    gson = gson2;
                                                    requestBuilder = requestBuilder2;
                                                    str = str4;
                                                    str3 = nextUrl;
                                                    break;
                                                }
                                                Gson gson3 = gson2;
                                                int i6 = onNavigationEvent + 41;
                                                str = str4;
                                                onExtraCallbackWithResult = i6 % 128;
                                                int i7 = i6 % 2;
                                                try {
                                                    if (nextUrl.length() <= 0) {
                                                        int i8 = onNavigationEvent + 73;
                                                        onExtraCallbackWithResult = i8 % 128;
                                                        int i9 = i8 % 2;
                                                        str3 = nextUrl;
                                                        requestBuilder = requestBuilder2;
                                                        gson = gson3;
                                                        break;
                                                    }
                                                    if ("6".equals(msgType)) {
                                                        xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                                                        xkzzb.onExtraCallback(new Object[]{"## 완료 ==> MSG_TYPE_END [%s]", Integer.valueOf(i2)});
                                                        xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                                                        str3 = nextUrl;
                                                        requestBuilder = requestBuilder2;
                                                        gson = gson3;
                                                        break;
                                                    }
                                                    List<String> apduList = otaBody.getApduList();
                                                    if (apduList != null) {
                                                        int i10 = onExtraCallbackWithResult + 111;
                                                        onNavigationEvent = i10 % 128;
                                                        if (i10 % 2 != 0) {
                                                            apduList.size();
                                                            throw null;
                                                        }
                                                        try {
                                                            if (apduList.size() > 0) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                for (String str7 : apduList) {
                                                                    int i11 = onNavigationEvent + 1;
                                                                    onExtraCallbackWithResult = i11 % 128;
                                                                    int i12 = i11 % 2;
                                                                    if (str7 != null) {
                                                                        byte[] bArrTransmit = abstractSmartcard2.transmit(putStringSet.onNavigationEvent(str7));
                                                                        Rpdu rpdu = new Rpdu();
                                                                        if (bArrTransmit != null) {
                                                                            rpdu.setRespCode("000");
                                                                        } else {
                                                                            rpdu.setRespCode("999");
                                                                        }
                                                                        rpdu.setRpduString(putStringSet.onWarmupCompleted(bArrTransmit));
                                                                        arrayList2.add(rpdu);
                                                                    }
                                                                    abstractSmartcard2 = abstractSmartcard;
                                                                }
                                                                arrayList = arrayList2;
                                                            } else {
                                                                arrayList = null;
                                                            }
                                                            IssueData issueData = otaBody.getIssueData();
                                                            if (issueData != null) {
                                                                IssueData issueData2 = oTAWorkerData.getIssueData();
                                                                issueData2.setCsn(issueData.getCsn());
                                                                issueData2.setHrn(issueData.getHrn());
                                                                oTAWorkerData.setIssueData(issueData2);
                                                            }
                                                            xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                                                            xkzzb.onExtraCallback(new Object[]{"## 반복 수행[%s]", Integer.valueOf(i2)});
                                                            xkzzb.onExtraCallback(new Object[]{"##############################################################################"});
                                                            i = i2 + 1;
                                                            try {
                                                                str2 = nextUrl;
                                                                gson = gson3;
                                                                requestBuilder = requestBuilder2;
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                str2 = nextUrl;
                                                                requestBuilder = requestBuilder2;
                                                                gson = gson3;
                                                            }
                                                        } catch (Exception e5) {
                                                            i = i2;
                                                            str2 = nextUrl;
                                                            requestBuilder = requestBuilder2;
                                                            exc = e5;
                                                            gson = gson3;
                                                        }
                                                        try {
                                                            String json5 = gson.toJson(requestBuilder2.buildResponse(Integer.toString(i2), "000", "", arrayList, oTAWorkerData));
                                                            xkzzb.onExtraCallback(new Object[]{"++ jsonOfRequest : [%s]", json5});
                                                            String serverMessage4 = Network.getServerMessage(str2, json5);
                                                            xkzzb.onExtraCallback(new Object[]{"++ jsonOfResponse : [%s]", serverMessage4});
                                                            response = (IOTAProtocol.Response) gson.fromJson(serverMessage4, IOTAProtocol.Response.class);
                                                            gson2 = gson;
                                                            nextUrl = str2;
                                                            i2 = i;
                                                            requestBuilder2 = requestBuilder;
                                                            str4 = str;
                                                            abstractSmartcard2 = abstractSmartcard;
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            exc = e;
                                                            xkzzb.onNavigationEvent(exc);
                                                            otaResult.setSuccess(false);
                                                            String string22 = Integer.toString(i);
                                                            String str622 = str;
                                                            Object[] objArr22 = new Object[1];
                                                            m((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 1 - TextUtils.getOffsetAfter(str622, 0), new char[]{65534, 5, 65534, 65531, 65534, 65535, 7}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 201, objArr22);
                                                            String json422 = gson.toJson(requestBuilder.buildEnd(string22, "999", ((String) objArr22[0]).intern(), null, oTAWorkerData));
                                                            if (str2 != null) {
                                                            }
                                                            abstractSmartcard.disconnect();
                                                            return otaResult;
                                                        }
                                                    }
                                                } catch (Exception e7) {
                                                    Exception e8 = e7;
                                                    str3 = nextUrl;
                                                    requestBuilder = requestBuilder2;
                                                    gson = gson3;
                                                    exc2 = e8;
                                                    str5 = str3;
                                                    i = i2;
                                                    exc = exc2;
                                                    str2 = str5;
                                                    xkzzb.onNavigationEvent(exc);
                                                    otaResult.setSuccess(false);
                                                    String string222 = Integer.toString(i);
                                                    String str6222 = str;
                                                    Object[] objArr222 = new Object[1];
                                                    m((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 1 - TextUtils.getOffsetAfter(str6222, 0), new char[]{65534, 5, 65534, 65531, 65534, 65535, 7}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 201, objArr222);
                                                    String json4222 = gson.toJson(requestBuilder.buildEnd(string222, "999", ((String) objArr222[0]).intern(), null, oTAWorkerData));
                                                    if (str2 != null) {
                                                    }
                                                    abstractSmartcard.disconnect();
                                                    return otaResult;
                                                }
                                            } catch (Exception e9) {
                                                e = e9;
                                                gson = gson2;
                                                requestBuilder = requestBuilder2;
                                                str = str4;
                                                exc2 = e;
                                                str5 = nextUrl;
                                                i = i2;
                                                exc = exc2;
                                                str2 = str5;
                                                xkzzb.onNavigationEvent(exc);
                                                otaResult.setSuccess(false);
                                                String string2222 = Integer.toString(i);
                                                String str62222 = str;
                                                Object[] objArr2222 = new Object[1];
                                                m((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 1 - TextUtils.getOffsetAfter(str62222, 0), new char[]{65534, 5, 65534, 65531, 65534, 65535, 7}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 201, objArr2222);
                                                String json42222 = gson.toJson(requestBuilder.buildEnd(string2222, "999", ((String) objArr2222[0]).intern(), null, oTAWorkerData));
                                                if (str2 != null) {
                                                }
                                                abstractSmartcard.disconnect();
                                                return otaResult;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            gson = gson2;
                                            requestBuilder = requestBuilder2;
                                            str = str4;
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    gson = gson2;
                                    requestBuilder = requestBuilder2;
                                    str = "";
                                }
                            } catch (Exception e12) {
                                exc = e12;
                                gson = gson2;
                                requestBuilder = requestBuilder2;
                                str = "";
                                i = 1;
                                str2 = str5;
                                xkzzb.onNavigationEvent(exc);
                                otaResult.setSuccess(false);
                                String string22222 = Integer.toString(i);
                                String str622222 = str;
                                Object[] objArr22222 = new Object[1];
                                m((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 1 - TextUtils.getOffsetAfter(str622222, 0), new char[]{65534, 5, 65534, 65531, 65534, 65535, 7}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 201, objArr22222);
                                String json422222 = gson.toJson(requestBuilder.buildEnd(string22222, "999", ((String) objArr22222[0]).intern(), null, oTAWorkerData));
                                if (str2 != null) {
                                }
                                abstractSmartcard.disconnect();
                                return otaResult;
                            }
                        }
                    } catch (Exception e13) {
                        gson = gson2;
                        requestBuilder = requestBuilder2;
                        str = "";
                        exc = e13;
                    }
                } catch (Exception e14) {
                    gson = gson2;
                    requestBuilder = requestBuilder2;
                    str = "";
                    exc = e14;
                    i = 0;
                }
                xkzzb.onNavigationEvent(exc);
                otaResult.setSuccess(false);
                String string222222 = Integer.toString(i);
                String str6222222 = str;
                Object[] objArr222222 = new Object[1];
                m((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 1 - TextUtils.getOffsetAfter(str6222222, 0), new char[]{65534, 5, 65534, 65531, 65534, 65535, 7}, false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 201, objArr222222);
                String json4222222 = gson.toJson(requestBuilder.buildEnd(string222222, "999", ((String) objArr222222[0]).intern(), null, oTAWorkerData));
                if (str2 != null) {
                    Object[] objArr3 = new Object[1];
                    m(TextUtils.indexOf(str6222222, str6222222) + 4, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, new char[]{3, 2, 65534, 65535}, true, 171 - TextUtils.indexOf(str6222222, str6222222), objArr3);
                    Network.getServerMessage(str2, json4222222, ((String) objArr3[0]).intern());
                }
                abstractSmartcard.disconnect();
                return otaResult;
            } catch (STOtaProcException e15) {
                xkzzb.onNavigationEvent(e15);
                otaResult.setSuccess(false);
                throw e15;
            }
        } catch (Throwable th) {
            abstractSmartcard.disconnect();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(UspCodeEnum uspCodeEnum) throws Throwable {
        String str;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        m((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29, Color.argb(0, 0, 0, 0) + 12, new char[]{11, 20, 5, '\f', 5, 3, 15, '\r', 65486, 3, 15, '\r', '\b', 20, 20, 16, 19, 65498, 65487, 65487, 3, 15, 18, 5, 65486, 21, 19, 16, 65486, 19}, false, 186 - Color.alpha(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        xkzzb.onExtraCallback(new Object[]{">> generateInitiateUrl()"});
        xkzzb.onExtraCallback(new Object[]{"++ uspCode : [%s]", uspCodeEnum});
        boolean zEquals = UspCodeEnum.INSTALL.equals(uspCodeEnum);
        Object[] objArr2 = new Object[1];
        m(ExpandableListView.getPackedPositionType(0L) + 35, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, new char[]{2, 14, '\f', 65485, 2, 14, '\f', 7, 19, 19, 15, 18, 65497, 65486, 65486, 2, 14, 17, 4, 65484, 19, 4, 18, 19, 65485, 20, 18, 15, 65485, 18, '\n', 19, 4, 11, 4}, false, 188 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object obj = null;
        if (zEquals) {
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 90 / 0;
                if (!LibraryFeatures.isREAL_SERVER()) {
                    strIntern = strIntern2;
                }
                str = String.format("%s/api/mobile/install?staging=%s", strIntern, this.l);
            } else {
                if (!LibraryFeatures.isREAL_SERVER()) {
                }
                str = String.format("%s/api/mobile/install?staging=%s", strIntern, this.l);
            }
        } else if (UspCodeEnum.DELETE.equals(uspCodeEnum)) {
            if (!LibraryFeatures.isREAL_SERVER()) {
                strIntern = strIntern2;
            }
            str = String.format("%s/api/mobile/delete?staging=%s", strIntern, this.l);
        } else if (UspCodeEnum.LOCK.equals(uspCodeEnum)) {
            int i4 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                LibraryFeatures.isREAL_SERVER();
                throw null;
            }
            if (!LibraryFeatures.isREAL_SERVER()) {
                strIntern = strIntern2;
            }
            str = String.format("%s/api/mobile/lock?staging=%s", strIntern, this.l);
        } else if (UspCodeEnum.UNLOCK.equals(uspCodeEnum)) {
            if (!LibraryFeatures.isREAL_SERVER()) {
                strIntern = strIntern2;
            }
            str = String.format("%s/api/mobile/unlock?staging=%s", strIntern, this.l);
        } else if (!(!UspCodeEnum.ENABLE.equals(uspCodeEnum))) {
            if (!LibraryFeatures.isREAL_SERVER()) {
                strIntern = strIntern2;
            }
            str = String.format("%s/api/mobile/enable?staging=%s", strIntern, this.l);
        } else if (UspCodeEnum.BLOCKING.equals(uspCodeEnum)) {
            if (!LibraryFeatures.isREAL_SERVER()) {
                strIntern = strIntern2;
            }
            str = String.format("%s/api/mobile/blocking?staging=%s", strIntern, this.l);
        } else if (UspCodeEnum.SETPPSE.equals(uspCodeEnum)) {
            if (LibraryFeatures.isREAL_SERVER()) {
                int i5 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            } else {
                strIntern = strIntern2;
            }
            str = String.format("%s/api/mobile/setPpse?staging=%s", strIntern, this.l);
        } else if (UspCodeEnum.LOCKTRANS.equals(uspCodeEnum)) {
            if (!LibraryFeatures.isREAL_SERVER()) {
                strIntern = strIntern2;
            }
            str = String.format("%s/api/mobile/lockTrans?staging=%s", strIntern, this.l);
        } else if (UspCodeEnum.SETCONFIGDF.equals(uspCodeEnum)) {
            int i6 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                LibraryFeatures.isREAL_SERVER();
                obj.hashCode();
                throw null;
            }
            if (!LibraryFeatures.isREAL_SERVER()) {
                strIntern = strIntern2;
            }
            str = String.format("%s/api/mobile/setConfigDF?staging=%s", strIntern, this.l);
        } else {
            str = null;
        }
        xkzzb.onExtraCallback(new Object[]{"-- returned : [%s]", str});
        int i7 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STOtaProcException */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r2 = r6.getOtaHeader();
        r6 = r6.getOtaBody();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r2 = com.skp.smarttouch.sem.tools.network.ota.OTAManager.onNavigationEvent;
        r3 = r2 + 117;
        com.skp.smarttouch.sem.tools.network.ota.OTAManager.onExtraCallbackWithResult = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if ((r3 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r2 = r2 + 1;
        com.skp.smarttouch.sem.tools.network.ota.OTAManager.onExtraCallbackWithResult = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if ((r2 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r6 = 37 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        throw new com.skp.smarttouch.sem.tools.common.STOtaProcException("***** response.body.ota_body is empty", r1.getResultCode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        throw new com.skp.smarttouch.sem.tools.common.STOtaProcException("***** response.body.ota_header is empty", r1.getResultCode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        throw new com.skp.smarttouch.sem.tools.common.STOtaProcException("***** response.body is empty", r1.getResultCode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(IOTAProtocol.Response response) throws STOtaProcException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (response == null) {
            throw new STOtaProcException("***** response is empty");
        }
        HeaderOfOta header = response.getHeader();
        BodyOfOta body = response.getBody();
        if (header == null) {
            throw new STOtaProcException("***** response.header is empty");
        }
        if (!"000".equals(header.getResultCode())) {
            throw new STOtaProcException("***** response.header is not '000'", header.getResultCode());
        }
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    private void b(IOTAProtocol.Response response) throws Exception {
        String dispMsg;
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> sendOnDispatchWorker()"});
        xkzzb.onExtraCallback(new Object[]{"++ response : [%s]", response});
        if (this.i == null) {
            int i2 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                xkzzb.onExtraCallback(new Object[]{"-- returned : listener is null"});
                return;
            }
            Object[] objArr = new Object[1];
            objArr[1] = "-- returned : listener is null";
            xkzzb.onExtraCallback(objArr);
            return;
        }
        if (response == null) {
            int i3 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                xkzzb.onExtraCallback(new Object[]{"-- returned : response is null"});
                return;
            } else {
                xkzzb.onExtraCallback(new Object[]{"-- returned : response is null"});
                return;
            }
        }
        HeaderOfOta header = response.getHeader();
        BodyOfOta body = response.getBody();
        try {
            if (header == null) {
                xkzzb.onExtraCallbackWithResult(new Object[]{"***** header is null : dispatch data skip...!!"});
                int i4 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            if (body == null) {
                throw new Exception("***** body is null");
            }
            OtaBody otaBody = body.getOtaBody();
            if (otaBody == null) {
                throw new Exception("***** ota_body is null");
            }
            DispData dispData = otaBody.getDispData();
            if (dispData == null) {
                throw new Exception("***** disp_data is null");
            }
            if (dispData.getDispErr() == null || dispData.getDispErr().trim().length() <= 0) {
                dispMsg = dispData.getDispMsg();
            } else {
                int i6 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    dispMsg = dispData.getDispErr();
                    int i7 = 39 / 0;
                } else {
                    dispMsg = dispData.getDispErr();
                }
            }
            this.i.onDispatchFromWorker(this.k, otaBody.getDispData().getDispStat(), dispMsg);
        } catch (Exception unused) {
            this.i.onDispatchFromWorker(this.k, header.getResultCode(), header.getResultMsg());
        }
    }

    static void onNavigationEvent() {
        onWarmupCompleted = 478308979;
    }
}
