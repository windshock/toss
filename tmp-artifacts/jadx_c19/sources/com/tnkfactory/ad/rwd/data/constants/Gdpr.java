package com.tnkfactory.ad.rwd.data.constants;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Gdpr {
    private static int GDPR_CONSENT_FALSE;
    public static final Gdpr INSTANCE = new Gdpr();
    private static int GDPR_CONSENT_TRUE = 1;
    private static int GDPR_CONSENT_UNKNOWN = -1;

    private Gdpr() {
    }

    public final int getGDPR_CONSENT_FALSE() {
        return GDPR_CONSENT_FALSE;
    }

    public final int getGDPR_CONSENT_TRUE() {
        return GDPR_CONSENT_TRUE;
    }

    public final int getGDPR_CONSENT_UNKNOWN() {
        return GDPR_CONSENT_UNKNOWN;
    }

    public final void setGDPR_CONSENT_FALSE(int i2) {
        GDPR_CONSENT_FALSE = i2;
    }

    public final void setGDPR_CONSENT_TRUE(int i2) {
        GDPR_CONSENT_TRUE = i2;
    }

    public final void setGDPR_CONSENT_UNKNOWN(int i2) {
        GDPR_CONSENT_UNKNOWN = i2;
    }
}
