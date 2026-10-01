package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.RVParams;
import com.bytedance.sdk.component.utils.zb;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity;
import com.bytedance.sdk.openadsdk.common.wie;
import com.bytedance.sdk.openadsdk.core.av;
import com.bytedance.sdk.openadsdk.core.lt.lt;
import com.bytedance.sdk.openadsdk.core.lt.lud;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.core.widget.ycx.lt;
import com.bytedance.sdk.openadsdk.dy.dj;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.oby;
import com.bytedance.sdk.openadsdk.utils.wie;
import com.bytedance.sdk.openadsdk.xkz.ycx.ycx.sya;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class wwx {
    private static short[] IAuthTabCallback;
    private lud dv;
    private final com.bytedance.sdk.component.jw.fby dy;
    private ImageView ea;
    private final Context fby;
    private View htf;
    private lt jc;
    private ImageView jw;
    private final RelativeLayout lt;
    thx lud;
    private ImageView ok;
    private htf oty;
    private final String pmi;
    private ImageView ry;
    private boolean syc;
    private TextView tn;
    private boolean tru;
    private boolean uh;
    private final tn ul;
    private lt.ycx wie;
    private TextView wwx;
    wie ycx;
    TTAdDislikeToast zb;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 156;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent = 279367520;
    private static int onExtraCallbackWithResult = -1538795419;
    private static int onWarmupCompleted = -476590262;
    private static byte[] onExtraCallback = {-98, -49, -62};
    final AtomicBoolean sya = new AtomicBoolean(false);
    final AtomicBoolean dj = new AtomicBoolean(false);
    private boolean thx = false;
    private String hf = "TTTitleNewStyleManager";
    private final String bhi = "is_new_style";
    private final int xkz = dc.zb(pmi.ycx(), 44.0f);

    private static String $$c(short s, short s2, byte b) {
        int i2 = 3 - (s2 * 4);
        byte[] bArr = $$a;
        int i3 = 115 - (b * 3);
        int i4 = s * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = (-i3) + i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i3 = (-bArr[i2]) + i3;
            i6 = i7;
        }
    }

    static /* synthetic */ boolean dj(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        boolean z = wwxVar.thx;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 87;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    static /* synthetic */ String ea(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 101;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        String str = wwxVar.hf;
        int i6 = i3 + 47;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean fby(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 71;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        Object obj = null;
        boolean z = wwxVar.uh;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 23;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ RelativeLayout jc(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        RelativeLayout relativeLayout = wwxVar.lt;
        int i6 = i3 + 61;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return relativeLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ htf jw(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        htf htfVar = wwxVar.oty;
        int i6 = i3 + 99;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return htfVar;
    }

    static /* synthetic */ tn lt(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        tn tnVar = wwxVar.ul;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 119;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 75 / 0;
        }
        return tnVar;
    }

    static /* synthetic */ boolean lud(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        boolean z = wwxVar.tru;
        int i6 = i3 + 61;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    static /* synthetic */ lt.ycx sya(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 79;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        lt.ycx ycxVar = wwxVar.wie;
        int i6 = i4 + 57;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return ycxVar;
    }

    static /* synthetic */ com.bytedance.sdk.openadsdk.core.lt.lt ul(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = asInterface + 119;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        com.bytedance.sdk.openadsdk.core.lt.lt ltVar = wwxVar.jc;
        if (i5 == 0) {
            int i6 = 41 / 0;
        }
        int i7 = i4 + 41;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return ltVar;
    }

    static /* synthetic */ Context ycx(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 59;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Context context = wwxVar.fby;
        int i6 = i3 + 97;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return context;
    }

    static /* synthetic */ htf ycx(wwx wwxVar, htf htfVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        wwxVar.oty = htfVar;
        if (i4 == 0) {
            return htfVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void ycx(wwx wwxVar, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        wwxVar.ycx(i2);
        int i6 = asInterface + 57;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    static /* synthetic */ void ycx(wwx wwxVar, thx thxVar, View view) {
        int i2 = 2 % 2;
        int i3 = asInterface + 9;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        wwxVar.ycx(thxVar, view);
        if (i4 == 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean ycx(wwx wwxVar, boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 61;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        wwxVar.thx = z;
        if (i4 == 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ com.bytedance.sdk.component.jw.fby zb(wwx wwxVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        com.bytedance.sdk.component.jw.fby fbyVar = wwxVar.dy;
        int i6 = i3 + 3;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return fbyVar;
    }

    static /* synthetic */ boolean zb(wwx wwxVar, boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        wwxVar.syc = z;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 23;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wwx(Context context, RelativeLayout relativeLayout, tn tnVar, com.bytedance.sdk.component.jw.fby fbyVar, String str, boolean z) {
        boolean z2 = false;
        this.fby = context;
        this.lt = relativeLayout;
        this.ul = tnVar;
        this.dy = fbyVar;
        this.pmi = str;
        this.uh = z;
        this.lud = new thx(context, this.uh);
        if (str.equals("iab_private_browser") || !(!str.equals("iab_landing_page"))) {
            int i2 = asInterface + 81;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 3;
            } else {
                int i4 = 2 % 2;
            }
            z2 = true;
        } else {
            int i5 = IAuthTabCallbackDefault + 107;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            if (str.equals("iab_history_landing_page")) {
            }
        }
        this.tru = z2;
        ea();
        ok();
        int i7 = IAuthTabCallbackDefault + 21;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
    }

    private void ea() {
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.lt.getLayoutParams();
        layoutParams.height = this.xkz;
        this.lt.setLayoutParams(layoutParams);
        int iZb = dc.zb(this.fby, 8.0f);
        this.lt.setPadding(iZb, 0, iZb, 0);
        this.jw = (ImageView) this.lt.findViewById(wie.wk);
        this.ea = (ImageView) this.lt.findViewById(wie.dfk);
        this.ok = (ImageView) this.lt.findViewById(wie.vyl);
        this.ry = (ImageView) this.lt.findViewById(520093740);
        lud ludVarFindViewById = this.lt.findViewById(wie.zk);
        this.dv = ludVarFindViewById;
        this.wwx = (TextView) ludVarFindViewById.findViewById(wie.ycx);
        this.tn = (TextView) this.dv.findViewById(wie.zb);
        if (syc()) {
            this.wwx.setTextDirection(4);
            this.tn.setTextDirection(4);
            this.wwx.setGravity(8388629);
            this.tn.setGravity(8388629);
            this.ea.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(this.fby, "tt_titlebar_forward"));
            this.ok.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(this.fby, "tt_titlebar_backward"));
        }
        if (!(!this.tru)) {
            int i5 = asInterface + 11;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            this.jc = this.lt.findViewById(wie.qn);
        } else {
            this.jc = this.lt.findViewById(wie.ufy);
        }
        this.ok.setVisibility(0);
        this.ea.setVisibility(0);
        this.jw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.wwx.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (wwx.ycx(wwx.this) instanceof Activity) {
                    ((Activity) wwx.ycx(wwx.this)).finish();
                }
            }
        });
        this.ea.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.wwx.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (wwx.zb(wwx.this) == null || !wwx.zb(wwx.this).jw()) {
                    return;
                }
                if (wwx.sya(wwx.this) != null) {
                    wwx.sya(wwx.this).ycx();
                }
                wwx.zb(wwx.this).jc();
            }
        });
        this.ok.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.wwx.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (wwx.zb(wwx.this) == null || !wwx.zb(wwx.this).ea()) {
                    return;
                }
                wwx.zb(wwx.this).ok();
            }
        });
        this.ry.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.wwx.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                wwx wwxVar = wwx.this;
                wwx.ycx(wwxVar, wwxVar.lud, view);
            }
        });
        ycx(true);
        this.ea.setClickable(false);
        this.ok.setClickable(false);
        ImageView imageView = this.ea;
        int color = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView.setColorFilter(color, mode);
        this.ok.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
        this.htf = this.lt;
        if (!this.uh) {
            this.jw.setContentDescription(com.bytedance.sdk.component.utils.wwx.ycx(this.fby, "landingpage_default_close"));
            this.ea.setContentDescription(com.bytedance.sdk.component.utils.wwx.ycx(this.fby, "landingpage_default_return"));
            return;
        }
        int i7 = IAuthTabCallbackDefault + 51;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            this.jw.setContentDescription(com.bytedance.sdk.component.utils.wwx.ycx(this.fby, "privacy_default_close"));
            this.ea.setContentDescription(com.bytedance.sdk.component.utils.wwx.ycx(this.fby, "privacy_default_return"));
        } else {
            this.jw.setContentDescription(com.bytedance.sdk.component.utils.wwx.ycx(this.fby, "privacy_default_close"));
            this.ea.setContentDescription(com.bytedance.sdk.component.utils.wwx.ycx(this.fby, "privacy_default_return"));
            throw null;
        }
    }

    private void ok() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 25;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            View view = this.htf;
            if (view == null) {
                return;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.wwx.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (wwx.dj(wwx.this)) {
                        wwx.this.zb();
                        wwx.ycx(wwx.this, false);
                    }
                }
            });
            int i4 = IAuthTabCallbackDefault + 61;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bundle ycx() throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asInterface + 101;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (this.dy == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            WebView webView = this.dy.getWebView();
            if (webView == null) {
                return null;
            }
            bundle.putString("mainTitle", ul());
            bundle.putString(RVParams.LONG_SUB_TITLE, fby());
            RelativeLayout relativeLayout = this.lt;
            if (relativeLayout != null) {
                int i4 = asInterface + 93;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                if (relativeLayout.getVisibility() == 0) {
                    int i6 = asInterface + 107;
                    IAuthTabCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                } else {
                    z = false;
                }
            }
            bundle.putBoolean("titleBarVisible", z);
            Object[] objArr = new Object[1];
            a((short) (51 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1260316823 - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.myTid() >> 22) - 1204819661, (-110) - View.combineMeasuredStates(0, 0), objArr);
            bundle.putString(((String) objArr[0]).intern(), webView.getUrl());
            webView.saveState(bundle);
            return bundle;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[PHI: r4
      0x008a: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v20 byte[]) binds: [B:20:0x0088, B:17:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        byte[] bArr;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43424), (ViewConfiguration.getEdgeSlop() >> 16) + 42, 22438 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $11 + 31;
                $10 = i7 % 128;
                long j = 0;
                if (i7 % 2 != 0) {
                    bArr = onExtraCallback;
                    int i8 = 35 / 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    char threadPriority = (char) (12843 - ((Process.getThreadPriority(0) + 20) >> 6));
                                    int defaultSize = 55 - View.getDefaultSize(0, 0);
                                    int packedPositionChild = ExpandableListView.getPackedPositionChild(j) + 2168;
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, defaultSize, packedPositionChild, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i9++;
                                int i10 = $11 + 97;
                                $10 = i10 % 128;
                                int i11 = i10 % 2;
                                j = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        int i12 = $11 + 87;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        byte[] bArr3 = onExtraCallback;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43423), 42 - TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0') + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (IAuthTabCallback[i2 + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = onExtraCallback;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            }
            if (iIntValue > 0) {
                int i14 = $10 + 53;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i2 + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L))) + i6;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) "", '0') + 87, (ViewConfiguration.getTapTimeout() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallback;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i16 = 0; i16 < length2; i16++) {
                            int i17 = $11 + 119;
                            $10 = i17 % 128;
                            if (i17 % 2 != 0) {
                                bArr5[i16] = (byte) (bArr4[i16] / (-4629411779493505016L));
                            } else {
                                bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                            }
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private void ycx(final thx thxVar, View view) {
        int i2 = 2 % 2;
        thxVar.setOnMenuItemClickListener(new thx$ycx() { // from class: com.bytedance.sdk.openadsdk.common.wwx.9
            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void ycx() {
                if (wwx.lud(wwx.this)) {
                    if (wwx.lt(wwx.this) != null) {
                        sya.ycx().ycx(wwx.lt(wwx.this));
                    }
                    if (wwx.ycx(wwx.this) instanceof Activity) {
                        Intent intent = new Intent(wwx.ycx(wwx.this), (Class<?>) TTHistoryActivity.class);
                        intent.putExtra("meta_index", av.ycx().ycx(wwx.lt(wwx.this)));
                        intent.putExtra("is_new_style", wwx.lud(wwx.this));
                        zb.ycx(wwx.ycx(wwx.this), intent, (zb.zb) null);
                    }
                    wwx.this.dj("onSelectHistory");
                    thxVar.ycx();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void zb() {
                com.bytedance.sdk.component.jw.fby fbyVarZb;
                if (!wwx.lud(wwx.this) || (fbyVarZb = wwx.zb(wwx.this)) == null || fbyVarZb.getUrl() == null) {
                    return;
                }
                if (wwx.ul(wwx.this) != null) {
                    wwx.ul(wwx.this).setVisibility(0);
                    wwx.ul(wwx.this).setProgress(0);
                }
                fbyVarZb.fby();
                String url = fbyVarZb.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    fbyVarZb.a_(url);
                }
                wwx.this.dj("onSelectRetry");
                thxVar.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void sya() {
                ClipboardManager clipboardManager;
                if (wwx.lud(wwx.this)) {
                    String url = wwx.zb(wwx.this).getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) wwx.ycx(wwx.this).getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                    wwx.this.dj("onSelectCopyLink");
                    thxVar.ycx();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void dj() {
                com.bytedance.sdk.component.jw.fby fbyVarZb;
                if (!wwx.lud(wwx.this) || (fbyVarZb = wwx.zb(wwx.this)) == null) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                String url = fbyVarZb.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    intent.setData(Uri.parse(url));
                    zb.ycx(wwx.ycx(wwx.this), intent, (zb.zb) null);
                }
                wwx.this.dj("onSelectOpenInBrowser");
                thxVar.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void lud() {
                if (!wwx.fby(wwx.this)) {
                    wwx.this.jc();
                } else if (wwx.lud(wwx.this)) {
                    if (wwx.jw(wwx.this) == null) {
                        wwx.ycx(wwx.this, new htf(wwx.ycx(wwx.this)));
                        wwx.jw(wwx.this).ycx(wwx.lt(wwx.this));
                        wwx.jw(wwx.this).setCanceledOnTouchOutside(false);
                    }
                    wwx.jw(wwx.this).show();
                }
                wwx.this.dj("onSelectReport");
                thxVar.ycx();
            }

            @Override // com.bytedance.sdk.openadsdk.common.thx$ycx
            public void lt() {
                if (wwx.fby(wwx.this) || !com.bytedance.sdk.openadsdk.utils.zb.lud()) {
                    return;
                }
                IABLandingPageActivity.ycx(wwx.ycx(wwx.this), wwx.lt(wwx.this), oby.ycx(wwx.lt(wwx.this)));
                wwx.this.dj("onSelectPrivacy");
                thxVar.ycx();
            }
        });
        thxVar.ycx(view);
        int i3 = IAuthTabCallbackDefault + 83;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
    }

    public void ycx(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (this.wwx != null) {
            int i6 = i3 + 75;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 31 / 0;
                if (this.tn == null) {
                    return;
                }
            } else if (this.tn == null) {
                return;
            }
            String string = lt().getText().toString();
            String strReplaceAll = " ";
            Object obj = null;
            if (!TextUtils.isEmpty(string)) {
                int i8 = IAuthTabCallbackDefault + 113;
                asInterface = i8 % 128;
                if (i8 % 2 != 0) {
                    string.replaceAll("[\n\r]+", " ");
                    obj.hashCode();
                    throw null;
                }
                strReplaceAll = string.replaceAll("[\n\r]+", " ");
            }
            String string2 = jw().getText().toString();
            this.wwx.setText(strReplaceAll);
            this.tn.setText(string2);
            if (z) {
                this.wwx.setVisibility(0);
                lud ludVar = this.dv;
                if (ludVar != null) {
                    ViewGroup.LayoutParams layoutParams = ludVar.getLayoutParams();
                    layoutParams.width = -2;
                    this.dv.setLayoutParams(layoutParams);
                    int i9 = IAuthTabCallbackDefault + 9;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.lt.getLayoutParams();
                layoutParams2.height = this.xkz;
                this.lt.setLayoutParams(layoutParams2);
                return;
            }
            this.wwx.setVisibility(8);
            lud ludVar2 = this.dv;
            if (ludVar2 != null) {
                int i11 = asInterface + 57;
                IAuthTabCallbackDefault = i11 % 128;
                if (i11 % 2 == 0) {
                    ViewGroup.LayoutParams layoutParams3 = ludVar2.getLayoutParams();
                    layoutParams3.width = -1;
                    this.dv.setLayoutParams(layoutParams3);
                    obj.hashCode();
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams4 = ludVar2.getLayoutParams();
                layoutParams4.width = -1;
                this.dv.setLayoutParams(layoutParams4);
            }
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.lt.getLayoutParams();
            layoutParams5.height = this.xkz / 2;
            this.lt.setLayoutParams(layoutParams5);
        }
    }

    public void zb() {
        int i2;
        int i3 = 2 % 2;
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.lt.getLayoutParams();
            final com.bytedance.sdk.component.jw.fby fbyVar = this.dy;
            if (!this.syc) {
                int i4 = asInterface + 53;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = layoutParams.height;
                    i2 = this.xkz;
                    if (i5 != i2 % 4) {
                        return;
                    }
                } else {
                    int i6 = layoutParams.height;
                    i2 = this.xkz;
                    if (i6 != i2 / 2) {
                        return;
                    }
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2 / 2, i2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.wwx.10
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        View view;
                        try {
                            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            layoutParams.height = iIntValue;
                            wwx.jc(wwx.this).setLayoutParams(layoutParams);
                            if (wwx.lud(wwx.this) && (view = fbyVar) != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                marginLayoutParams.topMargin = iIntValue;
                                fbyVar.setLayoutParams(marginLayoutParams);
                            }
                            wwx.jc(wwx.this).requestLayout();
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9oZnBewbOmFXeRJlR2lBVrgLJIGri2Q", "VOAMmwqxaNOJRdlonBWhPF4=", 394);
                            wwx.ea(wwx.this);
                        }
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.wwx.11
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NonNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@NonNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NonNull Animator animator) {
                        wwx.zb(wwx.this, true);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NonNull Animator animator) {
                        wwx.zb(wwx.this, false);
                        wwx.ycx(wwx.this, 0);
                        wwx.this.ycx(true);
                        wwx.ycx(wwx.this, false);
                    }
                });
                valueAnimatorOfInt.start();
                int i7 = asInterface + 5;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 9 / 0;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9oZnBewbOmFXeRJlR2lBVrgLJIGrg==", "SOYigje1fcuFaNZP", 424);
        }
    }

    public void sya() {
        final RelativeLayout.LayoutParams layoutParams;
        final com.bytedance.sdk.component.jw.fby fbyVar;
        int i2 = 2 % 2;
        int i3 = asInterface + 65;
        IAuthTabCallbackDefault = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                layoutParams = (RelativeLayout.LayoutParams) this.lt.getLayoutParams();
                fbyVar = this.dy;
                int i4 = 13 / 0;
                if (this.syc) {
                    return;
                }
            } else {
                layoutParams = (RelativeLayout.LayoutParams) this.lt.getLayoutParams();
                fbyVar = this.dy;
                if (this.syc) {
                    return;
                }
            }
            int i5 = layoutParams.height;
            int i6 = this.xkz;
            if (i5 == i6) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i6, i6 / 2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.wwx.12
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View view;
                        try {
                            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            layoutParams.height = iIntValue;
                            wwx.jc(wwx.this).setLayoutParams(layoutParams);
                            if (wwx.lud(wwx.this) && (view = fbyVar) != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                marginLayoutParams.topMargin = iIntValue;
                                fbyVar.setLayoutParams(marginLayoutParams);
                            }
                            wwx.jc(wwx.this).requestLayout();
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9oZnBewbOmFXeRJlR2lBVrgLJIGri2e", "VOAMmwqxaNOJRdlonBWhPF4=", 449);
                            wwx.ea(wwx.this);
                        }
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.wwx.2
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        wwx.zb(wwx.this, true);
                        wwx.ycx(wwx.this, 8);
                        wwx.this.ycx(false);
                        wwx.ycx(wwx.this, true);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        wwx.zb(wwx.this, false);
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9oZnBewbOmFXeRJlR2lBVrgLJIGrg==", "U+cpkQayXc6URtJ/jQM=", 479);
            int i7 = asInterface + 27;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public com.bytedance.sdk.openadsdk.core.lt.lt dj() {
        int i2 = 2 % 2;
        int i3 = asInterface + 27;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        com.bytedance.sdk.openadsdk.core.lt.lt ltVar = this.jc;
        if (i4 == 0) {
            int i5 = 29 / 0;
        }
        return ltVar;
    }

    public ImageView lud() {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        ImageView imageView = this.jw;
        int i6 = i4 + 125;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return imageView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TextView lt() {
        int i2 = 2 % 2;
        int i3 = asInterface + 41;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = this.wwx;
        if (i4 == 0) {
            int i5 = 60 / 0;
        }
        return textView;
    }

    public void ycx(String str) {
        int i2 = 2 % 2;
        int i3 = asInterface + 47;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.wwx.setText(str);
        if (i4 == 0) {
            throw null;
        }
    }

    public String ul() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 69;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String string = this.wwx.getText().toString();
        int i5 = IAuthTabCallbackDefault + 125;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public String fby() {
        int i2 = 2 % 2;
        int i3 = asInterface + 73;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String string = this.tn.getText().toString();
        int i5 = asInterface + 45;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return string;
    }

    public void zb(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 39;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            String strSya = sya(str);
            TextView textView = this.tn;
            if (!TextUtils.isEmpty(strSya)) {
                int i4 = IAuthTabCallbackDefault;
                int i5 = i4 + 25;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 111;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 % 3;
                }
                str = strSya;
            }
            textView.setText(str);
            return;
        }
        TextUtils.isEmpty(sya(str));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TextView jw() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 101;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        TextView textView = this.tn;
        int i6 = i4 + 59;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return textView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void ycx(int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 7;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ImageView imageView = this.jw;
        if (imageView != null) {
            imageView.setVisibility(i2);
        }
        ImageView imageView2 = this.ea;
        if (imageView2 != null) {
            int i5 = asInterface + 5;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            imageView2.setVisibility(i2);
        }
        ImageView imageView3 = this.ok;
        if (imageView3 != null) {
            int i7 = IAuthTabCallbackDefault + 39;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            imageView3.setVisibility(i2);
        }
        ImageView imageView4 = this.ry;
        if (imageView4 != null) {
            int i9 = asInterface + 59;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            imageView4.setVisibility(i2);
            if (i10 == 0) {
                int i11 = 92 / 0;
            }
        }
    }

    public void ycx(WebView webView, lt.ycx ycxVar) {
        ImageView imageView;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 63;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            this.wie = ycxVar;
            throw null;
        }
        this.wie = ycxVar;
        try {
            if (this.ea != null) {
                if (webView.canGoBack()) {
                    int i4 = asInterface + 63;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.ea.setClickable(false);
                        imageView = this.ea;
                    } else {
                        this.ea.setClickable(true);
                        imageView = this.ea;
                    }
                    imageView.clearColorFilter();
                } else {
                    this.ea.setClickable(false);
                    this.ea.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                    int i5 = asInterface + 79;
                    IAuthTabCallbackDefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 4 / 3;
                    }
                }
            }
            if (this.ok != null) {
                int i7 = asInterface + 29;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    webView.canGoForward();
                    throw null;
                }
                if (webView.canGoForward()) {
                    this.ok.setClickable(true);
                    this.ok.clearColorFilter();
                    return;
                }
                this.ok.setClickable(false);
                this.ok.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                int i8 = asInterface + 17;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9oZnBewbOmFXeRJlR2lBVrgLJIGrg==", "WOYolgibZuWBSdx8ghWGJ0n5LIcH", 536);
        }
    }

    protected void jc() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.dj.get())) {
            int i5 = asInterface + 49;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                xkz();
                return;
            } else {
                xkz();
                int i6 = 33 / 0;
                return;
            }
        }
        if (this.ycx == null) {
            ry();
        }
        wie wieVar = this.ycx;
        if (wieVar != null) {
            int i7 = IAuthTabCallbackDefault + 83;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            wieVar.ycx();
            if (i8 != 0) {
                throw null;
            }
        }
    }

    private void ry() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 37;
        asInterface = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                if (this.ycx == null) {
                    wie wieVar = new wie(this.fby, this.ul);
                    this.ycx = wieVar;
                    wieVar.setDislikeSource("landing_page");
                    this.ycx.setCallback(new wie.ycx() { // from class: com.bytedance.sdk.openadsdk.common.wwx.3
                        public void ycx(View view) {
                            wwx.this.sya.set(true);
                        }

                        public void zb(View view) {
                            wwx.this.sya.set(false);
                        }

                        public void ycx(FilterWord filterWord) {
                            if (wwx.this.dj.get() || filterWord == null || filterWord.hasSecondOptions()) {
                                return;
                            }
                            wwx.this.dj.set(true);
                        }
                    });
                }
                FrameLayout frameLayout = (FrameLayout) this.lt.getRootView().findViewById(R.id.content);
                frameLayout.addView(this.ycx);
                if (this.zb == null) {
                    TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.fby);
                    this.zb = tTAdDislikeToast;
                    frameLayout.addView(tTAdDislikeToast);
                }
                int i4 = IAuthTabCallbackDefault + 107;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9oZnBewbOmFXeRJlR2lBVrgLJIGrg==", "UuAkgSe1esuJQdI=", 595);
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private void xkz() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.zb.show(TTAdDislikeToast.getDislikeTip());
        int i5 = asInterface + 31;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String sya(String str) {
        int i2 = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                if (!host.startsWith("www.")) {
                    return host;
                }
                int i3 = IAuthTabCallbackDefault + 75;
                asInterface = i3 % 128;
                return i3 % 2 != 0 ? host.substring(3) : host.substring(4);
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9oZnBewbOmFXeRJlR2lBVrgLJIGrg==", "XOs5sQyxaM6O", 618);
            int i4 = asInterface + 37;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 3;
            }
        }
        return "";
    }

    private boolean syc() {
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.fby.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        int i5 = IAuthTabCallbackDefault + 103;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public void dj(final String str) {
        int i2 = 2 % 2;
        dj.ycx("iab_more_options", false, new com.bytedance.sdk.openadsdk.dy.zb() { // from class: com.bytedance.sdk.openadsdk.common.wwx.4
            public com.bytedance.sdk.openadsdk.dy.ycx.sya ycx() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                return com.bytedance.sdk.openadsdk.dy.ycx.dj.zb().ycx("iab_more_options").zb(jSONObject.toString());
            }
        });
        int i3 = asInterface + 39;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }
}
