package com.tmoney.g;

import android.content.Context;
import android.nfc.tech.IsoDep;
import com.tmoney.TmoneyMsg;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;
import java.io.IOException;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class g extends a {
    public static final String TAG = "UsimNfc";
    private final int b;
    private IsoDep c;

    private g(Context context, IsoDep isoDep) {
        super(context);
        this.b = 5000;
        this.c = isoDep;
    }

    public static g getInstance(Context context, IsoDep isoDep) {
        return new g(context, isoDep);
    }

    @Override // com.tmoney.g.a
    public final void close() {
        LogHelper.dw(TAG, "close()");
    }

    @Override // com.tmoney.g.a
    public final void create(Map<String, Object> map) {
        TmoneyMsg.TmoneyResult tmoneyResult;
        boolean z;
        LogHelper.dw(TAG, "create");
        IsoDep isoDep = this.c;
        if (isoDep == null || !isoDep.isConnected()) {
            tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT;
            z = false;
        } else {
            tmoneyResult = TmoneyMsg.TmoneyResult.SUCCESS;
            z = true;
        }
        a(z, tmoneyResult);
    }

    @Override // com.tmoney.g.a
    public final void destroy() {
        LogHelper.dw(TAG, "destroy");
        a(true);
    }

    @Override // com.tmoney.g.a
    public final int getChannel() {
        return 1;
    }

    @Override // com.tmoney.g.a
    public final boolean isCreated() {
        return true;
    }

    @Override // com.tmoney.g.a
    public final int open() throws IOException {
        IsoDep isoDep = this.c;
        if (isoDep == null) {
            return -1;
        }
        if (isoDep.isConnected()) {
            return 0;
        }
        try {
            this.c.connect();
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.tmoney.g.a
    public final byte[] transmit(byte[] bArr) throws IOException {
        LogHelper.d(TAG, "transceive(" + this.c + "," + bArr + ")");
        this.c.setTimeout(5000);
        StringBuilder sb = new StringBuilder(">>>reqAPDU :");
        sb.append(ByteHelper.byteArrayToHexString(bArr));
        LogHelper.e(TAG, sb.toString());
        try {
            byte[] bArrTransceive = this.c.transceive(bArr);
            LogHelper.e(TAG, ">>>revAPDU :" + ByteHelper.byteArrayToHexString(bArrTransceive));
            if (bArrTransceive.length == 2 && bArrTransceive[0] == 97) {
                byte[] apduCmd = com.tmoney.a.a.getApduCmd(20, (byte) 0, (byte) 0, (byte) 0, 0, bArrTransceive[1]);
                LogHelper.e(TAG, ">>>reqAPDU2 :" + ByteHelper.byteArrayToHexString(apduCmd));
                bArrTransceive = this.c.transceive(apduCmd);
                LogHelper.e(TAG, ">>>revAPDU2 :" + ByteHelper.byteArrayToHexString(bArrTransceive));
            }
            com.tmoney.a.getInstance().clearTagException();
            return bArrTransceive;
        } catch (Exception e) {
            LogHelper.e(TAG, ">>>transmit execepion : " + e.getMessage());
            com.tmoney.a.getInstance().setTagException();
            return null;
        }
    }
}
