package com.tnkfactory.ad.rwd;

import com.tnkfactory.ad.TnkStyle;
import com.tnkfactory.ad.rwd.Resources;
import java.text.DecimalFormat;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class p implements Resources.FormatCurrency {
    @Override // com.tnkfactory.ad.rwd.Resources.FormatCurrency
    public final String formatCurrency(long j) {
        String str;
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        if (!TnkStyle.enableCurrencyFormat) {
            str = decimalFormat.format(j);
        } else if (j >= 100000000000L) {
            str = decimalFormat.format((j / 1.0E9d) - 0.5d) + "G";
        } else if (j >= 100000000) {
            str = decimalFormat.format((j / 1000000.0d) - 0.5d) + "M";
        } else if (j >= 1000000) {
            str = decimalFormat.format((j / 1000.0d) - 0.5d) + "K";
        } else {
            str = decimalFormat.format(j);
        }
        return str.replaceAll(",", ".");
    }
}
