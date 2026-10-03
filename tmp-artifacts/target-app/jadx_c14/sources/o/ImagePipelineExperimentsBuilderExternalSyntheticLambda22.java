package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda22 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda22[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda22 AVAILABLE = new ImagePipelineExperimentsBuilderExternalSyntheticLambda22("AVAILABLE", 0);
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda22 RESTRICTED = new ImagePipelineExperimentsBuilderExternalSyntheticLambda22("RESTRICTED", 1);
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda22 TIME_OVER = new ImagePipelineExperimentsBuilderExternalSyntheticLambda22("TIME_OVER", 2);

    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda22[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda22[] imagePipelineExperimentsBuilderExternalSyntheticLambda22Arr = {AVAILABLE, RESTRICTED, TIME_OVER};
        int i5 = i3 + 119;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda22Arr;
        }
        throw null;
    }

    public static EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda22> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda22> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return enumEntries;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda22 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda22 imagePipelineExperimentsBuilderExternalSyntheticLambda22 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda22) Enum.valueOf(ImagePipelineExperimentsBuilderExternalSyntheticLambda22.class, str);
        int i4 = onNavigationEvent + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda22;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda22[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda22[] imagePipelineExperimentsBuilderExternalSyntheticLambda22Arr = (ImagePipelineExperimentsBuilderExternalSyntheticLambda22[]) $VALUES.clone();
        int i4 = onNavigationEvent + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda22Arr;
        }
        throw null;
    }

    private ImagePipelineExperimentsBuilderExternalSyntheticLambda22(String str, int i) {
    }

    static {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda22[] imagePipelineExperimentsBuilderExternalSyntheticLambda22Arr$values = $values();
        $VALUES = imagePipelineExperimentsBuilderExternalSyntheticLambda22Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(imagePipelineExperimentsBuilderExternalSyntheticLambda22Arr$values);
        int i = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
