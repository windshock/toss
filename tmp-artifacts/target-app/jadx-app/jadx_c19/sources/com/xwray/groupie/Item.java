package com.xwray.groupie;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import o.SwipeRefreshLayout;
import o.setAnimationListener;
import o.setColorScheme;
import o.setColorSchemeColors;
import o.setColorSchemeResources;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class Item<VH extends setColorSchemeColors> implements SwipeRefreshLayout {
    private static AtomicLong onNavigationEvent = new AtomicLong(0);
    private final long IAuthTabCallback;
    private Map<String, Object> onExtraCallback;
    protected setAnimationListener onExtraCallbackWithResult;

    public abstract void bind(@NonNull VH vh, int i2);

    public Object getChangePayload(@NonNull Item item) {
        return null;
    }

    public int getDragDirs() {
        return 0;
    }

    @Override // o.SwipeRefreshLayout
    public int getItemCount() {
        return 1;
    }

    public abstract int getLayout();

    @Override // o.SwipeRefreshLayout
    public int getPosition(@NonNull Item item) {
        return this == item ? 0 : -1;
    }

    public int getSpanSize(int i2, int i3) {
        return i2;
    }

    public int getSwipeDirs() {
        return 0;
    }

    public boolean isClickable() {
        return true;
    }

    public boolean isLongClickable() {
        return true;
    }

    public boolean isRecyclable() {
        return true;
    }

    public void onViewAttachedToWindow(@NonNull VH vh) {
    }

    public void onViewDetachedFromWindow(@NonNull VH vh) {
    }

    public Item() {
        this(onNavigationEvent.decrementAndGet());
    }

    protected Item(long j) {
        this.onExtraCallback = new HashMap();
        this.IAuthTabCallback = j;
    }

    public VH createViewHolder(@NonNull View view) {
        return (VH) new setColorSchemeColors(view);
    }

    public void bind(@NonNull VH vh, int i2, @NonNull List<Object> list, @Nullable setColorScheme setcolorscheme, @Nullable setColorSchemeResources setcolorschemeresources) {
        vh.onExtraCallbackWithResult(this, setcolorscheme, setcolorschemeresources);
        bind(vh, i2, list);
    }

    public void bind(@NonNull VH vh, int i2, @NonNull List<Object> list) {
        bind(vh, i2);
    }

    public void unbind(@NonNull VH vh) {
        vh.onExtraCallback();
    }

    public int getViewType() {
        return getLayout();
    }

    @Override // o.SwipeRefreshLayout
    public Item getItem(int i2) {
        if (i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("Wanted item at position " + i2 + " but an Item is a Group of size 1");
    }

    @Override // o.SwipeRefreshLayout
    public void registerGroupDataObserver(@NonNull setAnimationListener setanimationlistener) {
        this.onExtraCallbackWithResult = setanimationlistener;
    }

    @Override // o.SwipeRefreshLayout
    public void unregisterGroupDataObserver(@NonNull setAnimationListener setanimationlistener) {
        this.onExtraCallbackWithResult = null;
    }

    public void notifyChanged() {
        setAnimationListener setanimationlistener = this.onExtraCallbackWithResult;
        if (setanimationlistener != null) {
            setanimationlistener.onItemChanged(this, 0);
        }
    }

    public void notifyChanged(@Nullable Object obj) {
        setAnimationListener setanimationlistener = this.onExtraCallbackWithResult;
        if (setanimationlistener != null) {
            setanimationlistener.onItemChanged(this, 0, obj);
        }
    }

    public Map<String, Object> getExtras() {
        return this.onExtraCallback;
    }

    public long getId() {
        return this.IAuthTabCallback;
    }

    public boolean isSameAs(@NonNull Item item) {
        return getViewType() == item.getViewType() && getId() == item.getId();
    }

    public boolean hasSameContentAs(@NonNull Item item) {
        return equals(item);
    }
}
