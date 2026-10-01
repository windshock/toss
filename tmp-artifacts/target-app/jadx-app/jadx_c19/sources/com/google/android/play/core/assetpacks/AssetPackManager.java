package com.google.android.play.core.assetpacks;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Map;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AssetPackManager {
    AssetPackStates cancel(@NonNull List<String> list);

    void clearListeners();

    Task<AssetPackStates> fetch(List<String> list);

    AssetLocation getAssetLocation(@NonNull String str, @NonNull String str2);

    AssetPackLocation getPackLocation(@NonNull String str);

    Map<String, AssetPackLocation> getPackLocations();

    Task<AssetPackStates> getPackStates(List<String> list);

    void registerListener(@NonNull AssetPackStateUpdateListener assetPackStateUpdateListener);

    Task<Void> removePack(@NonNull String str);

    @Deprecated
    Task<Integer> showCellularDataConfirmation(@NonNull Activity activity);

    @Deprecated
    boolean showCellularDataConfirmation(@NonNull IEngagementSignalsCallback_Parcel<IPostMessageService> iEngagementSignalsCallback_Parcel);

    Task<Integer> showConfirmationDialog(@NonNull Activity activity);

    boolean showConfirmationDialog(@NonNull IEngagementSignalsCallback_Parcel<IPostMessageService> iEngagementSignalsCallback_Parcel);

    void unregisterListener(@NonNull AssetPackStateUpdateListener assetPackStateUpdateListener);
}
