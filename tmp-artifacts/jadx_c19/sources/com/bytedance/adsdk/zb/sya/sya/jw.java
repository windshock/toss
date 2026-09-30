package com.bytedance.adsdk.zb.sya.sya;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.zb.htf;
import com.bytedance.adsdk.zb.sya.ycx.ea;
import com.bytedance.adsdk.zb.sya.zb;
import com.bytedance.adsdk.zb.sya.zb.dy;
import com.bytedance.adsdk.zb.ycx.zb.syc;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends com.bytedance.adsdk.zb.sya.sya.ycx {
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> dv;
    private final com.bytedance.adsdk.zb.jw dy;
    private final Paint ea;
    private final RectF fby;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> hf;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> htf;
    private final Paint jc;
    private final Matrix jw;
    private final Map<com.bytedance.adsdk.zb.sya.dj, List<com.bytedance.adsdk.zb.ycx.ycx.dj>> ok;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> oty;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> pmi;
    private final LongSparseArray<String> ry;
    private final syc syc;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> thx;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> tn;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Typeface, Typeface> tru;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> uh;
    private final StringBuilder ul;
    private final com.bytedance.adsdk.zb.ul wie;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> wwx;
    private final List<ycx> xkz;

    jw(com.bytedance.adsdk.zb.jw jwVar, lud ludVar) {
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVar2;
        com.bytedance.adsdk.zb.sya.ycx.ycx ycxVar;
        com.bytedance.adsdk.zb.sya.ycx.ycx ycxVar2;
        super(jwVar, ludVar);
        this.ul = new StringBuilder(2);
        this.fby = new RectF();
        this.jw = new Matrix();
        int i2 = 1;
        this.jc = new Paint(i2) { // from class: com.bytedance.adsdk.zb.sya.sya.jw.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.ea = new Paint(i2) { // from class: com.bytedance.adsdk.zb.sya.sya.jw.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.ok = new HashMap();
        this.ry = new LongSparseArray<>();
        this.xkz = new ArrayList();
        this.dy = jwVar;
        this.wie = ludVar.ycx();
        syc sycVarYcx = ludVar.uh().ycx();
        this.syc = sycVarYcx;
        sycVarYcx.ycx(this);
        ycx(sycVarYcx);
        ea eaVarHtf = ludVar.htf();
        if (eaVarHtf != null && (ycxVar2 = eaVarHtf.ycx) != null) {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVarYcx = ycxVar2.ycx();
            this.pmi = ycxVarYcx;
            ycxVarYcx.ycx(this);
            ycx(this.pmi);
        }
        if (eaVarHtf != null && (ycxVar = eaVarHtf.zb) != null) {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVarYcx2 = ycxVar.ycx();
            this.htf = ycxVarYcx2;
            ycxVarYcx2.ycx(this);
            ycx(this.htf);
        }
        if (eaVarHtf != null && (zbVar2 = eaVarHtf.sya) != null) {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx3 = zbVar2.ycx();
            this.wwx = ycxVarYcx3;
            ycxVarYcx3.ycx(this);
            ycx(this.wwx);
        }
        if (eaVarHtf == null || (zbVar = eaVarHtf.dj) == null) {
            return;
        }
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx4 = zbVar.ycx();
        this.dv = ycxVarYcx4;
        ycxVarYcx4.ycx(this);
        ycx(this.dv);
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx, com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        super.ycx(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.wie.dj().width(), this.wie.dj().height());
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx
    public void zb(Canvas canvas, Matrix matrix, int i2) {
        super.zb(canvas, matrix, i2);
        com.bytedance.adsdk.zb.sya.zb zbVarUl = this.syc.ul();
        com.bytedance.adsdk.zb.sya.sya syaVar = this.wie.syc().get(zbVarUl.zb);
        if (syaVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ycx(zbVarUl, matrix);
        if (this.dy.oty()) {
            ycx(zbVarUl, matrix, syaVar, canvas);
        } else {
            ycx(zbVarUl, syaVar, canvas);
        }
        canvas.restore();
    }

    private void ycx(com.bytedance.adsdk.zb.sya.zb zbVar, Matrix matrix) {
        com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar = this.uh;
        if (ycxVar != null) {
            this.jc.setColor(ycxVar.ul().intValue());
        } else {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar2 = this.pmi;
            if (ycxVar2 != null) {
                this.jc.setColor(ycxVar2.ul().intValue());
            } else {
                this.jc.setColor(zbVar.fby);
            }
        }
        com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar3 = this.thx;
        if (ycxVar3 != null) {
            this.ea.setColor(ycxVar3.ul().intValue());
        } else {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Integer, Integer> ycxVar4 = this.htf;
            if (ycxVar4 != null) {
                this.ea.setColor(ycxVar4.ul().intValue());
            } else {
                this.ea.setColor(zbVar.jw);
            }
        }
        int iIntValue = ((this.dj.ycx() == null ? 100 : this.dj.ycx().ul().intValue()) * OggPageHeader.MAX_SEGMENT_COUNT) / 100;
        this.jc.setAlpha(iIntValue);
        this.ea.setAlpha(iIntValue);
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar5 = this.tn;
        if (ycxVar5 != null) {
            this.ea.setStrokeWidth(ycxVar5.ul().floatValue());
            return;
        }
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar6 = this.wwx;
        if (ycxVar6 != null) {
            this.ea.setStrokeWidth(ycxVar6.ul().floatValue());
        } else {
            this.ea.setStrokeWidth(zbVar.jc * com.bytedance.adsdk.zb.lt.lt.ycx());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ycx(com.bytedance.adsdk.zb.sya.zb zbVar, Matrix matrix, com.bytedance.adsdk.zb.sya.sya syaVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        int i2;
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar = this.hf;
        if (ycxVar != null) {
            fFloatValue = ycxVar.ul().floatValue();
        } else {
            fFloatValue = zbVar.sya;
        }
        float f = fFloatValue / 100.0f;
        float fYcx = com.bytedance.adsdk.zb.lt.lt.ycx(matrix);
        List<String> listYcx = ycx(zbVar.ycx);
        int size = listYcx.size();
        float f2 = zbVar.lud / 10.0f;
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar2 = this.oty;
        if (ycxVar2 != null) {
            fFloatValue2 = ycxVar2.ul().floatValue();
        } else {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar3 = this.dv;
            if (ycxVar3 != null) {
                fFloatValue2 = ycxVar3.ul().floatValue();
            }
            float f3 = f2;
            int i3 = -1;
            i2 = 0;
            while (i2 < size) {
                String str = listYcx.get(i2);
                PointF pointF = zbVar.ry;
                int i4 = i2;
                List<ycx> listYcx2 = ycx(str, pointF == null ? 0.0f : pointF.x, syaVar, f, f3, true);
                int i5 = 0;
                while (i5 < listYcx2.size()) {
                    ycx ycxVar4 = listYcx2.get(i5);
                    int i6 = i3 + 1;
                    canvas.save();
                    ycx(canvas, zbVar, i6, ycxVar4.zb);
                    ycx(ycxVar4.ycx, zbVar, syaVar, canvas, fYcx, f, f3);
                    canvas.restore();
                    i5++;
                    listYcx2 = listYcx2;
                    i3 = i6;
                }
                i2 = i4 + 1;
            }
        }
        f2 += fFloatValue2;
        float f32 = f2;
        int i32 = -1;
        i2 = 0;
        while (i2 < size) {
        }
    }

    private void ycx(String str, com.bytedance.adsdk.zb.sya.zb zbVar, com.bytedance.adsdk.zb.sya.sya syaVar, Canvas canvas, float f, float f2, float f3) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            com.bytedance.adsdk.zb.sya.dj djVar = this.wie.xkz().get(com.bytedance.adsdk.zb.sya.dj.ycx(str.charAt(i2), syaVar.ycx(), syaVar.sya()));
            if (djVar != null) {
                ycx(djVar, f2, zbVar, canvas);
                canvas.translate((((float) djVar.zb()) * f2 * com.bytedance.adsdk.zb.lt.lt.ycx()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ycx(com.bytedance.adsdk.zb.sya.zb zbVar, com.bytedance.adsdk.zb.sya.sya syaVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        int size;
        int i2;
        Typeface typefaceYcx = ycx(syaVar);
        if (typefaceYcx == null) {
            return;
        }
        String strZb = zbVar.ycx;
        htf htfVarDv = this.dy.dv();
        if (htfVarDv != null) {
            strZb = htfVarDv.zb(jw(), strZb);
        }
        this.jc.setTypeface(typefaceYcx);
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar = this.hf;
        if (ycxVar != null) {
            fFloatValue = ycxVar.ul().floatValue();
        } else {
            fFloatValue = zbVar.sya;
        }
        this.jc.setTextSize(com.bytedance.adsdk.zb.lt.lt.ycx() * fFloatValue);
        this.ea.setTypeface(this.jc.getTypeface());
        this.ea.setTextSize(this.jc.getTextSize());
        float f = zbVar.lud / 10.0f;
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar2 = this.oty;
        if (ycxVar2 != null) {
            fFloatValue2 = ycxVar2.ul().floatValue();
        } else {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVar3 = this.dv;
            if (ycxVar3 != null) {
                fFloatValue2 = ycxVar3.ul().floatValue();
            }
            float fYcx = ((f * com.bytedance.adsdk.zb.lt.lt.ycx()) * fFloatValue) / 100.0f;
            List<String> listYcx = ycx(strZb);
            size = listYcx.size();
            int i3 = -1;
            i2 = 0;
            while (i2 < size) {
                String str = listYcx.get(i2);
                PointF pointF = zbVar.ry;
                int i4 = i2;
                List<ycx> listYcx2 = ycx(str, pointF == null ? 0.0f : pointF.x, syaVar, 0.0f, fYcx, false);
                for (int i5 = 0; i5 < listYcx2.size(); i5++) {
                    ycx ycxVar4 = listYcx2.get(i5);
                    i3++;
                    canvas.save();
                    ycx(canvas, zbVar, i3, ycxVar4.zb);
                    ycx(ycxVar4.ycx, zbVar, canvas, fYcx);
                    canvas.restore();
                }
                i2 = i4 + 1;
            }
        }
        f += fFloatValue2;
        float fYcx2 = ((f * com.bytedance.adsdk.zb.lt.lt.ycx()) * fFloatValue) / 100.0f;
        List<String> listYcx3 = ycx(strZb);
        size = listYcx3.size();
        int i32 = -1;
        i2 = 0;
        while (i2 < size) {
        }
    }

    private void ycx(Canvas canvas, com.bytedance.adsdk.zb.sya.zb zbVar, int i2, float f) {
        PointF pointF = zbVar.ok;
        PointF pointF2 = zbVar.ry;
        float fYcx = com.bytedance.adsdk.zb.lt.lt.ycx();
        float f2 = (i2 * zbVar.lt * fYcx) + (pointF == null ? 0.0f : (zbVar.lt * 0.6f * fYcx) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i3 = AnonymousClass3.ycx[zbVar.dj.ordinal()];
        if (i3 == 1) {
            canvas.translate(f3, f2);
        } else if (i3 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else {
            if (i3 != 3) {
                return;
            }
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
    }

    /* renamed from: com.bytedance.adsdk.zb.sya.sya.jw$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[zb.ycx.values().length];
            ycx = iArr;
            try {
                iArr[zb.ycx.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[zb.ycx.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ycx[zb.ycx.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Typeface ycx(com.bytedance.adsdk.zb.sya.sya syaVar) {
        Typeface typefaceUl;
        com.bytedance.adsdk.zb.ycx.zb.ycx<Typeface, Typeface> ycxVar = this.tru;
        if (ycxVar != null && (typefaceUl = ycxVar.ul()) != null) {
            return typefaceUl;
        }
        Typeface typefaceYcx = this.dy.ycx(syaVar);
        return typefaceYcx != null ? typefaceYcx : syaVar.dj();
    }

    private List<String> ycx(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void ycx(String str, com.bytedance.adsdk.zb.sya.zb zbVar, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strYcx = ycx(str, length);
            length += strYcx.length();
            ycx(strYcx, zbVar, canvas);
            canvas.translate(this.jc.measureText(strYcx) + f, 0.0f);
        }
    }

    private List<ycx> ycx(String str, float f, com.bytedance.adsdk.zb.sya.sya syaVar, float f2, float f3, boolean z) {
        float fMeasureText;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (z) {
                com.bytedance.adsdk.zb.sya.dj djVar = this.wie.xkz().get(com.bytedance.adsdk.zb.sya.dj.ycx(cCharAt, syaVar.ycx(), syaVar.sya()));
                if (djVar != null) {
                    fMeasureText = ((float) djVar.zb()) * f2 * com.bytedance.adsdk.zb.lt.lt.ycx();
                }
            } else {
                fMeasureText = this.jc.measureText(str.substring(i5, i5 + 1));
            }
            float f7 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i4 = i5;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i2++;
                ycx ycxVarZb = zb(i2);
                if (i4 == i3) {
                    ycxVarZb.ycx(str.substring(i3, i5).trim(), (f4 - f7) - ((r9.length() - r7.length()) * f6));
                    i3 = i5;
                    i4 = i3;
                    f4 = f7;
                    f5 = f4;
                } else {
                    ycxVarZb.ycx(str.substring(i3, i4 - 1).trim(), ((f4 - f5) - ((r7.length() - r13.length()) * f6)) - f6);
                    f4 = f5;
                    i3 = i4;
                }
            }
        }
        if (f4 > 0.0f) {
            i2++;
            zb(i2).ycx(str.substring(i3), f4);
        }
        return this.xkz.subList(0, i2);
    }

    private ycx zb(int i2) {
        for (int size = this.xkz.size(); size < i2; size++) {
            this.xkz.add(new ycx());
        }
        return this.xkz.get(i2 - 1);
    }

    private void ycx(com.bytedance.adsdk.zb.sya.dj djVar, float f, com.bytedance.adsdk.zb.sya.zb zbVar, Canvas canvas) {
        List<com.bytedance.adsdk.zb.ycx.ycx.dj> listYcx = ycx(djVar);
        for (int i2 = 0; i2 < listYcx.size(); i2++) {
            Path pathDj = listYcx.get(i2).dj();
            pathDj.computeBounds(this.fby, false);
            this.jw.reset();
            this.jw.preTranslate(0.0f, (-zbVar.ul) * com.bytedance.adsdk.zb.lt.lt.ycx());
            this.jw.preScale(f, f);
            pathDj.transform(this.jw);
            if (zbVar.ea) {
                ycx(pathDj, this.jc, canvas);
                ycx(pathDj, this.ea, canvas);
            } else {
                ycx(pathDj, this.ea, canvas);
                ycx(pathDj, this.jc, canvas);
            }
        }
    }

    private void ycx(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private void ycx(String str, com.bytedance.adsdk.zb.sya.zb zbVar, Canvas canvas) {
        if (zbVar.ea) {
            ycx(str, this.jc, canvas);
            ycx(str, this.ea, canvas);
        } else {
            ycx(str, this.ea, canvas);
            ycx(str, this.jc, canvas);
        }
    }

    private void ycx(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    private List<com.bytedance.adsdk.zb.ycx.ycx.dj> ycx(com.bytedance.adsdk.zb.sya.dj djVar) {
        if (this.ok.containsKey(djVar)) {
            return this.ok.get(djVar);
        }
        List<dy> listYcx = djVar.ycx();
        int size = listYcx.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new com.bytedance.adsdk.zb.ycx.ycx.dj(this.dy, this, listYcx.get(i2), this.wie));
        }
        this.ok.put(djVar, arrayList);
        return arrayList;
    }

    private String ycx(String str, int i2) {
        int iCodePointAt = str.codePointAt(i2);
        int iCharCount = Character.charCount(iCodePointAt) + i2;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!sya(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.ry.indexOfKey(j) >= 0) {
            return this.ry.get(j);
        }
        this.ul.setLength(0);
        while (i2 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i2);
            this.ul.appendCodePoint(iCodePointAt3);
            i2 += Character.charCount(iCodePointAt3);
        }
        String string = this.ul.toString();
        this.ry.put(j, string);
        return string;
    }

    private boolean sya(int i2) {
        return Character.getType(i2) == 16 || Character.getType(i2) == 27 || Character.getType(i2) == 6 || Character.getType(i2) == 28 || Character.getType(i2) == 8 || Character.getType(i2) == 19;
    }

    static class ycx {
        private String ycx;
        private float zb;

        private ycx() {
            this.ycx = "";
            this.zb = 0.0f;
        }

        void ycx(String str, float f) {
            this.ycx = str;
            this.zb = f;
        }
    }
}
