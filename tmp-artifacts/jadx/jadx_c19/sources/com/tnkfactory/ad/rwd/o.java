package com.tnkfactory.ad.rwd;

import com.tnkfactory.ad.TnkStyle;
import com.tnkfactory.ad.rwd.Resources;
import java.text.DecimalFormat;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class o implements Resources.FormatCurrency {
    @Override // com.tnkfactory.ad.rwd.Resources.FormatCurrency
    public final String formatCurrency(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        if (!TnkStyle.enableCurrencyFormat) {
            return decimalFormat.format(j);
        }
        if (j >= 100000000000L) {
            return decimalFormat.format((j / 1.0E9d) - 0.5d) + "G";
        }
        if (j >= 100000000) {
            return decimalFormat.format((j / 1000000.0d) - 0.5d) + "M";
        }
        if (j < 1000000) {
            return decimalFormat.format(j);
        }
        return decimalFormat.format((j / 1000.0d) - 0.5d) + "K";
    }
}
