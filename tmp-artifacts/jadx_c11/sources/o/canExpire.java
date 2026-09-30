package o;

import android.content.Context;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface canExpire {
    public static final IAuthTabCallback Companion = IAuthTabCallback.IAuthTabCallback;

    public interface onExtraCallback {
        canExpire setCursor();
    }

    void onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @NotNull Map<String, ? extends Object> map, @Nullable setHasShown sethasshown, @Nullable StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr, @Nullable r8lambdaDml5dirzRCENiZicd2_b5Xg5o r8lambdadml5dirzrcenizicd2_b5xg5o, boolean z, boolean z2, @Nullable Function1<? super r8lambda6V0YVgpvgCQzEji1GNetQSIYsE, Unit> function1, @Nullable Float f, @Nullable StandardTermsV2BizReceiver[] standardTermsV2BizReceiverArr, @Nullable StandardTermsV2DynamicTermsParam[] standardTermsV2DynamicTermsParamArr, @Nullable StandardTermsV2YouthRegisterParam standardTermsV2YouthRegisterParam, @Nullable getOriginalFullResponse getoriginalfullresponse, @Nullable getOriginalFullResponse getoriginalfullresponse2, @Nullable getOriginalFullResponse getoriginalfullresponse3, @NotNull getRawFullResponse getrawfullresponse, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3);

    public static final class IAuthTabCallback {
        static final /* synthetic */ IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 43;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallback() {
        }

        public final canExpire IAuthTabCallback(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Response response = Response.onNavigationEvent;
            canExpire cursor = ((onExtraCallback) Response.onExtraCallback(context, onExtraCallback.class)).setCursor();
            int i4 = onExtraCallback + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return cursor;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
