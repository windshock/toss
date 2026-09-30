package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import o.AbstractResolvableFuture;
import o.afterDone;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Api33ImplExternalSyntheticLambda0 {
    private static final Queue<BitmapFactory.Options> IAuthTabCallbackDefault;
    private static final Set<String> asBinder;
    private static final onExtraCallbackWithResult asInterface;
    public static final SaversKtExternalSyntheticLambda3<Boolean> onNavigationEvent;
    private static final Set<ImageHeaderParser.ImageType> onTransact;
    public static final SaversKtExternalSyntheticLambda3<Boolean> onWarmupCompleted;
    private final Savers_androidKtExternalSyntheticLambda5 IAuthTabCallbackStub;
    private final DisplayMetrics IAuthTabCallbackStubProxy;
    private final Savers_androidKtExternalSyntheticLambda6 IAuthTabCallback_Parcel;
    private final List<ImageHeaderParser> access000;
    private final releaseWaiters getInterfaceDescriptor = releaseWaiters.onNavigationEvent();
    public static final SaversKtExternalSyntheticLambda3<SaversKtExternalSyntheticLambda2> onExtraCallback = SaversKtExternalSyntheticLambda3.onWarmupCompleted("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", SaversKtExternalSyntheticLambda2.DEFAULT);
    public static final SaversKtExternalSyntheticLambda3<SaversKtExternalSyntheticLambda28> IAuthTabCallback = SaversKtExternalSyntheticLambda3.IAuthTabCallback("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    @Deprecated
    public static final SaversKtExternalSyntheticLambda3<AbstractResolvableFuture> onExtraCallbackWithResult = AbstractResolvableFuture.asBinder;

    public interface onExtraCallbackWithResult {
        void onExtraCallbackWithResult(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, Bitmap bitmap) throws IOException;

        void onNavigationEvent();
    }

    private boolean IAuthTabCallback(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    private static int onNavigationEvent(double d) {
        return (int) (d + 0.5d);
    }

    private static boolean onNavigationEvent(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public boolean IAuthTabCallback(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean onExtraCallbackWithResult(InputStream inputStream) {
        return true;
    }

    static {
        Boolean bool = Boolean.FALSE;
        onNavigationEvent = SaversKtExternalSyntheticLambda3.onWarmupCompleted("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        onWarmupCompleted = SaversKtExternalSyntheticLambda3.onWarmupCompleted("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        asBinder = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        asInterface = new onExtraCallbackWithResult() { // from class: o.Api33ImplExternalSyntheticLambda0.2
            @Override // o.Api33ImplExternalSyntheticLambda0.onExtraCallbackWithResult
            public void onExtraCallbackWithResult(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, Bitmap bitmap) {
            }

            @Override // o.Api33ImplExternalSyntheticLambda0.onExtraCallbackWithResult
            public void onNavigationEvent() {
            }
        };
        onTransact = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        IAuthTabCallbackDefault = applyConstraintsFromLayoutParams.onWarmupCompleted(0);
    }

    public Api33ImplExternalSyntheticLambda0(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this.access000 = list;
        this.IAuthTabCallbackStubProxy = (DisplayMetrics) markHierarchyDirty.onExtraCallbackWithResult(displayMetrics);
        this.IAuthTabCallbackStub = (Savers_androidKtExternalSyntheticLambda5) markHierarchyDirty.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda5);
        this.IAuthTabCallback_Parcel = (Savers_androidKtExternalSyntheticLambda6) markHierarchyDirty.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda6);
    }

    public boolean onExtraCallback(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.IAuthTabCallback();
    }

    public Resource<Bitmap> onWarmupCompleted(ByteBuffer byteBuffer, int i2, int i3, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return onNavigationEvent(new afterDone.IAuthTabCallback(byteBuffer, this.access000, this.IAuthTabCallback_Parcel), i2, i3, saversKtExternalSyntheticLambda30, asInterface);
    }

    public Resource<Bitmap> onExtraCallback(InputStream inputStream, int i2, int i3, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, onExtraCallbackWithResult onextracallbackwithresult) throws IOException {
        return onNavigationEvent(new afterDone.onExtraCallback(inputStream, this.access000, this.IAuthTabCallback_Parcel), i2, i3, saversKtExternalSyntheticLambda30, onextracallbackwithresult);
    }

    public Resource<Bitmap> onWarmupCompleted(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return onNavigationEvent(new afterDone.onNavigationEvent(parcelFileDescriptor, this.access000, this.IAuthTabCallback_Parcel), i2, i3, saversKtExternalSyntheticLambda30, asInterface);
    }

    private Resource<Bitmap> onNavigationEvent(afterDone afterdone, int i2, int i3, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30, onExtraCallbackWithResult onextracallbackwithresult) throws IOException {
        byte[] bArr = (byte[]) this.IAuthTabCallback_Parcel.onExtraCallback(65536, byte[].class);
        BitmapFactory.Options optionsOnExtraCallback = onExtraCallback();
        optionsOnExtraCallback.inTempStorage = bArr;
        SaversKtExternalSyntheticLambda2 saversKtExternalSyntheticLambda2 = (SaversKtExternalSyntheticLambda2) saversKtExternalSyntheticLambda30.IAuthTabCallback(onExtraCallback);
        SaversKtExternalSyntheticLambda28 saversKtExternalSyntheticLambda28 = (SaversKtExternalSyntheticLambda28) saversKtExternalSyntheticLambda30.IAuthTabCallback(IAuthTabCallback);
        AbstractResolvableFuture abstractResolvableFuture = (AbstractResolvableFuture) saversKtExternalSyntheticLambda30.IAuthTabCallback(AbstractResolvableFuture.asBinder);
        boolean zBooleanValue = ((Boolean) saversKtExternalSyntheticLambda30.IAuthTabCallback(onNavigationEvent)).booleanValue();
        SaversKtExternalSyntheticLambda3<Boolean> saversKtExternalSyntheticLambda3 = onWarmupCompleted;
        try {
            return setUpdateBlock.onWarmupCompleted(IAuthTabCallback(afterdone, optionsOnExtraCallback, abstractResolvableFuture, saversKtExternalSyntheticLambda2, saversKtExternalSyntheticLambda28, saversKtExternalSyntheticLambda30.IAuthTabCallback(saversKtExternalSyntheticLambda3) != null && ((Boolean) saversKtExternalSyntheticLambda30.IAuthTabCallback(saversKtExternalSyntheticLambda3)).booleanValue(), i2, i3, zBooleanValue, onextracallbackwithresult), this.IAuthTabCallbackStub);
        } finally {
            onExtraCallback(optionsOnExtraCallback);
            this.IAuthTabCallback_Parcel.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) bArr);
        }
    }

    private Bitmap IAuthTabCallback(afterDone afterdone, BitmapFactory.Options options, AbstractResolvableFuture abstractResolvableFuture, SaversKtExternalSyntheticLambda2 saversKtExternalSyntheticLambda2, SaversKtExternalSyntheticLambda28 saversKtExternalSyntheticLambda28, boolean z, int i2, int i3, boolean z2, onExtraCallbackWithResult onextracallbackwithresult) throws IOException {
        int i4;
        int iRound;
        int iRound2;
        int i5;
        ColorSpace colorSpacePO_;
        long jIAuthTabCallback = getSharedValues.IAuthTabCallback();
        int[] iArrOnWarmupCompleted = onWarmupCompleted(afterdone, options, onextracallbackwithresult, this.IAuthTabCallbackStub);
        int i6 = iArrOnWarmupCompleted[0];
        int i7 = iArrOnWarmupCompleted[1];
        String str = options.outMimeType;
        boolean z3 = (i6 == -1 || i7 == -1) ? false : z;
        int iOnExtraCallbackWithResult = afterdone.onExtraCallbackWithResult();
        int iIAuthTabCallback = maybePropagateCancellationTo.IAuthTabCallback(iOnExtraCallbackWithResult);
        boolean zOnExtraCallbackWithResult = maybePropagateCancellationTo.onExtraCallbackWithResult(iOnExtraCallbackWithResult);
        if (i2 == Integer.MIN_VALUE) {
            i4 = i3;
            iRound = onNavigationEvent(iIAuthTabCallback) ? i7 : i6;
        } else {
            i4 = i3;
            iRound = i2;
        }
        if (i4 == Integer.MIN_VALUE) {
            iRound2 = onNavigationEvent(iIAuthTabCallback) ? i6 : i7;
        } else {
            iRound2 = i4;
        }
        ImageHeaderParser.ImageType imageTypeOnExtraCallback = afterdone.onExtraCallback();
        onExtraCallback(imageTypeOnExtraCallback, afterdone, onextracallbackwithresult, this.IAuthTabCallbackStub, abstractResolvableFuture, iIAuthTabCallback, i6, i7, iRound, iRound2, options);
        onWarmupCompleted(afterdone, saversKtExternalSyntheticLambda2, z3, zOnExtraCallbackWithResult, options, iRound, iRound2);
        int i8 = Build.VERSION.SDK_INT;
        if (IAuthTabCallback(imageTypeOnExtraCallback)) {
            if (i6 < 0 || i7 < 0 || !z2) {
                float f = onWarmupCompleted(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f2 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i6 / f2);
                int iCeil2 = (int) Math.ceil(i7 / f2);
                iRound = Math.round(iCeil * f);
                iRound2 = Math.round(iCeil2 * f);
                if (Log.isLoggable("Downsampler", 2)) {
                    int i9 = options.inTargetDensity;
                    int i10 = options.inDensity;
                }
            }
            int i11 = iRound;
            int i12 = iRound2;
            if (i11 > 0 && i12 > 0) {
                onExtraCallback(options, this.IAuthTabCallbackStub, i11, i12);
            }
        }
        if (saversKtExternalSyntheticLambda28 != null) {
            if (i8 >= 28) {
                DialogLayout.py_(options, ColorSpace.get((saversKtExternalSyntheticLambda28 == SaversKtExternalSyntheticLambda28.DISPLAY_P3 && (colorSpacePO_ = clearListeners.pO_(options)) != null && colorSpacePO_.isWideGamut()) ? createDeviceContext.hY_() : writeUnsignedInt.hG_()));
            } else if (i8 >= 26) {
                DialogLayout.py_(options, ColorSpace.get(writeUnsignedInt.hG_()));
            }
        }
        Bitmap bitmapOnNavigationEvent = onNavigationEvent(afterdone, options, onextracallbackwithresult, this.IAuthTabCallbackStub);
        onextracallbackwithresult.onExtraCallbackWithResult(this.IAuthTabCallbackStub, bitmapOnNavigationEvent);
        if (Log.isLoggable("Downsampler", 2)) {
            i5 = iOnExtraCallbackWithResult;
            onExtraCallback(i6, i7, str, options, bitmapOnNavigationEvent, i2, i3, jIAuthTabCallback);
        } else {
            i5 = iOnExtraCallbackWithResult;
        }
        if (bitmapOnNavigationEvent == null) {
            return null;
        }
        bitmapOnNavigationEvent.setDensity(this.IAuthTabCallbackStubProxy.densityDpi);
        Bitmap bitmapIAuthTabCallback = maybePropagateCancellationTo.IAuthTabCallback(this.IAuthTabCallbackStub, bitmapOnNavigationEvent, i5);
        if (!bitmapOnNavigationEvent.equals(bitmapIAuthTabCallback)) {
            this.IAuthTabCallbackStub.onWarmupCompleted(bitmapOnNavigationEvent);
        }
        return bitmapIAuthTabCallback;
    }

    private static void onExtraCallback(ImageHeaderParser.ImageType imageType, afterDone afterdone, onExtraCallbackWithResult onextracallbackwithresult, Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, AbstractResolvableFuture abstractResolvableFuture, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int iMin;
        int iFloor;
        int iFloor2;
        if (i3 <= 0 || i4 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (onNavigationEvent(i2)) {
            i8 = i3;
            i7 = i4;
        } else {
            i7 = i3;
            i8 = i4;
        }
        float fOnExtraCallback = abstractResolvableFuture.onExtraCallback(i7, i8, i5, i6);
        if (fOnExtraCallback <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fOnExtraCallback + " from: " + abstractResolvableFuture + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "]");
        }
        AbstractResolvableFuture.asInterface asinterfaceOnExtraCallbackWithResult = abstractResolvableFuture.onExtraCallbackWithResult(i7, i8, i5, i6);
        if (asinterfaceOnExtraCallbackWithResult == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f = i7;
        float f2 = i8;
        int iOnNavigationEvent = i7 / onNavigationEvent(fOnExtraCallback * f);
        int iOnNavigationEvent2 = i8 / onNavigationEvent(fOnExtraCallback * f2);
        AbstractResolvableFuture.asInterface asinterface = AbstractResolvableFuture.asInterface.MEMORY;
        if (asinterfaceOnExtraCallbackWithResult == asinterface) {
            iMin = Math.max(iOnNavigationEvent, iOnNavigationEvent2);
        } else {
            iMin = Math.min(iOnNavigationEvent, iOnNavigationEvent2);
        }
        int iMax = Math.max(1, Integer.highestOneBit(iMin));
        if (asinterfaceOnExtraCallbackWithResult == asinterface && iMax < 1.0f / fOnExtraCallback) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f / fMin);
            iFloor2 = (int) Math.ceil(f2 / fMin);
            int i9 = iMax / 8;
            if (i9 > 0) {
                iFloor /= i9;
                iFloor2 /= i9;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f3 = iMax;
            iFloor = (int) Math.floor(f / f3);
            iFloor2 = (int) Math.floor(f2 / f3);
        } else if (imageType.isWebp()) {
            float f4 = iMax;
            iFloor = Math.round(f / f4);
            iFloor2 = Math.round(f2 / f4);
        } else if (i7 % iMax != 0 || i8 % iMax != 0) {
            int[] iArrOnWarmupCompleted = onWarmupCompleted(afterdone, options, onextracallbackwithresult, savers_androidKtExternalSyntheticLambda5);
            iFloor = iArrOnWarmupCompleted[0];
            iFloor2 = iArrOnWarmupCompleted[1];
        } else {
            iFloor = i7 / iMax;
            iFloor2 = i8 / iMax;
        }
        double dOnExtraCallback = abstractResolvableFuture.onExtraCallback(iFloor, iFloor2, i5, i6);
        options.inTargetDensity = onExtraCallback(dOnExtraCallback);
        options.inDensity = onExtraCallbackWithResult(dOnExtraCallback);
        if (onWarmupCompleted(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            int i10 = options.inTargetDensity;
            int i11 = options.inDensity;
        }
    }

    private static int onExtraCallback(double d) {
        return onNavigationEvent((d / (r1 / r0)) * onNavigationEvent(onExtraCallbackWithResult(d) * d));
    }

    private static int onExtraCallbackWithResult(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    private void onWarmupCompleted(afterDone afterdone, SaversKtExternalSyntheticLambda2 saversKtExternalSyntheticLambda2, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        if (this.getInterfaceDescriptor.onExtraCallback(i2, i3, options, z, z2)) {
            return;
        }
        if (saversKtExternalSyntheticLambda2 == SaversKtExternalSyntheticLambda2.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(saversKtExternalSyntheticLambda2);
            }
        }
        Bitmap.Config config = afterdone.onExtraCallback().hasAlpha() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static int[] onWarmupCompleted(afterDone afterdone, BitmapFactory.Options options, onExtraCallbackWithResult onextracallbackwithresult, Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5) throws IOException {
        options.inJustDecodeBounds = true;
        onNavigationEvent(afterdone, options, onextracallbackwithresult, savers_androidKtExternalSyntheticLambda5);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap onNavigationEvent(afterDone afterdone, BitmapFactory.Options options, onExtraCallbackWithResult onextracallbackwithresult, Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5) throws IOException {
        Bitmap bitmapOnNavigationEvent;
        if (!options.inJustDecodeBounds) {
            onextracallbackwithresult.onNavigationEvent();
            afterdone.onNavigationEvent();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        maybePropagateCancellationTo.onWarmupCompleted().lock();
        try {
            try {
                bitmapOnNavigationEvent = afterdone.onExtraCallbackWithResult(options);
            } catch (IllegalArgumentException e) {
                IOException iOExceptionOnWarmupCompleted = onWarmupCompleted(e, i2, i3, str, options);
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        savers_androidKtExternalSyntheticLambda5.onWarmupCompleted(bitmap);
                        options.inBitmap = null;
                        bitmapOnNavigationEvent = onNavigationEvent(afterdone, options, onextracallbackwithresult, savers_androidKtExternalSyntheticLambda5);
                    } catch (IOException unused) {
                        throw iOExceptionOnWarmupCompleted;
                    }
                } else {
                    throw iOExceptionOnWarmupCompleted;
                }
            }
            return bitmapOnNavigationEvent;
        } finally {
            maybePropagateCancellationTo.onWarmupCompleted().unlock();
        }
    }

    private static boolean onWarmupCompleted(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    private static void onExtraCallback(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j) {
        onExtraCallback(bitmap);
        onNavigationEvent(options);
        int i6 = options.inSampleSize;
        int i7 = options.inDensity;
        int i8 = options.inTargetDensity;
        Thread.currentThread().getName();
        getSharedValues.onWarmupCompleted(j);
    }

    private static String onNavigationEvent(BitmapFactory.Options options) {
        return onExtraCallback(options.inBitmap);
    }

    private static String onExtraCallback(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static IOException onWarmupCompleted(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + onNavigationEvent(options), illegalArgumentException);
    }

    private static void onExtraCallback(BitmapFactory.Options options, Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, int i2, int i3) {
        Bitmap.Config configIAuthTabCallback;
        if (Build.VERSION.SDK_INT < 26) {
            configIAuthTabCallback = null;
        } else if (options.inPreferredConfig == EncoderProfilesProxyCompatBaseImpl.onExtraCallback()) {
            return;
        } else {
            configIAuthTabCallback = DraggableAnchorsNodeExternalSyntheticLambda1.IAuthTabCallback(options);
        }
        if (configIAuthTabCallback == null) {
            configIAuthTabCallback = options.inPreferredConfig;
        }
        options.inBitmap = savers_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult(i2, i3, configIAuthTabCallback);
    }

    private static BitmapFactory.Options onExtraCallback() {
        BitmapFactory.Options optionsPoll;
        synchronized (Api33ImplExternalSyntheticLambda0.class) {
            Queue<BitmapFactory.Options> queue = IAuthTabCallbackDefault;
            synchronized (queue) {
                optionsPoll = queue.poll();
            }
            if (optionsPoll == null) {
                optionsPoll = new BitmapFactory.Options();
                onExtraCallbackWithResult(optionsPoll);
            }
        }
        return optionsPoll;
    }

    private static void onExtraCallback(BitmapFactory.Options options) {
        onExtraCallbackWithResult(options);
        Queue<BitmapFactory.Options> queue = IAuthTabCallbackDefault;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void onExtraCallbackWithResult(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            DialogLayout.py_(options, (ColorSpace) null);
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}
