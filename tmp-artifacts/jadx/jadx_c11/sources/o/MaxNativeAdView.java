package o;

import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxNativeAdView {
    private static int onActivityResized = 0;
    private static int onMessageChannelReady = 0;
    private static int onMinimized = 1;
    private static int onPostMessage = 1;
    private final String onActivityLayout;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final String onNavigationEvent = IAuthTabCallback("Opacity");
    private static final String IAuthTabCallbackDefault = IAuthTabCallback("ScaleX");
    private static final String IAuthTabCallbackStub = IAuthTabCallback("ScaleY");
    private static final String IAuthTabCallback = IAuthTabCallback("BackgroundColor");
    private static final String extraCallback = IAuthTabCallback("TranslateX");
    private static final String writeTypedObject = IAuthTabCallback("TranslateY");
    private static final String IAuthTabCallback_Parcel = IAuthTabCallback("TranslatePercentX");
    private static final String extraCallbackWithResult = IAuthTabCallback("TranslatePercentY");
    private static final String asBinder = IAuthTabCallback("RotateX");
    private static final String onTransact = IAuthTabCallback("RotateY");
    private static final String asInterface = IAuthTabCallback("RotateZ");
    private static final String access100 = IAuthTabCallback("TransformOriginX");
    private static final String getInterfaceDescriptor = IAuthTabCallback("TransformOriginY");
    private static final String readTypedObject = IAuthTabCallback("Width");
    private static final String onExtraCallbackWithResult = IAuthTabCallback("Height");
    private static final String IAuthTabCallbackStubProxy = IAuthTabCallback("TextSize");
    private static final String access000 = IAuthTabCallback("TextColor");
    private static final String ICustomTabsCallback = IAuthTabCallback("Value");
    private static final String onExtraCallback = IAuthTabCallback("Perspective");
    private static final String onWarmupCompleted = IAuthTabCallback("Blur");

    public static String IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onActivityResized + 95;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~((~i6) | i);
        int i8 = ~i5;
        int i9 = i7 | (~(i8 | i));
        int i10 = ~i;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i6);
        int i13 = (~(i8 | i6)) | i11 | i12;
        int i14 = (~(i5 | i10)) | i12;
        int i15 = i6 + i + i3 + (1039959776 * i4) + ((-2046201414) * i2);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i6) - 8388608) + ((-1785926397) * i) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i3) + ((-201326592) * i4) + ((-406847488) * i2) + (529399808 * i16);
        int i18 = ((i6 * 868240256) - 1765242424) + (i * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i3 * 868239597) + (i4 * 817356128) + (i2 * 406493490) + (i16 * 645267456);
        int i19 = i17 + (i18 * i18 * 681705472);
        if (i19 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i19 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i19 != 3) {
            return onExtraCallback(objArr);
        }
        int i20 = 2 % 2;
        int i21 = onPostMessage;
        int i22 = i21 + 33;
        onActivityResized = i22 % 128;
        int i23 = i22 % 2;
        String str = extraCallback;
        int i24 = i21 + 63;
        onActivityResized = i24 % 128;
        int i25 = i24 % 2;
        return str;
    }

    public static final /* synthetic */ MaxNativeAdView onExtraCallback(String str) {
        int i = 2 % 2;
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(str);
        int i2 = onActivityResized + 117;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return maxNativeAdView;
    }

    public static String onNavigationEvent(String str) {
        int i = 2 % 2;
        String str2 = "VariantSpec(value=" + str + ")";
        int i2 = onActivityResized + 41;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onActivityResized + 77;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        int i4 = onActivityResized + 91;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 29;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        if (!(obj instanceof MaxNativeAdView)) {
            return false;
        }
        if (!Intrinsics.areEqual(str, ((MaxNativeAdView) obj).IAuthTabCallbackStubProxy())) {
            int i4 = onPostMessage + 77;
            onActivityResized = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = onActivityResized + 63;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return true;
    }

    public final /* synthetic */ String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onPostMessage + 93;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onActivityLayout;
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return str;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onPostMessage + 79;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.onActivityLayout, obj};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback4 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        if (i3 == 0) {
            return ((Boolean) onExtraCallback(-196006248, iOnExtraCallback4, iOnExtraCallback2, iOnExtraCallback3, objArr, iOnExtraCallback, 196006249)).booleanValue();
        }
        int i4 = 67 / 0;
        return ((Boolean) onExtraCallback(-196006248, iOnExtraCallback4, iOnExtraCallback2, iOnExtraCallback3, objArr, iOnExtraCallback, 196006249)).booleanValue();
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onActivityResized + 49;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onActivityLayout;
        if (i3 != 0) {
            return onWarmupCompleted(str);
        }
        onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onPostMessage + 79;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onActivityLayout;
        if (i3 == 0) {
            return onNavigationEvent(str);
        }
        onNavigationEvent(str);
        throw null;
    }

    public static final /* synthetic */ String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onActivityResized + 123;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        String str = getInterfaceDescriptor;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return str;
    }

    public static final /* synthetic */ String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 85;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = IAuthTabCallbackStub;
        int i4 = i2 + 29;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return str;
    }

    public static final /* synthetic */ String IAuthTabCallback_Parcel() {
        String str;
        int i = 2 % 2;
        int i2 = onPostMessage + 71;
        int i3 = i2 % 128;
        onActivityResized = i3;
        if (i2 % 2 != 0) {
            str = writeTypedObject;
            int i4 = 76 / 0;
        } else {
            str = writeTypedObject;
        }
        int i5 = i3 + 5;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String access000() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 71;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        String str = extraCallbackWithResult;
        int i5 = i2 + 25;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ String access100() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 99;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = IAuthTabCallback_Parcel;
        int i4 = i2 + 41;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return str;
    }

    public static final /* synthetic */ String asBinder() {
        int i = 2 % 2;
        int i2 = onPostMessage + 17;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onActivityResized + 103;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact;
        }
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 1;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        String str = onExtraCallback;
        int i5 = i3 + 87;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onPostMessage + 89;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 27;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 117;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = asBinder;
        int i4 = i2 + 89;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ String onTransact() {
        int i = 2 % 2;
        int i2 = onPostMessage + 19;
        int i3 = i2 % 128;
        onActivityResized = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = access100;
        int i4 = i3 + 57;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final /* synthetic */ String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onPostMessage + 65;
        int i3 = i2 % 128;
        onActivityResized = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = IAuthTabCallback;
        int i4 = i3 + 107;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i6;
            int i8 = ~(i7 | i);
            int i9 = ~i;
            int i10 = i8 | (~(i9 | i6 | i2));
            int i11 = ~(i7 | i9);
            int i12 = (~i2) | i9;
            int i13 = i11 | (~i12);
            int i14 = ~(i12 | i6);
            int i15 = i6 + i + i4 + ((-1261570137) * i5) + (2040842291 * i3);
            int i16 = i15 * i15;
            int i17 = ((i6 * (-750812765)) - 1471086592) + ((-750812765) * i) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i4) + ((-1928462336) * i5) + (1629880320 * i3) + (2096168960 * i16);
            int i18 = ((i6 * 1408203179) - 1033136887) + (i * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i4 * 1408202841) + (i5 * (-1046847217)) + (i3 * (-121732677)) + (i16 * 1741225984);
            if (i17 + (i18 * i18 * 838795264) != 1) {
                return IAuthTabCallback(objArr);
            }
            int i19 = 2 % 2;
            int i20 = IAuthTabCallback + 25;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            String strAccess100 = MaxNativeAdView.access100();
            int i22 = IAuthTabCallback + 91;
            onExtraCallback = i22 % 128;
            int i23 = i22 % 2;
            return strAccess100;
        }

        private onNavigationEvent() {
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = MaxNativeAdView.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            String str = (String) MaxNativeAdView.onExtraCallback(436455739, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, new Object[0], iOnExtraCallback, -436455737);
            int i4 = onExtraCallback + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallbackStub = MaxNativeAdView.IAuthTabCallbackStub();
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
            return strIAuthTabCallbackStub;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                MaxNativeAdView.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strOnWarmupCompleted = MaxNativeAdView.onWarmupCompleted();
            int i3 = onExtraCallback + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return strOnWarmupCompleted;
        }

        public final String access000() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                return (String) MaxNativeAdView.onExtraCallback(-1452606301, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, new Object[0], iOnExtraCallback, 1452606304);
            }
            int iOnExtraCallback4 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback5 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback6 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String access100() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                MaxNativeAdView.IAuthTabCallback_Parcel();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strIAuthTabCallback_Parcel = MaxNativeAdView.IAuthTabCallback_Parcel();
            int i3 = onExtraCallback + 79;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 13 / 0;
            }
            return strIAuthTabCallback_Parcel;
        }

        public final String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strAccess000 = MaxNativeAdView.access000();
            int i4 = onExtraCallback + 119;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return strAccess000;
        }

        public final String onWarmupCompleted() {
            String strOnNavigationEvent;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                strOnNavigationEvent = MaxNativeAdView.onNavigationEvent();
                int i3 = 72 / 0;
            } else {
                strOnNavigationEvent = MaxNativeAdView.onNavigationEvent();
            }
            int i4 = onExtraCallback + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnNavigationEvent;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                return (String) MaxNativeAdView.onExtraCallback(-1176258169, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, new Object[0], iOnExtraCallback, 1176258169);
            }
            int iOnExtraCallback4 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback5 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback6 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            throw null;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strAsBinder = MaxNativeAdView.asBinder();
            if (i3 == 0) {
                int i4 = 42 / 0;
            }
            return strAsBinder;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnTransact = MaxNativeAdView.onTransact();
            int i4 = IAuthTabCallback + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnTransact;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                MaxNativeAdView.IAuthTabCallbackDefault();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strIAuthTabCallbackDefault = MaxNativeAdView.IAuthTabCallbackDefault();
            int i3 = onExtraCallback + 9;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 79 / 0;
            }
            return strIAuthTabCallbackDefault;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return MaxNativeAdView.onExtraCallback();
            }
            MaxNativeAdView.onExtraCallback();
            throw null;
        }

        public final String onExtraCallback() {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (String) IAuthTabCallback(-594286327, iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, 594286327, new Object[]{this});
        }

        public final String getInterfaceDescriptor() {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (String) IAuthTabCallback(1486455195, iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, -1486455194, new Object[]{this});
        }
    }

    private /* synthetic */ MaxNativeAdView(String str) {
        this.onActivityLayout = str;
    }

    static {
        int i = onMessageChannelReady + 15;
        onMinimized = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ String IAuthTabCallback() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (String) onExtraCallback(-1176258169, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, new Object[0], iOnExtraCallback, 1176258169);
    }

    public static final /* synthetic */ String asInterface() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (String) onExtraCallback(436455739, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, new Object[0], iOnExtraCallback, -436455737);
    }

    public static final /* synthetic */ String getInterfaceDescriptor() {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (String) onExtraCallback(-1452606301, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, new Object[0], iOnExtraCallback, 1452606304);
    }

    public static boolean onWarmupCompleted(String str, Object obj) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return ((Boolean) onExtraCallback(-196006248, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback3, new Object[]{str, obj}, iOnExtraCallback, 196006249)).booleanValue();
    }
}
