package o;

import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda14 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda14[] $VALUES;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("CALL")
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda14 CALL = new ImagePipelineExperimentsBuilderExternalSyntheticLambda14("CALL", 0);

    @SerializedName("WEB")
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda14 WEB = new ImagePipelineExperimentsBuilderExternalSyntheticLambda14("WEB", 1);

    @SerializedName("APP_SCHEME")
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda14 APP_SCHEME = new ImagePipelineExperimentsBuilderExternalSyntheticLambda14("APP_SCHEME", 2);

    @SerializedName("IN_APP_APPLICATION")
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda14 IN_APP_APPLICATION = new ImagePipelineExperimentsBuilderExternalSyntheticLambda14("IN_APP_APPLICATION", 3);

    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda14[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda14[] imagePipelineExperimentsBuilderExternalSyntheticLambda14Arr = {CALL, WEB, APP_SCHEME, IN_APP_APPLICATION};
        int i5 = i3 + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda14Arr;
        }
        throw null;
    }

    public static EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda14> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda14 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda14 imagePipelineExperimentsBuilderExternalSyntheticLambda14 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda14) Enum.valueOf(ImagePipelineExperimentsBuilderExternalSyntheticLambda14.class, str);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return imagePipelineExperimentsBuilderExternalSyntheticLambda14;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda14[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda14[] imagePipelineExperimentsBuilderExternalSyntheticLambda14Arr = (ImagePipelineExperimentsBuilderExternalSyntheticLambda14[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda14Arr;
        }
        throw null;
    }

    private ImagePipelineExperimentsBuilderExternalSyntheticLambda14(String str, int i) {
    }

    static {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda14[] imagePipelineExperimentsBuilderExternalSyntheticLambda14Arr$values = $values();
        $VALUES = imagePipelineExperimentsBuilderExternalSyntheticLambda14Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(imagePipelineExperimentsBuilderExternalSyntheticLambda14Arr$values);
        Companion = new onExtraCallback(null);
        int i = onExtraCallback + 93;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda14 IAuthTabCallback(onExtraCallback onextracallback, String str, boolean z, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 2) != 0) {
                int i3 = onNavigationEvent + 7;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda14 imagePipelineExperimentsBuilderExternalSyntheticLambda14OnExtraCallback = onextracallback.onExtraCallback(str, z);
            int i5 = onNavigationEvent + 83;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda14OnExtraCallback;
            }
            throw null;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda14 onExtraCallback(@NotNull String str, boolean z) {
            Object next;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator it = ImagePipelineExperimentsBuilderExternalSyntheticLambda14.getEntries().iterator();
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i4 = onExtraCallback + 45;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                next = it.next();
                if (!(!StringsKt.equals(((ImagePipelineExperimentsBuilderExternalSyntheticLambda14) next).name(), str, z))) {
                    int i6 = onNavigationEvent + 99;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda14 imagePipelineExperimentsBuilderExternalSyntheticLambda14 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda14) next;
            if (imagePipelineExperimentsBuilderExternalSyntheticLambda14 == null) {
                int i7 = onNavigationEvent + 57;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return ImagePipelineExperimentsBuilderExternalSyntheticLambda14.WEB;
            }
            int i9 = onExtraCallback + 47;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda14;
            }
            throw null;
        }
    }
}
