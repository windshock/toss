package com.bytedance.sdk.openadsdk.sya;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.wwx;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.oty.sya;
import com.bytedance.sdk.openadsdk.utils.dc;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends TTDislikeDialogAbstract {
    private ycx dj;

    public interface ycx {
        void ycx();

        void ycx(int i2, FilterWord filterWord);

        void zb();
    }

    public dj(Context context, String str, List<FilterWord> list) {
        super(context, wwx.lt(context, "tt_dislikeDialog"));
        ((TTDislikeDialogAbstract) this).ycx = str;
        ((TTDislikeDialogAbstract) this).zb = list;
    }

    public void ycx(ycx ycxVar) {
        this.dj = ycxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            ycx();
            zb();
            setMaterialMeta(((TTDislikeDialogAbstract) this).ycx, ((TTDislikeDialogAbstract) this).zb);
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4gYsyRS5Sg=", "b9oJnBCwYMyFbt5cgB6nDF7oLIAPqA==", "VOAOhwa9fcI=", 47);
            dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getLayoutView() {
        return new jw(getContext(), ((TTDislikeDialogAbstract) this).sya, ((TTDislikeDialogAbstract) this).zb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(dc.dj(getContext()) - 120, -2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ycx(int i2) {
        FilterWord filterWordZb;
        if (jc.sya == i2) {
            dismiss();
            return;
        }
        if (jc.lud == i2) {
            ycx ycxVar = this.dj;
            if (ycxVar != null) {
                ycxVar.ycx();
                return;
            }
            return;
        }
        if (jc.zb != i2 || (filterWordZb = ((TTDislikeDialogAbstract) this).sya.zb()) == null || jc.ycx.equals(filterWordZb)) {
            return;
        }
        ycx ycxVar2 = this.dj;
        if (ycxVar2 != null) {
            try {
                ycxVar2.ycx(0, filterWordZb);
            } catch (Throwable th) {
                sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4gYsyRS5Sg=", "b9oJnBCwYMyFbt5cgB6nDF7oLIAPqA==", "VOAEmxe5e8aDXt5LiQ==", 90);
            }
        }
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        try {
            super/*android.app.Dialog*/.show();
        } catch (WindowManager.BadTokenException e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4gYsyRS5Sg=", "b9oJnBCwYMyFbt5cgB6nDF7oLIAPqA==", "SOYigg==", 101);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ycx() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zb() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.sya.dj.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (dj.this.dj != null) {
                    ycx unused = dj.this.dj;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.sya.dj.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (dj.this.dj != null) {
                    dj.this.dj.zb();
                }
            }
        });
    }
}
