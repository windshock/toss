package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.kakao.sdk.auth.AuthCodeHandlerActivity;
import com.kakao.sdk.auth.TalkAuthCodeActivity;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getNewListSize {
    public static final getNewListSize onNavigationEvent = new getNewListSize();

    private getNewListSize() {
    }

    public final Intent IAuthTabCallback() {
        Intent intentAddCategory = new Intent("com.kakao.talk.intent.action.CAPRI_LOGGED_IN_ACTIVITY").addCategory("android.intent.category.DEFAULT");
        Intrinsics.checkNotNullExpressionValue(intentAddCategory, "");
        return intentAddCategory;
    }

    public final Intent onExtraCallback(@NotNull Context context, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Bundle bundle, @NotNull ResultReceiver resultReceiver) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(resultReceiver, "");
        Intent intentPutExtra = new Intent(context, (Class<?>) TalkAuthCodeActivity.class).putExtra("key.login.intent", IAuthTabCallback().putExtra("com.kakao.sdk.talk.appKey", str).putExtra("com.kakao.sdk.talk.redirectUri", str2).putExtra("com.kakao.sdk.talk.kaHeader", str3).putExtra("com.kakao.sdk.talk.extraparams", bundle)).putExtra("key.request.code", i2);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("key.result.receiver", resultReceiver);
        Unit unit = Unit.INSTANCE;
        Intent intentAddFlags = intentPutExtra.putExtra("key.bundle", bundle2).addFlags(603979776);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
        return intentAddFlags;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.kakao.sdk.common.model.ClientError */
    public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull Uri uri, @NotNull String str, @NotNull ResultReceiver resultReceiver) throws ClientError, ClassNotFoundException {
        Class cls;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(resultReceiver, "");
        if (fixLayoutStartGap.onNavigationEvent.asInterface()) {
            try {
                cls = Class.forName("com.kakao.sdk.automotive.AutomotiveWebViewActivity");
            } catch (ClassNotFoundException unused) {
                throw new ClientError(ClientErrorCause.IllegalState, "Please initialize the SDK using 'KakaoSdk.initForAutomotive()'");
            }
        } else {
            cls = AuthCodeHandlerActivity.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        Bundle bundle = new Bundle();
        bundle.putParcelable("key.result.receiver", resultReceiver);
        bundle.putParcelable("key.full_authorize_uri", uri);
        bundle.putString("key.redirect_uri", str);
        Unit unit = Unit.INSTANCE;
        Intent intentAddFlags = intent.putExtra("key.bundle", bundle).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
        return intentAddFlags;
    }
}
