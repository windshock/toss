package im.toss.ads_sdk.remote.model;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdMobFailedDetail {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final AdmobError error;
    private final List<String> filterReasons;
    private final String loadedContent;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.AdMobFailedDetail$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            KSerializer kSerializerOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerOnExtraCallbackWithResult = AdMobFailedDetail.onExtraCallbackWithResult();
                int i3 = 5 / 0;
            } else {
                kSerializerOnExtraCallbackWithResult = AdMobFailedDetail.onExtraCallbackWithResult();
            }
            int i4 = onExtraCallbackWithResult + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null, null};

    public AdMobFailedDetail() {
        this((List) null, (String) null, (AdmobError) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        int i4 = onExtraCallbackWithResult + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return kSerializerOnTransact;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 79;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof AdMobFailedDetail)) {
            return false;
        }
        AdMobFailedDetail adMobFailedDetail = (AdMobFailedDetail) obj;
        if (!Intrinsics.areEqual(this.filterReasons, adMobFailedDetail.filterReasons)) {
            int i7 = onExtraCallbackWithResult + 9;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.loadedContent, adMobFailedDetail.loadedContent)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.error, adMobFailedDetail.error))) {
            return true;
        }
        int i9 = onExtraCallback;
        int i10 = i9 + 19;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 97;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
      0x001c: PHI (r1v11 java.util.List<java.lang.String>) = (r1v4 java.util.List<java.lang.String>), (r1v13 java.util.List<java.lang.String>) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r3v9 int) = (r3v0 int), (r3v10 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
      0x001a: PHI (r3v1 int) = (r3v0 int), (r3v10 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        List<String> list;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            list = this.filterReasons;
            iHashCode = 1;
            iHashCode2 = list == null ? 0 : list.hashCode();
        } else {
            list = this.filterReasons;
            iHashCode = 0;
            if (list == null) {
            }
        }
        String str = this.loadedContent;
        if (str == null) {
            int i3 = onExtraCallbackWithResult + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str.hashCode();
        }
        AdmobError admobError = this.error;
        if (admobError != null) {
            int i5 = onExtraCallbackWithResult + 95;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode = admobError.hashCode();
                int i6 = 24 / 0;
            } else {
                iHashCode = admobError.hashCode();
            }
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdMobFailedDetail(filterReasons=" + this.filterReasons + ", loadedContent=" + this.loadedContent + ", error=" + this.error + ")";
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdMobFailedDetail> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AdMobFailedDetail$$serializer adMobFailedDetail$$serializer = AdMobFailedDetail$$serializer.INSTANCE;
            if (i3 == 0) {
                return adMobFailedDetail$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 9;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AdMobFailedDetail(int i, List list, String str, AdmobError admobError, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.filterReasons = null;
            int i2 = 2 % 2;
        } else {
            this.filterReasons = list;
        }
        if ((i & 2) == 0) {
            int i3 = onExtraCallbackWithResult + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.loadedContent = null;
            if (i4 == 0) {
                throw null;
            }
        } else {
            this.loadedContent = str;
            int i5 = onExtraCallback + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = 2 % 2;
        if ((i & 4) != 0) {
            this.error = admobError;
            return;
        }
        this.error = null;
        int i8 = onExtraCallback + 117;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 84 / 0;
        }
    }

    public AdMobFailedDetail(@Nullable List<String> list, @Nullable String str, @Nullable AdmobError admobError) {
        this.filterReasons = list;
        this.loadedContent = str;
        this.error = admobError;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(AdMobFailedDetail adMobFailedDetail, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || adMobFailedDetail.filterReasons != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), adMobFailedDetail.filterReasons);
            int i2 = onExtraCallbackWithResult + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 4;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || adMobFailedDetail.loadedContent != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, adMobFailedDetail.loadedContent);
            int i4 = onExtraCallback + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || adMobFailedDetail.error != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, AdmobError$$serializer.INSTANCE, adMobFailedDetail.error);
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdMobFailedDetail(List list, String str, AdmobError admobError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 39 / 0;
            }
            list = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 81;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            admobError = null;
        }
        this(list, str, admobError);
    }

    public final List<String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<String> list = this.filterReasons;
        int i4 = i3 + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.loadedContent;
            int i4 = 3 / 0;
        } else {
            str = this.loadedContent;
        }
        int i5 = i2 + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final AdmobError onNavigationEvent() {
        AdmobError admobError;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            admobError = this.error;
            int i4 = 85 / 0;
        } else {
            admobError = this.error;
        }
        int i5 = i2 + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return admobError;
    }
}
