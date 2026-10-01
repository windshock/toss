package com.bytedance.adsdk.zb.zb;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.zb.sya;
import com.bytedance.adsdk.zb.sya.ul;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    private final AssetManager dj;
    private sya lud;
    private final ul<String> ycx = new ul<>();
    private final Map<ul<String>, Typeface> zb = new HashMap();
    private final Map<String, Typeface> sya = new HashMap();
    private String lt = ".ttf";

    public ycx(Drawable.Callback callback, sya syaVar) {
        this.lud = syaVar;
        if (!(callback instanceof View)) {
            this.dj = null;
        } else {
            this.dj = ((View) callback).getContext().getAssets();
        }
    }

    public void ycx(sya syaVar) {
        this.lud = syaVar;
    }

    public void ycx(String str) {
        this.lt = str;
    }

    public Typeface ycx(com.bytedance.adsdk.zb.sya.sya syaVar) {
        this.ycx.ycx(syaVar.ycx(), syaVar.sya());
        Typeface typeface = this.zb.get(this.ycx);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceYcx = ycx(zb(syaVar), syaVar.sya());
        this.zb.put(this.ycx, typefaceYcx);
        return typefaceYcx;
    }

    private Typeface zb(com.bytedance.adsdk.zb.sya.sya syaVar) {
        Typeface typefaceCreateFromAsset;
        String strYcx = syaVar.ycx();
        Typeface typeface = this.sya.get(strYcx);
        if (typeface != null) {
            return typeface;
        }
        String strSya = syaVar.sya();
        String strZb = syaVar.zb();
        sya syaVar2 = this.lud;
        if (syaVar2 != null) {
            typefaceCreateFromAsset = syaVar2.ycx(strYcx, strSya, strZb);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.lud.ycx(strYcx);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        sya syaVar3 = this.lud;
        if (syaVar3 != null && typefaceCreateFromAsset == null) {
            String strZb2 = syaVar3.zb(strYcx, strSya, strZb);
            if (strZb2 == null) {
                strZb2 = this.lud.zb(strYcx);
            }
            if (strZb2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.dj, strZb2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (syaVar.dj() != null) {
            return syaVar.dj();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.dj, "fonts/" + strYcx + this.lt);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.sya.put(strYcx, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface ycx(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i2 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i2 ? typeface : Typeface.create(typeface, i2);
    }
}
