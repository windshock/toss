package o;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.getImageAssetsFolder;
import o.getPreferredChildSize;
import o.hasProvider;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getImageAssetsFolder {
    private static int IAuthTabCallback = 1;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final getMergedResolutions onNavigationEvent = new onNavigationEvent();
    private static final getMergedResolutions onExtraCallback = new getMergedResolutions() { // from class: im.toss.compose.utils.VisualTransformationsKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final getPreferredChildSize filter(hasProvider hasprovider) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getPreferredChildSize getpreferredchildsizeOnNavigationEvent = getImageAssetsFolder.onNavigationEvent(hasprovider);
            int i4 = onNavigationEvent + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getpreferredchildsizeOnNavigationEvent;
        }
    };

    public static /* synthetic */ getPreferredChildSize onNavigationEvent(hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getPreferredChildSize getpreferredchildsizeOnWarmupCompleted = onWarmupCompleted(hasprovider);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        int i5 = IAuthTabCallback + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return getpreferredchildsizeOnWarmupCompleted;
    }

    public static final class onNavigationEvent implements getMergedResolutions {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        onNavigationEvent() {
        }

        public getPreferredChildSize filter(hasProvider hasprovider) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(hasprovider, "");
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            decimalFormat.setNegativePrefix("-");
            Long longOrNull = StringsKt.toLongOrNull(hasprovider.onTransact());
            Object obj = null;
            if (longOrNull == null) {
                getPreferredChildSize getpreferredchildsizeFilter = getMergedResolutions.Companion.onNavigationEvent().filter(hasprovider);
                int i2 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return getpreferredchildsizeFilter;
                }
                obj.hashCode();
                throw null;
            }
            String str = decimalFormat.format(longOrNull.longValue());
            hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNull(str);
            iAuthTabCallback.IAuthTabCallback(str);
            getPreferredChildSize getpreferredchildsize = new getPreferredChildSize(iAuthTabCallback.onExtraCallbackWithResult(), new IAuthTabCallback(hasprovider, str));
            int i3 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return getpreferredchildsize;
        }

        public static final class IAuthTabCallback implements isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ String onExtraCallback;
            final /* synthetic */ hasProvider onWarmupCompleted;

            IAuthTabCallback(hasProvider hasprovider, String str) {
                this.onWarmupCompleted = hasprovider;
                this.onExtraCallback = str;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
            
                if (r4 <= r8) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r4 <= r8) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                return r8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int originalToTransformed(int i) {
                IntRange intRange;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int length = this.onWarmupCompleted.onTransact().length() % 3;
                if (length == 1) {
                    intRange = new IntRange(0, 0);
                } else if (length == 2) {
                    intRange = new IntRange(0, 1);
                } else {
                    intRange = new IntRange(0, 2);
                }
                int first = intRange.getFirst();
                if (i <= intRange.getLast()) {
                    int i5 = onNavigationEvent + 117;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 62 / 0;
                    }
                }
                return RangesKt.coerceAtMost(this.onExtraCallback.length(), i + (((i + 3) - (intRange.getLast() + 1)) / 3));
            }

            public int transformedToOriginal(int i) {
                int length;
                IntRange intRange;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 75;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0 ? (length = this.onWarmupCompleted.onTransact().length() % 3) == 1 : this.onWarmupCompleted.onTransact().length() - 5 == 1) {
                    intRange = new IntRange(0, 1);
                } else {
                    int i4 = onNavigationEvent + 7;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0 ? length == 2 : length == 3) {
                        intRange = new IntRange(0, 2);
                        int i5 = IAuthTabCallback + 47;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        intRange = new IntRange(0, 3);
                        int i7 = IAuthTabCallback + 75;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
                int first = intRange.getFirst();
                if (i > intRange.getLast() || first > i) {
                    return RangesKt.coerceAtMost(this.onExtraCallback.length(), i - (((i + 3) - (intRange.getLast() + 1)) / 3)) + 1;
                }
                int i9 = onNavigationEvent + 1;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return i;
            }
        }
    }

    static {
        int i = asBinder + 69;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 89 / 0;
        }
    }

    public static final getMergedResolutions onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getMergedResolutions getmergedresolutions = onNavigationEvent;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return getmergedresolutions;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final getPreferredChildSize onWarmupCompleted(hasProvider hasprovider) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        int i2 = 0;
        hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
        int length = hasprovider.length();
        while (i2 < length) {
            int i3 = IAuthTabCallback + 83;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                iAuthTabCallback.onWarmupCompleted(hasprovider.charAt(i2));
                if (i2 != 4) {
                    if (i2 == 6) {
                        iAuthTabCallback.IAuthTabCallback("-");
                    }
                }
            } else {
                iAuthTabCallback.onWarmupCompleted(hasprovider.charAt(i2));
                if (i2 != 2) {
                }
            }
            i2++;
            int i4 = IAuthTabCallback + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return new getPreferredChildSize(iAuthTabCallback.onExtraCallbackWithResult(), new onExtraCallback());
    }

    public static final class onExtraCallback implements isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public int originalToTransformed(int i) {
            int i2 = 2 % 2;
            if (i >= 0 && i < 3) {
                return i;
            }
            if (3 <= i) {
                int i3 = onExtraCallback + 29;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0 ? i < 7 : i < 13) {
                    return i + 1;
                }
            }
            int i4 = i + 2;
            int i5 = onNavigationEvent + 73;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int transformedToOriginal(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 123;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            if (i >= 0) {
                int i6 = i4 + 35;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                if (i < 3) {
                    return i;
                }
            }
            if (3 <= i) {
                int i8 = i4 + 121;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                if (i < 7) {
                    return i - 1;
                }
            }
            return i - 2;
        }

        onExtraCallback() {
        }
    }
}
