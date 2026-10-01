package com.skt.usp;

import com.skt.usp.tools.dao.UCPResultData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class UCPManagerConnection {
    public abstract void onResultAPI(UCPResultData uCPResultData);

    public abstract void onServiceConnected(String str);

    public abstract void onServiceDisconnected(String str, int i);
}
