package com.tnkfactory.ad.basic;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdListDetailViewDialog extends Dialog {
    public final AdListVo a;
    public final FragmentActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdListDetailViewDialog(@NotNull Context context, @NotNull AdListVo adListVo) {
        super(context, R.style.tnk_full_screen_dialog);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(adListVo, "");
        this.a = adListVo;
        this.b = (FragmentActivity) context;
    }

    public static final Unit a(AdListDetailViewDialog adListDetailViewDialog) {
        adListDetailViewDialog.dismiss();
        return Unit.INSTANCE;
    }

    public final FragmentActivity getMActivity() {
        return this.b;
    }

    public final AdListVo getMAdItem() {
        return this.a;
    }

    public final void logAnalytics(@Nullable Bundle bundle) {
        if ((bundle != null ? bundle.getLong("detail_view_show", this.a.getAppId()) : 0L) == 0) {
            if (bundle != null) {
                bundle.putLong("detail_view_show", this.a.getAppId());
            }
            TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
            HashMap<String, String> map = new HashMap<>();
            map.put("item_id", String.valueOf(this.a.getAppId()));
            map.put("item_name", this.a.getApp_nm());
            map.put("item_data", AdListVoKt.toJson(this.a));
            Unit unit = Unit.INSTANCE;
            tnkAdAnalytics.logEvent("detail_view_show", map);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        logAnalytics(bundle);
        setContentView((View) new AdListDetailView(this.b, this.a, TnkAdConfig.INSTANCE.getLayoutConfig().getAdDetailLayout(), new Function0() { // from class: com.tnkfactory.ad.basic.AdListDetailViewDialog$$ExternalSyntheticLambda0
            public final Object invoke() {
                return AdListDetailViewDialog.a(this.f$0);
            }
        }));
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tnkfactory.ad.basic.AdListDetailViewDialog$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AdListDetailViewDialog.a(this.f$0, dialogInterface);
            }
        });
    }

    public static final void a(AdListDetailViewDialog adListDetailViewDialog, DialogInterface dialogInterface) {
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", String.valueOf(adListDetailViewDialog.a.getAppId()));
        map.put("item_name", adListDetailViewDialog.a.getTitle());
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("ad_detail_close", map);
    }
}
