package com.iap.ac.android.acs.plugin.ui.utils;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.iap.ac.android.acs.transition.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ACPluginDialogUtils {
    public static void showAlert(Activity activity, String str, String str2, String str3, final View.OnClickListener onClickListener) {
        if (UIUtils.isActivityDisabled(activity)) {
            return;
        }
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.acplugin_layout_phone_number_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.message);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.button);
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.heightPixels * 0.75d);
        textView2.setMaxHeight(i);
        int lineHeight = textView2.getLineHeight();
        if (lineHeight > 0) {
            textView2.setMaxLines(i / lineHeight);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
        }
        textView.setText(str);
        textView2.setText(str2);
        final Dialog dialog = new Dialog(activity);
        textView3.setText(str3);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.iap.ac.android.acs.plugin.ui.utils.ACPluginDialogUtils.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
                dialog.dismiss();
            }
        });
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(Math.min(UIUtils.dp2px(activity, 600), Math.max(0, displayMetrics.widthPixels - UIUtils.dp2px(activity, 96))), -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
    }
}
