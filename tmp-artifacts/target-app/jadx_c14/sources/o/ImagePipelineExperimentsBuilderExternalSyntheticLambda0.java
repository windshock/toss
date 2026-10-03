package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda0[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String label;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda0 DEFAULT = new ImagePipelineExperimentsBuilderExternalSyntheticLambda0("DEFAULT", 0, "서버 컨트롤");
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda0 SELF_INPUT = new ImagePipelineExperimentsBuilderExternalSyntheticLambda0("SELF_INPUT", 1, "직접 입력");
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda0 HEALTH_INSURANCE_SCRAPE = new ImagePipelineExperimentsBuilderExternalSyntheticLambda0("HEALTH_INSURANCE_SCRAPE", 2, "직장인 스크래핑");
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda0 BUSINESS_NTS_SCRAPE = new ImagePipelineExperimentsBuilderExternalSyntheticLambda0("BUSINESS_NTS_SCRAPE", 3, "사업자 스크래핑");
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda0 BOTH = new ImagePipelineExperimentsBuilderExternalSyntheticLambda0("BOTH", 4, "스크래핑 둘다하기");

    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda0[] imagePipelineExperimentsBuilderExternalSyntheticLambda0Arr = {DEFAULT, SELF_INPUT, HEALTH_INSURANCE_SCRAPE, BUSINESS_NTS_SCRAPE, BOTH};
        int i5 = i2 + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return imagePipelineExperimentsBuilderExternalSyntheticLambda0Arr;
    }

    public static EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda0> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda0> enumEntries = $ENTRIES;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return enumEntries;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda0 imagePipelineExperimentsBuilderExternalSyntheticLambda0 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda0) Enum.valueOf(ImagePipelineExperimentsBuilderExternalSyntheticLambda0.class, str);
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda0;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda0[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda0[] imagePipelineExperimentsBuilderExternalSyntheticLambda0Arr = $VALUES;
        if (i3 == 0) {
            return (ImagePipelineExperimentsBuilderExternalSyntheticLambda0[]) imagePipelineExperimentsBuilderExternalSyntheticLambda0Arr.clone();
        }
        throw null;
    }

    private ImagePipelineExperimentsBuilderExternalSyntheticLambda0(String str, int i, String str2) {
        this.label = str2;
    }

    public final String getLabel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.label;
        int i4 = i3 + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda0[] imagePipelineExperimentsBuilderExternalSyntheticLambda0Arr$values = $values();
        $VALUES = imagePipelineExperimentsBuilderExternalSyntheticLambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(imagePipelineExperimentsBuilderExternalSyntheticLambda0Arr$values);
        int i = onExtraCallback + 29;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
