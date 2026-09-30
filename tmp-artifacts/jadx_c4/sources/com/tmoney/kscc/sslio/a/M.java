package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MSS0004RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MSS0004ResponseDTO;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class M extends AbstractC0049k {
    private MSS0004RequestDTO c;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 121;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onWarmupCompleted = {60901};
    private static long onExtraCallbackWithResult = 164512186745213815L;

    private static String $$c(int i, byte b, short s) {
        int i2 = 4 - (s * 4);
        int i3 = 97 - (b * 4);
        int i4 = i * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = i2 + (-i4);
        }
        while (true) {
            int i6 = i2;
            int i7 = i3;
            i5++;
            bArr2[i5] = (byte) i7;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 = i6 + 1;
            i3 = i7 + (-bArr[i6]);
        }
    }

    public M(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0004, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RequestDTO requestDTOE = e();
        if (i3 != 0) {
            requestDTOE.setRequest(this.c);
            a(c().toJson(requestDTOE));
        } else {
            requestDTOE.setRequest(this.c);
            a(c().toJson(requestDTOE));
            int i4 = 53 / 0;
        }
    }

    public final void execute(String str, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        MSS0004RequestDTO mSS0004RequestDTO = new MSS0004RequestDTO();
        this.c = mSS0004RequestDTO;
        mSS0004RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setBnkCd(str);
        this.c.setCusName(str2);
        this.c.setAcntNo(str3);
        MSS0004RequestDTO mSS0004RequestDTO2 = this.c;
        Object[] objArr = new Object[1];
        i(ViewConfiguration.getScrollBarFadeDuration() >> 16, 1 - KeyEvent.keyCodeFromString(""), (char) View.MeasureSpec.getMode(0), objArr);
        mSS0004RequestDTO2.setAcntEncCd(((String) objArr[0]).intern());
        connectServer();
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MSS0004ResponseDTO mSS0004ResponseDTO = (MSS0004ResponseDTO) c().fromJson(str, MSS0004ResponseDTO.class);
        Object obj = null;
        if (mSS0004ResponseDTO == null || mSS0004ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            int i4 = onExtraCallback + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        mSS0004ResponseDTO.setCmd(b());
        if (TextUtils.equals(mSS0004ResponseDTO.getSuccess(), "true")) {
            int i5 = onExtraCallback + 97;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                TextUtils.equals(mSS0004ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS);
                throw null;
            }
            if (TextUtils.equals(mSS0004ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
                int i6 = onExtraCallback + 19;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    d().onConnectionSuccess(mSS0004ResponseDTO);
                    return;
                } else {
                    d().onConnectionSuccess(mSS0004ResponseDTO);
                    int i7 = 16 / 0;
                    return;
                }
            }
        }
        d().onConnectionError(b(), mSS0004ResponseDTO.getResponse().getRspCd(), mSS0004ResponseDTO.getResponse().getRspMsg());
    }

    private static void i(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.getCapsMode("", 0, 0)), Color.green(0) + 17, TextUtils.indexOf("", "") + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - KeyEvent.keyCodeFromString("")), 31 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        char cIndexOf = (char) (49122 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iBlue = Color.blue(0) + 44;
                        int absoluteGravity = 1494 - Gravity.getAbsoluteGravity(0, 0);
                        byte b = (byte) ($$a[2] + 1);
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iBlue, absoluteGravity, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i5 = $11 + 39;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
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
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                char windowTouchSlop = (char) (49123 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int gidForName = 43 - Process.getGidForName("");
                int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1493;
                byte b3 = (byte) ($$a[2] + 1);
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, gidForName, i7, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $10 + 45;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }
}
