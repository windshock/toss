package im.toss.core.tracker;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossReferrerTemplate {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tracker.TossReferrerTemplate$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return TossReferrerTemplate.onNavigationEvent();
            }
            TossReferrerTemplate.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final List<String> parentSchemaKeyList;
    private final String template;
    private final String templateKey;

    public TossReferrerTemplate() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackStub;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TossReferrerTemplate)) {
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        TossReferrerTemplate tossReferrerTemplate = (TossReferrerTemplate) obj;
        if (!Intrinsics.areEqual(this.templateKey, tossReferrerTemplate.templateKey) || !Intrinsics.areEqual(this.template, tossReferrerTemplate.template)) {
            return false;
        }
        if (Intrinsics.areEqual(this.parentSchemaKeyList, tossReferrerTemplate.parentSchemaKeyList)) {
            return true;
        }
        int i4 = onExtraCallback + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.templateKey.hashCode() * 31) + this.template.hashCode()) * 31) + this.parentSchemaKeyList.hashCode();
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossReferrerTemplate(templateKey=" + this.templateKey + ", template=" + this.template + ", parentSchemaKeyList=" + this.parentSchemaKeyList + ")";
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TossReferrerTemplate> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                TossReferrerTemplate$$serializer tossReferrerTemplate$$serializer = TossReferrerTemplate$$serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            TossReferrerTemplate$$serializer tossReferrerTemplate$$serializer2 = TossReferrerTemplate$$serializer.INSTANCE;
            int i3 = onExtraCallback + 101;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return tossReferrerTemplate$$serializer2;
            }
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TossReferrerTemplate(int i, String str, String str2, List list, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.templateKey = str;
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 3;
            }
            if ((i & 2) != 0) {
                this.template = "";
            } else {
                this.template = str2;
                int i4 = onExtraCallback + 93;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = 2 % 2;
            if ((i & 4) != 0) {
                this.parentSchemaKeyList = CollectionsKt.emptyList();
                return;
            } else {
                this.parentSchemaKeyList = list;
                return;
            }
        }
        this.templateKey = "";
        int i7 = 2 % 2;
        if ((i & 2) != 0) {
        }
        int i62 = 2 % 2;
        if ((i & 4) != 0) {
        }
    }

    public TossReferrerTemplate(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.templateKey = str;
        this.template = str2;
        this.parentSchemaKeyList = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r1
      0x002a: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:10:0x0028, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(TossReferrerTemplate tossReferrerTemplate, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (!Intrinsics.areEqual(tossReferrerTemplate.templateKey, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, tossReferrerTemplate.templateKey);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onNavigationEvent + 55;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(tossReferrerTemplate.template, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, tossReferrerTemplate.template);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(tossReferrerTemplate.parentSchemaKeyList, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), tossReferrerTemplate.parentSchemaKeyList);
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TossReferrerTemplate(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallback + 15;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            list = CollectionsKt.emptyList();
        }
        this(str, str2, list);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.templateKey;
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.template;
        int i4 = i3 + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.parentSchemaKeyList;
        int i5 = i2 + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return list;
    }
}
