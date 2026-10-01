package o;

import com.google.android.gms.internal.ads.zziea;
import im.toss.ads_sdk.log.TrackingLogRecord;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface dispatchOnPageScrolled {
    String IAuthTabCallback(@NotNull String str);

    boolean onExtraCallback(@NotNull NativeAdsEventLogType nativeAdsEventLogType);

    boolean onExtraCallbackWithResult();

    String onWarmupCompleted();

    List<String> onWarmupCompleted(@NotNull NativeAdsEventLogType nativeAdsEventLogType);

    default String onExtraCallback() {
        int i = 2 % 2;
        return onExtraCallbackWithResult() ? TrackingLogRecord.METHOD_POST : TrackingLogRecord.METHOD_GET;
    }

    @JvmInline
    public static final class onWarmupCompleted implements dispatchOnPageScrolled {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final NativeAdsDto.AdAsset onNavigationEvent;

        public static int IAuthTabCallback(NativeAdsDto.AdAsset adAsset) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                adAsset.hashCode();
                throw null;
            }
            int iHashCode = adAsset.hashCode();
            int i3 = onWarmupCompleted + 29;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public static String asInterface(NativeAdsDto.AdAsset adAsset) {
            int i = 2 % 2;
            String str = "V1(adAsset=" + adAsset + ")";
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 77 / 0;
            }
            return str;
        }

        public static boolean onExtraCallback(NativeAdsDto.AdAsset adAsset, Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 35;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof onWarmupCompleted;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof onWarmupCompleted) {
                return Intrinsics.areEqual(adAsset, ((onWarmupCompleted) obj).onNavigationEvent());
            }
            int i4 = i2 + 117;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 59;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public static NativeAdsDto.AdAsset onNavigationEvent(@NotNull NativeAdsDto.AdAsset adAsset) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(adAsset, "");
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return adAsset;
        }

        public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = i2 | i7 | (~i4);
            int i9 = ~i2;
            int i10 = (~(i4 | i7)) | (~(i7 | i9));
            int i11 = i3 + i2 + i + ((-92689393) * i6) + (1942122663 * i5);
            int i12 = i11 * i11;
            int i13 = (((-665130586) * i3) - 357761024) + ((-674687396) * i2) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i) + ((-1056047104) * i6) + ((-742522880) * i5) + ((-592117760) * i12);
            int i14 = (i3 * 1048061654) + 1366922925 + (i2 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i * 1048061961) + (i6 * 439444615) + (i5 * (-1279783457)) + (i12 * 173867008);
            if (i13 + (i14 * i14 * (-1898250240)) == 1) {
                return onExtraCallbackWithResult(objArr);
            }
            int i15 = 2 % 2;
            int i16 = onWarmupCompleted;
            int i17 = i16 + 67;
            IAuthTabCallback = i17 % 128;
            boolean z = i17 % 2 == 0;
            int i18 = i16 + 123;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            return Boolean.valueOf(z);
        }

        public static final /* synthetic */ onWarmupCompleted onWarmupCompleted(NativeAdsDto.AdAsset adAsset) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(adAsset);
            int i2 = IAuthTabCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto.AdAsset adAsset = this.onNavigationEvent;
            if (i3 == 0) {
                return onExtraCallback(adAsset, obj);
            }
            onExtraCallback(adAsset, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto.AdAsset adAsset = this.onNavigationEvent;
            if (i3 != 0) {
                return IAuthTabCallback(adAsset);
            }
            IAuthTabCallback(adAsset);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final /* synthetic */ NativeAdsDto.AdAsset onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto.AdAsset adAsset = this.onNavigationEvent;
            if (i3 != 0) {
                return asInterface(adAsset);
            }
            asInterface(adAsset);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.dispatchOnPageScrolled
        public /* bridge */ String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                super.onExtraCallback();
                throw null;
            }
            String strOnExtraCallback = super.onExtraCallback();
            int i3 = IAuthTabCallback + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return strOnExtraCallback;
        }

        private /* synthetic */ onWarmupCompleted(NativeAdsDto.AdAsset adAsset) {
            this.onNavigationEvent = adAsset;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = adAsset.IAuthTabCallback();
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return strIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.dispatchOnPageScrolled
        public String onWarmupCompleted() {
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {this.onNavigationEvent};
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                str = (String) onWarmupCompleted(objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 538599343, -538599342, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                int i3 = 64 / 0;
            } else {
                Object[] objArr2 = {this.onNavigationEvent};
                int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                str = (String) onWarmupCompleted(objArr2, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 538599343, -538599342, iIAuthTabCallback2, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            }
            int i4 = IAuthTabCallback + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.dispatchOnPageScrolled
        public boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto.AdAsset adAsset = this.onNavigationEvent;
            if (i3 != 0) {
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                return ((Boolean) onWarmupCompleted(new Object[]{adAsset}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1638261977, 1638261977, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).booleanValue();
            }
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            ((Boolean) onWarmupCompleted(new Object[]{adAsset}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1638261977, 1638261977, iIAuthTabCallback2, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).booleanValue();
            throw null;
        }

        @Override // o.dispatchOnPageScrolled
        public boolean onExtraCallback(@NotNull NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                return onNavigationEvent(this.onNavigationEvent, nativeAdsEventLogType);
            }
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            int i3 = 3 / 0;
            return onNavigationEvent(this.onNavigationEvent, nativeAdsEventLogType);
        }

        public static boolean onNavigationEvent(NativeAdsDto.AdAsset adAsset, @NotNull NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            List<String> listOnWarmupCompleted = adAsset.onWarmupCompleted();
            if (listOnWarmupCompleted instanceof Collection) {
                int i2 = IAuthTabCallback + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (listOnWarmupCompleted.isEmpty()) {
                    return false;
                }
            }
            Iterator<T> it = listOnWarmupCompleted.iterator();
            while (it.hasNext()) {
                if (!(!Intrinsics.areEqual(NativeAdsEventLogType.Companion.onWarmupCompleted((String) it.next()), nativeAdsEventLogType))) {
                    return true;
                }
            }
            int i4 = IAuthTabCallback + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static List<String> onWarmupCompleted(NativeAdsDto.AdAsset adAsset, @NotNull NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                return (List) NativeAdsDto.AdAsset.IAuthTabCallback(iOnExtraCallback, -215433381, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback3, 215433382, iOnExtraCallback2, new Object[]{adAsset});
            }
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback5 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback6 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            throw null;
        }

        @Override // o.dispatchOnPageScrolled
        public List<String> onWarmupCompleted(@NotNull NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                return onWarmupCompleted(this.onNavigationEvent, nativeAdsEventLogType);
            }
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            int i3 = 17 / 0;
            return onWarmupCompleted(this.onNavigationEvent, nativeAdsEventLogType);
        }

        public static String IAuthTabCallback(NativeAdsDto.AdAsset adAsset, @NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String strReplace$default = StringsKt.replace$default(str, "{code}", adAsset.IAuthTabCallback(), false, 4, (Object) null);
            int i4 = IAuthTabCallback + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return strReplace$default;
        }

        @Override // o.dispatchOnPageScrolled
        public String IAuthTabCallback(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                return IAuthTabCallback(this.onNavigationEvent, str);
            }
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback(this.onNavigationEvent, str);
            throw null;
        }

        public static String onExtraCallbackWithResult(NativeAdsDto.AdAsset adAsset) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (String) onWarmupCompleted(new Object[]{adAsset}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 538599343, -538599342, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        }

        public static boolean onExtraCallback(NativeAdsDto.AdAsset adAsset) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            return ((Boolean) onWarmupCompleted(new Object[]{adAsset}, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1638261977, 1638261977, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).booleanValue();
        }
    }

    @JvmInline
    public static final class onNavigationEvent implements dispatchOnPageScrolled {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final Map<String, List<String>> onNavigationEvent;

        public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = (~(i6 | i3)) | i2;
            int i8 = ~i6;
            int i9 = ~((~i2) | i8 | i3);
            int i10 = (~(i3 | i2)) | (~(i8 | (~i3)));
            int i11 = i6 + i2 + i + (1616745821 * i4) + (2077170981 * i5);
            int i12 = i11 * i11;
            int i13 = ((-162656556) * i6) + 1587019776 + (806482222 * i2) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i) + ((-395313152) * i4) + (904921088 * i5) + (345505792 * i12);
            int i14 = (i6 * (-1558553916)) + 318941677 + (i2 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i * (-1558553459)) + (i4 * 397062201) + (i5 * 609114465) + (i12 * (-138936320));
            return i13 + ((i14 * i14) * 1630011392) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }

        public static final /* synthetic */ onNavigationEvent IAuthTabCallback(Map map) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(map);
            int i2 = onWarmupCompleted + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 53;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 0;
            }
            return false;
        }

        public static String onExtraCallback(Map<String, ? extends List<? extends String>> map, @NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = onWarmupCompleted + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public static boolean onExtraCallback(Map<String, ? extends List<? extends String>> map, Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = onWarmupCompleted + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(map, ((onNavigationEvent) obj).onNavigationEvent())) {
                return true;
            }
            int i4 = onWarmupCompleted + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public static String onTransact(Map<String, ? extends List<? extends String>> map) {
            int i = 2 % 2;
            String str = "ByType(urlsByType=" + map + ")";
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 26 / 0;
            }
            return str;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            Map map = (Map) objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = map.hashCode();
            int i4 = onExtraCallback + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return Integer.valueOf(iHashCode);
        }

        public static Map<String, ? extends List<? extends String>> onWarmupCompleted(@NotNull Map<String, ? extends List<String>> map) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            if (i3 != 0) {
                int i4 = 73 / 0;
            }
            return map;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Map<String, List<String>> map = this.onNavigationEvent;
            if (i3 == 0) {
                return onExtraCallback(map, obj);
            }
            onExtraCallback(map, obj);
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                ((Integer) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{this.onNavigationEvent}, -1895854438, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1895854438)).intValue();
                obj.hashCode();
                throw null;
            }
            int iIntValue = ((Integer) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{this.onNavigationEvent}, -1895854438, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1895854438)).intValue();
            int i3 = onExtraCallback + 49;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return iIntValue;
            }
            throw null;
        }

        public final /* synthetic */ Map onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onTransact(this.onNavigationEvent);
                obj.hashCode();
                throw null;
            }
            String strOnTransact = onTransact(this.onNavigationEvent);
            int i3 = onWarmupCompleted + 39;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return strOnTransact;
            }
            throw null;
        }

        @Override // o.dispatchOnPageScrolled
        public /* bridge */ String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                super.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            String strOnExtraCallback = super.onExtraCallback();
            int i3 = onWarmupCompleted + 15;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return strOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        private /* synthetic */ onNavigationEvent(Map map) {
            this.onNavigationEvent = map;
        }

        public static String onExtraCallbackWithResult(Map<String, ? extends List<? extends String>> map) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 43;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }

        @Override // o.dispatchOnPageScrolled
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onNavigationEvent);
            if (i3 != 0) {
                int i4 = 38 / 0;
            }
            return strOnExtraCallbackWithResult;
        }

        @Override // o.dispatchOnPageScrolled
        public boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{this.onNavigationEvent}, -717339368, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 717339369)).booleanValue();
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return zBooleanValue;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static boolean onNavigationEvent(Map<String, ? extends List<? extends String>> map, @NotNull NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            boolean z = !onWarmupCompleted(map, nativeAdsEventLogType).isEmpty();
            int i4 = onExtraCallback + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        @Override // o.dispatchOnPageScrolled
        public boolean onExtraCallback(@NotNull NativeAdsEventLogType nativeAdsEventLogType) {
            boolean zOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                zOnNavigationEvent = onNavigationEvent(this.onNavigationEvent, nativeAdsEventLogType);
                int i3 = 81 / 0;
            } else {
                Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
                zOnNavigationEvent = onNavigationEvent(this.onNavigationEvent, nativeAdsEventLogType);
            }
            int i4 = onWarmupCompleted + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zOnNavigationEvent;
        }

        public static List<String> onWarmupCompleted(Map<String, ? extends List<? extends String>> map, @NotNull NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            List<String> list = (List) map.get(nativeAdsEventLogType.toString());
            if (list != null) {
                return list;
            }
            List<String> listEmptyList = CollectionsKt.emptyList();
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return listEmptyList;
        }

        @Override // o.dispatchOnPageScrolled
        public List<String> onWarmupCompleted(@NotNull NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            List<String> listOnWarmupCompleted = onWarmupCompleted(this.onNavigationEvent, nativeAdsEventLogType);
            int i4 = onWarmupCompleted + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return listOnWarmupCompleted;
        }

        @Override // o.dispatchOnPageScrolled
        public String IAuthTabCallback(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String strOnExtraCallback = onExtraCallback((Map<String, ? extends List<? extends String>>) this.onNavigationEvent, str);
            int i4 = onWarmupCompleted + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallback;
        }

        public static boolean onNavigationEvent(Map<String, ? extends List<? extends String>> map) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            return ((Boolean) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{map}, -717339368, iIAuthTabCallback, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 717339369)).booleanValue();
        }

        public static int onExtraCallback(Map<String, ? extends List<? extends String>> map) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            return ((Integer) IAuthTabCallback(zziea.IAuthTabCallback(), new Object[]{map}, -1895854438, iIAuthTabCallback, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1895854438)).intValue();
        }
    }
}
