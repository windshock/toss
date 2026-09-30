package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getPingIntervalokhttp {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private int onExtraCallback;
    private final ArrayList<Object> onNavigationEvent;
    private final Map<Integer, getInterceptorsokhttp<?, ?>> onWarmupCompleted;

    public getPingIntervalokhttp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = new LinkedHashMap();
        this.onNavigationEvent = new getProxyAuthenticatorokhttp();
        this.onExtraCallback = setTagsokhttp.onExtraCallback(context, 20);
    }

    public static final /* synthetic */ int IAuthTabCallback(getPingIntervalokhttp getpingintervalokhttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = getpingintervalokhttp.onExtraCallback;
        int i6 = i2 + 93;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final Map<Integer, getInterceptorsokhttp<?, ?>> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<Integer, getInterceptorsokhttp<?, ?>> map = this.onWarmupCompleted;
        int i4 = i3 + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return map;
    }

    public final ArrayList<Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        ArrayList<Object> arrayList = this.onNavigationEvent;
        int i5 = i3 + 119;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <T, VH extends RecyclerView.ViewHolder> getPingIntervalokhttp onWarmupCompleted(@NotNull getInterceptorsokhttp<T, VH> getinterceptorsokhttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getinterceptorsokhttp, "");
        Map<Integer, getInterceptorsokhttp<?, ?>> map = this.onWarmupCompleted;
        map.put(Integer.valueOf(map.size()), getinterceptorsokhttp);
        int i4 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final getPingIntervalokhttp onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        this.onExtraCallback = i;
        int i6 = i4 + 55;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    public final getPingIntervalokhttp onWarmupCompleted(@NotNull Collection<? extends Object> collection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(collection, "");
            this.onNavigationEvent.addAll(collection);
            int i3 = 40 / 0;
        } else {
            Intrinsics.checkNotNullParameter(collection, "");
            this.onNavigationEvent.addAll(collection);
        }
        return this;
    }

    public static final class IAuthTabCallback extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        IAuthTabCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r12
          0x003f: PHI (r12v4 o.getInterceptorsokhttp<?, ?>) = (r12v3 o.getInterceptorsokhttp<?, ?>), (r12v15 o.getInterceptorsokhttp<?, ?>) binds: [B:8:0x003d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            getInterceptorsokhttp<?, ?> getinterceptorsokhttp;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 123;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(viewGroup, "");
                getinterceptorsokhttp = getPingIntervalokhttp.this.onExtraCallbackWithResult().get(Integer.valueOf(i));
                int i4 = 23 / 0;
                if (getinterceptorsokhttp != null) {
                    int i5 = onNavigationEvent + 43;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    RecyclerView.ViewHolder viewHolderOnExtraCallbackWithResult = getinterceptorsokhttp.onExtraCallbackWithResult(viewGroup);
                    if (viewHolderOnExtraCallbackWithResult != null) {
                        int i7 = onExtraCallback + 3;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        View view = viewHolderOnExtraCallbackWithResult.onNavigationEvent;
                        Intrinsics.checkNotNullExpressionValue(view, "");
                        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{view, Integer.valueOf(getPingIntervalokhttp.IAuthTabCallback(getPingIntervalokhttp.this))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
                        int i9 = onNavigationEvent + 113;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            return viewHolderOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(viewGroup, "");
                getinterceptorsokhttp = getPingIntervalokhttp.this.onExtraCallbackWithResult().get(Integer.valueOf(i));
                if (getinterceptorsokhttp != null) {
                }
            }
            throw new IllegalArgumentException();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0061 A[PHI: r1 r6
          0x0061: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v10 java.lang.Object) binds: [B:8:0x005f, B:5:0x0038] A[DONT_GENERATE, DONT_INLINE]
          0x0061: PHI (r6v5 o.getInterceptorsokhttp<?, ?>) = (r6v4 o.getInterceptorsokhttp<?, ?>), (r6v10 o.getInterceptorsokhttp<?, ?>) binds: [B:8:0x005f, B:5:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Object obj;
            getInterceptorsokhttp<?, ?> getinterceptorsokhttp;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(viewHolder, "");
                obj = getPingIntervalokhttp.this.onExtraCallback().get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                getinterceptorsokhttp = getPingIntervalokhttp.this.onExtraCallbackWithResult().get(Integer.valueOf(getItemViewType(i)));
                int i4 = 25 / 0;
                if (getinterceptorsokhttp != null) {
                    int i5 = onNavigationEvent + 83;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    getinterceptorsokhttp.onWarmupCompleted(viewHolder, obj);
                    if (i6 == 0) {
                        throw null;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(viewHolder, "");
                obj = getPingIntervalokhttp.this.onExtraCallback().get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                getinterceptorsokhttp = getPingIntervalokhttp.this.onExtraCallbackWithResult().get(Integer.valueOf(getItemViewType(i)));
                if (getinterceptorsokhttp != null) {
                }
            }
            int i7 = onNavigationEvent + 43;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }

        public int getItemViewType(int i) {
            Class<?> clsIAuthTabCallback;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object obj = getPingIntervalokhttp.this.onExtraCallback().get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            Set<Integer> setKeySet = getPingIntervalokhttp.this.onExtraCallbackWithResult().keySet();
            getPingIntervalokhttp getpingintervalokhttp = getPingIntervalokhttp.this;
            Iterator<T> it = setKeySet.iterator();
            int i5 = -1;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                getInterceptorsokhttp<?, ?> getinterceptorsokhttp = getpingintervalokhttp.onExtraCallbackWithResult().get(Integer.valueOf(iIntValue));
                if (getinterceptorsokhttp != null) {
                    clsIAuthTabCallback = getinterceptorsokhttp.IAuthTabCallback();
                    int i6 = onNavigationEvent + 37;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    clsIAuthTabCallback = null;
                }
                Class<?> cls = obj.getClass();
                if (clsIAuthTabCallback != null) {
                    int i8 = onNavigationEvent + 39;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    boolean zIsAssignableFrom = clsIAuthTabCallback.isAssignableFrom(cls);
                    if (i9 == 0) {
                        if (!zIsAssignableFrom) {
                            int i10 = onNavigationEvent;
                            int i11 = i10 + 11;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            int i13 = i10 + 101;
                            onExtraCallback = i13 % 128;
                            int i14 = i13 % 2;
                            i5 = iIntValue;
                        }
                    } else if (zIsAssignableFrom) {
                        int i102 = onNavigationEvent;
                        int i112 = i102 + 11;
                        onExtraCallback = i112 % 128;
                        int i122 = i112 % 2;
                        int i132 = i102 + 101;
                        onExtraCallback = i132 % 128;
                        int i142 = i132 % 2;
                        i5 = iIntValue;
                    }
                }
            }
            return i5;
        }

        public int getItemCount() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int size = getPingIntervalokhttp.this.onExtraCallback().size();
            int i4 = onNavigationEvent + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return size;
        }
    }

    public final RecyclerView.Adapter<RecyclerView.ViewHolder> onWarmupCompleted() {
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }
}
