package o;

import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ProfileStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ProfileStore {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private final getPageWidth IAuthTabCallback;
    private final String asInterface;
    private final Function0<Boolean> onExtraCallback;
    private final Function1<String, Unit> onExtraCallbackWithResult;
    private final NativeAdsDto.AdAsset onNavigationEvent;
    private final boolean onTransact;
    private final NativeAdsManager onWarmupCompleted;

    public static /* synthetic */ Unit onWarmupCompleted(String str, ProfileStore profileStore) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(str, profileStore);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, profileStore);
        int i3 = asBinder + 11;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileStore(@NotNull String str, @NotNull NativeAdsDto.AdAsset adAsset, @Nullable NativeAdsManager nativeAdsManager, boolean z, @NotNull Function0<Boolean> function0, @NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.asInterface = str;
        this.onNavigationEvent = adAsset;
        this.onWarmupCompleted = nativeAdsManager;
        this.onTransact = z;
        this.onExtraCallback = function0;
        this.onExtraCallbackWithResult = function1;
        this.IAuthTabCallback = getPageWidth.Companion.onExtraCallback(str, adAsset);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.asInterface;
        int i5 = i3 + 17;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final NativeAdsDto.AdAsset onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdAsset adAsset = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return adAsset;
    }

    public final NativeAdsManager onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsManager nativeAdsManager = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return nativeAdsManager;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onTransact;
        int i5 = i2 + 125;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Function0<Boolean> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 115;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Function0<Boolean> function0 = this.onExtraCallback;
        int i4 = i2 + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return function0;
    }

    public final getPageWidth IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull dispatchOnPageScrolled dispatchonpagescrolled, @Nullable String str, @NotNull final String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dispatchonpagescrolled, "");
        Intrinsics.checkNotNullParameter(str2, "");
        getFillAlpha.onWarmupCompleted(this.onWarmupCompleted, this.asInterface, this.onNavigationEvent, null, dispatchonpagescrolled, str, null, new Function0() { // from class: im.toss.ads_sdk.ui.NativeAdsTemplateHost$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = ProfileStore.onWarmupCompleted(str2, this);
                int i5 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, 32, null);
        int i2 = IAuthTabCallbackStub + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(String str, ProfileStore profileStore) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!StringsKt.isBlank(str)) {
            int i4 = IAuthTabCallbackStub + 63;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                profileStore.onExtraCallbackWithResult.invoke(str);
            } else {
                profileStore.onExtraCallbackWithResult.invoke(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }
}
