package com.tnkfactory.ad.repository.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.tnkfactory.ad.repository.db.dao.AdItemDao;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NavigationItemKtExternalSyntheticLambda12;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AdItemRoomDbImpl extends RoomDatabase {
    public static AdItemRoomDbImpl a;
    public static final Companion Companion = new Companion(null);
    public static final AdItemRoomDbImpl$Companion$MIGRATION_1_2$1 b = new Migration() { // from class: com.tnkfactory.ad.repository.db.AdItemRoomDbImpl$Companion$MIGRATION_1_2$1
        public void migrate(NavigationItemKtExternalSyntheticLambda12 navigationItemKtExternalSyntheticLambda12) {
            Intrinsics.checkNotNullParameter(navigationItemKtExternalSyntheticLambda12, "");
            navigationItemKtExternalSyntheticLambda12.onExtraCallbackWithResult("ALTER TABLE AdItemDto ADD COLUMN actn_desc TEXT NOT NULL DEFAULT ''");
        }
    };
    public static final AdItemRoomDbImpl$Companion$MIGRATION_2_3$1 c = new Migration() { // from class: com.tnkfactory.ad.repository.db.AdItemRoomDbImpl$Companion$MIGRATION_2_3$1
        public void migrate(NavigationItemKtExternalSyntheticLambda12 navigationItemKtExternalSyntheticLambda12) {
            Intrinsics.checkNotNullParameter(navigationItemKtExternalSyntheticLambda12, "");
            navigationItemKtExternalSyntheticLambda12.onExtraCallbackWithResult("ALTER TABLE AdItemDto ADD COLUMN pay_dt INTEGER NOT NULL DEFAULT 0");
            navigationItemKtExternalSyntheticLambda12.onExtraCallbackWithResult("ALTER TABLE AdItemDto ADD COLUMN pay_cnt INTEGER NOT NULL DEFAULT 0");
            navigationItemKtExternalSyntheticLambda12.onExtraCallbackWithResult("ALTER TABLE AdItemDto ADD COLUMN cmpn_cnt INTEGER NOT NULL DEFAULT 0");
            navigationItemKtExternalSyntheticLambda12.onExtraCallbackWithResult("ALTER TABLE AdItemDto ADD COLUMN valid_lbl TEXT NOT NULL DEFAULT ''");
        }
    };
    public static final AdItemRoomDbImpl$Companion$MIGRATION_3_4$1 d = new Migration() { // from class: com.tnkfactory.ad.repository.db.AdItemRoomDbImpl$Companion$MIGRATION_3_4$1
        public void migrate(NavigationItemKtExternalSyntheticLambda12 navigationItemKtExternalSyntheticLambda12) {
            Intrinsics.checkNotNullParameter(navigationItemKtExternalSyntheticLambda12, "");
            navigationItemKtExternalSyntheticLambda12.onExtraCallbackWithResult("ALTER TABLE AdItemDto ADD COLUMN orderNumber INTEGER NOT NULL DEFAULT 0");
        }
    };
    public static final AdItemRoomDbImpl$Companion$MIGRATION_4_5$1 e = new Migration() { // from class: com.tnkfactory.ad.repository.db.AdItemRoomDbImpl$Companion$MIGRATION_4_5$1
        public void migrate(NavigationItemKtExternalSyntheticLambda12 navigationItemKtExternalSyntheticLambda12) {
            Intrinsics.checkNotNullParameter(navigationItemKtExternalSyntheticLambda12, "");
            navigationItemKtExternalSyntheticLambda12.onExtraCallbackWithResult("ALTER TABLE AdItemDto ADD COLUMN pnt_txt TEXT NOT NULL DEFAULT ''");
        }
    };

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AdItemRoomDbImpl getINSTANCE() {
            return AdItemRoomDbImpl.a;
        }

        public AdItemRoomDbImpl getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            if (getINSTANCE() == null) {
                setINSTANCE((AdItemRoomDbImpl) Room.onNavigationEvent(context.getApplicationContext(), AdItemRoomDbImpl.class, "tnk_ad_item").IAuthTabCallback(new Migration[]{getMIGRATION_1_2()}).IAuthTabCallback(new Migration[]{getMIGRATION_2_3()}).IAuthTabCallback(new Migration[]{getMIGRATION_3_4()}).IAuthTabCallback(new Migration[]{getMIGRATION_4_5()}).onWarmupCompleted());
            }
            AdItemRoomDbImpl instance = getINSTANCE();
            Intrinsics.checkNotNull(instance);
            return instance;
        }

        public final Migration getMIGRATION_1_2() {
            return AdItemRoomDbImpl.b;
        }

        public final Migration getMIGRATION_2_3() {
            return AdItemRoomDbImpl.c;
        }

        public final Migration getMIGRATION_3_4() {
            return AdItemRoomDbImpl.d;
        }

        public final Migration getMIGRATION_4_5() {
            return AdItemRoomDbImpl.e;
        }

        public final void setINSTANCE(@Nullable AdItemRoomDbImpl adItemRoomDbImpl) {
            AdItemRoomDbImpl.a = adItemRoomDbImpl;
        }
    }

    public abstract AdItemDao adItemDao();
}
