package com.tmoney.c;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.tmoney.dto.PointRequestData;
import com.tmoney.dto.PointResult;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import java.lang.reflect.Method;
import java.util.HashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class j extends C0041b {
    private static short[] IAuthTabCallback;
    private final String b;
    private com.tmoney.d.a c;
    private O d;
    private static final byte[] $$a = {48, -42, 66, -37};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = 1950780247;
    private static int onExtraCallback = -1538795464;
    private static int onWarmupCompleted = -1674869534;
    private static byte[] onNavigationEvent = {-36, 61, 107, 77};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = i * 3;
        byte[] bArr = $$a;
        int i4 = (b * 4) + 4;
        int i5 = 115 - (s * 3);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4++;
            i5 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i4];
            i4++;
            i5 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    public j(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "PointInterface";
        this.d = O.getInstance();
        this.c = com.tmoney.d.a.getInstance();
    }

    static /* synthetic */ void a(j jVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        jVar.onResult(resultType);
        int i4 = asInterface + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void b(j jVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        jVar.onResult(resultType);
        int i4 = asInterface + 65;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void c(j jVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        jVar.onResult(resultType);
        int i4 = asInterface + 45;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void d(j jVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        jVar.onResult(resultType);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void request() {
        int i = 2 % 2;
        PointRequestData pointRequestData = new PointRequestData();
        pointRequestData.setCmd("I310001");
        pointRequestData.setCardNo(this.a.getCardNumber());
        pointRequestData.setToken(this.c.getPointAppToken());
        String json = new Gson().toJson(pointRequestData);
        this.a.setPointDataReset();
        HashMap<String, String> map = new HashMap<>();
        Object[] objArr = new Object[1];
        e((short) (View.MeasureSpec.getSize(0) - 77), (byte) (4 - Process.getGidForName("")), 805219489 + TextUtils.getOffsetAfter("", 0), (-946625670) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) - 49, objArr);
        map.put(((String) objArr[0]).intern(), json);
        this.d.post(this.c.getPointUrl(this.a.getServerType()), map);
        this.d.setListener(new O.a() { // from class: com.tmoney.c.j.1
            @Override // com.tmoney.kscc.sslio.a.O.a
            public final void onResultType(TmoneyCallback.ResultType resultType) throws Throwable {
                TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
                if (resultType != resultType2) {
                    j.d(j.this, resultType);
                    return;
                }
                try {
                    PointResult pointResult = (PointResult) new Gson().fromJson(resultType.getData()[0].toString(), PointResult.class);
                    if (!TextUtils.equals(pointResult.getResultCode(), CodeConstants.RSP_CD_SUCCESS)) {
                        j.b(j.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(pointResult.getResultCode()).setMessage(pointResult.getResultMessage()));
                        return;
                    }
                    pointResult.setCommand("I310001");
                    j.this.a.setPointDataResult(pointResult);
                    j.a(j.this, resultType2.setData(pointResult.getResultData()));
                } catch (Exception e) {
                    j jVar = j.this;
                    TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                    ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_SERVER;
                    j.c(jVar, error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog(e.getMessage()).setException(e));
                }
            }
        });
        int i2 = asBinder + 117;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (-16777174) - Color.rgb(0, 0, 0), 22439 - TextUtils.indexOf("", "", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 55 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.green(0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 43424), 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((Process.getThreadPriority(0) + 20) >> 6) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    int i7 = $11 + 111;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i9 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j));
                if (z2) {
                    int i10 = $10 + 21;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i9 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 85, ExpandableListView.getPackedPositionType(0L) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $10 + 33;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
