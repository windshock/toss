package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.NativeAdLayout;
import o.UST_CMP_UpdateCertificate;
import o.UST_CRYPT_VerifyMAC;
import o.UST_CRYPT_VerifySign;
import o.detect;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class UST_CMP_UpdateCertificate<VH extends RecyclerView.ViewHolder & UST_CRYPT_VerifyMAC<T>, T extends NativeAdLayout & UST_CRYPT_VerifySign> extends RecyclerView.Adapter<VH> {
    private final getTimestampBytes<Long> onExtraCallback;
    private final List<T> onExtraCallbackWithResult = new ArrayList();
    private final getByteBuffer<T> onNavigationEvent;

    public UST_CMP_UpdateCertificate() {
        getTimestampBytes<Long> gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
        this.onExtraCallback = gettimestampbytesIAuthTabCallback;
        getByteBuffer getbytebufferOnNavigationEvent = gettimestampbytesIAuthTabCallback.onNavigationEvent(clearTid.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.credit.commons.CreditBaseAdapter$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return UST_CMP_UpdateCertificate.IAuthTabCallback(this.f$0, (Long) obj);
            }
        };
        getByteBuffer getbytebufferAsInterface = getbytebufferOnNavigationEvent.asInterface(new deserializeIntNullableCollection() { // from class: viva.republica.toss.credit.commons.CreditBaseAdapter$$ExternalSyntheticLambda1
            public final Object apply(Object obj) {
                return UST_CMP_UpdateCertificate.IAuthTabCallback(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.credit.commons.CreditBaseAdapter$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UST_CMP_UpdateCertificate.onExtraCallbackWithResult((detect) obj));
            }
        };
        getByteBuffer getbytebufferOnWarmupCompleted = getbytebufferAsInterface.onWarmupCompleted(new deserializeLongCollection() { // from class: viva.republica.toss.credit.commons.CreditBaseAdapter$$ExternalSyntheticLambda3
            public final boolean test(Object obj) {
                return UST_CMP_UpdateCertificate.onExtraCallbackWithResult(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.credit.commons.CreditBaseAdapter$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return UST_CMP_UpdateCertificate.onNavigationEvent((detect) obj);
            }
        };
        getByteBuffer<T> getbytebufferOnExtraCallbackWithResult = getbytebufferOnWarmupCompleted.asInterface(new deserializeIntNullableCollection() { // from class: viva.republica.toss.credit.commons.CreditBaseAdapter$$ExternalSyntheticLambda5
            public final Object apply(Object obj) {
                return UST_CMP_UpdateCertificate.onTransact(function13, obj);
            }
        }).onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult, "");
        this.onNavigationEvent = getbytebufferOnExtraCallbackWithResult;
        setHasStableIds(true);
    }

    protected final List<T> onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    protected final getTimestampBytes<Long> IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final getByteBuffer<T> asInterface() {
        return this.onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final detect IAuthTabCallback(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (detect) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final detect IAuthTabCallback(UST_CMP_UpdateCertificate uST_CMP_UpdateCertificate, Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return detect.Companion.onExtraCallback(uST_CMP_UpdateCertificate.onExtraCallback(uST_CMP_UpdateCertificate.onNavigationEvent(l.longValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(detect detectVar) {
        Intrinsics.checkNotNullParameter(detectVar, "");
        return detectVar.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeAdLayout onNavigationEvent(detect detectVar) {
        Intrinsics.checkNotNullParameter(detectVar, "");
        Object objOnNavigationEvent = detectVar.onNavigationEvent();
        Intrinsics.checkNotNull(objOnNavigationEvent);
        return (NativeAdLayout) objOnNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeAdLayout onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (NativeAdLayout) function1.invoke(obj);
    }

    public final void onViewAttachedToWindow(@NotNull VH vh) {
        Intrinsics.checkNotNullParameter(vh, "");
        UST_PKCS12_GetCertWithPFX uST_PKCS12_GetCertWithPFX = vh instanceof UST_PKCS12_GetCertWithPFX ? (UST_PKCS12_GetCertWithPFX) vh : null;
        if (uST_PKCS12_GetCertWithPFX != null) {
            uST_PKCS12_GetCertWithPFX.onWarmupCompleted();
        }
    }

    public final void onViewDetachedFromWindow(@NotNull VH vh) {
        Intrinsics.checkNotNullParameter(vh, "");
        UST_PKCS12_GetCertWithPFX uST_PKCS12_GetCertWithPFX = vh instanceof UST_PKCS12_GetCertWithPFX ? (UST_PKCS12_GetCertWithPFX) vh : null;
        if (uST_PKCS12_GetCertWithPFX != null) {
            uST_PKCS12_GetCertWithPFX.onNavigationEvent();
        }
    }

    public final void onBindViewHolder(@NotNull VH vh, int i) {
        Intrinsics.checkNotNullParameter(vh, "");
        ((UST_CRYPT_VerifyMAC) vh).IAuthTabCallback(this.onExtraCallbackWithResult.get(i));
    }

    public void onBindViewHolder(@NotNull VH vh, int i, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(vh, "");
        Intrinsics.checkNotNullParameter(list, "");
        ((UST_CRYPT_VerifyMAC) vh).IAuthTabCallback(this.onExtraCallbackWithResult.get(i));
    }

    public final long getItemId(int i) {
        return this.onExtraCallbackWithResult.get(i).onExtraCallback();
    }

    public final int getItemViewType(int i) {
        return this.onExtraCallbackWithResult.get(i).IAuthTabCallback();
    }

    public final T onExtraCallback(int i) {
        return (T) ((NativeAdLayout) CollectionsKt.getOrNull(this.onExtraCallbackWithResult, i));
    }

    public final Long IAuthTabCallback(int i) {
        NativeAdLayout nativeAdLayoutOnExtraCallback = onExtraCallback(i);
        if (nativeAdLayoutOnExtraCallback != null) {
            return Long.valueOf(nativeAdLayoutOnExtraCallback.onExtraCallback());
        }
        return null;
    }

    public int getItemCount() {
        return this.onExtraCallbackWithResult.size();
    }

    public final void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
    }

    public void onWarmupCompleted(@NotNull List<? extends T> list) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(list, "");
            this.onExtraCallbackWithResult.clear();
            this.onExtraCallbackWithResult.addAll(list);
            notifyDataSetChanged();
        }
    }

    public final int onNavigationEvent(long j) {
        Iterator<T> it = this.onExtraCallbackWithResult.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().onExtraCallback() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void onNavigationEvent(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        onWarmupCompleted(list);
    }
}
