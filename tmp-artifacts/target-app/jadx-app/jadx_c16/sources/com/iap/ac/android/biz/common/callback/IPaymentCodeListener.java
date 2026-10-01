package com.iap.ac.android.biz.common.callback;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface IPaymentCodeListener {
    void onPaymentCodeUpdateFailed(@NonNull String str, @NonNull String str2);

    void onPaymentCodeUpdated(@NonNull String str);
}
