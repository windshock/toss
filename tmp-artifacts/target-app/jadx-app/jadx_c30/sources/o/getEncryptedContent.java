package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getEncryptedContent implements getOther {
    public static final int $stable = 0;
    private final int cardCode;
    private final boolean needWebSiteRegistration;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEncryptedContent)) {
            return false;
        }
        getEncryptedContent getencryptedcontent = (getEncryptedContent) obj;
        return this.cardCode == getencryptedcontent.cardCode && this.needWebSiteRegistration == getencryptedcontent.needWebSiteRegistration;
    }

    public int hashCode() {
        return (Integer.hashCode(this.cardCode) * 31) + Boolean.hashCode(this.needWebSiteRegistration);
    }

    public String toString() {
        return "IntegratedCardItem(cardCode=" + this.cardCode + ", needWebSiteRegistration=" + this.needWebSiteRegistration + ")";
    }

    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.INTEGRATED_CARD_ITEM;
    }
}
