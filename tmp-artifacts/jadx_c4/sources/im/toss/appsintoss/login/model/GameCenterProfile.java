package im.toss.appsintoss.login.model;

import im.toss.appsintoss.login.model.GameCenterProfile$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GameCenterProfile {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String gameSessionId;
    private final String nickname;
    private final String profileImageUri;
    private final String statusCode;

    static {
        int i = onWarmupCompleted + 119;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCenterProfile)) {
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        GameCenterProfile gameCenterProfile = (GameCenterProfile) obj;
        if (!Intrinsics.areEqual(this.statusCode, gameCenterProfile.statusCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nickname, gameCenterProfile.nickname)) {
            int i4 = onExtraCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!(!Intrinsics.areEqual(this.profileImageUri, gameCenterProfile.profileImageUri))) {
            return Intrinsics.areEqual(this.gameSessionId, gameCenterProfile.gameSessionId);
        }
        int i5 = onExtraCallbackWithResult + 49;
        onExtraCallback = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.statusCode.hashCode();
        String str = this.nickname;
        if (str == null) {
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.profileImageUri;
        if (str2 == null) {
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.gameSessionId;
        int iHashCode4 = (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        int i6 = onExtraCallbackWithResult + 5;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 56 / 0;
        }
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GameCenterProfile(statusCode=" + this.statusCode + ", nickname=" + this.nickname + ", profileImageUri=" + this.profileImageUri + ", gameSessionId=" + this.gameSessionId + ")";
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GameCenterProfile> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            GameCenterProfile$.serializer serializerVar = GameCenterProfile$.serializer.INSTANCE;
            int i4 = onExtraCallback + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ GameCenterProfile(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 15;
        if (15 != (i & 15)) {
            int i3 = onExtraCallback + 31;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = GameCenterProfile$.serializer.INSTANCE.getDescriptor();
                i2 = 73;
            } else {
                descriptor = GameCenterProfile$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 79;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.statusCode = str;
        this.nickname = str2;
        this.profileImageUri = str3;
        this.gameSessionId = str4;
    }

    public GameCenterProfile(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.statusCode = str;
        this.nickname = str2;
        this.profileImageUri = str3;
        this.gameSessionId = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(GameCenterProfile gameCenterProfile, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, gameCenterProfile.statusCode);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, gameCenterProfile.nickname);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, gameCenterProfile.profileImageUri);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, gameCenterProfile.gameSessionId);
        int i4 = onExtraCallbackWithResult + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.statusCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.nickname;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.profileImageUri;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.gameSessionId;
        int i5 = i3 + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
