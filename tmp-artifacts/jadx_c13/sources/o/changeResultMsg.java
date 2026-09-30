package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Spinner;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.inventory_sdk.model.InventoryAdDto;
import im.toss.tds.view.component.atom.text.Typography5;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.UST_SET_ANDROIDINFO;
import o.logToFile;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class changeResultMsg extends enableIntersectionObserverByDefault implements byteToInt$onExtraCallback {
    private final onWarmupCompleted onExtraCallback;

    public interface onWarmupCompleted extends logToFile.onExtraCallback {
        void onSessionEnded();

        void onVerticalScrollEvent();

        void onWarmupCompleted(@NotNull NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec);
    }

    public changeResultMsg(@NotNull onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onExtraCallback = onwarmupcompleted;
        setHasStableIds(true);
    }

    public final void IAuthTabCallback(@NotNull InventoryAdDto inventoryAdDto) {
        Object next;
        Intrinsics.checkNotNullParameter(inventoryAdDto, "");
        Iterator it = onWarmupCompleted().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((enableInteropViewManagerClassLookUpOptimizationIOS) next) instanceof UST_SET_ANDROIDINFO) {
                    break;
                }
            }
        }
        enableInteropViewManagerClassLookUpOptimizationIOS enableinteropviewmanagerclasslookupoptimizationios = (enableInteropViewManagerClassLookUpOptimizationIOS) next;
        if (enableinteropviewmanagerclasslookupoptimizationios != null) {
            UST_SET_ANDROIDINFO ust_set_androidinfo = enableinteropviewmanagerclasslookupoptimizationios instanceof UST_SET_ANDROIDINFO ? (UST_SET_ANDROIDINFO) enableinteropviewmanagerclasslookupoptimizationios : null;
            if (ust_set_androidinfo != null) {
                ust_set_androidinfo.onExtraCallback(inventoryAdDto);
            }
            notifyItemChanged(onWarmupCompleted().indexOf(enableinteropviewmanagerclasslookupoptimizationios));
        }
    }

    public static final class IAuthTabCallback extends DiffUtil.Callback {
        final /* synthetic */ List<enableInteropViewManagerClassLookUpOptimizationIOS> onWarmupCompleted;

        IAuthTabCallback(List<? extends enableInteropViewManagerClassLookUpOptimizationIOS> list) {
            this.onWarmupCompleted = list;
        }

        public boolean areItemsTheSame(int i, int i2) {
            return ((enableInteropViewManagerClassLookUpOptimizationIOS) changeResultMsg.this.onWarmupCompleted().get(i)).onWarmupCompleted() == this.onWarmupCompleted.get(i2).onWarmupCompleted();
        }

        public int getOldListSize() {
            return changeResultMsg.this.getItemCount();
        }

        public int getNewListSize() {
            return this.onWarmupCompleted.size();
        }

        public boolean areContentsTheSame(int i, int i2) {
            return Intrinsics.areEqual(changeResultMsg.this.onWarmupCompleted().get(i), this.onWarmupCompleted.get(i2));
        }
    }

    public void onWarmupCompleted(@NotNull List<? extends enableInteropViewManagerClassLookUpOptimizationIOS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        synchronized (onWarmupCompleted()) {
            DiffUtil.IAuthTabCallback IAuthTabCallback2 = DiffUtil.IAuthTabCallback(new IAuthTabCallback(list));
            Intrinsics.checkNotNullExpressionValue(IAuthTabCallback2, "");
            onWarmupCompleted().clear();
            onWarmupCompleted().addAll(list);
            IAuthTabCallback2.onNavigationEvent(this);
            Unit unit = Unit.INSTANCE;
        }
    }

    public long getItemId(int i) {
        enableInteropViewManagerClassLookUpOptimizationIOS enableinteropviewmanagerclasslookupoptimizationios = (enableInteropViewManagerClassLookUpOptimizationIOS) CollectionsKt___CollectionsKt.getOrNull(onWarmupCompleted(), i);
        return enableinteropviewmanagerclasslookupoptimizationios != null ? enableinteropviewmanagerclasslookupoptimizationios.onWarmupCompleted() : Integer.hashCode(i);
    }

    public int onNavigationEvent(int i) {
        return ((toRealPath.onNavigationEvent) toRealPath.onNavigationEvent.getEntries().get(i)).getLayoutResId();
    }

    public int getItemViewType(int i) {
        UST_SET_ANDROIDINFO ust_set_androidinfo = (enableInteropViewManagerClassLookUpOptimizationIOS) CollectionsKt___CollectionsKt.getOrNull(onWarmupCompleted(), i);
        return ust_set_androidinfo instanceof UST_SET_ANDROIDINFO ? toRealPath.onNavigationEvent.getEntries().size() + ust_set_androidinfo.onNavigationEvent().ordinal() : ust_set_androidinfo instanceof toRealPath ? ((toRealPath) ust_set_androidinfo).onExtraCallbackWithResult().ordinal() : toRealPath.onNavigationEvent.UNKNOWN.ordinal();
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public enableNativeCSSParsing onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i >= toRealPath.onNavigationEvent.getEntries().size()) {
            return new siblingFiles(viewGroup, ((UST_SET_ANDROIDINFO.onExtraCallback) UST_SET_ANDROIDINFO.onExtraCallback.getEntries().get(i - toRealPath.onNavigationEvent.getEntries().size())).getSpaceId(), (decEnvelopedData) null, 4, (DefaultConstructorMarker) null);
        }
        return i == toRealPath.onNavigationEvent.HEADER.ordinal() ? new SystemAccess(viewGroup, (destroyKey) null, 2, (DefaultConstructorMarker) null) : i == toRealPath.onNavigationEvent.TRANSACTION_V2_YEAR.ordinal() ? new findExternalStoragePath(viewGroup) : i == toRealPath.onNavigationEvent.TRANSACTION_V2_DATE.ordinal() ? new SharedPreferencesManager(viewGroup) : i == toRealPath.onNavigationEvent.TRANSACTION_V2_ITEM.ordinal() ? new logToFile(viewGroup, this.onExtraCallback) : i == toRealPath.onNavigationEvent.TEENS_HENEM_BOX.ordinal() ? new parseExtension(viewGroup) : super.onExtraCallback(viewGroup, i);
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull enableNativeCSSParsing enablenativecssparsing, int i) {
        UST_CHECK_UNISIGN ust_check_unisign;
        NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpecOnNavigationEvent;
        Intrinsics.checkNotNullParameter(enablenativecssparsing, "");
        super.onWarmupCompleted(enablenativecssparsing, i);
        UST_CHECK_UNISIGN ust_check_unisign2 = (enableInteropViewManagerClassLookUpOptimizationIOS) CollectionsKt___CollectionsKt.getOrNull(onWarmupCompleted(), i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == toRealPath.onNavigationEvent.TRANSACTION_V2_ITEM.ordinal()) {
            ust_check_unisign = ust_check_unisign2 instanceof UST_CHECK_UNISIGN ? ust_check_unisign2 : null;
            if (ust_check_unisign == null || (nativeJSCHeapCaptureSpecOnNavigationEvent = ust_check_unisign.onNavigationEvent()) == null) {
                return;
            }
            this.onExtraCallback.onWarmupCompleted(nativeJSCHeapCaptureSpecOnNavigationEvent);
            return;
        }
        if (itemViewType == toRealPath.onNavigationEvent.FILTER.ordinal()) {
            Typography5 typography5FindViewById = ((RecyclerView.ViewHolder) enablenativecssparsing).onNavigationEvent.findViewById(R.id.filterView);
            Intrinsics.checkNotNull(typography5FindViewById);
            onNavigationEvent((View) typography5FindViewById);
        } else if (itemViewType == toRealPath.onNavigationEvent.HEADER.ordinal()) {
            ust_check_unisign = ust_check_unisign2 instanceof CERT_DecryptPrikey ? (CERT_DecryptPrikey) ust_check_unisign2 : null;
            if (ust_check_unisign == null || ust_check_unisign.IAuthTabCallback_Parcel()) {
                return;
            }
            if (ust_check_unisign.IAuthTabCallbackStub()) {
                this.onExtraCallback.onVerticalScrollEvent();
            } else {
                this.onExtraCallback.onSessionEnded();
            }
        }
    }

    @Override // o.byteToInt$onExtraCallback
    public int onExtraCallback(int i) {
        UST_GET_LIBLICENSEINFO ust_get_liblicenseinfo = (enableInteropViewManagerClassLookUpOptimizationIOS) CollectionsKt___CollectionsKt.getOrNull(onWarmupCompleted(), i);
        if (ust_get_liblicenseinfo instanceof UST_GET_LIBLICENSEINFO) {
            return ust_get_liblicenseinfo.IAuthTabCallback();
        }
        return -1;
    }

    @Override // o.byteToInt$onExtraCallback
    public boolean IAuthTabCallback(int i) {
        return CollectionsKt___CollectionsKt.getOrNull(onWarmupCompleted(), i) instanceof UST_GET_LIBLICENSEINFO;
    }

    public static final class onNavigationEvent extends View.AccessibilityDelegate {
        onNavigationEvent() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
    }

    private final void onNavigationEvent(View view) {
        view.setAccessibilityDelegate(new onNavigationEvent());
    }
}
