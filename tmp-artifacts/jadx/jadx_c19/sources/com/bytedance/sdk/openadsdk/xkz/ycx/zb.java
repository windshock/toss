package com.bytedance.sdk.openadsdk.xkz.ycx;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.component.utils.wwx;
import com.bytedance.sdk.openadsdk.core.lt.dj;
import com.bytedance.sdk.openadsdk.core.lt.fby;
import com.bytedance.sdk.openadsdk.core.lt.lud;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private InterfaceC0028zb lud;
    private Context ycx;
    private List<Object> zb = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.xkz.ycx.ycx> sya = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.xkz.ycx.ycx> dj = new ArrayList();

    /* renamed from: com.bytedance.sdk.openadsdk.xkz.ycx.zb$zb, reason: collision with other inner class name */
    public interface InterfaceC0028zb {
        void ycx(com.bytedance.sdk.openadsdk.xkz.ycx.ycx ycxVar);
    }

    public void ycx(InterfaceC0028zb interfaceC0028zb) {
        this.lud = interfaceC0028zb;
    }

    public zb(Context context) {
        this.ycx = context.getApplicationContext();
    }

    public void ycx(List<com.bytedance.sdk.openadsdk.xkz.ycx.ycx> list) {
        this.sya.clear();
        this.dj.clear();
        if (list != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (com.bytedance.sdk.openadsdk.xkz.ycx.ycx ycxVar : list) {
                try {
                    if (Long.parseLong(ycxVar.lt()) >= jCurrentTimeMillis - 604800000) {
                        this.sya.add(ycxVar);
                    } else {
                        this.dj.add(ycxVar);
                    }
                } catch (NumberFormatException e) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7k=", "cs8PvQqvfciSU+RYjwWpJ1XPKZQTqGzV", "SOs5tA+wTcaUSw==", 79);
                    this.sya.add(ycxVar);
                }
            }
        }
        ycx();
        notifyDataSetChanged();
    }

    private void ycx() {
        this.zb.clear();
        if (!this.sya.isEmpty()) {
            List<Object> list = this.zb;
            Context context = this.ycx;
            list.add(context.getString(wwx.zb(context, "tt_history_this_week")));
            this.zb.addAll(this.sya);
        }
        if (this.dj.isEmpty()) {
            return;
        }
        List<Object> list2 = this.zb;
        Context context2 = this.ycx;
        list2.add(context2.getString(wwx.zb(context2, "tt_history_a_week_ago")));
        this.zb.addAll(this.dj);
    }

    public int getItemViewType(int i2) {
        return this.zb.get(i2) instanceof String ? 0 : 1;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            fby fbyVar = new fby(this.ycx);
            fbyVar.setPadding(ycx(16.0f), ycx(8.0f), 0, ycx(8.0f));
            fbyVar.setTextSize(14.0f);
            int i3 = Build.VERSION.SDK_INT;
            fbyVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
            Typeface typefaceCreate = i3 >= 28 ? Typeface.create(fbyVar.getTypeface(), 500, false) : null;
            if (typefaceCreate != null) {
                fbyVar.setTypeface(typefaceCreate);
            }
            fbyVar.setTextColor(Color.argb(167, 0, 0, 0));
            fbyVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new sya(fbyVar);
        }
        return new ycx(zb());
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        Object obj = this.zb.get(i2);
        if (viewHolder.getItemViewType() == 0) {
            ((sya) viewHolder).ycx.setText((String) obj);
        } else {
            ((ycx) viewHolder).ycx((com.bytedance.sdk.openadsdk.xkz.ycx.ycx) obj);
        }
    }

    public int getItemCount() {
        return this.zb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private lud zb() {
        lud ludVar = new lud(this.ycx);
        ludVar.setOrientation(0);
        ludVar.setLayoutParams(new RecyclerView.LayoutParams(-1, ycx(84.0f)));
        ludVar.setPadding(ycx(16.0f), ycx(10.0f), ycx(16.0f), ycx(10.0f));
        lud ludVar2 = new lud(this.ycx);
        ludVar2.setOrientation(1);
        dj djVar = new dj(this.ycx);
        djVar.setId(View.generateViewId());
        djVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        djVar.setAdjustViewBounds(true);
        djVar.setLayoutParams(new LinearLayout.LayoutParams(ycx(64.0f), ycx(64.0f)));
        ludVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ludVar2.setPadding(ycx(8.0f), ycx(0.0f), ycx(0.0f), ycx(0.0f));
        fby fbyVar = new fby(this.ycx);
        fbyVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i2 = Build.VERSION.SDK_INT;
        fbyVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface typefaceCreate = i2 >= 28 ? Typeface.create(fbyVar.getTypeface(), 500, false) : null;
        if (typefaceCreate != null) {
            fbyVar.setTypeface(typefaceCreate);
        }
        fbyVar.setLineSpacing(0.0f, 1.3f);
        fbyVar.setLetterSpacing(0.0067f);
        fbyVar.setTextColor(Color.argb(OggPageHeader.MAX_SEGMENT_COUNT, 0, 0, 0));
        fbyVar.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fbyVar.setEllipsize(truncateAt);
        fbyVar.setId(View.generateViewId());
        fbyVar.setTextSize(0, ycx(14.0f));
        fbyVar.setIncludeFontPadding(false);
        fby fbyVar2 = new fby(this.ycx);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ycx(4.0f);
        fbyVar2.setLayoutParams(layoutParams);
        Typeface typefaceCreate2 = i2 >= 28 ? Typeface.create(fbyVar.getTypeface(), 400, false) : null;
        if (typefaceCreate2 != null) {
            fbyVar2.setTypeface(typefaceCreate2);
        }
        fbyVar2.setLineSpacing(0.0f, 1.3f);
        fbyVar2.setLetterSpacing(0.0067f);
        fbyVar2.setTextColor(Color.argb(166, 0, 0, 0));
        fbyVar2.setMaxLines(1);
        fbyVar2.setEllipsize(truncateAt);
        fbyVar2.setId(View.generateViewId());
        fbyVar2.setTextSize(0, ycx(14.0f));
        fbyVar2.setIncludeFontPadding(false);
        fby fbyVar3 = new fby(this.ycx);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = ycx(8.0f);
        fbyVar3.setLayoutParams(layoutParams2);
        fbyVar3.setTextAppearance(R.style.TextAppearance.Material.Caption);
        fbyVar3.setTextColor(Color.argb(166, 0, 0, 0));
        fbyVar3.setId(View.generateViewId());
        Typeface typefaceCreate3 = i2 >= 28 ? Typeface.create(fbyVar.getTypeface(), 400, false) : null;
        if (typefaceCreate3 != null) {
            fbyVar3.setTypeface(typefaceCreate3);
        }
        fbyVar3.setLineSpacing(0.0f, 1.3f);
        fbyVar3.setLetterSpacing(0.0067f);
        fbyVar3.setTextColor(Color.argb(166, 0, 0, 0));
        fbyVar3.setMaxLines(1);
        fbyVar3.setEllipsize(truncateAt);
        fbyVar3.setId(View.generateViewId());
        fbyVar3.setTextSize(0, ycx(12.0f));
        fbyVar3.setIncludeFontPadding(false);
        ludVar.addView(djVar);
        ludVar.addView(ludVar2);
        ludVar2.addView(fbyVar);
        ludVar2.addView(fbyVar2);
        ludVar2.addView(fbyVar3);
        ludVar.setTag(new View[]{djVar, fbyVar, fbyVar2, fbyVar3});
        return ludVar;
    }

    class sya extends RecyclerView.ViewHolder {
        fby ycx;

        sya(View view) {
            super(view);
            this.ycx = (fby) view;
        }
    }

    class ycx extends RecyclerView.ViewHolder {
        fby dj;
        fby sya;
        dj ycx;
        fby zb;

        ycx(View view) {
            super(view);
            fby[] fbyVarArr = (View[]) view.getTag();
            this.ycx = (dj) fbyVarArr[0];
            this.zb = fbyVarArr[1];
            this.sya = fbyVarArr[2];
            this.dj = fbyVarArr[3];
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xkz.ycx.zb.ycx.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int adapterPosition = ycx.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        Object obj = zb.this.zb.get(adapterPosition);
                        if (obj instanceof com.bytedance.sdk.openadsdk.xkz.ycx.ycx) {
                            zb.this.ycx((com.bytedance.sdk.openadsdk.xkz.ycx.ycx) obj);
                        }
                    }
                }
            });
        }

        void ycx(com.bytedance.sdk.openadsdk.xkz.ycx.ycx ycxVar) {
            try {
                String strLud = ycxVar.lud();
                this.zb.setText(ycxVar.dj());
                this.sya.setText(strLud);
                this.dj.setText(new SimpleDateFormat("MMM dd · HH:mm", Locale.US).format(new Date(Long.parseLong(ycxVar.lt()))));
                this.ycx.setImageResource(com.bytedance.R.drawable.tt_history_placeholder);
                if (TextUtils.isEmpty(strLud)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.jc.dj.ycx(com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.ycx().ycx(strLud)).sya(1).ycx(this.ycx);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7k=", "cs8PvQqvfciSU+RYjwWpJ1XPKZQTqGzVxGLeTpgesjFy+iiYNbVs0KhF21mJAw==", "WecjkQ==", 359);
                htf.ycx("IABHSecAdapter", "bind error: ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx(com.bytedance.sdk.openadsdk.xkz.ycx.ycx ycxVar) {
        InterfaceC0028zb interfaceC0028zb = this.lud;
        if (interfaceC0028zb != null) {
            interfaceC0028zb.ycx(ycxVar);
        }
    }

    private int ycx(float f) {
        return dc.zb(this.ycx, f);
    }
}
