package com.tmoney.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.C0057z;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.GIFT0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class n extends com.tmoney.g.a.a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 30324;
    private static int asBinder = 1;
    private static char onExtraCallback = 52744;
    private static char onExtraCallbackWithResult = 18981;
    private static char onNavigationEvent = 23566;
    private static int onWarmupCompleted;
    private final String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private int h;
    private int i;
    private int j;

    public n(Context context, String str, String str2, int i, ResultListener resultListener) throws Throwable {
        super(context, resultListener);
        this.a = "TmoneyGiftNormalExecuter";
        this.b = "4";
        this.d = "";
        this.f = "";
        Object[] objArr = new Object[1];
        u(new char[]{4083, 47279}, -TextUtils.lastIndexOf("", '0', 0), objArr);
        this.g = ((String) objArr[0]).intern();
        this.i = 0;
        this.j = 0;
        this.c = str;
        this.e = str2;
        this.h = i;
    }

    static /* synthetic */ void a(n nVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        nVar.a(resultType);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 103;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void a(n nVar, String str, int i) {
        int i2 = 2 % 2;
        new com.tmoney.kscc.sslio.a.A(nVar.getContext(), new AbstractC0045f.a() { // from class: com.tmoney.b.n.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                n.a(n.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str2).setMessage(str3));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                n.a(n.this, TmoneyCallback.ResultType.SUCCESS);
            }
        }).execute(nVar.e(), str, Integer.toString(i));
        int i3 = asBinder + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
            if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                resultType.setData(n(), Integer.valueOf(this.j), Integer.valueOf(p()));
                int i4 = onWarmupCompleted + 121;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (resultType == TmoneyCallback.ResultType.SUCCESS) {
        }
        onResult(resultType);
    }

    static /* synthetic */ boolean a(n nVar) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zM = nVar.m();
        int i4 = onWarmupCompleted + 67;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zM;
        }
        throw null;
    }

    static /* synthetic */ boolean a(n nVar, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            nVar.c(str);
            throw null;
        }
        boolean zC = nVar.c(str);
        int i3 = asBinder + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
        return zC;
    }

    static /* synthetic */ int b(n nVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iP = nVar.p();
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return iP;
    }

    static /* synthetic */ String c(n nVar) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return nVar.e();
        }
        nVar.e();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String d(n nVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return nVar.q();
        }
        nVar.q();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String e(n nVar) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strE = nVar.e();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = onWarmupCompleted + 53;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return strE;
    }

    static /* synthetic */ String f(n nVar) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return nVar.q();
        }
        nVar.q();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            this.j = p();
            int i4 = this.h;
            if (p() < i4) {
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.DATA_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.DATA_ERROR;
                a(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()));
                return p();
            }
            if (a(i4)) {
                new C0057z(getContext(), new AbstractC0045f.a() { // from class: com.tmoney.b.n.1
                    @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
                    public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                        n.a(n.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
                    }

                    @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
                    public final void onConnectionSuccess(ResponseDTO responseDTO) {
                        GIFT0001ResponseDTO gIFT0001ResponseDTO = (GIFT0001ResponseDTO) responseDTO;
                        String purApdu = gIFT0001ResponseDTO.getResponse().getPurApdu();
                        String giftTrdNo = gIFT0001ResponseDTO.getResponse().getGiftTrdNo();
                        if (!n.a(n.this, purApdu)) {
                            n nVar = n.this;
                            TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                            ResultDetailCode resultDetailCode2 = ResultDetailCode.USIM_PURCHASE;
                            n.a(nVar, error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()).setLog("ApduResPurchase::" + n.e(n.this) + " SW::" + n.f(n.this)));
                            return;
                        }
                        if (n.a(n.this)) {
                            n nVar2 = n.this;
                            n.a(nVar2, giftTrdNo, n.b(nVar2));
                            return;
                        }
                        n nVar3 = n.this;
                        TmoneyCallback.ResultType error3 = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                        ResultDetailCode resultDetailCode3 = ResultDetailCode.USIM_BALANCE;
                        n.a(nVar3, error3.setDetailCode(resultDetailCode3.getCodeString()).setMessage(resultDetailCode3.getMessage()).setLog("ApduResPurchase::" + n.c(n.this) + " SW::" + n.d(n.this)));
                    }
                }).execute(this.b, this.d, this.c, this.e, Integer.toString(this.h), Integer.toString(0), this.f, d(), b(), this.g);
            } else {
                TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode2 = ResultDetailCode.USIM_INIT_PURCHASE;
                a(error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()).setLog("ApduResInitPurchase::" + d() + " SW::" + q()));
                int i5 = onWarmupCompleted + 11;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            a(resultType);
        }
        return p();
    }

    private static void u(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 17;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iMyPid = (Process.myPid() >> 22) + 10;
                        int iNormalizeMetaState = 12434 - KeyEvent.normalizeMetaState(i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength, iMyPid, iNormalizeMetaState, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.normalizeMetaState(0) + 10, View.resolveSizeAndState(0, 0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - TextUtils.lastIndexOf("", '0', 0)), 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 19901 - (Process.myTid() >> 22), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
