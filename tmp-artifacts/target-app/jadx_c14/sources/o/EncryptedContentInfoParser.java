package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EncryptedContentInfoParser implements getOther {
    public static final int TYPE_BOLD = 1;
    public static final int TYPE_THIN = 0;
    private int position;
    private int type;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int $stable = 8;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedContentInfoParser)) {
            return false;
        }
        EncryptedContentInfoParser encryptedContentInfoParser = (EncryptedContentInfoParser) obj;
        return this.position == encryptedContentInfoParser.position && this.type == encryptedContentInfoParser.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.position) * 31) + Integer.hashCode(this.type);
    }

    public String toString() {
        return "Divider(position=" + this.position + ", type=" + this.type + ")";
    }

    public EncryptedContentInfoParser(int i, int i2) {
        this.position = i;
        this.type = i2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public final int onExtraCallbackWithResult() {
        return this.type;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.DIVIDER;
    }
}
