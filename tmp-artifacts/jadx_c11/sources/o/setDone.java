package o;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Build;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setDone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setDone {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int asInterface;
    private final deprecated_maxAgeSeconds IAuthTabCallback;
    private final Function2<String, Throwable, Unit> onExtraCallbackWithResult;
    private final CacheEntryCompanion onNavigationEvent;
    private final HashMap<response, Typeface> onWarmupCompleted;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final setDone onExtraCallback = new setDone(deprecated_maxAgeSeconds.Companion.onExtraCallbackWithResult(), null, null, 6, null);

    public static /* synthetic */ Unit IAuthTabCallback(String str, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, th);
        int i4 = IAuthTabCallbackDefault + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i);
        int i11 = i9 | i10 | (~(i8 | i));
        int i12 = i10 | i2;
        int i13 = ~i;
        int i14 = (~(i2 | i13 | i6)) | (~(i7 | i13 | i8)) | (~(i8 | i6 | i));
        int i15 = i6 + i + i4 + ((-1329026341) * i3) + ((-1277752516) * i5);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i6) - 1912602624) + ((-659060787) * i) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i4) + (494927872 * i3) + (1577058304 * i5) + ((-1783103488) * i16);
        int i18 = (i6 * 595972471) + 129777640 + (i * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i4 * 595972219) + (i3 * (-1341978823)) + (i5 * 731850196) + (i16 * 1869086720);
        if (i17 + (i18 * i18 * (-846725120)) == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        final setDone setdone = (setDone) objArr[0];
        final String str = (String) objArr[1];
        int i19 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Function1 function1 = new Function1() { // from class: im.toss.tds.foundation.font.typeface.TdsFontTypefaceLoader$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i20 = 2 % 2;
                int i21 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                Unit unitOnExtraCallback = setDone.onExtraCallback(this.f$0, str, (Throwable) obj);
                int i23 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i23 % 128;
                int i24 = i23 % 2;
                return unitOnExtraCallback;
            }
        };
        int i20 = IAuthTabCallbackDefault + 119;
        asInterface = i20 % 128;
        int i21 = i20 % 2;
        return function1;
    }

    public static /* synthetic */ Unit onExtraCallback(setDone setdone, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            return (Unit) onExtraCallback(1885362634, iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{setdone, str, th}, iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), -1885362633);
        }
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Function1 onWarmupCompleted(setDone setdone, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            return (Function1) onExtraCallback(-1305194985, iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{setdone, str}, iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), 1305194985);
        }
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        Function1 function1 = (Function1) onExtraCallback(-1305194985, iOnExtraCallback3, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{setdone, str}, iOnExtraCallback4, ICustomTabsCallbackStubProxy.onExtraCallback(), 1305194985);
        int i3 = 77 / 0;
        return function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setDone(@NotNull deprecated_maxAgeSeconds deprecated_maxageseconds, @Nullable CacheEntryCompanion cacheEntryCompanion, @NotNull Function2<? super String, ? super Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(deprecated_maxageseconds, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.IAuthTabCallback = deprecated_maxageseconds;
        this.onNavigationEvent = cacheEntryCompanion;
        this.onExtraCallbackWithResult = function2;
        this.onWarmupCompleted = new HashMap<>();
    }

    public /* synthetic */ setDone(deprecated_maxAgeSeconds deprecated_maxageseconds, CacheEntryCompanion cacheEntryCompanion, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallbackDefault + 79;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            cacheEntryCompanion = null;
        }
        if ((i & 4) != 0) {
            function2 = new Function2() { // from class: im.toss.tds.foundation.font.typeface.TdsFontTypefaceLoader$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 19;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitIAuthTabCallback = setDone.IAuthTabCallback((String) obj, (Throwable) obj2);
                    int i7 = onExtraCallback + 97;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 69 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            };
            int i4 = asInterface + 105;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(deprecated_maxageseconds, cacheEntryCompanion, function2);
    }

    public static final /* synthetic */ setDone onExtraCallbackWithResult() {
        setDone setdone;
        int i = 2 % 2;
        int i2 = asInterface + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            setdone = onExtraCallback;
            int i4 = 52 / 0;
        } else {
            setdone = onExtraCallback;
        }
        int i5 = i3 + 49;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return setdone;
    }

    private static final Unit onExtraCallback(String str, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        isUserConsentSet.onNavigationEvent(getTcfVendorConsentStatus.Companion.onTransact(), "TdsFontTypefaceLoader", str, th, null, null, false, 56, null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 115;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setDone setdone = (setDone) objArr[0];
        String str = (String) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            setdone.onExtraCallbackWithResult.invoke(str, th);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        setdone.onExtraCallbackWithResult.invoke(str, th);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 13;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public final Typeface onWarmupCompleted(@NotNull Context context, @NotNull response responseVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object objEmptyList;
        Object obj4;
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(responseVar, "");
        if (Build.VERSION.SDK_INT < 29) {
            return IAuthTabCallback(context, responseVar);
        }
        Function1 function1 = new Function1() { // from class: im.toss.tds.foundation.font.typeface.TdsFontTypefaceLoader$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj5) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Function1 function1OnWarmupCompleted = setDone.onWarmupCompleted(this.f$0, (String) obj5);
                int i7 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 47 / 0;
                }
                return function1OnWarmupCompleted;
            }
        };
        try {
            Result.Companion companion = Result.Companion;
            deprecated_maxAgeSeconds.onExtraCallbackWithResult(this.IAuthTabCallback, context, true, null, null, null, 28, null);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Function1 function12 = (Function1) function1.invoke("Failed to download TossFace");
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            function12.invoke(th2);
        }
        Typeface typeface = this.onWarmupCompleted.get(responseVar);
        if (typeface != null) {
            return typeface;
        }
        try {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.constructor-impl(accessgetEditorp.ri_(context.getResources(), responseVar.getResId()).setWeight(responseVar.getWeight()).build());
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Function1 function13 = (Function1) function1.invoke("Failed to build default font (resId=" + responseVar.getResId() + ", weight=" + responseVar.getWeight() + ")");
        Throwable th4 = Result.exceptionOrNull-impl(obj2);
        if (th4 != null) {
            int i4 = IAuthTabCallbackDefault + 111;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                function13.invoke(th4);
                int i5 = 13 / 0;
            } else {
                function13.invoke(th4);
            }
        }
        if (Result.onExtraCallback(obj2)) {
            obj2 = null;
        }
        Font fontRg_ = readCertificateList.rg_(obj2);
        if (fontRg_ == null) {
            return null;
        }
        FontFamily fontFamilyBuild = CacheRealCacheRequest.rj_(fontRg_).build();
        Intrinsics.checkNotNullExpressionValue(fontFamilyBuild, "");
        Typeface.CustomFallbackBuilder customFallbackBuilderRk_ = body.rk_(fontFamilyBuild);
        try {
            Result.Companion companion5 = Result.Companion;
            Font fontRm_ = this.IAuthTabCallback.rm_(context);
            obj3 = Result.constructor-impl(fontRm_ != null ? customFallbackBuilderRk_.addCustomFallback(CacheRealCacheRequest.rj_(fontRm_).build()) : null);
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.Companion;
            obj3 = Result.constructor-impl(ResultKt.createFailure(th5));
        }
        Function1 function14 = (Function1) function1.invoke("Failed to add TossFace fallback (weight=" + responseVar.getWeight() + ")");
        Throwable th6 = Result.exceptionOrNull-impl(obj3);
        if (th6 != null) {
            function14.invoke(th6);
        }
        try {
            Result.Companion companion7 = Result.Companion;
            CacheEntryCompanion cacheEntryCompanion = this.onNavigationEvent;
            List<Font> listOnWarmupCompleted = cacheEntryCompanion != null ? cacheEntryCompanion.onWarmupCompleted(context, responseVar.getWeight()) : null;
            if (listOnWarmupCompleted == null) {
                int i6 = asInterface + 95;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                listOnWarmupCompleted = CollectionsKt.emptyList();
            }
            objEmptyList = Result.constructor-impl(listOnWarmupCompleted);
        } catch (Throwable th7) {
            Result.Companion companion8 = Result.Companion;
            objEmptyList = Result.constructor-impl(ResultKt.createFailure(th7));
        }
        Function1 function15 = (Function1) function1.invoke("Failed to load custom fallback fonts (weight=" + responseVar.getWeight() + ")");
        Throwable th8 = Result.exceptionOrNull-impl(objEmptyList);
        if (th8 != null) {
            function15.invoke(th8);
        }
        if (Result.exceptionOrNull-impl(objEmptyList) != null) {
            int i8 = IAuthTabCallbackDefault + 75;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            objEmptyList = CollectionsKt.emptyList();
        }
        Iterator it = ((List) objEmptyList).iterator();
        while (it.hasNext()) {
            int i10 = IAuthTabCallbackDefault + 63;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            Font fontRg_2 = readCertificateList.rg_(it.next());
            try {
                Result.Companion companion9 = Result.Companion;
                obj4 = Result.constructor-impl(customFallbackBuilderRk_.addCustomFallback(CacheRealCacheRequest.rj_(fontRg_2).build()));
            } catch (Throwable th9) {
                Result.Companion companion10 = Result.Companion;
                obj4 = Result.constructor-impl(ResultKt.createFailure(th9));
            }
            Function1 function16 = (Function1) function1.invoke("Failed to add custom fallback font (weight=" + responseVar.getWeight() + ")");
            Throwable th10 = Result.exceptionOrNull-impl(obj4);
            if (th10 != null) {
                function16.invoke(th10);
            }
        }
        Typeface typefaceBuild = customFallbackBuilderRk_.build();
        Intrinsics.checkNotNullExpressionValue(typefaceBuild, "");
        this.onWarmupCompleted.put(responseVar, typefaceBuild);
        return typefaceBuild;
    }

    private final Typeface IAuthTabCallback(Context context, response responseVar) {
        Object obj;
        int i;
        int i2 = 2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = Result.Companion;
            if (responseVar.getWeight() >= response.Bold.getWeight()) {
                int i3 = asInterface + 3;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                i = 1;
            } else {
                i = 0;
            }
            Typeface typefaceOnWarmupCompleted = this.onWarmupCompleted.get(responseVar);
            if (typefaceOnWarmupCompleted == null) {
                typefaceOnWarmupCompleted = ResourcesCompat.onWarmupCompleted(context, responseVar.getResId(), new TypedValue(), i, (ResourcesCompat.FontCallback) null);
                if (typefaceOnWarmupCompleted != null) {
                    int i5 = IAuthTabCallbackDefault + 71;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    this.onWarmupCompleted.put(responseVar, typefaceOnWarmupCompleted);
                } else {
                    typefaceOnWarmupCompleted = null;
                }
            }
            obj = Result.constructor-impl(typefaceOnWarmupCompleted);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!Result.onExtraCallback(obj)) {
            obj2 = obj;
        } else {
            int i7 = asInterface + 31;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return (Typeface) obj2;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.clear();
        CacheRealCacheRequest1.onExtraCallback.IAuthTabCallback();
        int i4 = IAuthTabCallbackDefault + 71;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final setDone onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                setDone.onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setDone setdoneOnExtraCallbackWithResult = setDone.onExtraCallbackWithResult();
            int i3 = onWarmupCompleted + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return setdoneOnExtraCallbackWithResult;
        }
    }

    static {
        int i = IAuthTabCallbackStub + 109;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 33 / 0;
        }
    }

    private static final Function1 onExtraCallback(setDone setdone, String str) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Function1) onExtraCallback(-1305194985, iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{setdone, str}, iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), 1305194985);
    }

    private static final Unit IAuthTabCallback(setDone setdone, String str, Throwable th) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        return (Unit) onExtraCallback(1885362634, iOnExtraCallback, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{setdone, str, th}, iOnExtraCallback2, ICustomTabsCallbackStubProxy.onExtraCallback(), -1885362633);
    }
}
