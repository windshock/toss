package com.bytedance.adsdk.zb.sya.sya;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.zb.sya.sya.lud;
import com.bytedance.adsdk.zb.sya.zb.fby;
import com.bytedance.adsdk.zb.sya.zb.xkz;
import com.bytedance.adsdk.zb.ycx.zb.dy;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx implements com.bytedance.adsdk.zb.ycx.ycx.lud, ycx.InterfaceC0014ycx {
    private float aeu;
    private Paint av;
    private boolean bhi;
    final dy dj;
    private ycx dv;
    private final RectF dy;
    private final Paint ea;
    private final List<com.bytedance.adsdk.zb.ycx.zb.ycx<?, ?>> hf;
    private final String htf;
    BlurMaskFilter lt;
    float lud;
    private final Paint ok;
    private List<ycx> oty;
    private final RectF pmi;
    private final Matrix rmf;
    private final Paint ry;
    final lud sya;
    private final RectF syc;
    private com.bytedance.adsdk.zb.ycx.zb.fby thx;
    private ycx tn;
    private boolean tru;
    private final RectF uh;
    private final RectF wie;
    private com.bytedance.adsdk.zb.ycx.zb.dj wwx;
    private final Paint xkz;
    final Matrix ycx;
    final com.bytedance.adsdk.zb.jw zb;
    private final Path ul = new Path();
    private final Matrix fby = new Matrix();
    private final Matrix jw = new Matrix();
    private final Paint jc = new com.bytedance.adsdk.zb.ycx.ycx(1);

    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    public void ycx(List<com.bytedance.adsdk.zb.ycx.ycx.sya> list, List<com.bytedance.adsdk.zb.ycx.ycx.sya> list2) {
    }

    static ycx ycx(zb zbVar, lud ludVar, com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, Context context) {
        switch (AnonymousClass2.ycx[ludVar.ea().ordinal()]) {
            case 1:
                return new ul(jwVar, ludVar, zbVar, ulVar);
            case 2:
                return new zb(jwVar, ludVar, ulVar.zb(ludVar.ul()), ulVar, context);
            case 3:
                return new fby(jwVar, ludVar);
            case 4:
                if (ycx(jwVar, ludVar, "text:")) {
                    return new sya(jwVar, ludVar, context);
                }
                if (ycx(jwVar, ludVar, "videoview:")) {
                    return new jc(jwVar, ludVar, context);
                }
                return new dj(jwVar, ludVar);
            case 5:
                return new lt(jwVar, ludVar);
            case 6:
                return new jw(jwVar, ludVar);
            default:
                Objects.toString(ludVar.ea());
                return null;
        }
    }

    private static boolean ycx(com.bytedance.adsdk.zb.jw jwVar, lud ludVar, String str) {
        com.bytedance.adsdk.zb.jc jcVarLt;
        if (jwVar == null || ludVar == null || str == null || (jcVarLt = jwVar.lt(ludVar.ul())) == null) {
            return false;
        }
        return str.equals(jcVarLt.jc());
    }

    ycx(com.bytedance.adsdk.zb.jw jwVar, lud ludVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.ea = new com.bytedance.adsdk.zb.ycx.ycx(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.ok = new com.bytedance.adsdk.zb.ycx.ycx(1, mode2);
        com.bytedance.adsdk.zb.ycx.ycx ycxVar = new com.bytedance.adsdk.zb.ycx.ycx(1);
        this.ry = ycxVar;
        this.xkz = new com.bytedance.adsdk.zb.ycx.ycx(PorterDuff.Mode.CLEAR);
        this.syc = new RectF();
        this.dy = new RectF();
        this.wie = new RectF();
        this.pmi = new RectF();
        this.uh = new RectF();
        this.ycx = new Matrix();
        this.hf = new ArrayList();
        this.tru = true;
        this.lud = 0.0f;
        this.rmf = new Matrix();
        this.aeu = 1.0f;
        this.zb = jwVar;
        this.sya = ludVar;
        this.htf = ludVar.lt() + "#draw";
        if (ludVar.ok() == lud.zb.sya) {
            ycxVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            ycxVar.setXfermode(new PorterDuffXfermode(mode));
        }
        dy dyVarJc = ludVar.syc().jc();
        this.dj = dyVarJc;
        dyVarJc.ycx((ycx.InterfaceC0014ycx) this);
        if (ludVar.jc() != null && !ludVar.jc().isEmpty()) {
            com.bytedance.adsdk.zb.ycx.zb.fby fbyVar = new com.bytedance.adsdk.zb.ycx.zb.fby(ludVar.jc());
            this.thx = fbyVar;
            Iterator<com.bytedance.adsdk.zb.ycx.zb.ycx<xkz, Path>> it = fbyVar.zb().iterator();
            while (it.hasNext()) {
                it.next().ycx(this);
            }
            for (com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar2 : this.thx.sya()) {
                ycx(ycxVar2);
                ycxVar2.ycx(this);
            }
        }
        ok();
    }

    void ycx(boolean z) {
        if (z && this.av == null) {
            this.av = new com.bytedance.adsdk.zb.ycx.ycx();
        }
        this.bhi = z;
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        ry();
    }

    lud zb() {
        return this.sya;
    }

    void ycx(ycx ycxVar) {
        this.tn = ycxVar;
    }

    boolean sya() {
        return this.tn != null;
    }

    void zb(ycx ycxVar) {
        this.dv = ycxVar;
    }

    private void ok() {
        if (!this.sya.dj().isEmpty()) {
            com.bytedance.adsdk.zb.ycx.zb.dj djVar = new com.bytedance.adsdk.zb.ycx.zb.dj(this.sya.dj());
            this.wwx = djVar;
            djVar.ycx();
            this.wwx.ycx(new ycx.InterfaceC0014ycx() { // from class: com.bytedance.adsdk.zb.sya.sya.ycx.1
                @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
                public void ycx() {
                    ycx ycxVar = ycx.this;
                    ycxVar.zb(ycxVar.wwx.jw() == 1.0f);
                }
            });
            zb(this.wwx.ul().floatValue() == 1.0f);
            ycx(this.wwx);
            return;
        }
        zb(true);
    }

    private void ry() {
        this.zb.invalidateSelf();
    }

    public void ycx(com.bytedance.adsdk.zb.ycx.zb.ycx<?, ?> ycxVar) {
        if (ycxVar == null) {
            return;
        }
        this.hf.add(ycxVar);
    }

    public Matrix dj() {
        return this.rmf;
    }

    public String lud() {
        lud ludVar = this.sya;
        if (ludVar != null) {
            return ludVar.ul();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        this.syc.set(0.0f, 0.0f, 0.0f, 0.0f);
        syc();
        this.ycx.set(matrix);
        if (z) {
            List<ycx> list = this.oty;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.ycx.preConcat(this.oty.get(size).dj.dj());
                }
            } else {
                ycx ycxVar = this.dv;
                if (ycxVar != null) {
                    this.ycx.preConcat(ycxVar.dj.dj());
                }
            }
        }
        this.ycx.preConcat(this.dj.dj());
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(Canvas canvas, Matrix matrix, int i2) {
        Paint paint;
        Integer numUl;
        com.bytedance.adsdk.zb.lud.ycx(this.htf);
        if (!this.tru || this.sya.wwx()) {
            com.bytedance.adsdk.zb.lud.zb(this.htf);
            return;
        }
        syc();
        com.bytedance.adsdk.zb.lud.ycx("Layer#parentMatrix");
        this.rmf.set(matrix);
        this.fby.reset();
        this.fby.set(matrix);
        for (int size = this.oty.size() - 1; size >= 0; size--) {
            this.fby.preConcat(this.oty.get(size).dj.dj());
        }
        com.bytedance.adsdk.zb.lud.zb("Layer#parentMatrix");
        com.bytedance.adsdk.zb.ycx.zb.ycx<?, Integer> ycxVarYcx = this.dj.ycx();
        int iIntValue = (int) ((((i2 / 255.0f) * ((ycxVarYcx == null || (numUl = ycxVarYcx.ul()) == null) ? 100 : numUl.intValue())) / 100.0f) * 255.0f);
        if (!sya() && !ul()) {
            this.fby.preConcat(this.dj.dj());
            com.bytedance.adsdk.zb.lud.ycx("Layer#drawLayer");
            zb(canvas, this.fby, iIntValue);
            com.bytedance.adsdk.zb.lud.zb("Layer#drawLayer");
            sya(com.bytedance.adsdk.zb.lud.zb(this.htf));
            return;
        }
        com.bytedance.adsdk.zb.lud.ycx("Layer#computeBounds");
        ycx(this.syc, this.fby, false);
        zb(this.syc, matrix);
        this.fby.preConcat(this.dj.dj());
        ycx(this.syc, this.fby);
        this.dy.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.jw);
        if (!this.jw.isIdentity()) {
            Matrix matrix2 = this.jw;
            matrix2.invert(matrix2);
            this.jw.mapRect(this.dy);
        }
        if (!this.syc.intersect(this.dy)) {
            this.syc.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.bytedance.adsdk.zb.lud.zb("Layer#computeBounds");
        if (this.syc.width() >= 1.0f && this.syc.height() >= 1.0f) {
            com.bytedance.adsdk.zb.lud.ycx("Layer#saveLayer");
            this.jc.setAlpha(OggPageHeader.MAX_SEGMENT_COUNT);
            com.bytedance.adsdk.zb.lt.lt.ycx(canvas, this.syc, this.jc);
            com.bytedance.adsdk.zb.lud.zb("Layer#saveLayer");
            ycx(canvas);
            com.bytedance.adsdk.zb.lud.ycx("Layer#drawLayer");
            zb(canvas, this.fby, iIntValue);
            com.bytedance.adsdk.zb.lud.zb("Layer#drawLayer");
            if (ul()) {
                ycx(canvas, this.fby);
            }
            if (sya()) {
                com.bytedance.adsdk.zb.lud.ycx("Layer#drawMatte");
                com.bytedance.adsdk.zb.lud.ycx("Layer#saveLayer");
                com.bytedance.adsdk.zb.lt.lt.ycx(canvas, this.syc, this.ry, 19);
                com.bytedance.adsdk.zb.lud.zb("Layer#saveLayer");
                ycx(canvas);
                this.tn.ycx(canvas, matrix, iIntValue);
                com.bytedance.adsdk.zb.lud.ycx("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.zb.lud.zb("Layer#restoreLayer");
                com.bytedance.adsdk.zb.lud.zb("Layer#drawMatte");
            }
            com.bytedance.adsdk.zb.lud.ycx("Layer#restoreLayer");
            canvas.restore();
            com.bytedance.adsdk.zb.lud.zb("Layer#restoreLayer");
        }
        if (this.bhi && (paint = this.av) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.av.setColor(-251901);
            this.av.setStrokeWidth(4.0f);
            canvas.drawRect(this.syc, this.av);
            this.av.setStyle(Paint.Style.FILL);
            this.av.setColor(1357638635);
            canvas.drawRect(this.syc, this.av);
        }
        sya(com.bytedance.adsdk.zb.lud.zb(this.htf));
    }

    private void sya(float f) {
        this.zb.hf().sya().ycx(this.sya.lt(), f);
    }

    private void ycx(Canvas canvas) {
        com.bytedance.adsdk.zb.lud.ycx("Layer#clearLayer");
        RectF rectF = this.syc;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.xkz);
        com.bytedance.adsdk.zb.lud.zb("Layer#clearLayer");
    }

    private void ycx(RectF rectF, Matrix matrix) {
        this.wie.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (ul()) {
            int size = this.thx.ycx().size();
            for (int i2 = 0; i2 < size; i2++) {
                com.bytedance.adsdk.zb.sya.zb.fby fbyVar = this.thx.ycx().get(i2);
                Path pathUl = this.thx.zb().get(i2).ul();
                if (pathUl != null) {
                    this.ul.set(pathUl);
                    this.ul.transform(matrix);
                    int i3 = AnonymousClass2.zb[fbyVar.ycx().ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        return;
                    }
                    if ((i3 == 3 || i3 == 4) && fbyVar.dj()) {
                        return;
                    }
                    this.ul.computeBounds(this.uh, false);
                    if (i2 == 0) {
                        this.wie.set(this.uh);
                    } else {
                        RectF rectF2 = this.wie;
                        rectF2.set(Math.min(rectF2.left, this.uh.left), Math.min(this.wie.top, this.uh.top), Math.max(this.wie.right, this.uh.right), Math.max(this.wie.bottom, this.uh.bottom));
                    }
                }
            }
            if (rectF.intersect(this.wie)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: com.bytedance.adsdk.zb.sya.sya.ycx$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] ycx;
        static final /* synthetic */ int[] zb;

        static {
            int[] iArr = new int[fby.ycx.values().length];
            zb = iArr;
            try {
                iArr[fby.ycx.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zb[fby.ycx.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zb[fby.ycx.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zb[fby.ycx.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[lud.ycx.values().length];
            ycx = iArr2;
            try {
                iArr2[lud.ycx.lud.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ycx[lud.ycx.ycx.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ycx[lud.ycx.zb.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ycx[lud.ycx.sya.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ycx[lud.ycx.dj.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ycx[lud.ycx.lt.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ycx[lud.ycx.ul.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void zb(RectF rectF, Matrix matrix) {
        if (!sya() || this.sya.ok() == lud.zb.sya) {
            return;
        }
        this.pmi.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.tn.ycx(this.pmi, matrix, true);
        if (rectF.intersect(this.pmi)) {
            return;
        }
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float lt() {
        return this.aeu;
    }

    protected void ycx(int i2) {
        this.aeu = ((this.dj.ycx() != null ? this.dj.ycx().ul().intValue() : 100) / 100.0f) * (i2 / 255.0f);
    }

    public void zb(Canvas canvas, Matrix matrix, int i2) {
        ycx(i2);
    }

    private void ycx(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.zb.lud.ycx("Layer#saveLayer");
        com.bytedance.adsdk.zb.lt.lt.ycx(canvas, this.syc, this.ea, 19);
        if (Build.VERSION.SDK_INT < 28) {
            ycx(canvas);
        }
        com.bytedance.adsdk.zb.lud.zb("Layer#saveLayer");
        for (int i2 = 0; i2 < this.thx.ycx().size(); i2++) {
            com.bytedance.adsdk.zb.sya.zb.fby fbyVar = this.thx.ycx().get(i2);
            com.bytedance.adsdk.zb.ycx.zb.ycx<xkz, Path> ycxVar = this.thx.zb().get(i2);
            com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar2 = this.thx.sya().get(i2);
            int i3 = AnonymousClass2.zb[fbyVar.ycx().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    if (i2 == 0) {
                        this.jc.setColor(-16777216);
                        this.jc.setAlpha(OggPageHeader.MAX_SEGMENT_COUNT);
                        canvas.drawRect(this.syc, this.jc);
                    }
                    if (fbyVar.dj()) {
                        sya(canvas, matrix, ycxVar, ycxVar2);
                    } else {
                        ycx(canvas, matrix, ycxVar);
                    }
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        if (fbyVar.dj()) {
                            zb(canvas, matrix, ycxVar, ycxVar2);
                        } else {
                            ycx(canvas, matrix, ycxVar, ycxVar2);
                        }
                    }
                } else if (fbyVar.dj()) {
                    lud(canvas, matrix, ycxVar, ycxVar2);
                } else {
                    dj(canvas, matrix, ycxVar, ycxVar2);
                }
            } else if (xkz()) {
                this.jc.setAlpha(OggPageHeader.MAX_SEGMENT_COUNT);
                canvas.drawRect(this.syc, this.jc);
            }
        }
        com.bytedance.adsdk.zb.lud.ycx("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.zb.lud.zb("Layer#restoreLayer");
    }

    private boolean xkz() {
        if (this.thx.zb().isEmpty()) {
            return false;
        }
        for (int i2 = 0; i2 < this.thx.ycx().size(); i2++) {
            if (this.thx.ycx().get(i2).ycx() != fby.ycx.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void ycx(Canvas canvas, Matrix matrix, com.bytedance.adsdk.zb.ycx.zb.ycx<xkz, Path> ycxVar, com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar2) {
        this.ul.set(ycxVar.ul());
        this.ul.transform(matrix);
        this.jc.setAlpha((int) (ycxVar2.ul().intValue() * 2.55f));
        canvas.drawPath(this.ul, this.jc);
    }

    private void zb(Canvas canvas, Matrix matrix, com.bytedance.adsdk.zb.ycx.zb.ycx<xkz, Path> ycxVar, com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar2) {
        com.bytedance.adsdk.zb.lt.lt.ycx(canvas, this.syc, this.jc);
        canvas.drawRect(this.syc, this.jc);
        this.ul.set(ycxVar.ul());
        this.ul.transform(matrix);
        this.jc.setAlpha((int) (ycxVar2.ul().intValue() * 2.55f));
        canvas.drawPath(this.ul, this.ok);
        canvas.restore();
    }

    private void ycx(Canvas canvas, Matrix matrix, com.bytedance.adsdk.zb.ycx.zb.ycx<xkz, Path> ycxVar) {
        this.ul.set(ycxVar.ul());
        this.ul.transform(matrix);
        canvas.drawPath(this.ul, this.ok);
    }

    private void sya(Canvas canvas, Matrix matrix, com.bytedance.adsdk.zb.ycx.zb.ycx<xkz, Path> ycxVar, com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar2) {
        com.bytedance.adsdk.zb.lt.lt.ycx(canvas, this.syc, this.ok);
        canvas.drawRect(this.syc, this.jc);
        this.ok.setAlpha((int) (ycxVar2.ul().intValue() * 2.55f));
        this.ul.set(ycxVar.ul());
        this.ul.transform(matrix);
        canvas.drawPath(this.ul, this.ok);
        canvas.restore();
    }

    private void dj(Canvas canvas, Matrix matrix, com.bytedance.adsdk.zb.ycx.zb.ycx<xkz, Path> ycxVar, com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar2) {
        com.bytedance.adsdk.zb.lt.lt.ycx(canvas, this.syc, this.ea);
        this.ul.set(ycxVar.ul());
        this.ul.transform(matrix);
        this.jc.setAlpha((int) (ycxVar2.ul().intValue() * 2.55f));
        canvas.drawPath(this.ul, this.jc);
        canvas.restore();
    }

    private void lud(Canvas canvas, Matrix matrix, com.bytedance.adsdk.zb.ycx.zb.ycx<xkz, Path> ycxVar, com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar2) {
        com.bytedance.adsdk.zb.lt.lt.ycx(canvas, this.syc, this.ea);
        canvas.drawRect(this.syc, this.jc);
        this.ok.setAlpha((int) (ycxVar2.ul().intValue() * 2.55f));
        this.ul.set(ycxVar.ul());
        this.ul.transform(matrix);
        canvas.drawPath(this.ul, this.ok);
        canvas.restore();
    }

    boolean ul() {
        com.bytedance.adsdk.zb.ycx.zb.fby fbyVar = this.thx;
        return (fbyVar == null || fbyVar.zb().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zb(boolean z) {
        if (z != this.tru) {
            this.tru = z;
            ry();
        }
    }

    public boolean fby() {
        return this.tru;
    }

    void ycx(float f) {
        this.dj.ycx(f);
        if (this.thx != null) {
            for (int i2 = 0; i2 < this.thx.zb().size(); i2++) {
                this.thx.zb().get(i2).ycx(f);
            }
        }
        com.bytedance.adsdk.zb.ycx.zb.dj djVar = this.wwx;
        if (djVar != null) {
            djVar.ycx(f);
        }
        ycx ycxVar = this.tn;
        if (ycxVar != null) {
            ycxVar.ycx(f);
        }
        for (int i3 = 0; i3 < this.hf.size(); i3++) {
            this.hf.get(i3).ycx(f);
        }
    }

    private void syc() {
        if (this.oty == null) {
            if (this.dv == null) {
                this.oty = Collections.EMPTY_LIST;
                return;
            }
            this.oty = new ArrayList();
            for (ycx ycxVar = this.dv; ycxVar != null; ycxVar = ycxVar.dv) {
                this.oty.add(ycxVar);
            }
        }
    }

    public String jw() {
        return this.sya.lt();
    }

    public com.bytedance.adsdk.zb.sya.zb.ycx jc() {
        return this.sya.tn();
    }

    public BlurMaskFilter zb(float f) {
        if (this.lud == f) {
            return this.lt;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.lt = blurMaskFilter;
        this.lud = f;
        return blurMaskFilter;
    }

    public com.bytedance.adsdk.zb.lud.jc ea() {
        return this.sya.dv();
    }
}
