package com.bytedance.adsdk.ugeno.ycx.zb;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.fby.fby;
import com.bytedance.adsdk.ugeno.ycx.lud;
import java.util.TreeMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends ycx {
    public zb(Context context, com.bytedance.adsdk.ugeno.zb.sya syaVar, String str, TreeMap<Float, String> treeMap) {
        super(context, syaVar, str, treeMap);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.ycx.zb.zb$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[lud.values().length];
            ycx = iArr;
            try {
                iArr[lud.zb.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[lud.sya.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ycx[lud.fby.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ycx[lud.jw.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ycx[lud.dj.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ycx[lud.lud.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ycx[lud.lt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ycx[lud.jc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ycx[lud.ok.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public void zb() {
        float fSyc;
        switch (AnonymousClass1.ycx[this.dj.ordinal()]) {
            case 1:
                fSyc = this.ul.syc();
                break;
            case 2:
                fSyc = this.ul.dy();
                break;
            case 3:
                fSyc = this.ul.wie();
                break;
            case 4:
                fSyc = this.ul.pmi();
                break;
            case 5:
                fSyc = this.ul.uh();
                if (this.ul.ea() != null) {
                    this.ul.ea().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 6:
                fSyc = this.ul.htf();
                if (this.ul.ea() != null) {
                    this.ul.ea().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 7:
                fSyc = this.ul.thx();
                break;
            case 8:
                fSyc = this.ul.wwx();
                break;
            case 9:
                fSyc = this.ul.tn();
                break;
            default:
                fSyc = 0.0f;
                break;
        }
        this.lud.add(Keyframe.ofFloat(0.0f, fSyc));
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public void ycx(float f, String str) {
        float fYcx;
        if (this.zb.startsWith(lud.ycx.ycx()) || this.dj == lud.ok) {
            fYcx = fby.ycx(this.ycx, com.bytedance.adsdk.ugeno.fby.sya.ycx(str, 0.0f));
        } else {
            fYcx = com.bytedance.adsdk.ugeno.fby.sya.ycx(str, 0.0f);
        }
        this.lud.add(Keyframe.ofFloat(f, fYcx));
    }

    @Override // com.bytedance.adsdk.ugeno.ycx.zb.ycx
    public TypeEvaluator lt() {
        return new FloatEvaluator();
    }
}
