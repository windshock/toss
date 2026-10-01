package com.tnkfactory.ad;

import android.content.Context;
import android.widget.Toast;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import java.text.MessageFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdHideUtil {
    public static final TnkAdHideUtil INSTANCE = new TnkAdHideUtil();

    private TnkAdHideUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hideApp$lambda$0(Context context, long j, Function0 function0) {
        Settings.INSTANCE.addHiddenApp(context, j);
        Toast.makeText(context, "목록에서 제거되었습니다.추후 참여 가능 판정 시, 다시 목록에 노출됩니다.", 0).show();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hideApp$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void hideApp(@NotNull Context context, @NotNull AdListVo adListVo, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        hideApp(context, adListVo.getTitle(), adListVo.getAppId(), function02, function0);
    }

    public final void hideApp(@NotNull final Context context, @NotNull String str, final long j, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        String str2 = new MessageFormat(Resources.getResources().hide_app_message).format(new Object[]{str});
        TAlertDialog.Builder title = new TAlertDialog.Builder(context).setTitle(str);
        Intrinsics.checkNotNull(str2);
        title.setMessage(str2).setConfirmText("목록에서 제거").setOnConfirm(new Function0() { // from class: com.tnkfactory.ad.TnkAdHideUtil$$ExternalSyntheticLambda0
            public final Object invoke() {
                return TnkAdHideUtil.hideApp$lambda$0(context, j, function0);
            }
        }).setOnCancel(new Function0() { // from class: com.tnkfactory.ad.TnkAdHideUtil$$ExternalSyntheticLambda1
            public final Object invoke() {
                return TnkAdHideUtil.hideApp$lambda$1(function02);
            }
        }).build().show();
    }
}
