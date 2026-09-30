package o;

import android.content.Context;
import im.toss.features.edoc.register.AptPasswordActivity$;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinPostbackListener {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private final getWriteSuccessCountokhttp IAuthTabCallback;
    private final getPins IAuthTabCallbackDefault;
    private final isUserConsentSet IAuthTabCallbackStub;
    private final Locale asBinder;
    private final deprecated_maxAgeSeconds asInterface;
    private final accessinit onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private final clampToInt onNavigationEvent;
    private final newCall onTransact;
    private final isDoNotSellSet onWarmupCompleted;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i4;
        int i10 = i8 | i4;
        int i11 = (~((~i4) | i6)) | (~i10);
        int i12 = (~(i3 | i7 | i4)) | (~(i10 | i6));
        int i13 = i4 + i6 + i2 + (528639218 * i) + ((-532493036) * i5);
        int i14 = i13 * i13;
        int i15 = ((i4 * 873666089) - 1460666368) + (873666089 * i6) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i2) + (1819279360 * i) + ((-1621098496) * i5) + (586088448 * i14);
        int i16 = (i4 * (-1573143961)) + 2078511484 + (i6 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i2 * (-1573143025)) + (i * 123045422) + (i5 * (-1548035028)) + (i14 * 1845559296);
        return i15 + ((i16 * i16) * 1848705024) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public AppLovinPostbackListener(@NotNull Context context, @NotNull Locale locale, @Nullable deprecated_maxAgeSeconds deprecated_maxageseconds, @NotNull accessinit accessinitVar, @NotNull clampToInt clamptoint, @NotNull isUserConsentSet isuserconsentset, @NotNull isDoNotSellSet isdonotsellset, @NotNull getPins getpins, @NotNull getWriteSuccessCountokhttp getwritesuccesscountokhttp, @NotNull newCall newcall) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(accessinitVar, "");
        Intrinsics.checkNotNullParameter(clamptoint, "");
        Intrinsics.checkNotNullParameter(isuserconsentset, "");
        Intrinsics.checkNotNullParameter(isdonotsellset, "");
        Intrinsics.checkNotNullParameter(getpins, "");
        Intrinsics.checkNotNullParameter(getwritesuccesscountokhttp, "");
        Intrinsics.checkNotNullParameter(newcall, "");
        this.onExtraCallbackWithResult = context;
        this.asBinder = locale;
        this.asInterface = deprecated_maxageseconds;
        this.onExtraCallback = accessinitVar;
        this.onNavigationEvent = clamptoint;
        this.IAuthTabCallbackStub = isuserconsentset;
        this.onWarmupCompleted = isdonotsellset;
        this.IAuthTabCallbackDefault = getpins;
        this.IAuthTabCallback = getwritesuccesscountokhttp;
        this.onTransact = newcall;
    }

    public final Context onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        Context context = this.onExtraCallbackWithResult;
        int i5 = i3 + 109;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    public /* synthetic */ AppLovinPostbackListener(Context context, Locale locale, deprecated_maxAgeSeconds deprecated_maxageseconds, accessinit accessinitVar, clampToInt clamptoint, isUserConsentSet isuserconsentset, isDoNotSellSet isdonotsellset, getPins getpins, getWriteSuccessCountokhttp getwritesuccesscountokhttp, newCall newcall, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Locale locale2;
        accessinit accessinitVar2;
        clampToInt clamptointOnExtraCallback;
        isUserConsentSet isuserconsentsetIAuthTabCallback;
        getPins getpinsOnWarmupCompleted;
        getWriteSuccessCountokhttp getwritesuccesscountokhttp2;
        newCall newcall2;
        if ((i & 2) != 0) {
            locale2 = Locale.KOREA;
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            int i2 = IAuthTabCallbackStubProxy + 7;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 3;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            locale2 = locale;
        }
        Object obj = null;
        deprecated_maxAgeSeconds deprecated_maxageseconds2 = (i & 4) != 0 ? null : deprecated_maxageseconds;
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallbackStubProxy + 45;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            accessinitVar2 = route.onExtraCallback;
        } else {
            accessinitVar2 = accessinitVar;
        }
        if ((i & 16) != 0) {
            int i7 = IAuthTabCallbackStubProxy + 83;
            IAuthTabCallback_Parcel = i7 % 128;
            if (i7 % 2 == 0) {
                clampToInt.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            clamptointOnExtraCallback = clampToInt.Companion.onExtraCallback();
        } else {
            clamptointOnExtraCallback = clamptoint;
        }
        if ((i & 32) != 0) {
            isuserconsentsetIAuthTabCallback = isUserConsentSet.Companion.IAuthTabCallback();
            int i8 = 2 % 2;
        } else {
            isuserconsentsetIAuthTabCallback = isuserconsentset;
        }
        isDoNotSellSet isdonotsellsetOnExtraCallbackWithResult = (i & 64) != 0 ? isDoNotSellSet.Companion.onExtraCallbackWithResult() : isdonotsellset;
        if ((i & 128) != 0) {
            getpinsOnWarmupCompleted = getPins.Companion.onWarmupCompleted();
            int i9 = 2 % 2;
        } else {
            getpinsOnWarmupCompleted = getpins;
        }
        if ((i & 256) != 0) {
            getwritesuccesscountokhttp2 = new getWriteSuccessCountokhttp(null, 1, null);
            int i10 = IAuthTabCallback_Parcel + 77;
            IAuthTabCallbackStubProxy = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
        } else {
            getwritesuccesscountokhttp2 = getwritesuccesscountokhttp;
        }
        if ((i & 512) != 0) {
            newcall2 = new newCall(null, null, 3, null);
            int i12 = 2 % 2;
        } else {
            newcall2 = newcall;
        }
        this(context, locale2, deprecated_maxageseconds2, accessinitVar2, clamptointOnExtraCallback, isuserconsentsetIAuthTabCallback, isdonotsellsetOnExtraCallbackWithResult, getpinsOnWarmupCompleted, getwritesuccesscountokhttp2, newcall2);
    }

    public final Locale IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final deprecated_maxAgeSeconds asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final accessinit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 27;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        accessinit accessinitVar = this.onExtraCallback;
        int i5 = i2 + 91;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return accessinitVar;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AppLovinPostbackListener appLovinPostbackListener = (AppLovinPostbackListener) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        clampToInt clamptoint = appLovinPostbackListener.onNavigationEvent;
        if (i3 != 0) {
            return clamptoint;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final isUserConsentSet IAuthTabCallbackDefault() {
        isUserConsentSet isuserconsentset;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            isuserconsentset = this.IAuthTabCallbackStub;
            int i4 = 61 / 0;
        } else {
            isuserconsentset = this.IAuthTabCallbackStub;
        }
        int i5 = i3 + 5;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return isuserconsentset;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppLovinPostbackListener appLovinPostbackListener = (AppLovinPostbackListener) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 107;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        isDoNotSellSet isdonotsellset = appLovinPostbackListener.onWarmupCompleted;
        int i5 = i2 + 45;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return isdonotsellset;
    }

    public final getPins onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    public final getWriteSuccessCountokhttp IAuthTabCallback() {
        getWriteSuccessCountokhttp getwritesuccesscountokhttp;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 109;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            getwritesuccesscountokhttp = this.IAuthTabCallback;
            int i4 = 91 / 0;
        } else {
            getwritesuccesscountokhttp = this.IAuthTabCallback;
        }
        int i5 = i2 + 67;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return getwritesuccesscountokhttp;
    }

    public final newCall asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 93;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        newCall newcall = this.onTransact;
        int i5 = i2 + 1;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return newcall;
    }

    public final isDoNotSellSet onNavigationEvent() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (isDoNotSellSet) onNavigationEvent(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, 1657773374, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), new Object[]{this}, -1657773374);
    }

    public final clampToInt onExtraCallbackWithResult() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (clampToInt) onNavigationEvent(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, -70712096, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), new Object[]{this}, 70712097);
    }
}
