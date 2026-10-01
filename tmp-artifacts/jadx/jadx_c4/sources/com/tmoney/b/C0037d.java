package com.tmoney.b;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.TmoneyConstants;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.W;
import com.tmoney.kscc.sslio.a.X;
import com.tmoney.kscc.sslio.a.Z;
import com.tmoney.kscc.sslio.a.al;
import com.tmoney.kscc.sslio.a.am;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TMCR0009ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.UCAD0002ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* renamed from: com.tmoney.b.d, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0037d extends com.tmoney.g.a.a {
    private final String a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private String f;
    private String g;
    private int h;
    private int i;
    private boolean j;
    private String k;
    private ArrayList<String> l;
    private static final byte[] $$a = {4, -66, -36, 8};
    private static final int $$b = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onExtraCallback = 478308967;

    private static String $$c(short s, byte b, int i) {
        int i2 = 3 - (b * 4);
        int i3 = (s * 3) + 105;
        byte[] bArr = $$a;
        int i4 = i * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i2);
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2 + 1;
            i3 += -bArr[i7];
            i2 = i7;
            i5 = i6;
        }
    }

    public C0037d(Context context, String str, String str2, int i, int i2, int i3, boolean z, ResultListener resultListener) throws Throwable {
        super(context, resultListener);
        this.a = "NfcLoadExecuter";
        this.b = TmoneyConstants.TMONEY_MAX_BALANCE;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        Object[] objArr = new Object[1];
        v(Color.argb(0, 0, 0, 0) + 1, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, new char[]{0}, true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 127, objArr);
        this.k = ((String) objArr[0]).intern();
        this.l = new ArrayList<>();
        this.f = str;
        this.g = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.j = z;
    }

    static /* synthetic */ void a(C0037d c0037d) {
        int i = 2 % 2;
        LogHelper.d("NfcLoadExecuter", "checkAck()");
        new am(c0037d.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.d.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                LogHelper.d("NfcLoadExecuter", "TMCR0012Instance()::onConnectionError>>" + str + ">>" + str2);
                C0037d.a(C0037d.this, Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcLoadExecuter", "UCAD0002Instance()::onConnectionSuccess");
                if (!TextUtils.equals(((UCAD0002ResponseDTO) responseDTO).getResponse().getUcfmYn(), "Y")) {
                    C0037d c0037d2 = C0037d.this;
                    if (C0037d.b(c0037d2, C0037d.c(c0037d2))) {
                        C0037d.d(C0037d.this);
                        return;
                    } else {
                        C0037d.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_INIT_LOAD));
                        return;
                    }
                }
                if (!C0037d.a(C0037d.this, 0)) {
                    C0037d.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_INIT_PURCHASE));
                } else if (C0037d.this.purseList()) {
                    C0037d.b(C0037d.this);
                } else {
                    C0037d.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_EXCEPTION));
                }
            }
        }).execute(c0037d.n());
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void a(C0037d c0037d, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        LogHelper.d("NfcLoadExecuter", "onLoadResult(" + resultType + ")");
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(c0037d.n(), Integer.valueOf(c0037d.h), Integer.valueOf(c0037d.i));
            LogHelper.d("NfcLoadExecuter", "BeforeBalance >> " + c0037d.h + ", AfterBalance >> " + c0037d.i);
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 4;
            }
        }
        c0037d.onResult(resultType);
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    static /* synthetic */ void a(C0037d c0037d, String str, final boolean z) {
        int i = 2 % 2;
        LogHelper.d("NfcLoadExecuter", "requestLoad(" + str + ")");
        new X(c0037d.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.d.4
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                LogHelper.d("NfcLoadExecuter", "TMCR0010Instance()::onConnectionError>>" + str2 + ">>" + str3);
                if (z) {
                    C0037d.a(C0037d.this, Callback.warning(ResultError.SERVER_ERROR, str2, str3));
                } else {
                    C0037d.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_LOAD));
                }
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcLoadExecuter", "TMCR0010Instance :: onConnectionSuccess");
                if (z) {
                    C0037d.a(C0037d.this, TmoneyCallback.ResultType.SUCCESS);
                } else {
                    C0037d.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_LOAD));
                }
            }
        }).execute(c0037d.n(), c0037d.f(), str);
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean a(C0037d c0037d, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return c0037d.a(0);
    }

    static /* synthetic */ boolean a(C0037d c0037d, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zB = c0037d.b(str);
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zB;
    }

    static /* synthetic */ void b(C0037d c0037d) {
        int i = 2 % 2;
        LogHelper.d("NfcLoadExecuter", "requestUCAD()");
        ArrayList<String> arrayList = c0037d.l;
        new al(c0037d.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.d.5
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                LogHelper.d("NfcLoadExecuter", "UCAD0001Instance :: onConnectionError");
                C0037d.this.onResult(Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcLoadExecuter", "UCAD0001Instance :: onConnectionSuccess");
                C0037d c0037d2 = C0037d.this;
                if (C0037d.c(c0037d2, C0037d.c(c0037d2))) {
                    C0037d.d(C0037d.this);
                } else {
                    C0037d.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_INIT_LOAD));
                }
            }
        }).execute(c0037d.b(), (String[]) arrayList.toArray(new String[arrayList.size()]), c0037d.k, c0037d.d(), c0037d.n());
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ boolean b(C0037d c0037d, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean zB = c0037d.b(i);
        int i5 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return zB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int c(C0037d c0037d) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = c0037d.c;
        int i6 = i3 + 33;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ boolean c(C0037d c0037d, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean zB = c0037d.b(i);
        int i5 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zB;
    }

    static /* synthetic */ void d(C0037d c0037d) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        c0037d.u();
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    private void u() {
        int i = 2 % 2;
        LogHelper.d("NfcLoadExecuter", "requestInitLoad()");
        new W(this.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.d.3
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                LogHelper.d("NfcLoadExecuter", "TMCR0009Instance()::onConnectionError>>" + str + ">>" + str2);
                C0037d.a(C0037d.this, Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcLoadExecuter", "TMCR0009Instance()::onConnectionSuccess");
                TMCR0009ResponseDTO tMCR0009ResponseDTO = (TMCR0009ResponseDTO) responseDTO;
                String loadApdu = tMCR0009ResponseDTO.getResponse().getLoadApdu();
                C0037d.a(C0037d.this, tMCR0009ResponseDTO.getResponse().getChgTrdNo(), C0037d.a(C0037d.this, loadApdu));
            }
        }).execute(n(), b(), c(), this.f, this.g, this.c, this.d, this.e);
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    @Override // com.tmoney.g.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        String str;
        int i = 2 % 2;
        int iExecute = super.execute(dVar, resultType, true);
        if (resultType != TmoneyCallback.ResultType.SUCCESS) {
            onResult(resultType);
            return iExecute;
        }
        this.h = iExecute;
        int i2 = this.c;
        int i3 = iExecute + i2;
        this.i = i3;
        if (i3 > 500000) {
            int i4 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.BALANCE_OVER));
                int i5 = 33 / 0;
            } else {
                onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.BALANCE_OVER));
            }
            return iExecute;
        }
        if (!this.j) {
            if (b(i2)) {
                u();
                return iExecute;
            }
            onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_INIT_LOAD));
            return iExecute;
        }
        LogHelper.d("NfcLoadExecuter", "enableCheckTopupPlate()");
        if (!this.f.equals("A8")) {
            int i6 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 12 / 0;
                if (!this.f.equals("C0")) {
                    str = "01";
                    if (!this.f.equals("01")) {
                        int i8 = onExtraCallbackWithResult + 79;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 != 0) {
                            this.f.equals("C5");
                            throw null;
                        }
                        if (this.f.equals("C5")) {
                            str = "12";
                        } else {
                            if (!this.f.equals("B4")) {
                                int i9 = onExtraCallbackWithResult + 111;
                                onNavigationEvent = i9 % 128;
                                int i10 = i9 % 2;
                                if (!this.f.equals("BB") && !this.f.equals("B5")) {
                                    this.f.equals("C8");
                                    int i11 = onNavigationEvent + 115;
                                    onExtraCallbackWithResult = i11 % 128;
                                    int i12 = i11 % 2;
                                }
                            }
                            str = "11";
                        }
                    }
                } else {
                    str = "02";
                }
            } else if (!this.f.equals("C0")) {
            }
        }
        new Z(this.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.d.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                LogHelper.d("NfcLoadExecuter", "TMCR0012Instance()::onConnectionError>>" + str2 + ">>" + str3);
                C0037d.a(C0037d.this, Callback.warning(ResultError.SERVER_ERROR, str2, str3));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcLoadExecuter", "TMCR0012Instance()::onConnectionSuccess");
                C0037d.a(C0037d.this);
            }
        }).execute("", n(), String.valueOf(this.h), str);
        return iExecute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean purseList() throws Throwable {
        int i;
        Object obj;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        LogHelper.d("NfcLoadExecuter", "purseList()");
        if (i4 == 0) {
            try {
                this.l.clear();
                i = 1;
            } catch (Exception unused) {
                return true;
            }
        } else {
            try {
                this.l.clear();
                i = 0;
            } catch (Exception unused2) {
                return false;
            }
        }
        boolean z = i;
        while (i < 20) {
            int i5 = i + 1;
            try {
                byte[] bArrA = a(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) i5, (byte) 0, 0, (byte) 0));
                com.tmoney.a.f fVar = new com.tmoney.a.f(bArrA);
                if (!fVar.isbResData()) {
                    if (i != 0) {
                        return true;
                    }
                    if (TextUtils.equals(fVar.getSW(), "6A83")) {
                        int i6 = onExtraCallbackWithResult + 61;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        Object[] objArr = new Object[1];
                        v(1 - Color.blue(0), -TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{0}, true, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, objArr);
                        obj = objArr[0];
                    } else {
                        Object[] objArr2 = new Object[1];
                        v((Process.myTid() >> 22) + 1, 1 - Gravity.getAbsoluteGravity(0, 0), new char[]{0}, false, 128 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
                        obj = objArr2[0];
                    }
                    this.k = ((String) obj).intern();
                    return true;
                }
                this.l.add(com.tmoney.e.a.a.bytesToHexString(bArrA));
                i = i5;
            } catch (Exception unused3) {
                return z;
            }
        }
        return true;
    }

    private static void v(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $10 + 3;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i8 = $11 + 81;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (Process.myPid() >> 22)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22, 10278 - (ViewConfiguration.getLongPressTimeout() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.makeMeasureSpec(0, 0)), 55 - TextUtils.indexOf("", ""), Color.rgb(0, 0, 0) + 16779383, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $10 + 61;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 12795), (ViewConfiguration.getFadingEdgeLength() >> 16) + 55, Process.getGidForName("") + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
