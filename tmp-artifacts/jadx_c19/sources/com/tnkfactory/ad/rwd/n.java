package com.tnkfactory.ad.rwd;

import com.tnkfactory.ad.TnkStyle;
import com.tnkfactory.ad.rwd.Resources;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class n implements Resources.FormatCurrency {
    @Override // com.tnkfactory.ad.rwd.Resources.FormatCurrency
    public final String formatCurrency(long j) {
        StringBuilder sb = new StringBuilder();
        if (TnkStyle.enableCurrencyFormat) {
            if (j >= 1000000000000L) {
                long j2 = j / 1000000000000L;
                j %= 1000000000000L;
                sb.append(j2);
                sb.append("조 ");
            }
            if (j >= 100000000) {
                long j3 = j / 100000000;
                j %= 100000000;
                sb.append(j3);
                sb.append("억 ");
            }
            if (j >= 10000) {
                long j4 = j / 10000;
                j %= 10000;
                sb.append(j4);
                sb.append("만 ");
            }
            if (j != 0) {
                sb.append(j);
            }
        } else {
            sb.append(j);
        }
        return sb.toString();
    }
}
