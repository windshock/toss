package com.tnkfactory.ad.style;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkRwdFilter;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ITnkRwdToolbar {
    void onChangeFilter(@NotNull TnkRwdFilter tnkRwdFilter);

    View onCreateView(@NotNull Activity activity, @NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @NotNull TnkAdListModel tnkAdListModel);

    void onReceiveMessage();
}
