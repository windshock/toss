package com.tmoney;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.tmoney.Tmoney;
import com.tmoney.TmoneyConstants;
import com.tmoney.b.A;
import com.tmoney.b.C;
import com.tmoney.b.C0034a;
import com.tmoney.b.C0035b;
import com.tmoney.b.C0036c;
import com.tmoney.b.C0037d;
import com.tmoney.b.C0038e;
import com.tmoney.b.C0039f;
import com.tmoney.b.D;
import com.tmoney.b.E;
import com.tmoney.b.F;
import com.tmoney.b.i;
import com.tmoney.b.j;
import com.tmoney.b.k;
import com.tmoney.b.l;
import com.tmoney.b.o;
import com.tmoney.b.p;
import com.tmoney.b.q;
import com.tmoney.b.t;
import com.tmoney.b.u;
import com.tmoney.b.y;
import com.tmoney.b.z;
import com.tmoney.c.C0040a;
import com.tmoney.c.f;
import com.tmoney.c.g;
import com.tmoney.c.h;
import com.tmoney.c.m;
import com.tmoney.c.n;
import com.tmoney.c.r;
import com.tmoney.c.s;
import com.tmoney.c.v;
import com.tmoney.c.w;
import com.tmoney.c.x;
import com.tmoney.dto.DiscountNDeductionInfoDto;
import com.tmoney.dto.MembershipDto;
import com.tmoney.dto.MembershipItemDto;
import com.tmoney.dto.PayMethodInfoDto;
import com.tmoney.dto.PointResultData;
import com.tmoney.g.a.d;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.B;
import com.tmoney.kscc.sslio.a.C0044e;
import com.tmoney.kscc.sslio.a.C0050n;
import com.tmoney.kscc.sslio.a.J;
import com.tmoney.kscc.sslio.a.N;
import com.tmoney.kscc.sslio.a.ak;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.DCRG0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.utils.SessionCookieMgr;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.ota.a.b;
import com.tmoney.ota.a.c;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.Callback;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class a {
    private static short[] IAuthTabCallback = null;
    public static final String TAG = "TmoneyOld";
    private static Context a;
    private static a b;
    private static TmoneyData c;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private static final byte[] $$a = {35, -27, Byte.MIN_VALUE, 50};
    private static final int $$b = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1778375682;
    private static int onExtraCallback = -1538795431;
    private static int onNavigationEvent = 834827254;
    private static byte[] onExtraCallbackWithResult = {8, 8};

    /* renamed from: com.tmoney.a$13, reason: invalid class name */
    final class AnonymousClass13 implements ResultListener {
        final /* synthetic */ MembershipItemDto a;
        final /* synthetic */ String b;
        final /* synthetic */ ResultListener c;

        AnonymousClass13(MembershipItemDto membershipItemDto, String str, ResultListener resultListener) {
            this.a = membershipItemDto;
            this.b = str;
            this.c = resultListener;
        }

        @Override // com.tmoney.listener.ResultListener
        public final void onResult(TmoneyCallback.ResultType resultType) {
            TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
            if (resultType != resultType2) {
                this.c.onResult(resultType);
                return;
            }
            if (((String) resultType.getData()[1]).equals(CodeConstants.DEFAULT_CARD_NO)) {
                a.a(a.this, this.a, CodeConstants.MEMBERSHIP_STATE_CD.ISSUE.getCode(), new ResultListener() { // from class: com.tmoney.a.13.1
                    @Override // com.tmoney.listener.ResultListener
                    public final void onResult(TmoneyCallback.ResultType resultType3) throws NumberFormatException {
                        if (resultType3 != TmoneyCallback.ResultType.SUCCESS) {
                            AnonymousClass13.this.c.onResult(resultType3);
                        } else {
                            AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                            a.a(a.this, anonymousClass13.a.getDtaRecSno(), "", CodeConstants.MEMBERSHIP_STATE_CD.ISSUE, new ResultListener() { // from class: com.tmoney.a.13.1.1
                                @Override // com.tmoney.listener.ResultListener
                                public final void onResult(TmoneyCallback.ResultType resultType4) {
                                    if (resultType4 == TmoneyCallback.ResultType.SUCCESS) {
                                        Object[] data = resultType4.getData();
                                        resultType4.setData(new MembershipDto(AnonymousClass13.this.b, data[1].toString(), data[2].toString()));
                                    }
                                    AnonymousClass13.this.c.onResult(resultType4);
                                }
                            });
                        }
                    }
                });
                return;
            }
            if (resultType == resultType2) {
                Object[] data = resultType.getData();
                resultType.setData(new MembershipDto(this.b, data[1].toString(), data[2].toString()));
            }
            this.c.onResult(resultType);
        }
    }

    /* renamed from: com.tmoney.a$18, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass18 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TmoneyConstants.TelecomType.values().length];
            b = iArr;
            try {
                iArr[TmoneyConstants.TelecomType.SktSeio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[TmoneyConstants.TelecomType.Kt.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[TmoneyConstants.TelecomType.Lgu.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[TmoneyConstants.PayMethodType.values().length];
            a = iArr2;
            try {
                iArr2[TmoneyConstants.PayMethodType.CreditCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[TmoneyConstants.PayMethodType.PhoneBill.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.tmoney.a$3, reason: invalid class name */
    public final class AnonymousClass3 implements ResultListener {
        public static int onExtraCallback;
        public static int onWarmupCompleted;
        private /* synthetic */ ResultListener a;

        AnonymousClass3(ResultListener resultListener) {
            this.a = resultListener;
        }

        public static int onWarmupCompleted() {
            int i = onExtraCallback;
            int i2 = i % 7787231;
            onExtraCallback = i + 1;
            if (i2 != 0) {
                return onWarmupCompleted;
            }
            int iMyUid = Process.myUid();
            onWarmupCompleted = iMyUid;
            return iMyUid;
        }

        @Override // com.tmoney.listener.ResultListener
        public final void onResult(TmoneyCallback.ResultType resultType) {
            a.this.ackCheck(resultType);
            this.a.onResult(resultType);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2 = s + 4;
        int i3 = (s3 * 4) + 115;
        int i4 = s2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i3 += i5;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i++;
            i5 = bArr[i2];
            i3 += i5;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    static /* synthetic */ int a(a aVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 73;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = aVar.d;
        if (i4 == 0) {
            throw null;
        }
        int i6 = i2 + 43;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    static /* synthetic */ int a(a aVar, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        aVar.d = 0;
        int i6 = i3 + 43;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ TmoneyData a() {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        TmoneyData tmoneyData = c;
        int i4 = i3 + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return tmoneyData;
    }

    static /* synthetic */ void a(a aVar, MembershipItemDto membershipItemDto, String str, ResultListener resultListener) {
        int i = 2 % 2;
        aVar.a((com.tmoney.g.a.a) new c(aVar.getContext(), "                ", TmoneyData.getInstance().getCardNumber(), membershipItemDto.getCardPrdId(), membershipItemDto.getDtaRecSno(), membershipItemDto.getAfltPrdId(), str, resultListener), resultListener, true);
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ void a(a aVar, final ResultListener resultListener) {
        int i = 2 % 2;
        d.getInstance().offerTask(a, new F(aVar.getContext(), new ResultListener() { // from class: com.tmoney.a.12
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    new B(a.this.getContext(), new AbstractC0045f.a() { // from class: com.tmoney.a.12.1
                        @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
                        public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                            LogHelper.d(a.TAG, ">> Payment Regist Failed");
                            resultListener.onResult(Callback.warning(ResultError.SERVER_ERROR, str, str2));
                        }

                        @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
                        public final void onConnectionSuccess(ResponseDTO responseDTO) {
                            LogHelper.d(a.TAG, ">> Payment Regist Success");
                            resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
                        }
                    }).execute("", "", "");
                } else {
                    resultListener.onResult(resultType);
                }
            }
        }), false);
        int i2 = IAuthTabCallbackStub + 1;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
    }

    static /* synthetic */ void a(a aVar, ResultListener resultListener, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        aVar.a(resultListener, i2 % 2 != 0);
        int i3 = IAuthTabCallbackStub + 9;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void a(a aVar, String str, String str2, CodeConstants.MEMBERSHIP_STATE_CD membership_state_cd, ResultListener resultListener) throws NumberFormatException {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        aVar.a(str, str2, membership_state_cd, resultListener);
        if (i3 != 0) {
            throw null;
        }
    }

    private void a(com.tmoney.g.a.a aVar, ResultListener resultListener, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        a(aVar, resultListener, z, (IsoDep) null);
        int i4 = onTransact + 61;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void a(com.tmoney.g.a.a aVar, ResultListener resultListener, boolean z, IsoDep isoDep) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            d.getInstance().offerTask(getContext(), aVar, z, isoDep);
            throw null;
        }
        if (d.getInstance().offerTask(getContext(), aVar, z, isoDep)) {
            return;
        }
        TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
        ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_TASK;
        resultListener.onResult(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setException(new Exception("Exception :: Task")));
        int i3 = IAuthTabCallbackStub + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private void a(ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            c.isTmoneyUser();
            throw null;
        }
        if (!c.isTmoneyUser()) {
            resultListener.onResult(TmoneyCallback.ResultType.SUCCESS);
            return;
        }
        if (!c()) {
            resultListener.onResult(TmoneyCallback.ResultType.SUCCESS);
            int i3 = onTransact + 51;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        new com.tmoney.c.d(getContext(), resultListener).executeLiveCheck();
        int i4 = IAuthTabCallbackStub + 57;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
    }

    private void a(final ResultListener resultListener, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!z && !TextUtils.isEmpty(c.getPpyDpyDvsCd())) {
            int i3 = IAuthTabCallbackStub + 79;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (!TextUtils.isEmpty(c.getAfltCd())) {
                int i5 = onTransact + 125;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                a(resultListener);
                return;
            }
        }
        LogHelper.d(TmoneyData.TAG, ">>>>>liveCheck : need init");
        a((com.tmoney.g.a.a) new p(getContext(), new ResultListener() { // from class: com.tmoney.a.4
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
                if (resultType == resultType2) {
                    a.b(a.this, resultListener);
                } else {
                    resultListener.onResult(resultType2);
                }
            }
        }), resultListener, true);
    }

    private void a(final String str, final String str2, final CodeConstants.MEMBERSHIP_STATE_CD membership_state_cd, final ResultListener resultListener) throws NumberFormatException {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new b(getContext(), Byte.parseByte(str), new ResultListener() { // from class: com.tmoney.a.16
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                String code;
                C0044e c0044e;
                String str3;
                if (membership_state_cd != null) {
                    String cardNumber = TmoneyData.getInstance().getCardNumber();
                    if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                        String str4 = (String) resultType.getData()[1];
                        if (str4.isEmpty() || str4.equals(CodeConstants.DEFAULT_CARD_NO)) {
                            code = (membership_state_cd == CodeConstants.MEMBERSHIP_STATE_CD.ISSUE ? CodeConstants.MEMBERSHIP_CARD_STATE_CD.ISSUE_FAILED : CodeConstants.MEMBERSHIP_CARD_STATE_CD.DELETE_SUCCESS).getCode();
                            c0044e = new C0044e(a.this.getContext(), null);
                            str3 = str2;
                        } else {
                            new C0044e(a.this.getContext(), null).execute(cardNumber, (String) resultType.getData()[0], (String) resultType.getData()[1], (membership_state_cd == CodeConstants.MEMBERSHIP_STATE_CD.ISSUE ? CodeConstants.MEMBERSHIP_CARD_STATE_CD.ISSUE_SUCCESS : CodeConstants.MEMBERSHIP_CARD_STATE_CD.DELETE_FAILED).getCode());
                        }
                    } else {
                        code = (membership_state_cd == CodeConstants.MEMBERSHIP_STATE_CD.ISSUE ? CodeConstants.MEMBERSHIP_CARD_STATE_CD.ISSUE_FAILED : CodeConstants.MEMBERSHIP_CARD_STATE_CD.DELETE_FAILED).getCode();
                        c0044e = new C0044e(a.this.getContext(), null);
                        str3 = str;
                    }
                    c0044e.execute(cardNumber, str3, CodeConstants.DEFAULT_CARD_NO, code);
                }
                resultListener.onResult(resultType);
            }
        }), resultListener, true);
        int i2 = IAuthTabCallbackStub + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ boolean a(a aVar, final TmoneyCallback.ResultType resultType, final ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        final String advertisingId = c.getAdvertisingId();
        if (TextUtils.isEmpty(advertisingId)) {
            int i4 = onTransact;
            int i5 = i4 + 37;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 41;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        String sendAdid = c.getSendAdid();
        if (!TextUtils.isEmpty(sendAdid)) {
            int i9 = onTransact + 59;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                sendAdid.equals(advertisingId);
                throw null;
            }
            if (sendAdid.equals(advertisingId)) {
                return false;
            }
        }
        new J(a, new AbstractC0045f.a() { // from class: com.tmoney.a.19
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                resultListener.onResult(resultType);
                LogHelper.d(a.TAG, eapi_const.name() + "::" + str + "::" + str2);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                a.a().setSendAdid(advertisingId);
                resultListener.onResult(resultType);
                LogHelper.d(a.TAG, "sendAdid::success");
            }
        }).execute(advertisingId);
        return true;
    }

    static /* synthetic */ int b(a aVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 5;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = aVar.d;
        aVar.d = i5 + 1;
        int i6 = i2 + 37;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ Context b() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 47;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Context context = a;
        int i5 = i2 + 71;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return context;
    }

    static /* synthetic */ void b(a aVar, ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        aVar.a(resultListener);
        int i4 = onTransact + 59;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ int c(a aVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2 == 0 ? aVar.f : aVar.f + 1;
        aVar.f = i4;
        int i5 = i3 + 121;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static boolean c() throws NumberFormatException {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long liveCheckTime = c.getLiveCheckTime();
        long j = jCurrentTimeMillis - liveCheckTime;
        int liveCheckCycle = c.getLiveCheckCycle();
        LogHelper.d(TmoneyData.TAG, String.format("LiveCheck IntervalMinute:%s", Integer.valueOf((liveCheckCycle / 60) / 1000)));
        int i4 = liveCheckCycle - 300000;
        long j2 = i4;
        LogHelper.d(TmoneyData.TAG, String.format("LiveCheck Current:%s, Last:%s, Interval:%s, Left:%s", Long.valueOf(jCurrentTimeMillis), Long.valueOf(liveCheckTime), Integer.valueOf(i4), Long.valueOf(j2 - j)));
        if (j2 >= j) {
            return false;
        }
        int i5 = onTransact + 41;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        c.setLiveCheckTime(jCurrentTimeMillis);
        return true;
    }

    static /* synthetic */ int d(a aVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = aVar.e;
        int i5 = i3 == 0 ? i4 - 1 : i4 + 1;
        aVar.e = i5;
        return i5;
    }

    public static a getInstance() {
        int i = 2 % 2;
        if (b == null) {
            b = new a();
            int i2 = IAuthTabCallbackStub + 5;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        a aVar = b;
        int i4 = onTransact + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    public static a init(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        a = context;
        c = TmoneyData.getInstance(context);
        com.tmoney.d.a.getInstance();
        if (SessionCookieMgr.getInstance() == null) {
            int i4 = IAuthTabCallbackStub + 115;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                SessionCookieMgr.initialize(a);
                throw null;
            }
            SessionCookieMgr.initialize(a);
        }
        return getInstance();
    }

    public final void ack(ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new j(getContext(), resultListener), resultListener, true);
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ackCheck(TmoneyCallback.ResultType resultType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
            if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                if (resultType != TmoneyCallback.ResultType.WARNING) {
                    return;
                }
            }
        } else if (resultType != TmoneyCallback.ResultType.SUCCESS) {
        }
        if (resultType.getError() != ResultError.USIM_ERROR) {
            int i4 = IAuthTabCallbackStub + 39;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            ResultError error = resultType.getError();
            if (i5 == 0) {
                int i6 = 92 / 0;
                if (error != ResultError.SERVER_ERROR) {
                    if (resultType.getError() != ResultError.EXCEPTION) {
                        return;
                    }
                }
            } else if (error != ResultError.SERVER_ERROR) {
            }
        }
        if (resultType.getDetailCode().equals(CodeConstants.EERROR_CODE.TIMEOUT.getCode()) || resultType.getDetailCode().equals(CodeConstants.EERROR_CODE.NETWORK.getCode()) || resultType.getDetailCode().equals(CodeConstants.EERROR_CODE.UNKNOWN.getCode())) {
            ack(null);
        }
    }

    public final void acntBnkInfo(ResultListener resultListener) {
        int i = 2 % 2;
        new C0040a(getContext(), resultListener).execute();
        int i2 = onTransact + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
    }

    public final void cardInfo(ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new k(getContext(), resultListener), resultListener, true);
        int i2 = IAuthTabCallbackStub + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void checkTmoneyPoint(ResultListener resultListener) {
        int i = 2 % 2;
        new com.tmoney.c.j(getContext(), resultListener).request();
        int i2 = IAuthTabCallbackStub + 61;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void clearTagException() {
        int i = 2 % 2;
        this.g = false;
        LogHelper.d(TAG, "clearTagException:" + this.g);
        int i2 = IAuthTabCallbackStub + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void creditCardList(ResultListener resultListener) {
        int i = 2 % 2;
        new com.tmoney.c.c(getContext(), resultListener).requestOnlyDate();
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
    }

    public final void creditCardRegist(PayMethodInfoDto payMethodInfoDto, ResultListener resultListener) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            c.isPrePaidPlatform();
            obj.hashCode();
            throw null;
        }
        if (c.isPrePaidPlatform()) {
            Context context = getContext();
            Object[] objArr = new Object[1];
            h((short) (Color.red(0) - 80), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 843578358 - (ViewConfiguration.getPressedStateDuration() >> 16), 1786401843 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 80, objArr);
            new n(context, ((String) objArr[0]).intern(), payMethodInfoDto, resultListener).executeRegist();
            return;
        }
        new m(getContext(), payMethodInfoDto, resultListener).executeRegist();
        int i3 = IAuthTabCallbackStub + 17;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void discountCardRegist(boolean z, String str, ResultListener resultListener) {
        int i = 2 % 2;
        if (!z) {
            str = "";
            int i2 = onTransact + 87;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        a((com.tmoney.g.a.a) new l(getContext(), z, str, resultListener), resultListener, false);
        int i4 = IAuthTabCallbackStub + 77;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void discountNDeductionInfo(final ResultListener resultListener) {
        int i = 2 % 2;
        new C0050n(getContext(), new AbstractC0045f.a() { // from class: com.tmoney.a.9
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                resultListener.onResult(Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                DCRG0003ResponseDTO dCRG0003ResponseDTO = (DCRG0003ResponseDTO) responseDTO;
                DiscountNDeductionInfoDto discountNDeductionInfoDto = new DiscountNDeductionInfoDto();
                discountNDeductionInfoDto.setCardType(dCRG0003ResponseDTO.getResponse().getNtknCd());
                discountNDeductionInfoDto.setDiscountYn(dCRG0003ResponseDTO.getResponse().getDcRgtYn());
                discountNDeductionInfoDto.setDeductionYn(dCRG0003ResponseDTO.getResponse().getInttRgtYn());
                resultListener.onResult(TmoneyCallback.ResultType.SUCCESS.setData(discountNDeductionInfoDto));
            }
        }).execute();
        int i2 = onTransact + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void enableTmoney(ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = AnonymousClass18.b[c.getTelecomType().ordinal()];
        if (i2 == 1) {
            new x(getContext(), resultListener).excuteTmoneyEnable();
            return;
        }
        int i3 = onTransact + 105;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 == 0 ? i2 == 2 : i2 == 5) {
            new v(getContext(), resultListener).excuteTmoneyEnable();
            return;
        }
        if (i2 == 3) {
            new w(getContext(), resultListener).excuteTmoneyEnable();
            return;
        }
        int i5 = i4 + 11;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        resultListener.onResult(Callback.warning(ResultError.NOT_SUPPORT, ResultDetailCode.NOT_SUPPORT_TELECOM));
    }

    public final void forceRefund(ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            c.isTmoneyUser();
            throw null;
        }
        if (!c.isTmoneyUser()) {
            resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
            return;
        }
        a((com.tmoney.g.a.a) new z(getContext(), new AnonymousClass3(resultListener)), resultListener, true);
        int i3 = onTransact + 23;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
    }

    public final Context getContext() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 39;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Context context = a;
        int i5 = i2 + 73;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return context;
        }
        throw null;
    }

    public final void getPostPaidOneDayLimitRemainCount(ResultListener resultListener) {
        int i = 2 % 2;
        new h(getContext(), resultListener).getCount();
        int i2 = onTransact + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void increaseLimit(final ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (Tmoney.Info.isLmtModTgtYn()) {
            a((com.tmoney.g.a.a) new o(getContext(), new ResultListener() { // from class: com.tmoney.a.11
                @Override // com.tmoney.listener.ResultListener
                public final void onResult(final TmoneyCallback.ResultType resultType) {
                    if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                        a.this.onetimeLimitRestore(0, Tmoney.Info.getRegistedPostPaidLimitAmount(), new ResultListener() { // from class: com.tmoney.a.11.1
                            @Override // com.tmoney.listener.ResultListener
                            public final void onResult(TmoneyCallback.ResultType resultType2) {
                                TmoneyCallback.ResultType resultType3 = TmoneyCallback.ResultType.SUCCESS;
                                resultListener.onResult(resultType2);
                            }
                        });
                    } else if (resultType.getDetailCode().equals("PO63")) {
                        a.this.ack(new ResultListener() { // from class: com.tmoney.a.11.2
                            @Override // com.tmoney.listener.ResultListener
                            public final void onResult(TmoneyCallback.ResultType resultType2) {
                                if (resultType2 != TmoneyCallback.ResultType.SUCCESS) {
                                    resultListener.onResult(resultType);
                                } else if (a.c(a.this) > 2) {
                                    resultListener.onResult(resultType2);
                                } else {
                                    AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                                    a.this.increaseLimit(resultListener);
                                }
                            }
                        });
                    } else {
                        a.a(a.this, new ResultListener() { // from class: com.tmoney.a.11.3
                            @Override // com.tmoney.listener.ResultListener
                            public final void onResult(TmoneyCallback.ResultType resultType2) {
                                resultListener.onResult(resultType);
                            }
                        }, true);
                    }
                }
            }), resultListener, true);
            return;
        }
        resultListener.onResult(Callback.warning(ResultError.NOT_TARGET_USER, ResultDetailCode.NOT_TARGET_USER));
        int i4 = IAuthTabCallbackStub + 117;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void init(final ResultListener resultListener) {
        int i = 2 % 2;
        this.e = 0;
        a((com.tmoney.g.a.a) new p(getContext(), new ResultListener() { // from class: com.tmoney.a.1
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(final TmoneyCallback.ResultType resultType) throws NumberFormatException {
                if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                    if (ResultDetailCode.NEED_LIVECHECK.getCodeString().equals(resultType.getDetailCode())) {
                        new com.tmoney.c.d(a.this.getContext(), new ResultListener() { // from class: com.tmoney.a.1.2
                            @Override // com.tmoney.listener.ResultListener
                            public final void onResult(TmoneyCallback.ResultType resultType2) {
                                if (resultType2 != TmoneyCallback.ResultType.SUCCESS) {
                                    a.a(a.this, 0);
                                    resultListener.onResult(resultType);
                                } else if (a.a(a.this) != 0) {
                                    a.a(a.this, 0);
                                    resultListener.onResult(resultType);
                                } else {
                                    a.b(a.this);
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    a.this.init(resultListener);
                                }
                            }
                        }).executeLiveCheck();
                        return;
                    } else {
                        a.a(a.this, 0);
                        resultListener.onResult(resultType);
                        return;
                    }
                }
                a.a(a.this, 0);
                if (!a.a().getIsPayment()) {
                    a.a(a.this, resultListener);
                } else if (!a.a(a.this, resultType, resultListener)) {
                    resultListener.onResult(resultType);
                }
                String afltMbrsDataV = a.a().getAfltMbrsDataV();
                if (afltMbrsDataV.isEmpty()) {
                    return;
                }
                for (MBR0003ResponseDTO.Response.AfltMbrsDataV afltMbrsDataV2 : (MBR0003ResponseDTO.Response.AfltMbrsDataV[]) new Gson().fromJson(afltMbrsDataV, MBR0003ResponseDTO.Response.AfltMbrsDataV[].class)) {
                    String str = afltMbrsDataV2.mbrsCardStaCd;
                    CodeConstants.MEMBERSHIP_CARD_STATE_CD membership_card_state_cd = CodeConstants.MEMBERSHIP_CARD_STATE_CD.ISSUING;
                    if (str.equals(membership_card_state_cd.getCode()) || afltMbrsDataV2.mbrsCardStaCd.equals(CodeConstants.MEMBERSHIP_CARD_STATE_CD.DELETING.getCode())) {
                        LogHelper.d(a.TAG, "getAfltMbrsDataV:>>mbrsCardStaCd=" + afltMbrsDataV2.mbrsCardStaCd + ">>mbrsEfIdx=" + afltMbrsDataV2.mbrsEfIdx + ">>mbrsPrdId=" + afltMbrsDataV2.mbrsPrdId);
                        a.a(a.this, afltMbrsDataV2.mbrsEfIdx, afltMbrsDataV2.mbrsPrdId, afltMbrsDataV2.mbrsCardStaCd.equals(membership_card_state_cd.getCode()) ? CodeConstants.MEMBERSHIP_STATE_CD.ISSUE : CodeConstants.MEMBERSHIP_STATE_CD.DELETE, new ResultListener() { // from class: com.tmoney.a.1.1
                            @Override // com.tmoney.listener.ResultListener
                            public final void onResult(TmoneyCallback.ResultType resultType2) {
                            }
                        });
                    }
                }
            }
        }), resultListener, true);
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final boolean isTagException() {
        int i = 2 % 2;
        LogHelper.d(TAG, "isTagException:" + this.g);
        boolean z = this.g;
        int i2 = IAuthTabCallbackStub + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return z;
    }

    public final void limiteErrorRestoration(int i, int i2, final ResultListener resultListener) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 79;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i >= 0) {
            Bundle bundle = new Bundle();
            bundle.putInt(LiveCheckConstants.AMOUNT, i2);
            bundle.putInt(LiveCheckConstants.BALANCE, i);
            bundle.putIntArray(LiveCheckConstants.STEP, new int[]{11, 1});
            bundle.putString(LiveCheckConstants.UN_LOAD_TYPE, LiveCheckConstants.UNLOAD_CREDIT_CARD_ERROR_R1);
            liveCheckStep(bundle, resultListener);
            return;
        }
        cardInfo(new ResultListener() { // from class: com.tmoney.a.8
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) throws NumberFormatException {
                if (TmoneyCallback.ResultType.SUCCESS != resultType) {
                    resultListener.onResult(resultType);
                    return;
                }
                int lastBalance = a.a().getLastBalance();
                int registedLimiteAmountPostPaid = a.a().getRegistedLimiteAmountPostPaid();
                Bundle bundle2 = new Bundle();
                bundle2.putInt(LiveCheckConstants.AMOUNT, registedLimiteAmountPostPaid);
                bundle2.putInt(LiveCheckConstants.BALANCE, lastBalance);
                bundle2.putIntArray(LiveCheckConstants.STEP, new int[]{11, 1});
                bundle2.putString(LiveCheckConstants.UN_LOAD_TYPE, LiveCheckConstants.UNLOAD_CREDIT_CARD_ERROR_R1);
                a.this.liveCheckStep(bundle2, resultListener);
            }
        });
        int i5 = IAuthTabCallbackStub + 57;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
    }

    public final void liveCheck(ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            a(resultListener, true);
        } else {
            a(resultListener, false);
        }
        int i3 = IAuthTabCallbackStub + 97;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void liveCheckStep(Bundle bundle, ResultListener resultListener) {
        int i = 2 % 2;
        new com.tmoney.c.d(a, resultListener).execute_self(bundle);
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void load(TmoneyConstants.PayMethodType payMethodType, String str, int i, int i2, String str2, String str3, ResultListener resultListener) {
        int i3 = 2 % 2;
        int i4 = AnonymousClass18.a[payMethodType.ordinal()];
        if (i4 == 1) {
            if (TmoneyData.getInstance(getContext()).isPrepaidTmoneyAutoLoad()) {
                if (c.isPrePaidPlatform()) {
                    a((com.tmoney.g.a.a) new q(getContext(), i, i2, resultListener), resultListener, true);
                    return;
                } else {
                    resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
                    return;
                }
            }
            resultListener.onResult(Callback.warning(ResultError.NOREGIST_CREDITCARD, ResultDetailCode.NOREGIST_CREDITCARD));
            int i5 = onTransact + 1;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i6 = IAuthTabCallbackStub + 73;
        int i7 = i6 % 128;
        onTransact = i7;
        int i8 = i6 % 2;
        if (i4 == 2) {
            a((com.tmoney.g.a.a) new u(getContext(), payMethodType, str, i, i2, str2, str3, resultListener), resultListener, true);
            return;
        }
        int i9 = i7 + 123;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        resultListener.onResult(Callback.warning(ResultError.NOT_SUPPORT, ResultDetailCode.NOT_SUPPORT_PAYMETHOD));
        if (i10 != 0) {
            int i11 = 95 / 0;
        }
    }

    public final void longTimeNoUseDisable(ResultListener resultListener) {
        int i = 2 % 2;
        new g(getContext(), resultListener).excuteLongTimeNoUseDisable();
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void lostDisable(ResultListener resultListener) {
        int i = 2 % 2;
        boolean zIsPostPaidPlatform = c.isPostPaidPlatform();
        g gVar = new g(getContext(), resultListener);
        if (!zIsPostPaidPlatform) {
            gVar.excutePrePaidLostDisable();
            int i2 = IAuthTabCallbackStub + 59;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = IAuthTabCallbackStub + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        gVar.excutePostPaidLostDisable();
        if (i5 == 0) {
            throw null;
        }
    }

    public final void lostDisablePostPaid(ResultListener resultListener) {
        int i = 2 % 2;
        new g(getContext(), resultListener).excutePostPaidLostDisable();
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void lostDisablePrePaid(ResultListener resultListener) {
        int i = 2 % 2;
        new g(getContext(), resultListener).excutePrePaidLostDisable();
        int i2 = IAuthTabCallbackStub + 45;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        a(r4.getDtaRecSno(), "", (com.tmoney.kscc.sslio.constants.CodeConstants.MEMBERSHIP_STATE_CD) null, new com.tmoney.a.AnonymousClass14(r3));
        r4 = com.tmoney.a.IAuthTabCallbackStub + 73;
        com.tmoney.a.onTransact = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r5.onResult(com.tmoney.utils.Callback.warning(com.tmoney.listener.ResultError.DATA_ERROR, com.tmoney.listener.ResultDetailCode.DATA_ERROR));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void membershipDelete(String str, final ResultListener resultListener) {
        final MembershipItemDto membershipItem;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            membershipItem = c.getMembershipItem(str);
            int i3 = 68 / 0;
        } else {
            membershipItem = c.getMembershipItem(str);
        }
    }

    public final void membershipIssue(String str, ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        MembershipItemDto membershipItem = c.getMembershipItem(str);
        if (membershipItem != null) {
            a(membershipItem.getDtaRecSno(), "", (CodeConstants.MEMBERSHIP_STATE_CD) null, new AnonymousClass13(membershipItem, str, resultListener));
            return;
        }
        int i4 = IAuthTabCallbackStub + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        resultListener.onResult(Callback.warning(ResultError.DATA_ERROR, ResultDetailCode.DATA_ERROR));
    }

    public final void membershipList(final ResultListener resultListener) {
        Iterator<MembershipItemDto> it;
        int i = 2 % 2;
        this.e = 0;
        final List<MembershipItemDto> membershipItemAll = c.getMembershipItemAll();
        final ArrayList arrayList = new ArrayList();
        if (membershipItemAll.size() <= 0) {
            resultListener.onResult(TmoneyCallback.ResultType.SUCCESS.setData(arrayList));
            return;
        }
        int i2 = onTransact + 109;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            it = membershipItemAll.iterator();
            int i3 = 53 / 0;
        } else {
            it = membershipItemAll.iterator();
        }
        Iterator<MembershipItemDto> it2 = it;
        while (it2.hasNext()) {
            final MembershipItemDto next = it2.next();
            a(next.getDtaRecSno(), "", (CodeConstants.MEMBERSHIP_STATE_CD) null, new ResultListener() { // from class: com.tmoney.a.15
                @Override // com.tmoney.listener.ResultListener
                public final void onResult(TmoneyCallback.ResultType resultType) {
                    TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
                    if (resultType == resultType2) {
                        Object[] data = resultType.getData();
                        if (!((String) data[1]).equals(CodeConstants.DEFAULT_CARD_NO)) {
                            arrayList.add(new MembershipDto(next.getCode(), data[1].toString(), data[2].toString()));
                        }
                    }
                    if (a.d(a.this) == membershipItemAll.size()) {
                        resultListener.onResult(resultType2.setData(arrayList));
                    }
                }
            });
            int i4 = onTransact + 29;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        r14.onResult(com.tmoney.utils.Callback.todo(com.tmoney.listener.ResultError.NEED_JOIN, com.tmoney.listener.ResultDetailCode.NEED_JOIN));
        r0 = com.tmoney.a.onTransact + 119;
        com.tmoney.a.IAuthTabCallbackStub = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (com.tmoney.a.c.isTmoneyUser() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (com.tmoney.a.c.isTmoneyUser() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        a((com.tmoney.g.a.a) new com.tmoney.b.s(getContext(), r10, r11 + "01", r11 + com.tmoney.utils.DateTimeHelper.getLastDayString(r11.substring(0, 4), r11.substring(4, 6)), r12, r13, r14), r14, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void monthlyHistory(TmoneyConstants.MonthlyHistoryType monthlyHistoryType, String str, int i, int i2, ResultListener resultListener) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    public final void monthlySum(String str, String str2, ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new t(getContext(), str, str2 + "01", str2 + "31", resultListener), resultListener, true);
        int i2 = onTransact + 1;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
    }

    public final void nfcAck(IsoDep isoDep, ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new C0034a(getContext(), resultListener), resultListener, true, isoDep);
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void nfcCardInfo(IsoDep isoDep, ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new C0035b(getContext(), resultListener), resultListener, true, isoDep);
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void nfcCreditCardLoad(IsoDep isoDep, int i, int i2, ResultListener resultListener) {
        int i3 = 2 % 2;
        int i4 = onTransact + 43;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if (!c.isPrePaidPlatform()) {
            int i6 = onTransact + 39;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
            return;
        }
        Object obj = null;
        if (i <= 0) {
            int i8 = onTransact + 33;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                resultListener.onResult(Callback.warning(ResultError.DATA_ERROR, ResultDetailCode.DATA_ERROR));
                return;
            } else {
                resultListener.onResult(Callback.warning(ResultError.DATA_ERROR, ResultDetailCode.DATA_ERROR));
                throw null;
            }
        }
        String crcmCd = c.getCrcmCd();
        String crdtChecDvsCd = c.getCrdtChecDvsCd();
        if (c.isPrepaidTmoneyAutoLoad()) {
            int i9 = IAuthTabCallbackStub + 73;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                TextUtils.isEmpty(crcmCd);
                throw null;
            }
            if (!TextUtils.isEmpty(crcmCd) && !TextUtils.isEmpty(crdtChecDvsCd)) {
                a((com.tmoney.g.a.a) new C0037d(getContext(), "01", String.format("%s|%s|%s", crcmCd, crdtChecDvsCd, "M"), i, i2, i + i2, true, resultListener), resultListener, true, isoDep);
                return;
            }
        }
        int i10 = IAuthTabCallbackStub + 79;
        onTransact = i10 % 128;
        if (i10 % 2 != 0) {
            resultListener.onResult(Callback.warning(ResultError.NOREGIST_CREDITCARD, ResultDetailCode.NOREGIST_CREDITCARD));
        } else {
            resultListener.onResult(Callback.warning(ResultError.NOREGIST_CREDITCARD, ResultDetailCode.NOREGIST_CREDITCARD));
            obj.hashCode();
            throw null;
        }
    }

    public final void nfcEnableCheck(IsoDep isoDep, String str, ResultListener resultListener) {
        int i = 2 % 2;
        if (c.isPrePaidPlatform()) {
            a((com.tmoney.g.a.a) new C0036c(getContext(), str, resultListener), resultListener, true, isoDep);
            return;
        }
        int i2 = onTransact + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
        int i4 = IAuthTabCallbackStub + 77;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void nfcPayMethodLoad(IsoDep isoDep, String str, String str2, int i, int i2, int i3, boolean z, ResultListener resultListener) {
        int i4 = 2 % 2;
        int i5 = onTransact + 117;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            c.isPrePaidPlatform();
            throw null;
        }
        if (!c.isPrePaidPlatform()) {
            int i6 = IAuthTabCallbackStub + 107;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            if (!c.isPostPaidPlatform()) {
                int i8 = IAuthTabCallbackStub + 41;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                ResultError resultError = ResultError.NEED_JOIN;
                if (i9 != 0) {
                    resultListener.onResult(Callback.todo(resultError, ResultDetailCode.NEED_JOIN));
                    return;
                } else {
                    resultListener.onResult(Callback.todo(resultError, ResultDetailCode.NEED_JOIN));
                    int i10 = 22 / 0;
                    return;
                }
            }
        }
        if (i <= 0) {
            resultListener.onResult(Callback.warning(ResultError.DATA_ERROR, ResultDetailCode.DATA_ERROR));
        } else {
            a((com.tmoney.g.a.a) new C0037d(getContext(), str, str2, i, i2, i3, z, resultListener), resultListener, true, isoDep);
        }
    }

    public final void nfcPhoneBillLoad(IsoDep isoDep, String str, int i, int i2, String str2, ResultListener resultListener) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if (!c.isPrePaidPlatform()) {
            resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
            return;
        }
        if (i > 0) {
            a((com.tmoney.g.a.a) new C0038e(getContext(), str, i, i2, str2, resultListener), resultListener, true, isoDep);
            return;
        }
        int i6 = onTransact + 59;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        resultListener.onResult(Callback.warning(ResultError.DATA_ERROR, ResultDetailCode.DATA_ERROR));
    }

    public final void nfcPurseHistory(IsoDep isoDep, ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new C0039f(getContext(), resultListener), resultListener, true, isoDep);
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void nfcSelChip(IsoDep isoDep, ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new com.tmoney.b.g(getContext(), resultListener), resultListener, true, isoDep);
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void nfcTopupReady(String str, int i, int i2, int i3, String str2, String str3, ResultListener resultListener) {
        int i4 = 2 % 2;
        new N(getContext(), resultListener).execute(str, i, i2, i3, str2, str3);
        int i5 = onTransact + 15;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void nfcTransHistory(IsoDep isoDep, ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new com.tmoney.b.h(getContext(), resultListener), resultListener, true, isoDep);
        int i2 = IAuthTabCallbackStub + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void nfcTransferMileage(IsoDep isoDep, ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new i(getContext(), resultListener), resultListener, true, isoDep);
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        cardInfo(new com.tmoney.a.AnonymousClass6(r4));
        r5 = com.tmoney.a.IAuthTabCallbackStub + 109;
        com.tmoney.a.onTransact = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = new android.os.Bundle();
        r1.putIntArray(com.tmoney.LiveCheckConstants.STEP, new int[]{9});
        r1.putInt(com.tmoney.LiveCheckConstants.BALANCE, r5);
        r1.putInt(com.tmoney.LiveCheckConstants.AMOUNT, r6);
        liveCheckStep(r1, new com.tmoney.a.AnonymousClass5(r4));
        r5 = com.tmoney.a.IAuthTabCallbackStub + 107;
        com.tmoney.a.onTransact = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onetimeLimitRestore(final int i, final int i2, final ResultListener resultListener) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 71;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }

    public final void otcKey(ResultListener resultListener) {
        int i = 2 % 2;
        new r(getContext(), resultListener).executeOtaKey();
        int i2 = IAuthTabCallbackStub + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void partnerInfo(ResultListener resultListener) {
        int i = 2 % 2;
        new com.tmoney.c.i(getContext(), resultListener).requestPartnerInfo();
        int i2 = IAuthTabCallbackStub + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void payMethodLoad(String str, String str2, int i, int i2, int i3, final ResultListener resultListener) {
        int i4 = 2 % 2;
        int i5 = onTransact + 111;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        if (c.isPrePaidPlatform() || c.isPostPaidPlatform()) {
            a((com.tmoney.g.a.a) new com.tmoney.b.r(getContext(), str, str2, i, i2, i3, new ResultListener() { // from class: com.tmoney.a.22
                @Override // com.tmoney.listener.ResultListener
                public final void onResult(TmoneyCallback.ResultType resultType) {
                    a.this.ackCheck(resultType);
                    resultListener.onResult(resultType);
                }
            }), resultListener, true);
            return;
        }
        int i7 = IAuthTabCallbackStub + 27;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
        } else {
            resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
            int i8 = 33 / 0;
        }
    }

    public final void postpaidBillingDay(String str, ResultListener resultListener) {
        int i = 2 % 2;
        new com.tmoney.c.k(getContext(), str, resultListener).excutePostPaidBillingDay();
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
    }

    public final void postpaidBillingInfo(String str, String str2, ResultListener resultListener) {
        int i = 2 % 2;
        new com.tmoney.c.l(getContext(), str, str2, resultListener).excutePostPaidBillingInfo();
        int i2 = onTransact + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void postpaidCreditCardRegist(PayMethodInfoDto payMethodInfoDto, ResultListener resultListener) {
        int i = 2 % 2;
        new m(getContext(), payMethodInfoDto, resultListener).executeRegist();
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
    }

    public final void postpaidLoad(int i, String str, ResultListener resultListener) {
        int i2 = 2 % 2;
        int i3 = onTransact + 39;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (!TmoneyInfo.getInstance(getContext()).isPostPaid()) {
            int i5 = onTransact + 33;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
                return;
            } else {
                resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
                int i6 = 56 / 0;
                return;
            }
        }
        if (TmoneyInfo.getInstance(getContext()).isRegistedPostPaidCreditCard()) {
            a((com.tmoney.g.a.a) new com.tmoney.b.v(getContext(), i, str, resultListener), resultListener, true);
            return;
        }
        int i7 = IAuthTabCallbackStub + 99;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            resultListener.onResult(Callback.warning(ResultError.NOREGIST_CREDITCARD, ResultDetailCode.NOREGIST_CREDITCARD));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        resultListener.onResult(Callback.warning(ResultError.NOREGIST_CREDITCARD, ResultDetailCode.NOREGIST_CREDITCARD));
        int i8 = IAuthTabCallbackStub + 83;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void postpaidLoadInitCheck(ResultListener resultListener) {
        int i = 2 % 2;
        if (TmoneyInfo.getInstance(getContext()).isPostPaid()) {
            if (!TmoneyInfo.getInstance(getContext()).isRegistedPostPaidCreditCard()) {
                resultListener.onResult(Callback.warning(ResultError.NOREGIST_CREDITCARD, ResultDetailCode.NOREGIST_CREDITCARD));
                return;
            }
            a((com.tmoney.g.a.a) new com.tmoney.b.w(getContext(), resultListener), resultListener, true);
            int i2 = onTransact + 69;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 83 / 0;
                return;
            }
            return;
        }
        int i4 = IAuthTabCallbackStub + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        ResultError resultError = ResultError.NEED_JOIN;
        if (i5 != 0) {
            resultListener.onResult(Callback.todo(resultError, ResultDetailCode.NEED_JOIN));
        } else {
            resultListener.onResult(Callback.todo(resultError, ResultDetailCode.NEED_JOIN));
            int i6 = 0 / 0;
        }
    }

    public final void postpaidRefund(String str, ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new A(getContext(), str, resultListener), resultListener, true);
        int i2 = onTransact + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void prepaidCreditCardChange(PayMethodInfoDto payMethodInfoDto, ResultListener resultListener) {
        int i = 2 % 2;
        new n(getContext(), "3", payMethodInfoDto, resultListener).executeRegist();
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
    }

    public final void prepaidCreditCardLoad(int i, int i2, final ResultListener resultListener) {
        TmoneyCallback.ResultType resultTypeWarning;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!c.isPrePaidPlatform()) {
            int i6 = onTransact + 89;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
                obj.hashCode();
                throw null;
            }
            resultTypeWarning = Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN);
        } else {
            if (TmoneyData.getInstance(getContext()).isPrepaidTmoneyAutoLoad()) {
                a((com.tmoney.g.a.a) new q(getContext(), i, i2, new ResultListener() { // from class: com.tmoney.a.21
                    @Override // com.tmoney.listener.ResultListener
                    public final void onResult(TmoneyCallback.ResultType resultType) {
                        a.this.ackCheck(resultType);
                        resultListener.onResult(resultType);
                    }
                }), resultListener, true);
                int i7 = onTransact + 49;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            int i9 = onTransact + 121;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                resultListener.onResult(Callback.warning(ResultError.NOREGIST_CREDITCARD, ResultDetailCode.NOREGIST_CREDITCARD));
                obj.hashCode();
                throw null;
            }
            resultTypeWarning = Callback.warning(ResultError.NOREGIST_CREDITCARD, ResultDetailCode.NOREGIST_CREDITCARD);
        }
        resultListener.onResult(resultTypeWarning);
    }

    public final void prepaidCreditCardRegist(PayMethodInfoDto payMethodInfoDto, ResultListener resultListener) {
        int i = 2 % 2;
        Context context = getContext();
        Object[] objArr = new Object[1];
        h((short) ((-80) - (ViewConfiguration.getTouchSlop() >> 8)), (byte) (ViewConfiguration.getTouchSlop() >> 8), 843578357 + (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1786401842 - MotionEvent.axisFromString(""), (-80) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        new n(context, ((String) objArr[0]).intern(), payMethodInfoDto, resultListener).executeRegist();
        int i2 = IAuthTabCallbackStub + 111;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void prepaidCreditCardUnRegist(ResultListener resultListener) {
        int i = 2 % 2;
        Context context = getContext();
        Object[] objArr = new Object[1];
        h((short) (MotionEvent.axisFromString("") + 25), (byte) TextUtils.getCapsMode("", 0, 0), 843578359 + Process.getGidForName(""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1786401843, TextUtils.indexOf((CharSequence) "", '0', 0) - 79, objArr);
        new n(context, ((String) objArr[0]).intern(), new PayMethodInfoDto(), resultListener).executeRegist();
        int i2 = onTransact + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
    }

    public final void prepaidLostAccountRegist(String str, String str2, String str3, ResultListener resultListener) {
        int i = 2 % 2;
        new f(getContext(), str, str2, str3, resultListener).setLostAccountRegist();
        int i2 = onTransact + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
    }

    public final void prepaidMethodInfo(String str, ResultListener resultListener) {
        int i = 2 % 2;
        new com.tmoney.c.o(getContext(), str, resultListener).execute();
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void prepaidPhoneBillLoad(String str, int i, int i2, String str2, final ResultListener resultListener) {
        int i3 = 2 % 2;
        a((com.tmoney.g.a.a) new u(getContext(), TmoneyConstants.PayMethodType.PhoneBill, str, i, i2, str2, "", new ResultListener() { // from class: com.tmoney.a.23
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                resultListener.onResult(resultType);
            }
        }), resultListener, true);
        int i4 = IAuthTabCallbackStub + 83;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    public final void purseHistory(ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new com.tmoney.b.x(getContext(), resultListener), resultListener, false);
        int i2 = onTransact + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void refund(boolean z, String str, String str2, String str3, int i, int i2, boolean z2, final ResultListener resultListener) {
        int i3 = 2 % 2;
        a((com.tmoney.g.a.a) new com.tmoney.b.B(getContext(), String.format("%d", Integer.valueOf(i)), String.format("%d", Integer.valueOf(i2)), str, str3, str2, z, z2, new ResultListener() { // from class: com.tmoney.a.2
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                a.this.ackCheck(resultType);
                resultListener.onResult(resultType);
            }
        }), resultListener, true);
        int i4 = onTransact + 89;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    public final void refundFee(int i, boolean z, ResultListener resultListener) {
        int i2 = 2 % 2;
        new com.tmoney.c.p(getContext(), i, z, resultListener).getRefundFee();
        int i3 = onTransact + 9;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void refundHistory(String str, String str2, ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new C(getContext(), str, str2, resultListener), resultListener, true);
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void selChip(ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new D(getContext(), resultListener), resultListener, false);
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void sendGift(String str, String str2, int i, final ResultListener resultListener) {
        int i2 = 2 % 2;
        a((com.tmoney.g.a.a) new com.tmoney.b.n(getContext(), str, str2, i, new ResultListener() { // from class: com.tmoney.a.17
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                a.this.ackCheck(resultType);
                resultListener.onResult(resultType);
            }
        }), resultListener, true);
        int i3 = IAuthTabCallbackStub + 25;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serviceConversion(ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!TmoneyInfo.getInstance(getContext()).isJoinedService()) {
            resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
            return;
        }
        new com.tmoney.c.q(getContext(), "5", "", "", "", c.isPrePaidPlatform(), resultListener).excuteJoin();
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    public final void serviceJoinPostPaid(String str, String str2, String str3, ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            TmoneyInfo.getInstance(getContext()).isJoinedService();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (TmoneyInfo.getInstance(getContext()).isJoinedService()) {
            resultListener.onResult(Callback.warning(ResultError.JOINED, ResultDetailCode.JOINED));
            int i3 = IAuthTabCallbackStub + 123;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
                return;
            }
            return;
        }
        Context context = getContext();
        Object[] objArr = new Object[1];
        h((short) ((-80) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 843578358 - TextUtils.getOffsetBefore("", 0), View.combineMeasuredStates(0, 0) + 1786401843, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 81, objArr);
        new com.tmoney.c.q(context, ((String) objArr[0]).intern(), str, str2, str3, false, resultListener).excuteJoin();
    }

    public final void serviceJoinPrePaid(String str, String str2, String str3, ResultListener resultListener) {
        int i = 2 % 2;
        if (!(!TmoneyInfo.getInstance(getContext()).isJoinedService())) {
            int i2 = IAuthTabCallbackStub + 51;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            resultListener.onResult(Callback.warning(ResultError.JOINED, ResultDetailCode.JOINED));
            return;
        }
        Context context = getContext();
        Object[] objArr = new Object[1];
        h((short) (Drawable.resolveOpacity(0, 0) - 80), (byte) KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionGroup(0L) + 843578358, 1786401843 - Color.alpha(0), View.resolveSizeAndState(0, 0, 0) - 80, objArr);
        new com.tmoney.c.q(context, ((String) objArr[0]).intern(), str, str2, str3, true, resultListener).excuteJoin();
        int i4 = onTransact + 17;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serviceTerminate(ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!TmoneyInfo.getInstance(getContext()).isJoinedService()) {
            int i4 = IAuthTabCallbackStub + 5;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
            return;
        }
        boolean zIsPrePaidPlatform = c.isPrePaidPlatform();
        Context context = getContext();
        Object[] objArr = new Object[1];
        h((short) (25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), 843578358 - TextUtils.indexOf("", ""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1786401844, Gravity.getAbsoluteGravity(0, 0) - 80, objArr);
        new com.tmoney.c.q(context, ((String) objArr[0]).intern(), "", "", "", zIsPrePaidPlatform, resultListener).excuteJoin();
        int i6 = IAuthTabCallbackStub + 75;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void setApiKey(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        c.setPartnerCd(str2);
        c.setPartnerKey(str);
        int i4 = IAuthTabCallbackStub + 67;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCI(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        c.setCIPreference(str);
        int i4 = onTransact + 17;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r4.length() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        com.tmoney.a.c.setPhoneNumber(r4);
        r4 = com.tmoney.a.onTransact + 35;
        com.tmoney.a.IAuthTabCallbackStub = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r4.length() != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = IAuthTabCallbackStub + 93;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 47 / 0;
            }
        }
        c.setPhoneNumber("01000000000");
    }

    public final void setTagException() {
        int i = 2 % 2;
        this.g = true;
        LogHelper.d(TAG, "setTagException:" + this.g);
        int i2 = onTransact + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setTmoneyServer(TmoneyConstants.TmoneyServerType tmoneyServerType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TmoneyData tmoneyData = c;
        int iOrdinal = tmoneyServerType.ordinal();
        if (i3 != 0) {
            tmoneyData.setServerType(iOrdinal);
            c.setTmoneyDebug(TmoneyConstants.TmoneySdkDebugType.None);
        } else {
            tmoneyData.setServerType(iOrdinal);
            c.setTmoneyDebug(TmoneyConstants.TmoneySdkDebugType.None);
            throw null;
        }
    }

    public final void setTmoneyServer(TmoneyConstants.TmoneyServerType tmoneyServerType, TmoneyConstants.TmoneySdkDebugType tmoneySdkDebugType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        c.setServerType(tmoneyServerType.ordinal());
        c.setTmoneyDebug(tmoneySdkDebugType);
        int i4 = IAuthTabCallbackStub + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setUICC(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        c.setUiccPreference(str);
        int i4 = IAuthTabCallbackStub + 89;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setUserID(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            c.setUserIdPreference(str);
            obj.hashCode();
            throw null;
        }
        c.setUserIdPreference(str);
        int i3 = IAuthTabCallbackStub + 37;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void setVariousKey(String str, String str2, String str3, String str4, String str5) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            c.setSkStId(str);
            c.setKtUfinKey(str2);
            c.setAppKey(str3);
            c.setLgUiccIDKey(str4);
            c.setLgClientId(str5);
            int i3 = 18 / 0;
        } else {
            c.setSkStId(str);
            c.setKtUfinKey(str2);
            c.setAppKey(str3);
            c.setLgUiccIDKey(str4);
            c.setLgClientId(str5);
        }
        int i4 = IAuthTabCallbackStub + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    public final void setVariousKey(String str, String str2, String str3, String str4, String str5, String str6) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        c.setSkStId(str);
        c.setKtUfinKey(str2);
        c.setAppKey(str3);
        c.setLgUiccIDKey(str4);
        c.setLgClientId(str5);
        c.setLgCommonApikey(str6);
        int i4 = onTransact + 93;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void tMileage(final ResultListener resultListener) {
        int i = 2 % 2;
        checkTmoneyPoint(new ResultListener() { // from class: com.tmoney.a.10
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    resultType.setData(Integer.valueOf(Integer.parseInt(((PointResultData) resultType.getData()[0]).getPtuSum())));
                }
                resultListener.onResult(resultType);
            }
        });
        int i2 = onTransact + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void tmoney1thIssue(ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            c.isTelecomTypeSk();
            obj.hashCode();
            throw null;
        }
        if (!c.isTelecomTypeSk()) {
            resultListener.onResult(Callback.warning(ResultError.NOT_SUPPORT, ResultDetailCode.NOT_SUPPORT_TELECOM));
            return;
        }
        new com.tmoney.c.z(getContext(), resultListener).excuteSktOta();
        int i3 = IAuthTabCallbackStub + 73;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void tmoney2thIssue(final ResultListener resultListener) {
        int i = 2 % 2;
        d.getInstance().offerTask(a, new F(getContext(), new ResultListener() { // from class: com.tmoney.a.25
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tmoney.a.25.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            new com.tmoney.c.u(a.this.getContext(), resultListener).excute2thIssue();
                        }
                    }, 200L);
                } else {
                    resultListener.onResult(resultType);
                }
            }
        }), false);
        int i2 = IAuthTabCallbackStub + 121;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
    }

    public final void topupReady(String str, int i, int i2, int i3, String str2, ResultListener resultListener) {
        int i4 = 2 % 2;
        new ak(getContext(), resultListener).execute(str, i, i2, i3, str2);
        int i5 = IAuthTabCallbackStub + 7;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void tpoInfo(final ResultListener resultListener) {
        int i = 2 % 2;
        a((com.tmoney.g.a.a) new y(getContext(), new ResultListener() { // from class: com.tmoney.a.20
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                    resultListener.onResult(resultType);
                    return;
                }
                new com.tmoney.c.A(a.this.getContext(), resultListener).requestTpoInfo(resultType.getData()[0].toString(), resultType.getData()[1].toString(), resultType.getData()[2].toString());
            }
        }), resultListener, true);
        int i2 = IAuthTabCallbackStub + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void transHistory(ResultListener resultListener) {
        int i = 2 % 2;
        if (c.isTmoneyUser()) {
            a((com.tmoney.g.a.a) new E(getContext(), resultListener), resultListener, false);
            return;
        }
        int i2 = IAuthTabCallbackStub + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        resultListener.onResult(Callback.todo(ResultError.NEED_JOIN, ResultDetailCode.NEED_JOIN));
        int i4 = onTransact + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    public final void usableCheck(ResultListener resultListener) {
        int i = 2 % 2;
        new s(getContext(), resultListener).request();
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void usableOmaAuth(ResultListener resultListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (com.tmoney.utils.PackageHelper.isExistApp(getContext(), "com.kt.ollehusimmanager") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (com.tmoney.utils.PackageHelper.isExistApp(getContext(), "com.kt.ollehusimmanager") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        r5.onResult(com.tmoney.utils.Callback.todo(com.tmoney.listener.ResultError.KT_UFIN_CLIENT_INSTALL, com.tmoney.listener.ResultDetailCode.KT_UFIN_CLIENT_INSTALL));
        r5 = com.tmoney.a.IAuthTabCallbackStub + 53;
        com.tmoney.a.onTransact = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if ((r5 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void usableTmoney(final ResultListener resultListener) {
        int i = 2 % 2;
        if (!c.isNotUseUsimPartner() && !c.isGamin()) {
            if (c.isTelecomTypeSk()) {
                if (com.tmoney.telecom.skt.a.checkSESFramework(a) != 0) {
                    resultListener.onResult(Callback.todo(ResultError.SKT_SEIO_INSTALL, ResultDetailCode.SKT_SEIO_INSTALL));
                    return;
                }
            } else if (c.isTelecomTypeKt()) {
                int i2 = IAuthTabCallbackStub + 11;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 93 / 0;
                }
            } else if (c.isTelecomTypeUnknown()) {
                resultListener.onResult(Callback.warning(ResultError.NOT_SUPPORT, ResultDetailCode.NOT_SUPPORT_USIM));
                return;
            }
        }
        ResultListener resultListener2 = new ResultListener() { // from class: com.tmoney.a.24
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(final TmoneyCallback.ResultType resultType) {
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    new com.tmoney.c.t(a.this.getContext(), new ResultListener() { // from class: com.tmoney.a.24.1
                        @Override // com.tmoney.listener.ResultListener
                        public final void onResult(TmoneyCallback.ResultType resultType2) throws Throwable {
                            if (resultType2 != TmoneyCallback.ResultType.SUCCESS) {
                                resultListener.onResult(resultType2);
                                return;
                            }
                            if (!a.a().isOrangeOrToss()) {
                                resultListener.onResult(resultType);
                                return;
                            }
                            String line1NumberLocaleRemove = DeviceInfoHelper.getLine1NumberLocaleRemove(a.b());
                            if (!line1NumberLocaleRemove.startsWith("01") || line1NumberLocaleRemove.equals("01000000000")) {
                                resultListener.onResult(Callback.todo(ResultError.NEED_SET_PHONE_NUMBER, ResultDetailCode.NEED_SET_PHONE_NUMBER));
                            } else {
                                resultListener.onResult(resultType);
                            }
                        }
                    }).request();
                } else {
                    resultListener.onResult(resultType);
                }
            }
        };
        a((com.tmoney.g.a.a) new com.tmoney.b.m(getContext(), resultListener2), resultListener2, false);
    }

    public final void usePlaceInfo(ResultListener resultListener) {
        int i = 2 % 2;
        new com.tmoney.c.B(getContext(), resultListener).request();
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void withdrawRestoration(final ResultListener resultListener) {
        int i = 2 % 2;
        cardInfo(new ResultListener() { // from class: com.tmoney.a.7
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) throws NumberFormatException {
                if (TmoneyCallback.ResultType.SUCCESS != resultType) {
                    resultListener.onResult(resultType);
                    return;
                }
                int lastBalance = a.a().getLastBalance();
                int registedLimiteAmountPostPaid = a.a().getRegistedLimiteAmountPostPaid();
                Bundle bundle = new Bundle();
                bundle.putIntArray(LiveCheckConstants.STEP, new int[]{5, 1});
                bundle.putString(LiveCheckConstants.UN_LOAD_TYPE, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0);
                bundle.putInt(LiveCheckConstants.BALANCE, lastBalance);
                bundle.putInt(LiveCheckConstants.AMOUNT, registedLimiteAmountPostPaid);
                a.this.liveCheckStep(bundle, resultListener);
            }
        });
        int i2 = onTransact + 1;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 43424), 42 - View.MeasureSpec.getSize(0), 22440 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = -1;
            int i7 = iIntValue == -1 ? 1 : 0;
            char c2 = '0';
            if (i7 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 119;
                        $11 = i9 % 128;
                        if (i9 % i4 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cMakeMeasureSpec = (char) (12843 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                int iArgb = Color.argb(0, 0, 0, 0) + 55;
                                int iLastIndexOf = TextUtils.lastIndexOf("", c2, 0) + 2168;
                                byte b3 = (byte) i6;
                                byte b4 = (byte) (b3 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, iArgb, iLastIndexOf, -299036574, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8 = 0;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b5 = (byte) (-1);
                                byte b6 = (byte) (b5 + 1);
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12843), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 55, 2167 - KeyEvent.normalizeMetaState(0), -299036574, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i4 = 2;
                        i6 = -1;
                        c2 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $11 + 43;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.getDefaultSize(0, 0)), 42 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 22439 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j)) + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), ((byte) KeyEvent.getModifierMetaStateMask()) + 87, (Process.myPid() >> 22) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $10 + 11;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                int i15 = $11 + 55;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 2 / 5;
                }
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i17 = $11 + 13;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        int i18 = 19 / 0;
                        if (z) {
                            byte[] bArr6 = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b2));
                        } else {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b2));
                        }
                    } else if (z) {
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
