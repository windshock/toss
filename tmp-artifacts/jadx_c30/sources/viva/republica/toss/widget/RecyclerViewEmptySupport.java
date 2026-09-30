package viva.republica.toss.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RecyclerViewEmptySupport extends RecyclerView {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final RecyclerView.AdapterDataObserver onExtraCallbackWithResult;
    private View onNavigationEvent;
    private boolean onWarmupCompleted;

    public static final /* synthetic */ void onExtraCallbackWithResult(RecyclerViewEmptySupport recyclerViewEmptySupport) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        recyclerViewEmptySupport.IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = IAuthTabCallback + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewEmptySupport(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = new RecyclerView.AdapterDataObserver() { // from class: viva.republica.toss.widget.RecyclerViewEmptySupport$mEmptyObserver$1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public void onChanged() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 103;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    super.onChanged();
                    RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                    int i3 = 42 / 0;
                } else {
                    super.onChanged();
                    RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                }
                int i4 = onExtraCallback + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onItemRangeInserted(int i, int i2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 51;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                super.onItemRangeInserted(i, i2);
                RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                int i6 = onExtraCallback + 63;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onItemRangeRemoved(int i, int i2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 37;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    super.onItemRangeRemoved(i, i2);
                    RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                    int i5 = onWarmupCompleted + 71;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                super.onItemRangeRemoved(i, i2);
                RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewEmptySupport(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = new RecyclerView.AdapterDataObserver() { // from class: viva.republica.toss.widget.RecyclerViewEmptySupport$mEmptyObserver$1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public void onChanged() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 103;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    super.onChanged();
                    RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                    int i3 = 42 / 0;
                } else {
                    super.onChanged();
                    RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                }
                int i4 = onExtraCallback + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onItemRangeInserted(int i, int i2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 51;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                super.onItemRangeInserted(i, i2);
                RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                int i6 = onExtraCallback + 63;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onItemRangeRemoved(int i, int i2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 37;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    super.onItemRangeRemoved(i, i2);
                    RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                    int i5 = onWarmupCompleted + 71;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                super.onItemRangeRemoved(i, i2);
                RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewEmptySupport(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = new RecyclerView.AdapterDataObserver() { // from class: viva.republica.toss.widget.RecyclerViewEmptySupport$mEmptyObserver$1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public void onChanged() {
                int i2 = 2 % 2;
                int i22 = onExtraCallback + 103;
                onWarmupCompleted = i22 % 128;
                if (i22 % 2 != 0) {
                    super.onChanged();
                    RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                    int i3 = 42 / 0;
                } else {
                    super.onChanged();
                    RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                }
                int i4 = onExtraCallback + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onItemRangeInserted(int i2, int i22) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 51;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                super.onItemRangeInserted(i2, i22);
                RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                int i6 = onExtraCallback + 63;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onItemRangeRemoved(int i2, int i22) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 37;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    super.onItemRangeRemoved(i2, i22);
                    RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                    int i5 = onWarmupCompleted + 71;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                super.onItemRangeRemoved(i2, i22);
                RecyclerViewEmptySupport.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    public void setAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getAdapter();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RecyclerView.Adapter adapter2 = getAdapter();
        if (adapter2 != null) {
            int i3 = onExtraCallback + 95;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            adapter2.unregisterAdapterDataObserver(this.onExtraCallbackWithResult);
        }
        if (adapter != null) {
            int i5 = onExtraCallback + 19;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                adapter.registerAdapterDataObserver(this.onExtraCallbackWithResult);
                int i6 = 19 / 0;
            } else {
                adapter.registerAdapterDataObserver(this.onExtraCallbackWithResult);
            }
        }
        super.setAdapter(adapter);
        this.onExtraCallbackWithResult.onChanged();
    }

    public final void setEmptySupport(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onWarmupCompleted != z) {
            this.onWarmupCompleted = z;
            this.onExtraCallbackWithResult.onChanged();
            int i3 = IAuthTabCallback + 75;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 2;
            }
        }
        int i5 = onExtraCallback + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setEmptyView(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        if (this.onNavigationEvent != view) {
            this.onNavigationEvent = view;
            this.onExtraCallbackWithResult.onChanged();
            int i3 = onExtraCallback + 113;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 2;
            }
        }
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = 8;
        if (this.onNavigationEvent != null && this.onWarmupCompleted) {
            int i6 = i3 + 23;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                getAdapter();
                throw null;
            }
            if (getAdapter() != null) {
                View view = this.onNavigationEvent;
                if (view != null) {
                    int i7 = IAuthTabCallback + 1;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    RecyclerView.Adapter adapter = getAdapter();
                    if (adapter != null && adapter.getItemCount() == 0) {
                        int i9 = IAuthTabCallback + 105;
                        int i10 = i9 % 128;
                        onExtraCallback = i10;
                        if (i9 % 2 == 0) {
                            int i11 = i10 + 121;
                            IAuthTabCallback = i11 % 128;
                            int i12 = i11 % 2;
                            i5 = 0;
                        }
                    }
                    view.setVisibility(i5);
                    return;
                }
                return;
            }
        }
        View view2 = this.onNavigationEvent;
        if (view2 != null) {
            int i13 = IAuthTabCallback + 47;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            if (this.onWarmupCompleted) {
                if (view2 != null) {
                    view2.setVisibility(0);
                    int i15 = IAuthTabCallback + 61;
                    onExtraCallback = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                return;
            }
        }
        if (view2 == null || view2 == null) {
            return;
        }
        int i16 = onExtraCallback + 29;
        IAuthTabCallback = i16 % 128;
        int i17 = i16 % 2;
        view2.setVisibility(8);
    }
}
