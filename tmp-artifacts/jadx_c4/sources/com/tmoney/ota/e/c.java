package com.tmoney.ota.e;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.ota.b.d;
import com.tmoney.ota.b.e;
import com.tmoney.ota.b.f;
import com.tmoney.ota.b.g;
import com.tmoney.ota.b.h;
import com.tmoney.ota.b.i;
import com.tmoney.ota.dto.APDU;
import com.tmoney.ota.dto.OTAData01;
import com.tmoney.ota.dto.OTAData02;
import com.tmoney.ota.dto.OTAData03;
import com.tmoney.ota.dto.OTAData04;
import com.tmoney.ota.dto.OTAData05;
import com.tmoney.ota.dto.OTAData2001;
import com.tmoney.ota.dto.OTAData2005;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class c {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 5728;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 62267;
    private static char onNavigationEvent = 16806;
    private static char onWarmupCompleted = 55135;
    private final String a = "PacketMaker";
    private Context b;

    public c(Context context) {
        this.b = context;
    }

    public final Context getContext() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 123;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Context context = this.b;
        int i4 = i2 + 51;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return context;
    }

    public final com.tmoney.ota.b.b getOTADelPacket1(String str, String str2, String str3, String str4, String str5) throws Throwable {
        int i = 2 % 2;
        OTAData01 oTAData01 = new OTAData01(getContext());
        oTAData01.setISSU_REQ_SNO(str);
        Object[] objArr = new Object[1];
        c(new char[]{59507, 50295}, 1 - Color.green(0), objArr);
        oTAData01.setMSG_DVS_CD(((String) objArr[0]).intern());
        oTAData01.setTLCN_SERV_ID("123");
        oTAData01.setHNDH_TEL_NO(str3);
        oTAData01.setCARD_NO(str5);
        oTAData01.setMSG_SNO(1);
        Object[] objArr2 = new Object[1];
        c(new char[]{48868, 52539}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr2);
        oTAData01.setRST_CD(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        c(new char[]{59507, 50295}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        oTAData01.setRTRM_YN(((String) objArr3[0]).intern());
        oTAData01.setAGE_DVS_CD("IN");
        oTAData01.setGNDR("IT");
        oTAData01.setSP_ID("doz01");
        com.tmoney.ota.b.c cVar = new com.tmoney.ota.b.c(oTAData01);
        int i2 = asBinder + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return cVar;
    }

    public final com.tmoney.ota.b.b getOTAPacket1(String str, String str2, String str3, String str4, String str5) throws Throwable {
        int i = 2 % 2;
        OTAData01 oTAData01 = new OTAData01(getContext());
        oTAData01.setISSU_REQ_SNO(str);
        Object[] objArr = new Object[1];
        c(new char[]{59507, 50295}, 1 - Color.red(0), objArr);
        oTAData01.setMSG_DVS_CD(((String) objArr[0]).intern());
        oTAData01.setTLCN_SERV_ID("123");
        oTAData01.setHNDH_TEL_NO(str3);
        oTAData01.setCARD_NO(str5);
        oTAData01.setMSG_SNO(1);
        Object[] objArr2 = new Object[1];
        c(new char[]{48868, 52539}, 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
        oTAData01.setRST_CD(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        c(new char[]{59507, 50295}, 1 - TextUtils.indexOf("", ""), objArr3);
        oTAData01.setRTRM_YN(((String) objArr3[0]).intern());
        oTAData01.setAGE_DVS_CD("01");
        oTAData01.setGNDR(TmoneyData.getInstance(this.b).getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.OTA_CODE.getCode()));
        oTAData01.setSP_ID("doz01");
        com.tmoney.ota.b.c cVar = new com.tmoney.ota.b.c(oTAData01);
        int i2 = onExtraCallback + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return cVar;
    }

    public final com.tmoney.ota.b.b getOTAPacket2(String str, String str2, String str3, String str4) throws Throwable {
        int i = 2 % 2;
        OTAData02 oTAData02 = new OTAData02(getContext());
        oTAData02.setISSU_REQ_SNO(str);
        Object[] objArr = new Object[1];
        c(new char[]{59507, 50295}, Color.rgb(0, 0, 0) + 16777217, objArr);
        oTAData02.setMSG_DVS_CD(((String) objArr[0]).intern());
        oTAData02.setTLCN_SERV_ID("123");
        oTAData02.setMSG_SNO(1);
        Object[] objArr2 = new Object[1];
        c(new char[]{48868, 52539}, View.getDefaultSize(0, 0) + 1, objArr2);
        oTAData02.setRST_CD(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        c(new char[]{59507, 50295}, 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
        oTAData02.setRTRM_YN(((String) objArr3[0]).intern());
        oTAData02.setCARD_NO(str3);
        oTAData02.setAPP_CNT(0);
        oTAData02.setSP_ID("doz01");
        d dVar = new d(oTAData02);
        int i2 = onExtraCallback + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return dVar;
    }

    public final com.tmoney.ota.b.b getOTAPacket2001(String str, String str2, String str3, String str4) throws Throwable {
        int i = 2 % 2;
        OTAData2001 oTAData2001 = new OTAData2001(getContext());
        oTAData2001.setISSU_REQ_SNO(str);
        Object[] objArr = new Object[1];
        c(new char[]{59507, 50295}, View.MeasureSpec.getSize(0) + 1, objArr);
        oTAData2001.setMSG_DVS_CD(((String) objArr[0]).intern());
        oTAData2001.setTLCN_SERV_ID("123");
        oTAData2001.setHNDH_TEL_NO(str3);
        oTAData2001.setCARD_NO(str4);
        oTAData2001.setMSG_SNO(1);
        Object[] objArr2 = new Object[1];
        c(new char[]{48868, 52539}, Color.alpha(0) + 1, objArr2);
        oTAData2001.setRST_CD(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        c(new char[]{59507, 50295}, KeyEvent.keyCodeFromString("") + 1, objArr3);
        oTAData2001.setRTRM_YN(((String) objArr3[0]).intern());
        oTAData2001.setAGE_DVS_CD("02");
        oTAData2001.setGNDR("01");
        oTAData2001.setSP_ID("doz01");
        h hVar = new h(oTAData2001);
        int i2 = onExtraCallback + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return hVar;
    }

    public final com.tmoney.ota.b.b getOTAPacket2005(String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        OTAData2005 oTAData2005 = new OTAData2005(getContext());
        oTAData2005.setISSU_REQ_SNO(str);
        oTAData2005.setHNDH_TEL_NO(str3);
        Object[] objArr = new Object[1];
        c(new char[]{59507, 50295}, TextUtils.getOffsetAfter("", 0) + 1, objArr);
        oTAData2005.setMSG_DVS_CD(((String) objArr[0]).intern());
        oTAData2005.setTLCN_SERV_ID("OTA");
        oTAData2005.setMSG_SNO(0);
        Object[] objArr2 = new Object[1];
        c(new char[]{48868, 52539}, 1 - TextUtils.getTrimmedLength(""), objArr2);
        oTAData2005.setRST_CD(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        c(new char[]{59507, 50295}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
        oTAData2005.setRTRM_YN(((String) objArr3[0]).intern());
        oTAData2005.setENCR_DTA("");
        oTAData2005.setTL_PRRS_CD("");
        oTAData2005.setRST_MSG("");
        oTAData2005.setSP_ID("doz01");
        i iVar = new i(oTAData2005);
        int i2 = asBinder + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return iVar;
    }

    public final com.tmoney.ota.b.b getOTAPacket3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<APDU> list) throws Throwable {
        int i = 2 % 2;
        OTAData03 oTAData03 = new OTAData03(getContext());
        oTAData03.setISSU_REQ_SNO(str);
        oTAData03.setHNDH_TEL_NO(str3);
        oTAData03.setCARD_NO(str5);
        oTAData03.setCARD_PRD_ID(str6);
        oTAData03.setCAPP_SVC_ID(str8);
        oTAData03.setCARD_STA_CD("");
        Object[] objArr = new Object[1];
        c(new char[]{59507, 50295}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        oTAData03.setMSG_DVS_CD(((String) objArr[0]).intern());
        oTAData03.setMSG_SNO(1);
        oTAData03.setPBCM_CD(str7);
        Object[] objArr2 = new Object[1];
        c(new char[]{48868, 52539}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr2);
        oTAData03.setRST_CD(((String) objArr2[0]).intern());
        oTAData03.setRST_MSG("");
        Object[] objArr3 = new Object[1];
        c(new char[]{59507, 50295}, View.resolveSize(0, 0) + 1, objArr3);
        oTAData03.setRTRM_YN(((String) objArr3[0]).intern());
        oTAData03.setTL_PRRS_CD("");
        oTAData03.setAPP_CNT(0);
        oTAData03.setTLCN_SERV_ID("123");
        oTAData03.setSP_ID("doz01");
        for (int i2 = 0; i2 < list.size(); i2++) {
            LogHelper.d("PacketMaker", ">>>>>>>>>>>>>>>>>>>>> apdu.get(" + i2 + ") : " + list.get(i2));
            oTAData03.setTRM_APDU_VAL(list.get(i2));
        }
        e eVar = new e(oTAData03);
        int i3 = onExtraCallback + 1;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return eVar;
    }

    public final com.tmoney.ota.b.b getOTAPacket4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<APDU> list) throws Throwable {
        int i = 2 % 2;
        OTAData04 oTAData04 = new OTAData04(getContext());
        oTAData04.setISSU_REQ_SNO(str);
        oTAData04.setHNDH_TEL_NO(str3);
        oTAData04.setCARD_NO(str5);
        oTAData04.setDUTY_DVS_CD(str6);
        oTAData04.setCARD_PRD_ID(str7);
        oTAData04.setCAPP_SVC_ID(str9);
        oTAData04.setCARD_STA_CD("");
        Object[] objArr = new Object[1];
        c(new char[]{59507, 50295}, 1 - Color.alpha(0), objArr);
        oTAData04.setMSG_DVS_CD(((String) objArr[0]).intern());
        oTAData04.setMSG_SNO(1);
        oTAData04.setPBCM_CD(str8);
        Object[] objArr2 = new Object[1];
        c(new char[]{48868, 52539}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
        oTAData04.setRST_CD(((String) objArr2[0]).intern());
        oTAData04.setRST_MSG("");
        Object[] objArr3 = new Object[1];
        c(new char[]{59507, 50295}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr3);
        oTAData04.setRTRM_YN(((String) objArr3[0]).intern());
        oTAData04.setTL_PRRS_CD("");
        oTAData04.setAPP_CNT(0);
        oTAData04.setTLCN_SERV_ID("123");
        oTAData04.setSP_ID("doz01");
        int i2 = asBinder + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < list.size(); i4++) {
            LogHelper.d("PacketMaker", ">>>>>>>>>>>>>>>>>>>>> apdu.get(" + i4 + ") : " + list.get(i4));
            oTAData04.setTRM_APDU_VAL(list.get(i4));
        }
        f fVar = new f(oTAData04);
        int i5 = asBinder + 63;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return fVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final com.tmoney.ota.b.b getOTAPacket5(String str, String str2, String str3, String str4) throws Throwable {
        int i = 2 % 2;
        OTAData05 oTAData05 = new OTAData05(getContext());
        oTAData05.setISSU_REQ_SNO(str);
        oTAData05.setHNDH_TEL_NO(str3);
        Object[] objArr = new Object[1];
        c(new char[]{59507, 50295}, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        oTAData05.setMSG_DVS_CD(((String) objArr[0]).intern());
        oTAData05.setTLCN_SERV_ID("OTA");
        oTAData05.setMSG_SNO(0);
        Object[] objArr2 = new Object[1];
        c(new char[]{48868, 52539}, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
        oTAData05.setRST_CD(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        c(new char[]{59507, 50295}, 1 - (Process.myPid() >> 22), objArr3);
        oTAData05.setRTRM_YN(((String) objArr3[0]).intern());
        oTAData05.setENCR_DTA("");
        oTAData05.setTL_PRRS_CD("");
        oTAData05.setRST_MSG("");
        oTAData05.setSP_ID("doz01");
        g gVar = new g(oTAData05);
        int i2 = onExtraCallback + 11;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return gVar;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 65;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 121;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 11;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, iIndexOf, maxKeyCode, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 10 - TextUtils.indexOf("", "", 0, 0), Color.argb(0, 0, 0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 16015), 14 - TextUtils.indexOf("", "", 0, 0), 19901 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i14 = $10 + 27;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
