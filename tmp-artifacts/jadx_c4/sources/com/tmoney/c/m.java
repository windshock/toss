package com.tmoney.c;

import android.content.Context;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.TmoneyInfo;
import com.tmoney.dto.PayMethodInfoDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.C0053u;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class m extends BaseTmoneyCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static char[] onNavigationEvent = {27222, 27223};
    private static int onWarmupCompleted = 1;
    AbstractC0045f.a a;
    private final String b;
    private TmoneyData c;
    private int d;
    private String e;
    private PayMethodInfoDto f;
    private AbstractC0045f.a g;

    public m(Context context, PayMethodInfoDto payMethodInfoDto, ResultListener resultListener) throws Throwable {
        String strIntern;
        super(context, resultListener);
        this.b = "PostPaidCreditCardRegistInstance";
        this.d = 0;
        this.g = new 1(this);
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.c.m.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                m.a(m.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
                MBR0003ResponseDTO mBR0003ResponseDTO = (MBR0003ResponseDTO) responseDTO;
                m.a(m.this).setTmoneyData(mBR0003ResponseDTO);
                m.a(m.this, TmoneyCallback.ResultType.SUCCESS.setDetailCode(mBR0003ResponseDTO.getResponse().getRspCd()).setMessage(mBR0003ResponseDTO.getResponse().getRspMsg()));
            }
        };
        LogHelper.d("PostPaidCreditCardRegistInstance", "PostPaidCreditCardRegistInstance");
        this.c = TmoneyData.getInstance(context);
        this.f = payMethodInfoDto;
        this.d = TmoneyInfo.getInstance(this.mContext).getLimiteAmountPostPaid(payMethodInfoDto.getCardCompayCode());
        if (!TmoneyInfo.getInstance(this.mContext).isCreditPostPaid(payMethodInfoDto.getCardCompayCode())) {
            Object[] objArr = new Object[1];
            h(new int[]{1, 1, 0, 0}, true, new byte[]{0}, objArr);
            strIntern = ((String) objArr[0]).intern();
            int i = onWarmupCompleted + 73;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
            }
            this.e = strIntern;
        }
        Object[] objArr2 = new Object[1];
        h(new int[]{0, 1, 0, 1}, true, new byte[]{1}, objArr2);
        strIntern = ((String) objArr2[0]).intern();
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        this.e = strIntern;
    }

    static /* synthetic */ TmoneyData a(m mVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TmoneyData tmoneyData = mVar.c;
        if (i3 == 0) {
            return tmoneyData;
        }
        throw null;
    }

    static /* synthetic */ void a(m mVar, TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mVar.onResult(resultType);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        int i5 = IAuthTabCallback + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
    }

    static /* synthetic */ Context b(m mVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Context context = mVar.mContext;
        int i4 = IAuthTabCallback + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return context;
        }
        throw null;
    }

    public final void executeRegist() {
        String str;
        int i = 2 % 2;
        C0053u c0053u = new C0053u(this.mContext, this.g);
        String cardCompayCode = this.f.getCardCompayCode();
        String str2 = this.e;
        String creditCardNo = this.f.getCreditCardNo();
        String birthDay = this.f.getBirthDay();
        String expire = this.f.getExpire();
        String sex = this.f.getSex();
        String cvc = this.f.getCvc();
        String pwd = this.f.getPwd();
        if (!this.f.isForeign()) {
            str = "N";
        } else {
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            str = "Y";
        }
        c0053u.execute(cardCompayCode, str2, creditCardNo, birthDay, expire, sex, cvc, pwd, str, String.format("%d", Integer.valueOf(this.d)), this.f.getPaymethodVal());
        int i4 = IAuthTabCallback + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
    }

    private static void h(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int i6 = $11 + 67;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35, 14238 - ExpandableListView.getPackedPositionChild(0L), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $10 + 71;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 10935), KeyEvent.keyCodeFromString("") + 65, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, 17657 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.indexOf("", "", 0, 0)), MotionEvent.axisFromString("") + 71, 12486 - (ViewConfiguration.getPressedStateDuration() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i12, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i13 = $10 + 55;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
