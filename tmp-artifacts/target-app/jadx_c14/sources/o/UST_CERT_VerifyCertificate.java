package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface UST_CERT_VerifyCertificate {

    public static final class onExtraCallbackWithResult implements UST_CERT_VerifyCertificate {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof onExtraCallbackWithResult);
        }

        public int hashCode() {
            return 1724585280;
        }

        public String toString() {
            return "Valid";
        }

        private onExtraCallbackWithResult() {
        }
    }

    public interface onWarmupCompleted extends UST_CERT_VerifyCertificate {

        public static final class onNavigationEvent implements onWarmupCompleted {
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof onNavigationEvent);
            }

            public int hashCode() {
                return 1167480290;
            }

            public String toString() {
                return "MiuiVirtualIdentityDisabled";
            }

            private onNavigationEvent() {
            }
        }

        public static final class onExtraCallback implements onWarmupCompleted {
            public static final onExtraCallback IAuthTabCallback = new onExtraCallback();

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof onExtraCallback);
            }

            public int hashCode() {
                return -289903150;
            }

            public String toString() {
                return "DuplicateAndroidId";
            }

            private onExtraCallback() {
            }
        }

        public static final class IAuthTabCallback implements onWarmupCompleted {
            public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof IAuthTabCallback);
            }

            public int hashCode() {
                return 1146855396;
            }

            public String toString() {
                return "Unspecified";
            }

            private IAuthTabCallback() {
            }
        }
    }
}
