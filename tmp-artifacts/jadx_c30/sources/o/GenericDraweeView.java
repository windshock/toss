package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GenericDraweeView {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final String cardNum;
    private final String cvc;
    private final String expirationYm;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericDraweeView)) {
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        GenericDraweeView genericDraweeView = (GenericDraweeView) obj;
        if (!Intrinsics.areEqual(this.cardNum, genericDraweeView.cardNum)) {
            int i4 = onExtraCallbackWithResult + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cvc, genericDraweeView.cvc)) {
            return false;
        }
        if (Intrinsics.areEqual(this.expirationYm, genericDraweeView.expirationYm)) {
            return true;
        }
        int i6 = onExtraCallback + 53;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        return i2 % 2 != 0 ? (((r0 >> 107) >>> this.cvc.hashCode()) - 94) >>> this.expirationYm.hashCode() : (((this.cardNum.hashCode() * 31) + this.cvc.hashCode()) * 31) + this.expirationYm.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StaticCvc(cardNum=" + this.cardNum + ", cvc=" + this.cvc + ", expirationYm=" + this.expirationYm + ")";
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return str;
    }
}
