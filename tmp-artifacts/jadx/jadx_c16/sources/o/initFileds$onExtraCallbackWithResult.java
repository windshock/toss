package o;

import im.toss.features.cardissue.event.model.issuance.EventIssuanceListResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class initFileds$onExtraCallbackWithResult extends initFileds {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final EventIssuanceListResponse onNavigationEvent;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r5 instanceof o.initFileds$onExtraCallbackWithResult)) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4.onNavigationEvent, ((o.initFileds$onExtraCallbackWithResult) r5).onNavigationEvent) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r5 = o.initFileds$onExtraCallbackWithResult.onExtraCallbackWithResult + 3;
        o.initFileds$onExtraCallbackWithResult.onExtraCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.onNavigationEvent.hashCode();
            int i3 = 70 / 0;
        } else {
            iHashCode = this.onNavigationEvent.hashCode();
        }
        int i4 = onExtraCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Success(data=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public initFileds$onExtraCallbackWithResult(@NotNull EventIssuanceListResponse eventIssuanceListResponse) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(eventIssuanceListResponse, "");
        this.onNavigationEvent = eventIssuanceListResponse;
    }

    public final EventIssuanceListResponse IAuthTabCallback() {
        EventIssuanceListResponse eventIssuanceListResponse;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            eventIssuanceListResponse = this.onNavigationEvent;
            int i4 = 23 / 0;
        } else {
            eventIssuanceListResponse = this.onNavigationEvent;
        }
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return eventIssuanceListResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
