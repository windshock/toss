package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class followRedirects {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final followRedirects onExtraCallbackWithResult = new followRedirects();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 51;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | (~i5) | i)) | (~(i | i3 | i5));
        int i10 = ~i;
        int i11 = (~(i5 | i3)) | (~(i10 | i5)) | (~(i10 | i3));
        int i12 = i + i3 + i4 + (1698977638 * i6) + (1466394737 * i2);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i) - 490274816) + ((-1116082190) * i3) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i4) + (1553727488 * i6) + (1859780608 * i2) + (925827072 * i13);
        int i15 = ((i * (-1787956080)) - 1478154965) + (i3 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i4 * (-1787955639)) + (i6 * 552005654) + (i2 * (-2013897159)) + (i13 * (-429457408));
        return i14 + ((i15 * i15) * (-402587648)) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private followRedirects() {
    }

    public final Context onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Context contextOnWarmupCompleted = getTcfVendorConsentStatus.Companion.onWarmupCompleted();
        int i4 = onNavigationEvent + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return contextOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Context contextIAuthTabCallbackStubProxy = getTcfVendorConsentStatus.Companion.IAuthTabCallbackStubProxy();
        int i4 = onExtraCallback + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return contextIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Resources onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getTcfVendorConsentStatus.Companion.IAuthTabCallbackDefault();
            throw null;
        }
        Resources resourcesIAuthTabCallbackDefault = getTcfVendorConsentStatus.Companion.IAuthTabCallbackDefault();
        int i3 = onNavigationEvent + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return resourcesIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getTcfVendorConsentStatus.Companion.IAuthTabCallback_Parcel();
            obj.hashCode();
            throw null;
        }
        Resources resourcesIAuthTabCallback_Parcel = getTcfVendorConsentStatus.Companion.IAuthTabCallback_Parcel();
        int i3 = onNavigationEvent + 99;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return resourcesIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public final maxAge IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getTcfVendorConsentStatus.Companion.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        maxAge maxageOnExtraCallback = getTcfVendorConsentStatus.Companion.onExtraCallback();
        int i3 = onExtraCallback + 61;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return maxageOnExtraCallback;
        }
        throw null;
    }

    public final void IAuthTabCallback(@NotNull maxAge maxage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxage, "");
        getTcfVendorConsentStatus.Companion.onWarmupCompleted(maxage);
        int i4 = onExtraCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = getTcfVendorConsentStatus.Companion.IAuthTabCallback();
        int i4 = onNavigationEvent + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return fIAuthTabCallback;
        }
        throw null;
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getTcfVendorConsentStatus.Companion.onNavigationEvent(f);
            throw null;
        }
        getTcfVendorConsentStatus.Companion.onNavigationEvent(f);
        int i3 = onNavigationEvent + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            getTcfVendorConsentStatus.Companion.onNavigationEvent(context);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            getTcfVendorConsentStatus.Companion.onNavigationEvent(context);
            int i3 = 78 / 0;
        }
    }

    public final TypedValue onWarmupCompleted(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TypedValue typedValueOnWarmupCompleted = C0082dispatcher.onExtraCallbackWithResult.onWarmupCompleted(context, i);
        int i5 = onNavigationEvent + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return typedValueOnWarmupCompleted;
    }

    public final Context onExtraCallbackWithResult() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Context) IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, 603441979, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3);
    }

    public final Resources onTransact() {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Resources) IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this}, -1316113811, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3);
    }
}
