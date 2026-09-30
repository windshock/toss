package com.tmoney.b;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.tmoney.TmoneyConstants;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.Z;
import com.tmoney.kscc.sslio.a.al;
import com.tmoney.kscc.sslio.a.am;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
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
import o.TrackGroupExternalSyntheticLambda0;

/* renamed from: com.tmoney.b.c, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0036c extends com.tmoney.g.a.a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static char[] onExtraCallbackWithResult = {27222, 27162, 27223};
    private static int onNavigationEvent = 1;
    private final String a;
    private final int b;
    private String c;
    private int d;
    private int e;
    private String f;
    private ArrayList<String> g;

    public C0036c(Context context, String str, ResultListener resultListener) throws Throwable {
        super(context, resultListener);
        this.a = "NfcEnableCheckExecuter";
        this.b = TmoneyConstants.TMONEY_MAX_BALANCE;
        this.d = 0;
        this.e = 0;
        Object[] objArr = new Object[1];
        u(new int[]{0, 1, 0, 1}, true, new byte[]{0}, objArr);
        this.f = ((String) objArr[0]).intern();
        this.g = new ArrayList<>();
        this.c = str;
    }

    static /* synthetic */ void a(C0036c c0036c) {
        int i = 2 % 2;
        LogHelper.d("NfcEnableCheckExecuter", "checkAck()");
        new am(c0036c.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.c.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                LogHelper.d("NfcEnableCheckExecuter", "TMCR0012Instance()::onConnectionError>>" + str + ">>" + str2);
                C0036c.a(C0036c.this, Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcEnableCheckExecuter", "UCAD0002Instance()::onConnectionSuccess");
                if (!TextUtils.equals(((UCAD0002ResponseDTO) responseDTO).getResponse().getUcfmYn(), "Y")) {
                    LogHelper.d("NfcEnableCheckExecuter", "TMCR0012Instance :: onConnectionSuccess");
                    C0036c.a(C0036c.this, TmoneyCallback.ResultType.SUCCESS);
                } else if (!C0036c.a(C0036c.this, 0)) {
                    C0036c.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_INIT_PURCHASE));
                } else if (C0036c.this.purseList()) {
                    C0036c.b(C0036c.this);
                } else {
                    C0036c.this.onResult(Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_EXCEPTION));
                }
            }
        }).execute(c0036c.n());
        int i2 = onNavigationEvent + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ void a(C0036c c0036c, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        LogHelper.d("NfcEnableCheckExecuter", "onLoadResult(" + resultType + ")");
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(c0036c.n(), 0, 0);
            LogHelper.d("NfcEnableCheckExecuter", "BeforeBalance >> 0, AfterBalance >> 0");
        }
        c0036c.onResult(resultType);
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
    }

    static /* synthetic */ boolean a(C0036c c0036c, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onNavigationEvent = i3 % 128;
        boolean zA = c0036c.a(i3 % 2 == 0 ? 1 : 0);
        int i4 = IAuthTabCallback + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return zA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void b(C0036c c0036c) {
        int i = 2 % 2;
        LogHelper.d("NfcEnableCheckExecuter", "requestUCAD()");
        ArrayList<String> arrayList = c0036c.g;
        new al(c0036c.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.c.3
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                LogHelper.d("NfcEnableCheckExecuter", "UCAD0001Instance :: onConnectionError");
                C0036c.this.onResult(Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcEnableCheckExecuter", "UCAD0001Instance :: onConnectionSuccess");
                C0036c.a(C0036c.this, TmoneyCallback.ResultType.SUCCESS);
            }
        }).execute(c0036c.b(), (String[]) arrayList.toArray(new String[arrayList.size()]), c0036c.f, c0036c.d(), c0036c.n());
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    @Override // com.tmoney.g.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        String str;
        int i = 2 % 2;
        int iExecute = super.execute(dVar, resultType, true);
        if (resultType != TmoneyCallback.ResultType.SUCCESS) {
            onResult(resultType);
            return iExecute;
        }
        LogHelper.d("NfcEnableCheckExecuter", "enableCheckTopupPlate()");
        if (!this.c.equals("A8")) {
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 56 / 0;
                if (this.c.equals("C0")) {
                    str = "02";
                } else {
                    str = "01";
                    if (!this.c.equals("01")) {
                        int i4 = IAuthTabCallback + 57;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        if (!this.c.equals("C5")) {
                            if (!this.c.equals("B4")) {
                                int i6 = onNavigationEvent + 121;
                                IAuthTabCallback = i6 % 128;
                                int i7 = i6 % 2;
                                if (!this.c.equals("BB")) {
                                    if (!(!this.c.equals("B5"))) {
                                        int i8 = onNavigationEvent + 69;
                                        IAuthTabCallback = i8 % 128;
                                        int i9 = i8 % 2;
                                    } else {
                                        this.c.equals("C8");
                                    }
                                }
                            }
                            str = "11";
                        } else {
                            int i10 = onNavigationEvent + 93;
                            IAuthTabCallback = i10 % 128;
                            if (i10 % 2 != 0) {
                                throw null;
                            }
                            str = "12";
                        }
                    }
                }
            } else if (!this.c.equals("C0")) {
            }
        }
        Z z = new Z(this.mContext, new AbstractC0045f.a() { // from class: com.tmoney.b.c.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                LogHelper.d("NfcEnableCheckExecuter", "TMCR0012Instance()::onConnectionError>>" + str2 + ">>" + str3);
                C0036c.a(C0036c.this, Callback.warning(ResultError.SERVER_ERROR, str2, str3));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                LogHelper.d("NfcEnableCheckExecuter", "TMCR0012Instance()::onConnectionSuccess");
                C0036c.a(C0036c.this);
            }
        });
        String strN = n();
        Object[] objArr = new Object[1];
        u(new int[]{0, 1, 0, 1}, true, new byte[]{0}, objArr);
        z.execute("", strN, ((String) objArr[0]).intern(), str);
        return iExecute;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (android.text.TextUtils.equals(r6.getSW(), "6A83") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        r5 = new java.lang.Object[1];
        u(new int[]{1, 1, 119, 1}, false, new byte[]{0}, r5);
        r2 = ((java.lang.String) r5[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        r5 = new java.lang.Object[1];
        u(new int[]{2, 1, 0, 1}, false, new byte[]{0}, r5);
        r2 = ((java.lang.String) r5[0]).intern();
        r3 = com.tmoney.b.C0036c.IAuthTabCallback + 33;
        com.tmoney.b.C0036c.onNavigationEvent = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if ((r3 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        r3 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        r11.f = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        r1 = com.tmoney.b.C0036c.onNavigationEvent + 83;
        com.tmoney.b.C0036c.IAuthTabCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r0 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r2 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean purseList() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LogHelper.d("NfcEnableCheckExecuter", "purseList()");
        try {
            this.g.clear();
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
                this.g.add(com.tmoney.e.a.a.bytesToHexString(bArrA));
                i4 = i5;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void u(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int i7 = $11 + 67;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 25;
                $11 = i10 % 128;
                int i11 = i10 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.indexOf((CharSequence) "", '0')), 35 - Color.green(0), TextUtils.getOffsetAfter("", 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10934), 65 - ((Process.getThreadPriority(0) + 20) >> 6), 16718 - Color.blue(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), Gravity.getAbsoluteGravity(0, 0) + 29, 17657 - TextUtils.getOffsetAfter("", 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.argb(0, 0, 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 70, 12486 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
