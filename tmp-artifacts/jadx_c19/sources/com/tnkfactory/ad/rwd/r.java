package com.tnkfactory.ad.rwd;

import com.tnkfactory.ad.TnkStyle;
import com.tnkfactory.ad.rwd.Resources;
import java.text.DecimalFormat;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class r implements Resources.FormatCurrency {
    @Override // com.tnkfactory.ad.rwd.Resources.FormatCurrency
    public final String formatCurrency(long j) {
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        if (TnkStyle.enableCurrencyFormat) {
            if (j >= 1000000000000L) {
                long j2 = j / 1000000000000L;
                j %= 1000000000000L;
                sb.append(decimalFormat.format(j2));
                sb.append("조 ");
            }
            if (j >= 100000000) {
                long j3 = j / 100000000;
                j %= 100000000;
                sb.append(decimalFormat.format(j3));
                sb.append("억 ");
            }
            if (j >= 10000) {
                long j4 = j / 10000;
                j %= 10000;
                sb.append(decimalFormat.format(j4));
                sb.append("만 ");
            }
            if (j != 0) {
                sb.append(decimalFormat.format(j));
            }
        } else {
            sb.append(j);
        }
        String string = sb.toString();
        return string.endsWith(" ") ? string.substring(0, string.length() - 1) : string;
    }
}
