package im.toss.core.webkit.bridge.image;

import java.io.File;
import java.nio.charset.Charset;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Image {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Long creationDate;
    private final String dataUri;
    private final long fileSize;
    private final int height;
    private final String id;
    private final int width;

    static {
        int i = IAuthTabCallback + 125;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        if (!Intrinsics.areEqual(this.id, image.id)) {
            int i4 = onExtraCallback + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.dataUri, image.dataUri)) {
            return false;
        }
        if (this.width != image.width) {
            int i6 = onWarmupCompleted + 55;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.height == image.height) {
            return this.fileSize == image.fileSize && Intrinsics.areEqual(this.creationDate, image.creationDate);
        }
        int i8 = onWarmupCompleted + 75;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = this.dataUri.hashCode();
        int iHashCode4 = Integer.hashCode(this.width);
        int iHashCode5 = Integer.hashCode(this.height);
        int iHashCode6 = Long.hashCode(this.fileSize);
        Long l = this.creationDate;
        if (l == null) {
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        int i4 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
        int i5 = onExtraCallback + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Image(id=" + this.id + ", dataUri=" + this.dataUri + ", width=" + this.width + ", height=" + this.height + ", fileSize=" + this.fileSize + ", creationDate=" + this.creationDate + ")";
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ Image(int i, String str, String str2, int i2, int i3, long j, Long l, okycx okycxVar) {
        if (31 != (i & 31)) {
            htf31.onExtraCallbackWithResult(i, 31, Image$$serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.id = str;
        this.dataUri = str2;
        this.width = i2;
        this.height = i3;
        this.fileSize = j;
        if ((i & 32) != 0) {
            this.creationDate = l;
            return;
        }
        this.creationDate = null;
        int i6 = onExtraCallback + 9;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 22 / 0;
        }
    }

    public Image(@NotNull String str, @NotNull String str2, int i, int i2, long j, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.dataUri = str2;
        this.width = i;
        this.height = i2;
        this.fileSize = j;
        this.creationDate = l;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(Image image, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, image.id);
        vylVar.onExtraCallback(serialDescriptor, 1, image.dataUri);
        vylVar.onExtraCallback(serialDescriptor, 2, image.width);
        vylVar.onExtraCallback(serialDescriptor, 3, image.height);
        vylVar.onExtraCallback(serialDescriptor, 4, image.fileSize);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Long l = image.creationDate;
                throw null;
            }
            if (image.creationDate == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, oty1.onExtraCallback, image.creationDate);
        int i5 = onWarmupCompleted + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.dataUri;
        }
        throw null;
    }

    public final Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.creationDate;
        int i5 = i2 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Image> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Image$$serializer image$$serializer = Image$$serializer.INSTANCE;
                throw null;
            }
            Image$$serializer image$$serializer2 = Image$$serializer.INSTANCE;
            int i3 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return image$$serializer2;
            }
            obj.hashCode();
            throw null;
        }

        public final Image onNavigationEvent(@NotNull String str, int i, int i2, long j, @Nullable Long l) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            File file = new File(str);
            Image image = new Image(FilesKt.getNameWithoutExtension(file), FilesKt.readText$default(file, (Charset) null, 1, (Object) null), i, i2, j, l);
            int i4 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 25 / 0;
            }
            return image;
        }
    }
}
