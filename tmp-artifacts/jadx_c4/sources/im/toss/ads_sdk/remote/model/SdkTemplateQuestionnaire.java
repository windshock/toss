package im.toss.ads_sdk.remote.model;

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
public final class SdkTemplateQuestionnaire {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.SdkTemplateQuestionnaire$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                SdkTemplateQuestionnaire.onExtraCallbackWithResult();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = SdkTemplateQuestionnaire.onExtraCallbackWithResult();
            int i3 = onExtraCallback + 45;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }
    })};
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String choiceType;
    private final List<String> choices;
    private final boolean isRequired;
    private final String placeholder;
    private final String text;

    public SdkTemplateQuestionnaire() {
        this((String) null, (String) null, false, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        KSerializer kSerializerIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
            int i3 = 93 / 0;
        } else {
            kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        }
        int i4 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return kSerializerIAuthTabCallbackStub;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkTemplateQuestionnaire)) {
            int i5 = i2 + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        SdkTemplateQuestionnaire sdkTemplateQuestionnaire = (SdkTemplateQuestionnaire) obj;
        if (!Intrinsics.areEqual(this.text, sdkTemplateQuestionnaire.text)) {
            int i7 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.choiceType, sdkTemplateQuestionnaire.choiceType)) {
            return false;
        }
        if (this.isRequired != sdkTemplateQuestionnaire.isRequired) {
            int i9 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 91 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.placeholder, sdkTemplateQuestionnaire.placeholder)) {
            return Intrinsics.areEqual(this.choices, sdkTemplateQuestionnaire.choices);
        }
        int i11 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.text.hashCode() * 31) + this.choiceType.hashCode()) * 31) + Boolean.hashCode(this.isRequired)) * 31) + this.placeholder.hashCode()) * 31) + this.choices.hashCode();
        int i4 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SdkTemplateQuestionnaire(text=" + this.text + ", choiceType=" + this.choiceType + ", isRequired=" + this.isRequired + ", placeholder=" + this.placeholder + ", choices=" + this.choices + ")";
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SdkTemplateQuestionnaire> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SdkTemplateQuestionnaire$$serializer sdkTemplateQuestionnaire$$serializer = SdkTemplateQuestionnaire$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return sdkTemplateQuestionnaire$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 15;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SdkTemplateQuestionnaire(int i, String str, String str2, boolean z, String str3, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.text = "";
        } else {
            this.text = str;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = 2 % 2;
        if ((i & 2) == 0) {
            int i5 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.choiceType = "";
        } else {
            this.choiceType = str2;
        }
        if ((i & 4) == 0) {
            int i7 = onExtraCallbackWithResult;
            int i8 = i7 + 79;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            this.isRequired = false;
            int i10 = i7 + 75;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
        } else {
            this.isRequired = z;
        }
        if ((i & 8) != 0) {
            this.placeholder = str3;
            int i12 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 5 / 2;
            }
            if ((i & 16) != 0) {
                this.choices = CollectionsKt.emptyList();
                return;
            } else {
                this.choices = list;
                return;
            }
        }
        this.placeholder = "";
        int i14 = 2 % 2;
        if ((i & 16) != 0) {
        }
    }

    public SdkTemplateQuestionnaire(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.text = str;
        this.choiceType = str2;
        this.isRequired = z;
        this.placeholder = str3;
        this.choices = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(SdkTemplateQuestionnaire sdkTemplateQuestionnaire, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 91 / 0;
                if (!Intrinsics.areEqual(sdkTemplateQuestionnaire.text, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, sdkTemplateQuestionnaire.text);
                    int i4 = onExtraCallbackWithResult + 1;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else if (!Intrinsics.areEqual(sdkTemplateQuestionnaire.text, "")) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i6 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 32 / 0;
                if (!Intrinsics.areEqual(sdkTemplateQuestionnaire.choiceType, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, sdkTemplateQuestionnaire.choiceType);
                }
            } else if (!Intrinsics.areEqual(sdkTemplateQuestionnaire.choiceType, "")) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || sdkTemplateQuestionnaire.isRequired) {
            vylVar.onNavigationEvent(serialDescriptor, 2, sdkTemplateQuestionnaire.isRequired);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i8 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (!Intrinsics.areEqual(sdkTemplateQuestionnaire.placeholder, "")) {
                vylVar.onExtraCallback(serialDescriptor, 3, sdkTemplateQuestionnaire.placeholder);
                int i10 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(sdkTemplateQuestionnaire.choices, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), sdkTemplateQuestionnaire.choices);
        }
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 88 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SdkTemplateQuestionnaire(String str, String str2, boolean z, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        boolean z2;
        String str5 = "";
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            int i8 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 93 / 0;
            }
            int i10 = 2 % 2;
        } else {
            str5 = str3;
        }
        this(str, str4, z2, str5, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.text;
        int i4 = i3 + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.choiceType;
            int i4 = 18 / 0;
        } else {
            str = this.choiceType;
        }
        int i5 = i3 + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.choices;
        int i4 = i2 + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
