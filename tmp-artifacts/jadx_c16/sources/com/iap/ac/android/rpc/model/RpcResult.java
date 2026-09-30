package com.iap.ac.android.rpc.model;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class RpcResult<T> implements Serializable {
    public static final long serialVersionUID = 8238795488637043019L;
    public String memo;
    public T result;
    public int resultStatus;
    public String tips;
}
