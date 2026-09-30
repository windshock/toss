package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getContentEncryptionAlgorithm implements getOther {
    public static final int $stable = 0;
    private final int cardCode;

    public getContentEncryptionAlgorithm() {
        this(0, 1, null);
    }

    public getContentEncryptionAlgorithm(int i) {
        this.cardCode = i;
    }

    public /* synthetic */ getContentEncryptionAlgorithm(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.INTEGRATED_CARD_LOADING;
    }
}
