package im.toss.uikit.drawable;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda7;
import o.CarouselPagerStateExternalSyntheticLambda1;
import o.ComposableLambdaImplExternalSyntheticLambda6;
import o.LocalRetainedValuesStoreKtExternalSyntheticLambda0;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.ReusableRememberObserverHolder;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RemoteImageAssetDelegate implements ComposableLambdaImplExternalSyntheticLambda6 {
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private final HashMap<String, RemoteImage> IAuthTabCallback;
    private final Context onExtraCallback;
    private final Map<String, RemoteAssetDelegate> onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public /* synthetic */ RemoteImageAssetDelegate(Context context, String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, map);
    }

    private RemoteImageAssetDelegate(Context context, String str, Map<String, RemoteAssetDelegate> map) {
        this.onExtraCallback = context;
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = map;
        this.IAuthTabCallback = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [T, im.toss.uikit.drawable.RemoteImageAssetDelegate$RemoteImage, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object] */
    public Bitmap onExtraCallback(@NotNull LocalRetainedValuesStoreKtExternalSyntheticLambda0 localRetainedValuesStoreKtExternalSyntheticLambda0) throws Throwable {
        String strOnNavigationEvent;
        BufferedInputStream bufferedInputStream;
        int i = 2 % 2;
        int i2 = onTransact + 41;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(localRetainedValuesStoreKtExternalSyntheticLambda0, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(localRetainedValuesStoreKtExternalSyntheticLambda0, "");
        boolean z = false;
        if (this.onExtraCallback != null) {
            int i3 = onNavigationEvent + 77;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.onWarmupCompleted != null) {
                String strIAuthTabCallback = localRetainedValuesStoreKtExternalSyntheticLambda0.IAuthTabCallback();
                if (strIAuthTabCallback != null) {
                    int i4 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                    }
                }
                AssetManager assets = this.onExtraCallback.getAssets();
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(assets.open(this.onWarmupCompleted + localRetainedValuesStoreKtExternalSyntheticLambda0.onExtraCallback()));
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = null;
                    }
                } catch (IOException unused) {
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused2) {
                    }
                    return bitmapDecodeStream;
                } catch (IOException unused3) {
                    throw new IllegalArgumentException("Image asset not found!");
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            }
        }
        if (this.onExtraCallbackWithResult.containsKey(localRetainedValuesStoreKtExternalSyntheticLambda0.onNavigationEvent())) {
            RemoteAssetDelegate remoteAssetDelegate = this.onExtraCallbackWithResult.get(localRetainedValuesStoreKtExternalSyntheticLambda0.onNavigationEvent());
            if (remoteAssetDelegate == null || (strOnNavigationEvent = remoteAssetDelegate.onNavigationEvent()) == null) {
                throw null;
            }
        } else {
            strOnNavigationEvent = localRetainedValuesStoreKtExternalSyntheticLambda0.IAuthTabCallback() + localRetainedValuesStoreKtExternalSyntheticLambda0.onExtraCallback();
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r6 = this.IAuthTabCallback.get(strOnNavigationEvent);
        objectRef.element = r6;
        if (r6 == 0) {
            ?? remoteImage = new RemoteImage(objArr2 == true ? 1 : 0, z, 3, objArr == true ? 1 : 0);
            objectRef.element = remoteImage;
            this.IAuthTabCallback.put(strOnNavigationEvent, remoteImage);
            int i5 = onTransact + 113;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        if (((RemoteImage) objectRef.element).onWarmupCompleted() == null) {
            int i7 = onTransact + 67;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (!((RemoteImage) objectRef.element).onExtraCallbackWithResult()) {
                ((RemoteImage) objectRef.element).IAuthTabCallback(true);
                int iOnTransact = localRetainedValuesStoreKtExternalSyntheticLambda0.onTransact();
                int iOnExtraCallbackWithResult = localRetainedValuesStoreKtExternalSyntheticLambda0.onExtraCallbackWithResult();
                float f = 0.0f;
                if (this.onExtraCallbackWithResult.containsKey(localRetainedValuesStoreKtExternalSyntheticLambda0.onNavigationEvent())) {
                    int i9 = onTransact + 19;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    RemoteAssetDelegate remoteAssetDelegate2 = this.onExtraCallbackWithResult.get(localRetainedValuesStoreKtExternalSyntheticLambda0.onNavigationEvent());
                    if (remoteAssetDelegate2 != null) {
                        Integer numValueOf = Integer.valueOf(remoteAssetDelegate2.onExtraCallback());
                        if (numValueOf.intValue() < 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            iOnTransact = numValueOf.intValue();
                        }
                    }
                    if (remoteAssetDelegate2 != null) {
                        Integer numValueOf2 = Integer.valueOf(remoteAssetDelegate2.onWarmupCompleted());
                        if (numValueOf2.intValue() >= 0) {
                            int i11 = onNavigationEvent + 91;
                            onTransact = i11 % 128;
                            int i12 = i11 % 2;
                        } else {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            int i13 = onNavigationEvent + 77;
                            onTransact = i13 % 128;
                            int i14 = i13 % 2;
                            iOnExtraCallbackWithResult = numValueOf2.intValue();
                        }
                    }
                    float fIAuthTabCallback = remoteAssetDelegate2 != null ? remoteAssetDelegate2.IAuthTabCallback() : 0.0f;
                    int i15 = fIAuthTabCallback == 0.0f ? iOnTransact : iOnExtraCallbackWithResult;
                    if (fIAuthTabCallback != 0.0f) {
                        int i16 = onNavigationEvent + 93;
                        onTransact = i16 % 128;
                        if (i16 % 2 == 0) {
                            (objArr3 == true ? 1 : 0).hashCode();
                            throw null;
                        }
                        iOnExtraCallbackWithResult = iOnTransact;
                    }
                    iOnTransact = i15;
                    f = fIAuthTabCallback;
                }
                Context context = this.onExtraCallback;
                if (context != null) {
                    CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context).onWarmupCompleted(RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(strOnNavigationEvent).onExtraCallback(iOnTransact, iOnExtraCallbackWithResult), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new RotateTransformation(f)}).IAuthTabCallback(new ReusableRememberObserverHolder() { // from class: im.toss.uikit.drawable.RemoteImageAssetDelegate$fetchBitmap$1$1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
                            int i17 = 2 % 2;
                            int i18 = onNavigationEvent + 79;
                            onExtraCallbackWithResult = i18 % 128;
                            int i19 = i18 % 2;
                            super.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
                            int i20 = onNavigationEvent + 27;
                            onExtraCallbackWithResult = i20 % 128;
                            if (i20 % 2 == 0) {
                                throw null;
                            }
                        }

                        public void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
                            int i17 = 2 % 2;
                            int i18 = onNavigationEvent + 27;
                            onExtraCallbackWithResult = i18 % 128;
                            int i19 = i18 % 2;
                            objectRef.element.onExtraCallback(null);
                            objectRef.element.IAuthTabCallback(false);
                            int i20 = onNavigationEvent + 101;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                        }

                        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
                            int i17 = 2 % 2;
                            int i18 = onNavigationEvent + 23;
                            onExtraCallbackWithResult = i18 % 128;
                            int i19 = i18 % 2;
                            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
                            objectRef.element.onExtraCallback(CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7, 0, 0, 3, (Object) null));
                            objectRef.element.IAuthTabCallback(false);
                            int i20 = onNavigationEvent + 57;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                        }
                    }).onExtraCallbackWithResult());
                }
            }
        }
        return ((RemoteImage) objectRef.element).onWarmupCompleted();
    }

    static final class RemoteImage {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private boolean IAuthTabCallback;
        private Bitmap onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteImage() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof RemoteImage)) {
                return false;
            }
            RemoteImage remoteImage = (RemoteImage) obj;
            if (Intrinsics.areEqual(this.onNavigationEvent, remoteImage.onNavigationEvent)) {
                return this.IAuthTabCallback == remoteImage.IAuthTabCallback;
            }
            int i4 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 59;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Bitmap bitmap = this.onNavigationEvent;
            if (bitmap == null) {
                int i5 = i2 + 39;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = bitmap.hashCode();
            }
            return (iHashCode * 31) + Boolean.hashCode(this.IAuthTabCallback);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RemoteImage(bitmap=" + this.onNavigationEvent + ", fetching=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public RemoteImage(@Nullable Bitmap bitmap, boolean z) {
            this.onNavigationEvent = bitmap;
            this.IAuthTabCallback = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RemoteImage(Bitmap bitmap, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 27;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    int i4 = 45 / 0;
                }
                int i5 = i3 + 31;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                bitmap = null;
            }
            if ((i & 2) != 0) {
                int i8 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
                z = false;
            }
            this(bitmap, z);
        }

        public final void onExtraCallback(@Nullable Bitmap bitmap) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.onNavigationEvent = bitmap;
            int i5 = i2 + 9;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 80 / 0;
            }
        }

        public final Bitmap onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Bitmap bitmap = this.onNavigationEvent;
            int i5 = i3 + 17;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return bitmap;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            this.IAuthTabCallback = z;
            int i5 = i3 + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            boolean z = this.IAuthTabCallback;
            int i5 = i3 + 103;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }
    }

    public static final class Builder {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final HashMap<String, RemoteAssetDelegate> IAuthTabCallback = new HashMap<>();
        private String onExtraCallback;
        private Context onNavigationEvent;

        public final Builder onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Function1<? super RemoteAssetDelegate, Unit> function1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = context;
            HashMap<String, RemoteAssetDelegate> map = this.IAuthTabCallback;
            RemoteAssetDelegate remoteAssetDelegate = new RemoteAssetDelegate(str2);
            function1.invoke(remoteAssetDelegate);
            map.put(str, remoteAssetDelegate);
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 82 / 0;
            }
            return this;
        }

        public final RemoteImageAssetDelegate onExtraCallback() {
            int i = 2 % 2;
            RemoteImageAssetDelegate remoteImageAssetDelegate = new RemoteImageAssetDelegate(this.onNavigationEvent, this.onExtraCallback, this.IAuthTabCallback, null);
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return remoteImageAssetDelegate;
        }
    }

    public static final class RemoteAssetDelegate {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        private int onExtraCallback;
        private final String onExtraCallbackWithResult;
        private float onNavigationEvent;
        private int onWarmupCompleted;

        public RemoteAssetDelegate(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
            this.onExtraCallback = -1;
            this.onWarmupCompleted = -1;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i3 + 85;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 39 / 0;
            }
            return i5;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 39;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            float f = this.onNavigationEvent;
            int i5 = i3 + 41;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent = f;
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
