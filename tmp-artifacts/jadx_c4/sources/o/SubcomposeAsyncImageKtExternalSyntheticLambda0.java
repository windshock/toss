package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SubcomposeAsyncImageKtExternalSyntheticLambda0 {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private final onNavigationEvent IAuthTabCallback;
    private final onNavigationEvent onExtraCallback;
    private final onNavigationEvent onExtraCallbackWithResult;
    private final onNavigationEvent onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = IAuthTabCallbackDefault + 37;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public SubcomposeAsyncImageKtExternalSyntheticLambda0(@NotNull ResourceMetadata resourceMetadata, @NotNull StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0, @NotNull supports supportsVar, @NotNull DiskLruCacheExternalSyntheticLambda0 diskLruCacheExternalSyntheticLambda0, @Nullable ExifOrientationStrategyExternalSyntheticLambda2 exifOrientationStrategyExternalSyntheticLambda2, @Nullable StaticImageDecoderExternalSyntheticLambda0 staticImageDecoderExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(resourceMetadata, "");
        Intrinsics.checkNotNullParameter(staticImageDecoderKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(supportsVar, "");
        Intrinsics.checkNotNullParameter(diskLruCacheExternalSyntheticLambda0, "");
        onNavigationEvent onnavigationevent = null;
        this.onExtraCallback = new onNavigationEvent(0, null, null);
        this.onWarmupCompleted = new onNavigationEvent(1, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
        this.IAuthTabCallback = new onNavigationEvent(2, supportsVar, diskLruCacheExternalSyntheticLambda0);
        if (exifOrientationStrategyExternalSyntheticLambda2 != null && staticImageDecoderExternalSyntheticLambda0 != null) {
            onnavigationevent = new onNavigationEvent(4, exifOrientationStrategyExternalSyntheticLambda2, staticImageDecoderExternalSyntheticLambda0);
            int i = asInterface + 73;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.onExtraCallbackWithResult = onnavigationevent;
        int i4 = IAuthTabCallbackStub + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public final onNavigationEvent onWarmupCompleted(int i) throws BitmapFactoryDecoderExternalSyntheticLambda2, IllegalArgumentException {
        int i2 = 2 % 2;
        if (i == -2) {
            return onWarmupCompleted();
        }
        if (i == 0) {
            onNavigationEvent onnavigationevent = this.onExtraCallback;
            int i3 = IAuthTabCallbackStub + 89;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }
        if (i == 1) {
            return this.onWarmupCompleted;
        }
        if (i == 2) {
            onNavigationEvent onnavigationevent2 = this.IAuthTabCallback;
            int i4 = IAuthTabCallbackStub + 61;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            return onnavigationevent2;
        }
        if (i == 4) {
            onNavigationEvent onnavigationevent3 = this.onExtraCallbackWithResult;
            if (onnavigationevent3 == null) {
                throw new BitmapFactoryDecoderExternalSyntheticLambda2("KeyStore based Cipher is not supported on this device.");
            }
            int i6 = IAuthTabCallbackStub + 17;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return onnavigationevent3;
        }
        int i8 = IAuthTabCallbackStub + 11;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        if (i == 5) {
            throw new BitmapFactoryDecoderExternalSyntheticLambda2("GCM based KeyStoreCipher is not supported anymore.");
        }
        throw new IllegalArgumentException("Unknown cipher generation : " + i);
    }

    public final onNavigationEvent onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final int IAuthTabCallback;
        private final getProgressColor onExtraCallbackWithResult;
        private final getMax onWarmupCompleted;

        public onNavigationEvent(int i, @Nullable getProgressColor getprogresscolor, @Nullable getMax getmax) {
            this.IAuthTabCallback = i;
            this.onExtraCallbackWithResult = getprogresscolor;
            this.onWarmupCompleted = getmax;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = this.IAuthTabCallback;
            int i5 = i3 + 121;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }

        public final getMax onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            getMax getmax = this.onWarmupCompleted;
            int i5 = i3 + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return getmax;
        }

        public final getProgressColor onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
