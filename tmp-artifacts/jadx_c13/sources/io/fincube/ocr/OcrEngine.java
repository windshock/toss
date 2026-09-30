package io.fincube.ocr;

import android.graphics.Bitmap;
import java.util.ArrayList;
import o.deprecated_handshake;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class OcrEngine {
    private static final String OcrEngineVersion = "java_2.11.12";

    public static native String[] AnyDocOCR(Object obj, Object obj2, Object obj3, Object obj4, String str, int[] iArr);

    public static native void Destroy(long j, int i);

    public static native int GetMajorVersion();

    public static native int GetMinorVersion();

    public static native int GetPatchVersion();

    public static native String GetVersionInfo();

    public static native long Init(Object obj, String str, Object obj2);

    public static native long InitWithAssetDirectly(Object obj, Object obj2, Object obj3);

    public static native int QrCodeDecode(Object obj, int i);

    public static native int QrCodeDecodedCount(int i);

    public static native int QrCodeDecodedData(Object obj, int i, int i2);

    public static native int QrCodeInit(Object obj);

    public static native int QrCodeRelease(int i);

    public static native int QrCodeScanFrame(Object obj);

    public static native byte[] QrDecryptData(byte[] bArr, byte[] bArr2, int i);

    public static native void Reset(long j, int i);

    public static native float SSA(Object obj, Object obj2, Object obj3, Object obj4);

    public static native int ScanFrame(Object obj);

    public static native Object[] ScanFrameFromFile(Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object getDetectedCardFrame(long j, int i);

    public static native int getDetectedCardFrameListCount(long j);

    public static native Object getDetectedCardImage(long j);

    public static native Object getDetectedFrameImage(long j);

    public static native Object getDetectedFullFrameImage(long j);

    public static native Object getDetectedMarkedFullFrameImage(long j);

    public static native Object getDetectedOrgCardImage(long j);

    public static native Object getDetectedOrgFrameImage(long j);

    public static native Object getDetectedPhotoImage(long j);

    public static native int getNativeKey(byte[] bArr, int i);

    public static native Object getUnRecognizedCardImage(long j);

    public static native Object getWrappedImage(Object obj, Object obj2);

    public static native boolean nUseNeon();

    public static native boolean nUseVfp3();

    static {
        try {
            deprecated_handshake.Companion.onExtraCallbackWithResult().onNavigationEvent().IAuthTabCallback();
        } catch (UnsatisfiedLinkError unused) {
            try {
                Thread.sleep(50L);
                deprecated_handshake.Companion.onExtraCallbackWithResult().onNavigationEvent().IAuthTabCallback();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            } catch (UnsatisfiedLinkError e) {
                throw e;
            }
        }
    }

    public static String getEngineInfo() {
        return GetVersionInfo();
    }

    public static ArrayList<Bitmap> getScanedImages(long j) {
        int detectedCardFrameListCount = getDetectedCardFrameListCount(j);
        if (detectedCardFrameListCount == 0) {
            return null;
        }
        ArrayList<Bitmap> arrayList = new ArrayList<>();
        for (int i = 0; i < detectedCardFrameListCount; i++) {
            arrayList.add((Bitmap) getDetectedCardFrame(j, i));
        }
        return arrayList;
    }
}
