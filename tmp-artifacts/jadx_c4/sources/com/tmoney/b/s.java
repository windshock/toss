package com.tmoney.b;

import android.content.Context;
import com.tmoney.TmoneyConstants;
import com.tmoney.dto.MonthlyHistoryDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.ad;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0005ResponseDTO;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class s extends com.tmoney.g.a.a {
    private final String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private ArrayList<MonthlyHistoryDto> g;
    private TmoneyConstants.MonthlyHistoryType h;
    private AbstractC0045f.a i;

    /* renamed from: com.tmoney.b.s$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TmoneyConstants.MonthlyHistoryType.values().length];
            a = iArr;
            try {
                iArr[TmoneyConstants.MonthlyHistoryType.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TmoneyConstants.MonthlyHistoryType.Trans.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TmoneyConstants.MonthlyHistoryType.Shoping.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[TmoneyConstants.MonthlyHistoryType.Gift.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[TmoneyConstants.MonthlyHistoryType.Load.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public s(Context context, TmoneyConstants.MonthlyHistoryType monthlyHistoryType, String str, String str2, int i, int i2, ResultListener resultListener) {
        String str3;
        super(context, resultListener);
        this.a = "TmoneyMonthlyHistoryExecuter";
        this.b = "00";
        this.g = null;
        this.i = new AbstractC0045f.a() { // from class: com.tmoney.b.s.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str4, String str5) {
                s.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str4).setMessage(str5));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                TRDR0005ResponseDTO tRDR0005ResponseDTO = (TRDR0005ResponseDTO) responseDTO;
                if (tRDR0005ResponseDTO.getResponse().getRspDta() != null) {
                    int size = tRDR0005ResponseDTO.getResponse().getRspDta().size();
                    s.this.g = new ArrayList();
                    for (int i3 = 0; i3 < size; i3++) {
                        s.this.g.add(new MonthlyHistoryDto(tRDR0005ResponseDTO.getResponse().getRspDta().get(i3)));
                    }
                }
                s.this.a(TmoneyCallback.ResultType.SUCCESS);
            }
        };
        this.h = monthlyHistoryType;
        int i3 = AnonymousClass2.a[monthlyHistoryType.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                str3 = "01";
            } else if (i3 == 3) {
                str3 = "02";
            } else if (i3 == 4) {
                str3 = "03";
            } else if (i3 == 5) {
                str3 = "04";
            }
            this.b = str3;
        } else {
            this.b = "00";
        }
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
        LogHelper.d("TmoneyMonthlyHistoryExecuter", "mGubun : " + this.b + ", mSYearMonth : " + this.c + ", mEYearMonth : " + this.d + ", mCountPerPage : " + this.e + ", mPage : " + this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(this.g);
        }
        onResult(resultType);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            new ad(getContext(), this.i).execute(this.b, this.c, this.d, String.format("%d", Integer.valueOf(this.e)), String.format("%d", Integer.valueOf(this.f)));
        } else {
            a(resultType);
        }
        return p();
    }
}
