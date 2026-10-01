package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.utils.wwx;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.ycx.uh;
import com.bytedance.sdk.openadsdk.core.av;
import com.bytedance.sdk.openadsdk.core.lt.dj;
import com.bytedance.sdk.openadsdk.core.lt.lud;
import com.bytedance.sdk.openadsdk.core.lt.sya;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.core.syc;
import com.bytedance.sdk.openadsdk.core.widget.zb;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.wie;
import com.bytedance.sdk.openadsdk.utils.yzp;
import com.bytedance.sdk.openadsdk.xkz.ycx.ycx;
import com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$sya;
import com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$ycx;
import com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$zb;
import com.bytedance.sdk.openadsdk.xkz.ycx.zb;
import com.bytedance.sdk.openadsdk.xkz.ycx.zb.ycx;
import com.bytedance.sdk.openadsdk.xkz.ycx.zb.zb;
import java.util.ArrayList;
import java.util.List;
import o.ExposedDropdownMenuKtExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TTHistoryActivity extends TTBaseActivity {
    private dj dj;
    private lud ea;
    private String fby;
    private zb jc;
    private String lt;
    private String lud;
    private FrameLayout ok;
    private com.bytedance.sdk.openadsdk.xkz.ycx.zb ry;
    private dj sya;
    private boolean syc;
    private String ul;
    private tn xkz;
    private sya zb;
    private ArrayList<ycx> jw = new ArrayList<>();
    private final String dy = "is_new_style";
    int ycx = -1;

    protected boolean a_() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!syc.lud()) {
            finish();
            return;
        }
        try {
            pmi.zb(this);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZa9RJhQepPEI=", "VOAOhwa9fcI=", 95);
        }
        try {
            setContentView(zb());
            Intent intent = getIntent();
            this.syc = intent.getBooleanExtra("is_new_style", false);
            this.xkz = av.ycx().ycx(av.ycx(intent));
            if (bundle != null) {
                try {
                    int i2 = bundle.getInt("meta_index", -1);
                    this.ycx = i2;
                    if (i2 >= 0) {
                        this.xkz = av.ycx().ycx(this.ycx);
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZa9RJhQepPEI=", "VOAOhwa9fcI=", 113);
                }
            }
            uh.zb(this, 3);
            this.sya = this.zb.findViewById(wie.sg);
            this.dj = this.zb.findViewById(520093720);
            this.jc.findViewById(wie.aq);
            this.sya.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryActivity.this.ycx(view);
                }
            });
            this.dj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryActivity.this.finish();
                }
            });
            com.bytedance.sdk.openadsdk.xkz.ycx.zb zbVar = this.ry;
            if (zbVar != null) {
                zbVar.ycx(new zb.InterfaceC0028zb() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.3
                    @Override // com.bytedance.sdk.openadsdk.xkz.ycx.zb.InterfaceC0028zb
                    public void ycx(ycx ycxVar) {
                        if (TTHistoryActivity.this.syc) {
                            TTHistoryActivity.this.ycx(ycxVar.ul(), ycxVar.lud(), ycxVar.zb());
                        } else {
                            TTHistoryLandingPageActivity.ycx(TTHistoryActivity.this, ycxVar.ul(), ycxVar.lud(), ycxVar.zb());
                        }
                        TTHistoryActivity.this.finish();
                    }
                });
            }
            sya();
            lud();
        } catch (Throwable th3) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZa9RJhQepPEI=", "VOAOhwa9fcI=", 99);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx(String str, final String str2, final int i2) {
        if (TextUtils.isEmpty(str) || i2 < 0) {
            finish();
        } else {
            com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.ycx().ycx(str, new sya$sya() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4
                @Override // com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$sya
                public void ycx(final String str3) {
                    yzp.ycx(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            int i3;
                            List listZb = com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.zb(str3);
                            tn tnVar = (listZb == null || (i3 = i2) < 0 || i3 >= listZb.size()) ? null : (tn) listZb.get(i2);
                            if (tnVar == null) {
                                TTHistoryActivity.this.finish();
                            } else {
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                IABLandingPageActivity.zb(TTHistoryActivity.this, tnVar, str2);
                            }
                        }
                    });
                }

                @Override // com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$sya
                public void zb(String str3) {
                    yzp.ycx(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TTHistoryActivity.this.finish();
                        }
                    });
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View, com.bytedance.sdk.openadsdk.xkz.ycx.zb.zb] */
    private View zb() {
        sya syaVar = new sya(this);
        if (Build.VERSION.SDK_INT >= 35) {
            syaVar.setFitsSystemWindows(true);
        }
        lud ludVar = new lud(this);
        this.ea = ludVar;
        ludVar.setOrientation(1);
        syaVar.addView(this.ea, new FrameLayout.LayoutParams(-1, -1));
        this.ea.setId(wie.ur);
        this.ea.setPadding(0, dc.zb(this, 12.0f), 0, 0);
        this.zb = new com.bytedance.sdk.openadsdk.common.uh(this);
        this.ea.addView(this.zb, new LinearLayout.LayoutParams(-1, dc.zb(this, 44.0f)));
        FrameLayout frameLayout = new FrameLayout(this);
        this.ok = frameLayout;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View recyclerView = new RecyclerView(this);
        recyclerView.setId(wie.wr);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        com.bytedance.sdk.openadsdk.xkz.ycx.zb zbVar = new com.bytedance.sdk.openadsdk.xkz.ycx.zb(this);
        this.ry = zbVar;
        recyclerView.setAdapter(zbVar);
        recyclerView.addItemDecoration(new ExposedDropdownMenuKtExternalSyntheticLambda2(this, 1));
        this.ok.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        ?? zbVar2 = new com.bytedance.sdk.openadsdk.xkz.ycx.zb.zb(this);
        this.jc = zbVar2;
        zbVar2.setId(wie.aq);
        this.ok.addView((View) this.jc, new FrameLayout.LayoutParams(-1, -1));
        this.ea.addView(this.ok);
        return syaVar;
    }

    private void sya() {
        com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.ycx().ycx(new sya$zb() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.5
            @Override // com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$zb
            public void ycx(List<ycx> list) {
                if (list != null) {
                    TTHistoryActivity.this.jw.addAll(list);
                    TTHistoryActivity.this.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TTHistoryActivity.this.lud();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lud() {
        if (!this.jw.isEmpty()) {
            this.sya.setVisibility(0);
            this.ok.setVisibility(0);
            sya syaVar = this.jc;
            if (syaVar != null) {
                syaVar.setVisibility(8);
            }
        } else {
            com.bytedance.sdk.openadsdk.xkz.ycx.zb.zb zbVar = this.jc;
            if (zbVar != null) {
                zbVar.ycx();
                this.jc.setVisibility(0);
            }
            this.sya.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.xkz.ycx.zb zbVar2 = this.ry;
        if (zbVar2 != null) {
            zbVar2.ycx(this.jw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void ycx(View view) {
        final com.bytedance.sdk.openadsdk.xkz.ycx.zb.ycx ycxVar = new com.bytedance.sdk.openadsdk.xkz.ycx.zb.ycx(this);
        ycxVar.setOnMenuItemClickListener(new ycx.InterfaceC0027ycx() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.6
            @Override // com.bytedance.sdk.openadsdk.xkz.ycx.zb.ycx.InterfaceC0027ycx
            public void ycx() {
                TTHistoryActivity.this.lt();
                ycxVar.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.xkz.ycx.zb.ycx.InterfaceC0027ycx
            public void zb() {
                ycxVar.ycx();
            }
        });
        ycxVar.ycx(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void lt() {
        com.bytedance.sdk.openadsdk.core.widget.zb zbVar = new com.bytedance.sdk.openadsdk.core.widget.zb(this);
        try {
            this.lud = getString(wwx.zb(this, "tt_history_confirm_maintitle"));
            this.lt = getString(wwx.zb(this, "tt_history_confirm_subtitle"));
            this.ul = getString(wwx.zb(this, "tt_history_cancel"));
            this.fby = getString(wwx.zb(this, "tt_history_delete"));
            zbVar.zb(this.lud).ycx(this.lt).sya(this.fby).dj(this.ul);
            zbVar.ycx(new AnonymousClass7(zbVar)).show();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZa9RJhQepPEI=", "SOYigie5ZcKUT/NUjR2vLw==", 374);
            th.getMessage();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity$7, reason: invalid class name */
    class AnonymousClass7 implements zb.InterfaceC0025zb {
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.widget.zb ycx;

        AnonymousClass7(com.bytedance.sdk.openadsdk.core.widget.zb zbVar) {
            this.ycx = zbVar;
        }

        @Override // com.bytedance.sdk.openadsdk.core.widget.zb.InterfaceC0025zb
        public void ycx() {
            try {
                com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.ycx().ycx(new sya$ycx() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.7.1
                    @Override // com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$ycx
                    public void ycx() {
                        TTHistoryActivity.this.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.7.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TTHistoryActivity.this.jw.clear();
                                if (!com.bytedance.sdk.openadsdk.dv.lud.ycx("lp_iab_cookie", true)) {
                                    TTBaseActivity tTBaseActivity = TTHistoryActivity.this;
                                    Toast.makeText((Context) tTBaseActivity, (CharSequence) tTBaseActivity.getString(wwx.zb(tTBaseActivity, "tt_history_delete_successful")), 0).show();
                                } else {
                                    View tTAdDislikeToast = new TTAdDislikeToast(TTHistoryActivity.this);
                                    ((FrameLayout) TTHistoryActivity.this.findViewById(R.id.content)).addView(tTAdDislikeToast);
                                    TTBaseActivity tTBaseActivity2 = TTHistoryActivity.this;
                                    tTAdDislikeToast.show(tTBaseActivity2.getString(wwx.zb(tTBaseActivity2, "tt_history_delete_successful")));
                                }
                                TTHistoryActivity.this.lud();
                            }
                        });
                        TTHistoryActivity.this.xkz = com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya.ycx().sya();
                        if (TTHistoryActivity.this.xkz != null) {
                            com.bytedance.sdk.openadsdk.dj.sya.ycx(System.currentTimeMillis(), TTHistoryActivity.this.xkz, "landingpage", "iab_clear_history_all");
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya$ycx
                    public void ycx(Exception exc) {
                        exc.getMessage();
                    }
                });
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZa9RJhQepPEKqeg==", "VOAdmhC1fc6WT/RRhRKr", 360);
                e.getMessage();
            }
            this.ycx.dismiss();
        }

        @Override // com.bytedance.sdk.openadsdk.core.widget.zb.InterfaceC0025zb
        public void zb() {
            this.ycx.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iYcx = this.xkz != null ? av.ycx().ycx(this.xkz) : -1;
            this.ycx = iYcx;
            bundle.putInt("meta_index", iYcx);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oFnBCoZtWZa9RJhQepPEI=", "VOAelBW5QMmTXtZTjxSTPFr6KA==", 388);
        }
        super/*android.app.Activity*/.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onStart() {
        super/*android.app.Activity*/.onStart();
        if (this.ycx >= 0) {
            av.ycx().sya(this.ycx);
            this.ycx = -1;
        }
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
