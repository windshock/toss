package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.DngCreator;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageReader;
import androidx.annotation.NonNull;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.addRecyclerListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onChildDetachedFromWindow extends onRequestFocusInDescendants implements ImageReader.OnImageAvailableListener {
    private final dispatchNestedFling IAuthTabCallback;
    private final ImageReader IAuthTabCallbackDefault;
    private final CaptureRequest.Builder asBinder;
    private DngCreator asInterface;
    private final dispatchOnScrollStateChanged onTransact;

    public onChildDetachedFromWindow(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, @NonNull defaultOnMeasure defaultonmeasure, @NonNull CaptureRequest.Builder builder, @NonNull ImageReader imageReader) {
        super(iAuthTabCallback, defaultonmeasure);
        this.onTransact = defaultonmeasure;
        this.asBinder = builder;
        this.IAuthTabCallbackDefault = imageReader;
        imageReader.setOnImageAvailableListener(this, isNestedScrollingEnabled.onExtraCallback().onWarmupCompleted());
        this.IAuthTabCallback = new ensureRightGlow() { // from class: o.onChildDetachedFromWindow.5
            @Override // o.ensureRightGlow
            public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
                super.IAuthTabCallback(dispatchonscrollstatechanged);
                onChildDetachedFromWindow.this.asBinder.addTarget(onChildDetachedFromWindow.this.IAuthTabCallbackDefault.getSurface());
                onChildDetachedFromWindow onchilddetachedfromwindow = onChildDetachedFromWindow.this;
                if (((onSizeChanged) onchilddetachedfromwindow).onNavigationEvent.onExtraCallbackWithResult == consumeFlingInHorizontalStretch.JPEG) {
                    onchilddetachedfromwindow.asBinder.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(((onSizeChanged) onChildDetachedFromWindow.this).onNavigationEvent.asInterface));
                }
                onChildDetachedFromWindow.this.asBinder.setTag(2);
                try {
                    dispatchonscrollstatechanged.IAuthTabCallback(this, onChildDetachedFromWindow.this.asBinder);
                } catch (CameraAccessException e) {
                    onChildDetachedFromWindow onchilddetachedfromwindow2 = onChildDetachedFromWindow.this;
                    ((onSizeChanged) onchilddetachedfromwindow2).onNavigationEvent = null;
                    ((onSizeChanged) onchilddetachedfromwindow2).onExtraCallbackWithResult = e;
                    onchilddetachedfromwindow2.onWarmupCompleted();
                    onNavigationEvent(Integer.MAX_VALUE);
                }
            }

            @Override // o.ensureRightGlow, o.dispatchNestedFling
            public void onWarmupCompleted(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest) {
                super.onWarmupCompleted(dispatchonscrollstatechanged, captureRequest);
                if (captureRequest.getTag() == 2) {
                    onRequestFocusInDescendants.onExtraCallback.onExtraCallbackWithResult(new Object[]{"onCaptureStarted:", "Dispatching picture shutter."});
                    onChildDetachedFromWindow.this.onWarmupCompleted(false);
                    onNavigationEvent(Integer.MAX_VALUE);
                }
            }

            @Override // o.ensureRightGlow, o.dispatchNestedFling
            public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                try {
                    super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
                } catch (Exception e) {
                    ((onSizeChanged) onChildDetachedFromWindow.this).onExtraCallbackWithResult = e;
                    onChildDetachedFromWindow.this.onWarmupCompleted();
                }
                onChildDetachedFromWindow onchilddetachedfromwindow = onChildDetachedFromWindow.this;
                if (((onSizeChanged) onchilddetachedfromwindow).onNavigationEvent.onExtraCallbackWithResult == consumeFlingInHorizontalStretch.DNG) {
                    onchilddetachedfromwindow.asInterface = new DngCreator(dispatchonscrollstatechanged.onExtraCallback(this), totalCaptureResult);
                    onChildDetachedFromWindow.this.asInterface.setOrientation(isAnimating.IAuthTabCallback(((onSizeChanged) onChildDetachedFromWindow.this).onNavigationEvent.asInterface));
                    onChildDetachedFromWindow onchilddetachedfromwindow2 = onChildDetachedFromWindow.this;
                    if (((onSizeChanged) onchilddetachedfromwindow2).onNavigationEvent.onExtraCallback != null) {
                        onchilddetachedfromwindow2.asInterface.setLocation(((onSizeChanged) onChildDetachedFromWindow.this).onNavigationEvent.onExtraCallback);
                    }
                }
            }
        };
    }

    public void onExtraCallbackWithResult() {
        this.IAuthTabCallback.onExtraCallbackWithResult(this.onTransact);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // android.media.ImageReader.OnImageAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onImageAvailable(ImageReader imageReader) throws Throwable {
        Image imageAcquireNextImage;
        addFocusables addfocusables = onRequestFocusInDescendants.onExtraCallback;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onImageAvailable started."});
        Image image = 0;
        try {
            try {
                imageAcquireNextImage = imageReader.acquireNextImage();
                try {
                    int i2 = AnonymousClass4.onExtraCallbackWithResult[((onSizeChanged) this).onNavigationEvent.onExtraCallbackWithResult.ordinal()];
                    if (i2 == 1) {
                        IAuthTabCallback(imageAcquireNextImage);
                    } else if (i2 == 2) {
                        onNavigationEvent(imageAcquireNextImage);
                    } else {
                        throw new IllegalStateException("Unknown format: " + ((onSizeChanged) this).onNavigationEvent.onExtraCallbackWithResult);
                    }
                    if (imageAcquireNextImage != null) {
                        imageAcquireNextImage.close();
                    }
                    addfocusables.onExtraCallbackWithResult(new Object[]{"onImageAvailable ended."});
                    onWarmupCompleted();
                } catch (Exception e) {
                    e = e;
                    ((onSizeChanged) this).onNavigationEvent = null;
                    ((onSizeChanged) this).onExtraCallbackWithResult = e;
                    onWarmupCompleted();
                    if (imageAcquireNextImage != null) {
                        imageAcquireNextImage.close();
                    }
                }
            } catch (Throwable th) {
                image = imageReader;
                th = th;
                if (image != 0) {
                    image.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            imageAcquireNextImage = null;
        } catch (Throwable th2) {
            th = th2;
            if (image != 0) {
            }
            throw th;
        }
    }

    /* renamed from: o.onChildDetachedFromWindow$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[consumeFlingInHorizontalStretch.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[consumeFlingInHorizontalStretch.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[consumeFlingInHorizontalStretch.DNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void IAuthTabCallback(@NonNull Image image) {
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        addRecyclerListener.IAuthTabCallback iAuthTabCallback = ((onSizeChanged) this).onNavigationEvent;
        iAuthTabCallback.onNavigationEvent = bArr;
        iAuthTabCallback.asInterface = 0;
        try {
            int iOnWarmupCompleted = new FlowColumnOverflowScopeImplExternalSyntheticLambda0(new ByteArrayInputStream(((onSizeChanged) this).onNavigationEvent.onNavigationEvent)).onWarmupCompleted("Orientation", 1);
            ((onSizeChanged) this).onNavigationEvent.asInterface = isAnimating.onExtraCallbackWithResult(iOnWarmupCompleted);
        } catch (IOException unused) {
        }
    }

    private void onNavigationEvent(@NonNull Image image) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        try {
            this.asInterface.writeImage(bufferedOutputStream, image);
            bufferedOutputStream.flush();
            ((onSizeChanged) this).onNavigationEvent.onNavigationEvent = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.asInterface.close();
            try {
                bufferedOutputStream.close();
            } catch (IOException unused) {
            }
            throw new RuntimeException(e);
        }
    }
}
