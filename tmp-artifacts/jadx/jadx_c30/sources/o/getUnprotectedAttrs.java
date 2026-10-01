package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getUnprotectedAttrs implements getOther {
    public static final int $stable = 0;
    private final String text;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getUnprotectedAttrs) && Intrinsics.areEqual(this.text, ((getUnprotectedAttrs) obj).text);
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        return "IntegratedSubTitle(text=" + this.text + ")";
    }

    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.INTEGRATED_CARD_SUB_TITLE;
    }
}
