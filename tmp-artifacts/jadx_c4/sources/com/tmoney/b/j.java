package com.tmoney.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.al;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class j extends com.tmoney.g.a.a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 4416;
    private static int asInterface = 1;
    private static char onExtraCallback = 520;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 49917;
    private static char onWarmupCompleted = 6154;
    private final String a;
    private com.tmoney.f.a.a b;
    private String[] c;
    private String d;
    private String e;
    private AbstractC0045f.a f;

    public j(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyAckExecuter";
        this.f = new AbstractC0045f.a() { // from class: com.tmoney.b.j.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                j.a(j.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                j.a(j.this, TmoneyCallback.ResultType.SUCCESS);
            }
        };
        this.b = new com.tmoney.f.a.a();
    }

    static /* synthetic */ void a(j jVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        jVar.onResult(resultType);
        int i4 = asInterface + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.execute(dVar, resultType);
        if (i3 != 0) {
            TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            try {
                byte[] bArr = new byte[560];
                for (int i4 = 0; i4 < 560; i4++) {
                    int i5 = onExtraCallbackWithResult + 27;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    bArr[i4] = 0;
                }
                ArrayList<byte[]> purseListOrSwCode = this.b.getPurseListOrSwCode(dVar);
                this.c = new String[purseListOrSwCode.size()];
                Object[] objArr = new Object[1];
                u(new char[]{17513, 2553}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr);
                this.d = ((String) objArr[0]).intern();
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i7 >= purseListOrSwCode.size()) {
                        break;
                    }
                    int i9 = asInterface + 35;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    if (purseListOrSwCode.get(0).length == 2) {
                        System.arraycopy(purseListOrSwCode.get(0), 0, bArr, i8, 2);
                        this.c[0] = new String(com.tmoney.e.a.a.bytesToHexString(purseListOrSwCode.get(0)));
                        if (TextUtils.equals(this.c[0], "6A83")) {
                            Object[] objArr2 = new Object[1];
                            u(new char[]{28653, 41020}, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
                            this.d = ((String) objArr2[0]).intern();
                            this.c = new String[0];
                        } else {
                            Object[] objArr3 = new Object[1];
                            u(new char[]{17513, 2553}, View.getDefaultSize(0, 0) + 1, objArr3);
                            this.d = ((String) objArr3[0]).intern();
                            this.c = new String[0];
                            int i11 = onExtraCallbackWithResult + 51;
                            asInterface = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 3 % 3;
                            }
                        }
                    } else {
                        System.arraycopy(purseListOrSwCode.get(i7), 0, bArr, i8, 28);
                        i8 += 28;
                        this.c[i7] = new String(com.tmoney.e.a.a.bytesToHexString(purseListOrSwCode.get(i7)));
                        Object[] objArr4 = new Object[1];
                        u(new char[]{40570, 54234}, 1 - Drawable.resolveOpacity(0, 0), objArr4);
                        this.d = ((String) objArr4[0]).intern();
                        i7++;
                    }
                }
                if (a(0)) {
                    this.e = d();
                }
                new al(getContext(), this.f).execute(b(), this.c, this.d, this.e);
                return p();
            } catch (Exception e) {
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_SERVER;
                onResult(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog(e.getMessage()).setException(e));
            }
        }
        onResult(resultType);
        return p();
    }

    private static void u(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i3 = $11 + 89;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 37;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 10 - ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getMode(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 9 - MotionEvent.axisFromString(""), 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i9 = $10 + 11;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 14 - (ViewConfiguration.getScrollBarSize() >> 8), 19901 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
