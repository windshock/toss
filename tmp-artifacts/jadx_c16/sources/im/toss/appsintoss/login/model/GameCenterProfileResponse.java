package im.toss.appsintoss.login.model;

import im.toss.appsintoss.login.model.GameCenterProfileResponse$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class GameCenterProfileResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String gameSessionId;
    private final String nickname;
    private final String profileImageUri;
    private final String statusCode;

    static {
        int i = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof GameCenterProfileResponse)) {
            return false;
        }
        GameCenterProfileResponse gameCenterProfileResponse = (GameCenterProfileResponse) obj;
        if (!Intrinsics.areEqual(this.statusCode, gameCenterProfileResponse.statusCode)) {
            int i4 = onExtraCallback + 115;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 69;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 74 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.nickname, gameCenterProfileResponse.nickname)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.profileImageUri, gameCenterProfileResponse.profileImageUri)) {
            int i9 = onExtraCallback + 77;
            onNavigationEvent = i9 % 128;
            return i9 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.gameSessionId, gameCenterProfileResponse.gameSessionId)) {
            return true;
        }
        int i10 = onExtraCallback + 93;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.statusCode.hashCode();
        String str = this.nickname;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.profileImageUri;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.gameSessionId;
        if (str3 != null) {
            iHashCode3 = str3.hashCode();
            int i3 = onNavigationEvent + 119;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GameCenterProfileResponse(statusCode=" + this.statusCode + ", nickname=" + this.nickname + ", profileImageUri=" + this.profileImageUri + ", gameSessionId=" + this.gameSessionId + ")";
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ GameCenterProfileResponse(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, GameCenterProfileResponse$.serializer.INSTANCE.getDescriptor());
            int i2 = 2 % 2;
        }
        this.statusCode = str;
        if ((i & 2) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str2;
        }
        if ((i & 4) == 0) {
            int i3 = onExtraCallback + 39;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.profileImageUri = null;
            if (i4 != 0) {
                int i5 = 18 / 0;
            }
            int i6 = 2 % 2;
        } else {
            this.profileImageUri = str3;
        }
        if ((i & 8) != 0) {
            this.gameSessionId = str4;
            int i7 = onNavigationEvent + 117;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        this.gameSessionId = null;
        int i9 = onNavigationEvent + 89;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(GameCenterProfileResponse gameCenterProfileResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, gameCenterProfileResponse.statusCode);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (gameCenterProfileResponse.nickname != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, gameCenterProfileResponse.nickname);
                    int i3 = onExtraCallback + 13;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, gameCenterProfileResponse.statusCode);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || gameCenterProfileResponse.profileImageUri != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, gameCenterProfileResponse.profileImageUri);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i5 = onNavigationEvent + 113;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                String str = gameCenterProfileResponse.gameSessionId;
                throw null;
            }
            if (gameCenterProfileResponse.gameSessionId == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, gameCenterProfileResponse.gameSessionId);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusCode;
        int i5 = i2 + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nickname;
        int i5 = i2 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.profileImageUri;
        int i5 = i2 + 85;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.gameSessionId;
        int i4 = i2 + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
