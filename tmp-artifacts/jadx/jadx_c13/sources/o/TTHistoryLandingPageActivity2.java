package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity2 {
    private final TTFullScreenVideoActivity3 IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final Integer IAuthTabCallbackStub;
    private final Long IAuthTabCallbackStubProxy;
    private final boolean IAuthTabCallback_Parcel;
    private final Long access000;
    private final Long access100;
    private final Integer asBinder;
    private final long asInterface;
    private final long extraCallbackWithResult;
    private final Integer getInterfaceDescriptor;
    private final int onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final int onTransact;
    private final List<TTFullScreenVideoActivity3> onWarmupCompleted;
    private final long writeTypedObject;

    public TTHistoryLandingPageActivity2(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, @NotNull String str, long j, long j2, long j3, int i, long j4, int i2, int i3, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = tTFullScreenVideoActivity3;
        this.IAuthTabCallback_Parcel = z;
        this.onExtraCallbackWithResult = str;
        this.asInterface = j;
        this.onNavigationEvent = j2;
        this.extraCallbackWithResult = j3;
        this.onExtraCallback = i;
        this.writeTypedObject = j4;
        this.IAuthTabCallbackDefault = i2;
        this.onTransact = i3;
        this.IAuthTabCallbackStubProxy = l;
        this.access000 = l2;
        this.access100 = l3;
        this.getInterfaceDescriptor = num;
        this.asBinder = num2;
        this.IAuthTabCallbackStub = num3;
        this.onWarmupCompleted = new ArrayList();
    }

    public final TTFullScreenVideoActivity3 onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final boolean asInterface() {
        return this.IAuthTabCallback_Parcel;
    }

    public /* synthetic */ TTHistoryLandingPageActivity2(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(tTFullScreenVideoActivity3, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & 128) == 0 ? j4 : -1L, (i4 & 256) != 0 ? -1 : i2, (i4 & Imgcodecs.IMWRITE_AVIF_QUALITY) == 0 ? i3 : -1, (i4 & 1024) != 0 ? null : l, (i4 & 2048) != 0 ? null : l2, (i4 & 4096) != 0 ? null : l3, (i4 & TTHistoryActivity2.SIZE) != 0 ? null : num, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num2, (i4 & 32768) != 0 ? null : num3);
    }

    public final long onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final long onTransact() {
        return this.extraCallbackWithResult;
    }

    public final int IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final long asBinder() {
        return this.writeTypedObject;
    }

    public final List<TTFullScreenVideoActivity3> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final TTHistoryLandingPageActivity2 onNavigationEvent(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        return new TTHistoryLandingPageActivity2(this.IAuthTabCallback, this.IAuthTabCallback_Parcel, this.onExtraCallbackWithResult, this.asInterface, this.onNavigationEvent, this.extraCallbackWithResult, this.onExtraCallback, this.writeTypedObject, this.IAuthTabCallbackDefault, this.onTransact, this.IAuthTabCallbackStubProxy, this.access000, this.access100, num, num2, num3);
    }

    public final Long IAuthTabCallbackStub() {
        Long l = this.access000;
        if (l != null) {
            return Long.valueOf(TTHistoryLandingPageActivity13.IAuthTabCallback(l.longValue()));
        }
        if (this.asBinder != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final Long IAuthTabCallbackDefault() {
        Long l = this.IAuthTabCallbackStubProxy;
        if (l != null) {
            return Long.valueOf(TTHistoryLandingPageActivity13.IAuthTabCallback(l.longValue()));
        }
        if (this.getInterfaceDescriptor != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        int i = this.onTransact;
        if (i != -1) {
            return TTHistoryLandingPageActivity13.onNavigationEvent(this.IAuthTabCallbackDefault, i);
        }
        return null;
    }

    public final Long onExtraCallback() {
        Long l = this.access100;
        if (l != null) {
            return Long.valueOf(TTHistoryLandingPageActivity13.IAuthTabCallback(l.longValue()));
        }
        if (this.IAuthTabCallbackStub != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }
}
