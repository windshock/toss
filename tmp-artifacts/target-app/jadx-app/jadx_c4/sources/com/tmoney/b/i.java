package com.tmoney.b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.C0048i;
import com.tmoney.kscc.sslio.a.al;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.BLMV0001ResponseDTO;
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
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class i extends com.tmoney.g.a.a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = -8620687998520955229L;
    private static int onWarmupCompleted = 1;
    String a;
    String b;
    private final String c;
    private int d;
    private String e;
    private String f;
    private int g;
    private int h;
    private boolean i;
    private String j;
    private ArrayList<String> k;

    public i(Context context, ResultListener resultListener) throws Throwable {
        super(context, resultListener);
        this.c = "NfcTransferMileageExecuter";
        this.d = 0;
        this.a = "";
        this.b = "";
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = 0;
        this.i = true;
        Object[] objArr = new Object[1];
        v(new char[]{2918, 52530, 13859, 49547, 2902}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr);
        this.j = ((String) objArr[0]).intern();
        this.k = new ArrayList<>();
    }

    static /* synthetic */ void a(i iVar) {
        int i = 2 % 2;
        LogHelper.d("NfcTransferMileageExecuter", "requestUCAD()");
        ArrayList<String> arrayList = iVar.k;
        new al(iVar.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.i.4
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                LogHelper.d("NfcTransferMileageExecuter", "UCAD0001Instance :: onConnectionError");
                i.this.onResult(Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcTransferMileageExecuter", "UCAD0001Instance :: onConnectionSuccess");
                if (i.e(i.this)) {
                    i.c(i.this);
                } else {
                    i.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_INIT_LOAD));
                }
            }
        }).execute(iVar.b(), (String[]) arrayList.toArray(new String[arrayList.size()]), iVar.j, iVar.d(), iVar.n());
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
    }

    static /* synthetic */ void a(i iVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        iVar.a(resultType);
        int i4 = onWarmupCompleted + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private void a(TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        LogHelper.d("NfcTransferMileageExecuter", "onLoadResult(" + resultType + ")");
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n(), Integer.valueOf(this.g), 0);
            LogHelper.d("NfcTransferMileageExecuter", "BeforeBalance >> " + this.g + ", AfterBalance >> 0");
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        onResult(resultType);
    }

    static /* synthetic */ boolean a(i iVar, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean zA = iVar.a(0);
        int i5 = IAuthTabCallback + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return zA;
        }
        throw null;
    }

    static /* synthetic */ boolean a(i iVar, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return iVar.a(str);
        }
        iVar.a(str);
        throw null;
    }

    static /* synthetic */ boolean b(i iVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zK = iVar.k();
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        int i5 = IAuthTabCallback + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return zK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void c(i iVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        iVar.u();
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = IAuthTabCallback + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void d(i iVar) {
        int i = 2 % 2;
        LogHelper.d("NfcTransferMileageExecuter", "requestLoadConfirm");
        new com.tmoney.kscc.sslio.a.j(iVar.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.i.3
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                LogHelper.d("NfcTransferMileageExecuter", "TMCR0010Instance()::onConnectionError>>" + str + ">>" + str2);
                i.a(i.this, Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcTransferMileageExecuter", "BLMV0002Instance :: onConnectionSuccess");
                i.a(i.this, TmoneyCallback.ResultType.SUCCESS);
            }
        }).execute(iVar.i(), iVar.b);
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ boolean e(i iVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zK = iVar.k();
        int i4 = onWarmupCompleted + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zK;
    }

    private void u() {
        int i = 2 % 2;
        LogHelper.d("NfcTransferMileageExecuter", "requestInitTransferMileage()");
        new C0048i(this.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.i.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                LogHelper.d("NfcTransferMileageExecuter", "BLMV0001Instance()::onConnectionError>>" + str + ">>" + str2);
                i.a(i.this, Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcTransferMileageExecuter", "TMCR0009Instance()::onConnectionSuccess");
                BLMV0001ResponseDTO bLMV0001ResponseDTO = (BLMV0001ResponseDTO) responseDTO;
                i.this.a = bLMV0001ResponseDTO.getResponse().getUnLoadApdu();
                i.this.b = bLMV0001ResponseDTO.getResponse().getBltrTrdNo();
                i iVar = i.this;
                if (i.a(iVar, iVar.a)) {
                    i.d(i.this);
                } else {
                    i.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_INIT_UNLOAD));
                }
            }
        }).execute(Integer.toString(this.g), h(), b(), n());
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r3.g = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r4 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r5 = com.tmoney.b.i.onWarmupCompleted + 121;
        com.tmoney.b.i.IAuthTabCallback = r5 % 128;
        r5 = r5 % 2;
        onResult(com.tmoney.utils.Callback.warning(com.tmoney.listener.ResultError.USIM_ERROR, com.tmoney.listener.ResultDetailCode.BALANCE_OVER));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r3.i == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        com.tmoney.utils.LogHelper.d("NfcTransferMileageExecuter", "checkAck()");
        new com.tmoney.kscc.sslio.a.am(r3.mContext, new com.tmoney.b.i.AnonymousClass1(r3)).execute(n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (k() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        r5 = com.tmoney.b.i.IAuthTabCallback + 87;
        com.tmoney.b.i.onWarmupCompleted = r5 % 128;
        r5 = r5 % 2;
        a(com.tmoney.utils.Callback.warning(com.tmoney.listener.ResultError.USIM_ERROR, com.tmoney.listener.ResultDetailCode.USIM_INIT_LOAD));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        u();
        r5 = com.tmoney.b.i.onWarmupCompleted + 97;
        com.tmoney.b.i.IAuthTabCallback = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if ((r5 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        r5 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r5 != com.tmoney.listener.TmoneyCallback.ResultType.SUCCESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r5 != com.tmoney.listener.TmoneyCallback.ResultType.SUCCESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        onResult(r5);
     */
    @Override // com.tmoney.g.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        int iExecute;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            iExecute = super.execute(dVar, resultType, false);
        } else {
            iExecute = super.execute(dVar, resultType, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r2 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        r2 = com.tmoney.b.i.IAuthTabCallback + 15;
        com.tmoney.b.i.onWarmupCompleted = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if ((r2 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        r6 = 78 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (android.text.TextUtils.equals(r7.getSW(), "6A83") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (android.text.TextUtils.equals(r7.getSW(), "6A83") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r3 = new java.lang.Object[1];
        v(new char[]{9059, 19951, 17862, 52463, 9042}, 1 - android.graphics.Color.red(0), r3);
        r0 = ((java.lang.String) r3[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        r5 = new java.lang.Object[1];
        v(new char[]{1882, 2831, 51819, 4066, 1896}, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1, r5);
        r2 = ((java.lang.String) r5[0]).intern();
        r3 = com.tmoney.b.i.onWarmupCompleted + 77;
        com.tmoney.b.i.IAuthTabCallback = r3 % 128;
        r3 = r3 % 2;
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        r12.j = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean purseList() throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LogHelper.d("NfcTransferMileageExecuter", "purseList()");
        try {
            this.k.clear();
            int i4 = 0;
            while (true) {
                if (i4 >= 20) {
                    break;
                }
                int i5 = i4 + 1;
                byte[] bArrA = a(com.tmoney.a.a.getApduCmd(7, (byte) 0, (byte) i5, (byte) 0, 0, (byte) 0));
                com.tmoney.a.f fVar = new com.tmoney.a.f(bArrA);
                if (!fVar.isbResData()) {
                    break;
                }
                int i6 = onWarmupCompleted + 47;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                this.k.add(com.tmoney.e.a.a.bytesToHexString(bArrA));
                i4 = i5;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void v(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 47;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 77;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45812), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 84, TextUtils.lastIndexOf("", '0', 0) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14184), 18 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
