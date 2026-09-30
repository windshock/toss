package com.tmoney.c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tmoney.LiveCheckConstants;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.V;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.SIN0001ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class d extends BaseTmoneyCallback {
    AbstractC0045f.a a;
    private final String b;
    private Context c;
    private TmoneyData d;
    private com.tmoney.a e;
    private int f;
    private int g;
    private int h;
    private int i;
    private TmoneyCallback.ResultType j;

    public d(Context context, ResultListener resultListener) {
        super(resultListener);
        this.b = "LiveCheckServiceInstance";
        this.h = 1;
        this.i = 0;
        this.j = null;
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.c.d.4
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                d.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                SIN0001ResponseDTO sIN0001ResponseDTO = (SIN0001ResponseDTO) responseDTO;
                if (TextUtils.isEmpty(sIN0001ResponseDTO.getResponse().getUsrUseLtnCd()) && TextUtils.isEmpty(sIN0001ResponseDTO.getResponse().getDpyActCd())) {
                    d.this.a(TmoneyCallback.ResultType.SUCCESS);
                } else {
                    d.a(d.this, sIN0001ResponseDTO);
                }
            }
        };
        this.c = context;
        this.d = TmoneyData.getInstance(context);
        this.e = com.tmoney.a.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Bundle bundle, final boolean z) {
        new e(this.c, bundle, new ResultListener() { // from class: com.tmoney.c.d.3
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    d.this.a(resultType);
                    return;
                }
                if (z && ((resultType == TmoneyCallback.ResultType.TODO && resultType.getError() == ResultError.NEED_JOIN) || (resultType == TmoneyCallback.ResultType.WARNING && resultType.getError() == ResultError.NOREGIST_CREDITCARD))) {
                    d.this.a(resultType);
                    return;
                }
                if ("PO83".equals(resultType.getDetailCode()) || "PO83_END".equals(resultType.getDetailCode())) {
                    if (d.c(d.this) > d.this.h) {
                        d dVar = d.this;
                        TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                        ResultDetailCode resultDetailCode = ResultDetailCode.LIVECHECK_LIMIT;
                        dVar.a(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setException(new Exception("Exception::Server :: Recv livecheck.")));
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(LiveCheckConstants.AMOUNT, d.this.g);
                    bundle2.putInt(LiveCheckConstants.BALANCE, d.this.f);
                    if ("PO83".equals(resultType.getDetailCode())) {
                        bundle2.putIntArray(LiveCheckConstants.STEP, new int[]{14, 9});
                    } else {
                        bundle2.putIntArray(LiveCheckConstants.STEP, new int[]{14, 5, 1});
                    }
                    d.this.a(bundle2, false);
                    return;
                }
                if ("PO85".equals(resultType.getDetailCode())) {
                    d.this.j = resultType;
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(LiveCheckConstants.AMOUNT, d.this.g);
                    bundle3.putInt(LiveCheckConstants.BALANCE, d.this.f);
                    bundle3.putIntArray(LiveCheckConstants.STEP, new int[]{11, 1});
                    bundle3.putString(LiveCheckConstants.UN_LOAD_TYPE, LiveCheckConstants.UNLOAD_CREDIT_CARD_ERROR_R1);
                    d.this.a(bundle3, false);
                    return;
                }
                if ("PO62".equals(resultType.getDetailCode())) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt(LiveCheckConstants.AMOUNT, d.this.g);
                    bundle4.putInt(LiveCheckConstants.BALANCE, d.this.f);
                    bundle4.putIntArray(LiveCheckConstants.STEP, new int[]{1});
                    bundle4.putString(LiveCheckConstants.UN_LOAD_TYPE, CodeConstants.USR_USE_LTN_CD.JUST_DPCG.getCode());
                    d.this.a(bundle4, false);
                    return;
                }
                if ("PO63".equals(resultType.getDetailCode())) {
                    if (d.c(d.this) > d.this.h) {
                        d.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION).setDetailCode(resultType.getDetailCode()).setMessage(resultType.getMessage()).setException(new Exception("Exception::Server :: Recv livecheck.")));
                        return;
                    }
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt(LiveCheckConstants.AMOUNT, d.this.g);
                    bundle5.putInt(LiveCheckConstants.BALANCE, d.this.f);
                    bundle5.putIntArray(LiveCheckConstants.STEP, new int[]{14});
                    bundle5.putString(LiveCheckConstants.UN_LOAD_TYPE, CodeConstants.USR_USE_LTN_CD.JUST_DPCG.getCode());
                    d.this.a(bundle5, false);
                    return;
                }
                if ("PO65".equals(resultType.getDetailCode())) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt(LiveCheckConstants.AMOUNT, d.this.g);
                    bundle6.putInt(LiveCheckConstants.BALANCE, d.this.f);
                    bundle6.putIntArray(LiveCheckConstants.STEP, new int[]{1});
                    bundle6.putString(LiveCheckConstants.UN_LOAD_TYPE, CodeConstants.USR_USE_LTN_CD.JUST_MSS.getCode());
                    d.this.a(bundle6, false);
                    return;
                }
                if (!"PO66".equals(resultType.getDetailCode())) {
                    if (!TextUtils.isEmpty(bundle.getString(LiveCheckConstants.UN_LOAD_TYPE, ""))) {
                        d.this.e.ack(null);
                    }
                    d.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(resultType.getDetailCode()).setMessage(resultType.getMessage()));
                } else {
                    Bundle bundle7 = new Bundle();
                    bundle7.putInt(LiveCheckConstants.AMOUNT, d.this.g);
                    bundle7.putInt(LiveCheckConstants.BALANCE, d.this.f);
                    bundle7.putIntArray(LiveCheckConstants.STEP, new int[]{14, 1});
                    bundle7.putString(LiveCheckConstants.UN_LOAD_TYPE, CodeConstants.USR_USE_LTN_CD.JUST_MSS.getCode());
                    d.this.a(bundle7, false);
                }
            }
        }).userCheck();
    }

    static /* synthetic */ void a(d dVar, SIN0001ResponseDTO sIN0001ResponseDTO) {
        Bundle bundle = new Bundle();
        LogHelper.d("LiveCheckServiceInstance", " >>>>> AMOUNT : " + dVar.g + ", BALANCE : " + dVar.f + ", UseUseLtnCd : " + sIN0001ResponseDTO.getResponse().getUsrUseLtnCd());
        bundle.putString(LiveCheckConstants.USR_USE_LTN_CD, sIN0001ResponseDTO.getResponse().getUsrUseLtnCd());
        bundle.putString(LiveCheckConstants.DPY_ACT_CD, sIN0001ResponseDTO.getResponse().getDpyActCd());
        bundle.putInt(LiveCheckConstants.AMOUNT, dVar.g);
        bundle.putInt(LiveCheckConstants.BALANCE, dVar.f);
        String usrUseLtnCd = sIN0001ResponseDTO.getResponse().getUsrUseLtnCd();
        String ppyDpyDvsCd = dVar.d.getPpyDpyDvsCd();
        CodeConstants.EMBL_SVC_TYP_CD embl_svc_typ_cd = CodeConstants.EMBL_SVC_TYP_CD.PREPAID;
        boolean z = embl_svc_typ_cd.getCode().equals(ppyDpyDvsCd) && (CodeConstants.USR_USE_LTN_CD.LOST.getCode().equals(usrUseLtnCd) || CodeConstants.USR_USE_LTN_CD.USIM_POOR.getCode().equals(usrUseLtnCd) || CodeConstants.USR_USE_LTN_CD.POOR_USER.getCode().equals(usrUseLtnCd) || CodeConstants.USR_USE_LTN_CD.SAFE_LOST.getCode().equals(usrUseLtnCd));
        CodeConstants.EMBL_SVC_TYP_CD embl_svc_typ_cd2 = CodeConstants.EMBL_SVC_TYP_CD.POSTPAID;
        boolean z2 = embl_svc_typ_cd2.getCode().equals(ppyDpyDvsCd) && CodeConstants.USR_USE_LTN_CD.USIM_POOR.getCode().equals(usrUseLtnCd) && TextUtils.isEmpty(dVar.d.getCrcmCd());
        if (z || z2) {
            dVar.e.refund(false, null, null, null, dVar.f, 0, !CodeConstants.USR_USE_LTN_CD.SAFE_LOST.getCode().equals(usrUseLtnCd), new ResultListener() { // from class: com.tmoney.c.d.2
                @Override // com.tmoney.listener.ResultListener
                public final void onResult(TmoneyCallback.ResultType resultType) {
                    d.this.a(resultType);
                }
            });
            return;
        }
        if (CodeConstants.DPY_ACT_CD.L0.getCode().equals(sIN0001ResponseDTO.getResponse().getDpyActCd())) {
            if (dVar.f < dVar.g) {
                LogHelper.d("LiveCheckServiceInstance", " >>>>> SVC_LOAD_ADD START");
                bundle.putIntArray(LiveCheckConstants.STEP, new int[]{4});
                dVar.a(bundle, false);
                return;
            } else {
                LogHelper.d("LiveCheckServiceInstance", " >>>>> SVC_LOAD_ADD CHECK");
                bundle.putIntArray(LiveCheckConstants.STEP, new int[]{15});
                dVar.a(bundle, false);
                return;
            }
        }
        if (CodeConstants.DPY_ACT_CD.L1.getCode().equals(sIN0001ResponseDTO.getResponse().getDpyActCd())) {
            bundle.putIntArray(LiveCheckConstants.STEP, new int[]{15});
            dVar.a(bundle, false);
            return;
        }
        if (CodeConstants.DPY_ACT_CD.L2.getCode().equals(sIN0001ResponseDTO.getResponse().getDpyActCd())) {
            bundle.putIntArray(LiveCheckConstants.STEP, new int[]{14});
            dVar.a(bundle, false);
            return;
        }
        if (CodeConstants.USR_USE_LTN_CD.LOST.getCode().equals(usrUseLtnCd) || CodeConstants.USR_USE_LTN_CD.SAFE_LOST.getCode().equals(usrUseLtnCd)) {
            bundle.putIntArray(LiveCheckConstants.STEP, new int[]{1});
            bundle.putString(LiveCheckConstants.UN_LOAD_TYPE, usrUseLtnCd);
            dVar.a(bundle, false);
            return;
        }
        if (CodeConstants.USR_USE_LTN_CD.LOGNTIME_REFUND_BALANCE.getCode().equals(usrUseLtnCd)) {
            bundle.putIntArray(LiveCheckConstants.STEP, new int[]{1});
            bundle.putString(LiveCheckConstants.UN_LOAD_TYPE, usrUseLtnCd);
            dVar.a(bundle, false);
            return;
        }
        if (CodeConstants.USR_USE_LTN_CD.USIM_POOR.getCode().equals(usrUseLtnCd)) {
            bundle.putIntArray(LiveCheckConstants.STEP, new int[]{5, 1});
            bundle.putString(LiveCheckConstants.UN_LOAD_TYPE, usrUseLtnCd);
            dVar.a(bundle, false);
            return;
        }
        if (CodeConstants.USR_USE_LTN_CD.POOR_USER.getCode().equals(usrUseLtnCd)) {
            bundle.putInt(LiveCheckConstants.AMOUNT, dVar.g);
            bundle.putInt(LiveCheckConstants.BALANCE, dVar.f);
            bundle.putIntArray(LiveCheckConstants.STEP, new int[]{11, 1});
            bundle.putString(LiveCheckConstants.UN_LOAD_TYPE, usrUseLtnCd);
            dVar.a(bundle, false);
            return;
        }
        if (!CodeConstants.USR_USE_LTN_CD.PHONE_CHANGE.getCode().equals(usrUseLtnCd)) {
            if (CodeConstants.USR_USE_LTN_CD.POOR_USER_NO_REFUND.getCode().equals(usrUseLtnCd)) {
                dVar.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(sIN0001ResponseDTO.getResponse().getRspCd()).setMessage(sIN0001ResponseDTO.getResponse().getRspMsg()));
                return;
            } else {
                dVar.a(TmoneyCallback.ResultType.SUCCESS);
                return;
            }
        }
        if (!embl_svc_typ_cd2.getCode().equals(ppyDpyDvsCd)) {
            if (!embl_svc_typ_cd.getCode().equals(ppyDpyDvsCd)) {
                dVar.a(TmoneyCallback.ResultType.SUCCESS);
                return;
            } else {
                bundle.putIntArray(LiveCheckConstants.STEP, new int[]{12});
                dVar.a(bundle, false);
                return;
            }
        }
        if (TextUtils.isEmpty(dVar.d.getCrcmCd())) {
            bundle.putIntArray(LiveCheckConstants.STEP, new int[]{12});
            dVar.a(bundle, false);
        } else {
            bundle.putIntArray(LiveCheckConstants.STEP, new int[]{5, 1, 12});
            bundle.putString(LiveCheckConstants.UN_LOAD_TYPE, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0);
            dVar.a(bundle, false);
        }
    }

    static /* synthetic */ int c(d dVar) {
        int i = dVar.i + 1;
        dVar.i = i;
        return i;
    }

    protected final void a(TmoneyCallback.ResultType resultType) {
        TmoneyCallback.ResultType resultType2 = this.j;
        if (resultType2 != null) {
            super.onResult(resultType2);
        } else {
            super.onResult(resultType);
        }
    }

    public final void executeLiveCheck() {
        this.g = Integer.parseInt(this.d.getAutoLoadAmount());
        this.e.cardInfo(new ResultListener() { // from class: com.tmoney.c.d.1
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) throws Throwable {
                if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                    d.this.a(resultType);
                    return;
                }
                d.this.f = ((Integer) resultType.getData()[1]).intValue();
                new V(d.this.c, d.this.a).execute(String.format("%d", Integer.valueOf(d.this.f)));
            }
        });
    }

    public final void execute_self(Bundle bundle) {
        this.f = bundle.getInt(LiveCheckConstants.BALANCE);
        this.g = bundle.getInt(LiveCheckConstants.AMOUNT);
        a(bundle, true);
    }
}
