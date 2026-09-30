package com.iap.ac.android.biz.common.callback;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface InquireQuoteCallback {
    void onResult(@NonNull String str, @Nullable ForeignExchangeQuote foreignExchangeQuote);
}
