package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.rotate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1aSDK {
    private static int IAuthTabCallback = 1;
    public static final AFf1aSDK onExtraCallbackWithResult = new AFf1aSDK();
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 7;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback Up = new IAuthTabCallback("Up", 0);
        public static final IAuthTabCallback Down = new IAuthTabCallback("Down", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = Up;
            if (i3 != 0) {
                return new IAuthTabCallback[]{iAuthTabCallback, Down};
            }
            IAuthTabCallback iAuthTabCallback2 = Down;
            IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[4];
            iAuthTabCallbackArr[1] = iAuthTabCallback;
            iAuthTabCallbackArr[1] = iAuthTabCallback2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onExtraCallbackWithResult + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onNavigationEvent + 61;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private AFf1aSDK() {
    }

    public interface onWarmupCompleted {

        /* renamed from: o.AFf1aSDK$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0015onWarmupCompleted implements onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            public static final C0015onWarmupCompleted onExtraCallbackWithResult = new C0015onWarmupCompleted();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 1;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 59;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this != obj) {
                    return obj instanceof C0015onWarmupCompleted;
                }
                int i4 = i3 + 63;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 51;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 41;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return -680679975;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 101;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = i3 + 91;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return "Left";
            }

            private C0015onWarmupCompleted() {
            }
        }

        public static final class onExtraCallback implements onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = IAuthTabCallback + 3;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 9;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                if (this != obj) {
                    if (obj instanceof onExtraCallback) {
                        return true;
                    }
                    int i5 = i2 + 17;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                int i7 = i4 + 79;
                int i8 = i7 % 128;
                onNavigationEvent = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 59;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 39;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 69;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return 379418250;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 47;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                Object obj = null;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 17;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return "Right";
                }
                obj.hashCode();
                throw null;
            }

            private onExtraCallback() {
            }
        }

        public static final class IAuthTabCallback implements onWarmupCompleted {
            public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 67;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 60 / 0;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
            
                if ((r6 instanceof o.AFf1aSDK.onWarmupCompleted.IAuthTabCallback) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r1 = r1 + 23;
                o.AFf1aSDK.onWarmupCompleted.IAuthTabCallback.onExtraCallback = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 103;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 34 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 125;
                onWarmupCompleted = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 87;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return -1555847769;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 11;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return "Center";
            }

            private IAuthTabCallback() {
            }
        }

        public static final class onExtraCallbackWithResult implements onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            public static final int onWarmupCompleted = 0;
            private final float onExtraCallbackWithResult;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 119;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    int i4 = onNavigationEvent + 21;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (Float.compare(this.onExtraCallbackWithResult, ((onExtraCallbackWithResult) obj).onExtraCallbackWithResult) == 0) {
                    return true;
                }
                int i6 = IAuthTabCallback;
                int i7 = i6 + 65;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 27;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    Float.hashCode(this.onExtraCallbackWithResult);
                    throw null;
                }
                int iHashCode = Float.hashCode(this.onExtraCallbackWithResult);
                int i3 = onNavigationEvent + 33;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 41 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Fraction(value=" + this.onExtraCallbackWithResult + ")";
                int i2 = IAuthTabCallback + 63;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 36 / 0;
                }
                return str;
            }

            public onExtraCallbackWithResult(float f) {
                this.onExtraCallbackWithResult = f;
            }

            public final float IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 17;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                float f = this.onExtraCallbackWithResult;
                int i4 = i2 + 109;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return f;
                }
                throw null;
            }
        }
    }

    public static abstract class onNavigationEvent implements toMetersPerSecond {
        private final int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private onNavigationEvent(int i) {
            this.onWarmupCompleted = i;
        }

        public static final class onExtraCallback extends onNavigationEvent {
            private static int IAuthTabCallback = 0;
            private static int asInterface = 1;
            private final float onExtraCallback;
            private final float onExtraCallbackWithResult;
            private final float onNavigationEvent;
            private final float onWarmupCompleted;

            public /* synthetic */ onExtraCallback(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
                this(f, f2, f3, f4);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallback)) {
                    return false;
                }
                onExtraCallback onextracallback = (onExtraCallback) obj;
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, onextracallback.onNavigationEvent)) {
                    int i2 = IAuthTabCallback + 85;
                    asInterface = i2 % 128;
                    return i2 % 2 == 0;
                }
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                    int i3 = asInterface + 89;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                    int i5 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, onextracallback.onExtraCallback)) {
                    return true;
                }
                int i7 = asInterface + 67;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = asInterface + 45;
                IAuthTabCallback = i2 % 128;
                int iOnWarmupCompleted = i2 % 2 != 0 ? (((((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent) >> 12) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult)) + 88) * VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted)) - 109) >>> VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback) : (((((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback);
                int i3 = IAuthTabCallback + 61;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return iOnWarmupCompleted;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Rounded(radius=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ", bottomRadius=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallbackWithResult) + ", width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onWarmupCompleted) + ", height=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback) + ")";
                int i2 = asInterface + 35;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onExtraCallback(float f, float f2, float f3, float f4) {
                super(readUnsignedShort.Companion.onNavigationEvent(), null);
                this.onNavigationEvent = f;
                this.onExtraCallbackWithResult = f2;
                this.onWarmupCompleted = f3;
                this.onExtraCallback = f4;
            }

            public rotate IAuthTabCallback(long j, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
                Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
                float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(this.onWarmupCompleted);
                float fOnExtraCallback2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(this.onExtraCallback);
                float fOnExtraCallback3 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(this.onNavigationEvent);
                float fOnExtraCallback4 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(this.onExtraCallbackWithResult);
                float fSqrt = (float) Math.sqrt((fOnExtraCallback * fOnExtraCallback) + (fOnExtraCallback2 * fOnExtraCallback2));
                float f = fOnExtraCallback3 / fSqrt;
                float f2 = (fSqrt - fOnExtraCallback4) / fSqrt;
                float f3 = fOnExtraCallback / 2.0f;
                float f4 = (f * f3) + fOnExtraCallback3;
                float f5 = (f2 * f3) + fOnExtraCallback3;
                float f6 = f3 + fOnExtraCallback3;
                removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
                removetimestampOnWarmupCompleted.onWarmupCompleted(0.0f, fOnExtraCallback2);
                float f7 = fOnExtraCallback2 - (f * fOnExtraCallback2);
                removetimestampOnWarmupCompleted.IAuthTabCallback(fOnExtraCallback3, fOnExtraCallback2, f4, f7);
                float f8 = fOnExtraCallback2 - (f2 * fOnExtraCallback2);
                removetimestampOnWarmupCompleted.onNavigationEvent(f5, f8);
                float f9 = (f6 - f5) + f6;
                removetimestampOnWarmupCompleted.IAuthTabCallback(f6, fOnExtraCallback2 - fOnExtraCallback2, f9, f8);
                removetimestampOnWarmupCompleted.onNavigationEvent(f9 + (f5 - f4), f7);
                float f10 = fOnExtraCallback + fOnExtraCallback3;
                float f11 = fOnExtraCallback3 + f10;
                removetimestampOnWarmupCompleted.IAuthTabCallback(f10, fOnExtraCallback2, f11, fOnExtraCallback2);
                removetimestampOnWarmupCompleted.onNavigationEvent(f11, 0.0f);
                removetimestampOnWarmupCompleted.onNavigationEvent(0.0f, 0.0f);
                removetimestampOnWarmupCompleted.onNavigationEvent(0.0f, fOnExtraCallback2);
                removetimestampOnWarmupCompleted.onExtraCallback();
                rotate.onExtraCallback onextracallback = new rotate.onExtraCallback(removetimestampOnWarmupCompleted);
                int i2 = IAuthTabCallback + 65;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallback(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
                    int i2 = asInterface + 85;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                }
                float f5 = f;
                if ((i & 2) != 0) {
                    int i5 = asInterface + 125;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                    int i7 = 2 % 2;
                }
                float f6 = f2;
                if ((i & 4) != 0) {
                    f3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f);
                    int i8 = asInterface + 37;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 2 % 2;
                }
                float f7 = f3;
                if ((i & 8) != 0) {
                    int i11 = asInterface + 97;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    f4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
                }
                this(f5, f6, f7, f4, null);
            }
        }

        public static final class onWarmupCompleted extends onNavigationEvent {
            private static int IAuthTabCallbackDefault = 0;
            private static int asInterface = 1;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
            private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
            private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 25;
                int i4 = i3 % 128;
                IAuthTabCallbackDefault = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i4 + 23;
                    asInterface = i6 % 128;
                    if (i6 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
                if (obj instanceof onWarmupCompleted) {
                    return true;
                }
                int i7 = i2 + 69;
                IAuthTabCallbackDefault = i7 % 128;
                boolean z = i7 % 2 != 0;
                int i8 = i2 + 25;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    return z;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 15;
                int i3 = i2 % 128;
                asInterface = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = i3 + 115;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return 1194917910;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 63;
                int i3 = i2 % 128;
                asInterface = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 105;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 47 / 0;
                }
                return "Sharp";
            }

            private onWarmupCompleted() {
                super(readUnsignedShort.Companion.onExtraCallbackWithResult(), null);
            }

            public rotate IAuthTabCallback(long j, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
                Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
                float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(onWarmupCompleted);
                float fOnExtraCallback2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(onExtraCallbackWithResult);
                removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
                removetimestampOnWarmupCompleted.onWarmupCompleted(0.0f, fOnExtraCallback2);
                removetimestampOnWarmupCompleted.onNavigationEvent(fOnExtraCallback / 2.0f, 0.0f);
                removetimestampOnWarmupCompleted.onNavigationEvent(fOnExtraCallback, fOnExtraCallback2);
                removetimestampOnWarmupCompleted.onExtraCallback();
                rotate.onExtraCallback onextracallback = new rotate.onExtraCallback(removetimestampOnWarmupCompleted);
                int i2 = asInterface + 119;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 81 / 0;
                }
                return onextracallback;
            }

            static {
                int i = onNavigationEvent + 99;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }
    }
}
