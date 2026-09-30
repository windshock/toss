package im.toss.securities.core.router.spec;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.setAlphaColor;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class SavedNavEntry {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<Pair<String, String>> feedExtras;
    private final String id;
    private final String landingId;
    private final TossSecRoute route;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = IAuthTabCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TossSecRoute.Companion.serializer();
            obj.hashCode();
            throw null;
        }
        KSerializer<TossSecRoute> kSerializerSerializer = TossSecRoute.Companion.serializer();
        int i3 = IAuthTabCallback + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerSerializer;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            return (KSerializer) onWarmupCompleted(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -193876714, iOnExtraCallbackWithResult, new Object[0], 193876715, TTVideoLandingPageActivity.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(new setAlphaColor(getwrigglelayout, getwrigglelayout));
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~(i5 | i4);
        int i8 = i3 | i7;
        int i9 = (~(i4 | (~i3))) | i5;
        int i10 = i5 + i3 + i + ((-1932811043) * i2) + (1521317780 * i6);
        int i11 = i10 * i10;
        int i12 = ((i5 * (-919556932)) - 154402816) + ((-919556932) * i3) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i) + ((-2098724864) * i2) + ((-1398800384) * i6) + ((-1444151296) * i11);
        int i13 = (i5 * 1794637580) + 2133191799 + (i3 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i * 1794637741) + (i2 * (-1844343719)) + (i6 * (-1188939004)) + (i11 * (-394526720));
        if (i12 + (i13 * i13 * 821297152) == 1) {
            return onNavigationEvent(objArr);
        }
        SavedNavEntry savedNavEntry = (SavedNavEntry) objArr[0];
        int i14 = 2 % 2;
        int i15 = onWarmupCompleted;
        int i16 = i15 + 29;
        IAuthTabCallback = i16 % 128;
        int i17 = i16 % 2;
        String str = savedNavEntry.landingId;
        int i18 = i15 + 11;
        IAuthTabCallback = i18 % 128;
        int i19 = i18 % 2;
        return str;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedNavEntry)) {
            int i2 = onWarmupCompleted + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SavedNavEntry savedNavEntry = (SavedNavEntry) obj;
        if (!Intrinsics.areEqual(this.route, savedNavEntry.route)) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 11;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 7;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.id, savedNavEntry.id)) {
            int i9 = onWarmupCompleted + 5;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.feedExtras, savedNavEntry.feedExtras)) {
            return Intrinsics.areEqual(this.landingId, savedNavEntry.landingId);
        }
        int i11 = onWarmupCompleted + 5;
        IAuthTabCallback = i11 % 128;
        return i11 % 2 != 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.route.hashCode();
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = this.feedExtras.hashCode();
        String str = this.landingId;
        if (str == null) {
            int i3 = onWarmupCompleted + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode4 = str.hashCode();
            int i5 = IAuthTabCallback + 113;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SavedNavEntry(route=" + this.route + ", id=" + this.id + ", feedExtras=" + this.feedExtras + ", landingId=" + this.landingId + ")";
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SavedNavEntry> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            SavedNavEntry$$serializer savedNavEntry$$serializer = SavedNavEntry$$serializer.INSTANCE;
            if (i3 == 0) {
                return savedNavEntry$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.core.router.spec.SavedNavEntry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return SavedNavEntry.IAuthTabCallback();
                }
                SavedNavEntry.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.core.router.spec.SavedNavEntry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 99;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = SavedNavEntry.onExtraCallback();
                int i4 = onExtraCallback + 13;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null};
        int i = onNavigationEvent + 1;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ SavedNavEntry(int i, TossSecRoute tossSecRoute, String str, List list, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, SavedNavEntry$$serializer.INSTANCE.getDescriptor());
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.route = tossSecRoute;
        this.id = str;
        if ((i & 4) == 0) {
            this.feedExtras = CollectionsKt.emptyList();
            int i5 = 2 % 2;
        } else {
            this.feedExtras = list;
        }
        if ((i & 8) == 0) {
            int i6 = onWarmupCompleted + 97;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            this.landingId = null;
            return;
        }
        this.landingId = str2;
        int i8 = onWarmupCompleted + 111;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 49 / 0;
        }
    }

    public SavedNavEntry(@NotNull TossSecRoute tossSecRoute, @NotNull String str, @NotNull List<Pair<String, String>> list, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(tossSecRoute, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.route = tossSecRoute;
        this.id = str;
        this.feedExtras = list;
        this.landingId = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(SavedNavEntry savedNavEntry, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), savedNavEntry.route);
        vylVar.onExtraCallback(serialDescriptor, 1, savedNavEntry.id);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = IAuthTabCallback + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(savedNavEntry.feedExtras, CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), savedNavEntry.feedExtras);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || savedNavEntry.landingId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, savedNavEntry.landingId);
            int i6 = onWarmupCompleted + 123;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TossSecRoute IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        TossSecRoute tossSecRoute = this.route;
        int i5 = i3 + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return tossSecRoute;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i2 + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<Pair<String, String>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<Pair<String, String>> list = this.feedExtras;
        int i5 = i2 + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (KSerializer) onWarmupCompleted(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -193876714, iOnExtraCallbackWithResult, new Object[0], 193876715, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    public final String onTransact() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -321329375, iOnExtraCallbackWithResult, new Object[]{this}, 321329375, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }
}
