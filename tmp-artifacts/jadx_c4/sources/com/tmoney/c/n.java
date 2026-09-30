package com.tmoney.c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.dto.PayMethodInfoDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.D;
import com.tmoney.kscc.sslio.a.G;
import com.tmoney.kscc.sslio.a.R;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class n extends BaseTmoneyCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = -5777668605072197635L;
    private static int onExtraCallbackWithResult = 1;
    AbstractC0045f.a a;
    private final String b;
    private TmoneyData c;
    private String d;
    private PayMethodInfoDto e;
    private AbstractC0045f.a f;

    public n(Context context, String str, PayMethodInfoDto payMethodInfoDto, ResultListener resultListener) throws Throwable {
        super(context, resultListener);
        this.b = "PrePaidCreditCardRegistInstance";
        Object[] objArr = new Object[1];
        g(new char[]{13051}, ImageFormat.getBitsPerPixel(0) + 49140, objArr);
        this.d = ((String) objArr[0]).intern();
        this.f = new AbstractC0045f.a() { // from class: com.tmoney.c.n.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                n.a(n.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str2).setMessage(str3));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                new D(n.a(n.this), n.this.a).execute();
            }
        };
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.c.n.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                n.c(n.this, TmoneyCallback.ResultType.SUCCESS.setError(ResultError.SERVER_ERROR).setDetailCode(str2).setMessage(str3));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
                MBR0003ResponseDTO mBR0003ResponseDTO = (MBR0003ResponseDTO) responseDTO;
                n.b(n.this).setTmoneyData(mBR0003ResponseDTO);
                n.b(n.this, TmoneyCallback.ResultType.SUCCESS.setDetailCode(mBR0003ResponseDTO.getResponse().getRspCd()).setMessage(mBR0003ResponseDTO.getResponse().getRspMsg()));
            }
        };
        LogHelper.d("PrePaidCreditCardRegistInstance", "PrePaidCreditCardRegistInstance");
        this.c = TmoneyData.getInstance(context);
        this.e = payMethodInfoDto;
        this.d = str;
    }

    static /* synthetic */ Context a(n nVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Context context = nVar.mContext;
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return context;
    }

    static /* synthetic */ void a(n nVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        nVar.onResult(resultType);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        int i5 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
    }

    static /* synthetic */ TmoneyData b(n nVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TmoneyData tmoneyData = nVar.c;
        int i5 = i2 + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return tmoneyData;
    }

    static /* synthetic */ void b(n nVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        nVar.onResult(resultType);
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void c(n nVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        nVar.onResult(resultType);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void executeRegist() {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        g(new char[]{13051}, 49139 - Color.red(0), objArr);
        if (!((String) objArr[0]).intern().equals(this.d)) {
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!"3".equals(this.d)) {
                int i4 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr2 = new Object[1];
                g(new char[]{13048}, 5827 - KeyEvent.keyCodeFromString(""), objArr2);
                if (((String) objArr2[0]).intern().equals(this.d)) {
                    new G(this.mContext, this.f).execute();
                    return;
                }
                return;
            }
        }
        new R(this.mContext, this.f).execute(this.e.getCrdtChecPntDvsCd(), this.e.getCardCompayCode(), this.e.getCreditCardNo(), this.e.getExpire(), this.e.getPwd(), this.e.getBirthDay(), this.e.getSex(), !(this.e.isForeign() ^ true) ? "Y" : "N", this.e.getCvc(), "N", "", "", this.e.getPaymethodVal());
        int i6 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(char[] cArr, int i, Object[] objArr) throws Throwable {
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
            int i3 = $11 + 73;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 24 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 59, TextUtils.indexOf("", "") + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 43;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i8 = $11 + 29;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i10 = $10 + 103;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 58 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 6383 - View.getDefaultSize(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, 6382 - TextUtils.lastIndexOf("", '0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }
}
