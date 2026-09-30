package com.google.android.material.datepicker;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class OnSelectionChangedListener<S> {
    public void onIncompleteSelectionChanged() {
    }

    public abstract void onSelectionChanged(@NonNull S s);
}
