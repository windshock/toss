package o;

import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.PlayableAdInfoResponse;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.ads_sdk.remote.model.SspSdkAdResponse;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setTranslateY {
    private static int IAuthTabCallbackDefault = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    private final pageLeft IAuthTabCallback;
    private final FragmentStateAdapter4 onNavigationEvent;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallback = 8;

    static {
        int i = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public setTranslateY(@NotNull pageLeft pageleft, @NotNull FragmentStateAdapter4 fragmentStateAdapter4) {
        Intrinsics.checkNotNullParameter(pageleft, "");
        Intrinsics.checkNotNullParameter(fragmentStateAdapter4, "");
        this.IAuthTabCallback = pageleft;
        this.onNavigationEvent = fragmentStateAdapter4;
    }

    public final Object onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull access13800<? super PlayableAdInfoResponse> access13800Var) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.IAuthTabCallback, str, str2, str3, access13800Var};
        Object objIAuthTabCallback = pageLeft.IAuthTabCallback(-1635110962, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1635110963, PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback());
        int i4 = IAuthTabCallbackDefault + 105;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return objIAuthTabCallback;
    }

    public final Object onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull GetNativeAdsRequestBody.AppInfo appInfo, @NotNull String str3, @Nullable String str4, @Nullable String str5, @NotNull Map<String, String> map, @NotNull Set<String> set, @NotNull String str6, @NotNull GetNativeAdsRequestBody.AdRequestOption adRequestOption, @NotNull access13800<? super NativeAdsDto> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        NativeAdsDto nativeAdsDtoOnExtraCallback = onExtraCallback(str2);
        if (nativeAdsDtoOnExtraCallback != null) {
            return nativeAdsDtoOnExtraCallback;
        }
        Object objOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(str, str2, str6, appInfo, str3, set, str4, str5, map, adRequestOption, access13800Var);
        int i3 = IAuthTabCallbackDefault + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return objOnWarmupCompleted;
    }

    public final NativeAdsDto onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!StringsKt.startsWith$default(str, "ui_test", false, 2, (Object) null)) {
            int i2 = IAuthTabCallbackDefault + 31;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String strRemovePrefix = StringsKt.removePrefix(str, "ui_test_");
        getStrokeColor getstrokecolor = getStrokeColor.onWarmupCompleted;
        NativeAdsDto nativeAdsDtoOnWarmupCompleted = getstrokecolor.onWarmupCompleted(strRemovePrefix);
        if (nativeAdsDtoOnWarmupCompleted != null) {
            return nativeAdsDtoOnWarmupCompleted;
        }
        int i3 = onTransact + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int length = strRemovePrefix.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            if (!Character.isDigit(strRemovePrefix.charAt(i5))) {
                strRemovePrefix = strRemovePrefix.substring(0, i5);
                Intrinsics.checkNotNullExpressionValue(strRemovePrefix, "");
                int i6 = IAuthTabCallbackDefault + 105;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                break;
            }
            i5++;
        }
        return getstrokecolor.onWarmupCompleted(strRemovePrefix);
    }

    public final Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull GetNativeAdsRequestBody.AppInfo appInfo, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull Map<String, String> map, @NotNull String str8, @NotNull access13800<? super SspSdkAdResponse> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = this.IAuthTabCallback.onExtraCallback(str, str2, list, str8, appInfo, str3, str4, str5, str6, str7, map, access13800Var);
        int i4 = IAuthTabCallbackDefault + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(@NotNull String str, @NotNull JsonObject jsonObject, @NotNull String str2, @Nullable String str3, @NotNull Map<String, String> map, @NotNull access13800<? super JsonObject> access13800Var) {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            objOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(str, jsonObject, str2, str3, map, access13800Var);
            int i3 = 13 / 0;
        } else {
            objOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(str, jsonObject, str2, str3, map, access13800Var);
        }
        int i4 = onTransact + 87;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
