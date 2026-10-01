package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class saveFromResponse {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<basicdefault> onNavigationEvent;

    static {
        int i = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public saveFromResponse() {
        List list = null;
        this(list, 1, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof saveFromResponse)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, ((saveFromResponse) obj).onNavigationEvent)) {
            return true;
        }
        int i7 = IAuthTabCallback + 5;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FramebufferAttachmentSpecification(attachments=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return str;
    }

    public saveFromResponse(@NotNull List<basicdefault> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
    }

    public final List<basicdefault> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<basicdefault> list = this.onNavigationEvent;
        int i5 = i2 + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ saveFromResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = CollectionsKt.listOf(new basicdefault(pathMatch.RGBA8, false, false, 6, null));
            int i2 = onExtraCallback + 65;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 2;
            } else {
                int i4 = 2 % 2;
            }
        }
        this(list);
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ saveFromResponse onNavigationEvent(onNavigationEvent onnavigationevent, pathMatch pathmatch, boolean z, boolean z2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 73;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0 && (i & 1) != 0) {
                pathmatch = pathMatch.RGBA8;
            }
            if ((i & 2) != 0) {
                int i4 = IAuthTabCallback + 31;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            if ((i & 4) != 0) {
                int i6 = IAuthTabCallback + 117;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                z2 = false;
            }
            return onnavigationevent.onExtraCallback(pathmatch, z, z2);
        }

        public final saveFromResponse onExtraCallback(@NotNull pathMatch pathmatch, boolean z, boolean z2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(pathmatch, "");
            saveFromResponse savefromresponse = new saveFromResponse(CollectionsKt.listOf(new basicdefault(pathmatch, z2, z)));
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return savefromresponse;
        }
    }
}
