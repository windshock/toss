package im.toss.features.cardissue.event.model.issuance;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EventImageModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String type;
    private final String url;

    static {
        Object obj = null;
        int i = IAuthTabCallback + 123;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EventImageModel() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventImageModel)) {
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        EventImageModel eventImageModel = (EventImageModel) obj;
        if (!Intrinsics.areEqual(this.type, eventImageModel.type)) {
            int i4 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.url, eventImageModel.url)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.type.hashCode() * 31) + this.url.hashCode();
        int i4 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EventImageModel(type=" + this.type + ", url=" + this.url + ")";
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ EventImageModel(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.type = "";
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        } else {
            this.type = str;
        }
        int i4 = 2 % 2;
        if ((i & 2) == 0) {
            this.url = "";
            return;
        }
        this.url = str2;
        int i5 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public EventImageModel(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.url = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(EventImageModel eventImageModel, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(eventImageModel.type, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, eventImageModel.type);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(eventImageModel.url, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, eventImageModel.url);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EventImageModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.url;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
