package com.otaliastudios.cameraview.internal;

import androidx.annotation.NonNull;
import o.removeOnChildAttachStateChangeListener;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RotationHelper {
    public static byte[] onExtraCallbackWithResult(@NonNull byte[] bArr, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, int i2) {
        if (i2 == 0) {
            return bArr;
        }
        if (i2 % 90 != 0 || i2 < 0 || i2 > 270) {
            throw new IllegalArgumentException("0 <= rotation < 360, rotation % 90 == 0");
        }
        int iOnExtraCallback = removeonchildattachstatechangelistener.onExtraCallback();
        int iOnExtraCallbackWithResult = removeonchildattachstatechangelistener.onExtraCallbackWithResult();
        byte[] bArr2 = new byte[bArr.length];
        int i3 = iOnExtraCallback * iOnExtraCallbackWithResult;
        boolean z = i2 % 180 != 0;
        boolean z2 = i2 % 270 != 0;
        boolean z3 = i2 >= 180;
        for (int i4 = 0; i4 < iOnExtraCallbackWithResult; i4++) {
            for (int i5 = 0; i5 < iOnExtraCallback; i5++) {
                int i6 = ((i4 >> 1) * iOnExtraCallback) + i3 + (i5 & (-2));
                int i7 = z ? iOnExtraCallbackWithResult : iOnExtraCallback;
                int i8 = z ? iOnExtraCallback : iOnExtraCallbackWithResult;
                int i9 = z ? i4 : i5;
                int i10 = z ? i5 : i4;
                if (z2) {
                    i9 = (i7 - i9) - 1;
                }
                if (z3) {
                    i10 = (i8 - i10) - 1;
                }
                int i11 = ((i10 >> 1) * i7) + i3 + (i9 & (-2));
                bArr2[(i10 * i7) + i9] = bArr[(i4 * iOnExtraCallback) + i5];
                bArr2[i11] = bArr[i6];
                bArr2[i11 + 1] = bArr[i6 + 1];
            }
        }
        return bArr2;
    }
}
