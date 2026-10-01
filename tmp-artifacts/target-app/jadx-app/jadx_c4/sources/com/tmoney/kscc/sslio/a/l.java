package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DCRG0001RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DCRG0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import java.lang.reflect.Method;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class l extends AbstractC0049k {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static long onNavigationEvent = -2199812865111094789L;
    private static int onWarmupCompleted;
    private DCRG0001RequestDTO c;

    public l(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_007_DCRG_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            RequestDTO requestDTOE = e();
            requestDTOE.setRequest(this.c);
            a(c().toJson(requestDTOE));
            int i3 = 24 / 0;
        } else {
            RequestDTO requestDTOE2 = e();
            requestDTOE2.setRequest(this.c);
            a(c().toJson(requestDTOE2));
        }
        int i4 = onExtraCallback + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void execute(String str, String str2, String str3) throws Throwable {
        String strIntern;
        Object obj;
        int i = 2 % 2;
        DCRG0001RequestDTO dCRG0001RequestDTO = new DCRG0001RequestDTO();
        this.c = dCRG0001RequestDTO;
        dCRG0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setIntzPrmtUpdInf(str);
        this.c.setSlctRst(str2);
        this.c.setpymBrdt(str3);
        DCRG0001RequestDTO dCRG0001RequestDTO2 = this.c;
        if (TextUtils.isEmpty(str3)) {
            Object[] objArr = new Object[1];
            i(new char[]{36094}, 52432 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                i(new char[]{36093}, 42221 - KeyEvent.keyCodeFromString(""), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                i(new char[]{36093}, 42221 - KeyEvent.keyCodeFromString(""), objArr3);
                obj = objArr3[0];
            }
            strIntern = ((String) obj).intern();
            int i3 = onExtraCallback + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        dCRG0001RequestDTO2.setNtkmDvsCd(strIntern);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        int i = 2 % 2;
        DCRG0001ResponseDTO dCRG0001ResponseDTO = (DCRG0001ResponseDTO) c().fromJson(str, DCRG0001ResponseDTO.class);
        if (dCRG0001ResponseDTO == null || dCRG0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dCRG0001ResponseDTO.setCmd(b());
        if ((!TextUtils.equals(dCRG0001ResponseDTO.getSuccess(), "true")) || !TextUtils.equals(dCRG0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionError(b(), dCRG0001ResponseDTO.getResponse().getRspCd(), dCRG0001ResponseDTO.getResponse().getRspMsg());
            return;
        }
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        d().onConnectionSuccess(dCRG0001ResponseDTO);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void i(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 19;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), View.resolveSizeAndState(0, 0, 0) + 24, (Process.myTid() >> 22) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getPressedStateDuration() >> 16) + 59, ExpandableListView.getPackedPositionType(0L) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 83;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 59 - View.MeasureSpec.getMode(0), (-16770833) - Color.rgb(0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = $11 + 73;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }
}
