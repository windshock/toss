package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getPageMargin {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<getOffscreenPageLimit> IAuthTabCallback;
    private final String onExtraCallback;
    private final String onNavigationEvent;

    static {
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r6 instanceof o.getPageMargin) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r6 = (o.getPageMargin) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r6 = o.getPageMargin.IAuthTabCallbackDefault + 81;
        o.getPageMargin.IAuthTabCallbackStub = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 1;
        o.getPageMargin.IAuthTabCallbackStub = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 115;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        if (i3 % 2 != 0) {
            int i5 = 13 / 0;
        }
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i5 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "NativeAdsOmSdkTrackingData(requestId=" + this.onNavigationEvent + ", creativeId=" + this.onExtraCallback + ", events=" + this.IAuthTabCallback + ")";
        int i3 = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getPageMargin(@NotNull String str, @NotNull String str2, @NotNull List<getOffscreenPageLimit> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = str;
        this.onExtraCallback = str2;
        this.IAuthTabCallback = list;
    }

    public final String onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 83;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.onNavigationEvent;
        int i5 = i4 + 55;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 103;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.onExtraCallback;
        int i5 = i4 + 81;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<getOffscreenPageLimit> onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        List<getOffscreenPageLimit> list = this.IAuthTabCallback;
        int i6 = i3 + 63;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getPageMargin(String str, String str2, Map map, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 8) != 0) {
            int i3 = IAuthTabCallbackDefault + 83;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 59;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = "";
        }
        this(str, str2, map, str3);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public getPageMargin(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends List<String>> map, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ArrayList arrayList = new ArrayList();
        int i2 = IAuthTabCallbackStub + 101;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 % 2;
        }
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList2.add(new getOffscreenPageLimit(key, (String) it.next(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("code", str3))));
                int i4 = IAuthTabCallbackStub + 95;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        this(str, str2, arrayList);
    }
}
