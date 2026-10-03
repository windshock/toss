package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface UST_CERT_SetCACert {
    default List<ShortcutInfo> onNavigationEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String packageName = context.getPackageName();
        List<UST_CERT_SetCertVerifyEnvExternal> listOnNavigationEvent = onNavigationEvent();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent, 10));
        for (UST_CERT_SetCertVerifyEnvExternal uST_CERT_SetCertVerifyEnvExternal : listOnNavigationEvent) {
            String string = context.getString(uST_CERT_SetCertVerifyEnvExternal.getLabelResId());
            Intrinsics.checkNotNullExpressionValue(string, "");
            EncoderImplByteBufferInputExternalSyntheticLambda9.IAuthTabCallback();
            ShortcutInfo.Builder icon = EncoderImplByteBufferInputExternalSyntheticLambda8.kj_(context, uST_CERT_SetCertVerifyEnvExternal.getId()).setShortLabel(string).setLongLabel(string).setIcon(Icon.createWithResource(context, uST_CERT_SetCertVerifyEnvExternal.getIconResId()));
            Intrinsics.checkNotNull(packageName);
            arrayList.add(icon.setIntent(onExtraCallback(packageName, uST_CERT_SetCertVerifyEnvExternal.getUri())).build());
        }
        return arrayList;
    }

    default List<UST_CERT_SetCertVerifyEnvExternal> onNavigationEvent() {
        return CollectionsKt.emptyList();
    }

    default Intent onExtraCallback(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setComponent(new ComponentName(str, "viva.republica.toss.splash.SplashSchemeActivity"));
        intent.setData(Uri.parse(str2));
        intent.addFlags(335544320);
        return intent;
    }
}
