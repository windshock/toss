package com.tmoney.c;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skp.smarttouch.sem.SEManagerConnection;
import com.skp.smarttouch.sem.std.Transportation;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.dao.SEMDispatchData;
import com.skp.smarttouch.sem.tools.dao.SEMResultData;
import com.tmoney.TmoneyMsg;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class z extends BaseTmoneyCallback {
    private final String a;
    private com.tmoney.g.b.a b;
    private Transportation c;
    private boolean d;
    private SEManagerConnection e;
    private Handler f;

    public z(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneySktIssueInstance";
        this.d = false;
        this.e = new SEManagerConnection() { // from class: com.tmoney.c.z.1
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 0;
            private static char[] onNavigationEvent = {27252, 27199, 27170, 27170, 27168, 27197, 27196};
            private static int onWarmupCompleted = 1;

            public final void onDispatchAPI(SEMDispatchData sEMDispatchData) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 55;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0044  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onResultAPI(SEMResultData sEMResultData) throws Throwable {
                String str;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int code = sEMResultData.getResultCode().getCode();
                String message = sEMResultData.getResultCode().getMessage();
                if (!TextUtils.isEmpty(message)) {
                    b(new int[]{0, 7, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1}, new Object[1]);
                    if (!(!message.contains(((String) r8[0]).intern()))) {
                        message = ResultDetailCode.ISSUE_ERROR.getMessage();
                    }
                }
                String strMakeMessage = TmoneyMsg.makeMessage("S", sEMResultData.getResultCode().getCode(), message);
                try {
                    str = (String) sEMResultData.getData();
                } catch (Exception unused) {
                }
                if (str == null) {
                    int i4 = onWarmupCompleted + 103;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    str = "";
                }
                try {
                    LogHelper.d("TmoneySktIssueInstance", "onResultAPI data : " + str + ", code : " + code + ", message : " + sEMResultData.getResultCode().getMessage() + ", type : " + sEMResultData.getType());
                } catch (Exception unused2) {
                }
                if (APITypeCode.STD_TRP_REQUEST_IS_TRANS_ISSUED.equals(sEMResultData.getType())) {
                    if (!APIResultCode.SUCCESS.equals(sEMResultData.getResultCode())) {
                        z.a(z.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.ISSUE_ERROR).setDetailCode(ResultDetailCode.ISSUE_ERROR.getCodeString()).setMessage(strMakeMessage));
                        return;
                    }
                    if ("NONE".equals(str)) {
                        z.d(z.this);
                        return;
                    }
                    if ("DELETED".equals(str)) {
                        z.d(z.this);
                        return;
                    }
                    if (!"INSTALLED".equals(str)) {
                        z.a(z.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.ISSUE_ERROR).setDetailCode(ResultDetailCode.ISSUE_ERROR.getCodeString()).setMessage(strMakeMessage));
                        return;
                    }
                    z.a(z.this, TmoneyCallback.ResultType.SUCCESS);
                    int i6 = onExtraCallback + 39;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
                if (APITypeCode.STD_TRP_REQUEST_ISSUE_TRANSPORTATION.equals(sEMResultData.getType())) {
                    if (!APIResultCode.SUCCESS.equals(sEMResultData.getResultCode())) {
                        z.a(z.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.ISSUE_ERROR).setDetailCode(ResultDetailCode.ISSUE_ERROR.getCodeString()).setMessage(strMakeMessage));
                        int i8 = onExtraCallback + 67;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        return;
                    }
                    int i10 = onWarmupCompleted + 109;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    LogHelper.d("TmoneySktIssueInstance", "1차 발급 성공");
                    if (i11 != 0) {
                        TmoneyData.getInstance(z.this.getContext()).setTmoney2IssueFromEnableChek(true);
                        z.a(z.this, TmoneyCallback.ResultType.SUCCESS);
                    } else {
                        TmoneyData.getInstance(z.this.getContext()).setTmoney2IssueFromEnableChek(true);
                        z.a(z.this, TmoneyCallback.ResultType.SUCCESS);
                    }
                }
            }

            public final void onServiceConnected(String str) {
                int i = 2 % 2;
                LogHelper.d("TmoneySktIssueInstance", "onServiceConnected [" + str + "][" + z.this.c.getTranitpassYn() + "]");
                z.b(z.this);
                int i2 = onExtraCallback + 55;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            }

            public final void onServiceDisconnected(String str, int i) {
                int i2 = 2 % 2;
                LogHelper.d("TmoneySktIssueInstance", "onServiceDisconnected [" + str + "][" + i + "]");
                if (str.endsWith("STD_TRP")) {
                    int i3 = onWarmupCompleted + 115;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    if (i == 0) {
                        return;
                    }
                }
                if (!(!z.this.d)) {
                    return;
                }
                int i4 = onWarmupCompleted + 123;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                try {
                    ResultDetailCode detailCode = ResultDetailCode.getDetailCode(i);
                    if (detailCode != ResultDetailCode.UNKNOWN) {
                        TmoneyCallback.ResultType message = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR).setDetailCode(detailCode.getCodeString()).setMessage(detailCode.getMessage());
                        if (detailCode == ResultDetailCode.SKT_SEIO_SEM_85) {
                            message = TmoneyCallback.ResultType.TODO.setError(ResultError.SKT_SEIO_UPDATE).setDetailCode(detailCode.getCodeString()).setMessage(detailCode.getMessage());
                            int i6 = onWarmupCompleted + 7;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                        }
                        z.a(z.this, message);
                        return;
                    }
                    z.a(z.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR).setDetailCode(ResultDetailCode.getDetailCode(i).getCodeString()).setMessage("[" + str + "]" + TmoneyMsg.getSktMsg(i)));
                } catch (Exception e) {
                    LogHelper.exception("TmoneySktIssueInstance", e);
                }
            }

            private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i = 2;
                int i2 = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = iArr[2];
                int i6 = iArr[3];
                char[] cArr = onNavigationEvent;
                if (cArr != null) {
                    int i7 = $11 + 121;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $10 + 123;
                        $11 = i10 % 128;
                        int i11 = i10 % i;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16812499), 35 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
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
                    int i12 = $10 + 115;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    char[] cArr4 = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    char c = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                            int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 10936), ExpandableListView.getPackedPositionType(0L) + 65, 16719 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i14] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } else {
                            int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17657 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        }
                        c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.red(0)), 71 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    cArr3 = cArr4;
                }
                if (i6 > 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr5, 0, i4);
                    int i16 = i4 - i6;
                    System.arraycopy(cArr5, 0, cArr3, i16, i6);
                    System.arraycopy(cArr5, i6, cArr3, 0, i16);
                }
                if (z) {
                    char[] cArr6 = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    int i17 = $10 + 95;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    cArr3 = cArr6;
                }
                if (i5 > 0) {
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        int i19 = $10 + 67;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                }
                String str = new String(cArr3);
                int i21 = $10 + 35;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                objArr[0] = str;
            }
        };
        this.f = new Handler(Looper.getMainLooper()) { // from class: com.tmoney.c.z.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                String message2;
                try {
                    TmoneyCallback.ResultType message3 = (TmoneyCallback.ResultType) message.obj;
                    if (message3 != TmoneyCallback.ResultType.SUCCESS && "-13".equals(message3.getDetailCode()) && (message2 = message3.getMessage()) != null) {
                        if (message2.contains("922") || message2.contains("923") || message2.contains("924") || message2.contains("933") || message2.contains("943") || message2.contains("944")) {
                            LogHelper.sendAppLog("NOT_SUPPORT", "TmoneySktEnableInstance resMsg:" + message2, CodeConstants.E_SAVEAPPLOG.CREATE);
                            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.NOT_SUPPORT);
                            ResultDetailCode resultDetailCode = ResultDetailCode.NOT_SUPPORT_TMONEY;
                            message3 = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
                        } else {
                            message3.setMessage(TmoneyMsg.makeUsimMessage("S", message3.getDetailCode(), message2));
                        }
                    }
                    z.this.onResult(message3);
                } catch (Exception e) {
                    LogHelper.exception("TmoneySktIssueInstance", e);
                }
            }
        };
        this.b = com.tmoney.g.b.a.getInstance(context);
    }

    static /* synthetic */ void a(z zVar, TmoneyCallback.ResultType resultType) {
        int i = resultType.getDetailCode().equals(ResultDetailCode.SKT_SEIO_CONN.getCodeString()) ? 0 : 300;
        LogHelper.d("TmoneySktIssueInstance", "onTmoneySktOtaResult " + resultType + "(delay:" + i + ") " + resultType.getError() + "/" + resultType.getMessage());
        try {
            Transportation transportation = zVar.c;
            if (transportation != null && !zVar.d) {
                transportation.finalize();
                zVar.c = null;
                zVar.d = true;
            }
        } catch (Exception unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = resultType;
        zVar.f.sendMessageDelayed(messageObtain, i);
    }

    static /* synthetic */ void b(z zVar) {
        LogHelper.d("TmoneySktIssueInstance", "requestIsTransIssued");
        zVar.c.requestIsTransIssued("D4100000030001");
    }

    static /* synthetic */ void d(z zVar) {
        LogHelper.d("TmoneySktIssueInstance", "requestIssueTransportation");
        zVar.c.requestIssueTransportation("D4100000030001");
    }

    public final void excuteSktOta() {
        LogHelper.d("TmoneySktIssueInstance", "initializeTransportation");
        Transportation transportation = Transportation.getInstance(this.mContext);
        this.c = transportation;
        transportation.initialize(this.b.getSkStId(), this.e);
    }
}
