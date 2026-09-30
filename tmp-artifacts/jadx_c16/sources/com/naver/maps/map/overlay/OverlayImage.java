package com.naver.maps.map.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class OverlayImage {
    public final String id;

    public abstract Bitmap getBitmap(@NonNull Context context);

    public static OverlayImage onExtraCallbackWithResult(@NonNull Bitmap bitmap) {
        return new onWarmupCompleted(bitmap, (AnonymousClass3) null);
    }

    public static OverlayImage onExtraCallbackWithResult(int i) {
        return new IAuthTabCallback(i, (AnonymousClass3) null);
    }

    private OverlayImage(@NonNull String str) {
        this.id = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id.equals(((OverlayImage) obj).id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return "OverlayImage{id='" + this.id + "'}";
    }
}
