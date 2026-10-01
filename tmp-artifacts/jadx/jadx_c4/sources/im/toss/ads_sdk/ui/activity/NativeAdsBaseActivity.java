package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity$;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.featurescommon.contactsviral.impl.Hilt_ViralNotiBlockActivity;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Response;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.calculatePageOffsets;
import o.deleteProfile;
import o.findResAndMsg;
import o.getAllProfileNames;
import o.getPlatformCallback;
import o.nSetPosition;
import o.setTrimPathOffset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class NativeAdsBaseActivity extends Hilt_NativeAdsBaseActivity {
    private static int extraCallbackWithResult = 1;
    private static int onActivityLayout = 0;
    private static int onMessageChannelReady = 1;
    private static int readTypedObject;
    private boolean IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private AdsCircularCountdownLayout access000;
    private NativeAdsManager access100;
    private boolean extraCallback;
    private boolean getInterfaceDescriptor;
    private Integer writeTypedObject;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onTransact = 8;
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            NativeAdsDto nativeAdsDtoOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                nativeAdsDtoOnExtraCallbackWithResult = NativeAdsBaseActivity.onExtraCallbackWithResult(this.f$0);
                int i3 = 77 / 0;
            } else {
                nativeAdsDtoOnExtraCallbackWithResult = NativeAdsBaseActivity.onExtraCallbackWithResult(this.f$0);
            }
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return nativeAdsDtoOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final Lazy ICustomTabsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity$$ExternalSyntheticLambda1
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            deleteProfile deleteprofileOnWarmupCompleted = NativeAdsBaseActivity.onWarmupCompleted(this.f$0);
            int i4 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return deleteprofileOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final CopyOnWriteArrayList<String> asBinder = new CopyOnWriteArrayList<>();
    private final onWarmupCompleted IAuthTabCallback_Parcel = new onWarmupCompleted();
    private final getAllProfileNames asInterface = new getAllProfileNames();

    static {
        int i = onActivityLayout + 17;
        onMessageChannelReady = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(nativeAdsBaseActivity);
        }
        asBinder(nativeAdsBaseActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i) | i4)) | (~(i | i2));
        int i8 = ~i4;
        int i9 = (~(i8 | i2)) | i;
        int i10 = (~(i2 | i4)) | (~(i8 | (~i2))) | i;
        int i11 = i4 + i + i5 + ((-737137436) * i3) + ((-1840598144) * i6);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i4) - 818937856) + (24099949 * i) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i5) + (1335885824 * i3) + ((-1946157056) * i6) + ((-1593638912) * i12);
        int i14 = (i4 * 1252406331) + 1981669868 + (i * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i5 * 1252407325) + (i3 * (-1820396076)) + (i6 * 1320834432) + (i12 * (-447283200));
        int i15 = i13 + (i14 * i14 * 1511325696);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ boolean onExtraCallback(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(nativeAdsBaseActivity);
        int i4 = readTypedObject + 31;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ NativeAdsDto onExtraCallbackWithResult(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 103;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(nativeAdsBaseActivity);
            throw null;
        }
        NativeAdsDto nativeAdsDtoOnTransact = onTransact(nativeAdsBaseActivity);
        int i3 = readTypedObject + 67;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return nativeAdsDtoOnTransact;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        NativeAdsBaseActivity nativeAdsBaseActivity = (NativeAdsBaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(((Boolean) onExtraCallback(-2039804625, new Object[]{nativeAdsBaseActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 2039804628, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue());
        }
        ((Boolean) onExtraCallback(-2039804625, new Object[]{nativeAdsBaseActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 2039804628, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deleteProfile onWarmupCompleted(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return access100(nativeAdsBaseActivity);
        }
        access100(nativeAdsBaseActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 85;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ NativeAdsManager IAuthTabCallbackDefault(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsManager nativeAdsManager = nativeAdsBaseActivity.access100;
        if (i3 != 0) {
            return nativeAdsManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ NativeAdsDto IAuthTabCallbackStub(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDtoAsInterface = nativeAdsBaseActivity.asInterface();
        int i4 = extraCallbackWithResult + 103;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return nativeAdsDtoAsInterface;
    }

    public static final /* synthetic */ CopyOnWriteArrayList asInterface(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        CopyOnWriteArrayList<String> copyOnWriteArrayList = nativeAdsBaseActivity.asBinder;
        int i5 = i3 + 71;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return copyOnWriteArrayList;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public final NativeAdsDto asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto nativeAdsDto = (NativeAdsDto) this.IAuthTabCallbackStubProxy.getValue();
        int i4 = extraCallbackWithResult + 13;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return nativeAdsDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final NativeAdsDto onTransact(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = nativeAdsBaseActivity.getIntent().getParcelableExtra("native_ads_extra");
        if (i3 != 0) {
            return (NativeAdsDto) parcelableExtra;
        }
        throw null;
    }

    public final deleteProfile asBinder() {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        deleteProfile deleteprofile = (deleteProfile) this.ICustomTabsCallback.getValue();
        int i4 = readTypedObject + 13;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return deleteprofile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final deleteProfile access100(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        deleteProfile deleteprofile = (deleteProfile) deleteProfile.getEntries().get(nativeAdsBaseActivity.getIntent().getIntExtra("native_ads_ui_mode", 0));
        int i4 = extraCallbackWithResult + 91;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return deleteprofile;
        }
        throw null;
    }

    public final NativeAdsManager IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 115;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        NativeAdsManager nativeAdsManager = this.access100;
        int i5 = i2 + 77;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return nativeAdsManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final calculatePageOffsets onNavigationEvent() {
        int i = 2 % 2;
        NativeAdsManager nativeAdsManager = this.access100;
        if (nativeAdsManager == null) {
            int i2 = extraCallbackWithResult + 91;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        calculatePageOffsets calculatepageoffsetsOnExtraCallbackWithResult = nativeAdsManager.onExtraCallbackWithResult();
        int i4 = extraCallbackWithResult + 67;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return calculatepageoffsetsOnExtraCallbackWithResult;
    }

    public static final class onWarmupCompleted implements calculatePageOffsets.onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        onWarmupCompleted() {
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onEvent(NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            super.onEvent(nativeAdsEventLogType);
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public /* bridge */ void onNavigationEvent(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super.onNavigationEvent(charSequence);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void IAuthTabCallback(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(charSequence, "");
                NativeAdsBaseActivity.asInterface(NativeAdsBaseActivity.this).add(charSequence.toString());
                throw null;
            }
            Intrinsics.checkNotNullParameter(charSequence, "");
            NativeAdsBaseActivity.asInterface(NativeAdsBaseActivity.this).add(charSequence.toString());
            int i3 = onNavigationEvent + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                NativeAdsBaseActivity.this.onExtraCallback("VIMP");
                throw null;
            }
            NativeAdsBaseActivity.this.onExtraCallback("VIMP");
            int i3 = IAuthTabCallback + 29;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsBaseActivity.this.onExtraCallback("IMP_1PX");
            int i4 = onNavigationEvent + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
            }
        }

        @Override // o.calculatePageOffsets.onExtraCallbackWithResult
        public void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsBaseActivity.this.onExtraCallback("IMP_100P");
            int i4 = IAuthTabCallback + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 105;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = z;
        int i5 = i2 + 11;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
    }

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return z;
    }

    public static final class onExtraCallbackWithResult implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NativeAdsDto onNavigationEvent;

        public onExtraCallbackWithResult(NativeAdsDto nativeAdsDto) {
            this.onNavigationEvent = nativeAdsDto;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.IAuthTabCallback(this.onNavigationEvent);
                int i4 = onExtraCallback + 19;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable unused) {
            }
        }
    }

    public static final class onNavigationEvent implements Function1<setTrimPathOffset, Unit> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public onNavigationEvent() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((setTrimPathOffset) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void IAuthTabCallback(setTrimPathOffset settrimpathoffset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(settrimpathoffset, "");
            try {
                settrimpathoffset.onNavigationEvent(NativeAdsBaseActivity.this.asInterface());
                int i4 = onExtraCallback + 77;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean asBinder(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        if (!nativeAdsBaseActivity.getInterfaceDescriptor) {
            return false;
        }
        int i2 = readTypedObject + 59;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (nativeAdsBaseActivity.isFinishing()) {
            return false;
        }
        int i4 = readTypedObject + 7;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.app.Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ?? r4 = (NativeAdsBaseActivity) objArr[0];
        int i = 2 % 2;
        if (!((NativeAdsBaseActivity) r4).getInterfaceDescriptor || r4.isFinishing()) {
            return false;
        }
        int i2 = readTypedObject;
        int i3 = i2 + 123;
        extraCallbackWithResult = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 109;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean IAuthTabCallbackStubProxy(NativeAdsBaseActivity nativeAdsBaseActivity) {
        int i = 2 % 2;
        if (!nativeAdsBaseActivity.getInterfaceDescriptor) {
            return false;
        }
        int i2 = readTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (nativeAdsBaseActivity.isFinishing()) {
            return false;
        }
        int i4 = extraCallbackWithResult;
        int i5 = i4 + 9;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 75;
        readTypedObject = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        if (this.writeTypedObject == null) {
            int i2 = extraCallbackWithResult + 1;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                this.writeTypedObject = Integer.valueOf(getRequestedOrientation());
            } else {
                this.writeTypedObject = Integer.valueOf(getRequestedOrientation());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        setRequestedOrientation(1);
        getAllProfileNames getallprofilenames = this.asInterface;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        getallprofilenames.onExtraCallbackWithResult(window);
        int i3 = extraCallbackWithResult + 59;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.app.Activity, im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r4 = (NativeAdsBaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Integer num = ((NativeAdsBaseActivity) r4).writeTypedObject;
        if (num != null) {
            int iIntValue = num.intValue();
            ((NativeAdsBaseActivity) r4).writeTypedObject = null;
            r4.setRequestedOrientation(iIntValue);
            getAllProfileNames getallprofilenames = ((NativeAdsBaseActivity) r4).asInterface;
            Window window = r4.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "");
            getallprofilenames.IAuthTabCallback(window);
        }
        int i4 = extraCallbackWithResult + 81;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        this.getInterfaceDescriptor = true;
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            int i4 = extraCallbackWithResult + 9;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                calculatePageOffsets.onNavigationEvent(calculatepageoffsetsOnNavigationEvent, (findResAndMsg) TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), true, 2, (Object) null);
            } else {
                calculatePageOffsets.onNavigationEvent(calculatepageoffsetsOnNavigationEvent, (findResAndMsg) TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), false, 2, (Object) null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStop();
            if (isFinishing()) {
                int i3 = readTypedObject + 73;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallback(-171283841, new Object[]{this}, Hilt_ViralNotiBlockActivity.1.onNavigationEvent(), Hilt_ViralNotiBlockActivity.1.onNavigationEvent(), 171283843, Hilt_ViralNotiBlockActivity.1.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
            }
            this.getInterfaceDescriptor = false;
            calculatePageOffsets calculatepageoffsetsOnNavigationEvent = onNavigationEvent();
            if (calculatepageoffsetsOnNavigationEvent != null) {
                calculatePageOffsets.onExtraCallbackWithResult(calculatepageoffsetsOnNavigationEvent, false, 1, (Object) null);
            }
            int i5 = readTypedObject + 49;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 80 / 0;
                return;
            }
            return;
        }
        super.onStop();
        isFinishing();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(-171283841, new Object[]{this}, Hilt_ViralNotiBlockActivity.1.onNavigationEvent(), Hilt_ViralNotiBlockActivity.1.onNavigationEvent(), 171283843, Hilt_ViralNotiBlockActivity.1.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        NativeAdsManager nativeAdsManager = this.access100;
        if (nativeAdsManager != null) {
            int i4 = readTypedObject + 101;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                nativeAdsManager.onWarmupCompleted(this.IAuthTabCallback_Parcel);
            } else {
                nativeAdsManager.onWarmupCompleted(this.IAuthTabCallback_Parcel);
                int i5 = 22 / 0;
            }
        }
        super.onDestroy();
        String stringExtra = getIntent().getStringExtra("native_ads_request_id");
        if (stringExtra == null) {
            int i6 = extraCallbackWithResult + 99;
            readTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            getPlatformCallback.IAuthTabCallback.IAuthTabCallback(stringExtra);
        }
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsetsOnNavigationEvent}, 2131831744, -2131831730, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AppCompatActivity appCompatActivity = (NativeAdsBaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Result.Companion companion = Result.Companion;
                appCompatActivity.getWindow().setHideOverlayWindows(true);
                Result.constructor-impl(Unit.INSTANCE);
                int i4 = readTypedObject + 67;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return null;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() throws NoWhenBranchMatchedException {
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault;
        String strIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asInterface();
            throw null;
        }
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        if (nativeAdsDtoAsInterface != null && (nativeAdsManagerIAuthTabCallbackDefault = IAuthTabCallbackDefault(this)) != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = IAuthTabCallbackStub(this);
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                int i3 = extraCallbackWithResult + 125;
                readTypedObject = i3 % 128;
                if (i3 % 2 != 0) {
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                    int i4 = 37 / 0;
                } else {
                    strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
                }
            } else {
                strIAuthTabCallbackStub = null;
            }
            if (strIAuthTabCallbackStub == null) {
                strIAuthTabCallbackStub = "";
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub, new onExtraCallbackWithResult(nativeAdsDtoAsInterface));
            int i5 = extraCallbackWithResult + 71;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
        NativeAdsManager nativeAdsManager = this.access100;
        if (nativeAdsManager != null) {
            int i7 = readTypedObject + 29;
            extraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                nativeAdsManager.asBinder();
                obj.hashCode();
                throw null;
            }
            nativeAdsManager.asBinder();
        }
        setResult(-1);
        super/*android.app.Activity*/.finish();
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        long jOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
            onWarmupCompleted();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        if (onWarmupCompleted()) {
            jOnExtraCallbackWithResult = 0;
        } else {
            AdsCircularCountdownLayout adsCircularCountdownLayout = this.access000;
            if (adsCircularCountdownLayout != null) {
                int i3 = extraCallbackWithResult + 51;
                readTypedObject = i3 % 128;
                if (i3 % 2 != 0) {
                    adsCircularCountdownLayout.onExtraCallbackWithResult();
                    obj.hashCode();
                    throw null;
                }
                jOnExtraCallbackWithResult = adsCircularCountdownLayout.onExtraCallbackWithResult();
            } else {
                jOnExtraCallbackWithResult = this.IAuthTabCallbackStub;
                int i4 = extraCallbackWithResult + 83;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        bundle.putLong("ads_countdown_remaining_ms", jOnExtraCallbackWithResult);
        bundle.putBoolean("ads_can_close", onWarmupCompleted());
        int i6 = extraCallbackWithResult + 97;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onWarmupCompleted(@NotNull AdsCircularCountdownLayout adsCircularCountdownLayout) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 47;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adsCircularCountdownLayout, "");
            this.access000 = adsCircularCountdownLayout;
        } else {
            Intrinsics.checkNotNullParameter(adsCircularCountdownLayout, "");
            this.access000 = adsCircularCountdownLayout;
            int i3 = 57 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (onWarmupCompleted() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity.extraCallbackWithResult + 65;
        im.toss.ads_sdk.ui.activity.NativeAdsBaseActivity.readTypedObject = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return r6.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (onWarmupCompleted() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 113;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this.IAuthTabCallbackStub > 0) {
            int i5 = i2 + 35;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 41 / 0;
            }
        }
        return 0L;
    }

    public final void onTransact() {
        long j;
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(true);
            j = 1;
        } else {
            onExtraCallback(true);
            j = 0;
        }
        this.IAuthTabCallbackStub = j;
        int i3 = extraCallbackWithResult + 49;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de A[PHI: r6
      0x00de: PHI (r6v9 im.toss.ads_sdk.model.NativeAdsDto$AdAsset) = (r6v8 im.toss.ads_sdk.model.NativeAdsDto$AdAsset), (r6v12 im.toss.ads_sdk.model.NativeAdsDto$AdAsset) binds: [B:39:0x00dc, B:36:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        NativeAdsDto.AdAsset adAsset;
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        onExtraCallback(bundle != null ? bundle.getBoolean("ads_can_close", false) : false);
        this.IAuthTabCallbackStub = bundle != null ? bundle.getLong("ads_countdown_remaining_ms", 0L) : 0L;
        this.getInterfaceDescriptor = true;
        onExtraCallback(900322206, new Object[]{this}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -900322206, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        String stringExtra = getIntent().getStringExtra("native_ads_request_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String strIAuthTabCallbackStub = null;
        NativeAdsManager nativeAdsManagerOnExtraCallback = stringExtra.length() > 0 ? getPlatformCallback.IAuthTabCallback.onExtraCallback(stringExtra) : null;
        if (nativeAdsManagerOnExtraCallback == null) {
            nativeAdsManagerOnExtraCallback = ((NativeAdsManager.onWarmupCompleted) Response.onWarmupCompleted(this, NativeAdsManager.onWarmupCompleted.class)).onTransact();
        }
        this.access100 = nativeAdsManagerOnExtraCallback;
        if (nativeAdsManagerOnExtraCallback != null) {
            int i4 = readTypedObject + 123;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            nativeAdsManagerOnExtraCallback.onExtraCallback((TextFieldScrollKtExternalSyntheticLambda0) this);
        }
        NativeAdsManager nativeAdsManager = this.access100;
        if (nativeAdsManager != null) {
            int i6 = extraCallbackWithResult + 1;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            nativeAdsManager.onExtraCallback(this.IAuthTabCallback_Parcel);
        }
        calculatePageOffsets calculatepageoffsetsOnNavigationEvent = onNavigationEvent();
        if (calculatepageoffsetsOnNavigationEvent != null) {
            calculatePageOffsets.onNavigationEvent(calculatepageoffsetsOnNavigationEvent, (findResAndMsg) TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), false, 2, (Object) null);
        }
        NativeAdsDto nativeAdsDtoAsInterface = asInterface();
        if (nativeAdsDtoAsInterface != null) {
            int i8 = extraCallbackWithResult + 79;
            readTypedObject = i8 % 128;
            if (i8 % 2 != 0) {
                nativeAdsDtoAsInterface.onExtraCallbackWithResult();
                strIAuthTabCallbackStub.hashCode();
                throw null;
            }
            List<NativeAdsDto.AdAsset> listOnExtraCallbackWithResult = nativeAdsDtoAsInterface.onExtraCallbackWithResult();
            if (listOnExtraCallbackWithResult != null) {
                int i9 = readTypedObject + 15;
                extraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
                    int i10 = 9 / 0;
                    if (adAsset != null) {
                        NativeAdsDto.AdAsset adAsset2 = adAsset;
                        NativeAdsManager nativeAdsManager2 = this.access100;
                        if (nativeAdsManager2 != null) {
                            nativeAdsManager2.onExtraCallback((findResAndMsg) TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), nativeAdsDtoAsInterface.IAuthTabCallbackStub(), adAsset2, (Function0<Boolean>) new NativeAdsBaseActivity$.ExternalSyntheticLambda2(this));
                        }
                        NativeAdsManager nativeAdsManager3 = this.access100;
                        if (nativeAdsManager3 != null) {
                            NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1869487633, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1869487598, new Object[]{nativeAdsManager3, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), nativeAdsDtoAsInterface.IAuthTabCallbackStub(), adAsset2, new NativeAdsBaseActivity$.ExternalSyntheticLambda3(this), new NativeAdsBaseActivity$.ExternalSyntheticLambda4(this)}, nSetPosition.onExtraCallbackWithResult());
                        }
                    }
                } else {
                    adAsset = (NativeAdsDto.AdAsset) CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
                    if (adAsset != null) {
                    }
                }
            }
        }
        if (!(!this.extraCallback)) {
            return;
        }
        this.extraCallback = true;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackDefault = IAuthTabCallbackDefault(this);
        if (nativeAdsManagerIAuthTabCallbackDefault != null) {
            NativeAdsDto nativeAdsDtoIAuthTabCallbackStub = IAuthTabCallbackStub(this);
            if (nativeAdsDtoIAuthTabCallbackStub != null) {
                int i11 = readTypedObject + 31;
                extraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                strIAuthTabCallbackStub = nativeAdsDtoIAuthTabCallbackStub.IAuthTabCallbackStub();
            }
            nativeAdsManagerIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallbackStub != null ? strIAuthTabCallbackStub : "", new onNavigationEvent());
        }
    }

    private final void IAuthTabCallback_Parcel() {
        onExtraCallback(900322206, new Object[]{this}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -900322206, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    private static final boolean access000(NativeAdsBaseActivity nativeAdsBaseActivity) {
        return ((Boolean) onExtraCallback(-2039804625, new Object[]{nativeAdsBaseActivity}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 2039804628, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue();
    }

    private final void access100() {
        onExtraCallback(-171283841, new Object[]{this}, Hilt_ViralNotiBlockActivity.1.onNavigationEvent(), Hilt_ViralNotiBlockActivity.1.onNavigationEvent(), 171283843, Hilt_ViralNotiBlockActivity.1.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.ads_sdk.ui.activity.Hilt_NativeAdsBaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
