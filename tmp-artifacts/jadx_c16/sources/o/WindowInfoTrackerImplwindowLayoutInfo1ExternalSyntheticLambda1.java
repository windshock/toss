package o;

import im.toss.appsintoss.data.remote.model.AppsInTossProductOffer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000;
    public static final int onNavigationEvent = 0;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final List<AppsInTossProductOffer> asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final JsonObject onExtraCallbackWithResult;
    private final String onTransact;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1)) {
            return false;
        }
        WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1) obj;
        if (!Intrinsics.areEqual(this.asInterface, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.asInterface)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.onExtraCallback)) {
            int i2 = IAuthTabCallbackStubProxy + 65;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.onWarmupCompleted)) {
            int i4 = IAuthTabCallbackStubProxy + 117;
            int i5 = i4 % 128;
            access000 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 23;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 55 / 0;
            }
            return false;
        }
        if (!(!Intrinsics.areEqual(this.IAuthTabCallback, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.IAuthTabCallback))) {
            if (!Intrinsics.areEqual(this.onTransact, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.onTransact)) {
                int i9 = access000 + 61;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.onExtraCallbackWithResult)) {
                return Intrinsics.areEqual(this.IAuthTabCallbackDefault, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.IAuthTabCallbackStub, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.IAuthTabCallbackStub) && Intrinsics.areEqual(this.asBinder, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.asBinder);
            }
            int i11 = IAuthTabCallbackStubProxy + 33;
            access000 = i11 % 128;
            return i11 % 2 != 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.asInterface.hashCode();
        int iHashCode5 = this.onExtraCallback.hashCode();
        int iHashCode6 = this.onWarmupCompleted.hashCode();
        int iHashCode7 = this.IAuthTabCallback.hashCode();
        int iHashCode8 = this.onTransact.hashCode();
        JsonObject jsonObject = this.onExtraCallbackWithResult;
        if (jsonObject == null) {
            int i2 = access000 + 83;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = jsonObject.hashCode();
        }
        String str = this.IAuthTabCallbackDefault;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.IAuthTabCallbackStub;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i4 = access000 + 97;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        List<AppsInTossProductOffer> list = this.asBinder;
        if (list != null) {
            int i6 = IAuthTabCallbackStubProxy + 11;
            access000 = i6 % 128;
            if (i6 % 2 != 0) {
                list.hashCode();
                throw null;
            }
            iHashCode3 = list.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i7 = (((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3;
        int i8 = access000 + 37;
        IAuthTabCallbackStubProxy = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 82 / 0;
        }
        return i7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppsInTossProductListItem(productId=" + this.asInterface + ", displayName=" + this.onExtraCallback + ", displayPrice=" + this.onWarmupCompleted + ", description=" + this.IAuthTabCallback + ", iconUrl=" + this.onTransact + ", hint=" + this.onExtraCallbackWithResult + ", type=" + this.IAuthTabCallbackDefault + ", renewalCycle=" + this.IAuthTabCallbackStub + ", offers=" + this.asBinder + ")";
        int i2 = IAuthTabCallbackStubProxy + 81;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable JsonObject jsonObject, @Nullable String str6, @Nullable String str7, @Nullable List<AppsInTossProductOffer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.asInterface = str;
        this.onExtraCallback = str2;
        this.onWarmupCompleted = str3;
        this.IAuthTabCallback = str4;
        this.onTransact = str5;
        this.onExtraCallbackWithResult = jsonObject;
        this.IAuthTabCallbackDefault = str6;
        this.IAuthTabCallbackStub = str7;
        this.asBinder = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        JsonObject jsonObject2;
        String str8;
        List list2;
        if ((i & 32) != 0) {
            int i2 = access000 + 9;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 67 / 0;
            }
            jsonObject2 = null;
        } else {
            jsonObject2 = jsonObject;
        }
        String str9 = (i & 64) != 0 ? null : str6;
        if ((i & 128) != 0) {
            int i4 = access000;
            int i5 = i4 + 33;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 79;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str8 = null;
        } else {
            str8 = str7;
        }
        if ((i & 256) != 0) {
            int i10 = 2 % 2;
            list2 = null;
        } else {
            list2 = list;
        }
        this(str, str2, str3, str4, str5, jsonObject2, str9, str8, list2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 37;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onExtraCallback;
            int i4 = 78 / 0;
        } else {
            str = this.onExtraCallback;
        }
        int i5 = i2 + 111;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 99;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 105;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 99;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallbackDefault;
        int i5 = i3 + 49;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final List<AppsInTossProductOffer> onExtraCallback() {
        List<AppsInTossProductOffer> list;
        int i = 2 % 2;
        int i2 = access000 + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            list = this.asBinder;
            int i4 = 30 / 0;
        } else {
            list = this.asBinder;
        }
        int i5 = i3 + 117;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
