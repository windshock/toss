package com.tnkfactory.ad.basic;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkImageLoader;
import java.util.Calendar;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdListEventDialog extends DialogFragment {
    public static final Companion Companion = new Companion(null);
    public ConstraintLayout a;
    public Function0 b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AdListEventDialog newInstance(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Bundle bundle = new Bundle();
            bundle.putString("imgUrl", str);
            bundle.putString("eclck_url", str2);
            AdListEventDialog adListEventDialog = new AdListEventDialog();
            adListEventDialog.setArguments(bundle);
            return adListEventDialog;
        }
    }

    public static final void b(AdListEventDialog adListEventDialog, View view) {
        TextView textViewA = adListEventDialog.a();
        if (textViewA != null) {
            Intrinsics.checkNotNull(adListEventDialog.a());
            textViewA.setSelected(!r0.isSelected());
        }
        int i2 = Calendar.getInstance().get(6);
        TextView textViewA2 = adListEventDialog.a();
        Intrinsics.checkNotNull(textViewA2);
        if (textViewA2.isSelected()) {
            Settings settings = Settings.INSTANCE;
            Context contextRequireContext = adListEventDialog.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            settings.setEventDisableTime(contextRequireContext, i2);
            return;
        }
        Settings settings2 = Settings.INSTANCE;
        Context contextRequireContext2 = adListEventDialog.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        settings2.setEventDisableTime(contextRequireContext2, 999);
    }

    public static final void c(AdListEventDialog adListEventDialog, View view) {
        String string;
        PackageManager packageManager = adListEventDialog.requireActivity().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        Bundle arguments = adListEventDialog.getArguments();
        if (arguments == null || (string = arguments.getString("eclck_url", "")) == null) {
            string = "";
        }
        intent.setData(Uri.parse(string));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        if (listQueryIntentActivities.size() > 0) {
            adListEventDialog.startActivity(intent);
        }
    }

    public final TextView a() {
        View view = this.a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_interstitial_disable_today);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    public final Function0<Unit> getOnDismissCallback() {
        return this.b;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.tnk_full_screen_dialog);
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(R.layout.com_tnk_offerwall_event_interstitial, viewGroup);
        Intrinsics.checkNotNull(constraintLayoutInflate, "");
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        this.a = constraintLayout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0 function0 = this.b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(view, "");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        View view2 = this.a;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        View viewFindViewById = view2.findViewById(R.id.com_tnk_off_interstitial_tv_close);
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListEventDialog$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AdListEventDialog.a(this.f$0, view3);
                }
            });
        }
        TextView textViewA = a();
        if (textViewA != null) {
            textViewA.setSelected(false);
        }
        View view3 = this.a;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(R.id.com_tnk_off_interstitial_disable_today_touch);
        if (viewFindViewById2 == null) {
            viewFindViewById2 = null;
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListEventDialog$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    AdListEventDialog.b(this.f$0, view4);
                }
            });
        }
        View view4 = this.a;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view4 = null;
        }
        int i2 = R.id.com_tnk_off_interstitial_iv_image;
        View viewFindViewById3 = view4.findViewById(i2);
        if ((viewFindViewById3 instanceof ImageView ? (ImageView) viewFindViewById3 : null) != null) {
            TnkImageLoader tnkImageLoader = TnkImageLoader.INSTANCE;
            View view5 = this.a;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view5 = null;
            }
            View viewFindViewById4 = view5.findViewById(i2);
            ImageView imageView = viewFindViewById4 instanceof ImageView ? (ImageView) viewFindViewById4 : null;
            Intrinsics.checkNotNull(imageView);
            Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString("imgUrl", "")) == null) {
                string = "";
            }
            tnkImageLoader.loadImage(imageView, string);
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string2 = arguments2.getString("eclck_url", "")) == null) {
                string2 = "";
            }
            if (!TextUtils.isEmpty(string2)) {
                View view6 = this.a;
                if (view6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    view6 = null;
                }
                View viewFindViewById5 = view6.findViewById(i2);
                ImageView imageView2 = viewFindViewById5 instanceof ImageView ? (ImageView) viewFindViewById5 : null;
                Intrinsics.checkNotNull(imageView2);
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListEventDialog$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view7) {
                        AdListEventDialog.c(this.f$0, view7);
                    }
                });
            }
        }
        setCancelable(false);
    }

    public final void setOnDismissCallback(@Nullable Function0<Unit> function0) {
        this.b = function0;
    }

    public static final void a(AdListEventDialog adListEventDialog, View view) {
        adListEventDialog.dismiss();
        Function0 function0 = adListEventDialog.b;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
