package me.dm7.barcodescanner.zxing;

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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import me.dm7.barcodescanner.core.BarcodeScannerView;
import o.BusMonitorDependWrapper;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ZXingScannerView extends BarcodeScannerView {
    public static final List<BarcodeFormat> onExtraCallback;
    private IAuthTabCallback IAuthTabCallback;
    private List<BarcodeFormat> onExtraCallbackWithResult;
    private MultiFormatReader onWarmupCompleted;

    public interface IAuthTabCallback {
        void onExtraCallbackWithResult(Result result);
    }

    static {
        ArrayList arrayList = new ArrayList();
        onExtraCallback = arrayList;
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

    public ZXingScannerView(Context context) {
        super(context);
        onExtraCallbackWithResult();
    }

    public ZXingScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onExtraCallbackWithResult();
    }

    public void setFormats(List<BarcodeFormat> list) {
        this.onExtraCallbackWithResult = list;
        onExtraCallbackWithResult();
    }

    public void setResultHandler(IAuthTabCallback iAuthTabCallback) {
        this.IAuthTabCallback = iAuthTabCallback;
    }

    public Collection<BarcodeFormat> asInterface() {
        List<BarcodeFormat> list = this.onExtraCallbackWithResult;
        return list == null ? onExtraCallback : list;
    }

    private void onExtraCallbackWithResult() {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.put((EnumMap) DecodeHintType.POSSIBLE_FORMATS, (DecodeHintType) asInterface());
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.onWarmupCompleted = multiFormatReader;
        multiFormatReader.setHints(enumMap);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        final Result resultDecodeWithState;
        if (this.IAuthTabCallback != null) {
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
                PlanarYUVLuminanceSource planarYUVLuminanceSourceOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr, i, i2);
                if (planarYUVLuminanceSourceOnExtraCallbackWithResult != null) {
                    try {
                        resultDecodeWithState = this.onWarmupCompleted.decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSourceOnExtraCallbackWithResult)));
                        this.onWarmupCompleted.reset();
                    } catch (ReaderException | ArrayIndexOutOfBoundsException | NullPointerException unused) {
                        this.onWarmupCompleted.reset();
                    } catch (Throwable th) {
                        this.onWarmupCompleted.reset();
                        throw th;
                    }
                } else {
                    resultDecodeWithState = null;
                }
                if (resultDecodeWithState != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: me.dm7.barcodescanner.zxing.ZXingScannerView.5
                        @Override // java.lang.Runnable
                        public void run() {
                            IAuthTabCallback iAuthTabCallback = ZXingScannerView.this.IAuthTabCallback;
                            ZXingScannerView.this.IAuthTabCallback = null;
                            ZXingScannerView.this.onExtraCallback();
                            if (iAuthTabCallback != null) {
                                iAuthTabCallback.onExtraCallbackWithResult(resultDecodeWithState);
                            }
                        }
                    });
                } else {
                    camera.setOneShotPreviewCallback(this);
                }
            } catch (RuntimeException unused2) {
            }
        }
    }

    public void onExtraCallback(IAuthTabCallback iAuthTabCallback) throws IOException {
        this.IAuthTabCallback = iAuthTabCallback;
        super.IAuthTabCallbackStub();
    }

    public PlanarYUVLuminanceSource onExtraCallbackWithResult(byte[] bArr, int i, int i2) {
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
}
