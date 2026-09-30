package com.tmoney.c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class e extends BaseTmoneyCallback implements LiveCheckConstants {
    private final String a;
    private com.tmoney.a b;
    private int[] c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private int i;
    private Bundle j;

    public e(Context context, Bundle bundle, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "LiveCheckStepInstance";
        this.i = 0;
        this.b = com.tmoney.a.getInstance();
        this.j = bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogHelper.d("LiveCheckStepInstance", ">>>>> next mStep.length : " + this.c.length);
        LogHelper.d("LiveCheckStepInstance", ">>>>> next mNowStep : " + this.i);
        int[] iArr = this.c;
        int length = iArr.length;
        int i = this.i;
        if (length <= i) {
            e();
            return;
        }
        this.i = i + 1;
        switch (iArr[i]) {
            case 1:
                b();
                break;
            case 2:
                int i2 = this.h - this.g;
                if (i2 <= 0) {
                    a();
                    break;
                } else {
                    a(i2, "P");
                    break;
                }
            case 3:
                a(this.h, "K");
                break;
            case 4:
                int i3 = this.h - this.g;
                if (i3 <= 0) {
                    a();
                    break;
                } else {
                    a(i3, LiveCheckConstants.LOAD_PHONE_LOST_ACK);
                    break;
                }
            case 5:
                int i4 = this.h - this.g;
                if (i4 <= 0) {
                    a();
                    break;
                } else {
                    a(i4, "N");
                    break;
                }
            case 6:
                a();
                break;
            case 7:
                a();
                break;
            case 8:
                int i5 = this.h - this.g;
                if (i5 <= 0) {
                    a();
                    break;
                } else {
                    a(i5, "M");
                    break;
                }
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                int i6 = this.h - this.g;
                if (i6 <= 0) {
                    a();
                    break;
                } else {
                    a(i6, "C");
                    break;
                }
            case 10:
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
            default:
                a();
                break;
            case 11:
                int i7 = this.h - this.g;
                if (i7 <= 0) {
                    a();
                    break;
                } else {
                    a(i7, "X");
                    break;
                }
            case LiveCheckConstants.SVC_U1 /* 12 */:
                d();
                break;
            case 14:
                a(new ResultListener() { // from class: com.tmoney.c.e.1
                    @Override // com.tmoney.listener.ResultListener
                    public final void onResult(TmoneyCallback.ResultType resultType) {
                        e.this.a();
                    }
                });
                break;
            case 15:
                c();
                break;
        }
    }

    private void a(int i, final String str) {
        this.b.postpaidLoad(i, str, new ResultListener() { // from class: com.tmoney.c.e.2
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                e.a(e.this, resultType);
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    e.this.a();
                    return;
                }
                if (TextUtils.equals(resultType.getDetailCode(), "PO83")) {
                    if (TextUtils.equals(str, "N")) {
                        resultType.setDetailCode("PO83_END");
                    } else {
                        resultType.setDetailCode("PO83");
                    }
                }
                e.this.onResult(resultType);
            }
        });
    }

    static /* synthetic */ void a(e eVar, TmoneyCallback.ResultType resultType) {
        eVar.b.ackCheck(resultType);
    }

    private void a(ResultListener resultListener) {
        a(new com.tmoney.b.j(getContext(), resultListener));
    }

    private boolean a(com.tmoney.g.a.a aVar) {
        return com.tmoney.g.a.d.getInstance().offerTask(getContext(), aVar);
    }

    private void b() {
        this.b.postpaidRefund(this.f, new ResultListener() { // from class: com.tmoney.c.e.3
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                e.a(e.this, resultType);
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    e.this.a();
                } else {
                    e.this.onResult(resultType);
                }
            }
        });
    }

    private void c() {
        this.b.postpaidLoadInitCheck(new ResultListener() { // from class: com.tmoney.c.e.4
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    e.this.a();
                } else if ("PO85".equals(resultType.getDetailCode())) {
                    e.this.onResult(resultType);
                } else {
                    e.this.e();
                }
            }
        });
    }

    private void d() {
        this.b.serviceTerminate(new ResultListener() { // from class: com.tmoney.c.e.5
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    e.this.a();
                } else {
                    e.this.onResult(resultType);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        onResult(TmoneyCallback.ResultType.SUCCESS.setDetailCode(TextUtils.isEmpty(this.d) ? this.e : this.d));
    }

    @Override // com.tmoney.listener.BaseTmoneyCallback
    public final Context getContext() {
        return this.mContext;
    }

    public final void userCheck() {
        int[] intArray = this.j.getIntArray(LiveCheckConstants.STEP);
        this.c = intArray;
        this.i = 0;
        if (intArray == null) {
            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
            ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_LIVECHECK;
            onResult(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setException(new Exception("Exception::Server :: Recv livecheck.")));
        } else {
            this.d = this.j.getString(LiveCheckConstants.USR_USE_LTN_CD);
            this.e = this.j.getString(LiveCheckConstants.DPY_ACT_CD);
            this.f = this.j.getString(LiveCheckConstants.UN_LOAD_TYPE);
            this.g = this.j.getInt(LiveCheckConstants.BALANCE, 0);
            this.h = this.j.getInt(LiveCheckConstants.AMOUNT, 0);
            a();
        }
    }
}
