package com.tmoney.kscc.sslio.a;

import android.content.Context;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;

/* renamed from: com.tmoney.kscc.sslio.a.k, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AbstractC0049k extends AbstractC0045f {
    public AbstractC0049k() {
    }

    public AbstractC0049k(Context context, APIConstants.EAPI_CONST eapi_const, AbstractC0045f.a aVar) {
        super(context, eapi_const, aVar);
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public void connectServer() {
        callback();
    }
}
