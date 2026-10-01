package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zab extends DataHolder$Builder {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    zab(final String[] strArr, String str) {
        final String str2 = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        new Object(strArr, str2, objArr) { // from class: com.google.android.gms.common.data.DataHolder$Builder
            private final String[] zaa;
            private final ArrayList zab = new ArrayList();
            private final HashMap zac = new HashMap();

            {
                this.zaa = (String[]) Preconditions.checkNotNull(strArr);
            }

            public DataHolder build(int i2) {
                return new DataHolder(this, i2, (Bundle) null, (zae) null);
            }

            public DataHolder$Builder withRow(@NonNull ContentValues contentValues) {
                Asserts.checkNotNull(contentValues);
                HashMap map = new HashMap(contentValues.size());
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
                return zaa(map);
            }

            public DataHolder$Builder zaa(@NonNull HashMap map) {
                Asserts.checkNotNull(map);
                this.zab.add(map);
                return this;
            }

            public DataHolder build(int i2, @NonNull Bundle bundle) {
                return new DataHolder(this, i2, bundle, -1, (zae) null);
            }
        };
    }

    @Override // com.google.android.gms.common.data.DataHolder$Builder
    public final DataHolder$Builder withRow(ContentValues contentValues) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }

    @Override // com.google.android.gms.common.data.DataHolder$Builder
    public final DataHolder$Builder zaa(HashMap map) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }
}
