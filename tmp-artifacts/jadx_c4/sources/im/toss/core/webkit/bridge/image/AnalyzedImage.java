package im.toss.core.webkit.bridge.image;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.FilesKt;
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
import o.oty1;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AnalyzedImage {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<String> barcodes;
    private final Long creationDate;
    private final String dataUri;
    private final String id;
    private final List<String> texts;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallback;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyzedImage)) {
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AnalyzedImage analyzedImage = (AnalyzedImage) obj;
        if (!Intrinsics.areEqual(this.id, analyzedImage.id)) {
            int i4 = onWarmupCompleted + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.dataUri, analyzedImage.dataUri)) {
            int i6 = onNavigationEvent + 51;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 103;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.barcodes, analyzedImage.barcodes)) {
            if (Intrinsics.areEqual(this.texts, analyzedImage.texts)) {
                return Intrinsics.areEqual(this.creationDate, analyzedImage.creationDate);
            }
            int i11 = onWarmupCompleted + 105;
            onNavigationEvent = i11 % 128;
            return i11 % 2 != 0;
        }
        int i12 = onNavigationEvent;
        int i13 = i12 + 35;
        onWarmupCompleted = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i12 + 123;
        onWarmupCompleted = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c A[PHI: r1 r3 r4 r5 r6
      0x004c: PHI (r1v15 int) = (r1v5 int), (r1v17 int) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r3v3 int) = (r3v1 int), (r3v5 int) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r4v3 int) = (r4v1 int), (r4v5 int) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r5v3 int) = (r5v1 int), (r5v5 int) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r6v1 java.lang.Long) = (r6v0 java.lang.Long), (r6v5 java.lang.Long) binds: [B:8:0x0049, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        Long l;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        int iHashCode5 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.id.hashCode();
            iHashCode2 = this.dataUri.hashCode();
            iHashCode3 = this.barcodes.hashCode();
            iHashCode4 = this.texts.hashCode();
            l = this.creationDate;
            int i3 = 60 / 0;
            if (l != null) {
                iHashCode5 = l.hashCode();
                int i4 = onNavigationEvent + 115;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            iHashCode = this.id.hashCode();
            iHashCode2 = this.dataUri.hashCode();
            iHashCode3 = this.barcodes.hashCode();
            iHashCode4 = this.texts.hashCode();
            l = this.creationDate;
            if (l != null) {
            }
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AnalyzedImage(id=" + this.id + ", dataUri=" + this.dataUri + ", barcodes=" + this.barcodes + ", texts=" + this.texts + ", creationDate=" + this.creationDate + ")";
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ AnalyzedImage(int i, String str, String str2, List list, List list2, Long l, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onWarmupCompleted + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 15, AnalyzedImage$$serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.id = str;
        this.dataUri = str2;
        this.barcodes = list;
        this.texts = list2;
        Object obj = null;
        if ((i & 16) == 0) {
            this.creationDate = null;
            int i7 = onNavigationEvent + 57;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        this.creationDate = l;
        int i9 = onWarmupCompleted + 47;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public AnalyzedImage(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<String> list2, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.id = str;
        this.dataUri = str2;
        this.barcodes = list;
        this.texts = list2;
        this.creationDate = l;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(AnalyzedImage analyzedImage, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, analyzedImage.id);
        vylVar.onExtraCallback(serialDescriptor, 1, analyzedImage.dataUri);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), analyzedImage.barcodes);
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), analyzedImage.texts);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i4 = onWarmupCompleted + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (analyzedImage.creationDate == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, analyzedImage.creationDate);
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AnalyzedImage> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AnalyzedImage$$serializer analyzedImage$$serializer = AnalyzedImage$$serializer.INSTANCE;
            int i4 = onExtraCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return analyzedImage$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ AnalyzedImage onExtraCallbackWithResult(Companion companion, String str, List list, List list2, Long l, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0 ? (i & 8) != 0 : (i & 101) != 0) {
                int i5 = i3 + 93;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                l = null;
            }
            return companion.IAuthTabCallback(str, list, list2, l);
        }

        public final AnalyzedImage IAuthTabCallback(@NotNull String str, @NotNull List<String> list, @NotNull List<String> list2, @Nullable Long l) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            File file = new File(str);
            Object obj = null;
            AnalyzedImage analyzedImage = new AnalyzedImage(FilesKt.getNameWithoutExtension(file), FilesKt.readText$default(file, (Charset) null, 1, (Object) null), list, list2, l);
            int i2 = onExtraCallback + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return analyzedImage;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.webkit.bridge.image.AnalyzedImage$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return AnalyzedImage.onNavigationEvent();
                }
                AnalyzedImage.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.webkit.bridge.image.AnalyzedImage$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 87;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    AnalyzedImage.IAuthTabCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerIAuthTabCallback = AnalyzedImage.IAuthTabCallback();
                int i3 = onExtraCallback + 93;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerIAuthTabCallback;
            }
        }), null};
        int i = IAuthTabCallback + 45;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 96 / 0;
        }
    }
}
