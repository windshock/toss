package viva.republica.toss.network.model.cardsales.funnel;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CheckOcrResultReq$OcrAuthenticityFormValue {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<CheckOcrResultReq$OcrEditItem> ocrEditItems;
    private final String ocrImage;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.cardsales.funnel.CheckOcrResultReq$OcrAuthenticityFormValue$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = CheckOcrResultReq$OcrAuthenticityFormValue.IAuthTabCallback();
            int i4 = onExtraCallback + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnWarmupCompleted;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CheckOcrResultReq$OcrEditItem.Companion.serializer());
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof CheckOcrResultReq$OcrAuthenticityFormValue)) {
                return false;
            }
            CheckOcrResultReq$OcrAuthenticityFormValue checkOcrResultReq$OcrAuthenticityFormValue = (CheckOcrResultReq$OcrAuthenticityFormValue) obj;
            return Intrinsics.areEqual(this.ocrImage, checkOcrResultReq$OcrAuthenticityFormValue.ocrImage) && !(Intrinsics.areEqual(this.ocrEditItems, checkOcrResultReq$OcrAuthenticityFormValue.ocrEditItems) ^ true);
        }
        int i4 = i3 + 49;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 107;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.ocrImage.hashCode() * 31) + this.ocrEditItems.hashCode();
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OcrAuthenticityFormValue(ocrImage=" + this.ocrImage + ", ocrEditItems=" + this.ocrEditItems + ")";
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckOcrResultReq$OcrAuthenticityFormValue> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CheckOcrResultReq$OcrAuthenticityFormValue$$serializer checkOcrResultReq$OcrAuthenticityFormValue$$serializer = CheckOcrResultReq$OcrAuthenticityFormValue$$serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 5 / 0;
            }
            return checkOcrResultReq$OcrAuthenticityFormValue$$serializer;
        }
    }

    static {
        int i = IAuthTabCallback + 57;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    public /* synthetic */ CheckOcrResultReq$OcrAuthenticityFormValue(int i, String str, List list, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 3, (i2 % 2 == 0 ? CheckOcrResultReq$OcrAuthenticityFormValue$$serializer.INSTANCE : CheckOcrResultReq$OcrAuthenticityFormValue$$serializer.INSTANCE).getDescriptor());
            int i3 = onExtraCallbackWithResult + 55;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        }
        this.ocrImage = str;
        this.ocrEditItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckOcrResultReq$OcrAuthenticityFormValue(@NotNull String str, @NotNull List<? extends CheckOcrResultReq$OcrEditItem> list) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.ocrImage = str;
        this.ocrEditItems = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(CheckOcrResultReq$OcrAuthenticityFormValue checkOcrResultReq$OcrAuthenticityFormValue, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 1, checkOcrResultReq$OcrAuthenticityFormValue.ocrImage);
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[1].getValue(), checkOcrResultReq$OcrAuthenticityFormValue.ocrEditItems);
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, checkOcrResultReq$OcrAuthenticityFormValue.ocrImage);
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr2[1].getValue(), checkOcrResultReq$OcrAuthenticityFormValue.ocrEditItems);
        }
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 71;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }
}
