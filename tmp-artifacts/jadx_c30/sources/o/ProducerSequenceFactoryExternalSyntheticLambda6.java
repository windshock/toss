package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda6[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final ProducerSequenceFactoryExternalSyntheticLambda6 KOREAN = new ProducerSequenceFactoryExternalSyntheticLambda6("KOREAN", 0);
    public static final ProducerSequenceFactoryExternalSyntheticLambda6 ENGLISH = new ProducerSequenceFactoryExternalSyntheticLambda6("ENGLISH", 1);
    public static final ProducerSequenceFactoryExternalSyntheticLambda6 COMPANY = new ProducerSequenceFactoryExternalSyntheticLambda6("COMPANY", 2);

    private static final /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda6[] $values() {
        ProducerSequenceFactoryExternalSyntheticLambda6[] producerSequenceFactoryExternalSyntheticLambda6Arr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            ProducerSequenceFactoryExternalSyntheticLambda6 producerSequenceFactoryExternalSyntheticLambda6 = KOREAN;
            ProducerSequenceFactoryExternalSyntheticLambda6 producerSequenceFactoryExternalSyntheticLambda62 = ENGLISH;
            ProducerSequenceFactoryExternalSyntheticLambda6 producerSequenceFactoryExternalSyntheticLambda63 = COMPANY;
            producerSequenceFactoryExternalSyntheticLambda6Arr = new ProducerSequenceFactoryExternalSyntheticLambda6[3];
            producerSequenceFactoryExternalSyntheticLambda6Arr[1] = producerSequenceFactoryExternalSyntheticLambda6;
            producerSequenceFactoryExternalSyntheticLambda6Arr[0] = producerSequenceFactoryExternalSyntheticLambda62;
            producerSequenceFactoryExternalSyntheticLambda6Arr[4] = producerSequenceFactoryExternalSyntheticLambda63;
        } else {
            producerSequenceFactoryExternalSyntheticLambda6Arr = new ProducerSequenceFactoryExternalSyntheticLambda6[]{KOREAN, ENGLISH, COMPANY};
        }
        int i4 = i3 + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return producerSequenceFactoryExternalSyntheticLambda6Arr;
    }

    public static EnumEntries<ProducerSequenceFactoryExternalSyntheticLambda6> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ProducerSequenceFactoryExternalSyntheticLambda6> enumEntries = $ENTRIES;
        int i5 = i2 + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static ProducerSequenceFactoryExternalSyntheticLambda6 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ProducerSequenceFactoryExternalSyntheticLambda6 producerSequenceFactoryExternalSyntheticLambda6 = (ProducerSequenceFactoryExternalSyntheticLambda6) Enum.valueOf(ProducerSequenceFactoryExternalSyntheticLambda6.class, str);
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return producerSequenceFactoryExternalSyntheticLambda6;
    }

    public static ProducerSequenceFactoryExternalSyntheticLambda6[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ProducerSequenceFactoryExternalSyntheticLambda6[] producerSequenceFactoryExternalSyntheticLambda6Arr = (ProducerSequenceFactoryExternalSyntheticLambda6[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return producerSequenceFactoryExternalSyntheticLambda6Arr;
    }

    private ProducerSequenceFactoryExternalSyntheticLambda6(String str, int i) {
    }

    static {
        ProducerSequenceFactoryExternalSyntheticLambda6[] producerSequenceFactoryExternalSyntheticLambda6Arr$values = $values();
        $VALUES = producerSequenceFactoryExternalSyntheticLambda6Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(producerSequenceFactoryExternalSyntheticLambda6Arr$values);
        Companion = new onWarmupCompleted(null);
        int i = onNavigationEvent + 15;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
