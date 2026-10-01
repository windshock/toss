package com.tmoney.ota.c;

import com.tmoney.ota.dto.OTAData;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class b {
    protected byte[] a;
    private final String b = "OTAParser";

    public b(byte[] bArr) {
        int iA = a(bArr);
        byte[] bArr2 = new byte[iA];
        LogHelper.d("OTAParser", "body.length:" + iA);
        System.arraycopy(bArr, 414, bArr2, 0, iA);
        this.a = bArr2;
    }

    private static int a(byte[] bArr) {
        try {
            return Integer.parseInt(new String(bArr, 406, 8).trim());
        } catch (NumberFormatException e) {
            LogHelper.exception("OTAParser", e);
            return 0;
        }
    }

    public abstract OTAData execute();
}
