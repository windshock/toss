package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc extends com.bytedance.adsdk.zb.lt {
    private Map<String, Bitmap> ycx;
    private String zb;

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i2) {
    }

    public void setLottieAdTitleMaxLength(int i2) {
    }

    public void setLottieAppNameMaxLength(int i2) {
    }

    public jc(Context context) {
        super(context);
        this.ycx = new HashMap();
    }

    public void setImageLottieTosPath(String str) {
        this.zb = str;
    }

    public void fby() {
        if (TextUtils.isEmpty(this.zb)) {
            return;
        }
        setProgress(0.0f);
        ycx(true);
        setAnimationFromUrl(this.zb);
        setImageAssetDelegate(new com.bytedance.adsdk.zb.dj() { // from class: com.bytedance.sdk.component.adexpress.lt.jc.1
            @Override // com.bytedance.adsdk.zb.dj
            public Bitmap ycx(final com.bytedance.adsdk.zb.jc jcVar) {
                final String strFby = jcVar.fby();
                String strJc = jcVar.jc();
                String strJw = jcVar.jw();
                if (TextUtils.equals(strFby, "image_0") && TextUtils.equals(strJw, "Lark20201123-180048_2.png")) {
                    strJw = "hand.png";
                }
                Bitmap bitmap = (Bitmap) jc.this.ycx.get(strFby);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strJc) || !TextUtils.isEmpty(strJw)) {
                    if (!TextUtils.isEmpty(strJw) && TextUtils.isEmpty(strJc)) {
                        strJc = strJw;
                    } else if (!TextUtils.isEmpty(strJw) && !TextUtils.isEmpty(strJc)) {
                        strJc = strJc + strJw;
                    } else {
                        strJc = "";
                    }
                }
                if (TextUtils.isEmpty(strJc)) {
                    return null;
                }
                com.bytedance.sdk.component.lud.jc jcVarYcx = com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().lud().ycx(strJc).sya(2).ycx(new com.bytedance.sdk.component.lud.fby() { // from class: com.bytedance.sdk.component.adexpress.lt.jc.1.1
                    public Bitmap ycx(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, jcVar.ycx(), jcVar.zb(), false);
                        jc.this.ycx.put(strFby, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                jc jcVar2 = jc.this;
                jcVarYcx.ycx(new ycx(jcVar2, jcVar, strFby, jcVar2.ycx));
                return (Bitmap) jc.this.ycx.get(strFby);
            }
        });
        ycx();
    }

    static class ycx implements com.bytedance.sdk.component.lud.dy {
        private final Map<String, Bitmap> dj;
        private final String sya;
        private final WeakReference<jc> ycx;
        private final com.bytedance.adsdk.zb.jc zb;

        public void ycx(int i2, String str, Throwable th) {
        }

        public ycx(jc jcVar, com.bytedance.adsdk.zb.jc jcVar2, String str, Map<String, Bitmap> map) {
            this.ycx = new WeakReference<>(jcVar);
            this.zb = jcVar2;
            this.sya = str;
            this.dj = map;
        }

        public void ycx(com.bytedance.sdk.component.lud.ea eaVar) {
            Object objZb = eaVar.zb();
            if (objZb instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objZb, this.zb.ycx(), this.zb.zb(), false);
                this.dj.put(this.sya, bitmapCreateScaledBitmap);
                jc jcVar = this.ycx.get();
                if (jcVar != null) {
                    jcVar.ycx(this.zb.fby(), bitmapCreateScaledBitmap);
                }
            }
        }
    }
}
