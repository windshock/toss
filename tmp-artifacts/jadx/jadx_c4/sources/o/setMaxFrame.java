package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class setMaxFrame {
    public /* synthetic */ setMaxFrame(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private setMaxFrame() {
    }

    public static final class onExtraCallback extends setMaxFrame {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final float onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof onExtraCallback) {
                if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, ((onExtraCallback) obj).onExtraCallback)) {
                    return true;
                }
                int i2 = onNavigationEvent + 23;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback);
            int i4 = IAuthTabCallback + 11;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iOnWarmupCompleted;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Fixed(width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback) + ")";
            int i2 = onNavigationEvent + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 50 / 0;
            }
            return f;
        }
    }

    public static final class onNavigationEvent extends setMaxFrame {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final float IAuthTabCallback;
        private final onExtraCallbackWithResult onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(onextracallbackwithresult, f);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 75;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 101;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i8 = i2 + 27;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.onWarmupCompleted != ((onNavigationEvent) obj).onWarmupCompleted) {
                int i10 = i4 + 27;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, r7.IAuthTabCallback)) {
                return false;
            }
            int i12 = onNavigationEvent + 19;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.onWarmupCompleted.hashCode() + 54) - VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback) : (this.onWarmupCompleted.hashCode() * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback);
            int i3 = onNavigationEvent + 87;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Wrap(target=" + this.onWarmupCompleted + ", expandBy=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback) + ")";
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, float f) {
            super(null);
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.onWarmupCompleted = onextracallbackwithresult;
            this.IAuthTabCallback = f;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            onextracallbackwithresult = (i & 1) != 0 ? onExtraCallbackWithResult.MaxLength : onextracallbackwithresult;
            if ((i & 2) != 0) {
                int i2 = onNavigationEvent + 119;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                int i4 = onExtraCallback + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(onextracallbackwithresult, f, null);
        }

        public final onExtraCallbackWithResult onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i3 + 27;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }

    public static final class IAuthTabCallback extends setMaxFrame {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final float onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback) || Float.compare(this.onNavigationEvent, ((IAuthTabCallback) obj).onNavigationEvent) != 0) {
                return false;
            }
            int i4 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Float.hashCode(this.onNavigationEvent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = Float.hashCode(this.onNavigationEvent);
            int i3 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Weight(weight=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public IAuthTabCallback(float f) {
            super(null);
            this.onNavigationEvent = f;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            float f = this.onNavigationEvent;
            int i5 = i3 + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }

    public static final class onWarmupCompleted extends setMaxFrame {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final float onExtraCallbackWithResult;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if ((!(r5 instanceof o.setMaxFrame.onWarmupCompleted)) == false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        
            if (java.lang.Float.compare(r4.onExtraCallbackWithResult, ((o.setMaxFrame.onWarmupCompleted) r5).onExtraCallbackWithResult) == 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        
            r5 = o.setMaxFrame.onWarmupCompleted.IAuthTabCallback + 97;
            o.setMaxFrame.onWarmupCompleted.onWarmupCompleted = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        
            if ((r5 % 2) != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r4 == r5) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r4 == r5) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 60 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Float.hashCode(this.onExtraCallbackWithResult);
            int i4 = onWarmupCompleted + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Percentage(percentage=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            if (i3 == 0) {
                int i4 = 1 / 0;
            }
            return f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        public static final onExtraCallbackWithResult MaxLength = new onExtraCallbackWithResult("MaxLength", 0);
        public static final onExtraCallbackWithResult Text = new onExtraCallbackWithResult("Text", 1);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {MaxLength, Text};
            int i5 = i3 + 33;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i3 + 75;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 73 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallback + 7;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 3 / 0;
            }
        }
    }
}
