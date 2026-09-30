package im.toss.tds.view.component.atom.badge;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import im.toss.tds.foundation.graphics.drawable.RoundDrawable;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.O0;
import o.OkHttpClientCompanion;
import o.R0;
import o.RequestBodyCompanion;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.access15300;
import o.accessgetTlsVersionsAsStringp;
import o.authParams;
import o.connectionCount;
import o.deprecated_cacheResponse;
import o.eExternalSyntheticLambda0;
import o.getUrlokhttp;
import o.matches;
import o.response;
import o.setBodyokhttp;
import o.setCacheokhttp;
import o.setHeadersokhttp;
import o.setVisitUrl;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsBadgeV1View extends BaseTextView {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int getInterfaceDescriptor;
    private final Lazy IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final Lazy IAuthTabCallback_Parcel;
    private onExtraCallback access000;
    private onWarmupCompleted access100;
    private int asBinder;
    private boolean asInterface;
    private final Lazy onExtraCallback;
    private float onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private IAuthTabCallback onTransact;
    private O0 onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.FILL_ROUND.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallback.WEAK.ordinal()] = 3;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onExtraCallback.WEAK_ROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr;
            int i4 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i6 | i7;
        int i9 = (~(i5 | i4)) | i6;
        int i10 = ~i5;
        int i11 = (~(i4 | i5 | i6)) | (~(i7 | i10)) | (~((~i6) | i10));
        int i12 = i5 + i6 + i3 + (1609234610 * i) + (1307081305 * i2);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i5) - 1772093440) + (1576585830 * i6) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i3) + ((-2101346304) * i) + (23068672 * i2) + ((-2103967744) * i13);
        int i15 = (i5 * 273352028) + 245730370 + (i6 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i3 * 273352337) + (i * (-770635566)) + (i2 * (-73506199)) + (i13 * (-2011693056));
        int i16 = i14 + (i15 * i15 * 1080557568);
        if (i16 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 2) {
            return onExtraCallback(objArr);
        }
        if (i16 == 3) {
            return IAuthTabCallback(objArr);
        }
        TdsBadgeV1View tdsBadgeV1View = (TdsBadgeV1View) objArr[0];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        int i17 = 2 % 2;
        int i18 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i18 % 128;
        int i19 = i18 % 2;
        tdsBadgeV1View.onTransact = iAuthTabCallback;
        tdsBadgeV1View.onExtraCallbackWithResult = tdsBadgeV1View.IAuthTabCallback(iAuthTabCallback.getToken());
        tdsBadgeV1View.onWarmupCompleted = R0.onExtraCallback().onExtraCallback(tdsBadgeV1View.onExtraCallbackWithResult);
        int i20 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    public static /* synthetic */ Integer[] onExtraCallback(TdsBadgeV1View tdsBadgeV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Integer[] numArrIAuthTabCallback = IAuthTabCallback(tdsBadgeV1View);
        int i4 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return numArrIAuthTabCallback;
    }

    public static /* synthetic */ Integer[] onExtraCallbackWithResult(TdsBadgeV1View tdsBadgeV1View) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Integer[] numArrAsInterface = asInterface(tdsBadgeV1View);
        int i4 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return numArrAsInterface;
    }

    public static /* synthetic */ Integer[] onNavigationEvent(TdsBadgeV1View tdsBadgeV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(tdsBadgeV1View);
            throw null;
        }
        Integer[] numArrIAuthTabCallbackDefault = IAuthTabCallbackDefault(tdsBadgeV1View);
        int i3 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return numArrIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Integer[] onWarmupCompleted(TdsBadgeV1View tdsBadgeV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Integer[] numArrAsBinder = asBinder(tdsBadgeV1View);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return numArrAsBinder;
    }

    @Deprecated
    public final void setCustom() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setCustom$default(this, 0, 0, 3, null);
        int i4 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public final void setCustom(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            setCustom$default(this, i, 1, 3, null);
        } else {
            setCustom$default(this, i, 0, 2, null);
        }
    }

    public final void setTheme() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            setTheme$default(this, null, null, null, null, null, 99, null);
        } else {
            setTheme$default(this, null, null, null, null, null, 31, null);
        }
        int i3 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTheme(@NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        setTheme$default(this, onwarmupcompleted, null, null, null, null, 30, null);
        int i4 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTheme(@NotNull onWarmupCompleted onwarmupcompleted, @NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        setTheme$default(this, onwarmupcompleted, onextracallback, null, null, null, 28, null);
        int i4 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTheme(@NotNull onWarmupCompleted onwarmupcompleted, @NotNull onExtraCallback onextracallback, @NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        setTheme$default(this, onwarmupcompleted, onextracallback, iAuthTabCallback, null, null, i3 != 0 ? 27 : 24, null);
        int i4 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTheme(@NotNull onWarmupCompleted onwarmupcompleted, @NotNull onExtraCallback onextracallback, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        setTheme$default(this, onwarmupcompleted, onextracallback, iAuthTabCallback, num, null, 16, null);
        int i4 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private final Integer[] asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer[] numArr = (Integer[]) this.IAuthTabCallback_Parcel.getValue();
        int i3 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return numArr;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Integer[] IAuthTabCallbackDefault(TdsBadgeV1View tdsBadgeV1View) {
        int i = 2 % 2;
        int iOnNavigationEvent = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.TextOnFillBrand);
        authParams authparams = authParams.TextOnFill;
        int iOnNavigationEvent2 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authparams);
        int iOnNavigationEvent3 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authparams);
        int iOnNavigationEvent4 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authparams);
        int iOnNavigationEvent5 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.TextOnFillWarning);
        int iOnNavigationEvent6 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authparams);
        Context context = tdsBadgeV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iICustomTabsCallbackStubProxy = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).ICustomTabsCallbackStubProxy();
        Context context2 = tdsBadgeV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        Object[] objArr = {new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        Integer[] numArr = {Integer.valueOf(iOnNavigationEvent), Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(iOnNavigationEvent3), Integer.valueOf(iOnNavigationEvent4), Integer.valueOf(iOnNavigationEvent5), Integer.valueOf(iOnNavigationEvent6), Integer.valueOf(iICustomTabsCallbackStubProxy), Integer.valueOf(((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue())};
        int i2 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return numArr;
        }
        throw null;
    }

    private final Integer[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Integer[] numArr = (Integer[]) this.onExtraCallback.getValue();
        int i4 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return numArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Integer[] asBinder(TdsBadgeV1View tdsBadgeV1View) {
        int i = 2 % 2;
        int iOnNavigationEvent = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.TextBrand);
        int iOnWarmupCompleted = OkHttpClientCompanion.onWarmupCompleted(tdsBadgeV1View, eExternalSyntheticLambda0.BadgeTextOnTealWeak);
        int iOnNavigationEvent2 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.TextSuccess);
        int iOnNavigationEvent3 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.TextDanger);
        int iOnNavigationEvent4 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.TextWarning);
        int iOnNavigationEvent5 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.TextSecondary);
        Context context = tdsBadgeV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -880609169, 880609173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        Context context2 = tdsBadgeV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        Integer[] numArr = {Integer.valueOf(iOnNavigationEvent), Integer.valueOf(iOnWarmupCompleted), Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(iOnNavigationEvent3), Integer.valueOf(iOnNavigationEvent4), Integer.valueOf(iOnNavigationEvent5), Integer.valueOf(iIntValue), Integer.valueOf(((Integer) setHeadersokhttp.onExtraCallbackWithResult(455174542, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), -455174528, matches.onExtraCallback())).intValue())};
        int i2 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return numArr;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsBadgeV1View tdsBadgeV1View = (TdsBadgeV1View) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Integer[] numArr = (Integer[]) tdsBadgeV1View.IAuthTabCallbackDefault.getValue();
        if (i3 == 0) {
            return numArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Integer[] asInterface(TdsBadgeV1View tdsBadgeV1View) {
        int i = 2 % 2;
        int iOnNavigationEvent = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.FillBrand);
        int iOnWarmupCompleted = OkHttpClientCompanion.onWarmupCompleted(tdsBadgeV1View, eExternalSyntheticLambda0.BadgeFillTeal);
        int iOnNavigationEvent2 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.FillSuccess);
        int iOnNavigationEvent3 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.FillDanger);
        int iOnNavigationEvent4 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.FillWarning);
        int iOnNavigationEvent5 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.FillNeutral);
        Context context = tdsBadgeV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -880609169, 880609173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        Context context2 = tdsBadgeV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        Integer[] numArr = {Integer.valueOf(iOnNavigationEvent), Integer.valueOf(iOnWarmupCompleted), Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(iOnNavigationEvent3), Integer.valueOf(iOnNavigationEvent4), Integer.valueOf(iOnNavigationEvent5), Integer.valueOf(iIntValue), Integer.valueOf(((Integer) setHeadersokhttp.onExtraCallbackWithResult(455174542, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), -455174528, matches.onExtraCallback())).intValue())};
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return numArr;
    }

    private final Integer[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Integer[] numArr = (Integer[]) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackStubProxy + 1;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return numArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Integer[] IAuthTabCallback(TdsBadgeV1View tdsBadgeV1View) {
        int i = 2 % 2;
        int iOnNavigationEvent = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.FillBrandWeak);
        int iOnWarmupCompleted = OkHttpClientCompanion.onWarmupCompleted(tdsBadgeV1View, eExternalSyntheticLambda0.BadgeFillTealWeak);
        int iOnNavigationEvent2 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.FillSuccessWeak);
        int iOnNavigationEvent3 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.FillDangerWeak);
        int iOnNavigationEvent4 = RequestBodyCompanion.onNavigationEvent(tdsBadgeV1View, authParams.FillWarningWeak);
        int iOnWarmupCompleted2 = OkHttpClientCompanion.onWarmupCompleted(tdsBadgeV1View, eExternalSyntheticLambda0.BadgeFillGrey);
        Context context = tdsBadgeV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -880609169, 880609173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        Context context2 = tdsBadgeV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        Integer[] numArr = {Integer.valueOf(iOnNavigationEvent), Integer.valueOf(iOnWarmupCompleted), Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(iOnNavigationEvent3), Integer.valueOf(iOnNavigationEvent4), Integer.valueOf(iOnWarmupCompleted2), Integer.valueOf(iIntValue), Integer.valueOf(((Integer) setHeadersokhttp.onExtraCallbackWithResult(455174542, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), -455174528, matches.onExtraCallback())).intValue())};
        int i2 = IAuthTabCallbackStubProxy + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return numArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsBadgeV1View(@NotNull Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Integer[] numArrOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    numArrOnNavigationEvent = TdsBadgeV1View.onNavigationEvent(this.f$0);
                    int i3 = 91 / 0;
                } else {
                    numArrOnNavigationEvent = TdsBadgeV1View.onNavigationEvent(this.f$0);
                }
                int i4 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return numArrOnNavigationEvent;
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 63;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Integer[] numArrOnWarmupCompleted = TdsBadgeV1View.onWarmupCompleted(this.f$0);
                int i4 = IAuthTabCallback + 85;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return numArrOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Integer[] numArrOnExtraCallbackWithResult = TdsBadgeV1View.onExtraCallbackWithResult(this.f$0);
                int i4 = onExtraCallback + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return numArrOnExtraCallbackWithResult;
            }
        });
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TdsBadgeV1View tdsBadgeV1View = this.f$0;
                if (i3 == 0) {
                    return TdsBadgeV1View.onExtraCallback(tdsBadgeV1View);
                }
                TdsBadgeV1View.onExtraCallback(tdsBadgeV1View);
                throw null;
            }
        });
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        this.asBinder = ((Integer[]) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, 451563823, -451563820))[0].intValue();
        this.IAuthTabCallbackStub = asBinder()[0].intValue();
        this.access100 = onWarmupCompleted.BLUE;
        this.access000 = onExtraCallback.FILL_ROUND;
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.LARGE;
        this.onTransact = iAuthTabCallback;
        this.onExtraCallbackWithResult = IAuthTabCallback(iAuthTabCallback.getToken());
        this.onWarmupCompleted = R0.onExtraCallback().onExtraCallback(this.onExtraCallbackWithResult);
        this.asInterface = true;
        onNavigationEvent(this, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsBadgeV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Integer[] numArrOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    numArrOnNavigationEvent = TdsBadgeV1View.onNavigationEvent(this.f$0);
                    int i3 = 91 / 0;
                } else {
                    numArrOnNavigationEvent = TdsBadgeV1View.onNavigationEvent(this.f$0);
                }
                int i4 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return numArrOnNavigationEvent;
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 63;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Integer[] numArrOnWarmupCompleted = TdsBadgeV1View.onWarmupCompleted(this.f$0);
                int i4 = IAuthTabCallback + 85;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return numArrOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Integer[] numArrOnExtraCallbackWithResult = TdsBadgeV1View.onExtraCallbackWithResult(this.f$0);
                int i4 = onExtraCallback + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return numArrOnExtraCallbackWithResult;
            }
        });
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TdsBadgeV1View tdsBadgeV1View = this.f$0;
                if (i3 == 0) {
                    return TdsBadgeV1View.onExtraCallback(tdsBadgeV1View);
                }
                TdsBadgeV1View.onExtraCallback(tdsBadgeV1View);
                throw null;
            }
        });
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        this.asBinder = ((Integer[]) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, 451563823, -451563820))[0].intValue();
        this.IAuthTabCallbackStub = asBinder()[0].intValue();
        this.access100 = onWarmupCompleted.BLUE;
        this.access000 = onExtraCallback.FILL_ROUND;
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.LARGE;
        this.onTransact = iAuthTabCallback;
        this.onExtraCallbackWithResult = IAuthTabCallback(iAuthTabCallback.getToken());
        this.onWarmupCompleted = R0.onExtraCallback().onExtraCallback(this.onExtraCallbackWithResult);
        this.asInterface = true;
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3, new Object[]{this, attributeSet}, 1165339876, -1165339874);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsBadgeV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Integer[] numArrOnNavigationEvent;
                int i2 = 2 % 2;
                int i22 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i22 % 128;
                if (i22 % 2 == 0) {
                    numArrOnNavigationEvent = TdsBadgeV1View.onNavigationEvent(this.f$0);
                    int i3 = 91 / 0;
                } else {
                    numArrOnNavigationEvent = TdsBadgeV1View.onNavigationEvent(this.f$0);
                }
                int i4 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return numArrOnNavigationEvent;
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = IAuthTabCallback + 63;
                onExtraCallback = i22 % 128;
                int i3 = i22 % 2;
                Integer[] numArrOnWarmupCompleted = TdsBadgeV1View.onWarmupCompleted(this.f$0);
                int i4 = IAuthTabCallback + 85;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return numArrOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onExtraCallback + 35;
                IAuthTabCallback = i22 % 128;
                int i3 = i22 % 2;
                Integer[] numArrOnExtraCallbackWithResult = TdsBadgeV1View.onExtraCallbackWithResult(this.f$0);
                int i4 = onExtraCallback + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return numArrOnExtraCallbackWithResult;
            }
        });
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.view.component.atom.badge.TdsBadgeV1View$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onNavigationEvent + 23;
                onWarmupCompleted = i22 % 128;
                int i3 = i22 % 2;
                TdsBadgeV1View tdsBadgeV1View = this.f$0;
                if (i3 == 0) {
                    return TdsBadgeV1View.onExtraCallback(tdsBadgeV1View);
                }
                TdsBadgeV1View.onExtraCallback(tdsBadgeV1View);
                throw null;
            }
        });
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        this.asBinder = ((Integer[]) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, 451563823, -451563820))[0].intValue();
        this.IAuthTabCallbackStub = asBinder()[0].intValue();
        this.access100 = onWarmupCompleted.BLUE;
        this.access000 = onExtraCallback.FILL_ROUND;
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.LARGE;
        this.onTransact = iAuthTabCallback;
        this.onExtraCallbackWithResult = IAuthTabCallback(iAuthTabCallback.getToken());
        this.onWarmupCompleted = R0.onExtraCallback().onExtraCallback(this.onExtraCallbackWithResult);
        this.asInterface = true;
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3, new Object[]{this, attributeSet}, 1165339876, -1165339874);
    }

    static /* synthetic */ void onNavigationEvent(TdsBadgeV1View tdsBadgeV1View, AttributeSet attributeSet, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallbackStubProxy + 19;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{tdsBadgeV1View, attributeSet}, 1165339876, -1165339874);
        int i5 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.widget.TextView, im.toss.tds.view.component.atom.badge.TdsBadgeV1View, im.toss.tds.view.component.atom.text.BaseTextView, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r1 = (TdsBadgeV1View) objArr[0];
        AttributeSet attributeSet = (AttributeSet) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = r1.getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsBadgeV1View, 0, 0);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) onWarmupCompleted.getEntries().get(typedArrayObtainStyledAttributes.getInt(R.styleable.TdsBadgeV1View_tdsBadgeType, 0));
                onExtraCallback onextracallback = (onExtraCallback) onExtraCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(R.styleable.TdsBadgeV1View_tdsBadgeStyle, 0));
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) IAuthTabCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(R.styleable.TdsBadgeV1View_tdsBadgeSize, 0));
                O0 o0OnExtraCallback = R0.onExtraCallback().onExtraCallback(r1.IAuthTabCallback(iAuthTabCallback.getToken()));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TdsBadgeV1View_android_paddingLeft, varyMatches.IAuthTabCallback((View) r1, Integer.valueOf(o0OnExtraCallback.onExtraCallbackWithResult())));
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TdsBadgeV1View_android_paddingRight, varyMatches.IAuthTabCallback((View) r1, Integer.valueOf(o0OnExtraCallback.onExtraCallbackWithResult())));
                int i4 = R.styleable.TdsBadgeV1View_tdsBadgeCustomBackgroundColor;
                int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                ((TdsBadgeV1View) r1).asBinder = typedArrayObtainStyledAttributes.getColor(i4, ((Integer[]) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{r1}, 451563823, -451563820))[0].intValue());
                ((TdsBadgeV1View) r1).IAuthTabCallbackStub = typedArrayObtainStyledAttributes.getColor(R.styleable.TdsBadgeV1View_tdsBadgeCustomTextColor, r1.asBinder()[0].intValue());
                ((TdsBadgeV1View) r1).asInterface = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TdsBadgeV1View_followNightMode, true);
                r1.setTheme(onwarmupcompleted, onextracallback, iAuthTabCallback, Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize2));
                typedArrayObtainStyledAttributes.recycle();
            }
        } else if (attributeSet != null) {
        }
        r1.onNavigationEvent(response.Bold);
        r1.setGravity(17);
        int i5 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private final int onWarmupCompleted(onWarmupCompleted onwarmupcompleted, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted onwarmupcompleted2 = onWarmupCompleted.CUSTOM;
            throw null;
        }
        if (onwarmupcompleted == onWarmupCompleted.CUSTOM) {
            int i3 = this.IAuthTabCallbackStub;
            int i4 = IAuthTabCallbackStubProxy + 19;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            return i3;
        }
        int i6 = onNavigationEvent.onExtraCallback[onextracallback.ordinal()];
        if (i6 != 1) {
            int i7 = getInterfaceDescriptor;
            int i8 = i7 + 93;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            if (i6 != 2) {
                int i10 = i7 + 125;
                IAuthTabCallbackStubProxy = i10 % 128;
                if (i10 % 2 != 0) {
                    return onExtraCallback()[onwarmupcompleted.getIndex()].intValue();
                }
                onExtraCallback()[onwarmupcompleted.getIndex()].intValue();
                throw null;
            }
        }
        return asBinder()[onwarmupcompleted.getIndex()].intValue();
    }

    private final int IAuthTabCallback(onWarmupCompleted onwarmupcompleted, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent.onExtraCallback[onextracallback.ordinal()];
        if (i4 == 3 || i4 == 4) {
            return IAuthTabCallback()[onwarmupcompleted.getIndex()].intValue();
        }
        int i5 = IAuthTabCallbackStubProxy + 95;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iIntValue = ((Integer[]) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, 451563823, -451563820))[onwarmupcompleted.getIndex()].intValue();
        int i7 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return iIntValue;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsBadgeV1View tdsBadgeV1View = (TdsBadgeV1View) objArr[0];
        Integer num = (Integer) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            int i2 = getInterfaceDescriptor + 111;
            IAuthTabCallbackStubProxy = i2 % 128;
            num = null;
            if (i2 % 2 == 0) {
                num.hashCode();
                throw null;
            }
        }
        Drawable drawableOnExtraCallbackWithResult = tdsBadgeV1View.onExtraCallbackWithResult(num);
        int i3 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        return drawableOnExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable onExtraCallbackWithResult(@Nullable Integer num) {
        int iIAuthTabCallback;
        int i;
        int i2;
        int iAlpha;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 85;
        int i5 = i4 % 128;
        getInterfaceDescriptor = i5;
        int i6 = i4 % 2;
        if (num != null) {
            int i7 = i5 + 93;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            iIAuthTabCallback = num.intValue();
        } else {
            onWarmupCompleted onwarmupcompleted = this.access100;
            if (onwarmupcompleted != onWarmupCompleted.CUSTOM) {
                iIAuthTabCallback = IAuthTabCallback(onwarmupcompleted, this.access000);
            } else {
                int i9 = getInterfaceDescriptor + 109;
                IAuthTabCallbackStubProxy = i9 % 128;
                if (i9 % 2 == 0) {
                    i = this.asBinder;
                    i2 = 30172;
                } else {
                    i = this.asBinder;
                    i2 = 255;
                }
                iIAuthTabCallback = VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(i, i2);
            }
        }
        int i10 = iIAuthTabCallback;
        float fIAuthTabCallback = varyMatches.IAuthTabCallback((View) this, (Number) Float.valueOf(999.0f));
        if (this.access100 != onWarmupCompleted.CUSTOM) {
            iAlpha = Color.alpha(i10);
        } else {
            int i11 = getInterfaceDescriptor + 1;
            IAuthTabCallbackStubProxy = i11 % 128;
            if (i11 % 2 == 0) {
                Color.alpha(this.asBinder);
                throw null;
            }
            iAlpha = Color.alpha(this.asBinder);
        }
        RoundDrawable roundDrawable = new RoundDrawable(i10, fIAuthTabCallback, 0, true, 4, null);
        roundDrawable.setAlpha((int) ((iAlpha / 255.0f) * 255.0f));
        return roundDrawable;
    }

    public static /* synthetic */ void setTheme$default(TdsBadgeV1View tdsBadgeV1View, onWarmupCompleted onwarmupcompleted, onExtraCallback onextracallback, IAuthTabCallback iAuthTabCallback, Integer num, Integer num2, int i, Object obj) {
        Integer num3;
        Integer num4;
        onExtraCallback onextracallback2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            onwarmupcompleted = tdsBadgeV1View.access100;
            int i3 = IAuthTabCallbackStubProxy + 17;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }
        onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallbackStubProxy + 7;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                onextracallback2 = tdsBadgeV1View.access000;
                int i6 = 44 / 0;
            } else {
                onextracallback2 = tdsBadgeV1View.access000;
            }
            onextracallback = onextracallback2;
        }
        onExtraCallback onextracallback3 = onextracallback;
        if ((i & 4) != 0) {
            iAuthTabCallback = tdsBadgeV1View.onTransact;
            int i7 = IAuthTabCallbackStubProxy + 105;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        if ((i & 8) != 0) {
            int i9 = getInterfaceDescriptor + 95;
            IAuthTabCallbackStubProxy = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 22 / 0;
            }
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 16) != 0) {
            int i11 = IAuthTabCallbackStubProxy + 55;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            num4 = null;
        } else {
            num4 = num2;
        }
        tdsBadgeV1View.setTheme(onwarmupcompleted2, onextracallback3, iAuthTabCallback2, num3, num4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTheme(@NotNull onWarmupCompleted onwarmupcompleted, @NotNull onExtraCallback onextracallback, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable Integer num, @Nullable Integer num2) {
        int iIAuthTabCallback;
        int iIAuthTabCallback2;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.access100 = onwarmupcompleted;
        this.access000 = onextracallback;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this, iAuthTabCallback}, 692865931, -692865931);
        setTextColor(onWarmupCompleted(onwarmupcompleted, onextracallback));
        setTextSize(1, this.onExtraCallbackWithResult);
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        setBackground((Drawable) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3, new Object[]{this, null, 1, null}, 440037958, -440037957));
        setMinimumHeight(varyMatches.IAuthTabCallback((View) this, (Number) Float.valueOf(setCacheokhttp.onNavigationEvent(iAuthTabCallback))));
        if (num != null) {
            int i4 = getInterfaceDescriptor + 15;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            iIAuthTabCallback = num.intValue();
        } else {
            iIAuthTabCallback = varyMatches.IAuthTabCallback((View) this, (Number) Integer.valueOf(this.onWarmupCompleted.onExtraCallbackWithResult()));
        }
        if (num2 != null) {
            iIAuthTabCallback2 = num2.intValue();
            int i6 = IAuthTabCallbackStubProxy + 81;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iIAuthTabCallback2 = varyMatches.IAuthTabCallback((View) this, (Number) Integer.valueOf(this.onWarmupCompleted.onExtraCallbackWithResult()));
        }
        int iIAuthTabCallback3 = varyMatches.IAuthTabCallback((View) this, (Number) Integer.valueOf(this.onWarmupCompleted.IAuthTabCallback()));
        setPadding(iIAuthTabCallback, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback3);
    }

    public final void setTheme(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            onextracallbackwithresult.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onWarmupCompleted onWarmupCompleted2 = onextracallbackwithresult.onWarmupCompleted();
        if (onWarmupCompleted2 == null) {
            onWarmupCompleted2 = this.access100;
        }
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted2;
        onExtraCallback onextracallbackOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
        if (onextracallbackOnExtraCallbackWithResult == null) {
            onextracallbackOnExtraCallbackWithResult = this.access000;
            int i3 = IAuthTabCallbackStubProxy + 101;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }
        onExtraCallback onextracallback = onextracallbackOnExtraCallbackWithResult;
        IAuthTabCallback IAuthTabCallback2 = onextracallbackwithresult.IAuthTabCallback();
        if (IAuthTabCallback2 == null) {
            IAuthTabCallback2 = this.onTransact;
        }
        setTheme$default(this, onwarmupcompleted, onextracallback, IAuthTabCallback2, null, null, 24, null);
    }

    public static /* synthetic */ void setCustom$default(TdsBadgeV1View tdsBadgeV1View, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy;
        int i6 = i5 + 111;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0 && (i3 & 1) != 0) {
            i = tdsBadgeV1View.asBinder;
        }
        if ((i3 & 2) != 0) {
            int i7 = i5 + 119;
            int i8 = i7 % 128;
            getInterfaceDescriptor = i8;
            if (i7 % 2 != 0) {
                int i9 = tdsBadgeV1View.IAuthTabCallbackStub;
                throw null;
            }
            int i10 = tdsBadgeV1View.IAuthTabCallbackStub;
            int i11 = i8 + 97;
            IAuthTabCallbackStubProxy = i11 % 128;
            int i12 = i11 % 2;
            i2 = i10;
        }
        tdsBadgeV1View.setCustom(i, i2);
    }

    @Deprecated
    public final void setCustom(int i, int i2) {
        onWarmupCompleted onwarmupcompleted;
        onExtraCallback onextracallback;
        IAuthTabCallback iAuthTabCallback;
        Integer num;
        Integer num2;
        int i3;
        int i4 = 2 % 2;
        int i5 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            this.access100 = onWarmupCompleted.CUSTOM;
            this.asBinder = i;
            this.IAuthTabCallbackStub = i2;
            onwarmupcompleted = null;
            onextracallback = null;
            iAuthTabCallback = null;
            num = null;
            num2 = null;
            i3 = 93;
        } else {
            this.access100 = onWarmupCompleted.CUSTOM;
            this.asBinder = i;
            this.IAuthTabCallbackStub = i2;
            onwarmupcompleted = null;
            onextracallback = null;
            iAuthTabCallback = null;
            num = null;
            num2 = null;
            i3 = 31;
        }
        setTheme$default(this, onwarmupcompleted, onextracallback, iAuthTabCallback, num, num2, i3, null);
        int i6 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bw_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.text_sub_typography_11;
        int i5 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bv_() {
        int i;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.dimen.text_sub_typography_11;
            int i4 = 48 / 0;
        } else {
            i = R.dimen.text_sub_typography_11;
        }
        int i5 = IAuthTabCallbackStubProxy + 95;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float IAuthTabCallback(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp) {
        int i = 2 % 2;
        float fOnExtraCallback = connectionCount.onExtraCallback(new connectionCount(O0.Companion.IAuthTabCallback(deprecated_cacheResponse.onExtraCallbackWithResult(this, new connectionCount(accessgettlsversionsasstringp.getSize(), Float.MAX_VALUE), 0.0f, 2, (Object) null)), 0.0f, 2, null), 1.0f, 0.0f, 2, null);
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return fOnExtraCallback;
    }

    public static final class onExtraCallbackWithResult {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final onExtraCallback IAuthTabCallback;
        private final IAuthTabCallback onExtraCallback;
        private final onWarmupCompleted onExtraCallbackWithResult;

        public onExtraCallbackWithResult() {
            this(null, null, null, 7, null);
        }

        public onExtraCallbackWithResult(@Nullable onWarmupCompleted onwarmupcompleted, @Nullable onExtraCallback onextracallback, @Nullable IAuthTabCallback iAuthTabCallback) {
            this.onExtraCallbackWithResult = onwarmupcompleted;
            this.IAuthTabCallback = onextracallback;
            this.onExtraCallback = iAuthTabCallback;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, onExtraCallback onextracallback, IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 75;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 5;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                onwarmupcompleted = null;
            }
            if ((i & 2) != 0) {
                int i7 = onWarmupCompleted + 39;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 9 / 0;
                }
                onextracallback = null;
            }
            if ((i & 4) != 0) {
                int i9 = onWarmupCompleted + 39;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 2 % 2;
                }
                iAuthTabCallback = null;
            }
            this(onwarmupcompleted, onextracallback, iAuthTabCallback);
        }

        public final onWarmupCompleted onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 27 / 0;
            }
            return onwarmupcompleted;
        }

        public final onExtraCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = this.IAuthTabCallback;
            if (i3 != 0) {
                int i4 = 59 / 0;
            }
            return onextracallback;
        }

        public final IAuthTabCallback IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 4 / 0;
            }
            return iAuthTabCallback;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final int index;
        public static final onWarmupCompleted BLUE = new onWarmupCompleted("BLUE", 0, 0);
        public static final onWarmupCompleted TEAL = new onWarmupCompleted("TEAL", 1, 1);
        public static final onWarmupCompleted GREEN = new onWarmupCompleted("GREEN", 2, 2);
        public static final onWarmupCompleted RED = new onWarmupCompleted("RED", 3, 3);
        public static final onWarmupCompleted YELLOW = new onWarmupCompleted("YELLOW", 4, 4);
        public static final onWarmupCompleted ELEPHANT = new onWarmupCompleted("ELEPHANT", 5, 5);
        public static final onWarmupCompleted LIGHT = new onWarmupCompleted("LIGHT", 6, 6);

        @Deprecated
        public static final onWarmupCompleted CUSTOM = new onWarmupCompleted("CUSTOM", 7, 7);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 57;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {BLUE, TEAL, GREEN, RED, YELLOW, ELEPHANT, LIGHT, CUSTOM};
            int i5 = i2 + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompleted;
            }
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i, int i2) {
            this.index = i2;
        }

        public final int getIndex() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.index;
            int i6 = i3 + 25;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 83;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final int index;

        @Deprecated
        public static final onExtraCallback FILL = new onExtraCallback("FILL", 0, 0);

        @Deprecated
        public static final onExtraCallback OUTLINE = new onExtraCallback("OUTLINE", 1, 1);

        @Deprecated
        public static final onExtraCallback WEAK = new onExtraCallback("WEAK", 2, 2);
        public static final onExtraCallback FILL_ROUND = new onExtraCallback("FILL_ROUND", 3, 3);

        @Deprecated
        public static final onExtraCallback OUTLINE_ROUND = new onExtraCallback("OUTLINE_ROUND", 4, 4);
        public static final onExtraCallback WEAK_ROUND = new onExtraCallback("WEAK_ROUND", 5, 5);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {FILL, OUTLINE, WEAK, FILL_ROUND, OUTLINE_ROUND, WEAK_ROUND};
            int i5 = i3 + 67;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = IAuthTabCallback + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        private onExtraCallback(String str, int i, int i2) {
            this.index = i2;
        }

        public final int getIndex() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.index;
            int i6 = i3 + 65;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallback + 69;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 9 / 0;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallback LARGE = new IAuthTabCallback("LARGE", 0, accessgetTlsVersionsAsStringp.Typography1);
        public static final IAuthTabCallback MEDIUM = new IAuthTabCallback("MEDIUM", 1, accessgetTlsVersionsAsStringp.Typography2);
        public static final IAuthTabCallback SMALL = new IAuthTabCallback("SMALL", 2, accessgetTlsVersionsAsStringp.Typography3);
        public static final IAuthTabCallback TINY = new IAuthTabCallback("TINY", 3, accessgetTlsVersionsAsStringp.Typography4);
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final accessgetTlsVersionsAsStringp token;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {LARGE, MEDIUM, SMALL, TINY};
            int i5 = i3 + 33;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            EnumEntries<IAuthTabCallback> enumEntries;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 61;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                enumEntries = $ENTRIES;
                int i4 = 27 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 83;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
            int i5 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 39 / 0;
            }
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i3 = 20 / 0;
            } else {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            }
            int i4 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp) {
            this.token = accessgettlsversionsasstringp;
        }

        public final accessgetTlsVersionsAsStringp getToken() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = this.token;
            if (i3 != 0) {
                int i4 = 70 / 0;
            }
            return accessgettlsversionsasstringp;
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onNavigationEvent + 51;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static /* synthetic */ Drawable IAuthTabCallback(TdsBadgeV1View tdsBadgeV1View, Integer num, int i, Object obj) {
        Object[] objArr = {tdsBadgeV1View, num, Integer.valueOf(i), obj};
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Drawable) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, objArr, 440037958, -440037957);
    }

    private final Integer[] onNavigationEvent() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Integer[]) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this}, 451563823, -451563820);
    }

    private final void IAuthTabCallback(AttributeSet attributeSet) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this, attributeSet}, 1165339876, -1165339874);
    }

    private final void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, new Object[]{this, iAuthTabCallback}, 692865931, -692865931);
    }
}
