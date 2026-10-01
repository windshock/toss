package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class sslSocketFactory {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final HashMap<String, Set<dns>> onWarmupCompleted = new HashMap<>();
    private final HashMap<View, deprecated_sslSocketFactory> onExtraCallback = new HashMap<>();
    private final Set<View> onExtraCallbackWithResult = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v10 java.lang.String) binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dns onExtraCallback(@NotNull RecyclerView recyclerView, @NotNull View view, @NotNull dns dnsVar) {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        dns dnsVar2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(dnsVar, "");
            strOnExtraCallback = onExtraCallback(recyclerView, view);
            int i3 = 64 / 0;
            if (strOnExtraCallback != null) {
                int i4 = IAuthTabCallback + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Set<dns> set = this.onWarmupCompleted.get(strOnExtraCallback);
                if (set != null) {
                    Iterator<T> it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((dns) next).onWarmupCompleted(dnsVar)) {
                            dnsVar2 = next;
                            break;
                        }
                    }
                    dnsVar2 = dnsVar2;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(dnsVar, "");
            strOnExtraCallback = onExtraCallback(recyclerView, view);
            if (strOnExtraCallback != null) {
            }
        }
        int i6 = onNavigationEvent + 11;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return dnsVar2;
    }

    public final dns onNavigationEvent(@NotNull RecyclerView recyclerView, @NotNull View view, @NotNull dns dnsVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dnsVar, "");
        dns dnsVarOnExtraCallback = onExtraCallback(recyclerView, view, dnsVar);
        if (dnsVarOnExtraCallback != null) {
            int i4 = IAuthTabCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return dnsVarOnExtraCallback;
        }
        int i6 = IAuthTabCallback + 31;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            onExtraCallback(recyclerView, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnExtraCallback = onExtraCallback(recyclerView, view);
        if (strOnExtraCallback != null) {
            if (this.onWarmupCompleted.get(strOnExtraCallback) == null) {
                this.onWarmupCompleted.put(strOnExtraCallback, new LinkedHashSet());
            }
            Set<dns> set = this.onWarmupCompleted.get(strOnExtraCallback);
            if (set != null) {
                int i7 = onNavigationEvent + 61;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                set.add(dnsVar);
            }
        }
        return onExtraCallback(recyclerView, view, dnsVar);
    }

    public final boolean onWarmupCompleted(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        boolean zContains = this.onExtraCallbackWithResult.contains(view);
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return zContains;
    }

    public final void onNavigationEvent(@NotNull View view, @NotNull deprecated_sslSocketFactory deprecated_sslsocketfactory) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(deprecated_sslsocketfactory, "");
            this.onExtraCallback.put(view, deprecated_sslsocketfactory);
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(deprecated_sslsocketfactory, "");
        this.onExtraCallback.put(view, deprecated_sslsocketfactory);
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public final deprecated_sslSocketFactory onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            this.onExtraCallback.get(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        deprecated_sslSocketFactory deprecated_sslsocketfactory = this.onExtraCallback.get(view);
        int i3 = onNavigationEvent + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_sslsocketfactory;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.clear();
        this.onExtraCallback.clear();
        this.onExtraCallbackWithResult.clear();
        int i4 = onNavigationEvent + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r4 = 6 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        r4 = r4.getChildAdapterPosition(r1.onNavigationEvent);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return r1.getItemViewType() + "_" + r4 + "_" + r5.getClass().getSimpleName() + "_scrollTrigger";
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r4 = o.sslSocketFactory.IAuthTabCallback + 119;
        o.sslSocketFactory.onNavigationEvent = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onExtraCallback(RecyclerView recyclerView, View view) {
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            viewHolderFindContainingViewHolder = recyclerView.findContainingViewHolder(view);
            int i3 = 21 / 0;
        } else {
            viewHolderFindContainingViewHolder = recyclerView.findContainingViewHolder(view);
        }
    }
}
