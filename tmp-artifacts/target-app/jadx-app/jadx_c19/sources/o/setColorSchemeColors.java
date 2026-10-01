package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.xwray.groupie.Item;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class setColorSchemeColors extends RecyclerView.ViewHolder {
    private setColorScheme ICustomTabsCallback;
    private Item extraCallback;
    private View.OnLongClickListener onActivityLayout;
    private setColorSchemeResources onMinimized;
    private View.OnClickListener writeTypedObject;

    public setColorSchemeColors(@NonNull View view) {
        super(view);
        this.writeTypedObject = new View.OnClickListener() { // from class: o.setColorSchemeColors.1
            @Override // android.view.View.OnClickListener
            public void onClick(@NonNull View view2) {
                if (setColorSchemeColors.this.ICustomTabsCallback == null || setColorSchemeColors.this.getAdapterPosition() == -1) {
                    return;
                }
                setColorScheme unused = setColorSchemeColors.this.ICustomTabsCallback;
                setColorSchemeColors.this.IAuthTabCallback();
            }
        };
        this.onActivityLayout = new View.OnLongClickListener() { // from class: o.setColorSchemeColors.3
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(@NonNull View view2) {
                if (setColorSchemeColors.this.onMinimized == null || setColorSchemeColors.this.getAdapterPosition() == -1) {
                    return false;
                }
                return setColorSchemeColors.this.onMinimized.onNavigationEvent(setColorSchemeColors.this.IAuthTabCallback(), view2);
            }
        };
    }

    public void onExtraCallbackWithResult(@NonNull Item item, @Nullable setColorScheme setcolorscheme, @Nullable setColorSchemeResources setcolorschemeresources) {
        this.extraCallback = item;
        if (setcolorscheme != null && item.isClickable()) {
            ((RecyclerView.ViewHolder) this).onNavigationEvent.setOnClickListener(this.writeTypedObject);
            this.ICustomTabsCallback = setcolorscheme;
        }
        if (setcolorschemeresources == null || !item.isLongClickable()) {
            return;
        }
        ((RecyclerView.ViewHolder) this).onNavigationEvent.setOnLongClickListener(this.onActivityLayout);
        this.onMinimized = setcolorschemeresources;
    }

    public void onExtraCallback() {
        if (this.ICustomTabsCallback != null && this.extraCallback.isClickable()) {
            ((RecyclerView.ViewHolder) this).onNavigationEvent.setOnClickListener(null);
        }
        if (this.onMinimized != null && this.extraCallback.isLongClickable()) {
            ((RecyclerView.ViewHolder) this).onNavigationEvent.setOnLongClickListener(null);
        }
        this.extraCallback = null;
        this.ICustomTabsCallback = null;
        this.onMinimized = null;
    }

    public Item IAuthTabCallback() {
        return this.extraCallback;
    }

    public View onNavigationEvent() {
        return ((RecyclerView.ViewHolder) this).onNavigationEvent;
    }
}
