package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda16 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda16[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda16 WEB = new ImagePipelineExperimentsBuilderExternalSyntheticLambda16("WEB", 0);
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda16 NATIVE = new ImagePipelineExperimentsBuilderExternalSyntheticLambda16("NATIVE", 1);

    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda16[] $values() {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda16[] imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            ImagePipelineExperimentsBuilderExternalSyntheticLambda16 imagePipelineExperimentsBuilderExternalSyntheticLambda16 = WEB;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda16 imagePipelineExperimentsBuilderExternalSyntheticLambda162 = NATIVE;
            imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda16[5];
            imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr[1] = imagePipelineExperimentsBuilderExternalSyntheticLambda16;
            imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr[0] = imagePipelineExperimentsBuilderExternalSyntheticLambda162;
        } else {
            imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda16[]{WEB, NATIVE};
        }
        int i4 = i2 + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda16> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda16> enumEntries = $ENTRIES;
        int i5 = i3 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return enumEntries;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda16 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda16 imagePipelineExperimentsBuilderExternalSyntheticLambda16 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda16) Enum.valueOf(ImagePipelineExperimentsBuilderExternalSyntheticLambda16.class, str);
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda16;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda16[] values() {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda16[] imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr = (ImagePipelineExperimentsBuilderExternalSyntheticLambda16[]) $VALUES.clone();
            int i3 = 69 / 0;
        } else {
            imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr = (ImagePipelineExperimentsBuilderExternalSyntheticLambda16[]) $VALUES.clone();
        }
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr;
    }

    private ImagePipelineExperimentsBuilderExternalSyntheticLambda16(String str, int i) {
    }

    static {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda16[] imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr$values = $values();
        $VALUES = imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(imagePipelineExperimentsBuilderExternalSyntheticLambda16Arr$values);
        int i = onNavigationEvent + 89;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
