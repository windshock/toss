package com.bytedance.sdk.openadsdk.core.jc;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.zb.ul;
import com.bytedance.sdk.component.adexpress.zb.xkz;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.jc.lt;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.core.rmf;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.sya.sya;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.wie;
import com.bytedance.sdk.openadsdk.utils.zb;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya$ycx implements com.bytedance.sdk.component.adexpress.zb.dj<View>, lt.zb {
    private String dj;
    private String ea;
    private FrameLayout fby;
    private final int jc;
    private tn jw;
    private final int lt;
    private final Context lud;
    private lt ok;
    private int ry;
    private TTDislikeDialogAbstract sya;
    private PAGExpressAdWrapperListener syc;
    private final int ul;
    private ul xkz;
    AtomicBoolean ycx = new AtomicBoolean(false);
    private sya zb;

    public int sya() {
        return 5;
    }

    public sya$ycx(Context context, tn tnVar, int i2, int i3, String str, int i4) {
        this.ea = str;
        if (tnVar != null && tnVar.uhs()) {
            this.ea = "fullscreen_interstitial_ad";
        }
        this.lud = context;
        this.lt = i2;
        this.ul = i3;
        this.jw = tnVar;
        this.jc = dc.zb(context, 3.0f);
        this.ry = i4;
        lt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.bytedance.sdk.component.jw.fby, com.bytedance.sdk.openadsdk.core.jc.lt] */
    private void lt() {
        FrameLayout frameLayout = new FrameLayout(this.lud);
        this.fby = frameLayout;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(this.lt, this.ul);
        }
        layoutParams.width = this.lt;
        layoutParams.height = this.ul;
        layoutParams.gravity = 17;
        this.fby.setLayoutParams(layoutParams);
        ?? Fby = fby();
        this.fby.addView(Fby);
        View viewUl = ul();
        this.fby.addView(viewUl);
        tn tnVar = this.jw;
        if (tnVar != null && tnVar.uhs()) {
            Fby.setBackgroundColor(-16777216);
            Fby.ycx(((Activity) this.lud).findViewById(wie.yfd), FriendlyObstructionPurpose.OTHER);
        }
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
        Fby.ycx(viewUl, friendlyObstructionPurpose);
        Context context = this.lud;
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        View viewFindViewById = ((Activity) context).findViewById(wie.msc);
        if (viewFindViewById != null) {
            Fby.ycx(viewFindViewById, friendlyObstructionPurpose);
        }
        View viewFindViewById2 = ((Activity) this.lud).findViewById(wie.qu);
        if (viewFindViewById2 != null) {
            Fby.ycx(viewFindViewById2, friendlyObstructionPurpose);
        }
    }

    public void ycx(ul ulVar) {
        tn tnVar;
        if (this.ycx.get()) {
            return;
        }
        if (this.lud == null || (tnVar = this.jw) == null) {
            ulVar.ycx(106, "material null");
            return;
        }
        this.xkz = ulVar;
        if (TextUtils.isEmpty(tnVar.rc())) {
            ulVar.ycx(106, "dsp data is null");
        } else {
            this.ok.htf();
        }
    }

    private View ul() {
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.lud, this.jw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        tn tnVar = this.jw;
        if (tnVar != null && tnVar.uhs()) {
            layoutParams.leftMargin = dc.zb(this.lud, 20.0f);
            layoutParams.bottomMargin = dc.zb(this.lud, 20.0f);
            layoutParams.gravity = 8388691;
        } else {
            int i2 = this.jc;
            layoutParams.topMargin = i2;
            layoutParams.leftMargin = i2;
        }
        pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jc.sya$ycx.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!zb.lud() || !pmi.dj().av()) {
                    TTWebsiteActivity.ycx(sya$ycx.this.lud, sya$ycx.this.jw, sya$ycx.this.ea);
                } else {
                    IABLandingPageActivity.ycx(sya$ycx.this.lud, sya$ycx.this.jw, sya$ycx.this.ea);
                }
            }
        });
        return pAGLogoViewCreatePAGLogoViewByMaterial;
    }

    private lt fby() {
        lt ltVar = new lt(this.lud);
        this.ok = ltVar;
        dj.ycx(ltVar);
        this.ok.ycx(this.jw, this, this.ea);
        this.ok.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.ok;
    }

    public View lud() {
        return this.fby;
    }

    public void dj() {
        this.fby = null;
        this.zb = null;
        this.sya = null;
        this.xkz = null;
        this.jw = null;
        lt ltVar = this.ok;
        if (ltVar != null) {
            ltVar.dy();
        }
        this.ycx.set(true);
    }

    public void ycx(rmf rmfVar) {
        if (rmfVar instanceof sya) {
            this.zb = (sya) rmfVar;
        }
    }

    public void ycx(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        tn tnVar;
        if (tTDislikeDialogAbstract != null && (tnVar = this.jw) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(tnVar.pks(), this.jw.hti());
        }
        this.sya = tTDislikeDialogAbstract;
    }

    public void ycx(String str) {
        this.dj = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jc.lt.zb
    public View ycx() {
        FrameLayout frameLayout = this.fby;
        if (frameLayout == null) {
            return null;
        }
        return (View) frameLayout.getParent();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jc.lt.zb
    public void ycx(View view, int i2) {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.syc;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jc.lt.zb
    public void zb() {
        if (this.xkz != null) {
            xkz xkzVar = new xkz();
            xkzVar.zb(true);
            xkzVar.ycx(dc.sya(this.lud, this.lt));
            xkzVar.zb(dc.sya(this.lud, this.ul));
            this.xkz.ycx(this.fby, xkzVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jc.lt.zb
    public void ycx(int i2, int i3) {
        ul ulVar = this.xkz;
        if (ulVar != null) {
            ulVar.ycx(i2, "render fail");
        }
    }

    public void ycx(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.syc = pAGExpressAdWrapperListener;
    }
}
