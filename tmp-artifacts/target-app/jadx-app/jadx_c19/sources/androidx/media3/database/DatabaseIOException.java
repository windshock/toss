package androidx.media3.database;

import android.database.SQLException;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DatabaseIOException extends IOException {
    public DatabaseIOException(SQLException sQLException) {
        super(sQLException);
    }
}
