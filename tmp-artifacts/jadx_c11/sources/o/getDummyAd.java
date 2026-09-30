package o;

import android.content.Context;
import android.content.Intent;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getDummyAd {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onWarmupCompleted;

    public interface onNavigationEvent {
        getDummyAd getDrawerToggleDelegate();
    }

    Object onExtraCallback(@NotNull String str, boolean z, @NotNull access13800<? super Boolean> access13800Var);

    Object onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull Map<String, ? extends Object> map, @Nullable setHasShown sethasshown, boolean z, @NotNull StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr, @NotNull StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr2, @NotNull StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr3, @Nullable getOriginalFullResponse getoriginalfullresponse, @Nullable getOriginalFullResponse getoriginalfullresponse2, @Nullable getOriginalFullResponse getoriginalfullresponse3, @Nullable r8lambdaDml5dirzRCENiZicd2_b5Xg5o r8lambdadml5dirzrcenizicd2_b5xg5o, boolean z2, boolean z3, boolean z4, @NotNull StandardTermsV2BizReceiver[] standardTermsV2BizReceiverArr, @Nullable StandardTermsV2DynamicTermsParam[] standardTermsV2DynamicTermsParamArr, boolean z5, @Nullable StandardTermsV2YouthRegisterParam standardTermsV2YouthRegisterParam, @Nullable String str4, @NotNull access13800<? super Intent> access13800Var);

    static /* synthetic */ Object onExtraCallback(getDummyAd getdummyad, Context context, String str, String str2, String str3, long j, Map map, setHasShown sethasshown, boolean z, StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr, StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr2, StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr3, getOriginalFullResponse getoriginalfullresponse, getOriginalFullResponse getoriginalfullresponse2, getOriginalFullResponse getoriginalfullresponse3, r8lambdaDml5dirzRCENiZicd2_b5Xg5o r8lambdadml5dirzrcenizicd2_b5xg5o, boolean z2, boolean z3, boolean z4, StandardTermsV2BizReceiver[] standardTermsV2BizReceiverArr, StandardTermsV2DynamicTermsParam[] standardTermsV2DynamicTermsParamArr, boolean z5, StandardTermsV2YouthRegisterParam standardTermsV2YouthRegisterParam, String str4, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj == null) {
            return getdummyad.onWarmupCompleted(context, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? -1L : j, (i & 32) != 0 ? access8100.onNavigationEvent() : map, (i & 64) != 0 ? null : sethasshown, (i & 128) != 0 ? true : z, (i & 256) != 0 ? new StandardTermsV2CustomVariable[0] : standardTermsV2CustomVariableArr, (i & 512) != 0 ? new StandardTermsV2CustomVariable[0] : standardTermsV2CustomVariableArr2, (i & 1024) != 0 ? new StandardTermsV2CustomVariable[0] : standardTermsV2CustomVariableArr3, (i & 2048) != 0 ? null : getoriginalfullresponse, (i & 4096) != 0 ? null : getoriginalfullresponse2, (i & 8192) != 0 ? null : getoriginalfullresponse3, (i & 16384) != 0 ? null : r8lambdadml5dirzrcenizicd2_b5xg5o, (32768 & i) != 0 ? false : z2, (65536 & i) != 0 ? false : z3, (131072 & i) != 0 ? false : z4, (262144 & i) != 0 ? new StandardTermsV2BizReceiver[0] : standardTermsV2BizReceiverArr, (524288 & i) != 0 ? null : standardTermsV2DynamicTermsParamArr, (1048576 & i) != 0 ? true : z5, (2097152 & i) != 0 ? null : standardTermsV2YouthRegisterParam, (i & 4194304) != 0 ? null : str4, access13800Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createIntent");
    }

    static /* synthetic */ Object IAuthTabCallback(getDummyAd getdummyad, String str, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canEnterStandardTerms");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return getdummyad.onExtraCallback(str, z, access13800Var);
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        static final /* synthetic */ IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = onNavigationEvent + 79;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 79 / 0;
            }
        }

        private IAuthTabCallback() {
        }

        public final getDummyAd onNavigationEvent(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Response response = Response.onNavigationEvent;
            getDummyAd drawerToggleDelegate = ((onNavigationEvent) Response.onExtraCallback(context, onNavigationEvent.class)).getDrawerToggleDelegate();
            int i4 = onExtraCallbackWithResult + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return drawerToggleDelegate;
        }
    }
}
