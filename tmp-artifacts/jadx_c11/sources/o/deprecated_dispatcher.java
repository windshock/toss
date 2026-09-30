package o;

import android.content.Context;
import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import o.deprecated_eventListenerFactory;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_dispatcher {
    private static final Regex IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static final Regex IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel = 1;
    private static final Regex asBinder;
    private static int asInterface = 1;
    private static int getInterfaceDescriptor;
    private static final Regex onExtraCallback;
    private static final Regex onExtraCallbackWithResult;
    private static final Regex onNavigationEvent;
    private static final Regex onTransact;
    private static final Regex onWarmupCompleted;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final deprecated_eventListenerFactory IAuthTabCallback(@NotNull deprecated_eventListenerFactory.onExtraCallbackWithResult onextracallbackwithresult, @NotNull Resources resources, @NotNull Object obj) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof String) {
            deprecated_eventListenerFactory deprecated_eventlistenerfactoryOnExtraCallback = onExtraCallback(onextracallbackwithresult, (String) obj);
            int i4 = getInterfaceDescriptor + 13;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return deprecated_eventlistenerfactoryOnExtraCallback;
        }
        if (!(!(obj instanceof Integer))) {
            return onExtraCallbackWithResult(onextracallbackwithresult, resources, ((Number) obj).intValue());
        }
        if (!(obj instanceof deprecated_followRedirects)) {
            return deprecated_eventListenerFactory.Image;
        }
        int i6 = IAuthTabCallback_Parcel + 91;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) obj;
        if (deprecated_followredirects instanceof deprecated_cookieJar) {
            return IAuthTabCallback(onextracallbackwithresult, resources, ((deprecated_cookieJar) obj).onExtraCallback(resources));
        }
        if (deprecated_followredirects instanceof accessgetDEFAULT_PROTOCOLScp) {
            return onExtraCallbackWithResult(onextracallbackwithresult, resources, ((accessgetDEFAULT_PROTOCOLScp) obj).onNavigationEvent());
        }
        if (!(deprecated_followredirects instanceof verifyClientState)) {
            throw new NoWhenBranchMatchedException();
        }
        deprecated_eventListenerFactory deprecated_eventlistenerfactoryOnExtraCallback2 = onExtraCallback(onextracallbackwithresult, ((verifyClientState) obj).onExtraCallback());
        int i8 = getInterfaceDescriptor + 89;
        IAuthTabCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return deprecated_eventlistenerfactoryOnExtraCallback2;
    }

    public static final deprecated_eventListenerFactory onWarmupCompleted(@NotNull deprecated_eventListenerFactory.onExtraCallbackWithResult onextracallbackwithresult, @NotNull Context context, @NotNull Object obj) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        deprecated_eventListenerFactory deprecated_eventlistenerfactoryIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, resources, obj);
        int i4 = IAuthTabCallback_Parcel + 35;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_eventlistenerfactoryIAuthTabCallback;
    }

    private static final deprecated_eventListenerFactory onExtraCallbackWithResult(deprecated_eventListenerFactory.onExtraCallbackWithResult onextracallbackwithresult, Resources resources, int i) throws Resources.NotFoundException {
        String strReplace$default;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 73;
        getInterfaceDescriptor = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                String resourceEntryName = resources.getResourceEntryName(i);
                Intrinsics.checkNotNull(resourceEntryName);
                strReplace$default = StringsKt.replace$default(resourceEntryName, "_", "-", true, 5, (Object) null);
            } else {
                String resourceEntryName2 = resources.getResourceEntryName(i);
                Intrinsics.checkNotNull(resourceEntryName2);
                strReplace$default = StringsKt.replace$default(resourceEntryName2, "_", "-", false, 4, (Object) null);
            }
            return onExtraCallback(onextracallbackwithresult, strReplace$default);
        } catch (Resources.NotFoundException unused) {
            return deprecated_eventListenerFactory.Image;
        }
    }

    private static final deprecated_eventListenerFactory onExtraCallback(deprecated_eventListenerFactory.onExtraCallbackWithResult onextracallbackwithresult, String str) {
        int i = 2 % 2;
        if (onTransact.onExtraCallbackWithResult(str) || IAuthTabCallbackStub.onExtraCallbackWithResult(str)) {
            if (!onExtraCallbackWithResult.onExtraCallbackWithResult(str)) {
                return deprecated_eventListenerFactory.Logo;
            }
            int i2 = IAuthTabCallback_Parcel + 51;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return deprecated_eventListenerFactory.LogoFill;
        }
        int i4 = IAuthTabCallback_Parcel + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        if (!onNavigationEvent.onExtraCallbackWithResult(str)) {
            if (onWarmupCompleted.onExtraCallbackWithResult(str)) {
                return deprecated_eventListenerFactory.Apng;
            }
            if (!IAuthTabCallback.onExtraCallbackWithResult(str)) {
                if (onExtraCallback.onExtraCallbackWithResult(str)) {
                    return deprecated_eventListenerFactory.Emoji3D;
                }
                if (asBinder.onExtraCallbackWithResult(str)) {
                    int i6 = getInterfaceDescriptor + 31;
                    IAuthTabCallback_Parcel = i6 % 128;
                    if (i6 % 2 != 0) {
                        return deprecated_eventListenerFactory.Lottie;
                    }
                    int i7 = 4 / 0;
                    return deprecated_eventListenerFactory.Lottie;
                }
                return deprecated_eventListenerFactory.Image;
            }
            int i8 = getInterfaceDescriptor + 83;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                return deprecated_eventListenerFactory.Emoji2D;
            }
            deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Emoji2D;
            throw null;
        }
        int i9 = IAuthTabCallback_Parcel + 35;
        getInterfaceDescriptor = i9 % 128;
        int i10 = i9 % 2;
        if (onExtraCallbackWithResult.onExtraCallbackWithResult(str)) {
            int i11 = IAuthTabCallback_Parcel + 71;
            getInterfaceDescriptor = i11 % 128;
            if (i11 % 2 == 0) {
                return deprecated_eventListenerFactory.IconFill;
            }
            deprecated_eventListenerFactory deprecated_eventlistenerfactory2 = deprecated_eventListenerFactory.IconFill;
            throw null;
        }
        return deprecated_eventListenerFactory.Icon;
    }

    static {
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        onExtraCallbackWithResult = new Regex(".*-fill(?:[.-].*|$)", regexOption);
        onTransact = new Regex("^(?:https://static\\.toss\\.im)?(?:/icons(/.*)?/(?:icn-bank-|icn-car-)|/png-icons/(?:timeline|securities/icn-sec-)|/(?:icons|logos)(/.*)?/logo-).*$", regexOption);
        IAuthTabCallbackStub = new Regex("^(?:icn-bank-|icn-car|logo-|icn-sec).*", regexOption);
        onNavigationEvent = new Regex("^(?:https://static\\.toss\\.im/icons(/.*)?/.*(?:.png|.svg|.webp$)|(?:icon-|icn-).*)$", regexOption);
        onWarmupCompleted = new Regex(".*-apng.(?:png|webp)$", regexOption);
        IAuthTabCallback = new Regex("^https://static\\.toss\\.im/2d-emojis/.*\\.(?:png|svg|webp)$", regexOption);
        onExtraCallback = new Regex("^https://static\\.toss\\.im/3d-emojis/.*\\.(?:png|webp|gif)$", regexOption);
        asBinder = new Regex(".*.json$", regexOption);
        int i = IAuthTabCallbackDefault + 91;
        asInterface = i % 128;
        int i2 = i % 2;
    }
}
