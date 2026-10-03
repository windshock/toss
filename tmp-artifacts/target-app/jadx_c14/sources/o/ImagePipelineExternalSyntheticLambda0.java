package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImagePipelineExternalSyntheticLambda0[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final ImagePipelineExternalSyntheticLambda0 AVAILABLE = new ImagePipelineExternalSyntheticLambda0("AVAILABLE", 0);
    public static final ImagePipelineExternalSyntheticLambda0 REJECTED = new ImagePipelineExternalSyntheticLambda0("REJECTED", 1);
    public static final ImagePipelineExternalSyntheticLambda0 ERROR = new ImagePipelineExternalSyntheticLambda0("ERROR", 2);

    private static final /* synthetic */ ImagePipelineExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        ImagePipelineExternalSyntheticLambda0[] imagePipelineExternalSyntheticLambda0Arr = {AVAILABLE, REJECTED, ERROR};
        int i5 = i2 + 57;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return imagePipelineExternalSyntheticLambda0Arr;
    }

    public static EnumEntries<ImagePipelineExternalSyntheticLambda0> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ImagePipelineExternalSyntheticLambda0> enumEntries = $ENTRIES;
        int i5 = i2 + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static ImagePipelineExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExternalSyntheticLambda0 imagePipelineExternalSyntheticLambda0 = (ImagePipelineExternalSyntheticLambda0) Enum.valueOf(ImagePipelineExternalSyntheticLambda0.class, str);
        int i4 = IAuthTabCallback + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return imagePipelineExternalSyntheticLambda0;
    }

    public static ImagePipelineExternalSyntheticLambda0[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExternalSyntheticLambda0[] imagePipelineExternalSyntheticLambda0Arr = $VALUES;
        if (i3 == 0) {
            return (ImagePipelineExternalSyntheticLambda0[]) imagePipelineExternalSyntheticLambda0Arr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ImagePipelineExternalSyntheticLambda0(String str, int i) {
    }

    static {
        ImagePipelineExternalSyntheticLambda0[] imagePipelineExternalSyntheticLambda0Arr$values = $values();
        $VALUES = imagePipelineExternalSyntheticLambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(imagePipelineExternalSyntheticLambda0Arr$values);
        int i = onExtraCallback + 45;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
