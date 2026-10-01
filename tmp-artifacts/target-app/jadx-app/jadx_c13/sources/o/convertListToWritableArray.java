package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class convertListToWritableArray {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ convertListToWritableArray[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int textBoxGap;
    private final onExtraCallback textInputBoxSize;
    private final onWarmupCompleted textInputSize;
    public static final convertListToWritableArray SMALL = new convertListToWritableArray("SMALL", 0, onExtraCallback.SMALL, onWarmupCompleted.SMALL, 6);
    public static final convertListToWritableArray MEDIUM = new convertListToWritableArray("MEDIUM", 1, onExtraCallback.MEDIUM, onWarmupCompleted.MEDIUM, 6);
    public static final convertListToWritableArray LARGE = new convertListToWritableArray("LARGE", 2, onExtraCallback.LARGE, onWarmupCompleted.LARGE, 6);
    public static final convertListToWritableArray XLARGE = new convertListToWritableArray("XLARGE", 3, onExtraCallback.XLARGE, onWarmupCompleted.XLARGE, 8);

    private static final /* synthetic */ convertListToWritableArray[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return new convertListToWritableArray[]{SMALL, MEDIUM, LARGE, XLARGE};
        }
        convertListToWritableArray convertlisttowritablearray = SMALL;
        convertListToWritableArray convertlisttowritablearray2 = MEDIUM;
        convertListToWritableArray convertlisttowritablearray3 = LARGE;
        convertListToWritableArray convertlisttowritablearray4 = XLARGE;
        convertListToWritableArray[] convertlisttowritablearrayArr = new convertListToWritableArray[5];
        convertlisttowritablearrayArr[1] = convertlisttowritablearray;
        convertlisttowritablearrayArr[1] = convertlisttowritablearray2;
        convertlisttowritablearrayArr[3] = convertlisttowritablearray3;
        convertlisttowritablearrayArr[2] = convertlisttowritablearray4;
        return convertlisttowritablearrayArr;
    }

    public static EnumEntries<convertListToWritableArray> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<convertListToWritableArray> enumEntries = $ENTRIES;
        int i5 = i2 + 9;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static convertListToWritableArray valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        convertListToWritableArray convertlisttowritablearray = (convertListToWritableArray) Enum.valueOf(convertListToWritableArray.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return convertlisttowritablearray;
    }

    public static convertListToWritableArray[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        convertListToWritableArray[] convertlisttowritablearrayArr = $VALUES;
        if (i3 == 0) {
            return (convertListToWritableArray[]) convertlisttowritablearrayArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private convertListToWritableArray(String str, int i, onExtraCallback onextracallback, onWarmupCompleted onwarmupcompleted, int i2) {
        this.textInputBoxSize = onextracallback;
        this.textInputSize = onwarmupcompleted;
        this.textBoxGap = i2;
    }

    public final onExtraCallback getTextInputBoxSize() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.textInputBoxSize;
        int i5 = i3 + 59;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallback;
        }
        throw null;
    }

    public final onWarmupCompleted getTextInputSize() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted onwarmupcompleted = this.textInputSize;
        int i5 = i2 + 35;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompleted;
    }

    public final int getTextBoxGap() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = this.textBoxGap;
        int i6 = i3 + 23;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        convertListToWritableArray[] convertlisttowritablearrayArr$values = $values();
        $VALUES = convertlisttowritablearrayArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(convertlisttowritablearrayArr$values);
        Companion = new onExtraCallbackWithResult(null);
        int i = onNavigationEvent + 113;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final int height;
        private final int radius;
        private final int width;
        public static final onExtraCallback SMALL = new onExtraCallback("SMALL", 0, 234, 44, 12);
        public static final onExtraCallback MEDIUM = new onExtraCallback("MEDIUM", 1, Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000, 52, 12);
        public static final onExtraCallback LARGE = new onExtraCallback("LARGE", 2, 308, 56, 12);
        public static final onExtraCallback XLARGE = new onExtraCallback("XLARGE", 3, 327, 60, 12);

        private static final /* synthetic */ onExtraCallback[] $values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 65;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallback onextracallback = SMALL;
                onExtraCallback onextracallback2 = MEDIUM;
                onExtraCallback onextracallback3 = LARGE;
                onExtraCallback onextracallback4 = XLARGE;
                onextracallbackArr = new onExtraCallback[]{onextracallback2, onextracallback};
                onextracallbackArr[3] = onextracallback3;
                onextracallbackArr[5] = onextracallback4;
            } else {
                onextracallbackArr = new onExtraCallback[]{SMALL, MEDIUM, LARGE, XLARGE};
            }
            int i4 = i2 + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            int i4 = 26 / 0;
            return (onExtraCallback[]) onextracallbackArr.clone();
        }

        private onExtraCallback(String str, int i, int i2, int i3, int i4) {
            this.width = i2;
            this.height = i3;
            this.radius = i4;
        }

        public final int getWidth() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = this.width;
            int i6 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int getHeight() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.height;
            int i6 = i2 + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int getRadius() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = this.radius;
            int i6 = i3 + 81;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onWarmupCompleted + 65;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private final int borderRadius;
        private final int height;
        private final int textSize;
        private final int width;
        public static final onWarmupCompleted SMALL = new onWarmupCompleted("SMALL", 0, 22, 34, 44, 8);
        public static final onWarmupCompleted MEDIUM = new onWarmupCompleted("MEDIUM", 1, 24, 40, 52, 10);
        public static final onWarmupCompleted LARGE = new onWarmupCompleted("LARGE", 2, 26, 46, 56, 10);
        public static final onWarmupCompleted XLARGE = new onWarmupCompleted("XLARGE", 3, 30, 48, 60, 12);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return new onWarmupCompleted[]{SMALL, MEDIUM, LARGE, XLARGE};
            }
            onWarmupCompleted onwarmupcompleted = SMALL;
            onWarmupCompleted onwarmupcompleted2 = MEDIUM;
            onWarmupCompleted onwarmupcompleted3 = LARGE;
            onWarmupCompleted onwarmupcompleted4 = XLARGE;
            onWarmupCompleted[] onwarmupcompletedArr = {onwarmupcompleted2, onwarmupcompleted};
            onwarmupcompletedArr[2] = onwarmupcompleted3;
            onwarmupcompletedArr[4] = onwarmupcompleted4;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 77;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i3 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i, int i2, int i3, int i4, int i5) {
            this.textSize = i2;
            this.width = i3;
            this.height = i4;
            this.borderRadius = i5;
        }

        public final int getTextSize() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.textSize;
            }
            throw null;
        }

        public final int getWidth() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = this.width;
            int i5 = i3 + 83;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }

        public final int getHeight() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.height;
            }
            throw null;
        }

        public final int getBorderRadius() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.borderRadius;
            int i6 = i2 + 73;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 119;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final convertListToWritableArray onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (i <= 280) {
                return convertListToWritableArray.SMALL;
            }
            if (i <= 320) {
                return convertListToWritableArray.MEDIUM;
            }
            if (i <= 375) {
                int i6 = i3 + 81;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return convertListToWritableArray.LARGE;
            }
            convertListToWritableArray convertlisttowritablearray = convertListToWritableArray.XLARGE;
            int i8 = IAuthTabCallback + 81;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return convertlisttowritablearray;
        }
    }
}
