package im.toss.ads_sdk.remote.model;

import com.google.android.gms.ads.nativead.NativeAd;
import im.toss.ads_sdk.remote.model.AdMobFailedReason$;
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
import o.setOnPageChangeListener;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdMobFailedReason {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final AdmobError error;
    private final List<String> filterReasons;
    private final String loadedContent;
    private final String reason;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.AdMobFailedReason$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = AdMobFailedReason.IAuthTabCallback();
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }
    }), null, null};

    public AdMobFailedReason() {
        this((String) null, (List) null, (String) null, (AdmobError) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return kSerializerAsInterface;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AdMobFailedReason)) {
            return false;
        }
        AdMobFailedReason adMobFailedReason = (AdMobFailedReason) obj;
        if (!Intrinsics.areEqual(this.reason, adMobFailedReason.reason)) {
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.filterReasons, adMobFailedReason.filterReasons)) {
            int i6 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.loadedContent, adMobFailedReason.loadedContent)) {
            return Intrinsics.areEqual(this.error, adMobFailedReason.error);
        }
        int i8 = onExtraCallbackWithResult;
        int i9 = i8 + 53;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 105;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.reason;
        if (str == null) {
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        List<String> list = this.filterReasons;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str2 = this.loadedContent;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i3 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        AdmobError admobError = this.error;
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + (admobError != null ? admobError.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdMobFailedReason(reason=" + this.reason + ", filterReasons=" + this.filterReasons + ", loadedContent=" + this.loadedContent + ", error=" + this.error + ")";
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ AdMobFailedReason(int i, String str, List list, String str2, AdmobError admobError, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.reason = null;
        } else {
            this.reason = str;
        }
        int i2 = 2 % 2;
        if ((i & 2) == 0) {
            this.filterReasons = null;
            int i3 = 2 % 2;
        } else {
            this.filterReasons = list;
        }
        if ((i & 4) == 0) {
            this.loadedContent = null;
        } else {
            this.loadedContent = str2;
            int i4 = 2 % 2;
        }
        if ((i & 8) != 0) {
            this.error = admobError;
            int i5 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        this.error = null;
        if (i8 == 0) {
            throw null;
        }
    }

    public AdMobFailedReason(@Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable AdmobError admobError) {
        this.reason = str;
        this.filterReasons = list;
        this.loadedContent = str2;
        this.error = admobError;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(AdMobFailedReason adMobFailedReason, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, adMobFailedReason.reason);
        } else {
            int i2 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (adMobFailedReason.reason != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 82 / 0;
                if (adMobFailedReason.filterReasons != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), adMobFailedReason.filterReasons);
                }
            } else if (adMobFailedReason.filterReasons != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || adMobFailedReason.loadedContent != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, adMobFailedReason.loadedContent);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || adMobFailedReason.error != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, AdmobError$$serializer.INSTANCE, adMobFailedReason.error);
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdMobFailedReason(String str, List list, String str2, AdmobError admobError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            list = null;
        }
        str2 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            int i4 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            admobError = null;
        }
        this(str, list, str2, admobError);
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.reason;
        int i5 = i3 + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<String> list = this.filterReasons;
        int i5 = i3 + 113;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loadedContent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AdmobError onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AdmobError admobError = this.error;
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return admobError;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdMobFailedReason> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AdMobFailedReason$.serializer serializerVar = AdMobFailedReason$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }

        public final AdMobFailedReason onExtraCallback(@NotNull String str, @Nullable List<String> list) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            AdMobFailedReason adMobFailedReason = new AdMobFailedReason("FILTERED", list, str, (AdmobError) null, 8, (DefaultConstructorMarker) null);
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return adMobFailedReason;
        }

        public final String onExtraCallback(@NotNull NativeAd nativeAd) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                return setOnPageChangeListener.onExtraCallback.onNavigationEvent(nativeAd);
            }
            Intrinsics.checkNotNullParameter(nativeAd, "");
            setOnPageChangeListener.onExtraCallback.onNavigationEvent(nativeAd);
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 79;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
