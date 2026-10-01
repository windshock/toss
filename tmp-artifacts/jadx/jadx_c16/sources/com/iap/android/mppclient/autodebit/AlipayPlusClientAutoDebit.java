package com.iap.android.mppclient.autodebit;

import android.content.Context;
import com.iap.android.mppclient.autodebit.model.SignContractParams;
import com.iap.android.mppclient.autodebit.model.SignContractResult;
import com.iap.android.mppclient.basic.callback.Callback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class AlipayPlusClientAutoDebit {
    private static volatile AlipayPlusClientAutoDebit mInstance;
    public AutoDebitService autoDebitService;

    public static AlipayPlusClientAutoDebit getInstance() {
        if (mInstance == null) {
            synchronized (AlipayPlusClientAutoDebit.class) {
                if (mInstance == null) {
                    mInstance = new AlipayPlusClientAutoDebit();
                }
            }
        }
        return mInstance;
    }

    public void signContract(Context context, SignContractParams signContractParams, Callback<SignContractResult> callback) {
        SignContractManager.getInstance().signContract(context, false, signContractParams, callback);
    }
}
