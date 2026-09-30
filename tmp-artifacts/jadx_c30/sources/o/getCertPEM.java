package o;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCertPEM {
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final Map<String, String> onWarmupCompleted;

    public getCertPEM() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCertPEM)) {
            return false;
        }
        getCertPEM getcertpem = (getCertPEM) obj;
        return Intrinsics.areEqual(this.asInterface, getcertpem.asInterface) && Intrinsics.areEqual(this.IAuthTabCallbackStub, getcertpem.IAuthTabCallbackStub) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getcertpem.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, getcertpem.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, getcertpem.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, getcertpem.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.onExtraCallback, getcertpem.onExtraCallback) && Intrinsics.areEqual(this.asBinder, getcertpem.asBinder) && Intrinsics.areEqual(this.onTransact, getcertpem.onTransact) && Intrinsics.areEqual(this.onWarmupCompleted, getcertpem.onWarmupCompleted);
    }

    public int hashCode() {
        String str = this.asInterface;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.IAuthTabCallbackStub;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.onExtraCallbackWithResult;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.IAuthTabCallback;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.onNavigationEvent;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.IAuthTabCallbackDefault;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.onExtraCallback;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.asBinder;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.onTransact;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        Map<String, String> map = this.onWarmupCompleted;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "GraniteVideoAdsConfig(type=" + this.asInterface + ", streamType=" + this.IAuthTabCallbackStub + ", adTagUrl=" + this.onExtraCallbackWithResult + ", adLanguage=" + this.IAuthTabCallback + ", contentSourceId=" + this.onNavigationEvent + ", videoId=" + this.IAuthTabCallbackDefault + ", assetKey=" + this.onExtraCallback + ", format=" + this.asBinder + ", fallbackUri=" + this.onTransact + ", adTagParameters=" + this.onWarmupCompleted + ")";
    }

    public getCertPEM(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Map<String, String> map) {
        this.asInterface = str;
        this.IAuthTabCallbackStub = str2;
        this.onExtraCallbackWithResult = str3;
        this.IAuthTabCallback = str4;
        this.onNavigationEvent = str5;
        this.IAuthTabCallbackDefault = str6;
        this.onExtraCallback = str7;
        this.asBinder = str8;
        this.onTransact = str9;
        this.onWarmupCompleted = map;
    }

    public /* synthetic */ getCertPEM(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? map : null);
    }
}
