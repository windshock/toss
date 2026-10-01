package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getSignPrikeyFHFilename {
    getSignPrikeyFHFilename() {
    }

    public List<? extends CallAdapter.Factory> IAuthTabCallback(@Nullable Executor executor) {
        return Collections.singletonList(new getSignPrikeyCCFFHFilename(executor));
    }

    public List<? extends Converter.Factory> onNavigationEvent() {
        return Collections.EMPTY_LIST;
    }

    static final class onNavigationEvent extends getSignPrikeyFHFilename {
        onNavigationEvent() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.getSignPrikeyFHFilename
        public List<? extends CallAdapter.Factory> IAuthTabCallback(@Nullable Executor executor) {
            return Arrays.asList(new getSignPrikeyCCFBFHFilename(), new getSignPrikeyCCFFHFilename(executor));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.getSignPrikeyFHFilename
        public List<? extends Converter.Factory> onNavigationEvent() {
            return Collections.singletonList(new setBKMCertB64());
        }
    }
}
