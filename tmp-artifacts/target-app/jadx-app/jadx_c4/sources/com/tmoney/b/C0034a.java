package com.tmoney.b;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.al;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* renamed from: com.tmoney.b.a, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0034a extends com.tmoney.g.a.a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 45778;
    private static int IAuthTabCallbackStub = 1;
    private static char onExtraCallback = 4469;
    private static char onExtraCallbackWithResult = 13174;
    private static char onNavigationEvent = 28821;
    private static int onWarmupCompleted;
    private final String a;
    private String b;
    private ArrayList<String> c;

    public C0034a(Context context, ResultListener resultListener) throws Throwable {
        super(context, resultListener);
        this.a = "NfcAckExecuter";
        Object[] objArr = new Object[1];
        u(new char[]{36486, 1000}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        this.b = ((String) objArr[0]).intern();
        this.c = new ArrayList<>();
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int iExecute = super.execute(dVar, resultType, true);
        if (resultType != TmoneyCallback.ResultType.SUCCESS) {
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onResult(resultType);
            int i4 = IAuthTabCallbackStub + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iExecute;
            }
            throw null;
        }
        if (!a(0)) {
            int i5 = IAuthTabCallbackStub + 123;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_INIT_PURCHASE));
                return iExecute;
            }
            onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_INIT_PURCHASE));
            throw null;
        }
        if (!purseList()) {
            onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_PURSE));
            return iExecute;
        }
        ArrayList<String> arrayList = this.c;
        new al(this.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.a.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                C0034a.this.onResult(Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                C0034a.this.onResult(TmoneyCallback.ResultType.SUCCESS);
            }
        }).execute(b(), (String[]) arrayList.toArray(new String[arrayList.size()]), this.b, d(), n());
        return iExecute;
    }

    public final boolean purseList() throws Throwable {
        String strIntern;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2 != 0 ? 1 : 0;
        while (true) {
            if (i3 >= 20) {
                break;
            }
            int i4 = i3 + 1;
            try {
                byte[] bArrA = a(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) i4, (byte) 0, 0, (byte) 0));
                com.tmoney.a.f fVar = new com.tmoney.a.f(bArrA);
                if (fVar.isbResData()) {
                    int i5 = onWarmupCompleted + 11;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    this.c.add(com.tmoney.e.a.a.bytesToHexString(bArrA));
                    i3 = i4;
                } else if (i3 == 0) {
                    int i7 = onWarmupCompleted + 63;
                    IAuthTabCallbackStub = i7 % 128;
                    if (i7 % 2 == 0) {
                        TextUtils.equals(fVar.getSW(), "6A83");
                        throw null;
                    }
                    if (TextUtils.equals(fVar.getSW(), "6A83")) {
                        Object[] objArr = new Object[1];
                        u(new char[]{34880, 44200}, -TextUtils.indexOf((CharSequence) "", '0'), objArr);
                        strIntern = ((String) objArr[0]).intern();
                        int i8 = IAuthTabCallbackStub + 15;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        Object[] objArr2 = new Object[1];
                        u(new char[]{50978, 22738}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
                        strIntern = ((String) objArr2[0]).intern();
                    }
                    this.b = strIntern;
                }
            } catch (Exception e) {
                LogHelper.exception("NfcAckExecuter", e);
                return false;
            }
        }
        return true;
    }

    private static void u(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 85;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = $10 + 15;
            $11 = i7 % 128;
            if (i7 % i2 == 0) {
                int i8 = 5 / 5;
            }
            int i9 = 58224;
            int i10 = i4;
            while (i10 < 16) {
                int i11 = $10 + 15;
                $11 = i11 % 128;
                int i12 = i11 % i2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i13 = (c2 + i9) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i14 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[i2] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iMyPid = (Process.myPid() >> 22) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, tapTimeout, iMyPid, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) + 11, (ViewConfiguration.getPressedStateDuration() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 16014), 14 - (ViewConfiguration.getFadingEdgeLength() >> 16), 19900 - TextUtils.indexOf((CharSequence) "", '0', 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i15 = $11 + 71;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i2 = 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
