package com.tmoney.g;

import android.content.Context;
import com.tmoney.TmoneyMsg;
import com.tmoney.utils.LogHelper;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class h extends a {
    public static final String TAG = "UsimNotUse";
    private static volatile h b;

    private h(Context context) {
        super(context);
    }

    public static void clear() {
    }

    public static h getInstance(Context context) {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h(context);
                }
            }
        }
        return b;
    }

    @Override // com.tmoney.g.a
    public void close() {
        LogHelper.dw(TAG, "close()");
    }

    @Override // com.tmoney.g.a
    public void create(Map<String, Object> map) {
        LogHelper.dw(TAG, "create");
        a(true, TmoneyMsg.TmoneyResult.SUCCESS);
    }

    @Override // com.tmoney.g.a
    public void destroy() {
        LogHelper.dw(TAG, "destroy");
        a(true);
    }

    @Override // com.tmoney.g.a
    public int getChannel() {
        return 1;
    }

    @Override // com.tmoney.g.a
    public boolean isCreated() {
        return true;
    }

    @Override // com.tmoney.g.a
    public int open() {
        return 1;
    }

    @Override // com.tmoney.g.a
    public byte[] transmit(byte[] bArr) {
        return null;
    }
}
