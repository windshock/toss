package com.tmoney.ota.a;

import android.content.Context;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class b extends com.tmoney.g.a.a {
    private final String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private String g;
    private byte h;

    public b(Context context, byte b, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyMemberCheckExecuter";
        this.h = b;
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        LogHelper.d("TmoneyMemberCheckExecuter", ">>>>> execute");
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            try {
                byte[] bArrTransmitAPDU = dVar.transmitAPDU(getMemberShipData(this.h));
                byte[] bArr = new byte[6];
                byte[] bArr2 = new byte[8];
                byte[] bArr3 = new byte[4];
                byte[] bArr4 = new byte[48];
                System.arraycopy(bArrTransmitAPDU, 0, bArr, 0, 6);
                System.arraycopy(bArrTransmitAPDU, 6, bArr2, 0, 8);
                System.arraycopy(bArrTransmitAPDU, 14, bArr3, 0, 4);
                System.arraycopy(bArrTransmitAPDU, 18, bArr4, 0, 48);
                this.b = com.tmoney.e.a.a.bytesToHexString(bArr);
                this.c = com.tmoney.e.a.a.bytesToHexString(bArr2);
                this.d = com.tmoney.e.a.a.bytesToHexString(bArr3);
                this.e = com.tmoney.e.a.a.bytesToHexString(bArr4);
                this.f = 0;
                this.g = "";
            } catch (Exception e) {
                LogHelper.e("TmoneyMemberCheckExecuter", "execute::" + LogHelper.printStackTraceToString(e));
                this.f = 25;
                this.g = "";
            }
        } else {
            this.f = 31;
            this.g = resultType.getMessage();
        }
        int i = this.f;
        onResult(i == 0 ? TmoneyCallback.ResultType.SUCCESS.setData(this.b, this.c, this.d, this.e) : TmoneyCallback.ResultType.WARNING.setError(ResultError.ISSUE_ERROR).setDetailCode(String.valueOf(i)).setMessage(this.g));
        return 0;
    }

    public final byte[] getMemberShipData(byte b) {
        return new byte[]{-112, 120, b, 1, 64};
    }
}
