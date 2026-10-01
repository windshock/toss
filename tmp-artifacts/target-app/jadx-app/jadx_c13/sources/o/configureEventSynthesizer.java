package o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.os.Build;
import android.util.SizeF;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class configureEventSynthesizer {
    public static boolean onExtraCallback() {
        return true;
    }

    public static String onExtraCallback(Context context) throws CameraAccessException {
        CameraManager cameraManager;
        if (!onExtraCallback() || (cameraManager = (CameraManager) context.getSystemService("camera")) == null) {
            return null;
        }
        try {
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 1) {
                    return str;
                }
            }
        } catch (CameraAccessException unused) {
        }
        return null;
    }

    public static boolean onExtraCallback(CameraManager cameraManager, String str) {
        int[] iArr;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            iArr = (int[]) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        } catch (CameraAccessException unused) {
        }
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == 11) {
                return true;
            }
        }
        return false;
    }

    public static String onNavigationEvent(CameraManager cameraManager, String str) throws CameraAccessException {
        if (Build.VERSION.SDK_INT < 28 || !onExtraCallback(cameraManager, str)) {
            return null;
        }
        try {
            Set<String> physicalCameraIds = cameraManager.getCameraCharacteristics(str).getPhysicalCameraIds();
            if (physicalCameraIds != null && !physicalCameraIds.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList(physicalCameraIds);
                Collections.sort(arrayList, new Comparator<String>() { // from class: o.configureEventSynthesizer.2
                    @Override // java.util.Comparator
                    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                    public int compare(String str2, String str3) {
                        try {
                            return Integer.compare(Integer.parseInt(str2), Integer.parseInt(str3));
                        } catch (NumberFormatException unused) {
                            return str2.compareTo(str3);
                        }
                    }
                });
                float f = Float.MAX_VALUE;
                String str2 = null;
                String str3 = null;
                for (String str4 : arrayList) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str4);
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (fArr != null && fArr.length != 0) {
                        float f2 = fArr[0];
                        SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                        if (sizeF != null) {
                            sizeF.getWidth();
                        }
                        if (f2 >= 4.0f && f2 < 7.0f && str2 == null) {
                            str2 = str4;
                        }
                        if (f2 < 7.0f) {
                            float fAbs = Math.abs(f2 - 5.0f);
                            if (fAbs < f) {
                                str3 = str4;
                                f = fAbs;
                            }
                        }
                    }
                }
                return str2 != null ? str2 : str3;
            }
        } catch (CameraAccessException unused) {
        }
        return null;
    }

    public static boolean onNavigationEvent(Image image, byte[] bArr) {
        if (image == null || bArr == null || image.getFormat() != 35) {
            return false;
        }
        int width = image.getWidth();
        int height = image.getHeight();
        int i = width * height;
        if (bArr.length < ((i / 4) << 1) + i) {
            return false;
        }
        Image.Plane[] planes = image.getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        ByteBuffer buffer2 = planes[1].getBuffer();
        ByteBuffer buffer3 = planes[2].getBuffer();
        int rowStride = planes[0].getRowStride();
        int pixelStride = planes[0].getPixelStride();
        int rowStride2 = planes[1].getRowStride();
        int pixelStride2 = planes[1].getPixelStride();
        if (pixelStride == 1 && rowStride == width) {
            buffer.get(bArr, 0, i);
        } else {
            byte[] bArr2 = new byte[rowStride];
            int i2 = 0;
            for (int i3 = 0; i3 < height; i3++) {
                buffer.position(i3 * rowStride);
                buffer.get(bArr2, 0, Math.min(rowStride, buffer.remaining()));
                int i4 = 0;
                while (i4 < width) {
                    bArr[i2] = bArr2[i4 * pixelStride];
                    i4++;
                    i2++;
                }
            }
        }
        int i5 = height / 2;
        int i6 = width / 2;
        if (pixelStride2 != 2 || rowStride2 != width) {
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = 0;
                while (i8 < i6) {
                    int i9 = (i7 * rowStride2) + (i8 * pixelStride2);
                    bArr[i] = buffer3.get(i9);
                    bArr[i + 1] = buffer2.get(i9);
                    i8++;
                    i += 2;
                }
            }
            return true;
        }
        byte[] bArr3 = new byte[rowStride2];
        byte[] bArr4 = new byte[rowStride2];
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = i10 * rowStride2;
            buffer2.position(i11);
            buffer3.position(i11);
            int iMin = Math.min(rowStride2, buffer2.remaining());
            int iMin2 = Math.min(rowStride2, buffer3.remaining());
            buffer2.get(bArr3, 0, iMin);
            buffer3.get(bArr4, 0, iMin2);
            int i12 = 0;
            while (i12 < i6) {
                int i13 = i12 * pixelStride2;
                bArr[i] = bArr4[i13];
                bArr[i + 1] = bArr3[i13];
                i12++;
                i += 2;
            }
        }
        return true;
    }
}
