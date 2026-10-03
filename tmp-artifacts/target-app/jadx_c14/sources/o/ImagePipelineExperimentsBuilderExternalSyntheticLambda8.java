package o;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda8[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda8 INIT = new ImagePipelineExperimentsBuilderExternalSyntheticLambda8("INIT", 0);
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda8 PRE_SCREENING_REQUEST = new ImagePipelineExperimentsBuilderExternalSyntheticLambda8("PRE_SCREENING_REQUEST", 1);
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda8 PRE_SCREENING_APPROVE = new ImagePipelineExperimentsBuilderExternalSyntheticLambda8("PRE_SCREENING_APPROVE", 2);
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda8 PRE_SCREENING_DONE = new ImagePipelineExperimentsBuilderExternalSyntheticLambda8("PRE_SCREENING_DONE", 3);
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda8 PRE_SCREENING_FAIL = new ImagePipelineExperimentsBuilderExternalSyntheticLambda8("PRE_SCREENING_FAIL", 4);

    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda8[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda8[] imagePipelineExperimentsBuilderExternalSyntheticLambda8Arr = {INIT, PRE_SCREENING_REQUEST, PRE_SCREENING_APPROVE, PRE_SCREENING_DONE, PRE_SCREENING_FAIL};
        int i5 = i2 + 115;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda8Arr;
    }

    public static EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda8> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda8 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda8 imagePipelineExperimentsBuilderExternalSyntheticLambda8 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda8) Enum.valueOf(ImagePipelineExperimentsBuilderExternalSyntheticLambda8.class, str);
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return imagePipelineExperimentsBuilderExternalSyntheticLambda8;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda8[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda8[] imagePipelineExperimentsBuilderExternalSyntheticLambda8Arr = (ImagePipelineExperimentsBuilderExternalSyntheticLambda8[]) $VALUES.clone();
        int i4 = onNavigationEvent + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return imagePipelineExperimentsBuilderExternalSyntheticLambda8Arr;
    }

    private ImagePipelineExperimentsBuilderExternalSyntheticLambda8(String str, int i) {
    }

    static {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda8[] imagePipelineExperimentsBuilderExternalSyntheticLambda8Arr$values = $values();
        $VALUES = imagePipelineExperimentsBuilderExternalSyntheticLambda8Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(imagePipelineExperimentsBuilderExternalSyntheticLambda8Arr$values);
        Companion = new onWarmupCompleted(null);
        int i = onWarmupCompleted + 41;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final boolean isOnPreScreening() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 57;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == PRE_SCREENING_REQUEST) {
            int i6 = i4 + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = i2 + 97;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final boolean isAnyApproved() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 111;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == PRE_SCREENING_APPROVE) {
            int i5 = i2 + 121;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i6 = i4 + 47;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isAllFailedOrRejected() {
        int i = 2 % 2;
        if (this != PRE_SCREENING_FAIL) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this != PRE_SCREENING_DONE) {
                int i5 = i2 + 73;
                onNavigationEvent = i5 % 128;
                return i5 % 2 == 0;
            }
        }
        int i6 = onNavigationEvent + 111;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 55 / 0;
        }
        return true;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda8 onNavigationEvent(@Nullable String str) {
            Iterator it;
            Object next;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                it = ImagePipelineExperimentsBuilderExternalSyntheticLambda8.getEntries().iterator();
                int i3 = 74 / 0;
            } else {
                it = ImagePipelineExperimentsBuilderExternalSyntheticLambda8.getEntries().iterator();
            }
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!(!Intrinsics.areEqual(((ImagePipelineExperimentsBuilderExternalSyntheticLambda8) next).name(), str))) {
                    break;
                }
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda8 imagePipelineExperimentsBuilderExternalSyntheticLambda8 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda8) next;
            if (imagePipelineExperimentsBuilderExternalSyntheticLambda8 != null) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda8;
            }
            int i4 = IAuthTabCallback + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return ImagePipelineExperimentsBuilderExternalSyntheticLambda8.INIT;
        }
    }
}
