package com.tmoney.c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.I;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.MBR0019ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r extends BaseTmoneyCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static long onWarmupCompleted = 7825047876890854027L;
    private final String a;
    private String b;
    private String c;
    private AbstractC0045f.a d;

    public r(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "SpayOtaKeyInstance";
        this.d = new AbstractC0045f.a() { // from class: com.tmoney.c.r.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                r.b(r.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                MBR0019ResponseDTO mBR0019ResponseDTO = (MBR0019ResponseDTO) responseDTO;
                r.a(r.this, mBR0019ResponseDTO.getResponse().getPbmdVal());
                r.b(r.this, mBR0019ResponseDTO.getResponse().getPbexVal());
                r rVar = r.this;
                r.a(rVar, TmoneyCallback.ResultType.SUCCESS.setData(r.a(rVar), r.b(r.this)));
            }
        };
        LogHelper.d("SpayOtaKeyInstance", "SpayOtaKeyInstance");
    }

    static /* synthetic */ String a(r rVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = rVar.b;
        int i5 = i2 + 85;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ String a(r rVar, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        rVar.b = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    static /* synthetic */ void a(r rVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        rVar.onResult(resultType);
        if (i3 != 0) {
            throw null;
        }
    }

    static /* synthetic */ String b(r rVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = rVar.c;
        int i5 = i2 + 73;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ String b(r rVar, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        rVar.c = str;
        int i5 = i3 + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static /* synthetic */ void b(r rVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        rVar.onResult(resultType);
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void executeOtaKey() throws Throwable {
        int i = 2 % 2;
        I i2 = new I(this.mContext, this.d);
        Object[] objArr = new Object[1];
        e(new char[]{34701}, 22541 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        i2.execute(((String) objArr[0]).intern());
        int i3 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = $11 + 13;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 24 - Color.argb(0, 0, 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() % (onWarmupCompleted ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 59, 6383 - Drawable.resolveOpacity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 19627 - Color.green(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - (ViewConfiguration.getEdgeSlop() >> 16), 6383 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 19;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 59 - View.MeasureSpec.makeMeasureSpec(0, 0), 6383 - (ViewConfiguration.getTouchSlop() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 59 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 6383 - (KeyEvent.getMaxKeyCode() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }
}
