package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setGlobalVariable {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("encryptedData")
    private final JsonObject encryptedData;

    @SerializedName("encryptionKeyId")
    private final long encryptionKeyId;

    @SerializedName("isServerDriven")
    private final Boolean isServerDriven;

    @SerializedName("verifyId")
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setGlobalVariable)) {
            return false;
        }
        setGlobalVariable setglobalvariable = (setGlobalVariable) obj;
        if (this.verifyId != setglobalvariable.verifyId || this.encryptionKeyId != setglobalvariable.encryptionKeyId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.encryptedData, setglobalvariable.encryptedData)) {
            int i3 = onNavigationEvent + 29;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 47 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.isServerDriven, setglobalvariable.isServerDriven)) {
            return true;
        }
        int i5 = onExtraCallback + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Long.hashCode(this.verifyId);
            Long.hashCode(this.encryptionKeyId);
            this.encryptedData.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = Long.hashCode(this.verifyId);
        int iHashCode2 = Long.hashCode(this.encryptionKeyId);
        int iHashCode3 = this.encryptedData.hashCode();
        Boolean bool = this.isServerDriven;
        int iHashCode4 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool == null ? 0 : bool.hashCode());
        int i3 = onExtraCallback + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode4;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyEncryptedContentRequest(verifyId=" + this.verifyId + ", encryptionKeyId=" + this.encryptionKeyId + ", encryptedData=" + this.encryptedData + ", isServerDriven=" + this.isServerDriven + ")";
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return str;
    }

    public setGlobalVariable(long j, long j2, @NotNull JsonObject jsonObject, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.verifyId = j;
        this.encryptionKeyId = j2;
        this.encryptedData = jsonObject;
        this.isServerDriven = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setGlobalVariable(long j, long j2, JsonObject jsonObject, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = onExtraCallback + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 44 / 0;
            }
            int i4 = 2 % 2;
            bool = null;
        }
        this(j, j2, jsonObject, bool);
    }
}
