package viva.republica.toss.qrcode;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import me.dm7.barcodescanner.core.BarcodeScannerView;
import o.BusMonitorDependWrapper;
import o.getDynamic;
import o.reportPvFromBackGround;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.qrcode.TossScanner$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class TossScanner extends BarcodeScannerView {
    private static final List<BarcodeFormat> IAuthTabCallback;
    private List<? extends BarcodeFormat> IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private IAuthTabCallback asBinder;
    private boolean asInterface;
    private reportPvFromBackGround onExtraCallback;
    private MultiFormatReader onTransact;
    private final boolean onWarmupCompleted;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onNavigationEvent = 8;
    private static final String onExtraCallbackWithResult = "TossScanner";

    public interface IAuthTabCallback {
        void onNavigationEvent(@Nullable Result result);

        void setEngagementSignalsCallback();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossScanner(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = true;
        onExtraCallbackWithResult();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossScanner(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = true;
        onExtraCallbackWithResult();
    }

    public final void setFormats(@NotNull List<? extends BarcodeFormat> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallbackDefault = list;
        onExtraCallbackWithResult();
    }

    public final void setResultHandler(@Nullable IAuthTabCallback iAuthTabCallback) {
        this.asBinder = iAuthTabCallback;
    }

    public final Collection<BarcodeFormat> asInterface() {
        List<? extends BarcodeFormat> list = this.IAuthTabCallbackDefault;
        return list != null ? list : IAuthTabCallback;
    }

    public final void setPassOnlyTossQr(boolean z) {
        this.asInterface = z;
    }

    public boolean onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getDynamic.onWarmupCompleted.onNavigationEvent(str);
    }

    private final void onExtraCallbackWithResult() {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.put((EnumMap) DecodeHintType.POSSIBLE_FORMATS, (DecodeHintType) asInterface());
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.onTransact = multiFormatReader;
        Intrinsics.checkNotNull(multiFormatReader);
        multiFormatReader.setHints(enumMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPreviewFrame(@NotNull byte[] bArr, @NotNull Camera camera) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(camera, "");
        if (this.asBinder != null) {
            try {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                int i = previewSize.width;
                int i2 = previewSize.height;
                if (BusMonitorDependWrapper.IAuthTabCallback(getContext()) == 1) {
                    byte[] bArr2 = new byte[bArr.length];
                    for (int i3 = 0; i3 < i2; i3++) {
                        for (int i4 = 0; i4 < i; i4++) {
                            bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
                        }
                    }
                    bArr = bArr2;
                    i = i2;
                    i2 = i;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                PlanarYUVLuminanceSource planarYUVLuminanceSourceOnNavigationEvent = onNavigationEvent(bArr, i, i2);
                if (planarYUVLuminanceSourceOnNavigationEvent != null) {
                    BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSourceOnNavigationEvent));
                    try {
                        MultiFormatReader multiFormatReader = this.onTransact;
                        Intrinsics.checkNotNull(multiFormatReader);
                        objectRef.element = multiFormatReader.decodeWithState(binaryBitmap);
                    } catch (ReaderException | ArrayIndexOutOfBoundsException | NullPointerException unused) {
                    } catch (Throwable th) {
                        MultiFormatReader multiFormatReader2 = this.onTransact;
                        Intrinsics.checkNotNull(multiFormatReader2);
                        multiFormatReader2.reset();
                        throw th;
                    }
                    MultiFormatReader multiFormatReader3 = this.onTransact;
                    Intrinsics.checkNotNull(multiFormatReader3);
                    multiFormatReader3.reset();
                }
                Object obj = objectRef.element;
                if (obj != null) {
                    String text = ((Result) obj).getText();
                    if (this.asInterface) {
                        Intrinsics.checkNotNull(text);
                        if (!onExtraCallbackWithResult(text)) {
                            if (!Intrinsics.areEqual(text, this.IAuthTabCallbackStub)) {
                                this.IAuthTabCallbackStub = text;
                                IAuthTabCallback iAuthTabCallback = this.asBinder;
                                if (iAuthTabCallback != null) {
                                    iAuthTabCallback.setEngagementSignalsCallback();
                                }
                            }
                            camera.setOneShotPreviewCallback(this);
                            return;
                        }
                    }
                    new Handler(Looper.getMainLooper()).post(new TossScanner$.ExternalSyntheticLambda0(this, objectRef));
                    return;
                }
                camera.setOneShotPreviewCallback(this);
            } catch (RuntimeException unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(TossScanner tossScanner, Ref.ObjectRef objectRef) {
        IAuthTabCallback iAuthTabCallback = tossScanner.asBinder;
        tossScanner.asBinder = null;
        tossScanner.onExtraCallback();
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onNavigationEvent((Result) objectRef.element);
        }
    }

    private final PlanarYUVLuminanceSource onNavigationEvent(byte[] bArr, int i, int i2) {
        Rect rectIAuthTabCallback = IAuthTabCallback(i, i2);
        if (rectIAuthTabCallback == null) {
            return null;
        }
        try {
            return new PlanarYUVLuminanceSource(bArr, i, i2, rectIAuthTabCallback.left, rectIAuthTabCallback.top, rectIAuthTabCallback.width(), rectIAuthTabCallback.height(), false);
        } catch (Exception unused) {
            return null;
        }
    }

    public void setupCameraPreview(@Nullable reportPvFromBackGround reportpvfrombackground) {
        super.setupCameraPreview(reportpvfrombackground);
        this.onExtraCallback = reportpvfrombackground;
    }

    public final reportPvFromBackGround IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        IAuthTabCallback = arrayList;
        arrayList.add(BarcodeFormat.UPC_A);
        arrayList.add(BarcodeFormat.UPC_E);
        arrayList.add(BarcodeFormat.EAN_13);
        arrayList.add(BarcodeFormat.EAN_8);
        arrayList.add(BarcodeFormat.RSS_14);
        arrayList.add(BarcodeFormat.CODE_39);
        arrayList.add(BarcodeFormat.CODE_93);
        arrayList.add(BarcodeFormat.CODE_128);
        arrayList.add(BarcodeFormat.ITF);
        arrayList.add(BarcodeFormat.CODABAR);
        arrayList.add(BarcodeFormat.QR_CODE);
        arrayList.add(BarcodeFormat.DATA_MATRIX);
        arrayList.add(BarcodeFormat.PDF_417);
    }
}
