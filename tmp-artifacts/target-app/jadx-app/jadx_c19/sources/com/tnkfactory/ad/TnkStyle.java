package com.tnkfactory.ad;

import com.tnkfactory.ad.rwd.Resources;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TnkStyle {
    public static Resources.FormatCurrency FormatCurrency = null;
    public static String availableLanguages = "en,ko,ja,in";
    public static String defaultLanguage = "en";
    public static boolean enableCurrencyFormat = true;
    public static int finishAdListAnim_Enter = 0;
    public static int finishAdListAnim_Exit = 0;
    public static int privacyAgreeBtnColor = 0;
    public static int privacyAgreeBtnTextColor = 0;
    public static String privacyExtraText = "";
    public static int showAdListAnim_Enter;
    public static int showAdListAnim_Exit;

    public static Resources makeCusTomResource() {
        return Resources.setUseCustomResource();
    }
}
