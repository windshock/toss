package com.tnkfactory.ad.rwd;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tnkfactory.ad.AgreePrivacyPopupListener;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkStyle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AgreePrivacyPopupDialog extends Dialog {
    public final Activity a;
    public AgreePrivacyPopupListener b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgreePrivacyPopupDialog(@NotNull Activity activity) {
        super(activity, R.style.tnk_full_screen_dialog);
        Intrinsics.checkNotNullParameter(activity, "");
        this.a = activity;
    }

    public static final void a(AgreePrivacyPopupDialog agreePrivacyPopupDialog, View view) {
        Settings.INSTANCE.setAgreePrivacy(agreePrivacyPopupDialog.a, false);
        agreePrivacyPopupDialog.dismiss();
        AgreePrivacyPopupListener agreePrivacyPopupListener = agreePrivacyPopupDialog.b;
        if (agreePrivacyPopupListener != null) {
            agreePrivacyPopupListener.onCancle();
        }
    }

    public static final void b(AgreePrivacyPopupDialog agreePrivacyPopupDialog, View view) {
        Settings.INSTANCE.setAgreePrivacy(agreePrivacyPopupDialog.a, true);
        agreePrivacyPopupDialog.dismiss();
        AgreePrivacyPopupListener agreePrivacyPopupListener = agreePrivacyPopupDialog.b;
        if (agreePrivacyPopupListener != null) {
            agreePrivacyPopupListener.onConfirm();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.com_tnk_offerwall_dialog_terms, (ViewGroup) null));
        this.c = (TextView) findViewById(R.id.com_tnk_tv_title);
        this.d = (TextView) findViewById(R.id.tv_message);
        this.e = (TextView) findViewById(R.id.btn_cancel);
        this.f = (TextView) findViewById(R.id.btn_confirm);
        String str = Resources.getResources().agree_privacy_title;
        if (!TextUtils.isEmpty(str) && (textView = this.c) != null) {
            textView.setText(str);
        }
        String str2 = Resources.getResources().agree_privacy_desc_default;
        Intrinsics.checkNotNull(str2);
        String strReplace$default = StringsKt.replace$default(str2, "{device_id}", "", false, 4, (Object) null);
        if (!TextUtils.isEmpty(TnkStyle.privacyExtraText)) {
            strReplace$default = strReplace$default + "\n" + TnkStyle.privacyExtraText;
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(strReplace$default);
        }
        TextView textView3 = this.d;
        if (textView3 != null) {
            textView3.setMovementMethod(new ScrollingMovementMethod());
        }
        TextView textView4 = this.e;
        if (textView4 != null) {
            textView4.setText(Resources.getResources().agree_privacy_btn_refuse);
        }
        TextView textView5 = this.f;
        if (textView5 != null) {
            textView5.setText(Resources.getResources().agree_privacy_btn_agree);
        }
        TextView textView6 = this.e;
        if (textView6 != null) {
            textView6.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.rwd.AgreePrivacyPopupDialog$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AgreePrivacyPopupDialog.a(this.f$0, view);
                }
            });
        }
        TextView textView7 = this.f;
        if (textView7 != null) {
            textView7.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.rwd.AgreePrivacyPopupDialog$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AgreePrivacyPopupDialog.b(this.f$0, view);
                }
            });
        }
        setCancelable(false);
    }

    public final void setAgreePrivacyPopupListener(@Nullable AgreePrivacyPopupListener agreePrivacyPopupListener) {
        this.b = agreePrivacyPopupListener;
    }

    public final void setCancelOnClickListener(@Nullable View.OnClickListener onClickListener) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public final void setConfirmOnClickListener(@Nullable View.OnClickListener onClickListener) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (Settings.INSTANCE.isAgreePrivacy(this.a)) {
            return;
        }
        super.show();
    }
}
