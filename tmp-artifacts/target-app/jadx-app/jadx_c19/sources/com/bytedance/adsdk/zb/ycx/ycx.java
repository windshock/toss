package com.bytedance.adsdk.zb.ycx;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.zb.lt.lud;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx extends Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public ycx() {
    }

    public ycx(int i2) {
        super(i2);
    }

    public ycx(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public ycx(int i2, PorterDuff.Mode mode) {
        super(i2);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((lud.ycx(i2, 0, OggPageHeader.MAX_SEGMENT_COUNT) << 24) | (getColor() & 16777215));
        } else {
            super.setAlpha(lud.ycx(i2, 0, OggPageHeader.MAX_SEGMENT_COUNT));
        }
    }
}
