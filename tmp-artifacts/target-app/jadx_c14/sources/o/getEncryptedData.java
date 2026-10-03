package o;

import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.PopupLayoutExternalSyntheticLambda1;
import o.ThreeLineExternalSyntheticLambda1;
import o.getEncryptedData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class getEncryptedData implements Parcelable {
    private boolean IAuthTabCallback;
    private getDigestAlgorithms<? extends getEncryptedData> onExtraCallback;

    public abstract Boolean IAuthTabCallback();

    public abstract getEncryptedData IAuthTabCallbackDefault();

    public abstract DynamicLoader asBinder();

    public abstract String onExtraCallback();

    public abstract void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel);

    public abstract Map<String, Object> onNavigationEvent();

    public final int access100() {
        return hashCode();
    }

    public final void IAuthTabCallback(boolean z) {
        this.IAuthTabCallback = z;
    }

    public final boolean IAuthTabCallback_Parcel() {
        return this.IAuthTabCallback;
    }

    public final getDigestAlgorithms<getEncryptedData> IAuthTabCallbackStubProxy() {
        return this.onExtraCallback;
    }

    public final void onWarmupCompleted(@Nullable getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms) {
        this.onExtraCallback = getdigestalgorithms;
    }

    public static /* synthetic */ void onWarmupCompleted(getEncryptedData getencrypteddata, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda4 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda4, getDigestAlgorithms getdigestalgorithms, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDefaultProperty");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        getencrypteddata.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda4, getdigestalgorithms, z);
    }

    public final void onNavigationEvent(@NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda4<?> exposedDropdownMenuPopup_androidKtExternalSyntheticLambda4, @NotNull final getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, final boolean z) {
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda4, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda4.onExtraCallback("navigator", new Function1() { // from class: viva.republica.toss.cardsales.funnel.layout.CardIssueLayout$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return getEncryptedData.onExtraCallback(getdigestalgorithms, z, (ThreeLineExternalSyntheticLambda1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(getDigestAlgorithms getdigestalgorithms, boolean z, ThreeLineExternalSyntheticLambda1 threeLineExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(threeLineExternalSyntheticLambda1, "");
        threeLineExternalSyntheticLambda1.onExtraCallbackWithResult(new PopupLayoutExternalSyntheticLambda1.onWarmupCompleted(getDigestAlgorithms.class));
        threeLineExternalSyntheticLambda1.onExtraCallbackWithResult(getDigestAlgorithms.onExtraCallback(getdigestalgorithms, (getEncryptedData) null, 0, 0, (getEncryptedData) null, z, (getDigestAlgorithms) null, 47, (Object) null));
        return Unit.INSTANCE;
    }

    public final Map<String, Object> getInterfaceDescriptor() {
        Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
        if (mapOnNavigationEvent == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(mapOnNavigationEvent.size()));
        Iterator<T> it = mapOnNavigationEvent.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Number) {
                Number number = (Number) value;
                if (number.doubleValue() % 1.0d == 0.0d) {
                    value = Integer.valueOf(number.intValue());
                }
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }
}
